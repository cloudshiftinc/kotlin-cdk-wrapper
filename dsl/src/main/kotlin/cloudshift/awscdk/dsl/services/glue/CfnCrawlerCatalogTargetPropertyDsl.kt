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
public class CfnCrawlerCatalogTargetPropertyDsl {
    private val cdkBuilder: CfnCrawler.CatalogTargetProperty.Builder =
        CfnCrawler.CatalogTargetProperty.builder()

    private val _tables: MutableList<String> = mutableListOf()

    public fun connectionName(connectionName: String) {
        cdkBuilder.connectionName(connectionName)
    }

    public fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
    }

    public fun dlqEventQueueArn(dlqEventQueueArn: String) {
        cdkBuilder.dlqEventQueueArn(dlqEventQueueArn)
    }

    public fun eventQueueArn(eventQueueArn: String) {
        cdkBuilder.eventQueueArn(eventQueueArn)
    }

    public fun tables(vararg tables: String) {
        _tables.addAll(listOf(*tables))
    }

    public fun tables(tables: Collection<String>) {
        _tables.addAll(tables)
    }

    public fun build(): CfnCrawler.CatalogTargetProperty {
        if (_tables.isNotEmpty()) cdkBuilder.tables(_tables)
        return cdkBuilder.build()
    }
}
