@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Unit

/**
 * Result of attaching a target to load balancer.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.*;
 * Object targetJson;
 * LoadBalancerTargetProps loadBalancerTargetProps = LoadBalancerTargetProps.builder()
 * .targetType(TargetType.INSTANCE)
 * // the properties below are optional
 * .targetJson(targetJson)
 * .build();
 * ```
 */
public interface LoadBalancerTargetProps {
  /**
   * JSON representing the target's direct addition to the TargetGroup list.
   *
   * May be omitted if the target is going to register itself later.
   */
  public fun targetJson(): Any? = unwrap(this).getTargetJson()

  /**
   * What kind of target this is.
   */
  public fun targetType(): TargetType

  /**
   * A builder for [LoadBalancerTargetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param targetJson JSON representing the target's direct addition to the TargetGroup list.
     * May be omitted if the target is going to register itself later.
     */
    public fun targetJson(targetJson: Any)

    /**
     * @param targetType What kind of target this is. 
     */
    public fun targetType(targetType: TargetType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.LoadBalancerTargetProps.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.LoadBalancerTargetProps.builder()

    /**
     * @param targetJson JSON representing the target's direct addition to the TargetGroup list.
     * May be omitted if the target is going to register itself later.
     */
    override fun targetJson(targetJson: Any) {
      cdkBuilder.targetJson(targetJson)
    }

    /**
     * @param targetType What kind of target this is. 
     */
    override fun targetType(targetType: TargetType) {
      cdkBuilder.targetType(targetType.let(TargetType.Companion::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.elasticloadbalancingv2.LoadBalancerTargetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.LoadBalancerTargetProps,
  ) : CdkObject(cdkObject),
      LoadBalancerTargetProps {
    /**
     * JSON representing the target's direct addition to the TargetGroup list.
     *
     * May be omitted if the target is going to register itself later.
     */
    override fun targetJson(): Any? = unwrap(this).getTargetJson()

    /**
     * What kind of target this is.
     */
    override fun targetType(): TargetType = unwrap(this).getTargetType().let(TargetType::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LoadBalancerTargetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.LoadBalancerTargetProps):
        LoadBalancerTargetProps = CdkObjectWrappers.wrap(cdkObject) as? LoadBalancerTargetProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: LoadBalancerTargetProps):
        software.amazon.awscdk.services.elasticloadbalancingv2.LoadBalancerTargetProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.LoadBalancerTargetProps
  }
}
