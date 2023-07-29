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

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appsync.AwsIamConfig

/**
 * The authorization config in case the HTTP endpoint requires authorization.
 *
 * Example:
 * ```
 * GraphqlApi api = GraphqlApi.Builder.create(this, "api")
 * .name("api")
 * .schema(SchemaFile.fromAsset(join(__dirname, "schema.graphql")))
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
public class AwsIamConfigDsl {
    private val cdkBuilder: AwsIamConfig.Builder = AwsIamConfig.builder()

    /** @param signingRegion The signing region for AWS IAM authorization. */
    public fun signingRegion(signingRegion: String) {
        cdkBuilder.signingRegion(signingRegion)
    }

    /** @param signingServiceName The signing service name for AWS IAM authorization. */
    public fun signingServiceName(signingServiceName: String) {
        cdkBuilder.signingServiceName(signingServiceName)
    }

    public fun build(): AwsIamConfig = cdkBuilder.build()
}
