@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelVpcOutputSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.VpcOutputSettingsProperty.Builder =
      CfnChannel.VpcOutputSettingsProperty.builder()

  private val _publicAddressAllocationIds: MutableList<String> = mutableListOf()

  private val _securityGroupIds: MutableList<String> = mutableListOf()

  private val _subnetIds: MutableList<String> = mutableListOf()

  public fun publicAddressAllocationIds(vararg publicAddressAllocationIds: String) {
    _publicAddressAllocationIds.addAll(listOf(*publicAddressAllocationIds))
  }

  public fun publicAddressAllocationIds(publicAddressAllocationIds: Collection<String>) {
    _publicAddressAllocationIds.addAll(publicAddressAllocationIds)
  }

  public fun securityGroupIds(vararg securityGroupIds: String) {
    _securityGroupIds.addAll(listOf(*securityGroupIds))
  }

  public fun securityGroupIds(securityGroupIds: Collection<String>) {
    _securityGroupIds.addAll(securityGroupIds)
  }

  public fun subnetIds(vararg subnetIds: String) {
    _subnetIds.addAll(listOf(*subnetIds))
  }

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
