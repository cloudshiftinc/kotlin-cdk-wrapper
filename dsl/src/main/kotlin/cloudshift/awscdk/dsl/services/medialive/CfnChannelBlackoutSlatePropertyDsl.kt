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
import kotlin.String

@CdkDslMarker
public class CfnChannelBlackoutSlatePropertyDsl {
    private val cdkBuilder: CfnChannel.BlackoutSlateProperty.Builder =
        CfnChannel.BlackoutSlateProperty.builder()

    public fun blackoutSlateImage(blackoutSlateImage: IResolvable) {
        cdkBuilder.blackoutSlateImage(blackoutSlateImage)
    }

    public fun blackoutSlateImage(blackoutSlateImage: CfnChannel.InputLocationProperty) {
        cdkBuilder.blackoutSlateImage(blackoutSlateImage)
    }

    public fun networkEndBlackout(networkEndBlackout: String) {
        cdkBuilder.networkEndBlackout(networkEndBlackout)
    }

    public fun networkEndBlackoutImage(networkEndBlackoutImage: IResolvable) {
        cdkBuilder.networkEndBlackoutImage(networkEndBlackoutImage)
    }

    public fun networkEndBlackoutImage(networkEndBlackoutImage: CfnChannel.InputLocationProperty) {
        cdkBuilder.networkEndBlackoutImage(networkEndBlackoutImage)
    }

    public fun networkId(networkId: String) {
        cdkBuilder.networkId(networkId)
    }

    public fun state(state: String) {
        cdkBuilder.state(state)
    }

    public fun build(): CfnChannel.BlackoutSlateProperty = cdkBuilder.build()
}
