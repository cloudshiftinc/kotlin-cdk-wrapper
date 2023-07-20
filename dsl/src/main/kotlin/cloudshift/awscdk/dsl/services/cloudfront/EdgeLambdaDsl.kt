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
import software.amazon.awscdk.services.cloudfront.EdgeLambda
import software.amazon.awscdk.services.cloudfront.LambdaEdgeEventType
import software.amazon.awscdk.services.lambda.IVersion
import kotlin.Boolean

@CdkDslMarker
public class EdgeLambdaDsl {
    private val cdkBuilder: EdgeLambda.Builder = EdgeLambda.builder()

    public fun eventType(eventType: LambdaEdgeEventType) {
        cdkBuilder.eventType(eventType)
    }

    public fun functionVersion(functionVersion: IVersion) {
        cdkBuilder.functionVersion(functionVersion)
    }

    public fun includeBody(includeBody: Boolean) {
        cdkBuilder.includeBody(includeBody)
    }

    public fun build(): EdgeLambda = cdkBuilder.build()
}
