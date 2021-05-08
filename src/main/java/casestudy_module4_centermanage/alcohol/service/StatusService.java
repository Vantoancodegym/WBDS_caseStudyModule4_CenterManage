package casestudy_module4_centermanage.alcohol.service;

import casestudy_module4_centermanage.alcohol.model.Status;
import casestudy_module4_centermanage.alcohol.repository.StatusRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatusService implements IStatusService{
    @Autowired
    private StatusRepo statusRepo;
    @Override
    public List<Status> findAll(){
        return statusRepo.findAll();
    }
}
