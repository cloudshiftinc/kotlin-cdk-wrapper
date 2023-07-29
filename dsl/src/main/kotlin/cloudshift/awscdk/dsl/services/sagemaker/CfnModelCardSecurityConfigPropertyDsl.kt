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

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnModelCard

/**
 * The security configuration used to protect model card data.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * SecurityConfigProperty securityConfigProperty = SecurityConfigProperty.builder()
 * .kmsKeyId("kmsKeyId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-securityconfig.html)
 */
@CdkDslMarker
public class CfnModelCardSecurityConfigPropertyDsl {
    private val cdkBuilder: CfnModelCard.SecurityConfigProperty.Builder =
        CfnModelCard.SecurityConfigProperty.builder()

    /**
     * @param kmsKeyId A AWS Key Management Service
     *   [key ID](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-id)
     *   used to encrypt a model card.
     */
    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    public fun build(): CfnModelCard.SecurityConfigProperty = cdkBuilder.build()
}
