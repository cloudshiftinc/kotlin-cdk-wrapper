@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit
import kotlin.jvm.JvmName

public interface FunctionUrlProps : FunctionUrlOptions {
  public fun function(): IFunction

  @CdkDslMarker
  public interface Builder {
    public fun authType(authType: FunctionUrlAuthType)

    public fun cors(cors: FunctionUrlCorsOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7fc346e59d2b44f31aee7980c9583d0d75487cccf4c2004e432fb42b59428474")
    public fun cors(cors: FunctionUrlCorsOptions.Builder.() -> Unit)

    public fun function(function: IFunction)

    public fun invokeMode(invokeMode: InvokeMode)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.FunctionUrlProps.Builder =
        software.amazon.awscdk.services.lambda.FunctionUrlProps.builder()

    override fun authType(authType: FunctionUrlAuthType) {
      cdkBuilder.authType(authType.let(FunctionUrlAuthType::unwrap))
    }

    override fun cors(cors: FunctionUrlCorsOptions) {
      cdkBuilder.cors(cors.let(FunctionUrlCorsOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7fc346e59d2b44f31aee7980c9583d0d75487cccf4c2004e432fb42b59428474")
    override fun cors(cors: FunctionUrlCorsOptions.Builder.() -> Unit): Unit =
        cors(FunctionUrlCorsOptions(cors))

    override fun function(function: IFunction) {
      cdkBuilder.function(function.let(IFunction::unwrap))
    }

    override fun invokeMode(invokeMode: InvokeMode) {
      cdkBuilder.invokeMode(invokeMode.let(InvokeMode::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.lambda.FunctionUrlProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.FunctionUrlProps,
  ) : CdkObject(cdkObject), FunctionUrlProps {
    override fun authType(): FunctionUrlAuthType? =
        unwrap(this).getAuthType()?.let(FunctionUrlAuthType::wrap)

    override fun cors(): FunctionUrlCorsOptions? =
        unwrap(this).getCors()?.let(FunctionUrlCorsOptions::wrap)

    override fun function(): IFunction = unwrap(this).getFunction().let(IFunction::wrap)

    override fun invokeMode(): InvokeMode? = unwrap(this).getInvokeMode()?.let(InvokeMode::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FunctionUrlProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.FunctionUrlProps):
        FunctionUrlProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: FunctionUrlProps):
        software.amazon.awscdk.services.lambda.FunctionUrlProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.lambda.FunctionUrlProps
  }
}
