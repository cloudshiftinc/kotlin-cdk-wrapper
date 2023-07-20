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

import software.amazon.awscdk.services.applicationinsights.CfnApplication
import software.amazon.awscdk.services.applicationinsights.CfnApplicationProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object applicationinsights {
    public inline fun cfnApplication(
        scope: Construct,
        id: String,
        block: CfnApplicationDsl.() -> Unit = {},
    ): CfnApplication {
        val builder = CfnApplicationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnApplicationAlarmMetricProperty(
        block: CfnApplicationAlarmMetricPropertyDsl.() -> Unit =
            {},
    ): CfnApplication.AlarmMetricProperty {
        val builder = CfnApplicationAlarmMetricPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnApplicationAlarmProperty(
        block: CfnApplicationAlarmPropertyDsl.() -> Unit =
            {},
    ): CfnApplication.AlarmProperty {
        val builder = CfnApplicationAlarmPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnApplicationComponentConfigurationProperty(
        block: CfnApplicationComponentConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnApplication.ComponentConfigurationProperty {
        val builder = CfnApplicationComponentConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnApplicationComponentMonitoringSettingProperty(
        block: CfnApplicationComponentMonitoringSettingPropertyDsl.() -> Unit =
            {},
    ): CfnApplication.ComponentMonitoringSettingProperty {
        val builder = CfnApplicationComponentMonitoringSettingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnApplicationConfigurationDetailsProperty(
        block: CfnApplicationConfigurationDetailsPropertyDsl.() -> Unit =
            {},
    ): CfnApplication.ConfigurationDetailsProperty {
        val builder = CfnApplicationConfigurationDetailsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnApplicationCustomComponentProperty(
        block: CfnApplicationCustomComponentPropertyDsl.() -> Unit =
            {},
    ): CfnApplication.CustomComponentProperty {
        val builder = CfnApplicationCustomComponentPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnApplicationHAClusterPrometheusExporterProperty(
        block: CfnApplicationHAClusterPrometheusExporterPropertyDsl.() -> Unit =
            {},
    ): CfnApplication.HAClusterPrometheusExporterProperty {
        val builder = CfnApplicationHAClusterPrometheusExporterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnApplicationHANAPrometheusExporterProperty(
        block: CfnApplicationHANAPrometheusExporterPropertyDsl.() -> Unit =
            {},
    ): CfnApplication.HANAPrometheusExporterProperty {
        val builder = CfnApplicationHANAPrometheusExporterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnApplicationJMXPrometheusExporterProperty(
        block: CfnApplicationJMXPrometheusExporterPropertyDsl.() -> Unit =
            {},
    ): CfnApplication.JMXPrometheusExporterProperty {
        val builder = CfnApplicationJMXPrometheusExporterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnApplicationLogPatternProperty(
        block: CfnApplicationLogPatternPropertyDsl.() -> Unit =
            {},
    ): CfnApplication.LogPatternProperty {
        val builder = CfnApplicationLogPatternPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnApplicationLogPatternSetProperty(
        block: CfnApplicationLogPatternSetPropertyDsl.() -> Unit =
            {},
    ): CfnApplication.LogPatternSetProperty {
        val builder = CfnApplicationLogPatternSetPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnApplicationLogProperty(block: CfnApplicationLogPropertyDsl.() -> Unit = {}): CfnApplication.LogProperty {
        val builder = CfnApplicationLogPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnApplicationProps(block: CfnApplicationPropsDsl.() -> Unit = {}): CfnApplicationProps {
        val builder = CfnApplicationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnApplicationSubComponentConfigurationDetailsProperty(
        block: CfnApplicationSubComponentConfigurationDetailsPropertyDsl.() -> Unit =
            {},
    ): CfnApplication.SubComponentConfigurationDetailsProperty {
        val builder = CfnApplicationSubComponentConfigurationDetailsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnApplicationSubComponentTypeConfigurationProperty(
        block: CfnApplicationSubComponentTypeConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnApplication.SubComponentTypeConfigurationProperty {
        val builder = CfnApplicationSubComponentTypeConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnApplicationWindowsEventProperty(
        block: CfnApplicationWindowsEventPropertyDsl.() -> Unit =
            {},
    ): CfnApplication.WindowsEventProperty {
        val builder = CfnApplicationWindowsEventPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
