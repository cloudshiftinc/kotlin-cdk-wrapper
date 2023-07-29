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

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnSchema
import software.amazon.awscdk.services.glue.CfnSchemaProps

/**
 * Properties for defining a `CfnSchema`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * CfnSchemaProps cfnSchemaProps = CfnSchemaProps.builder()
 * .compatibility("compatibility")
 * .dataFormat("dataFormat")
 * .name("name")
 * .schemaDefinition("schemaDefinition")
 * // the properties below are optional
 * .checkpointVersion(SchemaVersionProperty.builder()
 * .isLatest(false)
 * .versionNumber(123)
 * .build())
 * .description("description")
 * .registry(RegistryProperty.builder()
 * .arn("arn")
 * .name("name")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schema.html)
 */
@CdkDslMarker
public class CfnSchemaPropsDsl {
    private val cdkBuilder: CfnSchemaProps.Builder = CfnSchemaProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param checkpointVersion Specify the `VersionNumber` or the `IsLatest` for setting the
     *   checkpoint for the schema. This is only required for updating a checkpoint.
     */
    public fun checkpointVersion(checkpointVersion: IResolvable) {
        cdkBuilder.checkpointVersion(checkpointVersion)
    }

    /**
     * @param checkpointVersion Specify the `VersionNumber` or the `IsLatest` for setting the
     *   checkpoint for the schema. This is only required for updating a checkpoint.
     */
    public fun checkpointVersion(checkpointVersion: CfnSchema.SchemaVersionProperty) {
        cdkBuilder.checkpointVersion(checkpointVersion)
    }

    /** @param compatibility The compatibility mode of the schema. */
    public fun compatibility(compatibility: String) {
        cdkBuilder.compatibility(compatibility)
    }

    /**
     * @param dataFormat The data format of the schema definition. Currently only `AVRO` is
     *   supported.
     */
    public fun dataFormat(dataFormat: String) {
        cdkBuilder.dataFormat(dataFormat)
    }

    /** @param description A description of the schema if specified when created. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param name Name of the schema to be created of max length of 255, and may only contain
     *   letters, numbers, hyphen, underscore, dollar sign, or hash mark. No whitespace.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param registry The registry where a schema is stored. */
    public fun registry(registry: IResolvable) {
        cdkBuilder.registry(registry)
    }

    /** @param registry The registry where a schema is stored. */
    public fun registry(registry: CfnSchema.RegistryProperty) {
        cdkBuilder.registry(registry)
    }

    /**
     * @param schemaDefinition The schema definition using the `DataFormat` setting for `SchemaName`
     *   .
     */
    public fun schemaDefinition(schemaDefinition: String) {
        cdkBuilder.schemaDefinition(schemaDefinition)
    }

    /**
     * @param tags AWS tags that contain a key value pair and may be searched by console, command
     *   line, or API.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags AWS tags that contain a key value pair and may be searched by console, command
     *   line, or API.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnSchemaProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
