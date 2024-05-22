@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import io.cloudshiftdev.awscdk.services.ses.IReceiptRule
import io.cloudshiftdev.awscdk.services.ses.IReceiptRuleAction
import io.cloudshiftdev.awscdk.services.ses.ReceiptRuleActionConfig
import io.cloudshiftdev.awscdk.services.sns.ITopic
import kotlin.Unit

/**
 * Calls an AWS Lambda function, and optionally, publishes a notification to Amazon SNS.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * import io.cloudshiftdev.awscdk.services.ses.actions.*;
 * import io.cloudshiftdev.awscdk.services.sns.*;
 * Function function_;
 * Topic topic;
 * Lambda lambda = Lambda.Builder.create()
 * .function(function_)
 * // the properties below are optional
 * .invocationType(LambdaInvocationType.EVENT)
 * .topic(topic)
 * .build();
 * ```
 */
public open class Lambda(
  cdkObject: software.amazon.awscdk.services.ses.actions.Lambda,
) : CdkObject(cdkObject), IReceiptRuleAction {
  public constructor(props: LambdaProps) :
      this(software.amazon.awscdk.services.ses.actions.Lambda(props.let(LambdaProps.Companion::unwrap))
  )

  public constructor(props: LambdaProps.Builder.() -> Unit) : this(LambdaProps(props)
  )

  /**
   * Returns the receipt rule action specification.
   *
   * @param rule 
   */
  public override fun bind(rule: IReceiptRule): ReceiptRuleActionConfig =
      unwrap(this).bind(rule.let(IReceiptRule.Companion::unwrap)).let(ReceiptRuleActionConfig::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ses.actions.Lambda].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Lambda function to invoke.
     *
     * @param function The Lambda function to invoke. 
     */
    public fun function(function: IFunction)

    /**
     * The invocation type of the Lambda function.
     *
     * Default: Event
     *
     * @param invocationType The invocation type of the Lambda function. 
     */
    public fun invocationType(invocationType: LambdaInvocationType)

    /**
     * The SNS topic to notify when the Lambda action is taken.
     *
     * Default: no notification
     *
     * @param topic The SNS topic to notify when the Lambda action is taken. 
     */
    public fun topic(topic: ITopic)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.actions.Lambda.Builder =
        software.amazon.awscdk.services.ses.actions.Lambda.Builder.create()

    /**
     * The Lambda function to invoke.
     *
     * @param function The Lambda function to invoke. 
     */
    override fun function(function: IFunction) {
      cdkBuilder.function(function.let(IFunction.Companion::unwrap))
    }

    /**
     * The invocation type of the Lambda function.
     *
     * Default: Event
     *
     * @param invocationType The invocation type of the Lambda function. 
     */
    override fun invocationType(invocationType: LambdaInvocationType) {
      cdkBuilder.invocationType(invocationType.let(LambdaInvocationType.Companion::unwrap))
    }

    /**
     * The SNS topic to notify when the Lambda action is taken.
     *
     * Default: no notification
     *
     * @param topic The SNS topic to notify when the Lambda action is taken. 
     */
    override fun topic(topic: ITopic) {
      cdkBuilder.topic(topic.let(ITopic.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ses.actions.Lambda = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): Lambda {
      val builderImpl = BuilderImpl()
      return Lambda(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.actions.Lambda): Lambda =
        Lambda(cdkObject)

    internal fun unwrap(wrapped: Lambda): software.amazon.awscdk.services.ses.actions.Lambda =
        wrapped.cdkObject as software.amazon.awscdk.services.ses.actions.Lambda
  }
}
