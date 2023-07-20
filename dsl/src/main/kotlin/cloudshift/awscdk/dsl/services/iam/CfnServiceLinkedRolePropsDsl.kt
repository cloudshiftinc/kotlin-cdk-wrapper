@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iam.CfnServiceLinkedRoleProps

@CdkDslMarker
public class CfnServiceLinkedRolePropsDsl {
  private val cdkBuilder: CfnServiceLinkedRoleProps.Builder = CfnServiceLinkedRoleProps.builder()

  public fun awsServiceName(awsServiceName: String) {
    cdkBuilder.awsServiceName(awsServiceName)
  }

  public fun customSuffix(customSuffix: String) {
    cdkBuilder.customSuffix(customSuffix)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun build(): CfnServiceLinkedRoleProps = cdkBuilder.build()
}
