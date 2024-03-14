package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.services.codepipeline.IStage
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface ICodePipelineActionFactory {
  /**
   * Create the desired Action and add it to the pipeline.
   *
   * @param stage 
   * @param options 
   */
  public fun produceAction(stage: IStage, options: ProduceActionOptions):
      CodePipelineActionFactoryResult

  /**
   * Create the desired Action and add it to the pipeline.
   *
   * @param stage 
   * @param options 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ee07f43e69cfd8f0f23331f5dcd6cba92444f51437e346ca00f2e5d5a3e0c72e")
  public fun produceAction(stage: IStage, options: ProduceActionOptions.Builder.() -> Unit):
      CodePipelineActionFactoryResult

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.pipelines.ICodePipelineActionFactory,
  ) : CdkObject(cdkObject), ICodePipelineActionFactory {
    /**
     * Create the desired Action and add it to the pipeline.
     *
     * @param stage 
     * @param options 
     */
    override fun produceAction(stage: IStage, options: ProduceActionOptions):
        CodePipelineActionFactoryResult = unwrap(this).produceAction(stage.let(IStage::unwrap),
        options.let(ProduceActionOptions::unwrap)).let(CodePipelineActionFactoryResult::wrap)

    /**
     * Create the desired Action and add it to the pipeline.
     *
     * @param stage 
     * @param options 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ee07f43e69cfd8f0f23331f5dcd6cba92444f51437e346ca00f2e5d5a3e0c72e")
    override fun produceAction(stage: IStage, options: ProduceActionOptions.Builder.() -> Unit):
        CodePipelineActionFactoryResult = produceAction(stage, ProduceActionOptions(options))
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.ICodePipelineActionFactory):
        ICodePipelineActionFactory = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ICodePipelineActionFactory):
        software.amazon.awscdk.pipelines.ICodePipelineActionFactory = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.pipelines.ICodePipelineActionFactory
  }
}
