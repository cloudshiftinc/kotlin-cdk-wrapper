@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codecommit

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codecommit.CfnRepository
import software.amazon.awscdk.services.codecommit.CfnRepositoryProps
import software.amazon.awscdk.services.codecommit.CodeConfig
import software.amazon.awscdk.services.codecommit.OnCommitOptions
import software.amazon.awscdk.services.codecommit.Repository
import software.amazon.awscdk.services.codecommit.RepositoryNotifyOnOptions
import software.amazon.awscdk.services.codecommit.RepositoryProps
import software.amazon.awscdk.services.codecommit.RepositoryTriggerOptions
import software.constructs.Construct

public object codecommit {
  public inline fun cfnRepository(
    scope: Construct,
    id: String,
    block: CfnRepositoryDsl.() -> Unit = {},
  ): CfnRepository {
    val builder = CfnRepositoryDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRepositoryCodeProperty(block: CfnRepositoryCodePropertyDsl.() -> Unit = {}):
      CfnRepository.CodeProperty {
    val builder = CfnRepositoryCodePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRepositoryProps(block: CfnRepositoryPropsDsl.() -> Unit = {}):
      CfnRepositoryProps {
    val builder = CfnRepositoryPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRepositoryRepositoryTriggerProperty(block: CfnRepositoryRepositoryTriggerPropertyDsl.() -> Unit
      = {}): CfnRepository.RepositoryTriggerProperty {
    val builder = CfnRepositoryRepositoryTriggerPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRepositoryS3Property(block: CfnRepositoryS3PropertyDsl.() -> Unit = {}):
      CfnRepository.S3Property {
    val builder = CfnRepositoryS3PropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun codeConfig(block: CodeConfigDsl.() -> Unit = {}): CodeConfig {
    val builder = CodeConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun onCommitOptions(block: OnCommitOptionsDsl.() -> Unit = {}): OnCommitOptions {
    val builder = OnCommitOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun repository(
    scope: Construct,
    id: String,
    block: RepositoryDsl.() -> Unit = {},
  ): Repository {
    val builder = RepositoryDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun repositoryNotifyOnOptions(block: RepositoryNotifyOnOptionsDsl.() -> Unit = {}):
      RepositoryNotifyOnOptions {
    val builder = RepositoryNotifyOnOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun repositoryProps(block: RepositoryPropsDsl.() -> Unit = {}): RepositoryProps {
    val builder = RepositoryPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun repositoryTriggerOptions(block: RepositoryTriggerOptionsDsl.() -> Unit = {}):
      RepositoryTriggerOptions {
    val builder = RepositoryTriggerOptionsDsl()
    builder.apply(block)
    return builder.build()
  }
}
