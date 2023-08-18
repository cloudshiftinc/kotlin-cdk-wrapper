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

package io.cloudshiftdev.awscdkdsl.services.dynamodb

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.dynamodb.CfnGlobalTable

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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-attributedefinition.html)
 */
@CdkDslMarker
public class CfnGlobalTableAttributeDefinitionPropertyDsl {
    private val cdkBuilder: CfnGlobalTable.AttributeDefinitionProperty.Builder =
        CfnGlobalTable.AttributeDefinitionProperty.builder()

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

    public fun build(): CfnGlobalTable.AttributeDefinitionProperty = cdkBuilder.build()
}
