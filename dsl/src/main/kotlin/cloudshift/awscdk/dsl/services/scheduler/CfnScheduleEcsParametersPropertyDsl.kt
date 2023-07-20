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

package cloudshift.awscdk.dsl.services.scheduler

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.scheduler.CfnSchedule
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnScheduleEcsParametersPropertyDsl {
    private val cdkBuilder: CfnSchedule.EcsParametersProperty.Builder =
        CfnSchedule.EcsParametersProperty.builder()

    private val _capacityProviderStrategy: MutableList<Any> = mutableListOf()

    private val _placementConstraints: MutableList<Any> = mutableListOf()

    private val _placementStrategy: MutableList<Any> = mutableListOf()

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

    public fun networkConfiguration(networkConfiguration: CfnSchedule.NetworkConfigurationProperty) {
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

    public fun placementStrategy(vararg placementStrategy: Any) {
        _placementStrategy.addAll(listOf(*placementStrategy))
    }

    public fun placementStrategy(placementStrategy: Collection<Any>) {
        _placementStrategy.addAll(placementStrategy)
    }

    public fun placementStrategy(placementStrategy: IResolvable) {
        cdkBuilder.placementStrategy(placementStrategy)
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

    public fun tags(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.tags(builder.map)
    }

    public fun tags(tags: Any) {
        cdkBuilder.tags(tags)
    }

    public fun taskCount(taskCount: Number) {
        cdkBuilder.taskCount(taskCount)
    }

    public fun taskDefinitionArn(taskDefinitionArn: String) {
        cdkBuilder.taskDefinitionArn(taskDefinitionArn)
    }

    public fun build(): CfnSchedule.EcsParametersProperty {
        if (_capacityProviderStrategy.isNotEmpty()) {
            cdkBuilder.capacityProviderStrategy(_capacityProviderStrategy)
        }
        if (_placementConstraints.isNotEmpty()) cdkBuilder.placementConstraints(_placementConstraints)
        if (_placementStrategy.isNotEmpty()) cdkBuilder.placementStrategy(_placementStrategy)
        return cdkBuilder.build()
    }
}
