package com.narendra

import com.verizon.bda.trapezium.framework.{ApplicationManager, ApplicationManagerTestSuite}

/**
 * Created by parmana on 10/28/16.
 */
class ExamplTest extends ApplicationManagerTestSuite {


  test("test Exmple") {
    val workFlowConfig = ApplicationManager.setWorkflowConfig("example_workflow")
    ApplicationManager.runBatchWorkFlow(workFlowConfig, appConfig, 1)(sc)
  }

}
