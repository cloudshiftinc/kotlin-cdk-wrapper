@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.organizations

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates an AWS organization.
 *
 * The account whose user is calling the
 * [`CreateOrganization`](https://docs.aws.amazon.com/organizations/latest/APIReference/API_CreateOrganization.html)
 * operation automatically becomes the [management
 * account](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#account)
 * of the new organization.
 *
 * This operation must be called using credentials from the account that is to become the new
 * organization's management account. The principal must also have the [relevant IAM
 * permissions](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_create.html)
 * .
 *
 *
 * * If you delete an organization, you can't recover it. If you created any policies inside of the
 * organization, they're also deleted and you can't recover them.
 * * You can delete an organization only after you remove all member accounts from the organization.
 * If you created some of your member accounts using AWS Organizations , you might be blocked from
 * removing those accounts. You can remove a member account only if it has all the information that's
 * required to operate as a standalone AWS account. For more information about how to provide that
 * information and then remove the account, see [Leave an organization from your member
 * account](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_leave-as-member.html)
 * in the *AWS Organizations User Guide* .
 * * If you closed a member account before you remove it from the organization, it enters a
 * 'suspended' state for a period of time and you can't remove the account from the organization until
 * it is finally closed. This can take up to 90 days and can prevent you from deleting the organization
 * until all member accounts are completely closed.
 *
 * For more information, see [Deleting an
 * organization](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_delete.html)
 * in the *AWS Organizations User Guide* .
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.organizations.*;
 * CfnOrganization cfnOrganization = CfnOrganization.Builder.create(this, "MyCfnOrganization")
 * .featureSet("featureSet")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-organization.html)
 */
public open class CfnOrganization(
  cdkObject: software.amazon.awscdk.services.organizations.CfnOrganization,
) : CfnResource(cdkObject), IInspectable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.organizations.CfnOrganization(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnOrganizationProps,
  ) :
      this(software.amazon.awscdk.services.organizations.CfnOrganization(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnOrganizationProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnOrganizationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnOrganizationProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of an organization.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The unique identifier (ID) of an organization.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The Amazon Resource Name (ARN) of the account that is designated as the management account for
   * the organization.
   */
  public open fun attrManagementAccountArn(): String = unwrap(this).getAttrManagementAccountArn()

  /**
   * The email address that is associated with the AWS account that is designated as the management
   * account for the organization.
   */
  public open fun attrManagementAccountEmail(): String =
      unwrap(this).getAttrManagementAccountEmail()

  /**
   * The unique identifier (ID) of the management account of an organization.
   */
  public open fun attrManagementAccountId(): String = unwrap(this).getAttrManagementAccountId()

  /**
   * The unique identifier (ID) for the root.
   */
  public open fun attrRootId(): String = unwrap(this).getAttrRootId()

  /**
   * Specifies the feature set supported by the new organization.
   *
   * Each feature set supports different levels of functionality.
   */
  public open fun featureSet(): String? = unwrap(this).getFeatureSet()

  /**
   * Specifies the feature set supported by the new organization.
   *
   * Each feature set supports different levels of functionality.
   */
  public open fun featureSet(`value`: String) {
    unwrap(this).setFeatureSet(`value`)
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
   * A fluent builder for [io.cloudshiftdev.awscdk.services.organizations.CfnOrganization].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specifies the feature set supported by the new organization. Each feature set supports
     * different levels of functionality.
     *
     * * `ALL`  In addition to all the features supported by the consolidated billing feature set,
     * the management account gains access to advanced features that give you more control over
     * accounts in your organization. By default or if you set the `FeatureSet` property to `ALL` , the
     * new organization is created with all features enabled and service control policies automatically
     * enabled in the
     * [root](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#root)
     * . For more information, see [All
     * features](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#feature-set-all)
     * in the *AWS Organizations User Guide* .
     * * `CONSOLIDATED_BILLING`  All member accounts have their bills consolidated to and paid by
     * the management account. For more information, see [Consolidated
     * billing](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#feature-set-cb-only)
     * in the *AWS Organizations User Guide* .
     *
     * The consolidated billing feature subset isn't available for organizations in the AWS GovCloud
     * (US) Region.
     *
     * Feature set `ALL` provides the following advanced features:
     *
     * * Apply any [policy
     * type](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies.html#orgs-policy-types)
     * to any member account in the organization.
     * * Apply [service control policies
     * (SCPs)](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_scps.html)
     * to member accounts that restrict the services and actions that users (including the root user)
     * and roles in an account can access. Using SCPs you can prevent member accounts from leaving the
     * organization.
     * * Enable [integration with supported AWS
     * services](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services_list.html)
     * to let those services provide functionality across all of the accounts in your organization.
     *
     * If you don't specify this property, the default value is `ALL` .
     *
     * Default: - "ALL"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-organization.html#cfn-organizations-organization-featureset)
     * @param featureSet Specifies the feature set supported by the new organization. Each feature
     * set supports different levels of functionality. 
     */
    public fun featureSet(featureSet: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.organizations.CfnOrganization.Builder =
        software.amazon.awscdk.services.organizations.CfnOrganization.Builder.create(scope, id)

    /**
     * Specifies the feature set supported by the new organization. Each feature set supports
     * different levels of functionality.
     *
     * * `ALL`  In addition to all the features supported by the consolidated billing feature set,
     * the management account gains access to advanced features that give you more control over
     * accounts in your organization. By default or if you set the `FeatureSet` property to `ALL` , the
     * new organization is created with all features enabled and service control policies automatically
     * enabled in the
     * [root](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#root)
     * . For more information, see [All
     * features](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#feature-set-all)
     * in the *AWS Organizations User Guide* .
     * * `CONSOLIDATED_BILLING`  All member accounts have their bills consolidated to and paid by
     * the management account. For more information, see [Consolidated
     * billing](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#feature-set-cb-only)
     * in the *AWS Organizations User Guide* .
     *
     * The consolidated billing feature subset isn't available for organizations in the AWS GovCloud
     * (US) Region.
     *
     * Feature set `ALL` provides the following advanced features:
     *
     * * Apply any [policy
     * type](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies.html#orgs-policy-types)
     * to any member account in the organization.
     * * Apply [service control policies
     * (SCPs)](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_scps.html)
     * to member accounts that restrict the services and actions that users (including the root user)
     * and roles in an account can access. Using SCPs you can prevent member accounts from leaving the
     * organization.
     * * Enable [integration with supported AWS
     * services](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services_list.html)
     * to let those services provide functionality across all of the accounts in your organization.
     *
     * If you don't specify this property, the default value is `ALL` .
     *
     * Default: - "ALL"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-organization.html#cfn-organizations-organization-featureset)
     * @param featureSet Specifies the feature set supported by the new organization. Each feature
     * set supports different levels of functionality. 
     */
    override fun featureSet(featureSet: String) {
      cdkBuilder.featureSet(featureSet)
    }

    public fun build(): software.amazon.awscdk.services.organizations.CfnOrganization =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.organizations.CfnOrganization.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnOrganization {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnOrganization(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.organizations.CfnOrganization):
        CfnOrganization = CfnOrganization(cdkObject)

    internal fun unwrap(wrapped: CfnOrganization):
        software.amazon.awscdk.services.organizations.CfnOrganization = wrapped.cdkObject as
        software.amazon.awscdk.services.organizations.CfnOrganization
  }
}
