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
public class CfnDataSourcePostgreSqlParametersPropertyDsl {
    private val cdkBuilder: CfnDataSource.PostgreSqlParametersProperty.Builder =
        CfnDataSource.PostgreSqlParametersProperty.builder()

    public fun database(database: String) {
        cdkBuilder.database(database)
    }

    public fun host(host: String) {
        cdkBuilder.host(host)
    }

    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    public fun build(): CfnDataSource.PostgreSqlParametersProperty = cdkBuilder.build()
}
