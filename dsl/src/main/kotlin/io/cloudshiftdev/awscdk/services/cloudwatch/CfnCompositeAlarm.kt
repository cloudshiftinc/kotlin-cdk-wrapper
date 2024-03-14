package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnCompositeAlarm internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cloudwatch.CfnCompositeAlarm,
) : CfnResource(cdkObject), IInspectable {
  public open fun actionsEnabled(): Any? = unwrap(this).getActionsEnabled()

  public open fun actionsEnabled(`value`: Boolean) {
    unwrap(this).setActionsEnabled(`value`)
  }

  public open fun actionsEnabled(`value`: IResolvable) {
    unwrap(this).setActionsEnabled(`value`.let(IResolvable::unwrap))
  }

  public open fun actionsSuppressor(): String? = unwrap(this).getActionsSuppressor()

  public open fun actionsSuppressor(`value`: String) {
    unwrap(this).setActionsSuppressor(`value`)
  }

  public open fun actionsSuppressorExtensionPeriod(): Number? =
      unwrap(this).getActionsSuppressorExtensionPeriod()

  public open fun actionsSuppressorExtensionPeriod(`value`: Number) {
    unwrap(this).setActionsSuppressorExtensionPeriod(`value`)
  }

  public open fun actionsSuppressorWaitPeriod(): Number? =
      unwrap(this).getActionsSuppressorWaitPeriod()

  public open fun actionsSuppressorWaitPeriod(`value`: Number) {
    unwrap(this).setActionsSuppressorWaitPeriod(`value`)
  }

  public open fun alarmActions(): List<String> = unwrap(this).getAlarmActions() ?: emptyList()

  public open fun alarmActions(`value`: List<String>) {
    unwrap(this).setAlarmActions(`value`)
  }

  public open fun alarmDescription(): String? = unwrap(this).getAlarmDescription()

  public open fun alarmDescription(`value`: String) {
    unwrap(this).setAlarmDescription(`value`)
  }

  public open fun alarmName(): String? = unwrap(this).getAlarmName()

  public open fun alarmName(`value`: String) {
    unwrap(this).setAlarmName(`value`)
  }

  public open fun alarmRule(): String = unwrap(this).getAlarmRule()

  public open fun alarmRule(`value`: String) {
    unwrap(this).setAlarmRule(`value`)
  }

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun insufficientDataActions(): List<String> =
      unwrap(this).getInsufficientDataActions() ?: emptyList()

  public open fun insufficientDataActions(`value`: List<String>) {
    unwrap(this).setInsufficientDataActions(`value`)
  }

  public open fun okActions(): List<String> = unwrap(this).getOkActions() ?: emptyList()

  public open fun okActions(`value`: List<String>) {
    unwrap(this).setOkActions(`value`)
  }

  public interface Builder {
    public fun actionsEnabled(actionsEnabled: Boolean)

    public fun actionsEnabled(actionsEnabled: IResolvable)

    public fun actionsSuppressor(actionsSuppressor: String)

    public fun actionsSuppressorExtensionPeriod(actionsSuppressorExtensionPeriod: Number)

    public fun actionsSuppressorWaitPeriod(actionsSuppressorWaitPeriod: Number)

    public fun alarmActions(alarmActions: List<String>)

    public fun alarmDescription(alarmDescription: String)

    public fun alarmName(alarmName: String)

    public fun alarmRule(alarmRule: String)

    public fun insufficientDataActions(insufficientDataActions: List<String>)

    public fun okActions(okActions: List<String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.CfnCompositeAlarm.Builder =
        software.amazon.awscdk.services.cloudwatch.CfnCompositeAlarm.Builder.create(scope, id)

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

    override fun okActions(okActions: List<String>) {
      cdkBuilder.okActions(okActions)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.CfnCompositeAlarm =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCompositeAlarm {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCompositeAlarm(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.CfnCompositeAlarm):
        CfnCompositeAlarm = CfnCompositeAlarm(cdkObject)

    internal fun unwrap(wrapped: CfnCompositeAlarm):
        software.amazon.awscdk.services.cloudwatch.CfnCompositeAlarm = wrapped.cdkObject
  }
}
