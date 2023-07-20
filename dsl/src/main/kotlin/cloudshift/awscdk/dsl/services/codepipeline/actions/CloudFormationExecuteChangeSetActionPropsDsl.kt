@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline.actions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.codepipeline.Artifact
import software.amazon.awscdk.services.codepipeline.actions.CloudFormationExecuteChangeSetActionProps
import software.amazon.awscdk.services.iam.IRole

@CdkDslMarker
public class CloudFormationExecuteChangeSetActionPropsDsl {
  private val cdkBuilder: CloudFormationExecuteChangeSetActionProps.Builder =
      CloudFormationExecuteChangeSetActionProps.builder()

  public fun account(account: String) {
    cdkBuilder.account(account)
  }

  public fun actionName(actionName: String) {
    cdkBuilder.actionName(actionName)
  }

  public fun changeSetName(changeSetName: String) {
    cdkBuilder.changeSetName(changeSetName)
  }

  public fun output(output: Artifact) {
    cdkBuilder.output(output)
  }

  public fun outputFileName(outputFileName: String) {
    cdkBuilder.outputFileName(outputFileName)
  }

  public fun region(region: String) {
    cdkBuilder.region(region)
  }

  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  public fun runOrder(runOrder: Number) {
    cdkBuilder.runOrder(runOrder)
  }

  public fun stackName(stackName: String) {
    cdkBuilder.stackName(stackName)
  }

  public fun variablesNamespace(variablesNamespace: String) {
    cdkBuilder.variablesNamespace(variablesNamespace)
  }

  public fun build(): CloudFormationExecuteChangeSetActionProps = cdkBuilder.build()
}
