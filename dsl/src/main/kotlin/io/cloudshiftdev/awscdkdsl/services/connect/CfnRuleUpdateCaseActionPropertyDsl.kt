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
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnRule

/**
 * The definition for update case action.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * Object emptyValue;
 * UpdateCaseActionProperty updateCaseActionProperty = UpdateCaseActionProperty.builder()
 * .fields(List.of(FieldProperty.builder()
 * .id("id")
 * .value(FieldValueProperty.builder()
 * .booleanValue(false)
 * .doubleValue(123)
 * .emptyValue(emptyValue)
 * .stringValue("stringValue")
 * .build())
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-updatecaseaction.html)
 */
@CdkDslMarker
public class CfnRuleUpdateCaseActionPropertyDsl {
    private val cdkBuilder: CfnRule.UpdateCaseActionProperty.Builder =
        CfnRule.UpdateCaseActionProperty.builder()

    private val _fields: MutableList<Any> = mutableListOf()

    /** @param fields An array of case fields. */
    public fun fields(vararg fields: Any) {
        _fields.addAll(listOf(*fields))
    }

    /** @param fields An array of case fields. */
    public fun fields(fields: Collection<Any>) {
        _fields.addAll(fields)
    }

    /** @param fields An array of case fields. */
    public fun fields(fields: IResolvable) {
        cdkBuilder.fields(fields)
    }

    public fun build(): CfnRule.UpdateCaseActionProperty {
        if (_fields.isNotEmpty()) cdkBuilder.fields(_fields)
        return cdkBuilder.build()
    }
}
