@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.appsync

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Deprecated
import kotlin.String
import software.amazon.awscdk.services.appsync.ElasticsearchDataSource
import software.amazon.awscdk.services.appsync.IGraphqlApi
import software.amazon.awscdk.services.elasticsearch.IDomain
import software.amazon.awscdk.services.iam.IRole
import software.constructs.Construct

/**
 * (deprecated) An Appsync datasource backed by Elasticsearch.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appsync.*;
 * import software.amazon.awscdk.services.elasticsearch.*;
 * import software.amazon.awscdk.services.iam.*;
 * Domain domain;
 * GraphqlApi graphqlApi;
 * Role role;
 * ElasticsearchDataSource elasticsearchDataSource = ElasticsearchDataSource.Builder.create(this,
 * "MyElasticsearchDataSource")
 * .api(graphqlApi)
 * .domain(domain)
 * // the properties below are optional
 * .description("description")
 * .name("name")
 * .serviceRole(role)
 * .build();
 * ```
 * * use `OpenSearchDataSource`
 */
@CdkDslMarker
@Deprecated(message = "deprecated in CDK")
public class ElasticsearchDataSourceDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: ElasticsearchDataSource.Builder =
        ElasticsearchDataSource.Builder.create(scope, id)

    /**
     * The API to attach this data source to.
     *
     * @param api The API to attach this data source to.
     */
    public fun api(api: IGraphqlApi) {
        cdkBuilder.api(api)
    }

    /**
     * the description of the data source.
     *
     * Default: - None
     *
     * @param description the description of the data source.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * (deprecated) The elasticsearch domain containing the endpoint for the data source.
     *
     * @param domain The elasticsearch domain containing the endpoint for the data source.
     */
    @Deprecated(message = "deprecated in CDK")
    public fun domain(domain: IDomain) {
        cdkBuilder.domain(domain)
    }

    /**
     * The name of the data source.
     *
     * Default: - id of data source
     *
     * @param name The name of the data source.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The IAM service role to be assumed by AppSync to interact with the data source.
     *
     * Default: - Create a new role
     *
     * @param serviceRole The IAM service role to be assumed by AppSync to interact with the data
     *   source.
     */
    public fun serviceRole(serviceRole: IRole) {
        cdkBuilder.serviceRole(serviceRole)
    }

    public fun build(): ElasticsearchDataSource = cdkBuilder.build()
}
