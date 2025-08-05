@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.notifications

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnManagedNotificationAccountContactAssociation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.notifications.*;
 * CfnManagedNotificationAccountContactAssociationProps
 * cfnManagedNotificationAccountContactAssociationProps =
 * CfnManagedNotificationAccountContactAssociationProps.builder()
 * .contactIdentifier("contactIdentifier")
 * .managedNotificationConfigurationArn("managedNotificationConfigurationArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-managednotificationaccountcontactassociation.html)
 */
public interface CfnManagedNotificationAccountContactAssociationProps {
  /**
   * The unique identifier of the notification contact associated with the AWS account.
   *
   * For more information about the contact types associated with an account, see the [Account
   * Management Reference
   * Guide](https://docs.aws.amazon.com/accounts/latest/reference/manage-acct-update-contact-alternate.html#manage-acct-update-contact-alternate-orgs)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-managednotificationaccountcontactassociation.html#cfn-notifications-managednotificationaccountcontactassociation-contactidentifier)
   */
  public fun contactIdentifier(): String

  /**
   * The ARN of the `ManagedNotificationConfiguration` to be associated with the `Channel` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-managednotificationaccountcontactassociation.html#cfn-notifications-managednotificationaccountcontactassociation-managednotificationconfigurationarn)
   */
  public fun managedNotificationConfigurationArn(): String

  /**
   * A builder for [CfnManagedNotificationAccountContactAssociationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param contactIdentifier The unique identifier of the notification contact associated with
     * the AWS account. 
     * For more information about the contact types associated with an account, see the [Account
     * Management Reference
     * Guide](https://docs.aws.amazon.com/accounts/latest/reference/manage-acct-update-contact-alternate.html#manage-acct-update-contact-alternate-orgs)
     * .
     */
    public fun contactIdentifier(contactIdentifier: String)

    /**
     * @param managedNotificationConfigurationArn The ARN of the `ManagedNotificationConfiguration`
     * to be associated with the `Channel` . 
     */
    public fun managedNotificationConfigurationArn(managedNotificationConfigurationArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.notifications.CfnManagedNotificationAccountContactAssociationProps.Builder
        =
        software.amazon.awscdk.services.notifications.CfnManagedNotificationAccountContactAssociationProps.builder()

    /**
     * @param contactIdentifier The unique identifier of the notification contact associated with
     * the AWS account. 
     * For more information about the contact types associated with an account, see the [Account
     * Management Reference
     * Guide](https://docs.aws.amazon.com/accounts/latest/reference/manage-acct-update-contact-alternate.html#manage-acct-update-contact-alternate-orgs)
     * .
     */
    override fun contactIdentifier(contactIdentifier: String) {
      cdkBuilder.contactIdentifier(contactIdentifier)
    }

    /**
     * @param managedNotificationConfigurationArn The ARN of the `ManagedNotificationConfiguration`
     * to be associated with the `Channel` . 
     */
    override fun managedNotificationConfigurationArn(managedNotificationConfigurationArn: String) {
      cdkBuilder.managedNotificationConfigurationArn(managedNotificationConfigurationArn)
    }

    public fun build():
        software.amazon.awscdk.services.notifications.CfnManagedNotificationAccountContactAssociationProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.notifications.CfnManagedNotificationAccountContactAssociationProps,
  ) : CdkObject(cdkObject),
      CfnManagedNotificationAccountContactAssociationProps {
    /**
     * The unique identifier of the notification contact associated with the AWS account.
     *
     * For more information about the contact types associated with an account, see the [Account
     * Management Reference
     * Guide](https://docs.aws.amazon.com/accounts/latest/reference/manage-acct-update-contact-alternate.html#manage-acct-update-contact-alternate-orgs)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-managednotificationaccountcontactassociation.html#cfn-notifications-managednotificationaccountcontactassociation-contactidentifier)
     */
    override fun contactIdentifier(): String = unwrap(this).getContactIdentifier()

    /**
     * The ARN of the `ManagedNotificationConfiguration` to be associated with the `Channel` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-managednotificationaccountcontactassociation.html#cfn-notifications-managednotificationaccountcontactassociation-managednotificationconfigurationarn)
     */
    override fun managedNotificationConfigurationArn(): String =
        unwrap(this).getManagedNotificationConfigurationArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnManagedNotificationAccountContactAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.notifications.CfnManagedNotificationAccountContactAssociationProps):
        CfnManagedNotificationAccountContactAssociationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnManagedNotificationAccountContactAssociationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnManagedNotificationAccountContactAssociationProps):
        software.amazon.awscdk.services.notifications.CfnManagedNotificationAccountContactAssociationProps
        = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.notifications.CfnManagedNotificationAccountContactAssociationProps
  }
}
