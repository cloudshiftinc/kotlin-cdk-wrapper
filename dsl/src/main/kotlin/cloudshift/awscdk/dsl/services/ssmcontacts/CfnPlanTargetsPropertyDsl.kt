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
import software.amazon.awscdk.services.ssmcontacts.CfnPlan

@CdkDslMarker
public class CfnPlanTargetsPropertyDsl {
    private val cdkBuilder: CfnPlan.TargetsProperty.Builder = CfnPlan.TargetsProperty.builder()

    public fun channelTargetInfo(channelTargetInfo: IResolvable) {
        cdkBuilder.channelTargetInfo(channelTargetInfo)
    }

    public fun channelTargetInfo(channelTargetInfo: CfnPlan.ChannelTargetInfoProperty) {
        cdkBuilder.channelTargetInfo(channelTargetInfo)
    }

    public fun contactTargetInfo(contactTargetInfo: IResolvable) {
        cdkBuilder.contactTargetInfo(contactTargetInfo)
    }

    public fun contactTargetInfo(contactTargetInfo: CfnPlan.ContactTargetInfoProperty) {
        cdkBuilder.contactTargetInfo(contactTargetInfo)
    }

    public fun build(): CfnPlan.TargetsProperty = cdkBuilder.build()
}
