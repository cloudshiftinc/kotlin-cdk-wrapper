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

package io.cloudshiftdev.awscdkdsl.services.iotwireless

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotwireless.CfnTaskDefinition

/**
 * UpdateWirelessGatewayTaskCreate object.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotwireless.*;
 * UpdateWirelessGatewayTaskCreateProperty updateWirelessGatewayTaskCreateProperty =
 * UpdateWirelessGatewayTaskCreateProperty.builder()
 * .loRaWan(LoRaWANUpdateGatewayTaskCreateProperty.builder()
 * .currentVersion(LoRaWANGatewayVersionProperty.builder()
 * .model("model")
 * .packageVersion("packageVersion")
 * .station("station")
 * .build())
 * .sigKeyCrc(123)
 * .updateSignature("updateSignature")
 * .updateVersion(LoRaWANGatewayVersionProperty.builder()
 * .model("model")
 * .packageVersion("packageVersion")
 * .station("station")
 * .build())
 * .build())
 * .updateDataRole("updateDataRole")
 * .updateDataSource("updateDataSource")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-taskdefinition-updatewirelessgatewaytaskcreate.html)
 */
@CdkDslMarker
public class CfnTaskDefinitionUpdateWirelessGatewayTaskCreatePropertyDsl {
    private val cdkBuilder: CfnTaskDefinition.UpdateWirelessGatewayTaskCreateProperty.Builder =
        CfnTaskDefinition.UpdateWirelessGatewayTaskCreateProperty.builder()

    /** @param loRaWan The properties that relate to the LoRaWAN wireless gateway. */
    public fun loRaWan(loRaWan: IResolvable) {
        cdkBuilder.loRaWan(loRaWan)
    }

    /** @param loRaWan The properties that relate to the LoRaWAN wireless gateway. */
    public fun loRaWan(loRaWan: CfnTaskDefinition.LoRaWANUpdateGatewayTaskCreateProperty) {
        cdkBuilder.loRaWan(loRaWan)
    }

    /** @param updateDataRole The IAM role used to read data from the S3 bucket. */
    public fun updateDataRole(updateDataRole: String) {
        cdkBuilder.updateDataRole(updateDataRole)
    }

    /** @param updateDataSource The link to the S3 bucket. */
    public fun updateDataSource(updateDataSource: String) {
        cdkBuilder.updateDataSource(updateDataSource)
    }

    public fun build(): CfnTaskDefinition.UpdateWirelessGatewayTaskCreateProperty =
        cdkBuilder.build()
}
