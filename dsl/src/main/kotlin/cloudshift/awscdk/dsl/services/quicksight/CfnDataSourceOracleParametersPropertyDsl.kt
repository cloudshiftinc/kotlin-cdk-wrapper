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
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnDataSourceOracleParametersPropertyDsl {
    private val cdkBuilder: CfnDataSource.OracleParametersProperty.Builder =
        CfnDataSource.OracleParametersProperty.builder()

    public fun database(database: String) {
        cdkBuilder.database(database)
    }

    public fun host(host: String) {
        cdkBuilder.host(host)
    }

    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    public fun build(): CfnDataSource.OracleParametersProperty = cdkBuilder.build()
}
