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

package cloudshift.awscdk.dsl.services.codepipeline

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codepipeline.CfnPipeline

/**
 * Represents information about the key used to encrypt data in the artifact store, such as an AWS
 * Key Management Service ( AWS KMS) key.
 *
 * `EncryptionKey` is a property of the
 * [ArtifactStore](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstore.html)
 * property type.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codepipeline.*;
 * EncryptionKeyProperty encryptionKeyProperty = EncryptionKeyProperty.builder()
 * .id("id")
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-encryptionkey.html)
 */
@CdkDslMarker
public class CfnPipelineEncryptionKeyPropertyDsl {
    private val cdkBuilder: CfnPipeline.EncryptionKeyProperty.Builder =
        CfnPipeline.EncryptionKeyProperty.builder()

    /**
     * @param id The ID used to identify the key. For an AWS KMS key, you can use the key ID, the
     *   key ARN, or the alias ARN.
     *
     * Aliases are recognized only in the account that created the AWS KMS key. For cross-account
     * actions, you can only use the key ID or key ARN to identify the key. Cross-account actions
     * involve using the role from the other account (AccountB), so specifying the key ID will use
     * the key from the other account (AccountB).
     */
    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    /**
     * @param type The type of encryption key, such as an AWS KMS key. When creating or updating a
     *   pipeline, the value must be set to 'KMS'.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnPipeline.EncryptionKeyProperty = cdkBuilder.build()
}
