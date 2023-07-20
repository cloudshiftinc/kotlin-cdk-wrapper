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
import software.amazon.awscdk.services.kendra.CfnDataSource
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDataSourceWebCrawlerSeedUrlConfigurationPropertyDsl {
    private val cdkBuilder: CfnDataSource.WebCrawlerSeedUrlConfigurationProperty.Builder =
        CfnDataSource.WebCrawlerSeedUrlConfigurationProperty.builder()

    private val _seedUrls: MutableList<String> = mutableListOf()

    public fun seedUrls(vararg seedUrls: String) {
        _seedUrls.addAll(listOf(*seedUrls))
    }

    public fun seedUrls(seedUrls: Collection<String>) {
        _seedUrls.addAll(seedUrls)
    }

    public fun webCrawlerMode(webCrawlerMode: String) {
        cdkBuilder.webCrawlerMode(webCrawlerMode)
    }

    public fun build(): CfnDataSource.WebCrawlerSeedUrlConfigurationProperty {
        if (_seedUrls.isNotEmpty()) cdkBuilder.seedUrls(_seedUrls)
        return cdkBuilder.build()
    }
}
