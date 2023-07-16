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

  public fun bidPrice(bidPrice: String) {
    cdkBuilder.bidPrice(bidPrice)
  }

  public fun bidPriceAsPercentageOfOnDemandPrice(bidPriceAsPercentageOfOnDemandPrice: Number) {
    cdkBuilder.bidPriceAsPercentageOfOnDemandPrice(bidPriceAsPercentageOfOnDemandPrice)
  }

  public fun configurations(vararg configurations: Any) {
    _configurations.addAll(listOf(*configurations))
  }

  public fun configurations(configurations: Collection<Any>) {
    _configurations.addAll(configurations)
  }

  public fun configurations(configurations: IResolvable) {
    cdkBuilder.configurations(configurations)
  }

  public fun customAmiId(customAmiId: String) {
    cdkBuilder.customAmiId(customAmiId)
  }

  public fun ebsConfiguration(ebsConfiguration: IResolvable) {
    cdkBuilder.ebsConfiguration(ebsConfiguration)
  }

  public fun ebsConfiguration(ebsConfiguration: CfnCluster.EbsConfigurationProperty) {
    cdkBuilder.ebsConfiguration(ebsConfiguration)
  }

  public fun instanceType(instanceType: String) {
    cdkBuilder.instanceType(instanceType)
  }

  public fun weightedCapacity(weightedCapacity: Number) {
    cdkBuilder.weightedCapacity(weightedCapacity)
  }

  public fun build(): CfnCluster.InstanceTypeConfigProperty {
    if(_configurations.isNotEmpty()) cdkBuilder.configurations(_configurations)
    return cdkBuilder.build()
  }
}
