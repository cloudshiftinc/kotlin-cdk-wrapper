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

/**
 * The `AWS::ApplicationInsights::Application` resource adds an application that is created from a
 * resource group.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.applicationinsights.*;
 * CfnApplication cfnApplication = CfnApplication.Builder.create(this, "MyCfnApplication")
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
public open class CfnApplication internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.applicationinsights.CfnApplication,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * If set to true, the managed policies for SSM and CW will be attached to the instance roles if
   * they are missing.
   */
  public open fun attachMissingPermission(): Any? = unwrap(this).getAttachMissingPermission()

  /**
   * If set to true, the managed policies for SSM and CW will be attached to the instance roles if
   * they are missing.
   */
  public open fun attachMissingPermission(`value`: Boolean) {
    unwrap(this).setAttachMissingPermission(`value`)
  }

  /**
   * If set to true, the managed policies for SSM and CW will be attached to the instance roles if
   * they are missing.
   */
  public open fun attachMissingPermission(`value`: IResolvable) {
    unwrap(this).setAttachMissingPermission(`value`.let(IResolvable::unwrap))
  }

  /**
   * Returns the Amazon Resource Name (ARN) of the application, such as
   * `arn:aws:applicationinsights:us-east-1:123456789012:application/resource-group/my_resource_group`
   * .
   */
  public open fun attrApplicationArn(): String = unwrap(this).getAttrApplicationArn()

  /**
   * If set to `true` , the application components will be configured with the monitoring
   * configuration recommended by Application Insights.
   */
  public open fun autoConfigurationEnabled(): Any? = unwrap(this).getAutoConfigurationEnabled()

  /**
   * If set to `true` , the application components will be configured with the monitoring
   * configuration recommended by Application Insights.
   */
  public open fun autoConfigurationEnabled(`value`: Boolean) {
    unwrap(this).setAutoConfigurationEnabled(`value`)
  }

  /**
   * If set to `true` , the application components will be configured with the monitoring
   * configuration recommended by Application Insights.
   */
  public open fun autoConfigurationEnabled(`value`: IResolvable) {
    unwrap(this).setAutoConfigurationEnabled(`value`.let(IResolvable::unwrap))
  }

  /**
   * The monitoring settings of the components.
   */
  public open fun componentMonitoringSettings(): Any? =
      unwrap(this).getComponentMonitoringSettings()

  /**
   * The monitoring settings of the components.
   */
  public open fun componentMonitoringSettings(`value`: IResolvable) {
    unwrap(this).setComponentMonitoringSettings(`value`.let(IResolvable::unwrap))
  }

  /**
   * The monitoring settings of the components.
   */
  public open fun componentMonitoringSettings(__idx_ac66f0: List<Any>) {
    unwrap(this).setComponentMonitoringSettings(__idx_ac66f0)
  }

  /**
   * The monitoring settings of the components.
   */
  public open fun componentMonitoringSettings(vararg __idx_ac66f0: Any): Unit =
      componentMonitoringSettings(__idx_ac66f0.toList())

  /**
   * Describes a custom component by grouping similar standalone instances to monitor.
   */
  public open fun customComponents(): Any? = unwrap(this).getCustomComponents()

  /**
   * Describes a custom component by grouping similar standalone instances to monitor.
   */
  public open fun customComponents(`value`: IResolvable) {
    unwrap(this).setCustomComponents(`value`.let(IResolvable::unwrap))
  }

  /**
   * Describes a custom component by grouping similar standalone instances to monitor.
   */
  public open fun customComponents(__idx_ac66f0: List<Any>) {
    unwrap(this).setCustomComponents(__idx_ac66f0)
  }

  /**
   * Describes a custom component by grouping similar standalone instances to monitor.
   */
  public open fun customComponents(vararg __idx_ac66f0: Any): Unit =
      customComponents(__idx_ac66f0.toList())

  /**
   * Indicates whether Application Insights can listen to CloudWatch events for the application
   * resources, such as `instance terminated` , `failed deployment` , and others.
   */
  public open fun cweMonitorEnabled(): Any? = unwrap(this).getCweMonitorEnabled()

  /**
   * Indicates whether Application Insights can listen to CloudWatch events for the application
   * resources, such as `instance terminated` , `failed deployment` , and others.
   */
  public open fun cweMonitorEnabled(`value`: Boolean) {
    unwrap(this).setCweMonitorEnabled(`value`)
  }

  /**
   * Indicates whether Application Insights can listen to CloudWatch events for the application
   * resources, such as `instance terminated` , `failed deployment` , and others.
   */
  public open fun cweMonitorEnabled(`value`: IResolvable) {
    unwrap(this).setCweMonitorEnabled(`value`.let(IResolvable::unwrap))
  }

  /**
   * Application Insights can create applications based on a resource group or on an account.
   */
  public open fun groupingType(): String? = unwrap(this).getGroupingType()

  /**
   * Application Insights can create applications based on a resource group or on an account.
   */
  public open fun groupingType(`value`: String) {
    unwrap(this).setGroupingType(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The log pattern sets.
   */
  public open fun logPatternSets(): Any? = unwrap(this).getLogPatternSets()

  /**
   * The log pattern sets.
   */
  public open fun logPatternSets(`value`: IResolvable) {
    unwrap(this).setLogPatternSets(`value`.let(IResolvable::unwrap))
  }

  /**
   * The log pattern sets.
   */
  public open fun logPatternSets(__idx_ac66f0: List<Any>) {
    unwrap(this).setLogPatternSets(__idx_ac66f0)
  }

  /**
   * The log pattern sets.
   */
  public open fun logPatternSets(vararg __idx_ac66f0: Any): Unit =
      logPatternSets(__idx_ac66f0.toList())

  /**
   * Indicates whether Application Insights will create OpsItems for any problem that is detected by
   * Application Insights for an application.
   */
  public open fun opsCenterEnabled(): Any? = unwrap(this).getOpsCenterEnabled()

  /**
   * Indicates whether Application Insights will create OpsItems for any problem that is detected by
   * Application Insights for an application.
   */
  public open fun opsCenterEnabled(`value`: Boolean) {
    unwrap(this).setOpsCenterEnabled(`value`)
  }

  /**
   * Indicates whether Application Insights will create OpsItems for any problem that is detected by
   * Application Insights for an application.
   */
  public open fun opsCenterEnabled(`value`: IResolvable) {
    unwrap(this).setOpsCenterEnabled(`value`.let(IResolvable::unwrap))
  }

  /**
   * The SNS topic provided to Application Insights that is associated with the created OpsItems to
   * receive SNS notifications for opsItem updates.
   */
  public open fun opsItemSnsTopicArn(): String? = unwrap(this).getOpsItemSnsTopicArn()

  /**
   * The SNS topic provided to Application Insights that is associated with the created OpsItems to
   * receive SNS notifications for opsItem updates.
   */
  public open fun opsItemSnsTopicArn(`value`: String) {
    unwrap(this).setOpsItemSnsTopicArn(`value`)
  }

  /**
   * The name of the resource group used for the application.
   */
  public open fun resourceGroupName(): String = unwrap(this).getResourceGroupName()

  /**
   * The name of the resource group used for the application.
   */
  public open fun resourceGroupName(`value`: String) {
    unwrap(this).setResourceGroupName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of `Tags` .
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of `Tags` .
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * An array of `Tags` .
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.applicationinsights.CfnApplication].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * If set to true, the managed policies for SSM and CW will be attached to the instance roles if
     * they are missing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-attachmissingpermission)
     * @param attachMissingPermission If set to true, the managed policies for SSM and CW will be
     * attached to the instance roles if they are missing. 
     */
    public fun attachMissingPermission(attachMissingPermission: Boolean)

    /**
     * If set to true, the managed policies for SSM and CW will be attached to the instance roles if
     * they are missing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-attachmissingpermission)
     * @param attachMissingPermission If set to true, the managed policies for SSM and CW will be
     * attached to the instance roles if they are missing. 
     */
    public fun attachMissingPermission(attachMissingPermission: IResolvable)

    /**
     * If set to `true` , the application components will be configured with the monitoring
     * configuration recommended by Application Insights.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-autoconfigurationenabled)
     * @param autoConfigurationEnabled If set to `true` , the application components will be
     * configured with the monitoring configuration recommended by Application Insights. 
     */
    public fun autoConfigurationEnabled(autoConfigurationEnabled: Boolean)

    /**
     * If set to `true` , the application components will be configured with the monitoring
     * configuration recommended by Application Insights.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-autoconfigurationenabled)
     * @param autoConfigurationEnabled If set to `true` , the application components will be
     * configured with the monitoring configuration recommended by Application Insights. 
     */
    public fun autoConfigurationEnabled(autoConfigurationEnabled: IResolvable)

    /**
     * The monitoring settings of the components.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-componentmonitoringsettings)
     * @param componentMonitoringSettings The monitoring settings of the components. 
     */
    public fun componentMonitoringSettings(componentMonitoringSettings: IResolvable)

    /**
     * The monitoring settings of the components.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-componentmonitoringsettings)
     * @param componentMonitoringSettings The monitoring settings of the components. 
     */
    public fun componentMonitoringSettings(componentMonitoringSettings: List<Any>)

    /**
     * The monitoring settings of the components.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-componentmonitoringsettings)
     * @param componentMonitoringSettings The monitoring settings of the components. 
     */
    public fun componentMonitoringSettings(vararg componentMonitoringSettings: Any)

    /**
     * Describes a custom component by grouping similar standalone instances to monitor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-customcomponents)
     * @param customComponents Describes a custom component by grouping similar standalone instances
     * to monitor. 
     */
    public fun customComponents(customComponents: IResolvable)

    /**
     * Describes a custom component by grouping similar standalone instances to monitor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-customcomponents)
     * @param customComponents Describes a custom component by grouping similar standalone instances
     * to monitor. 
     */
    public fun customComponents(customComponents: List<Any>)

    /**
     * Describes a custom component by grouping similar standalone instances to monitor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-customcomponents)
     * @param customComponents Describes a custom component by grouping similar standalone instances
     * to monitor. 
     */
    public fun customComponents(vararg customComponents: Any)

    /**
     * Indicates whether Application Insights can listen to CloudWatch events for the application
     * resources, such as `instance terminated` , `failed deployment` , and others.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-cwemonitorenabled)
     * @param cweMonitorEnabled Indicates whether Application Insights can listen to CloudWatch
     * events for the application resources, such as `instance terminated` , `failed deployment` , and
     * others. 
     */
    public fun cweMonitorEnabled(cweMonitorEnabled: Boolean)

    /**
     * Indicates whether Application Insights can listen to CloudWatch events for the application
     * resources, such as `instance terminated` , `failed deployment` , and others.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-cwemonitorenabled)
     * @param cweMonitorEnabled Indicates whether Application Insights can listen to CloudWatch
     * events for the application resources, such as `instance terminated` , `failed deployment` , and
     * others. 
     */
    public fun cweMonitorEnabled(cweMonitorEnabled: IResolvable)

    /**
     * Application Insights can create applications based on a resource group or on an account.
     *
     * To create an account-based application using all of the resources in the account, set this
     * parameter to `ACCOUNT_BASED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-groupingtype)
     * @param groupingType Application Insights can create applications based on a resource group or
     * on an account. 
     */
    public fun groupingType(groupingType: String)

    /**
     * The log pattern sets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-logpatternsets)
     * @param logPatternSets The log pattern sets. 
     */
    public fun logPatternSets(logPatternSets: IResolvable)

    /**
     * The log pattern sets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-logpatternsets)
     * @param logPatternSets The log pattern sets. 
     */
    public fun logPatternSets(logPatternSets: List<Any>)

    /**
     * The log pattern sets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-logpatternsets)
     * @param logPatternSets The log pattern sets. 
     */
    public fun logPatternSets(vararg logPatternSets: Any)

    /**
     * Indicates whether Application Insights will create OpsItems for any problem that is detected
     * by Application Insights for an application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-opscenterenabled)
     * @param opsCenterEnabled Indicates whether Application Insights will create OpsItems for any
     * problem that is detected by Application Insights for an application. 
     */
    public fun opsCenterEnabled(opsCenterEnabled: Boolean)

    /**
     * Indicates whether Application Insights will create OpsItems for any problem that is detected
     * by Application Insights for an application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-opscenterenabled)
     * @param opsCenterEnabled Indicates whether Application Insights will create OpsItems for any
     * problem that is detected by Application Insights for an application. 
     */
    public fun opsCenterEnabled(opsCenterEnabled: IResolvable)

    /**
     * The SNS topic provided to Application Insights that is associated with the created OpsItems
     * to receive SNS notifications for opsItem updates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-opsitemsnstopicarn)
     * @param opsItemSnsTopicArn The SNS topic provided to Application Insights that is associated
     * with the created OpsItems to receive SNS notifications for opsItem updates. 
     */
    public fun opsItemSnsTopicArn(opsItemSnsTopicArn: String)

    /**
     * The name of the resource group used for the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-resourcegroupname)
     * @param resourceGroupName The name of the resource group used for the application. 
     */
    public fun resourceGroupName(resourceGroupName: String)

    /**
     * An array of `Tags` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-tags)
     * @param tags An array of `Tags` . 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of `Tags` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-tags)
     * @param tags An array of `Tags` . 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.applicationinsights.CfnApplication.Builder =
        software.amazon.awscdk.services.applicationinsights.CfnApplication.Builder.create(scope, id)

    /**
     * If set to true, the managed policies for SSM and CW will be attached to the instance roles if
     * they are missing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-attachmissingpermission)
     * @param attachMissingPermission If set to true, the managed policies for SSM and CW will be
     * attached to the instance roles if they are missing. 
     */
    override fun attachMissingPermission(attachMissingPermission: Boolean) {
      cdkBuilder.attachMissingPermission(attachMissingPermission)
    }

    /**
     * If set to true, the managed policies for SSM and CW will be attached to the instance roles if
     * they are missing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-attachmissingpermission)
     * @param attachMissingPermission If set to true, the managed policies for SSM and CW will be
     * attached to the instance roles if they are missing. 
     */
    override fun attachMissingPermission(attachMissingPermission: IResolvable) {
      cdkBuilder.attachMissingPermission(attachMissingPermission.let(IResolvable::unwrap))
    }

    /**
     * If set to `true` , the application components will be configured with the monitoring
     * configuration recommended by Application Insights.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-autoconfigurationenabled)
     * @param autoConfigurationEnabled If set to `true` , the application components will be
     * configured with the monitoring configuration recommended by Application Insights. 
     */
    override fun autoConfigurationEnabled(autoConfigurationEnabled: Boolean) {
      cdkBuilder.autoConfigurationEnabled(autoConfigurationEnabled)
    }

    /**
     * If set to `true` , the application components will be configured with the monitoring
     * configuration recommended by Application Insights.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-autoconfigurationenabled)
     * @param autoConfigurationEnabled If set to `true` , the application components will be
     * configured with the monitoring configuration recommended by Application Insights. 
     */
    override fun autoConfigurationEnabled(autoConfigurationEnabled: IResolvable) {
      cdkBuilder.autoConfigurationEnabled(autoConfigurationEnabled.let(IResolvable::unwrap))
    }

    /**
     * The monitoring settings of the components.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-componentmonitoringsettings)
     * @param componentMonitoringSettings The monitoring settings of the components. 
     */
    override fun componentMonitoringSettings(componentMonitoringSettings: IResolvable) {
      cdkBuilder.componentMonitoringSettings(componentMonitoringSettings.let(IResolvable::unwrap))
    }

    /**
     * The monitoring settings of the components.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-componentmonitoringsettings)
     * @param componentMonitoringSettings The monitoring settings of the components. 
     */
    override fun componentMonitoringSettings(componentMonitoringSettings: List<Any>) {
      cdkBuilder.componentMonitoringSettings(componentMonitoringSettings)
    }

    /**
     * The monitoring settings of the components.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-componentmonitoringsettings)
     * @param componentMonitoringSettings The monitoring settings of the components. 
     */
    override fun componentMonitoringSettings(vararg componentMonitoringSettings: Any): Unit =
        componentMonitoringSettings(componentMonitoringSettings.toList())

    /**
     * Describes a custom component by grouping similar standalone instances to monitor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-customcomponents)
     * @param customComponents Describes a custom component by grouping similar standalone instances
     * to monitor. 
     */
    override fun customComponents(customComponents: IResolvable) {
      cdkBuilder.customComponents(customComponents.let(IResolvable::unwrap))
    }

    /**
     * Describes a custom component by grouping similar standalone instances to monitor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-customcomponents)
     * @param customComponents Describes a custom component by grouping similar standalone instances
     * to monitor. 
     */
    override fun customComponents(customComponents: List<Any>) {
      cdkBuilder.customComponents(customComponents)
    }

    /**
     * Describes a custom component by grouping similar standalone instances to monitor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-customcomponents)
     * @param customComponents Describes a custom component by grouping similar standalone instances
     * to monitor. 
     */
    override fun customComponents(vararg customComponents: Any): Unit =
        customComponents(customComponents.toList())

    /**
     * Indicates whether Application Insights can listen to CloudWatch events for the application
     * resources, such as `instance terminated` , `failed deployment` , and others.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-cwemonitorenabled)
     * @param cweMonitorEnabled Indicates whether Application Insights can listen to CloudWatch
     * events for the application resources, such as `instance terminated` , `failed deployment` , and
     * others. 
     */
    override fun cweMonitorEnabled(cweMonitorEnabled: Boolean) {
      cdkBuilder.cweMonitorEnabled(cweMonitorEnabled)
    }

    /**
     * Indicates whether Application Insights can listen to CloudWatch events for the application
     * resources, such as `instance terminated` , `failed deployment` , and others.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-cwemonitorenabled)
     * @param cweMonitorEnabled Indicates whether Application Insights can listen to CloudWatch
     * events for the application resources, such as `instance terminated` , `failed deployment` , and
     * others. 
     */
    override fun cweMonitorEnabled(cweMonitorEnabled: IResolvable) {
      cdkBuilder.cweMonitorEnabled(cweMonitorEnabled.let(IResolvable::unwrap))
    }

    /**
     * Application Insights can create applications based on a resource group or on an account.
     *
     * To create an account-based application using all of the resources in the account, set this
     * parameter to `ACCOUNT_BASED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-groupingtype)
     * @param groupingType Application Insights can create applications based on a resource group or
     * on an account. 
     */
    override fun groupingType(groupingType: String) {
      cdkBuilder.groupingType(groupingType)
    }

    /**
     * The log pattern sets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-logpatternsets)
     * @param logPatternSets The log pattern sets. 
     */
    override fun logPatternSets(logPatternSets: IResolvable) {
      cdkBuilder.logPatternSets(logPatternSets.let(IResolvable::unwrap))
    }

    /**
     * The log pattern sets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-logpatternsets)
     * @param logPatternSets The log pattern sets. 
     */
    override fun logPatternSets(logPatternSets: List<Any>) {
      cdkBuilder.logPatternSets(logPatternSets)
    }

    /**
     * The log pattern sets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-logpatternsets)
     * @param logPatternSets The log pattern sets. 
     */
    override fun logPatternSets(vararg logPatternSets: Any): Unit =
        logPatternSets(logPatternSets.toList())

    /**
     * Indicates whether Application Insights will create OpsItems for any problem that is detected
     * by Application Insights for an application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-opscenterenabled)
     * @param opsCenterEnabled Indicates whether Application Insights will create OpsItems for any
     * problem that is detected by Application Insights for an application. 
     */
    override fun opsCenterEnabled(opsCenterEnabled: Boolean) {
      cdkBuilder.opsCenterEnabled(opsCenterEnabled)
    }

    /**
     * Indicates whether Application Insights will create OpsItems for any problem that is detected
     * by Application Insights for an application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-opscenterenabled)
     * @param opsCenterEnabled Indicates whether Application Insights will create OpsItems for any
     * problem that is detected by Application Insights for an application. 
     */
    override fun opsCenterEnabled(opsCenterEnabled: IResolvable) {
      cdkBuilder.opsCenterEnabled(opsCenterEnabled.let(IResolvable::unwrap))
    }

    /**
     * The SNS topic provided to Application Insights that is associated with the created OpsItems
     * to receive SNS notifications for opsItem updates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-opsitemsnstopicarn)
     * @param opsItemSnsTopicArn The SNS topic provided to Application Insights that is associated
     * with the created OpsItems to receive SNS notifications for opsItem updates. 
     */
    override fun opsItemSnsTopicArn(opsItemSnsTopicArn: String) {
      cdkBuilder.opsItemSnsTopicArn(opsItemSnsTopicArn)
    }

    /**
     * The name of the resource group used for the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-resourcegroupname)
     * @param resourceGroupName The name of the resource group used for the application. 
     */
    override fun resourceGroupName(resourceGroupName: String) {
      cdkBuilder.resourceGroupName(resourceGroupName)
    }

    /**
     * An array of `Tags` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-tags)
     * @param tags An array of `Tags` . 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An array of `Tags` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html#cfn-applicationinsights-application-tags)
     * @param tags An array of `Tags` . 
     */
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

  /**
   * The `AWS::ApplicationInsights::Application Alarm` property type defines a CloudWatch alarm to
   * be monitored for the component.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.applicationinsights.*;
   * AlarmProperty alarmProperty = AlarmProperty.builder()
   * .alarmName("alarmName")
   * // the properties below are optional
   * .severity("severity")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-alarm.html)
   */
  public interface AlarmProperty {
    /**
     * The name of the CloudWatch alarm to be monitored for the component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-alarm.html#cfn-applicationinsights-application-alarm-alarmname)
     */
    public fun alarmName(): String

    /**
     * Indicates the degree of outage when the alarm goes off.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-alarm.html#cfn-applicationinsights-application-alarm-severity)
     */
    public fun severity(): String? = unwrap(this).getSeverity()

    /**
     * A builder for [AlarmProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param alarmName The name of the CloudWatch alarm to be monitored for the component. 
       */
      public fun alarmName(alarmName: String)

      /**
       * @param severity Indicates the degree of outage when the alarm goes off.
       */
      public fun severity(severity: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.AlarmProperty.Builder =
          software.amazon.awscdk.services.applicationinsights.CfnApplication.AlarmProperty.builder()

      /**
       * @param alarmName The name of the CloudWatch alarm to be monitored for the component. 
       */
      override fun alarmName(alarmName: String) {
        cdkBuilder.alarmName(alarmName)
      }

      /**
       * @param severity Indicates the degree of outage when the alarm goes off.
       */
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
      /**
       * The name of the CloudWatch alarm to be monitored for the component.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-alarm.html#cfn-applicationinsights-application-alarm-alarmname)
       */
      override fun alarmName(): String = unwrap(this).getAlarmName()

      /**
       * Indicates the degree of outage when the alarm goes off.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-alarm.html#cfn-applicationinsights-application-alarm-severity)
       */
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

  /**
   * The `AWS::ApplicationInsights::Application LogPatternSet` property type specifies the log
   * pattern set.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.applicationinsights.*;
   * LogPatternSetProperty logPatternSetProperty = LogPatternSetProperty.builder()
   * .logPatterns(List.of(LogPatternProperty.builder()
   * .pattern("pattern")
   * .patternName("patternName")
   * .rank(123)
   * .build()))
   * .patternSetName("patternSetName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-logpatternset.html)
   */
  public interface LogPatternSetProperty {
    /**
     * A list of objects that define the log patterns that belong to `LogPatternSet` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-logpatternset.html#cfn-applicationinsights-application-logpatternset-logpatterns)
     */
    public fun logPatterns(): Any

    /**
     * The name of the log pattern.
     *
     * A log pattern name can contain up to 30 characters, and it cannot be empty. The characters
     * can be Unicode letters, digits, or one of the following symbols: period, dash, underscore.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-logpatternset.html#cfn-applicationinsights-application-logpatternset-patternsetname)
     */
    public fun patternSetName(): String

    /**
     * A builder for [LogPatternSetProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param logPatterns A list of objects that define the log patterns that belong to
       * `LogPatternSet` . 
       */
      public fun logPatterns(logPatterns: IResolvable)

      /**
       * @param logPatterns A list of objects that define the log patterns that belong to
       * `LogPatternSet` . 
       */
      public fun logPatterns(logPatterns: List<Any>)

      /**
       * @param logPatterns A list of objects that define the log patterns that belong to
       * `LogPatternSet` . 
       */
      public fun logPatterns(vararg logPatterns: Any)

      /**
       * @param patternSetName The name of the log pattern. 
       * A log pattern name can contain up to 30 characters, and it cannot be empty. The characters
       * can be Unicode letters, digits, or one of the following symbols: period, dash, underscore.
       */
      public fun patternSetName(patternSetName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.LogPatternSetProperty.Builder
          =
          software.amazon.awscdk.services.applicationinsights.CfnApplication.LogPatternSetProperty.builder()

      /**
       * @param logPatterns A list of objects that define the log patterns that belong to
       * `LogPatternSet` . 
       */
      override fun logPatterns(logPatterns: IResolvable) {
        cdkBuilder.logPatterns(logPatterns.let(IResolvable::unwrap))
      }

      /**
       * @param logPatterns A list of objects that define the log patterns that belong to
       * `LogPatternSet` . 
       */
      override fun logPatterns(logPatterns: List<Any>) {
        cdkBuilder.logPatterns(logPatterns)
      }

      /**
       * @param logPatterns A list of objects that define the log patterns that belong to
       * `LogPatternSet` . 
       */
      override fun logPatterns(vararg logPatterns: Any): Unit = logPatterns(logPatterns.toList())

      /**
       * @param patternSetName The name of the log pattern. 
       * A log pattern name can contain up to 30 characters, and it cannot be empty. The characters
       * can be Unicode letters, digits, or one of the following symbols: period, dash, underscore.
       */
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
      /**
       * A list of objects that define the log patterns that belong to `LogPatternSet` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-logpatternset.html#cfn-applicationinsights-application-logpatternset-logpatterns)
       */
      override fun logPatterns(): Any = unwrap(this).getLogPatterns()

      /**
       * The name of the log pattern.
       *
       * A log pattern name can contain up to 30 characters, and it cannot be empty. The characters
       * can be Unicode letters, digits, or one of the following symbols: period, dash, underscore.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-logpatternset.html#cfn-applicationinsights-application-logpatternset-patternsetname)
       */
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

  /**
   * The `AWS::ApplicationInsights::Application WindowsEvent` property type specifies a Windows
   * Event to monitor for the component.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.applicationinsights.*;
   * WindowsEventProperty windowsEventProperty = WindowsEventProperty.builder()
   * .eventLevels(List.of("eventLevels"))
   * .eventName("eventName")
   * .logGroupName("logGroupName")
   * // the properties below are optional
   * .patternSet("patternSet")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-windowsevent.html)
   */
  public interface WindowsEventProperty {
    /**
     * The levels of event to log.
     *
     * You must specify each level to log. Possible values include `INFORMATION` , `WARNING` ,
     * `ERROR` , `CRITICAL` , and `VERBOSE` . This field is required for each type of Windows Event to
     * log.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-windowsevent.html#cfn-applicationinsights-application-windowsevent-eventlevels)
     */
    public fun eventLevels(): List<String>

    /**
     * The type of Windows Events to log, equivalent to the Windows Event log channel name.
     *
     * For example, System, Security, CustomEventName, and so on. This field is required for each
     * type of Windows event to log.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-windowsevent.html#cfn-applicationinsights-application-windowsevent-eventname)
     */
    public fun eventName(): String

    /**
     * The CloudWatch log group name to be associated with the monitored log.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-windowsevent.html#cfn-applicationinsights-application-windowsevent-loggroupname)
     */
    public fun logGroupName(): String

    /**
     * The log pattern set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-windowsevent.html#cfn-applicationinsights-application-windowsevent-patternset)
     */
    public fun patternSet(): String? = unwrap(this).getPatternSet()

    /**
     * A builder for [WindowsEventProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param eventLevels The levels of event to log. 
       * You must specify each level to log. Possible values include `INFORMATION` , `WARNING` ,
       * `ERROR` , `CRITICAL` , and `VERBOSE` . This field is required for each type of Windows Event
       * to log.
       */
      public fun eventLevels(eventLevels: List<String>)

      /**
       * @param eventLevels The levels of event to log. 
       * You must specify each level to log. Possible values include `INFORMATION` , `WARNING` ,
       * `ERROR` , `CRITICAL` , and `VERBOSE` . This field is required for each type of Windows Event
       * to log.
       */
      public fun eventLevels(vararg eventLevels: String)

      /**
       * @param eventName The type of Windows Events to log, equivalent to the Windows Event log
       * channel name. 
       * For example, System, Security, CustomEventName, and so on. This field is required for each
       * type of Windows event to log.
       */
      public fun eventName(eventName: String)

      /**
       * @param logGroupName The CloudWatch log group name to be associated with the monitored log. 
       */
      public fun logGroupName(logGroupName: String)

      /**
       * @param patternSet The log pattern set.
       */
      public fun patternSet(patternSet: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.WindowsEventProperty.Builder
          =
          software.amazon.awscdk.services.applicationinsights.CfnApplication.WindowsEventProperty.builder()

      /**
       * @param eventLevels The levels of event to log. 
       * You must specify each level to log. Possible values include `INFORMATION` , `WARNING` ,
       * `ERROR` , `CRITICAL` , and `VERBOSE` . This field is required for each type of Windows Event
       * to log.
       */
      override fun eventLevels(eventLevels: List<String>) {
        cdkBuilder.eventLevels(eventLevels)
      }

      /**
       * @param eventLevels The levels of event to log. 
       * You must specify each level to log. Possible values include `INFORMATION` , `WARNING` ,
       * `ERROR` , `CRITICAL` , and `VERBOSE` . This field is required for each type of Windows Event
       * to log.
       */
      override fun eventLevels(vararg eventLevels: String): Unit = eventLevels(eventLevels.toList())

      /**
       * @param eventName The type of Windows Events to log, equivalent to the Windows Event log
       * channel name. 
       * For example, System, Security, CustomEventName, and so on. This field is required for each
       * type of Windows event to log.
       */
      override fun eventName(eventName: String) {
        cdkBuilder.eventName(eventName)
      }

      /**
       * @param logGroupName The CloudWatch log group name to be associated with the monitored log. 
       */
      override fun logGroupName(logGroupName: String) {
        cdkBuilder.logGroupName(logGroupName)
      }

      /**
       * @param patternSet The log pattern set.
       */
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
      /**
       * The levels of event to log.
       *
       * You must specify each level to log. Possible values include `INFORMATION` , `WARNING` ,
       * `ERROR` , `CRITICAL` , and `VERBOSE` . This field is required for each type of Windows Event
       * to log.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-windowsevent.html#cfn-applicationinsights-application-windowsevent-eventlevels)
       */
      override fun eventLevels(): List<String> = unwrap(this).getEventLevels()

      /**
       * The type of Windows Events to log, equivalent to the Windows Event log channel name.
       *
       * For example, System, Security, CustomEventName, and so on. This field is required for each
       * type of Windows event to log.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-windowsevent.html#cfn-applicationinsights-application-windowsevent-eventname)
       */
      override fun eventName(): String = unwrap(this).getEventName()

      /**
       * The CloudWatch log group name to be associated with the monitored log.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-windowsevent.html#cfn-applicationinsights-application-windowsevent-loggroupname)
       */
      override fun logGroupName(): String = unwrap(this).getLogGroupName()

      /**
       * The log pattern set.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-windowsevent.html#cfn-applicationinsights-application-windowsevent-patternset)
       */
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

  /**
   * The `AWS::ApplicationInsights::Application HAClusterPrometheusExporter` property type defines
   * the HA cluster Prometheus Exporter settings.
   *
   * For more information, see the [component
   * configuration](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/component-config-sections.html#component-configuration-prometheus)
   * in the CloudWatch Application Insights documentation.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.applicationinsights.*;
   * HAClusterPrometheusExporterProperty hAClusterPrometheusExporterProperty =
   * HAClusterPrometheusExporterProperty.builder()
   * .prometheusPort("prometheusPort")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-haclusterprometheusexporter.html)
   */
  public interface HAClusterPrometheusExporterProperty {
    /**
     * The target port to which Prometheus sends metrics.
     *
     * If not specified, the default port 9668 is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-haclusterprometheusexporter.html#cfn-applicationinsights-application-haclusterprometheusexporter-prometheusport)
     */
    public fun prometheusPort(): String? = unwrap(this).getPrometheusPort()

    /**
     * A builder for [HAClusterPrometheusExporterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param prometheusPort The target port to which Prometheus sends metrics.
       * If not specified, the default port 9668 is used.
       */
      public fun prometheusPort(prometheusPort: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.HAClusterPrometheusExporterProperty.Builder
          =
          software.amazon.awscdk.services.applicationinsights.CfnApplication.HAClusterPrometheusExporterProperty.builder()

      /**
       * @param prometheusPort The target port to which Prometheus sends metrics.
       * If not specified, the default port 9668 is used.
       */
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
      /**
       * The target port to which Prometheus sends metrics.
       *
       * If not specified, the default port 9668 is used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-haclusterprometheusexporter.html#cfn-applicationinsights-application-haclusterprometheusexporter-prometheusport)
       */
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

  /**
   * The `AWS::ApplicationInsights::Application ComponentConfiguration` property type defines the
   * configuration settings of the component.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.applicationinsights.*;
   * ComponentConfigurationProperty componentConfigurationProperty =
   * ComponentConfigurationProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-componentconfiguration.html)
   */
  public interface ComponentConfigurationProperty {
    /**
     * The configuration settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-componentconfiguration.html#cfn-applicationinsights-application-componentconfiguration-configurationdetails)
     */
    public fun configurationDetails(): Any? = unwrap(this).getConfigurationDetails()

    /**
     * Sub-component configurations of the component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-componentconfiguration.html#cfn-applicationinsights-application-componentconfiguration-subcomponenttypeconfigurations)
     */
    public fun subComponentTypeConfigurations(): Any? =
        unwrap(this).getSubComponentTypeConfigurations()

    /**
     * A builder for [ComponentConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param configurationDetails The configuration settings.
       */
      public fun configurationDetails(configurationDetails: IResolvable)

      /**
       * @param configurationDetails The configuration settings.
       */
      public fun configurationDetails(configurationDetails: ConfigurationDetailsProperty)

      /**
       * @param configurationDetails The configuration settings.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c31fec2a673113a2f0535a28bdacf3bd652f763fb0267ea8f90d608c943331fb")
      public
          fun configurationDetails(configurationDetails: ConfigurationDetailsProperty.Builder.() -> Unit)

      /**
       * @param subComponentTypeConfigurations Sub-component configurations of the component.
       */
      public fun subComponentTypeConfigurations(subComponentTypeConfigurations: IResolvable)

      /**
       * @param subComponentTypeConfigurations Sub-component configurations of the component.
       */
      public fun subComponentTypeConfigurations(subComponentTypeConfigurations: List<Any>)

      /**
       * @param subComponentTypeConfigurations Sub-component configurations of the component.
       */
      public fun subComponentTypeConfigurations(vararg subComponentTypeConfigurations: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.ComponentConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.applicationinsights.CfnApplication.ComponentConfigurationProperty.builder()

      /**
       * @param configurationDetails The configuration settings.
       */
      override fun configurationDetails(configurationDetails: IResolvable) {
        cdkBuilder.configurationDetails(configurationDetails.let(IResolvable::unwrap))
      }

      /**
       * @param configurationDetails The configuration settings.
       */
      override fun configurationDetails(configurationDetails: ConfigurationDetailsProperty) {
        cdkBuilder.configurationDetails(configurationDetails.let(ConfigurationDetailsProperty::unwrap))
      }

      /**
       * @param configurationDetails The configuration settings.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c31fec2a673113a2f0535a28bdacf3bd652f763fb0267ea8f90d608c943331fb")
      override
          fun configurationDetails(configurationDetails: ConfigurationDetailsProperty.Builder.() -> Unit):
          Unit = configurationDetails(ConfigurationDetailsProperty(configurationDetails))

      /**
       * @param subComponentTypeConfigurations Sub-component configurations of the component.
       */
      override fun subComponentTypeConfigurations(subComponentTypeConfigurations: IResolvable) {
        cdkBuilder.subComponentTypeConfigurations(subComponentTypeConfigurations.let(IResolvable::unwrap))
      }

      /**
       * @param subComponentTypeConfigurations Sub-component configurations of the component.
       */
      override fun subComponentTypeConfigurations(subComponentTypeConfigurations: List<Any>) {
        cdkBuilder.subComponentTypeConfigurations(subComponentTypeConfigurations)
      }

      /**
       * @param subComponentTypeConfigurations Sub-component configurations of the component.
       */
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
      /**
       * The configuration settings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-componentconfiguration.html#cfn-applicationinsights-application-componentconfiguration-configurationdetails)
       */
      override fun configurationDetails(): Any? = unwrap(this).getConfigurationDetails()

      /**
       * Sub-component configurations of the component.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-componentconfiguration.html#cfn-applicationinsights-application-componentconfiguration-subcomponenttypeconfigurations)
       */
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

  /**
   * The `AWS::ApplicationInsights::Application ConfigurationDetails` property type specifies the
   * configuration settings.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.applicationinsights.*;
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
  public interface ConfigurationDetailsProperty {
    /**
     * A list of metrics to monitor for the component.
     *
     * All component types can use `AlarmMetrics` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-configurationdetails.html#cfn-applicationinsights-application-configurationdetails-alarmmetrics)
     */
    public fun alarmMetrics(): Any? = unwrap(this).getAlarmMetrics()

    /**
     * A list of alarms to monitor for the component.
     *
     * All component types can use `Alarm` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-configurationdetails.html#cfn-applicationinsights-application-configurationdetails-alarms)
     */
    public fun alarms(): Any? = unwrap(this).getAlarms()

    /**
     * The HA cluster Prometheus Exporter settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-configurationdetails.html#cfn-applicationinsights-application-configurationdetails-haclusterprometheusexporter)
     */
    public fun haClusterPrometheusExporter(): Any? = unwrap(this).getHaClusterPrometheusExporter()

    /**
     * The HANA DB Prometheus Exporter settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-configurationdetails.html#cfn-applicationinsights-application-configurationdetails-hanaprometheusexporter)
     */
    public fun hanaPrometheusExporter(): Any? = unwrap(this).getHanaPrometheusExporter()

    /**
     * A list of Java metrics to monitor for the component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-configurationdetails.html#cfn-applicationinsights-application-configurationdetails-jmxprometheusexporter)
     */
    public fun jmxPrometheusExporter(): Any? = unwrap(this).getJmxPrometheusExporter()

    /**
     * A list of logs to monitor for the component.
     *
     * Only Amazon EC2 instances can use `Logs` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-configurationdetails.html#cfn-applicationinsights-application-configurationdetails-logs)
     */
    public fun logs(): Any? = unwrap(this).getLogs()

    /**
     * A list of Windows Events to monitor for the component.
     *
     * Only Amazon EC2 instances running on Windows can use `WindowsEvents` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-configurationdetails.html#cfn-applicationinsights-application-configurationdetails-windowsevents)
     */
    public fun windowsEvents(): Any? = unwrap(this).getWindowsEvents()

    /**
     * A builder for [ConfigurationDetailsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param alarmMetrics A list of metrics to monitor for the component.
       * All component types can use `AlarmMetrics` .
       */
      public fun alarmMetrics(alarmMetrics: IResolvable)

      /**
       * @param alarmMetrics A list of metrics to monitor for the component.
       * All component types can use `AlarmMetrics` .
       */
      public fun alarmMetrics(alarmMetrics: List<Any>)

      /**
       * @param alarmMetrics A list of metrics to monitor for the component.
       * All component types can use `AlarmMetrics` .
       */
      public fun alarmMetrics(vararg alarmMetrics: Any)

      /**
       * @param alarms A list of alarms to monitor for the component.
       * All component types can use `Alarm` .
       */
      public fun alarms(alarms: IResolvable)

      /**
       * @param alarms A list of alarms to monitor for the component.
       * All component types can use `Alarm` .
       */
      public fun alarms(alarms: List<Any>)

      /**
       * @param alarms A list of alarms to monitor for the component.
       * All component types can use `Alarm` .
       */
      public fun alarms(vararg alarms: Any)

      /**
       * @param haClusterPrometheusExporter The HA cluster Prometheus Exporter settings.
       */
      public fun haClusterPrometheusExporter(haClusterPrometheusExporter: IResolvable)

      /**
       * @param haClusterPrometheusExporter The HA cluster Prometheus Exporter settings.
       */
      public
          fun haClusterPrometheusExporter(haClusterPrometheusExporter: HAClusterPrometheusExporterProperty)

      /**
       * @param haClusterPrometheusExporter The HA cluster Prometheus Exporter settings.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b240cc430e2691632bfe6703e7ff48a1d7892b48371717ea9ce01800aa7ee918")
      public
          fun haClusterPrometheusExporter(haClusterPrometheusExporter: HAClusterPrometheusExporterProperty.Builder.() -> Unit)

      /**
       * @param hanaPrometheusExporter The HANA DB Prometheus Exporter settings.
       */
      public fun hanaPrometheusExporter(hanaPrometheusExporter: IResolvable)

      /**
       * @param hanaPrometheusExporter The HANA DB Prometheus Exporter settings.
       */
      public fun hanaPrometheusExporter(hanaPrometheusExporter: HANAPrometheusExporterProperty)

      /**
       * @param hanaPrometheusExporter The HANA DB Prometheus Exporter settings.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("79f8791fcbb36ad22dcb6a4f2eb05b19c3c8dcefd897b634c4f7c283a5ba7364")
      public
          fun hanaPrometheusExporter(hanaPrometheusExporter: HANAPrometheusExporterProperty.Builder.() -> Unit)

      /**
       * @param jmxPrometheusExporter A list of Java metrics to monitor for the component.
       */
      public fun jmxPrometheusExporter(jmxPrometheusExporter: IResolvable)

      /**
       * @param jmxPrometheusExporter A list of Java metrics to monitor for the component.
       */
      public fun jmxPrometheusExporter(jmxPrometheusExporter: JMXPrometheusExporterProperty)

      /**
       * @param jmxPrometheusExporter A list of Java metrics to monitor for the component.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9226526fedbe04dc0b210d6f7b6d77d9bf46aee3db36046c8621718f50ce50ee")
      public
          fun jmxPrometheusExporter(jmxPrometheusExporter: JMXPrometheusExporterProperty.Builder.() -> Unit)

      /**
       * @param logs A list of logs to monitor for the component.
       * Only Amazon EC2 instances can use `Logs` .
       */
      public fun logs(logs: IResolvable)

      /**
       * @param logs A list of logs to monitor for the component.
       * Only Amazon EC2 instances can use `Logs` .
       */
      public fun logs(logs: List<Any>)

      /**
       * @param logs A list of logs to monitor for the component.
       * Only Amazon EC2 instances can use `Logs` .
       */
      public fun logs(vararg logs: Any)

      /**
       * @param windowsEvents A list of Windows Events to monitor for the component.
       * Only Amazon EC2 instances running on Windows can use `WindowsEvents` .
       */
      public fun windowsEvents(windowsEvents: IResolvable)

      /**
       * @param windowsEvents A list of Windows Events to monitor for the component.
       * Only Amazon EC2 instances running on Windows can use `WindowsEvents` .
       */
      public fun windowsEvents(windowsEvents: List<Any>)

      /**
       * @param windowsEvents A list of Windows Events to monitor for the component.
       * Only Amazon EC2 instances running on Windows can use `WindowsEvents` .
       */
      public fun windowsEvents(vararg windowsEvents: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.ConfigurationDetailsProperty.Builder
          =
          software.amazon.awscdk.services.applicationinsights.CfnApplication.ConfigurationDetailsProperty.builder()

      /**
       * @param alarmMetrics A list of metrics to monitor for the component.
       * All component types can use `AlarmMetrics` .
       */
      override fun alarmMetrics(alarmMetrics: IResolvable) {
        cdkBuilder.alarmMetrics(alarmMetrics.let(IResolvable::unwrap))
      }

      /**
       * @param alarmMetrics A list of metrics to monitor for the component.
       * All component types can use `AlarmMetrics` .
       */
      override fun alarmMetrics(alarmMetrics: List<Any>) {
        cdkBuilder.alarmMetrics(alarmMetrics)
      }

      /**
       * @param alarmMetrics A list of metrics to monitor for the component.
       * All component types can use `AlarmMetrics` .
       */
      override fun alarmMetrics(vararg alarmMetrics: Any): Unit =
          alarmMetrics(alarmMetrics.toList())

      /**
       * @param alarms A list of alarms to monitor for the component.
       * All component types can use `Alarm` .
       */
      override fun alarms(alarms: IResolvable) {
        cdkBuilder.alarms(alarms.let(IResolvable::unwrap))
      }

      /**
       * @param alarms A list of alarms to monitor for the component.
       * All component types can use `Alarm` .
       */
      override fun alarms(alarms: List<Any>) {
        cdkBuilder.alarms(alarms)
      }

      /**
       * @param alarms A list of alarms to monitor for the component.
       * All component types can use `Alarm` .
       */
      override fun alarms(vararg alarms: Any): Unit = alarms(alarms.toList())

      /**
       * @param haClusterPrometheusExporter The HA cluster Prometheus Exporter settings.
       */
      override fun haClusterPrometheusExporter(haClusterPrometheusExporter: IResolvable) {
        cdkBuilder.haClusterPrometheusExporter(haClusterPrometheusExporter.let(IResolvable::unwrap))
      }

      /**
       * @param haClusterPrometheusExporter The HA cluster Prometheus Exporter settings.
       */
      override
          fun haClusterPrometheusExporter(haClusterPrometheusExporter: HAClusterPrometheusExporterProperty) {
        cdkBuilder.haClusterPrometheusExporter(haClusterPrometheusExporter.let(HAClusterPrometheusExporterProperty::unwrap))
      }

      /**
       * @param haClusterPrometheusExporter The HA cluster Prometheus Exporter settings.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b240cc430e2691632bfe6703e7ff48a1d7892b48371717ea9ce01800aa7ee918")
      override
          fun haClusterPrometheusExporter(haClusterPrometheusExporter: HAClusterPrometheusExporterProperty.Builder.() -> Unit):
          Unit =
          haClusterPrometheusExporter(HAClusterPrometheusExporterProperty(haClusterPrometheusExporter))

      /**
       * @param hanaPrometheusExporter The HANA DB Prometheus Exporter settings.
       */
      override fun hanaPrometheusExporter(hanaPrometheusExporter: IResolvable) {
        cdkBuilder.hanaPrometheusExporter(hanaPrometheusExporter.let(IResolvable::unwrap))
      }

      /**
       * @param hanaPrometheusExporter The HANA DB Prometheus Exporter settings.
       */
      override fun hanaPrometheusExporter(hanaPrometheusExporter: HANAPrometheusExporterProperty) {
        cdkBuilder.hanaPrometheusExporter(hanaPrometheusExporter.let(HANAPrometheusExporterProperty::unwrap))
      }

      /**
       * @param hanaPrometheusExporter The HANA DB Prometheus Exporter settings.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("79f8791fcbb36ad22dcb6a4f2eb05b19c3c8dcefd897b634c4f7c283a5ba7364")
      override
          fun hanaPrometheusExporter(hanaPrometheusExporter: HANAPrometheusExporterProperty.Builder.() -> Unit):
          Unit = hanaPrometheusExporter(HANAPrometheusExporterProperty(hanaPrometheusExporter))

      /**
       * @param jmxPrometheusExporter A list of Java metrics to monitor for the component.
       */
      override fun jmxPrometheusExporter(jmxPrometheusExporter: IResolvable) {
        cdkBuilder.jmxPrometheusExporter(jmxPrometheusExporter.let(IResolvable::unwrap))
      }

      /**
       * @param jmxPrometheusExporter A list of Java metrics to monitor for the component.
       */
      override fun jmxPrometheusExporter(jmxPrometheusExporter: JMXPrometheusExporterProperty) {
        cdkBuilder.jmxPrometheusExporter(jmxPrometheusExporter.let(JMXPrometheusExporterProperty::unwrap))
      }

      /**
       * @param jmxPrometheusExporter A list of Java metrics to monitor for the component.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9226526fedbe04dc0b210d6f7b6d77d9bf46aee3db36046c8621718f50ce50ee")
      override
          fun jmxPrometheusExporter(jmxPrometheusExporter: JMXPrometheusExporterProperty.Builder.() -> Unit):
          Unit = jmxPrometheusExporter(JMXPrometheusExporterProperty(jmxPrometheusExporter))

      /**
       * @param logs A list of logs to monitor for the component.
       * Only Amazon EC2 instances can use `Logs` .
       */
      override fun logs(logs: IResolvable) {
        cdkBuilder.logs(logs.let(IResolvable::unwrap))
      }

      /**
       * @param logs A list of logs to monitor for the component.
       * Only Amazon EC2 instances can use `Logs` .
       */
      override fun logs(logs: List<Any>) {
        cdkBuilder.logs(logs)
      }

      /**
       * @param logs A list of logs to monitor for the component.
       * Only Amazon EC2 instances can use `Logs` .
       */
      override fun logs(vararg logs: Any): Unit = logs(logs.toList())

      /**
       * @param windowsEvents A list of Windows Events to monitor for the component.
       * Only Amazon EC2 instances running on Windows can use `WindowsEvents` .
       */
      override fun windowsEvents(windowsEvents: IResolvable) {
        cdkBuilder.windowsEvents(windowsEvents.let(IResolvable::unwrap))
      }

      /**
       * @param windowsEvents A list of Windows Events to monitor for the component.
       * Only Amazon EC2 instances running on Windows can use `WindowsEvents` .
       */
      override fun windowsEvents(windowsEvents: List<Any>) {
        cdkBuilder.windowsEvents(windowsEvents)
      }

      /**
       * @param windowsEvents A list of Windows Events to monitor for the component.
       * Only Amazon EC2 instances running on Windows can use `WindowsEvents` .
       */
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
      /**
       * A list of metrics to monitor for the component.
       *
       * All component types can use `AlarmMetrics` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-configurationdetails.html#cfn-applicationinsights-application-configurationdetails-alarmmetrics)
       */
      override fun alarmMetrics(): Any? = unwrap(this).getAlarmMetrics()

      /**
       * A list of alarms to monitor for the component.
       *
       * All component types can use `Alarm` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-configurationdetails.html#cfn-applicationinsights-application-configurationdetails-alarms)
       */
      override fun alarms(): Any? = unwrap(this).getAlarms()

      /**
       * The HA cluster Prometheus Exporter settings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-configurationdetails.html#cfn-applicationinsights-application-configurationdetails-haclusterprometheusexporter)
       */
      override fun haClusterPrometheusExporter(): Any? =
          unwrap(this).getHaClusterPrometheusExporter()

      /**
       * The HANA DB Prometheus Exporter settings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-configurationdetails.html#cfn-applicationinsights-application-configurationdetails-hanaprometheusexporter)
       */
      override fun hanaPrometheusExporter(): Any? = unwrap(this).getHanaPrometheusExporter()

      /**
       * A list of Java metrics to monitor for the component.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-configurationdetails.html#cfn-applicationinsights-application-configurationdetails-jmxprometheusexporter)
       */
      override fun jmxPrometheusExporter(): Any? = unwrap(this).getJmxPrometheusExporter()

      /**
       * A list of logs to monitor for the component.
       *
       * Only Amazon EC2 instances can use `Logs` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-configurationdetails.html#cfn-applicationinsights-application-configurationdetails-logs)
       */
      override fun logs(): Any? = unwrap(this).getLogs()

      /**
       * A list of Windows Events to monitor for the component.
       *
       * Only Amazon EC2 instances running on Windows can use `WindowsEvents` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-configurationdetails.html#cfn-applicationinsights-application-configurationdetails-windowsevents)
       */
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

  /**
   * The `AWS::ApplicationInsights::Application SubComponentConfigurationDetails` property type
   * specifies the configuration settings of the sub-components.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.applicationinsights.*;
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
  public interface SubComponentConfigurationDetailsProperty {
    /**
     * A list of metrics to monitor for the component.
     *
     * All component types can use `AlarmMetrics` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-subcomponentconfigurationdetails.html#cfn-applicationinsights-application-subcomponentconfigurationdetails-alarmmetrics)
     */
    public fun alarmMetrics(): Any? = unwrap(this).getAlarmMetrics()

    /**
     * A list of logs to monitor for the component.
     *
     * Only Amazon EC2 instances can use `Logs` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-subcomponentconfigurationdetails.html#cfn-applicationinsights-application-subcomponentconfigurationdetails-logs)
     */
    public fun logs(): Any? = unwrap(this).getLogs()

    /**
     * A list of Windows Events to monitor for the component.
     *
     * Only Amazon EC2 instances running on Windows can use `WindowsEvents` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-subcomponentconfigurationdetails.html#cfn-applicationinsights-application-subcomponentconfigurationdetails-windowsevents)
     */
    public fun windowsEvents(): Any? = unwrap(this).getWindowsEvents()

    /**
     * A builder for [SubComponentConfigurationDetailsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param alarmMetrics A list of metrics to monitor for the component.
       * All component types can use `AlarmMetrics` .
       */
      public fun alarmMetrics(alarmMetrics: IResolvable)

      /**
       * @param alarmMetrics A list of metrics to monitor for the component.
       * All component types can use `AlarmMetrics` .
       */
      public fun alarmMetrics(alarmMetrics: List<Any>)

      /**
       * @param alarmMetrics A list of metrics to monitor for the component.
       * All component types can use `AlarmMetrics` .
       */
      public fun alarmMetrics(vararg alarmMetrics: Any)

      /**
       * @param logs A list of logs to monitor for the component.
       * Only Amazon EC2 instances can use `Logs` .
       */
      public fun logs(logs: IResolvable)

      /**
       * @param logs A list of logs to monitor for the component.
       * Only Amazon EC2 instances can use `Logs` .
       */
      public fun logs(logs: List<Any>)

      /**
       * @param logs A list of logs to monitor for the component.
       * Only Amazon EC2 instances can use `Logs` .
       */
      public fun logs(vararg logs: Any)

      /**
       * @param windowsEvents A list of Windows Events to monitor for the component.
       * Only Amazon EC2 instances running on Windows can use `WindowsEvents` .
       */
      public fun windowsEvents(windowsEvents: IResolvable)

      /**
       * @param windowsEvents A list of Windows Events to monitor for the component.
       * Only Amazon EC2 instances running on Windows can use `WindowsEvents` .
       */
      public fun windowsEvents(windowsEvents: List<Any>)

      /**
       * @param windowsEvents A list of Windows Events to monitor for the component.
       * Only Amazon EC2 instances running on Windows can use `WindowsEvents` .
       */
      public fun windowsEvents(vararg windowsEvents: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.SubComponentConfigurationDetailsProperty.Builder
          =
          software.amazon.awscdk.services.applicationinsights.CfnApplication.SubComponentConfigurationDetailsProperty.builder()

      /**
       * @param alarmMetrics A list of metrics to monitor for the component.
       * All component types can use `AlarmMetrics` .
       */
      override fun alarmMetrics(alarmMetrics: IResolvable) {
        cdkBuilder.alarmMetrics(alarmMetrics.let(IResolvable::unwrap))
      }

      /**
       * @param alarmMetrics A list of metrics to monitor for the component.
       * All component types can use `AlarmMetrics` .
       */
      override fun alarmMetrics(alarmMetrics: List<Any>) {
        cdkBuilder.alarmMetrics(alarmMetrics)
      }

      /**
       * @param alarmMetrics A list of metrics to monitor for the component.
       * All component types can use `AlarmMetrics` .
       */
      override fun alarmMetrics(vararg alarmMetrics: Any): Unit =
          alarmMetrics(alarmMetrics.toList())

      /**
       * @param logs A list of logs to monitor for the component.
       * Only Amazon EC2 instances can use `Logs` .
       */
      override fun logs(logs: IResolvable) {
        cdkBuilder.logs(logs.let(IResolvable::unwrap))
      }

      /**
       * @param logs A list of logs to monitor for the component.
       * Only Amazon EC2 instances can use `Logs` .
       */
      override fun logs(logs: List<Any>) {
        cdkBuilder.logs(logs)
      }

      /**
       * @param logs A list of logs to monitor for the component.
       * Only Amazon EC2 instances can use `Logs` .
       */
      override fun logs(vararg logs: Any): Unit = logs(logs.toList())

      /**
       * @param windowsEvents A list of Windows Events to monitor for the component.
       * Only Amazon EC2 instances running on Windows can use `WindowsEvents` .
       */
      override fun windowsEvents(windowsEvents: IResolvable) {
        cdkBuilder.windowsEvents(windowsEvents.let(IResolvable::unwrap))
      }

      /**
       * @param windowsEvents A list of Windows Events to monitor for the component.
       * Only Amazon EC2 instances running on Windows can use `WindowsEvents` .
       */
      override fun windowsEvents(windowsEvents: List<Any>) {
        cdkBuilder.windowsEvents(windowsEvents)
      }

      /**
       * @param windowsEvents A list of Windows Events to monitor for the component.
       * Only Amazon EC2 instances running on Windows can use `WindowsEvents` .
       */
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
      /**
       * A list of metrics to monitor for the component.
       *
       * All component types can use `AlarmMetrics` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-subcomponentconfigurationdetails.html#cfn-applicationinsights-application-subcomponentconfigurationdetails-alarmmetrics)
       */
      override fun alarmMetrics(): Any? = unwrap(this).getAlarmMetrics()

      /**
       * A list of logs to monitor for the component.
       *
       * Only Amazon EC2 instances can use `Logs` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-subcomponentconfigurationdetails.html#cfn-applicationinsights-application-subcomponentconfigurationdetails-logs)
       */
      override fun logs(): Any? = unwrap(this).getLogs()

      /**
       * A list of Windows Events to monitor for the component.
       *
       * Only Amazon EC2 instances running on Windows can use `WindowsEvents` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-subcomponentconfigurationdetails.html#cfn-applicationinsights-application-subcomponentconfigurationdetails-windowsevents)
       */
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

  /**
   * The `AWS::ApplicationInsights::Application JMXPrometheusExporter` property type defines the
   * JMXPrometheus Exporter configuration.
   *
   * For more information, see the [component
   * configuration](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/component-config-sections.html#component-configuration-prometheus)
   * in the CloudWatch Application Insights documentation.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.applicationinsights.*;
   * JMXPrometheusExporterProperty jMXPrometheusExporterProperty =
   * JMXPrometheusExporterProperty.builder()
   * .hostPort("hostPort")
   * .jmxurl("jmxurl")
   * .prometheusPort("prometheusPort")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-jmxprometheusexporter.html)
   */
  public interface JMXPrometheusExporterProperty {
    /**
     * The host and port to connect to through remote JMX.
     *
     * Only one of `jmxURL` and `hostPort` can be specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-jmxprometheusexporter.html#cfn-applicationinsights-application-jmxprometheusexporter-hostport)
     */
    public fun hostPort(): String? = unwrap(this).getHostPort()

    /**
     * The complete JMX URL to connect to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-jmxprometheusexporter.html#cfn-applicationinsights-application-jmxprometheusexporter-jmxurl)
     */
    public fun jmxurl(): String? = unwrap(this).getJmxurl()

    /**
     * The target port to send Prometheus metrics to.
     *
     * If not specified, the default port `9404` is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-jmxprometheusexporter.html#cfn-applicationinsights-application-jmxprometheusexporter-prometheusport)
     */
    public fun prometheusPort(): String? = unwrap(this).getPrometheusPort()

    /**
     * A builder for [JMXPrometheusExporterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param hostPort The host and port to connect to through remote JMX.
       * Only one of `jmxURL` and `hostPort` can be specified.
       */
      public fun hostPort(hostPort: String)

      /**
       * @param jmxurl The complete JMX URL to connect to.
       */
      public fun jmxurl(jmxurl: String)

      /**
       * @param prometheusPort The target port to send Prometheus metrics to.
       * If not specified, the default port `9404` is used.
       */
      public fun prometheusPort(prometheusPort: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.JMXPrometheusExporterProperty.Builder
          =
          software.amazon.awscdk.services.applicationinsights.CfnApplication.JMXPrometheusExporterProperty.builder()

      /**
       * @param hostPort The host and port to connect to through remote JMX.
       * Only one of `jmxURL` and `hostPort` can be specified.
       */
      override fun hostPort(hostPort: String) {
        cdkBuilder.hostPort(hostPort)
      }

      /**
       * @param jmxurl The complete JMX URL to connect to.
       */
      override fun jmxurl(jmxurl: String) {
        cdkBuilder.jmxurl(jmxurl)
      }

      /**
       * @param prometheusPort The target port to send Prometheus metrics to.
       * If not specified, the default port `9404` is used.
       */
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
      /**
       * The host and port to connect to through remote JMX.
       *
       * Only one of `jmxURL` and `hostPort` can be specified.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-jmxprometheusexporter.html#cfn-applicationinsights-application-jmxprometheusexporter-hostport)
       */
      override fun hostPort(): String? = unwrap(this).getHostPort()

      /**
       * The complete JMX URL to connect to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-jmxprometheusexporter.html#cfn-applicationinsights-application-jmxprometheusexporter-jmxurl)
       */
      override fun jmxurl(): String? = unwrap(this).getJmxurl()

      /**
       * The target port to send Prometheus metrics to.
       *
       * If not specified, the default port `9404` is used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-jmxprometheusexporter.html#cfn-applicationinsights-application-jmxprometheusexporter-prometheusport)
       */
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

  /**
   * The `AWS::ApplicationInsights::Application Log` property type specifies a log to monitor for
   * the component.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.applicationinsights.*;
   * LogProperty logProperty = LogProperty.builder()
   * .logType("logType")
   * // the properties below are optional
   * .encoding("encoding")
   * .logGroupName("logGroupName")
   * .logPath("logPath")
   * .patternSet("patternSet")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-log.html)
   */
  public interface LogProperty {
    /**
     * The type of encoding of the logs to be monitored.
     *
     * The specified encoding should be included in the list of CloudWatch agent supported
     * encodings. If not provided, CloudWatch Application Insights uses the default encoding type for
     * the log type:
     *
     * * `APPLICATION/DEFAULT` : utf-8 encoding
     * * `SQL_SERVER` : utf-16 encoding
     * * `IIS` : ascii encoding
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-log.html#cfn-applicationinsights-application-log-encoding)
     */
    public fun encoding(): String? = unwrap(this).getEncoding()

    /**
     * The CloudWatch log group name to be associated with the monitored log.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-log.html#cfn-applicationinsights-application-log-loggroupname)
     */
    public fun logGroupName(): String? = unwrap(this).getLogGroupName()

    /**
     * The path of the logs to be monitored.
     *
     * The log path must be an absolute Windows or Linux system file path. For more information, see
     * [CloudWatch Agent Configuration File: Logs
     * Section](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Agent-Configuration-File-Details.html#CloudWatch-Agent-Configuration-File-Logssection)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-log.html#cfn-applicationinsights-application-log-logpath)
     */
    public fun logPath(): String? = unwrap(this).getLogPath()

    /**
     * The log type decides the log patterns against which Application Insights analyzes the log.
     *
     * The log type is selected from the following: `SQL_SERVER` , `MYSQL` , `MYSQL_SLOW_QUERY` ,
     * `POSTGRESQL` , `ORACLE_ALERT` , `ORACLE_LISTENER` , `IIS` , `APPLICATION` , `WINDOWS_EVENTS` ,
     * `WINDOWS_EVENTS_ACTIVE_DIRECTORY` , `WINDOWS_EVENTS_DNS` , `WINDOWS_EVENTS_IIS` ,
     * `WINDOWS_EVENTS_SHAREPOINT` , `SQL_SERVER_ALWAYSON_AVAILABILITY_GROUP` ,
     * `SQL_SERVER_FAILOVER_CLUSTER_INSTANCE` , `STEP_FUNCTION` , `API_GATEWAY_ACCESS` ,
     * `API_GATEWAY_EXECUTION` , `SAP_HANA_LOGS` , `SAP_HANA_TRACE` , `SAP_HANA_HIGH_AVAILABILITY` ,
     * and `DEFAULT` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-log.html#cfn-applicationinsights-application-log-logtype)
     */
    public fun logType(): String

    /**
     * The log pattern set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-log.html#cfn-applicationinsights-application-log-patternset)
     */
    public fun patternSet(): String? = unwrap(this).getPatternSet()

    /**
     * A builder for [LogProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param encoding The type of encoding of the logs to be monitored.
       * The specified encoding should be included in the list of CloudWatch agent supported
       * encodings. If not provided, CloudWatch Application Insights uses the default encoding type for
       * the log type:
       *
       * * `APPLICATION/DEFAULT` : utf-8 encoding
       * * `SQL_SERVER` : utf-16 encoding
       * * `IIS` : ascii encoding
       */
      public fun encoding(encoding: String)

      /**
       * @param logGroupName The CloudWatch log group name to be associated with the monitored log.
       */
      public fun logGroupName(logGroupName: String)

      /**
       * @param logPath The path of the logs to be monitored.
       * The log path must be an absolute Windows or Linux system file path. For more information,
       * see [CloudWatch Agent Configuration File: Logs
       * Section](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Agent-Configuration-File-Details.html#CloudWatch-Agent-Configuration-File-Logssection)
       * .
       */
      public fun logPath(logPath: String)

      /**
       * @param logType The log type decides the log patterns against which Application Insights
       * analyzes the log. 
       * The log type is selected from the following: `SQL_SERVER` , `MYSQL` , `MYSQL_SLOW_QUERY` ,
       * `POSTGRESQL` , `ORACLE_ALERT` , `ORACLE_LISTENER` , `IIS` , `APPLICATION` , `WINDOWS_EVENTS` ,
       * `WINDOWS_EVENTS_ACTIVE_DIRECTORY` , `WINDOWS_EVENTS_DNS` , `WINDOWS_EVENTS_IIS` ,
       * `WINDOWS_EVENTS_SHAREPOINT` , `SQL_SERVER_ALWAYSON_AVAILABILITY_GROUP` ,
       * `SQL_SERVER_FAILOVER_CLUSTER_INSTANCE` , `STEP_FUNCTION` , `API_GATEWAY_ACCESS` ,
       * `API_GATEWAY_EXECUTION` , `SAP_HANA_LOGS` , `SAP_HANA_TRACE` , `SAP_HANA_HIGH_AVAILABILITY` ,
       * and `DEFAULT` .
       */
      public fun logType(logType: String)

      /**
       * @param patternSet The log pattern set.
       */
      public fun patternSet(patternSet: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.LogProperty.Builder =
          software.amazon.awscdk.services.applicationinsights.CfnApplication.LogProperty.builder()

      /**
       * @param encoding The type of encoding of the logs to be monitored.
       * The specified encoding should be included in the list of CloudWatch agent supported
       * encodings. If not provided, CloudWatch Application Insights uses the default encoding type for
       * the log type:
       *
       * * `APPLICATION/DEFAULT` : utf-8 encoding
       * * `SQL_SERVER` : utf-16 encoding
       * * `IIS` : ascii encoding
       */
      override fun encoding(encoding: String) {
        cdkBuilder.encoding(encoding)
      }

      /**
       * @param logGroupName The CloudWatch log group name to be associated with the monitored log.
       */
      override fun logGroupName(logGroupName: String) {
        cdkBuilder.logGroupName(logGroupName)
      }

      /**
       * @param logPath The path of the logs to be monitored.
       * The log path must be an absolute Windows or Linux system file path. For more information,
       * see [CloudWatch Agent Configuration File: Logs
       * Section](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Agent-Configuration-File-Details.html#CloudWatch-Agent-Configuration-File-Logssection)
       * .
       */
      override fun logPath(logPath: String) {
        cdkBuilder.logPath(logPath)
      }

      /**
       * @param logType The log type decides the log patterns against which Application Insights
       * analyzes the log. 
       * The log type is selected from the following: `SQL_SERVER` , `MYSQL` , `MYSQL_SLOW_QUERY` ,
       * `POSTGRESQL` , `ORACLE_ALERT` , `ORACLE_LISTENER` , `IIS` , `APPLICATION` , `WINDOWS_EVENTS` ,
       * `WINDOWS_EVENTS_ACTIVE_DIRECTORY` , `WINDOWS_EVENTS_DNS` , `WINDOWS_EVENTS_IIS` ,
       * `WINDOWS_EVENTS_SHAREPOINT` , `SQL_SERVER_ALWAYSON_AVAILABILITY_GROUP` ,
       * `SQL_SERVER_FAILOVER_CLUSTER_INSTANCE` , `STEP_FUNCTION` , `API_GATEWAY_ACCESS` ,
       * `API_GATEWAY_EXECUTION` , `SAP_HANA_LOGS` , `SAP_HANA_TRACE` , `SAP_HANA_HIGH_AVAILABILITY` ,
       * and `DEFAULT` .
       */
      override fun logType(logType: String) {
        cdkBuilder.logType(logType)
      }

      /**
       * @param patternSet The log pattern set.
       */
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
      /**
       * The type of encoding of the logs to be monitored.
       *
       * The specified encoding should be included in the list of CloudWatch agent supported
       * encodings. If not provided, CloudWatch Application Insights uses the default encoding type for
       * the log type:
       *
       * * `APPLICATION/DEFAULT` : utf-8 encoding
       * * `SQL_SERVER` : utf-16 encoding
       * * `IIS` : ascii encoding
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-log.html#cfn-applicationinsights-application-log-encoding)
       */
      override fun encoding(): String? = unwrap(this).getEncoding()

      /**
       * The CloudWatch log group name to be associated with the monitored log.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-log.html#cfn-applicationinsights-application-log-loggroupname)
       */
      override fun logGroupName(): String? = unwrap(this).getLogGroupName()

      /**
       * The path of the logs to be monitored.
       *
       * The log path must be an absolute Windows or Linux system file path. For more information,
       * see [CloudWatch Agent Configuration File: Logs
       * Section](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Agent-Configuration-File-Details.html#CloudWatch-Agent-Configuration-File-Logssection)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-log.html#cfn-applicationinsights-application-log-logpath)
       */
      override fun logPath(): String? = unwrap(this).getLogPath()

      /**
       * The log type decides the log patterns against which Application Insights analyzes the log.
       *
       * The log type is selected from the following: `SQL_SERVER` , `MYSQL` , `MYSQL_SLOW_QUERY` ,
       * `POSTGRESQL` , `ORACLE_ALERT` , `ORACLE_LISTENER` , `IIS` , `APPLICATION` , `WINDOWS_EVENTS` ,
       * `WINDOWS_EVENTS_ACTIVE_DIRECTORY` , `WINDOWS_EVENTS_DNS` , `WINDOWS_EVENTS_IIS` ,
       * `WINDOWS_EVENTS_SHAREPOINT` , `SQL_SERVER_ALWAYSON_AVAILABILITY_GROUP` ,
       * `SQL_SERVER_FAILOVER_CLUSTER_INSTANCE` , `STEP_FUNCTION` , `API_GATEWAY_ACCESS` ,
       * `API_GATEWAY_EXECUTION` , `SAP_HANA_LOGS` , `SAP_HANA_TRACE` , `SAP_HANA_HIGH_AVAILABILITY` ,
       * and `DEFAULT` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-log.html#cfn-applicationinsights-application-log-logtype)
       */
      override fun logType(): String = unwrap(this).getLogType()

      /**
       * The log pattern set.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-log.html#cfn-applicationinsights-application-log-patternset)
       */
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

  /**
   * The `AWS::ApplicationInsights::Application SubComponentTypeConfiguration` property type
   * specifies the sub-component configurations for a component.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.applicationinsights.*;
   * SubComponentTypeConfigurationProperty subComponentTypeConfigurationProperty =
   * SubComponentTypeConfigurationProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-subcomponenttypeconfiguration.html)
   */
  public interface SubComponentTypeConfigurationProperty {
    /**
     * The configuration settings of the sub-components.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-subcomponenttypeconfiguration.html#cfn-applicationinsights-application-subcomponenttypeconfiguration-subcomponentconfigurationdetails)
     */
    public fun subComponentConfigurationDetails(): Any

    /**
     * The sub-component type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-subcomponenttypeconfiguration.html#cfn-applicationinsights-application-subcomponenttypeconfiguration-subcomponenttype)
     */
    public fun subComponentType(): String

    /**
     * A builder for [SubComponentTypeConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param subComponentConfigurationDetails The configuration settings of the sub-components. 
       */
      public fun subComponentConfigurationDetails(subComponentConfigurationDetails: IResolvable)

      /**
       * @param subComponentConfigurationDetails The configuration settings of the sub-components. 
       */
      public
          fun subComponentConfigurationDetails(subComponentConfigurationDetails: SubComponentConfigurationDetailsProperty)

      /**
       * @param subComponentConfigurationDetails The configuration settings of the sub-components. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6cceeff7e3247f0f06789a218f95b07fda8f6430d9c7a9c50818fb81d6839d17")
      public
          fun subComponentConfigurationDetails(subComponentConfigurationDetails: SubComponentConfigurationDetailsProperty.Builder.() -> Unit)

      /**
       * @param subComponentType The sub-component type. 
       */
      public fun subComponentType(subComponentType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.SubComponentTypeConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.applicationinsights.CfnApplication.SubComponentTypeConfigurationProperty.builder()

      /**
       * @param subComponentConfigurationDetails The configuration settings of the sub-components. 
       */
      override fun subComponentConfigurationDetails(subComponentConfigurationDetails: IResolvable) {
        cdkBuilder.subComponentConfigurationDetails(subComponentConfigurationDetails.let(IResolvable::unwrap))
      }

      /**
       * @param subComponentConfigurationDetails The configuration settings of the sub-components. 
       */
      override
          fun subComponentConfigurationDetails(subComponentConfigurationDetails: SubComponentConfigurationDetailsProperty) {
        cdkBuilder.subComponentConfigurationDetails(subComponentConfigurationDetails.let(SubComponentConfigurationDetailsProperty::unwrap))
      }

      /**
       * @param subComponentConfigurationDetails The configuration settings of the sub-components. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6cceeff7e3247f0f06789a218f95b07fda8f6430d9c7a9c50818fb81d6839d17")
      override
          fun subComponentConfigurationDetails(subComponentConfigurationDetails: SubComponentConfigurationDetailsProperty.Builder.() -> Unit):
          Unit =
          subComponentConfigurationDetails(SubComponentConfigurationDetailsProperty(subComponentConfigurationDetails))

      /**
       * @param subComponentType The sub-component type. 
       */
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
      /**
       * The configuration settings of the sub-components.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-subcomponenttypeconfiguration.html#cfn-applicationinsights-application-subcomponenttypeconfiguration-subcomponentconfigurationdetails)
       */
      override fun subComponentConfigurationDetails(): Any =
          unwrap(this).getSubComponentConfigurationDetails()

      /**
       * The sub-component type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-subcomponenttypeconfiguration.html#cfn-applicationinsights-application-subcomponenttypeconfiguration-subcomponenttype)
       */
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

  /**
   * The `AWS::ApplicationInsights::Application CustomComponent` property type describes a custom
   * component by grouping similar standalone instances to monitor.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.applicationinsights.*;
   * CustomComponentProperty customComponentProperty = CustomComponentProperty.builder()
   * .componentName("componentName")
   * .resourceList(List.of("resourceList"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-customcomponent.html)
   */
  public interface CustomComponentProperty {
    /**
     * The name of the component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-customcomponent.html#cfn-applicationinsights-application-customcomponent-componentname)
     */
    public fun componentName(): String

    /**
     * The list of resource ARNs that belong to the component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-customcomponent.html#cfn-applicationinsights-application-customcomponent-resourcelist)
     */
    public fun resourceList(): List<String>

    /**
     * A builder for [CustomComponentProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param componentName The name of the component. 
       */
      public fun componentName(componentName: String)

      /**
       * @param resourceList The list of resource ARNs that belong to the component. 
       */
      public fun resourceList(resourceList: List<String>)

      /**
       * @param resourceList The list of resource ARNs that belong to the component. 
       */
      public fun resourceList(vararg resourceList: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.CustomComponentProperty.Builder
          =
          software.amazon.awscdk.services.applicationinsights.CfnApplication.CustomComponentProperty.builder()

      /**
       * @param componentName The name of the component. 
       */
      override fun componentName(componentName: String) {
        cdkBuilder.componentName(componentName)
      }

      /**
       * @param resourceList The list of resource ARNs that belong to the component. 
       */
      override fun resourceList(resourceList: List<String>) {
        cdkBuilder.resourceList(resourceList)
      }

      /**
       * @param resourceList The list of resource ARNs that belong to the component. 
       */
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
      /**
       * The name of the component.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-customcomponent.html#cfn-applicationinsights-application-customcomponent-componentname)
       */
      override fun componentName(): String = unwrap(this).getComponentName()

      /**
       * The list of resource ARNs that belong to the component.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-customcomponent.html#cfn-applicationinsights-application-customcomponent-resourcelist)
       */
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

  /**
   * The `AWS::ApplicationInsights::Application HANAPrometheusExporter` property type defines the
   * HANA DB Prometheus Exporter settings.
   *
   * For more information, see the [component
   * configuration](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/component-config-sections.html#component-configuration-prometheus)
   * in the CloudWatch Application Insights documentation.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.applicationinsights.*;
   * HANAPrometheusExporterProperty hANAPrometheusExporterProperty =
   * HANAPrometheusExporterProperty.builder()
   * .agreeToInstallHanadbClient(false)
   * .hanaPort("hanaPort")
   * .hanaSecretName("hanaSecretName")
   * .hanasid("hanasid")
   * // the properties below are optional
   * .prometheusPort("prometheusPort")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-hanaprometheusexporter.html)
   */
  public interface HANAPrometheusExporterProperty {
    /**
     * Designates whether you agree to install the HANA DB client.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-hanaprometheusexporter.html#cfn-applicationinsights-application-hanaprometheusexporter-agreetoinstallhanadbclient)
     */
    public fun agreeToInstallHanadbClient(): Any

    /**
     * The HANA database port by which the exporter will query HANA metrics.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-hanaprometheusexporter.html#cfn-applicationinsights-application-hanaprometheusexporter-hanaport)
     */
    public fun hanaPort(): String

    /**
     * The AWS Secrets Manager secret that stores HANA monitoring user credentials.
     *
     * The HANA Prometheus exporter uses these credentials to connect to the database and query HANA
     * metrics.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-hanaprometheusexporter.html#cfn-applicationinsights-application-hanaprometheusexporter-hanasecretname)
     */
    public fun hanaSecretName(): String

    /**
     * The three-character SAP system ID (SID) of the SAP HANA system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-hanaprometheusexporter.html#cfn-applicationinsights-application-hanaprometheusexporter-hanasid)
     */
    public fun hanasid(): String

    /**
     * The target port to which Prometheus sends metrics.
     *
     * If not specified, the default port 9668 is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-hanaprometheusexporter.html#cfn-applicationinsights-application-hanaprometheusexporter-prometheusport)
     */
    public fun prometheusPort(): String? = unwrap(this).getPrometheusPort()

    /**
     * A builder for [HANAPrometheusExporterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param agreeToInstallHanadbClient Designates whether you agree to install the HANA DB
       * client. 
       */
      public fun agreeToInstallHanadbClient(agreeToInstallHanadbClient: Boolean)

      /**
       * @param agreeToInstallHanadbClient Designates whether you agree to install the HANA DB
       * client. 
       */
      public fun agreeToInstallHanadbClient(agreeToInstallHanadbClient: IResolvable)

      /**
       * @param hanaPort The HANA database port by which the exporter will query HANA metrics. 
       */
      public fun hanaPort(hanaPort: String)

      /**
       * @param hanaSecretName The AWS Secrets Manager secret that stores HANA monitoring user
       * credentials. 
       * The HANA Prometheus exporter uses these credentials to connect to the database and query
       * HANA metrics.
       */
      public fun hanaSecretName(hanaSecretName: String)

      /**
       * @param hanasid The three-character SAP system ID (SID) of the SAP HANA system. 
       */
      public fun hanasid(hanasid: String)

      /**
       * @param prometheusPort The target port to which Prometheus sends metrics.
       * If not specified, the default port 9668 is used.
       */
      public fun prometheusPort(prometheusPort: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.HANAPrometheusExporterProperty.Builder
          =
          software.amazon.awscdk.services.applicationinsights.CfnApplication.HANAPrometheusExporterProperty.builder()

      /**
       * @param agreeToInstallHanadbClient Designates whether you agree to install the HANA DB
       * client. 
       */
      override fun agreeToInstallHanadbClient(agreeToInstallHanadbClient: Boolean) {
        cdkBuilder.agreeToInstallHanadbClient(agreeToInstallHanadbClient)
      }

      /**
       * @param agreeToInstallHanadbClient Designates whether you agree to install the HANA DB
       * client. 
       */
      override fun agreeToInstallHanadbClient(agreeToInstallHanadbClient: IResolvable) {
        cdkBuilder.agreeToInstallHanadbClient(agreeToInstallHanadbClient.let(IResolvable::unwrap))
      }

      /**
       * @param hanaPort The HANA database port by which the exporter will query HANA metrics. 
       */
      override fun hanaPort(hanaPort: String) {
        cdkBuilder.hanaPort(hanaPort)
      }

      /**
       * @param hanaSecretName The AWS Secrets Manager secret that stores HANA monitoring user
       * credentials. 
       * The HANA Prometheus exporter uses these credentials to connect to the database and query
       * HANA metrics.
       */
      override fun hanaSecretName(hanaSecretName: String) {
        cdkBuilder.hanaSecretName(hanaSecretName)
      }

      /**
       * @param hanasid The three-character SAP system ID (SID) of the SAP HANA system. 
       */
      override fun hanasid(hanasid: String) {
        cdkBuilder.hanasid(hanasid)
      }

      /**
       * @param prometheusPort The target port to which Prometheus sends metrics.
       * If not specified, the default port 9668 is used.
       */
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
      /**
       * Designates whether you agree to install the HANA DB client.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-hanaprometheusexporter.html#cfn-applicationinsights-application-hanaprometheusexporter-agreetoinstallhanadbclient)
       */
      override fun agreeToInstallHanadbClient(): Any = unwrap(this).getAgreeToInstallHanadbClient()

      /**
       * The HANA database port by which the exporter will query HANA metrics.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-hanaprometheusexporter.html#cfn-applicationinsights-application-hanaprometheusexporter-hanaport)
       */
      override fun hanaPort(): String = unwrap(this).getHanaPort()

      /**
       * The AWS Secrets Manager secret that stores HANA monitoring user credentials.
       *
       * The HANA Prometheus exporter uses these credentials to connect to the database and query
       * HANA metrics.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-hanaprometheusexporter.html#cfn-applicationinsights-application-hanaprometheusexporter-hanasecretname)
       */
      override fun hanaSecretName(): String = unwrap(this).getHanaSecretName()

      /**
       * The three-character SAP system ID (SID) of the SAP HANA system.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-hanaprometheusexporter.html#cfn-applicationinsights-application-hanaprometheusexporter-hanasid)
       */
      override fun hanasid(): String = unwrap(this).getHanasid()

      /**
       * The target port to which Prometheus sends metrics.
       *
       * If not specified, the default port 9668 is used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-hanaprometheusexporter.html#cfn-applicationinsights-application-hanaprometheusexporter-prometheusport)
       */
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

  /**
   * The `AWS::ApplicationInsights::Application LogPattern` property type specifies an object that
   * defines the log patterns that belong to a `LogPatternSet` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.applicationinsights.*;
   * LogPatternProperty logPatternProperty = LogPatternProperty.builder()
   * .pattern("pattern")
   * .patternName("patternName")
   * .rank(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-logpattern.html)
   */
  public interface LogPatternProperty {
    /**
     * A regular expression that defines the log pattern.
     *
     * A log pattern can contain up to 50 characters, and it cannot be empty.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-logpattern.html#cfn-applicationinsights-application-logpattern-pattern)
     */
    public fun pattern(): String

    /**
     * The name of the log pattern.
     *
     * A log pattern name can contain up to 50 characters, and it cannot be empty. The characters
     * can be Unicode letters, digits, or one of the following symbols: period, dash, underscore.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-logpattern.html#cfn-applicationinsights-application-logpattern-patternname)
     */
    public fun patternName(): String

    /**
     * The rank of the log pattern.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-logpattern.html#cfn-applicationinsights-application-logpattern-rank)
     */
    public fun rank(): Number

    /**
     * A builder for [LogPatternProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param pattern A regular expression that defines the log pattern. 
       * A log pattern can contain up to 50 characters, and it cannot be empty.
       */
      public fun pattern(pattern: String)

      /**
       * @param patternName The name of the log pattern. 
       * A log pattern name can contain up to 50 characters, and it cannot be empty. The characters
       * can be Unicode letters, digits, or one of the following symbols: period, dash, underscore.
       */
      public fun patternName(patternName: String)

      /**
       * @param rank The rank of the log pattern. 
       */
      public fun rank(rank: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.LogPatternProperty.Builder
          =
          software.amazon.awscdk.services.applicationinsights.CfnApplication.LogPatternProperty.builder()

      /**
       * @param pattern A regular expression that defines the log pattern. 
       * A log pattern can contain up to 50 characters, and it cannot be empty.
       */
      override fun pattern(pattern: String) {
        cdkBuilder.pattern(pattern)
      }

      /**
       * @param patternName The name of the log pattern. 
       * A log pattern name can contain up to 50 characters, and it cannot be empty. The characters
       * can be Unicode letters, digits, or one of the following symbols: period, dash, underscore.
       */
      override fun patternName(patternName: String) {
        cdkBuilder.patternName(patternName)
      }

      /**
       * @param rank The rank of the log pattern. 
       */
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
      /**
       * A regular expression that defines the log pattern.
       *
       * A log pattern can contain up to 50 characters, and it cannot be empty.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-logpattern.html#cfn-applicationinsights-application-logpattern-pattern)
       */
      override fun pattern(): String = unwrap(this).getPattern()

      /**
       * The name of the log pattern.
       *
       * A log pattern name can contain up to 50 characters, and it cannot be empty. The characters
       * can be Unicode letters, digits, or one of the following symbols: period, dash, underscore.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-logpattern.html#cfn-applicationinsights-application-logpattern-patternname)
       */
      override fun patternName(): String = unwrap(this).getPatternName()

      /**
       * The rank of the log pattern.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-logpattern.html#cfn-applicationinsights-application-logpattern-rank)
       */
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

  /**
   * The `AWS::ApplicationInsights::Application ComponentMonitoringSetting` property type defines
   * the monitoring setting of the component.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.applicationinsights.*;
   * ComponentMonitoringSettingProperty componentMonitoringSettingProperty =
   * ComponentMonitoringSettingProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-componentmonitoringsetting.html)
   */
  public interface ComponentMonitoringSettingProperty {
    /**
     * The ARN of the component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-componentmonitoringsetting.html#cfn-applicationinsights-application-componentmonitoringsetting-componentarn)
     */
    public fun componentArn(): String? = unwrap(this).getComponentArn()

    /**
     * Component monitoring can be configured in one of the following three modes:.
     *
     * * `DEFAULT` : The component will be configured with the recommended default monitoring
     * settings of the selected `Tier` .
     * * `CUSTOM` : The component will be configured with the customized monitoring settings that
     * are specified in `CustomComponentConfiguration` . If used, `CustomComponentConfiguration` must
     * be provided.
     * * `DEFAULT_WITH_OVERWRITE` : The component will be configured with the recommended default
     * monitoring settings of the selected `Tier` , and merged with customized overwrite settings that
     * are specified in `DefaultOverwriteComponentConfiguration` . If used,
     * `DefaultOverwriteComponentConfiguration` must be provided.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-componentmonitoringsetting.html#cfn-applicationinsights-application-componentmonitoringsetting-componentconfigurationmode)
     */
    public fun componentConfigurationMode(): String

    /**
     * The name of the component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-componentmonitoringsetting.html#cfn-applicationinsights-application-componentmonitoringsetting-componentname)
     */
    public fun componentName(): String? = unwrap(this).getComponentName()

    /**
     * Customized monitoring settings.
     *
     * Required if CUSTOM mode is configured in `ComponentConfigurationMode` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-componentmonitoringsetting.html#cfn-applicationinsights-application-componentmonitoringsetting-customcomponentconfiguration)
     */
    public fun customComponentConfiguration(): Any? = unwrap(this).getCustomComponentConfiguration()

    /**
     * Customized overwrite monitoring settings.
     *
     * Required if CUSTOM mode is configured in `ComponentConfigurationMode` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-componentmonitoringsetting.html#cfn-applicationinsights-application-componentmonitoringsetting-defaultoverwritecomponentconfiguration)
     */
    public fun defaultOverwriteComponentConfiguration(): Any? =
        unwrap(this).getDefaultOverwriteComponentConfiguration()

    /**
     * The tier of the application component.
     *
     * Supported tiers include `DOT_NET_CORE` , `DOT_NET_WORKER` , `DOT_NET_WEB` , `SQL_SERVER` ,
     * `SQL_SERVER_ALWAYSON_AVAILABILITY_GROUP` , `SQL_SERVER_FAILOVER_CLUSTER_INSTANCE` , `MYSQL` ,
     * `POSTGRESQL` , `JAVA_JMX` , `ORACLE` , `SAP_HANA_MULTI_NODE` , `SAP_HANA_SINGLE_NODE` ,
     * `SAP_HANA_HIGH_AVAILABILITY` , `SHAREPOINT` . `ACTIVE_DIRECTORY` , and `DEFAULT` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-componentmonitoringsetting.html#cfn-applicationinsights-application-componentmonitoringsetting-tier)
     */
    public fun tier(): String

    /**
     * A builder for [ComponentMonitoringSettingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param componentArn The ARN of the component.
       */
      public fun componentArn(componentArn: String)

      /**
       * @param componentConfigurationMode Component monitoring can be configured in one of the
       * following three modes:. 
       * * `DEFAULT` : The component will be configured with the recommended default monitoring
       * settings of the selected `Tier` .
       * * `CUSTOM` : The component will be configured with the customized monitoring settings that
       * are specified in `CustomComponentConfiguration` . If used, `CustomComponentConfiguration` must
       * be provided.
       * * `DEFAULT_WITH_OVERWRITE` : The component will be configured with the recommended default
       * monitoring settings of the selected `Tier` , and merged with customized overwrite settings
       * that are specified in `DefaultOverwriteComponentConfiguration` . If used,
       * `DefaultOverwriteComponentConfiguration` must be provided.
       */
      public fun componentConfigurationMode(componentConfigurationMode: String)

      /**
       * @param componentName The name of the component.
       */
      public fun componentName(componentName: String)

      /**
       * @param customComponentConfiguration Customized monitoring settings.
       * Required if CUSTOM mode is configured in `ComponentConfigurationMode` .
       */
      public fun customComponentConfiguration(customComponentConfiguration: IResolvable)

      /**
       * @param customComponentConfiguration Customized monitoring settings.
       * Required if CUSTOM mode is configured in `ComponentConfigurationMode` .
       */
      public
          fun customComponentConfiguration(customComponentConfiguration: ComponentConfigurationProperty)

      /**
       * @param customComponentConfiguration Customized monitoring settings.
       * Required if CUSTOM mode is configured in `ComponentConfigurationMode` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("457cc7c6eb707505dd8cb7ff3054381f5738ce732f8bf3fb55022aa362f0e924")
      public
          fun customComponentConfiguration(customComponentConfiguration: ComponentConfigurationProperty.Builder.() -> Unit)

      /**
       * @param defaultOverwriteComponentConfiguration Customized overwrite monitoring settings.
       * Required if CUSTOM mode is configured in `ComponentConfigurationMode` .
       */
      public
          fun defaultOverwriteComponentConfiguration(defaultOverwriteComponentConfiguration: IResolvable)

      /**
       * @param defaultOverwriteComponentConfiguration Customized overwrite monitoring settings.
       * Required if CUSTOM mode is configured in `ComponentConfigurationMode` .
       */
      public
          fun defaultOverwriteComponentConfiguration(defaultOverwriteComponentConfiguration: ComponentConfigurationProperty)

      /**
       * @param defaultOverwriteComponentConfiguration Customized overwrite monitoring settings.
       * Required if CUSTOM mode is configured in `ComponentConfigurationMode` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e4791a30d1187c148ce4f3612f5b25e8c8f513997350b6e911df83437cc08c45")
      public
          fun defaultOverwriteComponentConfiguration(defaultOverwriteComponentConfiguration: ComponentConfigurationProperty.Builder.() -> Unit)

      /**
       * @param tier The tier of the application component. 
       * Supported tiers include `DOT_NET_CORE` , `DOT_NET_WORKER` , `DOT_NET_WEB` , `SQL_SERVER` ,
       * `SQL_SERVER_ALWAYSON_AVAILABILITY_GROUP` , `SQL_SERVER_FAILOVER_CLUSTER_INSTANCE` , `MYSQL` ,
       * `POSTGRESQL` , `JAVA_JMX` , `ORACLE` , `SAP_HANA_MULTI_NODE` , `SAP_HANA_SINGLE_NODE` ,
       * `SAP_HANA_HIGH_AVAILABILITY` , `SHAREPOINT` . `ACTIVE_DIRECTORY` , and `DEFAULT` .
       */
      public fun tier(tier: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.ComponentMonitoringSettingProperty.Builder
          =
          software.amazon.awscdk.services.applicationinsights.CfnApplication.ComponentMonitoringSettingProperty.builder()

      /**
       * @param componentArn The ARN of the component.
       */
      override fun componentArn(componentArn: String) {
        cdkBuilder.componentArn(componentArn)
      }

      /**
       * @param componentConfigurationMode Component monitoring can be configured in one of the
       * following three modes:. 
       * * `DEFAULT` : The component will be configured with the recommended default monitoring
       * settings of the selected `Tier` .
       * * `CUSTOM` : The component will be configured with the customized monitoring settings that
       * are specified in `CustomComponentConfiguration` . If used, `CustomComponentConfiguration` must
       * be provided.
       * * `DEFAULT_WITH_OVERWRITE` : The component will be configured with the recommended default
       * monitoring settings of the selected `Tier` , and merged with customized overwrite settings
       * that are specified in `DefaultOverwriteComponentConfiguration` . If used,
       * `DefaultOverwriteComponentConfiguration` must be provided.
       */
      override fun componentConfigurationMode(componentConfigurationMode: String) {
        cdkBuilder.componentConfigurationMode(componentConfigurationMode)
      }

      /**
       * @param componentName The name of the component.
       */
      override fun componentName(componentName: String) {
        cdkBuilder.componentName(componentName)
      }

      /**
       * @param customComponentConfiguration Customized monitoring settings.
       * Required if CUSTOM mode is configured in `ComponentConfigurationMode` .
       */
      override fun customComponentConfiguration(customComponentConfiguration: IResolvable) {
        cdkBuilder.customComponentConfiguration(customComponentConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param customComponentConfiguration Customized monitoring settings.
       * Required if CUSTOM mode is configured in `ComponentConfigurationMode` .
       */
      override
          fun customComponentConfiguration(customComponentConfiguration: ComponentConfigurationProperty) {
        cdkBuilder.customComponentConfiguration(customComponentConfiguration.let(ComponentConfigurationProperty::unwrap))
      }

      /**
       * @param customComponentConfiguration Customized monitoring settings.
       * Required if CUSTOM mode is configured in `ComponentConfigurationMode` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("457cc7c6eb707505dd8cb7ff3054381f5738ce732f8bf3fb55022aa362f0e924")
      override
          fun customComponentConfiguration(customComponentConfiguration: ComponentConfigurationProperty.Builder.() -> Unit):
          Unit =
          customComponentConfiguration(ComponentConfigurationProperty(customComponentConfiguration))

      /**
       * @param defaultOverwriteComponentConfiguration Customized overwrite monitoring settings.
       * Required if CUSTOM mode is configured in `ComponentConfigurationMode` .
       */
      override
          fun defaultOverwriteComponentConfiguration(defaultOverwriteComponentConfiguration: IResolvable) {
        cdkBuilder.defaultOverwriteComponentConfiguration(defaultOverwriteComponentConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param defaultOverwriteComponentConfiguration Customized overwrite monitoring settings.
       * Required if CUSTOM mode is configured in `ComponentConfigurationMode` .
       */
      override
          fun defaultOverwriteComponentConfiguration(defaultOverwriteComponentConfiguration: ComponentConfigurationProperty) {
        cdkBuilder.defaultOverwriteComponentConfiguration(defaultOverwriteComponentConfiguration.let(ComponentConfigurationProperty::unwrap))
      }

      /**
       * @param defaultOverwriteComponentConfiguration Customized overwrite monitoring settings.
       * Required if CUSTOM mode is configured in `ComponentConfigurationMode` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e4791a30d1187c148ce4f3612f5b25e8c8f513997350b6e911df83437cc08c45")
      override
          fun defaultOverwriteComponentConfiguration(defaultOverwriteComponentConfiguration: ComponentConfigurationProperty.Builder.() -> Unit):
          Unit =
          defaultOverwriteComponentConfiguration(ComponentConfigurationProperty(defaultOverwriteComponentConfiguration))

      /**
       * @param tier The tier of the application component. 
       * Supported tiers include `DOT_NET_CORE` , `DOT_NET_WORKER` , `DOT_NET_WEB` , `SQL_SERVER` ,
       * `SQL_SERVER_ALWAYSON_AVAILABILITY_GROUP` , `SQL_SERVER_FAILOVER_CLUSTER_INSTANCE` , `MYSQL` ,
       * `POSTGRESQL` , `JAVA_JMX` , `ORACLE` , `SAP_HANA_MULTI_NODE` , `SAP_HANA_SINGLE_NODE` ,
       * `SAP_HANA_HIGH_AVAILABILITY` , `SHAREPOINT` . `ACTIVE_DIRECTORY` , and `DEFAULT` .
       */
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
      /**
       * The ARN of the component.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-componentmonitoringsetting.html#cfn-applicationinsights-application-componentmonitoringsetting-componentarn)
       */
      override fun componentArn(): String? = unwrap(this).getComponentArn()

      /**
       * Component monitoring can be configured in one of the following three modes:.
       *
       * * `DEFAULT` : The component will be configured with the recommended default monitoring
       * settings of the selected `Tier` .
       * * `CUSTOM` : The component will be configured with the customized monitoring settings that
       * are specified in `CustomComponentConfiguration` . If used, `CustomComponentConfiguration` must
       * be provided.
       * * `DEFAULT_WITH_OVERWRITE` : The component will be configured with the recommended default
       * monitoring settings of the selected `Tier` , and merged with customized overwrite settings
       * that are specified in `DefaultOverwriteComponentConfiguration` . If used,
       * `DefaultOverwriteComponentConfiguration` must be provided.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-componentmonitoringsetting.html#cfn-applicationinsights-application-componentmonitoringsetting-componentconfigurationmode)
       */
      override fun componentConfigurationMode(): String =
          unwrap(this).getComponentConfigurationMode()

      /**
       * The name of the component.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-componentmonitoringsetting.html#cfn-applicationinsights-application-componentmonitoringsetting-componentname)
       */
      override fun componentName(): String? = unwrap(this).getComponentName()

      /**
       * Customized monitoring settings.
       *
       * Required if CUSTOM mode is configured in `ComponentConfigurationMode` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-componentmonitoringsetting.html#cfn-applicationinsights-application-componentmonitoringsetting-customcomponentconfiguration)
       */
      override fun customComponentConfiguration(): Any? =
          unwrap(this).getCustomComponentConfiguration()

      /**
       * Customized overwrite monitoring settings.
       *
       * Required if CUSTOM mode is configured in `ComponentConfigurationMode` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-componentmonitoringsetting.html#cfn-applicationinsights-application-componentmonitoringsetting-defaultoverwritecomponentconfiguration)
       */
      override fun defaultOverwriteComponentConfiguration(): Any? =
          unwrap(this).getDefaultOverwriteComponentConfiguration()

      /**
       * The tier of the application component.
       *
       * Supported tiers include `DOT_NET_CORE` , `DOT_NET_WORKER` , `DOT_NET_WEB` , `SQL_SERVER` ,
       * `SQL_SERVER_ALWAYSON_AVAILABILITY_GROUP` , `SQL_SERVER_FAILOVER_CLUSTER_INSTANCE` , `MYSQL` ,
       * `POSTGRESQL` , `JAVA_JMX` , `ORACLE` , `SAP_HANA_MULTI_NODE` , `SAP_HANA_SINGLE_NODE` ,
       * `SAP_HANA_HIGH_AVAILABILITY` , `SHAREPOINT` . `ACTIVE_DIRECTORY` , and `DEFAULT` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-componentmonitoringsetting.html#cfn-applicationinsights-application-componentmonitoringsetting-tier)
       */
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

  /**
   * The `AWS::ApplicationInsights::Application AlarmMetric` property type defines a metric to
   * monitor for the component.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.applicationinsights.*;
   * AlarmMetricProperty alarmMetricProperty = AlarmMetricProperty.builder()
   * .alarmMetricName("alarmMetricName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-alarmmetric.html)
   */
  public interface AlarmMetricProperty {
    /**
     * The name of the metric to be monitored for the component.
     *
     * For metrics supported by Application Insights, see [Logs and metrics supported by Amazon
     * CloudWatch Application
     * Insights](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/appinsights-logs-and-metrics.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-alarmmetric.html#cfn-applicationinsights-application-alarmmetric-alarmmetricname)
     */
    public fun alarmMetricName(): String

    /**
     * A builder for [AlarmMetricProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param alarmMetricName The name of the metric to be monitored for the component. 
       * For metrics supported by Application Insights, see [Logs and metrics supported by Amazon
       * CloudWatch Application
       * Insights](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/appinsights-logs-and-metrics.html)
       * .
       */
      public fun alarmMetricName(alarmMetricName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationinsights.CfnApplication.AlarmMetricProperty.Builder
          =
          software.amazon.awscdk.services.applicationinsights.CfnApplication.AlarmMetricProperty.builder()

      /**
       * @param alarmMetricName The name of the metric to be monitored for the component. 
       * For metrics supported by Application Insights, see [Logs and metrics supported by Amazon
       * CloudWatch Application
       * Insights](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/appinsights-logs-and-metrics.html)
       * .
       */
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
      /**
       * The name of the metric to be monitored for the component.
       *
       * For metrics supported by Application Insights, see [Logs and metrics supported by Amazon
       * CloudWatch Application
       * Insights](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/appinsights-logs-and-metrics.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-alarmmetric.html#cfn-applicationinsights-application-alarmmetric-alarmmetricname)
       */
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
