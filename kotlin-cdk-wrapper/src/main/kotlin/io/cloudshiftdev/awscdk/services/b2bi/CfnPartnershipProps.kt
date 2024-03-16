@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.b2bi

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnPartnership`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.b2bi.*;
 * CfnPartnershipProps cfnPartnershipProps = CfnPartnershipProps.builder()
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
public interface CfnPartnershipProps {
  /**
   * Returns one or more capabilities associated with this partnership.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-partnership.html#cfn-b2bi-partnership-capabilities)
   */
  public fun capabilities(): List<String> = unwrap(this).getCapabilities() ?: emptyList()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-partnership.html#cfn-b2bi-partnership-email)
   */
  public fun email(): String

  /**
   * Returns the name of the partnership.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-partnership.html#cfn-b2bi-partnership-name)
   */
  public fun name(): String

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-partnership.html#cfn-b2bi-partnership-phone)
   */
  public fun phone(): String? = unwrap(this).getPhone()

  /**
   * Returns the unique, system-generated identifier for the profile connected to this partnership.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-partnership.html#cfn-b2bi-partnership-profileid)
   */
  public fun profileId(): String

  /**
   * A key-value pair for a specific partnership.
   *
   * Tags are metadata that you can use to search for and group capabilities for various purposes.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-partnership.html#cfn-b2bi-partnership-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnPartnershipProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param capabilities Returns one or more capabilities associated with this partnership.
     */
    public fun capabilities(capabilities: List<String>)

    /**
     * @param capabilities Returns one or more capabilities associated with this partnership.
     */
    public fun capabilities(vararg capabilities: String)

    /**
     * @param email the value to be set. 
     */
    public fun email(email: String)

    /**
     * @param name Returns the name of the partnership. 
     */
    public fun name(name: String)

    /**
     * @param phone the value to be set.
     */
    public fun phone(phone: String)

    /**
     * @param profileId Returns the unique, system-generated identifier for the profile connected to
     * this partnership. 
     */
    public fun profileId(profileId: String)

    /**
     * @param tags A key-value pair for a specific partnership.
     * Tags are metadata that you can use to search for and group capabilities for various purposes.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A key-value pair for a specific partnership.
     * Tags are metadata that you can use to search for and group capabilities for various purposes.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.b2bi.CfnPartnershipProps.Builder =
        software.amazon.awscdk.services.b2bi.CfnPartnershipProps.builder()

    /**
     * @param capabilities Returns one or more capabilities associated with this partnership.
     */
    override fun capabilities(capabilities: List<String>) {
      cdkBuilder.capabilities(capabilities)
    }

    /**
     * @param capabilities Returns one or more capabilities associated with this partnership.
     */
    override fun capabilities(vararg capabilities: String): Unit =
        capabilities(capabilities.toList())

    /**
     * @param email the value to be set. 
     */
    override fun email(email: String) {
      cdkBuilder.email(email)
    }

    /**
     * @param name Returns the name of the partnership. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param phone the value to be set.
     */
    override fun phone(phone: String) {
      cdkBuilder.phone(phone)
    }

    /**
     * @param profileId Returns the unique, system-generated identifier for the profile connected to
     * this partnership. 
     */
    override fun profileId(profileId: String) {
      cdkBuilder.profileId(profileId)
    }

    /**
     * @param tags A key-value pair for a specific partnership.
     * Tags are metadata that you can use to search for and group capabilities for various purposes.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A key-value pair for a specific partnership.
     * Tags are metadata that you can use to search for and group capabilities for various purposes.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.b2bi.CfnPartnershipProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.b2bi.CfnPartnershipProps,
  ) : CdkObject(cdkObject), CfnPartnershipProps {
    /**
     * Returns one or more capabilities associated with this partnership.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-partnership.html#cfn-b2bi-partnership-capabilities)
     */
    override fun capabilities(): List<String> = unwrap(this).getCapabilities() ?: emptyList()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-partnership.html#cfn-b2bi-partnership-email)
     */
    override fun email(): String = unwrap(this).getEmail()

    /**
     * Returns the name of the partnership.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-partnership.html#cfn-b2bi-partnership-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-partnership.html#cfn-b2bi-partnership-phone)
     */
    override fun phone(): String? = unwrap(this).getPhone()

    /**
     * Returns the unique, system-generated identifier for the profile connected to this
     * partnership.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-partnership.html#cfn-b2bi-partnership-profileid)
     */
    override fun profileId(): String = unwrap(this).getProfileId()

    /**
     * A key-value pair for a specific partnership.
     *
     * Tags are metadata that you can use to search for and group capabilities for various purposes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-partnership.html#cfn-b2bi-partnership-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPartnershipProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.b2bi.CfnPartnershipProps):
        CfnPartnershipProps = CdkObjectWrappers.wrap(cdkObject) as CfnPartnershipProps

    internal fun unwrap(wrapped: CfnPartnershipProps):
        software.amazon.awscdk.services.b2bi.CfnPartnershipProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.b2bi.CfnPartnershipProps
  }
}
