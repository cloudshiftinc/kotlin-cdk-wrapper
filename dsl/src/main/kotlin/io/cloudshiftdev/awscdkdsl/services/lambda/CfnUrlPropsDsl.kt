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
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lambda.CfnUrl
import software.amazon.awscdk.services.lambda.CfnUrlProps

/**
 * Properties for defining a `CfnUrl`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lambda.*;
 * CfnUrlProps cfnUrlProps = CfnUrlProps.builder()
 * .authType("authType")
 * .targetFunctionArn("targetFunctionArn")
 * // the properties below are optional
 * .cors(CorsProperty.builder()
 * .allowCredentials(false)
 * .allowHeaders(List.of("allowHeaders"))
 * .allowMethods(List.of("allowMethods"))
 * .allowOrigins(List.of("allowOrigins"))
 * .exposeHeaders(List.of("exposeHeaders"))
 * .maxAge(123)
 * .build())
 * .invokeMode("invokeMode")
 * .qualifier("qualifier")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-url.html)
 */
@CdkDslMarker
public class CfnUrlPropsDsl {
    private val cdkBuilder: CfnUrlProps.Builder = CfnUrlProps.builder()

    /**
     * @param authType The type of authentication that your function URL uses. Set to `AWS_IAM` if
     *   you want to restrict access to authenticated users only. Set to `NONE` if you want to
     *   bypass IAM authentication to create a public endpoint. For more information, see
     *   [Security and auth model for Lambda function URLs](https://docs.aws.amazon.com/lambda/latest/dg/urls-auth.html)
     *   .
     */
    public fun authType(authType: String) {
        cdkBuilder.authType(authType)
    }

    /**
     * @param cors The
     *   [Cross-Origin Resource Sharing (CORS)](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS)
     *   settings for your function URL.
     */
    public fun cors(cors: IResolvable) {
        cdkBuilder.cors(cors)
    }

    /**
     * @param cors The
     *   [Cross-Origin Resource Sharing (CORS)](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS)
     *   settings for your function URL.
     */
    public fun cors(cors: CfnUrl.CorsProperty) {
        cdkBuilder.cors(cors)
    }

    /**
     * @param invokeMode Use one of the following options:.
     * * `BUFFERED` – This is the default option. Lambda invokes your function using the `Invoke`
     *   API operation. Invocation results are available when the payload is complete. The maximum
     *   payload size is 6 MB.
     * * `RESPONSE_STREAM` – Your function streams payload results as they become available. Lambda
     *   invokes your function using the `InvokeWithResponseStream` API operation. The maximum
     *   response payload size is 20 MB, however, you can
     *   [request a quota increase](https://docs.aws.amazon.com/servicequotas/latest/userguide/request-quota-increase.html)
     *   .
     */
    public fun invokeMode(invokeMode: String) {
        cdkBuilder.invokeMode(invokeMode)
    }

    /** @param qualifier The alias name. */
    public fun qualifier(qualifier: String) {
        cdkBuilder.qualifier(qualifier)
    }

    /**
     * @param targetFunctionArn The name of the Lambda function. **Name formats** - *Function
     *   name* - `my-function` .
     * * *Function ARN* - `arn:aws:lambda:us-west-2:123456789012:function:my-function` .
     * * *Partial ARN* - `123456789012:function:my-function` .
     *
     * The length constraint applies only to the full ARN. If you specify only the function name, it
     * is limited to 64 characters in length.
     */
    public fun targetFunctionArn(targetFunctionArn: String) {
        cdkBuilder.targetFunctionArn(targetFunctionArn)
    }

    public fun build(): CfnUrlProps = cdkBuilder.build()
}
