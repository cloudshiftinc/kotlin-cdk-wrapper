@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.detective

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::Detective::OrganizationAdmin` resource is an Amazon Detective resource type that
 * designates the Detective administrator account for the organization in the current region.
 *
 * If the account does not have Detective enabled, then this resource enables Detective for that
 * account and creates a new behavior graph.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.detective.*;
 * CfnOrganizationAdmin cfnOrganizationAdmin = CfnOrganizationAdmin.Builder.create(this,
 * "MyCfnOrganizationAdmin")
 * .accountId("accountId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-organizationadmin.html)
 */
public open class CfnOrganizationAdmin(
  cdkObject: software.amazon.awscdk.services.detective.CfnOrganizationAdmin,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnOrganizationAdminProps,
  ) :
      this(software.amazon.awscdk.services.detective.CfnOrganizationAdmin(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnOrganizationAdminProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnOrganizationAdminProps.Builder.() -> Unit,
  ) : this(scope, id, CfnOrganizationAdminProps(props)
  )

  /**
   * The AWS account identifier of the account to designate as the Detective administrator account
   * for the organization.
   */
  public open fun accountId(): String = unwrap(this).getAccountId()

  /**
   * The AWS account identifier of the account to designate as the Detective administrator account
   * for the organization.
   */
  public open fun accountId(`value`: String) {
    unwrap(this).setAccountId(`value`)
  }

  /**
   * The ARN of the behavior graph to invite the account to contribute data to.
   */
  public open fun attrGraphArn(): String = unwrap(this).getAttrGraphArn()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.detective.CfnOrganizationAdmin].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The AWS account identifier of the account to designate as the Detective administrator account
     * for the organization.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-organizationadmin.html#cfn-detective-organizationadmin-accountid)
     * @param accountId The AWS account identifier of the account to designate as the Detective
     * administrator account for the organization. 
     */
    public fun accountId(accountId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.detective.CfnOrganizationAdmin.Builder =
        software.amazon.awscdk.services.detective.CfnOrganizationAdmin.Builder.create(scope, id)

    /**
     * The AWS account identifier of the account to designate as the Detective administrator account
     * for the organization.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-organizationadmin.html#cfn-detective-organizationadmin-accountid)
     * @param accountId The AWS account identifier of the account to designate as the Detective
     * administrator account for the organization. 
     */
    override fun accountId(accountId: String) {
      cdkBuilder.accountId(accountId)
    }

    public fun build(): software.amazon.awscdk.services.detective.CfnOrganizationAdmin =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.detective.CfnOrganizationAdmin.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnOrganizationAdmin {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnOrganizationAdmin(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.detective.CfnOrganizationAdmin):
        CfnOrganizationAdmin = CfnOrganizationAdmin(cdkObject)

    internal fun unwrap(wrapped: CfnOrganizationAdmin):
        software.amazon.awscdk.services.detective.CfnOrganizationAdmin = wrapped.cdkObject as
        software.amazon.awscdk.services.detective.CfnOrganizationAdmin
  }
}
