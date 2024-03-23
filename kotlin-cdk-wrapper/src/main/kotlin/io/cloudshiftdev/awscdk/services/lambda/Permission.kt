@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IPrincipal
import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.Unit

/**
 * Represents a permission statement that can be added to a Lambda function's resource policy via
 * the `addPermission()` method.
 *
 * Example:
 *
 * ```
 * // Grant permissions to a service
 * Function fn;
 * ServicePrincipal principal = new ServicePrincipal("my-service");
 * fn.grantInvoke(principal);
 * // Equivalent to:
 * fn.addPermission("my-service Invocation", Permission.builder()
 * .principal(principal)
 * .build());
 * ```
 */
public interface Permission {
  /**
   * The Lambda actions that you want to allow in this statement.
   *
   * For example,
   * you can specify lambda:CreateFunction to specify a certain action, or use
   * a wildcard (`lambda:*`) to grant permission to all Lambda actions. For a
   * list of actions, see Actions and Condition Context Keys for AWS Lambda in
   * the IAM User Guide.
   *
   * Default: 'lambda:InvokeFunction'
   */
  public fun action(): String? = unwrap(this).getAction()

  /**
   * A unique token that must be supplied by the principal invoking the function.
   *
   * Default: - The caller would not need to present a token.
   */
  public fun eventSourceToken(): String? = unwrap(this).getEventSourceToken()

  /**
   * The authType for the function URL that you are granting permissions for.
   *
   * Default: - No functionUrlAuthType
   */
  public fun functionUrlAuthType(): FunctionUrlAuthType? =
      unwrap(this).getFunctionUrlAuthType()?.let(FunctionUrlAuthType::wrap)

  /**
   * The organization you want to grant permissions to.
   *
   * Use this ONLY if you
   * need to grant permissions to a subset of the organization. If you want to
   * grant permissions to the entire organization, sending the organization principal
   * through the `principal` property will suffice.
   *
   * You can use this property to ensure that all source principals are owned by
   * a specific organization.
   *
   * Default: - No organizationId
   */
  public fun organizationId(): String? = unwrap(this).getOrganizationId()

  /**
   * The entity for which you are granting permission to invoke the Lambda function.
   *
   * This entity can be any of the following:
   *
   * * a valid AWS service principal, such as `s3.amazonaws.com` or `sns.amazonaws.com`
   * * an AWS account ID for cross-account permissions. For example, you might want
   * to allow a custom application in another AWS account to push events to
   * Lambda by invoking your function.
   * * an AWS organization principal to grant permissions to an entire organization.
   *
   * The principal can be an AccountPrincipal, an ArnPrincipal, a ServicePrincipal,
   * or an OrganizationPrincipal.
   */
  public fun principal(): IPrincipal

  /**
   * The scope to which the permission constructs be attached.
   *
   * The default is
   * the Lambda function construct itself, but this would need to be different
   * in cases such as cross-stack references where the Permissions would need
   * to sit closer to the consumer of this permission (i.e., the caller).
   *
   * Default: - The instance of lambda.IFunction
   */
  public fun scope(): Construct? = unwrap(this).getScope()?.let(Construct::wrap)

  /**
   * The AWS account ID (without hyphens) of the source owner.
   *
   * For example, if
   * you specify an S3 bucket in the SourceArn property, this value is the
   * bucket owner's account ID. You can use this property to ensure that all
   * source principals are owned by a specific account.
   */
  public fun sourceAccount(): String? = unwrap(this).getSourceAccount()

  /**
   * The ARN of a resource that is invoking your function.
   *
   * When granting
   * Amazon Simple Storage Service (Amazon S3) permission to invoke your
   * function, specify this property with the bucket ARN as its value. This
   * ensures that events generated only from the specified bucket, not just
   * any bucket from any AWS account that creates a mapping to your function,
   * can invoke the function.
   */
  public fun sourceArn(): String? = unwrap(this).getSourceArn()

  /**
   * A builder for [Permission]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param action The Lambda actions that you want to allow in this statement.
     * For example,
     * you can specify lambda:CreateFunction to specify a certain action, or use
     * a wildcard (`lambda:*`) to grant permission to all Lambda actions. For a
     * list of actions, see Actions and Condition Context Keys for AWS Lambda in
     * the IAM User Guide.
     */
    public fun action(action: String)

    /**
     * @param eventSourceToken A unique token that must be supplied by the principal invoking the
     * function.
     */
    public fun eventSourceToken(eventSourceToken: String)

    /**
     * @param functionUrlAuthType The authType for the function URL that you are granting
     * permissions for.
     */
    public fun functionUrlAuthType(functionUrlAuthType: FunctionUrlAuthType)

    /**
     * @param organizationId The organization you want to grant permissions to.
     * Use this ONLY if you
     * need to grant permissions to a subset of the organization. If you want to
     * grant permissions to the entire organization, sending the organization principal
     * through the `principal` property will suffice.
     *
     * You can use this property to ensure that all source principals are owned by
     * a specific organization.
     */
    public fun organizationId(organizationId: String)

    /**
     * @param principal The entity for which you are granting permission to invoke the Lambda
     * function. 
     * This entity can be any of the following:
     *
     * * a valid AWS service principal, such as `s3.amazonaws.com` or `sns.amazonaws.com`
     * * an AWS account ID for cross-account permissions. For example, you might want
     * to allow a custom application in another AWS account to push events to
     * Lambda by invoking your function.
     * * an AWS organization principal to grant permissions to an entire organization.
     *
     * The principal can be an AccountPrincipal, an ArnPrincipal, a ServicePrincipal,
     * or an OrganizationPrincipal.
     */
    public fun principal(principal: IPrincipal)

    /**
     * @param scope The scope to which the permission constructs be attached.
     * The default is
     * the Lambda function construct itself, but this would need to be different
     * in cases such as cross-stack references where the Permissions would need
     * to sit closer to the consumer of this permission (i.e., the caller).
     */
    public fun scope(scope: Construct)

    /**
     * @param sourceAccount The AWS account ID (without hyphens) of the source owner.
     * For example, if
     * you specify an S3 bucket in the SourceArn property, this value is the
     * bucket owner's account ID. You can use this property to ensure that all
     * source principals are owned by a specific account.
     */
    public fun sourceAccount(sourceAccount: String)

    /**
     * @param sourceArn The ARN of a resource that is invoking your function.
     * When granting
     * Amazon Simple Storage Service (Amazon S3) permission to invoke your
     * function, specify this property with the bucket ARN as its value. This
     * ensures that events generated only from the specified bucket, not just
     * any bucket from any AWS account that creates a mapping to your function,
     * can invoke the function.
     */
    public fun sourceArn(sourceArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.Permission.Builder =
        software.amazon.awscdk.services.lambda.Permission.builder()

    /**
     * @param action The Lambda actions that you want to allow in this statement.
     * For example,
     * you can specify lambda:CreateFunction to specify a certain action, or use
     * a wildcard (`lambda:*`) to grant permission to all Lambda actions. For a
     * list of actions, see Actions and Condition Context Keys for AWS Lambda in
     * the IAM User Guide.
     */
    override fun action(action: String) {
      cdkBuilder.action(action)
    }

    /**
     * @param eventSourceToken A unique token that must be supplied by the principal invoking the
     * function.
     */
    override fun eventSourceToken(eventSourceToken: String) {
      cdkBuilder.eventSourceToken(eventSourceToken)
    }

    /**
     * @param functionUrlAuthType The authType for the function URL that you are granting
     * permissions for.
     */
    override fun functionUrlAuthType(functionUrlAuthType: FunctionUrlAuthType) {
      cdkBuilder.functionUrlAuthType(functionUrlAuthType.let(FunctionUrlAuthType::unwrap))
    }

    /**
     * @param organizationId The organization you want to grant permissions to.
     * Use this ONLY if you
     * need to grant permissions to a subset of the organization. If you want to
     * grant permissions to the entire organization, sending the organization principal
     * through the `principal` property will suffice.
     *
     * You can use this property to ensure that all source principals are owned by
     * a specific organization.
     */
    override fun organizationId(organizationId: String) {
      cdkBuilder.organizationId(organizationId)
    }

    /**
     * @param principal The entity for which you are granting permission to invoke the Lambda
     * function. 
     * This entity can be any of the following:
     *
     * * a valid AWS service principal, such as `s3.amazonaws.com` or `sns.amazonaws.com`
     * * an AWS account ID for cross-account permissions. For example, you might want
     * to allow a custom application in another AWS account to push events to
     * Lambda by invoking your function.
     * * an AWS organization principal to grant permissions to an entire organization.
     *
     * The principal can be an AccountPrincipal, an ArnPrincipal, a ServicePrincipal,
     * or an OrganizationPrincipal.
     */
    override fun principal(principal: IPrincipal) {
      cdkBuilder.principal(principal.let(IPrincipal::unwrap))
    }

    /**
     * @param scope The scope to which the permission constructs be attached.
     * The default is
     * the Lambda function construct itself, but this would need to be different
     * in cases such as cross-stack references where the Permissions would need
     * to sit closer to the consumer of this permission (i.e., the caller).
     */
    override fun scope(scope: Construct) {
      cdkBuilder.scope(scope.let(Construct::unwrap))
    }

    /**
     * @param sourceAccount The AWS account ID (without hyphens) of the source owner.
     * For example, if
     * you specify an S3 bucket in the SourceArn property, this value is the
     * bucket owner's account ID. You can use this property to ensure that all
     * source principals are owned by a specific account.
     */
    override fun sourceAccount(sourceAccount: String) {
      cdkBuilder.sourceAccount(sourceAccount)
    }

    /**
     * @param sourceArn The ARN of a resource that is invoking your function.
     * When granting
     * Amazon Simple Storage Service (Amazon S3) permission to invoke your
     * function, specify this property with the bucket ARN as its value. This
     * ensures that events generated only from the specified bucket, not just
     * any bucket from any AWS account that creates a mapping to your function,
     * can invoke the function.
     */
    override fun sourceArn(sourceArn: String) {
      cdkBuilder.sourceArn(sourceArn)
    }

    public fun build(): software.amazon.awscdk.services.lambda.Permission = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.lambda.Permission,
  ) : CdkObject(cdkObject), Permission {
    /**
     * The Lambda actions that you want to allow in this statement.
     *
     * For example,
     * you can specify lambda:CreateFunction to specify a certain action, or use
     * a wildcard (`lambda:*`) to grant permission to all Lambda actions. For a
     * list of actions, see Actions and Condition Context Keys for AWS Lambda in
     * the IAM User Guide.
     *
     * Default: 'lambda:InvokeFunction'
     */
    override fun action(): String? = unwrap(this).getAction()

    /**
     * A unique token that must be supplied by the principal invoking the function.
     *
     * Default: - The caller would not need to present a token.
     */
    override fun eventSourceToken(): String? = unwrap(this).getEventSourceToken()

    /**
     * The authType for the function URL that you are granting permissions for.
     *
     * Default: - No functionUrlAuthType
     */
    override fun functionUrlAuthType(): FunctionUrlAuthType? =
        unwrap(this).getFunctionUrlAuthType()?.let(FunctionUrlAuthType::wrap)

    /**
     * The organization you want to grant permissions to.
     *
     * Use this ONLY if you
     * need to grant permissions to a subset of the organization. If you want to
     * grant permissions to the entire organization, sending the organization principal
     * through the `principal` property will suffice.
     *
     * You can use this property to ensure that all source principals are owned by
     * a specific organization.
     *
     * Default: - No organizationId
     */
    override fun organizationId(): String? = unwrap(this).getOrganizationId()

    /**
     * The entity for which you are granting permission to invoke the Lambda function.
     *
     * This entity can be any of the following:
     *
     * * a valid AWS service principal, such as `s3.amazonaws.com` or `sns.amazonaws.com`
     * * an AWS account ID for cross-account permissions. For example, you might want
     * to allow a custom application in another AWS account to push events to
     * Lambda by invoking your function.
     * * an AWS organization principal to grant permissions to an entire organization.
     *
     * The principal can be an AccountPrincipal, an ArnPrincipal, a ServicePrincipal,
     * or an OrganizationPrincipal.
     */
    override fun principal(): IPrincipal = unwrap(this).getPrincipal().let(IPrincipal::wrap)

    /**
     * The scope to which the permission constructs be attached.
     *
     * The default is
     * the Lambda function construct itself, but this would need to be different
     * in cases such as cross-stack references where the Permissions would need
     * to sit closer to the consumer of this permission (i.e., the caller).
     *
     * Default: - The instance of lambda.IFunction
     */
    override fun scope(): Construct? = unwrap(this).getScope()?.let(Construct::wrap)

    /**
     * The AWS account ID (without hyphens) of the source owner.
     *
     * For example, if
     * you specify an S3 bucket in the SourceArn property, this value is the
     * bucket owner's account ID. You can use this property to ensure that all
     * source principals are owned by a specific account.
     */
    override fun sourceAccount(): String? = unwrap(this).getSourceAccount()

    /**
     * The ARN of a resource that is invoking your function.
     *
     * When granting
     * Amazon Simple Storage Service (Amazon S3) permission to invoke your
     * function, specify this property with the bucket ARN as its value. This
     * ensures that events generated only from the specified bucket, not just
     * any bucket from any AWS account that creates a mapping to your function,
     * can invoke the function.
     */
    override fun sourceArn(): String? = unwrap(this).getSourceArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): Permission {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.Permission): Permission =
        CdkObjectWrappers.wrap(cdkObject) as? Permission ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: Permission): software.amazon.awscdk.services.lambda.Permission =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.lambda.Permission
  }
}
