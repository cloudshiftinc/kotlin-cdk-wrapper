@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lambda.CfnPermissionProps

@CdkDslMarker
public class CfnPermissionPropsDsl {
  private val cdkBuilder: CfnPermissionProps.Builder = CfnPermissionProps.builder()

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

  public fun build(): CfnPermissionProps = cdkBuilder.build()
}
