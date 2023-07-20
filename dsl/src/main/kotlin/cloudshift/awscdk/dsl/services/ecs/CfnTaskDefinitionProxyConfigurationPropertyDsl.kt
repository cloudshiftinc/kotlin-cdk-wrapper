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
import software.amazon.awscdk.services.ecs.CfnTaskDefinition
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnTaskDefinitionProxyConfigurationPropertyDsl {
    private val cdkBuilder: CfnTaskDefinition.ProxyConfigurationProperty.Builder =
        CfnTaskDefinition.ProxyConfigurationProperty.builder()

    private val _proxyConfigurationProperties: MutableList<Any> = mutableListOf()

    public fun containerName(containerName: String) {
        cdkBuilder.containerName(containerName)
    }

    public fun proxyConfigurationProperties(vararg proxyConfigurationProperties: Any) {
        _proxyConfigurationProperties.addAll(listOf(*proxyConfigurationProperties))
    }

    public fun proxyConfigurationProperties(proxyConfigurationProperties: Collection<Any>) {
        _proxyConfigurationProperties.addAll(proxyConfigurationProperties)
    }

    public fun proxyConfigurationProperties(proxyConfigurationProperties: IResolvable) {
        cdkBuilder.proxyConfigurationProperties(proxyConfigurationProperties)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnTaskDefinition.ProxyConfigurationProperty {
        if (_proxyConfigurationProperties.isNotEmpty()) {
            cdkBuilder.proxyConfigurationProperties(_proxyConfigurationProperties)
        }
        return cdkBuilder.build()
    }
}
