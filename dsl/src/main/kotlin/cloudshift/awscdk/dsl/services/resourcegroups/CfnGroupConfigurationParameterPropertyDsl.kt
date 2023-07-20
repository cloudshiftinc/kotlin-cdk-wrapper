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

package cloudshift.awscdk.dsl.services.resourcegroups

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.resourcegroups.CfnGroup
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnGroupConfigurationParameterPropertyDsl {
    private val cdkBuilder: CfnGroup.ConfigurationParameterProperty.Builder =
        CfnGroup.ConfigurationParameterProperty.builder()

    private val _values: MutableList<String> = mutableListOf()

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun values(vararg values: String) {
        _values.addAll(listOf(*values))
    }

    public fun values(values: Collection<String>) {
        _values.addAll(values)
    }

    public fun build(): CfnGroup.ConfigurationParameterProperty {
        if (_values.isNotEmpty()) cdkBuilder.values(_values)
        return cdkBuilder.build()
    }
}
