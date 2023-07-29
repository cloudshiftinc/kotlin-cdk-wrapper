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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnSchemaVersion
import software.amazon.awscdk.services.glue.CfnSchemaVersionProps

/**
 * Properties for defining a `CfnSchemaVersion`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * CfnSchemaVersionProps cfnSchemaVersionProps = CfnSchemaVersionProps.builder()
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
public class CfnSchemaVersionPropsDsl {
    private val cdkBuilder: CfnSchemaVersionProps.Builder = CfnSchemaVersionProps.builder()

    /** @param schema The schema that includes the schema version. */
    public fun schema(schema: IResolvable) {
        cdkBuilder.schema(schema)
    }

    /** @param schema The schema that includes the schema version. */
    public fun schema(schema: CfnSchemaVersion.SchemaProperty) {
        cdkBuilder.schema(schema)
    }

    /** @param schemaDefinition The schema definition for the schema version. */
    public fun schemaDefinition(schemaDefinition: String) {
        cdkBuilder.schemaDefinition(schemaDefinition)
    }

    public fun build(): CfnSchemaVersionProps = cdkBuilder.build()
}
