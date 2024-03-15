@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lightsail

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnAlarmProps {
  public fun alarmName(): String

  public fun comparisonOperator(): String

  public fun contactProtocols(): List<String> = unwrap(this).getContactProtocols() ?: emptyList()

  public fun datapointsToAlarm(): Number? = unwrap(this).getDatapointsToAlarm()

  public fun evaluationPeriods(): Number

  public fun metricName(): String

  public fun monitoredResourceName(): String

  public fun notificationEnabled(): Any? = unwrap(this).getNotificationEnabled()

  public fun notificationTriggers(): List<String> = unwrap(this).getNotificationTriggers() ?:
      emptyList()

  public fun threshold(): Number

  public fun treatMissingData(): String? = unwrap(this).getTreatMissingData()

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

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lightsail.CfnAlarmProps.Builder =
        software.amazon.awscdk.services.lightsail.CfnAlarmProps.builder()

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

    public fun build(): software.amazon.awscdk.services.lightsail.CfnAlarmProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lightsail.CfnAlarmProps,
  ) : CdkObject(cdkObject), CfnAlarmProps {
    override fun alarmName(): String = unwrap(this).getAlarmName()

    override fun comparisonOperator(): String = unwrap(this).getComparisonOperator()

    override fun contactProtocols(): List<String> = unwrap(this).getContactProtocols() ?:
        emptyList()

    override fun datapointsToAlarm(): Number? = unwrap(this).getDatapointsToAlarm()

    override fun evaluationPeriods(): Number = unwrap(this).getEvaluationPeriods()

    override fun metricName(): String = unwrap(this).getMetricName()

    override fun monitoredResourceName(): String = unwrap(this).getMonitoredResourceName()

    override fun notificationEnabled(): Any? = unwrap(this).getNotificationEnabled()

    override fun notificationTriggers(): List<String> = unwrap(this).getNotificationTriggers() ?:
        emptyList()

    override fun threshold(): Number = unwrap(this).getThreshold()

    override fun treatMissingData(): String? = unwrap(this).getTreatMissingData()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAlarmProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnAlarmProps):
        CfnAlarmProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAlarmProps):
        software.amazon.awscdk.services.lightsail.CfnAlarmProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.lightsail.CfnAlarmProps
  }
}
