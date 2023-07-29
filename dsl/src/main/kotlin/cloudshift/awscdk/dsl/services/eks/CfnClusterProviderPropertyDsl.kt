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

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.eks.CfnCluster

/**
 * Identifies the AWS Key Management Service ( AWS KMS ) key used to encrypt the secrets.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.eks.*;
 * ProviderProperty providerProperty = ProviderProperty.builder()
 * .keyArn("keyArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-provider.html)
 */
@CdkDslMarker
public class CfnClusterProviderPropertyDsl {
    private val cdkBuilder: CfnCluster.ProviderProperty.Builder =
        CfnCluster.ProviderProperty.builder()

    /**
     * @param keyArn Amazon Resource Name (ARN) or alias of the KMS key. The KMS key must be
     *   symmetric and created in the same AWS Region as the cluster. If the KMS key was created in
     *   a different account, the
     *   [IAM principal](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html)
     *   must have access to the KMS key. For more information, see
     *   [Allowing users in other accounts to use a KMS key](https://docs.aws.amazon.com/kms/latest/developerguide/key-policy-modifying-external-accounts.html)
     *   in the *AWS Key Management Service Developer Guide* .
     */
    public fun keyArn(keyArn: String) {
        cdkBuilder.keyArn(keyArn)
    }

    public fun build(): CfnCluster.ProviderProperty = cdkBuilder.build()
}
