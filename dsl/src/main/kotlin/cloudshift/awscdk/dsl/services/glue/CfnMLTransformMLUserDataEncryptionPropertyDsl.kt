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

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.glue.CfnMLTransform

/**
 * The encryption-at-rest settings of the transform that apply to accessing user data.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * MLUserDataEncryptionProperty mLUserDataEncryptionProperty =
 * MLUserDataEncryptionProperty.builder()
 * .mlUserDataEncryptionMode("mlUserDataEncryptionMode")
 * // the properties below are optional
 * .kmsKeyId("kmsKeyId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-mluserdataencryption.html)
 */
@CdkDslMarker
public class CfnMLTransformMLUserDataEncryptionPropertyDsl {
    private val cdkBuilder: CfnMLTransform.MLUserDataEncryptionProperty.Builder =
        CfnMLTransform.MLUserDataEncryptionProperty.builder()

    /** @param kmsKeyId The ID for the customer-provided KMS key. */
    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * @param mlUserDataEncryptionMode The encryption mode applied to user data. Valid values are:.
     * * DISABLED: encryption is disabled.
     * * SSEKMS: use of server-side encryption with AWS Key Management Service (SSE-KMS) for user
     *   data stored in Amazon S3.
     */
    public fun mlUserDataEncryptionMode(mlUserDataEncryptionMode: String) {
        cdkBuilder.mlUserDataEncryptionMode(mlUserDataEncryptionMode)
    }

    public fun build(): CfnMLTransform.MLUserDataEncryptionProperty = cdkBuilder.build()
}
