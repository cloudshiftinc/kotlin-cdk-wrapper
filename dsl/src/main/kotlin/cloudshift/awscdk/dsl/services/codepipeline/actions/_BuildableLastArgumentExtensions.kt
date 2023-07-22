@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline.actions

import cloudshift.awscdk.dsl.services.iam.PolicyStatementDsl
import kotlin.Boolean
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.actions.CloudFormationCreateReplaceChangeSetAction
import software.amazon.awscdk.services.codepipeline.actions.CloudFormationCreateUpdateStackAction
import software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeleteStackAction

/**
 * Add statement to the service role assumed by CloudFormation while executing this action.
 *
 * @param statement 
 */
public inline
    fun CloudFormationDeleteStackAction.addToDeploymentRolePolicy(block: PolicyStatementDsl.() -> Unit
    = {}): Boolean {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToDeploymentRolePolicy(builder.build())
}

/**
 * Add statement to the service role assumed by CloudFormation while executing this action.
 *
 * @param statement 
 */
public inline
    fun CloudFormationCreateReplaceChangeSetAction.addToDeploymentRolePolicy(block: PolicyStatementDsl.() -> Unit
    = {}): Boolean {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToDeploymentRolePolicy(builder.build())
}

/**
 * Add statement to the service role assumed by CloudFormation while executing this action.
 *
 * @param statement 
 */
public inline
    fun CloudFormationCreateUpdateStackAction.addToDeploymentRolePolicy(block: PolicyStatementDsl.() -> Unit
    = {}): Boolean {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToDeploymentRolePolicy(builder.build())
}
