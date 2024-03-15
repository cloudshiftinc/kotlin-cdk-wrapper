@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnCompositeAlarmProps {
  public fun actionsEnabled(): Any? = unwrap(this).getActionsEnabled()

  public fun actionsSuppressor(): String? = unwrap(this).getActionsSuppressor()

  public fun actionsSuppressorExtensionPeriod(): Number? =
      unwrap(this).getActionsSuppressorExtensionPeriod()

  public fun actionsSuppressorWaitPeriod(): Number? = unwrap(this).getActionsSuppressorWaitPeriod()

  public fun alarmActions(): List<String> = unwrap(this).getAlarmActions() ?: emptyList()

  public fun alarmDescription(): String? = unwrap(this).getAlarmDescription()

  public fun alarmName(): String? = unwrap(this).getAlarmName()

  public fun alarmRule(): String

  public fun insufficientDataActions(): List<String> = unwrap(this).getInsufficientDataActions() ?:
      emptyList()

  public fun okActions(): List<String> = unwrap(this).getOkActions() ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun actionsEnabled(actionsEnabled: Boolean)

    public fun actionsEnabled(actionsEnabled: IResolvable)

    public fun actionsSuppressor(actionsSuppressor: String)

    public fun actionsSuppressorExtensionPeriod(actionsSuppressorExtensionPeriod: Number)

    public fun actionsSuppressorWaitPeriod(actionsSuppressorWaitPeriod: Number)

    public fun alarmActions(alarmActions: List<String>)

    public fun alarmActions(vararg alarmActions: String)

    public fun alarmDescription(alarmDescription: String)

    public fun alarmName(alarmName: String)

    public fun alarmRule(alarmRule: String)

    public fun insufficientDataActions(insufficientDataActions: List<String>)

    public fun insufficientDataActions(vararg insufficientDataActions: String)

    public fun okActions(okActions: List<String>)

    public fun okActions(vararg okActions: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudwatch.CfnCompositeAlarmProps.Builder =
        software.amazon.awscdk.services.cloudwatch.CfnCompositeAlarmProps.builder()

    override fun actionsEnabled(actionsEnabled: Boolean) {
      cdkBuilder.actionsEnabled(actionsEnabled)
    }

    override fun actionsEnabled(actionsEnabled: IResolvable) {
      cdkBuilder.actionsEnabled(actionsEnabled.let(IResolvable::unwrap))
    }

    override fun actionsSuppressor(actionsSuppressor: String) {
      cdkBuilder.actionsSuppressor(actionsSuppressor)
    }

    override fun actionsSuppressorExtensionPeriod(actionsSuppressorExtensionPeriod: Number) {
      cdkBuilder.actionsSuppressorExtensionPeriod(actionsSuppressorExtensionPeriod)
    }

    override fun actionsSuppressorWaitPeriod(actionsSuppressorWaitPeriod: Number) {
      cdkBuilder.actionsSuppressorWaitPeriod(actionsSuppressorWaitPeriod)
    }

    override fun alarmActions(alarmActions: List<String>) {
      cdkBuilder.alarmActions(alarmActions)
    }

    override fun alarmActions(vararg alarmActions: String): Unit =
        alarmActions(alarmActions.toList())

    override fun alarmDescription(alarmDescription: String) {
      cdkBuilder.alarmDescription(alarmDescription)
    }

    override fun alarmName(alarmName: String) {
      cdkBuilder.alarmName(alarmName)
    }

    override fun alarmRule(alarmRule: String) {
      cdkBuilder.alarmRule(alarmRule)
    }

    override fun insufficientDataActions(insufficientDataActions: List<String>) {
      cdkBuilder.insufficientDataActions(insufficientDataActions)
    }

    override fun insufficientDataActions(vararg insufficientDataActions: String): Unit =
        insufficientDataActions(insufficientDataActions.toList())

    override fun okActions(okActions: List<String>) {
      cdkBuilder.okActions(okActions)
    }

    override fun okActions(vararg okActions: String): Unit = okActions(okActions.toList())

    public fun build(): software.amazon.awscdk.services.cloudwatch.CfnCompositeAlarmProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudwatch.CfnCompositeAlarmProps,
  ) : CdkObject(cdkObject), CfnCompositeAlarmProps {
    override fun actionsEnabled(): Any? = unwrap(this).getActionsEnabled()

    override fun actionsSuppressor(): String? = unwrap(this).getActionsSuppressor()

    override fun actionsSuppressorExtensionPeriod(): Number? =
        unwrap(this).getActionsSuppressorExtensionPeriod()

    override fun actionsSuppressorWaitPeriod(): Number? =
        unwrap(this).getActionsSuppressorWaitPeriod()

    override fun alarmActions(): List<String> = unwrap(this).getAlarmActions() ?: emptyList()

    override fun alarmDescription(): String? = unwrap(this).getAlarmDescription()

    override fun alarmName(): String? = unwrap(this).getAlarmName()

    override fun alarmRule(): String = unwrap(this).getAlarmRule()

    override fun insufficientDataActions(): List<String> = unwrap(this).getInsufficientDataActions()
        ?: emptyList()

    override fun okActions(): List<String> = unwrap(this).getOkActions() ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCompositeAlarmProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.CfnCompositeAlarmProps):
        CfnCompositeAlarmProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCompositeAlarmProps):
        software.amazon.awscdk.services.cloudwatch.CfnCompositeAlarmProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.CfnCompositeAlarmProps
  }
}
