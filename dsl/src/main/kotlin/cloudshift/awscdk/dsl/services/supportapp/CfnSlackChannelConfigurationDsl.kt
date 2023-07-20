@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.supportapp

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.supportapp.CfnSlackChannelConfiguration
import software.constructs.Construct

@CdkDslMarker
public class CfnSlackChannelConfigurationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnSlackChannelConfiguration.Builder =
      CfnSlackChannelConfiguration.Builder.create(scope, id)

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

  public fun build(): CfnSlackChannelConfiguration = cdkBuilder.build()
}
