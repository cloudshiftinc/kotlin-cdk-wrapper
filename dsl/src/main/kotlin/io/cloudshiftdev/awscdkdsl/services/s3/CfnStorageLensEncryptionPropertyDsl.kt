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

package io.cloudshiftdev.awscdkdsl.services.s3

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnStorageLens

/**
 * This resource contains the type of server-side encryption used to encrypt an Amazon S3 Storage
 * Lens metrics export.
 *
 * For valid values, see the
 * [StorageLensDataExportEncryption](https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_StorageLensDataExportEncryption.html)
 * in the *Amazon S3 API Reference* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * Object sses3;
 * EncryptionProperty encryptionProperty = EncryptionProperty.builder()
 * .ssekms(SSEKMSProperty.builder()
 * .keyId("keyId")
 * .build())
 * .sses3(sses3)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-encryption.html)
 */
@CdkDslMarker
public class CfnStorageLensEncryptionPropertyDsl {
    private val cdkBuilder: CfnStorageLens.EncryptionProperty.Builder =
        CfnStorageLens.EncryptionProperty.builder()

    /**
     * @param ssekms Specifies the use of AWS Key Management Service keys (SSE-KMS) to encrypt the
     *   S3 Storage Lens metrics export file.
     */
    public fun ssekms(ssekms: IResolvable) {
        cdkBuilder.ssekms(ssekms)
    }

    /**
     * @param ssekms Specifies the use of AWS Key Management Service keys (SSE-KMS) to encrypt the
     *   S3 Storage Lens metrics export file.
     */
    public fun ssekms(ssekms: CfnStorageLens.SSEKMSProperty) {
        cdkBuilder.ssekms(ssekms)
    }

    /**
     * @param sses3 Specifies the use of an Amazon S3-managed key (SSE-S3) to encrypt the S3 Storage
     *   Lens metrics export file.
     */
    public fun sses3(sses3: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(sses3)
        cdkBuilder.sses3(builder.map)
    }

    /**
     * @param sses3 Specifies the use of an Amazon S3-managed key (SSE-S3) to encrypt the S3 Storage
     *   Lens metrics export file.
     */
    public fun sses3(sses3: Any) {
        cdkBuilder.sses3(sses3)
    }

    public fun build(): CfnStorageLens.EncryptionProperty = cdkBuilder.build()
}
