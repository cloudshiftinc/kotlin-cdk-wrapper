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

package io.cloudshiftdev.awscdkdsl.services.eventschemas

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.eventschemas.CfnSchema
import software.constructs.Construct

/**
 * Use the `AWS::EventSchemas::Schema` resource to specify an event schema.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.eventschemas.*;
 * CfnSchema cfnSchema = CfnSchema.Builder.create(this, "MyCfnSchema")
 * .content("content")
 * .registryName("registryName")
 * .type("type")
 * // the properties below are optional
 * .description("description")
 * .schemaName("schemaName")
 * .tags(List.of(TagsEntryProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-schema.html)
 */
@CdkDslMarker
public class CfnSchemaDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnSchema.Builder = CfnSchema.Builder.create(scope, id)

    private val _tags: MutableList<CfnSchema.TagsEntryProperty> = mutableListOf()

    /**
     * The source of the schema definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-schema.html#cfn-eventschemas-schema-content)
     *
     * @param content The source of the schema definition.
     */
    public fun content(content: String) {
        cdkBuilder.content(content)
    }

    /**
     * A description of the schema.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-schema.html#cfn-eventschemas-schema-description)
     *
     * @param description A description of the schema.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The name of the schema registry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-schema.html#cfn-eventschemas-schema-registryname)
     *
     * @param registryName The name of the schema registry.
     */
    public fun registryName(registryName: String) {
        cdkBuilder.registryName(registryName)
    }

    /**
     * The name of the schema.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-schema.html#cfn-eventschemas-schema-schemaname)
     *
     * @param schemaName The name of the schema.
     */
    public fun schemaName(schemaName: String) {
        cdkBuilder.schemaName(schemaName)
    }

    /**
     * Tags associated with the schema.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-schema.html#cfn-eventschemas-schema-tags)
     *
     * @param tags Tags associated with the schema.
     */
    public fun tags(tags: CfnSchemaTagsEntryPropertyDsl.() -> Unit) {
        _tags.add(CfnSchemaTagsEntryPropertyDsl().apply(tags).build())
    }

    /**
     * Tags associated with the schema.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-schema.html#cfn-eventschemas-schema-tags)
     *
     * @param tags Tags associated with the schema.
     */
    public fun tags(tags: Collection<CfnSchema.TagsEntryProperty>) {
        _tags.addAll(tags)
    }

    /**
     * The type of schema.
     *
     * Valid types include `OpenApi3` and `JSONSchemaDraft4` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-schema.html#cfn-eventschemas-schema-type)
     *
     * @param type The type of schema.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnSchema {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
