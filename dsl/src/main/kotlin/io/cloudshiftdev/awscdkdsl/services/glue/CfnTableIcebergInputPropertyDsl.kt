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
import software.amazon.awscdk.services.glue.CfnTable

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * IcebergInputProperty icebergInputProperty = IcebergInputProperty.builder()
 * .metadataOperation("metadataOperation")
 * .version("version")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-iceberginput.html)
 */
@CdkDslMarker
public class CfnTableIcebergInputPropertyDsl {
    private val cdkBuilder: CfnTable.IcebergInputProperty.Builder =
        CfnTable.IcebergInputProperty.builder()

    /** @param metadataOperation the value to be set. */
    public fun metadataOperation(metadataOperation: String) {
        cdkBuilder.metadataOperation(metadataOperation)
    }

    /** @param version the value to be set. */
    public fun version(version: String) {
        cdkBuilder.version(version)
    }

    public fun build(): CfnTable.IcebergInputProperty = cdkBuilder.build()
}
