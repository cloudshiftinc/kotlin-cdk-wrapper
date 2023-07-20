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
public class CfnDataSourceLambdaConfigPropertyDsl {
    private val cdkBuilder: CfnDataSource.LambdaConfigProperty.Builder =
        CfnDataSource.LambdaConfigProperty.builder()

    public fun lambdaFunctionArn(lambdaFunctionArn: String) {
        cdkBuilder.lambdaFunctionArn(lambdaFunctionArn)
    }

    public fun build(): CfnDataSource.LambdaConfigProperty = cdkBuilder.build()
}
