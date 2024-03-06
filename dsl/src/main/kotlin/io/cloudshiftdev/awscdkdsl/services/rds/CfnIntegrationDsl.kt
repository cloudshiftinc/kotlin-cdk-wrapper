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
import software.amazon.awscdk.services.rds.CfnIntegration
import software.constructs.Construct

/**
 * A zero-ETL integration with Amazon Redshift.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rds.*;
 * CfnIntegration cfnIntegration = CfnIntegration.Builder.create(this, "MyCfnIntegration")
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
public class CfnIntegrationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnIntegration.Builder = CfnIntegration.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * An optional set of non-secret key–value pairs that contains additional contextual information
     * about the data.
     *
     * For more information, see
     * [Encryption context](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context)
     * in the *AWS Key Management Service Developer Guide* .
     *
     * You can only include this parameter if you specify the `KMSKeyId` parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-integration.html#cfn-rds-integration-additionalencryptioncontext)
     *
     * @param additionalEncryptionContext An optional set of non-secret key–value pairs that
     *   contains additional contextual information about the data.
     */
    public fun additionalEncryptionContext(additionalEncryptionContext: Map<String, String>) {
        cdkBuilder.additionalEncryptionContext(additionalEncryptionContext)
    }

    /**
     * An optional set of non-secret key–value pairs that contains additional contextual information
     * about the data.
     *
     * For more information, see
     * [Encryption context](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context)
     * in the *AWS Key Management Service Developer Guide* .
     *
     * You can only include this parameter if you specify the `KMSKeyId` parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-integration.html#cfn-rds-integration-additionalencryptioncontext)
     *
     * @param additionalEncryptionContext An optional set of non-secret key–value pairs that
     *   contains additional contextual information about the data.
     */
    public fun additionalEncryptionContext(additionalEncryptionContext: IResolvable) {
        cdkBuilder.additionalEncryptionContext(additionalEncryptionContext)
    }

    /**
     * The name of the integration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-integration.html#cfn-rds-integration-integrationname)
     *
     * @param integrationName The name of the integration.
     */
    public fun integrationName(integrationName: String) {
        cdkBuilder.integrationName(integrationName)
    }

    /**
     * The AWS Key Management System ( AWS KMS) key identifier for the key to use to encrypt the
     * integration.
     *
     * If you don't specify an encryption key, RDS uses a default AWS owned key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-integration.html#cfn-rds-integration-kmskeyid)
     *
     * @param kmsKeyId The AWS Key Management System ( AWS KMS) key identifier for the key to use to
     *   encrypt the integration.
     */
    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * The Amazon Resource Name (ARN) of the database to use as the source for replication.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-integration.html#cfn-rds-integration-sourcearn)
     *
     * @param sourceArn The Amazon Resource Name (ARN) of the database to use as the source for
     *   replication.
     */
    public fun sourceArn(sourceArn: String) {
        cdkBuilder.sourceArn(sourceArn)
    }

    /**
     * A list of tags.
     *
     * For more information, see
     * [Tagging Amazon RDS Resources](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html)
     * in the *Amazon RDS User Guide.* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-integration.html#cfn-rds-integration-tags)
     *
     * @param tags A list of tags.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * A list of tags.
     *
     * For more information, see
     * [Tagging Amazon RDS Resources](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html)
     * in the *Amazon RDS User Guide.* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-integration.html#cfn-rds-integration-tags)
     *
     * @param tags A list of tags.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The ARN of the Redshift data warehouse to use as the target for replication.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-integration.html#cfn-rds-integration-targetarn)
     *
     * @param targetArn The ARN of the Redshift data warehouse to use as the target for replication.
     */
    public fun targetArn(targetArn: String) {
        cdkBuilder.targetArn(targetArn)
    }

    public fun build(): CfnIntegration {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
