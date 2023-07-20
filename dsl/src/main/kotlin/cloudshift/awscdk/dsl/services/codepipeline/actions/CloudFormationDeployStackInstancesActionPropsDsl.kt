@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline.actions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackInstancesActionProps
import software.amazon.awscdk.services.codepipeline.actions.StackInstances
import software.amazon.awscdk.services.codepipeline.actions.StackSetParameters
import software.amazon.awscdk.services.iam.IRole

@CdkDslMarker
public class CloudFormationDeployStackInstancesActionPropsDsl {
  private val cdkBuilder: CloudFormationDeployStackInstancesActionProps.Builder =
      CloudFormationDeployStackInstancesActionProps.builder()

  public fun actionName(actionName: String) {
    cdkBuilder.actionName(actionName)
  }

  public fun failureTolerancePercentage(failureTolerancePercentage: Number) {
    cdkBuilder.failureTolerancePercentage(failureTolerancePercentage)
  }

  public fun maxAccountConcurrencyPercentage(maxAccountConcurrencyPercentage: Number) {
    cdkBuilder.maxAccountConcurrencyPercentage(maxAccountConcurrencyPercentage)
  }

  public fun parameterOverrides(parameterOverrides: StackSetParameters) {
    cdkBuilder.parameterOverrides(parameterOverrides)
  }

  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  public fun runOrder(runOrder: Number) {
    cdkBuilder.runOrder(runOrder)
  }

  public fun stackInstances(stackInstances: StackInstances) {
    cdkBuilder.stackInstances(stackInstances)
  }

  public fun stackSetName(stackSetName: String) {
    cdkBuilder.stackSetName(stackSetName)
  }

  public fun stackSetRegion(stackSetRegion: String) {
    cdkBuilder.stackSetRegion(stackSetRegion)
  }

  public fun variablesNamespace(variablesNamespace: String) {
    cdkBuilder.variablesNamespace(variablesNamespace)
  }

  public fun build(): CloudFormationDeployStackInstancesActionProps = cdkBuilder.build()
}
