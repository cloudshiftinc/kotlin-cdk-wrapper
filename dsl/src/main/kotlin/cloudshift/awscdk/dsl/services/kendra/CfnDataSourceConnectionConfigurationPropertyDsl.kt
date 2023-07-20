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

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.kendra.CfnDataSource
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnDataSourceConnectionConfigurationPropertyDsl {
    private val cdkBuilder: CfnDataSource.ConnectionConfigurationProperty.Builder =
        CfnDataSource.ConnectionConfigurationProperty.builder()

    public fun databaseHost(databaseHost: String) {
        cdkBuilder.databaseHost(databaseHost)
    }

    public fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
    }

    public fun databasePort(databasePort: Number) {
        cdkBuilder.databasePort(databasePort)
    }

    public fun secretArn(secretArn: String) {
        cdkBuilder.secretArn(secretArn)
    }

    public fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
    }

    public fun build(): CfnDataSource.ConnectionConfigurationProperty = cdkBuilder.build()
}
