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

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appsync.CfnDataSource
import kotlin.String

@CdkDslMarker
public class CfnDataSourceRelationalDatabaseConfigPropertyDsl {
    private val cdkBuilder: CfnDataSource.RelationalDatabaseConfigProperty.Builder =
        CfnDataSource.RelationalDatabaseConfigProperty.builder()

    public fun rdsHttpEndpointConfig(rdsHttpEndpointConfig: IResolvable) {
        cdkBuilder.rdsHttpEndpointConfig(rdsHttpEndpointConfig)
    }

    public fun rdsHttpEndpointConfig(rdsHttpEndpointConfig: CfnDataSource.RdsHttpEndpointConfigProperty) {
        cdkBuilder.rdsHttpEndpointConfig(rdsHttpEndpointConfig)
    }

    public fun relationalDatabaseSourceType(relationalDatabaseSourceType: String) {
        cdkBuilder.relationalDatabaseSourceType(relationalDatabaseSourceType)
    }

    public fun build(): CfnDataSource.RelationalDatabaseConfigProperty = cdkBuilder.build()
}
