@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.fis

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.fis.CfnExperimentTemplate

@CdkDslMarker
public class CfnExperimentTemplateExperimentTemplateStopConditionPropertyDsl {
  private val cdkBuilder: CfnExperimentTemplate.ExperimentTemplateStopConditionProperty.Builder =
      CfnExperimentTemplate.ExperimentTemplateStopConditionProperty.builder()

  /**
   * @param source The source for the stop condition. 
   * Specify `aws:cloudwatch:alarm` if the stop condition is defined by a CloudWatch alarm. Specify
   * `none` if there is no stop condition.
   */
  public fun source(source: String) {
    cdkBuilder.source(source)
  }

  /**
   * @param value The Amazon Resource Name (ARN) of the CloudWatch alarm.
   * This is required if the source is a CloudWatch alarm.
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnExperimentTemplate.ExperimentTemplateStopConditionProperty =
      cdkBuilder.build()
}
