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
import software.amazon.awscdk.services.appsync.LambdaDataSource
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.lambda.IFunction
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class LambdaDataSourceDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: LambdaDataSource.Builder = LambdaDataSource.Builder.create(scope, id)

    public fun api(api: IGraphqlApi) {
        cdkBuilder.api(api)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun lambdaFunction(lambdaFunction: IFunction) {
        cdkBuilder.lambdaFunction(lambdaFunction)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun serviceRole(serviceRole: IRole) {
        cdkBuilder.serviceRole(serviceRole)
    }

    public fun build(): LambdaDataSource = cdkBuilder.build()
}
