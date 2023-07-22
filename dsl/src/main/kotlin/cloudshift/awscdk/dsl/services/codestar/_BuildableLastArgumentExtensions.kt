@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codestar

import kotlin.Unit
import software.amazon.awscdk.services.codestar.CfnGitHubRepository

/**
 * Information about code to be committed to a repository after it is created in an AWS
 * CloudFormation stack.
 */
public inline fun CfnGitHubRepository.setCode(block: CfnGitHubRepositoryCodePropertyDsl.() -> Unit =
    {}) {
  val builder = CfnGitHubRepositoryCodePropertyDsl()
  builder.apply(block)
  return setCode(builder.build())
}
