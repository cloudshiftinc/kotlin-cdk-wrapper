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
import software.amazon.awscdk.services.ecs.CfnService
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnServiceServiceConnectConfigurationPropertyDsl {
    private val cdkBuilder: CfnService.ServiceConnectConfigurationProperty.Builder =
        CfnService.ServiceConnectConfigurationProperty.builder()

    private val _services: MutableList<Any> = mutableListOf()

    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    public fun logConfiguration(logConfiguration: IResolvable) {
        cdkBuilder.logConfiguration(logConfiguration)
    }

    public fun logConfiguration(logConfiguration: CfnService.LogConfigurationProperty) {
        cdkBuilder.logConfiguration(logConfiguration)
    }

    public fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
    }

    public fun services(vararg services: Any) {
        _services.addAll(listOf(*services))
    }

    public fun services(services: Collection<Any>) {
        _services.addAll(services)
    }

    public fun services(services: IResolvable) {
        cdkBuilder.services(services)
    }

    public fun build(): CfnService.ServiceConnectConfigurationProperty {
        if (_services.isNotEmpty()) cdkBuilder.services(_services)
        return cdkBuilder.build()
    }
}
