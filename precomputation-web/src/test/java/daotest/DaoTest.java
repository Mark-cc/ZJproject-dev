package daotest;

import org.hnu.precomputation.common.model.dataset.Dataset;
import org.hnu.precomputation.service.dao.DatasetDao;
import org.hnu.precomputation.web.PrecomputationApplication;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = PrecomputationApplication.class)
//@RunWith(SpringRunner.class)
class DaoTest {

    @Autowired
    private DatasetDao datasetDao;

    @Test
    public void test() {

        Long test = Long.valueOf(2);
        System.out.println(test);
        Dataset dataset = datasetDao.selectByPrimaryKey(test);
        System.out.println(dataset.getName());
        System.out.println(dataset.getDescription());

    }

}

