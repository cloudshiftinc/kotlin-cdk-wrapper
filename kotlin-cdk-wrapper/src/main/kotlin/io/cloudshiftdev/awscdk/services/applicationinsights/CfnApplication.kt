@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.applicationinsights

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnApplication internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.applicationinsights.CfnApplication,
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

  public open fun componentMonitoringSettings(vararg __idx_ac66f0: Any): Unit =
      componentMonitoringSettings(__idx_ac66f0.toList())

  public open fun customComponents(): Any? = unwrap(this).getCustomComponents()

  public open fun customComponents(`value`: IResolvable) {
    unwrap(this).setCustomComponents(`value`.let(IResolvable::unwrap))
  }

  public open fun customComponents(__idx_ac66f0: List<Any>) {
    unwrap(this).setCustomComponents(__idx_ac66f0)
  }

  public open fun customComponents(vararg __idx_ac66f0: Any): Unit =
      customComponents(__idx_ac66f0.toList())

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

  public open fun logPatternSets(vararg __idx_ac66f0: Any): Unit =
      logPatternSets(__idx_ac66f0.toList())

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

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun attachMissingPermission(attachMissingPermission: Boolean)

    public fun attachMissingPermission(attachMissingPermission: IResolvable)

    public fun autoConfigurationEnabled(autoConfigurationEnabled: Boolean)

    public fun autoConfigurationEnabled(autoConfigurationEnabled: IResolvable)

    public fun componentMonitoringSettings(componentMonitoringSettings: IResolvable)

    public fun componentMonitoringSettings(componentMonitoringSettings: List<Any>)

    public fun componentMonitoringSettings(vararg componentMonitoringSettings: Any)

    public fun customComponents(customComponents: IResolvable)

    public fun customComponents(customComponents: List<Any>)

    public fun customComponents(vararg customComponents: Any)

    public fun cweMonitorEnabled(cweMonitorEnabled: Boolean)

    public fun cweMonitorEnabled(cweMonitorEnabled: IResolvable)

    public fun groupingType(groupingType: String)

    public fun logPatternSets(logPatternSets: IResolvable)

    public fun logPatternSets(logPatternSets: List<Any>)

    public fun logPatternSets(vararg logPatternSets: Any)

    public fun opsCenterEnabled(opsCenterEnabled: Boolean)

    public fun opsCenterEnabled(opsCenterEnabled: IResolvable)

    public fun opsItemSnsTopicArn(opsItemSnsTopicArn: String)

    public fun resourceGroupName(resourceGroupName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.applicationinsights.CfnApplication.Builder =
        software.amazon.awscdk.services.applicationinsights.CfnApplication.Builder.create(scope, id)

    override fun attachMissingPermission(attachMissingPermission: Boolean) {
      cdkBuilder.attachMissingPermission(attachMissingPermission)
    }

    override fun attachMissingPermission(attachMissingPermission: IResolvable) {
      cdkBuilder.attachMissingPermission(attachMissingPermission.let(IResolvable::unwrap))
    }

    override fun autoConfigurationEnabled(autoConfigurationEnabled: Boolean) {
      cdkBuilder.autoConfigurationEnabled(autoConfigurationEnabled)
    }

    override fun autoConfigurationEnabled(autoConfigurationEnabled: IResolvable) {
      cdkBuilder.autoConfigurationEnabled(autoConfigurationEnabled.let(IResolvable::unwrap))
    }

    override fun componentMonitoringSettings(componentMonitoringSettings: IResolvable) {
      cdkBuilder.componentMonitoringSettings(componentMonitoringSettings.let(IResolvable::unwrap))
    }

    override fun componentMonitoringSettings(componentMonitoringSettings: List<Any>) {
      cdkBuilder.componentMonitoringSettings(componentMonitoringSettings)
    }

    override fun componentMonitoringSettings(vararg componentMonitoringSettings: Any): Unit =
        componentMonitoringSettings(componentMonitoringSettings.toList())

    override fun customComponents(customComponents: IResolvable) {
      cdkBuilder.customComponents(customComponents.let(IResolvable::unwrap))
    }

    override fun customComponents(customComponents: List<Any>) {
      cdkBuilder.customComponents(customComponents)
    }

    override fun customComponents(vararg customComponents: Any): Unit =
        customComponents(customComponents.toList())

    override fun cweMonitorEnabled(cweMonitorEnabled: Boolean) {
      cdkBuilder.cweMonitorEnabled(cweMonitorEnabled)
    }

    override fun cweMonitorEnabled(cweMonitorEnabled: IResolvable) {
      cdkBuilder.cweMonitorEnabled(cweMonitorEnabled.let(IResolvable::unwrap))
    }

    override fun groupingType(groupingType: String) {
      cdkBuilder.groupingType(groupingType)
    }

    override fun logPatternSets(logPatternSets: IResolvable) {
      cdkBuilder.logPatternSets(logPatternSets.let(IResolvable::unwrap))
    }

    override fun logPatternSets(logPatternSets: List<Any>) {
      cdkBuilder.logPatternSets(logPatternSets)
    }

    override fun logPatternSets(vararg logPatternSets: Any): Unit =
        logPatternSets(logPatternSets.toList())

    override fun opsCenterEnabled(opsCenterEnabled: Boolean) {
      cdkBuilder.opsCenterEnabled(opsCenterEnabled)
    }

    override fun opsCenterEnabled(opsCenterEnabled: IResolvable) {
      cdkBuilder.opsCenterEnabled(opsCenterEnabled.let(IResolvable::unwrap))
    }

    override fun opsItemSnsTopicArn(opsItemSnsTopicArn: String) {
      cdkBuilder.opsItemSnsTopicArn(opsItemSnsTopicArn)
    }

    override fun resourceGroupName(resourceGroupName: String) {
      cdkBuilder.resourceGroupName(resourceGroupName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.applicationinsights.CfnApplication =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.applicationinsights.CfnApplication.CFN_RESOURCE_TYPE_NAME

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

    @CdkDslMarker
    public interface Builder {
      public fun alarmName(alarmName: String)

      public fun severity(severity: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.AlarmProperty.Builder =
          software.amazon.awscdk.services.applicationinsights.CfnApplication.AlarmProperty.builder()

      override fun alarmName(alarmName: String) {
        cdkBuilder.alarmName(alarmName)
      }

      override fun severity(severity: String) {
        cdkBuilder.severity(severity)
      }

      public fun build():
          software.amazon.awscdk.services.applicationinsights.CfnApplication.AlarmProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.AlarmProperty,
    ) : CdkObject(cdkObject), AlarmProperty {
      override fun alarmName(): String = unwrap(this).getAlarmName()

      override fun severity(): String? = unwrap(this).getSeverity()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AlarmProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.applicationinsights.CfnApplication.AlarmProperty):
          AlarmProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AlarmProperty):
          software.amazon.awscdk.services.applicationinsights.CfnApplication.AlarmProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.applicationinsights.CfnApplication.AlarmProperty
    }
  }

  public interface LogPatternSetProperty {
    public fun logPatterns(): Any

    public fun patternSetName(): String

    @CdkDslMarker
    public interface Builder {
      public fun logPatterns(logPatterns: IResolvable)

      public fun logPatterns(logPatterns: List<Any>)

      public fun logPatterns(vararg logPatterns: Any)

      public fun patternSetName(patternSetName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.LogPatternSetProperty.Builder
          =
          software.amazon.awscdk.services.applicationinsights.CfnApplication.LogPatternSetProperty.builder()

      override fun logPatterns(logPatterns: IResolvable) {
        cdkBuilder.logPatterns(logPatterns.let(IResolvable::unwrap))
      }

      override fun logPatterns(logPatterns: List<Any>) {
        cdkBuilder.logPatterns(logPatterns)
      }

      override fun logPatterns(vararg logPatterns: Any): Unit = logPatterns(logPatterns.toList())

      override fun patternSetName(patternSetName: String) {
        cdkBuilder.patternSetName(patternSetName)
      }

      public fun build():
          software.amazon.awscdk.services.applicationinsights.CfnApplication.LogPatternSetProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.LogPatternSetProperty,
    ) : CdkObject(cdkObject), LogPatternSetProperty {
      override fun logPatterns(): Any = unwrap(this).getLogPatterns()

      override fun patternSetName(): String = unwrap(this).getPatternSetName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LogPatternSetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.applicationinsights.CfnApplication.LogPatternSetProperty):
          LogPatternSetProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LogPatternSetProperty):
          software.amazon.awscdk.services.applicationinsights.CfnApplication.LogPatternSetProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.applicationinsights.CfnApplication.LogPatternSetProperty
    }
  }

  public interface WindowsEventProperty {
    public fun eventLevels(): List<String>

    public fun eventName(): String

    public fun logGroupName(): String

    public fun patternSet(): String? = unwrap(this).getPatternSet()

    @CdkDslMarker
    public interface Builder {
      public fun eventLevels(eventLevels: List<String>)

      public fun eventLevels(vararg eventLevels: String)

      public fun eventName(eventName: String)

      public fun logGroupName(logGroupName: String)

      public fun patternSet(patternSet: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.WindowsEventProperty.Builder
          =
          software.amazon.awscdk.services.applicationinsights.CfnApplication.WindowsEventProperty.builder()

      override fun eventLevels(eventLevels: List<String>) {
        cdkBuilder.eventLevels(eventLevels)
      }

      override fun eventLevels(vararg eventLevels: String): Unit = eventLevels(eventLevels.toList())

      override fun eventName(eventName: String) {
        cdkBuilder.eventName(eventName)
      }

      override fun logGroupName(logGroupName: String) {
        cdkBuilder.logGroupName(logGroupName)
      }

      override fun patternSet(patternSet: String) {
        cdkBuilder.patternSet(patternSet)
      }

      public fun build():
          software.amazon.awscdk.services.applicationinsights.CfnApplication.WindowsEventProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.WindowsEventProperty,
    ) : CdkObject(cdkObject), WindowsEventProperty {
      override fun eventLevels(): List<String> = unwrap(this).getEventLevels()

      override fun eventName(): String = unwrap(this).getEventName()

      override fun logGroupName(): String = unwrap(this).getLogGroupName()

      override fun patternSet(): String? = unwrap(this).getPatternSet()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): WindowsEventProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.applicationinsights.CfnApplication.WindowsEventProperty):
          WindowsEventProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: WindowsEventProperty):
          software.amazon.awscdk.services.applicationinsights.CfnApplication.WindowsEventProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.applicationinsights.CfnApplication.WindowsEventProperty
    }
  }

  public interface HAClusterPrometheusExporterProperty {
    public fun prometheusPort(): String? = unwrap(this).getPrometheusPort()

    @CdkDslMarker
    public interface Builder {
      public fun prometheusPort(prometheusPort: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.HAClusterPrometheusExporterProperty.Builder
          =
          software.amazon.awscdk.services.applicationinsights.CfnApplication.HAClusterPrometheusExporterProperty.builder()

      override fun prometheusPort(prometheusPort: String) {
        cdkBuilder.prometheusPort(prometheusPort)
      }

      public fun build():
          software.amazon.awscdk.services.applicationinsights.CfnApplication.HAClusterPrometheusExporterProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.HAClusterPrometheusExporterProperty,
    ) : CdkObject(cdkObject), HAClusterPrometheusExporterProperty {
      override fun prometheusPort(): String? = unwrap(this).getPrometheusPort()
    }

    public companion object {
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
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.applicationinsights.CfnApplication.HAClusterPrometheusExporterProperty
    }
  }

  public interface ComponentConfigurationProperty {
    public fun configurationDetails(): Any? = unwrap(this).getConfigurationDetails()

    public fun subComponentTypeConfigurations(): Any? =
        unwrap(this).getSubComponentTypeConfigurations()

    @CdkDslMarker
    public interface Builder {
      public fun configurationDetails(configurationDetails: IResolvable)

      public fun configurationDetails(configurationDetails: ConfigurationDetailsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c31fec2a673113a2f0535a28bdacf3bd652f763fb0267ea8f90d608c943331fb")
      public
          fun configurationDetails(configurationDetails: ConfigurationDetailsProperty.Builder.() -> Unit)

      public fun subComponentTypeConfigurations(subComponentTypeConfigurations: IResolvable)

      public fun subComponentTypeConfigurations(subComponentTypeConfigurations: List<Any>)

      public fun subComponentTypeConfigurations(vararg subComponentTypeConfigurations: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.ComponentConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.applicationinsights.CfnApplication.ComponentConfigurationProperty.builder()

      override fun configurationDetails(configurationDetails: IResolvable) {
        cdkBuilder.configurationDetails(configurationDetails.let(IResolvable::unwrap))
      }

      override fun configurationDetails(configurationDetails: ConfigurationDetailsProperty) {
        cdkBuilder.configurationDetails(configurationDetails.let(ConfigurationDetailsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c31fec2a673113a2f0535a28bdacf3bd652f763fb0267ea8f90d608c943331fb")
      override
          fun configurationDetails(configurationDetails: ConfigurationDetailsProperty.Builder.() -> Unit):
          Unit = configurationDetails(ConfigurationDetailsProperty(configurationDetails))

      override fun subComponentTypeConfigurations(subComponentTypeConfigurations: IResolvable) {
        cdkBuilder.subComponentTypeConfigurations(subComponentTypeConfigurations.let(IResolvable::unwrap))
      }

      override fun subComponentTypeConfigurations(subComponentTypeConfigurations: List<Any>) {
        cdkBuilder.subComponentTypeConfigurations(subComponentTypeConfigurations)
      }

      override fun subComponentTypeConfigurations(vararg subComponentTypeConfigurations: Any): Unit
          = subComponentTypeConfigurations(subComponentTypeConfigurations.toList())

      public fun build():
          software.amazon.awscdk.services.applicationinsights.CfnApplication.ComponentConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.ComponentConfigurationProperty,
    ) : CdkObject(cdkObject), ComponentConfigurationProperty {
      override fun configurationDetails(): Any? = unwrap(this).getConfigurationDetails()

      override fun subComponentTypeConfigurations(): Any? =
          unwrap(this).getSubComponentTypeConfigurations()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ComponentConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.applicationinsights.CfnApplication.ComponentConfigurationProperty):
          ComponentConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ComponentConfigurationProperty):
          software.amazon.awscdk.services.applicationinsights.CfnApplication.ComponentConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.applicationinsights.CfnApplication.ComponentConfigurationProperty
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

    @CdkDslMarker
    public interface Builder {
      public fun alarmMetrics(alarmMetrics: IResolvable)

      public fun alarmMetrics(alarmMetrics: List<Any>)

      public fun alarmMetrics(vararg alarmMetrics: Any)

      public fun alarms(alarms: IResolvable)

      public fun alarms(alarms: List<Any>)

      public fun alarms(vararg alarms: Any)

      public fun haClusterPrometheusExporter(haClusterPrometheusExporter: IResolvable)

      public
          fun haClusterPrometheusExporter(haClusterPrometheusExporter: HAClusterPrometheusExporterProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b240cc430e2691632bfe6703e7ff48a1d7892b48371717ea9ce01800aa7ee918")
      public
          fun haClusterPrometheusExporter(haClusterPrometheusExporter: HAClusterPrometheusExporterProperty.Builder.() -> Unit)

      public fun hanaPrometheusExporter(hanaPrometheusExporter: IResolvable)

      public fun hanaPrometheusExporter(hanaPrometheusExporter: HANAPrometheusExporterProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("79f8791fcbb36ad22dcb6a4f2eb05b19c3c8dcefd897b634c4f7c283a5ba7364")
      public
          fun hanaPrometheusExporter(hanaPrometheusExporter: HANAPrometheusExporterProperty.Builder.() -> Unit)

      public fun jmxPrometheusExporter(jmxPrometheusExporter: IResolvable)

      public fun jmxPrometheusExporter(jmxPrometheusExporter: JMXPrometheusExporterProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9226526fedbe04dc0b210d6f7b6d77d9bf46aee3db36046c8621718f50ce50ee")
      public
          fun jmxPrometheusExporter(jmxPrometheusExporter: JMXPrometheusExporterProperty.Builder.() -> Unit)

      public fun logs(logs: IResolvable)

      public fun logs(logs: List<Any>)

      public fun logs(vararg logs: Any)

      public fun windowsEvents(windowsEvents: IResolvable)

      public fun windowsEvents(windowsEvents: List<Any>)

      public fun windowsEvents(vararg windowsEvents: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.ConfigurationDetailsProperty.Builder
          =
          software.amazon.awscdk.services.applicationinsights.CfnApplication.ConfigurationDetailsProperty.builder()

      override fun alarmMetrics(alarmMetrics: IResolvable) {
        cdkBuilder.alarmMetrics(alarmMetrics.let(IResolvable::unwrap))
      }

      override fun alarmMetrics(alarmMetrics: List<Any>) {
        cdkBuilder.alarmMetrics(alarmMetrics)
      }

      override fun alarmMetrics(vararg alarmMetrics: Any): Unit =
          alarmMetrics(alarmMetrics.toList())

      override fun alarms(alarms: IResolvable) {
        cdkBuilder.alarms(alarms.let(IResolvable::unwrap))
      }

      override fun alarms(alarms: List<Any>) {
        cdkBuilder.alarms(alarms)
      }

      override fun alarms(vararg alarms: Any): Unit = alarms(alarms.toList())

      override fun haClusterPrometheusExporter(haClusterPrometheusExporter: IResolvable) {
        cdkBuilder.haClusterPrometheusExporter(haClusterPrometheusExporter.let(IResolvable::unwrap))
      }

      override
          fun haClusterPrometheusExporter(haClusterPrometheusExporter: HAClusterPrometheusExporterProperty) {
        cdkBuilder.haClusterPrometheusExporter(haClusterPrometheusExporter.let(HAClusterPrometheusExporterProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b240cc430e2691632bfe6703e7ff48a1d7892b48371717ea9ce01800aa7ee918")
      override
          fun haClusterPrometheusExporter(haClusterPrometheusExporter: HAClusterPrometheusExporterProperty.Builder.() -> Unit):
          Unit =
          haClusterPrometheusExporter(HAClusterPrometheusExporterProperty(haClusterPrometheusExporter))

      override fun hanaPrometheusExporter(hanaPrometheusExporter: IResolvable) {
        cdkBuilder.hanaPrometheusExporter(hanaPrometheusExporter.let(IResolvable::unwrap))
      }

      override fun hanaPrometheusExporter(hanaPrometheusExporter: HANAPrometheusExporterProperty) {
        cdkBuilder.hanaPrometheusExporter(hanaPrometheusExporter.let(HANAPrometheusExporterProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("79f8791fcbb36ad22dcb6a4f2eb05b19c3c8dcefd897b634c4f7c283a5ba7364")
      override
          fun hanaPrometheusExporter(hanaPrometheusExporter: HANAPrometheusExporterProperty.Builder.() -> Unit):
          Unit = hanaPrometheusExporter(HANAPrometheusExporterProperty(hanaPrometheusExporter))

      override fun jmxPrometheusExporter(jmxPrometheusExporter: IResolvable) {
        cdkBuilder.jmxPrometheusExporter(jmxPrometheusExporter.let(IResolvable::unwrap))
      }

      override fun jmxPrometheusExporter(jmxPrometheusExporter: JMXPrometheusExporterProperty) {
        cdkBuilder.jmxPrometheusExporter(jmxPrometheusExporter.let(JMXPrometheusExporterProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9226526fedbe04dc0b210d6f7b6d77d9bf46aee3db36046c8621718f50ce50ee")
      override
          fun jmxPrometheusExporter(jmxPrometheusExporter: JMXPrometheusExporterProperty.Builder.() -> Unit):
          Unit = jmxPrometheusExporter(JMXPrometheusExporterProperty(jmxPrometheusExporter))

      override fun logs(logs: IResolvable) {
        cdkBuilder.logs(logs.let(IResolvable::unwrap))
      }

      override fun logs(logs: List<Any>) {
        cdkBuilder.logs(logs)
      }

      override fun logs(vararg logs: Any): Unit = logs(logs.toList())

      override fun windowsEvents(windowsEvents: IResolvable) {
        cdkBuilder.windowsEvents(windowsEvents.let(IResolvable::unwrap))
      }

      override fun windowsEvents(windowsEvents: List<Any>) {
        cdkBuilder.windowsEvents(windowsEvents)
      }

      override fun windowsEvents(vararg windowsEvents: Any): Unit =
          windowsEvents(windowsEvents.toList())

      public fun build():
          software.amazon.awscdk.services.applicationinsights.CfnApplication.ConfigurationDetailsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.ConfigurationDetailsProperty,
    ) : CdkObject(cdkObject), ConfigurationDetailsProperty {
      override fun alarmMetrics(): Any? = unwrap(this).getAlarmMetrics()

      override fun alarms(): Any? = unwrap(this).getAlarms()

      override fun haClusterPrometheusExporter(): Any? =
          unwrap(this).getHaClusterPrometheusExporter()

      override fun hanaPrometheusExporter(): Any? = unwrap(this).getHanaPrometheusExporter()

      override fun jmxPrometheusExporter(): Any? = unwrap(this).getJmxPrometheusExporter()

      override fun logs(): Any? = unwrap(this).getLogs()

      override fun windowsEvents(): Any? = unwrap(this).getWindowsEvents()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConfigurationDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.applicationinsights.CfnApplication.ConfigurationDetailsProperty):
          ConfigurationDetailsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConfigurationDetailsProperty):
          software.amazon.awscdk.services.applicationinsights.CfnApplication.ConfigurationDetailsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.applicationinsights.CfnApplication.ConfigurationDetailsProperty
    }
  }

  public interface SubComponentConfigurationDetailsProperty {
    public fun alarmMetrics(): Any? = unwrap(this).getAlarmMetrics()

    public fun logs(): Any? = unwrap(this).getLogs()

    public fun windowsEvents(): Any? = unwrap(this).getWindowsEvents()

    @CdkDslMarker
    public interface Builder {
      public fun alarmMetrics(alarmMetrics: IResolvable)

      public fun alarmMetrics(alarmMetrics: List<Any>)

      public fun alarmMetrics(vararg alarmMetrics: Any)

      public fun logs(logs: IResolvable)

      public fun logs(logs: List<Any>)

      public fun logs(vararg logs: Any)

      public fun windowsEvents(windowsEvents: IResolvable)

      public fun windowsEvents(windowsEvents: List<Any>)

      public fun windowsEvents(vararg windowsEvents: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.SubComponentConfigurationDetailsProperty.Builder
          =
          software.amazon.awscdk.services.applicationinsights.CfnApplication.SubComponentConfigurationDetailsProperty.builder()

      override fun alarmMetrics(alarmMetrics: IResolvable) {
        cdkBuilder.alarmMetrics(alarmMetrics.let(IResolvable::unwrap))
      }

      override fun alarmMetrics(alarmMetrics: List<Any>) {
        cdkBuilder.alarmMetrics(alarmMetrics)
      }

      override fun alarmMetrics(vararg alarmMetrics: Any): Unit =
          alarmMetrics(alarmMetrics.toList())

      override fun logs(logs: IResolvable) {
        cdkBuilder.logs(logs.let(IResolvable::unwrap))
      }

      override fun logs(logs: List<Any>) {
        cdkBuilder.logs(logs)
      }

      override fun logs(vararg logs: Any): Unit = logs(logs.toList())

      override fun windowsEvents(windowsEvents: IResolvable) {
        cdkBuilder.windowsEvents(windowsEvents.let(IResolvable::unwrap))
      }

      override fun windowsEvents(windowsEvents: List<Any>) {
        cdkBuilder.windowsEvents(windowsEvents)
      }

      override fun windowsEvents(vararg windowsEvents: Any): Unit =
          windowsEvents(windowsEvents.toList())

      public fun build():
          software.amazon.awscdk.services.applicationinsights.CfnApplication.SubComponentConfigurationDetailsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.SubComponentConfigurationDetailsProperty,
    ) : CdkObject(cdkObject), SubComponentConfigurationDetailsProperty {
      override fun alarmMetrics(): Any? = unwrap(this).getAlarmMetrics()

      override fun logs(): Any? = unwrap(this).getLogs()

      override fun windowsEvents(): Any? = unwrap(this).getWindowsEvents()
    }

    public companion object {
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
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.applicationinsights.CfnApplication.SubComponentConfigurationDetailsProperty
    }
  }

  public interface JMXPrometheusExporterProperty {
    public fun hostPort(): String? = unwrap(this).getHostPort()

    public fun jmxurl(): String? = unwrap(this).getJmxurl()

    public fun prometheusPort(): String? = unwrap(this).getPrometheusPort()

    @CdkDslMarker
    public interface Builder {
      public fun hostPort(hostPort: String)

      public fun jmxurl(jmxurl: String)

      public fun prometheusPort(prometheusPort: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.JMXPrometheusExporterProperty.Builder
          =
          software.amazon.awscdk.services.applicationinsights.CfnApplication.JMXPrometheusExporterProperty.builder()

      override fun hostPort(hostPort: String) {
        cdkBuilder.hostPort(hostPort)
      }

      override fun jmxurl(jmxurl: String) {
        cdkBuilder.jmxurl(jmxurl)
      }

      override fun prometheusPort(prometheusPort: String) {
        cdkBuilder.prometheusPort(prometheusPort)
      }

      public fun build():
          software.amazon.awscdk.services.applicationinsights.CfnApplication.JMXPrometheusExporterProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.JMXPrometheusExporterProperty,
    ) : CdkObject(cdkObject), JMXPrometheusExporterProperty {
      override fun hostPort(): String? = unwrap(this).getHostPort()

      override fun jmxurl(): String? = unwrap(this).getJmxurl()

      override fun prometheusPort(): String? = unwrap(this).getPrometheusPort()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): JMXPrometheusExporterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.applicationinsights.CfnApplication.JMXPrometheusExporterProperty):
          JMXPrometheusExporterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: JMXPrometheusExporterProperty):
          software.amazon.awscdk.services.applicationinsights.CfnApplication.JMXPrometheusExporterProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.applicationinsights.CfnApplication.JMXPrometheusExporterProperty
    }
  }

  public interface LogProperty {
    public fun encoding(): String? = unwrap(this).getEncoding()

    public fun logGroupName(): String? = unwrap(this).getLogGroupName()

    public fun logPath(): String? = unwrap(this).getLogPath()

    public fun logType(): String

    public fun patternSet(): String? = unwrap(this).getPatternSet()

    @CdkDslMarker
    public interface Builder {
      public fun encoding(encoding: String)

      public fun logGroupName(logGroupName: String)

      public fun logPath(logPath: String)

      public fun logType(logType: String)

      public fun patternSet(patternSet: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.LogProperty.Builder =
          software.amazon.awscdk.services.applicationinsights.CfnApplication.LogProperty.builder()

      override fun encoding(encoding: String) {
        cdkBuilder.encoding(encoding)
      }

      override fun logGroupName(logGroupName: String) {
        cdkBuilder.logGroupName(logGroupName)
      }

      override fun logPath(logPath: String) {
        cdkBuilder.logPath(logPath)
      }

      override fun logType(logType: String) {
        cdkBuilder.logType(logType)
      }

      override fun patternSet(patternSet: String) {
        cdkBuilder.patternSet(patternSet)
      }

      public fun build():
          software.amazon.awscdk.services.applicationinsights.CfnApplication.LogProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.LogProperty,
    ) : CdkObject(cdkObject), LogProperty {
      override fun encoding(): String? = unwrap(this).getEncoding()

      override fun logGroupName(): String? = unwrap(this).getLogGroupName()

      override fun logPath(): String? = unwrap(this).getLogPath()

      override fun logType(): String = unwrap(this).getLogType()

      override fun patternSet(): String? = unwrap(this).getPatternSet()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LogProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.applicationinsights.CfnApplication.LogProperty):
          LogProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LogProperty):
          software.amazon.awscdk.services.applicationinsights.CfnApplication.LogProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.applicationinsights.CfnApplication.LogProperty
    }
  }

  public interface SubComponentTypeConfigurationProperty {
    public fun subComponentConfigurationDetails(): Any

    public fun subComponentType(): String

    @CdkDslMarker
    public interface Builder {
      public fun subComponentConfigurationDetails(subComponentConfigurationDetails: IResolvable)

      public
          fun subComponentConfigurationDetails(subComponentConfigurationDetails: SubComponentConfigurationDetailsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6cceeff7e3247f0f06789a218f95b07fda8f6430d9c7a9c50818fb81d6839d17")
      public
          fun subComponentConfigurationDetails(subComponentConfigurationDetails: SubComponentConfigurationDetailsProperty.Builder.() -> Unit)

      public fun subComponentType(subComponentType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.SubComponentTypeConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.applicationinsights.CfnApplication.SubComponentTypeConfigurationProperty.builder()

      override fun subComponentConfigurationDetails(subComponentConfigurationDetails: IResolvable) {
        cdkBuilder.subComponentConfigurationDetails(subComponentConfigurationDetails.let(IResolvable::unwrap))
      }

      override
          fun subComponentConfigurationDetails(subComponentConfigurationDetails: SubComponentConfigurationDetailsProperty) {
        cdkBuilder.subComponentConfigurationDetails(subComponentConfigurationDetails.let(SubComponentConfigurationDetailsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6cceeff7e3247f0f06789a218f95b07fda8f6430d9c7a9c50818fb81d6839d17")
      override
          fun subComponentConfigurationDetails(subComponentConfigurationDetails: SubComponentConfigurationDetailsProperty.Builder.() -> Unit):
          Unit =
          subComponentConfigurationDetails(SubComponentConfigurationDetailsProperty(subComponentConfigurationDetails))

      override fun subComponentType(subComponentType: String) {
        cdkBuilder.subComponentType(subComponentType)
      }

      public fun build():
          software.amazon.awscdk.services.applicationinsights.CfnApplication.SubComponentTypeConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.SubComponentTypeConfigurationProperty,
    ) : CdkObject(cdkObject), SubComponentTypeConfigurationProperty {
      override fun subComponentConfigurationDetails(): Any =
          unwrap(this).getSubComponentConfigurationDetails()

      override fun subComponentType(): String = unwrap(this).getSubComponentType()
    }

    public companion object {
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
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.applicationinsights.CfnApplication.SubComponentTypeConfigurationProperty
    }
  }

  public interface CustomComponentProperty {
    public fun componentName(): String

    public fun resourceList(): List<String>

    @CdkDslMarker
    public interface Builder {
      public fun componentName(componentName: String)

      public fun resourceList(resourceList: List<String>)

      public fun resourceList(vararg resourceList: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.CustomComponentProperty.Builder
          =
          software.amazon.awscdk.services.applicationinsights.CfnApplication.CustomComponentProperty.builder()

      override fun componentName(componentName: String) {
        cdkBuilder.componentName(componentName)
      }

      override fun resourceList(resourceList: List<String>) {
        cdkBuilder.resourceList(resourceList)
      }

      override fun resourceList(vararg resourceList: String): Unit =
          resourceList(resourceList.toList())

      public fun build():
          software.amazon.awscdk.services.applicationinsights.CfnApplication.CustomComponentProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.CustomComponentProperty,
    ) : CdkObject(cdkObject), CustomComponentProperty {
      override fun componentName(): String = unwrap(this).getComponentName()

      override fun resourceList(): List<String> = unwrap(this).getResourceList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CustomComponentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.applicationinsights.CfnApplication.CustomComponentProperty):
          CustomComponentProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomComponentProperty):
          software.amazon.awscdk.services.applicationinsights.CfnApplication.CustomComponentProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.applicationinsights.CfnApplication.CustomComponentProperty
    }
  }

  public interface HANAPrometheusExporterProperty {
    public fun agreeToInstallHanadbClient(): Any

    public fun hanaPort(): String

    public fun hanaSecretName(): String

    public fun hanasid(): String

    public fun prometheusPort(): String? = unwrap(this).getPrometheusPort()

    @CdkDslMarker
    public interface Builder {
      public fun agreeToInstallHanadbClient(agreeToInstallHanadbClient: Boolean)

      public fun agreeToInstallHanadbClient(agreeToInstallHanadbClient: IResolvable)

      public fun hanaPort(hanaPort: String)

      public fun hanaSecretName(hanaSecretName: String)

      public fun hanasid(hanasid: String)

      public fun prometheusPort(prometheusPort: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.HANAPrometheusExporterProperty.Builder
          =
          software.amazon.awscdk.services.applicationinsights.CfnApplication.HANAPrometheusExporterProperty.builder()

      override fun agreeToInstallHanadbClient(agreeToInstallHanadbClient: Boolean) {
        cdkBuilder.agreeToInstallHanadbClient(agreeToInstallHanadbClient)
      }

      override fun agreeToInstallHanadbClient(agreeToInstallHanadbClient: IResolvable) {
        cdkBuilder.agreeToInstallHanadbClient(agreeToInstallHanadbClient.let(IResolvable::unwrap))
      }

      override fun hanaPort(hanaPort: String) {
        cdkBuilder.hanaPort(hanaPort)
      }

      override fun hanaSecretName(hanaSecretName: String) {
        cdkBuilder.hanaSecretName(hanaSecretName)
      }

      override fun hanasid(hanasid: String) {
        cdkBuilder.hanasid(hanasid)
      }

      override fun prometheusPort(prometheusPort: String) {
        cdkBuilder.prometheusPort(prometheusPort)
      }

      public fun build():
          software.amazon.awscdk.services.applicationinsights.CfnApplication.HANAPrometheusExporterProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.HANAPrometheusExporterProperty,
    ) : CdkObject(cdkObject), HANAPrometheusExporterProperty {
      override fun agreeToInstallHanadbClient(): Any = unwrap(this).getAgreeToInstallHanadbClient()

      override fun hanaPort(): String = unwrap(this).getHanaPort()

      override fun hanaSecretName(): String = unwrap(this).getHanaSecretName()

      override fun hanasid(): String = unwrap(this).getHanasid()

      override fun prometheusPort(): String? = unwrap(this).getPrometheusPort()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HANAPrometheusExporterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.applicationinsights.CfnApplication.HANAPrometheusExporterProperty):
          HANAPrometheusExporterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HANAPrometheusExporterProperty):
          software.amazon.awscdk.services.applicationinsights.CfnApplication.HANAPrometheusExporterProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.applicationinsights.CfnApplication.HANAPrometheusExporterProperty
    }
  }

  public interface LogPatternProperty {
    public fun pattern(): String

    public fun patternName(): String

    public fun rank(): Number

    @CdkDslMarker
    public interface Builder {
      public fun pattern(pattern: String)

      public fun patternName(patternName: String)

      public fun rank(rank: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.LogPatternProperty.Builder
          =
          software.amazon.awscdk.services.applicationinsights.CfnApplication.LogPatternProperty.builder()

      override fun pattern(pattern: String) {
        cdkBuilder.pattern(pattern)
      }

      override fun patternName(patternName: String) {
        cdkBuilder.patternName(patternName)
      }

      override fun rank(rank: Number) {
        cdkBuilder.rank(rank)
      }

      public fun build():
          software.amazon.awscdk.services.applicationinsights.CfnApplication.LogPatternProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.LogPatternProperty,
    ) : CdkObject(cdkObject), LogPatternProperty {
      override fun pattern(): String = unwrap(this).getPattern()

      override fun patternName(): String = unwrap(this).getPatternName()

      override fun rank(): Number = unwrap(this).getRank()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LogPatternProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.applicationinsights.CfnApplication.LogPatternProperty):
          LogPatternProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LogPatternProperty):
          software.amazon.awscdk.services.applicationinsights.CfnApplication.LogPatternProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.applicationinsights.CfnApplication.LogPatternProperty
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

    @CdkDslMarker
    public interface Builder {
      public fun componentArn(componentArn: String)

      public fun componentConfigurationMode(componentConfigurationMode: String)

      public fun componentName(componentName: String)

      public fun customComponentConfiguration(customComponentConfiguration: IResolvable)

      public
          fun customComponentConfiguration(customComponentConfiguration: ComponentConfigurationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("457cc7c6eb707505dd8cb7ff3054381f5738ce732f8bf3fb55022aa362f0e924")
      public
          fun customComponentConfiguration(customComponentConfiguration: ComponentConfigurationProperty.Builder.() -> Unit)

      public
          fun defaultOverwriteComponentConfiguration(defaultOverwriteComponentConfiguration: IResolvable)

      public
          fun defaultOverwriteComponentConfiguration(defaultOverwriteComponentConfiguration: ComponentConfigurationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e4791a30d1187c148ce4f3612f5b25e8c8f513997350b6e911df83437cc08c45")
      public
          fun defaultOverwriteComponentConfiguration(defaultOverwriteComponentConfiguration: ComponentConfigurationProperty.Builder.() -> Unit)

      public fun tier(tier: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.ComponentMonitoringSettingProperty.Builder
          =
          software.amazon.awscdk.services.applicationinsights.CfnApplication.ComponentMonitoringSettingProperty.builder()

      override fun componentArn(componentArn: String) {
        cdkBuilder.componentArn(componentArn)
      }

      override fun componentConfigurationMode(componentConfigurationMode: String) {
        cdkBuilder.componentConfigurationMode(componentConfigurationMode)
      }

      override fun componentName(componentName: String) {
        cdkBuilder.componentName(componentName)
      }

      override fun customComponentConfiguration(customComponentConfiguration: IResolvable) {
        cdkBuilder.customComponentConfiguration(customComponentConfiguration.let(IResolvable::unwrap))
      }

      override
          fun customComponentConfiguration(customComponentConfiguration: ComponentConfigurationProperty) {
        cdkBuilder.customComponentConfiguration(customComponentConfiguration.let(ComponentConfigurationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("457cc7c6eb707505dd8cb7ff3054381f5738ce732f8bf3fb55022aa362f0e924")
      override
          fun customComponentConfiguration(customComponentConfiguration: ComponentConfigurationProperty.Builder.() -> Unit):
          Unit =
          customComponentConfiguration(ComponentConfigurationProperty(customComponentConfiguration))

      override
          fun defaultOverwriteComponentConfiguration(defaultOverwriteComponentConfiguration: IResolvable) {
        cdkBuilder.defaultOverwriteComponentConfiguration(defaultOverwriteComponentConfiguration.let(IResolvable::unwrap))
      }

      override
          fun defaultOverwriteComponentConfiguration(defaultOverwriteComponentConfiguration: ComponentConfigurationProperty) {
        cdkBuilder.defaultOverwriteComponentConfiguration(defaultOverwriteComponentConfiguration.let(ComponentConfigurationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e4791a30d1187c148ce4f3612f5b25e8c8f513997350b6e911df83437cc08c45")
      override
          fun defaultOverwriteComponentConfiguration(defaultOverwriteComponentConfiguration: ComponentConfigurationProperty.Builder.() -> Unit):
          Unit =
          defaultOverwriteComponentConfiguration(ComponentConfigurationProperty(defaultOverwriteComponentConfiguration))

      override fun tier(tier: String) {
        cdkBuilder.tier(tier)
      }

      public fun build():
          software.amazon.awscdk.services.applicationinsights.CfnApplication.ComponentMonitoringSettingProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.ComponentMonitoringSettingProperty,
    ) : CdkObject(cdkObject), ComponentMonitoringSettingProperty {
      override fun componentArn(): String? = unwrap(this).getComponentArn()

      override fun componentConfigurationMode(): String =
          unwrap(this).getComponentConfigurationMode()

      override fun componentName(): String? = unwrap(this).getComponentName()

      override fun customComponentConfiguration(): Any? =
          unwrap(this).getCustomComponentConfiguration()

      override fun defaultOverwriteComponentConfiguration(): Any? =
          unwrap(this).getDefaultOverwriteComponentConfiguration()

      override fun tier(): String = unwrap(this).getTier()
    }

    public companion object {
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
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.applicationinsights.CfnApplication.ComponentMonitoringSettingProperty
    }
  }

  public interface AlarmMetricProperty {
    public fun alarmMetricName(): String

    @CdkDslMarker
    public interface Builder {
      public fun alarmMetricName(alarmMetricName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.AlarmMetricProperty.Builder
          =
          software.amazon.awscdk.services.applicationinsights.CfnApplication.AlarmMetricProperty.builder()

      override fun alarmMetricName(alarmMetricName: String) {
        cdkBuilder.alarmMetricName(alarmMetricName)
      }

      public fun build():
          software.amazon.awscdk.services.applicationinsights.CfnApplication.AlarmMetricProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.AlarmMetricProperty,
    ) : CdkObject(cdkObject), AlarmMetricProperty {
      override fun alarmMetricName(): String = unwrap(this).getAlarmMetricName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AlarmMetricProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.applicationinsights.CfnApplication.AlarmMetricProperty):
          AlarmMetricProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AlarmMetricProperty):
          software.amazon.awscdk.services.applicationinsights.CfnApplication.AlarmMetricProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.applicationinsights.CfnApplication.AlarmMetricProperty
    }
  }
}
