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
import software.amazon.awscdk.services.glue.CfnPartition

/**
 * A structure that contains schema identity fields.
 *
 * Either this or the `SchemaVersionId` has to be provided.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * SchemaIdProperty schemaIdProperty = SchemaIdProperty.builder()
 * .registryName("registryName")
 * .schemaArn("schemaArn")
 * .schemaName("schemaName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-schemaid.html)
 */
@CdkDslMarker
public class CfnPartitionSchemaIdPropertyDsl {
    private val cdkBuilder: CfnPartition.SchemaIdProperty.Builder =
        CfnPartition.SchemaIdProperty.builder()

    /** @param registryName The name of the schema registry that contains the schema. */
    public fun registryName(registryName: String) {
        cdkBuilder.registryName(registryName)
    }

    /**
     * @param schemaArn The Amazon Resource Name (ARN) of the schema. One of `SchemaArn` or
     *   `SchemaName` has to be provided.
     */
    public fun schemaArn(schemaArn: String) {
        cdkBuilder.schemaArn(schemaArn)
    }

    /**
     * @param schemaName The name of the schema. One of `SchemaArn` or `SchemaName` has to be
     *   provided.
     */
    public fun schemaName(schemaName: String) {
        cdkBuilder.schemaName(schemaName)
    }

    public fun build(): CfnPartition.SchemaIdProperty = cdkBuilder.build()
}
