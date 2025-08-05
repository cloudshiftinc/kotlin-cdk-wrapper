@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.wisdom

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates an Amazon Q in Connect quick response.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.wisdom.*;
 * CfnQuickResponse cfnQuickResponse = CfnQuickResponse.Builder.create(this, "MyCfnQuickResponse")
 * .content(QuickResponseContentProviderProperty.builder()
 * .content("content")
 * .build())
 * .knowledgeBaseArn("knowledgeBaseArn")
 * .name("name")
 * // the properties below are optional
 * .channels(List.of("channels"))
 * .contentType("contentType")
 * .description("description")
 * .groupingConfiguration(GroupingConfigurationProperty.builder()
 * .criteria("criteria")
 * .values(List.of("values"))
 * .build())
 * .isActive(false)
 * .language("language")
 * .shortcutKey("shortcutKey")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-quickresponse.html)
 */
public open class CfnQuickResponse(
  cdkObject: software.amazon.awscdk.services.wisdom.CfnQuickResponse,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnQuickResponseProps,
  ) :
      this(software.amazon.awscdk.services.wisdom.CfnQuickResponse(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnQuickResponseProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnQuickResponseProps.Builder.() -> Unit,
  ) : this(scope, id, CfnQuickResponseProps(props)
  )

  /**
   * The content of the quick response stored in different media types.
   */
  public open fun attrContents(): IResolvable =
      unwrap(this).getAttrContents().let(IResolvable::wrap)

  /**
   * The Amazon Resource Name (ARN) of the quick response.
   */
  public open fun attrQuickResponseArn(): String = unwrap(this).getAttrQuickResponseArn()

  /**
   * The identifier of the quick response.
   */
  public open fun attrQuickResponseId(): String = unwrap(this).getAttrQuickResponseId()

  /**
   * The status of the quick response data.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The Amazon Connect contact channels this quick response applies to.
   */
  public open fun channels(): List<String> = unwrap(this).getChannels() ?: emptyList()

  /**
   * The Amazon Connect contact channels this quick response applies to.
   */
  public open fun channels(`value`: List<String>) {
    unwrap(this).setChannels(`value`)
  }

  /**
   * The Amazon Connect contact channels this quick response applies to.
   */
  public open fun channels(vararg `value`: String): Unit = channels(`value`.toList())

  /**
   * The content of the quick response.
   */
  public open fun content(): Any = unwrap(this).getContent()

  /**
   * The content of the quick response.
   */
  public open fun content(`value`: IResolvable) {
    unwrap(this).setContent(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The content of the quick response.
   */
  public open fun content(`value`: QuickResponseContentProviderProperty) {
    unwrap(this).setContent(`value`.let(QuickResponseContentProviderProperty.Companion::unwrap))
  }

  /**
   * The content of the quick response.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("41b56e14fd44c3da977771fd67af8c1b55cb4e8a9911c517d58dfd2d79356509")
  public open fun content(`value`: QuickResponseContentProviderProperty.Builder.() -> Unit): Unit =
      content(QuickResponseContentProviderProperty(`value`))

  /**
   * The media type of the quick response content.
   */
  public open fun contentType(): String? = unwrap(this).getContentType()

  /**
   * The media type of the quick response content.
   */
  public open fun contentType(`value`: String) {
    unwrap(this).setContentType(`value`)
  }

  /**
   * The description of the quick response.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the quick response.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The configuration information of the user groups that the quick response is accessible to.
   */
  public open fun groupingConfiguration(): Any? = unwrap(this).getGroupingConfiguration()

  /**
   * The configuration information of the user groups that the quick response is accessible to.
   */
  public open fun groupingConfiguration(`value`: IResolvable) {
    unwrap(this).setGroupingConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The configuration information of the user groups that the quick response is accessible to.
   */
  public open fun groupingConfiguration(`value`: GroupingConfigurationProperty) {
    unwrap(this).setGroupingConfiguration(`value`.let(GroupingConfigurationProperty.Companion::unwrap))
  }

  /**
   * The configuration information of the user groups that the quick response is accessible to.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4e547908c85192c8404c76b12f8717f615dc0992331071e3f6835a87654fcc82")
  public open fun groupingConfiguration(`value`: GroupingConfigurationProperty.Builder.() -> Unit):
      Unit = groupingConfiguration(GroupingConfigurationProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Whether the quick response is active.
   */
  public open fun isActive(): Any? = unwrap(this).getIsActive()

  /**
   * Whether the quick response is active.
   */
  public open fun isActive(`value`: Boolean) {
    unwrap(this).setIsActive(`value`)
  }

  /**
   * Whether the quick response is active.
   */
  public open fun isActive(`value`: IResolvable) {
    unwrap(this).setIsActive(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The Amazon Resource Name (ARN) of the knowledge base.
   */
  public open fun knowledgeBaseArn(): String = unwrap(this).getKnowledgeBaseArn()

  /**
   * The Amazon Resource Name (ARN) of the knowledge base.
   */
  public open fun knowledgeBaseArn(`value`: String) {
    unwrap(this).setKnowledgeBaseArn(`value`)
  }

  /**
   * The language code value for the language in which the quick response is written.
   */
  public open fun language(): String? = unwrap(this).getLanguage()

  /**
   * The language code value for the language in which the quick response is written.
   */
  public open fun language(`value`: String) {
    unwrap(this).setLanguage(`value`)
  }

  /**
   * The name of the quick response.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the quick response.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The shortcut key of the quick response.
   */
  public open fun shortcutKey(): String? = unwrap(this).getShortcutKey()

  /**
   * The shortcut key of the quick response.
   */
  public open fun shortcutKey(`value`: String) {
    unwrap(this).setShortcutKey(`value`)
  }

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.wisdom.CfnQuickResponse].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon Connect contact channels this quick response applies to.
     *
     * The supported contact channel types include `Chat` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-quickresponse.html#cfn-wisdom-quickresponse-channels)
     * @param channels The Amazon Connect contact channels this quick response applies to. 
     */
    public fun channels(channels: List<String>)

    /**
     * The Amazon Connect contact channels this quick response applies to.
     *
     * The supported contact channel types include `Chat` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-quickresponse.html#cfn-wisdom-quickresponse-channels)
     * @param channels The Amazon Connect contact channels this quick response applies to. 
     */
    public fun channels(vararg channels: String)

    /**
     * The content of the quick response.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-quickresponse.html#cfn-wisdom-quickresponse-content)
     * @param content The content of the quick response. 
     */
    public fun content(content: IResolvable)

    /**
     * The content of the quick response.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-quickresponse.html#cfn-wisdom-quickresponse-content)
     * @param content The content of the quick response. 
     */
    public fun content(content: QuickResponseContentProviderProperty)

    /**
     * The content of the quick response.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-quickresponse.html#cfn-wisdom-quickresponse-content)
     * @param content The content of the quick response. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3b71b22d42063952899f13e2c70a230ce6193348fe5b9279a2681a23243d4fa1")
    public fun content(content: QuickResponseContentProviderProperty.Builder.() -> Unit)

    /**
     * The media type of the quick response content.
     *
     * * Use `application/x.quickresponse;format=plain` for quick response written in plain text.
     * * Use `application/x.quickresponse;format=markdown` for quick response written in richtext.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-quickresponse.html#cfn-wisdom-quickresponse-contenttype)
     * @param contentType The media type of the quick response content. 
     */
    public fun contentType(contentType: String)

    /**
     * The description of the quick response.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-quickresponse.html#cfn-wisdom-quickresponse-description)
     * @param description The description of the quick response. 
     */
    public fun description(description: String)

    /**
     * The configuration information of the user groups that the quick response is accessible to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-quickresponse.html#cfn-wisdom-quickresponse-groupingconfiguration)
     * @param groupingConfiguration The configuration information of the user groups that the quick
     * response is accessible to. 
     */
    public fun groupingConfiguration(groupingConfiguration: IResolvable)

    /**
     * The configuration information of the user groups that the quick response is accessible to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-quickresponse.html#cfn-wisdom-quickresponse-groupingconfiguration)
     * @param groupingConfiguration The configuration information of the user groups that the quick
     * response is accessible to. 
     */
    public fun groupingConfiguration(groupingConfiguration: GroupingConfigurationProperty)

    /**
     * The configuration information of the user groups that the quick response is accessible to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-quickresponse.html#cfn-wisdom-quickresponse-groupingconfiguration)
     * @param groupingConfiguration The configuration information of the user groups that the quick
     * response is accessible to. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4a371295be9adf65226514b43948c50c6472528101859577b10dcd839de49f49")
    public
        fun groupingConfiguration(groupingConfiguration: GroupingConfigurationProperty.Builder.() -> Unit)

    /**
     * Whether the quick response is active.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-quickresponse.html#cfn-wisdom-quickresponse-isactive)
     * @param isActive Whether the quick response is active. 
     */
    public fun isActive(isActive: Boolean)

    /**
     * Whether the quick response is active.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-quickresponse.html#cfn-wisdom-quickresponse-isactive)
     * @param isActive Whether the quick response is active. 
     */
    public fun isActive(isActive: IResolvable)

    /**
     * The Amazon Resource Name (ARN) of the knowledge base.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-quickresponse.html#cfn-wisdom-quickresponse-knowledgebasearn)
     * @param knowledgeBaseArn The Amazon Resource Name (ARN) of the knowledge base. 
     */
    public fun knowledgeBaseArn(knowledgeBaseArn: String)

    /**
     * The language code value for the language in which the quick response is written.
     *
     * The supported language codes include `de_DE` , `en_US` , `es_ES` , `fr_FR` , `id_ID` ,
     * `it_IT` , `ja_JP` , `ko_KR` , `pt_BR` , `zh_CN` , `zh_TW`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-quickresponse.html#cfn-wisdom-quickresponse-language)
     * @param language The language code value for the language in which the quick response is
     * written. 
     */
    public fun language(language: String)

    /**
     * The name of the quick response.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-quickresponse.html#cfn-wisdom-quickresponse-name)
     * @param name The name of the quick response. 
     */
    public fun name(name: String)

    /**
     * The shortcut key of the quick response.
     *
     * The value should be unique across the knowledge base.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-quickresponse.html#cfn-wisdom-quickresponse-shortcutkey)
     * @param shortcutKey The shortcut key of the quick response. 
     */
    public fun shortcutKey(shortcutKey: String)

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-quickresponse.html#cfn-wisdom-quickresponse-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-quickresponse.html#cfn-wisdom-quickresponse-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.wisdom.CfnQuickResponse.Builder =
        software.amazon.awscdk.services.wisdom.CfnQuickResponse.Builder.create(scope, id)

    /**
     * The Amazon Connect contact channels this quick response applies to.
     *
     * The supported contact channel types include `Chat` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-quickresponse.html#cfn-wisdom-quickresponse-channels)
     * @param channels The Amazon Connect contact channels this quick response applies to. 
     */
    override fun channels(channels: List<String>) {
      cdkBuilder.channels(channels)
    }

    /**
     * The Amazon Connect contact channels this quick response applies to.
     *
     * The supported contact channel types include `Chat` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-quickresponse.html#cfn-wisdom-quickresponse-channels)
     * @param channels The Amazon Connect contact channels this quick response applies to. 
     */
    override fun channels(vararg channels: String): Unit = channels(channels.toList())

    /**
     * The content of the quick response.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-quickresponse.html#cfn-wisdom-quickresponse-content)
     * @param content The content of the quick response. 
     */
    override fun content(content: IResolvable) {
      cdkBuilder.content(content.let(IResolvable.Companion::unwrap))
    }

    /**
     * The content of the quick response.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-quickresponse.html#cfn-wisdom-quickresponse-content)
     * @param content The content of the quick response. 
     */
    override fun content(content: QuickResponseContentProviderProperty) {
      cdkBuilder.content(content.let(QuickResponseContentProviderProperty.Companion::unwrap))
    }

    /**
     * The content of the quick response.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-quickresponse.html#cfn-wisdom-quickresponse-content)
     * @param content The content of the quick response. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3b71b22d42063952899f13e2c70a230ce6193348fe5b9279a2681a23243d4fa1")
    override fun content(content: QuickResponseContentProviderProperty.Builder.() -> Unit): Unit =
        content(QuickResponseContentProviderProperty(content))

    /**
     * The media type of the quick response content.
     *
     * * Use `application/x.quickresponse;format=plain` for quick response written in plain text.
     * * Use `application/x.quickresponse;format=markdown` for quick response written in richtext.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-quickresponse.html#cfn-wisdom-quickresponse-contenttype)
     * @param contentType The media type of the quick response content. 
     */
    override fun contentType(contentType: String) {
      cdkBuilder.contentType(contentType)
    }

    /**
     * The description of the quick response.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-quickresponse.html#cfn-wisdom-quickresponse-description)
     * @param description The description of the quick response. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The configuration information of the user groups that the quick response is accessible to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-quickresponse.html#cfn-wisdom-quickresponse-groupingconfiguration)
     * @param groupingConfiguration The configuration information of the user groups that the quick
     * response is accessible to. 
     */
    override fun groupingConfiguration(groupingConfiguration: IResolvable) {
      cdkBuilder.groupingConfiguration(groupingConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * The configuration information of the user groups that the quick response is accessible to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-quickresponse.html#cfn-wisdom-quickresponse-groupingconfiguration)
     * @param groupingConfiguration The configuration information of the user groups that the quick
     * response is accessible to. 
     */
    override fun groupingConfiguration(groupingConfiguration: GroupingConfigurationProperty) {
      cdkBuilder.groupingConfiguration(groupingConfiguration.let(GroupingConfigurationProperty.Companion::unwrap))
    }

    /**
     * The configuration information of the user groups that the quick response is accessible to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-quickresponse.html#cfn-wisdom-quickresponse-groupingconfiguration)
     * @param groupingConfiguration The configuration information of the user groups that the quick
     * response is accessible to. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4a371295be9adf65226514b43948c50c6472528101859577b10dcd839de49f49")
    override
        fun groupingConfiguration(groupingConfiguration: GroupingConfigurationProperty.Builder.() -> Unit):
        Unit = groupingConfiguration(GroupingConfigurationProperty(groupingConfiguration))

    /**
     * Whether the quick response is active.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-quickresponse.html#cfn-wisdom-quickresponse-isactive)
     * @param isActive Whether the quick response is active. 
     */
    override fun isActive(isActive: Boolean) {
      cdkBuilder.isActive(isActive)
    }

    /**
     * Whether the quick response is active.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-quickresponse.html#cfn-wisdom-quickresponse-isactive)
     * @param isActive Whether the quick response is active. 
     */
    override fun isActive(isActive: IResolvable) {
      cdkBuilder.isActive(isActive.let(IResolvable.Companion::unwrap))
    }

    /**
     * The Amazon Resource Name (ARN) of the knowledge base.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-quickresponse.html#cfn-wisdom-quickresponse-knowledgebasearn)
     * @param knowledgeBaseArn The Amazon Resource Name (ARN) of the knowledge base. 
     */
    override fun knowledgeBaseArn(knowledgeBaseArn: String) {
      cdkBuilder.knowledgeBaseArn(knowledgeBaseArn)
    }

    /**
     * The language code value for the language in which the quick response is written.
     *
     * The supported language codes include `de_DE` , `en_US` , `es_ES` , `fr_FR` , `id_ID` ,
     * `it_IT` , `ja_JP` , `ko_KR` , `pt_BR` , `zh_CN` , `zh_TW`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-quickresponse.html#cfn-wisdom-quickresponse-language)
     * @param language The language code value for the language in which the quick response is
     * written. 
     */
    override fun language(language: String) {
      cdkBuilder.language(language)
    }

    /**
     * The name of the quick response.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-quickresponse.html#cfn-wisdom-quickresponse-name)
     * @param name The name of the quick response. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The shortcut key of the quick response.
     *
     * The value should be unique across the knowledge base.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-quickresponse.html#cfn-wisdom-quickresponse-shortcutkey)
     * @param shortcutKey The shortcut key of the quick response. 
     */
    override fun shortcutKey(shortcutKey: String) {
      cdkBuilder.shortcutKey(shortcutKey)
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-quickresponse.html#cfn-wisdom-quickresponse-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-quickresponse.html#cfn-wisdom-quickresponse-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.wisdom.CfnQuickResponse = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.wisdom.CfnQuickResponse.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnQuickResponse {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnQuickResponse(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnQuickResponse):
        CfnQuickResponse = CfnQuickResponse(cdkObject)

    internal fun unwrap(wrapped: CfnQuickResponse):
        software.amazon.awscdk.services.wisdom.CfnQuickResponse = wrapped.cdkObject as
        software.amazon.awscdk.services.wisdom.CfnQuickResponse
  }

  /**
   * The configuration information of the grouping of Amazon Q in Connect users.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.wisdom.*;
   * GroupingConfigurationProperty groupingConfigurationProperty =
   * GroupingConfigurationProperty.builder()
   * .criteria("criteria")
   * .values(List.of("values"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-quickresponse-groupingconfiguration.html)
   */
  public interface GroupingConfigurationProperty {
    /**
     * The criteria used for grouping Amazon Q in Connect users.
     *
     * The following is the list of supported criteria values.
     *
     * * `RoutingProfileArn` : Grouping the users by their [Amazon Connect routing profile
     * ARN](https://docs.aws.amazon.com/connect/latest/APIReference/API_RoutingProfile.html) . User
     * should have
     * [SearchRoutingProfile](https://docs.aws.amazon.com/connect/latest/APIReference/API_SearchRoutingProfiles.html)
     * and
     * [DescribeRoutingProfile](https://docs.aws.amazon.com/connect/latest/APIReference/API_DescribeRoutingProfile.html)
     * permissions when setting criteria to this value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-quickresponse-groupingconfiguration.html#cfn-wisdom-quickresponse-groupingconfiguration-criteria)
     */
    public fun criteria(): String

    /**
     * The list of values that define different groups of Amazon Q in Connect users.
     *
     * * When setting `criteria` to `RoutingProfileArn` , you need to provide a list of ARNs of
     * [Amazon Connect routing
     * profiles](https://docs.aws.amazon.com/connect/latest/APIReference/API_RoutingProfile.html) as
     * values of this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-quickresponse-groupingconfiguration.html#cfn-wisdom-quickresponse-groupingconfiguration-values)
     */
    public fun values(): List<String>

    /**
     * A builder for [GroupingConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param criteria The criteria used for grouping Amazon Q in Connect users. 
       * The following is the list of supported criteria values.
       *
       * * `RoutingProfileArn` : Grouping the users by their [Amazon Connect routing profile
       * ARN](https://docs.aws.amazon.com/connect/latest/APIReference/API_RoutingProfile.html) . User
       * should have
       * [SearchRoutingProfile](https://docs.aws.amazon.com/connect/latest/APIReference/API_SearchRoutingProfiles.html)
       * and
       * [DescribeRoutingProfile](https://docs.aws.amazon.com/connect/latest/APIReference/API_DescribeRoutingProfile.html)
       * permissions when setting criteria to this value.
       */
      public fun criteria(criteria: String)

      /**
       * @param values The list of values that define different groups of Amazon Q in Connect users.
       * 
       * * When setting `criteria` to `RoutingProfileArn` , you need to provide a list of ARNs of
       * [Amazon Connect routing
       * profiles](https://docs.aws.amazon.com/connect/latest/APIReference/API_RoutingProfile.html) as
       * values of this parameter.
       */
      public fun values(values: List<String>)

      /**
       * @param values The list of values that define different groups of Amazon Q in Connect users.
       * 
       * * When setting `criteria` to `RoutingProfileArn` , you need to provide a list of ARNs of
       * [Amazon Connect routing
       * profiles](https://docs.aws.amazon.com/connect/latest/APIReference/API_RoutingProfile.html) as
       * values of this parameter.
       */
      public fun values(vararg values: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wisdom.CfnQuickResponse.GroupingConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.wisdom.CfnQuickResponse.GroupingConfigurationProperty.builder()

      /**
       * @param criteria The criteria used for grouping Amazon Q in Connect users. 
       * The following is the list of supported criteria values.
       *
       * * `RoutingProfileArn` : Grouping the users by their [Amazon Connect routing profile
       * ARN](https://docs.aws.amazon.com/connect/latest/APIReference/API_RoutingProfile.html) . User
       * should have
       * [SearchRoutingProfile](https://docs.aws.amazon.com/connect/latest/APIReference/API_SearchRoutingProfiles.html)
       * and
       * [DescribeRoutingProfile](https://docs.aws.amazon.com/connect/latest/APIReference/API_DescribeRoutingProfile.html)
       * permissions when setting criteria to this value.
       */
      override fun criteria(criteria: String) {
        cdkBuilder.criteria(criteria)
      }

      /**
       * @param values The list of values that define different groups of Amazon Q in Connect users.
       * 
       * * When setting `criteria` to `RoutingProfileArn` , you need to provide a list of ARNs of
       * [Amazon Connect routing
       * profiles](https://docs.aws.amazon.com/connect/latest/APIReference/API_RoutingProfile.html) as
       * values of this parameter.
       */
      override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      /**
       * @param values The list of values that define different groups of Amazon Q in Connect users.
       * 
       * * When setting `criteria` to `RoutingProfileArn` , you need to provide a list of ARNs of
       * [Amazon Connect routing
       * profiles](https://docs.aws.amazon.com/connect/latest/APIReference/API_RoutingProfile.html) as
       * values of this parameter.
       */
      override fun values(vararg values: String): Unit = values(values.toList())

      public fun build():
          software.amazon.awscdk.services.wisdom.CfnQuickResponse.GroupingConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.wisdom.CfnQuickResponse.GroupingConfigurationProperty,
    ) : CdkObject(cdkObject),
        GroupingConfigurationProperty {
      /**
       * The criteria used for grouping Amazon Q in Connect users.
       *
       * The following is the list of supported criteria values.
       *
       * * `RoutingProfileArn` : Grouping the users by their [Amazon Connect routing profile
       * ARN](https://docs.aws.amazon.com/connect/latest/APIReference/API_RoutingProfile.html) . User
       * should have
       * [SearchRoutingProfile](https://docs.aws.amazon.com/connect/latest/APIReference/API_SearchRoutingProfiles.html)
       * and
       * [DescribeRoutingProfile](https://docs.aws.amazon.com/connect/latest/APIReference/API_DescribeRoutingProfile.html)
       * permissions when setting criteria to this value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-quickresponse-groupingconfiguration.html#cfn-wisdom-quickresponse-groupingconfiguration-criteria)
       */
      override fun criteria(): String = unwrap(this).getCriteria()

      /**
       * The list of values that define different groups of Amazon Q in Connect users.
       *
       * * When setting `criteria` to `RoutingProfileArn` , you need to provide a list of ARNs of
       * [Amazon Connect routing
       * profiles](https://docs.aws.amazon.com/connect/latest/APIReference/API_RoutingProfile.html) as
       * values of this parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-quickresponse-groupingconfiguration.html#cfn-wisdom-quickresponse-groupingconfiguration-values)
       */
      override fun values(): List<String> = unwrap(this).getValues()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GroupingConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnQuickResponse.GroupingConfigurationProperty):
          GroupingConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          GroupingConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: GroupingConfigurationProperty):
          software.amazon.awscdk.services.wisdom.CfnQuickResponse.GroupingConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wisdom.CfnQuickResponse.GroupingConfigurationProperty
    }
  }

  /**
   * The container quick response content.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.wisdom.*;
   * QuickResponseContentProviderProperty quickResponseContentProviderProperty =
   * QuickResponseContentProviderProperty.builder()
   * .content("content")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-quickresponse-quickresponsecontentprovider.html)
   */
  public interface QuickResponseContentProviderProperty {
    /**
     * The content of the quick response.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-quickresponse-quickresponsecontentprovider.html#cfn-wisdom-quickresponse-quickresponsecontentprovider-content)
     */
    public fun content(): String? = unwrap(this).getContent()

    /**
     * A builder for [QuickResponseContentProviderProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param content The content of the quick response.
       */
      public fun content(content: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wisdom.CfnQuickResponse.QuickResponseContentProviderProperty.Builder
          =
          software.amazon.awscdk.services.wisdom.CfnQuickResponse.QuickResponseContentProviderProperty.builder()

      /**
       * @param content The content of the quick response.
       */
      override fun content(content: String) {
        cdkBuilder.content(content)
      }

      public fun build():
          software.amazon.awscdk.services.wisdom.CfnQuickResponse.QuickResponseContentProviderProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.wisdom.CfnQuickResponse.QuickResponseContentProviderProperty,
    ) : CdkObject(cdkObject),
        QuickResponseContentProviderProperty {
      /**
       * The content of the quick response.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-quickresponse-quickresponsecontentprovider.html#cfn-wisdom-quickresponse-quickresponsecontentprovider-content)
       */
      override fun content(): String? = unwrap(this).getContent()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          QuickResponseContentProviderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnQuickResponse.QuickResponseContentProviderProperty):
          QuickResponseContentProviderProperty = CdkObjectWrappers.wrap(cdkObject) as?
          QuickResponseContentProviderProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: QuickResponseContentProviderProperty):
          software.amazon.awscdk.services.wisdom.CfnQuickResponse.QuickResponseContentProviderProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wisdom.CfnQuickResponse.QuickResponseContentProviderProperty
    }
  }

  /**
   * The content of the quick response stored in different media types.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.wisdom.*;
   * QuickResponseContentsProperty quickResponseContentsProperty =
   * QuickResponseContentsProperty.builder()
   * .markdown(QuickResponseContentProviderProperty.builder()
   * .content("content")
   * .build())
   * .plainText(QuickResponseContentProviderProperty.builder()
   * .content("content")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-quickresponse-quickresponsecontents.html)
   */
  public interface QuickResponseContentsProperty {
    /**
     * The quick response content in markdown format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-quickresponse-quickresponsecontents.html#cfn-wisdom-quickresponse-quickresponsecontents-markdown)
     */
    public fun markdown(): Any? = unwrap(this).getMarkdown()

    /**
     * The quick response content in plaintext format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-quickresponse-quickresponsecontents.html#cfn-wisdom-quickresponse-quickresponsecontents-plaintext)
     */
    public fun plainText(): Any? = unwrap(this).getPlainText()

    /**
     * A builder for [QuickResponseContentsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param markdown The quick response content in markdown format.
       */
      public fun markdown(markdown: IResolvable)

      /**
       * @param markdown The quick response content in markdown format.
       */
      public fun markdown(markdown: QuickResponseContentProviderProperty)

      /**
       * @param markdown The quick response content in markdown format.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e17fcd1978ac447a14039ab6f74d13d736bbb019ba89681cac25e102aa4f7f25")
      public fun markdown(markdown: QuickResponseContentProviderProperty.Builder.() -> Unit)

      /**
       * @param plainText The quick response content in plaintext format.
       */
      public fun plainText(plainText: IResolvable)

      /**
       * @param plainText The quick response content in plaintext format.
       */
      public fun plainText(plainText: QuickResponseContentProviderProperty)

      /**
       * @param plainText The quick response content in plaintext format.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bab51439e5453781cb1ba63f1247770377ae0364b74e6af3fe85201453a812fd")
      public fun plainText(plainText: QuickResponseContentProviderProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wisdom.CfnQuickResponse.QuickResponseContentsProperty.Builder
          =
          software.amazon.awscdk.services.wisdom.CfnQuickResponse.QuickResponseContentsProperty.builder()

      /**
       * @param markdown The quick response content in markdown format.
       */
      override fun markdown(markdown: IResolvable) {
        cdkBuilder.markdown(markdown.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param markdown The quick response content in markdown format.
       */
      override fun markdown(markdown: QuickResponseContentProviderProperty) {
        cdkBuilder.markdown(markdown.let(QuickResponseContentProviderProperty.Companion::unwrap))
      }

      /**
       * @param markdown The quick response content in markdown format.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e17fcd1978ac447a14039ab6f74d13d736bbb019ba89681cac25e102aa4f7f25")
      override fun markdown(markdown: QuickResponseContentProviderProperty.Builder.() -> Unit): Unit
          = markdown(QuickResponseContentProviderProperty(markdown))

      /**
       * @param plainText The quick response content in plaintext format.
       */
      override fun plainText(plainText: IResolvable) {
        cdkBuilder.plainText(plainText.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param plainText The quick response content in plaintext format.
       */
      override fun plainText(plainText: QuickResponseContentProviderProperty) {
        cdkBuilder.plainText(plainText.let(QuickResponseContentProviderProperty.Companion::unwrap))
      }

      /**
       * @param plainText The quick response content in plaintext format.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bab51439e5453781cb1ba63f1247770377ae0364b74e6af3fe85201453a812fd")
      override fun plainText(plainText: QuickResponseContentProviderProperty.Builder.() -> Unit):
          Unit = plainText(QuickResponseContentProviderProperty(plainText))

      public fun build():
          software.amazon.awscdk.services.wisdom.CfnQuickResponse.QuickResponseContentsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.wisdom.CfnQuickResponse.QuickResponseContentsProperty,
    ) : CdkObject(cdkObject),
        QuickResponseContentsProperty {
      /**
       * The quick response content in markdown format.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-quickresponse-quickresponsecontents.html#cfn-wisdom-quickresponse-quickresponsecontents-markdown)
       */
      override fun markdown(): Any? = unwrap(this).getMarkdown()

      /**
       * The quick response content in plaintext format.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-quickresponse-quickresponsecontents.html#cfn-wisdom-quickresponse-quickresponsecontents-plaintext)
       */
      override fun plainText(): Any? = unwrap(this).getPlainText()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): QuickResponseContentsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnQuickResponse.QuickResponseContentsProperty):
          QuickResponseContentsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          QuickResponseContentsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: QuickResponseContentsProperty):
          software.amazon.awscdk.services.wisdom.CfnQuickResponse.QuickResponseContentsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wisdom.CfnQuickResponse.QuickResponseContentsProperty
    }
  }
}
