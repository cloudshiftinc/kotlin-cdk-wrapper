@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for a FunctionUrl.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * Function function_;
 * FunctionUrlProps functionUrlProps = FunctionUrlProps.builder()
 * .function(function_)
 * // the properties below are optional
 * .authType(FunctionUrlAuthType.AWS_IAM)
 * .cors(FunctionUrlCorsOptions.builder()
 * .allowCredentials(false)
 * .allowedHeaders(List.of("allowedHeaders"))
 * .allowedMethods(List.of(HttpMethod.GET))
 * .allowedOrigins(List.of("allowedOrigins"))
 * .exposedHeaders(List.of("exposedHeaders"))
 * .maxAge(Duration.minutes(30))
 * .build())
 * .invokeMode(InvokeMode.BUFFERED)
 * .build();
 * ```
 */
public interface FunctionUrlProps : FunctionUrlOptions {
  /**
   * The function to which this url refers.
   *
   * It can also be an `Alias` but not a `Version`.
   */
  public fun function(): IFunction

  /**
   * A builder for [FunctionUrlProps]
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
    @JvmName("7fc346e59d2b44f31aee7980c9583d0d75487cccf4c2004e432fb42b59428474")
    public fun cors(cors: FunctionUrlCorsOptions.Builder.() -> Unit)

    /**
     * @param function The function to which this url refers. 
     * It can also be an `Alias` but not a `Version`.
     */
    public fun function(function: IFunction)

    /**
     * @param invokeMode The type of invocation mode that your Lambda function uses.
     */
    public fun invokeMode(invokeMode: InvokeMode)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.FunctionUrlProps.Builder =
        software.amazon.awscdk.services.lambda.FunctionUrlProps.builder()

    /**
     * @param authType The type of authentication that your function URL uses.
     */
    override fun authType(authType: FunctionUrlAuthType) {
      cdkBuilder.authType(authType.let(FunctionUrlAuthType.Companion::unwrap))
    }

    /**
     * @param cors The cross-origin resource sharing (CORS) settings for your function URL.
     */
    override fun cors(cors: FunctionUrlCorsOptions) {
      cdkBuilder.cors(cors.let(FunctionUrlCorsOptions.Companion::unwrap))
    }

    /**
     * @param cors The cross-origin resource sharing (CORS) settings for your function URL.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7fc346e59d2b44f31aee7980c9583d0d75487cccf4c2004e432fb42b59428474")
    override fun cors(cors: FunctionUrlCorsOptions.Builder.() -> Unit): Unit =
        cors(FunctionUrlCorsOptions(cors))

    /**
     * @param function The function to which this url refers. 
     * It can also be an `Alias` but not a `Version`.
     */
    override fun function(function: IFunction) {
      cdkBuilder.function(function.let(IFunction.Companion::unwrap))
    }

    /**
     * @param invokeMode The type of invocation mode that your Lambda function uses.
     */
    override fun invokeMode(invokeMode: InvokeMode) {
      cdkBuilder.invokeMode(invokeMode.let(InvokeMode.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.lambda.FunctionUrlProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.lambda.FunctionUrlProps,
  ) : CdkObject(cdkObject),
      FunctionUrlProps {
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
     * The function to which this url refers.
     *
     * It can also be an `Alias` but not a `Version`.
     */
    override fun function(): IFunction = unwrap(this).getFunction().let(IFunction::wrap)

    /**
     * The type of invocation mode that your Lambda function uses.
     *
     * Default: InvokeMode.BUFFERED
     */
    override fun invokeMode(): InvokeMode? = unwrap(this).getInvokeMode()?.let(InvokeMode::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FunctionUrlProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.FunctionUrlProps):
        FunctionUrlProps = CdkObjectWrappers.wrap(cdkObject) as? FunctionUrlProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: FunctionUrlProps):
        software.amazon.awscdk.services.lambda.FunctionUrlProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.lambda.FunctionUrlProps
  }
}
