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

package io.cloudshiftdev.awscdkdsl.services.entityresolution

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.entityresolution.CfnSchemaMapping

/**
 * An object containing `FieldName` , `Type` , `GroupName` , and `MatchKey` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.entityresolution.*;
 * SchemaInputAttributeProperty schemaInputAttributeProperty =
 * SchemaInputAttributeProperty.builder()
 * .fieldName("fieldName")
 * .type("type")
 * // the properties below are optional
 * .groupName("groupName")
 * .matchKey("matchKey")
 * .subType("subType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-schemamapping-schemainputattribute.html)
 */
@CdkDslMarker
public class CfnSchemaMappingSchemaInputAttributePropertyDsl {
    private val cdkBuilder: CfnSchemaMapping.SchemaInputAttributeProperty.Builder =
        CfnSchemaMapping.SchemaInputAttributeProperty.builder()

    /** @param fieldName A string containing the field name. */
    public fun fieldName(fieldName: String) {
        cdkBuilder.fieldName(fieldName)
    }

    /**
     * @param groupName Instruct AWS Entity Resolution to combine several columns into a unified
     *   column with the identical attribute type. For example, when working with columns such as
     *   first_name, middle_name, and last_name, assigning them a common `GroupName` will prompt AWS
     *   Entity Resolution to concatenate them into a single value.
     */
    public fun groupName(groupName: String) {
        cdkBuilder.groupName(groupName)
    }

    /**
     * @param matchKey A key that allows grouping of multiple input attributes into a unified
     *   matching group. For example, let's consider a scenario where the source table contains
     *   various addresses, such as `business_address` and `shipping_address` . By assigning the
     *   `MatchKey` *Address* to both attributes, AWS Entity Resolution will match records across
     *   these fields to create a consolidated matching group. If no `MatchKey` is specified for a
     *   column, it won't be utilized for matching purposes but will still be included in the output
     *   table.
     */
    public fun matchKey(matchKey: String) {
        cdkBuilder.matchKey(matchKey)
    }

    /** @param subType The subtype of the attribute, selected from a list of values. */
    public fun subType(subType: String) {
        cdkBuilder.subType(subType)
    }

    /** @param type The type of the attribute, selected from a list of values. */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnSchemaMapping.SchemaInputAttributeProperty = cdkBuilder.build()
}
