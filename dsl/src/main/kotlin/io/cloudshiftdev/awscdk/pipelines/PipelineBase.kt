package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.Stage
import io.cloudshiftdev.constructs.Construct
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public abstract class PipelineBase internal constructor(
  private val cdkObject: software.amazon.awscdk.pipelines.PipelineBase,
) : Construct(cdkObject) {
  public open fun addStage(stage: Stage): StageDeployment =
      unwrap(this).addStage(stage.let(Stage::unwrap)).let(StageDeployment::wrap)

  public open fun addStage(stage: Stage, options: AddStageOpts): StageDeployment =
      unwrap(this).addStage(stage.let(Stage::unwrap),
      options.let(AddStageOpts::unwrap)).let(StageDeployment::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0fa9b46549453fb89fc25b448db9f58d0867fa3f295e60b93e224794fbb20090")
  public open fun addStage(stage: Stage, options: AddStageOpts.Builder.() -> Unit): StageDeployment
      = addStage(stage, AddStageOpts(options))

  public open fun addWave(id: String): Wave = unwrap(this).addWave(id).let(Wave::wrap)

  public open fun addWave(id: String, options: WaveOptions): Wave = unwrap(this).addWave(id,
      options.let(WaveOptions::unwrap)).let(Wave::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("99f80b2e0b157ed29a5b0af296469456992dab6bc2206d77ac893d8563bf29a3")
  public open fun addWave(id: String, options: WaveOptions.Builder.() -> Unit): Wave = addWave(id,
      WaveOptions(options))

  public open fun buildPipeline() {
    unwrap(this).buildPipeline()
  }

  public open fun cloudAssemblyFileSet(): FileSet =
      unwrap(this).getCloudAssemblyFileSet().let(FileSet::wrap)

  public open fun synth(): IFileSetProducer = unwrap(this).getSynth().let(IFileSetProducer::wrap)

  public open fun waves(): List<Wave> = unwrap(this).getWaves().map(Wave::wrap)

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.pipelines.PipelineBase,
  ) : PipelineBase(cdkObject)

  public companion object {
    public open fun isPipeline(x: Any): Boolean =
        software.amazon.awscdk.pipelines.PipelineBase.isPipeline(x)

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.PipelineBase): PipelineBase =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: PipelineBase): software.amazon.awscdk.pipelines.PipelineBase =
        (wrapped as Wrapper).cdkObject
  }
}
