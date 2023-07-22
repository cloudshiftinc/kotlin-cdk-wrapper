@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iam.IPrincipal
import software.amazon.awscdk.services.lambda.FunctionUrlAuthType
import software.amazon.awscdk.services.lambda.Permission
import software.constructs.Construct

@CdkDslMarker
public class PermissionDsl {
  private val cdkBuilder: Permission.Builder = Permission.builder()

  /**
   * @param action The Lambda actions that you want to allow in this statement.
   * For example,
   * you can specify lambda:CreateFunction to specify a certain action, or use
   * a wildcard (`lambda:*`) to grant permission to all Lambda actions. For a
   * list of actions, see Actions and Condition Context Keys for AWS Lambda in
   * the IAM User Guide.
   */
  public fun action(action: String) {
    cdkBuilder.action(action)
  }

  /**
   * @param eventSourceToken A unique token that must be supplied by the principal invoking the
   * function.
   */
  public fun eventSourceToken(eventSourceToken: String) {
    cdkBuilder.eventSourceToken(eventSourceToken)
  }

  /**
   * @param functionUrlAuthType The authType for the function URL that you are granting permissions
   * for.
   */
  public fun functionUrlAuthType(functionUrlAuthType: FunctionUrlAuthType) {
    cdkBuilder.functionUrlAuthType(functionUrlAuthType)
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
  public fun organizationId(organizationId: String) {
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
  public fun principal(principal: IPrincipal) {
    cdkBuilder.principal(principal)
  }

  /**
   * @param scope The scope to which the permission constructs be attached.
   * The default is
   * the Lambda function construct itself, but this would need to be different
   * in cases such as cross-stack references where the Permissions would need
   * to sit closer to the consumer of this permission (i.e., the caller).
   */
  public fun scope(scope: Construct) {
    cdkBuilder.scope(scope)
  }

  /**
   * @param sourceAccount The AWS account ID (without hyphens) of the source owner.
   * For example, if
   * you specify an S3 bucket in the SourceArn property, this value is the
   * bucket owner's account ID. You can use this property to ensure that all
   * source principals are owned by a specific account.
   */
  public fun sourceAccount(sourceAccount: String) {
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
  public fun sourceArn(sourceArn: String) {
    cdkBuilder.sourceArn(sourceArn)
  }

  public fun build(): Permission = cdkBuilder.build()
}
