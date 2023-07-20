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
import software.amazon.awscdk.services.glue.CfnPartition
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnPartitionSchemaReferencePropertyDsl {
    private val cdkBuilder: CfnPartition.SchemaReferenceProperty.Builder =
        CfnPartition.SchemaReferenceProperty.builder()

    public fun schemaId(schemaId: IResolvable) {
        cdkBuilder.schemaId(schemaId)
    }

    public fun schemaId(schemaId: CfnPartition.SchemaIdProperty) {
        cdkBuilder.schemaId(schemaId)
    }

    public fun schemaVersionId(schemaVersionId: String) {
        cdkBuilder.schemaVersionId(schemaVersionId)
    }

    public fun schemaVersionNumber(schemaVersionNumber: Number) {
        cdkBuilder.schemaVersionNumber(schemaVersionNumber)
    }

    public fun build(): CfnPartition.SchemaReferenceProperty = cdkBuilder.build()
}
