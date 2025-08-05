@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.notifications

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Associates an Account Management Contact with a `ManagedNotificationConfiguration` for AWS User
 * Notifications .
 *
 * For more information about AWS User Notifications , see the [AWS User Notifications User
 * Guide](https://docs.aws.amazon.com/notifications/latest/userguide/what-is-service.html) . For more
 * information about Account Management Contacts, see the [Account Management Reference
 * Guide](https://docs.aws.amazon.com/accounts/latest/reference/API_AlternateContact.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.notifications.*;
 * CfnManagedNotificationAccountContactAssociation cfnManagedNotificationAccountContactAssociation =
 * CfnManagedNotificationAccountContactAssociation.Builder.create(this,
 * "MyCfnManagedNotificationAccountContactAssociation")
 * .contactIdentifier("contactIdentifier")
 * .managedNotificationConfigurationArn("managedNotificationConfigurationArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-managednotificationaccountcontactassociation.html)
 */
public open class CfnManagedNotificationAccountContactAssociation(
  cdkObject: software.amazon.awscdk.services.notifications.CfnManagedNotificationAccountContactAssociation,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnManagedNotificationAccountContactAssociationProps,
  ) :
      this(software.amazon.awscdk.services.notifications.CfnManagedNotificationAccountContactAssociation(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnManagedNotificationAccountContactAssociationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnManagedNotificationAccountContactAssociationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnManagedNotificationAccountContactAssociationProps(props)
  )

  /**
   * The unique identifier of the notification contact associated with the AWS account.
   */
  public open fun contactIdentifier(): String = unwrap(this).getContactIdentifier()

  /**
   * The unique identifier of the notification contact associated with the AWS account.
   */
  public open fun contactIdentifier(`value`: String) {
    unwrap(this).setContactIdentifier(`value`)
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
   * The ARN of the `ManagedNotificationConfiguration` to be associated with the `Channel` .
   */
  public open fun managedNotificationConfigurationArn(): String =
      unwrap(this).getManagedNotificationConfigurationArn()

  /**
   * The ARN of the `ManagedNotificationConfiguration` to be associated with the `Channel` .
   */
  public open fun managedNotificationConfigurationArn(`value`: String) {
    unwrap(this).setManagedNotificationConfigurationArn(`value`)
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.notifications.CfnManagedNotificationAccountContactAssociation].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The unique identifier of the notification contact associated with the AWS account.
     *
     * For more information about the contact types associated with an account, see the [Account
     * Management Reference
     * Guide](https://docs.aws.amazon.com/accounts/latest/reference/manage-acct-update-contact-alternate.html#manage-acct-update-contact-alternate-orgs)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-managednotificationaccountcontactassociation.html#cfn-notifications-managednotificationaccountcontactassociation-contactidentifier)
     * @param contactIdentifier The unique identifier of the notification contact associated with
     * the AWS account. 
     */
    public fun contactIdentifier(contactIdentifier: String)

    /**
     * The ARN of the `ManagedNotificationConfiguration` to be associated with the `Channel` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-managednotificationaccountcontactassociation.html#cfn-notifications-managednotificationaccountcontactassociation-managednotificationconfigurationarn)
     * @param managedNotificationConfigurationArn The ARN of the `ManagedNotificationConfiguration`
     * to be associated with the `Channel` . 
     */
    public fun managedNotificationConfigurationArn(managedNotificationConfigurationArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.notifications.CfnManagedNotificationAccountContactAssociation.Builder
        =
        software.amazon.awscdk.services.notifications.CfnManagedNotificationAccountContactAssociation.Builder.create(scope,
        id)

    /**
     * The unique identifier of the notification contact associated with the AWS account.
     *
     * For more information about the contact types associated with an account, see the [Account
     * Management Reference
     * Guide](https://docs.aws.amazon.com/accounts/latest/reference/manage-acct-update-contact-alternate.html#manage-acct-update-contact-alternate-orgs)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-managednotificationaccountcontactassociation.html#cfn-notifications-managednotificationaccountcontactassociation-contactidentifier)
     * @param contactIdentifier The unique identifier of the notification contact associated with
     * the AWS account. 
     */
    override fun contactIdentifier(contactIdentifier: String) {
      cdkBuilder.contactIdentifier(contactIdentifier)
    }

    /**
     * The ARN of the `ManagedNotificationConfiguration` to be associated with the `Channel` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-managednotificationaccountcontactassociation.html#cfn-notifications-managednotificationaccountcontactassociation-managednotificationconfigurationarn)
     * @param managedNotificationConfigurationArn The ARN of the `ManagedNotificationConfiguration`
     * to be associated with the `Channel` . 
     */
    override fun managedNotificationConfigurationArn(managedNotificationConfigurationArn: String) {
      cdkBuilder.managedNotificationConfigurationArn(managedNotificationConfigurationArn)
    }

    public fun build():
        software.amazon.awscdk.services.notifications.CfnManagedNotificationAccountContactAssociation
        = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.notifications.CfnManagedNotificationAccountContactAssociation.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnManagedNotificationAccountContactAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnManagedNotificationAccountContactAssociation(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.notifications.CfnManagedNotificationAccountContactAssociation):
        CfnManagedNotificationAccountContactAssociation =
        CfnManagedNotificationAccountContactAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnManagedNotificationAccountContactAssociation):
        software.amazon.awscdk.services.notifications.CfnManagedNotificationAccountContactAssociation
        = wrapped.cdkObject as
        software.amazon.awscdk.services.notifications.CfnManagedNotificationAccountContactAssociation
  }
}
