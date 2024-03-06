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

package io.cloudshiftdev.awscdkdsl.services.wisdom

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.wisdom.CfnKnowledgeBase

/**
 * The configuration information for the customer managed key used for encryption.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wisdom.*;
 * ServerSideEncryptionConfigurationProperty serverSideEncryptionConfigurationProperty =
 * ServerSideEncryptionConfigurationProperty.builder()
 * .kmsKeyId("kmsKeyId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-knowledgebase-serversideencryptionconfiguration.html)
 */
@CdkDslMarker
public class CfnKnowledgeBaseServerSideEncryptionConfigurationPropertyDsl {
    private val cdkBuilder: CfnKnowledgeBase.ServerSideEncryptionConfigurationProperty.Builder =
        CfnKnowledgeBase.ServerSideEncryptionConfigurationProperty.builder()

    /**
     * @param kmsKeyId The customer managed key used for encryption. This customer managed key must
     *   have a policy that allows `kms:CreateGrant` and `kms:DescribeKey` permissions to the IAM
     *   identity using the key to invoke Wisdom.
     *
     * For more information about setting up a customer managed key for Wisdom, see
     * [Enable Amazon Connect Wisdom for your instance](https://docs.aws.amazon.com/connect/latest/adminguide/enable-wisdom.html)
     * . For information about valid ID values, see
     * [Key identifiers (KeyId)](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id)
     * .
     */
    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    public fun build(): CfnKnowledgeBase.ServerSideEncryptionConfigurationProperty =
        cdkBuilder.build()
}
