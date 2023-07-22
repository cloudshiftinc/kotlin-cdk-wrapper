@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emr

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emr.CfnCluster

@CdkDslMarker
public class CfnClusterInstanceTypeConfigPropertyDsl {
  private val cdkBuilder: CfnCluster.InstanceTypeConfigProperty.Builder =
      CfnCluster.InstanceTypeConfigProperty.builder()

  private val _configurations: MutableList<Any> = mutableListOf()

  /**
   * @param bidPrice The bid price for each Amazon EC2 Spot Instance type as defined by
   * `InstanceType` .
   * Expressed in USD. If neither `BidPrice` nor `BidPriceAsPercentageOfOnDemandPrice` is provided,
   * `BidPriceAsPercentageOfOnDemandPrice` defaults to 100%.
   */
  public fun bidPrice(bidPrice: String) {
    cdkBuilder.bidPrice(bidPrice)
  }

  /**
   * @param bidPriceAsPercentageOfOnDemandPrice The bid price, as a percentage of On-Demand price,
   * for each Amazon EC2 Spot Instance as defined by `InstanceType` .
   * Expressed as a number (for example, 20 specifies 20%). If neither `BidPrice` nor
   * `BidPriceAsPercentageOfOnDemandPrice` is provided, `BidPriceAsPercentageOfOnDemandPrice` defaults
   * to 100%.
   */
  public fun bidPriceAsPercentageOfOnDemandPrice(bidPriceAsPercentageOfOnDemandPrice: Number) {
    cdkBuilder.bidPriceAsPercentageOfOnDemandPrice(bidPriceAsPercentageOfOnDemandPrice)
  }

  /**
   * @param configurations A configuration classification that applies when provisioning cluster
   * instances, which can include configurations for applications and software that run on the cluster.
   */
  public fun configurations(vararg configurations: Any) {
    _configurations.addAll(listOf(*configurations))
  }

  /**
   * @param configurations A configuration classification that applies when provisioning cluster
   * instances, which can include configurations for applications and software that run on the cluster.
   */
  public fun configurations(configurations: Collection<Any>) {
    _configurations.addAll(configurations)
  }

  /**
   * @param configurations A configuration classification that applies when provisioning cluster
   * instances, which can include configurations for applications and software that run on the cluster.
   */
  public fun configurations(configurations: IResolvable) {
    cdkBuilder.configurations(configurations)
  }

  /**
   * @param customAmiId The custom AMI ID to use for the instance type.
   */
  public fun customAmiId(customAmiId: String) {
    cdkBuilder.customAmiId(customAmiId)
  }

  /**
   * @param ebsConfiguration The configuration of Amazon Elastic Block Store (Amazon EBS) attached
   * to each instance as defined by `InstanceType` .
   */
  public fun ebsConfiguration(ebsConfiguration: IResolvable) {
    cdkBuilder.ebsConfiguration(ebsConfiguration)
  }

  /**
   * @param ebsConfiguration The configuration of Amazon Elastic Block Store (Amazon EBS) attached
   * to each instance as defined by `InstanceType` .
   */
  public fun ebsConfiguration(ebsConfiguration: CfnCluster.EbsConfigurationProperty) {
    cdkBuilder.ebsConfiguration(ebsConfiguration)
  }

  /**
   * @param instanceType An Amazon EC2 instance type, such as `m3.xlarge` . 
   */
  public fun instanceType(instanceType: String) {
    cdkBuilder.instanceType(instanceType)
  }

  /**
   * @param weightedCapacity The number of units that a provisioned instance of this type provides
   * toward fulfilling the target capacities defined in `InstanceFleetConfig` .
   * This value is 1 for a master instance fleet, and must be 1 or greater for core and task
   * instance fleets. Defaults to 1 if not specified.
   */
  public fun weightedCapacity(weightedCapacity: Number) {
    cdkBuilder.weightedCapacity(weightedCapacity)
  }

  public fun build(): CfnCluster.InstanceTypeConfigProperty {
    if(_configurations.isNotEmpty()) cdkBuilder.configurations(_configurations)
    return cdkBuilder.build()
  }
}
