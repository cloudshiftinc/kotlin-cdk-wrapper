@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * Settings to enable VPC mode in the channel, so that the endpoints for all outputs are in your
 * VPC.
 *
 * This entity is at the top level in the channel.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * VpcOutputSettingsProperty vpcOutputSettingsProperty = VpcOutputSettingsProperty.builder()
 * .publicAddressAllocationIds(List.of("publicAddressAllocationIds"))
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnetIds(List.of("subnetIds"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-vpcoutputsettings.html)
 */
@CdkDslMarker
public class CfnChannelVpcOutputSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.VpcOutputSettingsProperty.Builder =
      CfnChannel.VpcOutputSettingsProperty.builder()

  private val _publicAddressAllocationIds: MutableList<String> = mutableListOf()

  private val _securityGroupIds: MutableList<String> = mutableListOf()

  private val _subnetIds: MutableList<String> = mutableListOf()

  /**
   * @param publicAddressAllocationIds List of public address allocation IDs to associate with ENIs
   * that will be created in Output VPC.
   * Must specify one for SINGLE_PIPELINE, two for STANDARD channels
   */
  public fun publicAddressAllocationIds(vararg publicAddressAllocationIds: String) {
    _publicAddressAllocationIds.addAll(listOf(*publicAddressAllocationIds))
  }

  /**
   * @param publicAddressAllocationIds List of public address allocation IDs to associate with ENIs
   * that will be created in Output VPC.
   * Must specify one for SINGLE_PIPELINE, two for STANDARD channels
   */
  public fun publicAddressAllocationIds(publicAddressAllocationIds: Collection<String>) {
    _publicAddressAllocationIds.addAll(publicAddressAllocationIds)
  }

  /**
   * @param securityGroupIds A list of up to 5 EC2 VPC security group IDs to attach to the Output
   * VPC network interfaces.
   * If none are specified then the VPC default security group will be used
   */
  public fun securityGroupIds(vararg securityGroupIds: String) {
    _securityGroupIds.addAll(listOf(*securityGroupIds))
  }

  /**
   * @param securityGroupIds A list of up to 5 EC2 VPC security group IDs to attach to the Output
   * VPC network interfaces.
   * If none are specified then the VPC default security group will be used
   */
  public fun securityGroupIds(securityGroupIds: Collection<String>) {
    _securityGroupIds.addAll(securityGroupIds)
  }

  /**
   * @param subnetIds A list of VPC subnet IDs from the same VPC.
   * If STANDARD channel, subnet IDs must be mapped to two unique availability zones (AZ).
   */
  public fun subnetIds(vararg subnetIds: String) {
    _subnetIds.addAll(listOf(*subnetIds))
  }

  /**
   * @param subnetIds A list of VPC subnet IDs from the same VPC.
   * If STANDARD channel, subnet IDs must be mapped to two unique availability zones (AZ).
   */
  public fun subnetIds(subnetIds: Collection<String>) {
    _subnetIds.addAll(subnetIds)
  }

  public fun build(): CfnChannel.VpcOutputSettingsProperty {
    if(_publicAddressAllocationIds.isNotEmpty())
        cdkBuilder.publicAddressAllocationIds(_publicAddressAllocationIds)
    if(_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
    if(_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
    return cdkBuilder.build()
  }
}
