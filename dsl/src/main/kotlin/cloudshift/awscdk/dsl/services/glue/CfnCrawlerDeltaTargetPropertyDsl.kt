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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnCrawler
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnCrawlerDeltaTargetPropertyDsl {
    private val cdkBuilder: CfnCrawler.DeltaTargetProperty.Builder =
        CfnCrawler.DeltaTargetProperty.builder()

    private val _deltaTables: MutableList<String> = mutableListOf()

    public fun connectionName(connectionName: String) {
        cdkBuilder.connectionName(connectionName)
    }

    public fun createNativeDeltaTable(createNativeDeltaTable: Boolean) {
        cdkBuilder.createNativeDeltaTable(createNativeDeltaTable)
    }

    public fun createNativeDeltaTable(createNativeDeltaTable: IResolvable) {
        cdkBuilder.createNativeDeltaTable(createNativeDeltaTable)
    }

    public fun deltaTables(vararg deltaTables: String) {
        _deltaTables.addAll(listOf(*deltaTables))
    }

    public fun deltaTables(deltaTables: Collection<String>) {
        _deltaTables.addAll(deltaTables)
    }

    public fun writeManifest(writeManifest: Boolean) {
        cdkBuilder.writeManifest(writeManifest)
    }

    public fun writeManifest(writeManifest: IResolvable) {
        cdkBuilder.writeManifest(writeManifest)
    }

    public fun build(): CfnCrawler.DeltaTargetProperty {
        if (_deltaTables.isNotEmpty()) cdkBuilder.deltaTables(_deltaTables)
        return cdkBuilder.build()
    }
}
