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

package cloudshift.awscdk.dsl.services.timestream

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.timestream.CfnTable
import software.constructs.Construct
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnTableDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnTable.Builder = CfnTable.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
    }

    public fun magneticStoreWriteProperties(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.magneticStoreWriteProperties(builder.map)
    }

    public fun magneticStoreWriteProperties(magneticStoreWriteProperties: Any) {
        cdkBuilder.magneticStoreWriteProperties(magneticStoreWriteProperties)
    }

    public fun retentionProperties(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.retentionProperties(builder.map)
    }

    public fun retentionProperties(retentionProperties: Any) {
        cdkBuilder.retentionProperties(retentionProperties)
    }

    public fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnTable {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
