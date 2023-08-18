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

package io.cloudshiftdev.awscdkdsl.services.lambda

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.services.lambda.FunctionUrlAuthType
import software.amazon.awscdk.services.lambda.FunctionUrlCorsOptions
import software.amazon.awscdk.services.lambda.FunctionUrlOptions
import software.amazon.awscdk.services.lambda.InvokeMode

/**
 * Options to add a url to a Lambda function.
 *
 * Example:
 * ```
 * Function fn;
 * fn.addFunctionUrl(FunctionUrlOptions.builder()
 * .authType(FunctionUrlAuthType.NONE)
 * .invokeMode(InvokeMode.RESPONSE_STREAM)
 * .build());
 * ```
 */
@CdkDslMarker
public class FunctionUrlOptionsDsl {
    private val cdkBuilder: FunctionUrlOptions.Builder = FunctionUrlOptions.builder()

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

    /** @param invokeMode The type of invocation mode that your Lambda function uses. */
    public fun invokeMode(invokeMode: InvokeMode) {
        cdkBuilder.invokeMode(invokeMode)
    }

    public fun build(): FunctionUrlOptions = cdkBuilder.build()
}
