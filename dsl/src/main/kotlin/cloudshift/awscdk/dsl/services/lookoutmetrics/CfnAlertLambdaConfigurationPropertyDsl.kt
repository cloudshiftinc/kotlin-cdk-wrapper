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

package cloudshift.awscdk.dsl.services.lookoutmetrics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lookoutmetrics.CfnAlert

/**
 * Contains information about a Lambda configuration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lookoutmetrics.*;
 * LambdaConfigurationProperty lambdaConfigurationProperty = LambdaConfigurationProperty.builder()
 * .lambdaArn("lambdaArn")
 * .roleArn("roleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-alert-lambdaconfiguration.html)
 */
@CdkDslMarker
public class CfnAlertLambdaConfigurationPropertyDsl {
    private val cdkBuilder: CfnAlert.LambdaConfigurationProperty.Builder =
        CfnAlert.LambdaConfigurationProperty.builder()

    /** @param lambdaArn The ARN of the Lambda function. */
    public fun lambdaArn(lambdaArn: String) {
        cdkBuilder.lambdaArn(lambdaArn)
    }

    /** @param roleArn The ARN of an IAM role that has permission to invoke the Lambda function. */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnAlert.LambdaConfigurationProperty = cdkBuilder.build()
}
