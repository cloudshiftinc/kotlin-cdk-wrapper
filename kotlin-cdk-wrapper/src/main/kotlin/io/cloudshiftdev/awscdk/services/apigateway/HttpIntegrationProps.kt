@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface HttpIntegrationProps {
  public fun httpMethod(): String? = unwrap(this).getHttpMethod()

  public fun options(): IntegrationOptions? =
      unwrap(this).getOptions()?.let(IntegrationOptions::wrap)

  public fun proxy(): Boolean? = unwrap(this).getProxy()

  @CdkDslMarker
  public interface Builder {
    public fun httpMethod(httpMethod: String)

    public fun options(options: IntegrationOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bd4642fd9923684248b1bba052795816d170c8ead6b650a15047a9d3961994b8")
    public fun options(options: IntegrationOptions.Builder.() -> Unit)

    public fun proxy(proxy: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.HttpIntegrationProps.Builder
        = software.amazon.awscdk.services.apigateway.HttpIntegrationProps.builder()

    override fun httpMethod(httpMethod: String) {
      cdkBuilder.httpMethod(httpMethod)
    }

    override fun options(options: IntegrationOptions) {
      cdkBuilder.options(options.let(IntegrationOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bd4642fd9923684248b1bba052795816d170c8ead6b650a15047a9d3961994b8")
    override fun options(options: IntegrationOptions.Builder.() -> Unit): Unit =
        options(IntegrationOptions(options))

    override fun proxy(proxy: Boolean) {
      cdkBuilder.proxy(proxy)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.HttpIntegrationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.HttpIntegrationProps,
  ) : CdkObject(cdkObject), HttpIntegrationProps {
    override fun httpMethod(): String? = unwrap(this).getHttpMethod()

    override fun options(): IntegrationOptions? =
        unwrap(this).getOptions()?.let(IntegrationOptions::wrap)

    override fun proxy(): Boolean? = unwrap(this).getProxy()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HttpIntegrationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.HttpIntegrationProps):
        HttpIntegrationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpIntegrationProps):
        software.amazon.awscdk.services.apigateway.HttpIntegrationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.HttpIntegrationProps
  }
}
