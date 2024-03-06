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

package io.cloudshiftdev.awscdkdsl.services.connect

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnRule

/**
 * Object for case field values.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * Object emptyValue;
 * FieldValueProperty fieldValueProperty = FieldValueProperty.builder()
 * .booleanValue(false)
 * .doubleValue(123)
 * .emptyValue(emptyValue)
 * .stringValue("stringValue")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-fieldvalue.html)
 */
@CdkDslMarker
public class CfnRuleFieldValuePropertyDsl {
    private val cdkBuilder: CfnRule.FieldValueProperty.Builder =
        CfnRule.FieldValueProperty.builder()

    /** @param booleanValue the value to be set. */
    public fun booleanValue(booleanValue: Boolean) {
        cdkBuilder.booleanValue(booleanValue)
    }

    /** @param booleanValue the value to be set. */
    public fun booleanValue(booleanValue: IResolvable) {
        cdkBuilder.booleanValue(booleanValue)
    }

    /** @param doubleValue the value to be set. */
    public fun doubleValue(doubleValue: Number) {
        cdkBuilder.doubleValue(doubleValue)
    }

    /** @param emptyValue the value to be set. */
    public fun emptyValue(emptyValue: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(emptyValue)
        cdkBuilder.emptyValue(builder.map)
    }

    /** @param emptyValue the value to be set. */
    public fun emptyValue(emptyValue: Any) {
        cdkBuilder.emptyValue(emptyValue)
    }

    /** @param stringValue the value to be set. */
    public fun stringValue(stringValue: String) {
        cdkBuilder.stringValue(stringValue)
    }

    public fun build(): CfnRule.FieldValueProperty = cdkBuilder.build()
}
