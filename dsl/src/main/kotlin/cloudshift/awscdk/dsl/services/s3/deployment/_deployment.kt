@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3.deployment

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.s3.deployment.BucketDeployment
import software.amazon.awscdk.services.s3.deployment.BucketDeploymentProps
import software.amazon.awscdk.services.s3.deployment.DeployTimeSubstitutedFile
import software.amazon.awscdk.services.s3.deployment.DeployTimeSubstitutedFileProps
import software.amazon.awscdk.services.s3.deployment.DeploymentSourceContext
import software.amazon.awscdk.services.s3.deployment.SourceConfig
import software.amazon.awscdk.services.s3.deployment.UserDefinedObjectMetadata
import software.constructs.Construct

public object deployment {
  public inline fun bucketDeployment(
    scope: Construct,
    id: String,
    block: BucketDeploymentDsl.() -> Unit = {},
  ): BucketDeployment {
    val builder = BucketDeploymentDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun bucketDeploymentProps(block: BucketDeploymentPropsDsl.() -> Unit = {}):
      BucketDeploymentProps {
    val builder = BucketDeploymentPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun deployTimeSubstitutedFile(
    scope: Construct,
    id: String,
    block: DeployTimeSubstitutedFileDsl.() -> Unit = {},
  ): DeployTimeSubstitutedFile {
    val builder = DeployTimeSubstitutedFileDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun deployTimeSubstitutedFileProps(block: DeployTimeSubstitutedFilePropsDsl.() -> Unit = {}):
      DeployTimeSubstitutedFileProps {
    val builder = DeployTimeSubstitutedFilePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun deploymentSourceContext(block: DeploymentSourceContextDsl.() -> Unit = {}):
      DeploymentSourceContext {
    val builder = DeploymentSourceContextDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun sourceConfig(block: SourceConfigDsl.() -> Unit = {}): SourceConfig {
    val builder = SourceConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun userDefinedObjectMetadata(block: UserDefinedObjectMetadataDsl.() -> Unit = {}):
      UserDefinedObjectMetadata {
    val builder = UserDefinedObjectMetadataDsl()
    builder.apply(block)
    return builder.build()
  }
}
