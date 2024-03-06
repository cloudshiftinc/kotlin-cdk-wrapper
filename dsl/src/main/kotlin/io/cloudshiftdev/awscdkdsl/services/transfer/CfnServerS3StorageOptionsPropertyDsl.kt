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

package io.cloudshiftdev.awscdkdsl.services.transfer

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.transfer.CfnServer

/**
 * The Amazon S3 storage options that are configured for your server.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.transfer.*;
 * S3StorageOptionsProperty s3StorageOptionsProperty = S3StorageOptionsProperty.builder()
 * .directoryListingOptimization("directoryListingOptimization")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-s3storageoptions.html)
 */
@CdkDslMarker
public class CfnServerS3StorageOptionsPropertyDsl {
    private val cdkBuilder: CfnServer.S3StorageOptionsProperty.Builder =
        CfnServer.S3StorageOptionsProperty.builder()

    /**
     * @param directoryListingOptimization Specifies whether or not performance for your Amazon S3
     *   directories is optimized. This is disabled by default. By default, home directory mappings
     *   have a `TYPE` of `DIRECTORY` . If you enable this option, you would then need to explicitly
     *   set the `HomeDirectoryMapEntry` `Type` to `FILE` if you want a mapping to have a file
     *   target.
     */
    public fun directoryListingOptimization(directoryListingOptimization: String) {
        cdkBuilder.directoryListingOptimization(directoryListingOptimization)
    }

    public fun build(): CfnServer.S3StorageOptionsProperty = cdkBuilder.build()
}
