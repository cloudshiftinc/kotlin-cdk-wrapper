@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.Stage
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.sns.ITopic
import kotlin.Unit

/**
 * Properties for a `PermissionsBroadeningCheck`.
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
public interface PermissionsBroadeningCheckProps {
  /**
   * Topic to send notifications when a human needs to give manual confirmation.
   *
   * Default: - no notification
   */
  public fun notificationTopic(): ITopic? = unwrap(this).getNotificationTopic()?.let(ITopic::wrap)

  /**
   * The CDK Stage object to check the stacks of.
   *
   * This should be the same Stage object you are passing to `addStage()`.
   */
  public fun stage(): Stage

  /**
   * A builder for [PermissionsBroadeningCheckProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param notificationTopic Topic to send notifications when a human needs to give manual
     * confirmation.
     */
    public fun notificationTopic(notificationTopic: ITopic)

    /**
     * @param stage The CDK Stage object to check the stacks of. 
     * This should be the same Stage object you are passing to `addStage()`.
     */
    public fun stage(stage: Stage)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.pipelines.PermissionsBroadeningCheckProps.Builder
        = software.amazon.awscdk.pipelines.PermissionsBroadeningCheckProps.builder()

    /**
     * @param notificationTopic Topic to send notifications when a human needs to give manual
     * confirmation.
     */
    override fun notificationTopic(notificationTopic: ITopic) {
      cdkBuilder.notificationTopic(notificationTopic.let(ITopic.Companion::unwrap))
    }

    /**
     * @param stage The CDK Stage object to check the stacks of. 
     * This should be the same Stage object you are passing to `addStage()`.
     */
    override fun stage(stage: Stage) {
      cdkBuilder.stage(stage.let(Stage.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.pipelines.PermissionsBroadeningCheckProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.pipelines.PermissionsBroadeningCheckProps,
  ) : CdkObject(cdkObject), PermissionsBroadeningCheckProps {
    /**
     * Topic to send notifications when a human needs to give manual confirmation.
     *
     * Default: - no notification
     */
    override fun notificationTopic(): ITopic? =
        unwrap(this).getNotificationTopic()?.let(ITopic::wrap)

    /**
     * The CDK Stage object to check the stacks of.
     *
     * This should be the same Stage object you are passing to `addStage()`.
     */
    override fun stage(): Stage = unwrap(this).getStage().let(Stage::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): PermissionsBroadeningCheckProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.PermissionsBroadeningCheckProps):
        PermissionsBroadeningCheckProps = CdkObjectWrappers.wrap(cdkObject) as?
        PermissionsBroadeningCheckProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: PermissionsBroadeningCheckProps):
        software.amazon.awscdk.pipelines.PermissionsBroadeningCheckProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.pipelines.PermissionsBroadeningCheckProps
  }
}
