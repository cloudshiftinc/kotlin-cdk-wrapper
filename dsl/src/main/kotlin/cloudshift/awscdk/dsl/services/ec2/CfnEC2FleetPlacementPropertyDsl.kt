@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnEC2Fleet

/**
 * Describes the placement of an instance.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * PlacementProperty placementProperty = PlacementProperty.builder()
 * .affinity("affinity")
 * .availabilityZone("availabilityZone")
 * .groupName("groupName")
 * .hostId("hostId")
 * .hostResourceGroupArn("hostResourceGroupArn")
 * .partitionNumber(123)
 * .spreadDomain("spreadDomain")
 * .tenancy("tenancy")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-placement.html)
 */
@CdkDslMarker
public class CfnEC2FleetPlacementPropertyDsl {
  private val cdkBuilder: CfnEC2Fleet.PlacementProperty.Builder =
      CfnEC2Fleet.PlacementProperty.builder()

  /**
   * @param affinity The affinity setting for the instance on the Dedicated Host.
   * This parameter is not supported for
   * [CreateFleet](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet) or
   * [ImportInstance](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportInstance.html) .
   */
  public fun affinity(affinity: String) {
    cdkBuilder.affinity(affinity)
  }

  /**
   * @param availabilityZone The Availability Zone of the instance.
   * If not specified, an Availability Zone will be automatically chosen for you based on the load
   * balancing criteria for the Region.
   *
   * This parameter is not supported for
   * [CreateFleet](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet) .
   */
  public fun availabilityZone(availabilityZone: String) {
    cdkBuilder.availabilityZone(availabilityZone)
  }

  /**
   * @param groupName The name of the placement group that the instance is in.
   * If you specify `GroupName` , you can't specify `GroupId` .
   */
  public fun groupName(groupName: String) {
    cdkBuilder.groupName(groupName)
  }

  /**
   * @param hostId The ID of the Dedicated Host on which the instance resides.
   * This parameter is not supported for
   * [CreateFleet](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet) or
   * [ImportInstance](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportInstance.html) .
   */
  public fun hostId(hostId: String) {
    cdkBuilder.hostId(hostId)
  }

  /**
   * @param hostResourceGroupArn The ARN of the host resource group in which to launch the
   * instances.
   * If you specify this parameter, either omit the *Tenancy* parameter or set it to `host` .
   *
   * This parameter is not supported for
   * [CreateFleet](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet) .
   */
  public fun hostResourceGroupArn(hostResourceGroupArn: String) {
    cdkBuilder.hostResourceGroupArn(hostResourceGroupArn)
  }

  /**
   * @param partitionNumber The number of the partition that the instance is in.
   * Valid only if the placement group strategy is set to `partition` .
   *
   * This parameter is not supported for
   * [CreateFleet](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet) .
   */
  public fun partitionNumber(partitionNumber: Number) {
    cdkBuilder.partitionNumber(partitionNumber)
  }

  /**
   * @param spreadDomain Reserved for future use.
   */
  public fun spreadDomain(spreadDomain: String) {
    cdkBuilder.spreadDomain(spreadDomain)
  }

  /**
   * @param tenancy The tenancy of the instance. An instance with a tenancy of `dedicated` runs on
   * single-tenant hardware.
   * This parameter is not supported for
   * [CreateFleet](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateFleet) . The `host`
   * tenancy is not supported for
   * [ImportInstance](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ImportInstance.html)
   * or for T3 instances that are configured for the `unlimited` CPU credit option.
   */
  public fun tenancy(tenancy: String) {
    cdkBuilder.tenancy(tenancy)
  }

  public fun build(): CfnEC2Fleet.PlacementProperty = cdkBuilder.build()
}
