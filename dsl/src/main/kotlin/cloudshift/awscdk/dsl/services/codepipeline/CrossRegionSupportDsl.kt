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

package cloudshift.awscdk.dsl.services.codepipeline

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Stack
import software.amazon.awscdk.services.codepipeline.CrossRegionSupport
import software.amazon.awscdk.services.s3.IBucket

@CdkDslMarker
public class CrossRegionSupportDsl {
    private val cdkBuilder: CrossRegionSupport.Builder = CrossRegionSupport.builder()

    public fun replicationBucket(replicationBucket: IBucket) {
        cdkBuilder.replicationBucket(replicationBucket)
    }

    public fun stack(stack: Stack) {
        cdkBuilder.stack(stack)
    }

    public fun build(): CrossRegionSupport = cdkBuilder.build()
}
