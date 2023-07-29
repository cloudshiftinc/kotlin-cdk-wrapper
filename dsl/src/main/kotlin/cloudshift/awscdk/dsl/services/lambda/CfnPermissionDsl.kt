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
import software.amazon.awscdk.services.lambda.CfnPermission
import software.constructs.Construct

/**
 * The `AWS::Lambda::Permission` resource grants an AWS service or another account permission to use
 * a function.
 *
 * You can apply the policy at the function level, or specify a qualifier to restrict access to a
 * single version or alias. If you use a qualifier, the invoker must use the full Amazon Resource
 * Name (ARN) of that version or alias to invoke the function.
 *
 * To grant permission to another account, specify the account ID as the `Principal` . To grant
 * permission to an organization defined in AWS Organizations , specify the organization ID as the
 * `PrincipalOrgID` . For AWS services, the principal is a domain-style identifier defined by the
 * service, like `s3.amazonaws.com` or `sns.amazonaws.com` . For AWS services, you can also specify
 * the ARN of the associated resource as the `SourceArn` . If you grant permission to a service
 * principal without specifying the source, other accounts could potentially configure resources in
 * their account to invoke your Lambda function.
 *
 * If your function has a function URL, you can specify the `FunctionUrlAuthType` parameter. This
 * adds a condition to your permission that only applies when your function URL's `AuthType` matches
 * the specified `FunctionUrlAuthType` . For more information about the `AuthType` parameter, see
 * [Security and auth model for Lambda function URLs](https://docs.aws.amazon.com/lambda/latest/dg/urls-auth.html)
 * .
 *
 * This resource adds a statement to a resource-based permission policy for the function. For more
 * information about function policies, see
 * [Lambda Function Policies](https://docs.aws.amazon.com/lambda/latest/dg/access-control-resource-based.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lambda.*;
 * CfnPermission cfnPermission = CfnPermission.Builder.create(this, "MyCfnPermission")
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
public class CfnPermissionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnPermission.Builder = CfnPermission.Builder.create(scope, id)

    /**
     * The action that the principal can use on the function.
     *
     * For example, `lambda:InvokeFunction` or `lambda:GetFunction` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-action)
     *
     * @param action The action that the principal can use on the function.
     */
    public fun action(action: String) {
        cdkBuilder.action(action)
    }

    /**
     * For Alexa Smart Home functions, a token that the invoker must supply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-eventsourcetoken)
     *
     * @param eventSourceToken For Alexa Smart Home functions, a token that the invoker must supply.
     */
    public fun eventSourceToken(eventSourceToken: String) {
        cdkBuilder.eventSourceToken(eventSourceToken)
    }

    /**
     * The name of the Lambda function, version, or alias.
     *
     * **Name formats** - *Function name* – `my-function` (name-only), `my-function:v1` (with
     * alias).
     * * *Function ARN* – `arn:aws:lambda:us-west-2:123456789012:function:my-function` .
     * * *Partial ARN* – `123456789012:function:my-function` .
     *
     * You can append a version number or alias to any of the formats. The length constraint applies
     * only to the full ARN. If you specify only the function name, it is limited to 64 characters
     * in length.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-functionname)
     *
     * @param functionName The name of the Lambda function, version, or alias.
     */
    public fun functionName(functionName: String) {
        cdkBuilder.functionName(functionName)
    }

    /**
     * The type of authentication that your function URL uses.
     *
     * Set to `AWS_IAM` if you want to restrict access to authenticated users only. Set to `NONE` if
     * you want to bypass IAM authentication to create a public endpoint. For more information, see
     * [Security and auth model for Lambda function URLs](https://docs.aws.amazon.com/lambda/latest/dg/urls-auth.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-functionurlauthtype)
     *
     * @param functionUrlAuthType The type of authentication that your function URL uses.
     */
    public fun functionUrlAuthType(functionUrlAuthType: String) {
        cdkBuilder.functionUrlAuthType(functionUrlAuthType)
    }

    /**
     * The AWS service or AWS account that invokes the function.
     *
     * If you specify a service, use `SourceArn` or `SourceAccount` to limit who can invoke the
     * function through that service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-principal)
     *
     * @param principal The AWS service or AWS account that invokes the function.
     */
    public fun principal(principal: String) {
        cdkBuilder.principal(principal)
    }

    /**
     * The identifier for your organization in AWS Organizations .
     *
     * Use this to grant permissions to all the AWS accounts under this organization.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-principalorgid)
     *
     * @param principalOrgId The identifier for your organization in AWS Organizations .
     */
    public fun principalOrgId(principalOrgId: String) {
        cdkBuilder.principalOrgId(principalOrgId)
    }

    /**
     * For AWS service , the ID of the AWS account that owns the resource.
     *
     * Use this together with `SourceArn` to ensure that the specified account owns the resource. It
     * is possible for an Amazon S3 bucket to be deleted by its owner and recreated by another
     * account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-sourceaccount)
     *
     * @param sourceAccount For AWS service , the ID of the AWS account that owns the resource.
     */
    public fun sourceAccount(sourceAccount: String) {
        cdkBuilder.sourceAccount(sourceAccount)
    }

    /**
     * For AWS services , the ARN of the AWS resource that invokes the function.
     *
     * For example, an Amazon S3 bucket or Amazon SNS topic.
     *
     * Note that Lambda configures the comparison using the `StringLike` operator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-sourcearn)
     *
     * @param sourceArn For AWS services , the ARN of the AWS resource that invokes the function.
     */
    public fun sourceArn(sourceArn: String) {
        cdkBuilder.sourceArn(sourceArn)
    }

    public fun build(): CfnPermission = cdkBuilder.build()
}
