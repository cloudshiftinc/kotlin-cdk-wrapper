@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.iot.CfnJobTemplate

@CdkDslMarker
public class CfnJobTemplateRetryCriteriaPropertyDsl {
  private val cdkBuilder: CfnJobTemplate.RetryCriteriaProperty.Builder =
      CfnJobTemplate.RetryCriteriaProperty.builder()

  /**
   * @param failureType The type of job execution failures that can initiate a job retry.
   */
  public fun failureType(failureType: String) {
    cdkBuilder.failureType(failureType)
  }

  /**
   * @param numberOfRetries The number of retries allowed for a failure type for the job.
   */
  public fun numberOfRetries(numberOfRetries: Number) {
    cdkBuilder.numberOfRetries(numberOfRetries)
  }

  public fun build(): CfnJobTemplate.RetryCriteriaProperty = cdkBuilder.build()
}
