@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Properties for defining a `CfnIntegration`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.rds.*;
 * CfnIntegrationProps cfnIntegrationProps = CfnIntegrationProps.builder()
 * .sourceArn("sourceArn")
 * .targetArn("targetArn")
 * // the properties below are optional
 * .additionalEncryptionContext(Map.of(
 * "additionalEncryptionContextKey", "additionalEncryptionContext"))
 * .dataFilter("dataFilter")
 * .description("description")
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
public interface CfnIntegrationProps {
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
   */
  public fun additionalEncryptionContext(): Any? = unwrap(this).getAdditionalEncryptionContext()

  /**
   * Data filters for the integration.
   *
   * These filters determine which tables from the source database are sent to the target Amazon
   * Redshift data warehouse.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-integration.html#cfn-rds-integration-datafilter)
   */
  public fun dataFilter(): String? = unwrap(this).getDataFilter()

  /**
   * A description of the integration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-integration.html#cfn-rds-integration-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the integration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-integration.html#cfn-rds-integration-integrationname)
   */
  public fun integrationName(): String? = unwrap(this).getIntegrationName()

  /**
   * The AWS Key Management System ( AWS KMS) key identifier for the key to use to encrypt the
   * integration.
   *
   * If you don't specify an encryption key, RDS uses a default AWS owned key.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-integration.html#cfn-rds-integration-kmskeyid)
   */
  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * The Amazon Resource Name (ARN) of the database to use as the source for replication.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-integration.html#cfn-rds-integration-sourcearn)
   */
  public fun sourceArn(): String

  /**
   * A list of tags.
   *
   * For more information, see [Tagging Amazon RDS
   * Resources](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html) in the
   * *Amazon RDS User Guide.* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-integration.html#cfn-rds-integration-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The ARN of the Redshift data warehouse to use as the target for replication.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-integration.html#cfn-rds-integration-targetarn)
   */
  public fun targetArn(): String

  /**
   * A builder for [CfnIntegrationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param additionalEncryptionContext An optional set of non-secret key–value pairs that
     * contains additional contextual information about the data.
     * For more information, see [Encryption
     * context](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context) in
     * the *AWS Key Management Service Developer Guide* .
     *
     * You can only include this parameter if you specify the `KMSKeyId` parameter.
     */
    public fun additionalEncryptionContext(additionalEncryptionContext: IResolvable)

    /**
     * @param additionalEncryptionContext An optional set of non-secret key–value pairs that
     * contains additional contextual information about the data.
     * For more information, see [Encryption
     * context](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context) in
     * the *AWS Key Management Service Developer Guide* .
     *
     * You can only include this parameter if you specify the `KMSKeyId` parameter.
     */
    public fun additionalEncryptionContext(additionalEncryptionContext: Map<String, String>)

    /**
     * @param dataFilter Data filters for the integration.
     * These filters determine which tables from the source database are sent to the target Amazon
     * Redshift data warehouse.
     */
    public fun dataFilter(dataFilter: String)

    /**
     * @param description A description of the integration.
     */
    public fun description(description: String)

    /**
     * @param integrationName The name of the integration.
     */
    public fun integrationName(integrationName: String)

    /**
     * @param kmsKeyId The AWS Key Management System ( AWS KMS) key identifier for the key to use to
     * encrypt the integration.
     * If you don't specify an encryption key, RDS uses a default AWS owned key.
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * @param sourceArn The Amazon Resource Name (ARN) of the database to use as the source for
     * replication. 
     */
    public fun sourceArn(sourceArn: String)

    /**
     * @param tags A list of tags.
     * For more information, see [Tagging Amazon RDS
     * Resources](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html) in the
     * *Amazon RDS User Guide.* .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of tags.
     * For more information, see [Tagging Amazon RDS
     * Resources](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html) in the
     * *Amazon RDS User Guide.* .
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param targetArn The ARN of the Redshift data warehouse to use as the target for replication.
     * 
     */
    public fun targetArn(targetArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.CfnIntegrationProps.Builder =
        software.amazon.awscdk.services.rds.CfnIntegrationProps.builder()

    /**
     * @param additionalEncryptionContext An optional set of non-secret key–value pairs that
     * contains additional contextual information about the data.
     * For more information, see [Encryption
     * context](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context) in
     * the *AWS Key Management Service Developer Guide* .
     *
     * You can only include this parameter if you specify the `KMSKeyId` parameter.
     */
    override fun additionalEncryptionContext(additionalEncryptionContext: IResolvable) {
      cdkBuilder.additionalEncryptionContext(additionalEncryptionContext.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param additionalEncryptionContext An optional set of non-secret key–value pairs that
     * contains additional contextual information about the data.
     * For more information, see [Encryption
     * context](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context) in
     * the *AWS Key Management Service Developer Guide* .
     *
     * You can only include this parameter if you specify the `KMSKeyId` parameter.
     */
    override fun additionalEncryptionContext(additionalEncryptionContext: Map<String, String>) {
      cdkBuilder.additionalEncryptionContext(additionalEncryptionContext)
    }

    /**
     * @param dataFilter Data filters for the integration.
     * These filters determine which tables from the source database are sent to the target Amazon
     * Redshift data warehouse.
     */
    override fun dataFilter(dataFilter: String) {
      cdkBuilder.dataFilter(dataFilter)
    }

    /**
     * @param description A description of the integration.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param integrationName The name of the integration.
     */
    override fun integrationName(integrationName: String) {
      cdkBuilder.integrationName(integrationName)
    }

    /**
     * @param kmsKeyId The AWS Key Management System ( AWS KMS) key identifier for the key to use to
     * encrypt the integration.
     * If you don't specify an encryption key, RDS uses a default AWS owned key.
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * @param sourceArn The Amazon Resource Name (ARN) of the database to use as the source for
     * replication. 
     */
    override fun sourceArn(sourceArn: String) {
      cdkBuilder.sourceArn(sourceArn)
    }

    /**
     * @param tags A list of tags.
     * For more information, see [Tagging Amazon RDS
     * Resources](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html) in the
     * *Amazon RDS User Guide.* .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags A list of tags.
     * For more information, see [Tagging Amazon RDS
     * Resources](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html) in the
     * *Amazon RDS User Guide.* .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param targetArn The ARN of the Redshift data warehouse to use as the target for replication.
     * 
     */
    override fun targetArn(targetArn: String) {
      cdkBuilder.targetArn(targetArn)
    }

    public fun build(): software.amazon.awscdk.services.rds.CfnIntegrationProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.rds.CfnIntegrationProps,
  ) : CdkObject(cdkObject), CfnIntegrationProps {
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
     */
    override fun additionalEncryptionContext(): Any? = unwrap(this).getAdditionalEncryptionContext()

    /**
     * Data filters for the integration.
     *
     * These filters determine which tables from the source database are sent to the target Amazon
     * Redshift data warehouse.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-integration.html#cfn-rds-integration-datafilter)
     */
    override fun dataFilter(): String? = unwrap(this).getDataFilter()

    /**
     * A description of the integration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-integration.html#cfn-rds-integration-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the integration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-integration.html#cfn-rds-integration-integrationname)
     */
    override fun integrationName(): String? = unwrap(this).getIntegrationName()

    /**
     * The AWS Key Management System ( AWS KMS) key identifier for the key to use to encrypt the
     * integration.
     *
     * If you don't specify an encryption key, RDS uses a default AWS owned key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-integration.html#cfn-rds-integration-kmskeyid)
     */
    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * The Amazon Resource Name (ARN) of the database to use as the source for replication.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-integration.html#cfn-rds-integration-sourcearn)
     */
    override fun sourceArn(): String = unwrap(this).getSourceArn()

    /**
     * A list of tags.
     *
     * For more information, see [Tagging Amazon RDS
     * Resources](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html) in the
     * *Amazon RDS User Guide.* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-integration.html#cfn-rds-integration-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The ARN of the Redshift data warehouse to use as the target for replication.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-integration.html#cfn-rds-integration-targetarn)
     */
    override fun targetArn(): String = unwrap(this).getTargetArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnIntegrationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnIntegrationProps):
        CfnIntegrationProps = CdkObjectWrappers.wrap(cdkObject) as? CfnIntegrationProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnIntegrationProps):
        software.amazon.awscdk.services.rds.CfnIntegrationProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.rds.CfnIntegrationProps
  }
}
