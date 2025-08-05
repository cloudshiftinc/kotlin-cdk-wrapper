@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * Represents the Wait state which delays a state machine from continuing for a specified time.
 *
 * Example:
 *
 * ```
 * EvaluateExpression convertToSeconds = EvaluateExpression.Builder.create(this, "Convert to
 * seconds")
 * .expression("$.waitMilliseconds / 1000")
 * .resultPath("$.waitSeconds")
 * .build();
 * EvaluateExpression createMessage = EvaluateExpression.Builder.create(this, "Create message")
 * // Note: this is a string inside a string.
 * .expression("`Now waiting ${$.waitSeconds} seconds...`")
 * .runtime(Runtime.NODEJS_LATEST)
 * .resultPath("$.message")
 * .build();
 * SnsPublish publishMessage = SnsPublish.Builder.create(this, "Publish message")
 * .topic(new Topic(this, "cool-topic"))
 * .message(TaskInput.fromJsonPathAt("$.message"))
 * .resultPath("$.sns")
 * .build();
 * Wait wait = Wait.Builder.create(this, "Wait")
 * .time(WaitTime.secondsPath("$.waitSeconds"))
 * .build();
 * StateMachine.Builder.create(this, "StateMachine")
 * .definition(convertToSeconds.next(createMessage).next(publishMessage).next(wait))
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/amazon-states-language-wait-state.html)
 */
public open class WaitTime(
  cdkObject: software.amazon.awscdk.services.stepfunctions.WaitTime,
) : CdkObject(cdkObject) {
  public companion object {
    public fun duration(duration: Duration): WaitTime =
        software.amazon.awscdk.services.stepfunctions.WaitTime.duration(duration.let(Duration.Companion::unwrap)).let(WaitTime::wrap)

    public fun seconds(seconds: String): WaitTime =
        software.amazon.awscdk.services.stepfunctions.WaitTime.seconds(seconds).let(WaitTime::wrap)

    public fun secondsPath(path: String): WaitTime =
        software.amazon.awscdk.services.stepfunctions.WaitTime.secondsPath(path).let(WaitTime::wrap)

    public fun timestamp(timestamp: String): WaitTime =
        software.amazon.awscdk.services.stepfunctions.WaitTime.timestamp(timestamp).let(WaitTime::wrap)

    public fun timestampPath(path: String): WaitTime =
        software.amazon.awscdk.services.stepfunctions.WaitTime.timestampPath(path).let(WaitTime::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.WaitTime): WaitTime =
        WaitTime(cdkObject)

    internal fun unwrap(wrapped: WaitTime): software.amazon.awscdk.services.stepfunctions.WaitTime =
        wrapped.cdkObject as software.amazon.awscdk.services.stepfunctions.WaitTime
  }
}
