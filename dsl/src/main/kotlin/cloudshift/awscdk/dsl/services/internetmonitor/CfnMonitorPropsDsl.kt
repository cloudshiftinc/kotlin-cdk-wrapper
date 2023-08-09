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

package cloudshift.awscdk.dsl.services.internetmonitor

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.internetmonitor.CfnMonitor
import software.amazon.awscdk.services.internetmonitor.CfnMonitorProps

/**
 * Properties for defining a `CfnMonitor`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.internetmonitor.*;
 * CfnMonitorProps cfnMonitorProps = CfnMonitorProps.builder()
 * .monitorName("monitorName")
 * // the properties below are optional
 * .healthEventsConfig(HealthEventsConfigProperty.builder()
 * .availabilityScoreThreshold(123)
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
@CdkDslMarker
public class CfnMonitorPropsDsl {
    private val cdkBuilder: CfnMonitorProps.Builder = CfnMonitorProps.builder()

    private val _resources: MutableList<String> = mutableListOf()

    private val _resourcesToAdd: MutableList<String> = mutableListOf()

    private val _resourcesToRemove: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param healthEventsConfig the value to be set. */
    public fun healthEventsConfig(healthEventsConfig: IResolvable) {
        cdkBuilder.healthEventsConfig(healthEventsConfig)
    }

    /** @param healthEventsConfig the value to be set. */
    public fun healthEventsConfig(healthEventsConfig: CfnMonitor.HealthEventsConfigProperty) {
        cdkBuilder.healthEventsConfig(healthEventsConfig)
    }

    /**
     * @param internetMeasurementsLogDelivery Publish internet measurements for a monitor for all
     *   city-networks (up to the 500,000 service limit) to another location, such as an Amazon S3
     *   bucket. Measurements are also published to Amazon CloudWatch Logs for the first 500 (by
     *   traffic volume) city-networks (client locations and ASNs, typically internet service
     *   providers or ISPs).
     */
    public fun internetMeasurementsLogDelivery(internetMeasurementsLogDelivery: IResolvable) {
        cdkBuilder.internetMeasurementsLogDelivery(internetMeasurementsLogDelivery)
    }

    /**
     * @param internetMeasurementsLogDelivery Publish internet measurements for a monitor for all
     *   city-networks (up to the 500,000 service limit) to another location, such as an Amazon S3
     *   bucket. Measurements are also published to Amazon CloudWatch Logs for the first 500 (by
     *   traffic volume) city-networks (client locations and ASNs, typically internet service
     *   providers or ISPs).
     */
    public fun internetMeasurementsLogDelivery(
        internetMeasurementsLogDelivery: CfnMonitor.InternetMeasurementsLogDeliveryProperty
    ) {
        cdkBuilder.internetMeasurementsLogDelivery(internetMeasurementsLogDelivery)
    }

    /**
     * @param maxCityNetworksToMonitor The maximum number of city-networks to monitor for your
     *   resources. A city-network is the location (city) where clients access your application
     *   resources from and the network, such as an internet service provider, that clients access
     *   the resources through.
     *
     * For more information, see
     * [Choosing a city-network maximum value](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/IMCityNetworksMaximum.html)
     * in *Using Amazon CloudWatch Internet Monitor* .
     */
    public fun maxCityNetworksToMonitor(maxCityNetworksToMonitor: Number) {
        cdkBuilder.maxCityNetworksToMonitor(maxCityNetworksToMonitor)
    }

    /**
     * @param monitorName The name of the monitor. A monitor name can contain only alphanumeric
     *   characters, dashes (-), periods (.), and underscores (_).
     */
    public fun monitorName(monitorName: String) {
        cdkBuilder.monitorName(monitorName)
    }

    /**
     * @param resources The resources that have been added for the monitor, listed by their Amazon
     *   Resource Names (ARNs).
     */
    public fun resources(vararg resources: String) {
        _resources.addAll(listOf(*resources))
    }

    /**
     * @param resources The resources that have been added for the monitor, listed by their Amazon
     *   Resource Names (ARNs).
     */
    public fun resources(resources: Collection<String>) {
        _resources.addAll(resources)
    }

    /**
     * @param resourcesToAdd The resources to add to a monitor, which you provide as a set of Amazon
     *   Resource Names (ARNs). You can add a combination of Virtual Private Clouds (VPCs) and
     *   Amazon CloudFront distributions, or you can add Amazon WorkSpaces directories. You can't
     *   add all three types of resources.
     *
     * If you add only VPC resources, at least one VPC must have an Internet Gateway attached to it,
     * to make sure that it has internet connectivity.
     */
    public fun resourcesToAdd(vararg resourcesToAdd: String) {
        _resourcesToAdd.addAll(listOf(*resourcesToAdd))
    }

    /**
     * @param resourcesToAdd The resources to add to a monitor, which you provide as a set of Amazon
     *   Resource Names (ARNs). You can add a combination of Virtual Private Clouds (VPCs) and
     *   Amazon CloudFront distributions, or you can add Amazon WorkSpaces directories. You can't
     *   add all three types of resources.
     *
     * If you add only VPC resources, at least one VPC must have an Internet Gateway attached to it,
     * to make sure that it has internet connectivity.
     */
    public fun resourcesToAdd(resourcesToAdd: Collection<String>) {
        _resourcesToAdd.addAll(resourcesToAdd)
    }

    /**
     * @param resourcesToRemove The resources to remove from a monitor, which you provide as a set
     *   of Amazon Resource Names (ARNs).
     */
    public fun resourcesToRemove(vararg resourcesToRemove: String) {
        _resourcesToRemove.addAll(listOf(*resourcesToRemove))
    }

    /**
     * @param resourcesToRemove The resources to remove from a monitor, which you provide as a set
     *   of Amazon Resource Names (ARNs).
     */
    public fun resourcesToRemove(resourcesToRemove: Collection<String>) {
        _resourcesToRemove.addAll(resourcesToRemove)
    }

    /**
     * @param status The status of a monitor. The accepted values that you can specify for `Status`
     *   are `ACTIVE` and `INACTIVE` .
     */
    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    /** @param tags The tags for a monitor, listed as a set of *key:value* pairs. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags for a monitor, listed as a set of *key:value* pairs. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param trafficPercentageToMonitor The percentage of the internet-facing traffic for your
     *   application that you want to monitor. You can also, optionally, set a limit for the number
     *   of city-networks (client locations and ASNs, typically internet service providers) that
     *   Internet Monitor will monitor traffic for. The city-networks maximum limit caps the number
     *   of city-networks that Internet Monitor monitors for your application, regardless of the
     *   percentage of traffic that you choose to monitor.
     */
    public fun trafficPercentageToMonitor(trafficPercentageToMonitor: Number) {
        cdkBuilder.trafficPercentageToMonitor(trafficPercentageToMonitor)
    }

    public fun build(): CfnMonitorProps {
        if (_resources.isNotEmpty()) cdkBuilder.resources(_resources)
        if (_resourcesToAdd.isNotEmpty()) cdkBuilder.resourcesToAdd(_resourcesToAdd)
        if (_resourcesToRemove.isNotEmpty()) cdkBuilder.resourcesToRemove(_resourcesToRemove)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
