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

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.cloudfront.LambdaEdgeEventType
import software.amazon.awscdk.services.cloudfront.LambdaFunctionAssociation
import software.amazon.awscdk.services.lambda.IVersion
import kotlin.Boolean

@CdkDslMarker
public class LambdaFunctionAssociationDsl {
    private val cdkBuilder: LambdaFunctionAssociation.Builder = LambdaFunctionAssociation.builder()

    public fun eventType(eventType: LambdaEdgeEventType) {
        cdkBuilder.eventType(eventType)
    }

    public fun includeBody(includeBody: Boolean) {
        cdkBuilder.includeBody(includeBody)
    }

    public fun lambdaFunction(lambdaFunction: IVersion) {
        cdkBuilder.lambdaFunction(lambdaFunction)
    }

    public fun build(): LambdaFunctionAssociation = cdkBuilder.build()
}
