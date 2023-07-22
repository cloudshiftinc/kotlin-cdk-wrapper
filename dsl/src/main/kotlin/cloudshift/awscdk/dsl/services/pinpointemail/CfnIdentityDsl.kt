@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpointemail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpointemail.CfnIdentity
import software.constructs.Construct

@CdkDslMarker
public class CfnIdentityDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnIdentity.Builder = CfnIdentity.Builder.create(scope, id)

  private val _tags: MutableList<CfnIdentity.TagsProperty> = mutableListOf()

  /**
   * For domain identities, this attribute is used to enable or disable DomainKeys Identified Mail
   * (DKIM) signing for the domain.
   *
   * If the value is `true` , then the messages that you send from the domain are signed using both
   * the DKIM keys for your domain, as well as the keys for the `amazonses.com` domain. If the value is
   * `false` , then the messages that you send are only signed using the DKIM keys for the
   * `amazonses.com` domain.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-identity.html#cfn-pinpointemail-identity-dkimsigningenabled)
   * @param dkimSigningEnabled For domain identities, this attribute is used to enable or disable
   * DomainKeys Identified Mail (DKIM) signing for the domain. 
   */
  public fun dkimSigningEnabled(dkimSigningEnabled: Boolean) {
    cdkBuilder.dkimSigningEnabled(dkimSigningEnabled)
  }

  /**
   * For domain identities, this attribute is used to enable or disable DomainKeys Identified Mail
   * (DKIM) signing for the domain.
   *
   * If the value is `true` , then the messages that you send from the domain are signed using both
   * the DKIM keys for your domain, as well as the keys for the `amazonses.com` domain. If the value is
   * `false` , then the messages that you send are only signed using the DKIM keys for the
   * `amazonses.com` domain.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-identity.html#cfn-pinpointemail-identity-dkimsigningenabled)
   * @param dkimSigningEnabled For domain identities, this attribute is used to enable or disable
   * DomainKeys Identified Mail (DKIM) signing for the domain. 
   */
  public fun dkimSigningEnabled(dkimSigningEnabled: IResolvable) {
    cdkBuilder.dkimSigningEnabled(dkimSigningEnabled)
  }

  /**
   * Used to enable or disable feedback forwarding for an identity.
   *
   * This setting determines what happens when an identity is used to send an email that results in
   * a bounce or complaint event.
   *
   * When you enable feedback forwarding, Amazon Pinpoint sends you email notifications when bounce
   * or complaint events occur. Amazon Pinpoint sends this notification to the address that you
   * specified in the Return-Path header of the original email.
   *
   * When you disable feedback forwarding, Amazon Pinpoint sends notifications through other
   * mechanisms, such as by notifying an Amazon SNS topic. You're required to have a method of tracking
   * bounces and complaints. If you haven't set up another mechanism for receiving bounce or complaint
   * notifications, Amazon Pinpoint sends an email notification when these events occur (even if this
   * setting is disabled).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-identity.html#cfn-pinpointemail-identity-feedbackforwardingenabled)
   * @param feedbackForwardingEnabled Used to enable or disable feedback forwarding for an identity.
   * 
   */
  public fun feedbackForwardingEnabled(feedbackForwardingEnabled: Boolean) {
    cdkBuilder.feedbackForwardingEnabled(feedbackForwardingEnabled)
  }

  /**
   * Used to enable or disable feedback forwarding for an identity.
   *
   * This setting determines what happens when an identity is used to send an email that results in
   * a bounce or complaint event.
   *
   * When you enable feedback forwarding, Amazon Pinpoint sends you email notifications when bounce
   * or complaint events occur. Amazon Pinpoint sends this notification to the address that you
   * specified in the Return-Path header of the original email.
   *
   * When you disable feedback forwarding, Amazon Pinpoint sends notifications through other
   * mechanisms, such as by notifying an Amazon SNS topic. You're required to have a method of tracking
   * bounces and complaints. If you haven't set up another mechanism for receiving bounce or complaint
   * notifications, Amazon Pinpoint sends an email notification when these events occur (even if this
   * setting is disabled).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-identity.html#cfn-pinpointemail-identity-feedbackforwardingenabled)
   * @param feedbackForwardingEnabled Used to enable or disable feedback forwarding for an identity.
   * 
   */
  public fun feedbackForwardingEnabled(feedbackForwardingEnabled: IResolvable) {
    cdkBuilder.feedbackForwardingEnabled(feedbackForwardingEnabled)
  }

  /**
   * Used to enable or disable the custom Mail-From domain configuration for an email identity.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-identity.html#cfn-pinpointemail-identity-mailfromattributes)
   * @param mailFromAttributes Used to enable or disable the custom Mail-From domain configuration
   * for an email identity. 
   */
  public fun mailFromAttributes(mailFromAttributes: IResolvable) {
    cdkBuilder.mailFromAttributes(mailFromAttributes)
  }

  /**
   * Used to enable or disable the custom Mail-From domain configuration for an email identity.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-identity.html#cfn-pinpointemail-identity-mailfromattributes)
   * @param mailFromAttributes Used to enable or disable the custom Mail-From domain configuration
   * for an email identity. 
   */
  public fun mailFromAttributes(mailFromAttributes: CfnIdentity.MailFromAttributesProperty) {
    cdkBuilder.mailFromAttributes(mailFromAttributes)
  }

  /**
   * The address or domain of the identity, such as *sender&#64;example.com* or *example.co.uk* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-identity.html#cfn-pinpointemail-identity-name)
   * @param name The address or domain of the identity, such as *sender&#64;example.com* or
   * *example.co.uk* . 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * An object that defines the tags (keys and values) that you want to associate with the email
   * identity.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-identity.html#cfn-pinpointemail-identity-tags)
   * @param tags An object that defines the tags (keys and values) that you want to associate with
   * the email identity. 
   */
  public fun tags(tags: CfnIdentityTagsPropertyDsl.() -> Unit) {
    _tags.add(CfnIdentityTagsPropertyDsl().apply(tags).build())
  }

  /**
   * An object that defines the tags (keys and values) that you want to associate with the email
   * identity.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-identity.html#cfn-pinpointemail-identity-tags)
   * @param tags An object that defines the tags (keys and values) that you want to associate with
   * the email identity. 
   */
  public fun tags(tags: Collection<CfnIdentity.TagsProperty>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnIdentity {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
