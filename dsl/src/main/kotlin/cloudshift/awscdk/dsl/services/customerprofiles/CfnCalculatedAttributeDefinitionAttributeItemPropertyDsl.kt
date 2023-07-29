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

package cloudshift.awscdk.dsl.services.customerprofiles

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition

/**
 * The details of a single attribute item specified in the mathematical expression.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.customerprofiles.*;
 * AttributeItemProperty attributeItemProperty = AttributeItemProperty.builder()
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-calculatedattributedefinition-attributeitem.html)
 */
@CdkDslMarker
public class CfnCalculatedAttributeDefinitionAttributeItemPropertyDsl {
    private val cdkBuilder: CfnCalculatedAttributeDefinition.AttributeItemProperty.Builder =
        CfnCalculatedAttributeDefinition.AttributeItemProperty.builder()

    /** @param name The unique name of the calculated attribute. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnCalculatedAttributeDefinition.AttributeItemProperty = cdkBuilder.build()
}
