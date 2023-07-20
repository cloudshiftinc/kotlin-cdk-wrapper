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

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnLoggingConfigurationLoggingFilterPropertyDsl {
    private val cdkBuilder: CfnLoggingConfiguration.LoggingFilterProperty.Builder =
        CfnLoggingConfiguration.LoggingFilterProperty.builder()

    private val _filters: MutableList<Any> = mutableListOf()

    public fun defaultBehavior(defaultBehavior: String) {
        cdkBuilder.defaultBehavior(defaultBehavior)
    }

    public fun filters(vararg filters: Any) {
        _filters.addAll(listOf(*filters))
    }

    public fun filters(filters: Collection<Any>) {
        _filters.addAll(filters)
    }

    public fun filters(filters: IResolvable) {
        cdkBuilder.filters(filters)
    }

    public fun build(): CfnLoggingConfiguration.LoggingFilterProperty {
        if (_filters.isNotEmpty()) cdkBuilder.filters(_filters)
        return cdkBuilder.build()
    }
}
