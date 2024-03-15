@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface MethodProps {
  public fun httpMethod(): String

  public fun integration(): Integration? = unwrap(this).getIntegration()?.let(Integration::wrap)

  public fun options(): MethodOptions? = unwrap(this).getOptions()?.let(MethodOptions::wrap)

  public fun resource(): IResource

  @CdkDslMarker
  public interface Builder {
    public fun httpMethod(httpMethod: String)

    public fun integration(integration: Integration)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b5108ff710e19a195cb56f29d5def6664d839cf58232826a03a4dd5c6235375f")
    public fun integration(integration: Integration.Builder.() -> Unit)

    public fun options(options: MethodOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f8ad60445e59bcbb249426551bb34a748c2c01b2d61c9646fc47fad69913633d")
    public fun options(options: MethodOptions.Builder.() -> Unit)

    public fun resource(resource: IResource)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.MethodProps.Builder =
        software.amazon.awscdk.services.apigateway.MethodProps.builder()

    override fun httpMethod(httpMethod: String) {
      cdkBuilder.httpMethod(httpMethod)
    }

    override fun integration(integration: Integration) {
      cdkBuilder.integration(integration.let(Integration::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b5108ff710e19a195cb56f29d5def6664d839cf58232826a03a4dd5c6235375f")
    override fun integration(integration: Integration.Builder.() -> Unit): Unit =
        integration(Integration(integration))

    override fun options(options: MethodOptions) {
      cdkBuilder.options(options.let(MethodOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f8ad60445e59bcbb249426551bb34a748c2c01b2d61c9646fc47fad69913633d")
    override fun options(options: MethodOptions.Builder.() -> Unit): Unit =
        options(MethodOptions(options))

    override fun resource(resource: IResource) {
      cdkBuilder.resource(resource.let(IResource::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigateway.MethodProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.MethodProps,
  ) : CdkObject(cdkObject), MethodProps {
    override fun httpMethod(): String = unwrap(this).getHttpMethod()

    override fun integration(): Integration? = unwrap(this).getIntegration()?.let(Integration::wrap)

    override fun options(): MethodOptions? = unwrap(this).getOptions()?.let(MethodOptions::wrap)

    override fun resource(): IResource = unwrap(this).getResource().let(IResource::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MethodProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.MethodProps):
        MethodProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: MethodProps):
        software.amazon.awscdk.services.apigateway.MethodProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.apigateway.MethodProps
  }
}
