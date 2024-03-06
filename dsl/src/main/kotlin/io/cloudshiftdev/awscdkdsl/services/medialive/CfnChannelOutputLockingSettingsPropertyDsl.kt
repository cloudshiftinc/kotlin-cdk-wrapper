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
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * Object pipelineLockingSettings;
 * OutputLockingSettingsProperty outputLockingSettingsProperty =
 * OutputLockingSettingsProperty.builder()
 * .epochLockingSettings(EpochLockingSettingsProperty.builder()
 * .customEpoch("customEpoch")
 * .jamSyncTime("jamSyncTime")
 * .build())
 * .pipelineLockingSettings(pipelineLockingSettings)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-outputlockingsettings.html)
 */
@CdkDslMarker
public class CfnChannelOutputLockingSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.OutputLockingSettingsProperty.Builder =
        CfnChannel.OutputLockingSettingsProperty.builder()

    /** @param epochLockingSettings the value to be set. */
    public fun epochLockingSettings(epochLockingSettings: IResolvable) {
        cdkBuilder.epochLockingSettings(epochLockingSettings)
    }

    /** @param epochLockingSettings the value to be set. */
    public fun epochLockingSettings(epochLockingSettings: CfnChannel.EpochLockingSettingsProperty) {
        cdkBuilder.epochLockingSettings(epochLockingSettings)
    }

    /** @param pipelineLockingSettings the value to be set. */
    public fun pipelineLockingSettings(pipelineLockingSettings: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(pipelineLockingSettings)
        cdkBuilder.pipelineLockingSettings(builder.map)
    }

    /** @param pipelineLockingSettings the value to be set. */
    public fun pipelineLockingSettings(pipelineLockingSettings: Any) {
        cdkBuilder.pipelineLockingSettings(pipelineLockingSettings)
    }

    public fun build(): CfnChannel.OutputLockingSettingsProperty = cdkBuilder.build()
}
