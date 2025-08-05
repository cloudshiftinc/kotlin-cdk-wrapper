@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnRouteServerPropagation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnRouteServerPropagationProps cfnRouteServerPropagationProps =
 * CfnRouteServerPropagationProps.builder()
 * .routeServerId("routeServerId")
 * .routeTableId("routeTableId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserverpropagation.html)
 */
public interface CfnRouteServerPropagationProps {
  /**
   * The ID of the route server configured for route propagation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserverpropagation.html#cfn-ec2-routeserverpropagation-routeserverid)
   */
  public fun routeServerId(): String

  /**
   * The ID of the route table configured for route server propagation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserverpropagation.html#cfn-ec2-routeserverpropagation-routetableid)
   */
  public fun routeTableId(): String

  /**
   * A builder for [CfnRouteServerPropagationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param routeServerId The ID of the route server configured for route propagation. 
     */
    public fun routeServerId(routeServerId: String)

    /**
     * @param routeTableId The ID of the route table configured for route server propagation. 
     */
    public fun routeTableId(routeTableId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnRouteServerPropagationProps.Builder =
        software.amazon.awscdk.services.ec2.CfnRouteServerPropagationProps.builder()

    /**
     * @param routeServerId The ID of the route server configured for route propagation. 
     */
    override fun routeServerId(routeServerId: String) {
      cdkBuilder.routeServerId(routeServerId)
    }

    /**
     * @param routeTableId The ID of the route table configured for route server propagation. 
     */
    override fun routeTableId(routeTableId: String) {
      cdkBuilder.routeTableId(routeTableId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnRouteServerPropagationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.CfnRouteServerPropagationProps,
  ) : CdkObject(cdkObject),
      CfnRouteServerPropagationProps {
    /**
     * The ID of the route server configured for route propagation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserverpropagation.html#cfn-ec2-routeserverpropagation-routeserverid)
     */
    override fun routeServerId(): String = unwrap(this).getRouteServerId()

    /**
     * The ID of the route table configured for route server propagation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserverpropagation.html#cfn-ec2-routeserverpropagation-routetableid)
     */
    override fun routeTableId(): String = unwrap(this).getRouteTableId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRouteServerPropagationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnRouteServerPropagationProps):
        CfnRouteServerPropagationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnRouteServerPropagationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRouteServerPropagationProps):
        software.amazon.awscdk.services.ec2.CfnRouteServerPropagationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnRouteServerPropagationProps
  }
}
