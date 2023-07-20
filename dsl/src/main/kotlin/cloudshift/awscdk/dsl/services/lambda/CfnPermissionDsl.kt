@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lambda.CfnPermission
import software.constructs.Construct

@CdkDslMarker
public class CfnPermissionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnPermission.Builder = CfnPermission.Builder.create(scope, id)

  public fun action(action: String) {
    cdkBuilder.action(action)
  }

  public fun eventSourceToken(eventSourceToken: String) {
    cdkBuilder.eventSourceToken(eventSourceToken)
  }

  public fun functionName(functionName: String) {
    cdkBuilder.functionName(functionName)
  }

  public fun functionUrlAuthType(functionUrlAuthType: String) {
    cdkBuilder.functionUrlAuthType(functionUrlAuthType)
  }

  public fun principal(principal: String) {
    cdkBuilder.principal(principal)
  }

  public fun principalOrgId(principalOrgId: String) {
    cdkBuilder.principalOrgId(principalOrgId)
  }

  public fun sourceAccount(sourceAccount: String) {
    cdkBuilder.sourceAccount(sourceAccount)
  }

  public fun sourceArn(sourceArn: String) {
    cdkBuilder.sourceArn(sourceArn)
  }

  public fun build(): CfnPermission = cdkBuilder.build()
}
