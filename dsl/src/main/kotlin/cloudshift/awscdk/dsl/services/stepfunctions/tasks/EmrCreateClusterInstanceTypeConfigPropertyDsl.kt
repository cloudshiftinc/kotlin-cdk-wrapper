@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

@CdkDslMarker
public class EmrCreateClusterInstanceTypeConfigPropertyDsl {
  private val cdkBuilder: EmrCreateCluster.InstanceTypeConfigProperty.Builder =
      EmrCreateCluster.InstanceTypeConfigProperty.builder()

  private val _configurations: MutableList<EmrCreateCluster.ConfigurationProperty> = mutableListOf()

  public fun bidPrice(bidPrice: String) {
    cdkBuilder.bidPrice(bidPrice)
  }

  public fun bidPriceAsPercentageOfOnDemandPrice(bidPriceAsPercentageOfOnDemandPrice: Number) {
    cdkBuilder.bidPriceAsPercentageOfOnDemandPrice(bidPriceAsPercentageOfOnDemandPrice)
  }

  public fun configurations(configurations: EmrCreateClusterConfigurationPropertyDsl.() -> Unit) {
    _configurations.add(EmrCreateClusterConfigurationPropertyDsl().apply(configurations).build())
  }

  public fun configurations(configurations: Collection<EmrCreateCluster.ConfigurationProperty>) {
    _configurations.addAll(configurations)
  }

  public fun ebsConfiguration(block: EmrCreateClusterEbsConfigurationPropertyDsl.() -> Unit = {}) {
    val builder = EmrCreateClusterEbsConfigurationPropertyDsl()
    builder.apply(block)
    cdkBuilder.ebsConfiguration(builder.build())
  }

  public fun ebsConfiguration(ebsConfiguration: EmrCreateCluster.EbsConfigurationProperty) {
    cdkBuilder.ebsConfiguration(ebsConfiguration)
  }

  public fun instanceType(instanceType: String) {
    cdkBuilder.instanceType(instanceType)
  }

  public fun weightedCapacity(weightedCapacity: Number) {
    cdkBuilder.weightedCapacity(weightedCapacity)
  }

  public fun build(): EmrCreateCluster.InstanceTypeConfigProperty {
    if(_configurations.isNotEmpty()) cdkBuilder.configurations(_configurations)
    return cdkBuilder.build()
  }
}
