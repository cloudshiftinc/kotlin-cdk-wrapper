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

  /**
   * @param bidPrice The bid price for each EC2 Spot instance type as defined by InstanceType.
   * Expressed in USD.
   */
  public fun bidPrice(bidPrice: String) {
    cdkBuilder.bidPrice(bidPrice)
  }

  /**
   * @param bidPriceAsPercentageOfOnDemandPrice The bid price, as a percentage of On-Demand price.
   */
  public fun bidPriceAsPercentageOfOnDemandPrice(bidPriceAsPercentageOfOnDemandPrice: Number) {
    cdkBuilder.bidPriceAsPercentageOfOnDemandPrice(bidPriceAsPercentageOfOnDemandPrice)
  }

  /**
   * @param configurations A configuration classification that applies when provisioning cluster
   * instances, which can include configurations for applications and software that run on the cluster.
   */
  public fun configurations(configurations: EmrCreateClusterConfigurationPropertyDsl.() -> Unit) {
    _configurations.add(EmrCreateClusterConfigurationPropertyDsl().apply(configurations).build())
  }

  /**
   * @param configurations A configuration classification that applies when provisioning cluster
   * instances, which can include configurations for applications and software that run on the cluster.
   */
  public fun configurations(configurations: Collection<EmrCreateCluster.ConfigurationProperty>) {
    _configurations.addAll(configurations)
  }

  /**
   * @param ebsConfiguration The configuration of Amazon Elastic Block Storage (EBS) attached to
   * each instance as defined by InstanceType.
   */
  public
      fun ebsConfiguration(ebsConfiguration: EmrCreateClusterEbsConfigurationPropertyDsl.() -> Unit
      = {}) {
    val builder = EmrCreateClusterEbsConfigurationPropertyDsl()
    builder.apply(ebsConfiguration)
    cdkBuilder.ebsConfiguration(builder.build())
  }

  /**
   * @param ebsConfiguration The configuration of Amazon Elastic Block Storage (EBS) attached to
   * each instance as defined by InstanceType.
   */
  public fun ebsConfiguration(ebsConfiguration: EmrCreateCluster.EbsConfigurationProperty) {
    cdkBuilder.ebsConfiguration(ebsConfiguration)
  }

  /**
   * @param instanceType An EC2 instance type. 
   */
  public fun instanceType(instanceType: String) {
    cdkBuilder.instanceType(instanceType)
  }

  /**
   * @param weightedCapacity The number of units that a provisioned instance of this type provides
   * toward fulfilling the target capacities defined in the InstanceFleetConfig.
   */
  public fun weightedCapacity(weightedCapacity: Number) {
    cdkBuilder.weightedCapacity(weightedCapacity)
  }

  public fun build(): EmrCreateCluster.InstanceTypeConfigProperty {
    if(_configurations.isNotEmpty()) cdkBuilder.configurations(_configurations)
    return cdkBuilder.build()
  }
}
