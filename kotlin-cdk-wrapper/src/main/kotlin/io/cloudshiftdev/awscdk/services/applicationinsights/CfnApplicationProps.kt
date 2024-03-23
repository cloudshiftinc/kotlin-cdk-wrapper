@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.applicationinsights

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnApplication`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.applicationinsights.*;
 * CfnApplicationProps cfnApplicationProps = CfnApplicationProps.builder()
 * .resourceGroupName("resourceGroupName")
 * // the properties below are optional
 * .attachMissingPermission(false)
 * .autoConfigurationEnabled(false)
 * .componentMonitoringSettings(List.of(ComponentMonitoringSettingProperty.builder()
 * .componentConfigurationMode("componentConfigurationMode")
 * .tier("tier")
 * // the properties below are optional
 * .componentArn("componentArn")
 * .componentName("componentName")
 * .customComponentConfiguration(ComponentConfigurationProperty.builder()
 * .configurationDetails(ConfigurationDetailsProperty.builder()
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
 * .build())
 * .subComponentTypeConfigurations(List.of(SubComponentTypeConfigurationProperty.builder()
 * .subComponentConfigurationDetails(SubComponentConfigurationDetailsProperty.builder()
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
 * .build())
 * .subComponentType("subComponentType")
 * .build()))
 * .build())
 * .defaultOverwriteComponentConfiguration(ComponentConfigurationProperty.builder()
 * .configurationDetails(ConfigurationDetailsProperty.builder()
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
 * .build())
 * .subComponentTypeConfigurations(List.of(SubComponentTypeConfigurationProperty.builder()
 * .subComponentConfigurationDetails(SubComponentConfigurationDetailsProperty.builder()
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
 * .build())
 * .subComponentType("subComponentType")
 * .build()))
 * .build())
 * .build()))
 * .customComponents(List.of(CustomComponentProperty.builder()
 * .componentName("componentName")
 * .resourceList(List.of("resourceList"))
 * .build()))
 * .cweMonitorEnabled(false)
 * .groupingType("groupingType")
 * .logPatternSets(List.of(LogPatternSetProperty.builder()
 * .logPatterns(List.of(LogPatternProperty.builder()
 * .pattern("pattern")
 * .patternName("patternName")
 * .rank(123)
 * .build()))
 * .patternSetName("patternSetName")
 * .build()))
 * .opsCenterEnabled(false)
 * .opsItemSnsTopicArn("opsItemSnsTopicArn")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html)
 */
public interface CfnApplicationProps {
  /**
   * If set to true, the managed policies for SSM and CW will be attached to the instance roles if
   * they are missing.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-attachmissingpermission)
   */
  public fun attachMissingPermission(): Any? = unwrap(this).getAttachMissingPermission()

  /**
   * If set to `true` , the application components will be configured with the monitoring
   * configuration recommended by Application Insights.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-autoconfigurationenabled)
   */
  public fun autoConfigurationEnabled(): Any? = unwrap(this).getAutoConfigurationEnabled()

  /**
   * The monitoring settings of the components.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-componentmonitoringsettings)
   */
  public fun componentMonitoringSettings(): Any? = unwrap(this).getComponentMonitoringSettings()

  /**
   * Describes a custom component by grouping similar standalone instances to monitor.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-customcomponents)
   */
  public fun customComponents(): Any? = unwrap(this).getCustomComponents()

  /**
   * Indicates whether Application Insights can listen to CloudWatch events for the application
   * resources, such as `instance terminated` , `failed deployment` , and others.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-cwemonitorenabled)
   */
  public fun cweMonitorEnabled(): Any? = unwrap(this).getCweMonitorEnabled()

  /**
   * Application Insights can create applications based on a resource group or on an account.
   *
   * To create an account-based application using all of the resources in the account, set this
   * parameter to `ACCOUNT_BASED` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-groupingtype)
   */
  public fun groupingType(): String? = unwrap(this).getGroupingType()

  /**
   * The log pattern sets.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-logpatternsets)
   */
  public fun logPatternSets(): Any? = unwrap(this).getLogPatternSets()

  /**
   * Indicates whether Application Insights will create OpsItems for any problem that is detected by
   * Application Insights for an application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-opscenterenabled)
   */
  public fun opsCenterEnabled(): Any? = unwrap(this).getOpsCenterEnabled()

  /**
   * The SNS topic provided to Application Insights that is associated with the created OpsItems to
   * receive SNS notifications for opsItem updates.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-opsitemsnstopicarn)
   */
  public fun opsItemSnsTopicArn(): String? = unwrap(this).getOpsItemSnsTopicArn()

  /**
   * The name of the resource group used for the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-resourcegroupname)
   */
  public fun resourceGroupName(): String

  /**
   * An array of `Tags` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnApplicationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param attachMissingPermission If set to true, the managed policies for SSM and CW will be
     * attached to the instance roles if they are missing.
     */
    public fun attachMissingPermission(attachMissingPermission: Boolean)

    /**
     * @param attachMissingPermission If set to true, the managed policies for SSM and CW will be
     * attached to the instance roles if they are missing.
     */
    public fun attachMissingPermission(attachMissingPermission: IResolvable)

    /**
     * @param autoConfigurationEnabled If set to `true` , the application components will be
     * configured with the monitoring configuration recommended by Application Insights.
     */
    public fun autoConfigurationEnabled(autoConfigurationEnabled: Boolean)

    /**
     * @param autoConfigurationEnabled If set to `true` , the application components will be
     * configured with the monitoring configuration recommended by Application Insights.
     */
    public fun autoConfigurationEnabled(autoConfigurationEnabled: IResolvable)

    /**
     * @param componentMonitoringSettings The monitoring settings of the components.
     */
    public fun componentMonitoringSettings(componentMonitoringSettings: IResolvable)

    /**
     * @param componentMonitoringSettings The monitoring settings of the components.
     */
    public fun componentMonitoringSettings(componentMonitoringSettings: List<Any>)

    /**
     * @param componentMonitoringSettings The monitoring settings of the components.
     */
    public fun componentMonitoringSettings(vararg componentMonitoringSettings: Any)

    /**
     * @param customComponents Describes a custom component by grouping similar standalone instances
     * to monitor.
     */
    public fun customComponents(customComponents: IResolvable)

    /**
     * @param customComponents Describes a custom component by grouping similar standalone instances
     * to monitor.
     */
    public fun customComponents(customComponents: List<Any>)

    /**
     * @param customComponents Describes a custom component by grouping similar standalone instances
     * to monitor.
     */
    public fun customComponents(vararg customComponents: Any)

    /**
     * @param cweMonitorEnabled Indicates whether Application Insights can listen to CloudWatch
     * events for the application resources, such as `instance terminated` , `failed deployment` , and
     * others.
     */
    public fun cweMonitorEnabled(cweMonitorEnabled: Boolean)

    /**
     * @param cweMonitorEnabled Indicates whether Application Insights can listen to CloudWatch
     * events for the application resources, such as `instance terminated` , `failed deployment` , and
     * others.
     */
    public fun cweMonitorEnabled(cweMonitorEnabled: IResolvable)

    /**
     * @param groupingType Application Insights can create applications based on a resource group or
     * on an account.
     * To create an account-based application using all of the resources in the account, set this
     * parameter to `ACCOUNT_BASED` .
     */
    public fun groupingType(groupingType: String)

    /**
     * @param logPatternSets The log pattern sets.
     */
    public fun logPatternSets(logPatternSets: IResolvable)

    /**
     * @param logPatternSets The log pattern sets.
     */
    public fun logPatternSets(logPatternSets: List<Any>)

    /**
     * @param logPatternSets The log pattern sets.
     */
    public fun logPatternSets(vararg logPatternSets: Any)

    /**
     * @param opsCenterEnabled Indicates whether Application Insights will create OpsItems for any
     * problem that is detected by Application Insights for an application.
     */
    public fun opsCenterEnabled(opsCenterEnabled: Boolean)

    /**
     * @param opsCenterEnabled Indicates whether Application Insights will create OpsItems for any
     * problem that is detected by Application Insights for an application.
     */
    public fun opsCenterEnabled(opsCenterEnabled: IResolvable)

    /**
     * @param opsItemSnsTopicArn The SNS topic provided to Application Insights that is associated
     * with the created OpsItems to receive SNS notifications for opsItem updates.
     */
    public fun opsItemSnsTopicArn(opsItemSnsTopicArn: String)

    /**
     * @param resourceGroupName The name of the resource group used for the application. 
     */
    public fun resourceGroupName(resourceGroupName: String)

    /**
     * @param tags An array of `Tags` .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of `Tags` .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.applicationinsights.CfnApplicationProps.Builder =
        software.amazon.awscdk.services.applicationinsights.CfnApplicationProps.builder()

    /**
     * @param attachMissingPermission If set to true, the managed policies for SSM and CW will be
     * attached to the instance roles if they are missing.
     */
    override fun attachMissingPermission(attachMissingPermission: Boolean) {
      cdkBuilder.attachMissingPermission(attachMissingPermission)
    }

    /**
     * @param attachMissingPermission If set to true, the managed policies for SSM and CW will be
     * attached to the instance roles if they are missing.
     */
    override fun attachMissingPermission(attachMissingPermission: IResolvable) {
      cdkBuilder.attachMissingPermission(attachMissingPermission.let(IResolvable::unwrap))
    }

    /**
     * @param autoConfigurationEnabled If set to `true` , the application components will be
     * configured with the monitoring configuration recommended by Application Insights.
     */
    override fun autoConfigurationEnabled(autoConfigurationEnabled: Boolean) {
      cdkBuilder.autoConfigurationEnabled(autoConfigurationEnabled)
    }

    /**
     * @param autoConfigurationEnabled If set to `true` , the application components will be
     * configured with the monitoring configuration recommended by Application Insights.
     */
    override fun autoConfigurationEnabled(autoConfigurationEnabled: IResolvable) {
      cdkBuilder.autoConfigurationEnabled(autoConfigurationEnabled.let(IResolvable::unwrap))
    }

    /**
     * @param componentMonitoringSettings The monitoring settings of the components.
     */
    override fun componentMonitoringSettings(componentMonitoringSettings: IResolvable) {
      cdkBuilder.componentMonitoringSettings(componentMonitoringSettings.let(IResolvable::unwrap))
    }

    /**
     * @param componentMonitoringSettings The monitoring settings of the components.
     */
    override fun componentMonitoringSettings(componentMonitoringSettings: List<Any>) {
      cdkBuilder.componentMonitoringSettings(componentMonitoringSettings)
    }

    /**
     * @param componentMonitoringSettings The monitoring settings of the components.
     */
    override fun componentMonitoringSettings(vararg componentMonitoringSettings: Any): Unit =
        componentMonitoringSettings(componentMonitoringSettings.toList())

    /**
     * @param customComponents Describes a custom component by grouping similar standalone instances
     * to monitor.
     */
    override fun customComponents(customComponents: IResolvable) {
      cdkBuilder.customComponents(customComponents.let(IResolvable::unwrap))
    }

    /**
     * @param customComponents Describes a custom component by grouping similar standalone instances
     * to monitor.
     */
    override fun customComponents(customComponents: List<Any>) {
      cdkBuilder.customComponents(customComponents)
    }

    /**
     * @param customComponents Describes a custom component by grouping similar standalone instances
     * to monitor.
     */
    override fun customComponents(vararg customComponents: Any): Unit =
        customComponents(customComponents.toList())

    /**
     * @param cweMonitorEnabled Indicates whether Application Insights can listen to CloudWatch
     * events for the application resources, such as `instance terminated` , `failed deployment` , and
     * others.
     */
    override fun cweMonitorEnabled(cweMonitorEnabled: Boolean) {
      cdkBuilder.cweMonitorEnabled(cweMonitorEnabled)
    }

    /**
     * @param cweMonitorEnabled Indicates whether Application Insights can listen to CloudWatch
     * events for the application resources, such as `instance terminated` , `failed deployment` , and
     * others.
     */
    override fun cweMonitorEnabled(cweMonitorEnabled: IResolvable) {
      cdkBuilder.cweMonitorEnabled(cweMonitorEnabled.let(IResolvable::unwrap))
    }

    /**
     * @param groupingType Application Insights can create applications based on a resource group or
     * on an account.
     * To create an account-based application using all of the resources in the account, set this
     * parameter to `ACCOUNT_BASED` .
     */
    override fun groupingType(groupingType: String) {
      cdkBuilder.groupingType(groupingType)
    }

    /**
     * @param logPatternSets The log pattern sets.
     */
    override fun logPatternSets(logPatternSets: IResolvable) {
      cdkBuilder.logPatternSets(logPatternSets.let(IResolvable::unwrap))
    }

    /**
     * @param logPatternSets The log pattern sets.
     */
    override fun logPatternSets(logPatternSets: List<Any>) {
      cdkBuilder.logPatternSets(logPatternSets)
    }

    /**
     * @param logPatternSets The log pattern sets.
     */
    override fun logPatternSets(vararg logPatternSets: Any): Unit =
        logPatternSets(logPatternSets.toList())

    /**
     * @param opsCenterEnabled Indicates whether Application Insights will create OpsItems for any
     * problem that is detected by Application Insights for an application.
     */
    override fun opsCenterEnabled(opsCenterEnabled: Boolean) {
      cdkBuilder.opsCenterEnabled(opsCenterEnabled)
    }

    /**
     * @param opsCenterEnabled Indicates whether Application Insights will create OpsItems for any
     * problem that is detected by Application Insights for an application.
     */
    override fun opsCenterEnabled(opsCenterEnabled: IResolvable) {
      cdkBuilder.opsCenterEnabled(opsCenterEnabled.let(IResolvable::unwrap))
    }

    /**
     * @param opsItemSnsTopicArn The SNS topic provided to Application Insights that is associated
     * with the created OpsItems to receive SNS notifications for opsItem updates.
     */
    override fun opsItemSnsTopicArn(opsItemSnsTopicArn: String) {
      cdkBuilder.opsItemSnsTopicArn(opsItemSnsTopicArn)
    }

    /**
     * @param resourceGroupName The name of the resource group used for the application. 
     */
    override fun resourceGroupName(resourceGroupName: String) {
      cdkBuilder.resourceGroupName(resourceGroupName)
    }

    /**
     * @param tags An array of `Tags` .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of `Tags` .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.applicationinsights.CfnApplicationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.applicationinsights.CfnApplicationProps,
  ) : CdkObject(cdkObject), CfnApplicationProps {
    /**
     * If set to true, the managed policies for SSM and CW will be attached to the instance roles if
     * they are missing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-attachmissingpermission)
     */
    override fun attachMissingPermission(): Any? = unwrap(this).getAttachMissingPermission()

    /**
     * If set to `true` , the application components will be configured with the monitoring
     * configuration recommended by Application Insights.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-autoconfigurationenabled)
     */
    override fun autoConfigurationEnabled(): Any? = unwrap(this).getAutoConfigurationEnabled()

    /**
     * The monitoring settings of the components.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-componentmonitoringsettings)
     */
    override fun componentMonitoringSettings(): Any? = unwrap(this).getComponentMonitoringSettings()

    /**
     * Describes a custom component by grouping similar standalone instances to monitor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-customcomponents)
     */
    override fun customComponents(): Any? = unwrap(this).getCustomComponents()

    /**
     * Indicates whether Application Insights can listen to CloudWatch events for the application
     * resources, such as `instance terminated` , `failed deployment` , and others.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-cwemonitorenabled)
     */
    override fun cweMonitorEnabled(): Any? = unwrap(this).getCweMonitorEnabled()

    /**
     * Application Insights can create applications based on a resource group or on an account.
     *
     * To create an account-based application using all of the resources in the account, set this
     * parameter to `ACCOUNT_BASED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-groupingtype)
     */
    override fun groupingType(): String? = unwrap(this).getGroupingType()

    /**
     * The log pattern sets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-logpatternsets)
     */
    override fun logPatternSets(): Any? = unwrap(this).getLogPatternSets()

    /**
     * Indicates whether Application Insights will create OpsItems for any problem that is detected
     * by Application Insights for an application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-opscenterenabled)
     */
    override fun opsCenterEnabled(): Any? = unwrap(this).getOpsCenterEnabled()

    /**
     * The SNS topic provided to Application Insights that is associated with the created OpsItems
     * to receive SNS notifications for opsItem updates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-opsitemsnstopicarn)
     */
    override fun opsItemSnsTopicArn(): String? = unwrap(this).getOpsItemSnsTopicArn()

    /**
     * The name of the resource group used for the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-resourcegroupname)
     */
    override fun resourceGroupName(): String = unwrap(this).getResourceGroupName()

    /**
     * An array of `Tags` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnApplicationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.applicationinsights.CfnApplicationProps):
        CfnApplicationProps = CdkObjectWrappers.wrap(cdkObject) as? CfnApplicationProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationProps):
        software.amazon.awscdk.services.applicationinsights.CfnApplicationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.applicationinsights.CfnApplicationProps
  }
}
