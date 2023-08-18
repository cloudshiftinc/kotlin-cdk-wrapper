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
import kotlin.String
import software.amazon.awscdk.services.appsync.IGraphqlApi
import software.amazon.awscdk.services.appsync.OpenSearchDataSource
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.opensearchservice.IDomain
import software.constructs.Construct

/**
 * An Appsync datasource backed by OpenSearch.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.opensearchservice.*;
 * GraphqlApi api;
 * User user = new User(this, "User");
 * Domain domain = Domain.Builder.create(this, "Domain")
 * .version(EngineVersion.OPENSEARCH_2_3)
 * .removalPolicy(RemovalPolicy.DESTROY)
 * .fineGrainedAccessControl(AdvancedSecurityOptions.builder().masterUserArn(user.getUserArn()).build())
 * .encryptionAtRest(EncryptionAtRestOptions.builder().enabled(true).build())
 * .nodeToNodeEncryption(true)
 * .enforceHttps(true)
 * .build();
 * OpenSearchDataSource ds = api.addOpenSearchDataSource("ds", domain);
 * ds.createResolver("QueryGetTestsResolver", BaseResolverProps.builder()
 * .typeName("Query")
 * .fieldName("getTests")
 * .requestMappingTemplate(MappingTemplate.fromString(JSON.stringify(Map.of(
 * "version", "2017-02-28",
 * "operation", "GET",
 * "path", "/id/post/_search",
 * "params", Map.of(
 * "headers", Map.of(),
 * "queryString", Map.of(),
 * "body", Map.of("from", 0, "size", 50))))))
 * .responseMappingTemplate(MappingTemplate.fromString("[\n    #foreach($entry in
 * $context.result.hits.hits)\n    #if( $velocityCount &gt; 1 ) , #end\n
 * $utils.toJson($entry.get(\"_source\"))\n    #end\n  ]"))
 * .build());
 * ```
 */
@CdkDslMarker
public class OpenSearchDataSourceDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: OpenSearchDataSource.Builder =
        OpenSearchDataSource.Builder.create(scope, id)

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
     * The OpenSearch domain containing the endpoint for the data source.
     *
     * @param domain The OpenSearch domain containing the endpoint for the data source.
     */
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

    public fun build(): OpenSearchDataSource = cdkBuilder.build()
}
