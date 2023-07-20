@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.servicecatalog.CfnLaunchRoleConstraintProps

@CdkDslMarker
public class CfnLaunchRoleConstraintPropsDsl {
  private val cdkBuilder: CfnLaunchRoleConstraintProps.Builder =
      CfnLaunchRoleConstraintProps.builder()

  public fun acceptLanguage(acceptLanguage: String) {
    cdkBuilder.acceptLanguage(acceptLanguage)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun localRoleName(localRoleName: String) {
    cdkBuilder.localRoleName(localRoleName)
  }

  public fun portfolioId(portfolioId: String) {
    cdkBuilder.portfolioId(portfolioId)
  }

  public fun productId(productId: String) {
    cdkBuilder.productId(productId)
  }

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun build(): CfnLaunchRoleConstraintProps = cdkBuilder.build()
}
