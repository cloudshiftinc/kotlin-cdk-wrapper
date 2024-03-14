package io.cloudshiftdev.awscdk.services.workspacesweb

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTrustStore
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.workspacesweb.CfnTrustStore,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
    /** A list of web portal ARNs that this trust store is associated with. */
    public open fun attrAssociatedPortalArns(): List<String> =
        unwrap(this).getAttrAssociatedPortalArns()

    /** The ARN of the trust store. */
    public open fun attrTrustStoreArn(): String = unwrap(this).getAttrTrustStoreArn()

    /** Tag Manager which manages the tags for this resource. */
    public override fun cdkTagManager(): TagManager =
        unwrap(this).getCdkTagManager().let(TagManager::wrap)

    /** A list of CA certificates to be added to the trust store. */
    public open fun certificateList(): List<String> = unwrap(this).getCertificateList()

    /** A list of CA certificates to be added to the trust store. */
    public open fun certificateList(`value`: List<String>) {
        unwrap(this).setCertificateList(`value`)
    }

    /** A list of CA certificates to be added to the trust store. */
    public open fun certificateList(vararg `value`: String): Unit =
        certificateList(`value`.toList())

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** The tags to add to the trust store. */
    public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /** The tags to add to the trust store. */
    public open fun tags(`value`: List<CfnTag>) {
        unwrap(this).setTags(`value`.map(CfnTag::unwrap))
    }

    /** The tags to add to the trust store. */
    public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.workspacesweb.CfnTrustStore]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * A list of CA certificates to be added to the trust store.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-truststore.html#cfn-workspacesweb-truststore-certificatelist)
         *
         * @param certificateList A list of CA certificates to be added to the trust store.
         */
        public fun certificateList(certificateList: List<String>)

        /**
         * A list of CA certificates to be added to the trust store.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-truststore.html#cfn-workspacesweb-truststore-certificatelist)
         *
         * @param certificateList A list of CA certificates to be added to the trust store.
         */
        public fun certificateList(vararg certificateList: String)

        /**
         * The tags to add to the trust store.
         *
         * A tag is a key-value pair.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-truststore.html#cfn-workspacesweb-truststore-tags)
         *
         * @param tags The tags to add to the trust store.
         */
        public fun tags(tags: List<CfnTag>)

        /**
         * The tags to add to the trust store.
         *
         * A tag is a key-value pair.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-truststore.html#cfn-workspacesweb-truststore-tags)
         *
         * @param tags The tags to add to the trust store.
         */
        public fun tags(vararg tags: CfnTag)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.workspacesweb.CfnTrustStore.Builder =
            software.amazon.awscdk.services.workspacesweb.CfnTrustStore.Builder.create(scope, id)

        /**
         * A list of CA certificates to be added to the trust store.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-truststore.html#cfn-workspacesweb-truststore-certificatelist)
         *
         * @param certificateList A list of CA certificates to be added to the trust store.
         */
        override fun certificateList(certificateList: List<String>) {
            cdkBuilder.certificateList(certificateList)
        }

        /**
         * A list of CA certificates to be added to the trust store.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-truststore.html#cfn-workspacesweb-truststore-certificatelist)
         *
         * @param certificateList A list of CA certificates to be added to the trust store.
         */
        override fun certificateList(vararg certificateList: String): Unit =
            certificateList(certificateList.toList())

        /**
         * The tags to add to the trust store.
         *
         * A tag is a key-value pair.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-truststore.html#cfn-workspacesweb-truststore-tags)
         *
         * @param tags The tags to add to the trust store.
         */
        override fun tags(tags: List<CfnTag>) {
            cdkBuilder.tags(tags.map(CfnTag::unwrap))
        }

        /**
         * The tags to add to the trust store.
         *
         * A tag is a key-value pair.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-truststore.html#cfn-workspacesweb-truststore-tags)
         *
         * @param tags The tags to add to the trust store.
         */
        override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

        public fun build(): software.amazon.awscdk.services.workspacesweb.CfnTrustStore =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnTrustStore {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnTrustStore(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.workspacesweb.CfnTrustStore
        ): CfnTrustStore = CfnTrustStore(cdkObject)

        internal fun unwrap(
            wrapped: CfnTrustStore
        ): software.amazon.awscdk.services.workspacesweb.CfnTrustStore = wrapped.cdkObject
    }
}
