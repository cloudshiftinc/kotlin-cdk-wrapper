package io.cloudshiftdev.awscdk.services.apigateway

import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface ResourceOptions {
  public fun defaultCorsPreflightOptions(): CorsOptions? =
      unwrap(this).getDefaultCorsPreflightOptions()?.let(CorsOptions::wrap)

  public fun defaultIntegration(): Integration? =
      unwrap(this).getDefaultIntegration()?.let(Integration::wrap)

  public fun defaultMethodOptions(): MethodOptions? =
      unwrap(this).getDefaultMethodOptions()?.let(MethodOptions::wrap)

  public interface Builder {
    public fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("88f3885d7453d7fd0ea3579159b3ea02d7b9742425b496f79080a3e768736e3a")
    public
        fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions.Builder.() -> Unit)

    public fun defaultIntegration(defaultIntegration: Integration)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1a7bf78ab48f2267d93eae73f9a1e12954cb5b4e2ce073a6001f9e184e12156d")
    public fun defaultIntegration(defaultIntegration: Integration.Builder.() -> Unit)

    public fun defaultMethodOptions(defaultMethodOptions: MethodOptions)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7dc0b133223007d5d53df6d4cdbce08a01190ca0aede2e5aaa589b0079b88599")
    public fun defaultMethodOptions(defaultMethodOptions: MethodOptions.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.ResourceOptions.Builder =
        software.amazon.awscdk.services.apigateway.ResourceOptions.builder()

    override fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions) {
      cdkBuilder.defaultCorsPreflightOptions(defaultCorsPreflightOptions.let(CorsOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("88f3885d7453d7fd0ea3579159b3ea02d7b9742425b496f79080a3e768736e3a")
    override
        fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions.Builder.() -> Unit):
        Unit = defaultCorsPreflightOptions(CorsOptions(defaultCorsPreflightOptions))

    override fun defaultIntegration(defaultIntegration: Integration) {
      cdkBuilder.defaultIntegration(defaultIntegration.let(Integration::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1a7bf78ab48f2267d93eae73f9a1e12954cb5b4e2ce073a6001f9e184e12156d")
    override fun defaultIntegration(defaultIntegration: Integration.Builder.() -> Unit): Unit =
        defaultIntegration(Integration(defaultIntegration))

    override fun defaultMethodOptions(defaultMethodOptions: MethodOptions) {
      cdkBuilder.defaultMethodOptions(defaultMethodOptions.let(MethodOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7dc0b133223007d5d53df6d4cdbce08a01190ca0aede2e5aaa589b0079b88599")
    override fun defaultMethodOptions(defaultMethodOptions: MethodOptions.Builder.() -> Unit): Unit
        = defaultMethodOptions(MethodOptions(defaultMethodOptions))

    public fun build(): software.amazon.awscdk.services.apigateway.ResourceOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigateway.ResourceOptions,
  ) : ResourceOptions {
    override fun defaultCorsPreflightOptions(): CorsOptions? =
        unwrap(this).getDefaultCorsPreflightOptions()?.let(CorsOptions::wrap)

    override fun defaultIntegration(): Integration? =
        unwrap(this).getDefaultIntegration()?.let(Integration::wrap)

    override fun defaultMethodOptions(): MethodOptions? =
        unwrap(this).getDefaultMethodOptions()?.let(MethodOptions::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ResourceOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.ResourceOptions):
        ResourceOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ResourceOptions):
        software.amazon.awscdk.services.apigateway.ResourceOptions = (wrapped as Wrapper).cdkObject
  }
}
