@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.applicationinsights

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.applicationinsights.CfnApplication

/**
 * The `AWS::ApplicationInsights::Application ConfigurationDetails` property type specifies the
 * configuration settings.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.applicationinsights.*;
 * ConfigurationDetailsProperty configurationDetailsProperty =
 * ConfigurationDetailsProperty.builder()
 * .alarmMetrics(List.of(AlarmMetricProperty.builder()
 * .alarmMetricName("alarmMetricName")
 * .build()))
 * .alarms(List.of(AlarmProperty.builder()
 * .alarmName("alarmName")
 * // the properties below are optional
 * .severity("severity")
 * .build()))
 * .haClusterPrometheusExporter(HAClusterPrometheusExporterProperty.builder()
 * .prometheusPort("prometheusPort")
 * .build())
 * .hanaPrometheusExporter(HANAPrometheusExporterProperty.builder()
 * .agreeToInstallHanadbClient(false)
 * .hanaPort("hanaPort")
 * .hanaSecretName("hanaSecretName")
 * .hanasid("hanasid")
 * // the properties below are optional
 * .prometheusPort("prometheusPort")
 * .build())
 * .jmxPrometheusExporter(JMXPrometheusExporterProperty.builder()
 * .hostPort("hostPort")
 * .jmxurl("jmxurl")
 * .prometheusPort("prometheusPort")
 * .build())
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-configurationdetails.html)
 */
@CdkDslMarker
public class CfnApplicationConfigurationDetailsPropertyDsl {
  private val cdkBuilder: CfnApplication.ConfigurationDetailsProperty.Builder =
      CfnApplication.ConfigurationDetailsProperty.builder()

  private val _alarmMetrics: MutableList<Any> = mutableListOf()

  private val _alarms: MutableList<Any> = mutableListOf()

  private val _logs: MutableList<Any> = mutableListOf()

  private val _windowsEvents: MutableList<Any> = mutableListOf()

  /**
   * @param alarmMetrics A list of metrics to monitor for the component.
   * All component types can use `AlarmMetrics` .
   */
  public fun alarmMetrics(vararg alarmMetrics: Any) {
    _alarmMetrics.addAll(listOf(*alarmMetrics))
  }

  /**
   * @param alarmMetrics A list of metrics to monitor for the component.
   * All component types can use `AlarmMetrics` .
   */
  public fun alarmMetrics(alarmMetrics: Collection<Any>) {
    _alarmMetrics.addAll(alarmMetrics)
  }

  /**
   * @param alarmMetrics A list of metrics to monitor for the component.
   * All component types can use `AlarmMetrics` .
   */
  public fun alarmMetrics(alarmMetrics: IResolvable) {
    cdkBuilder.alarmMetrics(alarmMetrics)
  }

  /**
   * @param alarms A list of alarms to monitor for the component.
   * All component types can use `Alarm` .
   */
  public fun alarms(vararg alarms: Any) {
    _alarms.addAll(listOf(*alarms))
  }

  /**
   * @param alarms A list of alarms to monitor for the component.
   * All component types can use `Alarm` .
   */
  public fun alarms(alarms: Collection<Any>) {
    _alarms.addAll(alarms)
  }

  /**
   * @param alarms A list of alarms to monitor for the component.
   * All component types can use `Alarm` .
   */
  public fun alarms(alarms: IResolvable) {
    cdkBuilder.alarms(alarms)
  }

  /**
   * @param haClusterPrometheusExporter The HA cluster Prometheus Exporter settings.
   */
  public fun haClusterPrometheusExporter(haClusterPrometheusExporter: IResolvable) {
    cdkBuilder.haClusterPrometheusExporter(haClusterPrometheusExporter)
  }

  /**
   * @param haClusterPrometheusExporter The HA cluster Prometheus Exporter settings.
   */
  public
      fun haClusterPrometheusExporter(haClusterPrometheusExporter: CfnApplication.HAClusterPrometheusExporterProperty) {
    cdkBuilder.haClusterPrometheusExporter(haClusterPrometheusExporter)
  }

  /**
   * @param hanaPrometheusExporter The HANA DB Prometheus Exporter settings.
   */
  public fun hanaPrometheusExporter(hanaPrometheusExporter: IResolvable) {
    cdkBuilder.hanaPrometheusExporter(hanaPrometheusExporter)
  }

  /**
   * @param hanaPrometheusExporter The HANA DB Prometheus Exporter settings.
   */
  public
      fun hanaPrometheusExporter(hanaPrometheusExporter: CfnApplication.HANAPrometheusExporterProperty) {
    cdkBuilder.hanaPrometheusExporter(hanaPrometheusExporter)
  }

  /**
   * @param jmxPrometheusExporter A list of Java metrics to monitor for the component.
   */
  public fun jmxPrometheusExporter(jmxPrometheusExporter: IResolvable) {
    cdkBuilder.jmxPrometheusExporter(jmxPrometheusExporter)
  }

  /**
   * @param jmxPrometheusExporter A list of Java metrics to monitor for the component.
   */
  public
      fun jmxPrometheusExporter(jmxPrometheusExporter: CfnApplication.JMXPrometheusExporterProperty) {
    cdkBuilder.jmxPrometheusExporter(jmxPrometheusExporter)
  }

  /**
   * @param logs A list of logs to monitor for the component.
   * Only Amazon EC2 instances can use `Logs` .
   */
  public fun logs(vararg logs: Any) {
    _logs.addAll(listOf(*logs))
  }

  /**
   * @param logs A list of logs to monitor for the component.
   * Only Amazon EC2 instances can use `Logs` .
   */
  public fun logs(logs: Collection<Any>) {
    _logs.addAll(logs)
  }

  /**
   * @param logs A list of logs to monitor for the component.
   * Only Amazon EC2 instances can use `Logs` .
   */
  public fun logs(logs: IResolvable) {
    cdkBuilder.logs(logs)
  }

  /**
   * @param windowsEvents A list of Windows Events to monitor for the component.
   * Only Amazon EC2 instances running on Windows can use `WindowsEvents` .
   */
  public fun windowsEvents(vararg windowsEvents: Any) {
    _windowsEvents.addAll(listOf(*windowsEvents))
  }

  /**
   * @param windowsEvents A list of Windows Events to monitor for the component.
   * Only Amazon EC2 instances running on Windows can use `WindowsEvents` .
   */
  public fun windowsEvents(windowsEvents: Collection<Any>) {
    _windowsEvents.addAll(windowsEvents)
  }

  /**
   * @param windowsEvents A list of Windows Events to monitor for the component.
   * Only Amazon EC2 instances running on Windows can use `WindowsEvents` .
   */
  public fun windowsEvents(windowsEvents: IResolvable) {
    cdkBuilder.windowsEvents(windowsEvents)
  }

  public fun build(): CfnApplication.ConfigurationDetailsProperty {
    if(_alarmMetrics.isNotEmpty()) cdkBuilder.alarmMetrics(_alarmMetrics)
    if(_alarms.isNotEmpty()) cdkBuilder.alarms(_alarms)
    if(_logs.isNotEmpty()) cdkBuilder.logs(_logs)
    if(_windowsEvents.isNotEmpty()) cdkBuilder.windowsEvents(_windowsEvents)
    return cdkBuilder.build()
  }
}
