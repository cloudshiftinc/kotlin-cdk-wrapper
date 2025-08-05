@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.notificationscontacts

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnEmailContact`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.notificationscontacts.*;
 * CfnEmailContactProps cfnEmailContactProps = CfnEmailContactProps.builder()
 * .emailAddress("emailAddress")
 * .name("name")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notificationscontacts-emailcontact.html)
 */
public interface CfnEmailContactProps {
  /**
   * The email address of the contact.
   *
   * The activation and notification emails are sent here.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notificationscontacts-emailcontact.html#cfn-notificationscontacts-emailcontact-emailaddress)
   */
  public fun emailAddress(): String

  /**
   * The name of the contact.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notificationscontacts-emailcontact.html#cfn-notificationscontacts-emailcontact-name)
   */
  public fun name(): String

  /**
   * A list of tags to apply to the email contact.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notificationscontacts-emailcontact.html#cfn-notificationscontacts-emailcontact-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnEmailContactProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param emailAddress The email address of the contact. 
     * The activation and notification emails are sent here.
     */
    public fun emailAddress(emailAddress: String)

    /**
     * @param name The name of the contact. 
     */
    public fun name(name: String)

    /**
     * @param tags A list of tags to apply to the email contact.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of tags to apply to the email contact.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.notificationscontacts.CfnEmailContactProps.Builder =
        software.amazon.awscdk.services.notificationscontacts.CfnEmailContactProps.builder()

    /**
     * @param emailAddress The email address of the contact. 
     * The activation and notification emails are sent here.
     */
    override fun emailAddress(emailAddress: String) {
      cdkBuilder.emailAddress(emailAddress)
    }

    /**
     * @param name The name of the contact. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags A list of tags to apply to the email contact.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags A list of tags to apply to the email contact.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.notificationscontacts.CfnEmailContactProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.notificationscontacts.CfnEmailContactProps,
  ) : CdkObject(cdkObject),
      CfnEmailContactProps {
    /**
     * The email address of the contact.
     *
     * The activation and notification emails are sent here.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notificationscontacts-emailcontact.html#cfn-notificationscontacts-emailcontact-emailaddress)
     */
    override fun emailAddress(): String = unwrap(this).getEmailAddress()

    /**
     * The name of the contact.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notificationscontacts-emailcontact.html#cfn-notificationscontacts-emailcontact-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * A list of tags to apply to the email contact.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notificationscontacts-emailcontact.html#cfn-notificationscontacts-emailcontact-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEmailContactProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.notificationscontacts.CfnEmailContactProps):
        CfnEmailContactProps = CdkObjectWrappers.wrap(cdkObject) as? CfnEmailContactProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEmailContactProps):
        software.amazon.awscdk.services.notificationscontacts.CfnEmailContactProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.notificationscontacts.CfnEmailContactProps
  }
}
