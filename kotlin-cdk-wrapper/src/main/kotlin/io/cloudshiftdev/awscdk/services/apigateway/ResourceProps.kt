@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface ResourceProps : ResourceOptions {
  public fun parent(): IResource

  public fun pathPart(): String

  @CdkDslMarker
  public interface Builder {
    public fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("482451f25262f7cfac5648ca01c62c216c891bd185e6db0549df95ad525aff3a")
    public
        fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions.Builder.() -> Unit)

    public fun defaultIntegration(defaultIntegration: Integration)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3396b97f02ea8d0184c33c841e196f309f11bf5ee74fde65b2d9b6116d9b8341")
    public fun defaultIntegration(defaultIntegration: Integration.Builder.() -> Unit)

    public fun defaultMethodOptions(defaultMethodOptions: MethodOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("60206646a6bd4a3671d4af51ea26910ea3719d83b4de2d628a489efc6cf9c271")
    public fun defaultMethodOptions(defaultMethodOptions: MethodOptions.Builder.() -> Unit)

    public fun parent(parent: IResource)

    public fun pathPart(pathPart: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.ResourceProps.Builder =
        software.amazon.awscdk.services.apigateway.ResourceProps.builder()

    override fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions) {
      cdkBuilder.defaultCorsPreflightOptions(defaultCorsPreflightOptions.let(CorsOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("482451f25262f7cfac5648ca01c62c216c891bd185e6db0549df95ad525aff3a")
    override
        fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions.Builder.() -> Unit):
        Unit = defaultCorsPreflightOptions(CorsOptions(defaultCorsPreflightOptions))

    override fun defaultIntegration(defaultIntegration: Integration) {
      cdkBuilder.defaultIntegration(defaultIntegration.let(Integration::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3396b97f02ea8d0184c33c841e196f309f11bf5ee74fde65b2d9b6116d9b8341")
    override fun defaultIntegration(defaultIntegration: Integration.Builder.() -> Unit): Unit =
        defaultIntegration(Integration(defaultIntegration))

    override fun defaultMethodOptions(defaultMethodOptions: MethodOptions) {
      cdkBuilder.defaultMethodOptions(defaultMethodOptions.let(MethodOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("60206646a6bd4a3671d4af51ea26910ea3719d83b4de2d628a489efc6cf9c271")
    override fun defaultMethodOptions(defaultMethodOptions: MethodOptions.Builder.() -> Unit): Unit
        = defaultMethodOptions(MethodOptions(defaultMethodOptions))

    override fun parent(parent: IResource) {
      cdkBuilder.parent(parent.let(IResource::unwrap))
    }

    override fun pathPart(pathPart: String) {
      cdkBuilder.pathPart(pathPart)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.ResourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.ResourceProps,
  ) : CdkObject(cdkObject), ResourceProps {
    override fun defaultCorsPreflightOptions(): CorsOptions? =
        unwrap(this).getDefaultCorsPreflightOptions()?.let(CorsOptions::wrap)

    override fun defaultIntegration(): Integration? =
        unwrap(this).getDefaultIntegration()?.let(Integration::wrap)

    override fun defaultMethodOptions(): MethodOptions? =
        unwrap(this).getDefaultMethodOptions()?.let(MethodOptions::wrap)

    override fun parent(): IResource = unwrap(this).getParent().let(IResource::wrap)

    override fun pathPart(): String = unwrap(this).getPathPart()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ResourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.ResourceProps):
        ResourceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ResourceProps):
        software.amazon.awscdk.services.apigateway.ResourceProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.apigateway.ResourceProps
  }
}