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
import software.amazon.awscdk.services.glue.CfnSchemaVersionMetadataProps

/**
 * Properties for defining a `CfnSchemaVersionMetadata`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * CfnSchemaVersionMetadataProps cfnSchemaVersionMetadataProps =
 * CfnSchemaVersionMetadataProps.builder()
 * .key("key")
 * .schemaVersionId("schemaVersionId")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-schemaversionmetadata.html)
 */
@CdkDslMarker
public class CfnSchemaVersionMetadataPropsDsl {
    private val cdkBuilder: CfnSchemaVersionMetadataProps.Builder =
        CfnSchemaVersionMetadataProps.builder()

    /** @param key A metadata key in a key-value pair for metadata. */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /** @param schemaVersionId The version number of the schema. */
    public fun schemaVersionId(schemaVersionId: String) {
        cdkBuilder.schemaVersionId(schemaVersionId)
    }

    /** @param value A metadata key's corresponding value. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnSchemaVersionMetadataProps = cdkBuilder.build()
}
