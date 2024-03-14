package io.cloudshiftdev.awscdk.services.lightsail

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnCertificate
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.lightsail.CfnCertificate,
) : CfnResource(cdkObject), IInspectable, ITaggable {
    /** The Amazon Resource Name (ARN) of the certificate. */
    public open fun attrCertificateArn(): String = unwrap(this).getAttrCertificateArn()

    /** The validation status of the certificate. */
    public open fun attrStatus(): String = unwrap(this).getAttrStatus()

    /** The name of the certificate. */
    public open fun certificateName(): String = unwrap(this).getCertificateName()

    /** The name of the certificate. */
    public open fun certificateName(`value`: String) {
        unwrap(this).setCertificateName(`value`)
    }

    /** The domain name of the certificate. */
    public open fun domainName(): String = unwrap(this).getDomainName()

    /** The domain name of the certificate. */
    public open fun domainName(`value`: String) {
        unwrap(this).setDomainName(`value`)
    }

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /**
     * An array of strings that specify the alternate domains (such as `example.org` ) and
     * subdomains (such as `blog.example.com` ) of the certificate.
     */
    public open fun subjectAlternativeNames(): List<String> =
        unwrap(this).getSubjectAlternativeNames() ?: emptyList()

    /**
     * An array of strings that specify the alternate domains (such as `example.org` ) and
     * subdomains (such as `blog.example.com` ) of the certificate.
     */
    public open fun subjectAlternativeNames(`value`: List<String>) {
        unwrap(this).setSubjectAlternativeNames(`value`)
    }

    /**
     * An array of strings that specify the alternate domains (such as `example.org` ) and
     * subdomains (such as `blog.example.com` ) of the certificate.
     */
    public open fun subjectAlternativeNames(vararg `value`: String): Unit =
        subjectAlternativeNames(`value`.toList())

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

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.lightsail.CfnCertificate]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * The name of the certificate.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-certificate.html#cfn-lightsail-certificate-certificatename)
         *
         * @param certificateName The name of the certificate.
         */
        public fun certificateName(certificateName: String)

        /**
         * The domain name of the certificate.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-certificate.html#cfn-lightsail-certificate-domainname)
         *
         * @param domainName The domain name of the certificate.
         */
        public fun domainName(domainName: String)

        /**
         * An array of strings that specify the alternate domains (such as `example.org` ) and
         * subdomains (such as `blog.example.com` ) of the certificate.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-certificate.html#cfn-lightsail-certificate-subjectalternativenames)
         *
         * @param subjectAlternativeNames An array of strings that specify the alternate domains
         *   (such as `example.org` ) and subdomains (such as `blog.example.com` ) of the
         *   certificate.
         */
        public fun subjectAlternativeNames(subjectAlternativeNames: List<String>)

        /**
         * An array of strings that specify the alternate domains (such as `example.org` ) and
         * subdomains (such as `blog.example.com` ) of the certificate.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-certificate.html#cfn-lightsail-certificate-subjectalternativenames)
         *
         * @param subjectAlternativeNames An array of strings that specify the alternate domains
         *   (such as `example.org` ) and subdomains (such as `blog.example.com` ) of the
         *   certificate.
         */
        public fun subjectAlternativeNames(vararg subjectAlternativeNames: String)

        /**
         * An array of key-value pairs to apply to this resource.
         *
         * For more information, see
         * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
         * in the *AWS CloudFormation User Guide* .
         *
         * The `Value` of `Tags` is optional for Lightsail resources.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-certificate.html#cfn-lightsail-certificate-tags)
         *
         * @param tags An array of key-value pairs to apply to this resource.
         */
        public fun tags(tags: List<CfnTag>)

        /**
         * An array of key-value pairs to apply to this resource.
         *
         * For more information, see
         * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
         * in the *AWS CloudFormation User Guide* .
         *
         * The `Value` of `Tags` is optional for Lightsail resources.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-certificate.html#cfn-lightsail-certificate-tags)
         *
         * @param tags An array of key-value pairs to apply to this resource.
         */
        public fun tags(vararg tags: CfnTag)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.lightsail.CfnCertificate.Builder =
            software.amazon.awscdk.services.lightsail.CfnCertificate.Builder.create(scope, id)

        /**
         * The name of the certificate.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-certificate.html#cfn-lightsail-certificate-certificatename)
         *
         * @param certificateName The name of the certificate.
         */
        override fun certificateName(certificateName: String) {
            cdkBuilder.certificateName(certificateName)
        }

        /**
         * The domain name of the certificate.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-certificate.html#cfn-lightsail-certificate-domainname)
         *
         * @param domainName The domain name of the certificate.
         */
        override fun domainName(domainName: String) {
            cdkBuilder.domainName(domainName)
        }

        /**
         * An array of strings that specify the alternate domains (such as `example.org` ) and
         * subdomains (such as `blog.example.com` ) of the certificate.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-certificate.html#cfn-lightsail-certificate-subjectalternativenames)
         *
         * @param subjectAlternativeNames An array of strings that specify the alternate domains
         *   (such as `example.org` ) and subdomains (such as `blog.example.com` ) of the
         *   certificate.
         */
        override fun subjectAlternativeNames(subjectAlternativeNames: List<String>) {
            cdkBuilder.subjectAlternativeNames(subjectAlternativeNames)
        }

        /**
         * An array of strings that specify the alternate domains (such as `example.org` ) and
         * subdomains (such as `blog.example.com` ) of the certificate.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-certificate.html#cfn-lightsail-certificate-subjectalternativenames)
         *
         * @param subjectAlternativeNames An array of strings that specify the alternate domains
         *   (such as `example.org` ) and subdomains (such as `blog.example.com` ) of the
         *   certificate.
         */
        override fun subjectAlternativeNames(vararg subjectAlternativeNames: String): Unit =
            subjectAlternativeNames(subjectAlternativeNames.toList())

        /**
         * An array of key-value pairs to apply to this resource.
         *
         * For more information, see
         * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
         * in the *AWS CloudFormation User Guide* .
         *
         * The `Value` of `Tags` is optional for Lightsail resources.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-certificate.html#cfn-lightsail-certificate-tags)
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
         * in the *AWS CloudFormation User Guide* .
         *
         * The `Value` of `Tags` is optional for Lightsail resources.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-certificate.html#cfn-lightsail-certificate-tags)
         *
         * @param tags An array of key-value pairs to apply to this resource.
         */
        override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

        public fun build(): software.amazon.awscdk.services.lightsail.CfnCertificate =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnCertificate {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnCertificate(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.lightsail.CfnCertificate
        ): CfnCertificate = CfnCertificate(cdkObject)

        internal fun unwrap(
            wrapped: CfnCertificate
        ): software.amazon.awscdk.services.lightsail.CfnCertificate = wrapped.cdkObject
    }
}
