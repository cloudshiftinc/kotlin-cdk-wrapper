@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ses.CfnEmailIdentity

@CdkDslMarker
public class CfnEmailIdentityFeedbackAttributesPropertyDsl {
  private val cdkBuilder: CfnEmailIdentity.FeedbackAttributesProperty.Builder =
      CfnEmailIdentity.FeedbackAttributesProperty.builder()

  /**
   * @param emailForwardingEnabled Sets the feedback forwarding configuration for the identity.
   * If the value is `true` , you receive email notifications when bounce or complaint events occur.
   * These notifications are sent to the address that you specified in the `Return-Path` header of the
   * original email.
   *
   * You're required to have a method of tracking bounces and complaints. If you haven't set up
   * another mechanism for receiving bounce or complaint notifications (for example, by setting up an
   * event destination), you receive an email notification when these events occur (even if this
   * setting is disabled).
   */
  public fun emailForwardingEnabled(emailForwardingEnabled: Boolean) {
    cdkBuilder.emailForwardingEnabled(emailForwardingEnabled)
  }

  /**
   * @param emailForwardingEnabled Sets the feedback forwarding configuration for the identity.
   * If the value is `true` , you receive email notifications when bounce or complaint events occur.
   * These notifications are sent to the address that you specified in the `Return-Path` header of the
   * original email.
   *
   * You're required to have a method of tracking bounces and complaints. If you haven't set up
   * another mechanism for receiving bounce or complaint notifications (for example, by setting up an
   * event destination), you receive an email notification when these events occur (even if this
   * setting is disabled).
   */
  public fun emailForwardingEnabled(emailForwardingEnabled: IResolvable) {
    cdkBuilder.emailForwardingEnabled(emailForwardingEnabled)
  }

  public fun build(): CfnEmailIdentity.FeedbackAttributesProperty = cdkBuilder.build()
}
