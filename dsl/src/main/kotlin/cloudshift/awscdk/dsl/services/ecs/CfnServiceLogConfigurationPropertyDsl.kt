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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnServiceLogConfigurationPropertyDsl {
    private val cdkBuilder: CfnService.LogConfigurationProperty.Builder =
        CfnService.LogConfigurationProperty.builder()

    private val _secretOptions: MutableList<Any> = mutableListOf()

    public fun logDriver(logDriver: String) {
        cdkBuilder.logDriver(logDriver)
    }

    public fun options(options: Map<String, String>) {
        cdkBuilder.options(options)
    }

    public fun options(options: IResolvable) {
        cdkBuilder.options(options)
    }

    public fun secretOptions(vararg secretOptions: Any) {
        _secretOptions.addAll(listOf(*secretOptions))
    }

    public fun secretOptions(secretOptions: Collection<Any>) {
        _secretOptions.addAll(secretOptions)
    }

    public fun secretOptions(secretOptions: IResolvable) {
        cdkBuilder.secretOptions(secretOptions)
    }

    public fun build(): CfnService.LogConfigurationProperty {
        if (_secretOptions.isNotEmpty()) cdkBuilder.secretOptions(_secretOptions)
        return cdkBuilder.build()
    }
}
