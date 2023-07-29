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

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.s3.CfnStorageLens

/**
 * Specifies the use of server-side encryption using an AWS Key Management Service key (SSE-KMS) to
 * encrypt the delivered S3 Storage Lens metrics export file.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * SSEKMSProperty sSEKMSProperty = SSEKMSProperty.builder()
 * .keyId("keyId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-ssekms.html)
 */
@CdkDslMarker
public class CfnStorageLensSSEKMSPropertyDsl {
    private val cdkBuilder: CfnStorageLens.SSEKMSProperty.Builder =
        CfnStorageLens.SSEKMSProperty.builder()

    /**
     * @param keyId Specifies the Amazon Resource Name (ARN) of the customer managed AWS KMS key to
     *   use for encrypting the S3 Storage Lens metrics export file. Amazon S3 only supports
     *   symmetric encryption keys. For more information, see
     *   [Special-purpose keys](https://docs.aws.amazon.com/kms/latest/developerguide/key-types.html)
     *   in the *AWS Key Management Service Developer Guide* .
     */
    public fun keyId(keyId: String) {
        cdkBuilder.keyId(keyId)
    }

    public fun build(): CfnStorageLens.SSEKMSProperty = cdkBuilder.build()
}
