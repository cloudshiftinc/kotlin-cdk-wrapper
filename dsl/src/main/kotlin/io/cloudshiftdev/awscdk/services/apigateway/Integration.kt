package io.cloudshiftdev.awscdk.services.apigateway

import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public open class Integration internal constructor(
  private val cdkObject: software.amazon.awscdk.services.apigateway.Integration,
) {
  public open fun bind(_method: Method): IntegrationConfig =
      unwrap(this).bind(_method.let(Method::unwrap)).let(IntegrationConfig::wrap)

  public interface Builder {
    public fun integrationHttpMethod(integrationHttpMethod: String)

    public fun options(options: IntegrationOptions)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bc199e2f86a9a6366f5ffe8ba92e0e2672d1e026c257ca1eaa91f561b6f2f16d")
    public fun options(options: IntegrationOptions.Builder.() -> Unit)

    public fun type(type: IntegrationType)

    public fun uri(uri: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.Integration.Builder =
        software.amazon.awscdk.services.apigateway.Integration.Builder.create()

    override fun integrationHttpMethod(integrationHttpMethod: String) {
      cdkBuilder.integrationHttpMethod(integrationHttpMethod)
    }

    override fun options(options: IntegrationOptions) {
      cdkBuilder.options(options.let(IntegrationOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bc199e2f86a9a6366f5ffe8ba92e0e2672d1e026c257ca1eaa91f561b6f2f16d")
    override fun options(options: IntegrationOptions.Builder.() -> Unit): Unit =
        options(IntegrationOptions(options))

    override fun type(type: IntegrationType) {
      cdkBuilder.type(type.let(IntegrationType::unwrap))
    }

    override fun uri(uri: Any) {
      cdkBuilder.uri(uri)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.Integration = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): Integration {
      val builderImpl = BuilderImpl()
      return Integration(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.Integration):
        Integration = Integration(cdkObject)

    internal fun unwrap(wrapped: Integration):
        software.amazon.awscdk.services.apigateway.Integration = wrapped.cdkObject
  }
}
