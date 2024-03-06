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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnRule

/**
 * The definition for create case action.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * Object emptyValue;
 * CreateCaseActionProperty createCaseActionProperty = CreateCaseActionProperty.builder()
 * .fields(List.of(FieldProperty.builder()
 * .id("id")
 * .value(FieldValueProperty.builder()
 * .booleanValue(false)
 * .doubleValue(123)
 * .emptyValue(emptyValue)
 * .stringValue("stringValue")
 * .build())
 * .build()))
 * .templateId("templateId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-createcaseaction.html)
 */
@CdkDslMarker
public class CfnRuleCreateCaseActionPropertyDsl {
    private val cdkBuilder: CfnRule.CreateCaseActionProperty.Builder =
        CfnRule.CreateCaseActionProperty.builder()

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

    /** @param templateId The Id of template. */
    public fun templateId(templateId: String) {
        cdkBuilder.templateId(templateId)
    }

    public fun build(): CfnRule.CreateCaseActionProperty {
        if (_fields.isNotEmpty()) cdkBuilder.fields(_fields)
        return cdkBuilder.build()
    }
}
