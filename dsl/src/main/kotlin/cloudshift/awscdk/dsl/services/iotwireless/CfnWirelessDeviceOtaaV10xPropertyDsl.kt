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

package cloudshift.awscdk.dsl.services.iotwireless

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotwireless.CfnWirelessDevice

/**
 * OTAA device object for create APIs for v1.0.x.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotwireless.*;
 * OtaaV10xProperty otaaV10xProperty = OtaaV10xProperty.builder()
 * .appEui("appEui")
 * .appKey("appKey")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdevice-otaav10x.html)
 */
@CdkDslMarker
public class CfnWirelessDeviceOtaaV10xPropertyDsl {
    private val cdkBuilder: CfnWirelessDevice.OtaaV10xProperty.Builder =
        CfnWirelessDevice.OtaaV10xProperty.builder()

    /** @param appEui The AppEUI value, with pattern of `[a-fA-F0-9]{16}` . */
    public fun appEui(appEui: String) {
        cdkBuilder.appEui(appEui)
    }

    /**
     * @param appKey The AppKey is a secret key, which you should handle in a similar way as you
     *   would an application password. You can protect the AppKey value by storing it in the AWS
     *   Secrets Manager and use the
     *   [secretsmanager](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/dynamic-references.html#dynamic-references-secretsmanager)
     *   to reference this value.
     */
    public fun appKey(appKey: String) {
        cdkBuilder.appKey(appKey)
    }

    public fun build(): CfnWirelessDevice.OtaaV10xProperty = cdkBuilder.build()
}
