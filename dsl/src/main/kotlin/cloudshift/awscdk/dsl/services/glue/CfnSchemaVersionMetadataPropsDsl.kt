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
import software.amazon.awscdk.services.glue.CfnSchemaVersionMetadataProps
import kotlin.String

@CdkDslMarker
public class CfnSchemaVersionMetadataPropsDsl {
    private val cdkBuilder: CfnSchemaVersionMetadataProps.Builder =
        CfnSchemaVersionMetadataProps.builder()

    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    public fun schemaVersionId(schemaVersionId: String) {
        cdkBuilder.schemaVersionId(schemaVersionId)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnSchemaVersionMetadataProps = cdkBuilder.build()
}
