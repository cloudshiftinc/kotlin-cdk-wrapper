@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.applicationinsights

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.applicationinsights.CfnApplication

/**
 * The `AWS::ApplicationInsights::Application SubComponentConfigurationDetails` property type
 * specifies the configuration settings of the sub-components.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.applicationinsights.*;
 * SubComponentConfigurationDetailsProperty subComponentConfigurationDetailsProperty =
 * SubComponentConfigurationDetailsProperty.builder()
 * .alarmMetrics(List.of(AlarmMetricProperty.builder()
 * .alarmMetricName("alarmMetricName")
 * .build()))
 * .logs(List.of(LogProperty.builder()
 * .logType("logType")
 * // the properties below are optional
 * .encoding("encoding")
 * .logGroupName("logGroupName")
 * .logPath("logPath")
 * .patternSet("patternSet")
 * .build()))
 * .windowsEvents(List.of(WindowsEventProperty.builder()
 * .eventLevels(List.of("eventLevels"))
 * .eventName("eventName")
 * .logGroupName("logGroupName")
 * // the properties below are optional
 * .patternSet("patternSet")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-subcomponentconfigurationdetails.html)
 */
@CdkDslMarker
public class CfnApplicationSubComponentConfigurationDetailsPropertyDsl {
    private val cdkBuilder: CfnApplication.SubComponentConfigurationDetailsProperty.Builder =
        CfnApplication.SubComponentConfigurationDetailsProperty.builder()

    private val _alarmMetrics: MutableList<Any> = mutableListOf()

    private val _logs: MutableList<Any> = mutableListOf()

    private val _windowsEvents: MutableList<Any> = mutableListOf()

    /**
     * @param alarmMetrics A list of metrics to monitor for the component. All component types can
     *   use `AlarmMetrics` .
     */
    public fun alarmMetrics(vararg alarmMetrics: Any) {
        _alarmMetrics.addAll(listOf(*alarmMetrics))
    }

    /**
     * @param alarmMetrics A list of metrics to monitor for the component. All component types can
     *   use `AlarmMetrics` .
     */
    public fun alarmMetrics(alarmMetrics: Collection<Any>) {
        _alarmMetrics.addAll(alarmMetrics)
    }

    /**
     * @param alarmMetrics A list of metrics to monitor for the component. All component types can
     *   use `AlarmMetrics` .
     */
    public fun alarmMetrics(alarmMetrics: IResolvable) {
        cdkBuilder.alarmMetrics(alarmMetrics)
    }

    /**
     * @param logs A list of logs to monitor for the component. Only Amazon EC2 instances can use
     *   `Logs` .
     */
    public fun logs(vararg logs: Any) {
        _logs.addAll(listOf(*logs))
    }

    /**
     * @param logs A list of logs to monitor for the component. Only Amazon EC2 instances can use
     *   `Logs` .
     */
    public fun logs(logs: Collection<Any>) {
        _logs.addAll(logs)
    }

    /**
     * @param logs A list of logs to monitor for the component. Only Amazon EC2 instances can use
     *   `Logs` .
     */
    public fun logs(logs: IResolvable) {
        cdkBuilder.logs(logs)
    }

    /**
     * @param windowsEvents A list of Windows Events to monitor for the component. Only Amazon EC2
     *   instances running on Windows can use `WindowsEvents` .
     */
    public fun windowsEvents(vararg windowsEvents: Any) {
        _windowsEvents.addAll(listOf(*windowsEvents))
    }

    /**
     * @param windowsEvents A list of Windows Events to monitor for the component. Only Amazon EC2
     *   instances running on Windows can use `WindowsEvents` .
     */
    public fun windowsEvents(windowsEvents: Collection<Any>) {
        _windowsEvents.addAll(windowsEvents)
    }

    /**
     * @param windowsEvents A list of Windows Events to monitor for the component. Only Amazon EC2
     *   instances running on Windows can use `WindowsEvents` .
     */
    public fun windowsEvents(windowsEvents: IResolvable) {
        cdkBuilder.windowsEvents(windowsEvents)
    }

    public fun build(): CfnApplication.SubComponentConfigurationDetailsProperty {
        if (_alarmMetrics.isNotEmpty()) cdkBuilder.alarmMetrics(_alarmMetrics)
        if (_logs.isNotEmpty()) cdkBuilder.logs(_logs)
        if (_windowsEvents.isNotEmpty()) cdkBuilder.windowsEvents(_windowsEvents)
        return cdkBuilder.build()
    }
}
