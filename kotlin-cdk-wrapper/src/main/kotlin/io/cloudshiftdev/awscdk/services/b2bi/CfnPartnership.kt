@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.b2bi

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
 * .email("email")
 * .name("name")
 * .profileId("profileId")
 * // the properties below are optional
 * .capabilities(List.of("capabilities"))
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
public open class CfnPartnership internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.b2bi.CfnPartnership,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPartnershipProps,
  ) :
      this(software.amazon.awscdk.services.b2bi.CfnPartnership(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnPartnershipProps::unwrap))
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
  public open fun capabilities(): List<String> = unwrap(this).getCapabilities() ?: emptyList()

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
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
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
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
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
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
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
        software.amazon.awscdk.services.b2bi.CfnPartnership = wrapped.cdkObject
  }
}
