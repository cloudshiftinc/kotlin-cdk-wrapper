@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnSpotFleet
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnSpotFleetSpotFleetRequestConfigDataPropertyDsl {
    private val cdkBuilder: CfnSpotFleet.SpotFleetRequestConfigDataProperty.Builder =
        CfnSpotFleet.SpotFleetRequestConfigDataProperty.builder()

    private val _launchSpecifications: MutableList<Any> = mutableListOf()

    private val _launchTemplateConfigs: MutableList<Any> = mutableListOf()

    private val _tagSpecifications: MutableList<Any> = mutableListOf()

    public fun allocationStrategy(allocationStrategy: String) {
        cdkBuilder.allocationStrategy(allocationStrategy)
    }

    public fun context(context: String) {
        cdkBuilder.context(context)
    }

    public fun excessCapacityTerminationPolicy(excessCapacityTerminationPolicy: String) {
        cdkBuilder.excessCapacityTerminationPolicy(excessCapacityTerminationPolicy)
    }

    public fun iamFleetRole(iamFleetRole: String) {
        cdkBuilder.iamFleetRole(iamFleetRole)
    }

    public fun instanceInterruptionBehavior(instanceInterruptionBehavior: String) {
        cdkBuilder.instanceInterruptionBehavior(instanceInterruptionBehavior)
    }

    public fun instancePoolsToUseCount(instancePoolsToUseCount: Number) {
        cdkBuilder.instancePoolsToUseCount(instancePoolsToUseCount)
    }

    public fun launchSpecifications(vararg launchSpecifications: Any) {
        _launchSpecifications.addAll(listOf(*launchSpecifications))
    }

    public fun launchSpecifications(launchSpecifications: Collection<Any>) {
        _launchSpecifications.addAll(launchSpecifications)
    }

    public fun launchSpecifications(launchSpecifications: IResolvable) {
        cdkBuilder.launchSpecifications(launchSpecifications)
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

    public fun loadBalancersConfig(loadBalancersConfig: IResolvable) {
        cdkBuilder.loadBalancersConfig(loadBalancersConfig)
    }

    public fun loadBalancersConfig(loadBalancersConfig: CfnSpotFleet.LoadBalancersConfigProperty) {
        cdkBuilder.loadBalancersConfig(loadBalancersConfig)
    }

    public fun onDemandAllocationStrategy(onDemandAllocationStrategy: String) {
        cdkBuilder.onDemandAllocationStrategy(onDemandAllocationStrategy)
    }

    public fun onDemandMaxTotalPrice(onDemandMaxTotalPrice: String) {
        cdkBuilder.onDemandMaxTotalPrice(onDemandMaxTotalPrice)
    }

    public fun onDemandTargetCapacity(onDemandTargetCapacity: Number) {
        cdkBuilder.onDemandTargetCapacity(onDemandTargetCapacity)
    }

    public fun replaceUnhealthyInstances(replaceUnhealthyInstances: Boolean) {
        cdkBuilder.replaceUnhealthyInstances(replaceUnhealthyInstances)
    }

    public fun replaceUnhealthyInstances(replaceUnhealthyInstances: IResolvable) {
        cdkBuilder.replaceUnhealthyInstances(replaceUnhealthyInstances)
    }

    public fun spotMaintenanceStrategies(spotMaintenanceStrategies: IResolvable) {
        cdkBuilder.spotMaintenanceStrategies(spotMaintenanceStrategies)
    }

    public fun spotMaintenanceStrategies(spotMaintenanceStrategies: CfnSpotFleet.SpotMaintenanceStrategiesProperty) {
        cdkBuilder.spotMaintenanceStrategies(spotMaintenanceStrategies)
    }

    public fun spotMaxTotalPrice(spotMaxTotalPrice: String) {
        cdkBuilder.spotMaxTotalPrice(spotMaxTotalPrice)
    }

    public fun spotPrice(spotPrice: String) {
        cdkBuilder.spotPrice(spotPrice)
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

    public fun targetCapacity(targetCapacity: Number) {
        cdkBuilder.targetCapacity(targetCapacity)
    }

    public fun targetCapacityUnitType(targetCapacityUnitType: String) {
        cdkBuilder.targetCapacityUnitType(targetCapacityUnitType)
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

    public fun build(): CfnSpotFleet.SpotFleetRequestConfigDataProperty {
        if (_launchSpecifications.isNotEmpty()) cdkBuilder.launchSpecifications(_launchSpecifications)
        if (_launchTemplateConfigs.isNotEmpty()) cdkBuilder.launchTemplateConfigs(_launchTemplateConfigs)
        if (_tagSpecifications.isNotEmpty()) cdkBuilder.tagSpecifications(_tagSpecifications)
        return cdkBuilder.build()
    }
}
