@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.internetmonitor

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
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
 * The `AWS::InternetMonitor::Monitor` resource is an Internet Monitor resource type that contains
 * information about how you create a monitor in Amazon CloudWatch Internet Monitor.
 *
 * A monitor in Internet Monitor provides visibility into performance and availability between your
 * applications hosted on AWS and your end users, using a traffic profile that it creates based on the
 * application resources that you add: Virtual Private Clouds (VPCs), Amazon CloudFront distributions,
 * or WorkSpaces directories.
 *
 * Internet Monitor also alerts you to internet issues that impact your application in the
 * city-networks (geographies and networks) where your end users use it. With Internet Monitor, you can
 * quickly pinpoint the locations and providers that are affected, so that you can address the issue.
 *
 * For more information, see [Using Amazon CloudWatch Internet
 * Monitor](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-InternetMonitor.html)
 * in the *Amazon CloudWatch User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.internetmonitor.*;
 * CfnMonitor cfnMonitor = CfnMonitor.Builder.create(this, "MyCfnMonitor")
 * .monitorName("monitorName")
 * // the properties below are optional
 * .healthEventsConfig(HealthEventsConfigProperty.builder()
 * .availabilityLocalHealthEventsConfig(LocalHealthEventsConfigProperty.builder()
 * .healthScoreThreshold(123)
 * .minTrafficImpact(123)
 * .status("status")
 * .build())
 * .availabilityScoreThreshold(123)
 * .performanceLocalHealthEventsConfig(LocalHealthEventsConfigProperty.builder()
 * .healthScoreThreshold(123)
 * .minTrafficImpact(123)
 * .status("status")
 * .build())
 * .performanceScoreThreshold(123)
 * .build())
 * .includeLinkedAccounts(false)
 * .internetMeasurementsLogDelivery(InternetMeasurementsLogDeliveryProperty.builder()
 * .s3Config(S3ConfigProperty.builder()
 * .bucketName("bucketName")
 * .bucketPrefix("bucketPrefix")
 * .logDeliveryStatus("logDeliveryStatus")
 * .build())
 * .build())
 * .linkedAccountId("linkedAccountId")
 * .maxCityNetworksToMonitor(123)
 * .resources(List.of("resources"))
 * .resourcesToAdd(List.of("resourcesToAdd"))
 * .resourcesToRemove(List.of("resourcesToRemove"))
 * .status("status")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .trafficPercentageToMonitor(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html)
 */
public open class CfnMonitor(
  cdkObject: software.amazon.awscdk.services.internetmonitor.CfnMonitor,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnMonitorProps,
  ) :
      this(software.amazon.awscdk.services.internetmonitor.CfnMonitor(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnMonitorProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnMonitorProps.Builder.() -> Unit,
  ) : this(scope, id, CfnMonitorProps(props)
  )

  /**
   * The time when the monitor was created.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The last time that the monitor was modified.
   */
  public open fun attrModifiedAt(): String = unwrap(this).getAttrModifiedAt()

  /**
   * The Amazon Resource Name (ARN) of the monitor.
   */
  public open fun attrMonitorArn(): String = unwrap(this).getAttrMonitorArn()

  /**
   * The health of data processing for the monitor.
   *
   * For more information, see `ProcessingStatus` under
   * [MonitorListMember](https://docs.aws.amazon.com/internet-monitor/latest/api/API_MonitorListMember.html)
   * in the *Amazon CloudWatch Internet Monitor API Reference* .
   */
  public open fun attrProcessingStatus(): String = unwrap(this).getAttrProcessingStatus()

  /**
   * Additional information about the health of the data processing for the monitor.
   */
  public open fun attrProcessingStatusInfo(): String = unwrap(this).getAttrProcessingStatusInfo()

  /**
   * A complex type with the configuration information that determines the threshold and other
   * conditions for when Internet Monitor creates a health event for an overall performance or
   * availability issue, across an application's geographies.
   */
  public open fun healthEventsConfig(): Any? = unwrap(this).getHealthEventsConfig()

  /**
   * A complex type with the configuration information that determines the threshold and other
   * conditions for when Internet Monitor creates a health event for an overall performance or
   * availability issue, across an application's geographies.
   */
  public open fun healthEventsConfig(`value`: IResolvable) {
    unwrap(this).setHealthEventsConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * A complex type with the configuration information that determines the threshold and other
   * conditions for when Internet Monitor creates a health event for an overall performance or
   * availability issue, across an application's geographies.
   */
  public open fun healthEventsConfig(`value`: HealthEventsConfigProperty) {
    unwrap(this).setHealthEventsConfig(`value`.let(HealthEventsConfigProperty::unwrap))
  }

  /**
   * A complex type with the configuration information that determines the threshold and other
   * conditions for when Internet Monitor creates a health event for an overall performance or
   * availability issue, across an application's geographies.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ac37fd3ad16b9a64a08b44b4f8bc327af787af9733c8ce04e49b4f569e603904")
  public open fun healthEventsConfig(`value`: HealthEventsConfigProperty.Builder.() -> Unit): Unit =
      healthEventsConfig(HealthEventsConfigProperty(`value`))

  /**
   * A boolean option that you can set to `TRUE` to include monitors for linked accounts in a list
   * of monitors, when you've set up cross-account sharing in Internet Monitor.
   */
  public open fun includeLinkedAccounts(): Any? = unwrap(this).getIncludeLinkedAccounts()

  /**
   * A boolean option that you can set to `TRUE` to include monitors for linked accounts in a list
   * of monitors, when you've set up cross-account sharing in Internet Monitor.
   */
  public open fun includeLinkedAccounts(`value`: Boolean) {
    unwrap(this).setIncludeLinkedAccounts(`value`)
  }

  /**
   * A boolean option that you can set to `TRUE` to include monitors for linked accounts in a list
   * of monitors, when you've set up cross-account sharing in Internet Monitor.
   */
  public open fun includeLinkedAccounts(`value`: IResolvable) {
    unwrap(this).setIncludeLinkedAccounts(`value`.let(IResolvable::unwrap))
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
   * Publish internet measurements for a monitor for all city-networks (up to the 500,000 service
   * limit) to another location, such as an Amazon S3 bucket.
   */
  public open fun internetMeasurementsLogDelivery(): Any? =
      unwrap(this).getInternetMeasurementsLogDelivery()

  /**
   * Publish internet measurements for a monitor for all city-networks (up to the 500,000 service
   * limit) to another location, such as an Amazon S3 bucket.
   */
  public open fun internetMeasurementsLogDelivery(`value`: IResolvable) {
    unwrap(this).setInternetMeasurementsLogDelivery(`value`.let(IResolvable::unwrap))
  }

  /**
   * Publish internet measurements for a monitor for all city-networks (up to the 500,000 service
   * limit) to another location, such as an Amazon S3 bucket.
   */
  public open
      fun internetMeasurementsLogDelivery(`value`: InternetMeasurementsLogDeliveryProperty) {
    unwrap(this).setInternetMeasurementsLogDelivery(`value`.let(InternetMeasurementsLogDeliveryProperty::unwrap))
  }

  /**
   * Publish internet measurements for a monitor for all city-networks (up to the 500,000 service
   * limit) to another location, such as an Amazon S3 bucket.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e3728d57b5a81cc142b977d9c1fabe327859a9d47dbb2864ae42e1f477331df9")
  public open
      fun internetMeasurementsLogDelivery(`value`: InternetMeasurementsLogDeliveryProperty.Builder.() -> Unit):
      Unit = internetMeasurementsLogDelivery(InternetMeasurementsLogDeliveryProperty(`value`))

  /**
   * The account ID for an account that you've set up cross-account sharing for in Internet Monitor.
   */
  public open fun linkedAccountId(): String? = unwrap(this).getLinkedAccountId()

  /**
   * The account ID for an account that you've set up cross-account sharing for in Internet Monitor.
   */
  public open fun linkedAccountId(`value`: String) {
    unwrap(this).setLinkedAccountId(`value`)
  }

  /**
   * The maximum number of city-networks to monitor for your resources.
   */
  public open fun maxCityNetworksToMonitor(): Number? = unwrap(this).getMaxCityNetworksToMonitor()

  /**
   * The maximum number of city-networks to monitor for your resources.
   */
  public open fun maxCityNetworksToMonitor(`value`: Number) {
    unwrap(this).setMaxCityNetworksToMonitor(`value`)
  }

  /**
   * The name of the monitor.
   */
  public open fun monitorName(): String = unwrap(this).getMonitorName()

  /**
   * The name of the monitor.
   */
  public open fun monitorName(`value`: String) {
    unwrap(this).setMonitorName(`value`)
  }

  /**
   * The resources that have been added for the monitor, listed by their Amazon Resource Names
   * (ARNs).
   */
  public open fun resources(): List<String> = unwrap(this).getResources() ?: emptyList()

  /**
   * The resources that have been added for the monitor, listed by their Amazon Resource Names
   * (ARNs).
   */
  public open fun resources(`value`: List<String>) {
    unwrap(this).setResources(`value`)
  }

  /**
   * The resources that have been added for the monitor, listed by their Amazon Resource Names
   * (ARNs).
   */
  public open fun resources(vararg `value`: String): Unit = resources(`value`.toList())

  /**
   * The resources to include in a monitor, which you provide as a set of Amazon Resource Names
   * (ARNs).
   */
  public open fun resourcesToAdd(): List<String> = unwrap(this).getResourcesToAdd() ?: emptyList()

  /**
   * The resources to include in a monitor, which you provide as a set of Amazon Resource Names
   * (ARNs).
   */
  public open fun resourcesToAdd(`value`: List<String>) {
    unwrap(this).setResourcesToAdd(`value`)
  }

  /**
   * The resources to include in a monitor, which you provide as a set of Amazon Resource Names
   * (ARNs).
   */
  public open fun resourcesToAdd(vararg `value`: String): Unit = resourcesToAdd(`value`.toList())

  /**
   * The resources to remove from a monitor, which you provide as a set of Amazon Resource Names
   * (ARNs).
   */
  public open fun resourcesToRemove(): List<String> = unwrap(this).getResourcesToRemove() ?:
      emptyList()

  /**
   * The resources to remove from a monitor, which you provide as a set of Amazon Resource Names
   * (ARNs).
   */
  public open fun resourcesToRemove(`value`: List<String>) {
    unwrap(this).setResourcesToRemove(`value`)
  }

  /**
   * The resources to remove from a monitor, which you provide as a set of Amazon Resource Names
   * (ARNs).
   */
  public open fun resourcesToRemove(vararg `value`: String): Unit =
      resourcesToRemove(`value`.toList())

  /**
   * The status of a monitor.
   */
  public open fun status(): String? = unwrap(this).getStatus()

  /**
   * The status of a monitor.
   */
  public open fun status(`value`: String) {
    unwrap(this).setStatus(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags for a monitor, listed as a set of *key:value* pairs.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags for a monitor, listed as a set of *key:value* pairs.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags for a monitor, listed as a set of *key:value* pairs.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The percentage of the internet-facing traffic for your application that you want to monitor.
   */
  public open fun trafficPercentageToMonitor(): Number? =
      unwrap(this).getTrafficPercentageToMonitor()

  /**
   * The percentage of the internet-facing traffic for your application that you want to monitor.
   */
  public open fun trafficPercentageToMonitor(`value`: Number) {
    unwrap(this).setTrafficPercentageToMonitor(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.internetmonitor.CfnMonitor].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A complex type with the configuration information that determines the threshold and other
     * conditions for when Internet Monitor creates a health event for an overall performance or
     * availability issue, across an application's geographies.
     *
     * Defines the percentages, for overall performance scores and availability scores for an
     * application, that are the thresholds for when Amazon CloudWatch Internet Monitor creates a
     * health event. You can override the defaults to set a custom threshold for overall performance or
     * availability scores, or both.
     *
     * You can also set thresholds for local health scores,, where Internet Monitor creates a health
     * event when scores cross a threshold for one or more city-networks, in addition to creating an
     * event when an overall score crosses a threshold.
     *
     * If you don't set a health event threshold, the default value is 95%.
     *
     * For local thresholds, you also set a minimum percentage of overall traffic that is impacted
     * by an issue before Internet Monitor creates an event. In addition, you can disable local
     * thresholds, for performance scores, availability scores, or both.
     *
     * For more information, see [Change health event
     * thresholds](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-overview.html#IMUpdateThresholdFromOverview)
     * in the Internet Monitor section of the *CloudWatch User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-healtheventsconfig)
     * @param healthEventsConfig A complex type with the configuration information that determines
     * the threshold and other conditions for when Internet Monitor creates a health event for an
     * overall performance or availability issue, across an application's geographies. 
     */
    public fun healthEventsConfig(healthEventsConfig: IResolvable)

    /**
     * A complex type with the configuration information that determines the threshold and other
     * conditions for when Internet Monitor creates a health event for an overall performance or
     * availability issue, across an application's geographies.
     *
     * Defines the percentages, for overall performance scores and availability scores for an
     * application, that are the thresholds for when Amazon CloudWatch Internet Monitor creates a
     * health event. You can override the defaults to set a custom threshold for overall performance or
     * availability scores, or both.
     *
     * You can also set thresholds for local health scores,, where Internet Monitor creates a health
     * event when scores cross a threshold for one or more city-networks, in addition to creating an
     * event when an overall score crosses a threshold.
     *
     * If you don't set a health event threshold, the default value is 95%.
     *
     * For local thresholds, you also set a minimum percentage of overall traffic that is impacted
     * by an issue before Internet Monitor creates an event. In addition, you can disable local
     * thresholds, for performance scores, availability scores, or both.
     *
     * For more information, see [Change health event
     * thresholds](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-overview.html#IMUpdateThresholdFromOverview)
     * in the Internet Monitor section of the *CloudWatch User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-healtheventsconfig)
     * @param healthEventsConfig A complex type with the configuration information that determines
     * the threshold and other conditions for when Internet Monitor creates a health event for an
     * overall performance or availability issue, across an application's geographies. 
     */
    public fun healthEventsConfig(healthEventsConfig: HealthEventsConfigProperty)

    /**
     * A complex type with the configuration information that determines the threshold and other
     * conditions for when Internet Monitor creates a health event for an overall performance or
     * availability issue, across an application's geographies.
     *
     * Defines the percentages, for overall performance scores and availability scores for an
     * application, that are the thresholds for when Amazon CloudWatch Internet Monitor creates a
     * health event. You can override the defaults to set a custom threshold for overall performance or
     * availability scores, or both.
     *
     * You can also set thresholds for local health scores,, where Internet Monitor creates a health
     * event when scores cross a threshold for one or more city-networks, in addition to creating an
     * event when an overall score crosses a threshold.
     *
     * If you don't set a health event threshold, the default value is 95%.
     *
     * For local thresholds, you also set a minimum percentage of overall traffic that is impacted
     * by an issue before Internet Monitor creates an event. In addition, you can disable local
     * thresholds, for performance scores, availability scores, or both.
     *
     * For more information, see [Change health event
     * thresholds](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-overview.html#IMUpdateThresholdFromOverview)
     * in the Internet Monitor section of the *CloudWatch User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-healtheventsconfig)
     * @param healthEventsConfig A complex type with the configuration information that determines
     * the threshold and other conditions for when Internet Monitor creates a health event for an
     * overall performance or availability issue, across an application's geographies. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b05a560a3c40f38371339032cfd1a3ffdeb5ffb50a6de313facf159c12d1e230")
    public fun healthEventsConfig(healthEventsConfig: HealthEventsConfigProperty.Builder.() -> Unit)

    /**
     * A boolean option that you can set to `TRUE` to include monitors for linked accounts in a list
     * of monitors, when you've set up cross-account sharing in Internet Monitor.
     *
     * You configure cross-account sharing by using Amazon CloudWatch Observability Access Manager.
     * For more information, see [Internet Monitor cross-account
     * observability](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cwim-cross-account.html)
     * in the Amazon CloudWatch User Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-includelinkedaccounts)
     * @param includeLinkedAccounts A boolean option that you can set to `TRUE` to include monitors
     * for linked accounts in a list of monitors, when you've set up cross-account sharing in Internet
     * Monitor. 
     */
    public fun includeLinkedAccounts(includeLinkedAccounts: Boolean)

    /**
     * A boolean option that you can set to `TRUE` to include monitors for linked accounts in a list
     * of monitors, when you've set up cross-account sharing in Internet Monitor.
     *
     * You configure cross-account sharing by using Amazon CloudWatch Observability Access Manager.
     * For more information, see [Internet Monitor cross-account
     * observability](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cwim-cross-account.html)
     * in the Amazon CloudWatch User Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-includelinkedaccounts)
     * @param includeLinkedAccounts A boolean option that you can set to `TRUE` to include monitors
     * for linked accounts in a list of monitors, when you've set up cross-account sharing in Internet
     * Monitor. 
     */
    public fun includeLinkedAccounts(includeLinkedAccounts: IResolvable)

    /**
     * Publish internet measurements for a monitor for all city-networks (up to the 500,000 service
     * limit) to another location, such as an Amazon S3 bucket.
     *
     * Measurements are also published to Amazon CloudWatch Logs for the first 500 (by traffic
     * volume) city-networks (client locations and ASNs, typically internet service providers or ISPs).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-internetmeasurementslogdelivery)
     * @param internetMeasurementsLogDelivery Publish internet measurements for a monitor for all
     * city-networks (up to the 500,000 service limit) to another location, such as an Amazon S3
     * bucket. 
     */
    public fun internetMeasurementsLogDelivery(internetMeasurementsLogDelivery: IResolvable)

    /**
     * Publish internet measurements for a monitor for all city-networks (up to the 500,000 service
     * limit) to another location, such as an Amazon S3 bucket.
     *
     * Measurements are also published to Amazon CloudWatch Logs for the first 500 (by traffic
     * volume) city-networks (client locations and ASNs, typically internet service providers or ISPs).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-internetmeasurementslogdelivery)
     * @param internetMeasurementsLogDelivery Publish internet measurements for a monitor for all
     * city-networks (up to the 500,000 service limit) to another location, such as an Amazon S3
     * bucket. 
     */
    public
        fun internetMeasurementsLogDelivery(internetMeasurementsLogDelivery: InternetMeasurementsLogDeliveryProperty)

    /**
     * Publish internet measurements for a monitor for all city-networks (up to the 500,000 service
     * limit) to another location, such as an Amazon S3 bucket.
     *
     * Measurements are also published to Amazon CloudWatch Logs for the first 500 (by traffic
     * volume) city-networks (client locations and ASNs, typically internet service providers or ISPs).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-internetmeasurementslogdelivery)
     * @param internetMeasurementsLogDelivery Publish internet measurements for a monitor for all
     * city-networks (up to the 500,000 service limit) to another location, such as an Amazon S3
     * bucket. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("89746903b7257412fcb57282231d673b152595e7bb530f29d5ff2306c6f9ec45")
    public
        fun internetMeasurementsLogDelivery(internetMeasurementsLogDelivery: InternetMeasurementsLogDeliveryProperty.Builder.() -> Unit)

    /**
     * The account ID for an account that you've set up cross-account sharing for in Internet
     * Monitor.
     *
     * You configure cross-account sharing by using Amazon CloudWatch Observability Access Manager.
     * For more information, see [Internet Monitor cross-account
     * observability](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cwim-cross-account.html)
     * in the Amazon CloudWatch User Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-linkedaccountid)
     * @param linkedAccountId The account ID for an account that you've set up cross-account sharing
     * for in Internet Monitor. 
     */
    public fun linkedAccountId(linkedAccountId: String)

    /**
     * The maximum number of city-networks to monitor for your resources.
     *
     * A city-network is the location (city) where clients access your application resources from
     * and the network, such as an internet service provider, that clients access the resources
     * through.
     *
     * For more information, see [Choosing a city-network maximum
     * value](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/IMCityNetworksMaximum.html)
     * in *Using Amazon CloudWatch Internet Monitor* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-maxcitynetworkstomonitor)
     * @param maxCityNetworksToMonitor The maximum number of city-networks to monitor for your
     * resources. 
     */
    public fun maxCityNetworksToMonitor(maxCityNetworksToMonitor: Number)

    /**
     * The name of the monitor.
     *
     * A monitor name can contain only alphanumeric characters, dashes (-), periods (.), and
     * underscores (_).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-monitorname)
     * @param monitorName The name of the monitor. 
     */
    public fun monitorName(monitorName: String)

    /**
     * The resources that have been added for the monitor, listed by their Amazon Resource Names
     * (ARNs).
     *
     * Use this option to add or remove resources when making an update.
     *
     *
     * Be aware that if you include content in the `Resources` field when you update a monitor, the
     * `ResourcesToAdd` and `ResourcesToRemove` fields must be empty.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-resources)
     * @param resources The resources that have been added for the monitor, listed by their Amazon
     * Resource Names (ARNs). 
     */
    public fun resources(resources: List<String>)

    /**
     * The resources that have been added for the monitor, listed by their Amazon Resource Names
     * (ARNs).
     *
     * Use this option to add or remove resources when making an update.
     *
     *
     * Be aware that if you include content in the `Resources` field when you update a monitor, the
     * `ResourcesToAdd` and `ResourcesToRemove` fields must be empty.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-resources)
     * @param resources The resources that have been added for the monitor, listed by their Amazon
     * Resource Names (ARNs). 
     */
    public fun resources(vararg resources: String)

    /**
     * The resources to include in a monitor, which you provide as a set of Amazon Resource Names
     * (ARNs).
     *
     * Resources can be Amazon Virtual Private Cloud VPCs, Network Load Balancers (NLBs), Amazon
     * CloudFront distributions, or Amazon WorkSpaces directories.
     *
     * You can add a combination of VPCs and CloudFront distributions, or you can add WorkSpaces
     * directories, or you can add NLBs. You can't add NLBs or WorkSpaces directories together with any
     * other resources.
     *
     * If you add only VPC resources, at least one VPC must have an Internet Gateway attached to it,
     * to make sure that it has internet connectivity.
     *
     *
     * You can specify this field for a monitor update only if the `Resources` field is empty.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-resourcestoadd)
     * @param resourcesToAdd The resources to include in a monitor, which you provide as a set of
     * Amazon Resource Names (ARNs). 
     */
    public fun resourcesToAdd(resourcesToAdd: List<String>)

    /**
     * The resources to include in a monitor, which you provide as a set of Amazon Resource Names
     * (ARNs).
     *
     * Resources can be Amazon Virtual Private Cloud VPCs, Network Load Balancers (NLBs), Amazon
     * CloudFront distributions, or Amazon WorkSpaces directories.
     *
     * You can add a combination of VPCs and CloudFront distributions, or you can add WorkSpaces
     * directories, or you can add NLBs. You can't add NLBs or WorkSpaces directories together with any
     * other resources.
     *
     * If you add only VPC resources, at least one VPC must have an Internet Gateway attached to it,
     * to make sure that it has internet connectivity.
     *
     *
     * You can specify this field for a monitor update only if the `Resources` field is empty.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-resourcestoadd)
     * @param resourcesToAdd The resources to include in a monitor, which you provide as a set of
     * Amazon Resource Names (ARNs). 
     */
    public fun resourcesToAdd(vararg resourcesToAdd: String)

    /**
     * The resources to remove from a monitor, which you provide as a set of Amazon Resource Names
     * (ARNs).
     *
     *
     * You can specify this field for a monitor update only if the `Resources` field is empty.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-resourcestoremove)
     * @param resourcesToRemove The resources to remove from a monitor, which you provide as a set
     * of Amazon Resource Names (ARNs). 
     */
    public fun resourcesToRemove(resourcesToRemove: List<String>)

    /**
     * The resources to remove from a monitor, which you provide as a set of Amazon Resource Names
     * (ARNs).
     *
     *
     * You can specify this field for a monitor update only if the `Resources` field is empty.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-resourcestoremove)
     * @param resourcesToRemove The resources to remove from a monitor, which you provide as a set
     * of Amazon Resource Names (ARNs). 
     */
    public fun resourcesToRemove(vararg resourcesToRemove: String)

    /**
     * The status of a monitor.
     *
     * The accepted values that you can specify for `Status` are `ACTIVE` and `INACTIVE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-status)
     * @param status The status of a monitor. 
     */
    public fun status(status: String)

    /**
     * The tags for a monitor, listed as a set of *key:value* pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-tags)
     * @param tags The tags for a monitor, listed as a set of *key:value* pairs. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags for a monitor, listed as a set of *key:value* pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-tags)
     * @param tags The tags for a monitor, listed as a set of *key:value* pairs. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The percentage of the internet-facing traffic for your application that you want to monitor.
     *
     * You can also, optionally, set a limit for the number of city-networks (client locations and
     * ASNs, typically internet service providers) that Internet Monitor will monitor traffic for. The
     * city-networks maximum limit caps the number of city-networks that Internet Monitor monitors for
     * your application, regardless of the percentage of traffic that you choose to monitor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-trafficpercentagetomonitor)
     * @param trafficPercentageToMonitor The percentage of the internet-facing traffic for your
     * application that you want to monitor. 
     */
    public fun trafficPercentageToMonitor(trafficPercentageToMonitor: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.internetmonitor.CfnMonitor.Builder =
        software.amazon.awscdk.services.internetmonitor.CfnMonitor.Builder.create(scope, id)

    /**
     * A complex type with the configuration information that determines the threshold and other
     * conditions for when Internet Monitor creates a health event for an overall performance or
     * availability issue, across an application's geographies.
     *
     * Defines the percentages, for overall performance scores and availability scores for an
     * application, that are the thresholds for when Amazon CloudWatch Internet Monitor creates a
     * health event. You can override the defaults to set a custom threshold for overall performance or
     * availability scores, or both.
     *
     * You can also set thresholds for local health scores,, where Internet Monitor creates a health
     * event when scores cross a threshold for one or more city-networks, in addition to creating an
     * event when an overall score crosses a threshold.
     *
     * If you don't set a health event threshold, the default value is 95%.
     *
     * For local thresholds, you also set a minimum percentage of overall traffic that is impacted
     * by an issue before Internet Monitor creates an event. In addition, you can disable local
     * thresholds, for performance scores, availability scores, or both.
     *
     * For more information, see [Change health event
     * thresholds](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-overview.html#IMUpdateThresholdFromOverview)
     * in the Internet Monitor section of the *CloudWatch User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-healtheventsconfig)
     * @param healthEventsConfig A complex type with the configuration information that determines
     * the threshold and other conditions for when Internet Monitor creates a health event for an
     * overall performance or availability issue, across an application's geographies. 
     */
    override fun healthEventsConfig(healthEventsConfig: IResolvable) {
      cdkBuilder.healthEventsConfig(healthEventsConfig.let(IResolvable::unwrap))
    }

    /**
     * A complex type with the configuration information that determines the threshold and other
     * conditions for when Internet Monitor creates a health event for an overall performance or
     * availability issue, across an application's geographies.
     *
     * Defines the percentages, for overall performance scores and availability scores for an
     * application, that are the thresholds for when Amazon CloudWatch Internet Monitor creates a
     * health event. You can override the defaults to set a custom threshold for overall performance or
     * availability scores, or both.
     *
     * You can also set thresholds for local health scores,, where Internet Monitor creates a health
     * event when scores cross a threshold for one or more city-networks, in addition to creating an
     * event when an overall score crosses a threshold.
     *
     * If you don't set a health event threshold, the default value is 95%.
     *
     * For local thresholds, you also set a minimum percentage of overall traffic that is impacted
     * by an issue before Internet Monitor creates an event. In addition, you can disable local
     * thresholds, for performance scores, availability scores, or both.
     *
     * For more information, see [Change health event
     * thresholds](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-overview.html#IMUpdateThresholdFromOverview)
     * in the Internet Monitor section of the *CloudWatch User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-healtheventsconfig)
     * @param healthEventsConfig A complex type with the configuration information that determines
     * the threshold and other conditions for when Internet Monitor creates a health event for an
     * overall performance or availability issue, across an application's geographies. 
     */
    override fun healthEventsConfig(healthEventsConfig: HealthEventsConfigProperty) {
      cdkBuilder.healthEventsConfig(healthEventsConfig.let(HealthEventsConfigProperty::unwrap))
    }

    /**
     * A complex type with the configuration information that determines the threshold and other
     * conditions for when Internet Monitor creates a health event for an overall performance or
     * availability issue, across an application's geographies.
     *
     * Defines the percentages, for overall performance scores and availability scores for an
     * application, that are the thresholds for when Amazon CloudWatch Internet Monitor creates a
     * health event. You can override the defaults to set a custom threshold for overall performance or
     * availability scores, or both.
     *
     * You can also set thresholds for local health scores,, where Internet Monitor creates a health
     * event when scores cross a threshold for one or more city-networks, in addition to creating an
     * event when an overall score crosses a threshold.
     *
     * If you don't set a health event threshold, the default value is 95%.
     *
     * For local thresholds, you also set a minimum percentage of overall traffic that is impacted
     * by an issue before Internet Monitor creates an event. In addition, you can disable local
     * thresholds, for performance scores, availability scores, or both.
     *
     * For more information, see [Change health event
     * thresholds](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-overview.html#IMUpdateThresholdFromOverview)
     * in the Internet Monitor section of the *CloudWatch User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-healtheventsconfig)
     * @param healthEventsConfig A complex type with the configuration information that determines
     * the threshold and other conditions for when Internet Monitor creates a health event for an
     * overall performance or availability issue, across an application's geographies. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b05a560a3c40f38371339032cfd1a3ffdeb5ffb50a6de313facf159c12d1e230")
    override
        fun healthEventsConfig(healthEventsConfig: HealthEventsConfigProperty.Builder.() -> Unit):
        Unit = healthEventsConfig(HealthEventsConfigProperty(healthEventsConfig))

    /**
     * A boolean option that you can set to `TRUE` to include monitors for linked accounts in a list
     * of monitors, when you've set up cross-account sharing in Internet Monitor.
     *
     * You configure cross-account sharing by using Amazon CloudWatch Observability Access Manager.
     * For more information, see [Internet Monitor cross-account
     * observability](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cwim-cross-account.html)
     * in the Amazon CloudWatch User Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-includelinkedaccounts)
     * @param includeLinkedAccounts A boolean option that you can set to `TRUE` to include monitors
     * for linked accounts in a list of monitors, when you've set up cross-account sharing in Internet
     * Monitor. 
     */
    override fun includeLinkedAccounts(includeLinkedAccounts: Boolean) {
      cdkBuilder.includeLinkedAccounts(includeLinkedAccounts)
    }

    /**
     * A boolean option that you can set to `TRUE` to include monitors for linked accounts in a list
     * of monitors, when you've set up cross-account sharing in Internet Monitor.
     *
     * You configure cross-account sharing by using Amazon CloudWatch Observability Access Manager.
     * For more information, see [Internet Monitor cross-account
     * observability](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cwim-cross-account.html)
     * in the Amazon CloudWatch User Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-includelinkedaccounts)
     * @param includeLinkedAccounts A boolean option that you can set to `TRUE` to include monitors
     * for linked accounts in a list of monitors, when you've set up cross-account sharing in Internet
     * Monitor. 
     */
    override fun includeLinkedAccounts(includeLinkedAccounts: IResolvable) {
      cdkBuilder.includeLinkedAccounts(includeLinkedAccounts.let(IResolvable::unwrap))
    }

    /**
     * Publish internet measurements for a monitor for all city-networks (up to the 500,000 service
     * limit) to another location, such as an Amazon S3 bucket.
     *
     * Measurements are also published to Amazon CloudWatch Logs for the first 500 (by traffic
     * volume) city-networks (client locations and ASNs, typically internet service providers or ISPs).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-internetmeasurementslogdelivery)
     * @param internetMeasurementsLogDelivery Publish internet measurements for a monitor for all
     * city-networks (up to the 500,000 service limit) to another location, such as an Amazon S3
     * bucket. 
     */
    override fun internetMeasurementsLogDelivery(internetMeasurementsLogDelivery: IResolvable) {
      cdkBuilder.internetMeasurementsLogDelivery(internetMeasurementsLogDelivery.let(IResolvable::unwrap))
    }

    /**
     * Publish internet measurements for a monitor for all city-networks (up to the 500,000 service
     * limit) to another location, such as an Amazon S3 bucket.
     *
     * Measurements are also published to Amazon CloudWatch Logs for the first 500 (by traffic
     * volume) city-networks (client locations and ASNs, typically internet service providers or ISPs).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-internetmeasurementslogdelivery)
     * @param internetMeasurementsLogDelivery Publish internet measurements for a monitor for all
     * city-networks (up to the 500,000 service limit) to another location, such as an Amazon S3
     * bucket. 
     */
    override
        fun internetMeasurementsLogDelivery(internetMeasurementsLogDelivery: InternetMeasurementsLogDeliveryProperty) {
      cdkBuilder.internetMeasurementsLogDelivery(internetMeasurementsLogDelivery.let(InternetMeasurementsLogDeliveryProperty::unwrap))
    }

    /**
     * Publish internet measurements for a monitor for all city-networks (up to the 500,000 service
     * limit) to another location, such as an Amazon S3 bucket.
     *
     * Measurements are also published to Amazon CloudWatch Logs for the first 500 (by traffic
     * volume) city-networks (client locations and ASNs, typically internet service providers or ISPs).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-internetmeasurementslogdelivery)
     * @param internetMeasurementsLogDelivery Publish internet measurements for a monitor for all
     * city-networks (up to the 500,000 service limit) to another location, such as an Amazon S3
     * bucket. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("89746903b7257412fcb57282231d673b152595e7bb530f29d5ff2306c6f9ec45")
    override
        fun internetMeasurementsLogDelivery(internetMeasurementsLogDelivery: InternetMeasurementsLogDeliveryProperty.Builder.() -> Unit):
        Unit =
        internetMeasurementsLogDelivery(InternetMeasurementsLogDeliveryProperty(internetMeasurementsLogDelivery))

    /**
     * The account ID for an account that you've set up cross-account sharing for in Internet
     * Monitor.
     *
     * You configure cross-account sharing by using Amazon CloudWatch Observability Access Manager.
     * For more information, see [Internet Monitor cross-account
     * observability](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cwim-cross-account.html)
     * in the Amazon CloudWatch User Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-linkedaccountid)
     * @param linkedAccountId The account ID for an account that you've set up cross-account sharing
     * for in Internet Monitor. 
     */
    override fun linkedAccountId(linkedAccountId: String) {
      cdkBuilder.linkedAccountId(linkedAccountId)
    }

    /**
     * The maximum number of city-networks to monitor for your resources.
     *
     * A city-network is the location (city) where clients access your application resources from
     * and the network, such as an internet service provider, that clients access the resources
     * through.
     *
     * For more information, see [Choosing a city-network maximum
     * value](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/IMCityNetworksMaximum.html)
     * in *Using Amazon CloudWatch Internet Monitor* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-maxcitynetworkstomonitor)
     * @param maxCityNetworksToMonitor The maximum number of city-networks to monitor for your
     * resources. 
     */
    override fun maxCityNetworksToMonitor(maxCityNetworksToMonitor: Number) {
      cdkBuilder.maxCityNetworksToMonitor(maxCityNetworksToMonitor)
    }

    /**
     * The name of the monitor.
     *
     * A monitor name can contain only alphanumeric characters, dashes (-), periods (.), and
     * underscores (_).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-monitorname)
     * @param monitorName The name of the monitor. 
     */
    override fun monitorName(monitorName: String) {
      cdkBuilder.monitorName(monitorName)
    }

    /**
     * The resources that have been added for the monitor, listed by their Amazon Resource Names
     * (ARNs).
     *
     * Use this option to add or remove resources when making an update.
     *
     *
     * Be aware that if you include content in the `Resources` field when you update a monitor, the
     * `ResourcesToAdd` and `ResourcesToRemove` fields must be empty.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-resources)
     * @param resources The resources that have been added for the monitor, listed by their Amazon
     * Resource Names (ARNs). 
     */
    override fun resources(resources: List<String>) {
      cdkBuilder.resources(resources)
    }

    /**
     * The resources that have been added for the monitor, listed by their Amazon Resource Names
     * (ARNs).
     *
     * Use this option to add or remove resources when making an update.
     *
     *
     * Be aware that if you include content in the `Resources` field when you update a monitor, the
     * `ResourcesToAdd` and `ResourcesToRemove` fields must be empty.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-resources)
     * @param resources The resources that have been added for the monitor, listed by their Amazon
     * Resource Names (ARNs). 
     */
    override fun resources(vararg resources: String): Unit = resources(resources.toList())

    /**
     * The resources to include in a monitor, which you provide as a set of Amazon Resource Names
     * (ARNs).
     *
     * Resources can be Amazon Virtual Private Cloud VPCs, Network Load Balancers (NLBs), Amazon
     * CloudFront distributions, or Amazon WorkSpaces directories.
     *
     * You can add a combination of VPCs and CloudFront distributions, or you can add WorkSpaces
     * directories, or you can add NLBs. You can't add NLBs or WorkSpaces directories together with any
     * other resources.
     *
     * If you add only VPC resources, at least one VPC must have an Internet Gateway attached to it,
     * to make sure that it has internet connectivity.
     *
     *
     * You can specify this field for a monitor update only if the `Resources` field is empty.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-resourcestoadd)
     * @param resourcesToAdd The resources to include in a monitor, which you provide as a set of
     * Amazon Resource Names (ARNs). 
     */
    override fun resourcesToAdd(resourcesToAdd: List<String>) {
      cdkBuilder.resourcesToAdd(resourcesToAdd)
    }

    /**
     * The resources to include in a monitor, which you provide as a set of Amazon Resource Names
     * (ARNs).
     *
     * Resources can be Amazon Virtual Private Cloud VPCs, Network Load Balancers (NLBs), Amazon
     * CloudFront distributions, or Amazon WorkSpaces directories.
     *
     * You can add a combination of VPCs and CloudFront distributions, or you can add WorkSpaces
     * directories, or you can add NLBs. You can't add NLBs or WorkSpaces directories together with any
     * other resources.
     *
     * If you add only VPC resources, at least one VPC must have an Internet Gateway attached to it,
     * to make sure that it has internet connectivity.
     *
     *
     * You can specify this field for a monitor update only if the `Resources` field is empty.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-resourcestoadd)
     * @param resourcesToAdd The resources to include in a monitor, which you provide as a set of
     * Amazon Resource Names (ARNs). 
     */
    override fun resourcesToAdd(vararg resourcesToAdd: String): Unit =
        resourcesToAdd(resourcesToAdd.toList())

    /**
     * The resources to remove from a monitor, which you provide as a set of Amazon Resource Names
     * (ARNs).
     *
     *
     * You can specify this field for a monitor update only if the `Resources` field is empty.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-resourcestoremove)
     * @param resourcesToRemove The resources to remove from a monitor, which you provide as a set
     * of Amazon Resource Names (ARNs). 
     */
    override fun resourcesToRemove(resourcesToRemove: List<String>) {
      cdkBuilder.resourcesToRemove(resourcesToRemove)
    }

    /**
     * The resources to remove from a monitor, which you provide as a set of Amazon Resource Names
     * (ARNs).
     *
     *
     * You can specify this field for a monitor update only if the `Resources` field is empty.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-resourcestoremove)
     * @param resourcesToRemove The resources to remove from a monitor, which you provide as a set
     * of Amazon Resource Names (ARNs). 
     */
    override fun resourcesToRemove(vararg resourcesToRemove: String): Unit =
        resourcesToRemove(resourcesToRemove.toList())

    /**
     * The status of a monitor.
     *
     * The accepted values that you can specify for `Status` are `ACTIVE` and `INACTIVE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-status)
     * @param status The status of a monitor. 
     */
    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    /**
     * The tags for a monitor, listed as a set of *key:value* pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-tags)
     * @param tags The tags for a monitor, listed as a set of *key:value* pairs. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags for a monitor, listed as a set of *key:value* pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-tags)
     * @param tags The tags for a monitor, listed as a set of *key:value* pairs. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The percentage of the internet-facing traffic for your application that you want to monitor.
     *
     * You can also, optionally, set a limit for the number of city-networks (client locations and
     * ASNs, typically internet service providers) that Internet Monitor will monitor traffic for. The
     * city-networks maximum limit caps the number of city-networks that Internet Monitor monitors for
     * your application, regardless of the percentage of traffic that you choose to monitor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-trafficpercentagetomonitor)
     * @param trafficPercentageToMonitor The percentage of the internet-facing traffic for your
     * application that you want to monitor. 
     */
    override fun trafficPercentageToMonitor(trafficPercentageToMonitor: Number) {
      cdkBuilder.trafficPercentageToMonitor(trafficPercentageToMonitor)
    }

    public fun build(): software.amazon.awscdk.services.internetmonitor.CfnMonitor =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.internetmonitor.CfnMonitor.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMonitor {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMonitor(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.internetmonitor.CfnMonitor):
        CfnMonitor = CfnMonitor(cdkObject)

    internal fun unwrap(wrapped: CfnMonitor):
        software.amazon.awscdk.services.internetmonitor.CfnMonitor = wrapped.cdkObject as
        software.amazon.awscdk.services.internetmonitor.CfnMonitor
  }

  /**
   * Define the health event threshold percentages for the performance score and availability score
   * for your application's monitor.
   *
   * Amazon CloudWatch Internet Monitor creates a health event when there's an internet issue that
   * affects your application end users where a health score percentage is at or below a set threshold.
   *
   * If you don't set a health event threshold, the default value is 95%.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.internetmonitor.*;
   * HealthEventsConfigProperty healthEventsConfigProperty = HealthEventsConfigProperty.builder()
   * .availabilityLocalHealthEventsConfig(LocalHealthEventsConfigProperty.builder()
   * .healthScoreThreshold(123)
   * .minTrafficImpact(123)
   * .status("status")
   * .build())
   * .availabilityScoreThreshold(123)
   * .performanceLocalHealthEventsConfig(LocalHealthEventsConfigProperty.builder()
   * .healthScoreThreshold(123)
   * .minTrafficImpact(123)
   * .status("status")
   * .build())
   * .performanceScoreThreshold(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-internetmonitor-monitor-healtheventsconfig.html)
   */
  public interface HealthEventsConfigProperty {
    /**
     * The configuration that determines the threshold and other conditions for when Internet
     * Monitor creates a health event for a local availability issue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-internetmonitor-monitor-healtheventsconfig.html#cfn-internetmonitor-monitor-healtheventsconfig-availabilitylocalhealtheventsconfig)
     */
    public fun availabilityLocalHealthEventsConfig(): Any? =
        unwrap(this).getAvailabilityLocalHealthEventsConfig()

    /**
     * The health event threshold percentage set for availability scores.
     *
     * When the overall availability score is at or below this percentage, Internet Monitor creates
     * a health event.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-internetmonitor-monitor-healtheventsconfig.html#cfn-internetmonitor-monitor-healtheventsconfig-availabilityscorethreshold)
     */
    public fun availabilityScoreThreshold(): Number? = unwrap(this).getAvailabilityScoreThreshold()

    /**
     * The configuration that determines the threshold and other conditions for when Internet
     * Monitor creates a health event for a local performance issue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-internetmonitor-monitor-healtheventsconfig.html#cfn-internetmonitor-monitor-healtheventsconfig-performancelocalhealtheventsconfig)
     */
    public fun performanceLocalHealthEventsConfig(): Any? =
        unwrap(this).getPerformanceLocalHealthEventsConfig()

    /**
     * The health event threshold percentage set for performance scores.
     *
     * When the overall performance score is at or below this percentage, Internet Monitor creates a
     * health event.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-internetmonitor-monitor-healtheventsconfig.html#cfn-internetmonitor-monitor-healtheventsconfig-performancescorethreshold)
     */
    public fun performanceScoreThreshold(): Number? = unwrap(this).getPerformanceScoreThreshold()

    /**
     * A builder for [HealthEventsConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param availabilityLocalHealthEventsConfig The configuration that determines the threshold
       * and other conditions for when Internet Monitor creates a health event for a local availability
       * issue.
       */
      public
          fun availabilityLocalHealthEventsConfig(availabilityLocalHealthEventsConfig: IResolvable)

      /**
       * @param availabilityLocalHealthEventsConfig The configuration that determines the threshold
       * and other conditions for when Internet Monitor creates a health event for a local availability
       * issue.
       */
      public
          fun availabilityLocalHealthEventsConfig(availabilityLocalHealthEventsConfig: LocalHealthEventsConfigProperty)

      /**
       * @param availabilityLocalHealthEventsConfig The configuration that determines the threshold
       * and other conditions for when Internet Monitor creates a health event for a local availability
       * issue.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a0c13a3e98e1125fdec76581c1a10eeedb8810d4776780bca07934c54057722a")
      public
          fun availabilityLocalHealthEventsConfig(availabilityLocalHealthEventsConfig: LocalHealthEventsConfigProperty.Builder.() -> Unit)

      /**
       * @param availabilityScoreThreshold The health event threshold percentage set for
       * availability scores.
       * When the overall availability score is at or below this percentage, Internet Monitor
       * creates a health event.
       */
      public fun availabilityScoreThreshold(availabilityScoreThreshold: Number)

      /**
       * @param performanceLocalHealthEventsConfig The configuration that determines the threshold
       * and other conditions for when Internet Monitor creates a health event for a local performance
       * issue.
       */
      public fun performanceLocalHealthEventsConfig(performanceLocalHealthEventsConfig: IResolvable)

      /**
       * @param performanceLocalHealthEventsConfig The configuration that determines the threshold
       * and other conditions for when Internet Monitor creates a health event for a local performance
       * issue.
       */
      public
          fun performanceLocalHealthEventsConfig(performanceLocalHealthEventsConfig: LocalHealthEventsConfigProperty)

      /**
       * @param performanceLocalHealthEventsConfig The configuration that determines the threshold
       * and other conditions for when Internet Monitor creates a health event for a local performance
       * issue.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5b7de77bf4a936610dc8e6edc25a19431e452e7e7dc8d5e6f65e0501c938ead8")
      public
          fun performanceLocalHealthEventsConfig(performanceLocalHealthEventsConfig: LocalHealthEventsConfigProperty.Builder.() -> Unit)

      /**
       * @param performanceScoreThreshold The health event threshold percentage set for performance
       * scores.
       * When the overall performance score is at or below this percentage, Internet Monitor creates
       * a health event.
       */
      public fun performanceScoreThreshold(performanceScoreThreshold: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.internetmonitor.CfnMonitor.HealthEventsConfigProperty.Builder
          =
          software.amazon.awscdk.services.internetmonitor.CfnMonitor.HealthEventsConfigProperty.builder()

      /**
       * @param availabilityLocalHealthEventsConfig The configuration that determines the threshold
       * and other conditions for when Internet Monitor creates a health event for a local availability
       * issue.
       */
      override
          fun availabilityLocalHealthEventsConfig(availabilityLocalHealthEventsConfig: IResolvable) {
        cdkBuilder.availabilityLocalHealthEventsConfig(availabilityLocalHealthEventsConfig.let(IResolvable::unwrap))
      }

      /**
       * @param availabilityLocalHealthEventsConfig The configuration that determines the threshold
       * and other conditions for when Internet Monitor creates a health event for a local availability
       * issue.
       */
      override
          fun availabilityLocalHealthEventsConfig(availabilityLocalHealthEventsConfig: LocalHealthEventsConfigProperty) {
        cdkBuilder.availabilityLocalHealthEventsConfig(availabilityLocalHealthEventsConfig.let(LocalHealthEventsConfigProperty::unwrap))
      }

      /**
       * @param availabilityLocalHealthEventsConfig The configuration that determines the threshold
       * and other conditions for when Internet Monitor creates a health event for a local availability
       * issue.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a0c13a3e98e1125fdec76581c1a10eeedb8810d4776780bca07934c54057722a")
      override
          fun availabilityLocalHealthEventsConfig(availabilityLocalHealthEventsConfig: LocalHealthEventsConfigProperty.Builder.() -> Unit):
          Unit =
          availabilityLocalHealthEventsConfig(LocalHealthEventsConfigProperty(availabilityLocalHealthEventsConfig))

      /**
       * @param availabilityScoreThreshold The health event threshold percentage set for
       * availability scores.
       * When the overall availability score is at or below this percentage, Internet Monitor
       * creates a health event.
       */
      override fun availabilityScoreThreshold(availabilityScoreThreshold: Number) {
        cdkBuilder.availabilityScoreThreshold(availabilityScoreThreshold)
      }

      /**
       * @param performanceLocalHealthEventsConfig The configuration that determines the threshold
       * and other conditions for when Internet Monitor creates a health event for a local performance
       * issue.
       */
      override
          fun performanceLocalHealthEventsConfig(performanceLocalHealthEventsConfig: IResolvable) {
        cdkBuilder.performanceLocalHealthEventsConfig(performanceLocalHealthEventsConfig.let(IResolvable::unwrap))
      }

      /**
       * @param performanceLocalHealthEventsConfig The configuration that determines the threshold
       * and other conditions for when Internet Monitor creates a health event for a local performance
       * issue.
       */
      override
          fun performanceLocalHealthEventsConfig(performanceLocalHealthEventsConfig: LocalHealthEventsConfigProperty) {
        cdkBuilder.performanceLocalHealthEventsConfig(performanceLocalHealthEventsConfig.let(LocalHealthEventsConfigProperty::unwrap))
      }

      /**
       * @param performanceLocalHealthEventsConfig The configuration that determines the threshold
       * and other conditions for when Internet Monitor creates a health event for a local performance
       * issue.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5b7de77bf4a936610dc8e6edc25a19431e452e7e7dc8d5e6f65e0501c938ead8")
      override
          fun performanceLocalHealthEventsConfig(performanceLocalHealthEventsConfig: LocalHealthEventsConfigProperty.Builder.() -> Unit):
          Unit =
          performanceLocalHealthEventsConfig(LocalHealthEventsConfigProperty(performanceLocalHealthEventsConfig))

      /**
       * @param performanceScoreThreshold The health event threshold percentage set for performance
       * scores.
       * When the overall performance score is at or below this percentage, Internet Monitor creates
       * a health event.
       */
      override fun performanceScoreThreshold(performanceScoreThreshold: Number) {
        cdkBuilder.performanceScoreThreshold(performanceScoreThreshold)
      }

      public fun build():
          software.amazon.awscdk.services.internetmonitor.CfnMonitor.HealthEventsConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.internetmonitor.CfnMonitor.HealthEventsConfigProperty,
    ) : CdkObject(cdkObject), HealthEventsConfigProperty {
      /**
       * The configuration that determines the threshold and other conditions for when Internet
       * Monitor creates a health event for a local availability issue.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-internetmonitor-monitor-healtheventsconfig.html#cfn-internetmonitor-monitor-healtheventsconfig-availabilitylocalhealtheventsconfig)
       */
      override fun availabilityLocalHealthEventsConfig(): Any? =
          unwrap(this).getAvailabilityLocalHealthEventsConfig()

      /**
       * The health event threshold percentage set for availability scores.
       *
       * When the overall availability score is at or below this percentage, Internet Monitor
       * creates a health event.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-internetmonitor-monitor-healtheventsconfig.html#cfn-internetmonitor-monitor-healtheventsconfig-availabilityscorethreshold)
       */
      override fun availabilityScoreThreshold(): Number? =
          unwrap(this).getAvailabilityScoreThreshold()

      /**
       * The configuration that determines the threshold and other conditions for when Internet
       * Monitor creates a health event for a local performance issue.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-internetmonitor-monitor-healtheventsconfig.html#cfn-internetmonitor-monitor-healtheventsconfig-performancelocalhealtheventsconfig)
       */
      override fun performanceLocalHealthEventsConfig(): Any? =
          unwrap(this).getPerformanceLocalHealthEventsConfig()

      /**
       * The health event threshold percentage set for performance scores.
       *
       * When the overall performance score is at or below this percentage, Internet Monitor creates
       * a health event.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-internetmonitor-monitor-healtheventsconfig.html#cfn-internetmonitor-monitor-healtheventsconfig-performancescorethreshold)
       */
      override fun performanceScoreThreshold(): Number? =
          unwrap(this).getPerformanceScoreThreshold()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HealthEventsConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.internetmonitor.CfnMonitor.HealthEventsConfigProperty):
          HealthEventsConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          HealthEventsConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: HealthEventsConfigProperty):
          software.amazon.awscdk.services.internetmonitor.CfnMonitor.HealthEventsConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.internetmonitor.CfnMonitor.HealthEventsConfigProperty
    }
  }

  /**
   * Publish internet measurements to an Amazon S3 bucket in addition to CloudWatch Logs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.internetmonitor.*;
   * InternetMeasurementsLogDeliveryProperty internetMeasurementsLogDeliveryProperty =
   * InternetMeasurementsLogDeliveryProperty.builder()
   * .s3Config(S3ConfigProperty.builder()
   * .bucketName("bucketName")
   * .bucketPrefix("bucketPrefix")
   * .logDeliveryStatus("logDeliveryStatus")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-internetmonitor-monitor-internetmeasurementslogdelivery.html)
   */
  public interface InternetMeasurementsLogDeliveryProperty {
    /**
     * The configuration for publishing Amazon CloudWatch Internet Monitor internet measurements to
     * Amazon S3.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-internetmonitor-monitor-internetmeasurementslogdelivery.html#cfn-internetmonitor-monitor-internetmeasurementslogdelivery-s3config)
     */
    public fun s3Config(): Any? = unwrap(this).getS3Config()

    /**
     * A builder for [InternetMeasurementsLogDeliveryProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param s3Config The configuration for publishing Amazon CloudWatch Internet Monitor
       * internet measurements to Amazon S3.
       */
      public fun s3Config(s3Config: IResolvable)

      /**
       * @param s3Config The configuration for publishing Amazon CloudWatch Internet Monitor
       * internet measurements to Amazon S3.
       */
      public fun s3Config(s3Config: S3ConfigProperty)

      /**
       * @param s3Config The configuration for publishing Amazon CloudWatch Internet Monitor
       * internet measurements to Amazon S3.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("806473c078150cff44843a2e841fd644c6433b21ed4a82bf9c18f8bc71440ce7")
      public fun s3Config(s3Config: S3ConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.internetmonitor.CfnMonitor.InternetMeasurementsLogDeliveryProperty.Builder
          =
          software.amazon.awscdk.services.internetmonitor.CfnMonitor.InternetMeasurementsLogDeliveryProperty.builder()

      /**
       * @param s3Config The configuration for publishing Amazon CloudWatch Internet Monitor
       * internet measurements to Amazon S3.
       */
      override fun s3Config(s3Config: IResolvable) {
        cdkBuilder.s3Config(s3Config.let(IResolvable::unwrap))
      }

      /**
       * @param s3Config The configuration for publishing Amazon CloudWatch Internet Monitor
       * internet measurements to Amazon S3.
       */
      override fun s3Config(s3Config: S3ConfigProperty) {
        cdkBuilder.s3Config(s3Config.let(S3ConfigProperty::unwrap))
      }

      /**
       * @param s3Config The configuration for publishing Amazon CloudWatch Internet Monitor
       * internet measurements to Amazon S3.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("806473c078150cff44843a2e841fd644c6433b21ed4a82bf9c18f8bc71440ce7")
      override fun s3Config(s3Config: S3ConfigProperty.Builder.() -> Unit): Unit =
          s3Config(S3ConfigProperty(s3Config))

      public fun build():
          software.amazon.awscdk.services.internetmonitor.CfnMonitor.InternetMeasurementsLogDeliveryProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.internetmonitor.CfnMonitor.InternetMeasurementsLogDeliveryProperty,
    ) : CdkObject(cdkObject), InternetMeasurementsLogDeliveryProperty {
      /**
       * The configuration for publishing Amazon CloudWatch Internet Monitor internet measurements
       * to Amazon S3.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-internetmonitor-monitor-internetmeasurementslogdelivery.html#cfn-internetmonitor-monitor-internetmeasurementslogdelivery-s3config)
       */
      override fun s3Config(): Any? = unwrap(this).getS3Config()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          InternetMeasurementsLogDeliveryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.internetmonitor.CfnMonitor.InternetMeasurementsLogDeliveryProperty):
          InternetMeasurementsLogDeliveryProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InternetMeasurementsLogDeliveryProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InternetMeasurementsLogDeliveryProperty):
          software.amazon.awscdk.services.internetmonitor.CfnMonitor.InternetMeasurementsLogDeliveryProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.internetmonitor.CfnMonitor.InternetMeasurementsLogDeliveryProperty
    }
  }

  /**
   * Configuration information that determines the threshold and other conditions for when Internet
   * Monitor creates a health event for a local performance or availability issue, when scores cross a
   * threshold for one or more city-networks.
   *
   * Defines the percentages, for performance scores or availability scores, that are the local
   * thresholds for when Amazon CloudWatch Internet Monitor creates a health event. Also defines
   * whether a local threshold is enabled or disabled, and the minimum percentage of overall traffic
   * that must be impacted by an issue before Internet Monitor creates an event when a	threshold is
   * crossed for a local health score.
   *
   * If you don't set a local health event threshold, the default value is 60%.
   *
   * For more information, see [Change health event
   * thresholds](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-overview.html#IMUpdateThresholdFromOverview)
   * in the Internet Monitor section of the *Amazon CloudWatch User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.internetmonitor.*;
   * LocalHealthEventsConfigProperty localHealthEventsConfigProperty =
   * LocalHealthEventsConfigProperty.builder()
   * .healthScoreThreshold(123)
   * .minTrafficImpact(123)
   * .status("status")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-internetmonitor-monitor-localhealtheventsconfig.html)
   */
  public interface LocalHealthEventsConfigProperty {
    /**
     * The health event threshold percentage set for a local health score.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-internetmonitor-monitor-localhealtheventsconfig.html#cfn-internetmonitor-monitor-localhealtheventsconfig-healthscorethreshold)
     */
    public fun healthScoreThreshold(): Number? = unwrap(this).getHealthScoreThreshold()

    /**
     * The minimum percentage of overall traffic for an application that must be impacted by an
     * issue before Internet Monitor creates an event when a threshold is crossed for a local health
     * score.
     *
     * If you don't set a minimum traffic impact threshold, the default value is 0.01%.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-internetmonitor-monitor-localhealtheventsconfig.html#cfn-internetmonitor-monitor-localhealtheventsconfig-mintrafficimpact)
     */
    public fun minTrafficImpact(): Number? = unwrap(this).getMinTrafficImpact()

    /**
     * The status of whether Internet Monitor creates a health event based on a threshold percentage
     * set for a local health score.
     *
     * The status can be `ENABLED` or `DISABLED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-internetmonitor-monitor-localhealtheventsconfig.html#cfn-internetmonitor-monitor-localhealtheventsconfig-status)
     */
    public fun status(): String? = unwrap(this).getStatus()

    /**
     * A builder for [LocalHealthEventsConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param healthScoreThreshold The health event threshold percentage set for a local health
       * score.
       */
      public fun healthScoreThreshold(healthScoreThreshold: Number)

      /**
       * @param minTrafficImpact The minimum percentage of overall traffic for an application that
       * must be impacted by an issue before Internet Monitor creates an event when a threshold is
       * crossed for a local health score.
       * If you don't set a minimum traffic impact threshold, the default value is 0.01%.
       */
      public fun minTrafficImpact(minTrafficImpact: Number)

      /**
       * @param status The status of whether Internet Monitor creates a health event based on a
       * threshold percentage set for a local health score.
       * The status can be `ENABLED` or `DISABLED` .
       */
      public fun status(status: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.internetmonitor.CfnMonitor.LocalHealthEventsConfigProperty.Builder
          =
          software.amazon.awscdk.services.internetmonitor.CfnMonitor.LocalHealthEventsConfigProperty.builder()

      /**
       * @param healthScoreThreshold The health event threshold percentage set for a local health
       * score.
       */
      override fun healthScoreThreshold(healthScoreThreshold: Number) {
        cdkBuilder.healthScoreThreshold(healthScoreThreshold)
      }

      /**
       * @param minTrafficImpact The minimum percentage of overall traffic for an application that
       * must be impacted by an issue before Internet Monitor creates an event when a threshold is
       * crossed for a local health score.
       * If you don't set a minimum traffic impact threshold, the default value is 0.01%.
       */
      override fun minTrafficImpact(minTrafficImpact: Number) {
        cdkBuilder.minTrafficImpact(minTrafficImpact)
      }

      /**
       * @param status The status of whether Internet Monitor creates a health event based on a
       * threshold percentage set for a local health score.
       * The status can be `ENABLED` or `DISABLED` .
       */
      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      public fun build():
          software.amazon.awscdk.services.internetmonitor.CfnMonitor.LocalHealthEventsConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.internetmonitor.CfnMonitor.LocalHealthEventsConfigProperty,
    ) : CdkObject(cdkObject), LocalHealthEventsConfigProperty {
      /**
       * The health event threshold percentage set for a local health score.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-internetmonitor-monitor-localhealtheventsconfig.html#cfn-internetmonitor-monitor-localhealtheventsconfig-healthscorethreshold)
       */
      override fun healthScoreThreshold(): Number? = unwrap(this).getHealthScoreThreshold()

      /**
       * The minimum percentage of overall traffic for an application that must be impacted by an
       * issue before Internet Monitor creates an event when a threshold is crossed for a local health
       * score.
       *
       * If you don't set a minimum traffic impact threshold, the default value is 0.01%.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-internetmonitor-monitor-localhealtheventsconfig.html#cfn-internetmonitor-monitor-localhealtheventsconfig-mintrafficimpact)
       */
      override fun minTrafficImpact(): Number? = unwrap(this).getMinTrafficImpact()

      /**
       * The status of whether Internet Monitor creates a health event based on a threshold
       * percentage set for a local health score.
       *
       * The status can be `ENABLED` or `DISABLED` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-internetmonitor-monitor-localhealtheventsconfig.html#cfn-internetmonitor-monitor-localhealtheventsconfig-status)
       */
      override fun status(): String? = unwrap(this).getStatus()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LocalHealthEventsConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.internetmonitor.CfnMonitor.LocalHealthEventsConfigProperty):
          LocalHealthEventsConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          LocalHealthEventsConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LocalHealthEventsConfigProperty):
          software.amazon.awscdk.services.internetmonitor.CfnMonitor.LocalHealthEventsConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.internetmonitor.CfnMonitor.LocalHealthEventsConfigProperty
    }
  }

  /**
   * The configuration for publishing Amazon CloudWatch Internet Monitor internet measurements to
   * Amazon S3.
   *
   * The configuration includes the bucket name and (optionally) bucket prefix for the S3 bucket to
   * store the measurements, and the delivery status. The delivery status is `ENABLED` if you choose to
   * deliver internet measurements to S3 logs, and `DISABLED` otherwise.
   *
   * The measurements are also published to Amazon CloudWatch Logs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.internetmonitor.*;
   * S3ConfigProperty s3ConfigProperty = S3ConfigProperty.builder()
   * .bucketName("bucketName")
   * .bucketPrefix("bucketPrefix")
   * .logDeliveryStatus("logDeliveryStatus")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-internetmonitor-monitor-s3config.html)
   */
  public interface S3ConfigProperty {
    /**
     * The Amazon S3 bucket name for internet measurements publishing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-internetmonitor-monitor-s3config.html#cfn-internetmonitor-monitor-s3config-bucketname)
     */
    public fun bucketName(): String? = unwrap(this).getBucketName()

    /**
     * An optional Amazon S3 bucket prefix for internet measurements publishing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-internetmonitor-monitor-s3config.html#cfn-internetmonitor-monitor-s3config-bucketprefix)
     */
    public fun bucketPrefix(): String? = unwrap(this).getBucketPrefix()

    /**
     * The status of publishing Internet Monitor internet measurements to an Amazon S3 bucket.
     *
     * The delivery status is `ENABLED` if you choose to deliver internet measurements to an S3
     * bucket, and `DISABLED` otherwise.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-internetmonitor-monitor-s3config.html#cfn-internetmonitor-monitor-s3config-logdeliverystatus)
     */
    public fun logDeliveryStatus(): String? = unwrap(this).getLogDeliveryStatus()

    /**
     * A builder for [S3ConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucketName The Amazon S3 bucket name for internet measurements publishing.
       */
      public fun bucketName(bucketName: String)

      /**
       * @param bucketPrefix An optional Amazon S3 bucket prefix for internet measurements
       * publishing.
       */
      public fun bucketPrefix(bucketPrefix: String)

      /**
       * @param logDeliveryStatus The status of publishing Internet Monitor internet measurements to
       * an Amazon S3 bucket.
       * The delivery status is `ENABLED` if you choose to deliver internet measurements to an S3
       * bucket, and `DISABLED` otherwise.
       */
      public fun logDeliveryStatus(logDeliveryStatus: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.internetmonitor.CfnMonitor.S3ConfigProperty.Builder =
          software.amazon.awscdk.services.internetmonitor.CfnMonitor.S3ConfigProperty.builder()

      /**
       * @param bucketName The Amazon S3 bucket name for internet measurements publishing.
       */
      override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      /**
       * @param bucketPrefix An optional Amazon S3 bucket prefix for internet measurements
       * publishing.
       */
      override fun bucketPrefix(bucketPrefix: String) {
        cdkBuilder.bucketPrefix(bucketPrefix)
      }

      /**
       * @param logDeliveryStatus The status of publishing Internet Monitor internet measurements to
       * an Amazon S3 bucket.
       * The delivery status is `ENABLED` if you choose to deliver internet measurements to an S3
       * bucket, and `DISABLED` otherwise.
       */
      override fun logDeliveryStatus(logDeliveryStatus: String) {
        cdkBuilder.logDeliveryStatus(logDeliveryStatus)
      }

      public fun build():
          software.amazon.awscdk.services.internetmonitor.CfnMonitor.S3ConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.internetmonitor.CfnMonitor.S3ConfigProperty,
    ) : CdkObject(cdkObject), S3ConfigProperty {
      /**
       * The Amazon S3 bucket name for internet measurements publishing.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-internetmonitor-monitor-s3config.html#cfn-internetmonitor-monitor-s3config-bucketname)
       */
      override fun bucketName(): String? = unwrap(this).getBucketName()

      /**
       * An optional Amazon S3 bucket prefix for internet measurements publishing.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-internetmonitor-monitor-s3config.html#cfn-internetmonitor-monitor-s3config-bucketprefix)
       */
      override fun bucketPrefix(): String? = unwrap(this).getBucketPrefix()

      /**
       * The status of publishing Internet Monitor internet measurements to an Amazon S3 bucket.
       *
       * The delivery status is `ENABLED` if you choose to deliver internet measurements to an S3
       * bucket, and `DISABLED` otherwise.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-internetmonitor-monitor-s3config.html#cfn-internetmonitor-monitor-s3config-logdeliverystatus)
       */
      override fun logDeliveryStatus(): String? = unwrap(this).getLogDeliveryStatus()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3ConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.internetmonitor.CfnMonitor.S3ConfigProperty):
          S3ConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? S3ConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3ConfigProperty):
          software.amazon.awscdk.services.internetmonitor.CfnMonitor.S3ConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.internetmonitor.CfnMonitor.S3ConfigProperty
    }
  }
}
