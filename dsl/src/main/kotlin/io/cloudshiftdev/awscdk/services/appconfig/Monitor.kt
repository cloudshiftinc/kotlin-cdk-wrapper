package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.services.cloudwatch.IAlarm
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class Monitor internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appconfig.Monitor,
) {
  /**
   * The alarm ARN for AWS AppConfig to monitor.
   */
  public open fun alarmArn(): String = unwrap(this).getAlarmArn()

  /**
   * The IAM role ARN for AWS AppConfig to view the alarm state.
   */
  public open fun alarmRoleArn(): String? = unwrap(this).getAlarmRoleArn()

  /**
   * Indicates whether a CloudWatch alarm is a composite alarm.
   */
  public open fun isCompositeAlarm(): Boolean? = unwrap(this).getIsCompositeAlarm()

  /**
   * The type of monitor.
   */
  public open fun monitorType(): MonitorType = unwrap(this).getMonitorType().let(MonitorType::wrap)

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appconfig.Monitor,
  ) : Monitor(cdkObject)

  public companion object {
    public fun fromCfnMonitorsProperty(monitorsProperty: CfnEnvironment.MonitorsProperty): Monitor =
        software.amazon.awscdk.services.appconfig.Monitor.fromCfnMonitorsProperty(monitorsProperty.let(CfnEnvironment.MonitorsProperty::unwrap)).let(Monitor::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4160cfc84ae2b4cb85bc384cebf397909a3e3ef271bd9dd9eaa9ac20dc631472")
    public
        fun fromCfnMonitorsProperty(monitorsProperty: CfnEnvironment.MonitorsProperty.Builder.() -> Unit):
        Monitor = fromCfnMonitorsProperty(CfnEnvironment.MonitorsProperty(monitorsProperty))

    public fun fromCloudWatchAlarm(alarm: IAlarm): Monitor =
        software.amazon.awscdk.services.appconfig.Monitor.fromCloudWatchAlarm(alarm.let(IAlarm::unwrap)).let(Monitor::wrap)

    public fun fromCloudWatchAlarm(alarm: IAlarm, alarmRole: IRole): Monitor =
        software.amazon.awscdk.services.appconfig.Monitor.fromCloudWatchAlarm(alarm.let(IAlarm::unwrap),
        alarmRole.let(IRole::unwrap)).let(Monitor::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.Monitor): Monitor =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Monitor): software.amazon.awscdk.services.appconfig.Monitor =
        (wrapped as Wrapper).cdkObject
  }
}
