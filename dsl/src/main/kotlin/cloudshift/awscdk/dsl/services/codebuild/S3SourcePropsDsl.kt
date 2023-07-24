@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.codebuild.S3SourceProps
import software.amazon.awscdk.services.s3.IBucket
import kotlin.String

/**
 * Construction properties for `S3Source`.
 *
 * Example:
 *
 * ```
 * Bucket bucket = new Bucket(this, "MyBucket");
 * Project.Builder.create(this, "MyProject")
 * .source(Source.s3(S3SourceProps.builder()
 * .bucket(bucket)
 * .path("path/to/file.zip")
 * .build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class S3SourcePropsDsl {
    private val cdkBuilder: S3SourceProps.Builder = S3SourceProps.builder()

    /**
     * @param bucket the value to be set.
     */
    public fun bucket(bucket: IBucket) {
        cdkBuilder.bucket(bucket)
    }

    /**
     * @param identifier The source identifier.
     * This property is required on secondary sources.
     */
    public fun identifier(identifier: String) {
        cdkBuilder.identifier(identifier)
    }

    /**
     * @param path the value to be set.
     */
    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    /**
     * @param version The version ID of the object that represents the build input ZIP file to use.
     */
    public fun version(version: String) {
        cdkBuilder.version(version)
    }

    public fun build(): S3SourceProps = cdkBuilder.build()
}
