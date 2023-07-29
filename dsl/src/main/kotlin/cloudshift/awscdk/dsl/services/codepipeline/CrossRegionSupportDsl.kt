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

package cloudshift.awscdk.dsl.services.codepipeline

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Stack
import software.amazon.awscdk.services.codepipeline.CrossRegionSupport
import software.amazon.awscdk.services.s3.IBucket

/**
 * An interface representing resources generated in order to support the cross-region capabilities
 * of CodePipeline.
 *
 * You get instances of this interface from the `Pipeline#crossRegionSupport` property.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.codepipeline.*;
 * import software.amazon.awscdk.services.s3.*;
 * Bucket bucket;
 * Stack stack;
 * CrossRegionSupport crossRegionSupport = CrossRegionSupport.builder()
 * .replicationBucket(bucket)
 * .stack(stack)
 * .build();
 * ```
 */
@CdkDslMarker
public class CrossRegionSupportDsl {
    private val cdkBuilder: CrossRegionSupport.Builder = CrossRegionSupport.builder()

    /**
     * @param replicationBucket The replication Bucket used by CodePipeline to operate in this
     *   region.
     *
     * Belongs to `stack`.
     */
    public fun replicationBucket(replicationBucket: IBucket) {
        cdkBuilder.replicationBucket(replicationBucket)
    }

    /**
     * @param stack The Stack that has been created to house the replication Bucket required for
     *   this region.
     */
    public fun stack(stack: Stack) {
        cdkBuilder.stack(stack)
    }

    public fun build(): CrossRegionSupport = cdkBuilder.build()
}
