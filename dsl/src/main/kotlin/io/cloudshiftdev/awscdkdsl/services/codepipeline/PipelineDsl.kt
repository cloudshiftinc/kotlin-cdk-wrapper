@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.codepipeline

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.services.codepipeline.Pipeline
import software.amazon.awscdk.services.codepipeline.PipelineType
import software.amazon.awscdk.services.codepipeline.StageProps
import software.amazon.awscdk.services.codepipeline.TriggerProps
import software.amazon.awscdk.services.codepipeline.Variable
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.s3.IBucket
import software.constructs.Construct

/**
 * An AWS CodePipeline pipeline with its associated IAM role and S3 bucket.
 *
 * Example:
 * ```
 * // create a pipeline
 * import software.amazon.awscdk.services.codecommit.*;
 * // add a source action to the stage
 * Repository repo;
 * Artifact sourceArtifact;
 * Pipeline pipeline = new Pipeline(this, "Pipeline");
 * // add a stage
 * IStage sourceStage = pipeline.addStage(StageOptions.builder().stageName("Source").build());
 * sourceStage.addAction(CodeCommitSourceAction.Builder.create()
 * .actionName("Source")
 * .output(sourceArtifact)
 * .repository(repo)
 * .build());
 * ```
 */
@CdkDslMarker
public class PipelineDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: Pipeline.Builder = Pipeline.Builder.create(scope, id)

    private val _stages: MutableList<StageProps> = mutableListOf()

    private val _triggers: MutableList<TriggerProps> = mutableListOf()

    private val _variables: MutableList<Variable> = mutableListOf()

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
     * By default cross-account deployments are enabled, but this feature requires that KMS Customer
     * Master Keys are created which have a cost of $1/month.
     *
     * If you do not need cross-account deployments, you can set this to `false` to not create those
     * keys and save on that cost (the artifact bucket will be encrypted with an AWS-managed key).
     * However, cross-account deployments will no longer be possible.
     *
     * Default: false - false if the feature flag
     * `CODEPIPELINE_CROSS_ACCOUNT_KEYS_DEFAULT_VALUE_TO_FALSE` is true, true otherwise
     *
     * @param crossAccountKeys Create KMS keys for cross-account deployments.
     */
    public fun crossAccountKeys(crossAccountKeys: Boolean) {
        cdkBuilder.crossAccountKeys(crossAccountKeys)
    }

    /**
     * A map of region to S3 bucket name used for cross-region CodePipeline.
     *
     * For every Action that you specify targeting a different region than the Pipeline itself, if
     * you don't provide an explicit Bucket for that region using this property, the construct will
     * automatically create a Stack containing an S3 Bucket in that region.
     *
     * Default: - None.
     *
     * @param crossRegionReplicationBuckets A map of region to S3 bucket name used for cross-region
     *   CodePipeline.
     */
    public fun crossRegionReplicationBuckets(crossRegionReplicationBuckets: Map<String, IBucket>) {
        cdkBuilder.crossRegionReplicationBuckets(crossRegionReplicationBuckets)
    }

    /**
     * Enable KMS key rotation for the generated KMS keys.
     *
     * By default KMS key rotation is disabled, but will add an additional $1/month for each year
     * the key exists when enabled.
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
     * Type of the pipeline.
     *
     * Default: - PipelineType.V1
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/pipeline-types-planning.html)
     *
     * @param pipelineType Type of the pipeline.
     */
    public fun pipelineType(pipelineType: PipelineType) {
        cdkBuilder.pipelineType(pipelineType)
    }

    /**
     * Indicates whether to rerun the AWS CodePipeline pipeline after you update it.
     *
     * Default: false
     *
     * @param restartExecutionOnUpdate Indicates whether to rerun the AWS CodePipeline pipeline
     *   after you update it.
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
     *   pipelines in the App.
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

    /**
     * The trigger configuration specifying a type of event, such as Git tags, that starts the
     * pipeline.
     *
     * When a trigger configuration is specified, default change detection for repository and branch
     * commits is disabled.
     *
     * `triggers` can only be used when `pipelineType` is set to `PipelineType.V2`. You can always
     * add more triggers later by calling `Pipeline#addTrigger`.
     *
     * Default: - No triggers
     *
     * @param triggers The trigger configuration specifying a type of event, such as Git tags, that
     *   starts the pipeline.
     */
    public fun triggers(triggers: TriggerPropsDsl.() -> Unit) {
        _triggers.add(TriggerPropsDsl().apply(triggers).build())
    }

    /**
     * The trigger configuration specifying a type of event, such as Git tags, that starts the
     * pipeline.
     *
     * When a trigger configuration is specified, default change detection for repository and branch
     * commits is disabled.
     *
     * `triggers` can only be used when `pipelineType` is set to `PipelineType.V2`. You can always
     * add more triggers later by calling `Pipeline#addTrigger`.
     *
     * Default: - No triggers
     *
     * @param triggers The trigger configuration specifying a type of event, such as Git tags, that
     *   starts the pipeline.
     */
    public fun triggers(triggers: Collection<TriggerProps>) {
        _triggers.addAll(triggers)
    }

    /**
     * A list that defines the pipeline variables for a pipeline resource.
     *
     * `variables` can only be used when `pipelineType` is set to `PipelineType.V2`. You can always
     * add more variables later by calling `Pipeline#addVariable`.
     *
     * Default: - No variables
     *
     * @param variables A list that defines the pipeline variables for a pipeline resource.
     */
    public fun variables(variables: VariableDsl.() -> Unit) {
        _variables.add(VariableDsl().apply(variables).build())
    }

    /**
     * A list that defines the pipeline variables for a pipeline resource.
     *
     * `variables` can only be used when `pipelineType` is set to `PipelineType.V2`. You can always
     * add more variables later by calling `Pipeline#addVariable`.
     *
     * Default: - No variables
     *
     * @param variables A list that defines the pipeline variables for a pipeline resource.
     */
    public fun variables(variables: Collection<Variable>) {
        _variables.addAll(variables)
    }

    public fun build(): Pipeline {
        if (_stages.isNotEmpty()) cdkBuilder.stages(_stages)
        if (_triggers.isNotEmpty()) cdkBuilder.triggers(_triggers)
        if (_variables.isNotEmpty()) cdkBuilder.variables(_variables)
        return cdkBuilder.build()
    }
}
