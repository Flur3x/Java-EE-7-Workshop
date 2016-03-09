package de.dbischoff.javaee7workshop.controller;

import de.dbischoff.javaee7workshop.data.CampaignProducer;
import de.dbischoff.javaee7workshop.model.Campaign;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class ListCampaignsController implements Serializable {

    @Inject
    CampaignProducer campaignProducer;

    public String doAddCampaign() {
      System.out.println("Add Campaign");
      campaignProducer.prepareAddCampaign();
      return Pages.EDIT_CAMPAIGN;
    }

    public String doEditCampaign(Campaign campaign) {
      System.out.println("Edit Campaign " + campaign);
      campaignProducer.prepareEditCampaign(campaign);
      return Pages.EDIT_CAMPAIGN;
    }

    public String doEditDonationForm(Campaign campaign) {
      System.out.println("Edit Donation Form of Campaign " + campaign);
      return Pages.EDIT_DONATION_FORM;
    }

    public String doListDonations(Campaign campaign) {
      System.out.println("List Donations of Campaign " + campaign);
      return Pages.LIST_DONATIONS;
    }

    public void doDeleteCampaign(Campaign campaign) {
        System.out.println("Deletion not implemented, yet!");
    }
}
