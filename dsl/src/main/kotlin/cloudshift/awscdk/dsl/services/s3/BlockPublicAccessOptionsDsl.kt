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

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.s3.BlockPublicAccessOptions

/**
 * Example:
 * ```
 * Bucket bucket = Bucket.Builder.create(this, "MyBlockedBucket")
 * .blockPublicAccess(BlockPublicAccess.Builder.create().blockPublicPolicy(true).build())
 * .build();
 * ```
 */
@CdkDslMarker
public class BlockPublicAccessOptionsDsl {
    private val cdkBuilder: BlockPublicAccessOptions.Builder = BlockPublicAccessOptions.builder()

    /** @param blockPublicAcls Whether to block public ACLs. */
    public fun blockPublicAcls(blockPublicAcls: Boolean) {
        cdkBuilder.blockPublicAcls(blockPublicAcls)
    }

    /** @param blockPublicPolicy Whether to block public policy. */
    public fun blockPublicPolicy(blockPublicPolicy: Boolean) {
        cdkBuilder.blockPublicPolicy(blockPublicPolicy)
    }

    /** @param ignorePublicAcls Whether to ignore public ACLs. */
    public fun ignorePublicAcls(ignorePublicAcls: Boolean) {
        cdkBuilder.ignorePublicAcls(ignorePublicAcls)
    }

    /** @param restrictPublicBuckets Whether to restrict public access. */
    public fun restrictPublicBuckets(restrictPublicBuckets: Boolean) {
        cdkBuilder.restrictPublicBuckets(restrictPublicBuckets)
    }

    public fun build(): BlockPublicAccessOptions = cdkBuilder.build()
}
