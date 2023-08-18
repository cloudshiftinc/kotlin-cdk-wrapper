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

package io.cloudshiftdev.awscdkdsl.services.kendra

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.kendra.CfnDataSource

/**
 * Provides the configuration information of the seed or starting point URLs to crawl.
 *
 * *When selecting websites to index, you must adhere to the
 * [Amazon Acceptable Use Policy](https://docs.aws.amazon.com/aup/) and all other Amazon terms.
 * Remember that you must only use the Amazon Kendra web crawler to index your own webpages, or
 * webpages that you have authorization to index.*
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kendra.*;
 * WebCrawlerSeedUrlConfigurationProperty webCrawlerSeedUrlConfigurationProperty =
 * WebCrawlerSeedUrlConfigurationProperty.builder()
 * .seedUrls(List.of("seedUrls"))
 * // the properties below are optional
 * .webCrawlerMode("webCrawlerMode")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-webcrawlerseedurlconfiguration.html)
 */
@CdkDslMarker
public class CfnDataSourceWebCrawlerSeedUrlConfigurationPropertyDsl {
    private val cdkBuilder: CfnDataSource.WebCrawlerSeedUrlConfigurationProperty.Builder =
        CfnDataSource.WebCrawlerSeedUrlConfigurationProperty.builder()

    private val _seedUrls: MutableList<String> = mutableListOf()

    /**
     * @param seedUrls The list of seed or starting point URLs of the websites you want to crawl.
     *   The list can include a maximum of 100 seed URLs.
     */
    public fun seedUrls(vararg seedUrls: String) {
        _seedUrls.addAll(listOf(*seedUrls))
    }

    /**
     * @param seedUrls The list of seed or starting point URLs of the websites you want to crawl.
     *   The list can include a maximum of 100 seed URLs.
     */
    public fun seedUrls(seedUrls: Collection<String>) {
        _seedUrls.addAll(seedUrls)
    }

    /**
     * @param webCrawlerMode You can choose one of the following modes:.
     * * `HOST_ONLY` —crawl only the website host names. For example, if the seed URL is
     *   "abc.example.com", then only URLs with host name "abc.example.com" are crawled.
     * * `SUBDOMAINS` —crawl the website host names with subdomains. For example, if the seed URL is
     *   "abc.example.com", then "a.abc.example.com" and "b.abc.example.com" are also crawled.
     * * `EVERYTHING` —crawl the website host names with subdomains and other domains that the web
     *   pages link to.
     *
     * The default mode is set to `HOST_ONLY` .
     */
    public fun webCrawlerMode(webCrawlerMode: String) {
        cdkBuilder.webCrawlerMode(webCrawlerMode)
    }

    public fun build(): CfnDataSource.WebCrawlerSeedUrlConfigurationProperty {
        if (_seedUrls.isNotEmpty()) cdkBuilder.seedUrls(_seedUrls)
        return cdkBuilder.build()
    }
}
