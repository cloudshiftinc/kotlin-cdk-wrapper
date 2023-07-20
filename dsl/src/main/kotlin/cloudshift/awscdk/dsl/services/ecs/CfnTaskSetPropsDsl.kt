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

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecs.CfnTaskSet
import software.amazon.awscdk.services.ecs.CfnTaskSetProps
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnTaskSetPropsDsl {
    private val cdkBuilder: CfnTaskSetProps.Builder = CfnTaskSetProps.builder()

    private val _loadBalancers: MutableList<Any> = mutableListOf()

    private val _serviceRegistries: MutableList<Any> = mutableListOf()

    public fun cluster(cluster: String) {
        cdkBuilder.cluster(cluster)
    }

    public fun externalId(externalId: String) {
        cdkBuilder.externalId(externalId)
    }

    public fun launchType(launchType: String) {
        cdkBuilder.launchType(launchType)
    }

    public fun loadBalancers(vararg loadBalancers: Any) {
        _loadBalancers.addAll(listOf(*loadBalancers))
    }

    public fun loadBalancers(loadBalancers: Collection<Any>) {
        _loadBalancers.addAll(loadBalancers)
    }

    public fun loadBalancers(loadBalancers: IResolvable) {
        cdkBuilder.loadBalancers(loadBalancers)
    }

    public fun networkConfiguration(networkConfiguration: IResolvable) {
        cdkBuilder.networkConfiguration(networkConfiguration)
    }

    public fun networkConfiguration(networkConfiguration: CfnTaskSet.NetworkConfigurationProperty) {
        cdkBuilder.networkConfiguration(networkConfiguration)
    }

    public fun platformVersion(platformVersion: String) {
        cdkBuilder.platformVersion(platformVersion)
    }

    public fun scale(scale: IResolvable) {
        cdkBuilder.scale(scale)
    }

    public fun scale(scale: CfnTaskSet.ScaleProperty) {
        cdkBuilder.scale(scale)
    }

    public fun service(service: String) {
        cdkBuilder.service(service)
    }

    public fun serviceRegistries(vararg serviceRegistries: Any) {
        _serviceRegistries.addAll(listOf(*serviceRegistries))
    }

    public fun serviceRegistries(serviceRegistries: Collection<Any>) {
        _serviceRegistries.addAll(serviceRegistries)
    }

    public fun serviceRegistries(serviceRegistries: IResolvable) {
        cdkBuilder.serviceRegistries(serviceRegistries)
    }

    public fun taskDefinition(taskDefinition: String) {
        cdkBuilder.taskDefinition(taskDefinition)
    }

    public fun build(): CfnTaskSetProps {
        if (_loadBalancers.isNotEmpty()) cdkBuilder.loadBalancers(_loadBalancers)
        if (_serviceRegistries.isNotEmpty()) cdkBuilder.serviceRegistries(_serviceRegistries)
        return cdkBuilder.build()
    }
}
