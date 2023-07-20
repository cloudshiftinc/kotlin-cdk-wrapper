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
import software.amazon.awscdk.services.appsync.IGraphqlApi
import software.amazon.awscdk.services.appsync.RdsDataSource
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.rds.IServerlessCluster
import software.amazon.awscdk.services.secretsmanager.ISecret
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class RdsDataSourceDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: RdsDataSource.Builder = RdsDataSource.Builder.create(scope, id)

    public fun api(api: IGraphqlApi) {
        cdkBuilder.api(api)
    }

    public fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun secretStore(secretStore: ISecret) {
        cdkBuilder.secretStore(secretStore)
    }

    public fun serverlessCluster(serverlessCluster: IServerlessCluster) {
        cdkBuilder.serverlessCluster(serverlessCluster)
    }

    public fun serviceRole(serviceRole: IRole) {
        cdkBuilder.serviceRole(serviceRole)
    }

    public fun build(): RdsDataSource = cdkBuilder.build()
}
