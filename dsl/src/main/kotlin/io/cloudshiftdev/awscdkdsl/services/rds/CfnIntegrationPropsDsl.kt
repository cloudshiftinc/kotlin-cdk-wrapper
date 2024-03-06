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

package io.cloudshiftdev.awscdkdsl.services.rds

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.rds.CfnIntegrationProps

/**
 * Properties for defining a `CfnIntegration`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rds.*;
 * CfnIntegrationProps cfnIntegrationProps = CfnIntegrationProps.builder()
 * .sourceArn("sourceArn")
 * .targetArn("targetArn")
 * // the properties below are optional
 * .additionalEncryptionContext(Map.of(
 * "additionalEncryptionContextKey", "additionalEncryptionContext"))
 * .integrationName("integrationName")
 * .kmsKeyId("kmsKeyId")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-integration.html)
 */
@CdkDslMarker
public class CfnIntegrationPropsDsl {
    private val cdkBuilder: CfnIntegrationProps.Builder = CfnIntegrationProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param additionalEncryptionContext An optional set of non-secret key–value pairs that
     *   contains additional contextual information about the data. For more information, see
     *   [Encryption context](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context)
     *   in the *AWS Key Management Service Developer Guide* .
     *
     * You can only include this parameter if you specify the `KMSKeyId` parameter.
     */
    public fun additionalEncryptionContext(additionalEncryptionContext: Map<String, String>) {
        cdkBuilder.additionalEncryptionContext(additionalEncryptionContext)
    }

    /**
     * @param additionalEncryptionContext An optional set of non-secret key–value pairs that
     *   contains additional contextual information about the data. For more information, see
     *   [Encryption context](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context)
     *   in the *AWS Key Management Service Developer Guide* .
     *
     * You can only include this parameter if you specify the `KMSKeyId` parameter.
     */
    public fun additionalEncryptionContext(additionalEncryptionContext: IResolvable) {
        cdkBuilder.additionalEncryptionContext(additionalEncryptionContext)
    }

    /** @param integrationName The name of the integration. */
    public fun integrationName(integrationName: String) {
        cdkBuilder.integrationName(integrationName)
    }

    /**
     * @param kmsKeyId The AWS Key Management System ( AWS KMS) key identifier for the key to use to
     *   encrypt the integration. If you don't specify an encryption key, RDS uses a default AWS
     *   owned key.
     */
    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * @param sourceArn The Amazon Resource Name (ARN) of the database to use as the source for
     *   replication.
     */
    public fun sourceArn(sourceArn: String) {
        cdkBuilder.sourceArn(sourceArn)
    }

    /**
     * @param tags A list of tags. For more information, see
     *   [Tagging Amazon RDS Resources](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html)
     *   in the *Amazon RDS User Guide.* .
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags A list of tags. For more information, see
     *   [Tagging Amazon RDS Resources](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html)
     *   in the *Amazon RDS User Guide.* .
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param targetArn The ARN of the Redshift data warehouse to use as the target for replication.
     */
    public fun targetArn(targetArn: String) {
        cdkBuilder.targetArn(targetArn)
    }

    public fun build(): CfnIntegrationProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
