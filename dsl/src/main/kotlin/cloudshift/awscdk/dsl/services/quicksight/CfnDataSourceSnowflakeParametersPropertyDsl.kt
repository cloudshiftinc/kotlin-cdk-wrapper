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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.quicksight.CfnDataSource
import kotlin.String

@CdkDslMarker
public class CfnDataSourceSnowflakeParametersPropertyDsl {
    private val cdkBuilder: CfnDataSource.SnowflakeParametersProperty.Builder =
        CfnDataSource.SnowflakeParametersProperty.builder()

    public fun database(database: String) {
        cdkBuilder.database(database)
    }

    public fun host(host: String) {
        cdkBuilder.host(host)
    }

    public fun warehouse(warehouse: String) {
        cdkBuilder.warehouse(warehouse)
    }

    public fun build(): CfnDataSource.SnowflakeParametersProperty = cdkBuilder.build()
}
