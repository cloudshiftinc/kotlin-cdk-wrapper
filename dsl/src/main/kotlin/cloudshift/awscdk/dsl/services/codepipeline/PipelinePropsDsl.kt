@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.services.codepipeline.PipelineProps
import software.amazon.awscdk.services.codepipeline.StageProps
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.s3.IBucket

/**
 * Example:
 *
 * ```
 * PipelineProject project;
 * Repository repository = Repository.Builder.create(this, "MyRepository")
 * .repositoryName("MyRepository")
 * .build();
 * PipelineProject project = new PipelineProject(this, "MyProject");
 * Artifact sourceOutput = new Artifact();
 * CodeCommitSourceAction sourceAction = CodeCommitSourceAction.Builder.create()
 * .actionName("CodeCommit")
 * .repository(repository)
 * .output(sourceOutput)
 * .build();
 * CodeBuildAction buildAction = CodeBuildAction.Builder.create()
 * .actionName("CodeBuild")
 * .project(project)
 * .input(sourceOutput)
 * .outputs(List.of(new Artifact())) // optional
 * .executeBatchBuild(true) // optional, defaults to false
 * .combineBatchBuildArtifacts(true)
 * .build();
 * Pipeline.Builder.create(this, "MyPipeline")
 * .stages(List.of(StageProps.builder()
 * .stageName("Source")
 * .actions(List.of(sourceAction))
 * .build(), StageProps.builder()
 * .stageName("Build")
 * .actions(List.of(buildAction))
 * .build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class PipelinePropsDsl {
  private val cdkBuilder: PipelineProps.Builder = PipelineProps.builder()

  private val _stages: MutableList<StageProps> = mutableListOf()

  /**
   * @param artifactBucket The S3 bucket used by this Pipeline to store artifacts.
   */
  public fun artifactBucket(artifactBucket: IBucket) {
    cdkBuilder.artifactBucket(artifactBucket)
  }

  /**
   * @param crossAccountKeys Create KMS keys for cross-account deployments.
   * This controls whether the pipeline is enabled for cross-account deployments.
   *
   * By default cross-account deployments are enabled, but this feature requires
   * that KMS Customer Master Keys are created which have a cost of $1/month.
   *
   * If you do not need cross-account deployments, you can set this to `false` to
   * not create those keys and save on that cost (the artifact bucket will be
   * encrypted with an AWS-managed key). However, cross-account deployments will
   * no longer be possible.
   */
  public fun crossAccountKeys(crossAccountKeys: Boolean) {
    cdkBuilder.crossAccountKeys(crossAccountKeys)
  }

  /**
   * @param crossRegionReplicationBuckets A map of region to S3 bucket name used for cross-region
   * CodePipeline.
   * For every Action that you specify targeting a different region than the Pipeline itself,
   * if you don't provide an explicit Bucket for that region using this property,
   * the construct will automatically create a Stack containing an S3 Bucket in that region.
   */
  public fun crossRegionReplicationBuckets(crossRegionReplicationBuckets: Map<String, IBucket>) {
    cdkBuilder.crossRegionReplicationBuckets(crossRegionReplicationBuckets)
  }

  /**
   * @param enableKeyRotation Enable KMS key rotation for the generated KMS keys.
   * By default KMS key rotation is disabled, but will add an additional $1/month
   * for each year the key exists when enabled.
   */
  public fun enableKeyRotation(enableKeyRotation: Boolean) {
    cdkBuilder.enableKeyRotation(enableKeyRotation)
  }

  /**
   * @param pipelineName Name of the pipeline.
   */
  public fun pipelineName(pipelineName: String) {
    cdkBuilder.pipelineName(pipelineName)
  }

  /**
   * @param restartExecutionOnUpdate Indicates whether to rerun the AWS CodePipeline pipeline after
   * you update it.
   */
  public fun restartExecutionOnUpdate(restartExecutionOnUpdate: Boolean) {
    cdkBuilder.restartExecutionOnUpdate(restartExecutionOnUpdate)
  }

  /**
   * @param reuseCrossRegionSupportStacks Reuse the same cross region support stack for all
   * pipelines in the App.
   */
  public fun reuseCrossRegionSupportStacks(reuseCrossRegionSupportStacks: Boolean) {
    cdkBuilder.reuseCrossRegionSupportStacks(reuseCrossRegionSupportStacks)
  }

  /**
   * @param role The IAM role to be assumed by this Pipeline.
   */
  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  /**
   * @param stages The list of Stages, in order, to create this Pipeline with.
   * You can always add more Stages later by calling `Pipeline#addStage`.
   */
  public fun stages(stages: StagePropsDsl.() -> Unit) {
    _stages.add(StagePropsDsl().apply(stages).build())
  }

  /**
   * @param stages The list of Stages, in order, to create this Pipeline with.
   * You can always add more Stages later by calling `Pipeline#addStage`.
   */
  public fun stages(stages: Collection<StageProps>) {
    _stages.addAll(stages)
  }

  public fun build(): PipelineProps {
    if(_stages.isNotEmpty()) cdkBuilder.stages(_stages)
    return cdkBuilder.build()
  }
}
