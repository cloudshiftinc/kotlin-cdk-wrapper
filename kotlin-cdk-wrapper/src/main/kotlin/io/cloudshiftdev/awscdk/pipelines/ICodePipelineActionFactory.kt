@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.codepipeline.IStage
import kotlin.Unit
import kotlin.jvm.JvmName

public interface ICodePipelineActionFactory {
  public fun produceAction(arg0: IStage, arg1: ProduceActionOptions):
      CodePipelineActionFactoryResult

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ee07f43e69cfd8f0f23331f5dcd6cba92444f51437e346ca00f2e5d5a3e0c72e")
  public fun produceAction(arg0: IStage, arg1: ProduceActionOptions.Builder.() -> Unit):
      CodePipelineActionFactoryResult

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.pipelines.ICodePipelineActionFactory,
  ) : CdkObject(cdkObject), ICodePipelineActionFactory {
    override fun produceAction(arg0: IStage, arg1: ProduceActionOptions):
        CodePipelineActionFactoryResult = unwrap(this).produceAction(arg0.let(IStage::unwrap),
        arg1.let(ProduceActionOptions::unwrap)).let(CodePipelineActionFactoryResult::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ee07f43e69cfd8f0f23331f5dcd6cba92444f51437e346ca00f2e5d5a3e0c72e")
    override fun produceAction(arg0: IStage, arg1: ProduceActionOptions.Builder.() -> Unit):
        CodePipelineActionFactoryResult = produceAction(arg0, ProduceActionOptions(arg1))
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.ICodePipelineActionFactory):
        ICodePipelineActionFactory = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ICodePipelineActionFactory):
        software.amazon.awscdk.pipelines.ICodePipelineActionFactory = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.pipelines.ICodePipelineActionFactory
  }
}
