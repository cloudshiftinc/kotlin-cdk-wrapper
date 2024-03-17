@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Options to add a url to a Lambda function.
 *
 * Example:
 *
 * ```
 * // Can be a Function or an Alias
 * Function fn;
 * FunctionUrl fnUrl = fn.addFunctionUrl(FunctionUrlOptions.builder()
 * .authType(FunctionUrlAuthType.NONE)
 * .build());
 * CfnOutput.Builder.create(this, "TheUrl")
 * .value(fnUrl.getUrl())
 * .build();
 * ```
 */
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.FunctionUrlOptions,
  ) : CdkObject(cdkObject), FunctionUrlOptions {
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
    public operator fun invoke(block: Builder.() -> Unit = {}): FunctionUrlOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.FunctionUrlOptions):
        FunctionUrlOptions = CdkObjectWrappers.wrap(cdkObject) as? FunctionUrlOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: FunctionUrlOptions):
        software.amazon.awscdk.services.lambda.FunctionUrlOptions = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.lambda.FunctionUrlOptions
  }
}
