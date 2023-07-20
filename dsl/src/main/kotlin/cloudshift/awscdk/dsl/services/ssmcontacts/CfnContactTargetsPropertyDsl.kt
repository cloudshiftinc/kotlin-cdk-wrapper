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

package cloudshift.awscdk.dsl.services.ssmcontacts

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssmcontacts.CfnContact

@CdkDslMarker
public class CfnContactTargetsPropertyDsl {
    private val cdkBuilder: CfnContact.TargetsProperty.Builder = CfnContact.TargetsProperty.builder()

    public fun channelTargetInfo(channelTargetInfo: IResolvable) {
        cdkBuilder.channelTargetInfo(channelTargetInfo)
    }

    public fun channelTargetInfo(channelTargetInfo: CfnContact.ChannelTargetInfoProperty) {
        cdkBuilder.channelTargetInfo(channelTargetInfo)
    }

    public fun contactTargetInfo(contactTargetInfo: IResolvable) {
        cdkBuilder.contactTargetInfo(contactTargetInfo)
    }

    public fun contactTargetInfo(contactTargetInfo: CfnContact.ContactTargetInfoProperty) {
        cdkBuilder.contactTargetInfo(contactTargetInfo)
    }

    public fun build(): CfnContact.TargetsProperty = cdkBuilder.build()
}
