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

  /**
   * @param autoScalingPolicy An automatic scaling policy for a core instance group or task instance
   * group in an Amazon EMR cluster.
   */
  public
      fun autoScalingPolicy(autoScalingPolicy: EmrCreateClusterAutoScalingPolicyPropertyDsl.() -> Unit
      = {}) {
    val builder = EmrCreateClusterAutoScalingPolicyPropertyDsl()
    builder.apply(autoScalingPolicy)
    cdkBuilder.autoScalingPolicy(builder.build())
  }

  /**
   * @param autoScalingPolicy An automatic scaling policy for a core instance group or task instance
   * group in an Amazon EMR cluster.
   */
  public fun autoScalingPolicy(autoScalingPolicy: EmrCreateCluster.AutoScalingPolicyProperty) {
    cdkBuilder.autoScalingPolicy(autoScalingPolicy)
  }

  /**
   * @param bidPrice The bid price for each EC2 Spot instance type as defined by InstanceType.
   * Expressed in USD.
   */
  public fun bidPrice(bidPrice: String) {
    cdkBuilder.bidPrice(bidPrice)
  }

  /**
   * @param configurations The list of configurations supplied for an EMR cluster instance group.
   */
  public fun configurations(configurations: EmrCreateClusterConfigurationPropertyDsl.() -> Unit) {
    _configurations.add(EmrCreateClusterConfigurationPropertyDsl().apply(configurations).build())
  }

  /**
   * @param configurations The list of configurations supplied for an EMR cluster instance group.
   */
  public fun configurations(configurations: Collection<EmrCreateCluster.ConfigurationProperty>) {
    _configurations.addAll(configurations)
  }

  /**
   * @param ebsConfiguration EBS configurations that will be attached to each EC2 instance in the
   * instance group.
   */
  public
      fun ebsConfiguration(ebsConfiguration: EmrCreateClusterEbsConfigurationPropertyDsl.() -> Unit
      = {}) {
    val builder = EmrCreateClusterEbsConfigurationPropertyDsl()
    builder.apply(ebsConfiguration)
    cdkBuilder.ebsConfiguration(builder.build())
  }

  /**
   * @param ebsConfiguration EBS configurations that will be attached to each EC2 instance in the
   * instance group.
   */
  public fun ebsConfiguration(ebsConfiguration: EmrCreateCluster.EbsConfigurationProperty) {
    cdkBuilder.ebsConfiguration(ebsConfiguration)
  }

  /**
   * @param instanceCount Target number of instances for the instance group. 
   */
  public fun instanceCount(instanceCount: Number) {
    cdkBuilder.instanceCount(instanceCount)
  }

  /**
   * @param instanceRole The role of the instance group in the cluster. 
   */
  public fun instanceRole(instanceRole: EmrCreateCluster.InstanceRoleType) {
    cdkBuilder.instanceRole(instanceRole)
  }

  /**
   * @param instanceType The EC2 instance type for all instances in the instance group. 
   */
  public fun instanceType(instanceType: String) {
    cdkBuilder.instanceType(instanceType)
  }

  /**
   * @param market Market type of the EC2 instances used to create a cluster node.
   */
  public fun market(market: EmrCreateCluster.InstanceMarket) {
    cdkBuilder.market(market)
  }

  /**
   * @param name Friendly name given to the instance group.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): EmrCreateCluster.InstanceGroupConfigProperty {
    if(_configurations.isNotEmpty()) cdkBuilder.configurations(_configurations)
    return cdkBuilder.build()
  }
}
