@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::Lambda::Permission` resource grants an AWS service or another account permission to use
 * a function.
 *
 * You can apply the policy at the function level, or specify a qualifier to restrict access to a
 * single version or alias. If you use a qualifier, the invoker must use the full Amazon Resource Name
 * (ARN) of that version or alias to invoke the function.
 *
 * To grant permission to another account, specify the account ID as the `Principal` . To grant
 * permission to an organization defined in AWS Organizations , specify the organization ID as the
 * `PrincipalOrgID` . For AWS services, the principal is a domain-style identifier defined by the
 * service, like `s3.amazonaws.com` or `sns.amazonaws.com` . For AWS services, you can also specify the
 * ARN of the associated resource as the `SourceArn` . If you grant permission to a service principal
 * without specifying the source, other accounts could potentially configure resources in their account
 * to invoke your Lambda function.
 *
 * If your function has a function URL, you can specify the `FunctionUrlAuthType` parameter. This
 * adds a condition to your permission that only applies when your function URL's `AuthType` matches
 * the specified `FunctionUrlAuthType` . For more information about the `AuthType` parameter, see
 * [Security and auth model for Lambda function
 * URLs](https://docs.aws.amazon.com/lambda/latest/dg/urls-auth.html) .
 *
 * This resource adds a statement to a resource-based permission policy for the function. For more
 * information about function policies, see [Lambda Function
 * Policies](https://docs.aws.amazon.com/lambda/latest/dg/access-control-resource-based.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lambda.*;
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
public open class CfnPermission(
  cdkObject: software.amazon.awscdk.services.lambda.CfnPermission,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPermissionProps,
  ) :
      this(software.amazon.awscdk.services.lambda.CfnPermission(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnPermissionProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPermissionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnPermissionProps(props)
  )

  /**
   * The action that the principal can use on the function.
   */
  public open fun action(): String = unwrap(this).getAction()

  /**
   * The action that the principal can use on the function.
   */
  public open fun action(`value`: String) {
    unwrap(this).setAction(`value`)
  }

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * For Alexa Smart Home functions, a token that the invoker must supply.
   */
  public open fun eventSourceToken(): String? = unwrap(this).getEventSourceToken()

  /**
   * For Alexa Smart Home functions, a token that the invoker must supply.
   */
  public open fun eventSourceToken(`value`: String) {
    unwrap(this).setEventSourceToken(`value`)
  }

  /**
   * The name or ARN of the Lambda function, version, or alias.
   */
  public open fun functionName(): String = unwrap(this).getFunctionName()

  /**
   * The name or ARN of the Lambda function, version, or alias.
   */
  public open fun functionName(`value`: String) {
    unwrap(this).setFunctionName(`value`)
  }

  /**
   * The type of authentication that your function URL uses.
   */
  public open fun functionUrlAuthType(): String? = unwrap(this).getFunctionUrlAuthType()

  /**
   * The type of authentication that your function URL uses.
   */
  public open fun functionUrlAuthType(`value`: String) {
    unwrap(this).setFunctionUrlAuthType(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The AWS service or AWS account that invokes the function.
   */
  public open fun principal(): String = unwrap(this).getPrincipal()

  /**
   * The AWS service or AWS account that invokes the function.
   */
  public open fun principal(`value`: String) {
    unwrap(this).setPrincipal(`value`)
  }

  /**
   * The identifier for your organization in AWS Organizations .
   */
  public open fun principalOrgId(): String? = unwrap(this).getPrincipalOrgId()

  /**
   * The identifier for your organization in AWS Organizations .
   */
  public open fun principalOrgId(`value`: String) {
    unwrap(this).setPrincipalOrgId(`value`)
  }

  /**
   * For AWS service , the ID of the AWS account that owns the resource.
   */
  public open fun sourceAccount(): String? = unwrap(this).getSourceAccount()

  /**
   * For AWS service , the ID of the AWS account that owns the resource.
   */
  public open fun sourceAccount(`value`: String) {
    unwrap(this).setSourceAccount(`value`)
  }

  /**
   * For AWS services , the ARN of the AWS resource that invokes the function.
   */
  public open fun sourceArn(): String? = unwrap(this).getSourceArn()

  /**
   * For AWS services , the ARN of the AWS resource that invokes the function.
   */
  public open fun sourceArn(`value`: String) {
    unwrap(this).setSourceArn(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.lambda.CfnPermission].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The action that the principal can use on the function.
     *
     * For example, `lambda:InvokeFunction` or `lambda:GetFunction` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-action)
     * @param action The action that the principal can use on the function. 
     */
    public fun action(action: String)

    /**
     * For Alexa Smart Home functions, a token that the invoker must supply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-eventsourcetoken)
     * @param eventSourceToken For Alexa Smart Home functions, a token that the invoker must supply.
     * 
     */
    public fun eventSourceToken(eventSourceToken: String)

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
     * @param functionName The name or ARN of the Lambda function, version, or alias. 
     */
    public fun functionName(functionName: String)

    /**
     * The type of authentication that your function URL uses.
     *
     * Set to `AWS_IAM` if you want to restrict access to authenticated users only. Set to `NONE` if
     * you want to bypass IAM authentication to create a public endpoint. For more information, see
     * [Security and auth model for Lambda function
     * URLs](https://docs.aws.amazon.com/lambda/latest/dg/urls-auth.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-functionurlauthtype)
     * @param functionUrlAuthType The type of authentication that your function URL uses. 
     */
    public fun functionUrlAuthType(functionUrlAuthType: String)

    /**
     * The AWS service or AWS account that invokes the function.
     *
     * If you specify a service, use `SourceArn` or `SourceAccount` to limit who can invoke the
     * function through that service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-principal)
     * @param principal The AWS service or AWS account that invokes the function. 
     */
    public fun principal(principal: String)

    /**
     * The identifier for your organization in AWS Organizations .
     *
     * Use this to grant permissions to all the AWS accounts under this organization.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-principalorgid)
     * @param principalOrgId The identifier for your organization in AWS Organizations . 
     */
    public fun principalOrgId(principalOrgId: String)

    /**
     * For AWS service , the ID of the AWS account that owns the resource.
     *
     * Use this together with `SourceArn` to ensure that the specified account owns the resource. It
     * is possible for an Amazon S3 bucket to be deleted by its owner and recreated by another account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-sourceaccount)
     * @param sourceAccount For AWS service , the ID of the AWS account that owns the resource. 
     */
    public fun sourceAccount(sourceAccount: String)

    /**
     * For AWS services , the ARN of the AWS resource that invokes the function.
     *
     * For example, an Amazon S3 bucket or Amazon SNS topic.
     *
     * Note that Lambda configures the comparison using the `StringLike` operator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-sourcearn)
     * @param sourceArn For AWS services , the ARN of the AWS resource that invokes the function. 
     */
    public fun sourceArn(sourceArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.CfnPermission.Builder =
        software.amazon.awscdk.services.lambda.CfnPermission.Builder.create(scope, id)

    /**
     * The action that the principal can use on the function.
     *
     * For example, `lambda:InvokeFunction` or `lambda:GetFunction` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-action)
     * @param action The action that the principal can use on the function. 
     */
    override fun action(action: String) {
      cdkBuilder.action(action)
    }

    /**
     * For Alexa Smart Home functions, a token that the invoker must supply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-eventsourcetoken)
     * @param eventSourceToken For Alexa Smart Home functions, a token that the invoker must supply.
     * 
     */
    override fun eventSourceToken(eventSourceToken: String) {
      cdkBuilder.eventSourceToken(eventSourceToken)
    }

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
     * @param functionName The name or ARN of the Lambda function, version, or alias. 
     */
    override fun functionName(functionName: String) {
      cdkBuilder.functionName(functionName)
    }

    /**
     * The type of authentication that your function URL uses.
     *
     * Set to `AWS_IAM` if you want to restrict access to authenticated users only. Set to `NONE` if
     * you want to bypass IAM authentication to create a public endpoint. For more information, see
     * [Security and auth model for Lambda function
     * URLs](https://docs.aws.amazon.com/lambda/latest/dg/urls-auth.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-functionurlauthtype)
     * @param functionUrlAuthType The type of authentication that your function URL uses. 
     */
    override fun functionUrlAuthType(functionUrlAuthType: String) {
      cdkBuilder.functionUrlAuthType(functionUrlAuthType)
    }

    /**
     * The AWS service or AWS account that invokes the function.
     *
     * If you specify a service, use `SourceArn` or `SourceAccount` to limit who can invoke the
     * function through that service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-principal)
     * @param principal The AWS service or AWS account that invokes the function. 
     */
    override fun principal(principal: String) {
      cdkBuilder.principal(principal)
    }

    /**
     * The identifier for your organization in AWS Organizations .
     *
     * Use this to grant permissions to all the AWS accounts under this organization.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-principalorgid)
     * @param principalOrgId The identifier for your organization in AWS Organizations . 
     */
    override fun principalOrgId(principalOrgId: String) {
      cdkBuilder.principalOrgId(principalOrgId)
    }

    /**
     * For AWS service , the ID of the AWS account that owns the resource.
     *
     * Use this together with `SourceArn` to ensure that the specified account owns the resource. It
     * is possible for an Amazon S3 bucket to be deleted by its owner and recreated by another account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html#cfn-lambda-permission-sourceaccount)
     * @param sourceAccount For AWS service , the ID of the AWS account that owns the resource. 
     */
    override fun sourceAccount(sourceAccount: String) {
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
     * @param sourceArn For AWS services , the ARN of the AWS resource that invokes the function. 
     */
    override fun sourceArn(sourceArn: String) {
      cdkBuilder.sourceArn(sourceArn)
    }

    public fun build(): software.amazon.awscdk.services.lambda.CfnPermission = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.lambda.CfnPermission.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPermission {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPermission(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnPermission):
        CfnPermission = CfnPermission(cdkObject)

    internal fun unwrap(wrapped: CfnPermission):
        software.amazon.awscdk.services.lambda.CfnPermission = wrapped.cdkObject as
        software.amazon.awscdk.services.lambda.CfnPermission
  }
}
