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

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.glue.CfnCrawler
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnCrawlerJdbcTargetPropertyDsl {
    private val cdkBuilder: CfnCrawler.JdbcTargetProperty.Builder =
        CfnCrawler.JdbcTargetProperty.builder()

    private val _exclusions: MutableList<String> = mutableListOf()

    public fun connectionName(connectionName: String) {
        cdkBuilder.connectionName(connectionName)
    }

    public fun exclusions(vararg exclusions: String) {
        _exclusions.addAll(listOf(*exclusions))
    }

    public fun exclusions(exclusions: Collection<String>) {
        _exclusions.addAll(exclusions)
    }

    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    public fun build(): CfnCrawler.JdbcTargetProperty {
        if (_exclusions.isNotEmpty()) cdkBuilder.exclusions(_exclusions)
        return cdkBuilder.build()
    }
}
