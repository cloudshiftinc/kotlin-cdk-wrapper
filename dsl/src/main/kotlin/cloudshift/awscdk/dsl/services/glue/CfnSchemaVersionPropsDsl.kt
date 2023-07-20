@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnSchemaVersion
import software.amazon.awscdk.services.glue.CfnSchemaVersionProps
import kotlin.String

@CdkDslMarker
public class CfnSchemaVersionPropsDsl {
    private val cdkBuilder: CfnSchemaVersionProps.Builder = CfnSchemaVersionProps.builder()

    public fun schema(schema: IResolvable) {
        cdkBuilder.schema(schema)
    }

    public fun schema(schema: CfnSchemaVersion.SchemaProperty) {
        cdkBuilder.schema(schema)
    }

    public fun schemaDefinition(schemaDefinition: String) {
        cdkBuilder.schemaDefinition(schemaDefinition)
    }

    public fun build(): CfnSchemaVersionProps = cdkBuilder.build()
}
