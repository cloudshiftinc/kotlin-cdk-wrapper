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

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.entityresolution.CfnSchemaMappingProps

/**
 * Properties for defining a `CfnSchemaMapping`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.entityresolution.*;
 * CfnSchemaMappingProps cfnSchemaMappingProps = CfnSchemaMappingProps.builder()
 * .mappedInputFields(List.of(SchemaInputAttributeProperty.builder()
 * .fieldName("fieldName")
 * .type("type")
 * // the properties below are optional
 * .groupName("groupName")
 * .matchKey("matchKey")
 * .subType("subType")
 * .build()))
 * .schemaName("schemaName")
 * // the properties below are optional
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-schemamapping.html)
 */
@CdkDslMarker
public class CfnSchemaMappingPropsDsl {
    private val cdkBuilder: CfnSchemaMappingProps.Builder = CfnSchemaMappingProps.builder()

    private val _mappedInputFields: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param description A description of the schema. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param mappedInputFields A list of `MappedInputFields` . Each `MappedInputField` corresponds
     *   to a column the source data table, and contains column name plus additional information
     *   that AWS Entity Resolution uses for matching.
     */
    public fun mappedInputFields(vararg mappedInputFields: Any) {
        _mappedInputFields.addAll(listOf(*mappedInputFields))
    }

    /**
     * @param mappedInputFields A list of `MappedInputFields` . Each `MappedInputField` corresponds
     *   to a column the source data table, and contains column name plus additional information
     *   that AWS Entity Resolution uses for matching.
     */
    public fun mappedInputFields(mappedInputFields: Collection<Any>) {
        _mappedInputFields.addAll(mappedInputFields)
    }

    /**
     * @param mappedInputFields A list of `MappedInputFields` . Each `MappedInputField` corresponds
     *   to a column the source data table, and contains column name plus additional information
     *   that AWS Entity Resolution uses for matching.
     */
    public fun mappedInputFields(mappedInputFields: IResolvable) {
        cdkBuilder.mappedInputFields(mappedInputFields)
    }

    /**
     * @param schemaName The name of the schema. There can't be multiple `SchemaMappings` with the
     *   same name.
     */
    public fun schemaName(schemaName: String) {
        cdkBuilder.schemaName(schemaName)
    }

    /** @param tags The tags used to organize, track, or control access for this resource. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags used to organize, track, or control access for this resource. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnSchemaMappingProps {
        if (_mappedInputFields.isNotEmpty()) cdkBuilder.mappedInputFields(_mappedInputFields)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
