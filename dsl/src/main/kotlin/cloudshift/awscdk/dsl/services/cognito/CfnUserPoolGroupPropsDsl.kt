@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.cognito.CfnUserPoolGroupProps

@CdkDslMarker
public class CfnUserPoolGroupPropsDsl {
  private val cdkBuilder: CfnUserPoolGroupProps.Builder = CfnUserPoolGroupProps.builder()

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun groupName(groupName: String) {
    cdkBuilder.groupName(groupName)
  }

  public fun precedence(precedence: Number) {
    cdkBuilder.precedence(precedence)
  }

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun userPoolId(userPoolId: String) {
    cdkBuilder.userPoolId(userPoolId)
  }

  public fun build(): CfnUserPoolGroupProps = cdkBuilder.build()
}
