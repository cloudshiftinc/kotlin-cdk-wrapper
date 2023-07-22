@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediaconvert

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.mediaconvert.CfnJobTemplate

/**
 * Optional.
 *
 * Configuration for a destination queue to which the job can hop once a customer-defined minimum
 * wait time has passed. For more information, see [Setting Up Queue Hopping to Avoid Long
 * Waits](https://docs.aws.amazon.com/mediaconvert/latest/ug/setting-up-queue-hopping-to-avoid-long-waits.html)
 * in the *AWS Elemental MediaConvert User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediaconvert.*;
 * HopDestinationProperty hopDestinationProperty = HopDestinationProperty.builder()
 * .priority(123)
 * .queue("queue")
 * .waitMinutes(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconvert-jobtemplate-hopdestination.html)
 */
@CdkDslMarker
public class CfnJobTemplateHopDestinationPropertyDsl {
  private val cdkBuilder: CfnJobTemplate.HopDestinationProperty.Builder =
      CfnJobTemplate.HopDestinationProperty.builder()

  /**
   * @param priority Optional.
   * When you set up a job to use queue hopping, you can specify a different relative priority for
   * the job in the destination queue. If you don't specify, the relative priority will remain the same
   * as in the previous queue.
   */
  public fun priority(priority: Number) {
    cdkBuilder.priority(priority)
  }

  /**
   * @param queue Optional unless the job is submitted on the default queue.
   * When you set up a job to use queue hopping, you can specify a destination queue. This queue
   * cannot be the original queue to which the job is submitted. If the original queue isn't the
   * default queue and you don't specify the destination queue, the job will move to the default queue.
   */
  public fun queue(queue: String) {
    cdkBuilder.queue(queue)
  }

  /**
   * @param waitMinutes Required for setting up a job to use queue hopping.
   * Minimum wait time in minutes until the job can hop to the destination queue. Valid range is 1
   * to 4320 minutes, inclusive.
   */
  public fun waitMinutes(waitMinutes: Number) {
    cdkBuilder.waitMinutes(waitMinutes)
  }

  public fun build(): CfnJobTemplate.HopDestinationProperty = cdkBuilder.build()
}
