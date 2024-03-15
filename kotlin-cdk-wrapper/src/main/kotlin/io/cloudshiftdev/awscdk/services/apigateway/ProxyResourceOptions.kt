@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Unit
import kotlin.jvm.JvmName

public interface ProxyResourceOptions : ResourceOptions {
  public fun anyMethod(): Boolean? = unwrap(this).getAnyMethod()

  @CdkDslMarker
  public interface Builder {
    public fun anyMethod(anyMethod: Boolean)

    public fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e151382df0c851b3ddf006133fee29eab092530e27fe393dd9f9af288f2b0c39")
    public
        fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions.Builder.() -> Unit)

    public fun defaultIntegration(defaultIntegration: Integration)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("515a82bc88058a7cb28cdd5615e50a9b89cae9951829f41bb311bf96f48320cb")
    public fun defaultIntegration(defaultIntegration: Integration.Builder.() -> Unit)

    public fun defaultMethodOptions(defaultMethodOptions: MethodOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("443689287b59c52a05c959c5696ae42ca2386111cfe7d9ddb62e63d8b60b38f9")
    public fun defaultMethodOptions(defaultMethodOptions: MethodOptions.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.ProxyResourceOptions.Builder
        = software.amazon.awscdk.services.apigateway.ProxyResourceOptions.builder()

    override fun anyMethod(anyMethod: Boolean) {
      cdkBuilder.anyMethod(anyMethod)
    }

    override fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions) {
      cdkBuilder.defaultCorsPreflightOptions(defaultCorsPreflightOptions.let(CorsOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e151382df0c851b3ddf006133fee29eab092530e27fe393dd9f9af288f2b0c39")
    override
        fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions.Builder.() -> Unit):
        Unit = defaultCorsPreflightOptions(CorsOptions(defaultCorsPreflightOptions))

    override fun defaultIntegration(defaultIntegration: Integration) {
      cdkBuilder.defaultIntegration(defaultIntegration.let(Integration::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("515a82bc88058a7cb28cdd5615e50a9b89cae9951829f41bb311bf96f48320cb")
    override fun defaultIntegration(defaultIntegration: Integration.Builder.() -> Unit): Unit =
        defaultIntegration(Integration(defaultIntegration))

    override fun defaultMethodOptions(defaultMethodOptions: MethodOptions) {
      cdkBuilder.defaultMethodOptions(defaultMethodOptions.let(MethodOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("443689287b59c52a05c959c5696ae42ca2386111cfe7d9ddb62e63d8b60b38f9")
    override fun defaultMethodOptions(defaultMethodOptions: MethodOptions.Builder.() -> Unit): Unit
        = defaultMethodOptions(MethodOptions(defaultMethodOptions))

    public fun build(): software.amazon.awscdk.services.apigateway.ProxyResourceOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.ProxyResourceOptions,
  ) : CdkObject(cdkObject), ProxyResourceOptions {
    override fun anyMethod(): Boolean? = unwrap(this).getAnyMethod()

    override fun defaultCorsPreflightOptions(): CorsOptions? =
        unwrap(this).getDefaultCorsPreflightOptions()?.let(CorsOptions::wrap)

    override fun defaultIntegration(): Integration? =
        unwrap(this).getDefaultIntegration()?.let(Integration::wrap)

    override fun defaultMethodOptions(): MethodOptions? =
        unwrap(this).getDefaultMethodOptions()?.let(MethodOptions::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ProxyResourceOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.ProxyResourceOptions):
        ProxyResourceOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ProxyResourceOptions):
        software.amazon.awscdk.services.apigateway.ProxyResourceOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.ProxyResourceOptions
  }
}
