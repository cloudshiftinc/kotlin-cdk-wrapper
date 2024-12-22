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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates an Amazon Q in Connect message template.
 *
 * The name of the message template has to be unique for each knowledge base. The channel subtype of
 * the message template is immutable and cannot be modified after creation. After the message template
 * is created, you can use the `$LATEST` qualifier to reference the created message template.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.wisdom.*;
 * CfnMessageTemplate cfnMessageTemplate = CfnMessageTemplate.Builder.create(this,
 * "MyCfnMessageTemplate")
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
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-messagetemplate.html)
 */
public open class CfnMessageTemplate(
  cdkObject: software.amazon.awscdk.services.wisdom.CfnMessageTemplate,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnMessageTemplateProps,
  ) :
      this(software.amazon.awscdk.services.wisdom.CfnMessageTemplate(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnMessageTemplateProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnMessageTemplateProps.Builder.() -> Unit,
  ) : this(scope, id, CfnMessageTemplateProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the message template.
   */
  public open fun attrMessageTemplateArn(): String = unwrap(this).getAttrMessageTemplateArn()

  /**
   * The checksum value of the message template content that is referenced by the `$LATEST`
   * qualifier.
   *
   * It can be returned in `MessageTemplateData` or `ExtendedMessageTemplateData` . It’s calculated
   * by content, language, `defaultAttributes` and `Attachments` of the message template.
   */
  public open fun attrMessageTemplateContentSha256(): String =
      unwrap(this).getAttrMessageTemplateContentSha256()

  /**
   * The identifier of the message template.
   */
  public open fun attrMessageTemplateId(): String = unwrap(this).getAttrMessageTemplateId()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The channel subtype this message template applies to.
   */
  public open fun channelSubtype(): String = unwrap(this).getChannelSubtype()

  /**
   * The channel subtype this message template applies to.
   */
  public open fun channelSubtype(`value`: String) {
    unwrap(this).setChannelSubtype(`value`)
  }

  /**
   * The content of the message template.
   */
  public open fun content(): Any = unwrap(this).getContent()

  /**
   * The content of the message template.
   */
  public open fun content(`value`: IResolvable) {
    unwrap(this).setContent(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The content of the message template.
   */
  public open fun content(`value`: ContentProperty) {
    unwrap(this).setContent(`value`.let(ContentProperty.Companion::unwrap))
  }

  /**
   * The content of the message template.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("cdacb1cb608ba8360d7a4e93feedca911fbbdf9e3ff27e7afe605e6c8b25f411")
  public open fun content(`value`: ContentProperty.Builder.() -> Unit): Unit =
      content(ContentProperty(`value`))

  /**
   * An object that specifies the default values to use for variables in the message template.
   */
  public open fun defaultAttributes(): Any? = unwrap(this).getDefaultAttributes()

  /**
   * An object that specifies the default values to use for variables in the message template.
   */
  public open fun defaultAttributes(`value`: IResolvable) {
    unwrap(this).setDefaultAttributes(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * An object that specifies the default values to use for variables in the message template.
   */
  public open fun defaultAttributes(`value`: MessageTemplateAttributesProperty) {
    unwrap(this).setDefaultAttributes(`value`.let(MessageTemplateAttributesProperty.Companion::unwrap))
  }

  /**
   * An object that specifies the default values to use for variables in the message template.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("684f7c444e196bb08a8d3be30412aa840e26c6bd903cc59fb40e7949ffe89047")
  public open fun defaultAttributes(`value`: MessageTemplateAttributesProperty.Builder.() -> Unit):
      Unit = defaultAttributes(MessageTemplateAttributesProperty(`value`))

  /**
   * The description of the message template.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the message template.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The configuration information of the external data source.
   */
  public open fun groupingConfiguration(): Any? = unwrap(this).getGroupingConfiguration()

  /**
   * The configuration information of the external data source.
   */
  public open fun groupingConfiguration(`value`: IResolvable) {
    unwrap(this).setGroupingConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The configuration information of the external data source.
   */
  public open fun groupingConfiguration(`value`: GroupingConfigurationProperty) {
    unwrap(this).setGroupingConfiguration(`value`.let(GroupingConfigurationProperty.Companion::unwrap))
  }

  /**
   * The configuration information of the external data source.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8e5c24b3a8ea2cd7292af6ec63cdde61af61d7111a521a0a8a9ba4e70ab19abf")
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
   * The name of the message template.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the message template.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
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
   * A fluent builder for [io.cloudshiftdev.awscdk.services.wisdom.CfnMessageTemplate].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The channel subtype this message template applies to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-messagetemplate.html#cfn-wisdom-messagetemplate-channelsubtype)
     * @param channelSubtype The channel subtype this message template applies to. 
     */
    public fun channelSubtype(channelSubtype: String)

    /**
     * The content of the message template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-messagetemplate.html#cfn-wisdom-messagetemplate-content)
     * @param content The content of the message template. 
     */
    public fun content(content: IResolvable)

    /**
     * The content of the message template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-messagetemplate.html#cfn-wisdom-messagetemplate-content)
     * @param content The content of the message template. 
     */
    public fun content(content: ContentProperty)

    /**
     * The content of the message template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-messagetemplate.html#cfn-wisdom-messagetemplate-content)
     * @param content The content of the message template. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("031b276f991f448b9160a1e3eb6a029bcaedf0a5fffeb563a1c15545038f4b01")
    public fun content(content: ContentProperty.Builder.() -> Unit)

    /**
     * An object that specifies the default values to use for variables in the message template.
     *
     * This object contains different categories of key-value pairs. Each key defines a variable or
     * placeholder in the message template. The corresponding value defines the default value for that
     * variable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-messagetemplate.html#cfn-wisdom-messagetemplate-defaultattributes)
     * @param defaultAttributes An object that specifies the default values to use for variables in
     * the message template. 
     */
    public fun defaultAttributes(defaultAttributes: IResolvable)

    /**
     * An object that specifies the default values to use for variables in the message template.
     *
     * This object contains different categories of key-value pairs. Each key defines a variable or
     * placeholder in the message template. The corresponding value defines the default value for that
     * variable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-messagetemplate.html#cfn-wisdom-messagetemplate-defaultattributes)
     * @param defaultAttributes An object that specifies the default values to use for variables in
     * the message template. 
     */
    public fun defaultAttributes(defaultAttributes: MessageTemplateAttributesProperty)

    /**
     * An object that specifies the default values to use for variables in the message template.
     *
     * This object contains different categories of key-value pairs. Each key defines a variable or
     * placeholder in the message template. The corresponding value defines the default value for that
     * variable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-messagetemplate.html#cfn-wisdom-messagetemplate-defaultattributes)
     * @param defaultAttributes An object that specifies the default values to use for variables in
     * the message template. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f313cc12ebc1dc4e8c0bf2f8cc830aca4508abb664858b21ab5387b0b5085ff0")
    public
        fun defaultAttributes(defaultAttributes: MessageTemplateAttributesProperty.Builder.() -> Unit)

    /**
     * The description of the message template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-messagetemplate.html#cfn-wisdom-messagetemplate-description)
     * @param description The description of the message template. 
     */
    public fun description(description: String)

    /**
     * The configuration information of the external data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-messagetemplate.html#cfn-wisdom-messagetemplate-groupingconfiguration)
     * @param groupingConfiguration The configuration information of the external data source. 
     */
    public fun groupingConfiguration(groupingConfiguration: IResolvable)

    /**
     * The configuration information of the external data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-messagetemplate.html#cfn-wisdom-messagetemplate-groupingconfiguration)
     * @param groupingConfiguration The configuration information of the external data source. 
     */
    public fun groupingConfiguration(groupingConfiguration: GroupingConfigurationProperty)

    /**
     * The configuration information of the external data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-messagetemplate.html#cfn-wisdom-messagetemplate-groupingconfiguration)
     * @param groupingConfiguration The configuration information of the external data source. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("647eab99175b3ce5d53d9b1699615971ab167a2d72c69410a5e48fc94d03f037")
    public
        fun groupingConfiguration(groupingConfiguration: GroupingConfigurationProperty.Builder.() -> Unit)

    /**
     * The Amazon Resource Name (ARN) of the knowledge base.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-messagetemplate.html#cfn-wisdom-messagetemplate-knowledgebasearn)
     * @param knowledgeBaseArn The Amazon Resource Name (ARN) of the knowledge base. 
     */
    public fun knowledgeBaseArn(knowledgeBaseArn: String)

    /**
     * The language code value for the language in which the quick response is written.
     *
     * The supported language codes include `de_DE` , `en_US` , `es_ES` , `fr_FR` , `id_ID` ,
     * `it_IT` , `ja_JP` , `ko_KR` , `pt_BR` , `zh_CN` , `zh_TW`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-messagetemplate.html#cfn-wisdom-messagetemplate-language)
     * @param language The language code value for the language in which the quick response is
     * written. 
     */
    public fun language(language: String)

    /**
     * The name of the message template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-messagetemplate.html#cfn-wisdom-messagetemplate-name)
     * @param name The name of the message template. 
     */
    public fun name(name: String)

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-messagetemplate.html#cfn-wisdom-messagetemplate-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-messagetemplate.html#cfn-wisdom-messagetemplate-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.wisdom.CfnMessageTemplate.Builder =
        software.amazon.awscdk.services.wisdom.CfnMessageTemplate.Builder.create(scope, id)

    /**
     * The channel subtype this message template applies to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-messagetemplate.html#cfn-wisdom-messagetemplate-channelsubtype)
     * @param channelSubtype The channel subtype this message template applies to. 
     */
    override fun channelSubtype(channelSubtype: String) {
      cdkBuilder.channelSubtype(channelSubtype)
    }

    /**
     * The content of the message template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-messagetemplate.html#cfn-wisdom-messagetemplate-content)
     * @param content The content of the message template. 
     */
    override fun content(content: IResolvable) {
      cdkBuilder.content(content.let(IResolvable.Companion::unwrap))
    }

    /**
     * The content of the message template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-messagetemplate.html#cfn-wisdom-messagetemplate-content)
     * @param content The content of the message template. 
     */
    override fun content(content: ContentProperty) {
      cdkBuilder.content(content.let(ContentProperty.Companion::unwrap))
    }

    /**
     * The content of the message template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-messagetemplate.html#cfn-wisdom-messagetemplate-content)
     * @param content The content of the message template. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("031b276f991f448b9160a1e3eb6a029bcaedf0a5fffeb563a1c15545038f4b01")
    override fun content(content: ContentProperty.Builder.() -> Unit): Unit =
        content(ContentProperty(content))

    /**
     * An object that specifies the default values to use for variables in the message template.
     *
     * This object contains different categories of key-value pairs. Each key defines a variable or
     * placeholder in the message template. The corresponding value defines the default value for that
     * variable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-messagetemplate.html#cfn-wisdom-messagetemplate-defaultattributes)
     * @param defaultAttributes An object that specifies the default values to use for variables in
     * the message template. 
     */
    override fun defaultAttributes(defaultAttributes: IResolvable) {
      cdkBuilder.defaultAttributes(defaultAttributes.let(IResolvable.Companion::unwrap))
    }

    /**
     * An object that specifies the default values to use for variables in the message template.
     *
     * This object contains different categories of key-value pairs. Each key defines a variable or
     * placeholder in the message template. The corresponding value defines the default value for that
     * variable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-messagetemplate.html#cfn-wisdom-messagetemplate-defaultattributes)
     * @param defaultAttributes An object that specifies the default values to use for variables in
     * the message template. 
     */
    override fun defaultAttributes(defaultAttributes: MessageTemplateAttributesProperty) {
      cdkBuilder.defaultAttributes(defaultAttributes.let(MessageTemplateAttributesProperty.Companion::unwrap))
    }

    /**
     * An object that specifies the default values to use for variables in the message template.
     *
     * This object contains different categories of key-value pairs. Each key defines a variable or
     * placeholder in the message template. The corresponding value defines the default value for that
     * variable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-messagetemplate.html#cfn-wisdom-messagetemplate-defaultattributes)
     * @param defaultAttributes An object that specifies the default values to use for variables in
     * the message template. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f313cc12ebc1dc4e8c0bf2f8cc830aca4508abb664858b21ab5387b0b5085ff0")
    override
        fun defaultAttributes(defaultAttributes: MessageTemplateAttributesProperty.Builder.() -> Unit):
        Unit = defaultAttributes(MessageTemplateAttributesProperty(defaultAttributes))

    /**
     * The description of the message template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-messagetemplate.html#cfn-wisdom-messagetemplate-description)
     * @param description The description of the message template. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The configuration information of the external data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-messagetemplate.html#cfn-wisdom-messagetemplate-groupingconfiguration)
     * @param groupingConfiguration The configuration information of the external data source. 
     */
    override fun groupingConfiguration(groupingConfiguration: IResolvable) {
      cdkBuilder.groupingConfiguration(groupingConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * The configuration information of the external data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-messagetemplate.html#cfn-wisdom-messagetemplate-groupingconfiguration)
     * @param groupingConfiguration The configuration information of the external data source. 
     */
    override fun groupingConfiguration(groupingConfiguration: GroupingConfigurationProperty) {
      cdkBuilder.groupingConfiguration(groupingConfiguration.let(GroupingConfigurationProperty.Companion::unwrap))
    }

    /**
     * The configuration information of the external data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-messagetemplate.html#cfn-wisdom-messagetemplate-groupingconfiguration)
     * @param groupingConfiguration The configuration information of the external data source. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("647eab99175b3ce5d53d9b1699615971ab167a2d72c69410a5e48fc94d03f037")
    override
        fun groupingConfiguration(groupingConfiguration: GroupingConfigurationProperty.Builder.() -> Unit):
        Unit = groupingConfiguration(GroupingConfigurationProperty(groupingConfiguration))

    /**
     * The Amazon Resource Name (ARN) of the knowledge base.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-messagetemplate.html#cfn-wisdom-messagetemplate-knowledgebasearn)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-messagetemplate.html#cfn-wisdom-messagetemplate-language)
     * @param language The language code value for the language in which the quick response is
     * written. 
     */
    override fun language(language: String) {
      cdkBuilder.language(language)
    }

    /**
     * The name of the message template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-messagetemplate.html#cfn-wisdom-messagetemplate-name)
     * @param name The name of the message template. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-messagetemplate.html#cfn-wisdom-messagetemplate-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-messagetemplate.html#cfn-wisdom-messagetemplate-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.wisdom.CfnMessageTemplate =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.wisdom.CfnMessageTemplate.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMessageTemplate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMessageTemplate(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnMessageTemplate):
        CfnMessageTemplate = CfnMessageTemplate(cdkObject)

    internal fun unwrap(wrapped: CfnMessageTemplate):
        software.amazon.awscdk.services.wisdom.CfnMessageTemplate = wrapped.cdkObject as
        software.amazon.awscdk.services.wisdom.CfnMessageTemplate
  }

  /**
   * Information about an agent.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.wisdom.*;
   * AgentAttributesProperty agentAttributesProperty = AgentAttributesProperty.builder()
   * .firstName("firstName")
   * .lastName("lastName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-agentattributes.html)
   */
  public interface AgentAttributesProperty {
    /**
     * The agent’s first name as entered in their Amazon Connect user account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-agentattributes.html#cfn-wisdom-messagetemplate-agentattributes-firstname)
     */
    public fun firstName(): String? = unwrap(this).getFirstName()

    /**
     * The agent’s last name as entered in their Amazon Connect user account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-agentattributes.html#cfn-wisdom-messagetemplate-agentattributes-lastname)
     */
    public fun lastName(): String? = unwrap(this).getLastName()

    /**
     * A builder for [AgentAttributesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param firstName The agent’s first name as entered in their Amazon Connect user account.
       */
      public fun firstName(firstName: String)

      /**
       * @param lastName The agent’s last name as entered in their Amazon Connect user account.
       */
      public fun lastName(lastName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wisdom.CfnMessageTemplate.AgentAttributesProperty.Builder
          =
          software.amazon.awscdk.services.wisdom.CfnMessageTemplate.AgentAttributesProperty.builder()

      /**
       * @param firstName The agent’s first name as entered in their Amazon Connect user account.
       */
      override fun firstName(firstName: String) {
        cdkBuilder.firstName(firstName)
      }

      /**
       * @param lastName The agent’s last name as entered in their Amazon Connect user account.
       */
      override fun lastName(lastName: String) {
        cdkBuilder.lastName(lastName)
      }

      public fun build():
          software.amazon.awscdk.services.wisdom.CfnMessageTemplate.AgentAttributesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.wisdom.CfnMessageTemplate.AgentAttributesProperty,
    ) : CdkObject(cdkObject),
        AgentAttributesProperty {
      /**
       * The agent’s first name as entered in their Amazon Connect user account.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-agentattributes.html#cfn-wisdom-messagetemplate-agentattributes-firstname)
       */
      override fun firstName(): String? = unwrap(this).getFirstName()

      /**
       * The agent’s last name as entered in their Amazon Connect user account.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-agentattributes.html#cfn-wisdom-messagetemplate-agentattributes-lastname)
       */
      override fun lastName(): String? = unwrap(this).getLastName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AgentAttributesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnMessageTemplate.AgentAttributesProperty):
          AgentAttributesProperty = CdkObjectWrappers.wrap(cdkObject) as? AgentAttributesProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: AgentAttributesProperty):
          software.amazon.awscdk.services.wisdom.CfnMessageTemplate.AgentAttributesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wisdom.CfnMessageTemplate.AgentAttributesProperty
    }
  }

  /**
   * The content of the message template.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.wisdom.*;
   * ContentProperty contentProperty = ContentProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-content.html)
   */
  public interface ContentProperty {
    /**
     * The content of the message template that applies to the email channel subtype.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-content.html#cfn-wisdom-messagetemplate-content-emailmessagetemplatecontent)
     */
    public fun emailMessageTemplateContent(): Any? = unwrap(this).getEmailMessageTemplateContent()

    /**
     * The content of message template that applies to SMS channel subtype.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-content.html#cfn-wisdom-messagetemplate-content-smsmessagetemplatecontent)
     */
    public fun smsMessageTemplateContent(): Any? = unwrap(this).getSmsMessageTemplateContent()

    /**
     * A builder for [ContentProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param emailMessageTemplateContent The content of the message template that applies to the
       * email channel subtype.
       */
      public fun emailMessageTemplateContent(emailMessageTemplateContent: IResolvable)

      /**
       * @param emailMessageTemplateContent The content of the message template that applies to the
       * email channel subtype.
       */
      public
          fun emailMessageTemplateContent(emailMessageTemplateContent: EmailMessageTemplateContentProperty)

      /**
       * @param emailMessageTemplateContent The content of the message template that applies to the
       * email channel subtype.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4b3fc50b64f3b0fdececa77c2480193726a30b8bfdc581c0165783a9802c05b4")
      public
          fun emailMessageTemplateContent(emailMessageTemplateContent: EmailMessageTemplateContentProperty.Builder.() -> Unit)

      /**
       * @param smsMessageTemplateContent The content of message template that applies to SMS
       * channel subtype.
       */
      public fun smsMessageTemplateContent(smsMessageTemplateContent: IResolvable)

      /**
       * @param smsMessageTemplateContent The content of message template that applies to SMS
       * channel subtype.
       */
      public
          fun smsMessageTemplateContent(smsMessageTemplateContent: SmsMessageTemplateContentProperty)

      /**
       * @param smsMessageTemplateContent The content of message template that applies to SMS
       * channel subtype.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("743a2e911bf8bddadd5d41c8fdedb161530c3d20162d2cc12e7d31ff0780b6f2")
      public
          fun smsMessageTemplateContent(smsMessageTemplateContent: SmsMessageTemplateContentProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wisdom.CfnMessageTemplate.ContentProperty.Builder =
          software.amazon.awscdk.services.wisdom.CfnMessageTemplate.ContentProperty.builder()

      /**
       * @param emailMessageTemplateContent The content of the message template that applies to the
       * email channel subtype.
       */
      override fun emailMessageTemplateContent(emailMessageTemplateContent: IResolvable) {
        cdkBuilder.emailMessageTemplateContent(emailMessageTemplateContent.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param emailMessageTemplateContent The content of the message template that applies to the
       * email channel subtype.
       */
      override
          fun emailMessageTemplateContent(emailMessageTemplateContent: EmailMessageTemplateContentProperty) {
        cdkBuilder.emailMessageTemplateContent(emailMessageTemplateContent.let(EmailMessageTemplateContentProperty.Companion::unwrap))
      }

      /**
       * @param emailMessageTemplateContent The content of the message template that applies to the
       * email channel subtype.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4b3fc50b64f3b0fdececa77c2480193726a30b8bfdc581c0165783a9802c05b4")
      override
          fun emailMessageTemplateContent(emailMessageTemplateContent: EmailMessageTemplateContentProperty.Builder.() -> Unit):
          Unit =
          emailMessageTemplateContent(EmailMessageTemplateContentProperty(emailMessageTemplateContent))

      /**
       * @param smsMessageTemplateContent The content of message template that applies to SMS
       * channel subtype.
       */
      override fun smsMessageTemplateContent(smsMessageTemplateContent: IResolvable) {
        cdkBuilder.smsMessageTemplateContent(smsMessageTemplateContent.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param smsMessageTemplateContent The content of message template that applies to SMS
       * channel subtype.
       */
      override
          fun smsMessageTemplateContent(smsMessageTemplateContent: SmsMessageTemplateContentProperty) {
        cdkBuilder.smsMessageTemplateContent(smsMessageTemplateContent.let(SmsMessageTemplateContentProperty.Companion::unwrap))
      }

      /**
       * @param smsMessageTemplateContent The content of message template that applies to SMS
       * channel subtype.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("743a2e911bf8bddadd5d41c8fdedb161530c3d20162d2cc12e7d31ff0780b6f2")
      override
          fun smsMessageTemplateContent(smsMessageTemplateContent: SmsMessageTemplateContentProperty.Builder.() -> Unit):
          Unit =
          smsMessageTemplateContent(SmsMessageTemplateContentProperty(smsMessageTemplateContent))

      public fun build(): software.amazon.awscdk.services.wisdom.CfnMessageTemplate.ContentProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.wisdom.CfnMessageTemplate.ContentProperty,
    ) : CdkObject(cdkObject),
        ContentProperty {
      /**
       * The content of the message template that applies to the email channel subtype.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-content.html#cfn-wisdom-messagetemplate-content-emailmessagetemplatecontent)
       */
      override fun emailMessageTemplateContent(): Any? =
          unwrap(this).getEmailMessageTemplateContent()

      /**
       * The content of message template that applies to SMS channel subtype.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-content.html#cfn-wisdom-messagetemplate-content-smsmessagetemplatecontent)
       */
      override fun smsMessageTemplateContent(): Any? = unwrap(this).getSmsMessageTemplateContent()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ContentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnMessageTemplate.ContentProperty):
          ContentProperty = CdkObjectWrappers.wrap(cdkObject) as? ContentProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ContentProperty):
          software.amazon.awscdk.services.wisdom.CfnMessageTemplate.ContentProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.wisdom.CfnMessageTemplate.ContentProperty
    }
  }

  /**
   * The customer profile attributes that are used with the message template.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.wisdom.*;
   * CustomerProfileAttributesProperty customerProfileAttributesProperty =
   * CustomerProfileAttributesProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html)
   */
  public interface CustomerProfileAttributesProperty {
    /**
     * A unique account number that you have given to the customer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-accountnumber)
     */
    public fun accountNumber(): String? = unwrap(this).getAccountNumber()

    /**
     * Any additional information relevant to the customer's profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-additionalinformation)
     */
    public fun additionalInformation(): String? = unwrap(this).getAdditionalInformation()

    /**
     * The first line of a customer address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-address1)
     */
    public fun address1(): String? = unwrap(this).getAddress1()

    /**
     * The second line of a customer address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-address2)
     */
    public fun address2(): String? = unwrap(this).getAddress2()

    /**
     * The third line of a customer address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-address3)
     */
    public fun address3(): String? = unwrap(this).getAddress3()

    /**
     * The fourth line of a customer address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-address4)
     */
    public fun address4(): String? = unwrap(this).getAddress4()

    /**
     * The first line of a customer’s billing address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-billingaddress1)
     */
    public fun billingAddress1(): String? = unwrap(this).getBillingAddress1()

    /**
     * The second line of a customer’s billing address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-billingaddress2)
     */
    public fun billingAddress2(): String? = unwrap(this).getBillingAddress2()

    /**
     * The third line of a customer’s billing address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-billingaddress3)
     */
    public fun billingAddress3(): String? = unwrap(this).getBillingAddress3()

    /**
     * The fourth line of a customer’s billing address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-billingaddress4)
     */
    public fun billingAddress4(): String? = unwrap(this).getBillingAddress4()

    /**
     * The city of a customer’s billing address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-billingcity)
     */
    public fun billingCity(): String? = unwrap(this).getBillingCity()

    /**
     * The country of a customer’s billing address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-billingcountry)
     */
    public fun billingCountry(): String? = unwrap(this).getBillingCountry()

    /**
     * The county of a customer’s billing address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-billingcounty)
     */
    public fun billingCounty(): String? = unwrap(this).getBillingCounty()

    /**
     * The postal code of a customer’s billing address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-billingpostalcode)
     */
    public fun billingPostalCode(): String? = unwrap(this).getBillingPostalCode()

    /**
     * The province of a customer’s billing address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-billingprovince)
     */
    public fun billingProvince(): String? = unwrap(this).getBillingProvince()

    /**
     * The state of a customer’s billing address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-billingstate)
     */
    public fun billingState(): String? = unwrap(this).getBillingState()

    /**
     * The customer's birth date.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-birthdate)
     */
    public fun birthDate(): String? = unwrap(this).getBirthDate()

    /**
     * The customer's business email address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-businessemailaddress)
     */
    public fun businessEmailAddress(): String? = unwrap(this).getBusinessEmailAddress()

    /**
     * The name of the customer's business.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-businessname)
     */
    public fun businessName(): String? = unwrap(this).getBusinessName()

    /**
     * The customer's business phone number.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-businessphonenumber)
     */
    public fun businessPhoneNumber(): String? = unwrap(this).getBusinessPhoneNumber()

    /**
     * The city in which a customer lives.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-city)
     */
    public fun city(): String? = unwrap(this).getCity()

    /**
     * The country in which a customer lives.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-country)
     */
    public fun country(): String? = unwrap(this).getCountry()

    /**
     * The county in which a customer lives.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-county)
     */
    public fun county(): String? = unwrap(this).getCounty()

    /**
     * The custom attributes in customer profile attributes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-custom)
     */
    public fun custom(): Any? = unwrap(this).getCustom()

    /**
     * The customer's email address, which has not been specified as a personal or business address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-emailaddress)
     */
    public fun emailAddress(): String? = unwrap(this).getEmailAddress()

    /**
     * The customer's first name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-firstname)
     */
    public fun firstName(): String? = unwrap(this).getFirstName()

    /**
     * The customer's gender.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-gender)
     */
    public fun gender(): String? = unwrap(this).getGender()

    /**
     * The customer's mobile phone number.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-homephonenumber)
     */
    public fun homePhoneNumber(): String? = unwrap(this).getHomePhoneNumber()

    /**
     * The customer's last name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-lastname)
     */
    public fun lastName(): String? = unwrap(this).getLastName()

    /**
     * The first line of a customer’s mailing address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-mailingaddress1)
     */
    public fun mailingAddress1(): String? = unwrap(this).getMailingAddress1()

    /**
     * The second line of a customer’s mailing address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-mailingaddress2)
     */
    public fun mailingAddress2(): String? = unwrap(this).getMailingAddress2()

    /**
     * The third line of a customer’s mailing address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-mailingaddress3)
     */
    public fun mailingAddress3(): String? = unwrap(this).getMailingAddress3()

    /**
     * The fourth line of a customer’s mailing address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-mailingaddress4)
     */
    public fun mailingAddress4(): String? = unwrap(this).getMailingAddress4()

    /**
     * The city of a customer’s mailing address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-mailingcity)
     */
    public fun mailingCity(): String? = unwrap(this).getMailingCity()

    /**
     * The country of a customer’s mailing address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-mailingcountry)
     */
    public fun mailingCountry(): String? = unwrap(this).getMailingCountry()

    /**
     * The county of a customer’s mailing address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-mailingcounty)
     */
    public fun mailingCounty(): String? = unwrap(this).getMailingCounty()

    /**
     * The postal code of a customer’s mailing address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-mailingpostalcode)
     */
    public fun mailingPostalCode(): String? = unwrap(this).getMailingPostalCode()

    /**
     * The province of a customer’s mailing address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-mailingprovince)
     */
    public fun mailingProvince(): String? = unwrap(this).getMailingProvince()

    /**
     * The state of a customer’s mailing address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-mailingstate)
     */
    public fun mailingState(): String? = unwrap(this).getMailingState()

    /**
     * The customer's middle name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-middlename)
     */
    public fun middleName(): String? = unwrap(this).getMiddleName()

    /**
     * The customer's mobile phone number.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-mobilephonenumber)
     */
    public fun mobilePhoneNumber(): String? = unwrap(this).getMobilePhoneNumber()

    /**
     * The customer's party type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-partytype)
     */
    public fun partyType(): String? = unwrap(this).getPartyType()

    /**
     * The customer's phone number, which has not been specified as a mobile, home, or business
     * number.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-phonenumber)
     */
    public fun phoneNumber(): String? = unwrap(this).getPhoneNumber()

    /**
     * The postal code of a customer address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-postalcode)
     */
    public fun postalCode(): String? = unwrap(this).getPostalCode()

    /**
     * The ARN of a customer profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-profilearn)
     */
    public fun profileArn(): String? = unwrap(this).getProfileArn()

    /**
     * The unique identifier of a customer profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-profileid)
     */
    public fun profileId(): String? = unwrap(this).getProfileId()

    /**
     * The province in which a customer lives.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-province)
     */
    public fun province(): String? = unwrap(this).getProvince()

    /**
     * The first line of a customer’s shipping address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-shippingaddress1)
     */
    public fun shippingAddress1(): String? = unwrap(this).getShippingAddress1()

    /**
     * The second line of a customer’s shipping address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-shippingaddress2)
     */
    public fun shippingAddress2(): String? = unwrap(this).getShippingAddress2()

    /**
     * The third line of a customer’s shipping address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-shippingaddress3)
     */
    public fun shippingAddress3(): String? = unwrap(this).getShippingAddress3()

    /**
     * The fourth line of a customer’s shipping address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-shippingaddress4)
     */
    public fun shippingAddress4(): String? = unwrap(this).getShippingAddress4()

    /**
     * The city of a customer’s shipping address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-shippingcity)
     */
    public fun shippingCity(): String? = unwrap(this).getShippingCity()

    /**
     * The country of a customer’s shipping address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-shippingcountry)
     */
    public fun shippingCountry(): String? = unwrap(this).getShippingCountry()

    /**
     * The county of a customer’s shipping address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-shippingcounty)
     */
    public fun shippingCounty(): String? = unwrap(this).getShippingCounty()

    /**
     * The postal code of a customer’s shipping address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-shippingpostalcode)
     */
    public fun shippingPostalCode(): String? = unwrap(this).getShippingPostalCode()

    /**
     * The province of a customer’s shipping address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-shippingprovince)
     */
    public fun shippingProvince(): String? = unwrap(this).getShippingProvince()

    /**
     * The state of a customer’s shipping address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-shippingstate)
     */
    public fun shippingState(): String? = unwrap(this).getShippingState()

    /**
     * The state in which a customer lives.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-state)
     */
    public fun state(): String? = unwrap(this).getState()

    /**
     * A builder for [CustomerProfileAttributesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param accountNumber A unique account number that you have given to the customer.
       */
      public fun accountNumber(accountNumber: String)

      /**
       * @param additionalInformation Any additional information relevant to the customer's profile.
       */
      public fun additionalInformation(additionalInformation: String)

      /**
       * @param address1 The first line of a customer address.
       */
      public fun address1(address1: String)

      /**
       * @param address2 The second line of a customer address.
       */
      public fun address2(address2: String)

      /**
       * @param address3 The third line of a customer address.
       */
      public fun address3(address3: String)

      /**
       * @param address4 The fourth line of a customer address.
       */
      public fun address4(address4: String)

      /**
       * @param billingAddress1 The first line of a customer’s billing address.
       */
      public fun billingAddress1(billingAddress1: String)

      /**
       * @param billingAddress2 The second line of a customer’s billing address.
       */
      public fun billingAddress2(billingAddress2: String)

      /**
       * @param billingAddress3 The third line of a customer’s billing address.
       */
      public fun billingAddress3(billingAddress3: String)

      /**
       * @param billingAddress4 The fourth line of a customer’s billing address.
       */
      public fun billingAddress4(billingAddress4: String)

      /**
       * @param billingCity The city of a customer’s billing address.
       */
      public fun billingCity(billingCity: String)

      /**
       * @param billingCountry The country of a customer’s billing address.
       */
      public fun billingCountry(billingCountry: String)

      /**
       * @param billingCounty The county of a customer’s billing address.
       */
      public fun billingCounty(billingCounty: String)

      /**
       * @param billingPostalCode The postal code of a customer’s billing address.
       */
      public fun billingPostalCode(billingPostalCode: String)

      /**
       * @param billingProvince The province of a customer’s billing address.
       */
      public fun billingProvince(billingProvince: String)

      /**
       * @param billingState The state of a customer’s billing address.
       */
      public fun billingState(billingState: String)

      /**
       * @param birthDate The customer's birth date.
       */
      public fun birthDate(birthDate: String)

      /**
       * @param businessEmailAddress The customer's business email address.
       */
      public fun businessEmailAddress(businessEmailAddress: String)

      /**
       * @param businessName The name of the customer's business.
       */
      public fun businessName(businessName: String)

      /**
       * @param businessPhoneNumber The customer's business phone number.
       */
      public fun businessPhoneNumber(businessPhoneNumber: String)

      /**
       * @param city The city in which a customer lives.
       */
      public fun city(city: String)

      /**
       * @param country The country in which a customer lives.
       */
      public fun country(country: String)

      /**
       * @param county The county in which a customer lives.
       */
      public fun county(county: String)

      /**
       * @param custom The custom attributes in customer profile attributes.
       */
      public fun custom(custom: IResolvable)

      /**
       * @param custom The custom attributes in customer profile attributes.
       */
      public fun custom(custom: Map<String, String>)

      /**
       * @param emailAddress The customer's email address, which has not been specified as a
       * personal or business address.
       */
      public fun emailAddress(emailAddress: String)

      /**
       * @param firstName The customer's first name.
       */
      public fun firstName(firstName: String)

      /**
       * @param gender The customer's gender.
       */
      public fun gender(gender: String)

      /**
       * @param homePhoneNumber The customer's mobile phone number.
       */
      public fun homePhoneNumber(homePhoneNumber: String)

      /**
       * @param lastName The customer's last name.
       */
      public fun lastName(lastName: String)

      /**
       * @param mailingAddress1 The first line of a customer’s mailing address.
       */
      public fun mailingAddress1(mailingAddress1: String)

      /**
       * @param mailingAddress2 The second line of a customer’s mailing address.
       */
      public fun mailingAddress2(mailingAddress2: String)

      /**
       * @param mailingAddress3 The third line of a customer’s mailing address.
       */
      public fun mailingAddress3(mailingAddress3: String)

      /**
       * @param mailingAddress4 The fourth line of a customer’s mailing address.
       */
      public fun mailingAddress4(mailingAddress4: String)

      /**
       * @param mailingCity The city of a customer’s mailing address.
       */
      public fun mailingCity(mailingCity: String)

      /**
       * @param mailingCountry The country of a customer’s mailing address.
       */
      public fun mailingCountry(mailingCountry: String)

      /**
       * @param mailingCounty The county of a customer’s mailing address.
       */
      public fun mailingCounty(mailingCounty: String)

      /**
       * @param mailingPostalCode The postal code of a customer’s mailing address.
       */
      public fun mailingPostalCode(mailingPostalCode: String)

      /**
       * @param mailingProvince The province of a customer’s mailing address.
       */
      public fun mailingProvince(mailingProvince: String)

      /**
       * @param mailingState The state of a customer’s mailing address.
       */
      public fun mailingState(mailingState: String)

      /**
       * @param middleName The customer's middle name.
       */
      public fun middleName(middleName: String)

      /**
       * @param mobilePhoneNumber The customer's mobile phone number.
       */
      public fun mobilePhoneNumber(mobilePhoneNumber: String)

      /**
       * @param partyType The customer's party type.
       */
      public fun partyType(partyType: String)

      /**
       * @param phoneNumber The customer's phone number, which has not been specified as a mobile,
       * home, or business number.
       */
      public fun phoneNumber(phoneNumber: String)

      /**
       * @param postalCode The postal code of a customer address.
       */
      public fun postalCode(postalCode: String)

      /**
       * @param profileArn The ARN of a customer profile.
       */
      public fun profileArn(profileArn: String)

      /**
       * @param profileId The unique identifier of a customer profile.
       */
      public fun profileId(profileId: String)

      /**
       * @param province The province in which a customer lives.
       */
      public fun province(province: String)

      /**
       * @param shippingAddress1 The first line of a customer’s shipping address.
       */
      public fun shippingAddress1(shippingAddress1: String)

      /**
       * @param shippingAddress2 The second line of a customer’s shipping address.
       */
      public fun shippingAddress2(shippingAddress2: String)

      /**
       * @param shippingAddress3 The third line of a customer’s shipping address.
       */
      public fun shippingAddress3(shippingAddress3: String)

      /**
       * @param shippingAddress4 The fourth line of a customer’s shipping address.
       */
      public fun shippingAddress4(shippingAddress4: String)

      /**
       * @param shippingCity The city of a customer’s shipping address.
       */
      public fun shippingCity(shippingCity: String)

      /**
       * @param shippingCountry The country of a customer’s shipping address.
       */
      public fun shippingCountry(shippingCountry: String)

      /**
       * @param shippingCounty The county of a customer’s shipping address.
       */
      public fun shippingCounty(shippingCounty: String)

      /**
       * @param shippingPostalCode The postal code of a customer’s shipping address.
       */
      public fun shippingPostalCode(shippingPostalCode: String)

      /**
       * @param shippingProvince The province of a customer’s shipping address.
       */
      public fun shippingProvince(shippingProvince: String)

      /**
       * @param shippingState The state of a customer’s shipping address.
       */
      public fun shippingState(shippingState: String)

      /**
       * @param state The state in which a customer lives.
       */
      public fun state(state: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wisdom.CfnMessageTemplate.CustomerProfileAttributesProperty.Builder
          =
          software.amazon.awscdk.services.wisdom.CfnMessageTemplate.CustomerProfileAttributesProperty.builder()

      /**
       * @param accountNumber A unique account number that you have given to the customer.
       */
      override fun accountNumber(accountNumber: String) {
        cdkBuilder.accountNumber(accountNumber)
      }

      /**
       * @param additionalInformation Any additional information relevant to the customer's profile.
       */
      override fun additionalInformation(additionalInformation: String) {
        cdkBuilder.additionalInformation(additionalInformation)
      }

      /**
       * @param address1 The first line of a customer address.
       */
      override fun address1(address1: String) {
        cdkBuilder.address1(address1)
      }

      /**
       * @param address2 The second line of a customer address.
       */
      override fun address2(address2: String) {
        cdkBuilder.address2(address2)
      }

      /**
       * @param address3 The third line of a customer address.
       */
      override fun address3(address3: String) {
        cdkBuilder.address3(address3)
      }

      /**
       * @param address4 The fourth line of a customer address.
       */
      override fun address4(address4: String) {
        cdkBuilder.address4(address4)
      }

      /**
       * @param billingAddress1 The first line of a customer’s billing address.
       */
      override fun billingAddress1(billingAddress1: String) {
        cdkBuilder.billingAddress1(billingAddress1)
      }

      /**
       * @param billingAddress2 The second line of a customer’s billing address.
       */
      override fun billingAddress2(billingAddress2: String) {
        cdkBuilder.billingAddress2(billingAddress2)
      }

      /**
       * @param billingAddress3 The third line of a customer’s billing address.
       */
      override fun billingAddress3(billingAddress3: String) {
        cdkBuilder.billingAddress3(billingAddress3)
      }

      /**
       * @param billingAddress4 The fourth line of a customer’s billing address.
       */
      override fun billingAddress4(billingAddress4: String) {
        cdkBuilder.billingAddress4(billingAddress4)
      }

      /**
       * @param billingCity The city of a customer’s billing address.
       */
      override fun billingCity(billingCity: String) {
        cdkBuilder.billingCity(billingCity)
      }

      /**
       * @param billingCountry The country of a customer’s billing address.
       */
      override fun billingCountry(billingCountry: String) {
        cdkBuilder.billingCountry(billingCountry)
      }

      /**
       * @param billingCounty The county of a customer’s billing address.
       */
      override fun billingCounty(billingCounty: String) {
        cdkBuilder.billingCounty(billingCounty)
      }

      /**
       * @param billingPostalCode The postal code of a customer’s billing address.
       */
      override fun billingPostalCode(billingPostalCode: String) {
        cdkBuilder.billingPostalCode(billingPostalCode)
      }

      /**
       * @param billingProvince The province of a customer’s billing address.
       */
      override fun billingProvince(billingProvince: String) {
        cdkBuilder.billingProvince(billingProvince)
      }

      /**
       * @param billingState The state of a customer’s billing address.
       */
      override fun billingState(billingState: String) {
        cdkBuilder.billingState(billingState)
      }

      /**
       * @param birthDate The customer's birth date.
       */
      override fun birthDate(birthDate: String) {
        cdkBuilder.birthDate(birthDate)
      }

      /**
       * @param businessEmailAddress The customer's business email address.
       */
      override fun businessEmailAddress(businessEmailAddress: String) {
        cdkBuilder.businessEmailAddress(businessEmailAddress)
      }

      /**
       * @param businessName The name of the customer's business.
       */
      override fun businessName(businessName: String) {
        cdkBuilder.businessName(businessName)
      }

      /**
       * @param businessPhoneNumber The customer's business phone number.
       */
      override fun businessPhoneNumber(businessPhoneNumber: String) {
        cdkBuilder.businessPhoneNumber(businessPhoneNumber)
      }

      /**
       * @param city The city in which a customer lives.
       */
      override fun city(city: String) {
        cdkBuilder.city(city)
      }

      /**
       * @param country The country in which a customer lives.
       */
      override fun country(country: String) {
        cdkBuilder.country(country)
      }

      /**
       * @param county The county in which a customer lives.
       */
      override fun county(county: String) {
        cdkBuilder.county(county)
      }

      /**
       * @param custom The custom attributes in customer profile attributes.
       */
      override fun custom(custom: IResolvable) {
        cdkBuilder.custom(custom.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param custom The custom attributes in customer profile attributes.
       */
      override fun custom(custom: Map<String, String>) {
        cdkBuilder.custom(custom)
      }

      /**
       * @param emailAddress The customer's email address, which has not been specified as a
       * personal or business address.
       */
      override fun emailAddress(emailAddress: String) {
        cdkBuilder.emailAddress(emailAddress)
      }

      /**
       * @param firstName The customer's first name.
       */
      override fun firstName(firstName: String) {
        cdkBuilder.firstName(firstName)
      }

      /**
       * @param gender The customer's gender.
       */
      override fun gender(gender: String) {
        cdkBuilder.gender(gender)
      }

      /**
       * @param homePhoneNumber The customer's mobile phone number.
       */
      override fun homePhoneNumber(homePhoneNumber: String) {
        cdkBuilder.homePhoneNumber(homePhoneNumber)
      }

      /**
       * @param lastName The customer's last name.
       */
      override fun lastName(lastName: String) {
        cdkBuilder.lastName(lastName)
      }

      /**
       * @param mailingAddress1 The first line of a customer’s mailing address.
       */
      override fun mailingAddress1(mailingAddress1: String) {
        cdkBuilder.mailingAddress1(mailingAddress1)
      }

      /**
       * @param mailingAddress2 The second line of a customer’s mailing address.
       */
      override fun mailingAddress2(mailingAddress2: String) {
        cdkBuilder.mailingAddress2(mailingAddress2)
      }

      /**
       * @param mailingAddress3 The third line of a customer’s mailing address.
       */
      override fun mailingAddress3(mailingAddress3: String) {
        cdkBuilder.mailingAddress3(mailingAddress3)
      }

      /**
       * @param mailingAddress4 The fourth line of a customer’s mailing address.
       */
      override fun mailingAddress4(mailingAddress4: String) {
        cdkBuilder.mailingAddress4(mailingAddress4)
      }

      /**
       * @param mailingCity The city of a customer’s mailing address.
       */
      override fun mailingCity(mailingCity: String) {
        cdkBuilder.mailingCity(mailingCity)
      }

      /**
       * @param mailingCountry The country of a customer’s mailing address.
       */
      override fun mailingCountry(mailingCountry: String) {
        cdkBuilder.mailingCountry(mailingCountry)
      }

      /**
       * @param mailingCounty The county of a customer’s mailing address.
       */
      override fun mailingCounty(mailingCounty: String) {
        cdkBuilder.mailingCounty(mailingCounty)
      }

      /**
       * @param mailingPostalCode The postal code of a customer’s mailing address.
       */
      override fun mailingPostalCode(mailingPostalCode: String) {
        cdkBuilder.mailingPostalCode(mailingPostalCode)
      }

      /**
       * @param mailingProvince The province of a customer’s mailing address.
       */
      override fun mailingProvince(mailingProvince: String) {
        cdkBuilder.mailingProvince(mailingProvince)
      }

      /**
       * @param mailingState The state of a customer’s mailing address.
       */
      override fun mailingState(mailingState: String) {
        cdkBuilder.mailingState(mailingState)
      }

      /**
       * @param middleName The customer's middle name.
       */
      override fun middleName(middleName: String) {
        cdkBuilder.middleName(middleName)
      }

      /**
       * @param mobilePhoneNumber The customer's mobile phone number.
       */
      override fun mobilePhoneNumber(mobilePhoneNumber: String) {
        cdkBuilder.mobilePhoneNumber(mobilePhoneNumber)
      }

      /**
       * @param partyType The customer's party type.
       */
      override fun partyType(partyType: String) {
        cdkBuilder.partyType(partyType)
      }

      /**
       * @param phoneNumber The customer's phone number, which has not been specified as a mobile,
       * home, or business number.
       */
      override fun phoneNumber(phoneNumber: String) {
        cdkBuilder.phoneNumber(phoneNumber)
      }

      /**
       * @param postalCode The postal code of a customer address.
       */
      override fun postalCode(postalCode: String) {
        cdkBuilder.postalCode(postalCode)
      }

      /**
       * @param profileArn The ARN of a customer profile.
       */
      override fun profileArn(profileArn: String) {
        cdkBuilder.profileArn(profileArn)
      }

      /**
       * @param profileId The unique identifier of a customer profile.
       */
      override fun profileId(profileId: String) {
        cdkBuilder.profileId(profileId)
      }

      /**
       * @param province The province in which a customer lives.
       */
      override fun province(province: String) {
        cdkBuilder.province(province)
      }

      /**
       * @param shippingAddress1 The first line of a customer’s shipping address.
       */
      override fun shippingAddress1(shippingAddress1: String) {
        cdkBuilder.shippingAddress1(shippingAddress1)
      }

      /**
       * @param shippingAddress2 The second line of a customer’s shipping address.
       */
      override fun shippingAddress2(shippingAddress2: String) {
        cdkBuilder.shippingAddress2(shippingAddress2)
      }

      /**
       * @param shippingAddress3 The third line of a customer’s shipping address.
       */
      override fun shippingAddress3(shippingAddress3: String) {
        cdkBuilder.shippingAddress3(shippingAddress3)
      }

      /**
       * @param shippingAddress4 The fourth line of a customer’s shipping address.
       */
      override fun shippingAddress4(shippingAddress4: String) {
        cdkBuilder.shippingAddress4(shippingAddress4)
      }

      /**
       * @param shippingCity The city of a customer’s shipping address.
       */
      override fun shippingCity(shippingCity: String) {
        cdkBuilder.shippingCity(shippingCity)
      }

      /**
       * @param shippingCountry The country of a customer’s shipping address.
       */
      override fun shippingCountry(shippingCountry: String) {
        cdkBuilder.shippingCountry(shippingCountry)
      }

      /**
       * @param shippingCounty The county of a customer’s shipping address.
       */
      override fun shippingCounty(shippingCounty: String) {
        cdkBuilder.shippingCounty(shippingCounty)
      }

      /**
       * @param shippingPostalCode The postal code of a customer’s shipping address.
       */
      override fun shippingPostalCode(shippingPostalCode: String) {
        cdkBuilder.shippingPostalCode(shippingPostalCode)
      }

      /**
       * @param shippingProvince The province of a customer’s shipping address.
       */
      override fun shippingProvince(shippingProvince: String) {
        cdkBuilder.shippingProvince(shippingProvince)
      }

      /**
       * @param shippingState The state of a customer’s shipping address.
       */
      override fun shippingState(shippingState: String) {
        cdkBuilder.shippingState(shippingState)
      }

      /**
       * @param state The state in which a customer lives.
       */
      override fun state(state: String) {
        cdkBuilder.state(state)
      }

      public fun build():
          software.amazon.awscdk.services.wisdom.CfnMessageTemplate.CustomerProfileAttributesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.wisdom.CfnMessageTemplate.CustomerProfileAttributesProperty,
    ) : CdkObject(cdkObject),
        CustomerProfileAttributesProperty {
      /**
       * A unique account number that you have given to the customer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-accountnumber)
       */
      override fun accountNumber(): String? = unwrap(this).getAccountNumber()

      /**
       * Any additional information relevant to the customer's profile.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-additionalinformation)
       */
      override fun additionalInformation(): String? = unwrap(this).getAdditionalInformation()

      /**
       * The first line of a customer address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-address1)
       */
      override fun address1(): String? = unwrap(this).getAddress1()

      /**
       * The second line of a customer address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-address2)
       */
      override fun address2(): String? = unwrap(this).getAddress2()

      /**
       * The third line of a customer address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-address3)
       */
      override fun address3(): String? = unwrap(this).getAddress3()

      /**
       * The fourth line of a customer address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-address4)
       */
      override fun address4(): String? = unwrap(this).getAddress4()

      /**
       * The first line of a customer’s billing address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-billingaddress1)
       */
      override fun billingAddress1(): String? = unwrap(this).getBillingAddress1()

      /**
       * The second line of a customer’s billing address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-billingaddress2)
       */
      override fun billingAddress2(): String? = unwrap(this).getBillingAddress2()

      /**
       * The third line of a customer’s billing address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-billingaddress3)
       */
      override fun billingAddress3(): String? = unwrap(this).getBillingAddress3()

      /**
       * The fourth line of a customer’s billing address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-billingaddress4)
       */
      override fun billingAddress4(): String? = unwrap(this).getBillingAddress4()

      /**
       * The city of a customer’s billing address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-billingcity)
       */
      override fun billingCity(): String? = unwrap(this).getBillingCity()

      /**
       * The country of a customer’s billing address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-billingcountry)
       */
      override fun billingCountry(): String? = unwrap(this).getBillingCountry()

      /**
       * The county of a customer’s billing address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-billingcounty)
       */
      override fun billingCounty(): String? = unwrap(this).getBillingCounty()

      /**
       * The postal code of a customer’s billing address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-billingpostalcode)
       */
      override fun billingPostalCode(): String? = unwrap(this).getBillingPostalCode()

      /**
       * The province of a customer’s billing address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-billingprovince)
       */
      override fun billingProvince(): String? = unwrap(this).getBillingProvince()

      /**
       * The state of a customer’s billing address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-billingstate)
       */
      override fun billingState(): String? = unwrap(this).getBillingState()

      /**
       * The customer's birth date.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-birthdate)
       */
      override fun birthDate(): String? = unwrap(this).getBirthDate()

      /**
       * The customer's business email address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-businessemailaddress)
       */
      override fun businessEmailAddress(): String? = unwrap(this).getBusinessEmailAddress()

      /**
       * The name of the customer's business.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-businessname)
       */
      override fun businessName(): String? = unwrap(this).getBusinessName()

      /**
       * The customer's business phone number.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-businessphonenumber)
       */
      override fun businessPhoneNumber(): String? = unwrap(this).getBusinessPhoneNumber()

      /**
       * The city in which a customer lives.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-city)
       */
      override fun city(): String? = unwrap(this).getCity()

      /**
       * The country in which a customer lives.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-country)
       */
      override fun country(): String? = unwrap(this).getCountry()

      /**
       * The county in which a customer lives.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-county)
       */
      override fun county(): String? = unwrap(this).getCounty()

      /**
       * The custom attributes in customer profile attributes.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-custom)
       */
      override fun custom(): Any? = unwrap(this).getCustom()

      /**
       * The customer's email address, which has not been specified as a personal or business
       * address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-emailaddress)
       */
      override fun emailAddress(): String? = unwrap(this).getEmailAddress()

      /**
       * The customer's first name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-firstname)
       */
      override fun firstName(): String? = unwrap(this).getFirstName()

      /**
       * The customer's gender.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-gender)
       */
      override fun gender(): String? = unwrap(this).getGender()

      /**
       * The customer's mobile phone number.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-homephonenumber)
       */
      override fun homePhoneNumber(): String? = unwrap(this).getHomePhoneNumber()

      /**
       * The customer's last name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-lastname)
       */
      override fun lastName(): String? = unwrap(this).getLastName()

      /**
       * The first line of a customer’s mailing address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-mailingaddress1)
       */
      override fun mailingAddress1(): String? = unwrap(this).getMailingAddress1()

      /**
       * The second line of a customer’s mailing address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-mailingaddress2)
       */
      override fun mailingAddress2(): String? = unwrap(this).getMailingAddress2()

      /**
       * The third line of a customer’s mailing address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-mailingaddress3)
       */
      override fun mailingAddress3(): String? = unwrap(this).getMailingAddress3()

      /**
       * The fourth line of a customer’s mailing address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-mailingaddress4)
       */
      override fun mailingAddress4(): String? = unwrap(this).getMailingAddress4()

      /**
       * The city of a customer’s mailing address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-mailingcity)
       */
      override fun mailingCity(): String? = unwrap(this).getMailingCity()

      /**
       * The country of a customer’s mailing address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-mailingcountry)
       */
      override fun mailingCountry(): String? = unwrap(this).getMailingCountry()

      /**
       * The county of a customer’s mailing address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-mailingcounty)
       */
      override fun mailingCounty(): String? = unwrap(this).getMailingCounty()

      /**
       * The postal code of a customer’s mailing address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-mailingpostalcode)
       */
      override fun mailingPostalCode(): String? = unwrap(this).getMailingPostalCode()

      /**
       * The province of a customer’s mailing address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-mailingprovince)
       */
      override fun mailingProvince(): String? = unwrap(this).getMailingProvince()

      /**
       * The state of a customer’s mailing address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-mailingstate)
       */
      override fun mailingState(): String? = unwrap(this).getMailingState()

      /**
       * The customer's middle name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-middlename)
       */
      override fun middleName(): String? = unwrap(this).getMiddleName()

      /**
       * The customer's mobile phone number.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-mobilephonenumber)
       */
      override fun mobilePhoneNumber(): String? = unwrap(this).getMobilePhoneNumber()

      /**
       * The customer's party type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-partytype)
       */
      override fun partyType(): String? = unwrap(this).getPartyType()

      /**
       * The customer's phone number, which has not been specified as a mobile, home, or business
       * number.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-phonenumber)
       */
      override fun phoneNumber(): String? = unwrap(this).getPhoneNumber()

      /**
       * The postal code of a customer address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-postalcode)
       */
      override fun postalCode(): String? = unwrap(this).getPostalCode()

      /**
       * The ARN of a customer profile.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-profilearn)
       */
      override fun profileArn(): String? = unwrap(this).getProfileArn()

      /**
       * The unique identifier of a customer profile.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-profileid)
       */
      override fun profileId(): String? = unwrap(this).getProfileId()

      /**
       * The province in which a customer lives.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-province)
       */
      override fun province(): String? = unwrap(this).getProvince()

      /**
       * The first line of a customer’s shipping address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-shippingaddress1)
       */
      override fun shippingAddress1(): String? = unwrap(this).getShippingAddress1()

      /**
       * The second line of a customer’s shipping address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-shippingaddress2)
       */
      override fun shippingAddress2(): String? = unwrap(this).getShippingAddress2()

      /**
       * The third line of a customer’s shipping address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-shippingaddress3)
       */
      override fun shippingAddress3(): String? = unwrap(this).getShippingAddress3()

      /**
       * The fourth line of a customer’s shipping address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-shippingaddress4)
       */
      override fun shippingAddress4(): String? = unwrap(this).getShippingAddress4()

      /**
       * The city of a customer’s shipping address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-shippingcity)
       */
      override fun shippingCity(): String? = unwrap(this).getShippingCity()

      /**
       * The country of a customer’s shipping address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-shippingcountry)
       */
      override fun shippingCountry(): String? = unwrap(this).getShippingCountry()

      /**
       * The county of a customer’s shipping address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-shippingcounty)
       */
      override fun shippingCounty(): String? = unwrap(this).getShippingCounty()

      /**
       * The postal code of a customer’s shipping address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-shippingpostalcode)
       */
      override fun shippingPostalCode(): String? = unwrap(this).getShippingPostalCode()

      /**
       * The province of a customer’s shipping address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-shippingprovince)
       */
      override fun shippingProvince(): String? = unwrap(this).getShippingProvince()

      /**
       * The state of a customer’s shipping address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-shippingstate)
       */
      override fun shippingState(): String? = unwrap(this).getShippingState()

      /**
       * The state in which a customer lives.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-customerprofileattributes.html#cfn-wisdom-messagetemplate-customerprofileattributes-state)
       */
      override fun state(): String? = unwrap(this).getState()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CustomerProfileAttributesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnMessageTemplate.CustomerProfileAttributesProperty):
          CustomerProfileAttributesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CustomerProfileAttributesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomerProfileAttributesProperty):
          software.amazon.awscdk.services.wisdom.CfnMessageTemplate.CustomerProfileAttributesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wisdom.CfnMessageTemplate.CustomerProfileAttributesProperty
    }
  }

  /**
   * The body to use in email messages.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.wisdom.*;
   * EmailMessageTemplateContentBodyProperty emailMessageTemplateContentBodyProperty =
   * EmailMessageTemplateContentBodyProperty.builder()
   * .html(MessageTemplateBodyContentProviderProperty.builder()
   * .content("content")
   * .build())
   * .plainText(MessageTemplateBodyContentProviderProperty.builder()
   * .content("content")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-emailmessagetemplatecontentbody.html)
   */
  public interface EmailMessageTemplateContentBodyProperty {
    /**
     * The message body, in HTML format, to use in email messages that are based on the message
     * template.
     *
     * We recommend using HTML format for email clients that render HTML content. You can include
     * links, formatted text, and more in an HTML message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-emailmessagetemplatecontentbody.html#cfn-wisdom-messagetemplate-emailmessagetemplatecontentbody-html)
     */
    public fun html(): Any? = unwrap(this).getHtml()

    /**
     * The message body, in plain text format, to use in email messages that are based on the
     * message template.
     *
     * We recommend using plain text format for email clients that don't render HTML content and
     * clients that are connected to high-latency networks, such as mobile devices.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-emailmessagetemplatecontentbody.html#cfn-wisdom-messagetemplate-emailmessagetemplatecontentbody-plaintext)
     */
    public fun plainText(): Any? = unwrap(this).getPlainText()

    /**
     * A builder for [EmailMessageTemplateContentBodyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param html The message body, in HTML format, to use in email messages that are based on
       * the message template.
       * We recommend using HTML format for email clients that render HTML content. You can include
       * links, formatted text, and more in an HTML message.
       */
      public fun html(html: IResolvable)

      /**
       * @param html The message body, in HTML format, to use in email messages that are based on
       * the message template.
       * We recommend using HTML format for email clients that render HTML content. You can include
       * links, formatted text, and more in an HTML message.
       */
      public fun html(html: MessageTemplateBodyContentProviderProperty)

      /**
       * @param html The message body, in HTML format, to use in email messages that are based on
       * the message template.
       * We recommend using HTML format for email clients that render HTML content. You can include
       * links, formatted text, and more in an HTML message.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d77c6e3719fd64609de294737f037d4d524cd0c822b52925c678f49238a12b6d")
      public fun html(html: MessageTemplateBodyContentProviderProperty.Builder.() -> Unit)

      /**
       * @param plainText The message body, in plain text format, to use in email messages that are
       * based on the message template.
       * We recommend using plain text format for email clients that don't render HTML content and
       * clients that are connected to high-latency networks, such as mobile devices.
       */
      public fun plainText(plainText: IResolvable)

      /**
       * @param plainText The message body, in plain text format, to use in email messages that are
       * based on the message template.
       * We recommend using plain text format for email clients that don't render HTML content and
       * clients that are connected to high-latency networks, such as mobile devices.
       */
      public fun plainText(plainText: MessageTemplateBodyContentProviderProperty)

      /**
       * @param plainText The message body, in plain text format, to use in email messages that are
       * based on the message template.
       * We recommend using plain text format for email clients that don't render HTML content and
       * clients that are connected to high-latency networks, such as mobile devices.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("083dfe34d27c04ac020a2b00d53cb5e06c2ce89f33a818e11faa54026eee8836")
      public fun plainText(plainText: MessageTemplateBodyContentProviderProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wisdom.CfnMessageTemplate.EmailMessageTemplateContentBodyProperty.Builder
          =
          software.amazon.awscdk.services.wisdom.CfnMessageTemplate.EmailMessageTemplateContentBodyProperty.builder()

      /**
       * @param html The message body, in HTML format, to use in email messages that are based on
       * the message template.
       * We recommend using HTML format for email clients that render HTML content. You can include
       * links, formatted text, and more in an HTML message.
       */
      override fun html(html: IResolvable) {
        cdkBuilder.html(html.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param html The message body, in HTML format, to use in email messages that are based on
       * the message template.
       * We recommend using HTML format for email clients that render HTML content. You can include
       * links, formatted text, and more in an HTML message.
       */
      override fun html(html: MessageTemplateBodyContentProviderProperty) {
        cdkBuilder.html(html.let(MessageTemplateBodyContentProviderProperty.Companion::unwrap))
      }

      /**
       * @param html The message body, in HTML format, to use in email messages that are based on
       * the message template.
       * We recommend using HTML format for email clients that render HTML content. You can include
       * links, formatted text, and more in an HTML message.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d77c6e3719fd64609de294737f037d4d524cd0c822b52925c678f49238a12b6d")
      override fun html(html: MessageTemplateBodyContentProviderProperty.Builder.() -> Unit): Unit =
          html(MessageTemplateBodyContentProviderProperty(html))

      /**
       * @param plainText The message body, in plain text format, to use in email messages that are
       * based on the message template.
       * We recommend using plain text format for email clients that don't render HTML content and
       * clients that are connected to high-latency networks, such as mobile devices.
       */
      override fun plainText(plainText: IResolvable) {
        cdkBuilder.plainText(plainText.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param plainText The message body, in plain text format, to use in email messages that are
       * based on the message template.
       * We recommend using plain text format for email clients that don't render HTML content and
       * clients that are connected to high-latency networks, such as mobile devices.
       */
      override fun plainText(plainText: MessageTemplateBodyContentProviderProperty) {
        cdkBuilder.plainText(plainText.let(MessageTemplateBodyContentProviderProperty.Companion::unwrap))
      }

      /**
       * @param plainText The message body, in plain text format, to use in email messages that are
       * based on the message template.
       * We recommend using plain text format for email clients that don't render HTML content and
       * clients that are connected to high-latency networks, such as mobile devices.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("083dfe34d27c04ac020a2b00d53cb5e06c2ce89f33a818e11faa54026eee8836")
      override
          fun plainText(plainText: MessageTemplateBodyContentProviderProperty.Builder.() -> Unit):
          Unit = plainText(MessageTemplateBodyContentProviderProperty(plainText))

      public fun build():
          software.amazon.awscdk.services.wisdom.CfnMessageTemplate.EmailMessageTemplateContentBodyProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.wisdom.CfnMessageTemplate.EmailMessageTemplateContentBodyProperty,
    ) : CdkObject(cdkObject),
        EmailMessageTemplateContentBodyProperty {
      /**
       * The message body, in HTML format, to use in email messages that are based on the message
       * template.
       *
       * We recommend using HTML format for email clients that render HTML content. You can include
       * links, formatted text, and more in an HTML message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-emailmessagetemplatecontentbody.html#cfn-wisdom-messagetemplate-emailmessagetemplatecontentbody-html)
       */
      override fun html(): Any? = unwrap(this).getHtml()

      /**
       * The message body, in plain text format, to use in email messages that are based on the
       * message template.
       *
       * We recommend using plain text format for email clients that don't render HTML content and
       * clients that are connected to high-latency networks, such as mobile devices.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-emailmessagetemplatecontentbody.html#cfn-wisdom-messagetemplate-emailmessagetemplatecontentbody-plaintext)
       */
      override fun plainText(): Any? = unwrap(this).getPlainText()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          EmailMessageTemplateContentBodyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnMessageTemplate.EmailMessageTemplateContentBodyProperty):
          EmailMessageTemplateContentBodyProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EmailMessageTemplateContentBodyProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EmailMessageTemplateContentBodyProperty):
          software.amazon.awscdk.services.wisdom.CfnMessageTemplate.EmailMessageTemplateContentBodyProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wisdom.CfnMessageTemplate.EmailMessageTemplateContentBodyProperty
    }
  }

  /**
   * The content of the message template that applies to the email channel subtype.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.wisdom.*;
   * EmailMessageTemplateContentProperty emailMessageTemplateContentProperty =
   * EmailMessageTemplateContentProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-emailmessagetemplatecontent.html)
   */
  public interface EmailMessageTemplateContentProperty {
    /**
     * The body to use in email messages.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-emailmessagetemplatecontent.html#cfn-wisdom-messagetemplate-emailmessagetemplatecontent-body)
     */
    public fun body(): Any

    /**
     * The email headers to include in email messages.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-emailmessagetemplatecontent.html#cfn-wisdom-messagetemplate-emailmessagetemplatecontent-headers)
     */
    public fun headers(): Any

    /**
     * The subject line, or title, to use in email messages.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-emailmessagetemplatecontent.html#cfn-wisdom-messagetemplate-emailmessagetemplatecontent-subject)
     */
    public fun subject(): String

    /**
     * A builder for [EmailMessageTemplateContentProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param body The body to use in email messages. 
       */
      public fun body(body: IResolvable)

      /**
       * @param body The body to use in email messages. 
       */
      public fun body(body: EmailMessageTemplateContentBodyProperty)

      /**
       * @param body The body to use in email messages. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5040531c41df01baad47328fbbef07513826d2b09977e0ce539a3ff8307e80c7")
      public fun body(body: EmailMessageTemplateContentBodyProperty.Builder.() -> Unit)

      /**
       * @param headers The email headers to include in email messages. 
       */
      public fun headers(headers: IResolvable)

      /**
       * @param headers The email headers to include in email messages. 
       */
      public fun headers(headers: List<Any>)

      /**
       * @param headers The email headers to include in email messages. 
       */
      public fun headers(vararg headers: Any)

      /**
       * @param subject The subject line, or title, to use in email messages. 
       */
      public fun subject(subject: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wisdom.CfnMessageTemplate.EmailMessageTemplateContentProperty.Builder
          =
          software.amazon.awscdk.services.wisdom.CfnMessageTemplate.EmailMessageTemplateContentProperty.builder()

      /**
       * @param body The body to use in email messages. 
       */
      override fun body(body: IResolvable) {
        cdkBuilder.body(body.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param body The body to use in email messages. 
       */
      override fun body(body: EmailMessageTemplateContentBodyProperty) {
        cdkBuilder.body(body.let(EmailMessageTemplateContentBodyProperty.Companion::unwrap))
      }

      /**
       * @param body The body to use in email messages. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5040531c41df01baad47328fbbef07513826d2b09977e0ce539a3ff8307e80c7")
      override fun body(body: EmailMessageTemplateContentBodyProperty.Builder.() -> Unit): Unit =
          body(EmailMessageTemplateContentBodyProperty(body))

      /**
       * @param headers The email headers to include in email messages. 
       */
      override fun headers(headers: IResolvable) {
        cdkBuilder.headers(headers.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param headers The email headers to include in email messages. 
       */
      override fun headers(headers: List<Any>) {
        cdkBuilder.headers(headers.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param headers The email headers to include in email messages. 
       */
      override fun headers(vararg headers: Any): Unit = headers(headers.toList())

      /**
       * @param subject The subject line, or title, to use in email messages. 
       */
      override fun subject(subject: String) {
        cdkBuilder.subject(subject)
      }

      public fun build():
          software.amazon.awscdk.services.wisdom.CfnMessageTemplate.EmailMessageTemplateContentProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.wisdom.CfnMessageTemplate.EmailMessageTemplateContentProperty,
    ) : CdkObject(cdkObject),
        EmailMessageTemplateContentProperty {
      /**
       * The body to use in email messages.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-emailmessagetemplatecontent.html#cfn-wisdom-messagetemplate-emailmessagetemplatecontent-body)
       */
      override fun body(): Any = unwrap(this).getBody()

      /**
       * The email headers to include in email messages.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-emailmessagetemplatecontent.html#cfn-wisdom-messagetemplate-emailmessagetemplatecontent-headers)
       */
      override fun headers(): Any = unwrap(this).getHeaders()

      /**
       * The subject line, or title, to use in email messages.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-emailmessagetemplatecontent.html#cfn-wisdom-messagetemplate-emailmessagetemplatecontent-subject)
       */
      override fun subject(): String = unwrap(this).getSubject()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          EmailMessageTemplateContentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnMessageTemplate.EmailMessageTemplateContentProperty):
          EmailMessageTemplateContentProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EmailMessageTemplateContentProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EmailMessageTemplateContentProperty):
          software.amazon.awscdk.services.wisdom.CfnMessageTemplate.EmailMessageTemplateContentProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wisdom.CfnMessageTemplate.EmailMessageTemplateContentProperty
    }
  }

  /**
   * The email headers to include in email messages.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.wisdom.*;
   * EmailMessageTemplateHeaderProperty emailMessageTemplateHeaderProperty =
   * EmailMessageTemplateHeaderProperty.builder()
   * .name("name")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-emailmessagetemplateheader.html)
   */
  public interface EmailMessageTemplateHeaderProperty {
    /**
     * The name of the email header.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-emailmessagetemplateheader.html#cfn-wisdom-messagetemplate-emailmessagetemplateheader-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * The value of the email header.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-emailmessagetemplateheader.html#cfn-wisdom-messagetemplate-emailmessagetemplateheader-value)
     */
    public fun `value`(): String? = unwrap(this).getValue()

    /**
     * A builder for [EmailMessageTemplateHeaderProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the email header.
       */
      public fun name(name: String)

      /**
       * @param value The value of the email header.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wisdom.CfnMessageTemplate.EmailMessageTemplateHeaderProperty.Builder
          =
          software.amazon.awscdk.services.wisdom.CfnMessageTemplate.EmailMessageTemplateHeaderProperty.builder()

      /**
       * @param name The name of the email header.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param value The value of the email header.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.wisdom.CfnMessageTemplate.EmailMessageTemplateHeaderProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.wisdom.CfnMessageTemplate.EmailMessageTemplateHeaderProperty,
    ) : CdkObject(cdkObject),
        EmailMessageTemplateHeaderProperty {
      /**
       * The name of the email header.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-emailmessagetemplateheader.html#cfn-wisdom-messagetemplate-emailmessagetemplateheader-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * The value of the email header.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-emailmessagetemplateheader.html#cfn-wisdom-messagetemplate-emailmessagetemplateheader-value)
       */
      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          EmailMessageTemplateHeaderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnMessageTemplate.EmailMessageTemplateHeaderProperty):
          EmailMessageTemplateHeaderProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EmailMessageTemplateHeaderProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EmailMessageTemplateHeaderProperty):
          software.amazon.awscdk.services.wisdom.CfnMessageTemplate.EmailMessageTemplateHeaderProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wisdom.CfnMessageTemplate.EmailMessageTemplateHeaderProperty
    }
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-groupingconfiguration.html)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-groupingconfiguration.html#cfn-wisdom-messagetemplate-groupingconfiguration-criteria)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-groupingconfiguration.html#cfn-wisdom-messagetemplate-groupingconfiguration-values)
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
          software.amazon.awscdk.services.wisdom.CfnMessageTemplate.GroupingConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.wisdom.CfnMessageTemplate.GroupingConfigurationProperty.builder()

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
          software.amazon.awscdk.services.wisdom.CfnMessageTemplate.GroupingConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.wisdom.CfnMessageTemplate.GroupingConfigurationProperty,
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-groupingconfiguration.html#cfn-wisdom-messagetemplate-groupingconfiguration-criteria)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-groupingconfiguration.html#cfn-wisdom-messagetemplate-groupingconfiguration-values)
       */
      override fun values(): List<String> = unwrap(this).getValues()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GroupingConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnMessageTemplate.GroupingConfigurationProperty):
          GroupingConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          GroupingConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: GroupingConfigurationProperty):
          software.amazon.awscdk.services.wisdom.CfnMessageTemplate.GroupingConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wisdom.CfnMessageTemplate.GroupingConfigurationProperty
    }
  }

  /**
   * The attributes that are used with the message template.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.wisdom.*;
   * MessageTemplateAttributesProperty messageTemplateAttributesProperty =
   * MessageTemplateAttributesProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-messagetemplateattributes.html)
   */
  public interface MessageTemplateAttributesProperty {
    /**
     * The agent attributes that are used with the message template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-messagetemplateattributes.html#cfn-wisdom-messagetemplate-messagetemplateattributes-agentattributes)
     */
    public fun agentAttributes(): Any? = unwrap(this).getAgentAttributes()

    /**
     * The custom attributes that are used with the message template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-messagetemplateattributes.html#cfn-wisdom-messagetemplate-messagetemplateattributes-customattributes)
     */
    public fun customAttributes(): Any? = unwrap(this).getCustomAttributes()

    /**
     * The customer profile attributes that are used with the message template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-messagetemplateattributes.html#cfn-wisdom-messagetemplate-messagetemplateattributes-customerprofileattributes)
     */
    public fun customerProfileAttributes(): Any? = unwrap(this).getCustomerProfileAttributes()

    /**
     * The system attributes that are used with the message template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-messagetemplateattributes.html#cfn-wisdom-messagetemplate-messagetemplateattributes-systemattributes)
     */
    public fun systemAttributes(): Any? = unwrap(this).getSystemAttributes()

    /**
     * A builder for [MessageTemplateAttributesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param agentAttributes The agent attributes that are used with the message template.
       */
      public fun agentAttributes(agentAttributes: IResolvable)

      /**
       * @param agentAttributes The agent attributes that are used with the message template.
       */
      public fun agentAttributes(agentAttributes: AgentAttributesProperty)

      /**
       * @param agentAttributes The agent attributes that are used with the message template.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ff8f643df98231fedde5aec1ddaca9759bd62021e223093229a2963818bfc892")
      public fun agentAttributes(agentAttributes: AgentAttributesProperty.Builder.() -> Unit)

      /**
       * @param customAttributes The custom attributes that are used with the message template.
       */
      public fun customAttributes(customAttributes: IResolvable)

      /**
       * @param customAttributes The custom attributes that are used with the message template.
       */
      public fun customAttributes(customAttributes: Map<String, String>)

      /**
       * @param customerProfileAttributes The customer profile attributes that are used with the
       * message template.
       */
      public fun customerProfileAttributes(customerProfileAttributes: IResolvable)

      /**
       * @param customerProfileAttributes The customer profile attributes that are used with the
       * message template.
       */
      public
          fun customerProfileAttributes(customerProfileAttributes: CustomerProfileAttributesProperty)

      /**
       * @param customerProfileAttributes The customer profile attributes that are used with the
       * message template.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d20c0283c651f3885eea0859a0702b013d58a5b5e949054b5e6b8a893ecf9689")
      public
          fun customerProfileAttributes(customerProfileAttributes: CustomerProfileAttributesProperty.Builder.() -> Unit)

      /**
       * @param systemAttributes The system attributes that are used with the message template.
       */
      public fun systemAttributes(systemAttributes: IResolvable)

      /**
       * @param systemAttributes The system attributes that are used with the message template.
       */
      public fun systemAttributes(systemAttributes: SystemAttributesProperty)

      /**
       * @param systemAttributes The system attributes that are used with the message template.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("32a09d55f1089a10aea19f4258641c1fe9a487308f89866b54a0dd84d4a0c08c")
      public fun systemAttributes(systemAttributes: SystemAttributesProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wisdom.CfnMessageTemplate.MessageTemplateAttributesProperty.Builder
          =
          software.amazon.awscdk.services.wisdom.CfnMessageTemplate.MessageTemplateAttributesProperty.builder()

      /**
       * @param agentAttributes The agent attributes that are used with the message template.
       */
      override fun agentAttributes(agentAttributes: IResolvable) {
        cdkBuilder.agentAttributes(agentAttributes.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param agentAttributes The agent attributes that are used with the message template.
       */
      override fun agentAttributes(agentAttributes: AgentAttributesProperty) {
        cdkBuilder.agentAttributes(agentAttributes.let(AgentAttributesProperty.Companion::unwrap))
      }

      /**
       * @param agentAttributes The agent attributes that are used with the message template.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ff8f643df98231fedde5aec1ddaca9759bd62021e223093229a2963818bfc892")
      override fun agentAttributes(agentAttributes: AgentAttributesProperty.Builder.() -> Unit):
          Unit = agentAttributes(AgentAttributesProperty(agentAttributes))

      /**
       * @param customAttributes The custom attributes that are used with the message template.
       */
      override fun customAttributes(customAttributes: IResolvable) {
        cdkBuilder.customAttributes(customAttributes.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param customAttributes The custom attributes that are used with the message template.
       */
      override fun customAttributes(customAttributes: Map<String, String>) {
        cdkBuilder.customAttributes(customAttributes)
      }

      /**
       * @param customerProfileAttributes The customer profile attributes that are used with the
       * message template.
       */
      override fun customerProfileAttributes(customerProfileAttributes: IResolvable) {
        cdkBuilder.customerProfileAttributes(customerProfileAttributes.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param customerProfileAttributes The customer profile attributes that are used with the
       * message template.
       */
      override
          fun customerProfileAttributes(customerProfileAttributes: CustomerProfileAttributesProperty) {
        cdkBuilder.customerProfileAttributes(customerProfileAttributes.let(CustomerProfileAttributesProperty.Companion::unwrap))
      }

      /**
       * @param customerProfileAttributes The customer profile attributes that are used with the
       * message template.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d20c0283c651f3885eea0859a0702b013d58a5b5e949054b5e6b8a893ecf9689")
      override
          fun customerProfileAttributes(customerProfileAttributes: CustomerProfileAttributesProperty.Builder.() -> Unit):
          Unit =
          customerProfileAttributes(CustomerProfileAttributesProperty(customerProfileAttributes))

      /**
       * @param systemAttributes The system attributes that are used with the message template.
       */
      override fun systemAttributes(systemAttributes: IResolvable) {
        cdkBuilder.systemAttributes(systemAttributes.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param systemAttributes The system attributes that are used with the message template.
       */
      override fun systemAttributes(systemAttributes: SystemAttributesProperty) {
        cdkBuilder.systemAttributes(systemAttributes.let(SystemAttributesProperty.Companion::unwrap))
      }

      /**
       * @param systemAttributes The system attributes that are used with the message template.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("32a09d55f1089a10aea19f4258641c1fe9a487308f89866b54a0dd84d4a0c08c")
      override fun systemAttributes(systemAttributes: SystemAttributesProperty.Builder.() -> Unit):
          Unit = systemAttributes(SystemAttributesProperty(systemAttributes))

      public fun build():
          software.amazon.awscdk.services.wisdom.CfnMessageTemplate.MessageTemplateAttributesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.wisdom.CfnMessageTemplate.MessageTemplateAttributesProperty,
    ) : CdkObject(cdkObject),
        MessageTemplateAttributesProperty {
      /**
       * The agent attributes that are used with the message template.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-messagetemplateattributes.html#cfn-wisdom-messagetemplate-messagetemplateattributes-agentattributes)
       */
      override fun agentAttributes(): Any? = unwrap(this).getAgentAttributes()

      /**
       * The custom attributes that are used with the message template.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-messagetemplateattributes.html#cfn-wisdom-messagetemplate-messagetemplateattributes-customattributes)
       */
      override fun customAttributes(): Any? = unwrap(this).getCustomAttributes()

      /**
       * The customer profile attributes that are used with the message template.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-messagetemplateattributes.html#cfn-wisdom-messagetemplate-messagetemplateattributes-customerprofileattributes)
       */
      override fun customerProfileAttributes(): Any? = unwrap(this).getCustomerProfileAttributes()

      /**
       * The system attributes that are used with the message template.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-messagetemplateattributes.html#cfn-wisdom-messagetemplate-messagetemplateattributes-systemattributes)
       */
      override fun systemAttributes(): Any? = unwrap(this).getSystemAttributes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          MessageTemplateAttributesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnMessageTemplate.MessageTemplateAttributesProperty):
          MessageTemplateAttributesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          MessageTemplateAttributesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MessageTemplateAttributesProperty):
          software.amazon.awscdk.services.wisdom.CfnMessageTemplate.MessageTemplateAttributesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wisdom.CfnMessageTemplate.MessageTemplateAttributesProperty
    }
  }

  /**
   * The container of the message template body.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.wisdom.*;
   * MessageTemplateBodyContentProviderProperty messageTemplateBodyContentProviderProperty =
   * MessageTemplateBodyContentProviderProperty.builder()
   * .content("content")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-messagetemplatebodycontentprovider.html)
   */
  public interface MessageTemplateBodyContentProviderProperty {
    /**
     * The content of the message template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-messagetemplatebodycontentprovider.html#cfn-wisdom-messagetemplate-messagetemplatebodycontentprovider-content)
     */
    public fun content(): String? = unwrap(this).getContent()

    /**
     * A builder for [MessageTemplateBodyContentProviderProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param content The content of the message template.
       */
      public fun content(content: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wisdom.CfnMessageTemplate.MessageTemplateBodyContentProviderProperty.Builder
          =
          software.amazon.awscdk.services.wisdom.CfnMessageTemplate.MessageTemplateBodyContentProviderProperty.builder()

      /**
       * @param content The content of the message template.
       */
      override fun content(content: String) {
        cdkBuilder.content(content)
      }

      public fun build():
          software.amazon.awscdk.services.wisdom.CfnMessageTemplate.MessageTemplateBodyContentProviderProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.wisdom.CfnMessageTemplate.MessageTemplateBodyContentProviderProperty,
    ) : CdkObject(cdkObject),
        MessageTemplateBodyContentProviderProperty {
      /**
       * The content of the message template.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-messagetemplatebodycontentprovider.html#cfn-wisdom-messagetemplate-messagetemplatebodycontentprovider-content)
       */
      override fun content(): String? = unwrap(this).getContent()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          MessageTemplateBodyContentProviderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnMessageTemplate.MessageTemplateBodyContentProviderProperty):
          MessageTemplateBodyContentProviderProperty = CdkObjectWrappers.wrap(cdkObject) as?
          MessageTemplateBodyContentProviderProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MessageTemplateBodyContentProviderProperty):
          software.amazon.awscdk.services.wisdom.CfnMessageTemplate.MessageTemplateBodyContentProviderProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wisdom.CfnMessageTemplate.MessageTemplateBodyContentProviderProperty
    }
  }

  /**
   * The body to use in SMS messages.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.wisdom.*;
   * SmsMessageTemplateContentBodyProperty smsMessageTemplateContentBodyProperty =
   * SmsMessageTemplateContentBodyProperty.builder()
   * .plainText(MessageTemplateBodyContentProviderProperty.builder()
   * .content("content")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-smsmessagetemplatecontentbody.html)
   */
  public interface SmsMessageTemplateContentBodyProperty {
    /**
     * The message body to use in SMS messages.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-smsmessagetemplatecontentbody.html#cfn-wisdom-messagetemplate-smsmessagetemplatecontentbody-plaintext)
     */
    public fun plainText(): Any? = unwrap(this).getPlainText()

    /**
     * A builder for [SmsMessageTemplateContentBodyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param plainText The message body to use in SMS messages.
       */
      public fun plainText(plainText: IResolvable)

      /**
       * @param plainText The message body to use in SMS messages.
       */
      public fun plainText(plainText: MessageTemplateBodyContentProviderProperty)

      /**
       * @param plainText The message body to use in SMS messages.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("94d5d936decc4470b61c512c5c849c5f3fa12dfb9e6b1acc83d804a5d2a491ad")
      public fun plainText(plainText: MessageTemplateBodyContentProviderProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wisdom.CfnMessageTemplate.SmsMessageTemplateContentBodyProperty.Builder
          =
          software.amazon.awscdk.services.wisdom.CfnMessageTemplate.SmsMessageTemplateContentBodyProperty.builder()

      /**
       * @param plainText The message body to use in SMS messages.
       */
      override fun plainText(plainText: IResolvable) {
        cdkBuilder.plainText(plainText.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param plainText The message body to use in SMS messages.
       */
      override fun plainText(plainText: MessageTemplateBodyContentProviderProperty) {
        cdkBuilder.plainText(plainText.let(MessageTemplateBodyContentProviderProperty.Companion::unwrap))
      }

      /**
       * @param plainText The message body to use in SMS messages.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("94d5d936decc4470b61c512c5c849c5f3fa12dfb9e6b1acc83d804a5d2a491ad")
      override
          fun plainText(plainText: MessageTemplateBodyContentProviderProperty.Builder.() -> Unit):
          Unit = plainText(MessageTemplateBodyContentProviderProperty(plainText))

      public fun build():
          software.amazon.awscdk.services.wisdom.CfnMessageTemplate.SmsMessageTemplateContentBodyProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.wisdom.CfnMessageTemplate.SmsMessageTemplateContentBodyProperty,
    ) : CdkObject(cdkObject),
        SmsMessageTemplateContentBodyProperty {
      /**
       * The message body to use in SMS messages.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-smsmessagetemplatecontentbody.html#cfn-wisdom-messagetemplate-smsmessagetemplatecontentbody-plaintext)
       */
      override fun plainText(): Any? = unwrap(this).getPlainText()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SmsMessageTemplateContentBodyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnMessageTemplate.SmsMessageTemplateContentBodyProperty):
          SmsMessageTemplateContentBodyProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SmsMessageTemplateContentBodyProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SmsMessageTemplateContentBodyProperty):
          software.amazon.awscdk.services.wisdom.CfnMessageTemplate.SmsMessageTemplateContentBodyProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wisdom.CfnMessageTemplate.SmsMessageTemplateContentBodyProperty
    }
  }

  /**
   * The content of the message template that applies to the SMS channel subtype.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.wisdom.*;
   * SmsMessageTemplateContentProperty smsMessageTemplateContentProperty =
   * SmsMessageTemplateContentProperty.builder()
   * .body(SmsMessageTemplateContentBodyProperty.builder()
   * .plainText(MessageTemplateBodyContentProviderProperty.builder()
   * .content("content")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-smsmessagetemplatecontent.html)
   */
  public interface SmsMessageTemplateContentProperty {
    /**
     * The body to use in SMS messages.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-smsmessagetemplatecontent.html#cfn-wisdom-messagetemplate-smsmessagetemplatecontent-body)
     */
    public fun body(): Any

    /**
     * A builder for [SmsMessageTemplateContentProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param body The body to use in SMS messages. 
       */
      public fun body(body: IResolvable)

      /**
       * @param body The body to use in SMS messages. 
       */
      public fun body(body: SmsMessageTemplateContentBodyProperty)

      /**
       * @param body The body to use in SMS messages. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d0848a5c2005384eed40d0823373ed114fa1b53c08d5613da3a4db53ff23e6b4")
      public fun body(body: SmsMessageTemplateContentBodyProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wisdom.CfnMessageTemplate.SmsMessageTemplateContentProperty.Builder
          =
          software.amazon.awscdk.services.wisdom.CfnMessageTemplate.SmsMessageTemplateContentProperty.builder()

      /**
       * @param body The body to use in SMS messages. 
       */
      override fun body(body: IResolvable) {
        cdkBuilder.body(body.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param body The body to use in SMS messages. 
       */
      override fun body(body: SmsMessageTemplateContentBodyProperty) {
        cdkBuilder.body(body.let(SmsMessageTemplateContentBodyProperty.Companion::unwrap))
      }

      /**
       * @param body The body to use in SMS messages. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d0848a5c2005384eed40d0823373ed114fa1b53c08d5613da3a4db53ff23e6b4")
      override fun body(body: SmsMessageTemplateContentBodyProperty.Builder.() -> Unit): Unit =
          body(SmsMessageTemplateContentBodyProperty(body))

      public fun build():
          software.amazon.awscdk.services.wisdom.CfnMessageTemplate.SmsMessageTemplateContentProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.wisdom.CfnMessageTemplate.SmsMessageTemplateContentProperty,
    ) : CdkObject(cdkObject),
        SmsMessageTemplateContentProperty {
      /**
       * The body to use in SMS messages.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-smsmessagetemplatecontent.html#cfn-wisdom-messagetemplate-smsmessagetemplatecontent-body)
       */
      override fun body(): Any = unwrap(this).getBody()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SmsMessageTemplateContentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnMessageTemplate.SmsMessageTemplateContentProperty):
          SmsMessageTemplateContentProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SmsMessageTemplateContentProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SmsMessageTemplateContentProperty):
          software.amazon.awscdk.services.wisdom.CfnMessageTemplate.SmsMessageTemplateContentProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wisdom.CfnMessageTemplate.SmsMessageTemplateContentProperty
    }
  }

  /**
   * The system attributes that are used with the message template.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.wisdom.*;
   * SystemAttributesProperty systemAttributesProperty = SystemAttributesProperty.builder()
   * .customerEndpoint(SystemEndpointAttributesProperty.builder()
   * .address("address")
   * .build())
   * .name("name")
   * .systemEndpoint(SystemEndpointAttributesProperty.builder()
   * .address("address")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-systemattributes.html)
   */
  public interface SystemAttributesProperty {
    /**
     * The CustomerEndpoint attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-systemattributes.html#cfn-wisdom-messagetemplate-systemattributes-customerendpoint)
     */
    public fun customerEndpoint(): Any? = unwrap(this).getCustomerEndpoint()

    /**
     * The name of the task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-systemattributes.html#cfn-wisdom-messagetemplate-systemattributes-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * The SystemEndpoint attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-systemattributes.html#cfn-wisdom-messagetemplate-systemattributes-systemendpoint)
     */
    public fun systemEndpoint(): Any? = unwrap(this).getSystemEndpoint()

    /**
     * A builder for [SystemAttributesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param customerEndpoint The CustomerEndpoint attribute.
       */
      public fun customerEndpoint(customerEndpoint: IResolvable)

      /**
       * @param customerEndpoint The CustomerEndpoint attribute.
       */
      public fun customerEndpoint(customerEndpoint: SystemEndpointAttributesProperty)

      /**
       * @param customerEndpoint The CustomerEndpoint attribute.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("20391c4ffa860ac4768e81df285460dfa9687842ee99820aada3b6964e8b35f5")
      public
          fun customerEndpoint(customerEndpoint: SystemEndpointAttributesProperty.Builder.() -> Unit)

      /**
       * @param name The name of the task.
       */
      public fun name(name: String)

      /**
       * @param systemEndpoint The SystemEndpoint attribute.
       */
      public fun systemEndpoint(systemEndpoint: IResolvable)

      /**
       * @param systemEndpoint The SystemEndpoint attribute.
       */
      public fun systemEndpoint(systemEndpoint: SystemEndpointAttributesProperty)

      /**
       * @param systemEndpoint The SystemEndpoint attribute.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3ee22652d52cb6b2f8c73f4d78bedf94209b047fba950a97c313b3592ee30301")
      public fun systemEndpoint(systemEndpoint: SystemEndpointAttributesProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wisdom.CfnMessageTemplate.SystemAttributesProperty.Builder
          =
          software.amazon.awscdk.services.wisdom.CfnMessageTemplate.SystemAttributesProperty.builder()

      /**
       * @param customerEndpoint The CustomerEndpoint attribute.
       */
      override fun customerEndpoint(customerEndpoint: IResolvable) {
        cdkBuilder.customerEndpoint(customerEndpoint.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param customerEndpoint The CustomerEndpoint attribute.
       */
      override fun customerEndpoint(customerEndpoint: SystemEndpointAttributesProperty) {
        cdkBuilder.customerEndpoint(customerEndpoint.let(SystemEndpointAttributesProperty.Companion::unwrap))
      }

      /**
       * @param customerEndpoint The CustomerEndpoint attribute.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("20391c4ffa860ac4768e81df285460dfa9687842ee99820aada3b6964e8b35f5")
      override
          fun customerEndpoint(customerEndpoint: SystemEndpointAttributesProperty.Builder.() -> Unit):
          Unit = customerEndpoint(SystemEndpointAttributesProperty(customerEndpoint))

      /**
       * @param name The name of the task.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param systemEndpoint The SystemEndpoint attribute.
       */
      override fun systemEndpoint(systemEndpoint: IResolvable) {
        cdkBuilder.systemEndpoint(systemEndpoint.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param systemEndpoint The SystemEndpoint attribute.
       */
      override fun systemEndpoint(systemEndpoint: SystemEndpointAttributesProperty) {
        cdkBuilder.systemEndpoint(systemEndpoint.let(SystemEndpointAttributesProperty.Companion::unwrap))
      }

      /**
       * @param systemEndpoint The SystemEndpoint attribute.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3ee22652d52cb6b2f8c73f4d78bedf94209b047fba950a97c313b3592ee30301")
      override
          fun systemEndpoint(systemEndpoint: SystemEndpointAttributesProperty.Builder.() -> Unit):
          Unit = systemEndpoint(SystemEndpointAttributesProperty(systemEndpoint))

      public fun build():
          software.amazon.awscdk.services.wisdom.CfnMessageTemplate.SystemAttributesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.wisdom.CfnMessageTemplate.SystemAttributesProperty,
    ) : CdkObject(cdkObject),
        SystemAttributesProperty {
      /**
       * The CustomerEndpoint attribute.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-systemattributes.html#cfn-wisdom-messagetemplate-systemattributes-customerendpoint)
       */
      override fun customerEndpoint(): Any? = unwrap(this).getCustomerEndpoint()

      /**
       * The name of the task.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-systemattributes.html#cfn-wisdom-messagetemplate-systemattributes-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * The SystemEndpoint attribute.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-systemattributes.html#cfn-wisdom-messagetemplate-systemattributes-systemendpoint)
       */
      override fun systemEndpoint(): Any? = unwrap(this).getSystemEndpoint()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SystemAttributesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnMessageTemplate.SystemAttributesProperty):
          SystemAttributesProperty = CdkObjectWrappers.wrap(cdkObject) as? SystemAttributesProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SystemAttributesProperty):
          software.amazon.awscdk.services.wisdom.CfnMessageTemplate.SystemAttributesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wisdom.CfnMessageTemplate.SystemAttributesProperty
    }
  }

  /**
   * The system endpoint attributes that are used with the message template.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.wisdom.*;
   * SystemEndpointAttributesProperty systemEndpointAttributesProperty =
   * SystemEndpointAttributesProperty.builder()
   * .address("address")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-systemendpointattributes.html)
   */
  public interface SystemEndpointAttributesProperty {
    /**
     * The customer's phone number if used with `customerEndpoint` , or the number the customer
     * dialed to call your contact center if used with `systemEndpoint` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-systemendpointattributes.html#cfn-wisdom-messagetemplate-systemendpointattributes-address)
     */
    public fun address(): String? = unwrap(this).getAddress()

    /**
     * A builder for [SystemEndpointAttributesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param address The customer's phone number if used with `customerEndpoint` , or the number
       * the customer dialed to call your contact center if used with `systemEndpoint` .
       */
      public fun address(address: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wisdom.CfnMessageTemplate.SystemEndpointAttributesProperty.Builder
          =
          software.amazon.awscdk.services.wisdom.CfnMessageTemplate.SystemEndpointAttributesProperty.builder()

      /**
       * @param address The customer's phone number if used with `customerEndpoint` , or the number
       * the customer dialed to call your contact center if used with `systemEndpoint` .
       */
      override fun address(address: String) {
        cdkBuilder.address(address)
      }

      public fun build():
          software.amazon.awscdk.services.wisdom.CfnMessageTemplate.SystemEndpointAttributesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.wisdom.CfnMessageTemplate.SystemEndpointAttributesProperty,
    ) : CdkObject(cdkObject),
        SystemEndpointAttributesProperty {
      /**
       * The customer's phone number if used with `customerEndpoint` , or the number the customer
       * dialed to call your contact center if used with `systemEndpoint` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-messagetemplate-systemendpointattributes.html#cfn-wisdom-messagetemplate-systemendpointattributes-address)
       */
      override fun address(): String? = unwrap(this).getAddress()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SystemEndpointAttributesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnMessageTemplate.SystemEndpointAttributesProperty):
          SystemEndpointAttributesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SystemEndpointAttributesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SystemEndpointAttributesProperty):
          software.amazon.awscdk.services.wisdom.CfnMessageTemplate.SystemEndpointAttributesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wisdom.CfnMessageTemplate.SystemEndpointAttributesProperty
    }
  }
}
