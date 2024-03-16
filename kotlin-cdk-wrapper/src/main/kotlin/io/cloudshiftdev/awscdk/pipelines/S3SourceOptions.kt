@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.codepipeline.actions.S3Trigger
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit

/**
 * Options for S3 sources.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codepipeline.actions.*;
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * import io.cloudshiftdev.awscdk.pipelines.*;
 * Role role;
 * S3SourceOptions s3SourceOptions = S3SourceOptions.builder()
 * .actionName("actionName")
 * .role(role)
 * .trigger(S3Trigger.NONE)
 * .build();
 * ```
 */
public interface S3SourceOptions {
  /**
   * The action name used for this source in the CodePipeline.
   *
   * Default: - The bucket name
   */
  public fun actionName(): String? = unwrap(this).getActionName()

  /**
   * The role that will be assumed by the pipeline prior to executing the `S3Source` action.
   *
   * Default: - a new role will be generated
   */
  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  /**
   * How should CodePipeline detect source changes for this Action.
   *
   * Note that if this is S3Trigger.EVENTS, you need to make sure to include the source Bucket in a
   * CloudTrail Trail,
   * as otherwise the CloudWatch Events will not be emitted.
   *
   * Default: S3Trigger.POLL
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/log-s3-data-events.html)
   */
  public fun trigger(): S3Trigger? = unwrap(this).getTrigger()?.let(S3Trigger::wrap)

  /**
   * A builder for [S3SourceOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param actionName The action name used for this source in the CodePipeline.
     */
    public fun actionName(actionName: String)

    /**
     * @param role The role that will be assumed by the pipeline prior to executing the `S3Source`
     * action.
     */
    public fun role(role: IRole)

    /**
     * @param trigger How should CodePipeline detect source changes for this Action.
     * Note that if this is S3Trigger.EVENTS, you need to make sure to include the source Bucket in
     * a CloudTrail Trail,
     * as otherwise the CloudWatch Events will not be emitted.
     */
    public fun trigger(trigger: S3Trigger)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.pipelines.S3SourceOptions.Builder =
        software.amazon.awscdk.pipelines.S3SourceOptions.builder()

    /**
     * @param actionName The action name used for this source in the CodePipeline.
     */
    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    /**
     * @param role The role that will be assumed by the pipeline prior to executing the `S3Source`
     * action.
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    /**
     * @param trigger How should CodePipeline detect source changes for this Action.
     * Note that if this is S3Trigger.EVENTS, you need to make sure to include the source Bucket in
     * a CloudTrail Trail,
     * as otherwise the CloudWatch Events will not be emitted.
     */
    override fun trigger(trigger: S3Trigger) {
      cdkBuilder.trigger(trigger.let(S3Trigger::unwrap))
    }

    public fun build(): software.amazon.awscdk.pipelines.S3SourceOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.pipelines.S3SourceOptions,
  ) : CdkObject(cdkObject), S3SourceOptions {
    /**
     * The action name used for this source in the CodePipeline.
     *
     * Default: - The bucket name
     */
    override fun actionName(): String? = unwrap(this).getActionName()

    /**
     * The role that will be assumed by the pipeline prior to executing the `S3Source` action.
     *
     * Default: - a new role will be generated
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    /**
     * How should CodePipeline detect source changes for this Action.
     *
     * Note that if this is S3Trigger.EVENTS, you need to make sure to include the source Bucket in
     * a CloudTrail Trail,
     * as otherwise the CloudWatch Events will not be emitted.
     *
     * Default: S3Trigger.POLL
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/log-s3-data-events.html)
     */
    override fun trigger(): S3Trigger? = unwrap(this).getTrigger()?.let(S3Trigger::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): S3SourceOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.S3SourceOptions): S3SourceOptions
        = CdkObjectWrappers.wrap(cdkObject) as S3SourceOptions

    internal fun unwrap(wrapped: S3SourceOptions): software.amazon.awscdk.pipelines.S3SourceOptions
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.pipelines.S3SourceOptions
  }
}
