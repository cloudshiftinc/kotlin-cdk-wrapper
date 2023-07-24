@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.iotwireless

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.iotwireless.CfnWirelessDevice
import kotlin.String

/**
 * OTAA device object for v1.1 for create APIs.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotwireless.*;
 * OtaaV11Property otaaV11Property = OtaaV11Property.builder()
 * .appKey("appKey")
 * .joinEui("joinEui")
 * .nwkKey("nwkKey")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdevice-otaav11.html)
 */
@CdkDslMarker
public class CfnWirelessDeviceOtaaV11PropertyDsl {
    private val cdkBuilder: CfnWirelessDevice.OtaaV11Property.Builder =
        CfnWirelessDevice.OtaaV11Property.builder()

    /**
     * @param appKey The AppKey is a secret key, which you should handle in a similar way as you would
     * an application password.
     * You can protect the AppKey value by storing it in the AWS Secrets Manager and use the
     * [secretsmanager](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/dynamic-references.html#dynamic-references-secretsmanager)
     * to reference this value.
     */
    public fun appKey(appKey: String) {
        cdkBuilder.appKey(appKey)
    }

    /**
     * @param joinEui The JoinEUI value.
     */
    public fun joinEui(joinEui: String) {
        cdkBuilder.joinEui(joinEui)
    }

    /**
     * @param nwkKey The NwkKey is a secret key, which you should handle in a similar way as you would
     * an application password.
     * You can protect the NwkKey value by storing it in the AWS Secrets Manager and use the
     * [secretsmanager](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/dynamic-references.html#dynamic-references-secretsmanager)
     * to reference this value.
     */
    public fun nwkKey(nwkKey: String) {
        cdkBuilder.nwkKey(nwkKey)
    }

    public fun build(): CfnWirelessDevice.OtaaV11Property = cdkBuilder.build()
}
