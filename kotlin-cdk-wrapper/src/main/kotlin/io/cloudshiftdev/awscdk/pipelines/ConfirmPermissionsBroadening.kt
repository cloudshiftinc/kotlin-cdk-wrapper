@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.Stage
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.codepipeline.IStage
import io.cloudshiftdev.awscdk.services.sns.ITopic
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public open class ConfirmPermissionsBroadening internal constructor(
  internal override val cdkObject: software.amazon.awscdk.pipelines.ConfirmPermissionsBroadening,
) : Step(cdkObject), ICodePipelineActionFactory {
  public override fun produceAction(stage: IStage, options: ProduceActionOptions):
      CodePipelineActionFactoryResult = unwrap(this).produceAction(stage.let(IStage::unwrap),
      options.let(ProduceActionOptions::unwrap)).let(CodePipelineActionFactoryResult::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ee07f43e69cfd8f0f23331f5dcd6cba92444f51437e346ca00f2e5d5a3e0c72e")
  public override fun produceAction(stage: IStage,
      options: ProduceActionOptions.Builder.() -> Unit): CodePipelineActionFactoryResult =
      produceAction(stage, ProduceActionOptions(options))

  @CdkDslMarker
  public interface Builder {
    public fun notificationTopic(notificationTopic: ITopic)

    public fun stage(stage: Stage)
  }

  private class BuilderImpl(
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.pipelines.ConfirmPermissionsBroadening.Builder =
        software.amazon.awscdk.pipelines.ConfirmPermissionsBroadening.Builder.create(id)

    override fun notificationTopic(notificationTopic: ITopic) {
      cdkBuilder.notificationTopic(notificationTopic.let(ITopic::unwrap))
    }

    override fun stage(stage: Stage) {
      cdkBuilder.stage(stage.let(Stage::unwrap))
    }

    public fun build(): software.amazon.awscdk.pipelines.ConfirmPermissionsBroadening =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(id: String, block: Builder.() -> Unit = {}):
        ConfirmPermissionsBroadening {
      val builderImpl = BuilderImpl(id)
      return ConfirmPermissionsBroadening(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.ConfirmPermissionsBroadening):
        ConfirmPermissionsBroadening = ConfirmPermissionsBroadening(cdkObject)

    internal fun unwrap(wrapped: ConfirmPermissionsBroadening):
        software.amazon.awscdk.pipelines.ConfirmPermissionsBroadening = wrapped.cdkObject
  }
}
