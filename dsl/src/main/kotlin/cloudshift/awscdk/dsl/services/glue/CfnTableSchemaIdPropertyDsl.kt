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
import kotlin.String
import software.amazon.awscdk.services.glue.CfnTable

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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-schemaid.html)
 */
@CdkDslMarker
public class CfnTableSchemaIdPropertyDsl {
    private val cdkBuilder: CfnTable.SchemaIdProperty.Builder = CfnTable.SchemaIdProperty.builder()

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

    public fun build(): CfnTable.SchemaIdProperty = cdkBuilder.build()
}
