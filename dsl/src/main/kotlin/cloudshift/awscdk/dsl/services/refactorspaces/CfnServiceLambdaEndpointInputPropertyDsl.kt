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

package cloudshift.awscdk.dsl.services.refactorspaces

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.refactorspaces.CfnService

/**
 * The input for the AWS Lambda endpoint type.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.refactorspaces.*;
 * LambdaEndpointInputProperty lambdaEndpointInputProperty = LambdaEndpointInputProperty.builder()
 * .arn("arn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-refactorspaces-service-lambdaendpointinput.html)
 */
@CdkDslMarker
public class CfnServiceLambdaEndpointInputPropertyDsl {
    private val cdkBuilder: CfnService.LambdaEndpointInputProperty.Builder =
        CfnService.LambdaEndpointInputProperty.builder()

    /** @param arn The Amazon Resource Name (ARN) of the Lambda function or alias. */
    public fun arn(arn: String) {
        cdkBuilder.arn(arn)
    }

    public fun build(): CfnService.LambdaEndpointInputProperty = cdkBuilder.build()
}
