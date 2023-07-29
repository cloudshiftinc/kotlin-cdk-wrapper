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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnMLTransform

/**
 * The encryption-at-rest settings of the transform that apply to accessing user data.
 *
 * Machine learning transforms can access user data encrypted in Amazon S3 using KMS.
 *
 * Additionally, imported labels and trained transforms can now be encrypted using a customer
 * provided KMS key.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * TransformEncryptionProperty transformEncryptionProperty = TransformEncryptionProperty.builder()
 * .mlUserDataEncryption(MLUserDataEncryptionProperty.builder()
 * .mlUserDataEncryptionMode("mlUserDataEncryptionMode")
 * // the properties below are optional
 * .kmsKeyId("kmsKeyId")
 * .build())
 * .taskRunSecurityConfigurationName("taskRunSecurityConfigurationName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-transformencryption.html)
 */
@CdkDslMarker
public class CfnMLTransformTransformEncryptionPropertyDsl {
    private val cdkBuilder: CfnMLTransform.TransformEncryptionProperty.Builder =
        CfnMLTransform.TransformEncryptionProperty.builder()

    /**
     * @param mlUserDataEncryption The encryption-at-rest settings of the transform that apply to
     *   accessing user data.
     */
    public fun mlUserDataEncryption(mlUserDataEncryption: IResolvable) {
        cdkBuilder.mlUserDataEncryption(mlUserDataEncryption)
    }

    /**
     * @param mlUserDataEncryption The encryption-at-rest settings of the transform that apply to
     *   accessing user data.
     */
    public fun mlUserDataEncryption(
        mlUserDataEncryption: CfnMLTransform.MLUserDataEncryptionProperty
    ) {
        cdkBuilder.mlUserDataEncryption(mlUserDataEncryption)
    }

    /** @param taskRunSecurityConfigurationName The name of the security configuration. */
    public fun taskRunSecurityConfigurationName(taskRunSecurityConfigurationName: String) {
        cdkBuilder.taskRunSecurityConfigurationName(taskRunSecurityConfigurationName)
    }

    public fun build(): CfnMLTransform.TransformEncryptionProperty = cdkBuilder.build()
}
