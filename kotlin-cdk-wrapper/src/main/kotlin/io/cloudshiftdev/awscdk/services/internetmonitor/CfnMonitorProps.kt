@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.internetmonitor

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnMonitor`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.internetmonitor.*;
 * CfnMonitorProps cfnMonitorProps = CfnMonitorProps.builder()
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
 * .internetMeasurementsLogDelivery(InternetMeasurementsLogDeliveryProperty.builder()
 * .s3Config(S3ConfigProperty.builder()
 * .bucketName("bucketName")
 * .bucketPrefix("bucketPrefix")
 * .logDeliveryStatus("logDeliveryStatus")
 * .build())
 * .build())
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
public interface CfnMonitorProps {
  /**
   * A complex type with the configuration information that determines the threshold and other
   * conditions for when Internet Monitor creates a health event for an overall performance or
   * availability issue, across an application's geographies.
   *
   * Defines the percentages, for overall performance scores and availability scores for an
   * application, that are the thresholds for when Amazon CloudWatch Internet Monitor creates a health
   * event. You can override the defaults to set a custom threshold for overall performance or
   * availability scores, or both.
   *
   * You can also set thresholds for local health scores,, where Internet Monitor creates a health
   * event when scores cross a threshold for one or more city-networks, in addition to creating an
   * event when an overall score crosses a threshold.
   *
   * If you don't set a health event threshold, the default value is 95%.
   *
   * For local thresholds, you also set a minimum percentage of overall traffic that is impacted by
   * an issue before Internet Monitor creates an event. In addition, you can disable local thresholds,
   * for performance scores, availability scores, or both.
   *
   * For more information, see [Change health event
   * thresholds](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-overview.html#IMUpdateThresholdFromOverview)
   * in the Internet Monitor section of the *CloudWatch User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-healtheventsconfig)
   */
  public fun healthEventsConfig(): Any? = unwrap(this).getHealthEventsConfig()

  /**
   * Publish internet measurements for a monitor for all city-networks (up to the 500,000 service
   * limit) to another location, such as an Amazon S3 bucket.
   *
   * Measurements are also published to Amazon CloudWatch Logs for the first 500 (by traffic volume)
   * city-networks (client locations and ASNs, typically internet service providers or ISPs).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-internetmeasurementslogdelivery)
   */
  public fun internetMeasurementsLogDelivery(): Any? =
      unwrap(this).getInternetMeasurementsLogDelivery()

  /**
   * The maximum number of city-networks to monitor for your resources.
   *
   * A city-network is the location (city) where clients access your application resources from and
   * the network, such as an internet service provider, that clients access the resources through.
   *
   * For more information, see [Choosing a city-network maximum
   * value](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/IMCityNetworksMaximum.html)
   * in *Using Amazon CloudWatch Internet Monitor* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-maxcitynetworkstomonitor)
   */
  public fun maxCityNetworksToMonitor(): Number? = unwrap(this).getMaxCityNetworksToMonitor()

  /**
   * The name of the monitor.
   *
   * A monitor name can contain only alphanumeric characters, dashes (-), periods (.), and
   * underscores (_).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-monitorname)
   */
  public fun monitorName(): String

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
   */
  public fun resources(): List<String> = unwrap(this).getResources() ?: emptyList()

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
   */
  public fun resourcesToAdd(): List<String> = unwrap(this).getResourcesToAdd() ?: emptyList()

  /**
   * The resources to remove from a monitor, which you provide as a set of Amazon Resource Names
   * (ARNs).
   *
   *
   * You can specify this field for a monitor update only if the `Resources` field is empty.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-resourcestoremove)
   */
  public fun resourcesToRemove(): List<String> = unwrap(this).getResourcesToRemove() ?: emptyList()

  /**
   * The status of a monitor.
   *
   * The accepted values that you can specify for `Status` are `ACTIVE` and `INACTIVE` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-status)
   */
  public fun status(): String? = unwrap(this).getStatus()

  /**
   * The tags for a monitor, listed as a set of *key:value* pairs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The percentage of the internet-facing traffic for your application that you want to monitor.
   *
   * You can also, optionally, set a limit for the number of city-networks (client locations and
   * ASNs, typically internet service providers) that Internet Monitor will monitor traffic for. The
   * city-networks maximum limit caps the number of city-networks that Internet Monitor monitors for
   * your application, regardless of the percentage of traffic that you choose to monitor.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-trafficpercentagetomonitor)
   */
  public fun trafficPercentageToMonitor(): Number? = unwrap(this).getTrafficPercentageToMonitor()

  /**
   * A builder for [CfnMonitorProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param healthEventsConfig A complex type with the configuration information that determines
     * the threshold and other conditions for when Internet Monitor creates a health event for an
     * overall performance or availability issue, across an application's geographies.
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
     */
    public fun healthEventsConfig(healthEventsConfig: IResolvable)

    /**
     * @param healthEventsConfig A complex type with the configuration information that determines
     * the threshold and other conditions for when Internet Monitor creates a health event for an
     * overall performance or availability issue, across an application's geographies.
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
     */
    public fun healthEventsConfig(healthEventsConfig: CfnMonitor.HealthEventsConfigProperty)

    /**
     * @param healthEventsConfig A complex type with the configuration information that determines
     * the threshold and other conditions for when Internet Monitor creates a health event for an
     * overall performance or availability issue, across an application's geographies.
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
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("46ff596f361103841d28bae953539b377f998a672f8667a47215cee08bca811a")
    public
        fun healthEventsConfig(healthEventsConfig: CfnMonitor.HealthEventsConfigProperty.Builder.() -> Unit)

    /**
     * @param internetMeasurementsLogDelivery Publish internet measurements for a monitor for all
     * city-networks (up to the 500,000 service limit) to another location, such as an Amazon S3
     * bucket.
     * Measurements are also published to Amazon CloudWatch Logs for the first 500 (by traffic
     * volume) city-networks (client locations and ASNs, typically internet service providers or ISPs).
     */
    public fun internetMeasurementsLogDelivery(internetMeasurementsLogDelivery: IResolvable)

    /**
     * @param internetMeasurementsLogDelivery Publish internet measurements for a monitor for all
     * city-networks (up to the 500,000 service limit) to another location, such as an Amazon S3
     * bucket.
     * Measurements are also published to Amazon CloudWatch Logs for the first 500 (by traffic
     * volume) city-networks (client locations and ASNs, typically internet service providers or ISPs).
     */
    public
        fun internetMeasurementsLogDelivery(internetMeasurementsLogDelivery: CfnMonitor.InternetMeasurementsLogDeliveryProperty)

    /**
     * @param internetMeasurementsLogDelivery Publish internet measurements for a monitor for all
     * city-networks (up to the 500,000 service limit) to another location, such as an Amazon S3
     * bucket.
     * Measurements are also published to Amazon CloudWatch Logs for the first 500 (by traffic
     * volume) city-networks (client locations and ASNs, typically internet service providers or ISPs).
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("028392a41afcc5d121021085744808e7d08fd41be29a4986bada68513d04a167")
    public
        fun internetMeasurementsLogDelivery(internetMeasurementsLogDelivery: CfnMonitor.InternetMeasurementsLogDeliveryProperty.Builder.() -> Unit)

    /**
     * @param maxCityNetworksToMonitor The maximum number of city-networks to monitor for your
     * resources.
     * A city-network is the location (city) where clients access your application resources from
     * and the network, such as an internet service provider, that clients access the resources
     * through.
     *
     * For more information, see [Choosing a city-network maximum
     * value](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/IMCityNetworksMaximum.html)
     * in *Using Amazon CloudWatch Internet Monitor* .
     */
    public fun maxCityNetworksToMonitor(maxCityNetworksToMonitor: Number)

    /**
     * @param monitorName The name of the monitor. 
     * A monitor name can contain only alphanumeric characters, dashes (-), periods (.), and
     * underscores (_).
     */
    public fun monitorName(monitorName: String)

    /**
     * @param resources The resources that have been added for the monitor, listed by their Amazon
     * Resource Names (ARNs).
     * Use this option to add or remove resources when making an update.
     *
     *
     * Be aware that if you include content in the `Resources` field when you update a monitor, the
     * `ResourcesToAdd` and `ResourcesToRemove` fields must be empty.
     */
    public fun resources(resources: List<String>)

    /**
     * @param resources The resources that have been added for the monitor, listed by their Amazon
     * Resource Names (ARNs).
     * Use this option to add or remove resources when making an update.
     *
     *
     * Be aware that if you include content in the `Resources` field when you update a monitor, the
     * `ResourcesToAdd` and `ResourcesToRemove` fields must be empty.
     */
    public fun resources(vararg resources: String)

    /**
     * @param resourcesToAdd The resources to include in a monitor, which you provide as a set of
     * Amazon Resource Names (ARNs).
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
     */
    public fun resourcesToAdd(resourcesToAdd: List<String>)

    /**
     * @param resourcesToAdd The resources to include in a monitor, which you provide as a set of
     * Amazon Resource Names (ARNs).
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
     */
    public fun resourcesToAdd(vararg resourcesToAdd: String)

    /**
     * @param resourcesToRemove The resources to remove from a monitor, which you provide as a set
     * of Amazon Resource Names (ARNs).
     *
     * You can specify this field for a monitor update only if the `Resources` field is empty.
     */
    public fun resourcesToRemove(resourcesToRemove: List<String>)

    /**
     * @param resourcesToRemove The resources to remove from a monitor, which you provide as a set
     * of Amazon Resource Names (ARNs).
     *
     * You can specify this field for a monitor update only if the `Resources` field is empty.
     */
    public fun resourcesToRemove(vararg resourcesToRemove: String)

    /**
     * @param status The status of a monitor.
     * The accepted values that you can specify for `Status` are `ACTIVE` and `INACTIVE` .
     */
    public fun status(status: String)

    /**
     * @param tags The tags for a monitor, listed as a set of *key:value* pairs.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags for a monitor, listed as a set of *key:value* pairs.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param trafficPercentageToMonitor The percentage of the internet-facing traffic for your
     * application that you want to monitor.
     * You can also, optionally, set a limit for the number of city-networks (client locations and
     * ASNs, typically internet service providers) that Internet Monitor will monitor traffic for. The
     * city-networks maximum limit caps the number of city-networks that Internet Monitor monitors for
     * your application, regardless of the percentage of traffic that you choose to monitor.
     */
    public fun trafficPercentageToMonitor(trafficPercentageToMonitor: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.internetmonitor.CfnMonitorProps.Builder
        = software.amazon.awscdk.services.internetmonitor.CfnMonitorProps.builder()

    /**
     * @param healthEventsConfig A complex type with the configuration information that determines
     * the threshold and other conditions for when Internet Monitor creates a health event for an
     * overall performance or availability issue, across an application's geographies.
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
     */
    override fun healthEventsConfig(healthEventsConfig: IResolvable) {
      cdkBuilder.healthEventsConfig(healthEventsConfig.let(IResolvable::unwrap))
    }

    /**
     * @param healthEventsConfig A complex type with the configuration information that determines
     * the threshold and other conditions for when Internet Monitor creates a health event for an
     * overall performance or availability issue, across an application's geographies.
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
     */
    override fun healthEventsConfig(healthEventsConfig: CfnMonitor.HealthEventsConfigProperty) {
      cdkBuilder.healthEventsConfig(healthEventsConfig.let(CfnMonitor.HealthEventsConfigProperty::unwrap))
    }

    /**
     * @param healthEventsConfig A complex type with the configuration information that determines
     * the threshold and other conditions for when Internet Monitor creates a health event for an
     * overall performance or availability issue, across an application's geographies.
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
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("46ff596f361103841d28bae953539b377f998a672f8667a47215cee08bca811a")
    override
        fun healthEventsConfig(healthEventsConfig: CfnMonitor.HealthEventsConfigProperty.Builder.() -> Unit):
        Unit = healthEventsConfig(CfnMonitor.HealthEventsConfigProperty(healthEventsConfig))

    /**
     * @param internetMeasurementsLogDelivery Publish internet measurements for a monitor for all
     * city-networks (up to the 500,000 service limit) to another location, such as an Amazon S3
     * bucket.
     * Measurements are also published to Amazon CloudWatch Logs for the first 500 (by traffic
     * volume) city-networks (client locations and ASNs, typically internet service providers or ISPs).
     */
    override fun internetMeasurementsLogDelivery(internetMeasurementsLogDelivery: IResolvable) {
      cdkBuilder.internetMeasurementsLogDelivery(internetMeasurementsLogDelivery.let(IResolvable::unwrap))
    }

    /**
     * @param internetMeasurementsLogDelivery Publish internet measurements for a monitor for all
     * city-networks (up to the 500,000 service limit) to another location, such as an Amazon S3
     * bucket.
     * Measurements are also published to Amazon CloudWatch Logs for the first 500 (by traffic
     * volume) city-networks (client locations and ASNs, typically internet service providers or ISPs).
     */
    override
        fun internetMeasurementsLogDelivery(internetMeasurementsLogDelivery: CfnMonitor.InternetMeasurementsLogDeliveryProperty) {
      cdkBuilder.internetMeasurementsLogDelivery(internetMeasurementsLogDelivery.let(CfnMonitor.InternetMeasurementsLogDeliveryProperty::unwrap))
    }

    /**
     * @param internetMeasurementsLogDelivery Publish internet measurements for a monitor for all
     * city-networks (up to the 500,000 service limit) to another location, such as an Amazon S3
     * bucket.
     * Measurements are also published to Amazon CloudWatch Logs for the first 500 (by traffic
     * volume) city-networks (client locations and ASNs, typically internet service providers or ISPs).
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("028392a41afcc5d121021085744808e7d08fd41be29a4986bada68513d04a167")
    override
        fun internetMeasurementsLogDelivery(internetMeasurementsLogDelivery: CfnMonitor.InternetMeasurementsLogDeliveryProperty.Builder.() -> Unit):
        Unit =
        internetMeasurementsLogDelivery(CfnMonitor.InternetMeasurementsLogDeliveryProperty(internetMeasurementsLogDelivery))

    /**
     * @param maxCityNetworksToMonitor The maximum number of city-networks to monitor for your
     * resources.
     * A city-network is the location (city) where clients access your application resources from
     * and the network, such as an internet service provider, that clients access the resources
     * through.
     *
     * For more information, see [Choosing a city-network maximum
     * value](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/IMCityNetworksMaximum.html)
     * in *Using Amazon CloudWatch Internet Monitor* .
     */
    override fun maxCityNetworksToMonitor(maxCityNetworksToMonitor: Number) {
      cdkBuilder.maxCityNetworksToMonitor(maxCityNetworksToMonitor)
    }

    /**
     * @param monitorName The name of the monitor. 
     * A monitor name can contain only alphanumeric characters, dashes (-), periods (.), and
     * underscores (_).
     */
    override fun monitorName(monitorName: String) {
      cdkBuilder.monitorName(monitorName)
    }

    /**
     * @param resources The resources that have been added for the monitor, listed by their Amazon
     * Resource Names (ARNs).
     * Use this option to add or remove resources when making an update.
     *
     *
     * Be aware that if you include content in the `Resources` field when you update a monitor, the
     * `ResourcesToAdd` and `ResourcesToRemove` fields must be empty.
     */
    override fun resources(resources: List<String>) {
      cdkBuilder.resources(resources)
    }

    /**
     * @param resources The resources that have been added for the monitor, listed by their Amazon
     * Resource Names (ARNs).
     * Use this option to add or remove resources when making an update.
     *
     *
     * Be aware that if you include content in the `Resources` field when you update a monitor, the
     * `ResourcesToAdd` and `ResourcesToRemove` fields must be empty.
     */
    override fun resources(vararg resources: String): Unit = resources(resources.toList())

    /**
     * @param resourcesToAdd The resources to include in a monitor, which you provide as a set of
     * Amazon Resource Names (ARNs).
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
     */
    override fun resourcesToAdd(resourcesToAdd: List<String>) {
      cdkBuilder.resourcesToAdd(resourcesToAdd)
    }

    /**
     * @param resourcesToAdd The resources to include in a monitor, which you provide as a set of
     * Amazon Resource Names (ARNs).
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
     */
    override fun resourcesToAdd(vararg resourcesToAdd: String): Unit =
        resourcesToAdd(resourcesToAdd.toList())

    /**
     * @param resourcesToRemove The resources to remove from a monitor, which you provide as a set
     * of Amazon Resource Names (ARNs).
     *
     * You can specify this field for a monitor update only if the `Resources` field is empty.
     */
    override fun resourcesToRemove(resourcesToRemove: List<String>) {
      cdkBuilder.resourcesToRemove(resourcesToRemove)
    }

    /**
     * @param resourcesToRemove The resources to remove from a monitor, which you provide as a set
     * of Amazon Resource Names (ARNs).
     *
     * You can specify this field for a monitor update only if the `Resources` field is empty.
     */
    override fun resourcesToRemove(vararg resourcesToRemove: String): Unit =
        resourcesToRemove(resourcesToRemove.toList())

    /**
     * @param status The status of a monitor.
     * The accepted values that you can specify for `Status` are `ACTIVE` and `INACTIVE` .
     */
    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    /**
     * @param tags The tags for a monitor, listed as a set of *key:value* pairs.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags for a monitor, listed as a set of *key:value* pairs.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param trafficPercentageToMonitor The percentage of the internet-facing traffic for your
     * application that you want to monitor.
     * You can also, optionally, set a limit for the number of city-networks (client locations and
     * ASNs, typically internet service providers) that Internet Monitor will monitor traffic for. The
     * city-networks maximum limit caps the number of city-networks that Internet Monitor monitors for
     * your application, regardless of the percentage of traffic that you choose to monitor.
     */
    override fun trafficPercentageToMonitor(trafficPercentageToMonitor: Number) {
      cdkBuilder.trafficPercentageToMonitor(trafficPercentageToMonitor)
    }

    public fun build(): software.amazon.awscdk.services.internetmonitor.CfnMonitorProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.internetmonitor.CfnMonitorProps,
  ) : CdkObject(cdkObject), CfnMonitorProps {
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
     */
    override fun healthEventsConfig(): Any? = unwrap(this).getHealthEventsConfig()

    /**
     * Publish internet measurements for a monitor for all city-networks (up to the 500,000 service
     * limit) to another location, such as an Amazon S3 bucket.
     *
     * Measurements are also published to Amazon CloudWatch Logs for the first 500 (by traffic
     * volume) city-networks (client locations and ASNs, typically internet service providers or ISPs).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-internetmeasurementslogdelivery)
     */
    override fun internetMeasurementsLogDelivery(): Any? =
        unwrap(this).getInternetMeasurementsLogDelivery()

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
     */
    override fun maxCityNetworksToMonitor(): Number? = unwrap(this).getMaxCityNetworksToMonitor()

    /**
     * The name of the monitor.
     *
     * A monitor name can contain only alphanumeric characters, dashes (-), periods (.), and
     * underscores (_).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-monitorname)
     */
    override fun monitorName(): String = unwrap(this).getMonitorName()

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
     */
    override fun resources(): List<String> = unwrap(this).getResources() ?: emptyList()

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
     */
    override fun resourcesToAdd(): List<String> = unwrap(this).getResourcesToAdd() ?: emptyList()

    /**
     * The resources to remove from a monitor, which you provide as a set of Amazon Resource Names
     * (ARNs).
     *
     *
     * You can specify this field for a monitor update only if the `Resources` field is empty.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-resourcestoremove)
     */
    override fun resourcesToRemove(): List<String> = unwrap(this).getResourcesToRemove() ?:
        emptyList()

    /**
     * The status of a monitor.
     *
     * The accepted values that you can specify for `Status` are `ACTIVE` and `INACTIVE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-status)
     */
    override fun status(): String? = unwrap(this).getStatus()

    /**
     * The tags for a monitor, listed as a set of *key:value* pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The percentage of the internet-facing traffic for your application that you want to monitor.
     *
     * You can also, optionally, set a limit for the number of city-networks (client locations and
     * ASNs, typically internet service providers) that Internet Monitor will monitor traffic for. The
     * city-networks maximum limit caps the number of city-networks that Internet Monitor monitors for
     * your application, regardless of the percentage of traffic that you choose to monitor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html#cfn-internetmonitor-monitor-trafficpercentagetomonitor)
     */
    override fun trafficPercentageToMonitor(): Number? =
        unwrap(this).getTrafficPercentageToMonitor()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMonitorProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.internetmonitor.CfnMonitorProps):
        CfnMonitorProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMonitorProps):
        software.amazon.awscdk.services.internetmonitor.CfnMonitorProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.internetmonitor.CfnMonitorProps
  }
}
