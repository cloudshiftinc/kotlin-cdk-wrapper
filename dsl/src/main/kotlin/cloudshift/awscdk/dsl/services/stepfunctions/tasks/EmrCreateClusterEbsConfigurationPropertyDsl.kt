@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

@CdkDslMarker
public class EmrCreateClusterEbsConfigurationPropertyDsl {
  private val cdkBuilder: EmrCreateCluster.EbsConfigurationProperty.Builder =
      EmrCreateCluster.EbsConfigurationProperty.builder()

  private val _ebsBlockDeviceConfigs: MutableList<EmrCreateCluster.EbsBlockDeviceConfigProperty> =
      mutableListOf()

  public
      fun ebsBlockDeviceConfigs(ebsBlockDeviceConfigs: EmrCreateClusterEbsBlockDeviceConfigPropertyDsl.() -> Unit) {
    _ebsBlockDeviceConfigs.add(EmrCreateClusterEbsBlockDeviceConfigPropertyDsl().apply(ebsBlockDeviceConfigs).build())
  }

  public
      fun ebsBlockDeviceConfigs(ebsBlockDeviceConfigs: Collection<EmrCreateCluster.EbsBlockDeviceConfigProperty>) {
    _ebsBlockDeviceConfigs.addAll(ebsBlockDeviceConfigs)
  }

  public fun ebsOptimized(ebsOptimized: Boolean) {
    cdkBuilder.ebsOptimized(ebsOptimized)
  }

  public fun build(): EmrCreateCluster.EbsConfigurationProperty {
    if(_ebsBlockDeviceConfigs.isNotEmpty()) cdkBuilder.ebsBlockDeviceConfigs(_ebsBlockDeviceConfigs)
    return cdkBuilder.build()
  }
}
