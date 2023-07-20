@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnEC2Fleet
import software.constructs.Construct

@CdkDslMarker
public class CfnEC2FleetDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnEC2Fleet.Builder = CfnEC2Fleet.Builder.create(scope, id)

  private val _launchTemplateConfigs: MutableList<Any> = mutableListOf()

  private val _tagSpecifications: MutableList<Any> = mutableListOf()

  public fun context(context: String) {
    cdkBuilder.context(context)
  }

  public fun excessCapacityTerminationPolicy(excessCapacityTerminationPolicy: String) {
    cdkBuilder.excessCapacityTerminationPolicy(excessCapacityTerminationPolicy)
  }

  public fun launchTemplateConfigs(vararg launchTemplateConfigs: Any) {
    _launchTemplateConfigs.addAll(listOf(*launchTemplateConfigs))
  }

  public fun launchTemplateConfigs(launchTemplateConfigs: Collection<Any>) {
    _launchTemplateConfigs.addAll(launchTemplateConfigs)
  }

  public fun launchTemplateConfigs(launchTemplateConfigs: IResolvable) {
    cdkBuilder.launchTemplateConfigs(launchTemplateConfigs)
  }

  public fun onDemandOptions(onDemandOptions: IResolvable) {
    cdkBuilder.onDemandOptions(onDemandOptions)
  }

  public fun onDemandOptions(onDemandOptions: CfnEC2Fleet.OnDemandOptionsRequestProperty) {
    cdkBuilder.onDemandOptions(onDemandOptions)
  }

  public fun replaceUnhealthyInstances(replaceUnhealthyInstances: Boolean) {
    cdkBuilder.replaceUnhealthyInstances(replaceUnhealthyInstances)
  }

  public fun replaceUnhealthyInstances(replaceUnhealthyInstances: IResolvable) {
    cdkBuilder.replaceUnhealthyInstances(replaceUnhealthyInstances)
  }

  public fun spotOptions(spotOptions: IResolvable) {
    cdkBuilder.spotOptions(spotOptions)
  }

  public fun spotOptions(spotOptions: CfnEC2Fleet.SpotOptionsRequestProperty) {
    cdkBuilder.spotOptions(spotOptions)
  }

  public fun tagSpecifications(vararg tagSpecifications: Any) {
    _tagSpecifications.addAll(listOf(*tagSpecifications))
  }

  public fun tagSpecifications(tagSpecifications: Collection<Any>) {
    _tagSpecifications.addAll(tagSpecifications)
  }

  public fun tagSpecifications(tagSpecifications: IResolvable) {
    cdkBuilder.tagSpecifications(tagSpecifications)
  }

  public fun targetCapacitySpecification(targetCapacitySpecification: IResolvable) {
    cdkBuilder.targetCapacitySpecification(targetCapacitySpecification)
  }

  public
      fun targetCapacitySpecification(targetCapacitySpecification: CfnEC2Fleet.TargetCapacitySpecificationRequestProperty) {
    cdkBuilder.targetCapacitySpecification(targetCapacitySpecification)
  }

  public fun terminateInstancesWithExpiration(terminateInstancesWithExpiration: Boolean) {
    cdkBuilder.terminateInstancesWithExpiration(terminateInstancesWithExpiration)
  }

  public fun terminateInstancesWithExpiration(terminateInstancesWithExpiration: IResolvable) {
    cdkBuilder.terminateInstancesWithExpiration(terminateInstancesWithExpiration)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun validFrom(validFrom: String) {
    cdkBuilder.validFrom(validFrom)
  }

  public fun validUntil(validUntil: String) {
    cdkBuilder.validUntil(validUntil)
  }

  public fun build(): CfnEC2Fleet {
    if(_launchTemplateConfigs.isNotEmpty()) cdkBuilder.launchTemplateConfigs(_launchTemplateConfigs)
    if(_tagSpecifications.isNotEmpty()) cdkBuilder.tagSpecifications(_tagSpecifications)
    return cdkBuilder.build()
  }
}
