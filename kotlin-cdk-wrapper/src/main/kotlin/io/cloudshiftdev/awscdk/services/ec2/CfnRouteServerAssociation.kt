@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies the association between a route server and a VPC.
 *
 * A route server association is the connection established between a route server and a VPC.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnRouteServerAssociation cfnRouteServerAssociation =
 * CfnRouteServerAssociation.Builder.create(this, "MyCfnRouteServerAssociation")
 * .routeServerId("routeServerId")
 * .vpcId("vpcId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserverassociation.html)
 */
public open class CfnRouteServerAssociation(
  cdkObject: software.amazon.awscdk.services.ec2.CfnRouteServerAssociation,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnRouteServerAssociationProps,
  ) :
      this(software.amazon.awscdk.services.ec2.CfnRouteServerAssociation(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnRouteServerAssociationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnRouteServerAssociationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnRouteServerAssociationProps(props)
  )

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The ID of the associated route server.
   */
  public open fun routeServerId(): String = unwrap(this).getRouteServerId()

  /**
   * The ID of the associated route server.
   */
  public open fun routeServerId(`value`: String) {
    unwrap(this).setRouteServerId(`value`)
  }

  /**
   * The ID of the associated VPC.
   */
  public open fun vpcId(): String = unwrap(this).getVpcId()

  /**
   * The ID of the associated VPC.
   */
  public open fun vpcId(`value`: String) {
    unwrap(this).setVpcId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnRouteServerAssociation].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID of the associated route server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserverassociation.html#cfn-ec2-routeserverassociation-routeserverid)
     * @param routeServerId The ID of the associated route server. 
     */
    public fun routeServerId(routeServerId: String)

    /**
     * The ID of the associated VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserverassociation.html#cfn-ec2-routeserverassociation-vpcid)
     * @param vpcId The ID of the associated VPC. 
     */
    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnRouteServerAssociation.Builder =
        software.amazon.awscdk.services.ec2.CfnRouteServerAssociation.Builder.create(scope, id)

    /**
     * The ID of the associated route server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserverassociation.html#cfn-ec2-routeserverassociation-routeserverid)
     * @param routeServerId The ID of the associated route server. 
     */
    override fun routeServerId(routeServerId: String) {
      cdkBuilder.routeServerId(routeServerId)
    }

    /**
     * The ID of the associated VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserverassociation.html#cfn-ec2-routeserverassociation-vpcid)
     * @param vpcId The ID of the associated VPC. 
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnRouteServerAssociation =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnRouteServerAssociation.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRouteServerAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRouteServerAssociation(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnRouteServerAssociation):
        CfnRouteServerAssociation = CfnRouteServerAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnRouteServerAssociation):
        software.amazon.awscdk.services.ec2.CfnRouteServerAssociation = wrapped.cdkObject as
        software.amazon.awscdk.services.ec2.CfnRouteServerAssociation
  }
}
