package io.cloudshiftdev.awscdk.services.applicationinsights

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnApplication internal constructor(
  private val cdkObject: software.amazon.awscdk.services.applicationinsights.CfnApplication,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attachMissingPermission(): Any? = unwrap(this).getAttachMissingPermission()

  public open fun attachMissingPermission(`value`: Boolean) {
    unwrap(this).setAttachMissingPermission(`value`)
  }

  public open fun attachMissingPermission(`value`: IResolvable) {
    unwrap(this).setAttachMissingPermission(`value`.let(IResolvable::unwrap))
  }

  public open fun attrApplicationArn(): String = unwrap(this).getAttrApplicationArn()

  public open fun autoConfigurationEnabled(): Any? = unwrap(this).getAutoConfigurationEnabled()

  public open fun autoConfigurationEnabled(`value`: Boolean) {
    unwrap(this).setAutoConfigurationEnabled(`value`)
  }

  public open fun autoConfigurationEnabled(`value`: IResolvable) {
    unwrap(this).setAutoConfigurationEnabled(`value`.let(IResolvable::unwrap))
  }

  public open fun componentMonitoringSettings(): Any? =
      unwrap(this).getComponentMonitoringSettings()

  public open fun componentMonitoringSettings(`value`: IResolvable) {
    unwrap(this).setComponentMonitoringSettings(`value`.let(IResolvable::unwrap))
  }

  public open fun componentMonitoringSettings(__idx_ac66f0: List<Any>) {
    unwrap(this).setComponentMonitoringSettings(__idx_ac66f0)
  }

  public open fun customComponents(): Any? = unwrap(this).getCustomComponents()

  public open fun customComponents(`value`: IResolvable) {
    unwrap(this).setCustomComponents(`value`.let(IResolvable::unwrap))
  }

  public open fun customComponents(__idx_ac66f0: List<Any>) {
    unwrap(this).setCustomComponents(__idx_ac66f0)
  }

  public open fun cweMonitorEnabled(): Any? = unwrap(this).getCweMonitorEnabled()

  public open fun cweMonitorEnabled(`value`: Boolean) {
    unwrap(this).setCweMonitorEnabled(`value`)
  }

  public open fun cweMonitorEnabled(`value`: IResolvable) {
    unwrap(this).setCweMonitorEnabled(`value`.let(IResolvable::unwrap))
  }

  public open fun groupingType(): String? = unwrap(this).getGroupingType()

  public open fun groupingType(`value`: String) {
    unwrap(this).setGroupingType(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun logPatternSets(): Any? = unwrap(this).getLogPatternSets()

  public open fun logPatternSets(`value`: IResolvable) {
    unwrap(this).setLogPatternSets(`value`.let(IResolvable::unwrap))
  }

  public open fun logPatternSets(__idx_ac66f0: List<Any>) {
    unwrap(this).setLogPatternSets(__idx_ac66f0)
  }

  public open fun opsCenterEnabled(): Any? = unwrap(this).getOpsCenterEnabled()

  public open fun opsCenterEnabled(`value`: Boolean) {
    unwrap(this).setOpsCenterEnabled(`value`)
  }

  public open fun opsCenterEnabled(`value`: IResolvable) {
    unwrap(this).setOpsCenterEnabled(`value`.let(IResolvable::unwrap))
  }

  public open fun opsItemSnsTopicArn(): String? = unwrap(this).getOpsItemSnsTopicArn()

  public open fun opsItemSnsTopicArn(`value`: String) {
    unwrap(this).setOpsItemSnsTopicArn(`value`)
  }

  public open fun resourceGroupName(): String = unwrap(this).getResourceGroupName()

  public open fun resourceGroupName(`value`: String) {
    unwrap(this).setResourceGroupName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun attachMissingPermission(attachMissingPermission: Boolean) {
    }

    public fun attachMissingPermission(attachMissingPermission: IResolvable) {
    }

    public fun autoConfigurationEnabled(autoConfigurationEnabled: Boolean) {
    }

    public fun autoConfigurationEnabled(autoConfigurationEnabled: IResolvable) {
    }

    public fun componentMonitoringSettings(componentMonitoringSettings: IResolvable) {
    }

    public fun componentMonitoringSettings(componentMonitoringSettings: List<Any>) {
    }

    public fun customComponents(customComponents: IResolvable) {
    }

    public fun customComponents(customComponents: List<Any>) {
    }

    public fun cweMonitorEnabled(cweMonitorEnabled: Boolean) {
    }

    public fun cweMonitorEnabled(cweMonitorEnabled: IResolvable) {
    }

    public fun groupingType(groupingType: String) {
    }

    public fun logPatternSets(logPatternSets: IResolvable) {
    }

    public fun logPatternSets(logPatternSets: List<Any>) {
    }

    public fun opsCenterEnabled(opsCenterEnabled: Boolean) {
    }

    public fun opsCenterEnabled(opsCenterEnabled: IResolvable) {
    }

    public fun opsItemSnsTopicArn(opsItemSnsTopicArn: String) {
    }

    public fun resourceGroupName(resourceGroupName: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.applicationinsights.CfnApplication.Builder =
        software.amazon.awscdk.services.applicationinsights.CfnApplication.Builder.create(scope, id)

    public override fun attachMissingPermission(attachMissingPermission: Boolean) {
      cdkBuilder.attachMissingPermission(attachMissingPermission)
    }

    public override fun attachMissingPermission(attachMissingPermission: IResolvable) {
      cdkBuilder.attachMissingPermission(attachMissingPermission.let(IResolvable::unwrap))
    }

    public override fun autoConfigurationEnabled(autoConfigurationEnabled: Boolean) {
      cdkBuilder.autoConfigurationEnabled(autoConfigurationEnabled)
    }

    public override fun autoConfigurationEnabled(autoConfigurationEnabled: IResolvable) {
      cdkBuilder.autoConfigurationEnabled(autoConfigurationEnabled.let(IResolvable::unwrap))
    }

    public override fun componentMonitoringSettings(componentMonitoringSettings: IResolvable) {
      cdkBuilder.componentMonitoringSettings(componentMonitoringSettings.let(IResolvable::unwrap))
    }

    public override fun componentMonitoringSettings(componentMonitoringSettings: List<Any>) {
      cdkBuilder.componentMonitoringSettings(componentMonitoringSettings)
    }

    public override fun customComponents(customComponents: IResolvable) {
      cdkBuilder.customComponents(customComponents.let(IResolvable::unwrap))
    }

    public override fun customComponents(customComponents: List<Any>) {
      cdkBuilder.customComponents(customComponents)
    }

    public override fun cweMonitorEnabled(cweMonitorEnabled: Boolean) {
      cdkBuilder.cweMonitorEnabled(cweMonitorEnabled)
    }

    public override fun cweMonitorEnabled(cweMonitorEnabled: IResolvable) {
      cdkBuilder.cweMonitorEnabled(cweMonitorEnabled.let(IResolvable::unwrap))
    }

    public override fun groupingType(groupingType: String) {
      cdkBuilder.groupingType(groupingType)
    }

    public override fun logPatternSets(logPatternSets: IResolvable) {
      cdkBuilder.logPatternSets(logPatternSets.let(IResolvable::unwrap))
    }

    public override fun logPatternSets(logPatternSets: List<Any>) {
      cdkBuilder.logPatternSets(logPatternSets)
    }

    public override fun opsCenterEnabled(opsCenterEnabled: Boolean) {
      cdkBuilder.opsCenterEnabled(opsCenterEnabled)
    }

    public override fun opsCenterEnabled(opsCenterEnabled: IResolvable) {
      cdkBuilder.opsCenterEnabled(opsCenterEnabled.let(IResolvable::unwrap))
    }

    public override fun opsItemSnsTopicArn(opsItemSnsTopicArn: String) {
      cdkBuilder.opsItemSnsTopicArn(opsItemSnsTopicArn)
    }

    public override fun resourceGroupName(resourceGroupName: String) {
      cdkBuilder.resourceGroupName(resourceGroupName)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.applicationinsights.CfnApplication =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApplication {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApplication(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.applicationinsights.CfnApplication):
        CfnApplication = CfnApplication(cdkObject)

    internal fun unwrap(wrapped: CfnApplication):
        software.amazon.awscdk.services.applicationinsights.CfnApplication = wrapped.cdkObject
  }

  public interface AlarmProperty {
    public fun alarmName(): String

    public fun severity(): String? = unwrap(this).getSeverity()

    public interface Builder {
      public fun alarmName(alarmName: String) {
      }

      public fun severity(severity: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.AlarmProperty.Builder =
          software.amazon.awscdk.services.applicationinsights.CfnApplication.AlarmProperty.builder()

      public override fun alarmName(alarmName: String) {
        cdkBuilder.alarmName(alarmName)
      }

      public override fun severity(severity: String) {
        cdkBuilder.severity(severity)
      }

      public fun build():
          software.amazon.awscdk.services.applicationinsights.CfnApplication.AlarmProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.AlarmProperty,
    ) : AlarmProperty {
      public override fun alarmName(): String = unwrap(this).getAlarmName()

      public override fun severity(): String? = unwrap(this).getSeverity()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AlarmProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.applicationinsights.CfnApplication.AlarmProperty):
          AlarmProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AlarmProperty):
          software.amazon.awscdk.services.applicationinsights.CfnApplication.AlarmProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface LogPatternSetProperty {
    public fun logPatterns(): Any

    public fun patternSetName(): String

    public interface Builder {
      public fun logPatterns(logPatterns: IResolvable) {
      }

      public fun logPatterns(logPatterns: List<Any>) {
      }

      public fun patternSetName(patternSetName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.LogPatternSetProperty.Builder
          =
          software.amazon.awscdk.services.applicationinsights.CfnApplication.LogPatternSetProperty.builder()

      public override fun logPatterns(logPatterns: IResolvable) {
        cdkBuilder.logPatterns(logPatterns.let(IResolvable::unwrap))
      }

      public override fun logPatterns(logPatterns: List<Any>) {
        cdkBuilder.logPatterns(logPatterns)
      }

      public override fun patternSetName(patternSetName: String) {
        cdkBuilder.patternSetName(patternSetName)
      }

      public fun build():
          software.amazon.awscdk.services.applicationinsights.CfnApplication.LogPatternSetProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.LogPatternSetProperty,
    ) : LogPatternSetProperty {
      public override fun logPatterns(): Any = unwrap(this).getLogPatterns()

      public override fun patternSetName(): String = unwrap(this).getPatternSetName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LogPatternSetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.applicationinsights.CfnApplication.LogPatternSetProperty):
          LogPatternSetProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LogPatternSetProperty):
          software.amazon.awscdk.services.applicationinsights.CfnApplication.LogPatternSetProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface WindowsEventProperty {
    public fun eventLevels(): List<String>

    public fun eventName(): String

    public fun logGroupName(): String

    public fun patternSet(): String? = unwrap(this).getPatternSet()

    public interface Builder {
      public fun eventLevels(eventLevels: List<String>) {
      }

      public fun eventName(eventName: String) {
      }

      public fun logGroupName(logGroupName: String) {
      }

      public fun patternSet(patternSet: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.WindowsEventProperty.Builder
          =
          software.amazon.awscdk.services.applicationinsights.CfnApplication.WindowsEventProperty.builder()

      public override fun eventLevels(eventLevels: List<String>) {
        cdkBuilder.eventLevels(eventLevels)
      }

      public override fun eventName(eventName: String) {
        cdkBuilder.eventName(eventName)
      }

      public override fun logGroupName(logGroupName: String) {
        cdkBuilder.logGroupName(logGroupName)
      }

      public override fun patternSet(patternSet: String) {
        cdkBuilder.patternSet(patternSet)
      }

      public fun build():
          software.amazon.awscdk.services.applicationinsights.CfnApplication.WindowsEventProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.WindowsEventProperty,
    ) : WindowsEventProperty {
      public override fun eventLevels(): List<String> = unwrap(this).getEventLevels() ?: emptyList()

      public override fun eventName(): String = unwrap(this).getEventName()

      public override fun logGroupName(): String = unwrap(this).getLogGroupName()

      public override fun patternSet(): String? = unwrap(this).getPatternSet()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): WindowsEventProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.applicationinsights.CfnApplication.WindowsEventProperty):
          WindowsEventProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: WindowsEventProperty):
          software.amazon.awscdk.services.applicationinsights.CfnApplication.WindowsEventProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface HAClusterPrometheusExporterProperty {
    public fun prometheusPort(): String? = unwrap(this).getPrometheusPort()

    public interface Builder {
      public fun prometheusPort(prometheusPort: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.HAClusterPrometheusExporterProperty.Builder
          =
          software.amazon.awscdk.services.applicationinsights.CfnApplication.HAClusterPrometheusExporterProperty.builder()

      public override fun prometheusPort(prometheusPort: String) {
        cdkBuilder.prometheusPort(prometheusPort)
      }

      public fun build():
          software.amazon.awscdk.services.applicationinsights.CfnApplication.HAClusterPrometheusExporterProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.HAClusterPrometheusExporterProperty,
    ) : HAClusterPrometheusExporterProperty {
      public override fun prometheusPort(): String? = unwrap(this).getPrometheusPort()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          HAClusterPrometheusExporterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.applicationinsights.CfnApplication.HAClusterPrometheusExporterProperty):
          HAClusterPrometheusExporterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HAClusterPrometheusExporterProperty):
          software.amazon.awscdk.services.applicationinsights.CfnApplication.HAClusterPrometheusExporterProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ComponentConfigurationProperty {
    public fun configurationDetails(): Any? = unwrap(this).getConfigurationDetails()

    public fun subComponentTypeConfigurations(): Any? =
        unwrap(this).getSubComponentTypeConfigurations()

    public interface Builder {
      public fun configurationDetails(configurationDetails: IResolvable) {
      }

      public fun configurationDetails(configurationDetails: ConfigurationDetailsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c31fec2a673113a2f0535a28bdacf3bd652f763fb0267ea8f90d608c943331fb")
      public
          fun configurationDetails(configurationDetails: ConfigurationDetailsProperty.Builder.() -> Unit) {
      }

      public fun subComponentTypeConfigurations(subComponentTypeConfigurations: IResolvable) {
      }

      public fun subComponentTypeConfigurations(subComponentTypeConfigurations: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.ComponentConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.applicationinsights.CfnApplication.ComponentConfigurationProperty.builder()

      public override fun configurationDetails(configurationDetails: IResolvable) {
        cdkBuilder.configurationDetails(configurationDetails.let(IResolvable::unwrap))
      }

      public override fun configurationDetails(configurationDetails: ConfigurationDetailsProperty) {
        cdkBuilder.configurationDetails(configurationDetails.let(ConfigurationDetailsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c31fec2a673113a2f0535a28bdacf3bd652f763fb0267ea8f90d608c943331fb")
      public override
          fun configurationDetails(configurationDetails: ConfigurationDetailsProperty.Builder.() -> Unit):
          Unit = configurationDetails(ConfigurationDetailsProperty(configurationDetails))

      public override
          fun subComponentTypeConfigurations(subComponentTypeConfigurations: IResolvable) {
        cdkBuilder.subComponentTypeConfigurations(subComponentTypeConfigurations.let(IResolvable::unwrap))
      }

      public override
          fun subComponentTypeConfigurations(subComponentTypeConfigurations: List<Any>) {
        cdkBuilder.subComponentTypeConfigurations(subComponentTypeConfigurations)
      }

      public fun build():
          software.amazon.awscdk.services.applicationinsights.CfnApplication.ComponentConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.ComponentConfigurationProperty,
    ) : ComponentConfigurationProperty {
      public override fun configurationDetails(): Any? = unwrap(this).getConfigurationDetails()

      public override fun subComponentTypeConfigurations(): Any? =
          unwrap(this).getSubComponentTypeConfigurations()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ComponentConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.applicationinsights.CfnApplication.ComponentConfigurationProperty):
          ComponentConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ComponentConfigurationProperty):
          software.amazon.awscdk.services.applicationinsights.CfnApplication.ComponentConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ConfigurationDetailsProperty {
    public fun alarmMetrics(): Any? = unwrap(this).getAlarmMetrics()

    public fun alarms(): Any? = unwrap(this).getAlarms()

    public fun haClusterPrometheusExporter(): Any? = unwrap(this).getHaClusterPrometheusExporter()

    public fun hanaPrometheusExporter(): Any? = unwrap(this).getHanaPrometheusExporter()

    public fun jmxPrometheusExporter(): Any? = unwrap(this).getJmxPrometheusExporter()

    public fun logs(): Any? = unwrap(this).getLogs()

    public fun windowsEvents(): Any? = unwrap(this).getWindowsEvents()

    public interface Builder {
      public fun alarmMetrics(alarmMetrics: IResolvable) {
      }

      public fun alarmMetrics(alarmMetrics: List<Any>) {
      }

      public fun alarms(alarms: IResolvable) {
      }

      public fun alarms(alarms: List<Any>) {
      }

      public fun haClusterPrometheusExporter(haClusterPrometheusExporter: IResolvable) {
      }

      public
          fun haClusterPrometheusExporter(haClusterPrometheusExporter: HAClusterPrometheusExporterProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b240cc430e2691632bfe6703e7ff48a1d7892b48371717ea9ce01800aa7ee918")
      public
          fun haClusterPrometheusExporter(haClusterPrometheusExporter: HAClusterPrometheusExporterProperty.Builder.() -> Unit) {
      }

      public fun hanaPrometheusExporter(hanaPrometheusExporter: IResolvable) {
      }

      public fun hanaPrometheusExporter(hanaPrometheusExporter: HANAPrometheusExporterProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("79f8791fcbb36ad22dcb6a4f2eb05b19c3c8dcefd897b634c4f7c283a5ba7364")
      public
          fun hanaPrometheusExporter(hanaPrometheusExporter: HANAPrometheusExporterProperty.Builder.() -> Unit) {
      }

      public fun jmxPrometheusExporter(jmxPrometheusExporter: IResolvable) {
      }

      public fun jmxPrometheusExporter(jmxPrometheusExporter: JMXPrometheusExporterProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9226526fedbe04dc0b210d6f7b6d77d9bf46aee3db36046c8621718f50ce50ee")
      public
          fun jmxPrometheusExporter(jmxPrometheusExporter: JMXPrometheusExporterProperty.Builder.() -> Unit) {
      }

      public fun logs(logs: IResolvable) {
      }

      public fun logs(logs: List<Any>) {
      }

      public fun windowsEvents(windowsEvents: IResolvable) {
      }

      public fun windowsEvents(windowsEvents: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.ConfigurationDetailsProperty.Builder
          =
          software.amazon.awscdk.services.applicationinsights.CfnApplication.ConfigurationDetailsProperty.builder()

      public override fun alarmMetrics(alarmMetrics: IResolvable) {
        cdkBuilder.alarmMetrics(alarmMetrics.let(IResolvable::unwrap))
      }

      public override fun alarmMetrics(alarmMetrics: List<Any>) {
        cdkBuilder.alarmMetrics(alarmMetrics)
      }

      public override fun alarms(alarms: IResolvable) {
        cdkBuilder.alarms(alarms.let(IResolvable::unwrap))
      }

      public override fun alarms(alarms: List<Any>) {
        cdkBuilder.alarms(alarms)
      }

      public override fun haClusterPrometheusExporter(haClusterPrometheusExporter: IResolvable) {
        cdkBuilder.haClusterPrometheusExporter(haClusterPrometheusExporter.let(IResolvable::unwrap))
      }

      public override
          fun haClusterPrometheusExporter(haClusterPrometheusExporter: HAClusterPrometheusExporterProperty) {
        cdkBuilder.haClusterPrometheusExporter(haClusterPrometheusExporter.let(HAClusterPrometheusExporterProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b240cc430e2691632bfe6703e7ff48a1d7892b48371717ea9ce01800aa7ee918")
      public override
          fun haClusterPrometheusExporter(haClusterPrometheusExporter: HAClusterPrometheusExporterProperty.Builder.() -> Unit):
          Unit =
          haClusterPrometheusExporter(HAClusterPrometheusExporterProperty(haClusterPrometheusExporter))

      public override fun hanaPrometheusExporter(hanaPrometheusExporter: IResolvable) {
        cdkBuilder.hanaPrometheusExporter(hanaPrometheusExporter.let(IResolvable::unwrap))
      }

      public override
          fun hanaPrometheusExporter(hanaPrometheusExporter: HANAPrometheusExporterProperty) {
        cdkBuilder.hanaPrometheusExporter(hanaPrometheusExporter.let(HANAPrometheusExporterProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("79f8791fcbb36ad22dcb6a4f2eb05b19c3c8dcefd897b634c4f7c283a5ba7364")
      public override
          fun hanaPrometheusExporter(hanaPrometheusExporter: HANAPrometheusExporterProperty.Builder.() -> Unit):
          Unit = hanaPrometheusExporter(HANAPrometheusExporterProperty(hanaPrometheusExporter))

      public override fun jmxPrometheusExporter(jmxPrometheusExporter: IResolvable) {
        cdkBuilder.jmxPrometheusExporter(jmxPrometheusExporter.let(IResolvable::unwrap))
      }

      public override
          fun jmxPrometheusExporter(jmxPrometheusExporter: JMXPrometheusExporterProperty) {
        cdkBuilder.jmxPrometheusExporter(jmxPrometheusExporter.let(JMXPrometheusExporterProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9226526fedbe04dc0b210d6f7b6d77d9bf46aee3db36046c8621718f50ce50ee")
      public override
          fun jmxPrometheusExporter(jmxPrometheusExporter: JMXPrometheusExporterProperty.Builder.() -> Unit):
          Unit = jmxPrometheusExporter(JMXPrometheusExporterProperty(jmxPrometheusExporter))

      public override fun logs(logs: IResolvable) {
        cdkBuilder.logs(logs.let(IResolvable::unwrap))
      }

      public override fun logs(logs: List<Any>) {
        cdkBuilder.logs(logs)
      }

      public override fun windowsEvents(windowsEvents: IResolvable) {
        cdkBuilder.windowsEvents(windowsEvents.let(IResolvable::unwrap))
      }

      public override fun windowsEvents(windowsEvents: List<Any>) {
        cdkBuilder.windowsEvents(windowsEvents)
      }

      public fun build():
          software.amazon.awscdk.services.applicationinsights.CfnApplication.ConfigurationDetailsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.ConfigurationDetailsProperty,
    ) : ConfigurationDetailsProperty {
      public override fun alarmMetrics(): Any? = unwrap(this).getAlarmMetrics()

      public override fun alarms(): Any? = unwrap(this).getAlarms()

      public override fun haClusterPrometheusExporter(): Any? =
          unwrap(this).getHaClusterPrometheusExporter()

      public override fun hanaPrometheusExporter(): Any? = unwrap(this).getHanaPrometheusExporter()

      public override fun jmxPrometheusExporter(): Any? = unwrap(this).getJmxPrometheusExporter()

      public override fun logs(): Any? = unwrap(this).getLogs()

      public override fun windowsEvents(): Any? = unwrap(this).getWindowsEvents()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ConfigurationDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.applicationinsights.CfnApplication.ConfigurationDetailsProperty):
          ConfigurationDetailsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConfigurationDetailsProperty):
          software.amazon.awscdk.services.applicationinsights.CfnApplication.ConfigurationDetailsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface SubComponentConfigurationDetailsProperty {
    public fun alarmMetrics(): Any? = unwrap(this).getAlarmMetrics()

    public fun logs(): Any? = unwrap(this).getLogs()

    public fun windowsEvents(): Any? = unwrap(this).getWindowsEvents()

    public interface Builder {
      public fun alarmMetrics(alarmMetrics: IResolvable) {
      }

      public fun alarmMetrics(alarmMetrics: List<Any>) {
      }

      public fun logs(logs: IResolvable) {
      }

      public fun logs(logs: List<Any>) {
      }

      public fun windowsEvents(windowsEvents: IResolvable) {
      }

      public fun windowsEvents(windowsEvents: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.SubComponentConfigurationDetailsProperty.Builder
          =
          software.amazon.awscdk.services.applicationinsights.CfnApplication.SubComponentConfigurationDetailsProperty.builder()

      public override fun alarmMetrics(alarmMetrics: IResolvable) {
        cdkBuilder.alarmMetrics(alarmMetrics.let(IResolvable::unwrap))
      }

      public override fun alarmMetrics(alarmMetrics: List<Any>) {
        cdkBuilder.alarmMetrics(alarmMetrics)
      }

      public override fun logs(logs: IResolvable) {
        cdkBuilder.logs(logs.let(IResolvable::unwrap))
      }

      public override fun logs(logs: List<Any>) {
        cdkBuilder.logs(logs)
      }

      public override fun windowsEvents(windowsEvents: IResolvable) {
        cdkBuilder.windowsEvents(windowsEvents.let(IResolvable::unwrap))
      }

      public override fun windowsEvents(windowsEvents: List<Any>) {
        cdkBuilder.windowsEvents(windowsEvents)
      }

      public fun build():
          software.amazon.awscdk.services.applicationinsights.CfnApplication.SubComponentConfigurationDetailsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.SubComponentConfigurationDetailsProperty,
    ) : SubComponentConfigurationDetailsProperty {
      public override fun alarmMetrics(): Any? = unwrap(this).getAlarmMetrics()

      public override fun logs(): Any? = unwrap(this).getLogs()

      public override fun windowsEvents(): Any? = unwrap(this).getWindowsEvents()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          SubComponentConfigurationDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.applicationinsights.CfnApplication.SubComponentConfigurationDetailsProperty):
          SubComponentConfigurationDetailsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SubComponentConfigurationDetailsProperty):
          software.amazon.awscdk.services.applicationinsights.CfnApplication.SubComponentConfigurationDetailsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface JMXPrometheusExporterProperty {
    public fun hostPort(): String? = unwrap(this).getHostPort()

    public fun jmxurl(): String? = unwrap(this).getJmxurl()

    public fun prometheusPort(): String? = unwrap(this).getPrometheusPort()

    public interface Builder {
      public fun hostPort(hostPort: String) {
      }

      public fun jmxurl(jmxurl: String) {
      }

      public fun prometheusPort(prometheusPort: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.JMXPrometheusExporterProperty.Builder
          =
          software.amazon.awscdk.services.applicationinsights.CfnApplication.JMXPrometheusExporterProperty.builder()

      public override fun hostPort(hostPort: String) {
        cdkBuilder.hostPort(hostPort)
      }

      public override fun jmxurl(jmxurl: String) {
        cdkBuilder.jmxurl(jmxurl)
      }

      public override fun prometheusPort(prometheusPort: String) {
        cdkBuilder.prometheusPort(prometheusPort)
      }

      public fun build():
          software.amazon.awscdk.services.applicationinsights.CfnApplication.JMXPrometheusExporterProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.JMXPrometheusExporterProperty,
    ) : JMXPrometheusExporterProperty {
      public override fun hostPort(): String? = unwrap(this).getHostPort()

      public override fun jmxurl(): String? = unwrap(this).getJmxurl()

      public override fun prometheusPort(): String? = unwrap(this).getPrometheusPort()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): JMXPrometheusExporterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.applicationinsights.CfnApplication.JMXPrometheusExporterProperty):
          JMXPrometheusExporterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: JMXPrometheusExporterProperty):
          software.amazon.awscdk.services.applicationinsights.CfnApplication.JMXPrometheusExporterProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface LogProperty {
    public fun encoding(): String? = unwrap(this).getEncoding()

    public fun logGroupName(): String? = unwrap(this).getLogGroupName()

    public fun logPath(): String? = unwrap(this).getLogPath()

    public fun logType(): String

    public fun patternSet(): String? = unwrap(this).getPatternSet()

    public interface Builder {
      public fun encoding(encoding: String) {
      }

      public fun logGroupName(logGroupName: String) {
      }

      public fun logPath(logPath: String) {
      }

      public fun logType(logType: String) {
      }

      public fun patternSet(patternSet: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.LogProperty.Builder =
          software.amazon.awscdk.services.applicationinsights.CfnApplication.LogProperty.builder()

      public override fun encoding(encoding: String) {
        cdkBuilder.encoding(encoding)
      }

      public override fun logGroupName(logGroupName: String) {
        cdkBuilder.logGroupName(logGroupName)
      }

      public override fun logPath(logPath: String) {
        cdkBuilder.logPath(logPath)
      }

      public override fun logType(logType: String) {
        cdkBuilder.logType(logType)
      }

      public override fun patternSet(patternSet: String) {
        cdkBuilder.patternSet(patternSet)
      }

      public fun build():
          software.amazon.awscdk.services.applicationinsights.CfnApplication.LogProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.LogProperty,
    ) : LogProperty {
      public override fun encoding(): String? = unwrap(this).getEncoding()

      public override fun logGroupName(): String? = unwrap(this).getLogGroupName()

      public override fun logPath(): String? = unwrap(this).getLogPath()

      public override fun logType(): String = unwrap(this).getLogType()

      public override fun patternSet(): String? = unwrap(this).getPatternSet()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LogProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.applicationinsights.CfnApplication.LogProperty):
          LogProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LogProperty):
          software.amazon.awscdk.services.applicationinsights.CfnApplication.LogProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface SubComponentTypeConfigurationProperty {
    public fun subComponentConfigurationDetails(): Any

    public fun subComponentType(): String

    public interface Builder {
      public fun subComponentConfigurationDetails(subComponentConfigurationDetails: IResolvable) {
      }

      public
          fun subComponentConfigurationDetails(subComponentConfigurationDetails: SubComponentConfigurationDetailsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6cceeff7e3247f0f06789a218f95b07fda8f6430d9c7a9c50818fb81d6839d17")
      public
          fun subComponentConfigurationDetails(subComponentConfigurationDetails: SubComponentConfigurationDetailsProperty.Builder.() -> Unit) {
      }

      public fun subComponentType(subComponentType: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.SubComponentTypeConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.applicationinsights.CfnApplication.SubComponentTypeConfigurationProperty.builder()

      public override
          fun subComponentConfigurationDetails(subComponentConfigurationDetails: IResolvable) {
        cdkBuilder.subComponentConfigurationDetails(subComponentConfigurationDetails.let(IResolvable::unwrap))
      }

      public override
          fun subComponentConfigurationDetails(subComponentConfigurationDetails: SubComponentConfigurationDetailsProperty) {
        cdkBuilder.subComponentConfigurationDetails(subComponentConfigurationDetails.let(SubComponentConfigurationDetailsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6cceeff7e3247f0f06789a218f95b07fda8f6430d9c7a9c50818fb81d6839d17")
      public override
          fun subComponentConfigurationDetails(subComponentConfigurationDetails: SubComponentConfigurationDetailsProperty.Builder.() -> Unit):
          Unit =
          subComponentConfigurationDetails(SubComponentConfigurationDetailsProperty(subComponentConfigurationDetails))

      public override fun subComponentType(subComponentType: String) {
        cdkBuilder.subComponentType(subComponentType)
      }

      public fun build():
          software.amazon.awscdk.services.applicationinsights.CfnApplication.SubComponentTypeConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.SubComponentTypeConfigurationProperty,
    ) : SubComponentTypeConfigurationProperty {
      public override fun subComponentConfigurationDetails(): Any =
          unwrap(this).getSubComponentConfigurationDetails()

      public override fun subComponentType(): String = unwrap(this).getSubComponentType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          SubComponentTypeConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.applicationinsights.CfnApplication.SubComponentTypeConfigurationProperty):
          SubComponentTypeConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SubComponentTypeConfigurationProperty):
          software.amazon.awscdk.services.applicationinsights.CfnApplication.SubComponentTypeConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface CustomComponentProperty {
    public fun componentName(): String

    public fun resourceList(): List<String>

    public interface Builder {
      public fun componentName(componentName: String) {
      }

      public fun resourceList(resourceList: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.CustomComponentProperty.Builder
          =
          software.amazon.awscdk.services.applicationinsights.CfnApplication.CustomComponentProperty.builder()

      public override fun componentName(componentName: String) {
        cdkBuilder.componentName(componentName)
      }

      public override fun resourceList(resourceList: List<String>) {
        cdkBuilder.resourceList(resourceList)
      }

      public fun build():
          software.amazon.awscdk.services.applicationinsights.CfnApplication.CustomComponentProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.CustomComponentProperty,
    ) : CustomComponentProperty {
      public override fun componentName(): String = unwrap(this).getComponentName()

      public override fun resourceList(): List<String> = unwrap(this).getResourceList() ?:
          emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CustomComponentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.applicationinsights.CfnApplication.CustomComponentProperty):
          CustomComponentProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomComponentProperty):
          software.amazon.awscdk.services.applicationinsights.CfnApplication.CustomComponentProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface HANAPrometheusExporterProperty {
    public fun agreeToInstallHanadbClient(): Any

    public fun hanaPort(): String

    public fun hanaSecretName(): String

    public fun hanasid(): String

    public fun prometheusPort(): String? = unwrap(this).getPrometheusPort()

    public interface Builder {
      public fun agreeToInstallHanadbClient(agreeToInstallHanadbClient: Boolean) {
      }

      public fun agreeToInstallHanadbClient(agreeToInstallHanadbClient: IResolvable) {
      }

      public fun hanaPort(hanaPort: String) {
      }

      public fun hanaSecretName(hanaSecretName: String) {
      }

      public fun hanasid(hanasid: String) {
      }

      public fun prometheusPort(prometheusPort: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.HANAPrometheusExporterProperty.Builder
          =
          software.amazon.awscdk.services.applicationinsights.CfnApplication.HANAPrometheusExporterProperty.builder()

      public override fun agreeToInstallHanadbClient(agreeToInstallHanadbClient: Boolean) {
        cdkBuilder.agreeToInstallHanadbClient(agreeToInstallHanadbClient)
      }

      public override fun agreeToInstallHanadbClient(agreeToInstallHanadbClient: IResolvable) {
        cdkBuilder.agreeToInstallHanadbClient(agreeToInstallHanadbClient.let(IResolvable::unwrap))
      }

      public override fun hanaPort(hanaPort: String) {
        cdkBuilder.hanaPort(hanaPort)
      }

      public override fun hanaSecretName(hanaSecretName: String) {
        cdkBuilder.hanaSecretName(hanaSecretName)
      }

      public override fun hanasid(hanasid: String) {
        cdkBuilder.hanasid(hanasid)
      }

      public override fun prometheusPort(prometheusPort: String) {
        cdkBuilder.prometheusPort(prometheusPort)
      }

      public fun build():
          software.amazon.awscdk.services.applicationinsights.CfnApplication.HANAPrometheusExporterProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.HANAPrometheusExporterProperty,
    ) : HANAPrometheusExporterProperty {
      public override fun agreeToInstallHanadbClient(): Any =
          unwrap(this).getAgreeToInstallHanadbClient()

      public override fun hanaPort(): String = unwrap(this).getHanaPort()

      public override fun hanaSecretName(): String = unwrap(this).getHanaSecretName()

      public override fun hanasid(): String = unwrap(this).getHanasid()

      public override fun prometheusPort(): String? = unwrap(this).getPrometheusPort()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HANAPrometheusExporterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.applicationinsights.CfnApplication.HANAPrometheusExporterProperty):
          HANAPrometheusExporterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HANAPrometheusExporterProperty):
          software.amazon.awscdk.services.applicationinsights.CfnApplication.HANAPrometheusExporterProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface LogPatternProperty {
    public fun pattern(): String

    public fun patternName(): String

    public fun rank(): Number

    public interface Builder {
      public fun pattern(pattern: String) {
      }

      public fun patternName(patternName: String) {
      }

      public fun rank(rank: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.LogPatternProperty.Builder
          =
          software.amazon.awscdk.services.applicationinsights.CfnApplication.LogPatternProperty.builder()

      public override fun pattern(pattern: String) {
        cdkBuilder.pattern(pattern)
      }

      public override fun patternName(patternName: String) {
        cdkBuilder.patternName(patternName)
      }

      public override fun rank(rank: Number) {
        cdkBuilder.rank(rank)
      }

      public fun build():
          software.amazon.awscdk.services.applicationinsights.CfnApplication.LogPatternProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.LogPatternProperty,
    ) : LogPatternProperty {
      public override fun pattern(): String = unwrap(this).getPattern()

      public override fun patternName(): String = unwrap(this).getPatternName()

      public override fun rank(): Number = unwrap(this).getRank()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LogPatternProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.applicationinsights.CfnApplication.LogPatternProperty):
          LogPatternProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LogPatternProperty):
          software.amazon.awscdk.services.applicationinsights.CfnApplication.LogPatternProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ComponentMonitoringSettingProperty {
    public fun componentArn(): String? = unwrap(this).getComponentArn()

    public fun componentConfigurationMode(): String

    public fun componentName(): String? = unwrap(this).getComponentName()

    public fun customComponentConfiguration(): Any? = unwrap(this).getCustomComponentConfiguration()

    public fun defaultOverwriteComponentConfiguration(): Any? =
        unwrap(this).getDefaultOverwriteComponentConfiguration()

    public fun tier(): String

    public interface Builder {
      public fun componentArn(componentArn: String) {
      }

      public fun componentConfigurationMode(componentConfigurationMode: String) {
      }

      public fun componentName(componentName: String) {
      }

      public fun customComponentConfiguration(customComponentConfiguration: IResolvable) {
      }

      public
          fun customComponentConfiguration(customComponentConfiguration: ComponentConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("457cc7c6eb707505dd8cb7ff3054381f5738ce732f8bf3fb55022aa362f0e924")
      public
          fun customComponentConfiguration(customComponentConfiguration: ComponentConfigurationProperty.Builder.() -> Unit) {
      }

      public
          fun defaultOverwriteComponentConfiguration(defaultOverwriteComponentConfiguration: IResolvable) {
      }

      public
          fun defaultOverwriteComponentConfiguration(defaultOverwriteComponentConfiguration: ComponentConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e4791a30d1187c148ce4f3612f5b25e8c8f513997350b6e911df83437cc08c45")
      public
          fun defaultOverwriteComponentConfiguration(defaultOverwriteComponentConfiguration: ComponentConfigurationProperty.Builder.() -> Unit) {
      }

      public fun tier(tier: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.ComponentMonitoringSettingProperty.Builder
          =
          software.amazon.awscdk.services.applicationinsights.CfnApplication.ComponentMonitoringSettingProperty.builder()

      public override fun componentArn(componentArn: String) {
        cdkBuilder.componentArn(componentArn)
      }

      public override fun componentConfigurationMode(componentConfigurationMode: String) {
        cdkBuilder.componentConfigurationMode(componentConfigurationMode)
      }

      public override fun componentName(componentName: String) {
        cdkBuilder.componentName(componentName)
      }

      public override fun customComponentConfiguration(customComponentConfiguration: IResolvable) {
        cdkBuilder.customComponentConfiguration(customComponentConfiguration.let(IResolvable::unwrap))
      }

      public override
          fun customComponentConfiguration(customComponentConfiguration: ComponentConfigurationProperty) {
        cdkBuilder.customComponentConfiguration(customComponentConfiguration.let(ComponentConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("457cc7c6eb707505dd8cb7ff3054381f5738ce732f8bf3fb55022aa362f0e924")
      public override
          fun customComponentConfiguration(customComponentConfiguration: ComponentConfigurationProperty.Builder.() -> Unit):
          Unit =
          customComponentConfiguration(ComponentConfigurationProperty(customComponentConfiguration))

      public override
          fun defaultOverwriteComponentConfiguration(defaultOverwriteComponentConfiguration: IResolvable) {
        cdkBuilder.defaultOverwriteComponentConfiguration(defaultOverwriteComponentConfiguration.let(IResolvable::unwrap))
      }

      public override
          fun defaultOverwriteComponentConfiguration(defaultOverwriteComponentConfiguration: ComponentConfigurationProperty) {
        cdkBuilder.defaultOverwriteComponentConfiguration(defaultOverwriteComponentConfiguration.let(ComponentConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e4791a30d1187c148ce4f3612f5b25e8c8f513997350b6e911df83437cc08c45")
      public override
          fun defaultOverwriteComponentConfiguration(defaultOverwriteComponentConfiguration: ComponentConfigurationProperty.Builder.() -> Unit):
          Unit =
          defaultOverwriteComponentConfiguration(ComponentConfigurationProperty(defaultOverwriteComponentConfiguration))

      public override fun tier(tier: String) {
        cdkBuilder.tier(tier)
      }

      public fun build():
          software.amazon.awscdk.services.applicationinsights.CfnApplication.ComponentMonitoringSettingProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.ComponentMonitoringSettingProperty,
    ) : ComponentMonitoringSettingProperty {
      public override fun componentArn(): String? = unwrap(this).getComponentArn()

      public override fun componentConfigurationMode(): String =
          unwrap(this).getComponentConfigurationMode()

      public override fun componentName(): String? = unwrap(this).getComponentName()

      public override fun customComponentConfiguration(): Any? =
          unwrap(this).getCustomComponentConfiguration()

      public override fun defaultOverwriteComponentConfiguration(): Any? =
          unwrap(this).getDefaultOverwriteComponentConfiguration()

      public override fun tier(): String = unwrap(this).getTier()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ComponentMonitoringSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.applicationinsights.CfnApplication.ComponentMonitoringSettingProperty):
          ComponentMonitoringSettingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ComponentMonitoringSettingProperty):
          software.amazon.awscdk.services.applicationinsights.CfnApplication.ComponentMonitoringSettingProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface AlarmMetricProperty {
    public fun alarmMetricName(): String

    public interface Builder {
      public fun alarmMetricName(alarmMetricName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.AlarmMetricProperty.Builder
          =
          software.amazon.awscdk.services.applicationinsights.CfnApplication.AlarmMetricProperty.builder()

      public override fun alarmMetricName(alarmMetricName: String) {
        cdkBuilder.alarmMetricName(alarmMetricName)
      }

      public fun build():
          software.amazon.awscdk.services.applicationinsights.CfnApplication.AlarmMetricProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.AlarmMetricProperty,
    ) : AlarmMetricProperty {
      public override fun alarmMetricName(): String = unwrap(this).getAlarmMetricName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AlarmMetricProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.applicationinsights.CfnApplication.AlarmMetricProperty):
          AlarmMetricProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AlarmMetricProperty):
          software.amazon.awscdk.services.applicationinsights.CfnApplication.AlarmMetricProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
