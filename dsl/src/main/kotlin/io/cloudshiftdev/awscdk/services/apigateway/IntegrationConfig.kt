package io.cloudshiftdev.awscdk.services.apigateway

import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface IntegrationConfig {
  public fun deploymentToken(): String? = unwrap(this).getDeploymentToken()

  public fun integrationHttpMethod(): String? = unwrap(this).getIntegrationHttpMethod()

  public fun options(): IntegrationOptions? =
      unwrap(this).getOptions()?.let(IntegrationOptions::wrap)

  public fun type(): IntegrationType

  public fun uri(): String? = unwrap(this).getUri()

  public interface Builder {
    public fun deploymentToken(deploymentToken: String) {
    }

    public fun integrationHttpMethod(integrationHttpMethod: String) {
    }

    public fun options(options: IntegrationOptions) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8cc2787d31e548d4bf39995796c58d01fe7feb0418660b4a0d8ed339d9c481e2")
    public fun options(options: IntegrationOptions.Builder.() -> Unit) {
    }

    public fun type(type: IntegrationType) {
    }

    public fun uri(uri: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.IntegrationConfig.Builder =
        software.amazon.awscdk.services.apigateway.IntegrationConfig.builder()

    public override fun deploymentToken(deploymentToken: String) {
      cdkBuilder.deploymentToken(deploymentToken)
    }

    public override fun integrationHttpMethod(integrationHttpMethod: String) {
      cdkBuilder.integrationHttpMethod(integrationHttpMethod)
    }

    public override fun options(options: IntegrationOptions) {
      cdkBuilder.options(options.let(IntegrationOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8cc2787d31e548d4bf39995796c58d01fe7feb0418660b4a0d8ed339d9c481e2")
    public override fun options(options: IntegrationOptions.Builder.() -> Unit): Unit =
        options(IntegrationOptions(options))

    public override fun type(type: IntegrationType) {
      cdkBuilder.type(type.let(IntegrationType::unwrap))
    }

    public override fun uri(uri: String) {
      cdkBuilder.uri(uri)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.IntegrationConfig =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigateway.IntegrationConfig,
  ) : IntegrationConfig {
    public override fun deploymentToken(): String? = unwrap(this).getDeploymentToken()

    public override fun integrationHttpMethod(): String? = unwrap(this).getIntegrationHttpMethod()

    public override fun options(): IntegrationOptions? =
        unwrap(this).getOptions()?.let(IntegrationOptions::wrap)

    public override fun type(): IntegrationType = unwrap(this).getType().let(IntegrationType::wrap)

    public override fun uri(): String? = unwrap(this).getUri()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): IntegrationConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.IntegrationConfig):
        IntegrationConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IntegrationConfig):
        software.amazon.awscdk.services.apigateway.IntegrationConfig = (wrapped as
        Wrapper).cdkObject
  }
}
