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
import software.amazon.awscdk.services.s3.Location
import kotlin.String

@CdkDslMarker
public class LocationDsl {
    private val cdkBuilder: Location.Builder = Location.builder()

    public fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
    }

    public fun objectKey(objectKey: String) {
        cdkBuilder.objectKey(objectKey)
    }

    public fun objectVersion(objectVersion: String) {
        cdkBuilder.objectVersion(objectVersion)
    }

    public fun build(): Location = cdkBuilder.build()
}
