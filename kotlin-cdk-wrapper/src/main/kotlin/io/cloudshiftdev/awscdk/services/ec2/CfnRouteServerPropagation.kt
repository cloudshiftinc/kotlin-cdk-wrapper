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
 * Specifies route propagation from a route server to a route table.
 *
 * For more information see [Dynamic routing in your VPC with VPC Route
 * Server](https://docs.aws.amazon.com/vpc/latest/userguide/dynamic-routing-route-server.html) in the
 * *Amazon VPC User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnRouteServerPropagation cfnRouteServerPropagation =
 * CfnRouteServerPropagation.Builder.create(this, "MyCfnRouteServerPropagation")
 * .routeServerId("routeServerId")
 * .routeTableId("routeTableId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserverpropagation.html)
 */
public open class CfnRouteServerPropagation(
  cdkObject: software.amazon.awscdk.services.ec2.CfnRouteServerPropagation,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnRouteServerPropagationProps,
  ) :
      this(software.amazon.awscdk.services.ec2.CfnRouteServerPropagation(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnRouteServerPropagationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnRouteServerPropagationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnRouteServerPropagationProps(props)
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
   * The ID of the route server configured for route propagation.
   */
  public open fun routeServerId(): String = unwrap(this).getRouteServerId()

  /**
   * The ID of the route server configured for route propagation.
   */
  public open fun routeServerId(`value`: String) {
    unwrap(this).setRouteServerId(`value`)
  }

  /**
   * The ID of the route table configured for route server propagation.
   */
  public open fun routeTableId(): String = unwrap(this).getRouteTableId()

  /**
   * The ID of the route table configured for route server propagation.
   */
  public open fun routeTableId(`value`: String) {
    unwrap(this).setRouteTableId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnRouteServerPropagation].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID of the route server configured for route propagation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserverpropagation.html#cfn-ec2-routeserverpropagation-routeserverid)
     * @param routeServerId The ID of the route server configured for route propagation. 
     */
    public fun routeServerId(routeServerId: String)

    /**
     * The ID of the route table configured for route server propagation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserverpropagation.html#cfn-ec2-routeserverpropagation-routetableid)
     * @param routeTableId The ID of the route table configured for route server propagation. 
     */
    public fun routeTableId(routeTableId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnRouteServerPropagation.Builder =
        software.amazon.awscdk.services.ec2.CfnRouteServerPropagation.Builder.create(scope, id)

    /**
     * The ID of the route server configured for route propagation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserverpropagation.html#cfn-ec2-routeserverpropagation-routeserverid)
     * @param routeServerId The ID of the route server configured for route propagation. 
     */
    override fun routeServerId(routeServerId: String) {
      cdkBuilder.routeServerId(routeServerId)
    }

    /**
     * The ID of the route table configured for route server propagation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserverpropagation.html#cfn-ec2-routeserverpropagation-routetableid)
     * @param routeTableId The ID of the route table configured for route server propagation. 
     */
    override fun routeTableId(routeTableId: String) {
      cdkBuilder.routeTableId(routeTableId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnRouteServerPropagation =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnRouteServerPropagation.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRouteServerPropagation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRouteServerPropagation(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnRouteServerPropagation):
        CfnRouteServerPropagation = CfnRouteServerPropagation(cdkObject)

    internal fun unwrap(wrapped: CfnRouteServerPropagation):
        software.amazon.awscdk.services.ec2.CfnRouteServerPropagation = wrapped.cdkObject as
        software.amazon.awscdk.services.ec2.CfnRouteServerPropagation
  }
}
