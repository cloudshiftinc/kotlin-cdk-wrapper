@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface HttpRoutePathMatchConfig {
  public fun prefixPathMatch(): String? = unwrap(this).getPrefixPathMatch()

  public fun wholePathMatch(): CfnRoute.HttpPathMatchProperty? =
      unwrap(this).getWholePathMatch()?.let(CfnRoute.HttpPathMatchProperty::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun prefixPathMatch(prefixPathMatch: String)

    public fun wholePathMatch(wholePathMatch: CfnRoute.HttpPathMatchProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("469c71b9cd324807f914848d7b544aef7c726cf70880b7ef0ad54caa8b9e1d43")
    public fun wholePathMatch(wholePathMatch: CfnRoute.HttpPathMatchProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.HttpRoutePathMatchConfig.Builder
        = software.amazon.awscdk.services.appmesh.HttpRoutePathMatchConfig.builder()

    override fun prefixPathMatch(prefixPathMatch: String) {
      cdkBuilder.prefixPathMatch(prefixPathMatch)
    }

    override fun wholePathMatch(wholePathMatch: CfnRoute.HttpPathMatchProperty) {
      cdkBuilder.wholePathMatch(wholePathMatch.let(CfnRoute.HttpPathMatchProperty::unwrap))
    }

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
    override fun prefixPathMatch(): String? = unwrap(this).getPrefixPathMatch()

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
