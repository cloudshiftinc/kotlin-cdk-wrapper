@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline.actions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codepipeline.actions.SelfManagedDeploymentProps
import software.amazon.awscdk.services.iam.IRole

@CdkDslMarker
public class SelfManagedDeploymentPropsDsl {
  private val cdkBuilder: SelfManagedDeploymentProps.Builder = SelfManagedDeploymentProps.builder()

  /**
   * @param administrationRole The IAM role in the administrator account used to assume execution
   * roles in the target accounts.
   * You must create this role before using the StackSet action.
   *
   * The role needs to be assumable by CloudFormation, and it needs to be able
   * to `sts:AssumeRole` each of the execution roles (whose names are specified
   * in the `executionRoleName` parameter) in each of the target accounts.
   *
   * If you do not specify the role, we assume you have created a role named
   * `AWSCloudFormationStackSetAdministrationRole`.
   */
  public fun administrationRole(administrationRole: IRole) {
    cdkBuilder.administrationRole(administrationRole)
  }

  /**
   * @param executionRoleName The name of the IAM role in the target accounts used to perform stack
   * set operations.
   * You must create these roles in each of the target accounts before using the
   * StackSet action.
   *
   * The roles need to be assumable by by the `administrationRole`, and need to
   * have the permissions necessary to successfully create and modify the
   * resources that the subsequent CloudFormation deployments need.
   * Administrator permissions would be commonly granted to these, but if you can
   * scope the permissions down frome there you would be safer.
   */
  public fun executionRoleName(executionRoleName: String) {
    cdkBuilder.executionRoleName(executionRoleName)
  }

  public fun build(): SelfManagedDeploymentProps = cdkBuilder.build()
}
