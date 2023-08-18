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
import software.amazon.awscdk.services.appsync.LambdaDataSource
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.lambda.IFunction
import software.constructs.Construct

/**
 * An AppSync datasource backed by a Lambda function.
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
 * LambdaDataSource lambdaDataSource = LambdaDataSource.Builder.create(this, "MyLambdaDataSource")
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
public class LambdaDataSourceDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: LambdaDataSource.Builder = LambdaDataSource.Builder.create(scope, id)

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
     * The Lambda function to call to interact with this data source.
     *
     * @param lambdaFunction The Lambda function to call to interact with this data source.
     */
    public fun lambdaFunction(lambdaFunction: IFunction) {
        cdkBuilder.lambdaFunction(lambdaFunction)
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

    public fun build(): LambdaDataSource = cdkBuilder.build()
}
