@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.cloudwatch.IAlarm
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Defines monitors that will be associated with an AWS AppConfig environment.
 *
 * Example:
 *
 * ```
 * Application application;
 * Alarm alarm;
 * CompositeAlarm compositeAlarm;
 * Environment.Builder.create(this, "MyEnvironment")
 * .application(application)
 * .monitors(List.of(Monitor.fromCloudWatchAlarm(alarm),
 * Monitor.fromCloudWatchAlarm(compositeAlarm)))
 * .build();
 * ```
 */
public abstract class Monitor(
  cdkObject: software.amazon.awscdk.services.appconfig.Monitor,
) : CdkObject(cdkObject) {
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

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appconfig.Monitor,
  ) : Monitor(cdkObject)

  public companion object {
    public fun fromCfnMonitorsProperty(monitorsProperty: CfnEnvironment.MonitorsProperty): Monitor =
        software.amazon.awscdk.services.appconfig.Monitor.fromCfnMonitorsProperty(monitorsProperty.let(CfnEnvironment.MonitorsProperty.Companion::unwrap)).let(Monitor::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4160cfc84ae2b4cb85bc384cebf397909a3e3ef271bd9dd9eaa9ac20dc631472")
    public
        fun fromCfnMonitorsProperty(monitorsProperty: CfnEnvironment.MonitorsProperty.Builder.() -> Unit):
        Monitor = fromCfnMonitorsProperty(CfnEnvironment.MonitorsProperty(monitorsProperty))

    public fun fromCloudWatchAlarm(alarm: IAlarm): Monitor =
        software.amazon.awscdk.services.appconfig.Monitor.fromCloudWatchAlarm(alarm.let(IAlarm.Companion::unwrap)).let(Monitor::wrap)

    public fun fromCloudWatchAlarm(alarm: IAlarm, alarmRole: IRole): Monitor =
        software.amazon.awscdk.services.appconfig.Monitor.fromCloudWatchAlarm(alarm.let(IAlarm.Companion::unwrap),
        alarmRole.let(IRole.Companion::unwrap)).let(Monitor::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.Monitor): Monitor =
        CdkObjectWrappers.wrap(cdkObject) as? Monitor ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: Monitor): software.amazon.awscdk.services.appconfig.Monitor =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.appconfig.Monitor
  }
}
