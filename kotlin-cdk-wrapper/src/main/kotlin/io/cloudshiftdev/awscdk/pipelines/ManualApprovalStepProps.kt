@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.sns.ITopic
import kotlin.String
import kotlin.Unit

/**
 * Construction properties for a `ManualApprovalStep`.
 *
 * Example:
 *
 * ```
 * CodePipeline pipeline;
 * MyApplicationStage preprod = new MyApplicationStage(this, "PreProd");
 * MyApplicationStage prod = new MyApplicationStage(this, "Prod");
 * Topic topic = new Topic(this, "ChangeApprovalTopic");
 * pipeline.addStage(preprod, AddStageOpts.builder()
 * .post(List.of(
 * ShellStep.Builder.create("Validate Endpoint")
 * .commands(List.of("curl -Ssf https://my.webservice.com/"))
 * .build()))
 * .build());
 * pipeline.addStage(prod, AddStageOpts.builder()
 * .pre(List.of(ManualApprovalStep.Builder.create("PromoteToProd")
 * //All options below are optional
 * .comment("Please validate changes")
 * .reviewUrl("https://my.webservice.com/")
 * .notificationTopic(topic)
 * .build()))
 * .build());
 * ```
 */
public interface ManualApprovalStepProps {
  /**
   * The comment to display with this manual approval.
   *
   * Default: - No comment
   */
  public fun comment(): String? = unwrap(this).getComment()

  /**
   * Optional SNS topic to send notifications to when an approval is pending.
   *
   * Default: - No notifications
   */
  public fun notificationTopic(): ITopic? = unwrap(this).getNotificationTopic()?.let(ITopic::wrap)

  /**
   * The URL for review associated with this manual approval.
   *
   * Default: - No URL
   */
  public fun reviewUrl(): String? = unwrap(this).getReviewUrl()

  /**
   * A builder for [ManualApprovalStepProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param comment The comment to display with this manual approval.
     */
    public fun comment(comment: String)

    /**
     * @param notificationTopic Optional SNS topic to send notifications to when an approval is
     * pending.
     */
    public fun notificationTopic(notificationTopic: ITopic)

    /**
     * @param reviewUrl The URL for review associated with this manual approval.
     */
    public fun reviewUrl(reviewUrl: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.pipelines.ManualApprovalStepProps.Builder =
        software.amazon.awscdk.pipelines.ManualApprovalStepProps.builder()

    /**
     * @param comment The comment to display with this manual approval.
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    /**
     * @param notificationTopic Optional SNS topic to send notifications to when an approval is
     * pending.
     */
    override fun notificationTopic(notificationTopic: ITopic) {
      cdkBuilder.notificationTopic(notificationTopic.let(ITopic.Companion::unwrap))
    }

    /**
     * @param reviewUrl The URL for review associated with this manual approval.
     */
    override fun reviewUrl(reviewUrl: String) {
      cdkBuilder.reviewUrl(reviewUrl)
    }

    public fun build(): software.amazon.awscdk.pipelines.ManualApprovalStepProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.pipelines.ManualApprovalStepProps,
  ) : CdkObject(cdkObject),
      ManualApprovalStepProps {
    /**
     * The comment to display with this manual approval.
     *
     * Default: - No comment
     */
    override fun comment(): String? = unwrap(this).getComment()

    /**
     * Optional SNS topic to send notifications to when an approval is pending.
     *
     * Default: - No notifications
     */
    override fun notificationTopic(): ITopic? =
        unwrap(this).getNotificationTopic()?.let(ITopic::wrap)

    /**
     * The URL for review associated with this manual approval.
     *
     * Default: - No URL
     */
    override fun reviewUrl(): String? = unwrap(this).getReviewUrl()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ManualApprovalStepProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.ManualApprovalStepProps):
        ManualApprovalStepProps = CdkObjectWrappers.wrap(cdkObject) as? ManualApprovalStepProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ManualApprovalStepProps):
        software.amazon.awscdk.pipelines.ManualApprovalStepProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.pipelines.ManualApprovalStepProps
  }
}
