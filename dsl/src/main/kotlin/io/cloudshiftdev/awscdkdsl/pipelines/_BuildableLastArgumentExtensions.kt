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

package io.cloudshiftdev.awscdkdsl.pipelines

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.Stage
import software.amazon.awscdk.pipelines.CodePipelineActionFactoryResult
import software.amazon.awscdk.pipelines.CodePipelineSource
import software.amazon.awscdk.pipelines.ConfirmPermissionsBroadening
import software.amazon.awscdk.pipelines.ICodePipelineActionFactory
import software.amazon.awscdk.pipelines.PipelineBase
import software.amazon.awscdk.pipelines.StageDeployment
import software.amazon.awscdk.pipelines.Wave
import software.amazon.awscdk.services.codepipeline.IStage

/**
 * Create the desired Action and add it to the pipeline.
 *
 * @param stage
 * @param options
 */
public inline fun CodePipelineSource.produceAction(
    stage: IStage,
    block: ProduceActionOptionsDsl.() -> Unit = {}
): CodePipelineActionFactoryResult {
    val builder = ProduceActionOptionsDsl()
    builder.apply(block)
    return produceAction(stage, builder.build())
}

/**
 * Create the desired Action and add it to the pipeline.
 *
 * @param stage
 * @param options
 */
public inline fun ConfirmPermissionsBroadening.produceAction(
    stage: IStage,
    block: ProduceActionOptionsDsl.() -> Unit = {}
): CodePipelineActionFactoryResult {
    val builder = ProduceActionOptionsDsl()
    builder.apply(block)
    return produceAction(stage, builder.build())
}

/**
 * Create the desired Action and add it to the pipeline.
 *
 * @param stage
 * @param options
 */
public inline fun ICodePipelineActionFactory.produceAction(
    arg0: IStage,
    block: ProduceActionOptionsDsl.() -> Unit = {}
): CodePipelineActionFactoryResult {
    val builder = ProduceActionOptionsDsl()
    builder.apply(block)
    return produceAction(arg0, builder.build())
}

/**
 * Deploy a single Stage by itself.
 *
 * Add a Stage to the pipeline, to be deployed in sequence with other Stages added to the pipeline.
 * All Stacks in the stage will be deployed in an order automatically determined by their relative
 * dependencies.
 *
 * @param stage
 * @param options
 */
public inline fun PipelineBase.addStage(
    stage: Stage,
    block: AddStageOptsDsl.() -> Unit = {}
): StageDeployment {
    val builder = AddStageOptsDsl()
    builder.apply(block)
    return addStage(stage, builder.build())
}

/**
 * Add a Wave to the pipeline, for deploying multiple Stages in parallel.
 *
 * Use the return object of this method to deploy multiple stages in parallel.
 *
 * Example:
 * ```
 * CodePipeline pipeline;
 * Wave wave = pipeline.addWave("MyWave");
 * wave.addStage(new MyApplicationStage(this, "Stage1"));
 * wave.addStage(new MyApplicationStage(this, "Stage2"));
 * ```
 *
 * @param id
 * @param options
 */
public inline fun PipelineBase.addWave(id: String, block: WaveOptionsDsl.() -> Unit = {}): Wave {
    val builder = WaveOptionsDsl()
    builder.apply(block)
    return addWave(id, builder.build())
}

/**
 * Add a Stage to this wave.
 *
 * It will be deployed in parallel with all other stages in this wave.
 *
 * @param stage
 * @param options
 */
public inline fun Wave.addStage(
    stage: Stage,
    block: AddStageOptsDsl.() -> Unit = {}
): StageDeployment {
    val builder = AddStageOptsDsl()
    builder.apply(block)
    return addStage(stage, builder.build())
}
