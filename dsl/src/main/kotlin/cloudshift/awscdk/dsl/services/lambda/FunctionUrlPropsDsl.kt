@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.services.lambda.FunctionUrlAuthType
import software.amazon.awscdk.services.lambda.FunctionUrlCorsOptions
import software.amazon.awscdk.services.lambda.FunctionUrlProps
import software.amazon.awscdk.services.lambda.IFunction
import software.amazon.awscdk.services.lambda.InvokeMode

/**
 * Properties for a FunctionUrl.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.lambda.*;
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
@CdkDslMarker
public class FunctionUrlPropsDsl {
    private val cdkBuilder: FunctionUrlProps.Builder = FunctionUrlProps.builder()

    /** @param authType The type of authentication that your function URL uses. */
    public fun authType(authType: FunctionUrlAuthType) {
        cdkBuilder.authType(authType)
    }

    /** @param cors The cross-origin resource sharing (CORS) settings for your function URL. */
    public fun cors(cors: FunctionUrlCorsOptionsDsl.() -> Unit = {}) {
        val builder = FunctionUrlCorsOptionsDsl()
        builder.apply(cors)
        cdkBuilder.cors(builder.build())
    }

    /** @param cors The cross-origin resource sharing (CORS) settings for your function URL. */
    public fun cors(cors: FunctionUrlCorsOptions) {
        cdkBuilder.cors(cors)
    }

    /**
     * @param function The function to which this url refers. It can also be an `Alias` but not a
     *   `Version`.
     */
    public fun function(function: IFunction) {
        cdkBuilder.function(function)
    }

    /** @param invokeMode The type of invocation mode that your Lambda function uses. */
    public fun invokeMode(invokeMode: InvokeMode) {
        cdkBuilder.invokeMode(invokeMode)
    }

    public fun build(): FunctionUrlProps = cdkBuilder.build()
}
