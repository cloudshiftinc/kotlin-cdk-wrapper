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
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnRule

/**
 * The field of the case.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * Object emptyValue;
 * FieldProperty fieldProperty = FieldProperty.builder()
 * .id("id")
 * .value(FieldValueProperty.builder()
 * .booleanValue(false)
 * .doubleValue(123)
 * .emptyValue(emptyValue)
 * .stringValue("stringValue")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-field.html)
 */
@CdkDslMarker
public class CfnRuleFieldPropertyDsl {
    private val cdkBuilder: CfnRule.FieldProperty.Builder = CfnRule.FieldProperty.builder()

    /** @param id The Id of the field. */
    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    /** @param value The value of the field. */
    public fun `value`(`value`: IResolvable) {
        cdkBuilder.`value`(`value`)
    }

    /** @param value The value of the field. */
    public fun `value`(`value`: CfnRule.FieldValueProperty) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnRule.FieldProperty = cdkBuilder.build()
}
