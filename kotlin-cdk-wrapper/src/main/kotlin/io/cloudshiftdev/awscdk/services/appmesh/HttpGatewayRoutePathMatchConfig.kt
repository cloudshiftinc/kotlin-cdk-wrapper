@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface HttpGatewayRoutePathMatchConfig {
  public fun prefixPathMatch(): String? = unwrap(this).getPrefixPathMatch()

  public fun prefixPathRewrite(): CfnGatewayRoute.HttpGatewayRoutePrefixRewriteProperty? =
      unwrap(this).getPrefixPathRewrite()?.let(CfnGatewayRoute.HttpGatewayRoutePrefixRewriteProperty::wrap)

  public fun wholePathMatch(): CfnGatewayRoute.HttpPathMatchProperty? =
      unwrap(this).getWholePathMatch()?.let(CfnGatewayRoute.HttpPathMatchProperty::wrap)

  public fun wholePathRewrite(): CfnGatewayRoute.HttpGatewayRoutePathRewriteProperty? =
      unwrap(this).getWholePathRewrite()?.let(CfnGatewayRoute.HttpGatewayRoutePathRewriteProperty::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun prefixPathMatch(prefixPathMatch: String)

    public
        fun prefixPathRewrite(prefixPathRewrite: CfnGatewayRoute.HttpGatewayRoutePrefixRewriteProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d76de5131b8aaf9567b4371c8e7c59b17f1335a4d59d7105c0aff4e0a13753d6")
    public
        fun prefixPathRewrite(prefixPathRewrite: CfnGatewayRoute.HttpGatewayRoutePrefixRewriteProperty.Builder.() -> Unit)

    public fun wholePathMatch(wholePathMatch: CfnGatewayRoute.HttpPathMatchProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7d1b52d87c876c58becd77c8920b8fa7c765d5c7584f8715e3e497402d62312b")
    public
        fun wholePathMatch(wholePathMatch: CfnGatewayRoute.HttpPathMatchProperty.Builder.() -> Unit)

    public
        fun wholePathRewrite(wholePathRewrite: CfnGatewayRoute.HttpGatewayRoutePathRewriteProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1ef3e634fe15d2617f4f81f386ae5069062e589dca64161e03e6c7d59e7c5aad")
    public
        fun wholePathRewrite(wholePathRewrite: CfnGatewayRoute.HttpGatewayRoutePathRewriteProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appmesh.HttpGatewayRoutePathMatchConfig.Builder =
        software.amazon.awscdk.services.appmesh.HttpGatewayRoutePathMatchConfig.builder()

    override fun prefixPathMatch(prefixPathMatch: String) {
      cdkBuilder.prefixPathMatch(prefixPathMatch)
    }

    override
        fun prefixPathRewrite(prefixPathRewrite: CfnGatewayRoute.HttpGatewayRoutePrefixRewriteProperty) {
      cdkBuilder.prefixPathRewrite(prefixPathRewrite.let(CfnGatewayRoute.HttpGatewayRoutePrefixRewriteProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d76de5131b8aaf9567b4371c8e7c59b17f1335a4d59d7105c0aff4e0a13753d6")
    override
        fun prefixPathRewrite(prefixPathRewrite: CfnGatewayRoute.HttpGatewayRoutePrefixRewriteProperty.Builder.() -> Unit):
        Unit =
        prefixPathRewrite(CfnGatewayRoute.HttpGatewayRoutePrefixRewriteProperty(prefixPathRewrite))

    override fun wholePathMatch(wholePathMatch: CfnGatewayRoute.HttpPathMatchProperty) {
      cdkBuilder.wholePathMatch(wholePathMatch.let(CfnGatewayRoute.HttpPathMatchProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7d1b52d87c876c58becd77c8920b8fa7c765d5c7584f8715e3e497402d62312b")
    override
        fun wholePathMatch(wholePathMatch: CfnGatewayRoute.HttpPathMatchProperty.Builder.() -> Unit):
        Unit = wholePathMatch(CfnGatewayRoute.HttpPathMatchProperty(wholePathMatch))

    override
        fun wholePathRewrite(wholePathRewrite: CfnGatewayRoute.HttpGatewayRoutePathRewriteProperty) {
      cdkBuilder.wholePathRewrite(wholePathRewrite.let(CfnGatewayRoute.HttpGatewayRoutePathRewriteProperty::unwrap))
    }

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
    override val cdkObject: software.amazon.awscdk.services.appmesh.HttpGatewayRoutePathMatchConfig,
  ) : CdkObject(cdkObject), HttpGatewayRoutePathMatchConfig {
    override fun prefixPathMatch(): String? = unwrap(this).getPrefixPathMatch()

    override fun prefixPathRewrite(): CfnGatewayRoute.HttpGatewayRoutePrefixRewriteProperty? =
        unwrap(this).getPrefixPathRewrite()?.let(CfnGatewayRoute.HttpGatewayRoutePrefixRewriteProperty::wrap)

    override fun wholePathMatch(): CfnGatewayRoute.HttpPathMatchProperty? =
        unwrap(this).getWholePathMatch()?.let(CfnGatewayRoute.HttpPathMatchProperty::wrap)

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
        HttpGatewayRoutePathMatchConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpGatewayRoutePathMatchConfig):
        software.amazon.awscdk.services.appmesh.HttpGatewayRoutePathMatchConfig = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.appmesh.HttpGatewayRoutePathMatchConfig
  }
}
