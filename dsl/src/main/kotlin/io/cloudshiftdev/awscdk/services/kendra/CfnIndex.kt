package io.cloudshiftdev.awscdk.services.kendra

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnIndex
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.kendra.CfnIndex,
) : CfnResource(cdkObject), IInspectable, ITaggable {
    /**
     * The Amazon Resource Name (ARN) of the index.
     *
     * For example: `arn:aws:kendra:us-west-2:111122223333:index/0123456789abcdef` .
     */
    public open fun attrArn(): String = unwrap(this).getAttrArn()

    /**
     * The identifier for the index.
     *
     * For example: `f4aeaa10-8056-4b2c-a343-522ca0f41234` .
     */
    public open fun attrId(): String = unwrap(this).getAttrId()

    /** Specifies additional capacity units configured for your Enterprise Edition index. */
    public open fun capacityUnits(): Any? = unwrap(this).getCapacityUnits()

    /** Specifies additional capacity units configured for your Enterprise Edition index. */
    public open fun capacityUnits(`value`: IResolvable) {
        unwrap(this).setCapacityUnits(`value`.let(IResolvable::unwrap))
    }

    /** Specifies additional capacity units configured for your Enterprise Edition index. */
    public open fun capacityUnits(`value`: CapacityUnitsConfigurationProperty) {
        unwrap(this).setCapacityUnits(`value`.let(CapacityUnitsConfigurationProperty::unwrap))
    }

    /** Specifies additional capacity units configured for your Enterprise Edition index. */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ac9628696274aae7547bb523fc9355b738bc0aac35ea72627546a14855d3e9d2")
    public open fun capacityUnits(
        `value`: CapacityUnitsConfigurationProperty.Builder.() -> Unit
    ): Unit = capacityUnits(CapacityUnitsConfigurationProperty(`value`))

    /** A description for the index. */
    public open fun description(): String? = unwrap(this).getDescription()

    /** A description for the index. */
    public open fun description(`value`: String) {
        unwrap(this).setDescription(`value`)
    }

    /** Specifies the properties of an index field. */
    public open fun documentMetadataConfigurations(): Any? =
        unwrap(this).getDocumentMetadataConfigurations()

    /** Specifies the properties of an index field. */
    public open fun documentMetadataConfigurations(`value`: IResolvable) {
        unwrap(this).setDocumentMetadataConfigurations(`value`.let(IResolvable::unwrap))
    }

    /** Specifies the properties of an index field. */
    public open fun documentMetadataConfigurations(__idx_ac66f0: List<Any>) {
        unwrap(this).setDocumentMetadataConfigurations(__idx_ac66f0)
    }

    /** Specifies the properties of an index field. */
    public open fun documentMetadataConfigurations(vararg __idx_ac66f0: Any): Unit =
        documentMetadataConfigurations(__idx_ac66f0.toList())

    /** Indicates whether the index is a Enterprise Edition index or a Developer Edition index. */
    public open fun edition(): String = unwrap(this).getEdition()

    /** Indicates whether the index is a Enterprise Edition index or a Developer Edition index. */
    public open fun edition(`value`: String) {
        unwrap(this).setEdition(`value`)
    }

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** The name of the index. */
    public open fun name(): String = unwrap(this).getName()

    /** The name of the index. */
    public open fun name(`value`: String) {
        unwrap(this).setName(`value`)
    }

    /**
     * An IAM role that gives Amazon Kendra permissions to access your Amazon CloudWatch logs and
     * metrics.
     */
    public open fun roleArn(): String = unwrap(this).getRoleArn()

    /**
     * An IAM role that gives Amazon Kendra permissions to access your Amazon CloudWatch logs and
     * metrics.
     */
    public open fun roleArn(`value`: String) {
        unwrap(this).setRoleArn(`value`)
    }

    /**
     * The identifier of the AWS KMS customer managed key (CMK) to use to encrypt data indexed by
     * Amazon Kendra.
     */
    public open fun serverSideEncryptionConfiguration(): Any? =
        unwrap(this).getServerSideEncryptionConfiguration()

    /**
     * The identifier of the AWS KMS customer managed key (CMK) to use to encrypt data indexed by
     * Amazon Kendra.
     */
    public open fun serverSideEncryptionConfiguration(`value`: IResolvable) {
        unwrap(this).setServerSideEncryptionConfiguration(`value`.let(IResolvable::unwrap))
    }

    /**
     * The identifier of the AWS KMS customer managed key (CMK) to use to encrypt data indexed by
     * Amazon Kendra.
     */
    public open fun serverSideEncryptionConfiguration(
        `value`: ServerSideEncryptionConfigurationProperty
    ) {
        unwrap(this)
            .setServerSideEncryptionConfiguration(
                `value`.let(ServerSideEncryptionConfigurationProperty::unwrap)
            )
    }

    /**
     * The identifier of the AWS KMS customer managed key (CMK) to use to encrypt data indexed by
     * Amazon Kendra.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8cd982c52b4004cb165dd44dde8ec5225baa9bc80c5f26003c27f80b95f238a4")
    public open fun serverSideEncryptionConfiguration(
        `value`: ServerSideEncryptionConfigurationProperty.Builder.() -> Unit
    ): Unit = serverSideEncryptionConfiguration(ServerSideEncryptionConfigurationProperty(`value`))

    /** Tag Manager which manages the tags for this resource. */
    public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

    /** An array of key-value pairs to apply to this resource. */
    public open fun tagsRaw(): List<CfnTag> =
        unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?: emptyList()

    /** An array of key-value pairs to apply to this resource. */
    public open fun tagsRaw(`value`: List<CfnTag>) {
        unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
    }

    /** An array of key-value pairs to apply to this resource. */
    public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

    /** The user context policy. */
    public open fun userContextPolicy(): String? = unwrap(this).getUserContextPolicy()

    /** The user context policy. */
    public open fun userContextPolicy(`value`: String) {
        unwrap(this).setUserContextPolicy(`value`)
    }

    /** Defines the type of user token used for the index. */
    public open fun userTokenConfigurations(): Any? = unwrap(this).getUserTokenConfigurations()

    /** Defines the type of user token used for the index. */
    public open fun userTokenConfigurations(`value`: IResolvable) {
        unwrap(this).setUserTokenConfigurations(`value`.let(IResolvable::unwrap))
    }

    /** Defines the type of user token used for the index. */
    public open fun userTokenConfigurations(__idx_ac66f0: List<Any>) {
        unwrap(this).setUserTokenConfigurations(__idx_ac66f0)
    }

    /** Defines the type of user token used for the index. */
    public open fun userTokenConfigurations(vararg __idx_ac66f0: Any): Unit =
        userTokenConfigurations(__idx_ac66f0.toList())

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.kendra.CfnIndex]. */
    @CdkDslMarker
    public interface Builder {
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
        public fun capacityUnits(capacityUnits: IResolvable)

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
        public fun capacityUnits(capacityUnits: CapacityUnitsConfigurationProperty)

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
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("7d38515d81b65ad12a0112808e60b88658c07d2d9b54fb879362e1b26d9039cf")
        public fun capacityUnits(
            capacityUnits: CapacityUnitsConfigurationProperty.Builder.() -> Unit
        )

        /**
         * A description for the index.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-index.html#cfn-kendra-index-description)
         *
         * @param description A description for the index.
         */
        public fun description(description: String)

        /**
         * Specifies the properties of an index field.
         *
         * You can add either a custom or a built-in field. You can add and remove built-in fields
         * at any time. When a built-in field is removed it's configuration reverts to the default
         * for the field. Custom fields can't be removed from an index after they are added.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-index.html#cfn-kendra-index-documentmetadataconfigurations)
         *
         * @param documentMetadataConfigurations Specifies the properties of an index field.
         */
        public fun documentMetadataConfigurations(documentMetadataConfigurations: IResolvable)

        /**
         * Specifies the properties of an index field.
         *
         * You can add either a custom or a built-in field. You can add and remove built-in fields
         * at any time. When a built-in field is removed it's configuration reverts to the default
         * for the field. Custom fields can't be removed from an index after they are added.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-index.html#cfn-kendra-index-documentmetadataconfigurations)
         *
         * @param documentMetadataConfigurations Specifies the properties of an index field.
         */
        public fun documentMetadataConfigurations(documentMetadataConfigurations: List<Any>)

        /**
         * Specifies the properties of an index field.
         *
         * You can add either a custom or a built-in field. You can add and remove built-in fields
         * at any time. When a built-in field is removed it's configuration reverts to the default
         * for the field. Custom fields can't be removed from an index after they are added.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-index.html#cfn-kendra-index-documentmetadataconfigurations)
         *
         * @param documentMetadataConfigurations Specifies the properties of an index field.
         */
        public fun documentMetadataConfigurations(vararg documentMetadataConfigurations: Any)

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
        public fun edition(edition: String)

        /**
         * The name of the index.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-index.html#cfn-kendra-index-name)
         *
         * @param name The name of the index.
         */
        public fun name(name: String)

        /**
         * An IAM role that gives Amazon Kendra permissions to access your Amazon CloudWatch logs
         * and metrics.
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
        public fun roleArn(roleArn: String)

        /**
         * The identifier of the AWS KMS customer managed key (CMK) to use to encrypt data indexed
         * by Amazon Kendra.
         *
         * Amazon Kendra doesn't support asymmetric CMKs.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-index.html#cfn-kendra-index-serversideencryptionconfiguration)
         *
         * @param serverSideEncryptionConfiguration The identifier of the AWS KMS customer managed
         *   key (CMK) to use to encrypt data indexed by Amazon Kendra.
         */
        public fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: IResolvable)

        /**
         * The identifier of the AWS KMS customer managed key (CMK) to use to encrypt data indexed
         * by Amazon Kendra.
         *
         * Amazon Kendra doesn't support asymmetric CMKs.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-index.html#cfn-kendra-index-serversideencryptionconfiguration)
         *
         * @param serverSideEncryptionConfiguration The identifier of the AWS KMS customer managed
         *   key (CMK) to use to encrypt data indexed by Amazon Kendra.
         */
        public fun serverSideEncryptionConfiguration(
            serverSideEncryptionConfiguration: ServerSideEncryptionConfigurationProperty
        )

        /**
         * The identifier of the AWS KMS customer managed key (CMK) to use to encrypt data indexed
         * by Amazon Kendra.
         *
         * Amazon Kendra doesn't support asymmetric CMKs.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-index.html#cfn-kendra-index-serversideencryptionconfiguration)
         *
         * @param serverSideEncryptionConfiguration The identifier of the AWS KMS customer managed
         *   key (CMK) to use to encrypt data indexed by Amazon Kendra.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("66297df61c7f33a3e947db30b9a9e02024ca4e92755576ea3ff17f18cd2df80c")
        public fun serverSideEncryptionConfiguration(
            serverSideEncryptionConfiguration:
                ServerSideEncryptionConfigurationProperty.Builder.() -> Unit
        )

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
        public fun tags(tags: List<CfnTag>)

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
        public fun tags(vararg tags: CfnTag)

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
        public fun userContextPolicy(userContextPolicy: String)

        /**
         * Defines the type of user token used for the index.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-index.html#cfn-kendra-index-usertokenconfigurations)
         *
         * @param userTokenConfigurations Defines the type of user token used for the index.
         */
        public fun userTokenConfigurations(userTokenConfigurations: IResolvable)

        /**
         * Defines the type of user token used for the index.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-index.html#cfn-kendra-index-usertokenconfigurations)
         *
         * @param userTokenConfigurations Defines the type of user token used for the index.
         */
        public fun userTokenConfigurations(userTokenConfigurations: List<Any>)

        /**
         * Defines the type of user token used for the index.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-index.html#cfn-kendra-index-usertokenconfigurations)
         *
         * @param userTokenConfigurations Defines the type of user token used for the index.
         */
        public fun userTokenConfigurations(vararg userTokenConfigurations: Any)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.kendra.CfnIndex.Builder =
            software.amazon.awscdk.services.kendra.CfnIndex.Builder.create(scope, id)

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
        override fun capacityUnits(capacityUnits: IResolvable) {
            cdkBuilder.capacityUnits(capacityUnits.let(IResolvable::unwrap))
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
        override fun capacityUnits(capacityUnits: CapacityUnitsConfigurationProperty) {
            cdkBuilder.capacityUnits(capacityUnits.let(CapacityUnitsConfigurationProperty::unwrap))
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
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("7d38515d81b65ad12a0112808e60b88658c07d2d9b54fb879362e1b26d9039cf")
        override fun capacityUnits(
            capacityUnits: CapacityUnitsConfigurationProperty.Builder.() -> Unit
        ): Unit = capacityUnits(CapacityUnitsConfigurationProperty(capacityUnits))

        /**
         * A description for the index.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-index.html#cfn-kendra-index-description)
         *
         * @param description A description for the index.
         */
        override fun description(description: String) {
            cdkBuilder.description(description)
        }

        /**
         * Specifies the properties of an index field.
         *
         * You can add either a custom or a built-in field. You can add and remove built-in fields
         * at any time. When a built-in field is removed it's configuration reverts to the default
         * for the field. Custom fields can't be removed from an index after they are added.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-index.html#cfn-kendra-index-documentmetadataconfigurations)
         *
         * @param documentMetadataConfigurations Specifies the properties of an index field.
         */
        override fun documentMetadataConfigurations(documentMetadataConfigurations: IResolvable) {
            cdkBuilder.documentMetadataConfigurations(
                documentMetadataConfigurations.let(IResolvable::unwrap)
            )
        }

        /**
         * Specifies the properties of an index field.
         *
         * You can add either a custom or a built-in field. You can add and remove built-in fields
         * at any time. When a built-in field is removed it's configuration reverts to the default
         * for the field. Custom fields can't be removed from an index after they are added.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-index.html#cfn-kendra-index-documentmetadataconfigurations)
         *
         * @param documentMetadataConfigurations Specifies the properties of an index field.
         */
        override fun documentMetadataConfigurations(documentMetadataConfigurations: List<Any>) {
            cdkBuilder.documentMetadataConfigurations(documentMetadataConfigurations)
        }

        /**
         * Specifies the properties of an index field.
         *
         * You can add either a custom or a built-in field. You can add and remove built-in fields
         * at any time. When a built-in field is removed it's configuration reverts to the default
         * for the field. Custom fields can't be removed from an index after they are added.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-index.html#cfn-kendra-index-documentmetadataconfigurations)
         *
         * @param documentMetadataConfigurations Specifies the properties of an index field.
         */
        override fun documentMetadataConfigurations(
            vararg documentMetadataConfigurations: Any
        ): Unit = documentMetadataConfigurations(documentMetadataConfigurations.toList())

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
        override fun edition(edition: String) {
            cdkBuilder.edition(edition)
        }

        /**
         * The name of the index.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-index.html#cfn-kendra-index-name)
         *
         * @param name The name of the index.
         */
        override fun name(name: String) {
            cdkBuilder.name(name)
        }

        /**
         * An IAM role that gives Amazon Kendra permissions to access your Amazon CloudWatch logs
         * and metrics.
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
        override fun roleArn(roleArn: String) {
            cdkBuilder.roleArn(roleArn)
        }

        /**
         * The identifier of the AWS KMS customer managed key (CMK) to use to encrypt data indexed
         * by Amazon Kendra.
         *
         * Amazon Kendra doesn't support asymmetric CMKs.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-index.html#cfn-kendra-index-serversideencryptionconfiguration)
         *
         * @param serverSideEncryptionConfiguration The identifier of the AWS KMS customer managed
         *   key (CMK) to use to encrypt data indexed by Amazon Kendra.
         */
        override fun serverSideEncryptionConfiguration(
            serverSideEncryptionConfiguration: IResolvable
        ) {
            cdkBuilder.serverSideEncryptionConfiguration(
                serverSideEncryptionConfiguration.let(IResolvable::unwrap)
            )
        }

        /**
         * The identifier of the AWS KMS customer managed key (CMK) to use to encrypt data indexed
         * by Amazon Kendra.
         *
         * Amazon Kendra doesn't support asymmetric CMKs.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-index.html#cfn-kendra-index-serversideencryptionconfiguration)
         *
         * @param serverSideEncryptionConfiguration The identifier of the AWS KMS customer managed
         *   key (CMK) to use to encrypt data indexed by Amazon Kendra.
         */
        override fun serverSideEncryptionConfiguration(
            serverSideEncryptionConfiguration: ServerSideEncryptionConfigurationProperty
        ) {
            cdkBuilder.serverSideEncryptionConfiguration(
                serverSideEncryptionConfiguration.let(
                    ServerSideEncryptionConfigurationProperty::unwrap
                )
            )
        }

        /**
         * The identifier of the AWS KMS customer managed key (CMK) to use to encrypt data indexed
         * by Amazon Kendra.
         *
         * Amazon Kendra doesn't support asymmetric CMKs.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-index.html#cfn-kendra-index-serversideencryptionconfiguration)
         *
         * @param serverSideEncryptionConfiguration The identifier of the AWS KMS customer managed
         *   key (CMK) to use to encrypt data indexed by Amazon Kendra.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("66297df61c7f33a3e947db30b9a9e02024ca4e92755576ea3ff17f18cd2df80c")
        override fun serverSideEncryptionConfiguration(
            serverSideEncryptionConfiguration:
                ServerSideEncryptionConfigurationProperty.Builder.() -> Unit
        ): Unit =
            serverSideEncryptionConfiguration(
                ServerSideEncryptionConfigurationProperty(serverSideEncryptionConfiguration)
            )

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
        override fun tags(tags: List<CfnTag>) {
            cdkBuilder.tags(tags.map(CfnTag::unwrap))
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
        override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

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
        override fun userContextPolicy(userContextPolicy: String) {
            cdkBuilder.userContextPolicy(userContextPolicy)
        }

        /**
         * Defines the type of user token used for the index.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-index.html#cfn-kendra-index-usertokenconfigurations)
         *
         * @param userTokenConfigurations Defines the type of user token used for the index.
         */
        override fun userTokenConfigurations(userTokenConfigurations: IResolvable) {
            cdkBuilder.userTokenConfigurations(userTokenConfigurations.let(IResolvable::unwrap))
        }

        /**
         * Defines the type of user token used for the index.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-index.html#cfn-kendra-index-usertokenconfigurations)
         *
         * @param userTokenConfigurations Defines the type of user token used for the index.
         */
        override fun userTokenConfigurations(userTokenConfigurations: List<Any>) {
            cdkBuilder.userTokenConfigurations(userTokenConfigurations)
        }

        /**
         * Defines the type of user token used for the index.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-index.html#cfn-kendra-index-usertokenconfigurations)
         *
         * @param userTokenConfigurations Defines the type of user token used for the index.
         */
        override fun userTokenConfigurations(vararg userTokenConfigurations: Any): Unit =
            userTokenConfigurations(userTokenConfigurations.toList())

        public fun build(): software.amazon.awscdk.services.kendra.CfnIndex = cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnIndex {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnIndex(builderImpl.apply(block).build())
        }

        internal fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnIndex): CfnIndex =
            CfnIndex(cdkObject)

        internal fun unwrap(wrapped: CfnIndex): software.amazon.awscdk.services.kendra.CfnIndex =
            wrapped.cdkObject
    }

    public interface CapacityUnitsConfigurationProperty {
        /**
         * The amount of extra query capacity for an index and
         * [GetQuerySuggestions](https://docs.aws.amazon.com/kendra/latest/dg/API_GetQuerySuggestions.html)
         * capacity.
         *
         * A single extra capacity unit for an index provides 0.1 queries per second or
         * approximately 8,000 queries per day. You can add up to 100 extra capacity units.
         *
         * `GetQuerySuggestions` capacity is five times the provisioned query capacity for an index,
         * or the base capacity of 2.5 calls per second, whichever is higher. For example, the base
         * capacity for an index is 0.1 queries per second, and `GetQuerySuggestions` capacity has a
         * base of 2.5 calls per second. If you add another 0.1 queries per second to total 0.2
         * queries per second for an index, the `GetQuerySuggestions` capacity is 2.5 calls per
         * second (higher than five times 0.2 queries per second).
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-capacityunitsconfiguration.html#cfn-kendra-index-capacityunitsconfiguration-querycapacityunits)
         */
        public fun queryCapacityUnits(): Number

        /**
         * The amount of extra storage capacity for an index.
         *
         * A single capacity unit provides 30 GB of storage space or 100,000 documents, whichever is
         * reached first. You can add up to 100 extra capacity units.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-capacityunitsconfiguration.html#cfn-kendra-index-capacityunitsconfiguration-storagecapacityunits)
         */
        public fun storageCapacityUnits(): Number

        /** A builder for [CapacityUnitsConfigurationProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param queryCapacityUnits The amount of extra query capacity for an index and
             *   [GetQuerySuggestions](https://docs.aws.amazon.com/kendra/latest/dg/API_GetQuerySuggestions.html)
             *   capacity. A single extra capacity unit for an index provides 0.1 queries per second
             *   or approximately 8,000 queries per day. You can add up to 100 extra capacity units.
             *
             * `GetQuerySuggestions` capacity is five times the provisioned query capacity for an
             * index, or the base capacity of 2.5 calls per second, whichever is higher. For
             * example, the base capacity for an index is 0.1 queries per second, and
             * `GetQuerySuggestions` capacity has a base of 2.5 calls per second. If you add another
             * 0.1 queries per second to total 0.2 queries per second for an index, the
             * `GetQuerySuggestions` capacity is 2.5 calls per second (higher than five times 0.2
             * queries per second).
             */
            public fun queryCapacityUnits(queryCapacityUnits: Number)

            /**
             * @param storageCapacityUnits The amount of extra storage capacity for an index. A
             *   single capacity unit provides 30 GB of storage space or 100,000 documents,
             *   whichever is reached first. You can add up to 100 extra capacity units.
             */
            public fun storageCapacityUnits(storageCapacityUnits: Number)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.kendra.CfnIndex.CapacityUnitsConfigurationProperty.Builder =
                software.amazon.awscdk.services.kendra.CfnIndex.CapacityUnitsConfigurationProperty
                    .builder()

            /**
             * @param queryCapacityUnits The amount of extra query capacity for an index and
             *   [GetQuerySuggestions](https://docs.aws.amazon.com/kendra/latest/dg/API_GetQuerySuggestions.html)
             *   capacity. A single extra capacity unit for an index provides 0.1 queries per second
             *   or approximately 8,000 queries per day. You can add up to 100 extra capacity units.
             *
             * `GetQuerySuggestions` capacity is five times the provisioned query capacity for an
             * index, or the base capacity of 2.5 calls per second, whichever is higher. For
             * example, the base capacity for an index is 0.1 queries per second, and
             * `GetQuerySuggestions` capacity has a base of 2.5 calls per second. If you add another
             * 0.1 queries per second to total 0.2 queries per second for an index, the
             * `GetQuerySuggestions` capacity is 2.5 calls per second (higher than five times 0.2
             * queries per second).
             */
            override fun queryCapacityUnits(queryCapacityUnits: Number) {
                cdkBuilder.queryCapacityUnits(queryCapacityUnits)
            }

            /**
             * @param storageCapacityUnits The amount of extra storage capacity for an index. A
             *   single capacity unit provides 30 GB of storage space or 100,000 documents,
             *   whichever is reached first. You can add up to 100 extra capacity units.
             */
            override fun storageCapacityUnits(storageCapacityUnits: Number) {
                cdkBuilder.storageCapacityUnits(storageCapacityUnits)
            }

            public fun build():
                software.amazon.awscdk.services.kendra.CfnIndex.CapacityUnitsConfigurationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.kendra.CfnIndex.CapacityUnitsConfigurationProperty,
        ) : CapacityUnitsConfigurationProperty {
            /**
             * The amount of extra query capacity for an index and
             * [GetQuerySuggestions](https://docs.aws.amazon.com/kendra/latest/dg/API_GetQuerySuggestions.html)
             * capacity.
             *
             * A single extra capacity unit for an index provides 0.1 queries per second or
             * approximately 8,000 queries per day. You can add up to 100 extra capacity units.
             *
             * `GetQuerySuggestions` capacity is five times the provisioned query capacity for an
             * index, or the base capacity of 2.5 calls per second, whichever is higher. For
             * example, the base capacity for an index is 0.1 queries per second, and
             * `GetQuerySuggestions` capacity has a base of 2.5 calls per second. If you add another
             * 0.1 queries per second to total 0.2 queries per second for an index, the
             * `GetQuerySuggestions` capacity is 2.5 calls per second (higher than five times 0.2
             * queries per second).
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-capacityunitsconfiguration.html#cfn-kendra-index-capacityunitsconfiguration-querycapacityunits)
             */
            override fun queryCapacityUnits(): Number = unwrap(this).getQueryCapacityUnits()

            /**
             * The amount of extra storage capacity for an index.
             *
             * A single capacity unit provides 30 GB of storage space or 100,000 documents,
             * whichever is reached first. You can add up to 100 extra capacity units.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-capacityunitsconfiguration.html#cfn-kendra-index-capacityunitsconfiguration-storagecapacityunits)
             */
            override fun storageCapacityUnits(): Number = unwrap(this).getStorageCapacityUnits()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): CapacityUnitsConfigurationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.kendra.CfnIndex.CapacityUnitsConfigurationProperty
            ): CapacityUnitsConfigurationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: CapacityUnitsConfigurationProperty
            ): software.amazon.awscdk.services.kendra.CfnIndex.CapacityUnitsConfigurationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface RelevanceProperty {
        /**
         * Specifies the time period that the boost applies to.
         *
         * For example, to make the boost apply to documents with the field value within the last
         * month, you would use "2628000s". Once the field value is beyond the specified range, the
         * effect of the boost drops off. The higher the importance, the faster the effect drops
         * off. If you don't specify a value, the default is 3 months. The value of the field is a
         * numeric string followed by the character "s", for example "86400s" for one day, or
         * "604800s" for one week.
         *
         * Only applies to `DATE` fields.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-relevance.html#cfn-kendra-index-relevance-duration)
         */
        public fun duration(): String? = unwrap(this).getDuration()

        /**
         * Indicates that this field determines how "fresh" a document is.
         *
         * For example, if document 1 was created on November 5, and document 2 was created on
         * October 31, document 1 is "fresher" than document 2. You can only set the `Freshness`
         * field on one `DATE` type field. Only applies to `DATE` fields.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-relevance.html#cfn-kendra-index-relevance-freshness)
         */
        public fun freshness(): Any? = unwrap(this).getFreshness()

        /**
         * The relative importance of the field in the search.
         *
         * Larger numbers provide more of a boost than smaller numbers.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-relevance.html#cfn-kendra-index-relevance-importance)
         */
        public fun importance(): Number? = unwrap(this).getImportance()

        /**
         * Determines how values should be interpreted.
         *
         * When the `RankOrder` field is `ASCENDING` , higher numbers are better. For example, a
         * document with a rating score of 10 is higher ranking than a document with a rating score
         * of 1.
         *
         * When the `RankOrder` field is `DESCENDING` , lower numbers are better. For example, in a
         * task tracking application, a priority 1 task is more important than a priority 5 task.
         *
         * Only applies to `LONG` and `DOUBLE` fields.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-relevance.html#cfn-kendra-index-relevance-rankorder)
         */
        public fun rankOrder(): String? = unwrap(this).getRankOrder()

        /**
         * An array of key-value pairs for different boosts when they appear in the search result
         * list.
         *
         * For example, if you want to boost query terms that match the "department" field in the
         * result, query terms that match this field are boosted in the result. You can add entries
         * from the department field to boost documents with those values higher.
         *
         * For example, you can add entries to the map with names of departments. If you add "HR", 5
         * and "Legal",3 those departments are given special attention when they appear in the
         * metadata of a document.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-relevance.html#cfn-kendra-index-relevance-valueimportanceitems)
         */
        public fun valueImportanceItems(): Any? = unwrap(this).getValueImportanceItems()

        /** A builder for [RelevanceProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param duration Specifies the time period that the boost applies to. For example, to
             *   make the boost apply to documents with the field value within the last month, you
             *   would use "2628000s". Once the field value is beyond the specified range, the
             *   effect of the boost drops off. The higher the importance, the faster the effect
             *   drops off. If you don't specify a value, the default is 3 months. The value of the
             *   field is a numeric string followed by the character "s", for example "86400s" for
             *   one day, or "604800s" for one week.
             *
             * Only applies to `DATE` fields.
             */
            public fun duration(duration: String)

            /**
             * @param freshness Indicates that this field determines how "fresh" a document is. For
             *   example, if document 1 was created on November 5, and document 2 was created on
             *   October 31, document 1 is "fresher" than document 2. You can only set the
             *   `Freshness` field on one `DATE` type field. Only applies to `DATE` fields.
             */
            public fun freshness(freshness: Boolean)

            /**
             * @param freshness Indicates that this field determines how "fresh" a document is. For
             *   example, if document 1 was created on November 5, and document 2 was created on
             *   October 31, document 1 is "fresher" than document 2. You can only set the
             *   `Freshness` field on one `DATE` type field. Only applies to `DATE` fields.
             */
            public fun freshness(freshness: IResolvable)

            /**
             * @param importance The relative importance of the field in the search. Larger numbers
             *   provide more of a boost than smaller numbers.
             */
            public fun importance(importance: Number)

            /**
             * @param rankOrder Determines how values should be interpreted. When the `RankOrder`
             *   field is `ASCENDING` , higher numbers are better. For example, a document with a
             *   rating score of 10 is higher ranking than a document with a rating score of 1.
             *
             * When the `RankOrder` field is `DESCENDING` , lower numbers are better. For example,
             * in a task tracking application, a priority 1 task is more important than a priority 5
             * task.
             *
             * Only applies to `LONG` and `DOUBLE` fields.
             */
            public fun rankOrder(rankOrder: String)

            /**
             * @param valueImportanceItems An array of key-value pairs for different boosts when
             *   they appear in the search result list. For example, if you want to boost query
             *   terms that match the "department" field in the result, query terms that match this
             *   field are boosted in the result. You can add entries from the department field to
             *   boost documents with those values higher.
             *
             * For example, you can add entries to the map with names of departments. If you add
             * "HR", 5 and "Legal",3 those departments are given special attention when they appear
             * in the metadata of a document.
             */
            public fun valueImportanceItems(valueImportanceItems: IResolvable)

            /**
             * @param valueImportanceItems An array of key-value pairs for different boosts when
             *   they appear in the search result list. For example, if you want to boost query
             *   terms that match the "department" field in the result, query terms that match this
             *   field are boosted in the result. You can add entries from the department field to
             *   boost documents with those values higher.
             *
             * For example, you can add entries to the map with names of departments. If you add
             * "HR", 5 and "Legal",3 those departments are given special attention when they appear
             * in the metadata of a document.
             */
            public fun valueImportanceItems(valueImportanceItems: List<Any>)

            /**
             * @param valueImportanceItems An array of key-value pairs for different boosts when
             *   they appear in the search result list. For example, if you want to boost query
             *   terms that match the "department" field in the result, query terms that match this
             *   field are boosted in the result. You can add entries from the department field to
             *   boost documents with those values higher.
             *
             * For example, you can add entries to the map with names of departments. If you add
             * "HR", 5 and "Legal",3 those departments are given special attention when they appear
             * in the metadata of a document.
             */
            public fun valueImportanceItems(vararg valueImportanceItems: Any)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.kendra.CfnIndex.RelevanceProperty.Builder =
                software.amazon.awscdk.services.kendra.CfnIndex.RelevanceProperty.builder()

            /**
             * @param duration Specifies the time period that the boost applies to. For example, to
             *   make the boost apply to documents with the field value within the last month, you
             *   would use "2628000s". Once the field value is beyond the specified range, the
             *   effect of the boost drops off. The higher the importance, the faster the effect
             *   drops off. If you don't specify a value, the default is 3 months. The value of the
             *   field is a numeric string followed by the character "s", for example "86400s" for
             *   one day, or "604800s" for one week.
             *
             * Only applies to `DATE` fields.
             */
            override fun duration(duration: String) {
                cdkBuilder.duration(duration)
            }

            /**
             * @param freshness Indicates that this field determines how "fresh" a document is. For
             *   example, if document 1 was created on November 5, and document 2 was created on
             *   October 31, document 1 is "fresher" than document 2. You can only set the
             *   `Freshness` field on one `DATE` type field. Only applies to `DATE` fields.
             */
            override fun freshness(freshness: Boolean) {
                cdkBuilder.freshness(freshness)
            }

            /**
             * @param freshness Indicates that this field determines how "fresh" a document is. For
             *   example, if document 1 was created on November 5, and document 2 was created on
             *   October 31, document 1 is "fresher" than document 2. You can only set the
             *   `Freshness` field on one `DATE` type field. Only applies to `DATE` fields.
             */
            override fun freshness(freshness: IResolvable) {
                cdkBuilder.freshness(freshness.let(IResolvable::unwrap))
            }

            /**
             * @param importance The relative importance of the field in the search. Larger numbers
             *   provide more of a boost than smaller numbers.
             */
            override fun importance(importance: Number) {
                cdkBuilder.importance(importance)
            }

            /**
             * @param rankOrder Determines how values should be interpreted. When the `RankOrder`
             *   field is `ASCENDING` , higher numbers are better. For example, a document with a
             *   rating score of 10 is higher ranking than a document with a rating score of 1.
             *
             * When the `RankOrder` field is `DESCENDING` , lower numbers are better. For example,
             * in a task tracking application, a priority 1 task is more important than a priority 5
             * task.
             *
             * Only applies to `LONG` and `DOUBLE` fields.
             */
            override fun rankOrder(rankOrder: String) {
                cdkBuilder.rankOrder(rankOrder)
            }

            /**
             * @param valueImportanceItems An array of key-value pairs for different boosts when
             *   they appear in the search result list. For example, if you want to boost query
             *   terms that match the "department" field in the result, query terms that match this
             *   field are boosted in the result. You can add entries from the department field to
             *   boost documents with those values higher.
             *
             * For example, you can add entries to the map with names of departments. If you add
             * "HR", 5 and "Legal",3 those departments are given special attention when they appear
             * in the metadata of a document.
             */
            override fun valueImportanceItems(valueImportanceItems: IResolvable) {
                cdkBuilder.valueImportanceItems(valueImportanceItems.let(IResolvable::unwrap))
            }

            /**
             * @param valueImportanceItems An array of key-value pairs for different boosts when
             *   they appear in the search result list. For example, if you want to boost query
             *   terms that match the "department" field in the result, query terms that match this
             *   field are boosted in the result. You can add entries from the department field to
             *   boost documents with those values higher.
             *
             * For example, you can add entries to the map with names of departments. If you add
             * "HR", 5 and "Legal",3 those departments are given special attention when they appear
             * in the metadata of a document.
             */
            override fun valueImportanceItems(valueImportanceItems: List<Any>) {
                cdkBuilder.valueImportanceItems(valueImportanceItems)
            }

            /**
             * @param valueImportanceItems An array of key-value pairs for different boosts when
             *   they appear in the search result list. For example, if you want to boost query
             *   terms that match the "department" field in the result, query terms that match this
             *   field are boosted in the result. You can add entries from the department field to
             *   boost documents with those values higher.
             *
             * For example, you can add entries to the map with names of departments. If you add
             * "HR", 5 and "Legal",3 those departments are given special attention when they appear
             * in the metadata of a document.
             */
            override fun valueImportanceItems(vararg valueImportanceItems: Any): Unit =
                valueImportanceItems(valueImportanceItems.toList())

            public fun build(): software.amazon.awscdk.services.kendra.CfnIndex.RelevanceProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.kendra.CfnIndex.RelevanceProperty,
        ) : RelevanceProperty {
            /**
             * Specifies the time period that the boost applies to.
             *
             * For example, to make the boost apply to documents with the field value within the
             * last month, you would use "2628000s". Once the field value is beyond the specified
             * range, the effect of the boost drops off. The higher the importance, the faster the
             * effect drops off. If you don't specify a value, the default is 3 months. The value of
             * the field is a numeric string followed by the character "s", for example "86400s" for
             * one day, or "604800s" for one week.
             *
             * Only applies to `DATE` fields.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-relevance.html#cfn-kendra-index-relevance-duration)
             */
            override fun duration(): String? = unwrap(this).getDuration()

            /**
             * Indicates that this field determines how "fresh" a document is.
             *
             * For example, if document 1 was created on November 5, and document 2 was created on
             * October 31, document 1 is "fresher" than document 2. You can only set the `Freshness`
             * field on one `DATE` type field. Only applies to `DATE` fields.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-relevance.html#cfn-kendra-index-relevance-freshness)
             */
            override fun freshness(): Any? = unwrap(this).getFreshness()

            /**
             * The relative importance of the field in the search.
             *
             * Larger numbers provide more of a boost than smaller numbers.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-relevance.html#cfn-kendra-index-relevance-importance)
             */
            override fun importance(): Number? = unwrap(this).getImportance()

            /**
             * Determines how values should be interpreted.
             *
             * When the `RankOrder` field is `ASCENDING` , higher numbers are better. For example, a
             * document with a rating score of 10 is higher ranking than a document with a rating
             * score of 1.
             *
             * When the `RankOrder` field is `DESCENDING` , lower numbers are better. For example,
             * in a task tracking application, a priority 1 task is more important than a priority 5
             * task.
             *
             * Only applies to `LONG` and `DOUBLE` fields.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-relevance.html#cfn-kendra-index-relevance-rankorder)
             */
            override fun rankOrder(): String? = unwrap(this).getRankOrder()

            /**
             * An array of key-value pairs for different boosts when they appear in the search
             * result list.
             *
             * For example, if you want to boost query terms that match the "department" field in
             * the result, query terms that match this field are boosted in the result. You can add
             * entries from the department field to boost documents with those values higher.
             *
             * For example, you can add entries to the map with names of departments. If you add
             * "HR", 5 and "Legal",3 those departments are given special attention when they appear
             * in the metadata of a document.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-relevance.html#cfn-kendra-index-relevance-valueimportanceitems)
             */
            override fun valueImportanceItems(): Any? = unwrap(this).getValueImportanceItems()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): RelevanceProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.kendra.CfnIndex.RelevanceProperty
            ): RelevanceProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: RelevanceProperty
            ): software.amazon.awscdk.services.kendra.CfnIndex.RelevanceProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface UserTokenConfigurationProperty {
        /**
         * Information about the JSON token type configuration.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-usertokenconfiguration.html#cfn-kendra-index-usertokenconfiguration-jsontokentypeconfiguration)
         */
        public fun jsonTokenTypeConfiguration(): Any? = unwrap(this).getJsonTokenTypeConfiguration()

        /**
         * Information about the JWT token type configuration.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-usertokenconfiguration.html#cfn-kendra-index-usertokenconfiguration-jwttokentypeconfiguration)
         */
        public fun jwtTokenTypeConfiguration(): Any? = unwrap(this).getJwtTokenTypeConfiguration()

        /** A builder for [UserTokenConfigurationProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param jsonTokenTypeConfiguration Information about the JSON token type
             *   configuration.
             */
            public fun jsonTokenTypeConfiguration(jsonTokenTypeConfiguration: IResolvable)

            /**
             * @param jsonTokenTypeConfiguration Information about the JSON token type
             *   configuration.
             */
            public fun jsonTokenTypeConfiguration(
                jsonTokenTypeConfiguration: JsonTokenTypeConfigurationProperty
            )

            /**
             * @param jsonTokenTypeConfiguration Information about the JSON token type
             *   configuration.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("b2b5657d56c6ffc4b2998617167f62e077c15729e83acbefe984863f124826d6")
            public fun jsonTokenTypeConfiguration(
                jsonTokenTypeConfiguration: JsonTokenTypeConfigurationProperty.Builder.() -> Unit
            )

            /**
             * @param jwtTokenTypeConfiguration Information about the JWT token type configuration.
             */
            public fun jwtTokenTypeConfiguration(jwtTokenTypeConfiguration: IResolvable)

            /**
             * @param jwtTokenTypeConfiguration Information about the JWT token type configuration.
             */
            public fun jwtTokenTypeConfiguration(
                jwtTokenTypeConfiguration: JwtTokenTypeConfigurationProperty
            )

            /**
             * @param jwtTokenTypeConfiguration Information about the JWT token type configuration.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("d02dd01b0333bbec06cbc77d1731bd147a022d10a87639d37c63ae4aac7641f7")
            public fun jwtTokenTypeConfiguration(
                jwtTokenTypeConfiguration: JwtTokenTypeConfigurationProperty.Builder.() -> Unit
            )
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.kendra.CfnIndex.UserTokenConfigurationProperty.Builder =
                software.amazon.awscdk.services.kendra.CfnIndex.UserTokenConfigurationProperty
                    .builder()

            /**
             * @param jsonTokenTypeConfiguration Information about the JSON token type
             *   configuration.
             */
            override fun jsonTokenTypeConfiguration(jsonTokenTypeConfiguration: IResolvable) {
                cdkBuilder.jsonTokenTypeConfiguration(
                    jsonTokenTypeConfiguration.let(IResolvable::unwrap)
                )
            }

            /**
             * @param jsonTokenTypeConfiguration Information about the JSON token type
             *   configuration.
             */
            override fun jsonTokenTypeConfiguration(
                jsonTokenTypeConfiguration: JsonTokenTypeConfigurationProperty
            ) {
                cdkBuilder.jsonTokenTypeConfiguration(
                    jsonTokenTypeConfiguration.let(JsonTokenTypeConfigurationProperty::unwrap)
                )
            }

            /**
             * @param jsonTokenTypeConfiguration Information about the JSON token type
             *   configuration.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("b2b5657d56c6ffc4b2998617167f62e077c15729e83acbefe984863f124826d6")
            override fun jsonTokenTypeConfiguration(
                jsonTokenTypeConfiguration: JsonTokenTypeConfigurationProperty.Builder.() -> Unit
            ): Unit =
                jsonTokenTypeConfiguration(
                    JsonTokenTypeConfigurationProperty(jsonTokenTypeConfiguration)
                )

            /**
             * @param jwtTokenTypeConfiguration Information about the JWT token type configuration.
             */
            override fun jwtTokenTypeConfiguration(jwtTokenTypeConfiguration: IResolvable) {
                cdkBuilder.jwtTokenTypeConfiguration(
                    jwtTokenTypeConfiguration.let(IResolvable::unwrap)
                )
            }

            /**
             * @param jwtTokenTypeConfiguration Information about the JWT token type configuration.
             */
            override fun jwtTokenTypeConfiguration(
                jwtTokenTypeConfiguration: JwtTokenTypeConfigurationProperty
            ) {
                cdkBuilder.jwtTokenTypeConfiguration(
                    jwtTokenTypeConfiguration.let(JwtTokenTypeConfigurationProperty::unwrap)
                )
            }

            /**
             * @param jwtTokenTypeConfiguration Information about the JWT token type configuration.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("d02dd01b0333bbec06cbc77d1731bd147a022d10a87639d37c63ae4aac7641f7")
            override fun jwtTokenTypeConfiguration(
                jwtTokenTypeConfiguration: JwtTokenTypeConfigurationProperty.Builder.() -> Unit
            ): Unit =
                jwtTokenTypeConfiguration(
                    JwtTokenTypeConfigurationProperty(jwtTokenTypeConfiguration)
                )

            public fun build():
                software.amazon.awscdk.services.kendra.CfnIndex.UserTokenConfigurationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.kendra.CfnIndex.UserTokenConfigurationProperty,
        ) : UserTokenConfigurationProperty {
            /**
             * Information about the JSON token type configuration.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-usertokenconfiguration.html#cfn-kendra-index-usertokenconfiguration-jsontokentypeconfiguration)
             */
            override fun jsonTokenTypeConfiguration(): Any? =
                unwrap(this).getJsonTokenTypeConfiguration()

            /**
             * Information about the JWT token type configuration.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-usertokenconfiguration.html#cfn-kendra-index-usertokenconfiguration-jwttokentypeconfiguration)
             */
            override fun jwtTokenTypeConfiguration(): Any? =
                unwrap(this).getJwtTokenTypeConfiguration()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): UserTokenConfigurationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.kendra.CfnIndex.UserTokenConfigurationProperty
            ): UserTokenConfigurationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: UserTokenConfigurationProperty
            ): software.amazon.awscdk.services.kendra.CfnIndex.UserTokenConfigurationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface JwtTokenTypeConfigurationProperty {
        /**
         * The regular expression that identifies the claim.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-jwttokentypeconfiguration.html#cfn-kendra-index-jwttokentypeconfiguration-claimregex)
         */
        public fun claimRegex(): String? = unwrap(this).getClaimRegex()

        /**
         * The group attribute field.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-jwttokentypeconfiguration.html#cfn-kendra-index-jwttokentypeconfiguration-groupattributefield)
         */
        public fun groupAttributeField(): String? = unwrap(this).getGroupAttributeField()

        /**
         * The issuer of the token.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-jwttokentypeconfiguration.html#cfn-kendra-index-jwttokentypeconfiguration-issuer)
         */
        public fun issuer(): String? = unwrap(this).getIssuer()

        /**
         * The location of the key.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-jwttokentypeconfiguration.html#cfn-kendra-index-jwttokentypeconfiguration-keylocation)
         */
        public fun keyLocation(): String

        /**
         * The Amazon Resource Name (arn) of the secret.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-jwttokentypeconfiguration.html#cfn-kendra-index-jwttokentypeconfiguration-secretmanagerarn)
         */
        public fun secretManagerArn(): String? = unwrap(this).getSecretManagerArn()

        /**
         * The signing key URL.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-jwttokentypeconfiguration.html#cfn-kendra-index-jwttokentypeconfiguration-url)
         */
        public fun url(): String? = unwrap(this).getUrl()

        /**
         * The user name attribute field.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-jwttokentypeconfiguration.html#cfn-kendra-index-jwttokentypeconfiguration-usernameattributefield)
         */
        public fun userNameAttributeField(): String? = unwrap(this).getUserNameAttributeField()

        /** A builder for [JwtTokenTypeConfigurationProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param claimRegex The regular expression that identifies the claim. */
            public fun claimRegex(claimRegex: String)

            /** @param groupAttributeField The group attribute field. */
            public fun groupAttributeField(groupAttributeField: String)

            /** @param issuer The issuer of the token. */
            public fun issuer(issuer: String)

            /** @param keyLocation The location of the key. */
            public fun keyLocation(keyLocation: String)

            /** @param secretManagerArn The Amazon Resource Name (arn) of the secret. */
            public fun secretManagerArn(secretManagerArn: String)

            /** @param url The signing key URL. */
            public fun url(url: String)

            /** @param userNameAttributeField The user name attribute field. */
            public fun userNameAttributeField(userNameAttributeField: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.kendra.CfnIndex.JwtTokenTypeConfigurationProperty.Builder =
                software.amazon.awscdk.services.kendra.CfnIndex.JwtTokenTypeConfigurationProperty
                    .builder()

            /** @param claimRegex The regular expression that identifies the claim. */
            override fun claimRegex(claimRegex: String) {
                cdkBuilder.claimRegex(claimRegex)
            }

            /** @param groupAttributeField The group attribute field. */
            override fun groupAttributeField(groupAttributeField: String) {
                cdkBuilder.groupAttributeField(groupAttributeField)
            }

            /** @param issuer The issuer of the token. */
            override fun issuer(issuer: String) {
                cdkBuilder.issuer(issuer)
            }

            /** @param keyLocation The location of the key. */
            override fun keyLocation(keyLocation: String) {
                cdkBuilder.keyLocation(keyLocation)
            }

            /** @param secretManagerArn The Amazon Resource Name (arn) of the secret. */
            override fun secretManagerArn(secretManagerArn: String) {
                cdkBuilder.secretManagerArn(secretManagerArn)
            }

            /** @param url The signing key URL. */
            override fun url(url: String) {
                cdkBuilder.url(url)
            }

            /** @param userNameAttributeField The user name attribute field. */
            override fun userNameAttributeField(userNameAttributeField: String) {
                cdkBuilder.userNameAttributeField(userNameAttributeField)
            }

            public fun build():
                software.amazon.awscdk.services.kendra.CfnIndex.JwtTokenTypeConfigurationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.kendra.CfnIndex.JwtTokenTypeConfigurationProperty,
        ) : JwtTokenTypeConfigurationProperty {
            /**
             * The regular expression that identifies the claim.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-jwttokentypeconfiguration.html#cfn-kendra-index-jwttokentypeconfiguration-claimregex)
             */
            override fun claimRegex(): String? = unwrap(this).getClaimRegex()

            /**
             * The group attribute field.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-jwttokentypeconfiguration.html#cfn-kendra-index-jwttokentypeconfiguration-groupattributefield)
             */
            override fun groupAttributeField(): String? = unwrap(this).getGroupAttributeField()

            /**
             * The issuer of the token.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-jwttokentypeconfiguration.html#cfn-kendra-index-jwttokentypeconfiguration-issuer)
             */
            override fun issuer(): String? = unwrap(this).getIssuer()

            /**
             * The location of the key.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-jwttokentypeconfiguration.html#cfn-kendra-index-jwttokentypeconfiguration-keylocation)
             */
            override fun keyLocation(): String = unwrap(this).getKeyLocation()

            /**
             * The Amazon Resource Name (arn) of the secret.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-jwttokentypeconfiguration.html#cfn-kendra-index-jwttokentypeconfiguration-secretmanagerarn)
             */
            override fun secretManagerArn(): String? = unwrap(this).getSecretManagerArn()

            /**
             * The signing key URL.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-jwttokentypeconfiguration.html#cfn-kendra-index-jwttokentypeconfiguration-url)
             */
            override fun url(): String? = unwrap(this).getUrl()

            /**
             * The user name attribute field.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-jwttokentypeconfiguration.html#cfn-kendra-index-jwttokentypeconfiguration-usernameattributefield)
             */
            override fun userNameAttributeField(): String? =
                unwrap(this).getUserNameAttributeField()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): JwtTokenTypeConfigurationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.kendra.CfnIndex.JwtTokenTypeConfigurationProperty
            ): JwtTokenTypeConfigurationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: JwtTokenTypeConfigurationProperty
            ): software.amazon.awscdk.services.kendra.CfnIndex.JwtTokenTypeConfigurationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface DocumentMetadataConfigurationProperty {
        /**
         * The name of the index field.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-documentmetadataconfiguration.html#cfn-kendra-index-documentmetadataconfiguration-name)
         */
        public fun name(): String

        /**
         * Provides tuning parameters to determine how the field affects the search results.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-documentmetadataconfiguration.html#cfn-kendra-index-documentmetadataconfiguration-relevance)
         */
        public fun relevance(): Any? = unwrap(this).getRelevance()

        /**
         * Provides information about how the field is used during a search.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-documentmetadataconfiguration.html#cfn-kendra-index-documentmetadataconfiguration-search)
         */
        public fun search(): Any? = unwrap(this).getSearch()

        /**
         * The data type of the index field.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-documentmetadataconfiguration.html#cfn-kendra-index-documentmetadataconfiguration-type)
         */
        public fun type(): String

        /** A builder for [DocumentMetadataConfigurationProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param name The name of the index field. */
            public fun name(name: String)

            /**
             * @param relevance Provides tuning parameters to determine how the field affects the
             *   search results.
             */
            public fun relevance(relevance: IResolvable)

            /**
             * @param relevance Provides tuning parameters to determine how the field affects the
             *   search results.
             */
            public fun relevance(relevance: RelevanceProperty)

            /**
             * @param relevance Provides tuning parameters to determine how the field affects the
             *   search results.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("fd71cb346fd43a23cb27cd4336b913ab1ed1651c684ae7045c87fd3eea2236e8")
            public fun relevance(relevance: RelevanceProperty.Builder.() -> Unit)

            /** @param search Provides information about how the field is used during a search. */
            public fun search(search: IResolvable)

            /** @param search Provides information about how the field is used during a search. */
            public fun search(search: SearchProperty)

            /** @param search Provides information about how the field is used during a search. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("85095dde21447ef2f3d3bb8aed5edd9c3a66f25cf46dc38121e1038b29d27f81")
            public fun search(search: SearchProperty.Builder.() -> Unit)

            /** @param type The data type of the index field. */
            public fun type(type: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.kendra.CfnIndex.DocumentMetadataConfigurationProperty.Builder =
                software.amazon.awscdk.services.kendra.CfnIndex
                    .DocumentMetadataConfigurationProperty
                    .builder()

            /** @param name The name of the index field. */
            override fun name(name: String) {
                cdkBuilder.name(name)
            }

            /**
             * @param relevance Provides tuning parameters to determine how the field affects the
             *   search results.
             */
            override fun relevance(relevance: IResolvable) {
                cdkBuilder.relevance(relevance.let(IResolvable::unwrap))
            }

            /**
             * @param relevance Provides tuning parameters to determine how the field affects the
             *   search results.
             */
            override fun relevance(relevance: RelevanceProperty) {
                cdkBuilder.relevance(relevance.let(RelevanceProperty::unwrap))
            }

            /**
             * @param relevance Provides tuning parameters to determine how the field affects the
             *   search results.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("fd71cb346fd43a23cb27cd4336b913ab1ed1651c684ae7045c87fd3eea2236e8")
            override fun relevance(relevance: RelevanceProperty.Builder.() -> Unit): Unit =
                relevance(RelevanceProperty(relevance))

            /** @param search Provides information about how the field is used during a search. */
            override fun search(search: IResolvable) {
                cdkBuilder.search(search.let(IResolvable::unwrap))
            }

            /** @param search Provides information about how the field is used during a search. */
            override fun search(search: SearchProperty) {
                cdkBuilder.search(search.let(SearchProperty::unwrap))
            }

            /** @param search Provides information about how the field is used during a search. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("85095dde21447ef2f3d3bb8aed5edd9c3a66f25cf46dc38121e1038b29d27f81")
            override fun search(search: SearchProperty.Builder.() -> Unit): Unit =
                search(SearchProperty(search))

            /** @param type The data type of the index field. */
            override fun type(type: String) {
                cdkBuilder.type(type)
            }

            public fun build():
                software.amazon.awscdk.services.kendra.CfnIndex.DocumentMetadataConfigurationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.kendra.CfnIndex.DocumentMetadataConfigurationProperty,
        ) : DocumentMetadataConfigurationProperty {
            /**
             * The name of the index field.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-documentmetadataconfiguration.html#cfn-kendra-index-documentmetadataconfiguration-name)
             */
            override fun name(): String = unwrap(this).getName()

            /**
             * Provides tuning parameters to determine how the field affects the search results.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-documentmetadataconfiguration.html#cfn-kendra-index-documentmetadataconfiguration-relevance)
             */
            override fun relevance(): Any? = unwrap(this).getRelevance()

            /**
             * Provides information about how the field is used during a search.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-documentmetadataconfiguration.html#cfn-kendra-index-documentmetadataconfiguration-search)
             */
            override fun search(): Any? = unwrap(this).getSearch()

            /**
             * The data type of the index field.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-documentmetadataconfiguration.html#cfn-kendra-index-documentmetadataconfiguration-type)
             */
            override fun type(): String = unwrap(this).getType()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): DocumentMetadataConfigurationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.kendra.CfnIndex.DocumentMetadataConfigurationProperty
            ): DocumentMetadataConfigurationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: DocumentMetadataConfigurationProperty
            ): software.amazon.awscdk.services.kendra.CfnIndex.DocumentMetadataConfigurationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface ServerSideEncryptionConfigurationProperty {
        /**
         * The identifier of the AWS KMS key .
         *
         * Amazon Kendra doesn't support asymmetric keys.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-serversideencryptionconfiguration.html#cfn-kendra-index-serversideencryptionconfiguration-kmskeyid)
         */
        public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

        /** A builder for [ServerSideEncryptionConfigurationProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param kmsKeyId The identifier of the AWS KMS key . Amazon Kendra doesn't support
             *   asymmetric keys.
             */
            public fun kmsKeyId(kmsKeyId: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.kendra.CfnIndex.ServerSideEncryptionConfigurationProperty.Builder =
                software.amazon.awscdk.services.kendra.CfnIndex
                    .ServerSideEncryptionConfigurationProperty
                    .builder()

            /**
             * @param kmsKeyId The identifier of the AWS KMS key . Amazon Kendra doesn't support
             *   asymmetric keys.
             */
            override fun kmsKeyId(kmsKeyId: String) {
                cdkBuilder.kmsKeyId(kmsKeyId)
            }

            public fun build():
                software.amazon.awscdk.services.kendra.CfnIndex.ServerSideEncryptionConfigurationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.kendra.CfnIndex.ServerSideEncryptionConfigurationProperty,
        ) : ServerSideEncryptionConfigurationProperty {
            /**
             * The identifier of the AWS KMS key .
             *
             * Amazon Kendra doesn't support asymmetric keys.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-serversideencryptionconfiguration.html#cfn-kendra-index-serversideencryptionconfiguration-kmskeyid)
             */
            override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): ServerSideEncryptionConfigurationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.kendra.CfnIndex.ServerSideEncryptionConfigurationProperty
            ): ServerSideEncryptionConfigurationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: ServerSideEncryptionConfigurationProperty
            ): software.amazon.awscdk.services.kendra.CfnIndex.ServerSideEncryptionConfigurationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface JsonTokenTypeConfigurationProperty {
        /**
         * The group attribute field.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-jsontokentypeconfiguration.html#cfn-kendra-index-jsontokentypeconfiguration-groupattributefield)
         */
        public fun groupAttributeField(): String

        /**
         * The user name attribute field.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-jsontokentypeconfiguration.html#cfn-kendra-index-jsontokentypeconfiguration-usernameattributefield)
         */
        public fun userNameAttributeField(): String

        /** A builder for [JsonTokenTypeConfigurationProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param groupAttributeField The group attribute field. */
            public fun groupAttributeField(groupAttributeField: String)

            /** @param userNameAttributeField The user name attribute field. */
            public fun userNameAttributeField(userNameAttributeField: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.kendra.CfnIndex.JsonTokenTypeConfigurationProperty.Builder =
                software.amazon.awscdk.services.kendra.CfnIndex.JsonTokenTypeConfigurationProperty
                    .builder()

            /** @param groupAttributeField The group attribute field. */
            override fun groupAttributeField(groupAttributeField: String) {
                cdkBuilder.groupAttributeField(groupAttributeField)
            }

            /** @param userNameAttributeField The user name attribute field. */
            override fun userNameAttributeField(userNameAttributeField: String) {
                cdkBuilder.userNameAttributeField(userNameAttributeField)
            }

            public fun build():
                software.amazon.awscdk.services.kendra.CfnIndex.JsonTokenTypeConfigurationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.kendra.CfnIndex.JsonTokenTypeConfigurationProperty,
        ) : JsonTokenTypeConfigurationProperty {
            /**
             * The group attribute field.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-jsontokentypeconfiguration.html#cfn-kendra-index-jsontokentypeconfiguration-groupattributefield)
             */
            override fun groupAttributeField(): String = unwrap(this).getGroupAttributeField()

            /**
             * The user name attribute field.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-jsontokentypeconfiguration.html#cfn-kendra-index-jsontokentypeconfiguration-usernameattributefield)
             */
            override fun userNameAttributeField(): String = unwrap(this).getUserNameAttributeField()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): JsonTokenTypeConfigurationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.kendra.CfnIndex.JsonTokenTypeConfigurationProperty
            ): JsonTokenTypeConfigurationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: JsonTokenTypeConfigurationProperty
            ): software.amazon.awscdk.services.kendra.CfnIndex.JsonTokenTypeConfigurationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface SearchProperty {
        /**
         * Determines whether the field is returned in the query response.
         *
         * The default is `true` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-search.html#cfn-kendra-index-search-displayable)
         */
        public fun displayable(): Any? = unwrap(this).getDisplayable()

        /**
         * Indicates that the field can be used to create search facets, a count of results for each
         * value in the field.
         *
         * The default is `false` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-search.html#cfn-kendra-index-search-facetable)
         */
        public fun facetable(): Any? = unwrap(this).getFacetable()

        /**
         * Determines whether the field is used in the search.
         *
         * If the `Searchable` field is `true` , you can use relevance tuning to manually tune how
         * Amazon Kendra weights the field in the search. The default is `true` for string fields
         * and `false` for number and date fields.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-search.html#cfn-kendra-index-search-searchable)
         */
        public fun searchable(): Any? = unwrap(this).getSearchable()

        /**
         * Determines whether the field can be used to sort the results of a query.
         *
         * The default is `false` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-search.html#cfn-kendra-index-search-sortable)
         */
        public fun sortable(): Any? = unwrap(this).getSortable()

        /** A builder for [SearchProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param displayable Determines whether the field is returned in the query response.
             *   The default is `true` .
             */
            public fun displayable(displayable: Boolean)

            /**
             * @param displayable Determines whether the field is returned in the query response.
             *   The default is `true` .
             */
            public fun displayable(displayable: IResolvable)

            /**
             * @param facetable Indicates that the field can be used to create search facets, a
             *   count of results for each value in the field. The default is `false` .
             */
            public fun facetable(facetable: Boolean)

            /**
             * @param facetable Indicates that the field can be used to create search facets, a
             *   count of results for each value in the field. The default is `false` .
             */
            public fun facetable(facetable: IResolvable)

            /**
             * @param searchable Determines whether the field is used in the search. If the
             *   `Searchable` field is `true` , you can use relevance tuning to manually tune how
             *   Amazon Kendra weights the field in the search. The default is `true` for string
             *   fields and `false` for number and date fields.
             */
            public fun searchable(searchable: Boolean)

            /**
             * @param searchable Determines whether the field is used in the search. If the
             *   `Searchable` field is `true` , you can use relevance tuning to manually tune how
             *   Amazon Kendra weights the field in the search. The default is `true` for string
             *   fields and `false` for number and date fields.
             */
            public fun searchable(searchable: IResolvable)

            /**
             * @param sortable Determines whether the field can be used to sort the results of a
             *   query. The default is `false` .
             */
            public fun sortable(sortable: Boolean)

            /**
             * @param sortable Determines whether the field can be used to sort the results of a
             *   query. The default is `false` .
             */
            public fun sortable(sortable: IResolvable)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.kendra.CfnIndex.SearchProperty.Builder =
                software.amazon.awscdk.services.kendra.CfnIndex.SearchProperty.builder()

            /**
             * @param displayable Determines whether the field is returned in the query response.
             *   The default is `true` .
             */
            override fun displayable(displayable: Boolean) {
                cdkBuilder.displayable(displayable)
            }

            /**
             * @param displayable Determines whether the field is returned in the query response.
             *   The default is `true` .
             */
            override fun displayable(displayable: IResolvable) {
                cdkBuilder.displayable(displayable.let(IResolvable::unwrap))
            }

            /**
             * @param facetable Indicates that the field can be used to create search facets, a
             *   count of results for each value in the field. The default is `false` .
             */
            override fun facetable(facetable: Boolean) {
                cdkBuilder.facetable(facetable)
            }

            /**
             * @param facetable Indicates that the field can be used to create search facets, a
             *   count of results for each value in the field. The default is `false` .
             */
            override fun facetable(facetable: IResolvable) {
                cdkBuilder.facetable(facetable.let(IResolvable::unwrap))
            }

            /**
             * @param searchable Determines whether the field is used in the search. If the
             *   `Searchable` field is `true` , you can use relevance tuning to manually tune how
             *   Amazon Kendra weights the field in the search. The default is `true` for string
             *   fields and `false` for number and date fields.
             */
            override fun searchable(searchable: Boolean) {
                cdkBuilder.searchable(searchable)
            }

            /**
             * @param searchable Determines whether the field is used in the search. If the
             *   `Searchable` field is `true` , you can use relevance tuning to manually tune how
             *   Amazon Kendra weights the field in the search. The default is `true` for string
             *   fields and `false` for number and date fields.
             */
            override fun searchable(searchable: IResolvable) {
                cdkBuilder.searchable(searchable.let(IResolvable::unwrap))
            }

            /**
             * @param sortable Determines whether the field can be used to sort the results of a
             *   query. The default is `false` .
             */
            override fun sortable(sortable: Boolean) {
                cdkBuilder.sortable(sortable)
            }

            /**
             * @param sortable Determines whether the field can be used to sort the results of a
             *   query. The default is `false` .
             */
            override fun sortable(sortable: IResolvable) {
                cdkBuilder.sortable(sortable.let(IResolvable::unwrap))
            }

            public fun build(): software.amazon.awscdk.services.kendra.CfnIndex.SearchProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject: software.amazon.awscdk.services.kendra.CfnIndex.SearchProperty,
        ) : SearchProperty {
            /**
             * Determines whether the field is returned in the query response.
             *
             * The default is `true` .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-search.html#cfn-kendra-index-search-displayable)
             */
            override fun displayable(): Any? = unwrap(this).getDisplayable()

            /**
             * Indicates that the field can be used to create search facets, a count of results for
             * each value in the field.
             *
             * The default is `false` .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-search.html#cfn-kendra-index-search-facetable)
             */
            override fun facetable(): Any? = unwrap(this).getFacetable()

            /**
             * Determines whether the field is used in the search.
             *
             * If the `Searchable` field is `true` , you can use relevance tuning to manually tune
             * how Amazon Kendra weights the field in the search. The default is `true` for string
             * fields and `false` for number and date fields.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-search.html#cfn-kendra-index-search-searchable)
             */
            override fun searchable(): Any? = unwrap(this).getSearchable()

            /**
             * Determines whether the field can be used to sort the results of a query.
             *
             * The default is `false` .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-search.html#cfn-kendra-index-search-sortable)
             */
            override fun sortable(): Any? = unwrap(this).getSortable()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): SearchProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.kendra.CfnIndex.SearchProperty
            ): SearchProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: SearchProperty
            ): software.amazon.awscdk.services.kendra.CfnIndex.SearchProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface ValueImportanceItemProperty {
        /**
         * The document metadata value used for the search boost.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-valueimportanceitem.html#cfn-kendra-index-valueimportanceitem-key)
         */
        public fun key(): String? = unwrap(this).getKey()

        /**
         * The boost value for a document when the key is part of the metadata of a document.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-valueimportanceitem.html#cfn-kendra-index-valueimportanceitem-value)
         */
        public fun `value`(): Number? = unwrap(this).getValue()

        /** A builder for [ValueImportanceItemProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param key The document metadata value used for the search boost. */
            public fun key(key: String)

            /**
             * @param value The boost value for a document when the key is part of the metadata of a
             *   document.
             */
            public fun `value`(`value`: Number)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.kendra.CfnIndex.ValueImportanceItemProperty.Builder =
                software.amazon.awscdk.services.kendra.CfnIndex.ValueImportanceItemProperty
                    .builder()

            /** @param key The document metadata value used for the search boost. */
            override fun key(key: String) {
                cdkBuilder.key(key)
            }

            /**
             * @param value The boost value for a document when the key is part of the metadata of a
             *   document.
             */
            override fun `value`(`value`: Number) {
                cdkBuilder.`value`(`value`)
            }

            public fun build():
                software.amazon.awscdk.services.kendra.CfnIndex.ValueImportanceItemProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.kendra.CfnIndex.ValueImportanceItemProperty,
        ) : ValueImportanceItemProperty {
            /**
             * The document metadata value used for the search boost.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-valueimportanceitem.html#cfn-kendra-index-valueimportanceitem-key)
             */
            override fun key(): String? = unwrap(this).getKey()

            /**
             * The boost value for a document when the key is part of the metadata of a document.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-valueimportanceitem.html#cfn-kendra-index-valueimportanceitem-value)
             */
            override fun `value`(): Number? = unwrap(this).getValue()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): ValueImportanceItemProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.kendra.CfnIndex.ValueImportanceItemProperty
            ): ValueImportanceItemProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: ValueImportanceItemProperty
            ): software.amazon.awscdk.services.kendra.CfnIndex.ValueImportanceItemProperty =
                (wrapped as Wrapper).cdkObject
        }
    }
}
