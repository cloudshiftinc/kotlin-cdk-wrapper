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

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnChannelGlobalConfigurationPropertyDsl {
    private val cdkBuilder: CfnChannel.GlobalConfigurationProperty.Builder =
        CfnChannel.GlobalConfigurationProperty.builder()

    public fun initialAudioGain(initialAudioGain: Number) {
        cdkBuilder.initialAudioGain(initialAudioGain)
    }

    public fun inputEndAction(inputEndAction: String) {
        cdkBuilder.inputEndAction(inputEndAction)
    }

    public fun inputLossBehavior(inputLossBehavior: IResolvable) {
        cdkBuilder.inputLossBehavior(inputLossBehavior)
    }

    public fun inputLossBehavior(inputLossBehavior: CfnChannel.InputLossBehaviorProperty) {
        cdkBuilder.inputLossBehavior(inputLossBehavior)
    }

    public fun outputLockingMode(outputLockingMode: String) {
        cdkBuilder.outputLockingMode(outputLockingMode)
    }

    public fun outputTimingSource(outputTimingSource: String) {
        cdkBuilder.outputTimingSource(outputTimingSource)
    }

    public fun supportLowFramerateInputs(supportLowFramerateInputs: String) {
        cdkBuilder.supportLowFramerateInputs(supportLowFramerateInputs)
    }

    public fun build(): CfnChannel.GlobalConfigurationProperty = cdkBuilder.build()
}
