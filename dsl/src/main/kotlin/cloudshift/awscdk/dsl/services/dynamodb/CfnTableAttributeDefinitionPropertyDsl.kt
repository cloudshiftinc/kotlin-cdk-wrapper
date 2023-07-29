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

package cloudshift.awscdk.dsl.services.dynamodb

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.dynamodb.CfnTable

/**
 * Represents an attribute for describing the key schema for the table and indexes.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dynamodb.*;
 * AttributeDefinitionProperty attributeDefinitionProperty = AttributeDefinitionProperty.builder()
 * .attributeName("attributeName")
 * .attributeType("attributeType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-attributedefinition.html)
 */
@CdkDslMarker
public class CfnTableAttributeDefinitionPropertyDsl {
    private val cdkBuilder: CfnTable.AttributeDefinitionProperty.Builder =
        CfnTable.AttributeDefinitionProperty.builder()

    /** @param attributeName A name for the attribute. */
    public fun attributeName(attributeName: String) {
        cdkBuilder.attributeName(attributeName)
    }

    /**
     * @param attributeType The data type for the attribute, where:.
     * * `S` - the attribute is of type String
     * * `N` - the attribute is of type Number
     * * `B` - the attribute is of type Binary
     */
    public fun attributeType(attributeType: String) {
        cdkBuilder.attributeType(attributeType)
    }

    public fun build(): CfnTable.AttributeDefinitionProperty = cdkBuilder.build()
}
