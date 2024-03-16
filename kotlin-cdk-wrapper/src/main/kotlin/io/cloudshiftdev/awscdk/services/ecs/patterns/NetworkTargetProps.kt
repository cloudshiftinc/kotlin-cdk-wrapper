@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs.patterns

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Properties to define a network load balancer target group.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ecs.patterns.*;
 * NetworkTargetProps networkTargetProps = NetworkTargetProps.builder()
 * .containerPort(123)
 * // the properties below are optional
 * .listener("listener")
 * .build();
 * ```
 */
public interface NetworkTargetProps {
  /**
   * The port number of the container.
   *
   * Only applicable when using application/network load balancers.
   */
  public fun containerPort(): Number

  /**
   * Name of the listener the target group attached to.
   *
   * Default: - default listener (first added listener)
   */
  public fun listener(): String? = unwrap(this).getListener()

  /**
   * A builder for [NetworkTargetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param containerPort The port number of the container. 
     * Only applicable when using application/network load balancers.
     */
    public fun containerPort(containerPort: Number)

    /**
     * @param listener Name of the listener the target group attached to.
     */
    public fun listener(listener: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.patterns.NetworkTargetProps.Builder
        = software.amazon.awscdk.services.ecs.patterns.NetworkTargetProps.builder()

    /**
     * @param containerPort The port number of the container. 
     * Only applicable when using application/network load balancers.
     */
    override fun containerPort(containerPort: Number) {
      cdkBuilder.containerPort(containerPort)
    }

    /**
     * @param listener Name of the listener the target group attached to.
     */
    override fun listener(listener: String) {
      cdkBuilder.listener(listener)
    }

    public fun build(): software.amazon.awscdk.services.ecs.patterns.NetworkTargetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.patterns.NetworkTargetProps,
  ) : CdkObject(cdkObject), NetworkTargetProps {
    /**
     * The port number of the container.
     *
     * Only applicable when using application/network load balancers.
     */
    override fun containerPort(): Number = unwrap(this).getContainerPort()

    /**
     * Name of the listener the target group attached to.
     *
     * Default: - default listener (first added listener)
     */
    override fun listener(): String? = unwrap(this).getListener()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): NetworkTargetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.patterns.NetworkTargetProps):
        NetworkTargetProps = CdkObjectWrappers.wrap(cdkObject) as NetworkTargetProps

    internal fun unwrap(wrapped: NetworkTargetProps):
        software.amazon.awscdk.services.ecs.patterns.NetworkTargetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.patterns.NetworkTargetProps
  }
}
