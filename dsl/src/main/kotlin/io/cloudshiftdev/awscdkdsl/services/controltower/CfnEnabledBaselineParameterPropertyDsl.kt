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

package io.cloudshiftdev.awscdkdsl.services.controltower

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.controltower.CfnEnabledBaseline

/**
 * A key-value parameter to an `EnabledBaseline` resource.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.controltower.*;
 * Object value;
 * ParameterProperty parameterProperty = ParameterProperty.builder()
 * .key("key")
 * .value(value)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-controltower-enabledbaseline-parameter.html)
 */
@CdkDslMarker
public class CfnEnabledBaselineParameterPropertyDsl {
    private val cdkBuilder: CfnEnabledBaseline.ParameterProperty.Builder =
        CfnEnabledBaseline.ParameterProperty.builder()

    /** @param key A string denoting the parameter key. */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /** @param value A low-level `Document` object of any type (for example, a Java Object). */
    public fun `value`(`value`: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(`value`)
        cdkBuilder.`value`(builder.map)
    }

    /** @param value A low-level `Document` object of any type (for example, a Java Object). */
    public fun `value`(`value`: Any) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnEnabledBaseline.ParameterProperty = cdkBuilder.build()
}
