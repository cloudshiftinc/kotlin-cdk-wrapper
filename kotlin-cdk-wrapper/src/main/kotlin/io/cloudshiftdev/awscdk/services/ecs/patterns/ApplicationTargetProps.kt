@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs.patterns

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ecs.Protocol
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Properties to define an application target group.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ecs.*;
 * import io.cloudshiftdev.awscdk.services.ecs.patterns.*;
 * ApplicationTargetProps applicationTargetProps = ApplicationTargetProps.builder()
 * .containerPort(123)
 * // the properties below are optional
 * .hostHeader("hostHeader")
 * .listener("listener")
 * .pathPattern("pathPattern")
 * .priority(123)
 * .protocol(Protocol.TCP)
 * .build();
 * ```
 */
public interface ApplicationTargetProps {
  /**
   * The port number of the container.
   *
   * Only applicable when using application/network load balancers.
   */
  public fun containerPort(): Number

  /**
   * Rule applies if the requested host matches the indicated host.
   *
   * May contain up to three '*' wildcards.
   *
   * Requires that priority is set.
   *
   * Default: No host condition
   *
   * [Documentation](https://docs.aws.amazon.com/elasticloadbalancing/latest/application/load-balancer-listeners.html#host-conditions)
   */
  public fun hostHeader(): String? = unwrap(this).getHostHeader()

  /**
   * Name of the listener the target group attached to.
   *
   * Default: - default listener (first added listener)
   */
  public fun listener(): String? = unwrap(this).getListener()

  /**
   * Rule applies if the requested path matches the given path pattern.
   *
   * May contain up to three '*' wildcards.
   *
   * Requires that priority is set.
   *
   * Default: No path condition
   *
   * [Documentation](https://docs.aws.amazon.com/elasticloadbalancing/latest/application/load-balancer-listeners.html#path-conditions)
   */
  public fun pathPattern(): String? = unwrap(this).getPathPattern()

  /**
   * Priority of this target group.
   *
   * The rule with the lowest priority will be used for every request.
   * If priority is not given, these target groups will be added as
   * defaults, and must not have conditions.
   *
   * Priorities must be unique.
   *
   * Default: Target groups are used as defaults
   */
  public fun priority(): Number? = unwrap(this).getPriority()

  /**
   * The protocol used for the port mapping.
   *
   * Only applicable when using application load balancers.
   *
   * Default: ecs.Protocol.TCP
   */
  public fun protocol(): Protocol? = unwrap(this).getProtocol()?.let(Protocol::wrap)

  /**
   * A builder for [ApplicationTargetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param containerPort The port number of the container. 
     * Only applicable when using application/network load balancers.
     */
    public fun containerPort(containerPort: Number)

    /**
     * @param hostHeader Rule applies if the requested host matches the indicated host.
     * May contain up to three '*' wildcards.
     *
     * Requires that priority is set.
     */
    public fun hostHeader(hostHeader: String)

    /**
     * @param listener Name of the listener the target group attached to.
     */
    public fun listener(listener: String)

    /**
     * @param pathPattern Rule applies if the requested path matches the given path pattern.
     * May contain up to three '*' wildcards.
     *
     * Requires that priority is set.
     */
    public fun pathPattern(pathPattern: String)

    /**
     * @param priority Priority of this target group.
     * The rule with the lowest priority will be used for every request.
     * If priority is not given, these target groups will be added as
     * defaults, and must not have conditions.
     *
     * Priorities must be unique.
     */
    public fun priority(priority: Number)

    /**
     * @param protocol The protocol used for the port mapping.
     * Only applicable when using application load balancers.
     */
    public fun protocol(protocol: Protocol)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecs.patterns.ApplicationTargetProps.Builder =
        software.amazon.awscdk.services.ecs.patterns.ApplicationTargetProps.builder()

    /**
     * @param containerPort The port number of the container. 
     * Only applicable when using application/network load balancers.
     */
    override fun containerPort(containerPort: Number) {
      cdkBuilder.containerPort(containerPort)
    }

    /**
     * @param hostHeader Rule applies if the requested host matches the indicated host.
     * May contain up to three '*' wildcards.
     *
     * Requires that priority is set.
     */
    override fun hostHeader(hostHeader: String) {
      cdkBuilder.hostHeader(hostHeader)
    }

    /**
     * @param listener Name of the listener the target group attached to.
     */
    override fun listener(listener: String) {
      cdkBuilder.listener(listener)
    }

    /**
     * @param pathPattern Rule applies if the requested path matches the given path pattern.
     * May contain up to three '*' wildcards.
     *
     * Requires that priority is set.
     */
    override fun pathPattern(pathPattern: String) {
      cdkBuilder.pathPattern(pathPattern)
    }

    /**
     * @param priority Priority of this target group.
     * The rule with the lowest priority will be used for every request.
     * If priority is not given, these target groups will be added as
     * defaults, and must not have conditions.
     *
     * Priorities must be unique.
     */
    override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    /**
     * @param protocol The protocol used for the port mapping.
     * Only applicable when using application load balancers.
     */
    override fun protocol(protocol: Protocol) {
      cdkBuilder.protocol(protocol.let(Protocol.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.patterns.ApplicationTargetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ecs.patterns.ApplicationTargetProps,
  ) : CdkObject(cdkObject), ApplicationTargetProps {
    /**
     * The port number of the container.
     *
     * Only applicable when using application/network load balancers.
     */
    override fun containerPort(): Number = unwrap(this).getContainerPort()

    /**
     * Rule applies if the requested host matches the indicated host.
     *
     * May contain up to three '*' wildcards.
     *
     * Requires that priority is set.
     *
     * Default: No host condition
     *
     * [Documentation](https://docs.aws.amazon.com/elasticloadbalancing/latest/application/load-balancer-listeners.html#host-conditions)
     */
    override fun hostHeader(): String? = unwrap(this).getHostHeader()

    /**
     * Name of the listener the target group attached to.
     *
     * Default: - default listener (first added listener)
     */
    override fun listener(): String? = unwrap(this).getListener()

    /**
     * Rule applies if the requested path matches the given path pattern.
     *
     * May contain up to three '*' wildcards.
     *
     * Requires that priority is set.
     *
     * Default: No path condition
     *
     * [Documentation](https://docs.aws.amazon.com/elasticloadbalancing/latest/application/load-balancer-listeners.html#path-conditions)
     */
    override fun pathPattern(): String? = unwrap(this).getPathPattern()

    /**
     * Priority of this target group.
     *
     * The rule with the lowest priority will be used for every request.
     * If priority is not given, these target groups will be added as
     * defaults, and must not have conditions.
     *
     * Priorities must be unique.
     *
     * Default: Target groups are used as defaults
     */
    override fun priority(): Number? = unwrap(this).getPriority()

    /**
     * The protocol used for the port mapping.
     *
     * Only applicable when using application load balancers.
     *
     * Default: ecs.Protocol.TCP
     */
    override fun protocol(): Protocol? = unwrap(this).getProtocol()?.let(Protocol::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ApplicationTargetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.patterns.ApplicationTargetProps):
        ApplicationTargetProps = CdkObjectWrappers.wrap(cdkObject) as? ApplicationTargetProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ApplicationTargetProps):
        software.amazon.awscdk.services.ecs.patterns.ApplicationTargetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.patterns.ApplicationTargetProps
  }
}
