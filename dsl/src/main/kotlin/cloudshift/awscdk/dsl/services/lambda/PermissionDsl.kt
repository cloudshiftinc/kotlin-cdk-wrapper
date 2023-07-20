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

  public fun action(action: String) {
    cdkBuilder.action(action)
  }

  public fun eventSourceToken(eventSourceToken: String) {
    cdkBuilder.eventSourceToken(eventSourceToken)
  }

  public fun functionUrlAuthType(functionUrlAuthType: FunctionUrlAuthType) {
    cdkBuilder.functionUrlAuthType(functionUrlAuthType)
  }

  public fun organizationId(organizationId: String) {
    cdkBuilder.organizationId(organizationId)
  }

  public fun principal(principal: IPrincipal) {
    cdkBuilder.principal(principal)
  }

  public fun scope(scope: Construct) {
    cdkBuilder.scope(scope)
  }

  public fun sourceAccount(sourceAccount: String) {
    cdkBuilder.sourceAccount(sourceAccount)
  }

  public fun sourceArn(sourceArn: String) {
    cdkBuilder.sourceArn(sourceArn)
  }

  public fun build(): Permission = cdkBuilder.build()
}
