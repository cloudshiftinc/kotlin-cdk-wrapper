@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.qbusiness

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates an Amazon Q Business web experience.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.qbusiness.*;
 * CfnWebExperience cfnWebExperience = CfnWebExperience.Builder.create(this, "MyCfnWebExperience")
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
public open class CfnWebExperience(
  cdkObject: software.amazon.awscdk.services.qbusiness.CfnWebExperience,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnWebExperienceProps,
  ) :
      this(software.amazon.awscdk.services.qbusiness.CfnWebExperience(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnWebExperienceProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnWebExperienceProps.Builder.() -> Unit,
  ) : this(scope, id, CfnWebExperienceProps(props)
  )

  /**
   * The identifier of the Amazon Q Business web experience.
   */
  public open fun applicationId(): String = unwrap(this).getApplicationId()

  /**
   * The identifier of the Amazon Q Business web experience.
   */
  public open fun applicationId(`value`: String) {
    unwrap(this).setApplicationId(`value`)
  }

  /**
   * The Unix timestamp when the Amazon Q Business application was last updated.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The endpoint URLs for your Amazon Q Business web experience.
   *
   * The URLs are unique and fully hosted by AWS .
   */
  public open fun attrDefaultEndpoint(): String = unwrap(this).getAttrDefaultEndpoint()

  /**
   * The status of your Amazon Q Business web experience.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * The Unix timestamp when your Amazon Q Business web experience was updated.
   */
  public open fun attrUpdatedAt(): String = unwrap(this).getAttrUpdatedAt()

  /**
   * The Amazon Resource Name (ARN) of an Amazon Q Business web experience.
   */
  public open fun attrWebExperienceArn(): String = unwrap(this).getAttrWebExperienceArn()

  /**
   * The identifier of your Amazon Q Business web experience.
   */
  public open fun attrWebExperienceId(): String = unwrap(this).getAttrWebExperienceId()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The Amazon Resource Name (ARN) of the service role attached to your web experience.
   */
  public open fun roleArn(): String? = unwrap(this).getRoleArn()

  /**
   * The Amazon Resource Name (ARN) of the service role attached to your web experience.
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * Determines whether sample prompts are enabled in the web experience for an end user.
   */
  public open fun samplePromptsControlMode(): String? = unwrap(this).getSamplePromptsControlMode()

  /**
   * Determines whether sample prompts are enabled in the web experience for an end user.
   */
  public open fun samplePromptsControlMode(`value`: String) {
    unwrap(this).setSamplePromptsControlMode(`value`)
  }

  /**
   * A subtitle to personalize your Amazon Q Business web experience.
   */
  public open fun subtitle(): String? = unwrap(this).getSubtitle()

  /**
   * A subtitle to personalize your Amazon Q Business web experience.
   */
  public open fun subtitle(`value`: String) {
    unwrap(this).setSubtitle(`value`)
  }

  /**
   * A list of key-value pairs that identify or categorize your Amazon Q Business web experience.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A list of key-value pairs that identify or categorize your Amazon Q Business web experience.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * A list of key-value pairs that identify or categorize your Amazon Q Business web experience.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * The title for your Amazon Q Business web experience.
   */
  public open fun title(): String? = unwrap(this).getTitle()

  /**
   * The title for your Amazon Q Business web experience.
   */
  public open fun title(`value`: String) {
    unwrap(this).setTitle(`value`)
  }

  /**
   * A message in an Amazon Q Business web experience.
   */
  public open fun welcomeMessage(): String? = unwrap(this).getWelcomeMessage()

  /**
   * A message in an Amazon Q Business web experience.
   */
  public open fun welcomeMessage(`value`: String) {
    unwrap(this).setWelcomeMessage(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.qbusiness.CfnWebExperience].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The identifier of the Amazon Q Business web experience.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-applicationid)
     * @param applicationId The identifier of the Amazon Q Business web experience. 
     */
    public fun applicationId(applicationId: String)

    /**
     * The Amazon Resource Name (ARN) of the service role attached to your web experience.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of the service role attached to your web
     * experience. 
     */
    public fun roleArn(roleArn: String)

    /**
     * Determines whether sample prompts are enabled in the web experience for an end user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-samplepromptscontrolmode)
     * @param samplePromptsControlMode Determines whether sample prompts are enabled in the web
     * experience for an end user. 
     */
    public fun samplePromptsControlMode(samplePromptsControlMode: String)

    /**
     * A subtitle to personalize your Amazon Q Business web experience.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-subtitle)
     * @param subtitle A subtitle to personalize your Amazon Q Business web experience. 
     */
    public fun subtitle(subtitle: String)

    /**
     * A list of key-value pairs that identify or categorize your Amazon Q Business web experience.
     *
     * You can also use tags to help control access to the web experience. Tag keys and values can
     * consist of Unicode letters, digits, white space, and any of the following symbols: _ . : / = + -
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-tags)
     * @param tags A list of key-value pairs that identify or categorize your Amazon Q Business web
     * experience. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A list of key-value pairs that identify or categorize your Amazon Q Business web experience.
     *
     * You can also use tags to help control access to the web experience. Tag keys and values can
     * consist of Unicode letters, digits, white space, and any of the following symbols: _ . : / = + -
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-tags)
     * @param tags A list of key-value pairs that identify or categorize your Amazon Q Business web
     * experience. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The title for your Amazon Q Business web experience.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-title)
     * @param title The title for your Amazon Q Business web experience. 
     */
    public fun title(title: String)

    /**
     * A message in an Amazon Q Business web experience.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-welcomemessage)
     * @param welcomeMessage A message in an Amazon Q Business web experience. 
     */
    public fun welcomeMessage(welcomeMessage: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.qbusiness.CfnWebExperience.Builder =
        software.amazon.awscdk.services.qbusiness.CfnWebExperience.Builder.create(scope, id)

    /**
     * The identifier of the Amazon Q Business web experience.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-applicationid)
     * @param applicationId The identifier of the Amazon Q Business web experience. 
     */
    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    /**
     * The Amazon Resource Name (ARN) of the service role attached to your web experience.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of the service role attached to your web
     * experience. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * Determines whether sample prompts are enabled in the web experience for an end user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-samplepromptscontrolmode)
     * @param samplePromptsControlMode Determines whether sample prompts are enabled in the web
     * experience for an end user. 
     */
    override fun samplePromptsControlMode(samplePromptsControlMode: String) {
      cdkBuilder.samplePromptsControlMode(samplePromptsControlMode)
    }

    /**
     * A subtitle to personalize your Amazon Q Business web experience.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-subtitle)
     * @param subtitle A subtitle to personalize your Amazon Q Business web experience. 
     */
    override fun subtitle(subtitle: String) {
      cdkBuilder.subtitle(subtitle)
    }

    /**
     * A list of key-value pairs that identify or categorize your Amazon Q Business web experience.
     *
     * You can also use tags to help control access to the web experience. Tag keys and values can
     * consist of Unicode letters, digits, white space, and any of the following symbols: _ . : / = + -
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-tags)
     * @param tags A list of key-value pairs that identify or categorize your Amazon Q Business web
     * experience. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * A list of key-value pairs that identify or categorize your Amazon Q Business web experience.
     *
     * You can also use tags to help control access to the web experience. Tag keys and values can
     * consist of Unicode letters, digits, white space, and any of the following symbols: _ . : / = + -
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-tags)
     * @param tags A list of key-value pairs that identify or categorize your Amazon Q Business web
     * experience. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The title for your Amazon Q Business web experience.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-title)
     * @param title The title for your Amazon Q Business web experience. 
     */
    override fun title(title: String) {
      cdkBuilder.title(title)
    }

    /**
     * A message in an Amazon Q Business web experience.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-webexperience.html#cfn-qbusiness-webexperience-welcomemessage)
     * @param welcomeMessage A message in an Amazon Q Business web experience. 
     */
    override fun welcomeMessage(welcomeMessage: String) {
      cdkBuilder.welcomeMessage(welcomeMessage)
    }

    public fun build(): software.amazon.awscdk.services.qbusiness.CfnWebExperience =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.qbusiness.CfnWebExperience.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnWebExperience {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnWebExperience(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.qbusiness.CfnWebExperience):
        CfnWebExperience = CfnWebExperience(cdkObject)

    internal fun unwrap(wrapped: CfnWebExperience):
        software.amazon.awscdk.services.qbusiness.CfnWebExperience = wrapped.cdkObject as
        software.amazon.awscdk.services.qbusiness.CfnWebExperience
  }
}
