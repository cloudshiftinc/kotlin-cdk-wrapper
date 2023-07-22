@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emr

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emr.CfnCluster

@CdkDslMarker
public class CfnClusterStepConfigPropertyDsl {
  private val cdkBuilder: CfnCluster.StepConfigProperty.Builder =
      CfnCluster.StepConfigProperty.builder()

  /**
   * @param actionOnFailure The action to take when the cluster step fails.
   * Possible values are `CANCEL_AND_WAIT` and `CONTINUE` .
   */
  public fun actionOnFailure(actionOnFailure: String) {
    cdkBuilder.actionOnFailure(actionOnFailure)
  }

  /**
   * @param hadoopJarStep The JAR file used for the step. 
   */
  public fun hadoopJarStep(hadoopJarStep: IResolvable) {
    cdkBuilder.hadoopJarStep(hadoopJarStep)
  }

  /**
   * @param hadoopJarStep The JAR file used for the step. 
   */
  public fun hadoopJarStep(hadoopJarStep: CfnCluster.HadoopJarStepConfigProperty) {
    cdkBuilder.hadoopJarStep(hadoopJarStep)
  }

  /**
   * @param name The name of the step. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnCluster.StepConfigProperty = cdkBuilder.build()
}
