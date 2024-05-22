@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Defines a Lambda function url.
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
public open class FunctionUrl(
  cdkObject: software.amazon.awscdk.services.lambda.FunctionUrl,
) : Resource(cdkObject), IFunctionUrl {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: FunctionUrlProps,
  ) :
      this(software.amazon.awscdk.services.lambda.FunctionUrl(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(FunctionUrlProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: FunctionUrlProps.Builder.() -> Unit,
  ) : this(scope, id, FunctionUrlProps(props)
  )

  /**
   * The ARN of the function this URL refers to.
   */
  public override fun functionArn(): String = unwrap(this).getFunctionArn()

  /**
   * Grant the given identity permissions to invoke this Lambda Function URL.
   *
   * @param grantee 
   */
  public override fun grantInvokeUrl(grantee: IGrantable): Grant =
      unwrap(this).grantInvokeUrl(grantee.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

  /**
   * The url of the Lambda function.
   */
  public override fun url(): String = unwrap(this).getUrl()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.lambda.FunctionUrl].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The type of authentication that your function URL uses.
     *
     * Default: FunctionUrlAuthType.AWS_IAM
     *
     * @param authType The type of authentication that your function URL uses. 
     */
    public fun authType(authType: FunctionUrlAuthType)

    /**
     * The cross-origin resource sharing (CORS) settings for your function URL.
     *
     * Default: - No CORS configuration.
     *
     * @param cors The cross-origin resource sharing (CORS) settings for your function URL. 
     */
    public fun cors(cors: FunctionUrlCorsOptions)

    /**
     * The cross-origin resource sharing (CORS) settings for your function URL.
     *
     * Default: - No CORS configuration.
     *
     * @param cors The cross-origin resource sharing (CORS) settings for your function URL. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1275251e5ca38e8a5c47388fd0491e845d1fee149206164025cf21e3d7bc17a6")
    public fun cors(cors: FunctionUrlCorsOptions.Builder.() -> Unit)

    /**
     * The function to which this url refers.
     *
     * It can also be an `Alias` but not a `Version`.
     *
     * @param function The function to which this url refers. 
     */
    public fun function(function: IFunction)

    /**
     * The type of invocation mode that your Lambda function uses.
     *
     * Default: InvokeMode.BUFFERED
     *
     * @param invokeMode The type of invocation mode that your Lambda function uses. 
     */
    public fun invokeMode(invokeMode: InvokeMode)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.FunctionUrl.Builder =
        software.amazon.awscdk.services.lambda.FunctionUrl.Builder.create(scope, id)

    /**
     * The type of authentication that your function URL uses.
     *
     * Default: FunctionUrlAuthType.AWS_IAM
     *
     * @param authType The type of authentication that your function URL uses. 
     */
    override fun authType(authType: FunctionUrlAuthType) {
      cdkBuilder.authType(authType.let(FunctionUrlAuthType.Companion::unwrap))
    }

    /**
     * The cross-origin resource sharing (CORS) settings for your function URL.
     *
     * Default: - No CORS configuration.
     *
     * @param cors The cross-origin resource sharing (CORS) settings for your function URL. 
     */
    override fun cors(cors: FunctionUrlCorsOptions) {
      cdkBuilder.cors(cors.let(FunctionUrlCorsOptions.Companion::unwrap))
    }

    /**
     * The cross-origin resource sharing (CORS) settings for your function URL.
     *
     * Default: - No CORS configuration.
     *
     * @param cors The cross-origin resource sharing (CORS) settings for your function URL. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1275251e5ca38e8a5c47388fd0491e845d1fee149206164025cf21e3d7bc17a6")
    override fun cors(cors: FunctionUrlCorsOptions.Builder.() -> Unit): Unit =
        cors(FunctionUrlCorsOptions(cors))

    /**
     * The function to which this url refers.
     *
     * It can also be an `Alias` but not a `Version`.
     *
     * @param function The function to which this url refers. 
     */
    override fun function(function: IFunction) {
      cdkBuilder.function(function.let(IFunction.Companion::unwrap))
    }

    /**
     * The type of invocation mode that your Lambda function uses.
     *
     * Default: InvokeMode.BUFFERED
     *
     * @param invokeMode The type of invocation mode that your Lambda function uses. 
     */
    override fun invokeMode(invokeMode: InvokeMode) {
      cdkBuilder.invokeMode(invokeMode.let(InvokeMode.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.lambda.FunctionUrl = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): FunctionUrl {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return FunctionUrl(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.FunctionUrl): FunctionUrl =
        FunctionUrl(cdkObject)

    internal fun unwrap(wrapped: FunctionUrl): software.amazon.awscdk.services.lambda.FunctionUrl =
        wrapped.cdkObject as software.amazon.awscdk.services.lambda.FunctionUrl
  }
}
