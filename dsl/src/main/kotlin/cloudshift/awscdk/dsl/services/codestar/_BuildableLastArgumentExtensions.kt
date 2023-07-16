@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codestar

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.codestar.CfnGitHubRepository

public inline fun CfnGitHubRepository.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnGitHubRepository.setCode(block: CfnGitHubRepositoryCodePropertyDsl.() -> Unit =
    {}) {
  val builder = CfnGitHubRepositoryCodePropertyDsl()
  builder.apply(block)
  return setCode(builder.build())
}
