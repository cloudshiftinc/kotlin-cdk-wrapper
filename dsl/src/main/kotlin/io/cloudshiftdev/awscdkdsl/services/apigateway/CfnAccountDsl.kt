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

package io.cloudshiftdev.awscdkdsl.services.apigateway

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apigateway.CfnAccount
import software.constructs.Construct

/**
 * The `AWS::ApiGateway::Account` resource specifies the IAM role that Amazon API Gateway uses to
 * write API logs to Amazon CloudWatch Logs.
 *
 * To avoid overwriting other roles, you should only have one `AWS::ApiGateway::Account` resource
 * per region per account.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigateway.*;
 * CfnAccount cfnAccount = CfnAccount.Builder.create(this, "MyCfnAccount")
 * .cloudWatchRoleArn("cloudWatchRoleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-account.html)
 */
@CdkDslMarker
public class CfnAccountDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnAccount.Builder = CfnAccount.Builder.create(scope, id)

    /**
     * The ARN of an Amazon CloudWatch role for the current Account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-account.html#cfn-apigateway-account-cloudwatchrolearn)
     *
     * @param cloudWatchRoleArn The ARN of an Amazon CloudWatch role for the current Account.
     */
    public fun cloudWatchRoleArn(cloudWatchRoleArn: String) {
        cdkBuilder.cloudWatchRoleArn(cloudWatchRoleArn)
    }

    public fun build(): CfnAccount = cdkBuilder.build()
}
