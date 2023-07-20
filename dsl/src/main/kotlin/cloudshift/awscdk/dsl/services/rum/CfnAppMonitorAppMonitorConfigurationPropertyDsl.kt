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

package cloudshift.awscdk.dsl.services.rum

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.rum.CfnAppMonitor
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnAppMonitorAppMonitorConfigurationPropertyDsl {
    private val cdkBuilder: CfnAppMonitor.AppMonitorConfigurationProperty.Builder =
        CfnAppMonitor.AppMonitorConfigurationProperty.builder()

    private val _excludedPages: MutableList<String> = mutableListOf()

    private val _favoritePages: MutableList<String> = mutableListOf()

    private val _includedPages: MutableList<String> = mutableListOf()

    private val _metricDestinations: MutableList<Any> = mutableListOf()

    private val _telemetries: MutableList<String> = mutableListOf()

    public fun allowCookies(allowCookies: Boolean) {
        cdkBuilder.allowCookies(allowCookies)
    }

    public fun allowCookies(allowCookies: IResolvable) {
        cdkBuilder.allowCookies(allowCookies)
    }

    public fun enableXRay(enableXRay: Boolean) {
        cdkBuilder.enableXRay(enableXRay)
    }

    public fun enableXRay(enableXRay: IResolvable) {
        cdkBuilder.enableXRay(enableXRay)
    }

    public fun excludedPages(vararg excludedPages: String) {
        _excludedPages.addAll(listOf(*excludedPages))
    }

    public fun excludedPages(excludedPages: Collection<String>) {
        _excludedPages.addAll(excludedPages)
    }

    public fun favoritePages(vararg favoritePages: String) {
        _favoritePages.addAll(listOf(*favoritePages))
    }

    public fun favoritePages(favoritePages: Collection<String>) {
        _favoritePages.addAll(favoritePages)
    }

    public fun guestRoleArn(guestRoleArn: String) {
        cdkBuilder.guestRoleArn(guestRoleArn)
    }

    public fun identityPoolId(identityPoolId: String) {
        cdkBuilder.identityPoolId(identityPoolId)
    }

    public fun includedPages(vararg includedPages: String) {
        _includedPages.addAll(listOf(*includedPages))
    }

    public fun includedPages(includedPages: Collection<String>) {
        _includedPages.addAll(includedPages)
    }

    public fun metricDestinations(vararg metricDestinations: Any) {
        _metricDestinations.addAll(listOf(*metricDestinations))
    }

    public fun metricDestinations(metricDestinations: Collection<Any>) {
        _metricDestinations.addAll(metricDestinations)
    }

    public fun metricDestinations(metricDestinations: IResolvable) {
        cdkBuilder.metricDestinations(metricDestinations)
    }

    public fun sessionSampleRate(sessionSampleRate: Number) {
        cdkBuilder.sessionSampleRate(sessionSampleRate)
    }

    public fun telemetries(vararg telemetries: String) {
        _telemetries.addAll(listOf(*telemetries))
    }

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
