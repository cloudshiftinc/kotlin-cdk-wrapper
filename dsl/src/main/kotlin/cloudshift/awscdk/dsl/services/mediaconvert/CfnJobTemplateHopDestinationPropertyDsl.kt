@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediaconvert

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.mediaconvert.CfnJobTemplate

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
