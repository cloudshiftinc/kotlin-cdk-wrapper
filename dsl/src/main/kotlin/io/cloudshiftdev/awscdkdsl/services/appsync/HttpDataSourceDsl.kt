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
import kotlin.Unit
import software.amazon.awscdk.services.appsync.AwsIamConfig
import software.amazon.awscdk.services.appsync.HttpDataSource
import software.amazon.awscdk.services.appsync.IGraphqlApi
import software.constructs.Construct

/**
 * An AppSync datasource backed by a http endpoint.
 *
 * Example:
 * ```
 * GraphqlApi api = GraphqlApi.Builder.create(this, "api")
 * .name("api")
 * .definition(Definition.fromFile(join(__dirname, "schema.graphql")))
 * .build();
 * HttpDataSource httpDs = api.addHttpDataSource("ds", "https://states.amazonaws.com",
 * HttpDataSourceOptions.builder()
 * .name("httpDsWithStepF")
 * .description("from appsync to StepFunctions Workflow")
 * .authorizationConfig(AwsIamConfig.builder()
 * .signingRegion("us-east-1")
 * .signingServiceName("states")
 * .build())
 * .build());
 * httpDs.createResolver("MutationCallStepFunctionResolver", BaseResolverProps.builder()
 * .typeName("Mutation")
 * .fieldName("callStepFunction")
 * .requestMappingTemplate(MappingTemplate.fromFile("request.vtl"))
 * .responseMappingTemplate(MappingTemplate.fromFile("response.vtl"))
 * .build());
 * ```
 */
@CdkDslMarker
public class HttpDataSourceDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: HttpDataSource.Builder = HttpDataSource.Builder.create(scope, id)

    /**
     * The API to attach this data source to.
     *
     * @param api The API to attach this data source to.
     */
    public fun api(api: IGraphqlApi) {
        cdkBuilder.api(api)
    }

    /**
     * The authorization config in case the HTTP endpoint requires authorization.
     *
     * Default: - none
     *
     * @param authorizationConfig The authorization config in case the HTTP endpoint requires
     *   authorization.
     */
    public fun authorizationConfig(authorizationConfig: AwsIamConfigDsl.() -> Unit = {}) {
        val builder = AwsIamConfigDsl()
        builder.apply(authorizationConfig)
        cdkBuilder.authorizationConfig(builder.build())
    }

    /**
     * The authorization config in case the HTTP endpoint requires authorization.
     *
     * Default: - none
     *
     * @param authorizationConfig The authorization config in case the HTTP endpoint requires
     *   authorization.
     */
    public fun authorizationConfig(authorizationConfig: AwsIamConfig) {
        cdkBuilder.authorizationConfig(authorizationConfig)
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
     * The http endpoint.
     *
     * @param endpoint The http endpoint.
     */
    public fun endpoint(endpoint: String) {
        cdkBuilder.endpoint(endpoint)
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

    public fun build(): HttpDataSource = cdkBuilder.build()
}
