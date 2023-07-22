@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ses.CfnEmailIdentity
import software.constructs.Construct

@CdkDslMarker
public class CfnEmailIdentityDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnEmailIdentity.Builder = CfnEmailIdentity.Builder.create(scope, id)

  /**
   * Used to associate a configuration set with an email identity.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html#cfn-ses-emailidentity-configurationsetattributes)
   * @param configurationSetAttributes Used to associate a configuration set with an email identity.
   * 
   */
  public fun configurationSetAttributes(configurationSetAttributes: IResolvable) {
    cdkBuilder.configurationSetAttributes(configurationSetAttributes)
  }

  /**
   * Used to associate a configuration set with an email identity.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html#cfn-ses-emailidentity-configurationsetattributes)
   * @param configurationSetAttributes Used to associate a configuration set with an email identity.
   * 
   */
  public
      fun configurationSetAttributes(configurationSetAttributes: CfnEmailIdentity.ConfigurationSetAttributesProperty) {
    cdkBuilder.configurationSetAttributes(configurationSetAttributes)
  }

  /**
   * An object that contains information about the DKIM attributes for the identity.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html#cfn-ses-emailidentity-dkimattributes)
   * @param dkimAttributes An object that contains information about the DKIM attributes for the
   * identity. 
   */
  public fun dkimAttributes(dkimAttributes: IResolvable) {
    cdkBuilder.dkimAttributes(dkimAttributes)
  }

  /**
   * An object that contains information about the DKIM attributes for the identity.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html#cfn-ses-emailidentity-dkimattributes)
   * @param dkimAttributes An object that contains information about the DKIM attributes for the
   * identity. 
   */
  public fun dkimAttributes(dkimAttributes: CfnEmailIdentity.DkimAttributesProperty) {
    cdkBuilder.dkimAttributes(dkimAttributes)
  }

  /**
   * If your request includes this object, Amazon SES configures the identity to use Bring Your Own
   * DKIM (BYODKIM) for DKIM authentication purposes, or, configures the key length to be used for
   * [Easy DKIM](https://docs.aws.amazon.com/ses/latest/dg/send-email-authentication-dkim-easy.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html#cfn-ses-emailidentity-dkimsigningattributes)
   * @param dkimSigningAttributes If your request includes this object, Amazon SES configures the
   * identity to use Bring Your Own DKIM (BYODKIM) for DKIM authentication purposes, or, configures the
   * key length to be used for [Easy
   * DKIM](https://docs.aws.amazon.com/ses/latest/dg/send-email-authentication-dkim-easy.html) . 
   */
  public fun dkimSigningAttributes(dkimSigningAttributes: IResolvable) {
    cdkBuilder.dkimSigningAttributes(dkimSigningAttributes)
  }

  /**
   * If your request includes this object, Amazon SES configures the identity to use Bring Your Own
   * DKIM (BYODKIM) for DKIM authentication purposes, or, configures the key length to be used for
   * [Easy DKIM](https://docs.aws.amazon.com/ses/latest/dg/send-email-authentication-dkim-easy.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html#cfn-ses-emailidentity-dkimsigningattributes)
   * @param dkimSigningAttributes If your request includes this object, Amazon SES configures the
   * identity to use Bring Your Own DKIM (BYODKIM) for DKIM authentication purposes, or, configures the
   * key length to be used for [Easy
   * DKIM](https://docs.aws.amazon.com/ses/latest/dg/send-email-authentication-dkim-easy.html) . 
   */
  public
      fun dkimSigningAttributes(dkimSigningAttributes: CfnEmailIdentity.DkimSigningAttributesProperty) {
    cdkBuilder.dkimSigningAttributes(dkimSigningAttributes)
  }

  /**
   * The email address or domain to verify.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html#cfn-ses-emailidentity-emailidentity)
   * @param emailIdentity The email address or domain to verify. 
   */
  public fun emailIdentity(emailIdentity: String) {
    cdkBuilder.emailIdentity(emailIdentity)
  }

  /**
   * Used to enable or disable feedback forwarding for an identity.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html#cfn-ses-emailidentity-feedbackattributes)
   * @param feedbackAttributes Used to enable or disable feedback forwarding for an identity. 
   */
  public fun feedbackAttributes(feedbackAttributes: IResolvable) {
    cdkBuilder.feedbackAttributes(feedbackAttributes)
  }

  /**
   * Used to enable or disable feedback forwarding for an identity.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html#cfn-ses-emailidentity-feedbackattributes)
   * @param feedbackAttributes Used to enable or disable feedback forwarding for an identity. 
   */
  public fun feedbackAttributes(feedbackAttributes: CfnEmailIdentity.FeedbackAttributesProperty) {
    cdkBuilder.feedbackAttributes(feedbackAttributes)
  }

  /**
   * Used to enable or disable the custom Mail-From domain configuration for an email identity.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html#cfn-ses-emailidentity-mailfromattributes)
   * @param mailFromAttributes Used to enable or disable the custom Mail-From domain configuration
   * for an email identity. 
   */
  public fun mailFromAttributes(mailFromAttributes: IResolvable) {
    cdkBuilder.mailFromAttributes(mailFromAttributes)
  }

  /**
   * Used to enable or disable the custom Mail-From domain configuration for an email identity.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html#cfn-ses-emailidentity-mailfromattributes)
   * @param mailFromAttributes Used to enable or disable the custom Mail-From domain configuration
   * for an email identity. 
   */
  public fun mailFromAttributes(mailFromAttributes: CfnEmailIdentity.MailFromAttributesProperty) {
    cdkBuilder.mailFromAttributes(mailFromAttributes)
  }

  public fun build(): CfnEmailIdentity = cdkBuilder.build()
}
