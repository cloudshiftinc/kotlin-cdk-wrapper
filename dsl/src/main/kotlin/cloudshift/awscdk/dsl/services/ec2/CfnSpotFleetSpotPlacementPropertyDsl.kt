@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnSpotFleet

/**
 * Describes Spot Instance placement.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * SpotPlacementProperty spotPlacementProperty = SpotPlacementProperty.builder()
 * .availabilityZone("availabilityZone")
 * .groupName("groupName")
 * .tenancy("tenancy")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotplacement.html)
 */
@CdkDslMarker
public class CfnSpotFleetSpotPlacementPropertyDsl {
  private val cdkBuilder: CfnSpotFleet.SpotPlacementProperty.Builder =
      CfnSpotFleet.SpotPlacementProperty.builder()

  /**
   * @param availabilityZone The Availability Zone.
   * To specify multiple Availability Zones, separate them using commas; for example, "us-west-2a,
   * us-west-2b".
   */
  public fun availabilityZone(availabilityZone: String) {
    cdkBuilder.availabilityZone(availabilityZone)
  }

  /**
   * @param groupName The name of the placement group.
   */
  public fun groupName(groupName: String) {
    cdkBuilder.groupName(groupName)
  }

  /**
   * @param tenancy The tenancy of the instance (if the instance is running in a VPC).
   * An instance with a tenancy of `dedicated` runs on single-tenant hardware. The `host` tenancy is
   * not supported for Spot Instances.
   */
  public fun tenancy(tenancy: String) {
    cdkBuilder.tenancy(tenancy)
  }

  public fun build(): CfnSpotFleet.SpotPlacementProperty = cdkBuilder.build()
}
