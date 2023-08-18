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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnTable

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * OpenTableFormatInputProperty openTableFormatInputProperty =
 * OpenTableFormatInputProperty.builder()
 * .icebergInput(IcebergInputProperty.builder()
 * .metadataOperation("metadataOperation")
 * .version("version")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-opentableformatinput.html)
 */
@CdkDslMarker
public class CfnTableOpenTableFormatInputPropertyDsl {
    private val cdkBuilder: CfnTable.OpenTableFormatInputProperty.Builder =
        CfnTable.OpenTableFormatInputProperty.builder()

    /** @param icebergInput the value to be set. */
    public fun icebergInput(icebergInput: IResolvable) {
        cdkBuilder.icebergInput(icebergInput)
    }

    /** @param icebergInput the value to be set. */
    public fun icebergInput(icebergInput: CfnTable.IcebergInputProperty) {
        cdkBuilder.icebergInput(icebergInput)
    }

    public fun build(): CfnTable.OpenTableFormatInputProperty = cdkBuilder.build()
}
