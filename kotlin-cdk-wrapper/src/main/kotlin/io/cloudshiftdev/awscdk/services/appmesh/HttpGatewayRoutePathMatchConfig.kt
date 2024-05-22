@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * The type returned from the `bind()` method in `HttpGatewayRoutePathMatch`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appmesh.*;
 * HttpGatewayRoutePathMatchConfig httpGatewayRoutePathMatchConfig =
 * HttpGatewayRoutePathMatchConfig.builder()
 * .prefixPathMatch("prefixPathMatch")
 * .prefixPathRewrite(HttpGatewayRoutePrefixRewriteProperty.builder()
 * .defaultPrefix("defaultPrefix")
 * .value("value")
 * .build())
 * .wholePathMatch(HttpPathMatchProperty.builder()
 * .exact("exact")
 * .regex("regex")
 * .build())
 * .wholePathRewrite(HttpGatewayRoutePathRewriteProperty.builder()
 * .exact("exact")
 * .build())
 * .build();
 * ```
 */
public interface HttpGatewayRoutePathMatchConfig {
  /**
   * Gateway route configuration for matching on the prefix of the URL path of the request.
   *
   * Default: - no matching will be performed on the prefix of the URL path
   */
  public fun prefixPathMatch(): String? = unwrap(this).getPrefixPathMatch()

  /**
   * Gateway route configuration for rewriting the prefix of the URL path of the request.
   *
   * Default: - rewrites the request's URL path to '/'
   */
  public fun prefixPathRewrite(): CfnGatewayRoute.HttpGatewayRoutePrefixRewriteProperty? =
      unwrap(this).getPrefixPathRewrite()?.let(CfnGatewayRoute.HttpGatewayRoutePrefixRewriteProperty::wrap)

  /**
   * Gateway route configuration for matching on the complete URL path of the request.
   *
   * Default: - no matching will be performed on the complete URL path
   */
  public fun wholePathMatch(): CfnGatewayRoute.HttpPathMatchProperty? =
      unwrap(this).getWholePathMatch()?.let(CfnGatewayRoute.HttpPathMatchProperty::wrap)

  /**
   * Gateway route configuration for rewriting the complete URL path of the request..
   *
   * Default: - no rewrite will be performed on the request's complete URL path
   */
  public fun wholePathRewrite(): CfnGatewayRoute.HttpGatewayRoutePathRewriteProperty? =
      unwrap(this).getWholePathRewrite()?.let(CfnGatewayRoute.HttpGatewayRoutePathRewriteProperty::wrap)

  /**
   * A builder for [HttpGatewayRoutePathMatchConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param prefixPathMatch Gateway route configuration for matching on the prefix of the URL path
     * of the request.
     */
    public fun prefixPathMatch(prefixPathMatch: String)

    /**
     * @param prefixPathRewrite Gateway route configuration for rewriting the prefix of the URL path
     * of the request.
     */
    public
        fun prefixPathRewrite(prefixPathRewrite: CfnGatewayRoute.HttpGatewayRoutePrefixRewriteProperty)

    /**
     * @param prefixPathRewrite Gateway route configuration for rewriting the prefix of the URL path
     * of the request.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d76de5131b8aaf9567b4371c8e7c59b17f1335a4d59d7105c0aff4e0a13753d6")
    public
        fun prefixPathRewrite(prefixPathRewrite: CfnGatewayRoute.HttpGatewayRoutePrefixRewriteProperty.Builder.() -> Unit)

    /**
     * @param wholePathMatch Gateway route configuration for matching on the complete URL path of
     * the request.
     */
    public fun wholePathMatch(wholePathMatch: CfnGatewayRoute.HttpPathMatchProperty)

    /**
     * @param wholePathMatch Gateway route configuration for matching on the complete URL path of
     * the request.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7d1b52d87c876c58becd77c8920b8fa7c765d5c7584f8715e3e497402d62312b")
    public
        fun wholePathMatch(wholePathMatch: CfnGatewayRoute.HttpPathMatchProperty.Builder.() -> Unit)

    /**
     * @param wholePathRewrite Gateway route configuration for rewriting the complete URL path of
     * the request..
     */
    public
        fun wholePathRewrite(wholePathRewrite: CfnGatewayRoute.HttpGatewayRoutePathRewriteProperty)

    /**
     * @param wholePathRewrite Gateway route configuration for rewriting the complete URL path of
     * the request..
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1ef3e634fe15d2617f4f81f386ae5069062e589dca64161e03e6c7d59e7c5aad")
    public
        fun wholePathRewrite(wholePathRewrite: CfnGatewayRoute.HttpGatewayRoutePathRewriteProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appmesh.HttpGatewayRoutePathMatchConfig.Builder =
        software.amazon.awscdk.services.appmesh.HttpGatewayRoutePathMatchConfig.builder()

    /**
     * @param prefixPathMatch Gateway route configuration for matching on the prefix of the URL path
     * of the request.
     */
    override fun prefixPathMatch(prefixPathMatch: String) {
      cdkBuilder.prefixPathMatch(prefixPathMatch)
    }

    /**
     * @param prefixPathRewrite Gateway route configuration for rewriting the prefix of the URL path
     * of the request.
     */
    override
        fun prefixPathRewrite(prefixPathRewrite: CfnGatewayRoute.HttpGatewayRoutePrefixRewriteProperty) {
      cdkBuilder.prefixPathRewrite(prefixPathRewrite.let(CfnGatewayRoute.HttpGatewayRoutePrefixRewriteProperty.Companion::unwrap))
    }

    /**
     * @param prefixPathRewrite Gateway route configuration for rewriting the prefix of the URL path
     * of the request.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d76de5131b8aaf9567b4371c8e7c59b17f1335a4d59d7105c0aff4e0a13753d6")
    override
        fun prefixPathRewrite(prefixPathRewrite: CfnGatewayRoute.HttpGatewayRoutePrefixRewriteProperty.Builder.() -> Unit):
        Unit =
        prefixPathRewrite(CfnGatewayRoute.HttpGatewayRoutePrefixRewriteProperty(prefixPathRewrite))

    /**
     * @param wholePathMatch Gateway route configuration for matching on the complete URL path of
     * the request.
     */
    override fun wholePathMatch(wholePathMatch: CfnGatewayRoute.HttpPathMatchProperty) {
      cdkBuilder.wholePathMatch(wholePathMatch.let(CfnGatewayRoute.HttpPathMatchProperty.Companion::unwrap))
    }

    /**
     * @param wholePathMatch Gateway route configuration for matching on the complete URL path of
     * the request.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7d1b52d87c876c58becd77c8920b8fa7c765d5c7584f8715e3e497402d62312b")
    override
        fun wholePathMatch(wholePathMatch: CfnGatewayRoute.HttpPathMatchProperty.Builder.() -> Unit):
        Unit = wholePathMatch(CfnGatewayRoute.HttpPathMatchProperty(wholePathMatch))

    /**
     * @param wholePathRewrite Gateway route configuration for rewriting the complete URL path of
     * the request..
     */
    override
        fun wholePathRewrite(wholePathRewrite: CfnGatewayRoute.HttpGatewayRoutePathRewriteProperty) {
      cdkBuilder.wholePathRewrite(wholePathRewrite.let(CfnGatewayRoute.HttpGatewayRoutePathRewriteProperty.Companion::unwrap))
    }

    /**
     * @param wholePathRewrite Gateway route configuration for rewriting the complete URL path of
     * the request..
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1ef3e634fe15d2617f4f81f386ae5069062e589dca64161e03e6c7d59e7c5aad")
    override
        fun wholePathRewrite(wholePathRewrite: CfnGatewayRoute.HttpGatewayRoutePathRewriteProperty.Builder.() -> Unit):
        Unit =
        wholePathRewrite(CfnGatewayRoute.HttpGatewayRoutePathRewriteProperty(wholePathRewrite))

    public fun build(): software.amazon.awscdk.services.appmesh.HttpGatewayRoutePathMatchConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appmesh.HttpGatewayRoutePathMatchConfig,
  ) : CdkObject(cdkObject), HttpGatewayRoutePathMatchConfig {
    /**
     * Gateway route configuration for matching on the prefix of the URL path of the request.
     *
     * Default: - no matching will be performed on the prefix of the URL path
     */
    override fun prefixPathMatch(): String? = unwrap(this).getPrefixPathMatch()

    /**
     * Gateway route configuration for rewriting the prefix of the URL path of the request.
     *
     * Default: - rewrites the request's URL path to '/'
     */
    override fun prefixPathRewrite(): CfnGatewayRoute.HttpGatewayRoutePrefixRewriteProperty? =
        unwrap(this).getPrefixPathRewrite()?.let(CfnGatewayRoute.HttpGatewayRoutePrefixRewriteProperty::wrap)

    /**
     * Gateway route configuration for matching on the complete URL path of the request.
     *
     * Default: - no matching will be performed on the complete URL path
     */
    override fun wholePathMatch(): CfnGatewayRoute.HttpPathMatchProperty? =
        unwrap(this).getWholePathMatch()?.let(CfnGatewayRoute.HttpPathMatchProperty::wrap)

    /**
     * Gateway route configuration for rewriting the complete URL path of the request..
     *
     * Default: - no rewrite will be performed on the request's complete URL path
     */
    override fun wholePathRewrite(): CfnGatewayRoute.HttpGatewayRoutePathRewriteProperty? =
        unwrap(this).getWholePathRewrite()?.let(CfnGatewayRoute.HttpGatewayRoutePathRewriteProperty::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HttpGatewayRoutePathMatchConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.HttpGatewayRoutePathMatchConfig):
        HttpGatewayRoutePathMatchConfig = CdkObjectWrappers.wrap(cdkObject) as?
        HttpGatewayRoutePathMatchConfig ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpGatewayRoutePathMatchConfig):
        software.amazon.awscdk.services.appmesh.HttpGatewayRoutePathMatchConfig = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.appmesh.HttpGatewayRoutePathMatchConfig
  }
}
