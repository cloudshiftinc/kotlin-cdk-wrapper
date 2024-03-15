@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface IntegrationConfig {
  public fun deploymentToken(): String? = unwrap(this).getDeploymentToken()

  public fun integrationHttpMethod(): String? = unwrap(this).getIntegrationHttpMethod()

  public fun options(): IntegrationOptions? =
      unwrap(this).getOptions()?.let(IntegrationOptions::wrap)

  public fun type(): IntegrationType

  public fun uri(): String? = unwrap(this).getUri()

  @CdkDslMarker
  public interface Builder {
    public fun deploymentToken(deploymentToken: String)

    public fun integrationHttpMethod(integrationHttpMethod: String)

    public fun options(options: IntegrationOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8cc2787d31e548d4bf39995796c58d01fe7feb0418660b4a0d8ed339d9c481e2")
    public fun options(options: IntegrationOptions.Builder.() -> Unit)

    public fun type(type: IntegrationType)

    public fun uri(uri: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.IntegrationConfig.Builder =
        software.amazon.awscdk.services.apigateway.IntegrationConfig.builder()

    override fun deploymentToken(deploymentToken: String) {
      cdkBuilder.deploymentToken(deploymentToken)
    }

    override fun integrationHttpMethod(integrationHttpMethod: String) {
      cdkBuilder.integrationHttpMethod(integrationHttpMethod)
    }

    override fun options(options: IntegrationOptions) {
      cdkBuilder.options(options.let(IntegrationOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8cc2787d31e548d4bf39995796c58d01fe7feb0418660b4a0d8ed339d9c481e2")
    override fun options(options: IntegrationOptions.Builder.() -> Unit): Unit =
        options(IntegrationOptions(options))

    override fun type(type: IntegrationType) {
      cdkBuilder.type(type.let(IntegrationType::unwrap))
    }

    override fun uri(uri: String) {
      cdkBuilder.uri(uri)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.IntegrationConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.IntegrationConfig,
  ) : CdkObject(cdkObject), IntegrationConfig {
    override fun deploymentToken(): String? = unwrap(this).getDeploymentToken()

    override fun integrationHttpMethod(): String? = unwrap(this).getIntegrationHttpMethod()

    override fun options(): IntegrationOptions? =
        unwrap(this).getOptions()?.let(IntegrationOptions::wrap)

    override fun type(): IntegrationType = unwrap(this).getType().let(IntegrationType::wrap)

    override fun uri(): String? = unwrap(this).getUri()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): IntegrationConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.IntegrationConfig):
        IntegrationConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IntegrationConfig):
        software.amazon.awscdk.services.apigateway.IntegrationConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.IntegrationConfig
  }
}
