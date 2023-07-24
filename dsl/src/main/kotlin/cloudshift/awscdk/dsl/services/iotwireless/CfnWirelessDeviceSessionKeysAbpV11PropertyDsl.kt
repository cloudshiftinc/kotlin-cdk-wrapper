@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.iotwireless

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.iotwireless.CfnWirelessDevice
import kotlin.String

/**
 * Session keys for ABP v1.1.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotwireless.*;
 * SessionKeysAbpV11Property sessionKeysAbpV11Property = SessionKeysAbpV11Property.builder()
 * .appSKey("appSKey")
 * .fNwkSIntKey("fNwkSIntKey")
 * .nwkSEncKey("nwkSEncKey")
 * .sNwkSIntKey("sNwkSIntKey")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdevice-sessionkeysabpv11.html)
 */
@CdkDslMarker
public class CfnWirelessDeviceSessionKeysAbpV11PropertyDsl {
    private val cdkBuilder: CfnWirelessDevice.SessionKeysAbpV11Property.Builder =
        CfnWirelessDevice.SessionKeysAbpV11Property.builder()

    /**
     * @param appSKey The AppSKey is a secret key, which you should handle in a similar way as you
     * would an application password.
     * You can protect the AppSKey value by storing it in the AWS Secrets Manager and use the
     * [secretsmanager](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/dynamic-references.html#dynamic-references-secretsmanager)
     * to reference this value.
     */
    public fun appSKey(appSKey: String) {
        cdkBuilder.appSKey(appSKey)
    }

    /**
     * @param fNwkSIntKey The FNwkSIntKey is a secret key, which you should handle in a similar way as
     * you would an application password.
     * You can protect the FNwkSIntKey value by storing it in the AWS Secrets Manager and use the
     * [secretsmanager](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/dynamic-references.html#dynamic-references-secretsmanager)
     * to reference this value.
     */
    public fun fNwkSIntKey(fNwkSIntKey: String) {
        cdkBuilder.fNwkSIntKey(fNwkSIntKey)
    }

    /**
     * @param nwkSEncKey The NwkSEncKey is a secret key, which you should handle in a similar way as
     * you would an application password.
     * You can protect the NwkSEncKey value by storing it in the AWS Secrets Manager and use the
     * [secretsmanager](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/dynamic-references.html#dynamic-references-secretsmanager)
     * to reference this value.
     */
    public fun nwkSEncKey(nwkSEncKey: String) {
        cdkBuilder.nwkSEncKey(nwkSEncKey)
    }

    /**
     * @param sNwkSIntKey The SNwkSIntKey is a secret key, which you should handle in a similar way as
     * you would an application password.
     * You can protect the SNwkSIntKey value by storing it in the AWS Secrets Manager and use the
     * [secretsmanager](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/dynamic-references.html#dynamic-references-secretsmanager)
     * to reference this value.
     */
    public fun sNwkSIntKey(sNwkSIntKey: String) {
        cdkBuilder.sNwkSIntKey(sNwkSIntKey)
    }

    public fun build(): CfnWirelessDevice.SessionKeysAbpV11Property = cdkBuilder.build()
}
