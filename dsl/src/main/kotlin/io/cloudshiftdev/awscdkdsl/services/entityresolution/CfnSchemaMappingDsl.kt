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
import software.amazon.awscdk.services.entityresolution.CfnSchemaMapping
import software.constructs.Construct

/**
 * Creates a schema mapping, which defines the schema of the input customer records table.
 *
 * The `SchemaMapping` also provides AWS Entity Resolution with some metadata about the table, such
 * as the attribute types of the columns and which columns to match on.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.entityresolution.*;
 * CfnSchemaMapping cfnSchemaMapping = CfnSchemaMapping.Builder.create(this, "MyCfnSchemaMapping")
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
public class CfnSchemaMappingDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnSchemaMapping.Builder = CfnSchemaMapping.Builder.create(scope, id)

    private val _mappedInputFields: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * A description of the schema.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-schemamapping.html#cfn-entityresolution-schemamapping-description)
     *
     * @param description A description of the schema.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * A list of `MappedInputFields` .
     *
     * Each `MappedInputField` corresponds to a column the source data table, and contains column
     * name plus additional information that AWS Entity Resolution uses for matching.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-schemamapping.html#cfn-entityresolution-schemamapping-mappedinputfields)
     *
     * @param mappedInputFields A list of `MappedInputFields` .
     */
    public fun mappedInputFields(vararg mappedInputFields: Any) {
        _mappedInputFields.addAll(listOf(*mappedInputFields))
    }

    /**
     * A list of `MappedInputFields` .
     *
     * Each `MappedInputField` corresponds to a column the source data table, and contains column
     * name plus additional information that AWS Entity Resolution uses for matching.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-schemamapping.html#cfn-entityresolution-schemamapping-mappedinputfields)
     *
     * @param mappedInputFields A list of `MappedInputFields` .
     */
    public fun mappedInputFields(mappedInputFields: Collection<Any>) {
        _mappedInputFields.addAll(mappedInputFields)
    }

    /**
     * A list of `MappedInputFields` .
     *
     * Each `MappedInputField` corresponds to a column the source data table, and contains column
     * name plus additional information that AWS Entity Resolution uses for matching.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-schemamapping.html#cfn-entityresolution-schemamapping-mappedinputfields)
     *
     * @param mappedInputFields A list of `MappedInputFields` .
     */
    public fun mappedInputFields(mappedInputFields: IResolvable) {
        cdkBuilder.mappedInputFields(mappedInputFields)
    }

    /**
     * The name of the schema.
     *
     * There can't be multiple `SchemaMappings` with the same name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-schemamapping.html#cfn-entityresolution-schemamapping-schemaname)
     *
     * @param schemaName The name of the schema.
     */
    public fun schemaName(schemaName: String) {
        cdkBuilder.schemaName(schemaName)
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-schemamapping.html#cfn-entityresolution-schemamapping-tags)
     *
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-schemamapping.html#cfn-entityresolution-schemamapping-tags)
     *
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnSchemaMapping {
        if (_mappedInputFields.isNotEmpty()) cdkBuilder.mappedInputFields(_mappedInputFields)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
