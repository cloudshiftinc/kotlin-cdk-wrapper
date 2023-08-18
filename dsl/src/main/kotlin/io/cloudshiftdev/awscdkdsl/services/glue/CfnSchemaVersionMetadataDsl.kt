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

package io.cloudshiftdev.awscdkdsl.services.glue

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.glue.CfnSchemaVersionMetadata
import software.constructs.Construct

/**
 * The `AWS::Glue::SchemaVersionMetadata` is an AWS Glue resource type that defines the metadata
 * key-value pairs for a schema version in AWS Glue Schema Registry.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * CfnSchemaVersionMetadata cfnSchemaVersionMetadata = CfnSchemaVersionMetadata.Builder.create(this,
 * "MyCfnSchemaVersionMetadata")
 * .key("key")
 * .schemaVersionId("schemaVersionId")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schemaversionmetadata.html)
 */
@CdkDslMarker
public class CfnSchemaVersionMetadataDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnSchemaVersionMetadata.Builder =
        CfnSchemaVersionMetadata.Builder.create(scope, id)

    /**
     * A metadata key in a key-value pair for metadata.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schemaversionmetadata.html#cfn-glue-schemaversionmetadata-key)
     *
     * @param key A metadata key in a key-value pair for metadata.
     */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /**
     * The version number of the schema.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schemaversionmetadata.html#cfn-glue-schemaversionmetadata-schemaversionid)
     *
     * @param schemaVersionId The version number of the schema.
     */
    public fun schemaVersionId(schemaVersionId: String) {
        cdkBuilder.schemaVersionId(schemaVersionId)
    }

    /**
     * A metadata key's corresponding value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schemaversionmetadata.html#cfn-glue-schemaversionmetadata-value)
     *
     * @param value A metadata key's corresponding value.
     */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnSchemaVersionMetadata = cdkBuilder.build()
}
