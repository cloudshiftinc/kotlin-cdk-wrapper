@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.qbusiness

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnWebExperience`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.qbusiness.*;
 * CfnWebExperienceProps cfnWebExperienceProps = CfnWebExperienceProps.builder()
 * .applicationId("applicationId")
 * // the properties below are optional
 * .roleArn("roleArn")
 * .samplePromptsControlMode("samplePromptsControlMode")
 * .subtitle("subtitle")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .title("title")
 * .welcomeMessage("welcomeMessage")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html)
 */
public interface CfnWebExperienceProps {
  /**
   * The identifier of the Amazon Q Business web experience.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-applicationid)
   */
  public fun applicationId(): String

  /**
   * The Amazon Resource Name (ARN) of the service role attached to your web experience.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-rolearn)
   */
  public fun roleArn(): String? = unwrap(this).getRoleArn()

  /**
   * Determines whether sample prompts are enabled in the web experience for an end user.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-samplepromptscontrolmode)
   */
  public fun samplePromptsControlMode(): String? = unwrap(this).getSamplePromptsControlMode()

  /**
   * A subtitle to personalize your Amazon Q Business web experience.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-subtitle)
   */
  public fun subtitle(): String? = unwrap(this).getSubtitle()

  /**
   * A list of key-value pairs that identify or categorize your Amazon Q Business web experience.
   *
   * You can also use tags to help control access to the web experience. Tag keys and values can
   * consist of Unicode letters, digits, white space, and any of the following symbols: _ . : / = + -
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The title for your Amazon Q Business web experience.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-title)
   */
  public fun title(): String? = unwrap(this).getTitle()

  /**
   * A message in an Amazon Q Business web experience.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-welcomemessage)
   */
  public fun welcomeMessage(): String? = unwrap(this).getWelcomeMessage()

  /**
   * A builder for [CfnWebExperienceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param applicationId The identifier of the Amazon Q Business web experience. 
     */
    public fun applicationId(applicationId: String)

    /**
     * @param roleArn The Amazon Resource Name (ARN) of the service role attached to your web
     * experience.
     */
    public fun roleArn(roleArn: String)

    /**
     * @param samplePromptsControlMode Determines whether sample prompts are enabled in the web
     * experience for an end user.
     */
    public fun samplePromptsControlMode(samplePromptsControlMode: String)

    /**
     * @param subtitle A subtitle to personalize your Amazon Q Business web experience.
     */
    public fun subtitle(subtitle: String)

    /**
     * @param tags A list of key-value pairs that identify or categorize your Amazon Q Business web
     * experience.
     * You can also use tags to help control access to the web experience. Tag keys and values can
     * consist of Unicode letters, digits, white space, and any of the following symbols: _ . : / = + -
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of key-value pairs that identify or categorize your Amazon Q Business web
     * experience.
     * You can also use tags to help control access to the web experience. Tag keys and values can
     * consist of Unicode letters, digits, white space, and any of the following symbols: _ . : / = + -
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param title The title for your Amazon Q Business web experience.
     */
    public fun title(title: String)

    /**
     * @param welcomeMessage A message in an Amazon Q Business web experience.
     */
    public fun welcomeMessage(welcomeMessage: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.qbusiness.CfnWebExperienceProps.Builder
        = software.amazon.awscdk.services.qbusiness.CfnWebExperienceProps.builder()

    /**
     * @param applicationId The identifier of the Amazon Q Business web experience. 
     */
    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    /**
     * @param roleArn The Amazon Resource Name (ARN) of the service role attached to your web
     * experience.
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param samplePromptsControlMode Determines whether sample prompts are enabled in the web
     * experience for an end user.
     */
    override fun samplePromptsControlMode(samplePromptsControlMode: String) {
      cdkBuilder.samplePromptsControlMode(samplePromptsControlMode)
    }

    /**
     * @param subtitle A subtitle to personalize your Amazon Q Business web experience.
     */
    override fun subtitle(subtitle: String) {
      cdkBuilder.subtitle(subtitle)
    }

    /**
     * @param tags A list of key-value pairs that identify or categorize your Amazon Q Business web
     * experience.
     * You can also use tags to help control access to the web experience. Tag keys and values can
     * consist of Unicode letters, digits, white space, and any of the following symbols: _ . : / = + -
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags A list of key-value pairs that identify or categorize your Amazon Q Business web
     * experience.
     * You can also use tags to help control access to the web experience. Tag keys and values can
     * consist of Unicode letters, digits, white space, and any of the following symbols: _ . : / = + -
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param title The title for your Amazon Q Business web experience.
     */
    override fun title(title: String) {
      cdkBuilder.title(title)
    }

    /**
     * @param welcomeMessage A message in an Amazon Q Business web experience.
     */
    override fun welcomeMessage(welcomeMessage: String) {
      cdkBuilder.welcomeMessage(welcomeMessage)
    }

    public fun build(): software.amazon.awscdk.services.qbusiness.CfnWebExperienceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.qbusiness.CfnWebExperienceProps,
  ) : CdkObject(cdkObject), CfnWebExperienceProps {
    /**
     * The identifier of the Amazon Q Business web experience.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-applicationid)
     */
    override fun applicationId(): String = unwrap(this).getApplicationId()

    /**
     * The Amazon Resource Name (ARN) of the service role attached to your web experience.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-rolearn)
     */
    override fun roleArn(): String? = unwrap(this).getRoleArn()

    /**
     * Determines whether sample prompts are enabled in the web experience for an end user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-samplepromptscontrolmode)
     */
    override fun samplePromptsControlMode(): String? = unwrap(this).getSamplePromptsControlMode()

    /**
     * A subtitle to personalize your Amazon Q Business web experience.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-subtitle)
     */
    override fun subtitle(): String? = unwrap(this).getSubtitle()

    /**
     * A list of key-value pairs that identify or categorize your Amazon Q Business web experience.
     *
     * You can also use tags to help control access to the web experience. Tag keys and values can
     * consist of Unicode letters, digits, white space, and any of the following symbols: _ . : / = + -
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The title for your Amazon Q Business web experience.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-title)
     */
    override fun title(): String? = unwrap(this).getTitle()

    /**
     * A message in an Amazon Q Business web experience.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-welcomemessage)
     */
    override fun welcomeMessage(): String? = unwrap(this).getWelcomeMessage()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnWebExperienceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.qbusiness.CfnWebExperienceProps):
        CfnWebExperienceProps = CdkObjectWrappers.wrap(cdkObject) as? CfnWebExperienceProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnWebExperienceProps):
        software.amazon.awscdk.services.qbusiness.CfnWebExperienceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.qbusiness.CfnWebExperienceProps
  }
}