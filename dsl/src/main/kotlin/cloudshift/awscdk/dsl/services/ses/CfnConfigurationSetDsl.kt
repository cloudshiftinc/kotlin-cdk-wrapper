@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ses.CfnConfigurationSet
import software.constructs.Construct

@CdkDslMarker
public class CfnConfigurationSetDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnConfigurationSet.Builder = CfnConfigurationSet.Builder.create(scope,
      id)

  /**
   * Specifies whether messages that use the configuration set are required to use Transport Layer
   * Security (TLS).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html#cfn-ses-configurationset-deliveryoptions)
   * @param deliveryOptions Specifies whether messages that use the configuration set are required
   * to use Transport Layer Security (TLS). 
   */
  public fun deliveryOptions(deliveryOptions: IResolvable) {
    cdkBuilder.deliveryOptions(deliveryOptions)
  }

  /**
   * Specifies whether messages that use the configuration set are required to use Transport Layer
   * Security (TLS).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html#cfn-ses-configurationset-deliveryoptions)
   * @param deliveryOptions Specifies whether messages that use the configuration set are required
   * to use Transport Layer Security (TLS). 
   */
  public fun deliveryOptions(deliveryOptions: CfnConfigurationSet.DeliveryOptionsProperty) {
    cdkBuilder.deliveryOptions(deliveryOptions)
  }

  /**
   * The name of the configuration set. The name must meet the following requirements:.
   *
   * * Contain only letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).
   * * Contain 64 characters or fewer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html#cfn-ses-configurationset-name)
   * @param name The name of the configuration set. The name must meet the following requirements:. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * An object that represents the reputation settings for the configuration set.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html#cfn-ses-configurationset-reputationoptions)
   * @param reputationOptions An object that represents the reputation settings for the
   * configuration set. 
   */
  public fun reputationOptions(reputationOptions: IResolvable) {
    cdkBuilder.reputationOptions(reputationOptions)
  }

  /**
   * An object that represents the reputation settings for the configuration set.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html#cfn-ses-configurationset-reputationoptions)
   * @param reputationOptions An object that represents the reputation settings for the
   * configuration set. 
   */
  public fun reputationOptions(reputationOptions: CfnConfigurationSet.ReputationOptionsProperty) {
    cdkBuilder.reputationOptions(reputationOptions)
  }

  /**
   * An object that defines whether or not Amazon SES can send email that you send using the
   * configuration set.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html#cfn-ses-configurationset-sendingoptions)
   * @param sendingOptions An object that defines whether or not Amazon SES can send email that you
   * send using the configuration set. 
   */
  public fun sendingOptions(sendingOptions: IResolvable) {
    cdkBuilder.sendingOptions(sendingOptions)
  }

  /**
   * An object that defines whether or not Amazon SES can send email that you send using the
   * configuration set.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html#cfn-ses-configurationset-sendingoptions)
   * @param sendingOptions An object that defines whether or not Amazon SES can send email that you
   * send using the configuration set. 
   */
  public fun sendingOptions(sendingOptions: CfnConfigurationSet.SendingOptionsProperty) {
    cdkBuilder.sendingOptions(sendingOptions)
  }

  /**
   * An object that contains information about the suppression list preferences for your account.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html#cfn-ses-configurationset-suppressionoptions)
   * @param suppressionOptions An object that contains information about the suppression list
   * preferences for your account. 
   */
  public fun suppressionOptions(suppressionOptions: IResolvable) {
    cdkBuilder.suppressionOptions(suppressionOptions)
  }

  /**
   * An object that contains information about the suppression list preferences for your account.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html#cfn-ses-configurationset-suppressionoptions)
   * @param suppressionOptions An object that contains information about the suppression list
   * preferences for your account. 
   */
  public
      fun suppressionOptions(suppressionOptions: CfnConfigurationSet.SuppressionOptionsProperty) {
    cdkBuilder.suppressionOptions(suppressionOptions)
  }

  /**
   * The name of the custom open and click tracking domain associated with the configuration set.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html#cfn-ses-configurationset-trackingoptions)
   * @param trackingOptions The name of the custom open and click tracking domain associated with
   * the configuration set. 
   */
  public fun trackingOptions(trackingOptions: IResolvable) {
    cdkBuilder.trackingOptions(trackingOptions)
  }

  /**
   * The name of the custom open and click tracking domain associated with the configuration set.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html#cfn-ses-configurationset-trackingoptions)
   * @param trackingOptions The name of the custom open and click tracking domain associated with
   * the configuration set. 
   */
  public fun trackingOptions(trackingOptions: CfnConfigurationSet.TrackingOptionsProperty) {
    cdkBuilder.trackingOptions(trackingOptions)
  }

  /**
   * The Virtual Deliverability Manager (VDM) options that apply to the configuration set.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html#cfn-ses-configurationset-vdmoptions)
   * @param vdmOptions The Virtual Deliverability Manager (VDM) options that apply to the
   * configuration set. 
   */
  public fun vdmOptions(vdmOptions: IResolvable) {
    cdkBuilder.vdmOptions(vdmOptions)
  }

  /**
   * The Virtual Deliverability Manager (VDM) options that apply to the configuration set.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationset.html#cfn-ses-configurationset-vdmoptions)
   * @param vdmOptions The Virtual Deliverability Manager (VDM) options that apply to the
   * configuration set. 
   */
  public fun vdmOptions(vdmOptions: CfnConfigurationSet.VdmOptionsProperty) {
    cdkBuilder.vdmOptions(vdmOptions)
  }

  public fun build(): CfnConfigurationSet = cdkBuilder.build()
}
