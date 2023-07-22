@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emr

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emr.CfnStep
import software.amazon.awscdk.services.emr.CfnStepProps

@CdkDslMarker
public class CfnStepPropsDsl {
  private val cdkBuilder: CfnStepProps.Builder = CfnStepProps.builder()

  /**
   * @param actionOnFailure This specifies what action to take when the cluster step fails. 
   * Possible values are `CANCEL_AND_WAIT` and `CONTINUE` .
   */
  public fun actionOnFailure(actionOnFailure: String) {
    cdkBuilder.actionOnFailure(actionOnFailure)
  }

  /**
   * @param hadoopJarStep The `HadoopJarStepConfig` property type specifies a job flow step
   * consisting of a JAR file whose main function will be executed. 
   * The main function submits a job for the cluster to execute as a step on the master node, and
   * then waits for the job to finish or fail before executing subsequent steps.
   */
  public fun hadoopJarStep(hadoopJarStep: IResolvable) {
    cdkBuilder.hadoopJarStep(hadoopJarStep)
  }

  /**
   * @param hadoopJarStep The `HadoopJarStepConfig` property type specifies a job flow step
   * consisting of a JAR file whose main function will be executed. 
   * The main function submits a job for the cluster to execute as a step on the master node, and
   * then waits for the job to finish or fail before executing subsequent steps.
   */
  public fun hadoopJarStep(hadoopJarStep: CfnStep.HadoopJarStepConfigProperty) {
    cdkBuilder.hadoopJarStep(hadoopJarStep)
  }

  /**
   * @param jobFlowId A string that uniquely identifies the cluster (job flow). 
   */
  public fun jobFlowId(jobFlowId: String) {
    cdkBuilder.jobFlowId(jobFlowId)
  }

  /**
   * @param name The name of the cluster step. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnStepProps = cdkBuilder.build()
}
