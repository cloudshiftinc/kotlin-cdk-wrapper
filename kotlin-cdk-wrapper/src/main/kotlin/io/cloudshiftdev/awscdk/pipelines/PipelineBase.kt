@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.Stage
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.Construct
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * A generic CDK Pipelines pipeline.
 *
 * Different deployment systems will provide subclasses of `Pipeline` that generate
 * the deployment infrastructure necessary to deploy CDK apps, specific to that system.
 *
 * This library comes with the `CodePipeline` class, which uses AWS CodePipeline
 * to deploy CDK apps.
 *
 * The actual pipeline infrastructure is constructed (by invoking the engine)
 * when `buildPipeline()` is called, or when `app.synth()` is called (whichever
 * happens first).
 */
public abstract class PipelineBase internal constructor(
  internal override val cdkObject: software.amazon.awscdk.pipelines.PipelineBase,
) : Construct(cdkObject) {
  /**
   * Deploy a single Stage by itself.
   *
   * Add a Stage to the pipeline, to be deployed in sequence with other
   * Stages added to the pipeline. All Stacks in the stage will be deployed
   * in an order automatically determined by their relative dependencies.
   *
   * @param stage 
   * @param options
   */
  public open fun addStage(stage: Stage): StageDeployment =
      unwrap(this).addStage(stage.let(Stage::unwrap)).let(StageDeployment::wrap)

  /**
   * Deploy a single Stage by itself.
   *
   * Add a Stage to the pipeline, to be deployed in sequence with other
   * Stages added to the pipeline. All Stacks in the stage will be deployed
   * in an order automatically determined by their relative dependencies.
   *
   * @param stage 
   * @param options
   */
  public open fun addStage(stage: Stage, options: AddStageOpts): StageDeployment =
      unwrap(this).addStage(stage.let(Stage::unwrap),
      options.let(AddStageOpts::unwrap)).let(StageDeployment::wrap)

  /**
   * Deploy a single Stage by itself.
   *
   * Add a Stage to the pipeline, to be deployed in sequence with other
   * Stages added to the pipeline. All Stacks in the stage will be deployed
   * in an order automatically determined by their relative dependencies.
   *
   * @param stage 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0fa9b46549453fb89fc25b448db9f58d0867fa3f295e60b93e224794fbb20090")
  public open fun addStage(stage: Stage, options: AddStageOpts.Builder.() -> Unit): StageDeployment
      = addStage(stage, AddStageOpts(options))

  /**
   * Add a Wave to the pipeline, for deploying multiple Stages in parallel.
   *
   * Use the return object of this method to deploy multiple stages in parallel.
   *
   * Example:
   *
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
  public open fun addWave(id: String): Wave = unwrap(this).addWave(id).let(Wave::wrap)

  /**
   * Add a Wave to the pipeline, for deploying multiple Stages in parallel.
   *
   * Use the return object of this method to deploy multiple stages in parallel.
   *
   * Example:
   *
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
  public open fun addWave(id: String, options: WaveOptions): Wave = unwrap(this).addWave(id,
      options.let(WaveOptions::unwrap)).let(Wave::wrap)

  /**
   * Add a Wave to the pipeline, for deploying multiple Stages in parallel.
   *
   * Use the return object of this method to deploy multiple stages in parallel.
   *
   * Example:
   *
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
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("99f80b2e0b157ed29a5b0af296469456992dab6bc2206d77ac893d8563bf29a3")
  public open fun addWave(id: String, options: WaveOptions.Builder.() -> Unit): Wave = addWave(id,
      WaveOptions(options))

  /**
   * Send the current pipeline definition to the engine, and construct the pipeline.
   *
   * It is not possible to modify the pipeline after calling this method.
   */
  public open fun buildPipeline() {
    unwrap(this).buildPipeline()
  }

  /**
   * The FileSet tha contains the cloud assembly.
   *
   * This is the primary output of the synth step.
   */
  public open fun cloudAssemblyFileSet(): FileSet =
      unwrap(this).getCloudAssemblyFileSet().let(FileSet::wrap)

  /**
   * The build step that produces the CDK Cloud Assembly.
   */
  public open fun synth(): IFileSetProducer = unwrap(this).getSynth().let(IFileSetProducer::wrap)

  /**
   * The waves in this pipeline.
   */
  public open fun waves(): List<Wave> = unwrap(this).getWaves().map(Wave::wrap)

  public companion object {
    public fun isPipeline(x: Any): Boolean =
        software.amazon.awscdk.pipelines.PipelineBase.isPipeline(x)

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.PipelineBase): PipelineBase =
        CdkObjectWrappers.wrap(cdkObject) as PipelineBase

    internal fun unwrap(wrapped: PipelineBase): software.amazon.awscdk.pipelines.PipelineBase =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.pipelines.PipelineBase
  }
}
