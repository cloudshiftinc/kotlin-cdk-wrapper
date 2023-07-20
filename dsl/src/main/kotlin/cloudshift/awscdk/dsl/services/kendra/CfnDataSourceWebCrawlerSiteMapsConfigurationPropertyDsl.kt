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
public class CfnDataSourceWebCrawlerSiteMapsConfigurationPropertyDsl {
    private val cdkBuilder: CfnDataSource.WebCrawlerSiteMapsConfigurationProperty.Builder =
        CfnDataSource.WebCrawlerSiteMapsConfigurationProperty.builder()

    private val _siteMaps: MutableList<String> = mutableListOf()

    public fun siteMaps(vararg siteMaps: String) {
        _siteMaps.addAll(listOf(*siteMaps))
    }

    public fun siteMaps(siteMaps: Collection<String>) {
        _siteMaps.addAll(siteMaps)
    }

    public fun build(): CfnDataSource.WebCrawlerSiteMapsConfigurationProperty {
        if (_siteMaps.isNotEmpty()) cdkBuilder.siteMaps(_siteMaps)
        return cdkBuilder.build()
    }
}
