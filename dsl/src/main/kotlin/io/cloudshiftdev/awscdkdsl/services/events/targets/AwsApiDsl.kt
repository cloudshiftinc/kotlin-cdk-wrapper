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

package io.cloudshiftdev.awscdkdsl.services.events.targets

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import io.cloudshiftdev.awscdkdsl.services.iam.PolicyStatementDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.events.targets.AwsApi
import software.amazon.awscdk.services.iam.PolicyStatement

/**
 * Use an AWS Lambda function that makes API calls as an event rule target.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.events.targets.*;
 * import software.amazon.awscdk.services.iam.*;
 * Object parameters;
 * PolicyStatement policyStatement;
 * AwsApi awsApi = AwsApi.Builder.create()
 * .action("action")
 * .service("service")
 * // the properties below are optional
 * .apiVersion("apiVersion")
 * .catchErrorPattern("catchErrorPattern")
 * .parameters(parameters)
 * .policyStatement(policyStatement)
 * .build();
 * ```
 */
@CdkDslMarker
public class AwsApiDsl {
    private val cdkBuilder: AwsApi.Builder = AwsApi.Builder.create()

    /**
     * The service action to call.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSJavaScriptSDK/latest/index.html)
     *
     * @param action The service action to call.
     */
    public fun action(action: String) {
        cdkBuilder.action(action)
    }

    /**
     * API version to use for the service.
     *
     * Default: - use latest available API version
     *
     * [Documentation](https://docs.aws.amazon.com/sdk-for-javascript/v2/developer-guide/locking-api-versions.html)
     *
     * @param apiVersion API version to use for the service.
     */
    public fun apiVersion(apiVersion: String) {
        cdkBuilder.apiVersion(apiVersion)
    }

    /**
     * The regex pattern to use to catch API errors.
     *
     * The `code` property of the `Error` object will be tested against this pattern. If there is a
     * match an error will not be thrown.
     *
     * Default: - do not catch errors
     *
     * @param catchErrorPattern The regex pattern to use to catch API errors.
     */
    public fun catchErrorPattern(catchErrorPattern: String) {
        cdkBuilder.catchErrorPattern(catchErrorPattern)
    }

    /**
     * The parameters for the service action.
     *
     * Default: - no parameters
     *
     * [Documentation](https://docs.aws.amazon.com/AWSJavaScriptSDK/latest/index.html)
     *
     * @param parameters The parameters for the service action.
     */
    public fun parameters(parameters: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(parameters)
        cdkBuilder.parameters(builder.map)
    }

    /**
     * The parameters for the service action.
     *
     * Default: - no parameters
     *
     * [Documentation](https://docs.aws.amazon.com/AWSJavaScriptSDK/latest/index.html)
     *
     * @param parameters The parameters for the service action.
     */
    public fun parameters(parameters: Any) {
        cdkBuilder.parameters(parameters)
    }

    /**
     * The IAM policy statement to allow the API call.
     *
     * Use only if resource restriction is needed.
     *
     * Default: - extract the permission from the API call
     *
     * @param policyStatement The IAM policy statement to allow the API call.
     */
    public fun policyStatement(policyStatement: PolicyStatementDsl.() -> Unit = {}) {
        val builder = PolicyStatementDsl()
        builder.apply(policyStatement)
        cdkBuilder.policyStatement(builder.build())
    }

    /**
     * The IAM policy statement to allow the API call.
     *
     * Use only if resource restriction is needed.
     *
     * Default: - extract the permission from the API call
     *
     * @param policyStatement The IAM policy statement to allow the API call.
     */
    public fun policyStatement(policyStatement: PolicyStatement) {
        cdkBuilder.policyStatement(policyStatement)
    }

    /**
     * The service to call.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSJavaScriptSDK/latest/index.html)
     *
     * @param service The service to call.
     */
    public fun service(service: String) {
        cdkBuilder.service(service)
    }

    public fun build(): AwsApi = cdkBuilder.build()
}
