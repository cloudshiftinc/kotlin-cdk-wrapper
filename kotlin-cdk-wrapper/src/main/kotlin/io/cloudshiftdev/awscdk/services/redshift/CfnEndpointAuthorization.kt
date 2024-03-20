@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.redshift

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Describes an endpoint authorization for authorizing Redshift-managed VPC endpoint access to a
 * cluster across AWS accounts .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.redshift.*;
 * CfnEndpointAuthorization cfnEndpointAuthorization = CfnEndpointAuthorization.Builder.create(this,
 * "MyCfnEndpointAuthorization")
 * .account("account")
 * .clusterIdentifier("clusterIdentifier")
 * // the properties below are optional
 * .force(false)
 * .vpcIds(List.of("vpcIds"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-endpointauthorization.html)
 */
public open class CfnEndpointAuthorization internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.redshift.CfnEndpointAuthorization,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEndpointAuthorizationProps,
  ) :
      this(software.amazon.awscdk.services.redshift.CfnEndpointAuthorization(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnEndpointAuthorizationProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEndpointAuthorizationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnEndpointAuthorizationProps(props)
  )

  /**
   * The AWS account ID of either the cluster owner (grantor) or grantee.
   */
  public open fun account(): String = unwrap(this).getAccount()

  /**
   * The AWS account ID of either the cluster owner (grantor) or grantee.
   */
  public open fun account(`value`: String) {
    unwrap(this).setAccount(`value`)
  }

  /**
   * Indicates whether all VPCs in the grantee account are allowed access to the cluster.
   */
  public open fun attrAllowedAllVpCs(): IResolvable =
      unwrap(this).getAttrAllowedAllVpCs().let(IResolvable::wrap)

  /**
   * The VPCs allowed access to the cluster.
   */
  public open fun attrAllowedVpCs(): List<String> = unwrap(this).getAttrAllowedVpCs()

  /**
   * The time (UTC) when the authorization was created.
   */
  public open fun attrAuthorizeTime(): String = unwrap(this).getAttrAuthorizeTime()

  /**
   * The status of the cluster.
   */
  public open fun attrClusterStatus(): String = unwrap(this).getAttrClusterStatus()

  /**
   * The number of Redshift-managed VPC endpoints created for the authorization.
   */
  public open fun attrEndpointCount(): Number = unwrap(this).getAttrEndpointCount()

  /**
   * The AWS account ID of the grantee of the cluster.
   */
  public open fun attrGrantee(): String = unwrap(this).getAttrGrantee()

  /**
   * The AWS account ID of the cluster owner.
   */
  public open fun attrGrantor(): String = unwrap(this).getAttrGrantor()

  /**
   * The status of the authorization action.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * The cluster identifier.
   */
  public open fun clusterIdentifier(): String = unwrap(this).getClusterIdentifier()

  /**
   * The cluster identifier.
   */
  public open fun clusterIdentifier(`value`: String) {
    unwrap(this).setClusterIdentifier(`value`)
  }

  /**
   * Indicates whether to force the revoke action.
   */
  public open fun force(): Any? = unwrap(this).getForce()

  /**
   * Indicates whether to force the revoke action.
   */
  public open fun force(`value`: Boolean) {
    unwrap(this).setForce(`value`)
  }

  /**
   * Indicates whether to force the revoke action.
   */
  public open fun force(`value`: IResolvable) {
    unwrap(this).setForce(`value`.let(IResolvable::unwrap))
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
   * The virtual private cloud (VPC) identifiers to grant access to.
   */
  public open fun vpcIds(): List<String> = unwrap(this).getVpcIds() ?: emptyList()

  /**
   * The virtual private cloud (VPC) identifiers to grant access to.
   */
  public open fun vpcIds(`value`: List<String>) {
    unwrap(this).setVpcIds(`value`)
  }

  /**
   * The virtual private cloud (VPC) identifiers to grant access to.
   */
  public open fun vpcIds(vararg `value`: String): Unit = vpcIds(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.redshift.CfnEndpointAuthorization].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The AWS account ID of either the cluster owner (grantor) or grantee.
     *
     * If `Grantee` parameter is true, then the `Account` value is of the grantor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-endpointauthorization.html#cfn-redshift-endpointauthorization-account)
     * @param account The AWS account ID of either the cluster owner (grantor) or grantee. 
     */
    public fun account(account: String)

    /**
     * The cluster identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-endpointauthorization.html#cfn-redshift-endpointauthorization-clusteridentifier)
     * @param clusterIdentifier The cluster identifier. 
     */
    public fun clusterIdentifier(clusterIdentifier: String)

    /**
     * Indicates whether to force the revoke action.
     *
     * If true, the Redshift-managed VPC endpoints associated with the endpoint authorization are
     * also deleted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-endpointauthorization.html#cfn-redshift-endpointauthorization-force)
     * @param force Indicates whether to force the revoke action. 
     */
    public fun force(force: Boolean)

    /**
     * Indicates whether to force the revoke action.
     *
     * If true, the Redshift-managed VPC endpoints associated with the endpoint authorization are
     * also deleted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-endpointauthorization.html#cfn-redshift-endpointauthorization-force)
     * @param force Indicates whether to force the revoke action. 
     */
    public fun force(force: IResolvable)

    /**
     * The virtual private cloud (VPC) identifiers to grant access to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-endpointauthorization.html#cfn-redshift-endpointauthorization-vpcids)
     * @param vpcIds The virtual private cloud (VPC) identifiers to grant access to. 
     */
    public fun vpcIds(vpcIds: List<String>)

    /**
     * The virtual private cloud (VPC) identifiers to grant access to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-endpointauthorization.html#cfn-redshift-endpointauthorization-vpcids)
     * @param vpcIds The virtual private cloud (VPC) identifiers to grant access to. 
     */
    public fun vpcIds(vararg vpcIds: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.redshift.CfnEndpointAuthorization.Builder =
        software.amazon.awscdk.services.redshift.CfnEndpointAuthorization.Builder.create(scope, id)

    /**
     * The AWS account ID of either the cluster owner (grantor) or grantee.
     *
     * If `Grantee` parameter is true, then the `Account` value is of the grantor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-endpointauthorization.html#cfn-redshift-endpointauthorization-account)
     * @param account The AWS account ID of either the cluster owner (grantor) or grantee. 
     */
    override fun account(account: String) {
      cdkBuilder.account(account)
    }

    /**
     * The cluster identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-endpointauthorization.html#cfn-redshift-endpointauthorization-clusteridentifier)
     * @param clusterIdentifier The cluster identifier. 
     */
    override fun clusterIdentifier(clusterIdentifier: String) {
      cdkBuilder.clusterIdentifier(clusterIdentifier)
    }

    /**
     * Indicates whether to force the revoke action.
     *
     * If true, the Redshift-managed VPC endpoints associated with the endpoint authorization are
     * also deleted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-endpointauthorization.html#cfn-redshift-endpointauthorization-force)
     * @param force Indicates whether to force the revoke action. 
     */
    override fun force(force: Boolean) {
      cdkBuilder.force(force)
    }

    /**
     * Indicates whether to force the revoke action.
     *
     * If true, the Redshift-managed VPC endpoints associated with the endpoint authorization are
     * also deleted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-endpointauthorization.html#cfn-redshift-endpointauthorization-force)
     * @param force Indicates whether to force the revoke action. 
     */
    override fun force(force: IResolvable) {
      cdkBuilder.force(force.let(IResolvable::unwrap))
    }

    /**
     * The virtual private cloud (VPC) identifiers to grant access to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-endpointauthorization.html#cfn-redshift-endpointauthorization-vpcids)
     * @param vpcIds The virtual private cloud (VPC) identifiers to grant access to. 
     */
    override fun vpcIds(vpcIds: List<String>) {
      cdkBuilder.vpcIds(vpcIds)
    }

    /**
     * The virtual private cloud (VPC) identifiers to grant access to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-endpointauthorization.html#cfn-redshift-endpointauthorization-vpcids)
     * @param vpcIds The virtual private cloud (VPC) identifiers to grant access to. 
     */
    override fun vpcIds(vararg vpcIds: String): Unit = vpcIds(vpcIds.toList())

    public fun build(): software.amazon.awscdk.services.redshift.CfnEndpointAuthorization =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.redshift.CfnEndpointAuthorization.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEndpointAuthorization {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEndpointAuthorization(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.redshift.CfnEndpointAuthorization):
        CfnEndpointAuthorization = CfnEndpointAuthorization(cdkObject)

    internal fun unwrap(wrapped: CfnEndpointAuthorization):
        software.amazon.awscdk.services.redshift.CfnEndpointAuthorization = wrapped.cdkObject
  }
}
