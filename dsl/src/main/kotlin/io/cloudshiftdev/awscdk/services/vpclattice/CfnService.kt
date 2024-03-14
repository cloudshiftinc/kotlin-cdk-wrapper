package io.cloudshiftdev.awscdk.services.vpclattice

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

public open class CfnService
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.vpclattice.CfnService,
) : CfnResource(cdkObject), IInspectable, ITaggable {
    /** The Amazon Resource Name (ARN) of the service. */
    public open fun attrArn(): String = unwrap(this).getAttrArn()

    /** The date and time that the service was created, specified in ISO-8601 format. */
    public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

    /** The domain name of the service. */
    public open fun attrDnsEntryDomainName(): String = unwrap(this).getAttrDnsEntryDomainName()

    /** The ID of the hosted zone. */
    public open fun attrDnsEntryHostedZoneId(): String = unwrap(this).getAttrDnsEntryHostedZoneId()

    /** The ID of the service. */
    public open fun attrId(): String = unwrap(this).getAttrId()

    /** The date and time that the service was last updated, specified in ISO-8601 format. */
    public open fun attrLastUpdatedAt(): String = unwrap(this).getAttrLastUpdatedAt()

    /** The status of the service. */
    public open fun attrStatus(): String = unwrap(this).getAttrStatus()

    /** The type of IAM policy. */
    public open fun authType(): String? = unwrap(this).getAuthType()

    /** The type of IAM policy. */
    public open fun authType(`value`: String) {
        unwrap(this).setAuthType(`value`)
    }

    /** The Amazon Resource Name (ARN) of the certificate. */
    public open fun certificateArn(): String? = unwrap(this).getCertificateArn()

    /** The Amazon Resource Name (ARN) of the certificate. */
    public open fun certificateArn(`value`: String) {
        unwrap(this).setCertificateArn(`value`)
    }

    /** The custom domain name of the service. */
    public open fun customDomainName(): String? = unwrap(this).getCustomDomainName()

    /** The custom domain name of the service. */
    public open fun customDomainName(`value`: String) {
        unwrap(this).setCustomDomainName(`value`)
    }

    /** The DNS information of the service. */
    public open fun dnsEntry(): Any? = unwrap(this).getDnsEntry()

    /** The DNS information of the service. */
    public open fun dnsEntry(`value`: IResolvable) {
        unwrap(this).setDnsEntry(`value`.let(IResolvable::unwrap))
    }

    /** The DNS information of the service. */
    public open fun dnsEntry(`value`: DnsEntryProperty) {
        unwrap(this).setDnsEntry(`value`.let(DnsEntryProperty::unwrap))
    }

    /** The DNS information of the service. */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0d891f5f9ad9ada8d9d7f685e87e5b5ce1f87654c2ba613788a5a7b5ccdc0555")
    public open fun dnsEntry(`value`: DnsEntryProperty.Builder.() -> Unit): Unit =
        dnsEntry(DnsEntryProperty(`value`))

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** The name of the service. */
    public open fun name(): String? = unwrap(this).getName()

    /** The name of the service. */
    public open fun name(`value`: String) {
        unwrap(this).setName(`value`)
    }

    /** Tag Manager which manages the tags for this resource. */
    public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

    /** The tags for the service. */
    public open fun tagsRaw(): List<CfnTag> =
        unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?: emptyList()

    /** The tags for the service. */
    public open fun tagsRaw(`value`: List<CfnTag>) {
        unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
    }

    /** The tags for the service. */
    public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.vpclattice.CfnService]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * The type of IAM policy.
         * * `NONE` : The resource does not use an IAM policy. This is the default.
         * * `AWS_IAM` : The resource uses an IAM policy. When this type is used, auth is enabled
         *   and an auth policy is required.
         *
         * Default: - "NONE"
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-service.html#cfn-vpclattice-service-authtype)
         *
         * @param authType The type of IAM policy.
         */
        public fun authType(authType: String)

        /**
         * The Amazon Resource Name (ARN) of the certificate.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-service.html#cfn-vpclattice-service-certificatearn)
         *
         * @param certificateArn The Amazon Resource Name (ARN) of the certificate.
         */
        public fun certificateArn(certificateArn: String)

        /**
         * The custom domain name of the service.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-service.html#cfn-vpclattice-service-customdomainname)
         *
         * @param customDomainName The custom domain name of the service.
         */
        public fun customDomainName(customDomainName: String)

        /**
         * The DNS information of the service.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-service.html#cfn-vpclattice-service-dnsentry)
         *
         * @param dnsEntry The DNS information of the service.
         */
        public fun dnsEntry(dnsEntry: IResolvable)

        /**
         * The DNS information of the service.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-service.html#cfn-vpclattice-service-dnsentry)
         *
         * @param dnsEntry The DNS information of the service.
         */
        public fun dnsEntry(dnsEntry: DnsEntryProperty)

        /**
         * The DNS information of the service.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-service.html#cfn-vpclattice-service-dnsentry)
         *
         * @param dnsEntry The DNS information of the service.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("a5d85bee0e0b2a595414b10b92d2c2c90c4f1f8724a69c1c2639f996dee89289")
        public fun dnsEntry(dnsEntry: DnsEntryProperty.Builder.() -> Unit)

        /**
         * The name of the service.
         *
         * The name must be unique within the account. The valid characters are a-z, 0-9, and
         * hyphens (-). You can't use a hyphen as the first or last character, or immediately after
         * another hyphen.
         *
         * If you don't specify a name, CloudFormation generates one. However, if you specify a
         * name, and later want to replace the resource, you must specify a new name.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-service.html#cfn-vpclattice-service-name)
         *
         * @param name The name of the service.
         */
        public fun name(name: String)

        /**
         * The tags for the service.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-service.html#cfn-vpclattice-service-tags)
         *
         * @param tags The tags for the service.
         */
        public fun tags(tags: List<CfnTag>)

        /**
         * The tags for the service.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-service.html#cfn-vpclattice-service-tags)
         *
         * @param tags The tags for the service.
         */
        public fun tags(vararg tags: CfnTag)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.vpclattice.CfnService.Builder =
            software.amazon.awscdk.services.vpclattice.CfnService.Builder.create(scope, id)

        /**
         * The type of IAM policy.
         * * `NONE` : The resource does not use an IAM policy. This is the default.
         * * `AWS_IAM` : The resource uses an IAM policy. When this type is used, auth is enabled
         *   and an auth policy is required.
         *
         * Default: - "NONE"
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-service.html#cfn-vpclattice-service-authtype)
         *
         * @param authType The type of IAM policy.
         */
        override fun authType(authType: String) {
            cdkBuilder.authType(authType)
        }

        /**
         * The Amazon Resource Name (ARN) of the certificate.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-service.html#cfn-vpclattice-service-certificatearn)
         *
         * @param certificateArn The Amazon Resource Name (ARN) of the certificate.
         */
        override fun certificateArn(certificateArn: String) {
            cdkBuilder.certificateArn(certificateArn)
        }

        /**
         * The custom domain name of the service.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-service.html#cfn-vpclattice-service-customdomainname)
         *
         * @param customDomainName The custom domain name of the service.
         */
        override fun customDomainName(customDomainName: String) {
            cdkBuilder.customDomainName(customDomainName)
        }

        /**
         * The DNS information of the service.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-service.html#cfn-vpclattice-service-dnsentry)
         *
         * @param dnsEntry The DNS information of the service.
         */
        override fun dnsEntry(dnsEntry: IResolvable) {
            cdkBuilder.dnsEntry(dnsEntry.let(IResolvable::unwrap))
        }

        /**
         * The DNS information of the service.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-service.html#cfn-vpclattice-service-dnsentry)
         *
         * @param dnsEntry The DNS information of the service.
         */
        override fun dnsEntry(dnsEntry: DnsEntryProperty) {
            cdkBuilder.dnsEntry(dnsEntry.let(DnsEntryProperty::unwrap))
        }

        /**
         * The DNS information of the service.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-service.html#cfn-vpclattice-service-dnsentry)
         *
         * @param dnsEntry The DNS information of the service.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("a5d85bee0e0b2a595414b10b92d2c2c90c4f1f8724a69c1c2639f996dee89289")
        override fun dnsEntry(dnsEntry: DnsEntryProperty.Builder.() -> Unit): Unit =
            dnsEntry(DnsEntryProperty(dnsEntry))

        /**
         * The name of the service.
         *
         * The name must be unique within the account. The valid characters are a-z, 0-9, and
         * hyphens (-). You can't use a hyphen as the first or last character, or immediately after
         * another hyphen.
         *
         * If you don't specify a name, CloudFormation generates one. However, if you specify a
         * name, and later want to replace the resource, you must specify a new name.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-service.html#cfn-vpclattice-service-name)
         *
         * @param name The name of the service.
         */
        override fun name(name: String) {
            cdkBuilder.name(name)
        }

        /**
         * The tags for the service.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-service.html#cfn-vpclattice-service-tags)
         *
         * @param tags The tags for the service.
         */
        override fun tags(tags: List<CfnTag>) {
            cdkBuilder.tags(tags.map(CfnTag::unwrap))
        }

        /**
         * The tags for the service.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-service.html#cfn-vpclattice-service-tags)
         *
         * @param tags The tags for the service.
         */
        override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

        public fun build(): software.amazon.awscdk.services.vpclattice.CfnService =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnService {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnService(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.vpclattice.CfnService
        ): CfnService = CfnService(cdkObject)

        internal fun unwrap(
            wrapped: CfnService
        ): software.amazon.awscdk.services.vpclattice.CfnService = wrapped.cdkObject
    }

    public interface DnsEntryProperty {
        /**
         * The domain name of the service.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-service-dnsentry.html#cfn-vpclattice-service-dnsentry-domainname)
         */
        public fun domainName(): String? = unwrap(this).getDomainName()

        /**
         * The ID of the hosted zone.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-service-dnsentry.html#cfn-vpclattice-service-dnsentry-hostedzoneid)
         */
        public fun hostedZoneId(): String? = unwrap(this).getHostedZoneId()

        /** A builder for [DnsEntryProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param domainName The domain name of the service. */
            public fun domainName(domainName: String)

            /** @param hostedZoneId The ID of the hosted zone. */
            public fun hostedZoneId(hostedZoneId: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.vpclattice.CfnService.DnsEntryProperty.Builder =
                software.amazon.awscdk.services.vpclattice.CfnService.DnsEntryProperty.builder()

            /** @param domainName The domain name of the service. */
            override fun domainName(domainName: String) {
                cdkBuilder.domainName(domainName)
            }

            /** @param hostedZoneId The ID of the hosted zone. */
            override fun hostedZoneId(hostedZoneId: String) {
                cdkBuilder.hostedZoneId(hostedZoneId)
            }

            public fun build():
                software.amazon.awscdk.services.vpclattice.CfnService.DnsEntryProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.vpclattice.CfnService.DnsEntryProperty,
        ) : DnsEntryProperty {
            /**
             * The domain name of the service.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-service-dnsentry.html#cfn-vpclattice-service-dnsentry-domainname)
             */
            override fun domainName(): String? = unwrap(this).getDomainName()

            /**
             * The ID of the hosted zone.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-service-dnsentry.html#cfn-vpclattice-service-dnsentry-hostedzoneid)
             */
            override fun hostedZoneId(): String? = unwrap(this).getHostedZoneId()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): DnsEntryProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.vpclattice.CfnService.DnsEntryProperty
            ): DnsEntryProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: DnsEntryProperty
            ): software.amazon.awscdk.services.vpclattice.CfnService.DnsEntryProperty =
                (wrapped as Wrapper).cdkObject
        }
    }
}
