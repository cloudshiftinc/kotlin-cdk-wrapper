package io.cloudshiftdev.awscdk.services.mediapackage

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
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnPackagingGroup
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.mediapackage.CfnPackagingGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
    /**
     * The Amazon Resource Name (ARN) for the packaging group.
     *
     * You can get this from the response to any request to the packaging group.
     */
    public open fun attrArn(): String = unwrap(this).getAttrArn()

    /** The URL for the assets in the PackagingGroup. */
    public open fun attrDomainName(): String = unwrap(this).getAttrDomainName()

    /** Parameters for CDN authorization. */
    public open fun authorization(): Any? = unwrap(this).getAuthorization()

    /** Parameters for CDN authorization. */
    public open fun authorization(`value`: IResolvable) {
        unwrap(this).setAuthorization(`value`.let(IResolvable::unwrap))
    }

    /** Parameters for CDN authorization. */
    public open fun authorization(`value`: AuthorizationProperty) {
        unwrap(this).setAuthorization(`value`.let(AuthorizationProperty::unwrap))
    }

    /** Parameters for CDN authorization. */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9ed9c4552c9cd492021c082edf18d6af8bb438de9feee99899150fead841664e")
    public open fun authorization(`value`: AuthorizationProperty.Builder.() -> Unit): Unit =
        authorization(AuthorizationProperty(`value`))

    /** The configuration parameters for egress access logging. */
    public open fun egressAccessLogs(): Any? = unwrap(this).getEgressAccessLogs()

    /** The configuration parameters for egress access logging. */
    public open fun egressAccessLogs(`value`: IResolvable) {
        unwrap(this).setEgressAccessLogs(`value`.let(IResolvable::unwrap))
    }

    /** The configuration parameters for egress access logging. */
    public open fun egressAccessLogs(`value`: LogConfigurationProperty) {
        unwrap(this).setEgressAccessLogs(`value`.let(LogConfigurationProperty::unwrap))
    }

    /** The configuration parameters for egress access logging. */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("45ee764029ffbca0c6df1d63ca890de2099a850f4c6da009ea7aa29ab8a1cf39")
    public open fun egressAccessLogs(`value`: LogConfigurationProperty.Builder.() -> Unit): Unit =
        egressAccessLogs(LogConfigurationProperty(`value`))

    /** Unique identifier that you assign to the packaging group. */
    public open fun id(): String = unwrap(this).getId()

    /** Unique identifier that you assign to the packaging group. */
    public open fun id(`value`: String) {
        unwrap(this).setId(`value`)
    }

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** Tag Manager which manages the tags for this resource. */
    public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

    /** The tags to assign to the packaging group. */
    public open fun tagsRaw(): List<CfnTag> =
        unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?: emptyList()

    /** The tags to assign to the packaging group. */
    public open fun tagsRaw(`value`: List<CfnTag>) {
        unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
    }

    /** The tags to assign to the packaging group. */
    public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.mediapackage.CfnPackagingGroup]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * Parameters for CDN authorization.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packaginggroup.html#cfn-mediapackage-packaginggroup-authorization)
         *
         * @param authorization Parameters for CDN authorization.
         */
        public fun authorization(authorization: IResolvable)

        /**
         * Parameters for CDN authorization.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packaginggroup.html#cfn-mediapackage-packaginggroup-authorization)
         *
         * @param authorization Parameters for CDN authorization.
         */
        public fun authorization(authorization: AuthorizationProperty)

        /**
         * Parameters for CDN authorization.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packaginggroup.html#cfn-mediapackage-packaginggroup-authorization)
         *
         * @param authorization Parameters for CDN authorization.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("3e221a21f62544a45d07d0a67454c628e7b836e81ed13ec14bf2896c52d9c6bd")
        public fun authorization(authorization: AuthorizationProperty.Builder.() -> Unit)

        /**
         * The configuration parameters for egress access logging.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packaginggroup.html#cfn-mediapackage-packaginggroup-egressaccesslogs)
         *
         * @param egressAccessLogs The configuration parameters for egress access logging.
         */
        public fun egressAccessLogs(egressAccessLogs: IResolvable)

        /**
         * The configuration parameters for egress access logging.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packaginggroup.html#cfn-mediapackage-packaginggroup-egressaccesslogs)
         *
         * @param egressAccessLogs The configuration parameters for egress access logging.
         */
        public fun egressAccessLogs(egressAccessLogs: LogConfigurationProperty)

        /**
         * The configuration parameters for egress access logging.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packaginggroup.html#cfn-mediapackage-packaginggroup-egressaccesslogs)
         *
         * @param egressAccessLogs The configuration parameters for egress access logging.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("6f5eb1f003827cf2ebf3ec2e3053e750252a1826628d0a46903431f6fa94e78d")
        public fun egressAccessLogs(egressAccessLogs: LogConfigurationProperty.Builder.() -> Unit)

        /**
         * Unique identifier that you assign to the packaging group.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packaginggroup.html#cfn-mediapackage-packaginggroup-id)
         *
         * @param id Unique identifier that you assign to the packaging group.
         */
        public fun id(id: String)

        /**
         * The tags to assign to the packaging group.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packaginggroup.html#cfn-mediapackage-packaginggroup-tags)
         *
         * @param tags The tags to assign to the packaging group.
         */
        public fun tags(tags: List<CfnTag>)

        /**
         * The tags to assign to the packaging group.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packaginggroup.html#cfn-mediapackage-packaginggroup-tags)
         *
         * @param tags The tags to assign to the packaging group.
         */
        public fun tags(vararg tags: CfnTag)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.mediapackage.CfnPackagingGroup.Builder =
            software.amazon.awscdk.services.mediapackage.CfnPackagingGroup.Builder.create(scope, id)

        /**
         * Parameters for CDN authorization.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packaginggroup.html#cfn-mediapackage-packaginggroup-authorization)
         *
         * @param authorization Parameters for CDN authorization.
         */
        override fun authorization(authorization: IResolvable) {
            cdkBuilder.authorization(authorization.let(IResolvable::unwrap))
        }

        /**
         * Parameters for CDN authorization.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packaginggroup.html#cfn-mediapackage-packaginggroup-authorization)
         *
         * @param authorization Parameters for CDN authorization.
         */
        override fun authorization(authorization: AuthorizationProperty) {
            cdkBuilder.authorization(authorization.let(AuthorizationProperty::unwrap))
        }

        /**
         * Parameters for CDN authorization.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packaginggroup.html#cfn-mediapackage-packaginggroup-authorization)
         *
         * @param authorization Parameters for CDN authorization.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("3e221a21f62544a45d07d0a67454c628e7b836e81ed13ec14bf2896c52d9c6bd")
        override fun authorization(authorization: AuthorizationProperty.Builder.() -> Unit): Unit =
            authorization(AuthorizationProperty(authorization))

        /**
         * The configuration parameters for egress access logging.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packaginggroup.html#cfn-mediapackage-packaginggroup-egressaccesslogs)
         *
         * @param egressAccessLogs The configuration parameters for egress access logging.
         */
        override fun egressAccessLogs(egressAccessLogs: IResolvable) {
            cdkBuilder.egressAccessLogs(egressAccessLogs.let(IResolvable::unwrap))
        }

        /**
         * The configuration parameters for egress access logging.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packaginggroup.html#cfn-mediapackage-packaginggroup-egressaccesslogs)
         *
         * @param egressAccessLogs The configuration parameters for egress access logging.
         */
        override fun egressAccessLogs(egressAccessLogs: LogConfigurationProperty) {
            cdkBuilder.egressAccessLogs(egressAccessLogs.let(LogConfigurationProperty::unwrap))
        }

        /**
         * The configuration parameters for egress access logging.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packaginggroup.html#cfn-mediapackage-packaginggroup-egressaccesslogs)
         *
         * @param egressAccessLogs The configuration parameters for egress access logging.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("6f5eb1f003827cf2ebf3ec2e3053e750252a1826628d0a46903431f6fa94e78d")
        override fun egressAccessLogs(
            egressAccessLogs: LogConfigurationProperty.Builder.() -> Unit
        ): Unit = egressAccessLogs(LogConfigurationProperty(egressAccessLogs))

        /**
         * Unique identifier that you assign to the packaging group.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packaginggroup.html#cfn-mediapackage-packaginggroup-id)
         *
         * @param id Unique identifier that you assign to the packaging group.
         */
        override fun id(id: String) {
            cdkBuilder.id(id)
        }

        /**
         * The tags to assign to the packaging group.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packaginggroup.html#cfn-mediapackage-packaginggroup-tags)
         *
         * @param tags The tags to assign to the packaging group.
         */
        override fun tags(tags: List<CfnTag>) {
            cdkBuilder.tags(tags.map(CfnTag::unwrap))
        }

        /**
         * The tags to assign to the packaging group.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packaginggroup.html#cfn-mediapackage-packaginggroup-tags)
         *
         * @param tags The tags to assign to the packaging group.
         */
        override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

        public fun build(): software.amazon.awscdk.services.mediapackage.CfnPackagingGroup =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnPackagingGroup {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnPackagingGroup(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.mediapackage.CfnPackagingGroup
        ): CfnPackagingGroup = CfnPackagingGroup(cdkObject)

        internal fun unwrap(
            wrapped: CfnPackagingGroup
        ): software.amazon.awscdk.services.mediapackage.CfnPackagingGroup = wrapped.cdkObject
    }

    public interface AuthorizationProperty {
        /**
         * The Amazon Resource Name (ARN) for the secret in AWS Secrets Manager that is used for CDN
         * authorization.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packaginggroup-authorization.html#cfn-mediapackage-packaginggroup-authorization-cdnidentifiersecret)
         */
        public fun cdnIdentifierSecret(): String

        /**
         * The Amazon Resource Name (ARN) for the IAM role that allows AWS Elemental MediaPackage to
         * communicate with AWS Secrets Manager .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packaginggroup-authorization.html#cfn-mediapackage-packaginggroup-authorization-secretsrolearn)
         */
        public fun secretsRoleArn(): String

        /** A builder for [AuthorizationProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param cdnIdentifierSecret The Amazon Resource Name (ARN) for the secret in AWS
             *   Secrets Manager that is used for CDN authorization.
             */
            public fun cdnIdentifierSecret(cdnIdentifierSecret: String)

            /**
             * @param secretsRoleArn The Amazon Resource Name (ARN) for the IAM role that allows AWS
             *   Elemental MediaPackage to communicate with AWS Secrets Manager .
             */
            public fun secretsRoleArn(secretsRoleArn: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.mediapackage.CfnPackagingGroup.AuthorizationProperty.Builder =
                software.amazon.awscdk.services.mediapackage.CfnPackagingGroup.AuthorizationProperty
                    .builder()

            /**
             * @param cdnIdentifierSecret The Amazon Resource Name (ARN) for the secret in AWS
             *   Secrets Manager that is used for CDN authorization.
             */
            override fun cdnIdentifierSecret(cdnIdentifierSecret: String) {
                cdkBuilder.cdnIdentifierSecret(cdnIdentifierSecret)
            }

            /**
             * @param secretsRoleArn The Amazon Resource Name (ARN) for the IAM role that allows AWS
             *   Elemental MediaPackage to communicate with AWS Secrets Manager .
             */
            override fun secretsRoleArn(secretsRoleArn: String) {
                cdkBuilder.secretsRoleArn(secretsRoleArn)
            }

            public fun build():
                software.amazon.awscdk.services.mediapackage.CfnPackagingGroup.AuthorizationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.mediapackage.CfnPackagingGroup.AuthorizationProperty,
        ) : AuthorizationProperty {
            /**
             * The Amazon Resource Name (ARN) for the secret in AWS Secrets Manager that is used for
             * CDN authorization.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packaginggroup-authorization.html#cfn-mediapackage-packaginggroup-authorization-cdnidentifiersecret)
             */
            override fun cdnIdentifierSecret(): String = unwrap(this).getCdnIdentifierSecret()

            /**
             * The Amazon Resource Name (ARN) for the IAM role that allows AWS Elemental
             * MediaPackage to communicate with AWS Secrets Manager .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packaginggroup-authorization.html#cfn-mediapackage-packaginggroup-authorization-secretsrolearn)
             */
            override fun secretsRoleArn(): String = unwrap(this).getSecretsRoleArn()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): AuthorizationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.mediapackage.CfnPackagingGroup.AuthorizationProperty
            ): AuthorizationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: AuthorizationProperty
            ): software.amazon.awscdk.services.mediapackage.CfnPackagingGroup.AuthorizationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface LogConfigurationProperty {
        /**
         * Sets a custom Amazon CloudWatch log group name for egress logs.
         *
         * If a log group name isn't specified, the default name is used:
         * /aws/MediaPackage/EgressAccessLogs.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packaginggroup-logconfiguration.html#cfn-mediapackage-packaginggroup-logconfiguration-loggroupname)
         */
        public fun logGroupName(): String? = unwrap(this).getLogGroupName()

        /** A builder for [LogConfigurationProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param logGroupName Sets a custom Amazon CloudWatch log group name for egress logs.
             *   If a log group name isn't specified, the default name is used:
             *   /aws/MediaPackage/EgressAccessLogs.
             */
            public fun logGroupName(logGroupName: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.mediapackage.CfnPackagingGroup.LogConfigurationProperty.Builder =
                software.amazon.awscdk.services.mediapackage.CfnPackagingGroup
                    .LogConfigurationProperty
                    .builder()

            /**
             * @param logGroupName Sets a custom Amazon CloudWatch log group name for egress logs.
             *   If a log group name isn't specified, the default name is used:
             *   /aws/MediaPackage/EgressAccessLogs.
             */
            override fun logGroupName(logGroupName: String) {
                cdkBuilder.logGroupName(logGroupName)
            }

            public fun build():
                software.amazon.awscdk.services.mediapackage.CfnPackagingGroup.LogConfigurationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.mediapackage.CfnPackagingGroup.LogConfigurationProperty,
        ) : LogConfigurationProperty {
            /**
             * Sets a custom Amazon CloudWatch log group name for egress logs.
             *
             * If a log group name isn't specified, the default name is used:
             * /aws/MediaPackage/EgressAccessLogs.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packaginggroup-logconfiguration.html#cfn-mediapackage-packaginggroup-logconfiguration-loggroupname)
             */
            override fun logGroupName(): String? = unwrap(this).getLogGroupName()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): LogConfigurationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.mediapackage.CfnPackagingGroup.LogConfigurationProperty
            ): LogConfigurationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: LogConfigurationProperty
            ): software.amazon.awscdk.services.mediapackage.CfnPackagingGroup.LogConfigurationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }
}
