@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.applicationinsights

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.applicationinsights.CfnApplication
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnApplicationConfigurationDetailsPropertyDsl {
    private val cdkBuilder: CfnApplication.ConfigurationDetailsProperty.Builder =
        CfnApplication.ConfigurationDetailsProperty.builder()

    private val _alarmMetrics: MutableList<Any> = mutableListOf()

    private val _alarms: MutableList<Any> = mutableListOf()

    private val _logs: MutableList<Any> = mutableListOf()

    private val _windowsEvents: MutableList<Any> = mutableListOf()

    public fun alarmMetrics(vararg alarmMetrics: Any) {
        _alarmMetrics.addAll(listOf(*alarmMetrics))
    }

    public fun alarmMetrics(alarmMetrics: Collection<Any>) {
        _alarmMetrics.addAll(alarmMetrics)
    }

    public fun alarmMetrics(alarmMetrics: IResolvable) {
        cdkBuilder.alarmMetrics(alarmMetrics)
    }

    public fun alarms(vararg alarms: Any) {
        _alarms.addAll(listOf(*alarms))
    }

    public fun alarms(alarms: Collection<Any>) {
        _alarms.addAll(alarms)
    }

    public fun alarms(alarms: IResolvable) {
        cdkBuilder.alarms(alarms)
    }

    public fun haClusterPrometheusExporter(haClusterPrometheusExporter: IResolvable) {
        cdkBuilder.haClusterPrometheusExporter(haClusterPrometheusExporter)
    }

    public fun haClusterPrometheusExporter(haClusterPrometheusExporter: CfnApplication.HAClusterPrometheusExporterProperty) {
        cdkBuilder.haClusterPrometheusExporter(haClusterPrometheusExporter)
    }

    public fun hanaPrometheusExporter(hanaPrometheusExporter: IResolvable) {
        cdkBuilder.hanaPrometheusExporter(hanaPrometheusExporter)
    }

    public fun hanaPrometheusExporter(hanaPrometheusExporter: CfnApplication.HANAPrometheusExporterProperty) {
        cdkBuilder.hanaPrometheusExporter(hanaPrometheusExporter)
    }

    public fun jmxPrometheusExporter(jmxPrometheusExporter: IResolvable) {
        cdkBuilder.jmxPrometheusExporter(jmxPrometheusExporter)
    }

    public fun jmxPrometheusExporter(jmxPrometheusExporter: CfnApplication.JMXPrometheusExporterProperty) {
        cdkBuilder.jmxPrometheusExporter(jmxPrometheusExporter)
    }

    public fun logs(vararg logs: Any) {
        _logs.addAll(listOf(*logs))
    }

    public fun logs(logs: Collection<Any>) {
        _logs.addAll(logs)
    }

    public fun logs(logs: IResolvable) {
        cdkBuilder.logs(logs)
    }

    public fun windowsEvents(vararg windowsEvents: Any) {
        _windowsEvents.addAll(listOf(*windowsEvents))
    }

    public fun windowsEvents(windowsEvents: Collection<Any>) {
        _windowsEvents.addAll(windowsEvents)
    }

    public fun windowsEvents(windowsEvents: IResolvable) {
        cdkBuilder.windowsEvents(windowsEvents)
    }

    public fun build(): CfnApplication.ConfigurationDetailsProperty {
        if (_alarmMetrics.isNotEmpty()) cdkBuilder.alarmMetrics(_alarmMetrics)
        if (_alarms.isNotEmpty()) cdkBuilder.alarms(_alarms)
        if (_logs.isNotEmpty()) cdkBuilder.logs(_logs)
        if (_windowsEvents.isNotEmpty()) cdkBuilder.windowsEvents(_windowsEvents)
        return cdkBuilder.build()
    }
}
