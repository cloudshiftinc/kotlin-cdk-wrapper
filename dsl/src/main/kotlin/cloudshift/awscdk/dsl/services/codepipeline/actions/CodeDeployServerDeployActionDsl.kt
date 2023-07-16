@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline.actions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.codedeploy.IServerDeploymentGroup
import software.amazon.awscdk.services.codepipeline.Artifact
import software.amazon.awscdk.services.codepipeline.actions.CodeDeployServerDeployAction
import software.amazon.awscdk.services.iam.IRole

@CdkDslMarker
public class CodeDeployServerDeployActionDsl {
  private val cdkBuilder: CodeDeployServerDeployAction.Builder =
      CodeDeployServerDeployAction.Builder.create()

  public fun actionName(actionName: String) {
    cdkBuilder.actionName(actionName)
  }

  public fun deploymentGroup(deploymentGroup: IServerDeploymentGroup) {
    cdkBuilder.deploymentGroup(deploymentGroup)
  }

  public fun input(input: Artifact) {
    cdkBuilder.input(input)
  }

  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  public fun runOrder(runOrder: Number) {
    cdkBuilder.runOrder(runOrder)
  }

  public fun variablesNamespace(variablesNamespace: String) {
    cdkBuilder.variablesNamespace(variablesNamespace)
  }

  public fun build(): CodeDeployServerDeployAction = cdkBuilder.build()
}
