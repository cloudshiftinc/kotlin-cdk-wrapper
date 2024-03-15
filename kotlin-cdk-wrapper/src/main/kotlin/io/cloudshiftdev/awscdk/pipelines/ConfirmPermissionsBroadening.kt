@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.Stage
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.codepipeline.IStage
import io.cloudshiftdev.awscdk.services.sns.ITopic
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Pause the pipeline if a deployment would add IAM permissions or Security Group rules.
 *
 * This step is only supported in CodePipeline pipelines.
 *
 * Example:
 *
 * ```
 * CodePipeline pipeline;
 * MyApplicationStage stage = new MyApplicationStage(this, "MyApplication");
 * pipeline.addStage(stage, AddStageOpts.builder()
 * .pre(List.of(
 * ConfirmPermissionsBroadening.Builder.create("Check").stage(stage).build()))
 * .build());
 * ```
 */
public open class ConfirmPermissionsBroadening internal constructor(
  internal override val cdkObject: software.amazon.awscdk.pipelines.ConfirmPermissionsBroadening,
) : Step(cdkObject), ICodePipelineActionFactory {
  /**
   * Create the desired Action and add it to the pipeline.
   *
   * @param stage 
   * @param options 
   */
  public override fun produceAction(stage: IStage, options: ProduceActionOptions):
      CodePipelineActionFactoryResult = unwrap(this).produceAction(stage.let(IStage::unwrap),
      options.let(ProduceActionOptions::unwrap)).let(CodePipelineActionFactoryResult::wrap)

  /**
   * Create the desired Action and add it to the pipeline.
   *
   * @param stage 
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ee07f43e69cfd8f0f23331f5dcd6cba92444f51437e346ca00f2e5d5a3e0c72e")
  public override fun produceAction(stage: IStage,
      options: ProduceActionOptions.Builder.() -> Unit): CodePipelineActionFactoryResult =
      produceAction(stage, ProduceActionOptions(options))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.pipelines.ConfirmPermissionsBroadening].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Topic to send notifications when a human needs to give manual confirmation.
     *
     * Default: - no notification
     *
     * @param notificationTopic Topic to send notifications when a human needs to give manual
     * confirmation. 
     */
    public fun notificationTopic(notificationTopic: ITopic)

    /**
     * The CDK Stage object to check the stacks of.
     *
     * This should be the same Stage object you are passing to `addStage()`.
     *
     * @param stage The CDK Stage object to check the stacks of. 
     */
    public fun stage(stage: Stage)
  }

  private class BuilderImpl(
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.pipelines.ConfirmPermissionsBroadening.Builder =
        software.amazon.awscdk.pipelines.ConfirmPermissionsBroadening.Builder.create(id)

    /**
     * Topic to send notifications when a human needs to give manual confirmation.
     *
     * Default: - no notification
     *
     * @param notificationTopic Topic to send notifications when a human needs to give manual
     * confirmation. 
     */
    override fun notificationTopic(notificationTopic: ITopic) {
      cdkBuilder.notificationTopic(notificationTopic.let(ITopic::unwrap))
    }

    /**
     * The CDK Stage object to check the stacks of.
     *
     * This should be the same Stage object you are passing to `addStage()`.
     *
     * @param stage The CDK Stage object to check the stacks of. 
     */
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
