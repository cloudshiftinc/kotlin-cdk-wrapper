@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.pipelines

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.Stage
import software.amazon.awscdk.pipelines.CodePipeline
import software.amazon.awscdk.pipelines.CodePipelineActionFactoryResult
import software.amazon.awscdk.pipelines.ConfirmPermissionsBroadening
import software.amazon.awscdk.pipelines.StageDeployment
import software.amazon.awscdk.pipelines.Wave
import software.amazon.awscdk.services.codepipeline.IStage

public inline fun CodePipeline.addStage(arg0: Stage, block: AddStageOptsDsl.() -> Unit = {}):
    StageDeployment {
  val builder = AddStageOptsDsl()
  builder.apply(block)
  return addStage(arg0,builder.build())
}

public inline fun CodePipeline.addWave(arg0: String, block: WaveOptionsDsl.() -> Unit = {}): Wave {
  val builder = WaveOptionsDsl()
  builder.apply(block)
  return addWave(arg0,builder.build())
}

public inline fun ConfirmPermissionsBroadening.produceAction(arg0: IStage,
    block: ProduceActionOptionsDsl.() -> Unit = {}): CodePipelineActionFactoryResult {
  val builder = ProduceActionOptionsDsl()
  builder.apply(block)
  return produceAction(arg0,builder.build())
}

public inline fun Wave.addStage(arg0: Stage, block: AddStageOptsDsl.() -> Unit = {}):
    StageDeployment {
  val builder = AddStageOptsDsl()
  builder.apply(block)
  return addStage(arg0,builder.build())
}
