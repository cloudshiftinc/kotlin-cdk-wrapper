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

package io.cloudshiftdev.awscdkdsl.services.synthetics

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.s3.IBucket
import software.amazon.awscdk.services.synthetics.ArtifactsBucketLocation

/**
 * Options for specifying the s3 location that stores the data of each canary run.
 *
 * The artifacts bucket location **cannot** be updated once the canary is created.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * import software.amazon.awscdk.services.synthetics.*;
 * Bucket bucket;
 * ArtifactsBucketLocation artifactsBucketLocation = ArtifactsBucketLocation.builder()
 * .bucket(bucket)
 * // the properties below are optional
 * .prefix("prefix")
 * .build();
 * ```
 */
@CdkDslMarker
public class ArtifactsBucketLocationDsl {
    private val cdkBuilder: ArtifactsBucketLocation.Builder = ArtifactsBucketLocation.builder()

    /** @param bucket The s3 location that stores the data of each run. */
    public fun bucket(bucket: IBucket) {
        cdkBuilder.bucket(bucket)
    }

    /**
     * @param prefix The S3 bucket prefix. Specify this if you want a more specific path within the
     *   artifacts bucket.
     */
    public fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
    }

    public fun build(): ArtifactsBucketLocation = cdkBuilder.build()
}
