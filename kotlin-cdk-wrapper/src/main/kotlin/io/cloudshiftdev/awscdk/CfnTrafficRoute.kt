@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

/**
 * A traffic route, representing where the traffic is being directed to.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * CfnTrafficRoute cfnTrafficRoute = CfnTrafficRoute.builder()
 * .logicalId("logicalId")
 * .type("type")
 * .build();
 * ```
 */
public interface CfnTrafficRoute {
  /**
   * The logical id of the target resource.
   */
  public fun logicalId(): String

  /**
   * The resource type of the route.
   *
   * Today, the only allowed value is 'AWS::ElasticLoadBalancingV2::Listener'.
   */
  public fun type(): String

  /**
   * A builder for [CfnTrafficRoute]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param logicalId The logical id of the target resource. 
     */
    public fun logicalId(logicalId: String)

    /**
     * @param type The resource type of the route. 
     * Today, the only allowed value is 'AWS::ElasticLoadBalancingV2::Listener'.
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnTrafficRoute.Builder =
        software.amazon.awscdk.CfnTrafficRoute.builder()

    /**
     * @param logicalId The logical id of the target resource. 
     */
    override fun logicalId(logicalId: String) {
      cdkBuilder.logicalId(logicalId)
    }

    /**
     * @param type The resource type of the route. 
     * Today, the only allowed value is 'AWS::ElasticLoadBalancingV2::Listener'.
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.CfnTrafficRoute = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.CfnTrafficRoute,
  ) : CdkObject(cdkObject), CfnTrafficRoute {
    /**
     * The logical id of the target resource.
     */
    override fun logicalId(): String = unwrap(this).getLogicalId()

    /**
     * The resource type of the route.
     *
     * Today, the only allowed value is 'AWS::ElasticLoadBalancingV2::Listener'.
     */
    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTrafficRoute {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnTrafficRoute): CfnTrafficRoute =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTrafficRoute): software.amazon.awscdk.CfnTrafficRoute = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.CfnTrafficRoute
  }
}
