@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnGCMChannel
import software.constructs.Construct

/**
 * A *channel* is a type of platform that you can deliver messages to.
 *
 * You can use the GCM channel to send push notification messages to the Firebase Cloud Messaging
 * (FCM) service, which replaced the Google Cloud Messaging (GCM) service. Before you use Amazon
 * Pinpoint to send notifications to FCM, you have to enable the GCM channel for an Amazon Pinpoint
 * application.
 *
 * The GCMChannel resource represents the status and authentication settings of the GCM channel for
 * an application.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpoint.*;
 * CfnGCMChannel cfnGCMChannel = CfnGCMChannel.Builder.create(this, "MyCfnGCMChannel")
 * .apiKey("apiKey")
 * .applicationId("applicationId")
 * // the properties below are optional
 * .enabled(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-gcmchannel.html)
 */
@CdkDslMarker
public class CfnGCMChannelDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnGCMChannel.Builder = CfnGCMChannel.Builder.create(scope, id)

  /**
   * The Web API key, also called the *server key* , that you received from Google to communicate
   * with Google services.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-gcmchannel.html#cfn-pinpoint-gcmchannel-apikey)
   * @param apiKey The Web API key, also called the *server key* , that you received from Google to
   * communicate with Google services. 
   */
  public fun apiKey(apiKey: String) {
    cdkBuilder.apiKey(apiKey)
  }

  /**
   * The unique identifier for the Amazon Pinpoint application that the GCM channel applies to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-gcmchannel.html#cfn-pinpoint-gcmchannel-applicationid)
   * @param applicationId The unique identifier for the Amazon Pinpoint application that the GCM
   * channel applies to. 
   */
  public fun applicationId(applicationId: String) {
    cdkBuilder.applicationId(applicationId)
  }

  /**
   * Specifies whether to enable the GCM channel for the Amazon Pinpoint application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-gcmchannel.html#cfn-pinpoint-gcmchannel-enabled)
   * @param enabled Specifies whether to enable the GCM channel for the Amazon Pinpoint application.
   * 
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * Specifies whether to enable the GCM channel for the Amazon Pinpoint application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-gcmchannel.html#cfn-pinpoint-gcmchannel-enabled)
   * @param enabled Specifies whether to enable the GCM channel for the Amazon Pinpoint application.
   * 
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun build(): CfnGCMChannel = cdkBuilder.build()
}
