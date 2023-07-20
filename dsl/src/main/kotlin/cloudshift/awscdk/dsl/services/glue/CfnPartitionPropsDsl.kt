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
import software.amazon.awscdk.services.glue.CfnPartition
import software.amazon.awscdk.services.glue.CfnPartitionProps
import kotlin.String

@CdkDslMarker
public class CfnPartitionPropsDsl {
    private val cdkBuilder: CfnPartitionProps.Builder = CfnPartitionProps.builder()

    public fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
    }

    public fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
    }

    public fun partitionInput(partitionInput: IResolvable) {
        cdkBuilder.partitionInput(partitionInput)
    }

    public fun partitionInput(partitionInput: CfnPartition.PartitionInputProperty) {
        cdkBuilder.partitionInput(partitionInput)
    }

    public fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
    }

    public fun build(): CfnPartitionProps = cdkBuilder.build()
}
