@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.location

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.location.CfnTrackerConsumerProps

@CdkDslMarker
public class CfnTrackerConsumerPropsDsl {
  private val cdkBuilder: CfnTrackerConsumerProps.Builder = CfnTrackerConsumerProps.builder()

  /**
   * @param consumerArn The Amazon Resource Name (ARN) for the geofence collection to be associated
   * to tracker resource. 
   * Used when you need to specify a resource across all AWS .
   *
   * * Format example:
   * `arn:aws:geo:region:account-id:geofence-collection/ExampleGeofenceCollectionConsumer`
   */
  public fun consumerArn(consumerArn: String) {
    cdkBuilder.consumerArn(consumerArn)
  }

  /**
   * @param trackerName The name for the tracker resource. 
   * Requirements:
   *
   * * Contain only alphanumeric characters (A-Z, a-z, 0-9) , hyphens (-), periods (.), and
   * underscores (_).
   * * Must be a unique tracker resource name.
   * * No spaces allowed. For example, `ExampleTracker` .
   */
  public fun trackerName(trackerName: String) {
    cdkBuilder.trackerName(trackerName)
  }

  public fun build(): CfnTrackerConsumerProps = cdkBuilder.build()
}
