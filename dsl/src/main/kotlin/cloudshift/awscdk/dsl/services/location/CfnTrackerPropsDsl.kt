@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.location

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Deprecated
import kotlin.String
import software.amazon.awscdk.services.location.CfnTrackerProps

@CdkDslMarker
public class CfnTrackerPropsDsl {
  private val cdkBuilder: CfnTrackerProps.Builder = CfnTrackerProps.builder()

  /**
   * @param description An optional description for the tracker resource.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param kmsKeyId A key identifier for an [AWS KMS customer managed
   * key](https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html) . Enter a key ID, key
   * ARN, alias name, or alias ARN.
   */
  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  /**
   * @param positionFiltering Specifies the position filtering for the tracker resource.
   * Valid values:
   *
   * * `TimeBased` - Location updates are evaluated against linked geofence collections, but not
   * every location update is stored. If your update frequency is more often than 30 seconds, only one
   * update per 30 seconds is stored for each unique device ID.
   * * `DistanceBased` - If the device has moved less than 30 m (98.4 ft), location updates are
   * ignored. Location updates within this area are neither evaluated against linked geofence
   * collections, nor stored. This helps control costs by reducing the number of geofence evaluations
   * and historical device positions to paginate through. Distance-based filtering can also reduce the
   * effects of GPS noise when displaying device trajectories on a map.
   * * `AccuracyBased` - If the device has moved less than the measured accuracy, location updates
   * are ignored. For example, if two consecutive updates from a device have a horizontal accuracy of 5
   * m and 10 m, the second update is ignored if the device has moved less than 15 m. Ignored location
   * updates are neither evaluated against linked geofence collections, nor stored. This can reduce the
   * effects of GPS noise when displaying device trajectories on a map, and can help control your costs
   * by reducing the number of geofence evaluations.
   *
   * This field is optional. If not specified, the default value is `TimeBased` .
   */
  public fun positionFiltering(positionFiltering: String) {
    cdkBuilder.positionFiltering(positionFiltering)
  }

  /**
   * @param pricingPlan the value to be set.
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public fun pricingPlan(pricingPlan: String) {
    cdkBuilder.pricingPlan(pricingPlan)
  }

  /**
   * @param pricingPlanDataSource the value to be set.
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public fun pricingPlanDataSource(pricingPlanDataSource: String) {
    cdkBuilder.pricingPlanDataSource(pricingPlanDataSource)
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

  public fun build(): CfnTrackerProps = cdkBuilder.build()
}
