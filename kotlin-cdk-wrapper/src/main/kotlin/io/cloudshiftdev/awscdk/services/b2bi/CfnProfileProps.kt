@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.b2bi

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnProfile`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.b2bi.*;
 * CfnProfileProps cfnProfileProps = CfnProfileProps.builder()
 * .businessName("businessName")
 * .logging("logging")
 * .name("name")
 * .phone("phone")
 * // the properties below are optional
 * .email("email")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-profile.html)
 */
public interface CfnProfileProps {
  /**
   * Returns the name for the business associated with this profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-profile.html#cfn-b2bi-profile-businessname)
   */
  public fun businessName(): String

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-profile.html#cfn-b2bi-profile-email)
   */
  public fun email(): String? = unwrap(this).getEmail()

  /**
   * Specifies whether or not logging is enabled for this profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-profile.html#cfn-b2bi-profile-logging)
   */
  public fun logging(): String

  /**
   * Returns the display name for profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-profile.html#cfn-b2bi-profile-name)
   */
  public fun name(): String

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-profile.html#cfn-b2bi-profile-phone)
   */
  public fun phone(): String

  /**
   * A key-value pair for a specific profile.
   *
   * Tags are metadata that you can use to search for and group capabilities for various purposes.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-profile.html#cfn-b2bi-profile-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnProfileProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param businessName Returns the name for the business associated with this profile. 
     */
    public fun businessName(businessName: String)

    /**
     * @param email the value to be set.
     */
    public fun email(email: String)

    /**
     * @param logging Specifies whether or not logging is enabled for this profile. 
     */
    public fun logging(logging: String)

    /**
     * @param name Returns the display name for profile. 
     */
    public fun name(name: String)

    /**
     * @param phone the value to be set. 
     */
    public fun phone(phone: String)

    /**
     * @param tags A key-value pair for a specific profile.
     * Tags are metadata that you can use to search for and group capabilities for various purposes.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A key-value pair for a specific profile.
     * Tags are metadata that you can use to search for and group capabilities for various purposes.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.b2bi.CfnProfileProps.Builder =
        software.amazon.awscdk.services.b2bi.CfnProfileProps.builder()

    /**
     * @param businessName Returns the name for the business associated with this profile. 
     */
    override fun businessName(businessName: String) {
      cdkBuilder.businessName(businessName)
    }

    /**
     * @param email the value to be set.
     */
    override fun email(email: String) {
      cdkBuilder.email(email)
    }

    /**
     * @param logging Specifies whether or not logging is enabled for this profile. 
     */
    override fun logging(logging: String) {
      cdkBuilder.logging(logging)
    }

    /**
     * @param name Returns the display name for profile. 
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
     * @param tags A key-value pair for a specific profile.
     * Tags are metadata that you can use to search for and group capabilities for various purposes.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A key-value pair for a specific profile.
     * Tags are metadata that you can use to search for and group capabilities for various purposes.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.b2bi.CfnProfileProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.b2bi.CfnProfileProps,
  ) : CdkObject(cdkObject), CfnProfileProps {
    /**
     * Returns the name for the business associated with this profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-profile.html#cfn-b2bi-profile-businessname)
     */
    override fun businessName(): String = unwrap(this).getBusinessName()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-profile.html#cfn-b2bi-profile-email)
     */
    override fun email(): String? = unwrap(this).getEmail()

    /**
     * Specifies whether or not logging is enabled for this profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-profile.html#cfn-b2bi-profile-logging)
     */
    override fun logging(): String = unwrap(this).getLogging()

    /**
     * Returns the display name for profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-profile.html#cfn-b2bi-profile-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-profile.html#cfn-b2bi-profile-phone)
     */
    override fun phone(): String = unwrap(this).getPhone()

    /**
     * A key-value pair for a specific profile.
     *
     * Tags are metadata that you can use to search for and group capabilities for various purposes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-profile.html#cfn-b2bi-profile-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnProfileProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.b2bi.CfnProfileProps):
        CfnProfileProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnProfileProps):
        software.amazon.awscdk.services.b2bi.CfnProfileProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.b2bi.CfnProfileProps
  }
}
