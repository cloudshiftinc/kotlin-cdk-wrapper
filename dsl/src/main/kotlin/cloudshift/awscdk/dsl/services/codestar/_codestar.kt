@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codestar

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codestar.CfnGitHubRepository
import software.amazon.awscdk.services.codestar.CfnGitHubRepositoryProps
import software.constructs.Construct

public object codestar {
  public inline fun cfnGitHubRepository(
    scope: Construct,
    id: String,
    block: CfnGitHubRepositoryDsl.() -> Unit = {},
  ): CfnGitHubRepository {
    val builder = CfnGitHubRepositoryDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnGitHubRepositoryCodeProperty(block: CfnGitHubRepositoryCodePropertyDsl.() -> Unit =
      {}): CfnGitHubRepository.CodeProperty {
    val builder = CfnGitHubRepositoryCodePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnGitHubRepositoryProps(block: CfnGitHubRepositoryPropsDsl.() -> Unit = {}):
      CfnGitHubRepositoryProps {
    val builder = CfnGitHubRepositoryPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnGitHubRepositoryS3Property(block: CfnGitHubRepositoryS3PropertyDsl.() -> Unit
      = {}): CfnGitHubRepository.S3Property {
    val builder = CfnGitHubRepositoryS3PropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
