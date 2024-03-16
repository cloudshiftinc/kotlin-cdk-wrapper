@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Configuration for `HeaderMatch`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appmesh.*;
 * HeaderMatchConfig headerMatchConfig = HeaderMatchConfig.builder()
 * .headerMatch(HttpRouteHeaderProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .invert(false)
 * .match(HeaderMatchMethodProperty.builder()
 * .exact("exact")
 * .prefix("prefix")
 * .range(MatchRangeProperty.builder()
 * .end(123)
 * .start(123)
 * .build())
 * .regex("regex")
 * .suffix("suffix")
 * .build())
 * .build())
 * .build();
 * ```
 */
public interface HeaderMatchConfig {
  /**
   * Route CFN configuration for the route header match.
   */
  public fun headerMatch(): CfnRoute.HttpRouteHeaderProperty

  /**
   * A builder for [HeaderMatchConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param headerMatch Route CFN configuration for the route header match. 
     */
    public fun headerMatch(headerMatch: CfnRoute.HttpRouteHeaderProperty)

    /**
     * @param headerMatch Route CFN configuration for the route header match. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c27a7fcd39f5eb13fc38f4a7eecc86d2b2eeccb91d1c9f490d650243ee950559")
    public fun headerMatch(headerMatch: CfnRoute.HttpRouteHeaderProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.HeaderMatchConfig.Builder =
        software.amazon.awscdk.services.appmesh.HeaderMatchConfig.builder()

    /**
     * @param headerMatch Route CFN configuration for the route header match. 
     */
    override fun headerMatch(headerMatch: CfnRoute.HttpRouteHeaderProperty) {
      cdkBuilder.headerMatch(headerMatch.let(CfnRoute.HttpRouteHeaderProperty::unwrap))
    }

    /**
     * @param headerMatch Route CFN configuration for the route header match. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c27a7fcd39f5eb13fc38f4a7eecc86d2b2eeccb91d1c9f490d650243ee950559")
    override fun headerMatch(headerMatch: CfnRoute.HttpRouteHeaderProperty.Builder.() -> Unit): Unit
        = headerMatch(CfnRoute.HttpRouteHeaderProperty(headerMatch))

    public fun build(): software.amazon.awscdk.services.appmesh.HeaderMatchConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.HeaderMatchConfig,
  ) : CdkObject(cdkObject), HeaderMatchConfig {
    /**
     * Route CFN configuration for the route header match.
     */
    override fun headerMatch(): CfnRoute.HttpRouteHeaderProperty =
        unwrap(this).getHeaderMatch().let(CfnRoute.HttpRouteHeaderProperty::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HeaderMatchConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.HeaderMatchConfig):
        HeaderMatchConfig = CdkObjectWrappers.wrap(cdkObject) as HeaderMatchConfig

    internal fun unwrap(wrapped: HeaderMatchConfig):
        software.amazon.awscdk.services.appmesh.HeaderMatchConfig = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.appmesh.HeaderMatchConfig
  }
}
