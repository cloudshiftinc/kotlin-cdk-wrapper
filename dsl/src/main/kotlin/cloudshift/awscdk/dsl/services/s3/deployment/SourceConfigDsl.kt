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

package cloudshift.awscdk.dsl.services.s3.deployment

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.services.s3.IBucket
import software.amazon.awscdk.services.s3.deployment.SourceConfig

/**
 * Source information.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * import software.amazon.awscdk.services.s3.deployment.*;
 * Bucket bucket;
 * Object markers;
 * SourceConfig sourceConfig = SourceConfig.builder()
 * .bucket(bucket)
 * .zipObjectKey("zipObjectKey")
 * // the properties below are optional
 * .markers(Map.of(
 * "markersKey", markers))
 * .build();
 * ```
 */
@CdkDslMarker
public class SourceConfigDsl {
    private val cdkBuilder: SourceConfig.Builder = SourceConfig.builder()

    /** @param bucket The source bucket to deploy from. */
    public fun bucket(bucket: IBucket) {
        cdkBuilder.bucket(bucket)
    }

    /** @param markers A set of markers to substitute in the source content. */
    public fun markers(markers: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(markers)
        cdkBuilder.markers(builder.map)
    }

    /** @param markers A set of markers to substitute in the source content. */
    public fun markers(markers: Map<String, Any>) {
        cdkBuilder.markers(markers)
    }

    /** @param zipObjectKey An S3 object key in the source bucket that points to a zip file. */
    public fun zipObjectKey(zipObjectKey: String) {
        cdkBuilder.zipObjectKey(zipObjectKey)
    }

    public fun build(): SourceConfig = cdkBuilder.build()
}
