@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.servicecatalog.CfnLaunchRoleConstraintProps

@CdkDslMarker
public class CfnLaunchRoleConstraintPropsDsl {
  private val cdkBuilder: CfnLaunchRoleConstraintProps.Builder =
      CfnLaunchRoleConstraintProps.builder()

  /**
   * @param acceptLanguage The language code.
   * * `jp` - Japanese
   * * `zh` - Chinese
   */
  public fun acceptLanguage(acceptLanguage: String) {
    cdkBuilder.acceptLanguage(acceptLanguage)
  }

  /**
   * @param description The description of the constraint.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param localRoleName You are required to specify either the `RoleArn` or the `LocalRoleName`
   * but can't use both.
   * If you specify the `LocalRoleName` property, when an account uses the launch constraint, the
   * IAM role with that name in the account will be used. This allows launch-role constraints to be
   * account-agnostic so the administrator can create fewer resources per shared account.
   *
   * The given role name must exist in the account used to create the launch constraint and the
   * account of the user who launches a product with this launch constraint.
   */
  public fun localRoleName(localRoleName: String) {
    cdkBuilder.localRoleName(localRoleName)
  }

  /**
   * @param portfolioId The portfolio identifier. 
   */
  public fun portfolioId(portfolioId: String) {
    cdkBuilder.portfolioId(portfolioId)
  }

  /**
   * @param productId The product identifier. 
   */
  public fun productId(productId: String) {
    cdkBuilder.productId(productId)
  }

  /**
   * @param roleArn The ARN of the launch role.
   * You are required to specify `RoleArn` or `LocalRoleName` but can't use both.
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun build(): CfnLaunchRoleConstraintProps = cdkBuilder.build()
}
