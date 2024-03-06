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

package io.cloudshiftdev.awscdkdsl.services.medialive

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * EpochLockingSettingsProperty epochLockingSettingsProperty =
 * EpochLockingSettingsProperty.builder()
 * .customEpoch("customEpoch")
 * .jamSyncTime("jamSyncTime")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-epochlockingsettings.html)
 */
@CdkDslMarker
public class CfnChannelEpochLockingSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.EpochLockingSettingsProperty.Builder =
        CfnChannel.EpochLockingSettingsProperty.builder()

    /** @param customEpoch the value to be set. */
    public fun customEpoch(customEpoch: String) {
        cdkBuilder.customEpoch(customEpoch)
    }

    /** @param jamSyncTime the value to be set. */
    public fun jamSyncTime(jamSyncTime: String) {
        cdkBuilder.jamSyncTime(jamSyncTime)
    }

    public fun build(): CfnChannel.EpochLockingSettingsProperty = cdkBuilder.build()
}
