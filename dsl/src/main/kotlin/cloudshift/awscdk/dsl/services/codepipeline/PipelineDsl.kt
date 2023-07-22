@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.services.codepipeline.Pipeline
import software.amazon.awscdk.services.codepipeline.StageProps
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.s3.IBucket
import software.constructs.Construct

@CdkDslMarker
public class PipelineDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: Pipeline.Builder = Pipeline.Builder.create(scope, id)

  private val _stages: MutableList<StageProps> = mutableListOf()

  /**
   * The S3 bucket used by this Pipeline to store artifacts.
   *
   * Default: - A new S3 bucket will be created.
   *
   * @param artifactBucket The S3 bucket used by this Pipeline to store artifacts. 
   */
  public fun artifactBucket(artifactBucket: IBucket) {
    cdkBuilder.artifactBucket(artifactBucket)
  }

  /**
   * Create KMS keys for cross-account deployments.
   *
   * This controls whether the pipeline is enabled for cross-account deployments.
   *
   * By default cross-account deployments are enabled, but this feature requires
   * that KMS Customer Master Keys are created which have a cost of $1/month.
   *
   * If you do not need cross-account deployments, you can set this to `false` to
   * not create those keys and save on that cost (the artifact bucket will be
   * encrypted with an AWS-managed key). However, cross-account deployments will
   * no longer be possible.
   *
   * Default: true
   *
   * @param crossAccountKeys Create KMS keys for cross-account deployments. 
   */
  public fun crossAccountKeys(crossAccountKeys: Boolean) {
    cdkBuilder.crossAccountKeys(crossAccountKeys)
  }

  /**
   * A map of region to S3 bucket name used for cross-region CodePipeline.
   *
   * For every Action that you specify targeting a different region than the Pipeline itself,
   * if you don't provide an explicit Bucket for that region using this property,
   * the construct will automatically create a Stack containing an S3 Bucket in that region.
   *
   * Default: - None.
   *
   * @param crossRegionReplicationBuckets A map of region to S3 bucket name used for cross-region
   * CodePipeline. 
   */
  public fun crossRegionReplicationBuckets(crossRegionReplicationBuckets: Map<String, IBucket>) {
    cdkBuilder.crossRegionReplicationBuckets(crossRegionReplicationBuckets)
  }

  /**
   * Enable KMS key rotation for the generated KMS keys.
   *
   * By default KMS key rotation is disabled, but will add an additional $1/month
   * for each year the key exists when enabled.
   *
   * Default: - false (key rotation is disabled)
   *
   * @param enableKeyRotation Enable KMS key rotation for the generated KMS keys. 
   */
  public fun enableKeyRotation(enableKeyRotation: Boolean) {
    cdkBuilder.enableKeyRotation(enableKeyRotation)
  }

  /**
   * Name of the pipeline.
   *
   * Default: - AWS CloudFormation generates an ID and uses that for the pipeline name.
   *
   * @param pipelineName Name of the pipeline. 
   */
  public fun pipelineName(pipelineName: String) {
    cdkBuilder.pipelineName(pipelineName)
  }

  /**
   * Indicates whether to rerun the AWS CodePipeline pipeline after you update it.
   *
   * Default: false
   *
   * @param restartExecutionOnUpdate Indicates whether to rerun the AWS CodePipeline pipeline after
   * you update it. 
   */
  public fun restartExecutionOnUpdate(restartExecutionOnUpdate: Boolean) {
    cdkBuilder.restartExecutionOnUpdate(restartExecutionOnUpdate)
  }

  /**
   * Reuse the same cross region support stack for all pipelines in the App.
   *
   * Default: - true (Use the same support stack for all pipelines in App)
   *
   * @param reuseCrossRegionSupportStacks Reuse the same cross region support stack for all
   * pipelines in the App. 
   */
  public fun reuseCrossRegionSupportStacks(reuseCrossRegionSupportStacks: Boolean) {
    cdkBuilder.reuseCrossRegionSupportStacks(reuseCrossRegionSupportStacks)
  }

  /**
   * The IAM role to be assumed by this Pipeline.
   *
   * Default: a new IAM role will be created.
   *
   * @param role The IAM role to be assumed by this Pipeline. 
   */
  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  /**
   * The list of Stages, in order, to create this Pipeline with.
   *
   * You can always add more Stages later by calling `Pipeline#addStage`.
   *
   * Default: - None.
   *
   * @param stages The list of Stages, in order, to create this Pipeline with. 
   */
  public fun stages(stages: StagePropsDsl.() -> Unit) {
    _stages.add(StagePropsDsl().apply(stages).build())
  }

  /**
   * The list of Stages, in order, to create this Pipeline with.
   *
   * You can always add more Stages later by calling `Pipeline#addStage`.
   *
   * Default: - None.
   *
   * @param stages The list of Stages, in order, to create this Pipeline with. 
   */
  public fun stages(stages: Collection<StageProps>) {
    _stages.addAll(stages)
  }

  public fun build(): Pipeline {
    if(_stages.isNotEmpty()) cdkBuilder.stages(_stages)
    return cdkBuilder.build()
  }
}
