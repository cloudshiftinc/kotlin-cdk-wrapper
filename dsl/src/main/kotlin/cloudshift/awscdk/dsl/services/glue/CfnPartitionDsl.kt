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
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnPartitionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnPartition.Builder = CfnPartition.Builder.create(scope, id)

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

    public fun build(): CfnPartition = cdkBuilder.build()
}
