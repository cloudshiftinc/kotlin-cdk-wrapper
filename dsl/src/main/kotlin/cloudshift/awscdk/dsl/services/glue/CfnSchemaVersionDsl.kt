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
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnSchemaVersionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnSchemaVersion.Builder = CfnSchemaVersion.Builder.create(scope, id)

    public fun schema(schema: IResolvable) {
        cdkBuilder.schema(schema)
    }

    public fun schema(schema: CfnSchemaVersion.SchemaProperty) {
        cdkBuilder.schema(schema)
    }

    public fun schemaDefinition(schemaDefinition: String) {
        cdkBuilder.schemaDefinition(schemaDefinition)
    }

    public fun build(): CfnSchemaVersion = cdkBuilder.build()
}
