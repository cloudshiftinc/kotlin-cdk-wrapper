@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.cloudwatch.AlarmActionConfig
import io.cloudshiftdev.awscdk.services.cloudwatch.IAlarm
import io.cloudshiftdev.awscdk.services.cloudwatch.IAlarmAction
import io.cloudshiftdev.constructs.Construct
import kotlin.Any
import kotlin.Boolean
import kotlin.Unit

/**
 * Use a Lambda action as an Alarm action.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * Alarm alarm;
 * Function fn;
 * Alias alias;
 * Version version;
 * // Attach a Lambda Function when alarm triggers
 * alarm.addAlarmAction(
 * new LambdaAction(fn));
 * // Attach a Lambda Function Alias when alarm triggers
 * alarm.addAlarmAction(
 * new LambdaAction(alias));
 * // Attach a Lambda Function version when alarm triggers
 * alarm.addAlarmAction(
 * new LambdaAction(version));
 * ```
 */
public open class LambdaAction(
  cdkObject: software.amazon.awscdk.services.cloudwatch.actions.LambdaAction,
) : CdkObject(cdkObject),
    IAlarmAction {
  public constructor(lambdaFunction: Any) :
      this(software.amazon.awscdk.services.cloudwatch.actions.LambdaAction(lambdaFunction)
  )

  public constructor(lambdaFunction: Any, props: LambdaActionProps) :
      this(software.amazon.awscdk.services.cloudwatch.actions.LambdaAction(lambdaFunction,
      props.let(LambdaActionProps.Companion::unwrap))
  )

  public constructor(lambdaFunction: Any, props: LambdaActionProps.Builder.() -> Unit) :
      this(lambdaFunction, LambdaActionProps(props)
  )

  /**
   * Returns an alarm action configuration to use a Lambda action as an alarm action.
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_PutMetricAlarm.html)
   * @param scope 
   * @param alarm 
   */
  public override fun bind(scope: Construct, alarm: IAlarm): AlarmActionConfig =
      unwrap(this).bind(scope.let(Construct.Companion::unwrap),
      alarm.let(IAlarm.Companion::unwrap)).let(AlarmActionConfig::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudwatch.actions.LambdaAction].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Whether to generate unique Lambda Permission id.
     *
     * Use this parameter to resolve id collision in case of multiple alarms triggering the same
     * action
     *
     * Default: - false
     *
     * [Documentation](https://github.com/aws/aws-cdk/issues/33958)
     * @param useUniquePermissionId Whether to generate unique Lambda Permission id. 
     */
    public fun useUniquePermissionId(useUniquePermissionId: Boolean)
  }

  private class BuilderImpl(
    lambdaFunction: Any,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.actions.LambdaAction.Builder
        =
        software.amazon.awscdk.services.cloudwatch.actions.LambdaAction.Builder.create(lambdaFunction)

    /**
     * Whether to generate unique Lambda Permission id.
     *
     * Use this parameter to resolve id collision in case of multiple alarms triggering the same
     * action
     *
     * Default: - false
     *
     * [Documentation](https://github.com/aws/aws-cdk/issues/33958)
     * @param useUniquePermissionId Whether to generate unique Lambda Permission id. 
     */
    override fun useUniquePermissionId(useUniquePermissionId: Boolean) {
      cdkBuilder.useUniquePermissionId(useUniquePermissionId)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.actions.LambdaAction =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(lambdaFunction: Any, block: Builder.() -> Unit = {}): LambdaAction {
      val builderImpl = BuilderImpl(lambdaFunction)
      return LambdaAction(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.actions.LambdaAction):
        LambdaAction = LambdaAction(cdkObject)

    internal fun unwrap(wrapped: LambdaAction):
        software.amazon.awscdk.services.cloudwatch.actions.LambdaAction = wrapped.cdkObject as
        software.amazon.awscdk.services.cloudwatch.actions.LambdaAction
  }
}
