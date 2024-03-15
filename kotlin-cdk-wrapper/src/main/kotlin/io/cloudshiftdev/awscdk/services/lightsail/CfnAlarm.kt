@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lightsail

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAlarm internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.lightsail.CfnAlarm,
) : CfnResource(cdkObject), IInspectable {
  public open fun alarmName(): String = unwrap(this).getAlarmName()

  public open fun alarmName(`value`: String) {
    unwrap(this).setAlarmName(`value`)
  }

  public open fun attrAlarmArn(): String = unwrap(this).getAttrAlarmArn()

  public open fun attrState(): String = unwrap(this).getAttrState()

  public open fun comparisonOperator(): String = unwrap(this).getComparisonOperator()

  public open fun comparisonOperator(`value`: String) {
    unwrap(this).setComparisonOperator(`value`)
  }

  public open fun contactProtocols(): List<String> = unwrap(this).getContactProtocols() ?:
      emptyList()

  public open fun contactProtocols(`value`: List<String>) {
    unwrap(this).setContactProtocols(`value`)
  }

  public open fun contactProtocols(vararg `value`: String): Unit =
      contactProtocols(`value`.toList())

  public open fun datapointsToAlarm(): Number? = unwrap(this).getDatapointsToAlarm()

  public open fun datapointsToAlarm(`value`: Number) {
    unwrap(this).setDatapointsToAlarm(`value`)
  }

  public open fun evaluationPeriods(): Number = unwrap(this).getEvaluationPeriods()

  public open fun evaluationPeriods(`value`: Number) {
    unwrap(this).setEvaluationPeriods(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun metricName(): String = unwrap(this).getMetricName()

  public open fun metricName(`value`: String) {
    unwrap(this).setMetricName(`value`)
  }

  public open fun monitoredResourceName(): String = unwrap(this).getMonitoredResourceName()

  public open fun monitoredResourceName(`value`: String) {
    unwrap(this).setMonitoredResourceName(`value`)
  }

  public open fun notificationEnabled(): Any? = unwrap(this).getNotificationEnabled()

  public open fun notificationEnabled(`value`: Boolean) {
    unwrap(this).setNotificationEnabled(`value`)
  }

  public open fun notificationEnabled(`value`: IResolvable) {
    unwrap(this).setNotificationEnabled(`value`.let(IResolvable::unwrap))
  }

  public open fun notificationTriggers(): List<String> = unwrap(this).getNotificationTriggers() ?:
      emptyList()

  public open fun notificationTriggers(`value`: List<String>) {
    unwrap(this).setNotificationTriggers(`value`)
  }

  public open fun notificationTriggers(vararg `value`: String): Unit =
      notificationTriggers(`value`.toList())

  public open fun threshold(): Number = unwrap(this).getThreshold()

  public open fun threshold(`value`: Number) {
    unwrap(this).setThreshold(`value`)
  }

  public open fun treatMissingData(): String? = unwrap(this).getTreatMissingData()

  public open fun treatMissingData(`value`: String) {
    unwrap(this).setTreatMissingData(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun alarmName(alarmName: String)

    public fun comparisonOperator(comparisonOperator: String)

    public fun contactProtocols(contactProtocols: List<String>)

    public fun contactProtocols(vararg contactProtocols: String)

    public fun datapointsToAlarm(datapointsToAlarm: Number)

    public fun evaluationPeriods(evaluationPeriods: Number)

    public fun metricName(metricName: String)

    public fun monitoredResourceName(monitoredResourceName: String)

    public fun notificationEnabled(notificationEnabled: Boolean)

    public fun notificationEnabled(notificationEnabled: IResolvable)

    public fun notificationTriggers(notificationTriggers: List<String>)

    public fun notificationTriggers(vararg notificationTriggers: String)

    public fun threshold(threshold: Number)

    public fun treatMissingData(treatMissingData: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lightsail.CfnAlarm.Builder =
        software.amazon.awscdk.services.lightsail.CfnAlarm.Builder.create(scope, id)

    override fun alarmName(alarmName: String) {
      cdkBuilder.alarmName(alarmName)
    }

    override fun comparisonOperator(comparisonOperator: String) {
      cdkBuilder.comparisonOperator(comparisonOperator)
    }

    override fun contactProtocols(contactProtocols: List<String>) {
      cdkBuilder.contactProtocols(contactProtocols)
    }

    override fun contactProtocols(vararg contactProtocols: String): Unit =
        contactProtocols(contactProtocols.toList())

    override fun datapointsToAlarm(datapointsToAlarm: Number) {
      cdkBuilder.datapointsToAlarm(datapointsToAlarm)
    }

    override fun evaluationPeriods(evaluationPeriods: Number) {
      cdkBuilder.evaluationPeriods(evaluationPeriods)
    }

    override fun metricName(metricName: String) {
      cdkBuilder.metricName(metricName)
    }

    override fun monitoredResourceName(monitoredResourceName: String) {
      cdkBuilder.monitoredResourceName(monitoredResourceName)
    }

    override fun notificationEnabled(notificationEnabled: Boolean) {
      cdkBuilder.notificationEnabled(notificationEnabled)
    }

    override fun notificationEnabled(notificationEnabled: IResolvable) {
      cdkBuilder.notificationEnabled(notificationEnabled.let(IResolvable::unwrap))
    }

    override fun notificationTriggers(notificationTriggers: List<String>) {
      cdkBuilder.notificationTriggers(notificationTriggers)
    }

    override fun notificationTriggers(vararg notificationTriggers: String): Unit =
        notificationTriggers(notificationTriggers.toList())

    override fun threshold(threshold: Number) {
      cdkBuilder.threshold(threshold)
    }

    override fun treatMissingData(treatMissingData: String) {
      cdkBuilder.treatMissingData(treatMissingData)
    }

    public fun build(): software.amazon.awscdk.services.lightsail.CfnAlarm = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.lightsail.CfnAlarm.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAlarm {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAlarm(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnAlarm): CfnAlarm =
        CfnAlarm(cdkObject)

    internal fun unwrap(wrapped: CfnAlarm): software.amazon.awscdk.services.lightsail.CfnAlarm =
        wrapped.cdkObject
  }
}
