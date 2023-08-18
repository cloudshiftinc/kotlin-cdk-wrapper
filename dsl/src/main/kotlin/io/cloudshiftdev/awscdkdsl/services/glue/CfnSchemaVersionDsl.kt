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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnSchemaVersion
import software.constructs.Construct

/**
 * The `AWS::Glue::SchemaVersion` is an AWS Glue resource type that manages schema versions of
 * schemas in the AWS Glue Schema Registry.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * CfnSchemaVersion cfnSchemaVersion = CfnSchemaVersion.Builder.create(this, "MyCfnSchemaVersion")
 * .schema(SchemaProperty.builder()
 * .registryName("registryName")
 * .schemaArn("schemaArn")
 * .schemaName("schemaName")
 * .build())
 * .schemaDefinition("schemaDefinition")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schemaversion.html)
 */
@CdkDslMarker
public class CfnSchemaVersionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnSchemaVersion.Builder = CfnSchemaVersion.Builder.create(scope, id)

    /**
     * The schema that includes the schema version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schemaversion.html#cfn-glue-schemaversion-schema)
     *
     * @param schema The schema that includes the schema version.
     */
    public fun schema(schema: IResolvable) {
        cdkBuilder.schema(schema)
    }

    /**
     * The schema that includes the schema version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schemaversion.html#cfn-glue-schemaversion-schema)
     *
     * @param schema The schema that includes the schema version.
     */
    public fun schema(schema: CfnSchemaVersion.SchemaProperty) {
        cdkBuilder.schema(schema)
    }

    /**
     * The schema definition for the schema version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schemaversion.html#cfn-glue-schemaversion-schemadefinition)
     *
     * @param schemaDefinition The schema definition for the schema version.
     */
    public fun schemaDefinition(schemaDefinition: String) {
        cdkBuilder.schemaDefinition(schemaDefinition)
    }

    public fun build(): CfnSchemaVersion = cdkBuilder.build()
}
