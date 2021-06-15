package com.baidu.hugegraph.api.traversers;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.baidu.hugegraph.dist.RegisterUtil;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    AllShortestPathsApiTest.class,
    CountApiTest.class,
    CrosspointsApiTest.class,
    CustomizedCrosspointsApiTest.class,
    EdgesApiTest.class,
    FusiformSimilarityApiTest.class,
    JaccardSimilarityApiTest.class,
    KneighborApiTest.class,
    KoutApiTest.class,
    MultiNodeShortestPathApiTest.class,
    NeighborRankApiTest.class,
    PathsApiTest.class,
    PersonalRankApiTest.class,
    RaysApiTest.class,
    RingsApiTest.class,
    SameNeighborsApiTest.class,
    ShortestPathApiTest.class,
    SingleSourceShortestPathApiTest.class,
    TemplatePathsApiTest.class
})
public class TraversersApiTestSuite {
}
