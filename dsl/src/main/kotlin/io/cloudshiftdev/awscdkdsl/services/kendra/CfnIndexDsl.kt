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

package io.cloudshiftdev.awscdkdsl.services.kendra

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnIndex
import software.constructs.Construct

/**
 * Creates an Amazon Kendra index.
 *
 * Once the index is active you can add documents to your index using the
 * [BatchPutDocument](https://docs.aws.amazon.com/kendra/latest/dg/BatchPutDocument.html) operation
 * or using one of the supported data sources.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kendra.*;
 * CfnIndex cfnIndex = CfnIndex.Builder.create(this, "MyCfnIndex")
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
@CdkDslMarker
public class CfnIndexDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnIndex.Builder = CfnIndex.Builder.create(scope, id)

    private val _documentMetadataConfigurations: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    private val _userTokenConfigurations: MutableList<Any> = mutableListOf()

    /**
     * Specifies additional capacity units configured for your Enterprise Edition index.
     *
     * You can add and remove capacity units to fit your usage requirements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-index.html#cfn-kendra-index-capacityunits)
     *
     * @param capacityUnits Specifies additional capacity units configured for your Enterprise
     *   Edition index.
     */
    public fun capacityUnits(capacityUnits: IResolvable) {
        cdkBuilder.capacityUnits(capacityUnits)
    }

    /**
     * Specifies additional capacity units configured for your Enterprise Edition index.
     *
     * You can add and remove capacity units to fit your usage requirements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-index.html#cfn-kendra-index-capacityunits)
     *
     * @param capacityUnits Specifies additional capacity units configured for your Enterprise
     *   Edition index.
     */
    public fun capacityUnits(capacityUnits: CfnIndex.CapacityUnitsConfigurationProperty) {
        cdkBuilder.capacityUnits(capacityUnits)
    }

    /**
     * A description for the index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-index.html#cfn-kendra-index-description)
     *
     * @param description A description for the index.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * Specifies the properties of an index field.
     *
     * You can add either a custom or a built-in field. You can add and remove built-in fields at
     * any time. When a built-in field is removed it's configuration reverts to the default for the
     * field. Custom fields can't be removed from an index after they are added.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-index.html#cfn-kendra-index-documentmetadataconfigurations)
     *
     * @param documentMetadataConfigurations Specifies the properties of an index field.
     */
    public fun documentMetadataConfigurations(vararg documentMetadataConfigurations: Any) {
        _documentMetadataConfigurations.addAll(listOf(*documentMetadataConfigurations))
    }

    /**
     * Specifies the properties of an index field.
     *
     * You can add either a custom or a built-in field. You can add and remove built-in fields at
     * any time. When a built-in field is removed it's configuration reverts to the default for the
     * field. Custom fields can't be removed from an index after they are added.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-index.html#cfn-kendra-index-documentmetadataconfigurations)
     *
     * @param documentMetadataConfigurations Specifies the properties of an index field.
     */
    public fun documentMetadataConfigurations(documentMetadataConfigurations: Collection<Any>) {
        _documentMetadataConfigurations.addAll(documentMetadataConfigurations)
    }

    /**
     * Specifies the properties of an index field.
     *
     * You can add either a custom or a built-in field. You can add and remove built-in fields at
     * any time. When a built-in field is removed it's configuration reverts to the default for the
     * field. Custom fields can't be removed from an index after they are added.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-index.html#cfn-kendra-index-documentmetadataconfigurations)
     *
     * @param documentMetadataConfigurations Specifies the properties of an index field.
     */
    public fun documentMetadataConfigurations(documentMetadataConfigurations: IResolvable) {
        cdkBuilder.documentMetadataConfigurations(documentMetadataConfigurations)
    }

    /**
     * Indicates whether the index is a Enterprise Edition index or a Developer Edition index.
     *
     * Valid values are `DEVELOPER_EDITION` and `ENTERPRISE_EDITION` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-index.html#cfn-kendra-index-edition)
     *
     * @param edition Indicates whether the index is a Enterprise Edition index or a Developer
     *   Edition index.
     */
    public fun edition(edition: String) {
        cdkBuilder.edition(edition)
    }

    /**
     * The name of the index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-index.html#cfn-kendra-index-name)
     *
     * @param name The name of the index.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * An IAM role that gives Amazon Kendra permissions to access your Amazon CloudWatch logs and
     * metrics.
     *
     * This is also the role used when you use the
     * [BatchPutDocument](https://docs.aws.amazon.com/kendra/latest/dg/BatchPutDocument.html)
     * operation to index documents from an Amazon S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-index.html#cfn-kendra-index-rolearn)
     *
     * @param roleArn An IAM role that gives Amazon Kendra permissions to access your Amazon
     *   CloudWatch logs and metrics.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /**
     * The identifier of the AWS KMS customer managed key (CMK) to use to encrypt data indexed by
     * Amazon Kendra.
     *
     * Amazon Kendra doesn't support asymmetric CMKs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-index.html#cfn-kendra-index-serversideencryptionconfiguration)
     *
     * @param serverSideEncryptionConfiguration The identifier of the AWS KMS customer managed key
     *   (CMK) to use to encrypt data indexed by Amazon Kendra.
     */
    public fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: IResolvable) {
        cdkBuilder.serverSideEncryptionConfiguration(serverSideEncryptionConfiguration)
    }

    /**
     * The identifier of the AWS KMS customer managed key (CMK) to use to encrypt data indexed by
     * Amazon Kendra.
     *
     * Amazon Kendra doesn't support asymmetric CMKs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-index.html#cfn-kendra-index-serversideencryptionconfiguration)
     *
     * @param serverSideEncryptionConfiguration The identifier of the AWS KMS customer managed key
     *   (CMK) to use to encrypt data indexed by Amazon Kendra.
     */
    public fun serverSideEncryptionConfiguration(
        serverSideEncryptionConfiguration: CfnIndex.ServerSideEncryptionConfigurationProperty
    ) {
        cdkBuilder.serverSideEncryptionConfiguration(serverSideEncryptionConfiguration)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-index.html#cfn-kendra-index-tags)
     *
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-index.html#cfn-kendra-index-tags)
     *
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The user context policy.
     *
     * ATTRIBUTE_FILTER
     * * All indexed content is searchable and displayable for all users. If you want to filter
     *   search results on user context, you can use the attribute filters of `_user_id` and
     *   `_group_ids` or you can provide user and group information in `UserContext` .
     *
     * USER_TOKEN
     * * Enables token-based user access control to filter search results on user context. All
     *   documents with no access control and all documents accessible to the user will be
     *   searchable and displayable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-index.html#cfn-kendra-index-usercontextpolicy)
     *
     * @param userContextPolicy The user context policy.
     */
    public fun userContextPolicy(userContextPolicy: String) {
        cdkBuilder.userContextPolicy(userContextPolicy)
    }

    /**
     * Defines the type of user token used for the index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-index.html#cfn-kendra-index-usertokenconfigurations)
     *
     * @param userTokenConfigurations Defines the type of user token used for the index.
     */
    public fun userTokenConfigurations(vararg userTokenConfigurations: Any) {
        _userTokenConfigurations.addAll(listOf(*userTokenConfigurations))
    }

    /**
     * Defines the type of user token used for the index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-index.html#cfn-kendra-index-usertokenconfigurations)
     *
     * @param userTokenConfigurations Defines the type of user token used for the index.
     */
    public fun userTokenConfigurations(userTokenConfigurations: Collection<Any>) {
        _userTokenConfigurations.addAll(userTokenConfigurations)
    }

    /**
     * Defines the type of user token used for the index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-index.html#cfn-kendra-index-usertokenconfigurations)
     *
     * @param userTokenConfigurations Defines the type of user token used for the index.
     */
    public fun userTokenConfigurations(userTokenConfigurations: IResolvable) {
        cdkBuilder.userTokenConfigurations(userTokenConfigurations)
    }

    public fun build(): CfnIndex {
        if (_documentMetadataConfigurations.isNotEmpty())
            cdkBuilder.documentMetadataConfigurations(_documentMetadataConfigurations)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_userTokenConfigurations.isNotEmpty())
            cdkBuilder.userTokenConfigurations(_userTokenConfigurations)
        return cdkBuilder.build()
    }
}
