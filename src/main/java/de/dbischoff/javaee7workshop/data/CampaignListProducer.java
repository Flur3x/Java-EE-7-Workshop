package de.dbischoff.javaee7workshop.data;

import de.dbischoff.javaee7workshop.model.*;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

@Named
@SessionScoped
public class CampaignListProducer implements Serializable {

    private List<Campaign> campaigns;

    public CampaignListProducer() {
        campaigns = createMockCampaigns();
    }

    public List<Campaign> getCampaigns() {
        return campaigns;
    }

    public List<Campaign> createMockCampaigns() {
        Donation donation1 = new Donation();
        donation1.setDonorName("Daniel Bischoff");
        donation1.setAmount(20d);
        donation1.setReceiptRequested(true);
        donation1.setStatus(Donation.Status.TRANSFERRED);
        donation1.setAccount(new Account(donation1.getDonorName(), "comdirect bank AG", "DE5754563644677576334"));

        Donation donation2 = new Donation();
        donation2.setDonorName("Jemand anderes");
        donation2.setAmount(30d);
        donation2.setReceiptRequested(false);
        donation2.setStatus(Donation.Status.IN_PROCESS);
        donation2.setAccount(new Account("Mister Anonym", "Bank der Wunder", "DE9916974612841586521"));

        List<Donation> spenden = new LinkedList<>();
        spenden.add(donation1);
        spenden.add(donation2);

        Campaign campaign1 = new Campaign();
        campaign1.setName("Rollstuhl für Maria");
        campaign1.setTargetAmount(1000d);
        campaign1.setAmountDonatedSoFar(258d);
        campaign1.setDonationMinimum(20d);
        campaign1.setId(1L);
        campaign1.setAccount(new Account("Maria Sudermann", "Sparkasse Berlin", "DE982618255271644621"));
        campaign1.setDonations(spenden);

        Campaign campaign2 = new Campaign();
        campaign2.setName("Tierschutzgebiet Berlin Brandenburg");
        campaign2.setTargetAmount(2500d);
        campaign1.setAmountDonatedSoFar(742d);
        campaign1.setDonationMinimum(25d);
        campaign1.setId(2L);
        campaign1.setAccount(new Account("Maria Sudermann", "Sparkasse Berlin", "DE982618255271644621"));
        campaign1.setDonations(spenden);

        List<Campaign> ret = new LinkedList<>();
        ret.add(campaign1);
        ret.add(campaign2);

        return ret;
    }
}
