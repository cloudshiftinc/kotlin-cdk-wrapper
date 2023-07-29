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
import kotlin.String
import software.amazon.awscdk.services.lambda.CfnPermissionProps

/**
 * Properties for defining a `CfnPermission`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lambda.*;
 * CfnPermissionProps cfnPermissionProps = CfnPermissionProps.builder()
 * .action("action")
 * .functionName("functionName")
 * .principal("principal")
 * // the properties below are optional
 * .eventSourceToken("eventSourceToken")
 * .functionUrlAuthType("functionUrlAuthType")
 * .principalOrgId("principalOrgId")
 * .sourceAccount("sourceAccount")
 * .sourceArn("sourceArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html)
 */
@CdkDslMarker
public class CfnPermissionPropsDsl {
    private val cdkBuilder: CfnPermissionProps.Builder = CfnPermissionProps.builder()

    /**
     * @param action The action that the principal can use on the function. For example,
     *   `lambda:InvokeFunction` or `lambda:GetFunction` .
     */
    public fun action(action: String) {
        cdkBuilder.action(action)
    }

    /**
     * @param eventSourceToken For Alexa Smart Home functions, a token that the invoker must supply.
     */
    public fun eventSourceToken(eventSourceToken: String) {
        cdkBuilder.eventSourceToken(eventSourceToken)
    }

    /**
     * @param functionName The name of the Lambda function, version, or alias. **Name formats** -
     *   *Function name* – `my-function` (name-only), `my-function:v1` (with alias).
     * * *Function ARN* – `arn:aws:lambda:us-west-2:123456789012:function:my-function` .
     * * *Partial ARN* – `123456789012:function:my-function` .
     *
     * You can append a version number or alias to any of the formats. The length constraint applies
     * only to the full ARN. If you specify only the function name, it is limited to 64 characters
     * in length.
     */
    public fun functionName(functionName: String) {
        cdkBuilder.functionName(functionName)
    }

    /**
     * @param functionUrlAuthType The type of authentication that your function URL uses. Set to
     *   `AWS_IAM` if you want to restrict access to authenticated users only. Set to `NONE` if you
     *   want to bypass IAM authentication to create a public endpoint. For more information, see
     *   [Security and auth model for Lambda function URLs](https://docs.aws.amazon.com/lambda/latest/dg/urls-auth.html)
     *   .
     */
    public fun functionUrlAuthType(functionUrlAuthType: String) {
        cdkBuilder.functionUrlAuthType(functionUrlAuthType)
    }

    /**
     * @param principal The AWS service or AWS account that invokes the function. If you specify a
     *   service, use `SourceArn` or `SourceAccount` to limit who can invoke the function through
     *   that service.
     */
    public fun principal(principal: String) {
        cdkBuilder.principal(principal)
    }

    /**
     * @param principalOrgId The identifier for your organization in AWS Organizations . Use this to
     *   grant permissions to all the AWS accounts under this organization.
     */
    public fun principalOrgId(principalOrgId: String) {
        cdkBuilder.principalOrgId(principalOrgId)
    }

    /**
     * @param sourceAccount For AWS service , the ID of the AWS account that owns the resource. Use
     *   this together with `SourceArn` to ensure that the specified account owns the resource. It
     *   is possible for an Amazon S3 bucket to be deleted by its owner and recreated by another
     *   account.
     */
    public fun sourceAccount(sourceAccount: String) {
        cdkBuilder.sourceAccount(sourceAccount)
    }

    /**
     * @param sourceArn For AWS services , the ARN of the AWS resource that invokes the function.
     *   For example, an Amazon S3 bucket or Amazon SNS topic.
     *
     * Note that Lambda configures the comparison using the `StringLike` operator.
     */
    public fun sourceArn(sourceArn: String) {
        cdkBuilder.sourceArn(sourceArn)
    }

    public fun build(): CfnPermissionProps = cdkBuilder.build()
}
