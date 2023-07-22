@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnPushTemplate
import software.constructs.Construct

@CdkDslMarker
public class CfnPushTemplateDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnPushTemplate.Builder = CfnPushTemplate.Builder.create(scope, id)

  /**
   * The message template to use for the ADM (Amazon Device Messaging) channel.
   *
   * This message template overrides the default template for push notification channels ( `Default`
   * ).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-adm)
   * @param adm The message template to use for the ADM (Amazon Device Messaging) channel. 
   */
  public fun adm(adm: IResolvable) {
    cdkBuilder.adm(adm)
  }

  /**
   * The message template to use for the ADM (Amazon Device Messaging) channel.
   *
   * This message template overrides the default template for push notification channels ( `Default`
   * ).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-adm)
   * @param adm The message template to use for the ADM (Amazon Device Messaging) channel. 
   */
  public fun adm(adm: CfnPushTemplate.AndroidPushNotificationTemplateProperty) {
    cdkBuilder.adm(adm)
  }

  /**
   * The message template to use for the APNs (Apple Push Notification service) channel.
   *
   * This message template overrides the default template for push notification channels ( `Default`
   * ).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-apns)
   * @param apns The message template to use for the APNs (Apple Push Notification service) channel.
   * 
   */
  public fun apns(apns: IResolvable) {
    cdkBuilder.apns(apns)
  }

  /**
   * The message template to use for the APNs (Apple Push Notification service) channel.
   *
   * This message template overrides the default template for push notification channels ( `Default`
   * ).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-apns)
   * @param apns The message template to use for the APNs (Apple Push Notification service) channel.
   * 
   */
  public fun apns(apns: CfnPushTemplate.APNSPushNotificationTemplateProperty) {
    cdkBuilder.apns(apns)
  }

  /**
   * The message template to use for the Baidu (Baidu Cloud Push) channel.
   *
   * This message template overrides the default template for push notification channels ( `Default`
   * ).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-baidu)
   * @param baidu The message template to use for the Baidu (Baidu Cloud Push) channel. 
   */
  public fun baidu(baidu: IResolvable) {
    cdkBuilder.baidu(baidu)
  }

  /**
   * The message template to use for the Baidu (Baidu Cloud Push) channel.
   *
   * This message template overrides the default template for push notification channels ( `Default`
   * ).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-baidu)
   * @param baidu The message template to use for the Baidu (Baidu Cloud Push) channel. 
   */
  public fun baidu(baidu: CfnPushTemplate.AndroidPushNotificationTemplateProperty) {
    cdkBuilder.baidu(baidu)
  }

  /**
   * A JSON object that specifies the default values to use for message variables in the message
   * template.
   *
   * This object is a set of key-value pairs. Each key defines a message variable in the template.
   * The corresponding value defines the default value for that variable. When you create a message
   * that's based on the template, you can override these defaults with message-specific and
   * address-specific variables and values.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-defaultsubstitutions)
   * @param defaultSubstitutions A JSON object that specifies the default values to use for message
   * variables in the message template. 
   */
  public fun defaultSubstitutions(defaultSubstitutions: String) {
    cdkBuilder.defaultSubstitutions(defaultSubstitutions)
  }

  /**
   * The default message template to use for push notification channels.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-default)
   * @param defaultValue The default message template to use for push notification channels. 
   */
  public fun defaultValue(defaultValue: IResolvable) {
    cdkBuilder.defaultValue(defaultValue)
  }

  /**
   * The default message template to use for push notification channels.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-default)
   * @param defaultValue The default message template to use for push notification channels. 
   */
  public fun defaultValue(defaultValue: CfnPushTemplate.DefaultPushNotificationTemplateProperty) {
    cdkBuilder.defaultValue(defaultValue)
  }

  /**
   * The message template to use for the GCM channel, which is used to send notifications through
   * the Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service.
   *
   * This message template overrides the default template for push notification channels ( `Default`
   * ).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-gcm)
   * @param gcm The message template to use for the GCM channel, which is used to send notifications
   * through the Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service. 
   */
  public fun gcm(gcm: IResolvable) {
    cdkBuilder.gcm(gcm)
  }

  /**
   * The message template to use for the GCM channel, which is used to send notifications through
   * the Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service.
   *
   * This message template overrides the default template for push notification channels ( `Default`
   * ).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-gcm)
   * @param gcm The message template to use for the GCM channel, which is used to send notifications
   * through the Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service. 
   */
  public fun gcm(gcm: CfnPushTemplate.AndroidPushNotificationTemplateProperty) {
    cdkBuilder.gcm(gcm)
  }

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-tags)
   * @param tags An array of key-value pairs to apply to this resource. 
   */
  public fun tags(tags: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(tags)
    cdkBuilder.tags(builder.map)
  }

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-tags)
   * @param tags An array of key-value pairs to apply to this resource. 
   */
  public fun tags(tags: Any) {
    cdkBuilder.tags(tags)
  }

  /**
   * A custom description of the message template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-templatedescription)
   * @param templateDescription A custom description of the message template. 
   */
  public fun templateDescription(templateDescription: String) {
    cdkBuilder.templateDescription(templateDescription)
  }

  /**
   * The name of the message template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-templatename)
   * @param templateName The name of the message template. 
   */
  public fun templateName(templateName: String) {
    cdkBuilder.templateName(templateName)
  }

  public fun build(): CfnPushTemplate = cdkBuilder.build()
}
