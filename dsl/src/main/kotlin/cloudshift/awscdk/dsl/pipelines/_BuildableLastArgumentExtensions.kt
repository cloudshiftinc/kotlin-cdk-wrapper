@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.pipelines

import software.amazon.awscdk.Stage
import software.amazon.awscdk.pipelines.CodePipelineActionFactoryResult
import software.amazon.awscdk.pipelines.CodePipelineSource
import software.amazon.awscdk.pipelines.ConfirmPermissionsBroadening
import software.amazon.awscdk.pipelines.ICodePipelineActionFactory
import software.amazon.awscdk.pipelines.PipelineBase
import software.amazon.awscdk.pipelines.StageDeployment
import software.amazon.awscdk.pipelines.Wave
import software.amazon.awscdk.services.codepipeline.IStage
import kotlin.String
import kotlin.Unit

public inline fun Wave.addStage(stage: Stage, block: AddStageOptsDsl.() -> Unit = {}): StageDeployment {
    val builder = AddStageOptsDsl()
    builder.apply(block)
    return addStage(stage, builder.build())
}

public inline fun ICodePipelineActionFactory.produceAction(
    arg0: IStage,
    block: ProduceActionOptionsDsl.() -> Unit = {},
): CodePipelineActionFactoryResult {
    val builder = ProduceActionOptionsDsl()
    builder.apply(block)
    return produceAction(arg0, builder.build())
}

public inline fun PipelineBase.addStage(stage: Stage, block: AddStageOptsDsl.() -> Unit = {}): StageDeployment {
    val builder = AddStageOptsDsl()
    builder.apply(block)
    return addStage(stage, builder.build())
}

public inline fun PipelineBase.addWave(id: String, block: WaveOptionsDsl.() -> Unit = {}): Wave {
    val builder = WaveOptionsDsl()
    builder.apply(block)
    return addWave(id, builder.build())
}

public inline fun CodePipelineSource.produceAction(
    stage: IStage,
    block: ProduceActionOptionsDsl.() -> Unit = {},
): CodePipelineActionFactoryResult {
    val builder = ProduceActionOptionsDsl()
    builder.apply(block)
    return produceAction(stage, builder.build())
}

public inline fun ConfirmPermissionsBroadening.produceAction(
    stage: IStage,
    block: ProduceActionOptionsDsl.() -> Unit = {},
): CodePipelineActionFactoryResult {
    val builder = ProduceActionOptionsDsl()
    builder.apply(block)
    return produceAction(stage, builder.build())
}
