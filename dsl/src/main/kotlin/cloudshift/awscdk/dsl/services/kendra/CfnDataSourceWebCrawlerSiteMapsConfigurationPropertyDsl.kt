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

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.kendra.CfnDataSource

/**
 * Provides the configuration information of the sitemap URLs to crawl.
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
 * WebCrawlerSiteMapsConfigurationProperty webCrawlerSiteMapsConfigurationProperty =
 * WebCrawlerSiteMapsConfigurationProperty.builder()
 * .siteMaps(List.of("siteMaps"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-webcrawlersitemapsconfiguration.html)
 */
@CdkDslMarker
public class CfnDataSourceWebCrawlerSiteMapsConfigurationPropertyDsl {
    private val cdkBuilder: CfnDataSource.WebCrawlerSiteMapsConfigurationProperty.Builder =
        CfnDataSource.WebCrawlerSiteMapsConfigurationProperty.builder()

    private val _siteMaps: MutableList<String> = mutableListOf()

    /**
     * @param siteMaps The list of sitemap URLs of the websites you want to crawl. The list can
     *   include a maximum of three sitemap URLs.
     */
    public fun siteMaps(vararg siteMaps: String) {
        _siteMaps.addAll(listOf(*siteMaps))
    }

    /**
     * @param siteMaps The list of sitemap URLs of the websites you want to crawl. The list can
     *   include a maximum of three sitemap URLs.
     */
    public fun siteMaps(siteMaps: Collection<String>) {
        _siteMaps.addAll(siteMaps)
    }

    public fun build(): CfnDataSource.WebCrawlerSiteMapsConfigurationProperty {
        if (_siteMaps.isNotEmpty()) cdkBuilder.siteMaps(_siteMaps)
        return cdkBuilder.build()
    }
}
