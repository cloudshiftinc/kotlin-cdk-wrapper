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
import software.amazon.awscdk.services.controltower.CfnEnabledControl

/**
 * A set of parameters that configure the behavior of the enabled control.
 *
 * Expressed as a key/value pair, where `Key` is of type `String` and `Value` is of type `Document`
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.controltower.*;
 * Object value;
 * EnabledControlParameterProperty enabledControlParameterProperty =
 * EnabledControlParameterProperty.builder()
 * .key("key")
 * .value(value)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-controltower-enabledcontrol-enabledcontrolparameter.html)
 */
@CdkDslMarker
public class CfnEnabledControlEnabledControlParameterPropertyDsl {
    private val cdkBuilder: CfnEnabledControl.EnabledControlParameterProperty.Builder =
        CfnEnabledControl.EnabledControlParameterProperty.builder()

    /** @param key The key of a key/value pair. It is of type `string` . */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /**
     * @param value The value of a key/value pair. It can be of type `array` , `string` , `number` ,
     *   `object` , or `boolean` .
     *   [Note: The *Type* field that follows may show a single type such as Number, which is only one possible type.]
     */
    public fun `value`(`value`: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(`value`)
        cdkBuilder.`value`(builder.map)
    }

    /**
     * @param value The value of a key/value pair. It can be of type `array` , `string` , `number` ,
     *   `object` , or `boolean` .
     *   [Note: The *Type* field that follows may show a single type such as Number, which is only one possible type.]
     */
    public fun `value`(`value`: Any) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnEnabledControl.EnabledControlParameterProperty = cdkBuilder.build()
}
