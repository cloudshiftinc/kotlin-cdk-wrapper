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

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnDataSource
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDataSourceWebCrawlerConfigurationPropertyDsl {
    private val cdkBuilder: CfnDataSource.WebCrawlerConfigurationProperty.Builder =
        CfnDataSource.WebCrawlerConfigurationProperty.builder()

    private val _urlExclusionPatterns: MutableList<String> = mutableListOf()

    private val _urlInclusionPatterns: MutableList<String> = mutableListOf()

    public fun authenticationConfiguration(authenticationConfiguration: IResolvable) {
        cdkBuilder.authenticationConfiguration(authenticationConfiguration)
    }

    public fun authenticationConfiguration(authenticationConfiguration: CfnDataSource.WebCrawlerAuthenticationConfigurationProperty) {
        cdkBuilder.authenticationConfiguration(authenticationConfiguration)
    }

    public fun crawlDepth(crawlDepth: Number) {
        cdkBuilder.crawlDepth(crawlDepth)
    }

    public fun maxContentSizePerPageInMegaBytes(maxContentSizePerPageInMegaBytes: Number) {
        cdkBuilder.maxContentSizePerPageInMegaBytes(maxContentSizePerPageInMegaBytes)
    }

    public fun maxLinksPerPage(maxLinksPerPage: Number) {
        cdkBuilder.maxLinksPerPage(maxLinksPerPage)
    }

    public fun maxUrlsPerMinuteCrawlRate(maxUrlsPerMinuteCrawlRate: Number) {
        cdkBuilder.maxUrlsPerMinuteCrawlRate(maxUrlsPerMinuteCrawlRate)
    }

    public fun proxyConfiguration(proxyConfiguration: IResolvable) {
        cdkBuilder.proxyConfiguration(proxyConfiguration)
    }

    public fun proxyConfiguration(proxyConfiguration: CfnDataSource.ProxyConfigurationProperty) {
        cdkBuilder.proxyConfiguration(proxyConfiguration)
    }

    public fun urlExclusionPatterns(vararg urlExclusionPatterns: String) {
        _urlExclusionPatterns.addAll(listOf(*urlExclusionPatterns))
    }

    public fun urlExclusionPatterns(urlExclusionPatterns: Collection<String>) {
        _urlExclusionPatterns.addAll(urlExclusionPatterns)
    }

    public fun urlInclusionPatterns(vararg urlInclusionPatterns: String) {
        _urlInclusionPatterns.addAll(listOf(*urlInclusionPatterns))
    }

    public fun urlInclusionPatterns(urlInclusionPatterns: Collection<String>) {
        _urlInclusionPatterns.addAll(urlInclusionPatterns)
    }

    public fun urls(urls: IResolvable) {
        cdkBuilder.urls(urls)
    }

    public fun urls(urls: CfnDataSource.WebCrawlerUrlsProperty) {
        cdkBuilder.urls(urls)
    }

    public fun build(): CfnDataSource.WebCrawlerConfigurationProperty {
        if (_urlExclusionPatterns.isNotEmpty()) cdkBuilder.urlExclusionPatterns(_urlExclusionPatterns)
        if (_urlInclusionPatterns.isNotEmpty()) cdkBuilder.urlInclusionPatterns(_urlInclusionPatterns)
        return cdkBuilder.build()
    }
}
