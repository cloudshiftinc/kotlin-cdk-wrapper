package io.cloudshiftdev.awscdk.services.lambda

import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface FunctionUrlOptions {
  public fun authType(): FunctionUrlAuthType? =
      unwrap(this).getAuthType()?.let(FunctionUrlAuthType::wrap)

  public fun cors(): FunctionUrlCorsOptions? =
      unwrap(this).getCors()?.let(FunctionUrlCorsOptions::wrap)

  public fun invokeMode(): InvokeMode? = unwrap(this).getInvokeMode()?.let(InvokeMode::wrap)

  public interface Builder {
    public fun authType(authType: FunctionUrlAuthType)

    public fun cors(cors: FunctionUrlCorsOptions)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4883d6eb36bdf679c06aa88778c5bd16745954a43799b6506dff8b528b6a4d59")
    public fun cors(cors: FunctionUrlCorsOptions.Builder.() -> Unit)

    public fun invokeMode(invokeMode: InvokeMode)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.FunctionUrlOptions.Builder =
        software.amazon.awscdk.services.lambda.FunctionUrlOptions.builder()

    override fun authType(authType: FunctionUrlAuthType) {
      cdkBuilder.authType(authType.let(FunctionUrlAuthType::unwrap))
    }

    override fun cors(cors: FunctionUrlCorsOptions) {
      cdkBuilder.cors(cors.let(FunctionUrlCorsOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4883d6eb36bdf679c06aa88778c5bd16745954a43799b6506dff8b528b6a4d59")
    override fun cors(cors: FunctionUrlCorsOptions.Builder.() -> Unit): Unit =
        cors(FunctionUrlCorsOptions(cors))

    override fun invokeMode(invokeMode: InvokeMode) {
      cdkBuilder.invokeMode(invokeMode.let(InvokeMode::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.lambda.FunctionUrlOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.lambda.FunctionUrlOptions,
  ) : FunctionUrlOptions {
    override fun authType(): FunctionUrlAuthType? =
        unwrap(this).getAuthType()?.let(FunctionUrlAuthType::wrap)

    override fun cors(): FunctionUrlCorsOptions? =
        unwrap(this).getCors()?.let(FunctionUrlCorsOptions::wrap)

    override fun invokeMode(): InvokeMode? = unwrap(this).getInvokeMode()?.let(InvokeMode::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): FunctionUrlOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.FunctionUrlOptions):
        FunctionUrlOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: FunctionUrlOptions):
        software.amazon.awscdk.services.lambda.FunctionUrlOptions = (wrapped as Wrapper).cdkObject
  }
}
