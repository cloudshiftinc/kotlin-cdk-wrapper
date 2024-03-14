package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.rds.IServerlessCluster
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecret
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.String
import kotlin.Unit
import software.constructs.Construct as SoftwareConstructsConstruct

public open class RdsDataSource
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.appsync.RdsDataSource,
) : BackedDataSource(cdkObject) {
    /** A fluent builder for [io.cloudshiftdev.awscdk.services.appsync.RdsDataSource]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * The API to attach this data source to.
         *
         * @param api The API to attach this data source to.
         */
        public fun api(api: IGraphqlApi)

        /**
         * The name of the database to use within the cluster.
         *
         * Default: - None
         *
         * @param databaseName The name of the database to use within the cluster.
         */
        public fun databaseName(databaseName: String)

        /**
         * the description of the data source.
         *
         * Default: - None
         *
         * @param description the description of the data source.
         */
        public fun description(description: String)

        /**
         * The name of the data source.
         *
         * Default: - id of data source
         *
         * @param name The name of the data source.
         */
        public fun name(name: String)

        /**
         * The secret containing the credentials for the database.
         *
         * @param secretStore The secret containing the credentials for the database.
         */
        public fun secretStore(secretStore: ISecret)

        /**
         * The serverless cluster to call to interact with this data source.
         *
         * @param serverlessCluster The serverless cluster to call to interact with this data
         *   source.
         */
        public fun serverlessCluster(serverlessCluster: IServerlessCluster)

        /**
         * The IAM service role to be assumed by AppSync to interact with the data source.
         *
         * Default: - Create a new role
         *
         * @param serviceRole The IAM service role to be assumed by AppSync to interact with the
         *   data source.
         */
        public fun serviceRole(serviceRole: IRole)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.appsync.RdsDataSource.Builder =
            software.amazon.awscdk.services.appsync.RdsDataSource.Builder.create(scope, id)

        /**
         * The API to attach this data source to.
         *
         * @param api The API to attach this data source to.
         */
        override fun api(api: IGraphqlApi) {
            cdkBuilder.api(api.let(IGraphqlApi::unwrap))
        }

        /**
         * The name of the database to use within the cluster.
         *
         * Default: - None
         *
         * @param databaseName The name of the database to use within the cluster.
         */
        override fun databaseName(databaseName: String) {
            cdkBuilder.databaseName(databaseName)
        }

        /**
         * the description of the data source.
         *
         * Default: - None
         *
         * @param description the description of the data source.
         */
        override fun description(description: String) {
            cdkBuilder.description(description)
        }

        /**
         * The name of the data source.
         *
         * Default: - id of data source
         *
         * @param name The name of the data source.
         */
        override fun name(name: String) {
            cdkBuilder.name(name)
        }

        /**
         * The secret containing the credentials for the database.
         *
         * @param secretStore The secret containing the credentials for the database.
         */
        override fun secretStore(secretStore: ISecret) {
            cdkBuilder.secretStore(secretStore.let(ISecret::unwrap))
        }

        /**
         * The serverless cluster to call to interact with this data source.
         *
         * @param serverlessCluster The serverless cluster to call to interact with this data
         *   source.
         */
        override fun serverlessCluster(serverlessCluster: IServerlessCluster) {
            cdkBuilder.serverlessCluster(serverlessCluster.let(IServerlessCluster::unwrap))
        }

        /**
         * The IAM service role to be assumed by AppSync to interact with the data source.
         *
         * Default: - Create a new role
         *
         * @param serviceRole The IAM service role to be assumed by AppSync to interact with the
         *   data source.
         */
        override fun serviceRole(serviceRole: IRole) {
            cdkBuilder.serviceRole(serviceRole.let(IRole::unwrap))
        }

        public fun build(): software.amazon.awscdk.services.appsync.RdsDataSource =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): RdsDataSource {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return RdsDataSource(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.appsync.RdsDataSource
        ): RdsDataSource = RdsDataSource(cdkObject)

        internal fun unwrap(
            wrapped: RdsDataSource
        ): software.amazon.awscdk.services.appsync.RdsDataSource = wrapped.cdkObject
    }
}
