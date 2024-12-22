@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.redshift

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
 * Describes a zero-ETL integration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.redshift.*;
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-integration.html)
 */
public open class CfnIntegration(
  cdkObject: software.amazon.awscdk.services.redshift.CfnIntegration,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnIntegrationProps,
  ) :
      this(software.amazon.awscdk.services.redshift.CfnIntegration(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnIntegrationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnIntegrationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnIntegrationProps(props)
  )

  /**
   * The encryption context for the integration.
   */
  public open fun additionalEncryptionContext(): Any? =
      unwrap(this).getAdditionalEncryptionContext()

  /**
   * The encryption context for the integration.
   */
  public open fun additionalEncryptionContext(`value`: IResolvable) {
    unwrap(this).setAdditionalEncryptionContext(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The encryption context for the integration.
   */
  public open fun additionalEncryptionContext(`value`: Map<String, String>) {
    unwrap(this).setAdditionalEncryptionContext(`value`)
  }

  /**
   * The time (UTC) when the integration was created.
   */
  public open fun attrCreateTime(): String = unwrap(this).getAttrCreateTime()

  /**
   * The Amazon Resource Name (ARN) of the integration.
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
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
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
   * The AWS Key Management Service ( AWS KMS ) key identifier for the key used to encrypt the
   * integration.
   */
  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * The AWS Key Management Service ( AWS KMS ) key identifier for the key used to encrypt the
   * integration.
   */
  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the database used as the source for replication.
   */
  public open fun sourceArn(): String = unwrap(this).getSourceArn()

  /**
   * The Amazon Resource Name (ARN) of the database used as the source for replication.
   */
  public open fun sourceArn(`value`: String) {
    unwrap(this).setSourceArn(`value`)
  }

  /**
   * The list of tags associated with the integration.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The list of tags associated with the integration.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The list of tags associated with the integration.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * The Amazon Resource Name (ARN) of the Amazon Redshift data warehouse to use as the target for
   * replication.
   */
  public open fun targetArn(): String = unwrap(this).getTargetArn()

  /**
   * The Amazon Resource Name (ARN) of the Amazon Redshift data warehouse to use as the target for
   * replication.
   */
  public open fun targetArn(`value`: String) {
    unwrap(this).setTargetArn(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.redshift.CfnIntegration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The encryption context for the integration.
     *
     * For more information, see [Encryption
     * context](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context) in
     * the *AWS Key Management Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-integration.html#cfn-redshift-integration-additionalencryptioncontext)
     * @param additionalEncryptionContext The encryption context for the integration. 
     */
    public fun additionalEncryptionContext(additionalEncryptionContext: IResolvable)

    /**
     * The encryption context for the integration.
     *
     * For more information, see [Encryption
     * context](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context) in
     * the *AWS Key Management Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-integration.html#cfn-redshift-integration-additionalencryptioncontext)
     * @param additionalEncryptionContext The encryption context for the integration. 
     */
    public fun additionalEncryptionContext(additionalEncryptionContext: Map<String, String>)

    /**
     * The name of the integration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-integration.html#cfn-redshift-integration-integrationname)
     * @param integrationName The name of the integration. 
     */
    public fun integrationName(integrationName: String)

    /**
     * The AWS Key Management Service ( AWS KMS ) key identifier for the key used to encrypt the
     * integration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-integration.html#cfn-redshift-integration-kmskeyid)
     * @param kmsKeyId The AWS Key Management Service ( AWS KMS ) key identifier for the key used to
     * encrypt the integration. 
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * The Amazon Resource Name (ARN) of the database used as the source for replication.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-integration.html#cfn-redshift-integration-sourcearn)
     * @param sourceArn The Amazon Resource Name (ARN) of the database used as the source for
     * replication. 
     */
    public fun sourceArn(sourceArn: String)

    /**
     * The list of tags associated with the integration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-integration.html#cfn-redshift-integration-tags)
     * @param tags The list of tags associated with the integration. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The list of tags associated with the integration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-integration.html#cfn-redshift-integration-tags)
     * @param tags The list of tags associated with the integration. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The Amazon Resource Name (ARN) of the Amazon Redshift data warehouse to use as the target for
     * replication.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-integration.html#cfn-redshift-integration-targetarn)
     * @param targetArn The Amazon Resource Name (ARN) of the Amazon Redshift data warehouse to use
     * as the target for replication. 
     */
    public fun targetArn(targetArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.redshift.CfnIntegration.Builder =
        software.amazon.awscdk.services.redshift.CfnIntegration.Builder.create(scope, id)

    /**
     * The encryption context for the integration.
     *
     * For more information, see [Encryption
     * context](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context) in
     * the *AWS Key Management Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-integration.html#cfn-redshift-integration-additionalencryptioncontext)
     * @param additionalEncryptionContext The encryption context for the integration. 
     */
    override fun additionalEncryptionContext(additionalEncryptionContext: IResolvable) {
      cdkBuilder.additionalEncryptionContext(additionalEncryptionContext.let(IResolvable.Companion::unwrap))
    }

    /**
     * The encryption context for the integration.
     *
     * For more information, see [Encryption
     * context](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context) in
     * the *AWS Key Management Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-integration.html#cfn-redshift-integration-additionalencryptioncontext)
     * @param additionalEncryptionContext The encryption context for the integration. 
     */
    override fun additionalEncryptionContext(additionalEncryptionContext: Map<String, String>) {
      cdkBuilder.additionalEncryptionContext(additionalEncryptionContext)
    }

    /**
     * The name of the integration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-integration.html#cfn-redshift-integration-integrationname)
     * @param integrationName The name of the integration. 
     */
    override fun integrationName(integrationName: String) {
      cdkBuilder.integrationName(integrationName)
    }

    /**
     * The AWS Key Management Service ( AWS KMS ) key identifier for the key used to encrypt the
     * integration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-integration.html#cfn-redshift-integration-kmskeyid)
     * @param kmsKeyId The AWS Key Management Service ( AWS KMS ) key identifier for the key used to
     * encrypt the integration. 
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * The Amazon Resource Name (ARN) of the database used as the source for replication.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-integration.html#cfn-redshift-integration-sourcearn)
     * @param sourceArn The Amazon Resource Name (ARN) of the database used as the source for
     * replication. 
     */
    override fun sourceArn(sourceArn: String) {
      cdkBuilder.sourceArn(sourceArn)
    }

    /**
     * The list of tags associated with the integration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-integration.html#cfn-redshift-integration-tags)
     * @param tags The list of tags associated with the integration. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The list of tags associated with the integration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-integration.html#cfn-redshift-integration-tags)
     * @param tags The list of tags associated with the integration. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The Amazon Resource Name (ARN) of the Amazon Redshift data warehouse to use as the target for
     * replication.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-integration.html#cfn-redshift-integration-targetarn)
     * @param targetArn The Amazon Resource Name (ARN) of the Amazon Redshift data warehouse to use
     * as the target for replication. 
     */
    override fun targetArn(targetArn: String) {
      cdkBuilder.targetArn(targetArn)
    }

    public fun build(): software.amazon.awscdk.services.redshift.CfnIntegration = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.redshift.CfnIntegration.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnIntegration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnIntegration(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.redshift.CfnIntegration):
        CfnIntegration = CfnIntegration(cdkObject)

    internal fun unwrap(wrapped: CfnIntegration):
        software.amazon.awscdk.services.redshift.CfnIntegration = wrapped.cdkObject as
        software.amazon.awscdk.services.redshift.CfnIntegration
  }
}
