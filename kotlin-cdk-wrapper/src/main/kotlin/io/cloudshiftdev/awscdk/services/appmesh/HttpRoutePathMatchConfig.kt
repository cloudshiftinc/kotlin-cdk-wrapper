@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * The type returned from the `bind()` method in `HttpRoutePathMatch`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appmesh.*;
 * HttpRoutePathMatchConfig httpRoutePathMatchConfig = HttpRoutePathMatchConfig.builder()
 * .prefixPathMatch("prefixPathMatch")
 * .wholePathMatch(HttpPathMatchProperty.builder()
 * .exact("exact")
 * .regex("regex")
 * .build())
 * .build();
 * ```
 */
public interface HttpRoutePathMatchConfig {
  /**
   * Route configuration for matching on the prefix of the URL path of the request.
   *
   * Default: - no matching will be performed on the prefix of the URL path
   */
  public fun prefixPathMatch(): String? = unwrap(this).getPrefixPathMatch()

  /**
   * Route configuration for matching on the complete URL path of the request.
   *
   * Default: - no matching will be performed on the complete URL path
   */
  public fun wholePathMatch(): CfnRoute.HttpPathMatchProperty? =
      unwrap(this).getWholePathMatch()?.let(CfnRoute.HttpPathMatchProperty::wrap)

  /**
   * A builder for [HttpRoutePathMatchConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param prefixPathMatch Route configuration for matching on the prefix of the URL path of the
     * request.
     */
    public fun prefixPathMatch(prefixPathMatch: String)

    /**
     * @param wholePathMatch Route configuration for matching on the complete URL path of the
     * request.
     */
    public fun wholePathMatch(wholePathMatch: CfnRoute.HttpPathMatchProperty)

    /**
     * @param wholePathMatch Route configuration for matching on the complete URL path of the
     * request.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("469c71b9cd324807f914848d7b544aef7c726cf70880b7ef0ad54caa8b9e1d43")
    public fun wholePathMatch(wholePathMatch: CfnRoute.HttpPathMatchProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.HttpRoutePathMatchConfig.Builder
        = software.amazon.awscdk.services.appmesh.HttpRoutePathMatchConfig.builder()

    /**
     * @param prefixPathMatch Route configuration for matching on the prefix of the URL path of the
     * request.
     */
    override fun prefixPathMatch(prefixPathMatch: String) {
      cdkBuilder.prefixPathMatch(prefixPathMatch)
    }

    /**
     * @param wholePathMatch Route configuration for matching on the complete URL path of the
     * request.
     */
    override fun wholePathMatch(wholePathMatch: CfnRoute.HttpPathMatchProperty) {
      cdkBuilder.wholePathMatch(wholePathMatch.let(CfnRoute.HttpPathMatchProperty::unwrap))
    }

    /**
     * @param wholePathMatch Route configuration for matching on the complete URL path of the
     * request.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("469c71b9cd324807f914848d7b544aef7c726cf70880b7ef0ad54caa8b9e1d43")
    override fun wholePathMatch(wholePathMatch: CfnRoute.HttpPathMatchProperty.Builder.() -> Unit):
        Unit = wholePathMatch(CfnRoute.HttpPathMatchProperty(wholePathMatch))

    public fun build(): software.amazon.awscdk.services.appmesh.HttpRoutePathMatchConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.HttpRoutePathMatchConfig,
  ) : CdkObject(cdkObject), HttpRoutePathMatchConfig {
    /**
     * Route configuration for matching on the prefix of the URL path of the request.
     *
     * Default: - no matching will be performed on the prefix of the URL path
     */
    override fun prefixPathMatch(): String? = unwrap(this).getPrefixPathMatch()

    /**
     * Route configuration for matching on the complete URL path of the request.
     *
     * Default: - no matching will be performed on the complete URL path
     */
    override fun wholePathMatch(): CfnRoute.HttpPathMatchProperty? =
        unwrap(this).getWholePathMatch()?.let(CfnRoute.HttpPathMatchProperty::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HttpRoutePathMatchConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.HttpRoutePathMatchConfig):
        HttpRoutePathMatchConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpRoutePathMatchConfig):
        software.amazon.awscdk.services.appmesh.HttpRoutePathMatchConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.HttpRoutePathMatchConfig
  }
}
