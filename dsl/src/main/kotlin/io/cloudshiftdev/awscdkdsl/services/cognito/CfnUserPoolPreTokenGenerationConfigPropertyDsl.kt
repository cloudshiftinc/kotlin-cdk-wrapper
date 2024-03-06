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

package io.cloudshiftdev.awscdkdsl.services.cognito

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cognito.CfnUserPool

/**
 * The properties of a pre token generation Lambda trigger.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cognito.*;
 * PreTokenGenerationConfigProperty preTokenGenerationConfigProperty =
 * PreTokenGenerationConfigProperty.builder()
 * .lambdaArn("lambdaArn")
 * .lambdaVersion("lambdaVersion")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-pretokengenerationconfig.html)
 */
@CdkDslMarker
public class CfnUserPoolPreTokenGenerationConfigPropertyDsl {
    private val cdkBuilder: CfnUserPool.PreTokenGenerationConfigProperty.Builder =
        CfnUserPool.PreTokenGenerationConfigProperty.builder()

    /**
     * @param lambdaArn The Amazon Resource Name (ARN) of the function that you want to assign to
     *   your Lambda trigger. This parameter and the `PreTokenGeneration` property of `LambdaConfig`
     *   have the same value. For new instances of pre token generation triggers, set `LambdaArn` .
     */
    public fun lambdaArn(lambdaArn: String) {
        cdkBuilder.lambdaArn(lambdaArn)
    }

    /**
     * @param lambdaVersion The user pool trigger version of the request that Amazon Cognito sends
     *   to your Lambda function. Higher-numbered versions add fields that support new features.
     */
    public fun lambdaVersion(lambdaVersion: String) {
        cdkBuilder.lambdaVersion(lambdaVersion)
    }

    public fun build(): CfnUserPool.PreTokenGenerationConfigProperty = cdkBuilder.build()
}
