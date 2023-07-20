@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iam.CfnServiceLinkedRole
import software.constructs.Construct

@CdkDslMarker
public class CfnServiceLinkedRoleDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnServiceLinkedRole.Builder = CfnServiceLinkedRole.Builder.create(scope,
      id)

  public fun awsServiceName(awsServiceName: String) {
    cdkBuilder.awsServiceName(awsServiceName)
  }

  public fun customSuffix(customSuffix: String) {
    cdkBuilder.customSuffix(customSuffix)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun build(): CfnServiceLinkedRole = cdkBuilder.build()
}
