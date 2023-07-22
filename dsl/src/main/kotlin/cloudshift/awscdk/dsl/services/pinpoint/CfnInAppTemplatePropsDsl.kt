@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnInAppTemplateProps

@CdkDslMarker
public class CfnInAppTemplatePropsDsl {
  private val cdkBuilder: CfnInAppTemplateProps.Builder = CfnInAppTemplateProps.builder()

  private val _content: MutableList<Any> = mutableListOf()

  /**
   * @param content An object that contains information about the content of an in-app message,
   * including its title and body text, text colors, background colors, images, buttons, and behaviors.
   */
  public fun content(vararg content: Any) {
    _content.addAll(listOf(*content))
  }

  /**
   * @param content An object that contains information about the content of an in-app message,
   * including its title and body text, text colors, background colors, images, buttons, and behaviors.
   */
  public fun content(content: Collection<Any>) {
    _content.addAll(content)
  }

  /**
   * @param content An object that contains information about the content of an in-app message,
   * including its title and body text, text colors, background colors, images, buttons, and behaviors.
   */
  public fun content(content: IResolvable) {
    cdkBuilder.content(content)
  }

  /**
   * @param customConfig Custom data, in the form of key-value pairs, that is included in an in-app
   * messaging payload.
   */
  public fun customConfig(customConfig: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(customConfig)
    cdkBuilder.customConfig(builder.map)
  }

  /**
   * @param customConfig Custom data, in the form of key-value pairs, that is included in an in-app
   * messaging payload.
   */
  public fun customConfig(customConfig: Any) {
    cdkBuilder.customConfig(customConfig)
  }

  /**
   * @param layout A string that determines the appearance of the in-app message. You can specify
   * one of the following:.
   * * `BOTTOM_BANNER` – a message that appears as a banner at the bottom of the page.
   * * `TOP_BANNER` – a message that appears as a banner at the top of the page.
   * * `OVERLAYS` – a message that covers entire screen.
   * * `MOBILE_FEED` – a message that appears in a window in front of the page.
   * * `MIDDLE_BANNER` – a message that appears as a banner in the middle of the page.
   * * `CAROUSEL` – a scrollable layout of up to five unique messages.
   */
  public fun layout(layout: String) {
    cdkBuilder.layout(layout)
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun tags(tags: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(tags)
    cdkBuilder.tags(builder.map)
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun tags(tags: Any) {
    cdkBuilder.tags(tags)
  }

  /**
   * @param templateDescription An optional description of the in-app template.
   */
  public fun templateDescription(templateDescription: String) {
    cdkBuilder.templateDescription(templateDescription)
  }

  /**
   * @param templateName The name of the in-app message template. 
   */
  public fun templateName(templateName: String) {
    cdkBuilder.templateName(templateName)
  }

  public fun build(): CfnInAppTemplateProps {
    if(_content.isNotEmpty()) cdkBuilder.content(_content)
    return cdkBuilder.build()
  }
}
