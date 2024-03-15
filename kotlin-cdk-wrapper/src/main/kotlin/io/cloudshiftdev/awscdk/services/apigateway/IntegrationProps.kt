@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface IntegrationProps {
  public fun integrationHttpMethod(): String? = unwrap(this).getIntegrationHttpMethod()

  public fun options(): IntegrationOptions? =
      unwrap(this).getOptions()?.let(IntegrationOptions::wrap)

  public fun type(): IntegrationType

  public fun uri(): Any? = unwrap(this).getUri()

  @CdkDslMarker
  public interface Builder {
    public fun integrationHttpMethod(integrationHttpMethod: String)

    public fun options(options: IntegrationOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f4fac92f4a9aa5b65ea57600909a6aa5492fafabb69a418b0e4f4512cec2aaeb")
    public fun options(options: IntegrationOptions.Builder.() -> Unit)

    public fun type(type: IntegrationType)

    public fun uri(uri: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.IntegrationProps.Builder =
        software.amazon.awscdk.services.apigateway.IntegrationProps.builder()

    override fun integrationHttpMethod(integrationHttpMethod: String) {
      cdkBuilder.integrationHttpMethod(integrationHttpMethod)
    }

    override fun options(options: IntegrationOptions) {
      cdkBuilder.options(options.let(IntegrationOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f4fac92f4a9aa5b65ea57600909a6aa5492fafabb69a418b0e4f4512cec2aaeb")
    override fun options(options: IntegrationOptions.Builder.() -> Unit): Unit =
        options(IntegrationOptions(options))

    override fun type(type: IntegrationType) {
      cdkBuilder.type(type.let(IntegrationType::unwrap))
    }

    override fun uri(uri: Any) {
      cdkBuilder.uri(uri)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.IntegrationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.IntegrationProps,
  ) : CdkObject(cdkObject), IntegrationProps {
    override fun integrationHttpMethod(): String? = unwrap(this).getIntegrationHttpMethod()

    override fun options(): IntegrationOptions? =
        unwrap(this).getOptions()?.let(IntegrationOptions::wrap)

    override fun type(): IntegrationType = unwrap(this).getType().let(IntegrationType::wrap)

    override fun uri(): Any? = unwrap(this).getUri()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): IntegrationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.IntegrationProps):
        IntegrationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IntegrationProps):
        software.amazon.awscdk.services.apigateway.IntegrationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.IntegrationProps
  }
}
