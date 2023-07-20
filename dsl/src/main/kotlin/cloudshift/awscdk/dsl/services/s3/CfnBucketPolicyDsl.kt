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

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.services.s3.CfnBucketPolicy
import software.constructs.Construct
import kotlin.Any
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class CfnBucketPolicyDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnBucketPolicy.Builder = CfnBucketPolicy.Builder.create(scope, id)

    public fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
    }

    public fun policyDocument(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.policyDocument(builder.map)
    }

    public fun policyDocument(policyDocument: Any) {
        cdkBuilder.policyDocument(policyDocument)
    }

    public fun build(): CfnBucketPolicy = cdkBuilder.build()
}
