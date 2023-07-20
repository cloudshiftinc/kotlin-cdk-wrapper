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
import software.amazon.awscdk.services.s3.BlockPublicAccessOptions
import kotlin.Boolean

@CdkDslMarker
public class BlockPublicAccessOptionsDsl {
    private val cdkBuilder: BlockPublicAccessOptions.Builder = BlockPublicAccessOptions.builder()

    public fun blockPublicAcls(blockPublicAcls: Boolean) {
        cdkBuilder.blockPublicAcls(blockPublicAcls)
    }

    public fun blockPublicPolicy(blockPublicPolicy: Boolean) {
        cdkBuilder.blockPublicPolicy(blockPublicPolicy)
    }

    public fun ignorePublicAcls(ignorePublicAcls: Boolean) {
        cdkBuilder.ignorePublicAcls(ignorePublicAcls)
    }

    public fun restrictPublicBuckets(restrictPublicBuckets: Boolean) {
        cdkBuilder.restrictPublicBuckets(restrictPublicBuckets)
    }

    public fun build(): BlockPublicAccessOptions = cdkBuilder.build()
}
