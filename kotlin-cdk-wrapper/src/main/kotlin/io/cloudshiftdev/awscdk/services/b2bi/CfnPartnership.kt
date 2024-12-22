@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.b2bi

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
 * Creates a partnership between a customer and a trading partner, based on the supplied parameters.
 *
 * A partnership represents the connection between you and your trading partner. It ties together a
 * profile and one or more trading capabilities.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.b2bi.*;
 * CfnPartnership cfnPartnership = CfnPartnership.Builder.create(this, "MyCfnPartnership")
 * .capabilities(List.of("capabilities"))
 * .email("email")
 * .name("name")
 * .profileId("profileId")
 * // the properties below are optional
 * .capabilityOptions(CapabilityOptionsProperty.builder()
 * .outboundEdi(OutboundEdiOptionsProperty.builder()
 * .x12(X12EnvelopeProperty.builder()
 * .common(X12OutboundEdiHeadersProperty.builder()
 * .delimiters(X12DelimitersProperty.builder()
 * .componentSeparator("componentSeparator")
 * .dataElementSeparator("dataElementSeparator")
 * .segmentTerminator("segmentTerminator")
 * .build())
 * .functionalGroupHeaders(X12FunctionalGroupHeadersProperty.builder()
 * .applicationReceiverCode("applicationReceiverCode")
 * .applicationSenderCode("applicationSenderCode")
 * .responsibleAgencyCode("responsibleAgencyCode")
 * .build())
 * .interchangeControlHeaders(X12InterchangeControlHeadersProperty.builder()
 * .acknowledgmentRequestedCode("acknowledgmentRequestedCode")
 * .receiverId("receiverId")
 * .receiverIdQualifier("receiverIdQualifier")
 * .repetitionSeparator("repetitionSeparator")
 * .senderId("senderId")
 * .senderIdQualifier("senderIdQualifier")
 * .usageIndicatorCode("usageIndicatorCode")
 * .build())
 * .validateEdi(false)
 * .build())
 * .build())
 * .build())
 * .build())
 * .phone("phone")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-partnership.html)
 */
public open class CfnPartnership(
  cdkObject: software.amazon.awscdk.services.b2bi.CfnPartnership,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPartnershipProps,
  ) :
      this(software.amazon.awscdk.services.b2bi.CfnPartnership(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnPartnershipProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPartnershipProps.Builder.() -> Unit,
  ) : this(scope, id, CfnPartnershipProps(props)
  )

  /**
   * Returns a timestamp for creation date and time of the partnership.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * Returns a timestamp that identifies the most recent date and time that the partnership was
   * modified.
   */
  public open fun attrModifiedAt(): String = unwrap(this).getAttrModifiedAt()

  /**
   * Returns an Amazon Resource Name (ARN) for a specific AWS resource, such as a capability,
   * partnership, profile, or transformer.
   */
  public open fun attrPartnershipArn(): String = unwrap(this).getAttrPartnershipArn()

  /**
   * Returns the unique, system-generated identifier for a partnership.
   */
  public open fun attrPartnershipId(): String = unwrap(this).getAttrPartnershipId()

  /**
   * Returns the unique, system-generated identifier for a trading partner.
   */
  public open fun attrTradingPartnerId(): String = unwrap(this).getAttrTradingPartnerId()

  /**
   * Returns one or more capabilities associated with this partnership.
   */
  public open fun capabilities(): List<String> = unwrap(this).getCapabilities()

  /**
   * Returns one or more capabilities associated with this partnership.
   */
  public open fun capabilities(`value`: List<String>) {
    unwrap(this).setCapabilities(`value`)
  }

  /**
   * Returns one or more capabilities associated with this partnership.
   */
  public open fun capabilities(vararg `value`: String): Unit = capabilities(`value`.toList())

  /**
   * Contains the details for an Outbound EDI capability.
   */
  public open fun capabilityOptions(): Any? = unwrap(this).getCapabilityOptions()

  /**
   * Contains the details for an Outbound EDI capability.
   */
  public open fun capabilityOptions(`value`: IResolvable) {
    unwrap(this).setCapabilityOptions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Contains the details for an Outbound EDI capability.
   */
  public open fun capabilityOptions(`value`: CapabilityOptionsProperty) {
    unwrap(this).setCapabilityOptions(`value`.let(CapabilityOptionsProperty.Companion::unwrap))
  }

  /**
   * Contains the details for an Outbound EDI capability.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("39065d96fb4e7f1eb8cdb6ba7050da674cb4a49164ca8208498f479576ea3a0d")
  public open fun capabilityOptions(`value`: CapabilityOptionsProperty.Builder.() -> Unit): Unit =
      capabilityOptions(CapabilityOptionsProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   *
   */
  public open fun email(): String = unwrap(this).getEmail()

  /**
   *
   */
  public open fun email(`value`: String) {
    unwrap(this).setEmail(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Returns the name of the partnership.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * Returns the name of the partnership.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   *
   */
  public open fun phone(): String? = unwrap(this).getPhone()

  /**
   *
   */
  public open fun phone(`value`: String) {
    unwrap(this).setPhone(`value`)
  }

  /**
   * Returns the unique, system-generated identifier for the profile connected to this partnership.
   */
  public open fun profileId(): String = unwrap(this).getProfileId()

  /**
   * Returns the unique, system-generated identifier for the profile connected to this partnership.
   */
  public open fun profileId(`value`: String) {
    unwrap(this).setProfileId(`value`)
  }

  /**
   * A key-value pair for a specific partnership.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A key-value pair for a specific partnership.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * A key-value pair for a specific partnership.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.b2bi.CfnPartnership].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Returns one or more capabilities associated with this partnership.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-partnership.html#cfn-b2bi-partnership-capabilities)
     * @param capabilities Returns one or more capabilities associated with this partnership. 
     */
    public fun capabilities(capabilities: List<String>)

    /**
     * Returns one or more capabilities associated with this partnership.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-partnership.html#cfn-b2bi-partnership-capabilities)
     * @param capabilities Returns one or more capabilities associated with this partnership. 
     */
    public fun capabilities(vararg capabilities: String)

    /**
     * Contains the details for an Outbound EDI capability.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-partnership.html#cfn-b2bi-partnership-capabilityoptions)
     * @param capabilityOptions Contains the details for an Outbound EDI capability. 
     */
    public fun capabilityOptions(capabilityOptions: IResolvable)

    /**
     * Contains the details for an Outbound EDI capability.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-partnership.html#cfn-b2bi-partnership-capabilityoptions)
     * @param capabilityOptions Contains the details for an Outbound EDI capability. 
     */
    public fun capabilityOptions(capabilityOptions: CapabilityOptionsProperty)

    /**
     * Contains the details for an Outbound EDI capability.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-partnership.html#cfn-b2bi-partnership-capabilityoptions)
     * @param capabilityOptions Contains the details for an Outbound EDI capability. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("da4838d84ded382c5efc084305f3a8fe5d40a42b8acad5f8690391e2ffa0b412")
    public fun capabilityOptions(capabilityOptions: CapabilityOptionsProperty.Builder.() -> Unit)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-partnership.html#cfn-b2bi-partnership-email)
     * @param email 
     */
    public fun email(email: String)

    /**
     * Returns the name of the partnership.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-partnership.html#cfn-b2bi-partnership-name)
     * @param name Returns the name of the partnership. 
     */
    public fun name(name: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-partnership.html#cfn-b2bi-partnership-phone)
     * @param phone 
     */
    public fun phone(phone: String)

    /**
     * Returns the unique, system-generated identifier for the profile connected to this
     * partnership.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-partnership.html#cfn-b2bi-partnership-profileid)
     * @param profileId Returns the unique, system-generated identifier for the profile connected to
     * this partnership. 
     */
    public fun profileId(profileId: String)

    /**
     * A key-value pair for a specific partnership.
     *
     * Tags are metadata that you can use to search for and group capabilities for various purposes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-partnership.html#cfn-b2bi-partnership-tags)
     * @param tags A key-value pair for a specific partnership. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A key-value pair for a specific partnership.
     *
     * Tags are metadata that you can use to search for and group capabilities for various purposes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-partnership.html#cfn-b2bi-partnership-tags)
     * @param tags A key-value pair for a specific partnership. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.b2bi.CfnPartnership.Builder =
        software.amazon.awscdk.services.b2bi.CfnPartnership.Builder.create(scope, id)

    /**
     * Returns one or more capabilities associated with this partnership.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-partnership.html#cfn-b2bi-partnership-capabilities)
     * @param capabilities Returns one or more capabilities associated with this partnership. 
     */
    override fun capabilities(capabilities: List<String>) {
      cdkBuilder.capabilities(capabilities)
    }

    /**
     * Returns one or more capabilities associated with this partnership.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-partnership.html#cfn-b2bi-partnership-capabilities)
     * @param capabilities Returns one or more capabilities associated with this partnership. 
     */
    override fun capabilities(vararg capabilities: String): Unit =
        capabilities(capabilities.toList())

    /**
     * Contains the details for an Outbound EDI capability.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-partnership.html#cfn-b2bi-partnership-capabilityoptions)
     * @param capabilityOptions Contains the details for an Outbound EDI capability. 
     */
    override fun capabilityOptions(capabilityOptions: IResolvable) {
      cdkBuilder.capabilityOptions(capabilityOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * Contains the details for an Outbound EDI capability.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-partnership.html#cfn-b2bi-partnership-capabilityoptions)
     * @param capabilityOptions Contains the details for an Outbound EDI capability. 
     */
    override fun capabilityOptions(capabilityOptions: CapabilityOptionsProperty) {
      cdkBuilder.capabilityOptions(capabilityOptions.let(CapabilityOptionsProperty.Companion::unwrap))
    }

    /**
     * Contains the details for an Outbound EDI capability.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-partnership.html#cfn-b2bi-partnership-capabilityoptions)
     * @param capabilityOptions Contains the details for an Outbound EDI capability. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("da4838d84ded382c5efc084305f3a8fe5d40a42b8acad5f8690391e2ffa0b412")
    override fun capabilityOptions(capabilityOptions: CapabilityOptionsProperty.Builder.() -> Unit):
        Unit = capabilityOptions(CapabilityOptionsProperty(capabilityOptions))

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-partnership.html#cfn-b2bi-partnership-email)
     * @param email 
     */
    override fun email(email: String) {
      cdkBuilder.email(email)
    }

    /**
     * Returns the name of the partnership.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-partnership.html#cfn-b2bi-partnership-name)
     * @param name Returns the name of the partnership. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-partnership.html#cfn-b2bi-partnership-phone)
     * @param phone 
     */
    override fun phone(phone: String) {
      cdkBuilder.phone(phone)
    }

    /**
     * Returns the unique, system-generated identifier for the profile connected to this
     * partnership.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-partnership.html#cfn-b2bi-partnership-profileid)
     * @param profileId Returns the unique, system-generated identifier for the profile connected to
     * this partnership. 
     */
    override fun profileId(profileId: String) {
      cdkBuilder.profileId(profileId)
    }

    /**
     * A key-value pair for a specific partnership.
     *
     * Tags are metadata that you can use to search for and group capabilities for various purposes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-partnership.html#cfn-b2bi-partnership-tags)
     * @param tags A key-value pair for a specific partnership. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * A key-value pair for a specific partnership.
     *
     * Tags are metadata that you can use to search for and group capabilities for various purposes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-partnership.html#cfn-b2bi-partnership-tags)
     * @param tags A key-value pair for a specific partnership. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.b2bi.CfnPartnership = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.b2bi.CfnPartnership.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPartnership {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPartnership(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.b2bi.CfnPartnership):
        CfnPartnership = CfnPartnership(cdkObject)

    internal fun unwrap(wrapped: CfnPartnership):
        software.amazon.awscdk.services.b2bi.CfnPartnership = wrapped.cdkObject as
        software.amazon.awscdk.services.b2bi.CfnPartnership
  }

  /**
   * Contains the details for an Outbound EDI capability.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.b2bi.*;
   * CapabilityOptionsProperty capabilityOptionsProperty = CapabilityOptionsProperty.builder()
   * .outboundEdi(OutboundEdiOptionsProperty.builder()
   * .x12(X12EnvelopeProperty.builder()
   * .common(X12OutboundEdiHeadersProperty.builder()
   * .delimiters(X12DelimitersProperty.builder()
   * .componentSeparator("componentSeparator")
   * .dataElementSeparator("dataElementSeparator")
   * .segmentTerminator("segmentTerminator")
   * .build())
   * .functionalGroupHeaders(X12FunctionalGroupHeadersProperty.builder()
   * .applicationReceiverCode("applicationReceiverCode")
   * .applicationSenderCode("applicationSenderCode")
   * .responsibleAgencyCode("responsibleAgencyCode")
   * .build())
   * .interchangeControlHeaders(X12InterchangeControlHeadersProperty.builder()
   * .acknowledgmentRequestedCode("acknowledgmentRequestedCode")
   * .receiverId("receiverId")
   * .receiverIdQualifier("receiverIdQualifier")
   * .repetitionSeparator("repetitionSeparator")
   * .senderId("senderId")
   * .senderIdQualifier("senderIdQualifier")
   * .usageIndicatorCode("usageIndicatorCode")
   * .build())
   * .validateEdi(false)
   * .build())
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-partnership-capabilityoptions.html)
   */
  public interface CapabilityOptionsProperty {
    /**
     * A structure that contains the outbound EDI options.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-partnership-capabilityoptions.html#cfn-b2bi-partnership-capabilityoptions-outboundedi)
     */
    public fun outboundEdi(): Any? = unwrap(this).getOutboundEdi()

    /**
     * A builder for [CapabilityOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param outboundEdi A structure that contains the outbound EDI options.
       */
      public fun outboundEdi(outboundEdi: IResolvable)

      /**
       * @param outboundEdi A structure that contains the outbound EDI options.
       */
      public fun outboundEdi(outboundEdi: OutboundEdiOptionsProperty)

      /**
       * @param outboundEdi A structure that contains the outbound EDI options.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d92046805e9d5032fa2e7cf70c4a0f72ec3556aa0743fe5f52f1ed1b883d45db")
      public fun outboundEdi(outboundEdi: OutboundEdiOptionsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.b2bi.CfnPartnership.CapabilityOptionsProperty.Builder =
          software.amazon.awscdk.services.b2bi.CfnPartnership.CapabilityOptionsProperty.builder()

      /**
       * @param outboundEdi A structure that contains the outbound EDI options.
       */
      override fun outboundEdi(outboundEdi: IResolvable) {
        cdkBuilder.outboundEdi(outboundEdi.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param outboundEdi A structure that contains the outbound EDI options.
       */
      override fun outboundEdi(outboundEdi: OutboundEdiOptionsProperty) {
        cdkBuilder.outboundEdi(outboundEdi.let(OutboundEdiOptionsProperty.Companion::unwrap))
      }

      /**
       * @param outboundEdi A structure that contains the outbound EDI options.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d92046805e9d5032fa2e7cf70c4a0f72ec3556aa0743fe5f52f1ed1b883d45db")
      override fun outboundEdi(outboundEdi: OutboundEdiOptionsProperty.Builder.() -> Unit): Unit =
          outboundEdi(OutboundEdiOptionsProperty(outboundEdi))

      public fun build():
          software.amazon.awscdk.services.b2bi.CfnPartnership.CapabilityOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.b2bi.CfnPartnership.CapabilityOptionsProperty,
    ) : CdkObject(cdkObject),
        CapabilityOptionsProperty {
      /**
       * A structure that contains the outbound EDI options.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-partnership-capabilityoptions.html#cfn-b2bi-partnership-capabilityoptions-outboundedi)
       */
      override fun outboundEdi(): Any? = unwrap(this).getOutboundEdi()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CapabilityOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.b2bi.CfnPartnership.CapabilityOptionsProperty):
          CapabilityOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CapabilityOptionsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CapabilityOptionsProperty):
          software.amazon.awscdk.services.b2bi.CfnPartnership.CapabilityOptionsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.b2bi.CfnPartnership.CapabilityOptionsProperty
    }
  }

  /**
   * A container for outbound EDI options.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.b2bi.*;
   * OutboundEdiOptionsProperty outboundEdiOptionsProperty = OutboundEdiOptionsProperty.builder()
   * .x12(X12EnvelopeProperty.builder()
   * .common(X12OutboundEdiHeadersProperty.builder()
   * .delimiters(X12DelimitersProperty.builder()
   * .componentSeparator("componentSeparator")
   * .dataElementSeparator("dataElementSeparator")
   * .segmentTerminator("segmentTerminator")
   * .build())
   * .functionalGroupHeaders(X12FunctionalGroupHeadersProperty.builder()
   * .applicationReceiverCode("applicationReceiverCode")
   * .applicationSenderCode("applicationSenderCode")
   * .responsibleAgencyCode("responsibleAgencyCode")
   * .build())
   * .interchangeControlHeaders(X12InterchangeControlHeadersProperty.builder()
   * .acknowledgmentRequestedCode("acknowledgmentRequestedCode")
   * .receiverId("receiverId")
   * .receiverIdQualifier("receiverIdQualifier")
   * .repetitionSeparator("repetitionSeparator")
   * .senderId("senderId")
   * .senderIdQualifier("senderIdQualifier")
   * .usageIndicatorCode("usageIndicatorCode")
   * .build())
   * .validateEdi(false)
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-partnership-outboundedioptions.html)
   */
  public interface OutboundEdiOptionsProperty {
    /**
     * A structure that contains an X12 envelope structure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-partnership-outboundedioptions.html#cfn-b2bi-partnership-outboundedioptions-x12)
     */
    public fun x12(): Any

    /**
     * A builder for [OutboundEdiOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param x12 A structure that contains an X12 envelope structure. 
       */
      public fun x12(x12: IResolvable)

      /**
       * @param x12 A structure that contains an X12 envelope structure. 
       */
      public fun x12(x12: X12EnvelopeProperty)

      /**
       * @param x12 A structure that contains an X12 envelope structure. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("038360d0c4632f5767cc099f7f5c890aa86bc7ba798a3256ae947dd202968cfa")
      public fun x12(x12: X12EnvelopeProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.b2bi.CfnPartnership.OutboundEdiOptionsProperty.Builder =
          software.amazon.awscdk.services.b2bi.CfnPartnership.OutboundEdiOptionsProperty.builder()

      /**
       * @param x12 A structure that contains an X12 envelope structure. 
       */
      override fun x12(x12: IResolvable) {
        cdkBuilder.x12(x12.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param x12 A structure that contains an X12 envelope structure. 
       */
      override fun x12(x12: X12EnvelopeProperty) {
        cdkBuilder.x12(x12.let(X12EnvelopeProperty.Companion::unwrap))
      }

      /**
       * @param x12 A structure that contains an X12 envelope structure. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("038360d0c4632f5767cc099f7f5c890aa86bc7ba798a3256ae947dd202968cfa")
      override fun x12(x12: X12EnvelopeProperty.Builder.() -> Unit): Unit =
          x12(X12EnvelopeProperty(x12))

      public fun build():
          software.amazon.awscdk.services.b2bi.CfnPartnership.OutboundEdiOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.b2bi.CfnPartnership.OutboundEdiOptionsProperty,
    ) : CdkObject(cdkObject),
        OutboundEdiOptionsProperty {
      /**
       * A structure that contains an X12 envelope structure.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-partnership-outboundedioptions.html#cfn-b2bi-partnership-outboundedioptions-x12)
       */
      override fun x12(): Any = unwrap(this).getX12()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OutboundEdiOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.b2bi.CfnPartnership.OutboundEdiOptionsProperty):
          OutboundEdiOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          OutboundEdiOptionsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: OutboundEdiOptionsProperty):
          software.amazon.awscdk.services.b2bi.CfnPartnership.OutboundEdiOptionsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.b2bi.CfnPartnership.OutboundEdiOptionsProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.b2bi.*;
   * X12DelimitersProperty x12DelimitersProperty = X12DelimitersProperty.builder()
   * .componentSeparator("componentSeparator")
   * .dataElementSeparator("dataElementSeparator")
   * .segmentTerminator("segmentTerminator")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-partnership-x12delimiters.html)
   */
  public interface X12DelimitersProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-partnership-x12delimiters.html#cfn-b2bi-partnership-x12delimiters-componentseparator)
     */
    public fun componentSeparator(): String? = unwrap(this).getComponentSeparator()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-partnership-x12delimiters.html#cfn-b2bi-partnership-x12delimiters-dataelementseparator)
     */
    public fun dataElementSeparator(): String? = unwrap(this).getDataElementSeparator()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-partnership-x12delimiters.html#cfn-b2bi-partnership-x12delimiters-segmentterminator)
     */
    public fun segmentTerminator(): String? = unwrap(this).getSegmentTerminator()

    /**
     * A builder for [X12DelimitersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param componentSeparator the value to be set.
       */
      public fun componentSeparator(componentSeparator: String)

      /**
       * @param dataElementSeparator the value to be set.
       */
      public fun dataElementSeparator(dataElementSeparator: String)

      /**
       * @param segmentTerminator the value to be set.
       */
      public fun segmentTerminator(segmentTerminator: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.b2bi.CfnPartnership.X12DelimitersProperty.Builder =
          software.amazon.awscdk.services.b2bi.CfnPartnership.X12DelimitersProperty.builder()

      /**
       * @param componentSeparator the value to be set.
       */
      override fun componentSeparator(componentSeparator: String) {
        cdkBuilder.componentSeparator(componentSeparator)
      }

      /**
       * @param dataElementSeparator the value to be set.
       */
      override fun dataElementSeparator(dataElementSeparator: String) {
        cdkBuilder.dataElementSeparator(dataElementSeparator)
      }

      /**
       * @param segmentTerminator the value to be set.
       */
      override fun segmentTerminator(segmentTerminator: String) {
        cdkBuilder.segmentTerminator(segmentTerminator)
      }

      public fun build(): software.amazon.awscdk.services.b2bi.CfnPartnership.X12DelimitersProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.b2bi.CfnPartnership.X12DelimitersProperty,
    ) : CdkObject(cdkObject),
        X12DelimitersProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-partnership-x12delimiters.html#cfn-b2bi-partnership-x12delimiters-componentseparator)
       */
      override fun componentSeparator(): String? = unwrap(this).getComponentSeparator()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-partnership-x12delimiters.html#cfn-b2bi-partnership-x12delimiters-dataelementseparator)
       */
      override fun dataElementSeparator(): String? = unwrap(this).getDataElementSeparator()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-partnership-x12delimiters.html#cfn-b2bi-partnership-x12delimiters-segmentterminator)
       */
      override fun segmentTerminator(): String? = unwrap(this).getSegmentTerminator()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): X12DelimitersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.b2bi.CfnPartnership.X12DelimitersProperty):
          X12DelimitersProperty = CdkObjectWrappers.wrap(cdkObject) as? X12DelimitersProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: X12DelimitersProperty):
          software.amazon.awscdk.services.b2bi.CfnPartnership.X12DelimitersProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.b2bi.CfnPartnership.X12DelimitersProperty
    }
  }

  /**
   * A wrapper structure for an X12 definition object.
   *
   * the X12 envelope ensures the integrity of the data and the efficiency of the information
   * exchange. The X12 message structure has hierarchical levels. From highest to the lowest, they are:
   *
   * * Interchange Envelope
   * * Functional Group
   * * Transaction Set
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.b2bi.*;
   * X12EnvelopeProperty x12EnvelopeProperty = X12EnvelopeProperty.builder()
   * .common(X12OutboundEdiHeadersProperty.builder()
   * .delimiters(X12DelimitersProperty.builder()
   * .componentSeparator("componentSeparator")
   * .dataElementSeparator("dataElementSeparator")
   * .segmentTerminator("segmentTerminator")
   * .build())
   * .functionalGroupHeaders(X12FunctionalGroupHeadersProperty.builder()
   * .applicationReceiverCode("applicationReceiverCode")
   * .applicationSenderCode("applicationSenderCode")
   * .responsibleAgencyCode("responsibleAgencyCode")
   * .build())
   * .interchangeControlHeaders(X12InterchangeControlHeadersProperty.builder()
   * .acknowledgmentRequestedCode("acknowledgmentRequestedCode")
   * .receiverId("receiverId")
   * .receiverIdQualifier("receiverIdQualifier")
   * .repetitionSeparator("repetitionSeparator")
   * .senderId("senderId")
   * .senderIdQualifier("senderIdQualifier")
   * .usageIndicatorCode("usageIndicatorCode")
   * .build())
   * .validateEdi(false)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-partnership-x12envelope.html)
   */
  public interface X12EnvelopeProperty {
    /**
     * A container for the X12 outbound EDI headers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-partnership-x12envelope.html#cfn-b2bi-partnership-x12envelope-common)
     */
    public fun common(): Any? = unwrap(this).getCommon()

    /**
     * A builder for [X12EnvelopeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param common A container for the X12 outbound EDI headers.
       */
      public fun common(common: IResolvable)

      /**
       * @param common A container for the X12 outbound EDI headers.
       */
      public fun common(common: X12OutboundEdiHeadersProperty)

      /**
       * @param common A container for the X12 outbound EDI headers.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("edb3ab4d7c8d88907238949c3b0e5f61c9d42de0808f302672b1a2f673445801")
      public fun common(common: X12OutboundEdiHeadersProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.b2bi.CfnPartnership.X12EnvelopeProperty.Builder =
          software.amazon.awscdk.services.b2bi.CfnPartnership.X12EnvelopeProperty.builder()

      /**
       * @param common A container for the X12 outbound EDI headers.
       */
      override fun common(common: IResolvable) {
        cdkBuilder.common(common.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param common A container for the X12 outbound EDI headers.
       */
      override fun common(common: X12OutboundEdiHeadersProperty) {
        cdkBuilder.common(common.let(X12OutboundEdiHeadersProperty.Companion::unwrap))
      }

      /**
       * @param common A container for the X12 outbound EDI headers.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("edb3ab4d7c8d88907238949c3b0e5f61c9d42de0808f302672b1a2f673445801")
      override fun common(common: X12OutboundEdiHeadersProperty.Builder.() -> Unit): Unit =
          common(X12OutboundEdiHeadersProperty(common))

      public fun build(): software.amazon.awscdk.services.b2bi.CfnPartnership.X12EnvelopeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.b2bi.CfnPartnership.X12EnvelopeProperty,
    ) : CdkObject(cdkObject),
        X12EnvelopeProperty {
      /**
       * A container for the X12 outbound EDI headers.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-partnership-x12envelope.html#cfn-b2bi-partnership-x12envelope-common)
       */
      override fun common(): Any? = unwrap(this).getCommon()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): X12EnvelopeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.b2bi.CfnPartnership.X12EnvelopeProperty):
          X12EnvelopeProperty = CdkObjectWrappers.wrap(cdkObject) as? X12EnvelopeProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: X12EnvelopeProperty):
          software.amazon.awscdk.services.b2bi.CfnPartnership.X12EnvelopeProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.b2bi.CfnPartnership.X12EnvelopeProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.b2bi.*;
   * X12FunctionalGroupHeadersProperty x12FunctionalGroupHeadersProperty =
   * X12FunctionalGroupHeadersProperty.builder()
   * .applicationReceiverCode("applicationReceiverCode")
   * .applicationSenderCode("applicationSenderCode")
   * .responsibleAgencyCode("responsibleAgencyCode")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-partnership-x12functionalgroupheaders.html)
   */
  public interface X12FunctionalGroupHeadersProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-partnership-x12functionalgroupheaders.html#cfn-b2bi-partnership-x12functionalgroupheaders-applicationreceivercode)
     */
    public fun applicationReceiverCode(): String? = unwrap(this).getApplicationReceiverCode()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-partnership-x12functionalgroupheaders.html#cfn-b2bi-partnership-x12functionalgroupheaders-applicationsendercode)
     */
    public fun applicationSenderCode(): String? = unwrap(this).getApplicationSenderCode()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-partnership-x12functionalgroupheaders.html#cfn-b2bi-partnership-x12functionalgroupheaders-responsibleagencycode)
     */
    public fun responsibleAgencyCode(): String? = unwrap(this).getResponsibleAgencyCode()

    /**
     * A builder for [X12FunctionalGroupHeadersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param applicationReceiverCode the value to be set.
       */
      public fun applicationReceiverCode(applicationReceiverCode: String)

      /**
       * @param applicationSenderCode the value to be set.
       */
      public fun applicationSenderCode(applicationSenderCode: String)

      /**
       * @param responsibleAgencyCode the value to be set.
       */
      public fun responsibleAgencyCode(responsibleAgencyCode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.b2bi.CfnPartnership.X12FunctionalGroupHeadersProperty.Builder
          =
          software.amazon.awscdk.services.b2bi.CfnPartnership.X12FunctionalGroupHeadersProperty.builder()

      /**
       * @param applicationReceiverCode the value to be set.
       */
      override fun applicationReceiverCode(applicationReceiverCode: String) {
        cdkBuilder.applicationReceiverCode(applicationReceiverCode)
      }

      /**
       * @param applicationSenderCode the value to be set.
       */
      override fun applicationSenderCode(applicationSenderCode: String) {
        cdkBuilder.applicationSenderCode(applicationSenderCode)
      }

      /**
       * @param responsibleAgencyCode the value to be set.
       */
      override fun responsibleAgencyCode(responsibleAgencyCode: String) {
        cdkBuilder.responsibleAgencyCode(responsibleAgencyCode)
      }

      public fun build():
          software.amazon.awscdk.services.b2bi.CfnPartnership.X12FunctionalGroupHeadersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.b2bi.CfnPartnership.X12FunctionalGroupHeadersProperty,
    ) : CdkObject(cdkObject),
        X12FunctionalGroupHeadersProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-partnership-x12functionalgroupheaders.html#cfn-b2bi-partnership-x12functionalgroupheaders-applicationreceivercode)
       */
      override fun applicationReceiverCode(): String? = unwrap(this).getApplicationReceiverCode()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-partnership-x12functionalgroupheaders.html#cfn-b2bi-partnership-x12functionalgroupheaders-applicationsendercode)
       */
      override fun applicationSenderCode(): String? = unwrap(this).getApplicationSenderCode()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-partnership-x12functionalgroupheaders.html#cfn-b2bi-partnership-x12functionalgroupheaders-responsibleagencycode)
       */
      override fun responsibleAgencyCode(): String? = unwrap(this).getResponsibleAgencyCode()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          X12FunctionalGroupHeadersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.b2bi.CfnPartnership.X12FunctionalGroupHeadersProperty):
          X12FunctionalGroupHeadersProperty = CdkObjectWrappers.wrap(cdkObject) as?
          X12FunctionalGroupHeadersProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: X12FunctionalGroupHeadersProperty):
          software.amazon.awscdk.services.b2bi.CfnPartnership.X12FunctionalGroupHeadersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.b2bi.CfnPartnership.X12FunctionalGroupHeadersProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.b2bi.*;
   * X12InterchangeControlHeadersProperty x12InterchangeControlHeadersProperty =
   * X12InterchangeControlHeadersProperty.builder()
   * .acknowledgmentRequestedCode("acknowledgmentRequestedCode")
   * .receiverId("receiverId")
   * .receiverIdQualifier("receiverIdQualifier")
   * .repetitionSeparator("repetitionSeparator")
   * .senderId("senderId")
   * .senderIdQualifier("senderIdQualifier")
   * .usageIndicatorCode("usageIndicatorCode")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-partnership-x12interchangecontrolheaders.html)
   */
  public interface X12InterchangeControlHeadersProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-partnership-x12interchangecontrolheaders.html#cfn-b2bi-partnership-x12interchangecontrolheaders-acknowledgmentrequestedcode)
     */
    public fun acknowledgmentRequestedCode(): String? =
        unwrap(this).getAcknowledgmentRequestedCode()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-partnership-x12interchangecontrolheaders.html#cfn-b2bi-partnership-x12interchangecontrolheaders-receiverid)
     */
    public fun receiverId(): String? = unwrap(this).getReceiverId()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-partnership-x12interchangecontrolheaders.html#cfn-b2bi-partnership-x12interchangecontrolheaders-receiveridqualifier)
     */
    public fun receiverIdQualifier(): String? = unwrap(this).getReceiverIdQualifier()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-partnership-x12interchangecontrolheaders.html#cfn-b2bi-partnership-x12interchangecontrolheaders-repetitionseparator)
     */
    public fun repetitionSeparator(): String? = unwrap(this).getRepetitionSeparator()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-partnership-x12interchangecontrolheaders.html#cfn-b2bi-partnership-x12interchangecontrolheaders-senderid)
     */
    public fun senderId(): String? = unwrap(this).getSenderId()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-partnership-x12interchangecontrolheaders.html#cfn-b2bi-partnership-x12interchangecontrolheaders-senderidqualifier)
     */
    public fun senderIdQualifier(): String? = unwrap(this).getSenderIdQualifier()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-partnership-x12interchangecontrolheaders.html#cfn-b2bi-partnership-x12interchangecontrolheaders-usageindicatorcode)
     */
    public fun usageIndicatorCode(): String? = unwrap(this).getUsageIndicatorCode()

    /**
     * A builder for [X12InterchangeControlHeadersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param acknowledgmentRequestedCode the value to be set.
       */
      public fun acknowledgmentRequestedCode(acknowledgmentRequestedCode: String)

      /**
       * @param receiverId the value to be set.
       */
      public fun receiverId(receiverId: String)

      /**
       * @param receiverIdQualifier the value to be set.
       */
      public fun receiverIdQualifier(receiverIdQualifier: String)

      /**
       * @param repetitionSeparator the value to be set.
       */
      public fun repetitionSeparator(repetitionSeparator: String)

      /**
       * @param senderId the value to be set.
       */
      public fun senderId(senderId: String)

      /**
       * @param senderIdQualifier the value to be set.
       */
      public fun senderIdQualifier(senderIdQualifier: String)

      /**
       * @param usageIndicatorCode the value to be set.
       */
      public fun usageIndicatorCode(usageIndicatorCode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.b2bi.CfnPartnership.X12InterchangeControlHeadersProperty.Builder
          =
          software.amazon.awscdk.services.b2bi.CfnPartnership.X12InterchangeControlHeadersProperty.builder()

      /**
       * @param acknowledgmentRequestedCode the value to be set.
       */
      override fun acknowledgmentRequestedCode(acknowledgmentRequestedCode: String) {
        cdkBuilder.acknowledgmentRequestedCode(acknowledgmentRequestedCode)
      }

      /**
       * @param receiverId the value to be set.
       */
      override fun receiverId(receiverId: String) {
        cdkBuilder.receiverId(receiverId)
      }

      /**
       * @param receiverIdQualifier the value to be set.
       */
      override fun receiverIdQualifier(receiverIdQualifier: String) {
        cdkBuilder.receiverIdQualifier(receiverIdQualifier)
      }

      /**
       * @param repetitionSeparator the value to be set.
       */
      override fun repetitionSeparator(repetitionSeparator: String) {
        cdkBuilder.repetitionSeparator(repetitionSeparator)
      }

      /**
       * @param senderId the value to be set.
       */
      override fun senderId(senderId: String) {
        cdkBuilder.senderId(senderId)
      }

      /**
       * @param senderIdQualifier the value to be set.
       */
      override fun senderIdQualifier(senderIdQualifier: String) {
        cdkBuilder.senderIdQualifier(senderIdQualifier)
      }

      /**
       * @param usageIndicatorCode the value to be set.
       */
      override fun usageIndicatorCode(usageIndicatorCode: String) {
        cdkBuilder.usageIndicatorCode(usageIndicatorCode)
      }

      public fun build():
          software.amazon.awscdk.services.b2bi.CfnPartnership.X12InterchangeControlHeadersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.b2bi.CfnPartnership.X12InterchangeControlHeadersProperty,
    ) : CdkObject(cdkObject),
        X12InterchangeControlHeadersProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-partnership-x12interchangecontrolheaders.html#cfn-b2bi-partnership-x12interchangecontrolheaders-acknowledgmentrequestedcode)
       */
      override fun acknowledgmentRequestedCode(): String? =
          unwrap(this).getAcknowledgmentRequestedCode()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-partnership-x12interchangecontrolheaders.html#cfn-b2bi-partnership-x12interchangecontrolheaders-receiverid)
       */
      override fun receiverId(): String? = unwrap(this).getReceiverId()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-partnership-x12interchangecontrolheaders.html#cfn-b2bi-partnership-x12interchangecontrolheaders-receiveridqualifier)
       */
      override fun receiverIdQualifier(): String? = unwrap(this).getReceiverIdQualifier()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-partnership-x12interchangecontrolheaders.html#cfn-b2bi-partnership-x12interchangecontrolheaders-repetitionseparator)
       */
      override fun repetitionSeparator(): String? = unwrap(this).getRepetitionSeparator()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-partnership-x12interchangecontrolheaders.html#cfn-b2bi-partnership-x12interchangecontrolheaders-senderid)
       */
      override fun senderId(): String? = unwrap(this).getSenderId()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-partnership-x12interchangecontrolheaders.html#cfn-b2bi-partnership-x12interchangecontrolheaders-senderidqualifier)
       */
      override fun senderIdQualifier(): String? = unwrap(this).getSenderIdQualifier()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-partnership-x12interchangecontrolheaders.html#cfn-b2bi-partnership-x12interchangecontrolheaders-usageindicatorcode)
       */
      override fun usageIndicatorCode(): String? = unwrap(this).getUsageIndicatorCode()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          X12InterchangeControlHeadersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.b2bi.CfnPartnership.X12InterchangeControlHeadersProperty):
          X12InterchangeControlHeadersProperty = CdkObjectWrappers.wrap(cdkObject) as?
          X12InterchangeControlHeadersProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: X12InterchangeControlHeadersProperty):
          software.amazon.awscdk.services.b2bi.CfnPartnership.X12InterchangeControlHeadersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.b2bi.CfnPartnership.X12InterchangeControlHeadersProperty
    }
  }

  /**
   * A structure containing the details for an outbound EDI object.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.b2bi.*;
   * X12OutboundEdiHeadersProperty x12OutboundEdiHeadersProperty =
   * X12OutboundEdiHeadersProperty.builder()
   * .delimiters(X12DelimitersProperty.builder()
   * .componentSeparator("componentSeparator")
   * .dataElementSeparator("dataElementSeparator")
   * .segmentTerminator("segmentTerminator")
   * .build())
   * .functionalGroupHeaders(X12FunctionalGroupHeadersProperty.builder()
   * .applicationReceiverCode("applicationReceiverCode")
   * .applicationSenderCode("applicationSenderCode")
   * .responsibleAgencyCode("responsibleAgencyCode")
   * .build())
   * .interchangeControlHeaders(X12InterchangeControlHeadersProperty.builder()
   * .acknowledgmentRequestedCode("acknowledgmentRequestedCode")
   * .receiverId("receiverId")
   * .receiverIdQualifier("receiverIdQualifier")
   * .repetitionSeparator("repetitionSeparator")
   * .senderId("senderId")
   * .senderIdQualifier("senderIdQualifier")
   * .usageIndicatorCode("usageIndicatorCode")
   * .build())
   * .validateEdi(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-partnership-x12outboundediheaders.html)
   */
  public interface X12OutboundEdiHeadersProperty {
    /**
     * The delimiters, for example semicolon ( `;` ), that separates sections of the headers for the
     * X12 object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-partnership-x12outboundediheaders.html#cfn-b2bi-partnership-x12outboundediheaders-delimiters)
     */
    public fun delimiters(): Any? = unwrap(this).getDelimiters()

    /**
     * The functional group headers for the X12 object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-partnership-x12outboundediheaders.html#cfn-b2bi-partnership-x12outboundediheaders-functionalgroupheaders)
     */
    public fun functionalGroupHeaders(): Any? = unwrap(this).getFunctionalGroupHeaders()

    /**
     * In X12 EDI messages, delimiters are used to mark the end of segments or elements, and are
     * defined in the interchange control header.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-partnership-x12outboundediheaders.html#cfn-b2bi-partnership-x12outboundediheaders-interchangecontrolheaders)
     */
    public fun interchangeControlHeaders(): Any? = unwrap(this).getInterchangeControlHeaders()

    /**
     * Specifies whether or not to validate the EDI for this X12 object: `TRUE` or `FALSE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-partnership-x12outboundediheaders.html#cfn-b2bi-partnership-x12outboundediheaders-validateedi)
     */
    public fun validateEdi(): Any? = unwrap(this).getValidateEdi()

    /**
     * A builder for [X12OutboundEdiHeadersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param delimiters The delimiters, for example semicolon ( `;` ), that separates sections of
       * the headers for the X12 object.
       */
      public fun delimiters(delimiters: IResolvable)

      /**
       * @param delimiters The delimiters, for example semicolon ( `;` ), that separates sections of
       * the headers for the X12 object.
       */
      public fun delimiters(delimiters: X12DelimitersProperty)

      /**
       * @param delimiters The delimiters, for example semicolon ( `;` ), that separates sections of
       * the headers for the X12 object.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b412b737b204c23570c31179c3e0bdc0ff5c024857a88afca537529e4a8ca104")
      public fun delimiters(delimiters: X12DelimitersProperty.Builder.() -> Unit)

      /**
       * @param functionalGroupHeaders The functional group headers for the X12 object.
       */
      public fun functionalGroupHeaders(functionalGroupHeaders: IResolvable)

      /**
       * @param functionalGroupHeaders The functional group headers for the X12 object.
       */
      public fun functionalGroupHeaders(functionalGroupHeaders: X12FunctionalGroupHeadersProperty)

      /**
       * @param functionalGroupHeaders The functional group headers for the X12 object.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b65ef12148f77c7f6a260a75e055be2bc5a9b4f6ac2acb8a90b727f06803deac")
      public
          fun functionalGroupHeaders(functionalGroupHeaders: X12FunctionalGroupHeadersProperty.Builder.() -> Unit)

      /**
       * @param interchangeControlHeaders In X12 EDI messages, delimiters are used to mark the end
       * of segments or elements, and are defined in the interchange control header.
       */
      public fun interchangeControlHeaders(interchangeControlHeaders: IResolvable)

      /**
       * @param interchangeControlHeaders In X12 EDI messages, delimiters are used to mark the end
       * of segments or elements, and are defined in the interchange control header.
       */
      public
          fun interchangeControlHeaders(interchangeControlHeaders: X12InterchangeControlHeadersProperty)

      /**
       * @param interchangeControlHeaders In X12 EDI messages, delimiters are used to mark the end
       * of segments or elements, and are defined in the interchange control header.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9ce6d013d0dd94d35062d194915a466aa6c54a88e66c60329e8e83c71ec16b63")
      public
          fun interchangeControlHeaders(interchangeControlHeaders: X12InterchangeControlHeadersProperty.Builder.() -> Unit)

      /**
       * @param validateEdi Specifies whether or not to validate the EDI for this X12 object: `TRUE`
       * or `FALSE` .
       */
      public fun validateEdi(validateEdi: Boolean)

      /**
       * @param validateEdi Specifies whether or not to validate the EDI for this X12 object: `TRUE`
       * or `FALSE` .
       */
      public fun validateEdi(validateEdi: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.b2bi.CfnPartnership.X12OutboundEdiHeadersProperty.Builder
          =
          software.amazon.awscdk.services.b2bi.CfnPartnership.X12OutboundEdiHeadersProperty.builder()

      /**
       * @param delimiters The delimiters, for example semicolon ( `;` ), that separates sections of
       * the headers for the X12 object.
       */
      override fun delimiters(delimiters: IResolvable) {
        cdkBuilder.delimiters(delimiters.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param delimiters The delimiters, for example semicolon ( `;` ), that separates sections of
       * the headers for the X12 object.
       */
      override fun delimiters(delimiters: X12DelimitersProperty) {
        cdkBuilder.delimiters(delimiters.let(X12DelimitersProperty.Companion::unwrap))
      }

      /**
       * @param delimiters The delimiters, for example semicolon ( `;` ), that separates sections of
       * the headers for the X12 object.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b412b737b204c23570c31179c3e0bdc0ff5c024857a88afca537529e4a8ca104")
      override fun delimiters(delimiters: X12DelimitersProperty.Builder.() -> Unit): Unit =
          delimiters(X12DelimitersProperty(delimiters))

      /**
       * @param functionalGroupHeaders The functional group headers for the X12 object.
       */
      override fun functionalGroupHeaders(functionalGroupHeaders: IResolvable) {
        cdkBuilder.functionalGroupHeaders(functionalGroupHeaders.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param functionalGroupHeaders The functional group headers for the X12 object.
       */
      override
          fun functionalGroupHeaders(functionalGroupHeaders: X12FunctionalGroupHeadersProperty) {
        cdkBuilder.functionalGroupHeaders(functionalGroupHeaders.let(X12FunctionalGroupHeadersProperty.Companion::unwrap))
      }

      /**
       * @param functionalGroupHeaders The functional group headers for the X12 object.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b65ef12148f77c7f6a260a75e055be2bc5a9b4f6ac2acb8a90b727f06803deac")
      override
          fun functionalGroupHeaders(functionalGroupHeaders: X12FunctionalGroupHeadersProperty.Builder.() -> Unit):
          Unit = functionalGroupHeaders(X12FunctionalGroupHeadersProperty(functionalGroupHeaders))

      /**
       * @param interchangeControlHeaders In X12 EDI messages, delimiters are used to mark the end
       * of segments or elements, and are defined in the interchange control header.
       */
      override fun interchangeControlHeaders(interchangeControlHeaders: IResolvable) {
        cdkBuilder.interchangeControlHeaders(interchangeControlHeaders.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param interchangeControlHeaders In X12 EDI messages, delimiters are used to mark the end
       * of segments or elements, and are defined in the interchange control header.
       */
      override
          fun interchangeControlHeaders(interchangeControlHeaders: X12InterchangeControlHeadersProperty) {
        cdkBuilder.interchangeControlHeaders(interchangeControlHeaders.let(X12InterchangeControlHeadersProperty.Companion::unwrap))
      }

      /**
       * @param interchangeControlHeaders In X12 EDI messages, delimiters are used to mark the end
       * of segments or elements, and are defined in the interchange control header.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9ce6d013d0dd94d35062d194915a466aa6c54a88e66c60329e8e83c71ec16b63")
      override
          fun interchangeControlHeaders(interchangeControlHeaders: X12InterchangeControlHeadersProperty.Builder.() -> Unit):
          Unit =
          interchangeControlHeaders(X12InterchangeControlHeadersProperty(interchangeControlHeaders))

      /**
       * @param validateEdi Specifies whether or not to validate the EDI for this X12 object: `TRUE`
       * or `FALSE` .
       */
      override fun validateEdi(validateEdi: Boolean) {
        cdkBuilder.validateEdi(validateEdi)
      }

      /**
       * @param validateEdi Specifies whether or not to validate the EDI for this X12 object: `TRUE`
       * or `FALSE` .
       */
      override fun validateEdi(validateEdi: IResolvable) {
        cdkBuilder.validateEdi(validateEdi.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.b2bi.CfnPartnership.X12OutboundEdiHeadersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.b2bi.CfnPartnership.X12OutboundEdiHeadersProperty,
    ) : CdkObject(cdkObject),
        X12OutboundEdiHeadersProperty {
      /**
       * The delimiters, for example semicolon ( `;` ), that separates sections of the headers for
       * the X12 object.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-partnership-x12outboundediheaders.html#cfn-b2bi-partnership-x12outboundediheaders-delimiters)
       */
      override fun delimiters(): Any? = unwrap(this).getDelimiters()

      /**
       * The functional group headers for the X12 object.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-partnership-x12outboundediheaders.html#cfn-b2bi-partnership-x12outboundediheaders-functionalgroupheaders)
       */
      override fun functionalGroupHeaders(): Any? = unwrap(this).getFunctionalGroupHeaders()

      /**
       * In X12 EDI messages, delimiters are used to mark the end of segments or elements, and are
       * defined in the interchange control header.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-partnership-x12outboundediheaders.html#cfn-b2bi-partnership-x12outboundediheaders-interchangecontrolheaders)
       */
      override fun interchangeControlHeaders(): Any? = unwrap(this).getInterchangeControlHeaders()

      /**
       * Specifies whether or not to validate the EDI for this X12 object: `TRUE` or `FALSE` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-b2bi-partnership-x12outboundediheaders.html#cfn-b2bi-partnership-x12outboundediheaders-validateedi)
       */
      override fun validateEdi(): Any? = unwrap(this).getValidateEdi()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): X12OutboundEdiHeadersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.b2bi.CfnPartnership.X12OutboundEdiHeadersProperty):
          X12OutboundEdiHeadersProperty = CdkObjectWrappers.wrap(cdkObject) as?
          X12OutboundEdiHeadersProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: X12OutboundEdiHeadersProperty):
          software.amazon.awscdk.services.b2bi.CfnPartnership.X12OutboundEdiHeadersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.b2bi.CfnPartnership.X12OutboundEdiHeadersProperty
    }
  }
}
