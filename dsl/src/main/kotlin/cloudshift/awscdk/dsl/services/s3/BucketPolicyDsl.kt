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
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.s3.BucketPolicy
import software.amazon.awscdk.services.s3.IBucket
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class BucketPolicyDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: BucketPolicy.Builder = BucketPolicy.Builder.create(scope, id)

    public fun bucket(bucket: IBucket) {
        cdkBuilder.bucket(bucket)
    }

    public fun removalPolicy(removalPolicy: RemovalPolicy) {
        cdkBuilder.removalPolicy(removalPolicy)
    }

    public fun build(): BucketPolicy = cdkBuilder.build()
}
