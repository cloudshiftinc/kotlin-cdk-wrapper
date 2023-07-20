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
import software.amazon.awscdk.services.appsync.CfnDataSource
import kotlin.String

@CdkDslMarker
public class CfnDataSourceRdsHttpEndpointConfigPropertyDsl {
    private val cdkBuilder: CfnDataSource.RdsHttpEndpointConfigProperty.Builder =
        CfnDataSource.RdsHttpEndpointConfigProperty.builder()

    public fun awsRegion(awsRegion: String) {
        cdkBuilder.awsRegion(awsRegion)
    }

    public fun awsSecretStoreArn(awsSecretStoreArn: String) {
        cdkBuilder.awsSecretStoreArn(awsSecretStoreArn)
    }

    public fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
    }

    public fun dbClusterIdentifier(dbClusterIdentifier: String) {
        cdkBuilder.dbClusterIdentifier(dbClusterIdentifier)
    }

    public fun schema(schema: String) {
        cdkBuilder.schema(schema)
    }

    public fun build(): CfnDataSource.RdsHttpEndpointConfigProperty = cdkBuilder.build()
}
