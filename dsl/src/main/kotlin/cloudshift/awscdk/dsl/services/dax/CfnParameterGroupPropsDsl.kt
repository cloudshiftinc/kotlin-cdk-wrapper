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

package cloudshift.awscdk.dsl.services.dax

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.services.dax.CfnParameterGroupProps
import kotlin.Any
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class CfnParameterGroupPropsDsl {
    private val cdkBuilder: CfnParameterGroupProps.Builder = CfnParameterGroupProps.builder()

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun parameterGroupName(parameterGroupName: String) {
        cdkBuilder.parameterGroupName(parameterGroupName)
    }

    public fun parameterNameValues(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.parameterNameValues(builder.map)
    }

    public fun parameterNameValues(parameterNameValues: Any) {
        cdkBuilder.parameterNameValues(parameterNameValues)
    }

    public fun build(): CfnParameterGroupProps = cdkBuilder.build()
}
