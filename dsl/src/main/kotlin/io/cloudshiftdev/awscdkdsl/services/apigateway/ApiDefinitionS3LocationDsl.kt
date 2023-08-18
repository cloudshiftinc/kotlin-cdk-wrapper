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

package io.cloudshiftdev.awscdkdsl.services.apigateway

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apigateway.ApiDefinitionS3Location

/**
 * S3 location of the API definition file.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigateway.*;
 * ApiDefinitionS3Location apiDefinitionS3Location = ApiDefinitionS3Location.builder()
 * .bucket("bucket")
 * .key("key")
 * // the properties below are optional
 * .version("version")
 * .build();
 * ```
 */
@CdkDslMarker
public class ApiDefinitionS3LocationDsl {
    private val cdkBuilder: ApiDefinitionS3Location.Builder = ApiDefinitionS3Location.builder()

    /** @param bucket The S3 bucket. */
    public fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
    }

    /** @param key The S3 key. */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /** @param version An optional version. */
    public fun version(version: String) {
        cdkBuilder.version(version)
    }

    public fun build(): ApiDefinitionS3Location = cdkBuilder.build()
}
