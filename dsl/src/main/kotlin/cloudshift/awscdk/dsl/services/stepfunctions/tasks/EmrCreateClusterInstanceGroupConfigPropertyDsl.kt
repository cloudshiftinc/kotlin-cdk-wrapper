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
public class EmrCreateClusterInstanceGroupConfigPropertyDsl {
  private val cdkBuilder: EmrCreateCluster.InstanceGroupConfigProperty.Builder =
      EmrCreateCluster.InstanceGroupConfigProperty.builder()

  private val _configurations: MutableList<EmrCreateCluster.ConfigurationProperty> = mutableListOf()

  public fun autoScalingPolicy(block: EmrCreateClusterAutoScalingPolicyPropertyDsl.() -> Unit =
      {}) {
    val builder = EmrCreateClusterAutoScalingPolicyPropertyDsl()
    builder.apply(block)
    cdkBuilder.autoScalingPolicy(builder.build())
  }

  public fun autoScalingPolicy(autoScalingPolicy: EmrCreateCluster.AutoScalingPolicyProperty) {
    cdkBuilder.autoScalingPolicy(autoScalingPolicy)
  }

  public fun bidPrice(bidPrice: String) {
    cdkBuilder.bidPrice(bidPrice)
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

  public fun instanceCount(instanceCount: Number) {
    cdkBuilder.instanceCount(instanceCount)
  }

  public fun instanceRole(instanceRole: EmrCreateCluster.InstanceRoleType) {
    cdkBuilder.instanceRole(instanceRole)
  }

  public fun instanceType(instanceType: String) {
    cdkBuilder.instanceType(instanceType)
  }

  public fun market(market: EmrCreateCluster.InstanceMarket) {
    cdkBuilder.market(market)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): EmrCreateCluster.InstanceGroupConfigProperty {
    if(_configurations.isNotEmpty()) cdkBuilder.configurations(_configurations)
    return cdkBuilder.build()
  }
}
