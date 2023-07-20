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

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnSimpleTable
import software.amazon.awscdk.services.sam.CfnSimpleTableProps
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class CfnSimpleTablePropsDsl {
    private val cdkBuilder: CfnSimpleTableProps.Builder = CfnSimpleTableProps.builder()

    public fun primaryKey(primaryKey: IResolvable) {
        cdkBuilder.primaryKey(primaryKey)
    }

    public fun primaryKey(primaryKey: CfnSimpleTable.PrimaryKeyProperty) {
        cdkBuilder.primaryKey(primaryKey)
    }

    public fun provisionedThroughput(provisionedThroughput: IResolvable) {
        cdkBuilder.provisionedThroughput(provisionedThroughput)
    }

    public fun provisionedThroughput(provisionedThroughput: CfnSimpleTable.ProvisionedThroughputProperty) {
        cdkBuilder.provisionedThroughput(provisionedThroughput)
    }

    public fun sseSpecification(sseSpecification: IResolvable) {
        cdkBuilder.sseSpecification(sseSpecification)
    }

    public fun sseSpecification(sseSpecification: CfnSimpleTable.SSESpecificationProperty) {
        cdkBuilder.sseSpecification(sseSpecification)
    }

    public fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
    }

    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnSimpleTableProps = cdkBuilder.build()
}
