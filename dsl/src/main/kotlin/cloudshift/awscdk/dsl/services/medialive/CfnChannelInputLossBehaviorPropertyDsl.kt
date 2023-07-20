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
public class CfnChannelInputLossBehaviorPropertyDsl {
    private val cdkBuilder: CfnChannel.InputLossBehaviorProperty.Builder =
        CfnChannel.InputLossBehaviorProperty.builder()

    public fun blackFrameMsec(blackFrameMsec: Number) {
        cdkBuilder.blackFrameMsec(blackFrameMsec)
    }

    public fun inputLossImageColor(inputLossImageColor: String) {
        cdkBuilder.inputLossImageColor(inputLossImageColor)
    }

    public fun inputLossImageSlate(inputLossImageSlate: IResolvable) {
        cdkBuilder.inputLossImageSlate(inputLossImageSlate)
    }

    public fun inputLossImageSlate(inputLossImageSlate: CfnChannel.InputLocationProperty) {
        cdkBuilder.inputLossImageSlate(inputLossImageSlate)
    }

    public fun inputLossImageType(inputLossImageType: String) {
        cdkBuilder.inputLossImageType(inputLossImageType)
    }

    public fun repeatFrameMsec(repeatFrameMsec: Number) {
        cdkBuilder.repeatFrameMsec(repeatFrameMsec)
    }

    public fun build(): CfnChannel.InputLossBehaviorProperty = cdkBuilder.build()
}
