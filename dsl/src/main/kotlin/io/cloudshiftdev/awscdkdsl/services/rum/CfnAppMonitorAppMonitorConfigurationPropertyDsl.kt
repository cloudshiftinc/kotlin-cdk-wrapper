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

package io.cloudshiftdev.awscdkdsl.services.rum

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.rum.CfnAppMonitor

/**
 * This structure contains much of the configuration data for the app monitor.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rum.*;
 * AppMonitorConfigurationProperty appMonitorConfigurationProperty =
 * AppMonitorConfigurationProperty.builder()
 * .allowCookies(false)
 * .enableXRay(false)
 * .excludedPages(List.of("excludedPages"))
 * .favoritePages(List.of("favoritePages"))
 * .guestRoleArn("guestRoleArn")
 * .identityPoolId("identityPoolId")
 * .includedPages(List.of("includedPages"))
 * .metricDestinations(List.of(MetricDestinationProperty.builder()
 * .destination("destination")
 * // the properties below are optional
 * .destinationArn("destinationArn")
 * .iamRoleArn("iamRoleArn")
 * .metricDefinitions(List.of(MetricDefinitionProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .dimensionKeys(Map.of(
 * "dimensionKeysKey", "dimensionKeys"))
 * .eventPattern("eventPattern")
 * .namespace("namespace")
 * .unitLabel("unitLabel")
 * .valueKey("valueKey")
 * .build()))
 * .build()))
 * .sessionSampleRate(123)
 * .telemetries(List.of("telemetries"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rum-appmonitor-appmonitorconfiguration.html)
 */
@CdkDslMarker
public class CfnAppMonitorAppMonitorConfigurationPropertyDsl {
    private val cdkBuilder: CfnAppMonitor.AppMonitorConfigurationProperty.Builder =
        CfnAppMonitor.AppMonitorConfigurationProperty.builder()

    private val _excludedPages: MutableList<String> = mutableListOf()

    private val _favoritePages: MutableList<String> = mutableListOf()

    private val _includedPages: MutableList<String> = mutableListOf()

    private val _metricDestinations: MutableList<Any> = mutableListOf()

    private val _telemetries: MutableList<String> = mutableListOf()

    /**
     * @param allowCookies If you set this to `true` , the CloudWatch RUM web client sets two
     *   cookies, a session cookie and a user cookie. The cookies allow the CloudWatch RUM web
     *   client to collect data relating to the number of users an application has and the behavior
     *   of the application across a sequence of events. Cookies are stored in the top-level domain
     *   of the current page.
     */
    public fun allowCookies(allowCookies: Boolean) {
        cdkBuilder.allowCookies(allowCookies)
    }

    /**
     * @param allowCookies If you set this to `true` , the CloudWatch RUM web client sets two
     *   cookies, a session cookie and a user cookie. The cookies allow the CloudWatch RUM web
     *   client to collect data relating to the number of users an application has and the behavior
     *   of the application across a sequence of events. Cookies are stored in the top-level domain
     *   of the current page.
     */
    public fun allowCookies(allowCookies: IResolvable) {
        cdkBuilder.allowCookies(allowCookies)
    }

    /**
     * @param enableXRay If you set this to `true` , CloudWatch RUM sends client-side traces to
     *   X-Ray for each sampled session. You can then see traces and segments from these user
     *   sessions in the RUM dashboard and the CloudWatch ServiceLens console. For more information,
     *   see [What is AWS X-Ray ?](https://docs.aws.amazon.com/xray/latest/devguide/aws-xray.html)
     */
    public fun enableXRay(enableXRay: Boolean) {
        cdkBuilder.enableXRay(enableXRay)
    }

    /**
     * @param enableXRay If you set this to `true` , CloudWatch RUM sends client-side traces to
     *   X-Ray for each sampled session. You can then see traces and segments from these user
     *   sessions in the RUM dashboard and the CloudWatch ServiceLens console. For more information,
     *   see [What is AWS X-Ray ?](https://docs.aws.amazon.com/xray/latest/devguide/aws-xray.html)
     */
    public fun enableXRay(enableXRay: IResolvable) {
        cdkBuilder.enableXRay(enableXRay)
    }

    /**
     * @param excludedPages A list of URLs in your website or application to exclude from RUM data
     *   collection. You can't include both `ExcludedPages` and `IncludedPages` in the same app
     *   monitor.
     */
    public fun excludedPages(vararg excludedPages: String) {
        _excludedPages.addAll(listOf(*excludedPages))
    }

    /**
     * @param excludedPages A list of URLs in your website or application to exclude from RUM data
     *   collection. You can't include both `ExcludedPages` and `IncludedPages` in the same app
     *   monitor.
     */
    public fun excludedPages(excludedPages: Collection<String>) {
        _excludedPages.addAll(excludedPages)
    }

    /**
     * @param favoritePages A list of pages in your application that are to be displayed with a
     *   "favorite" icon in the CloudWatch RUM console.
     */
    public fun favoritePages(vararg favoritePages: String) {
        _favoritePages.addAll(listOf(*favoritePages))
    }

    /**
     * @param favoritePages A list of pages in your application that are to be displayed with a
     *   "favorite" icon in the CloudWatch RUM console.
     */
    public fun favoritePages(favoritePages: Collection<String>) {
        _favoritePages.addAll(favoritePages)
    }

    /**
     * @param guestRoleArn The ARN of the guest IAM role that is attached to the Amazon Cognito
     *   identity pool that is used to authorize the sending of data to CloudWatch RUM.
     */
    public fun guestRoleArn(guestRoleArn: String) {
        cdkBuilder.guestRoleArn(guestRoleArn)
    }

    /**
     * @param identityPoolId The ID of the Amazon Cognito identity pool that is used to authorize
     *   the sending of data to CloudWatch RUM.
     */
    public fun identityPoolId(identityPoolId: String) {
        cdkBuilder.identityPoolId(identityPoolId)
    }

    /**
     * @param includedPages If this app monitor is to collect data from only certain pages in your
     *   application, this structure lists those pages. You can't include both `ExcludedPages` and
     *   `IncludedPages` in the same app monitor.
     */
    public fun includedPages(vararg includedPages: String) {
        _includedPages.addAll(listOf(*includedPages))
    }

    /**
     * @param includedPages If this app monitor is to collect data from only certain pages in your
     *   application, this structure lists those pages. You can't include both `ExcludedPages` and
     *   `IncludedPages` in the same app monitor.
     */
    public fun includedPages(includedPages: Collection<String>) {
        _includedPages.addAll(includedPages)
    }

    /**
     * @param metricDestinations An array of structures that each define a destination that this app
     *   monitor will send extended metrics to.
     */
    public fun metricDestinations(vararg metricDestinations: Any) {
        _metricDestinations.addAll(listOf(*metricDestinations))
    }

    /**
     * @param metricDestinations An array of structures that each define a destination that this app
     *   monitor will send extended metrics to.
     */
    public fun metricDestinations(metricDestinations: Collection<Any>) {
        _metricDestinations.addAll(metricDestinations)
    }

    /**
     * @param metricDestinations An array of structures that each define a destination that this app
     *   monitor will send extended metrics to.
     */
    public fun metricDestinations(metricDestinations: IResolvable) {
        cdkBuilder.metricDestinations(metricDestinations)
    }

    /**
     * @param sessionSampleRate Specifies the portion of user sessions to use for CloudWatch RUM
     *   data collection. Choosing a higher portion gives you more data but also incurs more costs.
     *
     * The range for this value is 0 to 1 inclusive. Setting this to 1 means that 100% of user
     * sessions are sampled, and setting it to 0.1 means that 10% of user sessions are sampled.
     *
     * If you omit this parameter, the default of 0.1 is used, and 10% of sessions will be sampled.
     */
    public fun sessionSampleRate(sessionSampleRate: Number) {
        cdkBuilder.sessionSampleRate(sessionSampleRate)
    }

    /**
     * @param telemetries An array that lists the types of telemetry data that this app monitor is
     *   to collect.
     * * `errors` indicates that RUM collects data about unhandled JavaScript errors raised by your
     *   application.
     * * `performance` indicates that RUM collects performance data about how your application and
     *   its resources are loaded and rendered. This includes Core Web Vitals.
     * * `http` indicates that RUM collects data about HTTP errors thrown by your application.
     */
    public fun telemetries(vararg telemetries: String) {
        _telemetries.addAll(listOf(*telemetries))
    }

    /**
     * @param telemetries An array that lists the types of telemetry data that this app monitor is
     *   to collect.
     * * `errors` indicates that RUM collects data about unhandled JavaScript errors raised by your
     *   application.
     * * `performance` indicates that RUM collects performance data about how your application and
     *   its resources are loaded and rendered. This includes Core Web Vitals.
     * * `http` indicates that RUM collects data about HTTP errors thrown by your application.
     */
    public fun telemetries(telemetries: Collection<String>) {
        _telemetries.addAll(telemetries)
    }

    public fun build(): CfnAppMonitor.AppMonitorConfigurationProperty {
        if (_excludedPages.isNotEmpty()) cdkBuilder.excludedPages(_excludedPages)
        if (_favoritePages.isNotEmpty()) cdkBuilder.favoritePages(_favoritePages)
        if (_includedPages.isNotEmpty()) cdkBuilder.includedPages(_includedPages)
        if (_metricDestinations.isNotEmpty()) cdkBuilder.metricDestinations(_metricDestinations)
        if (_telemetries.isNotEmpty()) cdkBuilder.telemetries(_telemetries)
        return cdkBuilder.build()
    }
}
