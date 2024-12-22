@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnPermission`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lambda.*;
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
public interface CfnPermissionProps {
  /**
   * The action that the principal can use on the function.
   *
   * For example, `lambda:InvokeFunction` or `lambda:GetFunction` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-action)
   */
  public fun action(): String

  /**
   * For Alexa Smart Home functions, a token that the invoker must supply.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-eventsourcetoken)
   */
  public fun eventSourceToken(): String? = unwrap(this).getEventSourceToken()

  /**
   * The name or ARN of the Lambda function, version, or alias.
   *
   * **Name formats** - *Function name* – `my-function` (name-only), `my-function:v1` (with alias).
   *
   * * *Function ARN* – `arn:aws:lambda:us-west-2:123456789012:function:my-function` .
   * * *Partial ARN* – `123456789012:function:my-function` .
   *
   * You can append a version number or alias to any of the formats. The length constraint applies
   * only to the full ARN. If you specify only the function name, it is limited to 64 characters in
   * length.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-functionname)
   */
  public fun functionName(): String

  /**
   * The type of authentication that your function URL uses.
   *
   * Set to `AWS_IAM` if you want to restrict access to authenticated users only. Set to `NONE` if
   * you want to bypass IAM authentication to create a public endpoint. For more information, see
   * [Security and auth model for Lambda function
   * URLs](https://docs.aws.amazon.com/lambda/latest/dg/urls-auth.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-functionurlauthtype)
   */
  public fun functionUrlAuthType(): String? = unwrap(this).getFunctionUrlAuthType()

  /**
   * The AWS service , AWS account , IAM user, or IAM role that invokes the function.
   *
   * If you specify a service, use `SourceArn` or `SourceAccount` to limit who can invoke the
   * function through that service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-principal)
   */
  public fun principal(): String

  /**
   * The identifier for your organization in AWS Organizations .
   *
   * Use this to grant permissions to all the AWS accounts under this organization.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-principalorgid)
   */
  public fun principalOrgId(): String? = unwrap(this).getPrincipalOrgId()

  /**
   * For AWS service , the ID of the AWS account that owns the resource.
   *
   * Use this together with `SourceArn` to ensure that the specified account owns the resource. It
   * is possible for an Amazon S3 bucket to be deleted by its owner and recreated by another account.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-sourceaccount)
   */
  public fun sourceAccount(): String? = unwrap(this).getSourceAccount()

  /**
   * For AWS services , the ARN of the AWS resource that invokes the function.
   *
   * For example, an Amazon S3 bucket or Amazon SNS topic.
   *
   * Note that Lambda configures the comparison using the `StringLike` operator.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-sourcearn)
   */
  public fun sourceArn(): String? = unwrap(this).getSourceArn()

  /**
   * A builder for [CfnPermissionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param action The action that the principal can use on the function. 
     * For example, `lambda:InvokeFunction` or `lambda:GetFunction` .
     */
    public fun action(action: String)

    /**
     * @param eventSourceToken For Alexa Smart Home functions, a token that the invoker must supply.
     */
    public fun eventSourceToken(eventSourceToken: String)

    /**
     * @param functionName The name or ARN of the Lambda function, version, or alias. 
     * **Name formats** - *Function name* – `my-function` (name-only), `my-function:v1` (with
     * alias).
     *
     * * *Function ARN* – `arn:aws:lambda:us-west-2:123456789012:function:my-function` .
     * * *Partial ARN* – `123456789012:function:my-function` .
     *
     * You can append a version number or alias to any of the formats. The length constraint applies
     * only to the full ARN. If you specify only the function name, it is limited to 64 characters in
     * length.
     */
    public fun functionName(functionName: String)

    /**
     * @param functionUrlAuthType The type of authentication that your function URL uses.
     * Set to `AWS_IAM` if you want to restrict access to authenticated users only. Set to `NONE` if
     * you want to bypass IAM authentication to create a public endpoint. For more information, see
     * [Security and auth model for Lambda function
     * URLs](https://docs.aws.amazon.com/lambda/latest/dg/urls-auth.html) .
     */
    public fun functionUrlAuthType(functionUrlAuthType: String)

    /**
     * @param principal The AWS service , AWS account , IAM user, or IAM role that invokes the
     * function. 
     * If you specify a service, use `SourceArn` or `SourceAccount` to limit who can invoke the
     * function through that service.
     */
    public fun principal(principal: String)

    /**
     * @param principalOrgId The identifier for your organization in AWS Organizations .
     * Use this to grant permissions to all the AWS accounts under this organization.
     */
    public fun principalOrgId(principalOrgId: String)

    /**
     * @param sourceAccount For AWS service , the ID of the AWS account that owns the resource.
     * Use this together with `SourceArn` to ensure that the specified account owns the resource. It
     * is possible for an Amazon S3 bucket to be deleted by its owner and recreated by another account.
     */
    public fun sourceAccount(sourceAccount: String)

    /**
     * @param sourceArn For AWS services , the ARN of the AWS resource that invokes the function.
     * For example, an Amazon S3 bucket or Amazon SNS topic.
     *
     * Note that Lambda configures the comparison using the `StringLike` operator.
     */
    public fun sourceArn(sourceArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.CfnPermissionProps.Builder =
        software.amazon.awscdk.services.lambda.CfnPermissionProps.builder()

    /**
     * @param action The action that the principal can use on the function. 
     * For example, `lambda:InvokeFunction` or `lambda:GetFunction` .
     */
    override fun action(action: String) {
      cdkBuilder.action(action)
    }

    /**
     * @param eventSourceToken For Alexa Smart Home functions, a token that the invoker must supply.
     */
    override fun eventSourceToken(eventSourceToken: String) {
      cdkBuilder.eventSourceToken(eventSourceToken)
    }

    /**
     * @param functionName The name or ARN of the Lambda function, version, or alias. 
     * **Name formats** - *Function name* – `my-function` (name-only), `my-function:v1` (with
     * alias).
     *
     * * *Function ARN* – `arn:aws:lambda:us-west-2:123456789012:function:my-function` .
     * * *Partial ARN* – `123456789012:function:my-function` .
     *
     * You can append a version number or alias to any of the formats. The length constraint applies
     * only to the full ARN. If you specify only the function name, it is limited to 64 characters in
     * length.
     */
    override fun functionName(functionName: String) {
      cdkBuilder.functionName(functionName)
    }

    /**
     * @param functionUrlAuthType The type of authentication that your function URL uses.
     * Set to `AWS_IAM` if you want to restrict access to authenticated users only. Set to `NONE` if
     * you want to bypass IAM authentication to create a public endpoint. For more information, see
     * [Security and auth model for Lambda function
     * URLs](https://docs.aws.amazon.com/lambda/latest/dg/urls-auth.html) .
     */
    override fun functionUrlAuthType(functionUrlAuthType: String) {
      cdkBuilder.functionUrlAuthType(functionUrlAuthType)
    }

    /**
     * @param principal The AWS service , AWS account , IAM user, or IAM role that invokes the
     * function. 
     * If you specify a service, use `SourceArn` or `SourceAccount` to limit who can invoke the
     * function through that service.
     */
    override fun principal(principal: String) {
      cdkBuilder.principal(principal)
    }

    /**
     * @param principalOrgId The identifier for your organization in AWS Organizations .
     * Use this to grant permissions to all the AWS accounts under this organization.
     */
    override fun principalOrgId(principalOrgId: String) {
      cdkBuilder.principalOrgId(principalOrgId)
    }

    /**
     * @param sourceAccount For AWS service , the ID of the AWS account that owns the resource.
     * Use this together with `SourceArn` to ensure that the specified account owns the resource. It
     * is possible for an Amazon S3 bucket to be deleted by its owner and recreated by another account.
     */
    override fun sourceAccount(sourceAccount: String) {
      cdkBuilder.sourceAccount(sourceAccount)
    }

    /**
     * @param sourceArn For AWS services , the ARN of the AWS resource that invokes the function.
     * For example, an Amazon S3 bucket or Amazon SNS topic.
     *
     * Note that Lambda configures the comparison using the `StringLike` operator.
     */
    override fun sourceArn(sourceArn: String) {
      cdkBuilder.sourceArn(sourceArn)
    }

    public fun build(): software.amazon.awscdk.services.lambda.CfnPermissionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.lambda.CfnPermissionProps,
  ) : CdkObject(cdkObject),
      CfnPermissionProps {
    /**
     * The action that the principal can use on the function.
     *
     * For example, `lambda:InvokeFunction` or `lambda:GetFunction` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-action)
     */
    override fun action(): String = unwrap(this).getAction()

    /**
     * For Alexa Smart Home functions, a token that the invoker must supply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-eventsourcetoken)
     */
    override fun eventSourceToken(): String? = unwrap(this).getEventSourceToken()

    /**
     * The name or ARN of the Lambda function, version, or alias.
     *
     * **Name formats** - *Function name* – `my-function` (name-only), `my-function:v1` (with
     * alias).
     *
     * * *Function ARN* – `arn:aws:lambda:us-west-2:123456789012:function:my-function` .
     * * *Partial ARN* – `123456789012:function:my-function` .
     *
     * You can append a version number or alias to any of the formats. The length constraint applies
     * only to the full ARN. If you specify only the function name, it is limited to 64 characters in
     * length.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-functionname)
     */
    override fun functionName(): String = unwrap(this).getFunctionName()

    /**
     * The type of authentication that your function URL uses.
     *
     * Set to `AWS_IAM` if you want to restrict access to authenticated users only. Set to `NONE` if
     * you want to bypass IAM authentication to create a public endpoint. For more information, see
     * [Security and auth model for Lambda function
     * URLs](https://docs.aws.amazon.com/lambda/latest/dg/urls-auth.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-functionurlauthtype)
     */
    override fun functionUrlAuthType(): String? = unwrap(this).getFunctionUrlAuthType()

    /**
     * The AWS service , AWS account , IAM user, or IAM role that invokes the function.
     *
     * If you specify a service, use `SourceArn` or `SourceAccount` to limit who can invoke the
     * function through that service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-principal)
     */
    override fun principal(): String = unwrap(this).getPrincipal()

    /**
     * The identifier for your organization in AWS Organizations .
     *
     * Use this to grant permissions to all the AWS accounts under this organization.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-principalorgid)
     */
    override fun principalOrgId(): String? = unwrap(this).getPrincipalOrgId()

    /**
     * For AWS service , the ID of the AWS account that owns the resource.
     *
     * Use this together with `SourceArn` to ensure that the specified account owns the resource. It
     * is possible for an Amazon S3 bucket to be deleted by its owner and recreated by another account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-sourceaccount)
     */
    override fun sourceAccount(): String? = unwrap(this).getSourceAccount()

    /**
     * For AWS services , the ARN of the AWS resource that invokes the function.
     *
     * For example, an Amazon S3 bucket or Amazon SNS topic.
     *
     * Note that Lambda configures the comparison using the `StringLike` operator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-sourcearn)
     */
    override fun sourceArn(): String? = unwrap(this).getSourceArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPermissionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnPermissionProps):
        CfnPermissionProps = CdkObjectWrappers.wrap(cdkObject) as? CfnPermissionProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPermissionProps):
        software.amazon.awscdk.services.lambda.CfnPermissionProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.lambda.CfnPermissionProps
  }
}
