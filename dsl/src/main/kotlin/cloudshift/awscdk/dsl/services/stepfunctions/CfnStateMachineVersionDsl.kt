@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.stepfunctions.CfnStateMachineVersion
import software.constructs.Construct

@CdkDslMarker
public class CfnStateMachineVersionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnStateMachineVersion.Builder =
      CfnStateMachineVersion.Builder.create(scope, id)

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun stateMachineArn(stateMachineArn: String) {
    cdkBuilder.stateMachineArn(stateMachineArn)
  }

  public fun stateMachineRevisionId(stateMachineRevisionId: String) {
    cdkBuilder.stateMachineRevisionId(stateMachineRevisionId)
  }

  public fun build(): CfnStateMachineVersion = cdkBuilder.build()
}
