@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kendra

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnIndex`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.kendra.*;
 * CfnIndexProps cfnIndexProps = CfnIndexProps.builder()
 * .edition("edition")
 * .name("name")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .capacityUnits(CapacityUnitsConfigurationProperty.builder()
 * .queryCapacityUnits(123)
 * .storageCapacityUnits(123)
 * .build())
 * .description("description")
 * .documentMetadataConfigurations(List.of(DocumentMetadataConfigurationProperty.builder()
 * .name("name")
 * .type("type")
 * // the properties below are optional
 * .relevance(RelevanceProperty.builder()
 * .duration("duration")
 * .freshness(false)
 * .importance(123)
 * .rankOrder("rankOrder")
 * .valueImportanceItems(List.of(ValueImportanceItemProperty.builder()
 * .key("key")
 * .value(123)
 * .build()))
 * .build())
 * .search(SearchProperty.builder()
 * .displayable(false)
 * .facetable(false)
 * .searchable(false)
 * .sortable(false)
 * .build())
 * .build()))
 * .serverSideEncryptionConfiguration(ServerSideEncryptionConfigurationProperty.builder()
 * .kmsKeyId("kmsKeyId")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .userContextPolicy("userContextPolicy")
 * .userTokenConfigurations(List.of(UserTokenConfigurationProperty.builder()
 * .jsonTokenTypeConfiguration(JsonTokenTypeConfigurationProperty.builder()
 * .groupAttributeField("groupAttributeField")
 * .userNameAttributeField("userNameAttributeField")
 * .build())
 * .jwtTokenTypeConfiguration(JwtTokenTypeConfigurationProperty.builder()
 * .keyLocation("keyLocation")
 * // the properties below are optional
 * .claimRegex("claimRegex")
 * .groupAttributeField("groupAttributeField")
 * .issuer("issuer")
 * .secretManagerArn("secretManagerArn")
 * .url("url")
 * .userNameAttributeField("userNameAttributeField")
 * .build())
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-index.html)
 */
public interface CfnIndexProps {
  /**
   * Specifies additional capacity units configured for your Enterprise Edition index.
   *
   * You can add and remove capacity units to fit your usage requirements.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-index.html#cfn-kendra-index-capacityunits)
   */
  public fun capacityUnits(): Any? = unwrap(this).getCapacityUnits()

  /**
   * A description for the index.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-index.html#cfn-kendra-index-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * Specifies the properties of an index field.
   *
   * You can add either a custom or a built-in field. You can add and remove built-in fields at any
   * time. When a built-in field is removed it's configuration reverts to the default for the field.
   * Custom fields can't be removed from an index after they are added.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-index.html#cfn-kendra-index-documentmetadataconfigurations)
   */
  public fun documentMetadataConfigurations(): Any? =
      unwrap(this).getDocumentMetadataConfigurations()

  /**
   * Indicates whether the index is a Enterprise Edition index or a Developer Edition index.
   *
   * Valid values are `DEVELOPER_EDITION` and `ENTERPRISE_EDITION` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-index.html#cfn-kendra-index-edition)
   */
  public fun edition(): String

  /**
   * The name of the index.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-index.html#cfn-kendra-index-name)
   */
  public fun name(): String

  /**
   * An IAM role that gives Amazon Kendra permissions to access your Amazon CloudWatch logs and
   * metrics.
   *
   * This is also the role used when you use the
   * [BatchPutDocument](https://docs.aws.amazon.com/kendra/latest/dg/BatchPutDocument.html) operation
   * to index documents from an Amazon S3 bucket.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-index.html#cfn-kendra-index-rolearn)
   */
  public fun roleArn(): String

  /**
   * The identifier of the AWS KMS customer managed key (CMK) to use to encrypt data indexed by
   * Amazon Kendra.
   *
   * Amazon Kendra doesn't support asymmetric CMKs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-index.html#cfn-kendra-index-serversideencryptionconfiguration)
   */
  public fun serverSideEncryptionConfiguration(): Any? =
      unwrap(this).getServerSideEncryptionConfiguration()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-index.html#cfn-kendra-index-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The user context policy.
   *
   * ATTRIBUTE_FILTER
   *
   * * All indexed content is searchable and displayable for all users. If you want to filter search
   * results on user context, you can use the attribute filters of `_user_id` and `_group_ids` or you
   * can provide user and group information in `UserContext` .
   *
   * USER_TOKEN
   *
   * * Enables token-based user access control to filter search results on user context. All
   * documents with no access control and all documents accessible to the user will be searchable and
   * displayable.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-index.html#cfn-kendra-index-usercontextpolicy)
   */
  public fun userContextPolicy(): String? = unwrap(this).getUserContextPolicy()

  /**
   * Defines the type of user token used for the index.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-index.html#cfn-kendra-index-usertokenconfigurations)
   */
  public fun userTokenConfigurations(): Any? = unwrap(this).getUserTokenConfigurations()

  /**
   * A builder for [CfnIndexProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param capacityUnits Specifies additional capacity units configured for your Enterprise
     * Edition index.
     * You can add and remove capacity units to fit your usage requirements.
     */
    public fun capacityUnits(capacityUnits: IResolvable)

    /**
     * @param capacityUnits Specifies additional capacity units configured for your Enterprise
     * Edition index.
     * You can add and remove capacity units to fit your usage requirements.
     */
    public fun capacityUnits(capacityUnits: CfnIndex.CapacityUnitsConfigurationProperty)

    /**
     * @param capacityUnits Specifies additional capacity units configured for your Enterprise
     * Edition index.
     * You can add and remove capacity units to fit your usage requirements.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("16cfd4975b9ec234e3de524cea4605f951ad5cdbb84f8b0df1e0bc0c2abddaee")
    public
        fun capacityUnits(capacityUnits: CfnIndex.CapacityUnitsConfigurationProperty.Builder.() -> Unit)

    /**
     * @param description A description for the index.
     */
    public fun description(description: String)

    /**
     * @param documentMetadataConfigurations Specifies the properties of an index field.
     * You can add either a custom or a built-in field. You can add and remove built-in fields at
     * any time. When a built-in field is removed it's configuration reverts to the default for the
     * field. Custom fields can't be removed from an index after they are added.
     */
    public fun documentMetadataConfigurations(documentMetadataConfigurations: IResolvable)

    /**
     * @param documentMetadataConfigurations Specifies the properties of an index field.
     * You can add either a custom or a built-in field. You can add and remove built-in fields at
     * any time. When a built-in field is removed it's configuration reverts to the default for the
     * field. Custom fields can't be removed from an index after they are added.
     */
    public fun documentMetadataConfigurations(documentMetadataConfigurations: List<Any>)

    /**
     * @param documentMetadataConfigurations Specifies the properties of an index field.
     * You can add either a custom or a built-in field. You can add and remove built-in fields at
     * any time. When a built-in field is removed it's configuration reverts to the default for the
     * field. Custom fields can't be removed from an index after they are added.
     */
    public fun documentMetadataConfigurations(vararg documentMetadataConfigurations: Any)

    /**
     * @param edition Indicates whether the index is a Enterprise Edition index or a Developer
     * Edition index. 
     * Valid values are `DEVELOPER_EDITION` and `ENTERPRISE_EDITION` .
     */
    public fun edition(edition: String)

    /**
     * @param name The name of the index. 
     */
    public fun name(name: String)

    /**
     * @param roleArn An IAM role that gives Amazon Kendra permissions to access your Amazon
     * CloudWatch logs and metrics. 
     * This is also the role used when you use the
     * [BatchPutDocument](https://docs.aws.amazon.com/kendra/latest/dg/BatchPutDocument.html) operation
     * to index documents from an Amazon S3 bucket.
     */
    public fun roleArn(roleArn: String)

    /**
     * @param serverSideEncryptionConfiguration The identifier of the AWS KMS customer managed key
     * (CMK) to use to encrypt data indexed by Amazon Kendra.
     * Amazon Kendra doesn't support asymmetric CMKs.
     */
    public fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: IResolvable)

    /**
     * @param serverSideEncryptionConfiguration The identifier of the AWS KMS customer managed key
     * (CMK) to use to encrypt data indexed by Amazon Kendra.
     * Amazon Kendra doesn't support asymmetric CMKs.
     */
    public
        fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: CfnIndex.ServerSideEncryptionConfigurationProperty)

    /**
     * @param serverSideEncryptionConfiguration The identifier of the AWS KMS customer managed key
     * (CMK) to use to encrypt data indexed by Amazon Kendra.
     * Amazon Kendra doesn't support asymmetric CMKs.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e9abf9865f05fedb50816bdb00d1151c51d286031f7b3e6f48020e08578c8e0b")
    public
        fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: CfnIndex.ServerSideEncryptionConfigurationProperty.Builder.() -> Unit)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param userContextPolicy The user context policy.
     * ATTRIBUTE_FILTER
     *
     * * All indexed content is searchable and displayable for all users. If you want to filter
     * search results on user context, you can use the attribute filters of `_user_id` and `_group_ids`
     * or you can provide user and group information in `UserContext` .
     *
     * USER_TOKEN
     *
     * * Enables token-based user access control to filter search results on user context. All
     * documents with no access control and all documents accessible to the user will be searchable and
     * displayable.
     */
    public fun userContextPolicy(userContextPolicy: String)

    /**
     * @param userTokenConfigurations Defines the type of user token used for the index.
     */
    public fun userTokenConfigurations(userTokenConfigurations: IResolvable)

    /**
     * @param userTokenConfigurations Defines the type of user token used for the index.
     */
    public fun userTokenConfigurations(userTokenConfigurations: List<Any>)

    /**
     * @param userTokenConfigurations Defines the type of user token used for the index.
     */
    public fun userTokenConfigurations(vararg userTokenConfigurations: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kendra.CfnIndexProps.Builder =
        software.amazon.awscdk.services.kendra.CfnIndexProps.builder()

    /**
     * @param capacityUnits Specifies additional capacity units configured for your Enterprise
     * Edition index.
     * You can add and remove capacity units to fit your usage requirements.
     */
    override fun capacityUnits(capacityUnits: IResolvable) {
      cdkBuilder.capacityUnits(capacityUnits.let(IResolvable::unwrap))
    }

    /**
     * @param capacityUnits Specifies additional capacity units configured for your Enterprise
     * Edition index.
     * You can add and remove capacity units to fit your usage requirements.
     */
    override fun capacityUnits(capacityUnits: CfnIndex.CapacityUnitsConfigurationProperty) {
      cdkBuilder.capacityUnits(capacityUnits.let(CfnIndex.CapacityUnitsConfigurationProperty::unwrap))
    }

    /**
     * @param capacityUnits Specifies additional capacity units configured for your Enterprise
     * Edition index.
     * You can add and remove capacity units to fit your usage requirements.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("16cfd4975b9ec234e3de524cea4605f951ad5cdbb84f8b0df1e0bc0c2abddaee")
    override
        fun capacityUnits(capacityUnits: CfnIndex.CapacityUnitsConfigurationProperty.Builder.() -> Unit):
        Unit = capacityUnits(CfnIndex.CapacityUnitsConfigurationProperty(capacityUnits))

    /**
     * @param description A description for the index.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param documentMetadataConfigurations Specifies the properties of an index field.
     * You can add either a custom or a built-in field. You can add and remove built-in fields at
     * any time. When a built-in field is removed it's configuration reverts to the default for the
     * field. Custom fields can't be removed from an index after they are added.
     */
    override fun documentMetadataConfigurations(documentMetadataConfigurations: IResolvable) {
      cdkBuilder.documentMetadataConfigurations(documentMetadataConfigurations.let(IResolvable::unwrap))
    }

    /**
     * @param documentMetadataConfigurations Specifies the properties of an index field.
     * You can add either a custom or a built-in field. You can add and remove built-in fields at
     * any time. When a built-in field is removed it's configuration reverts to the default for the
     * field. Custom fields can't be removed from an index after they are added.
     */
    override fun documentMetadataConfigurations(documentMetadataConfigurations: List<Any>) {
      cdkBuilder.documentMetadataConfigurations(documentMetadataConfigurations.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param documentMetadataConfigurations Specifies the properties of an index field.
     * You can add either a custom or a built-in field. You can add and remove built-in fields at
     * any time. When a built-in field is removed it's configuration reverts to the default for the
     * field. Custom fields can't be removed from an index after they are added.
     */
    override fun documentMetadataConfigurations(vararg documentMetadataConfigurations: Any): Unit =
        documentMetadataConfigurations(documentMetadataConfigurations.toList())

    /**
     * @param edition Indicates whether the index is a Enterprise Edition index or a Developer
     * Edition index. 
     * Valid values are `DEVELOPER_EDITION` and `ENTERPRISE_EDITION` .
     */
    override fun edition(edition: String) {
      cdkBuilder.edition(edition)
    }

    /**
     * @param name The name of the index. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param roleArn An IAM role that gives Amazon Kendra permissions to access your Amazon
     * CloudWatch logs and metrics. 
     * This is also the role used when you use the
     * [BatchPutDocument](https://docs.aws.amazon.com/kendra/latest/dg/BatchPutDocument.html) operation
     * to index documents from an Amazon S3 bucket.
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param serverSideEncryptionConfiguration The identifier of the AWS KMS customer managed key
     * (CMK) to use to encrypt data indexed by Amazon Kendra.
     * Amazon Kendra doesn't support asymmetric CMKs.
     */
    override fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: IResolvable) {
      cdkBuilder.serverSideEncryptionConfiguration(serverSideEncryptionConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param serverSideEncryptionConfiguration The identifier of the AWS KMS customer managed key
     * (CMK) to use to encrypt data indexed by Amazon Kendra.
     * Amazon Kendra doesn't support asymmetric CMKs.
     */
    override
        fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: CfnIndex.ServerSideEncryptionConfigurationProperty) {
      cdkBuilder.serverSideEncryptionConfiguration(serverSideEncryptionConfiguration.let(CfnIndex.ServerSideEncryptionConfigurationProperty::unwrap))
    }

    /**
     * @param serverSideEncryptionConfiguration The identifier of the AWS KMS customer managed key
     * (CMK) to use to encrypt data indexed by Amazon Kendra.
     * Amazon Kendra doesn't support asymmetric CMKs.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e9abf9865f05fedb50816bdb00d1151c51d286031f7b3e6f48020e08578c8e0b")
    override
        fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: CfnIndex.ServerSideEncryptionConfigurationProperty.Builder.() -> Unit):
        Unit =
        serverSideEncryptionConfiguration(CfnIndex.ServerSideEncryptionConfigurationProperty(serverSideEncryptionConfiguration))

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param userContextPolicy The user context policy.
     * ATTRIBUTE_FILTER
     *
     * * All indexed content is searchable and displayable for all users. If you want to filter
     * search results on user context, you can use the attribute filters of `_user_id` and `_group_ids`
     * or you can provide user and group information in `UserContext` .
     *
     * USER_TOKEN
     *
     * * Enables token-based user access control to filter search results on user context. All
     * documents with no access control and all documents accessible to the user will be searchable and
     * displayable.
     */
    override fun userContextPolicy(userContextPolicy: String) {
      cdkBuilder.userContextPolicy(userContextPolicy)
    }

    /**
     * @param userTokenConfigurations Defines the type of user token used for the index.
     */
    override fun userTokenConfigurations(userTokenConfigurations: IResolvable) {
      cdkBuilder.userTokenConfigurations(userTokenConfigurations.let(IResolvable::unwrap))
    }

    /**
     * @param userTokenConfigurations Defines the type of user token used for the index.
     */
    override fun userTokenConfigurations(userTokenConfigurations: List<Any>) {
      cdkBuilder.userTokenConfigurations(userTokenConfigurations.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param userTokenConfigurations Defines the type of user token used for the index.
     */
    override fun userTokenConfigurations(vararg userTokenConfigurations: Any): Unit =
        userTokenConfigurations(userTokenConfigurations.toList())

    public fun build(): software.amazon.awscdk.services.kendra.CfnIndexProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.kendra.CfnIndexProps,
  ) : CdkObject(cdkObject), CfnIndexProps {
    /**
     * Specifies additional capacity units configured for your Enterprise Edition index.
     *
     * You can add and remove capacity units to fit your usage requirements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-index.html#cfn-kendra-index-capacityunits)
     */
    override fun capacityUnits(): Any? = unwrap(this).getCapacityUnits()

    /**
     * A description for the index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-index.html#cfn-kendra-index-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Specifies the properties of an index field.
     *
     * You can add either a custom or a built-in field. You can add and remove built-in fields at
     * any time. When a built-in field is removed it's configuration reverts to the default for the
     * field. Custom fields can't be removed from an index after they are added.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-index.html#cfn-kendra-index-documentmetadataconfigurations)
     */
    override fun documentMetadataConfigurations(): Any? =
        unwrap(this).getDocumentMetadataConfigurations()

    /**
     * Indicates whether the index is a Enterprise Edition index or a Developer Edition index.
     *
     * Valid values are `DEVELOPER_EDITION` and `ENTERPRISE_EDITION` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-index.html#cfn-kendra-index-edition)
     */
    override fun edition(): String = unwrap(this).getEdition()

    /**
     * The name of the index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-index.html#cfn-kendra-index-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * An IAM role that gives Amazon Kendra permissions to access your Amazon CloudWatch logs and
     * metrics.
     *
     * This is also the role used when you use the
     * [BatchPutDocument](https://docs.aws.amazon.com/kendra/latest/dg/BatchPutDocument.html) operation
     * to index documents from an Amazon S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-index.html#cfn-kendra-index-rolearn)
     */
    override fun roleArn(): String = unwrap(this).getRoleArn()

    /**
     * The identifier of the AWS KMS customer managed key (CMK) to use to encrypt data indexed by
     * Amazon Kendra.
     *
     * Amazon Kendra doesn't support asymmetric CMKs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-index.html#cfn-kendra-index-serversideencryptionconfiguration)
     */
    override fun serverSideEncryptionConfiguration(): Any? =
        unwrap(this).getServerSideEncryptionConfiguration()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-index.html#cfn-kendra-index-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The user context policy.
     *
     * ATTRIBUTE_FILTER
     *
     * * All indexed content is searchable and displayable for all users. If you want to filter
     * search results on user context, you can use the attribute filters of `_user_id` and `_group_ids`
     * or you can provide user and group information in `UserContext` .
     *
     * USER_TOKEN
     *
     * * Enables token-based user access control to filter search results on user context. All
     * documents with no access control and all documents accessible to the user will be searchable and
     * displayable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-index.html#cfn-kendra-index-usercontextpolicy)
     */
    override fun userContextPolicy(): String? = unwrap(this).getUserContextPolicy()

    /**
     * Defines the type of user token used for the index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-index.html#cfn-kendra-index-usertokenconfigurations)
     */
    override fun userTokenConfigurations(): Any? = unwrap(this).getUserTokenConfigurations()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnIndexProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnIndexProps):
        CfnIndexProps = CdkObjectWrappers.wrap(cdkObject) as? CfnIndexProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnIndexProps):
        software.amazon.awscdk.services.kendra.CfnIndexProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.kendra.CfnIndexProps
  }
}
