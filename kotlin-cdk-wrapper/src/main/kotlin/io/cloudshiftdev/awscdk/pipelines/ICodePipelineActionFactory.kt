@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.codepipeline.IStage
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Factory for explicit CodePipeline Actions.
 *
 * If you have specific types of Actions you want to add to a
 * CodePipeline, write a subclass of `Step` that implements this
 * interface, and add the action or actions you want in the `produce` method.
 *
 * There needs to be a level of indirection here, because some aspects of the
 * Action creation need to be controlled by the workflow engine (name and
 * runOrder). All the rest of the properties are controlled by the factory.
 */
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
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ee07f43e69cfd8f0f23331f5dcd6cba92444f51437e346ca00f2e5d5a3e0c72e")
  public fun produceAction(stage: IStage, options: ProduceActionOptions.Builder.() -> Unit):
      CodePipelineActionFactoryResult

  private class Wrapper(
    cdkObject: software.amazon.awscdk.pipelines.ICodePipelineActionFactory,
  ) : CdkObject(cdkObject),
      ICodePipelineActionFactory {
    /**
     * Create the desired Action and add it to the pipeline.
     *
     * @param stage 
     * @param options 
     */
    override fun produceAction(stage: IStage, options: ProduceActionOptions):
        CodePipelineActionFactoryResult =
        unwrap(this).produceAction(stage.let(IStage.Companion::unwrap),
        options.let(ProduceActionOptions.Companion::unwrap)).let(CodePipelineActionFactoryResult::wrap)

    /**
     * Create the desired Action and add it to the pipeline.
     *
     * @param stage 
     * @param options 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ee07f43e69cfd8f0f23331f5dcd6cba92444f51437e346ca00f2e5d5a3e0c72e")
    override fun produceAction(stage: IStage, options: ProduceActionOptions.Builder.() -> Unit):
        CodePipelineActionFactoryResult = produceAction(stage, ProduceActionOptions(options))
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.ICodePipelineActionFactory):
        ICodePipelineActionFactory = CdkObjectWrappers.wrap(cdkObject) as?
        ICodePipelineActionFactory ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ICodePipelineActionFactory):
        software.amazon.awscdk.pipelines.ICodePipelineActionFactory = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.pipelines.ICodePipelineActionFactory
  }
}
