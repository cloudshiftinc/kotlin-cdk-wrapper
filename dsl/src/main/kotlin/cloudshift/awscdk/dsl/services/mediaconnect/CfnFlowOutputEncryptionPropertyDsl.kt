@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.mediaconnect

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.mediaconnect.CfnFlowOutput
import kotlin.String

/**
 * Information about the encryption of the flow.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediaconnect.*;
 * EncryptionProperty encryptionProperty = EncryptionProperty.builder()
 * .roleArn("roleArn")
 * .secretArn("secretArn")
 * // the properties below are optional
 * .algorithm("algorithm")
 * .keyType("keyType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowoutput-encryption.html)
 */
@CdkDslMarker
public class CfnFlowOutputEncryptionPropertyDsl {
    private val cdkBuilder: CfnFlowOutput.EncryptionProperty.Builder =
        CfnFlowOutput.EncryptionProperty.builder()

    /**
     * @param algorithm The type of algorithm that is used for static key encryption (such as aes128,
     * aes192, or aes256).
     * If you are using SPEKE or SRT-password encryption, this property must be left blank.
     */
    public fun algorithm(algorithm: String) {
        cdkBuilder.algorithm(algorithm)
    }

    /**
     * @param keyType The type of key that is used for the encryption.
     * If you don't specify a `keyType` value, the service uses the default setting ( `static-key` ).
     * Valid key types are: `static-key` , `speke` , and `srt-password` .
     */
    public fun keyType(keyType: String) {
        cdkBuilder.keyType(keyType)
    }

    /**
     * @param roleArn The Amazon Resource Name (ARN) of the role that you created during setup (when
     * you set up MediaConnect as a trusted entity).
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param secretArn The ARN of the secret that you created in AWS Secrets Manager to store the
     * encryption key.
     */
    public fun secretArn(secretArn: String) {
        cdkBuilder.secretArn(secretArn)
    }

    public fun build(): CfnFlowOutput.EncryptionProperty = cdkBuilder.build()
}
