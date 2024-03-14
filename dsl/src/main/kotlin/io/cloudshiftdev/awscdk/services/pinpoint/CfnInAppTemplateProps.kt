package io.cloudshiftdev.awscdk.services.pinpoint

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnInAppTemplateProps {
  /**
   * An object that contains information about the content of an in-app message, including its title
   * and body text, text colors, background colors, images, buttons, and behaviors.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-inapptemplate.html#cfn-pinpoint-inapptemplate-content)
   */
  public fun content(): Any? = unwrap(this).getContent()

  /**
   * Custom data, in the form of key-value pairs, that is included in an in-app messaging payload.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-inapptemplate.html#cfn-pinpoint-inapptemplate-customconfig)
   */
  public fun customConfig(): Any? = unwrap(this).getCustomConfig()

  /**
   * A string that determines the appearance of the in-app message. You can specify one of the
   * following:.
   *
   * * `BOTTOM_BANNER` – a message that appears as a banner at the bottom of the page.
   * * `TOP_BANNER` – a message that appears as a banner at the top of the page.
   * * `OVERLAYS` – a message that covers entire screen.
   * * `MOBILE_FEED` – a message that appears in a window in front of the page.
   * * `MIDDLE_BANNER` – a message that appears as a banner in the middle of the page.
   * * `CAROUSEL` – a scrollable layout of up to five unique messages.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-inapptemplate.html#cfn-pinpoint-inapptemplate-layout)
   */
  public fun layout(): String? = unwrap(this).getLayout()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-inapptemplate.html#cfn-pinpoint-inapptemplate-tags)
   */
  public fun tags(): Any? = unwrap(this).getTags()

  /**
   * An optional description of the in-app template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-inapptemplate.html#cfn-pinpoint-inapptemplate-templatedescription)
   */
  public fun templateDescription(): String? = unwrap(this).getTemplateDescription()

  /**
   * The name of the in-app message template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-inapptemplate.html#cfn-pinpoint-inapptemplate-templatename)
   */
  public fun templateName(): String

  /**
   * A builder for [CfnInAppTemplateProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param content An object that contains information about the content of an in-app message,
     * including its title and body text, text colors, background colors, images, buttons, and
     * behaviors.
     */
    public fun content(content: IResolvable)

    /**
     * @param content An object that contains information about the content of an in-app message,
     * including its title and body text, text colors, background colors, images, buttons, and
     * behaviors.
     */
    public fun content(content: List<Any>)

    /**
     * @param content An object that contains information about the content of an in-app message,
     * including its title and body text, text colors, background colors, images, buttons, and
     * behaviors.
     */
    public fun content(vararg content: Any)

    /**
     * @param customConfig Custom data, in the form of key-value pairs, that is included in an
     * in-app messaging payload.
     */
    public fun customConfig(customConfig: Any)

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
    public fun layout(layout: String)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: Any)

    /**
     * @param templateDescription An optional description of the in-app template.
     */
    public fun templateDescription(templateDescription: String)

    /**
     * @param templateName The name of the in-app message template. 
     */
    public fun templateName(templateName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pinpoint.CfnInAppTemplateProps.Builder =
        software.amazon.awscdk.services.pinpoint.CfnInAppTemplateProps.builder()

    /**
     * @param content An object that contains information about the content of an in-app message,
     * including its title and body text, text colors, background colors, images, buttons, and
     * behaviors.
     */
    override fun content(content: IResolvable) {
      cdkBuilder.content(content.let(IResolvable::unwrap))
    }

    /**
     * @param content An object that contains information about the content of an in-app message,
     * including its title and body text, text colors, background colors, images, buttons, and
     * behaviors.
     */
    override fun content(content: List<Any>) {
      cdkBuilder.content(content)
    }

    /**
     * @param content An object that contains information about the content of an in-app message,
     * including its title and body text, text colors, background colors, images, buttons, and
     * behaviors.
     */
    override fun content(vararg content: Any): Unit = content(content.toList())

    /**
     * @param customConfig Custom data, in the form of key-value pairs, that is included in an
     * in-app messaging payload.
     */
    override fun customConfig(customConfig: Any) {
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
    override fun layout(layout: String) {
      cdkBuilder.layout(layout)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param templateDescription An optional description of the in-app template.
     */
    override fun templateDescription(templateDescription: String) {
      cdkBuilder.templateDescription(templateDescription)
    }

    /**
     * @param templateName The name of the in-app message template. 
     */
    override fun templateName(templateName: String) {
      cdkBuilder.templateName(templateName)
    }

    public fun build(): software.amazon.awscdk.services.pinpoint.CfnInAppTemplateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.pinpoint.CfnInAppTemplateProps,
  ) : CdkObject(cdkObject), CfnInAppTemplateProps {
    /**
     * An object that contains information about the content of an in-app message, including its
     * title and body text, text colors, background colors, images, buttons, and behaviors.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-inapptemplate.html#cfn-pinpoint-inapptemplate-content)
     */
    override fun content(): Any? = unwrap(this).getContent()

    /**
     * Custom data, in the form of key-value pairs, that is included in an in-app messaging payload.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-inapptemplate.html#cfn-pinpoint-inapptemplate-customconfig)
     */
    override fun customConfig(): Any? = unwrap(this).getCustomConfig()

    /**
     * A string that determines the appearance of the in-app message. You can specify one of the
     * following:.
     *
     * * `BOTTOM_BANNER` – a message that appears as a banner at the bottom of the page.
     * * `TOP_BANNER` – a message that appears as a banner at the top of the page.
     * * `OVERLAYS` – a message that covers entire screen.
     * * `MOBILE_FEED` – a message that appears in a window in front of the page.
     * * `MIDDLE_BANNER` – a message that appears as a banner in the middle of the page.
     * * `CAROUSEL` – a scrollable layout of up to five unique messages.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-inapptemplate.html#cfn-pinpoint-inapptemplate-layout)
     */
    override fun layout(): String? = unwrap(this).getLayout()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-inapptemplate.html#cfn-pinpoint-inapptemplate-tags)
     */
    override fun tags(): Any? = unwrap(this).getTags()

    /**
     * An optional description of the in-app template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-inapptemplate.html#cfn-pinpoint-inapptemplate-templatedescription)
     */
    override fun templateDescription(): String? = unwrap(this).getTemplateDescription()

    /**
     * The name of the in-app message template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-inapptemplate.html#cfn-pinpoint-inapptemplate-templatename)
     */
    override fun templateName(): String = unwrap(this).getTemplateName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnInAppTemplateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnInAppTemplateProps):
        CfnInAppTemplateProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnInAppTemplateProps):
        software.amazon.awscdk.services.pinpoint.CfnInAppTemplateProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.pinpoint.CfnInAppTemplateProps
  }
}
