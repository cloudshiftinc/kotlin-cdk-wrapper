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
import software.amazon.awscdk.services.appsync.IGraphqlApi
import software.amazon.awscdk.services.appsync.LambdaDataSourceProps
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.lambda.IFunction

/**
 * Properties for an AppSync Lambda datasource.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appsync.*;
 * import software.amazon.awscdk.services.iam.*;
 * import software.amazon.awscdk.services.lambda.*;
 * Function function_;
 * GraphqlApi graphqlApi;
 * Role role;
 * LambdaDataSourceProps lambdaDataSourceProps = LambdaDataSourceProps.builder()
 * .api(graphqlApi)
 * .lambdaFunction(function_)
 * // the properties below are optional
 * .description("description")
 * .name("name")
 * .serviceRole(role)
 * .build();
 * ```
 */
@CdkDslMarker
public class LambdaDataSourcePropsDsl {
    private val cdkBuilder: LambdaDataSourceProps.Builder = LambdaDataSourceProps.builder()

    /** @param api The API to attach this data source to. */
    public fun api(api: IGraphqlApi) {
        cdkBuilder.api(api)
    }

    /** @param description the description of the data source. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param lambdaFunction The Lambda function to call to interact with this data source. */
    public fun lambdaFunction(lambdaFunction: IFunction) {
        cdkBuilder.lambdaFunction(lambdaFunction)
    }

    /** @param name The name of the data source. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param serviceRole The IAM service role to be assumed by AppSync to interact with the data
     *   source.
     */
    public fun serviceRole(serviceRole: IRole) {
        cdkBuilder.serviceRole(serviceRole)
    }

    public fun build(): LambdaDataSourceProps = cdkBuilder.build()
}
