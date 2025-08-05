@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnRouteServerEndpoint`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnRouteServerEndpointProps cfnRouteServerEndpointProps = CfnRouteServerEndpointProps.builder()
 * .routeServerId("routeServerId")
 * .subnetId("subnetId")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserverendpoint.html)
 */
public interface CfnRouteServerEndpointProps {
  /**
   * The ID of the route server associated with this endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserverendpoint.html#cfn-ec2-routeserverendpoint-routeserverid)
   */
  public fun routeServerId(): String

  /**
   * The ID of the subnet to place the route server endpoint into.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserverendpoint.html#cfn-ec2-routeserverendpoint-subnetid)
   */
  public fun subnetId(): String

  /**
   * Any tags assigned to the route server endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserverendpoint.html#cfn-ec2-routeserverendpoint-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnRouteServerEndpointProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param routeServerId The ID of the route server associated with this endpoint. 
     */
    public fun routeServerId(routeServerId: String)

    /**
     * @param subnetId The ID of the subnet to place the route server endpoint into. 
     */
    public fun subnetId(subnetId: String)

    /**
     * @param tags Any tags assigned to the route server endpoint.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Any tags assigned to the route server endpoint.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnRouteServerEndpointProps.Builder
        = software.amazon.awscdk.services.ec2.CfnRouteServerEndpointProps.builder()

    /**
     * @param routeServerId The ID of the route server associated with this endpoint. 
     */
    override fun routeServerId(routeServerId: String) {
      cdkBuilder.routeServerId(routeServerId)
    }

    /**
     * @param subnetId The ID of the subnet to place the route server endpoint into. 
     */
    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    /**
     * @param tags Any tags assigned to the route server endpoint.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags Any tags assigned to the route server endpoint.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnRouteServerEndpointProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.CfnRouteServerEndpointProps,
  ) : CdkObject(cdkObject),
      CfnRouteServerEndpointProps {
    /**
     * The ID of the route server associated with this endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserverendpoint.html#cfn-ec2-routeserverendpoint-routeserverid)
     */
    override fun routeServerId(): String = unwrap(this).getRouteServerId()

    /**
     * The ID of the subnet to place the route server endpoint into.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserverendpoint.html#cfn-ec2-routeserverendpoint-subnetid)
     */
    override fun subnetId(): String = unwrap(this).getSubnetId()

    /**
     * Any tags assigned to the route server endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routeserverendpoint.html#cfn-ec2-routeserverendpoint-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRouteServerEndpointProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnRouteServerEndpointProps):
        CfnRouteServerEndpointProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnRouteServerEndpointProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRouteServerEndpointProps):
        software.amazon.awscdk.services.ec2.CfnRouteServerEndpointProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnRouteServerEndpointProps
  }
}
