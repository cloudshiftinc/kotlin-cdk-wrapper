@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A zero-ETL integration with Amazon Redshift.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.rds.*;
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
public open class CfnIntegration internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.rds.CfnIntegration,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  /**
   * An optional set of non-secret key–value pairs that contains additional contextual information
   * about the data.
   */
  public open fun additionalEncryptionContext(): Any? =
      unwrap(this).getAdditionalEncryptionContext()

  /**
   * An optional set of non-secret key–value pairs that contains additional contextual information
   * about the data.
   */
  public open fun additionalEncryptionContext(`value`: IResolvable) {
    unwrap(this).setAdditionalEncryptionContext(`value`.let(IResolvable::unwrap))
  }

  /**
   * An optional set of non-secret key–value pairs that contains additional contextual information
   * about the data.
   */
  public open fun additionalEncryptionContext(`value`: Map<String, String>) {
    unwrap(this).setAdditionalEncryptionContext(`value`)
  }

  /**
   * The time when the integration was created, in Universal Coordinated Time (UTC).
   */
  public open fun attrCreateTime(): String = unwrap(this).getAttrCreateTime()

  /**
   * The ARN of the integration.
   */
  public open fun attrIntegrationArn(): String = unwrap(this).getAttrIntegrationArn()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the integration.
   */
  public open fun integrationName(): String? = unwrap(this).getIntegrationName()

  /**
   * The name of the integration.
   */
  public open fun integrationName(`value`: String) {
    unwrap(this).setIntegrationName(`value`)
  }

  /**
   * The AWS Key Management System ( AWS KMS) key identifier for the key to use to encrypt the
   * integration.
   */
  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * The AWS Key Management System ( AWS KMS) key identifier for the key to use to encrypt the
   * integration.
   */
  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the database to use as the source for replication.
   */
  public open fun sourceArn(): String = unwrap(this).getSourceArn()

  /**
   * The Amazon Resource Name (ARN) of the database to use as the source for replication.
   */
  public open fun sourceArn(`value`: String) {
    unwrap(this).setSourceArn(`value`)
  }

  /**
   * A list of tags.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A list of tags.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * A list of tags.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * The ARN of the Redshift data warehouse to use as the target for replication.
   */
  public open fun targetArn(): String = unwrap(this).getTargetArn()

  /**
   * The ARN of the Redshift data warehouse to use as the target for replication.
   */
  public open fun targetArn(`value`: String) {
    unwrap(this).setTargetArn(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.rds.CfnIntegration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * An optional set of non-secret key–value pairs that contains additional contextual information
     * about the data.
     *
     * For more information, see [Encryption
     * context](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context) in
     * the *AWS Key Management Service Developer Guide* .
     *
     * You can only include this parameter if you specify the `KMSKeyId` parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-integration.html#cfn-rds-integration-additionalencryptioncontext)
     * @param additionalEncryptionContext An optional set of non-secret key–value pairs that
     * contains additional contextual information about the data. 
     */
    public fun additionalEncryptionContext(additionalEncryptionContext: IResolvable)

    /**
     * An optional set of non-secret key–value pairs that contains additional contextual information
     * about the data.
     *
     * For more information, see [Encryption
     * context](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context) in
     * the *AWS Key Management Service Developer Guide* .
     *
     * You can only include this parameter if you specify the `KMSKeyId` parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-integration.html#cfn-rds-integration-additionalencryptioncontext)
     * @param additionalEncryptionContext An optional set of non-secret key–value pairs that
     * contains additional contextual information about the data. 
     */
    public fun additionalEncryptionContext(additionalEncryptionContext: Map<String, String>)

    /**
     * The name of the integration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-integration.html#cfn-rds-integration-integrationname)
     * @param integrationName The name of the integration. 
     */
    public fun integrationName(integrationName: String)

    /**
     * The AWS Key Management System ( AWS KMS) key identifier for the key to use to encrypt the
     * integration.
     *
     * If you don't specify an encryption key, RDS uses a default AWS owned key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-integration.html#cfn-rds-integration-kmskeyid)
     * @param kmsKeyId The AWS Key Management System ( AWS KMS) key identifier for the key to use to
     * encrypt the integration. 
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * The Amazon Resource Name (ARN) of the database to use as the source for replication.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-integration.html#cfn-rds-integration-sourcearn)
     * @param sourceArn The Amazon Resource Name (ARN) of the database to use as the source for
     * replication. 
     */
    public fun sourceArn(sourceArn: String)

    /**
     * A list of tags.
     *
     * For more information, see [Tagging Amazon RDS
     * Resources](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html) in the
     * *Amazon RDS User Guide.* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-integration.html#cfn-rds-integration-tags)
     * @param tags A list of tags. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A list of tags.
     *
     * For more information, see [Tagging Amazon RDS
     * Resources](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html) in the
     * *Amazon RDS User Guide.* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-integration.html#cfn-rds-integration-tags)
     * @param tags A list of tags. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The ARN of the Redshift data warehouse to use as the target for replication.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-integration.html#cfn-rds-integration-targetarn)
     * @param targetArn The ARN of the Redshift data warehouse to use as the target for replication.
     * 
     */
    public fun targetArn(targetArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.CfnIntegration.Builder =
        software.amazon.awscdk.services.rds.CfnIntegration.Builder.create(scope, id)

    /**
     * An optional set of non-secret key–value pairs that contains additional contextual information
     * about the data.
     *
     * For more information, see [Encryption
     * context](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context) in
     * the *AWS Key Management Service Developer Guide* .
     *
     * You can only include this parameter if you specify the `KMSKeyId` parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-integration.html#cfn-rds-integration-additionalencryptioncontext)
     * @param additionalEncryptionContext An optional set of non-secret key–value pairs that
     * contains additional contextual information about the data. 
     */
    override fun additionalEncryptionContext(additionalEncryptionContext: IResolvable) {
      cdkBuilder.additionalEncryptionContext(additionalEncryptionContext.let(IResolvable::unwrap))
    }

    /**
     * An optional set of non-secret key–value pairs that contains additional contextual information
     * about the data.
     *
     * For more information, see [Encryption
     * context](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context) in
     * the *AWS Key Management Service Developer Guide* .
     *
     * You can only include this parameter if you specify the `KMSKeyId` parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-integration.html#cfn-rds-integration-additionalencryptioncontext)
     * @param additionalEncryptionContext An optional set of non-secret key–value pairs that
     * contains additional contextual information about the data. 
     */
    override fun additionalEncryptionContext(additionalEncryptionContext: Map<String, String>) {
      cdkBuilder.additionalEncryptionContext(additionalEncryptionContext)
    }

    /**
     * The name of the integration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-integration.html#cfn-rds-integration-integrationname)
     * @param integrationName The name of the integration. 
     */
    override fun integrationName(integrationName: String) {
      cdkBuilder.integrationName(integrationName)
    }

    /**
     * The AWS Key Management System ( AWS KMS) key identifier for the key to use to encrypt the
     * integration.
     *
     * If you don't specify an encryption key, RDS uses a default AWS owned key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-integration.html#cfn-rds-integration-kmskeyid)
     * @param kmsKeyId The AWS Key Management System ( AWS KMS) key identifier for the key to use to
     * encrypt the integration. 
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * The Amazon Resource Name (ARN) of the database to use as the source for replication.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-integration.html#cfn-rds-integration-sourcearn)
     * @param sourceArn The Amazon Resource Name (ARN) of the database to use as the source for
     * replication. 
     */
    override fun sourceArn(sourceArn: String) {
      cdkBuilder.sourceArn(sourceArn)
    }

    /**
     * A list of tags.
     *
     * For more information, see [Tagging Amazon RDS
     * Resources](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html) in the
     * *Amazon RDS User Guide.* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-integration.html#cfn-rds-integration-tags)
     * @param tags A list of tags. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * A list of tags.
     *
     * For more information, see [Tagging Amazon RDS
     * Resources](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html) in the
     * *Amazon RDS User Guide.* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-integration.html#cfn-rds-integration-tags)
     * @param tags A list of tags. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The ARN of the Redshift data warehouse to use as the target for replication.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-integration.html#cfn-rds-integration-targetarn)
     * @param targetArn The ARN of the Redshift data warehouse to use as the target for replication.
     * 
     */
    override fun targetArn(targetArn: String) {
      cdkBuilder.targetArn(targetArn)
    }

    public fun build(): software.amazon.awscdk.services.rds.CfnIntegration = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.rds.CfnIntegration.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnIntegration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnIntegration(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnIntegration): CfnIntegration
        = CfnIntegration(cdkObject)

    internal fun unwrap(wrapped: CfnIntegration): software.amazon.awscdk.services.rds.CfnIntegration
        = wrapped.cdkObject
  }
}
