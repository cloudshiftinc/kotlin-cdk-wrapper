@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.medialive.CfnInput

@CdkDslMarker
public class CfnInputInputVpcRequestPropertyDsl {
  private val cdkBuilder: CfnInput.InputVpcRequestProperty.Builder =
      CfnInput.InputVpcRequestProperty.builder()

  private val _securityGroupIds: MutableList<String> = mutableListOf()

  private val _subnetIds: MutableList<String> = mutableListOf()

  /**
   * @param securityGroupIds The list of up to five VPC security group IDs to attach to the input
   * VPC network interfaces.
   * The security groups require subnet IDs. If none are specified, MediaLive uses the VPC default
   * security group.
   */
  public fun securityGroupIds(vararg securityGroupIds: String) {
    _securityGroupIds.addAll(listOf(*securityGroupIds))
  }

  /**
   * @param securityGroupIds The list of up to five VPC security group IDs to attach to the input
   * VPC network interfaces.
   * The security groups require subnet IDs. If none are specified, MediaLive uses the VPC default
   * security group.
   */
  public fun securityGroupIds(securityGroupIds: Collection<String>) {
    _securityGroupIds.addAll(securityGroupIds)
  }

  /**
   * @param subnetIds The list of two VPC subnet IDs from the same VPC.
   * You must associate subnet IDs to two unique Availability Zones.
   */
  public fun subnetIds(vararg subnetIds: String) {
    _subnetIds.addAll(listOf(*subnetIds))
  }

  /**
   * @param subnetIds The list of two VPC subnet IDs from the same VPC.
   * You must associate subnet IDs to two unique Availability Zones.
   */
  public fun subnetIds(subnetIds: Collection<String>) {
    _subnetIds.addAll(subnetIds)
  }

  public fun build(): CfnInput.InputVpcRequestProperty {
    if(_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
    if(_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
    return cdkBuilder.build()
  }
}
