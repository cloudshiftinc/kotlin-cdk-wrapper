@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.iot.CfnJobTemplate

/**
 * The criteria that determines how many retries are allowed for each failure type for a job.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * RetryCriteriaProperty retryCriteriaProperty = RetryCriteriaProperty.builder()
 * .failureType("failureType")
 * .numberOfRetries(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-jobtemplate-retrycriteria.html)
 */
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
