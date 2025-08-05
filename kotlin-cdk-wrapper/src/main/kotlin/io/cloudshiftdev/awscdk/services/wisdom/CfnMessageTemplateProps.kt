@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.wisdom

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnMessageTemplate`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.wisdom.*;
 * CfnMessageTemplateProps cfnMessageTemplateProps = CfnMessageTemplateProps.builder()
 * .channelSubtype("channelSubtype")
 * .content(ContentProperty.builder()
 * .emailMessageTemplateContent(EmailMessageTemplateContentProperty.builder()
 * .body(EmailMessageTemplateContentBodyProperty.builder()
 * .html(MessageTemplateBodyContentProviderProperty.builder()
 * .content("content")
 * .build())
 * .plainText(MessageTemplateBodyContentProviderProperty.builder()
 * .content("content")
 * .build())
 * .build())
 * .headers(List.of(EmailMessageTemplateHeaderProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .subject("subject")
 * .build())
 * .smsMessageTemplateContent(SmsMessageTemplateContentProperty.builder()
 * .body(SmsMessageTemplateContentBodyProperty.builder()
 * .plainText(MessageTemplateBodyContentProviderProperty.builder()
 * .content("content")
 * .build())
 * .build())
 * .build())
 * .build())
 * .knowledgeBaseArn("knowledgeBaseArn")
 * .name("name")
 * // the properties below are optional
 * .defaultAttributes(MessageTemplateAttributesProperty.builder()
 * .agentAttributes(AgentAttributesProperty.builder()
 * .firstName("firstName")
 * .lastName("lastName")
 * .build())
 * .customAttributes(Map.of(
 * "customAttributesKey", "customAttributes"))
 * .customerProfileAttributes(CustomerProfileAttributesProperty.builder()
 * .accountNumber("accountNumber")
 * .additionalInformation("additionalInformation")
 * .address1("address1")
 * .address2("address2")
 * .address3("address3")
 * .address4("address4")
 * .billingAddress1("billingAddress1")
 * .billingAddress2("billingAddress2")
 * .billingAddress3("billingAddress3")
 * .billingAddress4("billingAddress4")
 * .billingCity("billingCity")
 * .billingCountry("billingCountry")
 * .billingCounty("billingCounty")
 * .billingPostalCode("billingPostalCode")
 * .billingProvince("billingProvince")
 * .billingState("billingState")
 * .birthDate("birthDate")
 * .businessEmailAddress("businessEmailAddress")
 * .businessName("businessName")
 * .businessPhoneNumber("businessPhoneNumber")
 * .city("city")
 * .country("country")
 * .county("county")
 * .custom(Map.of(
 * "customKey", "custom"))
 * .emailAddress("emailAddress")
 * .firstName("firstName")
 * .gender("gender")
 * .homePhoneNumber("homePhoneNumber")
 * .lastName("lastName")
 * .mailingAddress1("mailingAddress1")
 * .mailingAddress2("mailingAddress2")
 * .mailingAddress3("mailingAddress3")
 * .mailingAddress4("mailingAddress4")
 * .mailingCity("mailingCity")
 * .mailingCountry("mailingCountry")
 * .mailingCounty("mailingCounty")
 * .mailingPostalCode("mailingPostalCode")
 * .mailingProvince("mailingProvince")
 * .mailingState("mailingState")
 * .middleName("middleName")
 * .mobilePhoneNumber("mobilePhoneNumber")
 * .partyType("partyType")
 * .phoneNumber("phoneNumber")
 * .postalCode("postalCode")
 * .profileArn("profileArn")
 * .profileId("profileId")
 * .province("province")
 * .shippingAddress1("shippingAddress1")
 * .shippingAddress2("shippingAddress2")
 * .shippingAddress3("shippingAddress3")
 * .shippingAddress4("shippingAddress4")
 * .shippingCity("shippingCity")
 * .shippingCountry("shippingCountry")
 * .shippingCounty("shippingCounty")
 * .shippingPostalCode("shippingPostalCode")
 * .shippingProvince("shippingProvince")
 * .shippingState("shippingState")
 * .state("state")
 * .build())
 * .systemAttributes(SystemAttributesProperty.builder()
 * .customerEndpoint(SystemEndpointAttributesProperty.builder()
 * .address("address")
 * .build())
 * .name("name")
 * .systemEndpoint(SystemEndpointAttributesProperty.builder()
 * .address("address")
 * .build())
 * .build())
 * .build())
 * .description("description")
 * .groupingConfiguration(GroupingConfigurationProperty.builder()
 * .criteria("criteria")
 * .values(List.of("values"))
 * .build())
 * .language("language")
 * .messageTemplateAttachments(List.of(MessageTemplateAttachmentProperty.builder()
 * .attachmentName("attachmentName")
 * .s3PresignedUrl("s3PresignedUrl")
 * // the properties below are optional
 * .attachmentId("attachmentId")
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-messagetemplate.html)
 */
public interface CfnMessageTemplateProps {
  /**
   * The channel subtype this message template applies to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-messagetemplate.html#cfn-wisdom-messagetemplate-channelsubtype)
   */
  public fun channelSubtype(): String

  /**
   * The content of the message template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-messagetemplate.html#cfn-wisdom-messagetemplate-content)
   */
  public fun content(): Any

  /**
   * An object that specifies the default values to use for variables in the message template.
   *
   * This object contains different categories of key-value pairs. Each key defines a variable or
   * placeholder in the message template. The corresponding value defines the default value for that
   * variable.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-messagetemplate.html#cfn-wisdom-messagetemplate-defaultattributes)
   */
  public fun defaultAttributes(): Any? = unwrap(this).getDefaultAttributes()

  /**
   * The description of the message template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-messagetemplate.html#cfn-wisdom-messagetemplate-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The configuration information of the external data source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-messagetemplate.html#cfn-wisdom-messagetemplate-groupingconfiguration)
   */
  public fun groupingConfiguration(): Any? = unwrap(this).getGroupingConfiguration()

  /**
   * The Amazon Resource Name (ARN) of the knowledge base.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-messagetemplate.html#cfn-wisdom-messagetemplate-knowledgebasearn)
   */
  public fun knowledgeBaseArn(): String

  /**
   * The language code value for the language in which the quick response is written.
   *
   * The supported language codes include `de_DE` , `en_US` , `es_ES` , `fr_FR` , `id_ID` , `it_IT`
   * , `ja_JP` , `ko_KR` , `pt_BR` , `zh_CN` , `zh_TW`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-messagetemplate.html#cfn-wisdom-messagetemplate-language)
   */
  public fun language(): String? = unwrap(this).getLanguage()

  /**
   * List of message template attachments.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-messagetemplate.html#cfn-wisdom-messagetemplate-messagetemplateattachments)
   */
  public fun messageTemplateAttachments(): Any? = unwrap(this).getMessageTemplateAttachments()

  /**
   * The name of the message template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-messagetemplate.html#cfn-wisdom-messagetemplate-name)
   */
  public fun name(): String

  /**
   * The tags used to organize, track, or control access for this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-messagetemplate.html#cfn-wisdom-messagetemplate-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnMessageTemplateProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param channelSubtype The channel subtype this message template applies to. 
     */
    public fun channelSubtype(channelSubtype: String)

    /**
     * @param content The content of the message template. 
     */
    public fun content(content: IResolvable)

    /**
     * @param content The content of the message template. 
     */
    public fun content(content: CfnMessageTemplate.ContentProperty)

    /**
     * @param content The content of the message template. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7da45c655fd0485728b082929ed5e1b35857c0522a7d7adb21a630ef7755ca48")
    public fun content(content: CfnMessageTemplate.ContentProperty.Builder.() -> Unit)

    /**
     * @param defaultAttributes An object that specifies the default values to use for variables in
     * the message template.
     * This object contains different categories of key-value pairs. Each key defines a variable or
     * placeholder in the message template. The corresponding value defines the default value for that
     * variable.
     */
    public fun defaultAttributes(defaultAttributes: IResolvable)

    /**
     * @param defaultAttributes An object that specifies the default values to use for variables in
     * the message template.
     * This object contains different categories of key-value pairs. Each key defines a variable or
     * placeholder in the message template. The corresponding value defines the default value for that
     * variable.
     */
    public
        fun defaultAttributes(defaultAttributes: CfnMessageTemplate.MessageTemplateAttributesProperty)

    /**
     * @param defaultAttributes An object that specifies the default values to use for variables in
     * the message template.
     * This object contains different categories of key-value pairs. Each key defines a variable or
     * placeholder in the message template. The corresponding value defines the default value for that
     * variable.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("de1da05c18977584008c40e2b0365bb3f9651bc5932d89ce875695bfb545dd34")
    public
        fun defaultAttributes(defaultAttributes: CfnMessageTemplate.MessageTemplateAttributesProperty.Builder.() -> Unit)

    /**
     * @param description The description of the message template.
     */
    public fun description(description: String)

    /**
     * @param groupingConfiguration The configuration information of the external data source.
     */
    public fun groupingConfiguration(groupingConfiguration: IResolvable)

    /**
     * @param groupingConfiguration The configuration information of the external data source.
     */
    public
        fun groupingConfiguration(groupingConfiguration: CfnMessageTemplate.GroupingConfigurationProperty)

    /**
     * @param groupingConfiguration The configuration information of the external data source.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3a1f6e3975e81ec40649180d515f3f8855d66b16a03f35b36a78ec82267cd86b")
    public
        fun groupingConfiguration(groupingConfiguration: CfnMessageTemplate.GroupingConfigurationProperty.Builder.() -> Unit)

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
     * @param messageTemplateAttachments List of message template attachments.
     */
    public fun messageTemplateAttachments(messageTemplateAttachments: IResolvable)

    /**
     * @param messageTemplateAttachments List of message template attachments.
     */
    public fun messageTemplateAttachments(messageTemplateAttachments: List<Any>)

    /**
     * @param messageTemplateAttachments List of message template attachments.
     */
    public fun messageTemplateAttachments(vararg messageTemplateAttachments: Any)

    /**
     * @param name The name of the message template. 
     */
    public fun name(name: String)

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
    private val cdkBuilder: software.amazon.awscdk.services.wisdom.CfnMessageTemplateProps.Builder =
        software.amazon.awscdk.services.wisdom.CfnMessageTemplateProps.builder()

    /**
     * @param channelSubtype The channel subtype this message template applies to. 
     */
    override fun channelSubtype(channelSubtype: String) {
      cdkBuilder.channelSubtype(channelSubtype)
    }

    /**
     * @param content The content of the message template. 
     */
    override fun content(content: IResolvable) {
      cdkBuilder.content(content.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param content The content of the message template. 
     */
    override fun content(content: CfnMessageTemplate.ContentProperty) {
      cdkBuilder.content(content.let(CfnMessageTemplate.ContentProperty.Companion::unwrap))
    }

    /**
     * @param content The content of the message template. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7da45c655fd0485728b082929ed5e1b35857c0522a7d7adb21a630ef7755ca48")
    override fun content(content: CfnMessageTemplate.ContentProperty.Builder.() -> Unit): Unit =
        content(CfnMessageTemplate.ContentProperty(content))

    /**
     * @param defaultAttributes An object that specifies the default values to use for variables in
     * the message template.
     * This object contains different categories of key-value pairs. Each key defines a variable or
     * placeholder in the message template. The corresponding value defines the default value for that
     * variable.
     */
    override fun defaultAttributes(defaultAttributes: IResolvable) {
      cdkBuilder.defaultAttributes(defaultAttributes.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param defaultAttributes An object that specifies the default values to use for variables in
     * the message template.
     * This object contains different categories of key-value pairs. Each key defines a variable or
     * placeholder in the message template. The corresponding value defines the default value for that
     * variable.
     */
    override
        fun defaultAttributes(defaultAttributes: CfnMessageTemplate.MessageTemplateAttributesProperty) {
      cdkBuilder.defaultAttributes(defaultAttributes.let(CfnMessageTemplate.MessageTemplateAttributesProperty.Companion::unwrap))
    }

    /**
     * @param defaultAttributes An object that specifies the default values to use for variables in
     * the message template.
     * This object contains different categories of key-value pairs. Each key defines a variable or
     * placeholder in the message template. The corresponding value defines the default value for that
     * variable.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("de1da05c18977584008c40e2b0365bb3f9651bc5932d89ce875695bfb545dd34")
    override
        fun defaultAttributes(defaultAttributes: CfnMessageTemplate.MessageTemplateAttributesProperty.Builder.() -> Unit):
        Unit =
        defaultAttributes(CfnMessageTemplate.MessageTemplateAttributesProperty(defaultAttributes))

    /**
     * @param description The description of the message template.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param groupingConfiguration The configuration information of the external data source.
     */
    override fun groupingConfiguration(groupingConfiguration: IResolvable) {
      cdkBuilder.groupingConfiguration(groupingConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param groupingConfiguration The configuration information of the external data source.
     */
    override
        fun groupingConfiguration(groupingConfiguration: CfnMessageTemplate.GroupingConfigurationProperty) {
      cdkBuilder.groupingConfiguration(groupingConfiguration.let(CfnMessageTemplate.GroupingConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param groupingConfiguration The configuration information of the external data source.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3a1f6e3975e81ec40649180d515f3f8855d66b16a03f35b36a78ec82267cd86b")
    override
        fun groupingConfiguration(groupingConfiguration: CfnMessageTemplate.GroupingConfigurationProperty.Builder.() -> Unit):
        Unit =
        groupingConfiguration(CfnMessageTemplate.GroupingConfigurationProperty(groupingConfiguration))

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
     * @param messageTemplateAttachments List of message template attachments.
     */
    override fun messageTemplateAttachments(messageTemplateAttachments: IResolvable) {
      cdkBuilder.messageTemplateAttachments(messageTemplateAttachments.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param messageTemplateAttachments List of message template attachments.
     */
    override fun messageTemplateAttachments(messageTemplateAttachments: List<Any>) {
      cdkBuilder.messageTemplateAttachments(messageTemplateAttachments.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param messageTemplateAttachments List of message template attachments.
     */
    override fun messageTemplateAttachments(vararg messageTemplateAttachments: Any): Unit =
        messageTemplateAttachments(messageTemplateAttachments.toList())

    /**
     * @param name The name of the message template. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
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

    public fun build(): software.amazon.awscdk.services.wisdom.CfnMessageTemplateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.wisdom.CfnMessageTemplateProps,
  ) : CdkObject(cdkObject),
      CfnMessageTemplateProps {
    /**
     * The channel subtype this message template applies to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-messagetemplate.html#cfn-wisdom-messagetemplate-channelsubtype)
     */
    override fun channelSubtype(): String = unwrap(this).getChannelSubtype()

    /**
     * The content of the message template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-messagetemplate.html#cfn-wisdom-messagetemplate-content)
     */
    override fun content(): Any = unwrap(this).getContent()

    /**
     * An object that specifies the default values to use for variables in the message template.
     *
     * This object contains different categories of key-value pairs. Each key defines a variable or
     * placeholder in the message template. The corresponding value defines the default value for that
     * variable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-messagetemplate.html#cfn-wisdom-messagetemplate-defaultattributes)
     */
    override fun defaultAttributes(): Any? = unwrap(this).getDefaultAttributes()

    /**
     * The description of the message template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-messagetemplate.html#cfn-wisdom-messagetemplate-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The configuration information of the external data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-messagetemplate.html#cfn-wisdom-messagetemplate-groupingconfiguration)
     */
    override fun groupingConfiguration(): Any? = unwrap(this).getGroupingConfiguration()

    /**
     * The Amazon Resource Name (ARN) of the knowledge base.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-messagetemplate.html#cfn-wisdom-messagetemplate-knowledgebasearn)
     */
    override fun knowledgeBaseArn(): String = unwrap(this).getKnowledgeBaseArn()

    /**
     * The language code value for the language in which the quick response is written.
     *
     * The supported language codes include `de_DE` , `en_US` , `es_ES` , `fr_FR` , `id_ID` ,
     * `it_IT` , `ja_JP` , `ko_KR` , `pt_BR` , `zh_CN` , `zh_TW`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-messagetemplate.html#cfn-wisdom-messagetemplate-language)
     */
    override fun language(): String? = unwrap(this).getLanguage()

    /**
     * List of message template attachments.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-messagetemplate.html#cfn-wisdom-messagetemplate-messagetemplateattachments)
     */
    override fun messageTemplateAttachments(): Any? = unwrap(this).getMessageTemplateAttachments()

    /**
     * The name of the message template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-messagetemplate.html#cfn-wisdom-messagetemplate-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-messagetemplate.html#cfn-wisdom-messagetemplate-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMessageTemplateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnMessageTemplateProps):
        CfnMessageTemplateProps = CdkObjectWrappers.wrap(cdkObject) as? CfnMessageTemplateProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMessageTemplateProps):
        software.amazon.awscdk.services.wisdom.CfnMessageTemplateProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.wisdom.CfnMessageTemplateProps
  }
}
