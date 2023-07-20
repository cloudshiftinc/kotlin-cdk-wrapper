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
import software.amazon.awscdk.services.appsync.CfnResolver
import kotlin.String

@CdkDslMarker
public class CfnResolverLambdaConflictHandlerConfigPropertyDsl {
    private val cdkBuilder: CfnResolver.LambdaConflictHandlerConfigProperty.Builder =
        CfnResolver.LambdaConflictHandlerConfigProperty.builder()

    public fun lambdaConflictHandlerArn(lambdaConflictHandlerArn: String) {
        cdkBuilder.lambdaConflictHandlerArn(lambdaConflictHandlerArn)
    }

    public fun build(): CfnResolver.LambdaConflictHandlerConfigProperty = cdkBuilder.build()
}
