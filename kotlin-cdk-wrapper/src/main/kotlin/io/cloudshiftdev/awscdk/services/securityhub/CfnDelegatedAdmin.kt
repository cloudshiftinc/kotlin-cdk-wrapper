@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.securityhub

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::SecurityHub::DelegatedAdmin` resource designates the delegated AWS Security Hub
 * administrator account for an organization.
 *
 * You must enable the integration between Security Hub and AWS Organizations before you can
 * designate a delegated Security Hub administrator. Only the management account for an organization
 * can designate the delegated Security Hub administrator account. For more information, see
 * [Designating the delegated Security Hub
 * administrator](https://docs.aws.amazon.com/securityhub/latest/userguide/designate-orgs-admin-account.html#designate-admin-instructions)
 * in the *AWS Security Hub User Guide* .
 *
 * To change the delegated administrator account, remove the current delegated administrator
 * account, and then designate the new account.
 *
 * To designate multiple delegated administrators in different organizations and AWS Regions , we
 * recommend using [AWS CloudFormation
 * mappings](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/mappings-section-structure.html)
 * .
 *
 * Tags aren't supported for this resource.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.securityhub.*;
 * CfnDelegatedAdmin cfnDelegatedAdmin = CfnDelegatedAdmin.Builder.create(this,
 * "MyCfnDelegatedAdmin")
 * .adminAccountId("adminAccountId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-delegatedadmin.html)
 */
public open class CfnDelegatedAdmin(
  cdkObject: software.amazon.awscdk.services.securityhub.CfnDelegatedAdmin,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDelegatedAdminProps,
  ) :
      this(software.amazon.awscdk.services.securityhub.CfnDelegatedAdmin(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnDelegatedAdminProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDelegatedAdminProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDelegatedAdminProps(props)
  )

  /**
   * The AWS account identifier of the account to designate as the Security Hub administrator
   * account.
   */
  public open fun adminAccountId(): String = unwrap(this).getAdminAccountId()

  /**
   * The AWS account identifier of the account to designate as the Security Hub administrator
   * account.
   */
  public open fun adminAccountId(`value`: String) {
    unwrap(this).setAdminAccountId(`value`)
  }

  /**
   * The ID of the delegated Security Hub administrator account, in the format of `accountID/Region`
   * .
   */
  public open fun attrDelegatedAdminIdentifier(): String =
      unwrap(this).getAttrDelegatedAdminIdentifier()

  /**
   * Whether the delegated Security Hub administrator is set for the organization.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.securityhub.CfnDelegatedAdmin].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The AWS account identifier of the account to designate as the Security Hub administrator
     * account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-delegatedadmin.html#cfn-securityhub-delegatedadmin-adminaccountid)
     * @param adminAccountId The AWS account identifier of the account to designate as the Security
     * Hub administrator account. 
     */
    public fun adminAccountId(adminAccountId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.securityhub.CfnDelegatedAdmin.Builder =
        software.amazon.awscdk.services.securityhub.CfnDelegatedAdmin.Builder.create(scope, id)

    /**
     * The AWS account identifier of the account to designate as the Security Hub administrator
     * account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-delegatedadmin.html#cfn-securityhub-delegatedadmin-adminaccountid)
     * @param adminAccountId The AWS account identifier of the account to designate as the Security
     * Hub administrator account. 
     */
    override fun adminAccountId(adminAccountId: String) {
      cdkBuilder.adminAccountId(adminAccountId)
    }

    public fun build(): software.amazon.awscdk.services.securityhub.CfnDelegatedAdmin =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.securityhub.CfnDelegatedAdmin.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDelegatedAdmin {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDelegatedAdmin(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnDelegatedAdmin):
        CfnDelegatedAdmin = CfnDelegatedAdmin(cdkObject)

    internal fun unwrap(wrapped: CfnDelegatedAdmin):
        software.amazon.awscdk.services.securityhub.CfnDelegatedAdmin = wrapped.cdkObject as
        software.amazon.awscdk.services.securityhub.CfnDelegatedAdmin
  }
}
