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

package cloudshift.awscdk.dsl.services.s3objectlambda

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.services.s3objectlambda.CfnAccessPointPolicy
import software.constructs.Construct
import kotlin.Any
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class CfnAccessPointPolicyDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnAccessPointPolicy.Builder = CfnAccessPointPolicy.Builder.create(
        scope,
        id,
    )

    public fun objectLambdaAccessPoint(objectLambdaAccessPoint: String) {
        cdkBuilder.objectLambdaAccessPoint(objectLambdaAccessPoint)
    }

    public fun policyDocument(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.policyDocument(builder.map)
    }

    public fun policyDocument(policyDocument: Any) {
        cdkBuilder.policyDocument(policyDocument)
    }

    public fun build(): CfnAccessPointPolicy = cdkBuilder.build()
}
