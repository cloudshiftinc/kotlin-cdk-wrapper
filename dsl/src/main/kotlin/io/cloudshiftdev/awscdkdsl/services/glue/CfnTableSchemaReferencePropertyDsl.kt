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
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnTable

/**
 * An object that references a schema stored in the AWS Glue Schema Registry.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * SchemaReferenceProperty schemaReferenceProperty = SchemaReferenceProperty.builder()
 * .schemaId(SchemaIdProperty.builder()
 * .registryName("registryName")
 * .schemaArn("schemaArn")
 * .schemaName("schemaName")
 * .build())
 * .schemaVersionId("schemaVersionId")
 * .schemaVersionNumber(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-schemareference.html)
 */
@CdkDslMarker
public class CfnTableSchemaReferencePropertyDsl {
    private val cdkBuilder: CfnTable.SchemaReferenceProperty.Builder =
        CfnTable.SchemaReferenceProperty.builder()

    /**
     * @param schemaId A structure that contains schema identity fields. Either this or the
     *   `SchemaVersionId` has to be provided.
     */
    public fun schemaId(schemaId: IResolvable) {
        cdkBuilder.schemaId(schemaId)
    }

    /**
     * @param schemaId A structure that contains schema identity fields. Either this or the
     *   `SchemaVersionId` has to be provided.
     */
    public fun schemaId(schemaId: CfnTable.SchemaIdProperty) {
        cdkBuilder.schemaId(schemaId)
    }

    /**
     * @param schemaVersionId The unique ID assigned to a version of the schema. Either this or the
     *   `SchemaId` has to be provided.
     */
    public fun schemaVersionId(schemaVersionId: String) {
        cdkBuilder.schemaVersionId(schemaVersionId)
    }

    /** @param schemaVersionNumber The version number of the schema. */
    public fun schemaVersionNumber(schemaVersionNumber: Number) {
        cdkBuilder.schemaVersionNumber(schemaVersionNumber)
    }

    public fun build(): CfnTable.SchemaReferenceProperty = cdkBuilder.build()
}
