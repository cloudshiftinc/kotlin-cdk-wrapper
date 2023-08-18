@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.CfnHookProps

/**
 * Construction properties of `CfnHook`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * Object properties;
 * CfnHookProps cfnHookProps = CfnHookProps.builder()
 * .type("type")
 * // the properties below are optional
 * .properties(Map.of(
 * "propertiesKey", properties))
 * .build();
 * ```
 */
@CdkDslMarker
public class CfnHookPropsDsl {
    private val cdkBuilder: CfnHookProps.Builder = CfnHookProps.builder()

    /** @param properties The properties of the hook. */
    public fun properties(properties: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(properties)
        cdkBuilder.properties(builder.map)
    }

    /** @param properties The properties of the hook. */
    public fun properties(properties: Map<String, Any>) {
        cdkBuilder.properties(properties)
    }

    /** @param type The type of the hook (for example, "AWS::CodeDeploy::BlueGreen"). */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnHookProps = cdkBuilder.build()
}
