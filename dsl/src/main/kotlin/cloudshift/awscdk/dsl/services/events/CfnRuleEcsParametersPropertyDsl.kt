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

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.events.CfnRule
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnRuleEcsParametersPropertyDsl {
    private val cdkBuilder: CfnRule.EcsParametersProperty.Builder =
        CfnRule.EcsParametersProperty.builder()

    private val _capacityProviderStrategy: MutableList<Any> = mutableListOf()

    private val _placementConstraints: MutableList<Any> = mutableListOf()

    private val _placementStrategies: MutableList<Any> = mutableListOf()

    private val _tagList: MutableList<Any> = mutableListOf()

    public fun capacityProviderStrategy(vararg capacityProviderStrategy: Any) {
        _capacityProviderStrategy.addAll(listOf(*capacityProviderStrategy))
    }

    public fun capacityProviderStrategy(capacityProviderStrategy: Collection<Any>) {
        _capacityProviderStrategy.addAll(capacityProviderStrategy)
    }

    public fun capacityProviderStrategy(capacityProviderStrategy: IResolvable) {
        cdkBuilder.capacityProviderStrategy(capacityProviderStrategy)
    }

    public fun enableEcsManagedTags(enableEcsManagedTags: Boolean) {
        cdkBuilder.enableEcsManagedTags(enableEcsManagedTags)
    }

    public fun enableEcsManagedTags(enableEcsManagedTags: IResolvable) {
        cdkBuilder.enableEcsManagedTags(enableEcsManagedTags)
    }

    public fun enableExecuteCommand(enableExecuteCommand: Boolean) {
        cdkBuilder.enableExecuteCommand(enableExecuteCommand)
    }

    public fun enableExecuteCommand(enableExecuteCommand: IResolvable) {
        cdkBuilder.enableExecuteCommand(enableExecuteCommand)
    }

    public fun group(group: String) {
        cdkBuilder.group(group)
    }

    public fun launchType(launchType: String) {
        cdkBuilder.launchType(launchType)
    }

    public fun networkConfiguration(networkConfiguration: IResolvable) {
        cdkBuilder.networkConfiguration(networkConfiguration)
    }

    public fun networkConfiguration(networkConfiguration: CfnRule.NetworkConfigurationProperty) {
        cdkBuilder.networkConfiguration(networkConfiguration)
    }

    public fun placementConstraints(vararg placementConstraints: Any) {
        _placementConstraints.addAll(listOf(*placementConstraints))
    }

    public fun placementConstraints(placementConstraints: Collection<Any>) {
        _placementConstraints.addAll(placementConstraints)
    }

    public fun placementConstraints(placementConstraints: IResolvable) {
        cdkBuilder.placementConstraints(placementConstraints)
    }

    public fun placementStrategies(vararg placementStrategies: Any) {
        _placementStrategies.addAll(listOf(*placementStrategies))
    }

    public fun placementStrategies(placementStrategies: Collection<Any>) {
        _placementStrategies.addAll(placementStrategies)
    }

    public fun placementStrategies(placementStrategies: IResolvable) {
        cdkBuilder.placementStrategies(placementStrategies)
    }

    public fun platformVersion(platformVersion: String) {
        cdkBuilder.platformVersion(platformVersion)
    }

    public fun propagateTags(propagateTags: String) {
        cdkBuilder.propagateTags(propagateTags)
    }

    public fun referenceId(referenceId: String) {
        cdkBuilder.referenceId(referenceId)
    }

    public fun tagList(vararg tagList: Any) {
        _tagList.addAll(listOf(*tagList))
    }

    public fun tagList(tagList: Collection<Any>) {
        _tagList.addAll(tagList)
    }

    public fun tagList(tagList: IResolvable) {
        cdkBuilder.tagList(tagList)
    }

    public fun taskCount(taskCount: Number) {
        cdkBuilder.taskCount(taskCount)
    }

    public fun taskDefinitionArn(taskDefinitionArn: String) {
        cdkBuilder.taskDefinitionArn(taskDefinitionArn)
    }

    public fun build(): CfnRule.EcsParametersProperty {
        if (_capacityProviderStrategy.isNotEmpty()) {
            cdkBuilder.capacityProviderStrategy(_capacityProviderStrategy)
        }
        if (_placementConstraints.isNotEmpty()) cdkBuilder.placementConstraints(_placementConstraints)
        if (_placementStrategies.isNotEmpty()) cdkBuilder.placementStrategies(_placementStrategies)
        if (_tagList.isNotEmpty()) cdkBuilder.tagList(_tagList)
        return cdkBuilder.build()
    }
}
