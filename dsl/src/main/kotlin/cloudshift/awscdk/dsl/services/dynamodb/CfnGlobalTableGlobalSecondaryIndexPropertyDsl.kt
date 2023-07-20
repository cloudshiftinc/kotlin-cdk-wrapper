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

package cloudshift.awscdk.dsl.services.dynamodb

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dynamodb.CfnGlobalTable
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnGlobalTableGlobalSecondaryIndexPropertyDsl {
    private val cdkBuilder: CfnGlobalTable.GlobalSecondaryIndexProperty.Builder =
        CfnGlobalTable.GlobalSecondaryIndexProperty.builder()

    private val _keySchema: MutableList<Any> = mutableListOf()

    public fun indexName(indexName: String) {
        cdkBuilder.indexName(indexName)
    }

    public fun keySchema(vararg keySchema: Any) {
        _keySchema.addAll(listOf(*keySchema))
    }

    public fun keySchema(keySchema: Collection<Any>) {
        _keySchema.addAll(keySchema)
    }

    public fun keySchema(keySchema: IResolvable) {
        cdkBuilder.keySchema(keySchema)
    }

    public fun projection(projection: IResolvable) {
        cdkBuilder.projection(projection)
    }

    public fun projection(projection: CfnGlobalTable.ProjectionProperty) {
        cdkBuilder.projection(projection)
    }

    public fun writeProvisionedThroughputSettings(writeProvisionedThroughputSettings: IResolvable) {
        cdkBuilder.writeProvisionedThroughputSettings(writeProvisionedThroughputSettings)
    }

    public fun writeProvisionedThroughputSettings(writeProvisionedThroughputSettings: CfnGlobalTable.WriteProvisionedThroughputSettingsProperty) {
        cdkBuilder.writeProvisionedThroughputSettings(writeProvisionedThroughputSettings)
    }

    public fun build(): CfnGlobalTable.GlobalSecondaryIndexProperty {
        if (_keySchema.isNotEmpty()) cdkBuilder.keySchema(_keySchema)
        return cdkBuilder.build()
    }
}
