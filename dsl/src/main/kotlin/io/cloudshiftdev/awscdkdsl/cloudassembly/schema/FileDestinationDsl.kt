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

package io.cloudshiftdev.awscdkdsl.cloudassembly.schema

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.cloudassembly.schema.FileDestination

/**
 * Where in S3 a file asset needs to be published.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.cloudassembly.schema.*;
 * FileDestination fileDestination = FileDestination.builder()
 * .bucketName("bucketName")
 * .objectKey("objectKey")
 * // the properties below are optional
 * .assumeRoleArn("assumeRoleArn")
 * .assumeRoleExternalId("assumeRoleExternalId")
 * .region("region")
 * .build();
 * ```
 */
@CdkDslMarker
public class FileDestinationDsl {
    private val cdkBuilder: FileDestination.Builder = FileDestination.builder()

    /** @param assumeRoleArn The role that needs to be assumed while publishing this asset. */
    public fun assumeRoleArn(assumeRoleArn: String) {
        cdkBuilder.assumeRoleArn(assumeRoleArn)
    }

    /**
     * @param assumeRoleExternalId The ExternalId that needs to be supplied while assuming this
     *   role.
     */
    public fun assumeRoleExternalId(assumeRoleExternalId: String) {
        cdkBuilder.assumeRoleExternalId(assumeRoleExternalId)
    }

    /** @param bucketName The name of the bucket. */
    public fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
    }

    /** @param objectKey The destination object key. */
    public fun objectKey(objectKey: String) {
        cdkBuilder.objectKey(objectKey)
    }

    /** @param region The region where this asset will need to be published. */
    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    public fun build(): FileDestination = cdkBuilder.build()
}
