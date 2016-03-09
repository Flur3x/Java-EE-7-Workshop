package de.dbischoff.javaee7workshop.controller;

import de.dbischoff.javaee7workshop.data.CampaignListProducer;
import de.dbischoff.javaee7workshop.data.CampaignProducer;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@SessionScoped
@Named
public class EditCampaignController implements Serializable {

    @Inject
    private CampaignListProducer campaignListProducer;

    @Inject
    private CampaignProducer campaignProducer;

    public String doSave() {
        if (campaignProducer.isAddMode()) {
            campaignListProducer.getCampaigns().add(campaignProducer.getSelectedCampaign());
        }
        return Pages.LIST_CAMPAIGNS;
    }

    public String doCancel() {
        return Pages.LIST_CAMPAIGNS;
    }
}
