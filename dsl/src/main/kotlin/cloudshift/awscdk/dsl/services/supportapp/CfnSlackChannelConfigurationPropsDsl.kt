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

package cloudshift.awscdk.dsl.services.supportapp

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.supportapp.CfnSlackChannelConfigurationProps
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnSlackChannelConfigurationPropsDsl {
    private val cdkBuilder: CfnSlackChannelConfigurationProps.Builder =
        CfnSlackChannelConfigurationProps.builder()

    public fun channelId(channelId: String) {
        cdkBuilder.channelId(channelId)
    }

    public fun channelName(channelName: String) {
        cdkBuilder.channelName(channelName)
    }

    public fun channelRoleArn(channelRoleArn: String) {
        cdkBuilder.channelRoleArn(channelRoleArn)
    }

    public fun notifyOnAddCorrespondenceToCase(notifyOnAddCorrespondenceToCase: Boolean) {
        cdkBuilder.notifyOnAddCorrespondenceToCase(notifyOnAddCorrespondenceToCase)
    }

    public fun notifyOnAddCorrespondenceToCase(notifyOnAddCorrespondenceToCase: IResolvable) {
        cdkBuilder.notifyOnAddCorrespondenceToCase(notifyOnAddCorrespondenceToCase)
    }

    public fun notifyOnCaseSeverity(notifyOnCaseSeverity: String) {
        cdkBuilder.notifyOnCaseSeverity(notifyOnCaseSeverity)
    }

    public fun notifyOnCreateOrReopenCase(notifyOnCreateOrReopenCase: Boolean) {
        cdkBuilder.notifyOnCreateOrReopenCase(notifyOnCreateOrReopenCase)
    }

    public fun notifyOnCreateOrReopenCase(notifyOnCreateOrReopenCase: IResolvable) {
        cdkBuilder.notifyOnCreateOrReopenCase(notifyOnCreateOrReopenCase)
    }

    public fun notifyOnResolveCase(notifyOnResolveCase: Boolean) {
        cdkBuilder.notifyOnResolveCase(notifyOnResolveCase)
    }

    public fun notifyOnResolveCase(notifyOnResolveCase: IResolvable) {
        cdkBuilder.notifyOnResolveCase(notifyOnResolveCase)
    }

    public fun teamId(teamId: String) {
        cdkBuilder.teamId(teamId)
    }

    public fun build(): CfnSlackChannelConfigurationProps = cdkBuilder.build()
}
