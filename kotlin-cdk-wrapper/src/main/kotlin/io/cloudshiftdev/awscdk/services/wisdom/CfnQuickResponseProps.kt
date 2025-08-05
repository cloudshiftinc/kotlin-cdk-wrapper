@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.wisdom

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnQuickResponse`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.wisdom.*;
 * CfnQuickResponseProps cfnQuickResponseProps = CfnQuickResponseProps.builder()
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
public interface CfnQuickResponseProps {
  /**
   * The Amazon Connect contact channels this quick response applies to.
   *
   * The supported contact channel types include `Chat` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-quickresponse.html#cfn-wisdom-quickresponse-channels)
   */
  public fun channels(): List<String> = unwrap(this).getChannels() ?: emptyList()

  /**
   * The content of the quick response.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-quickresponse.html#cfn-wisdom-quickresponse-content)
   */
  public fun content(): Any

  /**
   * The media type of the quick response content.
   *
   * * Use `application/x.quickresponse;format=plain` for quick response written in plain text.
   * * Use `application/x.quickresponse;format=markdown` for quick response written in richtext.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-quickresponse.html#cfn-wisdom-quickresponse-contenttype)
   */
  public fun contentType(): String? = unwrap(this).getContentType()

  /**
   * The description of the quick response.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-quickresponse.html#cfn-wisdom-quickresponse-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The configuration information of the user groups that the quick response is accessible to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-quickresponse.html#cfn-wisdom-quickresponse-groupingconfiguration)
   */
  public fun groupingConfiguration(): Any? = unwrap(this).getGroupingConfiguration()

  /**
   * Whether the quick response is active.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-quickresponse.html#cfn-wisdom-quickresponse-isactive)
   */
  public fun isActive(): Any? = unwrap(this).getIsActive()

  /**
   * The Amazon Resource Name (ARN) of the knowledge base.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-quickresponse.html#cfn-wisdom-quickresponse-knowledgebasearn)
   */
  public fun knowledgeBaseArn(): String

  /**
   * The language code value for the language in which the quick response is written.
   *
   * The supported language codes include `de_DE` , `en_US` , `es_ES` , `fr_FR` , `id_ID` , `it_IT`
   * , `ja_JP` , `ko_KR` , `pt_BR` , `zh_CN` , `zh_TW`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-quickresponse.html#cfn-wisdom-quickresponse-language)
   */
  public fun language(): String? = unwrap(this).getLanguage()

  /**
   * The name of the quick response.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-quickresponse.html#cfn-wisdom-quickresponse-name)
   */
  public fun name(): String

  /**
   * The shortcut key of the quick response.
   *
   * The value should be unique across the knowledge base.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-quickresponse.html#cfn-wisdom-quickresponse-shortcutkey)
   */
  public fun shortcutKey(): String? = unwrap(this).getShortcutKey()

  /**
   * The tags used to organize, track, or control access for this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-quickresponse.html#cfn-wisdom-quickresponse-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnQuickResponseProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param channels The Amazon Connect contact channels this quick response applies to.
     * The supported contact channel types include `Chat` .
     */
    public fun channels(channels: List<String>)

    /**
     * @param channels The Amazon Connect contact channels this quick response applies to.
     * The supported contact channel types include `Chat` .
     */
    public fun channels(vararg channels: String)

    /**
     * @param content The content of the quick response. 
     */
    public fun content(content: IResolvable)

    /**
     * @param content The content of the quick response. 
     */
    public fun content(content: CfnQuickResponse.QuickResponseContentProviderProperty)

    /**
     * @param content The content of the quick response. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5066824fd84d14e738f03f4c7a63ab3678e92f6c1b9247c6d8f3b8e471d5f0c4")
    public
        fun content(content: CfnQuickResponse.QuickResponseContentProviderProperty.Builder.() -> Unit)

    /**
     * @param contentType The media type of the quick response content.
     * * Use `application/x.quickresponse;format=plain` for quick response written in plain text.
     * * Use `application/x.quickresponse;format=markdown` for quick response written in richtext.
     */
    public fun contentType(contentType: String)

    /**
     * @param description The description of the quick response.
     */
    public fun description(description: String)

    /**
     * @param groupingConfiguration The configuration information of the user groups that the quick
     * response is accessible to.
     */
    public fun groupingConfiguration(groupingConfiguration: IResolvable)

    /**
     * @param groupingConfiguration The configuration information of the user groups that the quick
     * response is accessible to.
     */
    public
        fun groupingConfiguration(groupingConfiguration: CfnQuickResponse.GroupingConfigurationProperty)

    /**
     * @param groupingConfiguration The configuration information of the user groups that the quick
     * response is accessible to.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("35039db97eb7d921f2019e508afb999f43d3f4a3c7dc97ce01f69d8e37c9a3ca")
    public
        fun groupingConfiguration(groupingConfiguration: CfnQuickResponse.GroupingConfigurationProperty.Builder.() -> Unit)

    /**
     * @param isActive Whether the quick response is active.
     */
    public fun isActive(isActive: Boolean)

    /**
     * @param isActive Whether the quick response is active.
     */
    public fun isActive(isActive: IResolvable)

    /**
     * @param knowledgeBaseArn The Amazon Resource Name (ARN) of the knowledge base. 
     */
    public fun knowledgeBaseArn(knowledgeBaseArn: String)

    /**
     * @param language The language code value for the language in which the quick response is
     * written.
     * The supported language codes include `de_DE` , `en_US` , `es_ES` , `fr_FR` , `id_ID` ,
     * `it_IT` , `ja_JP` , `ko_KR` , `pt_BR` , `zh_CN` , `zh_TW`
     */
    public fun language(language: String)

    /**
     * @param name The name of the quick response. 
     */
    public fun name(name: String)

    /**
     * @param shortcutKey The shortcut key of the quick response.
     * The value should be unique across the knowledge base.
     */
    public fun shortcutKey(shortcutKey: String)

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.wisdom.CfnQuickResponseProps.Builder =
        software.amazon.awscdk.services.wisdom.CfnQuickResponseProps.builder()

    /**
     * @param channels The Amazon Connect contact channels this quick response applies to.
     * The supported contact channel types include `Chat` .
     */
    override fun channels(channels: List<String>) {
      cdkBuilder.channels(channels)
    }

    /**
     * @param channels The Amazon Connect contact channels this quick response applies to.
     * The supported contact channel types include `Chat` .
     */
    override fun channels(vararg channels: String): Unit = channels(channels.toList())

    /**
     * @param content The content of the quick response. 
     */
    override fun content(content: IResolvable) {
      cdkBuilder.content(content.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param content The content of the quick response. 
     */
    override fun content(content: CfnQuickResponse.QuickResponseContentProviderProperty) {
      cdkBuilder.content(content.let(CfnQuickResponse.QuickResponseContentProviderProperty.Companion::unwrap))
    }

    /**
     * @param content The content of the quick response. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5066824fd84d14e738f03f4c7a63ab3678e92f6c1b9247c6d8f3b8e471d5f0c4")
    override
        fun content(content: CfnQuickResponse.QuickResponseContentProviderProperty.Builder.() -> Unit):
        Unit = content(CfnQuickResponse.QuickResponseContentProviderProperty(content))

    /**
     * @param contentType The media type of the quick response content.
     * * Use `application/x.quickresponse;format=plain` for quick response written in plain text.
     * * Use `application/x.quickresponse;format=markdown` for quick response written in richtext.
     */
    override fun contentType(contentType: String) {
      cdkBuilder.contentType(contentType)
    }

    /**
     * @param description The description of the quick response.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param groupingConfiguration The configuration information of the user groups that the quick
     * response is accessible to.
     */
    override fun groupingConfiguration(groupingConfiguration: IResolvable) {
      cdkBuilder.groupingConfiguration(groupingConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param groupingConfiguration The configuration information of the user groups that the quick
     * response is accessible to.
     */
    override
        fun groupingConfiguration(groupingConfiguration: CfnQuickResponse.GroupingConfigurationProperty) {
      cdkBuilder.groupingConfiguration(groupingConfiguration.let(CfnQuickResponse.GroupingConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param groupingConfiguration The configuration information of the user groups that the quick
     * response is accessible to.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("35039db97eb7d921f2019e508afb999f43d3f4a3c7dc97ce01f69d8e37c9a3ca")
    override
        fun groupingConfiguration(groupingConfiguration: CfnQuickResponse.GroupingConfigurationProperty.Builder.() -> Unit):
        Unit =
        groupingConfiguration(CfnQuickResponse.GroupingConfigurationProperty(groupingConfiguration))

    /**
     * @param isActive Whether the quick response is active.
     */
    override fun isActive(isActive: Boolean) {
      cdkBuilder.isActive(isActive)
    }

    /**
     * @param isActive Whether the quick response is active.
     */
    override fun isActive(isActive: IResolvable) {
      cdkBuilder.isActive(isActive.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param knowledgeBaseArn The Amazon Resource Name (ARN) of the knowledge base. 
     */
    override fun knowledgeBaseArn(knowledgeBaseArn: String) {
      cdkBuilder.knowledgeBaseArn(knowledgeBaseArn)
    }

    /**
     * @param language The language code value for the language in which the quick response is
     * written.
     * The supported language codes include `de_DE` , `en_US` , `es_ES` , `fr_FR` , `id_ID` ,
     * `it_IT` , `ja_JP` , `ko_KR` , `pt_BR` , `zh_CN` , `zh_TW`
     */
    override fun language(language: String) {
      cdkBuilder.language(language)
    }

    /**
     * @param name The name of the quick response. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param shortcutKey The shortcut key of the quick response.
     * The value should be unique across the knowledge base.
     */
    override fun shortcutKey(shortcutKey: String) {
      cdkBuilder.shortcutKey(shortcutKey)
    }

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.wisdom.CfnQuickResponseProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.wisdom.CfnQuickResponseProps,
  ) : CdkObject(cdkObject),
      CfnQuickResponseProps {
    /**
     * The Amazon Connect contact channels this quick response applies to.
     *
     * The supported contact channel types include `Chat` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-quickresponse.html#cfn-wisdom-quickresponse-channels)
     */
    override fun channels(): List<String> = unwrap(this).getChannels() ?: emptyList()

    /**
     * The content of the quick response.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-quickresponse.html#cfn-wisdom-quickresponse-content)
     */
    override fun content(): Any = unwrap(this).getContent()

    /**
     * The media type of the quick response content.
     *
     * * Use `application/x.quickresponse;format=plain` for quick response written in plain text.
     * * Use `application/x.quickresponse;format=markdown` for quick response written in richtext.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-quickresponse.html#cfn-wisdom-quickresponse-contenttype)
     */
    override fun contentType(): String? = unwrap(this).getContentType()

    /**
     * The description of the quick response.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-quickresponse.html#cfn-wisdom-quickresponse-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The configuration information of the user groups that the quick response is accessible to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-quickresponse.html#cfn-wisdom-quickresponse-groupingconfiguration)
     */
    override fun groupingConfiguration(): Any? = unwrap(this).getGroupingConfiguration()

    /**
     * Whether the quick response is active.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-quickresponse.html#cfn-wisdom-quickresponse-isactive)
     */
    override fun isActive(): Any? = unwrap(this).getIsActive()

    /**
     * The Amazon Resource Name (ARN) of the knowledge base.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-quickresponse.html#cfn-wisdom-quickresponse-knowledgebasearn)
     */
    override fun knowledgeBaseArn(): String = unwrap(this).getKnowledgeBaseArn()

    /**
     * The language code value for the language in which the quick response is written.
     *
     * The supported language codes include `de_DE` , `en_US` , `es_ES` , `fr_FR` , `id_ID` ,
     * `it_IT` , `ja_JP` , `ko_KR` , `pt_BR` , `zh_CN` , `zh_TW`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-quickresponse.html#cfn-wisdom-quickresponse-language)
     */
    override fun language(): String? = unwrap(this).getLanguage()

    /**
     * The name of the quick response.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-quickresponse.html#cfn-wisdom-quickresponse-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The shortcut key of the quick response.
     *
     * The value should be unique across the knowledge base.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-quickresponse.html#cfn-wisdom-quickresponse-shortcutkey)
     */
    override fun shortcutKey(): String? = unwrap(this).getShortcutKey()

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-quickresponse.html#cfn-wisdom-quickresponse-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnQuickResponseProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnQuickResponseProps):
        CfnQuickResponseProps = CdkObjectWrappers.wrap(cdkObject) as? CfnQuickResponseProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnQuickResponseProps):
        software.amazon.awscdk.services.wisdom.CfnQuickResponseProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.wisdom.CfnQuickResponseProps
  }
}
