package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface FunctionUrlOptions {
  /**
   * The type of authentication that your function URL uses.
   *
   * Default: FunctionUrlAuthType.AWS_IAM
   */
  public fun authType(): FunctionUrlAuthType? =
      unwrap(this).getAuthType()?.let(FunctionUrlAuthType::wrap)

  /**
   * The cross-origin resource sharing (CORS) settings for your function URL.
   *
   * Default: - No CORS configuration.
   */
  public fun cors(): FunctionUrlCorsOptions? =
      unwrap(this).getCors()?.let(FunctionUrlCorsOptions::wrap)

  /**
   * The type of invocation mode that your Lambda function uses.
   *
   * Default: InvokeMode.BUFFERED
   */
  public fun invokeMode(): InvokeMode? = unwrap(this).getInvokeMode()?.let(InvokeMode::wrap)

  /**
   * A builder for [FunctionUrlOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param authType The type of authentication that your function URL uses.
     */
    public fun authType(authType: FunctionUrlAuthType)

    /**
     * @param cors The cross-origin resource sharing (CORS) settings for your function URL.
     */
    public fun cors(cors: FunctionUrlCorsOptions)

    /**
     * @param cors The cross-origin resource sharing (CORS) settings for your function URL.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4883d6eb36bdf679c06aa88778c5bd16745954a43799b6506dff8b528b6a4d59")
    public fun cors(cors: FunctionUrlCorsOptions.Builder.() -> Unit)

    /**
     * @param invokeMode The type of invocation mode that your Lambda function uses.
     */
    public fun invokeMode(invokeMode: InvokeMode)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.FunctionUrlOptions.Builder =
        software.amazon.awscdk.services.lambda.FunctionUrlOptions.builder()

    /**
     * @param authType The type of authentication that your function URL uses.
     */
    override fun authType(authType: FunctionUrlAuthType) {
      cdkBuilder.authType(authType.let(FunctionUrlAuthType::unwrap))
    }

    /**
     * @param cors The cross-origin resource sharing (CORS) settings for your function URL.
     */
    override fun cors(cors: FunctionUrlCorsOptions) {
      cdkBuilder.cors(cors.let(FunctionUrlCorsOptions::unwrap))
    }

    /**
     * @param cors The cross-origin resource sharing (CORS) settings for your function URL.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4883d6eb36bdf679c06aa88778c5bd16745954a43799b6506dff8b528b6a4d59")
    override fun cors(cors: FunctionUrlCorsOptions.Builder.() -> Unit): Unit =
        cors(FunctionUrlCorsOptions(cors))

    /**
     * @param invokeMode The type of invocation mode that your Lambda function uses.
     */
    override fun invokeMode(invokeMode: InvokeMode) {
      cdkBuilder.invokeMode(invokeMode.let(InvokeMode::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.lambda.FunctionUrlOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.lambda.FunctionUrlOptions,
  ) : FunctionUrlOptions {
    /**
     * The type of authentication that your function URL uses.
     *
     * Default: FunctionUrlAuthType.AWS_IAM
     */
    override fun authType(): FunctionUrlAuthType? =
        unwrap(this).getAuthType()?.let(FunctionUrlAuthType::wrap)

    /**
     * The cross-origin resource sharing (CORS) settings for your function URL.
     *
     * Default: - No CORS configuration.
     */
    override fun cors(): FunctionUrlCorsOptions? =
        unwrap(this).getCors()?.let(FunctionUrlCorsOptions::wrap)

    /**
     * The type of invocation mode that your Lambda function uses.
     *
     * Default: InvokeMode.BUFFERED
     */
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
