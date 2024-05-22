@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events.targets

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.events.IRule
import io.cloudshiftdev.awscdk.services.events.IRuleTarget
import io.cloudshiftdev.awscdk.services.events.RuleTargetConfig
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.awscdk.services.codepipeline.IPipeline as CloudshiftdevAwscdkServicesCodepipelineIPipeline
import software.amazon.awscdk.services.codepipeline.IPipeline as AmazonAwscdkServicesCodepipelineIPipeline

/**
 * Allows the pipeline to be used as an EventBridge rule target.
 *
 * Example:
 *
 * ```
 * // A pipeline being used as a target for a CloudWatch event rule.
 * import io.cloudshiftdev.awscdk.services.events.targets.*;
 * import io.cloudshiftdev.awscdk.services.events.*;
 * Pipeline pipeline;
 * // kick off the pipeline every day
 * Rule rule = Rule.Builder.create(this, "Daily")
 * .schedule(Schedule.rate(Duration.days(1)))
 * .build();
 * rule.addTarget(new CodePipeline(pipeline));
 * ```
 */
public open class CodePipeline(
  cdkObject: software.amazon.awscdk.services.events.targets.CodePipeline,
) : CdkObject(cdkObject), IRuleTarget {
  public constructor(pipeline: CloudshiftdevAwscdkServicesCodepipelineIPipeline) :
      this(software.amazon.awscdk.services.events.targets.CodePipeline(pipeline.let(CloudshiftdevAwscdkServicesCodepipelineIPipeline.Companion::unwrap))
  )

  public constructor(pipeline: CloudshiftdevAwscdkServicesCodepipelineIPipeline,
      options: CodePipelineTargetOptions) :
      this(software.amazon.awscdk.services.events.targets.CodePipeline(pipeline.let(CloudshiftdevAwscdkServicesCodepipelineIPipeline.Companion::unwrap),
      options.let(CodePipelineTargetOptions.Companion::unwrap))
  )

  public constructor(pipeline: CloudshiftdevAwscdkServicesCodepipelineIPipeline,
      options: CodePipelineTargetOptions.Builder.() -> Unit) : this(pipeline,
      CodePipelineTargetOptions(options)
  )

  /**
   * Returns the rule target specification.
   *
   * NOTE: Do not use the various `inputXxx` options. They can be set in a call to `addTarget`.
   *
   * @param _rule 
   * @param _id
   */
  public override fun bind(rule: IRule): RuleTargetConfig =
      unwrap(this).bind(rule.let(IRule.Companion::unwrap)).let(RuleTargetConfig::wrap)

  /**
   * Returns the rule target specification.
   *
   * NOTE: Do not use the various `inputXxx` options. They can be set in a call to `addTarget`.
   *
   * @param _rule 
   * @param _id
   */
  public override fun bind(rule: IRule, id: String): RuleTargetConfig =
      unwrap(this).bind(rule.let(IRule.Companion::unwrap), id).let(RuleTargetConfig::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.events.targets.CodePipeline].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The SQS queue to be used as deadLetterQueue. Check out the [considerations for using a
     * dead-letter
     * queue](https://docs.aws.amazon.com/eventbridge/latest/userguide/rule-dlq.html#dlq-considerations).
     *
     * The events not successfully delivered are automatically retried for a specified period of
     * time,
     * depending on the retry policy of the target.
     * If an event is not delivered before all retry attempts are exhausted, it will be sent to the
     * dead letter queue.
     *
     * Default: - no dead-letter queue
     *
     * @param deadLetterQueue The SQS queue to be used as deadLetterQueue. Check out the
     * [considerations for using a dead-letter
     * queue](https://docs.aws.amazon.com/eventbridge/latest/userguide/rule-dlq.html#dlq-considerations).
     * 
     */
    public fun deadLetterQueue(deadLetterQueue: IQueue)

    /**
     * The role to assume before invoking the target (i.e., the pipeline) when the given rule is
     * triggered.
     *
     * Default: - a new role will be created
     *
     * @param eventRole The role to assume before invoking the target (i.e., the pipeline) when the
     * given rule is triggered. 
     */
    public fun eventRole(eventRole: IRole)

    /**
     * The maximum age of a request that Lambda sends to a function for processing.
     *
     * Minimum value of 60.
     * Maximum value of 86400.
     *
     * Default: Duration.hours(24)
     *
     * @param maxEventAge The maximum age of a request that Lambda sends to a function for
     * processing. 
     */
    public fun maxEventAge(maxEventAge: Duration)

    /**
     * The maximum number of times to retry when the function returns an error.
     *
     * Minimum value of 0.
     * Maximum value of 185.
     *
     * Default: 185
     *
     * @param retryAttempts The maximum number of times to retry when the function returns an error.
     * 
     */
    public fun retryAttempts(retryAttempts: Number)
  }

  private class BuilderImpl(
    pipeline: AmazonAwscdkServicesCodepipelineIPipeline,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.targets.CodePipeline.Builder =
        software.amazon.awscdk.services.events.targets.CodePipeline.Builder.create(pipeline)

    /**
     * The SQS queue to be used as deadLetterQueue. Check out the [considerations for using a
     * dead-letter
     * queue](https://docs.aws.amazon.com/eventbridge/latest/userguide/rule-dlq.html#dlq-considerations).
     *
     * The events not successfully delivered are automatically retried for a specified period of
     * time,
     * depending on the retry policy of the target.
     * If an event is not delivered before all retry attempts are exhausted, it will be sent to the
     * dead letter queue.
     *
     * Default: - no dead-letter queue
     *
     * @param deadLetterQueue The SQS queue to be used as deadLetterQueue. Check out the
     * [considerations for using a dead-letter
     * queue](https://docs.aws.amazon.com/eventbridge/latest/userguide/rule-dlq.html#dlq-considerations).
     * 
     */
    override fun deadLetterQueue(deadLetterQueue: IQueue) {
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(IQueue.Companion::unwrap))
    }

    /**
     * The role to assume before invoking the target (i.e., the pipeline) when the given rule is
     * triggered.
     *
     * Default: - a new role will be created
     *
     * @param eventRole The role to assume before invoking the target (i.e., the pipeline) when the
     * given rule is triggered. 
     */
    override fun eventRole(eventRole: IRole) {
      cdkBuilder.eventRole(eventRole.let(IRole.Companion::unwrap))
    }

    /**
     * The maximum age of a request that Lambda sends to a function for processing.
     *
     * Minimum value of 60.
     * Maximum value of 86400.
     *
     * Default: Duration.hours(24)
     *
     * @param maxEventAge The maximum age of a request that Lambda sends to a function for
     * processing. 
     */
    override fun maxEventAge(maxEventAge: Duration) {
      cdkBuilder.maxEventAge(maxEventAge.let(Duration.Companion::unwrap))
    }

    /**
     * The maximum number of times to retry when the function returns an error.
     *
     * Minimum value of 0.
     * Maximum value of 185.
     *
     * Default: 185
     *
     * @param retryAttempts The maximum number of times to retry when the function returns an error.
     * 
     */
    override fun retryAttempts(retryAttempts: Number) {
      cdkBuilder.retryAttempts(retryAttempts)
    }

    public fun build(): software.amazon.awscdk.services.events.targets.CodePipeline =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(pipeline: CloudshiftdevAwscdkServicesCodepipelineIPipeline,
        block: Builder.() -> Unit = {}): CodePipeline {
      val builderImpl =
          BuilderImpl(CloudshiftdevAwscdkServicesCodepipelineIPipeline.unwrap(pipeline))
      return CodePipeline(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.CodePipeline):
        CodePipeline = CodePipeline(cdkObject)

    internal fun unwrap(wrapped: CodePipeline):
        software.amazon.awscdk.services.events.targets.CodePipeline = wrapped.cdkObject as
        software.amazon.awscdk.services.events.targets.CodePipeline
  }
}
