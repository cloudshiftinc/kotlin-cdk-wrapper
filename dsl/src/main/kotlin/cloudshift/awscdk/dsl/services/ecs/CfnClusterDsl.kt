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
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecs.CfnCluster
import software.constructs.Construct
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnClusterDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnCluster.Builder = CfnCluster.Builder.create(scope, id)

    private val _capacityProviders: MutableList<String> = mutableListOf()

    private val _clusterSettings: MutableList<Any> = mutableListOf()

    private val _defaultCapacityProviderStrategy: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun capacityProviders(vararg capacityProviders: String) {
        _capacityProviders.addAll(listOf(*capacityProviders))
    }

    public fun capacityProviders(capacityProviders: Collection<String>) {
        _capacityProviders.addAll(capacityProviders)
    }

    public fun clusterName(clusterName: String) {
        cdkBuilder.clusterName(clusterName)
    }

    public fun clusterSettings(vararg clusterSettings: Any) {
        _clusterSettings.addAll(listOf(*clusterSettings))
    }

    public fun clusterSettings(clusterSettings: Collection<Any>) {
        _clusterSettings.addAll(clusterSettings)
    }

    public fun clusterSettings(clusterSettings: IResolvable) {
        cdkBuilder.clusterSettings(clusterSettings)
    }

    public fun configuration(configuration: IResolvable) {
        cdkBuilder.configuration(configuration)
    }

    public fun configuration(configuration: CfnCluster.ClusterConfigurationProperty) {
        cdkBuilder.configuration(configuration)
    }

    public fun defaultCapacityProviderStrategy(vararg defaultCapacityProviderStrategy: Any) {
        _defaultCapacityProviderStrategy.addAll(listOf(*defaultCapacityProviderStrategy))
    }

    public fun defaultCapacityProviderStrategy(defaultCapacityProviderStrategy: Collection<Any>) {
        _defaultCapacityProviderStrategy.addAll(defaultCapacityProviderStrategy)
    }

    public fun defaultCapacityProviderStrategy(defaultCapacityProviderStrategy: IResolvable) {
        cdkBuilder.defaultCapacityProviderStrategy(defaultCapacityProviderStrategy)
    }

    public fun serviceConnectDefaults(serviceConnectDefaults: IResolvable) {
        cdkBuilder.serviceConnectDefaults(serviceConnectDefaults)
    }

    public fun serviceConnectDefaults(serviceConnectDefaults: CfnCluster.ServiceConnectDefaultsProperty) {
        cdkBuilder.serviceConnectDefaults(serviceConnectDefaults)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnCluster {
        if (_capacityProviders.isNotEmpty()) cdkBuilder.capacityProviders(_capacityProviders)
        if (_clusterSettings.isNotEmpty()) cdkBuilder.clusterSettings(_clusterSettings)
        if (_defaultCapacityProviderStrategy.isNotEmpty()) {
            cdkBuilder.defaultCapacityProviderStrategy(_defaultCapacityProviderStrategy)
        }
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
