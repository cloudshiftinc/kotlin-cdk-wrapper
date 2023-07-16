@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnPushTemplate
import software.amazon.awscdk.services.pinpoint.CfnPushTemplateProps

@CdkDslMarker
public class CfnPushTemplatePropsDsl {
  private val cdkBuilder: CfnPushTemplateProps.Builder = CfnPushTemplateProps.builder()

  public fun adm(adm: IResolvable) {
    cdkBuilder.adm(adm)
  }

  public fun adm(adm: CfnPushTemplate.AndroidPushNotificationTemplateProperty) {
    cdkBuilder.adm(adm)
  }

  public fun apns(apns: IResolvable) {
    cdkBuilder.apns(apns)
  }

  public fun apns(apns: CfnPushTemplate.APNSPushNotificationTemplateProperty) {
    cdkBuilder.apns(apns)
  }

  public fun baidu(baidu: IResolvable) {
    cdkBuilder.baidu(baidu)
  }

  public fun baidu(baidu: CfnPushTemplate.AndroidPushNotificationTemplateProperty) {
    cdkBuilder.baidu(baidu)
  }

  public fun defaultSubstitutions(defaultSubstitutions: String) {
    cdkBuilder.defaultSubstitutions(defaultSubstitutions)
  }

  public fun defaultValue(defaultValue: IResolvable) {
    cdkBuilder.defaultValue(defaultValue)
  }

  public fun defaultValue(defaultValue: CfnPushTemplate.DefaultPushNotificationTemplateProperty) {
    cdkBuilder.defaultValue(defaultValue)
  }

  public fun gcm(gcm: IResolvable) {
    cdkBuilder.gcm(gcm)
  }

  public fun gcm(gcm: CfnPushTemplate.AndroidPushNotificationTemplateProperty) {
    cdkBuilder.gcm(gcm)
  }

  public fun tags(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.tags(builder.map)
  }

  public fun tags(tags: Any) {
    cdkBuilder.tags(tags)
  }

  public fun templateDescription(templateDescription: String) {
    cdkBuilder.templateDescription(templateDescription)
  }

  public fun templateName(templateName: String) {
    cdkBuilder.templateName(templateName)
  }

  public fun build(): CfnPushTemplateProps = cdkBuilder.build()
}
