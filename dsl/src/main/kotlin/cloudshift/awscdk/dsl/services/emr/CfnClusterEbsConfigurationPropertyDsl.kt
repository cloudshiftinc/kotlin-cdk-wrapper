@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emr

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emr.CfnCluster

@CdkDslMarker
public class CfnClusterEbsConfigurationPropertyDsl {
  private val cdkBuilder: CfnCluster.EbsConfigurationProperty.Builder =
      CfnCluster.EbsConfigurationProperty.builder()

  private val _ebsBlockDeviceConfigs: MutableList<Any> = mutableListOf()

  public fun ebsBlockDeviceConfigs(vararg ebsBlockDeviceConfigs: Any) {
    _ebsBlockDeviceConfigs.addAll(listOf(*ebsBlockDeviceConfigs))
  }

  public fun ebsBlockDeviceConfigs(ebsBlockDeviceConfigs: Collection<Any>) {
    _ebsBlockDeviceConfigs.addAll(ebsBlockDeviceConfigs)
  }

  public fun ebsBlockDeviceConfigs(ebsBlockDeviceConfigs: IResolvable) {
    cdkBuilder.ebsBlockDeviceConfigs(ebsBlockDeviceConfigs)
  }

  public fun ebsOptimized(ebsOptimized: Boolean) {
    cdkBuilder.ebsOptimized(ebsOptimized)
  }

  public fun ebsOptimized(ebsOptimized: IResolvable) {
    cdkBuilder.ebsOptimized(ebsOptimized)
  }

  public fun build(): CfnCluster.EbsConfigurationProperty {
    if(_ebsBlockDeviceConfigs.isNotEmpty()) cdkBuilder.ebsBlockDeviceConfigs(_ebsBlockDeviceConfigs)
    return cdkBuilder.build()
  }
}
