package io.cloudshiftdev.awscdk.services.appmesh

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

public open class CfnVirtualGateway
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualGateway,
) : CfnResource(cdkObject), IInspectable, ITaggable {
    /** The full Amazon Resource Name (ARN) for the virtual gateway. */
    public open fun attrArn(): String = unwrap(this).getAttrArn()

    /**  */
    public open fun attrId(): String = unwrap(this).getAttrId()

    /** The name of the service mesh that the virtual gateway resides in. */
    public open fun attrMeshName(): String = unwrap(this).getAttrMeshName()

    /**
     * The AWS IAM account ID of the service mesh owner.
     *
     * If the account ID is not your own, then it's the ID of the account that shared the mesh with
     * your account. For more information about mesh sharing, see
     * [Working with Shared Meshes](https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html)
     * .
     */
    public open fun attrMeshOwner(): String = unwrap(this).getAttrMeshOwner()

    /**
     * The AWS IAM account ID of the resource owner.
     *
     * If the account ID is not your own, then it's the ID of the mesh owner or of another account
     * that the mesh is shared with. For more information about mesh sharing, see
     * [Working with Shared Meshes](https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html)
     * .
     */
    public open fun attrResourceOwner(): String = unwrap(this).getAttrResourceOwner()

    /** The unique identifier for the virtual gateway. */
    public open fun attrUid(): String = unwrap(this).getAttrUid()

    /** The name of the virtual gateway. */
    public open fun attrVirtualGatewayName(): String = unwrap(this).getAttrVirtualGatewayName()

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** The name of the service mesh that the virtual gateway resides in. */
    public open fun meshName(): String = unwrap(this).getMeshName()

    /** The name of the service mesh that the virtual gateway resides in. */
    public open fun meshName(`value`: String) {
        unwrap(this).setMeshName(`value`)
    }

    /** The AWS IAM account ID of the service mesh owner. */
    public open fun meshOwner(): String? = unwrap(this).getMeshOwner()

    /** The AWS IAM account ID of the service mesh owner. */
    public open fun meshOwner(`value`: String) {
        unwrap(this).setMeshOwner(`value`)
    }

    /** The specifications of the virtual gateway. */
    public open fun spec(): Any = unwrap(this).getSpec()

    /** The specifications of the virtual gateway. */
    public open fun spec(`value`: IResolvable) {
        unwrap(this).setSpec(`value`.let(IResolvable::unwrap))
    }

    /** The specifications of the virtual gateway. */
    public open fun spec(`value`: VirtualGatewaySpecProperty) {
        unwrap(this).setSpec(`value`.let(VirtualGatewaySpecProperty::unwrap))
    }

    /** The specifications of the virtual gateway. */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("025e16cf37efee7630e01c04f34aa544249e28bf97500f033b54dea93a273194")
    public open fun spec(`value`: VirtualGatewaySpecProperty.Builder.() -> Unit): Unit =
        spec(VirtualGatewaySpecProperty(`value`))

    /** Tag Manager which manages the tags for this resource. */
    public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

    /**
     * Optional metadata that you can apply to the virtual gateway to assist with categorization and
     * organization.
     */
    public open fun tagsRaw(): List<CfnTag> =
        unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * Optional metadata that you can apply to the virtual gateway to assist with categorization and
     * organization.
     */
    public open fun tagsRaw(`value`: List<CfnTag>) {
        unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
    }

    /**
     * Optional metadata that you can apply to the virtual gateway to assist with categorization and
     * organization.
     */
    public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

    /** The name of the virtual gateway. */
    public open fun virtualGatewayName(): String? = unwrap(this).getVirtualGatewayName()

    /** The name of the virtual gateway. */
    public open fun virtualGatewayName(`value`: String) {
        unwrap(this).setVirtualGatewayName(`value`)
    }

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.appmesh.CfnVirtualGateway]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * The name of the service mesh that the virtual gateway resides in.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualgateway.html#cfn-appmesh-virtualgateway-meshname)
         *
         * @param meshName The name of the service mesh that the virtual gateway resides in.
         */
        public fun meshName(meshName: String)

        /**
         * The AWS IAM account ID of the service mesh owner.
         *
         * If the account ID is not your own, then it's the ID of the account that shared the mesh
         * with your account. For more information about mesh sharing, see
         * [Working with shared meshes](https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualgateway.html#cfn-appmesh-virtualgateway-meshowner)
         *
         * @param meshOwner The AWS IAM account ID of the service mesh owner.
         */
        public fun meshOwner(meshOwner: String)

        /**
         * The specifications of the virtual gateway.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualgateway.html#cfn-appmesh-virtualgateway-spec)
         *
         * @param spec The specifications of the virtual gateway.
         */
        public fun spec(spec: IResolvable)

        /**
         * The specifications of the virtual gateway.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualgateway.html#cfn-appmesh-virtualgateway-spec)
         *
         * @param spec The specifications of the virtual gateway.
         */
        public fun spec(spec: VirtualGatewaySpecProperty)

        /**
         * The specifications of the virtual gateway.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualgateway.html#cfn-appmesh-virtualgateway-spec)
         *
         * @param spec The specifications of the virtual gateway.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("094bb9fb45cd48eb4c6e5ae3a26fad70117ef541162b6d88b9be58fdb278c487")
        public fun spec(spec: VirtualGatewaySpecProperty.Builder.() -> Unit)

        /**
         * Optional metadata that you can apply to the virtual gateway to assist with categorization
         * and organization.
         *
         * Each tag consists of a key and an optional value, both of which you define. Tag keys can
         * have a maximum character length of 128 characters, and tag values can have a maximum
         * length of 256 characters.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualgateway.html#cfn-appmesh-virtualgateway-tags)
         *
         * @param tags Optional metadata that you can apply to the virtual gateway to assist with
         *   categorization and organization.
         */
        public fun tags(tags: List<CfnTag>)

        /**
         * Optional metadata that you can apply to the virtual gateway to assist with categorization
         * and organization.
         *
         * Each tag consists of a key and an optional value, both of which you define. Tag keys can
         * have a maximum character length of 128 characters, and tag values can have a maximum
         * length of 256 characters.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualgateway.html#cfn-appmesh-virtualgateway-tags)
         *
         * @param tags Optional metadata that you can apply to the virtual gateway to assist with
         *   categorization and organization.
         */
        public fun tags(vararg tags: CfnTag)

        /**
         * The name of the virtual gateway.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualgateway.html#cfn-appmesh-virtualgateway-virtualgatewayname)
         *
         * @param virtualGatewayName The name of the virtual gateway.
         */
        public fun virtualGatewayName(virtualGatewayName: String)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.appmesh.CfnVirtualGateway.Builder =
            software.amazon.awscdk.services.appmesh.CfnVirtualGateway.Builder.create(scope, id)

        /**
         * The name of the service mesh that the virtual gateway resides in.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualgateway.html#cfn-appmesh-virtualgateway-meshname)
         *
         * @param meshName The name of the service mesh that the virtual gateway resides in.
         */
        override fun meshName(meshName: String) {
            cdkBuilder.meshName(meshName)
        }

        /**
         * The AWS IAM account ID of the service mesh owner.
         *
         * If the account ID is not your own, then it's the ID of the account that shared the mesh
         * with your account. For more information about mesh sharing, see
         * [Working with shared meshes](https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualgateway.html#cfn-appmesh-virtualgateway-meshowner)
         *
         * @param meshOwner The AWS IAM account ID of the service mesh owner.
         */
        override fun meshOwner(meshOwner: String) {
            cdkBuilder.meshOwner(meshOwner)
        }

        /**
         * The specifications of the virtual gateway.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualgateway.html#cfn-appmesh-virtualgateway-spec)
         *
         * @param spec The specifications of the virtual gateway.
         */
        override fun spec(spec: IResolvable) {
            cdkBuilder.spec(spec.let(IResolvable::unwrap))
        }

        /**
         * The specifications of the virtual gateway.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualgateway.html#cfn-appmesh-virtualgateway-spec)
         *
         * @param spec The specifications of the virtual gateway.
         */
        override fun spec(spec: VirtualGatewaySpecProperty) {
            cdkBuilder.spec(spec.let(VirtualGatewaySpecProperty::unwrap))
        }

        /**
         * The specifications of the virtual gateway.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualgateway.html#cfn-appmesh-virtualgateway-spec)
         *
         * @param spec The specifications of the virtual gateway.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("094bb9fb45cd48eb4c6e5ae3a26fad70117ef541162b6d88b9be58fdb278c487")
        override fun spec(spec: VirtualGatewaySpecProperty.Builder.() -> Unit): Unit =
            spec(VirtualGatewaySpecProperty(spec))

        /**
         * Optional metadata that you can apply to the virtual gateway to assist with categorization
         * and organization.
         *
         * Each tag consists of a key and an optional value, both of which you define. Tag keys can
         * have a maximum character length of 128 characters, and tag values can have a maximum
         * length of 256 characters.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualgateway.html#cfn-appmesh-virtualgateway-tags)
         *
         * @param tags Optional metadata that you can apply to the virtual gateway to assist with
         *   categorization and organization.
         */
        override fun tags(tags: List<CfnTag>) {
            cdkBuilder.tags(tags.map(CfnTag::unwrap))
        }

        /**
         * Optional metadata that you can apply to the virtual gateway to assist with categorization
         * and organization.
         *
         * Each tag consists of a key and an optional value, both of which you define. Tag keys can
         * have a maximum character length of 128 characters, and tag values can have a maximum
         * length of 256 characters.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualgateway.html#cfn-appmesh-virtualgateway-tags)
         *
         * @param tags Optional metadata that you can apply to the virtual gateway to assist with
         *   categorization and organization.
         */
        override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

        /**
         * The name of the virtual gateway.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualgateway.html#cfn-appmesh-virtualgateway-virtualgatewayname)
         *
         * @param virtualGatewayName The name of the virtual gateway.
         */
        override fun virtualGatewayName(virtualGatewayName: String) {
            cdkBuilder.virtualGatewayName(virtualGatewayName)
        }

        public fun build(): software.amazon.awscdk.services.appmesh.CfnVirtualGateway =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnVirtualGateway {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnVirtualGateway(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualGateway
        ): CfnVirtualGateway = CfnVirtualGateway(cdkObject)

        internal fun unwrap(
            wrapped: CfnVirtualGateway
        ): software.amazon.awscdk.services.appmesh.CfnVirtualGateway = wrapped.cdkObject
    }

    public interface VirtualGatewayListenerTlsCertificateProperty {
        /**
         * A reference to an object that represents an AWS Certificate Manager certificate.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaylistenertlscertificate.html#cfn-appmesh-virtualgateway-virtualgatewaylistenertlscertificate-acm)
         */
        public fun acm(): Any? = unwrap(this).getAcm()

        /**
         * A reference to an object that represents a local file certificate.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaylistenertlscertificate.html#cfn-appmesh-virtualgateway-virtualgatewaylistenertlscertificate-file)
         */
        public fun `file`(): Any? = unwrap(this).getFile()

        /**
         * A reference to an object that represents a virtual gateway's listener's Secret Discovery
         * Service certificate.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaylistenertlscertificate.html#cfn-appmesh-virtualgateway-virtualgatewaylistenertlscertificate-sds)
         */
        public fun sds(): Any? = unwrap(this).getSds()

        /** A builder for [VirtualGatewayListenerTlsCertificateProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param acm A reference to an object that represents an AWS Certificate Manager
             *   certificate.
             */
            public fun acm(acm: IResolvable)

            /**
             * @param acm A reference to an object that represents an AWS Certificate Manager
             *   certificate.
             */
            public fun acm(acm: VirtualGatewayListenerTlsAcmCertificateProperty)

            /**
             * @param acm A reference to an object that represents an AWS Certificate Manager
             *   certificate.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("955a2e7dfe97a7d269bf8d0bf307c405bfd93e80de5e9caa5da1a7d3fef06a12")
            public fun acm(acm: VirtualGatewayListenerTlsAcmCertificateProperty.Builder.() -> Unit)

            /** @param file A reference to an object that represents a local file certificate. */
            public fun `file`(`file`: IResolvable)

            /** @param file A reference to an object that represents a local file certificate. */
            public fun `file`(`file`: VirtualGatewayListenerTlsFileCertificateProperty)

            /** @param file A reference to an object that represents a local file certificate. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("a7010dda9b3079e64cbb1104220ae67bcedc7ce4636d07acaf75cf2fe68f6e17")
            public fun `file`(
                `file`: VirtualGatewayListenerTlsFileCertificateProperty.Builder.() -> Unit
            )

            /**
             * @param sds A reference to an object that represents a virtual gateway's listener's
             *   Secret Discovery Service certificate.
             */
            public fun sds(sds: IResolvable)

            /**
             * @param sds A reference to an object that represents a virtual gateway's listener's
             *   Secret Discovery Service certificate.
             */
            public fun sds(sds: VirtualGatewayListenerTlsSdsCertificateProperty)

            /**
             * @param sds A reference to an object that represents a virtual gateway's listener's
             *   Secret Discovery Service certificate.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("b402b96a37c49380628f6ab0adc6c798705b3149f11690616a0c7a373ba825d4")
            public fun sds(sds: VirtualGatewayListenerTlsSdsCertificateProperty.Builder.() -> Unit)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsCertificateProperty.Builder =
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway
                    .VirtualGatewayListenerTlsCertificateProperty
                    .builder()

            /**
             * @param acm A reference to an object that represents an AWS Certificate Manager
             *   certificate.
             */
            override fun acm(acm: IResolvable) {
                cdkBuilder.acm(acm.let(IResolvable::unwrap))
            }

            /**
             * @param acm A reference to an object that represents an AWS Certificate Manager
             *   certificate.
             */
            override fun acm(acm: VirtualGatewayListenerTlsAcmCertificateProperty) {
                cdkBuilder.acm(acm.let(VirtualGatewayListenerTlsAcmCertificateProperty::unwrap))
            }

            /**
             * @param acm A reference to an object that represents an AWS Certificate Manager
             *   certificate.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("955a2e7dfe97a7d269bf8d0bf307c405bfd93e80de5e9caa5da1a7d3fef06a12")
            override fun acm(
                acm: VirtualGatewayListenerTlsAcmCertificateProperty.Builder.() -> Unit
            ): Unit = acm(VirtualGatewayListenerTlsAcmCertificateProperty(acm))

            /** @param file A reference to an object that represents a local file certificate. */
            override fun `file`(`file`: IResolvable) {
                cdkBuilder.`file`(`file`.let(IResolvable::unwrap))
            }

            /** @param file A reference to an object that represents a local file certificate. */
            override fun `file`(`file`: VirtualGatewayListenerTlsFileCertificateProperty) {
                cdkBuilder.`file`(
                    `file`.let(VirtualGatewayListenerTlsFileCertificateProperty::unwrap)
                )
            }

            /** @param file A reference to an object that represents a local file certificate. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("a7010dda9b3079e64cbb1104220ae67bcedc7ce4636d07acaf75cf2fe68f6e17")
            override fun `file`(
                `file`: VirtualGatewayListenerTlsFileCertificateProperty.Builder.() -> Unit
            ): Unit = `file`(VirtualGatewayListenerTlsFileCertificateProperty(`file`))

            /**
             * @param sds A reference to an object that represents a virtual gateway's listener's
             *   Secret Discovery Service certificate.
             */
            override fun sds(sds: IResolvable) {
                cdkBuilder.sds(sds.let(IResolvable::unwrap))
            }

            /**
             * @param sds A reference to an object that represents a virtual gateway's listener's
             *   Secret Discovery Service certificate.
             */
            override fun sds(sds: VirtualGatewayListenerTlsSdsCertificateProperty) {
                cdkBuilder.sds(sds.let(VirtualGatewayListenerTlsSdsCertificateProperty::unwrap))
            }

            /**
             * @param sds A reference to an object that represents a virtual gateway's listener's
             *   Secret Discovery Service certificate.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("b402b96a37c49380628f6ab0adc6c798705b3149f11690616a0c7a373ba825d4")
            override fun sds(
                sds: VirtualGatewayListenerTlsSdsCertificateProperty.Builder.() -> Unit
            ): Unit = sds(VirtualGatewayListenerTlsSdsCertificateProperty(sds))

            public fun build():
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsCertificateProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsCertificateProperty,
        ) : VirtualGatewayListenerTlsCertificateProperty {
            /**
             * A reference to an object that represents an AWS Certificate Manager certificate.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaylistenertlscertificate.html#cfn-appmesh-virtualgateway-virtualgatewaylistenertlscertificate-acm)
             */
            override fun acm(): Any? = unwrap(this).getAcm()

            /**
             * A reference to an object that represents a local file certificate.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaylistenertlscertificate.html#cfn-appmesh-virtualgateway-virtualgatewaylistenertlscertificate-file)
             */
            override fun `file`(): Any? = unwrap(this).getFile()

            /**
             * A reference to an object that represents a virtual gateway's listener's Secret
             * Discovery Service certificate.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaylistenertlscertificate.html#cfn-appmesh-virtualgateway-virtualgatewaylistenertlscertificate-sds)
             */
            override fun sds(): Any? = unwrap(this).getSds()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): VirtualGatewayListenerTlsCertificateProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsCertificateProperty
            ): VirtualGatewayListenerTlsCertificateProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: VirtualGatewayListenerTlsCertificateProperty
            ): software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsCertificateProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface VirtualGatewaySpecProperty {
        /**
         * A reference to an object that represents the defaults for backends.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayspec.html#cfn-appmesh-virtualgateway-virtualgatewayspec-backenddefaults)
         */
        public fun backendDefaults(): Any? = unwrap(this).getBackendDefaults()

        /**
         * The listeners that the mesh endpoint is expected to receive inbound traffic from.
         *
         * You can specify one listener.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayspec.html#cfn-appmesh-virtualgateway-virtualgatewayspec-listeners)
         */
        public fun listeners(): Any

        /**
         * An object that represents logging information.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayspec.html#cfn-appmesh-virtualgateway-virtualgatewayspec-logging)
         */
        public fun logging(): Any? = unwrap(this).getLogging()

        /** A builder for [VirtualGatewaySpecProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param backendDefaults A reference to an object that represents the defaults for
             *   backends.
             */
            public fun backendDefaults(backendDefaults: IResolvable)

            /**
             * @param backendDefaults A reference to an object that represents the defaults for
             *   backends.
             */
            public fun backendDefaults(backendDefaults: VirtualGatewayBackendDefaultsProperty)

            /**
             * @param backendDefaults A reference to an object that represents the defaults for
             *   backends.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("7ee3d22885b2d139341c2aeba121cacb7ebe803c4c40f7a4a8da7c7eadf1c84a")
            public fun backendDefaults(
                backendDefaults: VirtualGatewayBackendDefaultsProperty.Builder.() -> Unit
            )

            /**
             * @param listeners The listeners that the mesh endpoint is expected to receive inbound
             *   traffic from. You can specify one listener.
             */
            public fun listeners(listeners: IResolvable)

            /**
             * @param listeners The listeners that the mesh endpoint is expected to receive inbound
             *   traffic from. You can specify one listener.
             */
            public fun listeners(listeners: List<Any>)

            /**
             * @param listeners The listeners that the mesh endpoint is expected to receive inbound
             *   traffic from. You can specify one listener.
             */
            public fun listeners(vararg listeners: Any)

            /** @param logging An object that represents logging information. */
            public fun logging(logging: IResolvable)

            /** @param logging An object that represents logging information. */
            public fun logging(logging: VirtualGatewayLoggingProperty)

            /** @param logging An object that represents logging information. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("fc43ec4ecdc5774b6458f4680f421067e260b060788cd997e0907a7ebe8c7d39")
            public fun logging(logging: VirtualGatewayLoggingProperty.Builder.() -> Unit)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewaySpecProperty.Builder =
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewaySpecProperty
                    .builder()

            /**
             * @param backendDefaults A reference to an object that represents the defaults for
             *   backends.
             */
            override fun backendDefaults(backendDefaults: IResolvable) {
                cdkBuilder.backendDefaults(backendDefaults.let(IResolvable::unwrap))
            }

            /**
             * @param backendDefaults A reference to an object that represents the defaults for
             *   backends.
             */
            override fun backendDefaults(backendDefaults: VirtualGatewayBackendDefaultsProperty) {
                cdkBuilder.backendDefaults(
                    backendDefaults.let(VirtualGatewayBackendDefaultsProperty::unwrap)
                )
            }

            /**
             * @param backendDefaults A reference to an object that represents the defaults for
             *   backends.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("7ee3d22885b2d139341c2aeba121cacb7ebe803c4c40f7a4a8da7c7eadf1c84a")
            override fun backendDefaults(
                backendDefaults: VirtualGatewayBackendDefaultsProperty.Builder.() -> Unit
            ): Unit = backendDefaults(VirtualGatewayBackendDefaultsProperty(backendDefaults))

            /**
             * @param listeners The listeners that the mesh endpoint is expected to receive inbound
             *   traffic from. You can specify one listener.
             */
            override fun listeners(listeners: IResolvable) {
                cdkBuilder.listeners(listeners.let(IResolvable::unwrap))
            }

            /**
             * @param listeners The listeners that the mesh endpoint is expected to receive inbound
             *   traffic from. You can specify one listener.
             */
            override fun listeners(listeners: List<Any>) {
                cdkBuilder.listeners(listeners)
            }

            /**
             * @param listeners The listeners that the mesh endpoint is expected to receive inbound
             *   traffic from. You can specify one listener.
             */
            override fun listeners(vararg listeners: Any): Unit = listeners(listeners.toList())

            /** @param logging An object that represents logging information. */
            override fun logging(logging: IResolvable) {
                cdkBuilder.logging(logging.let(IResolvable::unwrap))
            }

            /** @param logging An object that represents logging information. */
            override fun logging(logging: VirtualGatewayLoggingProperty) {
                cdkBuilder.logging(logging.let(VirtualGatewayLoggingProperty::unwrap))
            }

            /** @param logging An object that represents logging information. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("fc43ec4ecdc5774b6458f4680f421067e260b060788cd997e0907a7ebe8c7d39")
            override fun logging(logging: VirtualGatewayLoggingProperty.Builder.() -> Unit): Unit =
                logging(VirtualGatewayLoggingProperty(logging))

            public fun build():
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewaySpecProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewaySpecProperty,
        ) : VirtualGatewaySpecProperty {
            /**
             * A reference to an object that represents the defaults for backends.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayspec.html#cfn-appmesh-virtualgateway-virtualgatewayspec-backenddefaults)
             */
            override fun backendDefaults(): Any? = unwrap(this).getBackendDefaults()

            /**
             * The listeners that the mesh endpoint is expected to receive inbound traffic from.
             *
             * You can specify one listener.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayspec.html#cfn-appmesh-virtualgateway-virtualgatewayspec-listeners)
             */
            override fun listeners(): Any = unwrap(this).getListeners()

            /**
             * An object that represents logging information.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayspec.html#cfn-appmesh-virtualgateway-virtualgatewayspec-logging)
             */
            override fun logging(): Any? = unwrap(this).getLogging()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): VirtualGatewaySpecProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewaySpecProperty
            ): VirtualGatewaySpecProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: VirtualGatewaySpecProperty
            ): software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewaySpecProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface LoggingFormatProperty {
        /**
         * The logging format for JSON.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-loggingformat.html#cfn-appmesh-virtualgateway-loggingformat-json)
         */
        public fun json(): Any? = unwrap(this).getJson()

        /**
         * The logging format for text.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-loggingformat.html#cfn-appmesh-virtualgateway-loggingformat-text)
         */
        public fun text(): String? = unwrap(this).getText()

        /** A builder for [LoggingFormatProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param json The logging format for JSON. */
            public fun json(json: IResolvable)

            /** @param json The logging format for JSON. */
            public fun json(json: List<Any>)

            /** @param json The logging format for JSON. */
            public fun json(vararg json: Any)

            /** @param text The logging format for text. */
            public fun text(text: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.LoggingFormatProperty.Builder =
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.LoggingFormatProperty
                    .builder()

            /** @param json The logging format for JSON. */
            override fun json(json: IResolvable) {
                cdkBuilder.json(json.let(IResolvable::unwrap))
            }

            /** @param json The logging format for JSON. */
            override fun json(json: List<Any>) {
                cdkBuilder.json(json)
            }

            /** @param json The logging format for JSON. */
            override fun json(vararg json: Any): Unit = json(json.toList())

            /** @param text The logging format for text. */
            override fun text(text: String) {
                cdkBuilder.text(text)
            }

            public fun build():
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.LoggingFormatProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.LoggingFormatProperty,
        ) : LoggingFormatProperty {
            /**
             * The logging format for JSON.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-loggingformat.html#cfn-appmesh-virtualgateway-loggingformat-json)
             */
            override fun json(): Any? = unwrap(this).getJson()

            /**
             * The logging format for text.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-loggingformat.html#cfn-appmesh-virtualgateway-loggingformat-text)
             */
            override fun text(): String? = unwrap(this).getText()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): LoggingFormatProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.appmesh.CfnVirtualGateway.LoggingFormatProperty
            ): LoggingFormatProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: LoggingFormatProperty
            ): software.amazon.awscdk.services.appmesh.CfnVirtualGateway.LoggingFormatProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface VirtualGatewayHttpConnectionPoolProperty {
        /**
         * Maximum number of outbound TCP connections Envoy can establish concurrently with all
         * hosts in upstream cluster.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayhttpconnectionpool.html#cfn-appmesh-virtualgateway-virtualgatewayhttpconnectionpool-maxconnections)
         */
        public fun maxConnections(): Number

        /**
         * Number of overflowing requests after `max_connections` Envoy will queue to upstream
         * cluster.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayhttpconnectionpool.html#cfn-appmesh-virtualgateway-virtualgatewayhttpconnectionpool-maxpendingrequests)
         */
        public fun maxPendingRequests(): Number? = unwrap(this).getMaxPendingRequests()

        /** A builder for [VirtualGatewayHttpConnectionPoolProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param maxConnections Maximum number of outbound TCP connections Envoy can establish
             *   concurrently with all hosts in upstream cluster.
             */
            public fun maxConnections(maxConnections: Number)

            /**
             * @param maxPendingRequests Number of overflowing requests after `max_connections`
             *   Envoy will queue to upstream cluster.
             */
            public fun maxPendingRequests(maxPendingRequests: Number)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayHttpConnectionPoolProperty.Builder =
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway
                    .VirtualGatewayHttpConnectionPoolProperty
                    .builder()

            /**
             * @param maxConnections Maximum number of outbound TCP connections Envoy can establish
             *   concurrently with all hosts in upstream cluster.
             */
            override fun maxConnections(maxConnections: Number) {
                cdkBuilder.maxConnections(maxConnections)
            }

            /**
             * @param maxPendingRequests Number of overflowing requests after `max_connections`
             *   Envoy will queue to upstream cluster.
             */
            override fun maxPendingRequests(maxPendingRequests: Number) {
                cdkBuilder.maxPendingRequests(maxPendingRequests)
            }

            public fun build():
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayHttpConnectionPoolProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayHttpConnectionPoolProperty,
        ) : VirtualGatewayHttpConnectionPoolProperty {
            /**
             * Maximum number of outbound TCP connections Envoy can establish concurrently with all
             * hosts in upstream cluster.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayhttpconnectionpool.html#cfn-appmesh-virtualgateway-virtualgatewayhttpconnectionpool-maxconnections)
             */
            override fun maxConnections(): Number = unwrap(this).getMaxConnections()

            /**
             * Number of overflowing requests after `max_connections` Envoy will queue to upstream
             * cluster.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayhttpconnectionpool.html#cfn-appmesh-virtualgateway-virtualgatewayhttpconnectionpool-maxpendingrequests)
             */
            override fun maxPendingRequests(): Number? = unwrap(this).getMaxPendingRequests()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): VirtualGatewayHttpConnectionPoolProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayHttpConnectionPoolProperty
            ): VirtualGatewayHttpConnectionPoolProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: VirtualGatewayHttpConnectionPoolProperty
            ): software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayHttpConnectionPoolProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface VirtualGatewayTlsValidationContextTrustProperty {
        /**
         * A reference to an object that represents a Transport Layer Security (TLS) validation
         * context trust for an AWS Certificate Manager certificate.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaytlsvalidationcontexttrust.html#cfn-appmesh-virtualgateway-virtualgatewaytlsvalidationcontexttrust-acm)
         */
        public fun acm(): Any? = unwrap(this).getAcm()

        /**
         * An object that represents a Transport Layer Security (TLS) validation context trust for a
         * local file.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaytlsvalidationcontexttrust.html#cfn-appmesh-virtualgateway-virtualgatewaytlsvalidationcontexttrust-file)
         */
        public fun `file`(): Any? = unwrap(this).getFile()

        /**
         * A reference to an object that represents a virtual gateway's Transport Layer Security
         * (TLS) Secret Discovery Service validation context trust.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaytlsvalidationcontexttrust.html#cfn-appmesh-virtualgateway-virtualgatewaytlsvalidationcontexttrust-sds)
         */
        public fun sds(): Any? = unwrap(this).getSds()

        /** A builder for [VirtualGatewayTlsValidationContextTrustProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param acm A reference to an object that represents a Transport Layer Security (TLS)
             *   validation context trust for an AWS Certificate Manager certificate.
             */
            public fun acm(acm: IResolvable)

            /**
             * @param acm A reference to an object that represents a Transport Layer Security (TLS)
             *   validation context trust for an AWS Certificate Manager certificate.
             */
            public fun acm(acm: VirtualGatewayTlsValidationContextAcmTrustProperty)

            /**
             * @param acm A reference to an object that represents a Transport Layer Security (TLS)
             *   validation context trust for an AWS Certificate Manager certificate.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("5314e2221182f554e3066ad56d4734be3c0295254df3514e126a70adb977d6ab")
            public fun acm(
                acm: VirtualGatewayTlsValidationContextAcmTrustProperty.Builder.() -> Unit
            )

            /**
             * @param file An object that represents a Transport Layer Security (TLS) validation
             *   context trust for a local file.
             */
            public fun `file`(`file`: IResolvable)

            /**
             * @param file An object that represents a Transport Layer Security (TLS) validation
             *   context trust for a local file.
             */
            public fun `file`(`file`: VirtualGatewayTlsValidationContextFileTrustProperty)

            /**
             * @param file An object that represents a Transport Layer Security (TLS) validation
             *   context trust for a local file.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("acca65be2158b86d96fa276a3c6b39ef56598f53394d7c3d311ed0f5c14444f5")
            public fun `file`(
                `file`: VirtualGatewayTlsValidationContextFileTrustProperty.Builder.() -> Unit
            )

            /**
             * @param sds A reference to an object that represents a virtual gateway's Transport
             *   Layer Security (TLS) Secret Discovery Service validation context trust.
             */
            public fun sds(sds: IResolvable)

            /**
             * @param sds A reference to an object that represents a virtual gateway's Transport
             *   Layer Security (TLS) Secret Discovery Service validation context trust.
             */
            public fun sds(sds: VirtualGatewayTlsValidationContextSdsTrustProperty)

            /**
             * @param sds A reference to an object that represents a virtual gateway's Transport
             *   Layer Security (TLS) Secret Discovery Service validation context trust.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("c854926e0fedfde0952e64ef90808f02cabe4f11b6b60801674473fd28c2cfe4")
            public fun sds(
                sds: VirtualGatewayTlsValidationContextSdsTrustProperty.Builder.() -> Unit
            )
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextTrustProperty.Builder =
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway
                    .VirtualGatewayTlsValidationContextTrustProperty
                    .builder()

            /**
             * @param acm A reference to an object that represents a Transport Layer Security (TLS)
             *   validation context trust for an AWS Certificate Manager certificate.
             */
            override fun acm(acm: IResolvable) {
                cdkBuilder.acm(acm.let(IResolvable::unwrap))
            }

            /**
             * @param acm A reference to an object that represents a Transport Layer Security (TLS)
             *   validation context trust for an AWS Certificate Manager certificate.
             */
            override fun acm(acm: VirtualGatewayTlsValidationContextAcmTrustProperty) {
                cdkBuilder.acm(acm.let(VirtualGatewayTlsValidationContextAcmTrustProperty::unwrap))
            }

            /**
             * @param acm A reference to an object that represents a Transport Layer Security (TLS)
             *   validation context trust for an AWS Certificate Manager certificate.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("5314e2221182f554e3066ad56d4734be3c0295254df3514e126a70adb977d6ab")
            override fun acm(
                acm: VirtualGatewayTlsValidationContextAcmTrustProperty.Builder.() -> Unit
            ): Unit = acm(VirtualGatewayTlsValidationContextAcmTrustProperty(acm))

            /**
             * @param file An object that represents a Transport Layer Security (TLS) validation
             *   context trust for a local file.
             */
            override fun `file`(`file`: IResolvable) {
                cdkBuilder.`file`(`file`.let(IResolvable::unwrap))
            }

            /**
             * @param file An object that represents a Transport Layer Security (TLS) validation
             *   context trust for a local file.
             */
            override fun `file`(`file`: VirtualGatewayTlsValidationContextFileTrustProperty) {
                cdkBuilder.`file`(
                    `file`.let(VirtualGatewayTlsValidationContextFileTrustProperty::unwrap)
                )
            }

            /**
             * @param file An object that represents a Transport Layer Security (TLS) validation
             *   context trust for a local file.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("acca65be2158b86d96fa276a3c6b39ef56598f53394d7c3d311ed0f5c14444f5")
            override fun `file`(
                `file`: VirtualGatewayTlsValidationContextFileTrustProperty.Builder.() -> Unit
            ): Unit = `file`(VirtualGatewayTlsValidationContextFileTrustProperty(`file`))

            /**
             * @param sds A reference to an object that represents a virtual gateway's Transport
             *   Layer Security (TLS) Secret Discovery Service validation context trust.
             */
            override fun sds(sds: IResolvable) {
                cdkBuilder.sds(sds.let(IResolvable::unwrap))
            }

            /**
             * @param sds A reference to an object that represents a virtual gateway's Transport
             *   Layer Security (TLS) Secret Discovery Service validation context trust.
             */
            override fun sds(sds: VirtualGatewayTlsValidationContextSdsTrustProperty) {
                cdkBuilder.sds(sds.let(VirtualGatewayTlsValidationContextSdsTrustProperty::unwrap))
            }

            /**
             * @param sds A reference to an object that represents a virtual gateway's Transport
             *   Layer Security (TLS) Secret Discovery Service validation context trust.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("c854926e0fedfde0952e64ef90808f02cabe4f11b6b60801674473fd28c2cfe4")
            override fun sds(
                sds: VirtualGatewayTlsValidationContextSdsTrustProperty.Builder.() -> Unit
            ): Unit = sds(VirtualGatewayTlsValidationContextSdsTrustProperty(sds))

            public fun build():
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextTrustProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextTrustProperty,
        ) : VirtualGatewayTlsValidationContextTrustProperty {
            /**
             * A reference to an object that represents a Transport Layer Security (TLS) validation
             * context trust for an AWS Certificate Manager certificate.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaytlsvalidationcontexttrust.html#cfn-appmesh-virtualgateway-virtualgatewaytlsvalidationcontexttrust-acm)
             */
            override fun acm(): Any? = unwrap(this).getAcm()

            /**
             * An object that represents a Transport Layer Security (TLS) validation context trust
             * for a local file.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaytlsvalidationcontexttrust.html#cfn-appmesh-virtualgateway-virtualgatewaytlsvalidationcontexttrust-file)
             */
            override fun `file`(): Any? = unwrap(this).getFile()

            /**
             * A reference to an object that represents a virtual gateway's Transport Layer Security
             * (TLS) Secret Discovery Service validation context trust.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaytlsvalidationcontexttrust.html#cfn-appmesh-virtualgateway-virtualgatewaytlsvalidationcontexttrust-sds)
             */
            override fun sds(): Any? = unwrap(this).getSds()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): VirtualGatewayTlsValidationContextTrustProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextTrustProperty
            ): VirtualGatewayTlsValidationContextTrustProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: VirtualGatewayTlsValidationContextTrustProperty
            ): software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextTrustProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface VirtualGatewayTlsValidationContextSdsTrustProperty {
        /**
         * A reference to an object that represents the name of the secret for a virtual gateway's
         * Transport Layer Security (TLS) Secret Discovery Service validation context trust.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaytlsvalidationcontextsdstrust.html#cfn-appmesh-virtualgateway-virtualgatewaytlsvalidationcontextsdstrust-secretname)
         */
        public fun secretName(): String

        /** A builder for [VirtualGatewayTlsValidationContextSdsTrustProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param secretName A reference to an object that represents the name of the secret for
             *   a virtual gateway's Transport Layer Security (TLS) Secret Discovery Service
             *   validation context trust.
             */
            public fun secretName(secretName: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextSdsTrustProperty.Builder =
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway
                    .VirtualGatewayTlsValidationContextSdsTrustProperty
                    .builder()

            /**
             * @param secretName A reference to an object that represents the name of the secret for
             *   a virtual gateway's Transport Layer Security (TLS) Secret Discovery Service
             *   validation context trust.
             */
            override fun secretName(secretName: String) {
                cdkBuilder.secretName(secretName)
            }

            public fun build():
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextSdsTrustProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextSdsTrustProperty,
        ) : VirtualGatewayTlsValidationContextSdsTrustProperty {
            /**
             * A reference to an object that represents the name of the secret for a virtual
             * gateway's Transport Layer Security (TLS) Secret Discovery Service validation context
             * trust.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaytlsvalidationcontextsdstrust.html#cfn-appmesh-virtualgateway-virtualgatewaytlsvalidationcontextsdstrust-secretname)
             */
            override fun secretName(): String = unwrap(this).getSecretName()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): VirtualGatewayTlsValidationContextSdsTrustProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextSdsTrustProperty
            ): VirtualGatewayTlsValidationContextSdsTrustProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: VirtualGatewayTlsValidationContextSdsTrustProperty
            ): software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextSdsTrustProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface VirtualGatewayAccessLogProperty {
        /**
         * The file object to send virtual gateway access logs to.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayaccesslog.html#cfn-appmesh-virtualgateway-virtualgatewayaccesslog-file)
         */
        public fun `file`(): Any? = unwrap(this).getFile()

        /** A builder for [VirtualGatewayAccessLogProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param file The file object to send virtual gateway access logs to. */
            public fun `file`(`file`: IResolvable)

            /** @param file The file object to send virtual gateway access logs to. */
            public fun `file`(`file`: VirtualGatewayFileAccessLogProperty)

            /** @param file The file object to send virtual gateway access logs to. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("6f3121bb369a8d15cefa43e3b6240a991fbdfa32882bb1e89c72730747fbbe49")
            public fun `file`(`file`: VirtualGatewayFileAccessLogProperty.Builder.() -> Unit)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayAccessLogProperty.Builder =
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway
                    .VirtualGatewayAccessLogProperty
                    .builder()

            /** @param file The file object to send virtual gateway access logs to. */
            override fun `file`(`file`: IResolvable) {
                cdkBuilder.`file`(`file`.let(IResolvable::unwrap))
            }

            /** @param file The file object to send virtual gateway access logs to. */
            override fun `file`(`file`: VirtualGatewayFileAccessLogProperty) {
                cdkBuilder.`file`(`file`.let(VirtualGatewayFileAccessLogProperty::unwrap))
            }

            /** @param file The file object to send virtual gateway access logs to. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("6f3121bb369a8d15cefa43e3b6240a991fbdfa32882bb1e89c72730747fbbe49")
            override fun `file`(
                `file`: VirtualGatewayFileAccessLogProperty.Builder.() -> Unit
            ): Unit = `file`(VirtualGatewayFileAccessLogProperty(`file`))

            public fun build():
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayAccessLogProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayAccessLogProperty,
        ) : VirtualGatewayAccessLogProperty {
            /**
             * The file object to send virtual gateway access logs to.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayaccesslog.html#cfn-appmesh-virtualgateway-virtualgatewayaccesslog-file)
             */
            override fun `file`(): Any? = unwrap(this).getFile()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): VirtualGatewayAccessLogProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayAccessLogProperty
            ): VirtualGatewayAccessLogProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: VirtualGatewayAccessLogProperty
            ): software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayAccessLogProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface VirtualGatewayHealthCheckPolicyProperty {
        /**
         * The number of consecutive successful health checks that must occur before declaring the
         * listener healthy.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayhealthcheckpolicy.html#cfn-appmesh-virtualgateway-virtualgatewayhealthcheckpolicy-healthythreshold)
         */
        public fun healthyThreshold(): Number

        /**
         * The time period in milliseconds between each health check execution.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayhealthcheckpolicy.html#cfn-appmesh-virtualgateway-virtualgatewayhealthcheckpolicy-intervalmillis)
         */
        public fun intervalMillis(): Number

        /**
         * The destination path for the health check request.
         *
         * This value is only used if the specified protocol is HTTP or HTTP/2. For any other
         * protocol, this value is ignored.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayhealthcheckpolicy.html#cfn-appmesh-virtualgateway-virtualgatewayhealthcheckpolicy-path)
         */
        public fun path(): String? = unwrap(this).getPath()

        /**
         * The destination port for the health check request.
         *
         * This port must match the port defined in the `PortMapping` for the listener.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayhealthcheckpolicy.html#cfn-appmesh-virtualgateway-virtualgatewayhealthcheckpolicy-port)
         */
        public fun port(): Number? = unwrap(this).getPort()

        /**
         * The protocol for the health check request.
         *
         * If you specify `grpc` , then your service must conform to the
         * [GRPC Health Checking Protocol](https://docs.aws.amazon.com/https://github.com/grpc/grpc/blob/master/doc/health-checking.md)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayhealthcheckpolicy.html#cfn-appmesh-virtualgateway-virtualgatewayhealthcheckpolicy-protocol)
         */
        public fun protocol(): String

        /**
         * The amount of time to wait when receiving a response from the health check, in
         * milliseconds.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayhealthcheckpolicy.html#cfn-appmesh-virtualgateway-virtualgatewayhealthcheckpolicy-timeoutmillis)
         */
        public fun timeoutMillis(): Number

        /**
         * The number of consecutive failed health checks that must occur before declaring a virtual
         * gateway unhealthy.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayhealthcheckpolicy.html#cfn-appmesh-virtualgateway-virtualgatewayhealthcheckpolicy-unhealthythreshold)
         */
        public fun unhealthyThreshold(): Number

        /** A builder for [VirtualGatewayHealthCheckPolicyProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param healthyThreshold The number of consecutive successful health checks that must
             *   occur before declaring the listener healthy.
             */
            public fun healthyThreshold(healthyThreshold: Number)

            /**
             * @param intervalMillis The time period in milliseconds between each health check
             *   execution.
             */
            public fun intervalMillis(intervalMillis: Number)

            /**
             * @param path The destination path for the health check request. This value is only
             *   used if the specified protocol is HTTP or HTTP/2. For any other protocol, this
             *   value is ignored.
             */
            public fun path(path: String)

            /**
             * @param port The destination port for the health check request. This port must match
             *   the port defined in the `PortMapping` for the listener.
             */
            public fun port(port: Number)

            /**
             * @param protocol The protocol for the health check request. If you specify `grpc` ,
             *   then your service must conform to the
             *   [GRPC Health Checking Protocol](https://docs.aws.amazon.com/https://github.com/grpc/grpc/blob/master/doc/health-checking.md)
             *   .
             */
            public fun protocol(protocol: String)

            /**
             * @param timeoutMillis The amount of time to wait when receiving a response from the
             *   health check, in milliseconds.
             */
            public fun timeoutMillis(timeoutMillis: Number)

            /**
             * @param unhealthyThreshold The number of consecutive failed health checks that must
             *   occur before declaring a virtual gateway unhealthy.
             */
            public fun unhealthyThreshold(unhealthyThreshold: Number)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayHealthCheckPolicyProperty.Builder =
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway
                    .VirtualGatewayHealthCheckPolicyProperty
                    .builder()

            /**
             * @param healthyThreshold The number of consecutive successful health checks that must
             *   occur before declaring the listener healthy.
             */
            override fun healthyThreshold(healthyThreshold: Number) {
                cdkBuilder.healthyThreshold(healthyThreshold)
            }

            /**
             * @param intervalMillis The time period in milliseconds between each health check
             *   execution.
             */
            override fun intervalMillis(intervalMillis: Number) {
                cdkBuilder.intervalMillis(intervalMillis)
            }

            /**
             * @param path The destination path for the health check request. This value is only
             *   used if the specified protocol is HTTP or HTTP/2. For any other protocol, this
             *   value is ignored.
             */
            override fun path(path: String) {
                cdkBuilder.path(path)
            }

            /**
             * @param port The destination port for the health check request. This port must match
             *   the port defined in the `PortMapping` for the listener.
             */
            override fun port(port: Number) {
                cdkBuilder.port(port)
            }

            /**
             * @param protocol The protocol for the health check request. If you specify `grpc` ,
             *   then your service must conform to the
             *   [GRPC Health Checking Protocol](https://docs.aws.amazon.com/https://github.com/grpc/grpc/blob/master/doc/health-checking.md)
             *   .
             */
            override fun protocol(protocol: String) {
                cdkBuilder.protocol(protocol)
            }

            /**
             * @param timeoutMillis The amount of time to wait when receiving a response from the
             *   health check, in milliseconds.
             */
            override fun timeoutMillis(timeoutMillis: Number) {
                cdkBuilder.timeoutMillis(timeoutMillis)
            }

            /**
             * @param unhealthyThreshold The number of consecutive failed health checks that must
             *   occur before declaring a virtual gateway unhealthy.
             */
            override fun unhealthyThreshold(unhealthyThreshold: Number) {
                cdkBuilder.unhealthyThreshold(unhealthyThreshold)
            }

            public fun build():
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayHealthCheckPolicyProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayHealthCheckPolicyProperty,
        ) : VirtualGatewayHealthCheckPolicyProperty {
            /**
             * The number of consecutive successful health checks that must occur before declaring
             * the listener healthy.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayhealthcheckpolicy.html#cfn-appmesh-virtualgateway-virtualgatewayhealthcheckpolicy-healthythreshold)
             */
            override fun healthyThreshold(): Number = unwrap(this).getHealthyThreshold()

            /**
             * The time period in milliseconds between each health check execution.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayhealthcheckpolicy.html#cfn-appmesh-virtualgateway-virtualgatewayhealthcheckpolicy-intervalmillis)
             */
            override fun intervalMillis(): Number = unwrap(this).getIntervalMillis()

            /**
             * The destination path for the health check request.
             *
             * This value is only used if the specified protocol is HTTP or HTTP/2. For any other
             * protocol, this value is ignored.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayhealthcheckpolicy.html#cfn-appmesh-virtualgateway-virtualgatewayhealthcheckpolicy-path)
             */
            override fun path(): String? = unwrap(this).getPath()

            /**
             * The destination port for the health check request.
             *
             * This port must match the port defined in the `PortMapping` for the listener.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayhealthcheckpolicy.html#cfn-appmesh-virtualgateway-virtualgatewayhealthcheckpolicy-port)
             */
            override fun port(): Number? = unwrap(this).getPort()

            /**
             * The protocol for the health check request.
             *
             * If you specify `grpc` , then your service must conform to the
             * [GRPC Health Checking Protocol](https://docs.aws.amazon.com/https://github.com/grpc/grpc/blob/master/doc/health-checking.md)
             * .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayhealthcheckpolicy.html#cfn-appmesh-virtualgateway-virtualgatewayhealthcheckpolicy-protocol)
             */
            override fun protocol(): String = unwrap(this).getProtocol()

            /**
             * The amount of time to wait when receiving a response from the health check, in
             * milliseconds.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayhealthcheckpolicy.html#cfn-appmesh-virtualgateway-virtualgatewayhealthcheckpolicy-timeoutmillis)
             */
            override fun timeoutMillis(): Number = unwrap(this).getTimeoutMillis()

            /**
             * The number of consecutive failed health checks that must occur before declaring a
             * virtual gateway unhealthy.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayhealthcheckpolicy.html#cfn-appmesh-virtualgateway-virtualgatewayhealthcheckpolicy-unhealthythreshold)
             */
            override fun unhealthyThreshold(): Number = unwrap(this).getUnhealthyThreshold()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): VirtualGatewayHealthCheckPolicyProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayHealthCheckPolicyProperty
            ): VirtualGatewayHealthCheckPolicyProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: VirtualGatewayHealthCheckPolicyProperty
            ): software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayHealthCheckPolicyProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface VirtualGatewayBackendDefaultsProperty {
        /**
         * A reference to an object that represents a client policy.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaybackenddefaults.html#cfn-appmesh-virtualgateway-virtualgatewaybackenddefaults-clientpolicy)
         */
        public fun clientPolicy(): Any? = unwrap(this).getClientPolicy()

        /** A builder for [VirtualGatewayBackendDefaultsProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param clientPolicy A reference to an object that represents a client policy. */
            public fun clientPolicy(clientPolicy: IResolvable)

            /** @param clientPolicy A reference to an object that represents a client policy. */
            public fun clientPolicy(clientPolicy: VirtualGatewayClientPolicyProperty)

            /** @param clientPolicy A reference to an object that represents a client policy. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("3a690241443363f80e1ed79e901ce310d93493a7b7f0c7575c6724a892480cf7")
            public fun clientPolicy(
                clientPolicy: VirtualGatewayClientPolicyProperty.Builder.() -> Unit
            )
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayBackendDefaultsProperty.Builder =
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway
                    .VirtualGatewayBackendDefaultsProperty
                    .builder()

            /** @param clientPolicy A reference to an object that represents a client policy. */
            override fun clientPolicy(clientPolicy: IResolvable) {
                cdkBuilder.clientPolicy(clientPolicy.let(IResolvable::unwrap))
            }

            /** @param clientPolicy A reference to an object that represents a client policy. */
            override fun clientPolicy(clientPolicy: VirtualGatewayClientPolicyProperty) {
                cdkBuilder.clientPolicy(
                    clientPolicy.let(VirtualGatewayClientPolicyProperty::unwrap)
                )
            }

            /** @param clientPolicy A reference to an object that represents a client policy. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("3a690241443363f80e1ed79e901ce310d93493a7b7f0c7575c6724a892480cf7")
            override fun clientPolicy(
                clientPolicy: VirtualGatewayClientPolicyProperty.Builder.() -> Unit
            ): Unit = clientPolicy(VirtualGatewayClientPolicyProperty(clientPolicy))

            public fun build():
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayBackendDefaultsProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayBackendDefaultsProperty,
        ) : VirtualGatewayBackendDefaultsProperty {
            /**
             * A reference to an object that represents a client policy.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaybackenddefaults.html#cfn-appmesh-virtualgateway-virtualgatewaybackenddefaults-clientpolicy)
             */
            override fun clientPolicy(): Any? = unwrap(this).getClientPolicy()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): VirtualGatewayBackendDefaultsProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayBackendDefaultsProperty
            ): VirtualGatewayBackendDefaultsProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: VirtualGatewayBackendDefaultsProperty
            ): software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayBackendDefaultsProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface VirtualGatewayListenerTlsValidationContextProperty {
        /**
         * A reference to an object that represents the SANs for a virtual gateway listener's
         * Transport Layer Security (TLS) validation context.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaylistenertlsvalidationcontext.html#cfn-appmesh-virtualgateway-virtualgatewaylistenertlsvalidationcontext-subjectalternativenames)
         */
        public fun subjectAlternativeNames(): Any? = unwrap(this).getSubjectAlternativeNames()

        /**
         * A reference to where to retrieve the trust chain when validating a peer’s Transport Layer
         * Security (TLS) certificate.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaylistenertlsvalidationcontext.html#cfn-appmesh-virtualgateway-virtualgatewaylistenertlsvalidationcontext-trust)
         */
        public fun trust(): Any

        /** A builder for [VirtualGatewayListenerTlsValidationContextProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param subjectAlternativeNames A reference to an object that represents the SANs for
             *   a virtual gateway listener's Transport Layer Security (TLS) validation context.
             */
            public fun subjectAlternativeNames(subjectAlternativeNames: IResolvable)

            /**
             * @param subjectAlternativeNames A reference to an object that represents the SANs for
             *   a virtual gateway listener's Transport Layer Security (TLS) validation context.
             */
            public fun subjectAlternativeNames(
                subjectAlternativeNames: SubjectAlternativeNamesProperty
            )

            /**
             * @param subjectAlternativeNames A reference to an object that represents the SANs for
             *   a virtual gateway listener's Transport Layer Security (TLS) validation context.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("d86a964ec948a76a692ee81b044ffab0a1f298dc0cf139e8ff41cea0d5c6e56b")
            public fun subjectAlternativeNames(
                subjectAlternativeNames: SubjectAlternativeNamesProperty.Builder.() -> Unit
            )

            /**
             * @param trust A reference to where to retrieve the trust chain when validating a
             *   peer’s Transport Layer Security (TLS) certificate.
             */
            public fun trust(trust: IResolvable)

            /**
             * @param trust A reference to where to retrieve the trust chain when validating a
             *   peer’s Transport Layer Security (TLS) certificate.
             */
            public fun trust(trust: VirtualGatewayListenerTlsValidationContextTrustProperty)

            /**
             * @param trust A reference to where to retrieve the trust chain when validating a
             *   peer’s Transport Layer Security (TLS) certificate.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("c148b9e3778a689288c963548b5350d16829a1dacc1b95ccc54a944f2dbde3db")
            public fun trust(
                trust: VirtualGatewayListenerTlsValidationContextTrustProperty.Builder.() -> Unit
            )
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsValidationContextProperty.Builder =
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway
                    .VirtualGatewayListenerTlsValidationContextProperty
                    .builder()

            /**
             * @param subjectAlternativeNames A reference to an object that represents the SANs for
             *   a virtual gateway listener's Transport Layer Security (TLS) validation context.
             */
            override fun subjectAlternativeNames(subjectAlternativeNames: IResolvable) {
                cdkBuilder.subjectAlternativeNames(subjectAlternativeNames.let(IResolvable::unwrap))
            }

            /**
             * @param subjectAlternativeNames A reference to an object that represents the SANs for
             *   a virtual gateway listener's Transport Layer Security (TLS) validation context.
             */
            override fun subjectAlternativeNames(
                subjectAlternativeNames: SubjectAlternativeNamesProperty
            ) {
                cdkBuilder.subjectAlternativeNames(
                    subjectAlternativeNames.let(SubjectAlternativeNamesProperty::unwrap)
                )
            }

            /**
             * @param subjectAlternativeNames A reference to an object that represents the SANs for
             *   a virtual gateway listener's Transport Layer Security (TLS) validation context.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("d86a964ec948a76a692ee81b044ffab0a1f298dc0cf139e8ff41cea0d5c6e56b")
            override fun subjectAlternativeNames(
                subjectAlternativeNames: SubjectAlternativeNamesProperty.Builder.() -> Unit
            ): Unit =
                subjectAlternativeNames(SubjectAlternativeNamesProperty(subjectAlternativeNames))

            /**
             * @param trust A reference to where to retrieve the trust chain when validating a
             *   peer’s Transport Layer Security (TLS) certificate.
             */
            override fun trust(trust: IResolvable) {
                cdkBuilder.trust(trust.let(IResolvable::unwrap))
            }

            /**
             * @param trust A reference to where to retrieve the trust chain when validating a
             *   peer’s Transport Layer Security (TLS) certificate.
             */
            override fun trust(trust: VirtualGatewayListenerTlsValidationContextTrustProperty) {
                cdkBuilder.trust(
                    trust.let(VirtualGatewayListenerTlsValidationContextTrustProperty::unwrap)
                )
            }

            /**
             * @param trust A reference to where to retrieve the trust chain when validating a
             *   peer’s Transport Layer Security (TLS) certificate.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("c148b9e3778a689288c963548b5350d16829a1dacc1b95ccc54a944f2dbde3db")
            override fun trust(
                trust: VirtualGatewayListenerTlsValidationContextTrustProperty.Builder.() -> Unit
            ): Unit = trust(VirtualGatewayListenerTlsValidationContextTrustProperty(trust))

            public fun build():
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsValidationContextProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsValidationContextProperty,
        ) : VirtualGatewayListenerTlsValidationContextProperty {
            /**
             * A reference to an object that represents the SANs for a virtual gateway listener's
             * Transport Layer Security (TLS) validation context.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaylistenertlsvalidationcontext.html#cfn-appmesh-virtualgateway-virtualgatewaylistenertlsvalidationcontext-subjectalternativenames)
             */
            override fun subjectAlternativeNames(): Any? = unwrap(this).getSubjectAlternativeNames()

            /**
             * A reference to where to retrieve the trust chain when validating a peer’s Transport
             * Layer Security (TLS) certificate.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaylistenertlsvalidationcontext.html#cfn-appmesh-virtualgateway-virtualgatewaylistenertlsvalidationcontext-trust)
             */
            override fun trust(): Any = unwrap(this).getTrust()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): VirtualGatewayListenerTlsValidationContextProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsValidationContextProperty
            ): VirtualGatewayListenerTlsValidationContextProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: VirtualGatewayListenerTlsValidationContextProperty
            ): software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsValidationContextProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface VirtualGatewayFileAccessLogProperty {
        /**
         * The specified format for the virtual gateway access logs.
         *
         * It can be either `json_format` or `text_format` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayfileaccesslog.html#cfn-appmesh-virtualgateway-virtualgatewayfileaccesslog-format)
         */
        public fun format(): Any? = unwrap(this).getFormat()

        /**
         * The file path to write access logs to.
         *
         * You can use `/dev/stdout` to send access logs to standard out and configure your Envoy
         * container to use a log driver, such as `awslogs` , to export the access logs to a log
         * storage service such as Amazon CloudWatch Logs. You can also specify a path in the Envoy
         * container's file system to write the files to disk.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayfileaccesslog.html#cfn-appmesh-virtualgateway-virtualgatewayfileaccesslog-path)
         */
        public fun path(): String

        /** A builder for [VirtualGatewayFileAccessLogProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param format The specified format for the virtual gateway access logs. It can be
             *   either `json_format` or `text_format` .
             */
            public fun format(format: IResolvable)

            /**
             * @param format The specified format for the virtual gateway access logs. It can be
             *   either `json_format` or `text_format` .
             */
            public fun format(format: LoggingFormatProperty)

            /**
             * @param format The specified format for the virtual gateway access logs. It can be
             *   either `json_format` or `text_format` .
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("f0af80698308ec03c64f1fe49c0b1bf8419e8c41c1f1ca3588c2e5ef6b79f803")
            public fun format(format: LoggingFormatProperty.Builder.() -> Unit)

            /**
             * @param path The file path to write access logs to. You can use `/dev/stdout` to send
             *   access logs to standard out and configure your Envoy container to use a log driver,
             *   such as `awslogs` , to export the access logs to a log storage service such as
             *   Amazon CloudWatch Logs. You can also specify a path in the Envoy container's file
             *   system to write the files to disk.
             */
            public fun path(path: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayFileAccessLogProperty.Builder =
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway
                    .VirtualGatewayFileAccessLogProperty
                    .builder()

            /**
             * @param format The specified format for the virtual gateway access logs. It can be
             *   either `json_format` or `text_format` .
             */
            override fun format(format: IResolvable) {
                cdkBuilder.format(format.let(IResolvable::unwrap))
            }

            /**
             * @param format The specified format for the virtual gateway access logs. It can be
             *   either `json_format` or `text_format` .
             */
            override fun format(format: LoggingFormatProperty) {
                cdkBuilder.format(format.let(LoggingFormatProperty::unwrap))
            }

            /**
             * @param format The specified format for the virtual gateway access logs. It can be
             *   either `json_format` or `text_format` .
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("f0af80698308ec03c64f1fe49c0b1bf8419e8c41c1f1ca3588c2e5ef6b79f803")
            override fun format(format: LoggingFormatProperty.Builder.() -> Unit): Unit =
                format(LoggingFormatProperty(format))

            /**
             * @param path The file path to write access logs to. You can use `/dev/stdout` to send
             *   access logs to standard out and configure your Envoy container to use a log driver,
             *   such as `awslogs` , to export the access logs to a log storage service such as
             *   Amazon CloudWatch Logs. You can also specify a path in the Envoy container's file
             *   system to write the files to disk.
             */
            override fun path(path: String) {
                cdkBuilder.path(path)
            }

            public fun build():
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayFileAccessLogProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayFileAccessLogProperty,
        ) : VirtualGatewayFileAccessLogProperty {
            /**
             * The specified format for the virtual gateway access logs.
             *
             * It can be either `json_format` or `text_format` .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayfileaccesslog.html#cfn-appmesh-virtualgateway-virtualgatewayfileaccesslog-format)
             */
            override fun format(): Any? = unwrap(this).getFormat()

            /**
             * The file path to write access logs to.
             *
             * You can use `/dev/stdout` to send access logs to standard out and configure your
             * Envoy container to use a log driver, such as `awslogs` , to export the access logs to
             * a log storage service such as Amazon CloudWatch Logs. You can also specify a path in
             * the Envoy container's file system to write the files to disk.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayfileaccesslog.html#cfn-appmesh-virtualgateway-virtualgatewayfileaccesslog-path)
             */
            override fun path(): String = unwrap(this).getPath()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): VirtualGatewayFileAccessLogProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayFileAccessLogProperty
            ): VirtualGatewayFileAccessLogProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: VirtualGatewayFileAccessLogProperty
            ): software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayFileAccessLogProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface VirtualGatewayListenerProperty {
        /**
         * The connection pool information for the listener.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaylistener.html#cfn-appmesh-virtualgateway-virtualgatewaylistener-connectionpool)
         */
        public fun connectionPool(): Any? = unwrap(this).getConnectionPool()

        /**
         * The health check information for the listener.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaylistener.html#cfn-appmesh-virtualgateway-virtualgatewaylistener-healthcheck)
         */
        public fun healthCheck(): Any? = unwrap(this).getHealthCheck()

        /**
         * The port mapping information for the listener.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaylistener.html#cfn-appmesh-virtualgateway-virtualgatewaylistener-portmapping)
         */
        public fun portMapping(): Any

        /**
         * A reference to an object that represents the Transport Layer Security (TLS) properties
         * for the listener.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaylistener.html#cfn-appmesh-virtualgateway-virtualgatewaylistener-tls)
         */
        public fun tls(): Any? = unwrap(this).getTls()

        /** A builder for [VirtualGatewayListenerProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param connectionPool The connection pool information for the listener. */
            public fun connectionPool(connectionPool: IResolvable)

            /** @param connectionPool The connection pool information for the listener. */
            public fun connectionPool(connectionPool: VirtualGatewayConnectionPoolProperty)

            /** @param connectionPool The connection pool information for the listener. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("c5cada049a248eeb43391db32e3ebef2974b4bea2bbca850ab09fd507f39aa1d")
            public fun connectionPool(
                connectionPool: VirtualGatewayConnectionPoolProperty.Builder.() -> Unit
            )

            /** @param healthCheck The health check information for the listener. */
            public fun healthCheck(healthCheck: IResolvable)

            /** @param healthCheck The health check information for the listener. */
            public fun healthCheck(healthCheck: VirtualGatewayHealthCheckPolicyProperty)

            /** @param healthCheck The health check information for the listener. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("3b2c7143fe6682175577fe24f6600fd4ed58d4b409e5ae64d20cb47851922c6a")
            public fun healthCheck(
                healthCheck: VirtualGatewayHealthCheckPolicyProperty.Builder.() -> Unit
            )

            /** @param portMapping The port mapping information for the listener. */
            public fun portMapping(portMapping: IResolvable)

            /** @param portMapping The port mapping information for the listener. */
            public fun portMapping(portMapping: VirtualGatewayPortMappingProperty)

            /** @param portMapping The port mapping information for the listener. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("657e1415a121679f54184b01da35c8125c99f3fe79fe4c2ca31228f05c022c2f")
            public fun portMapping(
                portMapping: VirtualGatewayPortMappingProperty.Builder.() -> Unit
            )

            /**
             * @param tls A reference to an object that represents the Transport Layer Security
             *   (TLS) properties for the listener.
             */
            public fun tls(tls: IResolvable)

            /**
             * @param tls A reference to an object that represents the Transport Layer Security
             *   (TLS) properties for the listener.
             */
            public fun tls(tls: VirtualGatewayListenerTlsProperty)

            /**
             * @param tls A reference to an object that represents the Transport Layer Security
             *   (TLS) properties for the listener.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("d474295a8d3ce631a448df4daacc876d7efbbc32b6a303fcdf045c661c58ad0b")
            public fun tls(tls: VirtualGatewayListenerTlsProperty.Builder.() -> Unit)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerProperty.Builder =
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway
                    .VirtualGatewayListenerProperty
                    .builder()

            /** @param connectionPool The connection pool information for the listener. */
            override fun connectionPool(connectionPool: IResolvable) {
                cdkBuilder.connectionPool(connectionPool.let(IResolvable::unwrap))
            }

            /** @param connectionPool The connection pool information for the listener. */
            override fun connectionPool(connectionPool: VirtualGatewayConnectionPoolProperty) {
                cdkBuilder.connectionPool(
                    connectionPool.let(VirtualGatewayConnectionPoolProperty::unwrap)
                )
            }

            /** @param connectionPool The connection pool information for the listener. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("c5cada049a248eeb43391db32e3ebef2974b4bea2bbca850ab09fd507f39aa1d")
            override fun connectionPool(
                connectionPool: VirtualGatewayConnectionPoolProperty.Builder.() -> Unit
            ): Unit = connectionPool(VirtualGatewayConnectionPoolProperty(connectionPool))

            /** @param healthCheck The health check information for the listener. */
            override fun healthCheck(healthCheck: IResolvable) {
                cdkBuilder.healthCheck(healthCheck.let(IResolvable::unwrap))
            }

            /** @param healthCheck The health check information for the listener. */
            override fun healthCheck(healthCheck: VirtualGatewayHealthCheckPolicyProperty) {
                cdkBuilder.healthCheck(
                    healthCheck.let(VirtualGatewayHealthCheckPolicyProperty::unwrap)
                )
            }

            /** @param healthCheck The health check information for the listener. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("3b2c7143fe6682175577fe24f6600fd4ed58d4b409e5ae64d20cb47851922c6a")
            override fun healthCheck(
                healthCheck: VirtualGatewayHealthCheckPolicyProperty.Builder.() -> Unit
            ): Unit = healthCheck(VirtualGatewayHealthCheckPolicyProperty(healthCheck))

            /** @param portMapping The port mapping information for the listener. */
            override fun portMapping(portMapping: IResolvable) {
                cdkBuilder.portMapping(portMapping.let(IResolvable::unwrap))
            }

            /** @param portMapping The port mapping information for the listener. */
            override fun portMapping(portMapping: VirtualGatewayPortMappingProperty) {
                cdkBuilder.portMapping(portMapping.let(VirtualGatewayPortMappingProperty::unwrap))
            }

            /** @param portMapping The port mapping information for the listener. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("657e1415a121679f54184b01da35c8125c99f3fe79fe4c2ca31228f05c022c2f")
            override fun portMapping(
                portMapping: VirtualGatewayPortMappingProperty.Builder.() -> Unit
            ): Unit = portMapping(VirtualGatewayPortMappingProperty(portMapping))

            /**
             * @param tls A reference to an object that represents the Transport Layer Security
             *   (TLS) properties for the listener.
             */
            override fun tls(tls: IResolvable) {
                cdkBuilder.tls(tls.let(IResolvable::unwrap))
            }

            /**
             * @param tls A reference to an object that represents the Transport Layer Security
             *   (TLS) properties for the listener.
             */
            override fun tls(tls: VirtualGatewayListenerTlsProperty) {
                cdkBuilder.tls(tls.let(VirtualGatewayListenerTlsProperty::unwrap))
            }

            /**
             * @param tls A reference to an object that represents the Transport Layer Security
             *   (TLS) properties for the listener.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("d474295a8d3ce631a448df4daacc876d7efbbc32b6a303fcdf045c661c58ad0b")
            override fun tls(tls: VirtualGatewayListenerTlsProperty.Builder.() -> Unit): Unit =
                tls(VirtualGatewayListenerTlsProperty(tls))

            public fun build():
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerProperty,
        ) : VirtualGatewayListenerProperty {
            /**
             * The connection pool information for the listener.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaylistener.html#cfn-appmesh-virtualgateway-virtualgatewaylistener-connectionpool)
             */
            override fun connectionPool(): Any? = unwrap(this).getConnectionPool()

            /**
             * The health check information for the listener.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaylistener.html#cfn-appmesh-virtualgateway-virtualgatewaylistener-healthcheck)
             */
            override fun healthCheck(): Any? = unwrap(this).getHealthCheck()

            /**
             * The port mapping information for the listener.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaylistener.html#cfn-appmesh-virtualgateway-virtualgatewaylistener-portmapping)
             */
            override fun portMapping(): Any = unwrap(this).getPortMapping()

            /**
             * A reference to an object that represents the Transport Layer Security (TLS)
             * properties for the listener.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaylistener.html#cfn-appmesh-virtualgateway-virtualgatewaylistener-tls)
             */
            override fun tls(): Any? = unwrap(this).getTls()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): VirtualGatewayListenerProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerProperty
            ): VirtualGatewayListenerProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: VirtualGatewayListenerProperty
            ): software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface VirtualGatewayListenerTlsSdsCertificateProperty {
        /**
         * A reference to an object that represents the name of the secret secret requested from the
         * Secret Discovery Service provider representing Transport Layer Security (TLS) materials
         * like a certificate or certificate chain.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaylistenertlssdscertificate.html#cfn-appmesh-virtualgateway-virtualgatewaylistenertlssdscertificate-secretname)
         */
        public fun secretName(): String

        /** A builder for [VirtualGatewayListenerTlsSdsCertificateProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param secretName A reference to an object that represents the name of the secret
             *   secret requested from the Secret Discovery Service provider representing Transport
             *   Layer Security (TLS) materials like a certificate or certificate chain.
             */
            public fun secretName(secretName: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsSdsCertificateProperty.Builder =
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway
                    .VirtualGatewayListenerTlsSdsCertificateProperty
                    .builder()

            /**
             * @param secretName A reference to an object that represents the name of the secret
             *   secret requested from the Secret Discovery Service provider representing Transport
             *   Layer Security (TLS) materials like a certificate or certificate chain.
             */
            override fun secretName(secretName: String) {
                cdkBuilder.secretName(secretName)
            }

            public fun build():
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsSdsCertificateProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsSdsCertificateProperty,
        ) : VirtualGatewayListenerTlsSdsCertificateProperty {
            /**
             * A reference to an object that represents the name of the secret secret requested from
             * the Secret Discovery Service provider representing Transport Layer Security (TLS)
             * materials like a certificate or certificate chain.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaylistenertlssdscertificate.html#cfn-appmesh-virtualgateway-virtualgatewaylistenertlssdscertificate-secretname)
             */
            override fun secretName(): String = unwrap(this).getSecretName()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): VirtualGatewayListenerTlsSdsCertificateProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsSdsCertificateProperty
            ): VirtualGatewayListenerTlsSdsCertificateProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: VirtualGatewayListenerTlsSdsCertificateProperty
            ): software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsSdsCertificateProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface VirtualGatewayTlsValidationContextAcmTrustProperty {
        /**
         * One or more ACM Amazon Resource Name (ARN)s.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaytlsvalidationcontextacmtrust.html#cfn-appmesh-virtualgateway-virtualgatewaytlsvalidationcontextacmtrust-certificateauthorityarns)
         */
        public fun certificateAuthorityArns(): List<String>

        /** A builder for [VirtualGatewayTlsValidationContextAcmTrustProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param certificateAuthorityArns One or more ACM Amazon Resource Name (ARN)s. */
            public fun certificateAuthorityArns(certificateAuthorityArns: List<String>)

            /** @param certificateAuthorityArns One or more ACM Amazon Resource Name (ARN)s. */
            public fun certificateAuthorityArns(vararg certificateAuthorityArns: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextAcmTrustProperty.Builder =
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway
                    .VirtualGatewayTlsValidationContextAcmTrustProperty
                    .builder()

            /** @param certificateAuthorityArns One or more ACM Amazon Resource Name (ARN)s. */
            override fun certificateAuthorityArns(certificateAuthorityArns: List<String>) {
                cdkBuilder.certificateAuthorityArns(certificateAuthorityArns)
            }

            /** @param certificateAuthorityArns One or more ACM Amazon Resource Name (ARN)s. */
            override fun certificateAuthorityArns(vararg certificateAuthorityArns: String): Unit =
                certificateAuthorityArns(certificateAuthorityArns.toList())

            public fun build():
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextAcmTrustProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextAcmTrustProperty,
        ) : VirtualGatewayTlsValidationContextAcmTrustProperty {
            /**
             * One or more ACM Amazon Resource Name (ARN)s.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaytlsvalidationcontextacmtrust.html#cfn-appmesh-virtualgateway-virtualgatewaytlsvalidationcontextacmtrust-certificateauthorityarns)
             */
            override fun certificateAuthorityArns(): List<String> =
                unwrap(this).getCertificateAuthorityArns()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): VirtualGatewayTlsValidationContextAcmTrustProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextAcmTrustProperty
            ): VirtualGatewayTlsValidationContextAcmTrustProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: VirtualGatewayTlsValidationContextAcmTrustProperty
            ): software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextAcmTrustProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface VirtualGatewayPortMappingProperty {
        /**
         * The port used for the port mapping.
         *
         * Specify one protocol.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayportmapping.html#cfn-appmesh-virtualgateway-virtualgatewayportmapping-port)
         */
        public fun port(): Number

        /**
         * The protocol used for the port mapping.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayportmapping.html#cfn-appmesh-virtualgateway-virtualgatewayportmapping-protocol)
         */
        public fun protocol(): String

        /** A builder for [VirtualGatewayPortMappingProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param port The port used for the port mapping. Specify one protocol. */
            public fun port(port: Number)

            /** @param protocol The protocol used for the port mapping. */
            public fun protocol(protocol: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayPortMappingProperty.Builder =
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway
                    .VirtualGatewayPortMappingProperty
                    .builder()

            /** @param port The port used for the port mapping. Specify one protocol. */
            override fun port(port: Number) {
                cdkBuilder.port(port)
            }

            /** @param protocol The protocol used for the port mapping. */
            override fun protocol(protocol: String) {
                cdkBuilder.protocol(protocol)
            }

            public fun build():
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayPortMappingProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayPortMappingProperty,
        ) : VirtualGatewayPortMappingProperty {
            /**
             * The port used for the port mapping.
             *
             * Specify one protocol.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayportmapping.html#cfn-appmesh-virtualgateway-virtualgatewayportmapping-port)
             */
            override fun port(): Number = unwrap(this).getPort()

            /**
             * The protocol used for the port mapping.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayportmapping.html#cfn-appmesh-virtualgateway-virtualgatewayportmapping-protocol)
             */
            override fun protocol(): String = unwrap(this).getProtocol()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): VirtualGatewayPortMappingProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayPortMappingProperty
            ): VirtualGatewayPortMappingProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: VirtualGatewayPortMappingProperty
            ): software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayPortMappingProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface VirtualGatewayGrpcConnectionPoolProperty {
        /**
         * Maximum number of inflight requests Envoy can concurrently support across hosts in
         * upstream cluster.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaygrpcconnectionpool.html#cfn-appmesh-virtualgateway-virtualgatewaygrpcconnectionpool-maxrequests)
         */
        public fun maxRequests(): Number

        /** A builder for [VirtualGatewayGrpcConnectionPoolProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param maxRequests Maximum number of inflight requests Envoy can concurrently support
             *   across hosts in upstream cluster.
             */
            public fun maxRequests(maxRequests: Number)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayGrpcConnectionPoolProperty.Builder =
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway
                    .VirtualGatewayGrpcConnectionPoolProperty
                    .builder()

            /**
             * @param maxRequests Maximum number of inflight requests Envoy can concurrently support
             *   across hosts in upstream cluster.
             */
            override fun maxRequests(maxRequests: Number) {
                cdkBuilder.maxRequests(maxRequests)
            }

            public fun build():
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayGrpcConnectionPoolProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayGrpcConnectionPoolProperty,
        ) : VirtualGatewayGrpcConnectionPoolProperty {
            /**
             * Maximum number of inflight requests Envoy can concurrently support across hosts in
             * upstream cluster.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaygrpcconnectionpool.html#cfn-appmesh-virtualgateway-virtualgatewaygrpcconnectionpool-maxrequests)
             */
            override fun maxRequests(): Number = unwrap(this).getMaxRequests()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): VirtualGatewayGrpcConnectionPoolProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayGrpcConnectionPoolProperty
            ): VirtualGatewayGrpcConnectionPoolProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: VirtualGatewayGrpcConnectionPoolProperty
            ): software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayGrpcConnectionPoolProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface VirtualGatewayClientPolicyTlsProperty {
        /**
         * A reference to an object that represents a virtual gateway's client's Transport Layer
         * Security (TLS) certificate.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayclientpolicytls.html#cfn-appmesh-virtualgateway-virtualgatewayclientpolicytls-certificate)
         */
        public fun certificate(): Any? = unwrap(this).getCertificate()

        /**
         * Whether the policy is enforced.
         *
         * The default is `True` , if a value isn't specified.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayclientpolicytls.html#cfn-appmesh-virtualgateway-virtualgatewayclientpolicytls-enforce)
         */
        public fun enforce(): Any? = unwrap(this).getEnforce()

        /**
         * One or more ports that the policy is enforced for.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayclientpolicytls.html#cfn-appmesh-virtualgateway-virtualgatewayclientpolicytls-ports)
         */
        public fun ports(): Any? = unwrap(this).getPorts()

        /**
         * A reference to an object that represents a Transport Layer Security (TLS) validation
         * context.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayclientpolicytls.html#cfn-appmesh-virtualgateway-virtualgatewayclientpolicytls-validation)
         */
        public fun validation(): Any

        /** A builder for [VirtualGatewayClientPolicyTlsProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param certificate A reference to an object that represents a virtual gateway's
             *   client's Transport Layer Security (TLS) certificate.
             */
            public fun certificate(certificate: IResolvable)

            /**
             * @param certificate A reference to an object that represents a virtual gateway's
             *   client's Transport Layer Security (TLS) certificate.
             */
            public fun certificate(certificate: VirtualGatewayClientTlsCertificateProperty)

            /**
             * @param certificate A reference to an object that represents a virtual gateway's
             *   client's Transport Layer Security (TLS) certificate.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("9d120604ee5d384b9e8738c9093a173c24626571e32d3c7dc3b55eb74631d86e")
            public fun certificate(
                certificate: VirtualGatewayClientTlsCertificateProperty.Builder.() -> Unit
            )

            /**
             * @param enforce Whether the policy is enforced. The default is `True` , if a value
             *   isn't specified.
             */
            public fun enforce(enforce: Boolean)

            /**
             * @param enforce Whether the policy is enforced. The default is `True` , if a value
             *   isn't specified.
             */
            public fun enforce(enforce: IResolvable)

            /** @param ports One or more ports that the policy is enforced for. */
            public fun ports(ports: IResolvable)

            /** @param ports One or more ports that the policy is enforced for. */
            public fun ports(ports: List<Number>)

            /** @param ports One or more ports that the policy is enforced for. */
            public fun ports(vararg ports: Number)

            /**
             * @param validation A reference to an object that represents a Transport Layer Security
             *   (TLS) validation context.
             */
            public fun validation(validation: IResolvable)

            /**
             * @param validation A reference to an object that represents a Transport Layer Security
             *   (TLS) validation context.
             */
            public fun validation(validation: VirtualGatewayTlsValidationContextProperty)

            /**
             * @param validation A reference to an object that represents a Transport Layer Security
             *   (TLS) validation context.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("1eb2e0a02d82d061ee3111c6eb4c399e8eae838b0aef535fa010973ed97daacc")
            public fun validation(
                validation: VirtualGatewayTlsValidationContextProperty.Builder.() -> Unit
            )
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayClientPolicyTlsProperty.Builder =
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway
                    .VirtualGatewayClientPolicyTlsProperty
                    .builder()

            /**
             * @param certificate A reference to an object that represents a virtual gateway's
             *   client's Transport Layer Security (TLS) certificate.
             */
            override fun certificate(certificate: IResolvable) {
                cdkBuilder.certificate(certificate.let(IResolvable::unwrap))
            }

            /**
             * @param certificate A reference to an object that represents a virtual gateway's
             *   client's Transport Layer Security (TLS) certificate.
             */
            override fun certificate(certificate: VirtualGatewayClientTlsCertificateProperty) {
                cdkBuilder.certificate(
                    certificate.let(VirtualGatewayClientTlsCertificateProperty::unwrap)
                )
            }

            /**
             * @param certificate A reference to an object that represents a virtual gateway's
             *   client's Transport Layer Security (TLS) certificate.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("9d120604ee5d384b9e8738c9093a173c24626571e32d3c7dc3b55eb74631d86e")
            override fun certificate(
                certificate: VirtualGatewayClientTlsCertificateProperty.Builder.() -> Unit
            ): Unit = certificate(VirtualGatewayClientTlsCertificateProperty(certificate))

            /**
             * @param enforce Whether the policy is enforced. The default is `True` , if a value
             *   isn't specified.
             */
            override fun enforce(enforce: Boolean) {
                cdkBuilder.enforce(enforce)
            }

            /**
             * @param enforce Whether the policy is enforced. The default is `True` , if a value
             *   isn't specified.
             */
            override fun enforce(enforce: IResolvable) {
                cdkBuilder.enforce(enforce.let(IResolvable::unwrap))
            }

            /** @param ports One or more ports that the policy is enforced for. */
            override fun ports(ports: IResolvable) {
                cdkBuilder.ports(ports.let(IResolvable::unwrap))
            }

            /** @param ports One or more ports that the policy is enforced for. */
            override fun ports(ports: List<Number>) {
                cdkBuilder.ports(ports)
            }

            /** @param ports One or more ports that the policy is enforced for. */
            override fun ports(vararg ports: Number): Unit = ports(ports.toList())

            /**
             * @param validation A reference to an object that represents a Transport Layer Security
             *   (TLS) validation context.
             */
            override fun validation(validation: IResolvable) {
                cdkBuilder.validation(validation.let(IResolvable::unwrap))
            }

            /**
             * @param validation A reference to an object that represents a Transport Layer Security
             *   (TLS) validation context.
             */
            override fun validation(validation: VirtualGatewayTlsValidationContextProperty) {
                cdkBuilder.validation(
                    validation.let(VirtualGatewayTlsValidationContextProperty::unwrap)
                )
            }

            /**
             * @param validation A reference to an object that represents a Transport Layer Security
             *   (TLS) validation context.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("1eb2e0a02d82d061ee3111c6eb4c399e8eae838b0aef535fa010973ed97daacc")
            override fun validation(
                validation: VirtualGatewayTlsValidationContextProperty.Builder.() -> Unit
            ): Unit = validation(VirtualGatewayTlsValidationContextProperty(validation))

            public fun build():
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayClientPolicyTlsProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayClientPolicyTlsProperty,
        ) : VirtualGatewayClientPolicyTlsProperty {
            /**
             * A reference to an object that represents a virtual gateway's client's Transport Layer
             * Security (TLS) certificate.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayclientpolicytls.html#cfn-appmesh-virtualgateway-virtualgatewayclientpolicytls-certificate)
             */
            override fun certificate(): Any? = unwrap(this).getCertificate()

            /**
             * Whether the policy is enforced.
             *
             * The default is `True` , if a value isn't specified.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayclientpolicytls.html#cfn-appmesh-virtualgateway-virtualgatewayclientpolicytls-enforce)
             */
            override fun enforce(): Any? = unwrap(this).getEnforce()

            /**
             * One or more ports that the policy is enforced for.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayclientpolicytls.html#cfn-appmesh-virtualgateway-virtualgatewayclientpolicytls-ports)
             */
            override fun ports(): Any? = unwrap(this).getPorts()

            /**
             * A reference to an object that represents a Transport Layer Security (TLS) validation
             * context.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayclientpolicytls.html#cfn-appmesh-virtualgateway-virtualgatewayclientpolicytls-validation)
             */
            override fun validation(): Any = unwrap(this).getValidation()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): VirtualGatewayClientPolicyTlsProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayClientPolicyTlsProperty
            ): VirtualGatewayClientPolicyTlsProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: VirtualGatewayClientPolicyTlsProperty
            ): software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayClientPolicyTlsProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface VirtualGatewayLoggingProperty {
        /**
         * The access log configuration.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaylogging.html#cfn-appmesh-virtualgateway-virtualgatewaylogging-accesslog)
         */
        public fun accessLog(): Any? = unwrap(this).getAccessLog()

        /** A builder for [VirtualGatewayLoggingProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param accessLog The access log configuration. */
            public fun accessLog(accessLog: IResolvable)

            /** @param accessLog The access log configuration. */
            public fun accessLog(accessLog: VirtualGatewayAccessLogProperty)

            /** @param accessLog The access log configuration. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("d556fd726fd3953f33b7516a900555f84c031a98b200a68c6567b23bcc5e8a2b")
            public fun accessLog(accessLog: VirtualGatewayAccessLogProperty.Builder.() -> Unit)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayLoggingProperty.Builder =
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway
                    .VirtualGatewayLoggingProperty
                    .builder()

            /** @param accessLog The access log configuration. */
            override fun accessLog(accessLog: IResolvable) {
                cdkBuilder.accessLog(accessLog.let(IResolvable::unwrap))
            }

            /** @param accessLog The access log configuration. */
            override fun accessLog(accessLog: VirtualGatewayAccessLogProperty) {
                cdkBuilder.accessLog(accessLog.let(VirtualGatewayAccessLogProperty::unwrap))
            }

            /** @param accessLog The access log configuration. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("d556fd726fd3953f33b7516a900555f84c031a98b200a68c6567b23bcc5e8a2b")
            override fun accessLog(
                accessLog: VirtualGatewayAccessLogProperty.Builder.() -> Unit
            ): Unit = accessLog(VirtualGatewayAccessLogProperty(accessLog))

            public fun build():
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayLoggingProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayLoggingProperty,
        ) : VirtualGatewayLoggingProperty {
            /**
             * The access log configuration.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaylogging.html#cfn-appmesh-virtualgateway-virtualgatewaylogging-accesslog)
             */
            override fun accessLog(): Any? = unwrap(this).getAccessLog()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): VirtualGatewayLoggingProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayLoggingProperty
            ): VirtualGatewayLoggingProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: VirtualGatewayLoggingProperty
            ): software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayLoggingProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface JsonFormatRefProperty {
        /**
         * The specified key for the JSON.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-jsonformatref.html#cfn-appmesh-virtualgateway-jsonformatref-key)
         */
        public fun key(): String

        /**
         * The specified value for the JSON.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-jsonformatref.html#cfn-appmesh-virtualgateway-jsonformatref-value)
         */
        public fun `value`(): String

        /** A builder for [JsonFormatRefProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param key The specified key for the JSON. */
            public fun key(key: String)

            /** @param value The specified value for the JSON. */
            public fun `value`(`value`: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.JsonFormatRefProperty.Builder =
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.JsonFormatRefProperty
                    .builder()

            /** @param key The specified key for the JSON. */
            override fun key(key: String) {
                cdkBuilder.key(key)
            }

            /** @param value The specified value for the JSON. */
            override fun `value`(`value`: String) {
                cdkBuilder.`value`(`value`)
            }

            public fun build():
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.JsonFormatRefProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.JsonFormatRefProperty,
        ) : JsonFormatRefProperty {
            /**
             * The specified key for the JSON.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-jsonformatref.html#cfn-appmesh-virtualgateway-jsonformatref-key)
             */
            override fun key(): String = unwrap(this).getKey()

            /**
             * The specified value for the JSON.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-jsonformatref.html#cfn-appmesh-virtualgateway-jsonformatref-value)
             */
            override fun `value`(): String = unwrap(this).getValue()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): JsonFormatRefProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.appmesh.CfnVirtualGateway.JsonFormatRefProperty
            ): JsonFormatRefProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: JsonFormatRefProperty
            ): software.amazon.awscdk.services.appmesh.CfnVirtualGateway.JsonFormatRefProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface VirtualGatewayHttp2ConnectionPoolProperty {
        /**
         * Maximum number of inflight requests Envoy can concurrently support across hosts in
         * upstream cluster.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayhttp2connectionpool.html#cfn-appmesh-virtualgateway-virtualgatewayhttp2connectionpool-maxrequests)
         */
        public fun maxRequests(): Number

        /** A builder for [VirtualGatewayHttp2ConnectionPoolProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param maxRequests Maximum number of inflight requests Envoy can concurrently support
             *   across hosts in upstream cluster.
             */
            public fun maxRequests(maxRequests: Number)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayHttp2ConnectionPoolProperty.Builder =
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway
                    .VirtualGatewayHttp2ConnectionPoolProperty
                    .builder()

            /**
             * @param maxRequests Maximum number of inflight requests Envoy can concurrently support
             *   across hosts in upstream cluster.
             */
            override fun maxRequests(maxRequests: Number) {
                cdkBuilder.maxRequests(maxRequests)
            }

            public fun build():
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayHttp2ConnectionPoolProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayHttp2ConnectionPoolProperty,
        ) : VirtualGatewayHttp2ConnectionPoolProperty {
            /**
             * Maximum number of inflight requests Envoy can concurrently support across hosts in
             * upstream cluster.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayhttp2connectionpool.html#cfn-appmesh-virtualgateway-virtualgatewayhttp2connectionpool-maxrequests)
             */
            override fun maxRequests(): Number = unwrap(this).getMaxRequests()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): VirtualGatewayHttp2ConnectionPoolProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayHttp2ConnectionPoolProperty
            ): VirtualGatewayHttp2ConnectionPoolProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: VirtualGatewayHttp2ConnectionPoolProperty
            ): software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayHttp2ConnectionPoolProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface VirtualGatewayClientPolicyProperty {
        /**
         * A reference to an object that represents a Transport Layer Security (TLS) client policy.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayclientpolicy.html#cfn-appmesh-virtualgateway-virtualgatewayclientpolicy-tls)
         */
        public fun tls(): Any? = unwrap(this).getTls()

        /** A builder for [VirtualGatewayClientPolicyProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param tls A reference to an object that represents a Transport Layer Security (TLS)
             *   client policy.
             */
            public fun tls(tls: IResolvable)

            /**
             * @param tls A reference to an object that represents a Transport Layer Security (TLS)
             *   client policy.
             */
            public fun tls(tls: VirtualGatewayClientPolicyTlsProperty)

            /**
             * @param tls A reference to an object that represents a Transport Layer Security (TLS)
             *   client policy.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("a90df689980811315d993811a1c8a499a4caddedf7d36096cf2b83ab791594d2")
            public fun tls(tls: VirtualGatewayClientPolicyTlsProperty.Builder.() -> Unit)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayClientPolicyProperty.Builder =
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway
                    .VirtualGatewayClientPolicyProperty
                    .builder()

            /**
             * @param tls A reference to an object that represents a Transport Layer Security (TLS)
             *   client policy.
             */
            override fun tls(tls: IResolvable) {
                cdkBuilder.tls(tls.let(IResolvable::unwrap))
            }

            /**
             * @param tls A reference to an object that represents a Transport Layer Security (TLS)
             *   client policy.
             */
            override fun tls(tls: VirtualGatewayClientPolicyTlsProperty) {
                cdkBuilder.tls(tls.let(VirtualGatewayClientPolicyTlsProperty::unwrap))
            }

            /**
             * @param tls A reference to an object that represents a Transport Layer Security (TLS)
             *   client policy.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("a90df689980811315d993811a1c8a499a4caddedf7d36096cf2b83ab791594d2")
            override fun tls(tls: VirtualGatewayClientPolicyTlsProperty.Builder.() -> Unit): Unit =
                tls(VirtualGatewayClientPolicyTlsProperty(tls))

            public fun build():
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayClientPolicyProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayClientPolicyProperty,
        ) : VirtualGatewayClientPolicyProperty {
            /**
             * A reference to an object that represents a Transport Layer Security (TLS) client
             * policy.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayclientpolicy.html#cfn-appmesh-virtualgateway-virtualgatewayclientpolicy-tls)
             */
            override fun tls(): Any? = unwrap(this).getTls()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): VirtualGatewayClientPolicyProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayClientPolicyProperty
            ): VirtualGatewayClientPolicyProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: VirtualGatewayClientPolicyProperty
            ): software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayClientPolicyProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface SubjectAlternativeNameMatchersProperty {
        /**
         * The values sent must match the specified values exactly.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-subjectalternativenamematchers.html#cfn-appmesh-virtualgateway-subjectalternativenamematchers-exact)
         */
        public fun exact(): List<String> = unwrap(this).getExact() ?: emptyList()

        /** A builder for [SubjectAlternativeNameMatchersProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param exact The values sent must match the specified values exactly. */
            public fun exact(exact: List<String>)

            /** @param exact The values sent must match the specified values exactly. */
            public fun exact(vararg exact: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.SubjectAlternativeNameMatchersProperty.Builder =
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway
                    .SubjectAlternativeNameMatchersProperty
                    .builder()

            /** @param exact The values sent must match the specified values exactly. */
            override fun exact(exact: List<String>) {
                cdkBuilder.exact(exact)
            }

            /** @param exact The values sent must match the specified values exactly. */
            override fun exact(vararg exact: String): Unit = exact(exact.toList())

            public fun build():
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.SubjectAlternativeNameMatchersProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.SubjectAlternativeNameMatchersProperty,
        ) : SubjectAlternativeNameMatchersProperty {
            /**
             * The values sent must match the specified values exactly.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-subjectalternativenamematchers.html#cfn-appmesh-virtualgateway-subjectalternativenamematchers-exact)
             */
            override fun exact(): List<String> = unwrap(this).getExact() ?: emptyList()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): SubjectAlternativeNameMatchersProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.appmesh.CfnVirtualGateway.SubjectAlternativeNameMatchersProperty
            ): SubjectAlternativeNameMatchersProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: SubjectAlternativeNameMatchersProperty
            ): software.amazon.awscdk.services.appmesh.CfnVirtualGateway.SubjectAlternativeNameMatchersProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface VirtualGatewayConnectionPoolProperty {
        /**
         * An object that represents a type of connection pool.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayconnectionpool.html#cfn-appmesh-virtualgateway-virtualgatewayconnectionpool-grpc)
         */
        public fun grpc(): Any? = unwrap(this).getGrpc()

        /**
         * An object that represents a type of connection pool.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayconnectionpool.html#cfn-appmesh-virtualgateway-virtualgatewayconnectionpool-http)
         */
        public fun http(): Any? = unwrap(this).getHttp()

        /**
         * An object that represents a type of connection pool.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayconnectionpool.html#cfn-appmesh-virtualgateway-virtualgatewayconnectionpool-http2)
         */
        public fun http2(): Any? = unwrap(this).getHttp2()

        /** A builder for [VirtualGatewayConnectionPoolProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param grpc An object that represents a type of connection pool. */
            public fun grpc(grpc: IResolvable)

            /** @param grpc An object that represents a type of connection pool. */
            public fun grpc(grpc: VirtualGatewayGrpcConnectionPoolProperty)

            /** @param grpc An object that represents a type of connection pool. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("a25f48a5ee10f30339abbee65b6c6e07b9f1f003e8da5e78cb6c4c6d327a91b5")
            public fun grpc(grpc: VirtualGatewayGrpcConnectionPoolProperty.Builder.() -> Unit)

            /** @param http An object that represents a type of connection pool. */
            public fun http(http: IResolvable)

            /** @param http An object that represents a type of connection pool. */
            public fun http(http: VirtualGatewayHttpConnectionPoolProperty)

            /** @param http An object that represents a type of connection pool. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("5c70cd067c2e83ae385dfcd845e6cb49427e9df5d911a20d6365bad3f5341667")
            public fun http(http: VirtualGatewayHttpConnectionPoolProperty.Builder.() -> Unit)

            /** @param http2 An object that represents a type of connection pool. */
            public fun http2(http2: IResolvable)

            /** @param http2 An object that represents a type of connection pool. */
            public fun http2(http2: VirtualGatewayHttp2ConnectionPoolProperty)

            /** @param http2 An object that represents a type of connection pool. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("f65d3e5bc347b419e2c7219eb4760135c7cee1a447515c55cf6d2fec7e51724d")
            public fun http2(http2: VirtualGatewayHttp2ConnectionPoolProperty.Builder.() -> Unit)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayConnectionPoolProperty.Builder =
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway
                    .VirtualGatewayConnectionPoolProperty
                    .builder()

            /** @param grpc An object that represents a type of connection pool. */
            override fun grpc(grpc: IResolvable) {
                cdkBuilder.grpc(grpc.let(IResolvable::unwrap))
            }

            /** @param grpc An object that represents a type of connection pool. */
            override fun grpc(grpc: VirtualGatewayGrpcConnectionPoolProperty) {
                cdkBuilder.grpc(grpc.let(VirtualGatewayGrpcConnectionPoolProperty::unwrap))
            }

            /** @param grpc An object that represents a type of connection pool. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("a25f48a5ee10f30339abbee65b6c6e07b9f1f003e8da5e78cb6c4c6d327a91b5")
            override fun grpc(
                grpc: VirtualGatewayGrpcConnectionPoolProperty.Builder.() -> Unit
            ): Unit = grpc(VirtualGatewayGrpcConnectionPoolProperty(grpc))

            /** @param http An object that represents a type of connection pool. */
            override fun http(http: IResolvable) {
                cdkBuilder.http(http.let(IResolvable::unwrap))
            }

            /** @param http An object that represents a type of connection pool. */
            override fun http(http: VirtualGatewayHttpConnectionPoolProperty) {
                cdkBuilder.http(http.let(VirtualGatewayHttpConnectionPoolProperty::unwrap))
            }

            /** @param http An object that represents a type of connection pool. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("5c70cd067c2e83ae385dfcd845e6cb49427e9df5d911a20d6365bad3f5341667")
            override fun http(
                http: VirtualGatewayHttpConnectionPoolProperty.Builder.() -> Unit
            ): Unit = http(VirtualGatewayHttpConnectionPoolProperty(http))

            /** @param http2 An object that represents a type of connection pool. */
            override fun http2(http2: IResolvable) {
                cdkBuilder.http2(http2.let(IResolvable::unwrap))
            }

            /** @param http2 An object that represents a type of connection pool. */
            override fun http2(http2: VirtualGatewayHttp2ConnectionPoolProperty) {
                cdkBuilder.http2(http2.let(VirtualGatewayHttp2ConnectionPoolProperty::unwrap))
            }

            /** @param http2 An object that represents a type of connection pool. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("f65d3e5bc347b419e2c7219eb4760135c7cee1a447515c55cf6d2fec7e51724d")
            override fun http2(
                http2: VirtualGatewayHttp2ConnectionPoolProperty.Builder.() -> Unit
            ): Unit = http2(VirtualGatewayHttp2ConnectionPoolProperty(http2))

            public fun build():
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayConnectionPoolProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayConnectionPoolProperty,
        ) : VirtualGatewayConnectionPoolProperty {
            /**
             * An object that represents a type of connection pool.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayconnectionpool.html#cfn-appmesh-virtualgateway-virtualgatewayconnectionpool-grpc)
             */
            override fun grpc(): Any? = unwrap(this).getGrpc()

            /**
             * An object that represents a type of connection pool.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayconnectionpool.html#cfn-appmesh-virtualgateway-virtualgatewayconnectionpool-http)
             */
            override fun http(): Any? = unwrap(this).getHttp()

            /**
             * An object that represents a type of connection pool.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayconnectionpool.html#cfn-appmesh-virtualgateway-virtualgatewayconnectionpool-http2)
             */
            override fun http2(): Any? = unwrap(this).getHttp2()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): VirtualGatewayConnectionPoolProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayConnectionPoolProperty
            ): VirtualGatewayConnectionPoolProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: VirtualGatewayConnectionPoolProperty
            ): software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayConnectionPoolProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface VirtualGatewayTlsValidationContextFileTrustProperty {
        /**
         * The certificate trust chain for a certificate stored on the file system of the virtual
         * node that the proxy is running on.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaytlsvalidationcontextfiletrust.html#cfn-appmesh-virtualgateway-virtualgatewaytlsvalidationcontextfiletrust-certificatechain)
         */
        public fun certificateChain(): String

        /** A builder for [VirtualGatewayTlsValidationContextFileTrustProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param certificateChain The certificate trust chain for a certificate stored on the
             *   file system of the virtual node that the proxy is running on.
             */
            public fun certificateChain(certificateChain: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextFileTrustProperty.Builder =
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway
                    .VirtualGatewayTlsValidationContextFileTrustProperty
                    .builder()

            /**
             * @param certificateChain The certificate trust chain for a certificate stored on the
             *   file system of the virtual node that the proxy is running on.
             */
            override fun certificateChain(certificateChain: String) {
                cdkBuilder.certificateChain(certificateChain)
            }

            public fun build():
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextFileTrustProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextFileTrustProperty,
        ) : VirtualGatewayTlsValidationContextFileTrustProperty {
            /**
             * The certificate trust chain for a certificate stored on the file system of the
             * virtual node that the proxy is running on.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaytlsvalidationcontextfiletrust.html#cfn-appmesh-virtualgateway-virtualgatewaytlsvalidationcontextfiletrust-certificatechain)
             */
            override fun certificateChain(): String = unwrap(this).getCertificateChain()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): VirtualGatewayTlsValidationContextFileTrustProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextFileTrustProperty
            ): VirtualGatewayTlsValidationContextFileTrustProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: VirtualGatewayTlsValidationContextFileTrustProperty
            ): software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextFileTrustProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface VirtualGatewayListenerTlsValidationContextTrustProperty {
        /**
         * An object that represents a Transport Layer Security (TLS) validation context trust for a
         * local file.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaylistenertlsvalidationcontexttrust.html#cfn-appmesh-virtualgateway-virtualgatewaylistenertlsvalidationcontexttrust-file)
         */
        public fun `file`(): Any? = unwrap(this).getFile()

        /**
         * A reference to an object that represents a virtual gateway's listener's Transport Layer
         * Security (TLS) Secret Discovery Service validation context trust.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaylistenertlsvalidationcontexttrust.html#cfn-appmesh-virtualgateway-virtualgatewaylistenertlsvalidationcontexttrust-sds)
         */
        public fun sds(): Any? = unwrap(this).getSds()

        /** A builder for [VirtualGatewayListenerTlsValidationContextTrustProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param file An object that represents a Transport Layer Security (TLS) validation
             *   context trust for a local file.
             */
            public fun `file`(`file`: IResolvable)

            /**
             * @param file An object that represents a Transport Layer Security (TLS) validation
             *   context trust for a local file.
             */
            public fun `file`(`file`: VirtualGatewayTlsValidationContextFileTrustProperty)

            /**
             * @param file An object that represents a Transport Layer Security (TLS) validation
             *   context trust for a local file.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("b4de2ecb488740d08277bc1fa4e871749734532dcb1227e56489e327a130b12a")
            public fun `file`(
                `file`: VirtualGatewayTlsValidationContextFileTrustProperty.Builder.() -> Unit
            )

            /**
             * @param sds A reference to an object that represents a virtual gateway's listener's
             *   Transport Layer Security (TLS) Secret Discovery Service validation context trust.
             */
            public fun sds(sds: IResolvable)

            /**
             * @param sds A reference to an object that represents a virtual gateway's listener's
             *   Transport Layer Security (TLS) Secret Discovery Service validation context trust.
             */
            public fun sds(sds: VirtualGatewayTlsValidationContextSdsTrustProperty)

            /**
             * @param sds A reference to an object that represents a virtual gateway's listener's
             *   Transport Layer Security (TLS) Secret Discovery Service validation context trust.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("4f1cfe943aebbb2e614f42b76e13c96552308637e185c7db165b6bb01900f2a4")
            public fun sds(
                sds: VirtualGatewayTlsValidationContextSdsTrustProperty.Builder.() -> Unit
            )
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsValidationContextTrustProperty.Builder =
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway
                    .VirtualGatewayListenerTlsValidationContextTrustProperty
                    .builder()

            /**
             * @param file An object that represents a Transport Layer Security (TLS) validation
             *   context trust for a local file.
             */
            override fun `file`(`file`: IResolvable) {
                cdkBuilder.`file`(`file`.let(IResolvable::unwrap))
            }

            /**
             * @param file An object that represents a Transport Layer Security (TLS) validation
             *   context trust for a local file.
             */
            override fun `file`(`file`: VirtualGatewayTlsValidationContextFileTrustProperty) {
                cdkBuilder.`file`(
                    `file`.let(VirtualGatewayTlsValidationContextFileTrustProperty::unwrap)
                )
            }

            /**
             * @param file An object that represents a Transport Layer Security (TLS) validation
             *   context trust for a local file.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("b4de2ecb488740d08277bc1fa4e871749734532dcb1227e56489e327a130b12a")
            override fun `file`(
                `file`: VirtualGatewayTlsValidationContextFileTrustProperty.Builder.() -> Unit
            ): Unit = `file`(VirtualGatewayTlsValidationContextFileTrustProperty(`file`))

            /**
             * @param sds A reference to an object that represents a virtual gateway's listener's
             *   Transport Layer Security (TLS) Secret Discovery Service validation context trust.
             */
            override fun sds(sds: IResolvable) {
                cdkBuilder.sds(sds.let(IResolvable::unwrap))
            }

            /**
             * @param sds A reference to an object that represents a virtual gateway's listener's
             *   Transport Layer Security (TLS) Secret Discovery Service validation context trust.
             */
            override fun sds(sds: VirtualGatewayTlsValidationContextSdsTrustProperty) {
                cdkBuilder.sds(sds.let(VirtualGatewayTlsValidationContextSdsTrustProperty::unwrap))
            }

            /**
             * @param sds A reference to an object that represents a virtual gateway's listener's
             *   Transport Layer Security (TLS) Secret Discovery Service validation context trust.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("4f1cfe943aebbb2e614f42b76e13c96552308637e185c7db165b6bb01900f2a4")
            override fun sds(
                sds: VirtualGatewayTlsValidationContextSdsTrustProperty.Builder.() -> Unit
            ): Unit = sds(VirtualGatewayTlsValidationContextSdsTrustProperty(sds))

            public fun build():
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsValidationContextTrustProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsValidationContextTrustProperty,
        ) : VirtualGatewayListenerTlsValidationContextTrustProperty {
            /**
             * An object that represents a Transport Layer Security (TLS) validation context trust
             * for a local file.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaylistenertlsvalidationcontexttrust.html#cfn-appmesh-virtualgateway-virtualgatewaylistenertlsvalidationcontexttrust-file)
             */
            override fun `file`(): Any? = unwrap(this).getFile()

            /**
             * A reference to an object that represents a virtual gateway's listener's Transport
             * Layer Security (TLS) Secret Discovery Service validation context trust.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaylistenertlsvalidationcontexttrust.html#cfn-appmesh-virtualgateway-virtualgatewaylistenertlsvalidationcontexttrust-sds)
             */
            override fun sds(): Any? = unwrap(this).getSds()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): VirtualGatewayListenerTlsValidationContextTrustProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsValidationContextTrustProperty
            ): VirtualGatewayListenerTlsValidationContextTrustProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: VirtualGatewayListenerTlsValidationContextTrustProperty
            ): software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsValidationContextTrustProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface SubjectAlternativeNamesProperty {
        /**
         * An object that represents the criteria for determining a SANs match.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-subjectalternativenames.html#cfn-appmesh-virtualgateway-subjectalternativenames-match)
         */
        public fun match(): Any

        /** A builder for [SubjectAlternativeNamesProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param match An object that represents the criteria for determining a SANs match. */
            public fun match(match: IResolvable)

            /** @param match An object that represents the criteria for determining a SANs match. */
            public fun match(match: SubjectAlternativeNameMatchersProperty)

            /** @param match An object that represents the criteria for determining a SANs match. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("e2c5ca1739420154623a0d64dc8ce13e81856585fdf6194b0f04e7299c9efc05")
            public fun match(match: SubjectAlternativeNameMatchersProperty.Builder.() -> Unit)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.SubjectAlternativeNamesProperty.Builder =
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway
                    .SubjectAlternativeNamesProperty
                    .builder()

            /** @param match An object that represents the criteria for determining a SANs match. */
            override fun match(match: IResolvable) {
                cdkBuilder.match(match.let(IResolvable::unwrap))
            }

            /** @param match An object that represents the criteria for determining a SANs match. */
            override fun match(match: SubjectAlternativeNameMatchersProperty) {
                cdkBuilder.match(match.let(SubjectAlternativeNameMatchersProperty::unwrap))
            }

            /** @param match An object that represents the criteria for determining a SANs match. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("e2c5ca1739420154623a0d64dc8ce13e81856585fdf6194b0f04e7299c9efc05")
            override fun match(
                match: SubjectAlternativeNameMatchersProperty.Builder.() -> Unit
            ): Unit = match(SubjectAlternativeNameMatchersProperty(match))

            public fun build():
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.SubjectAlternativeNamesProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.SubjectAlternativeNamesProperty,
        ) : SubjectAlternativeNamesProperty {
            /**
             * An object that represents the criteria for determining a SANs match.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-subjectalternativenames.html#cfn-appmesh-virtualgateway-subjectalternativenames-match)
             */
            override fun match(): Any = unwrap(this).getMatch()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): SubjectAlternativeNamesProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.appmesh.CfnVirtualGateway.SubjectAlternativeNamesProperty
            ): SubjectAlternativeNamesProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: SubjectAlternativeNamesProperty
            ): software.amazon.awscdk.services.appmesh.CfnVirtualGateway.SubjectAlternativeNamesProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface VirtualGatewayListenerTlsProperty {
        /**
         * An object that represents a Transport Layer Security (TLS) certificate.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaylistenertls.html#cfn-appmesh-virtualgateway-virtualgatewaylistenertls-certificate)
         */
        public fun certificate(): Any

        /**
         * Specify one of the following modes.
         * * ** STRICT – Listener only accepts connections with TLS enabled.
         * * ** PERMISSIVE – Listener accepts connections with or without TLS enabled.
         * * ** DISABLED – Listener only accepts connections without TLS.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaylistenertls.html#cfn-appmesh-virtualgateway-virtualgatewaylistenertls-mode)
         */
        public fun mode(): String

        /**
         * A reference to an object that represents a virtual gateway's listener's Transport Layer
         * Security (TLS) validation context.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaylistenertls.html#cfn-appmesh-virtualgateway-virtualgatewaylistenertls-validation)
         */
        public fun validation(): Any? = unwrap(this).getValidation()

        /** A builder for [VirtualGatewayListenerTlsProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param certificate An object that represents a Transport Layer Security (TLS)
             *   certificate.
             */
            public fun certificate(certificate: IResolvable)

            /**
             * @param certificate An object that represents a Transport Layer Security (TLS)
             *   certificate.
             */
            public fun certificate(certificate: VirtualGatewayListenerTlsCertificateProperty)

            /**
             * @param certificate An object that represents a Transport Layer Security (TLS)
             *   certificate.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("f22287334a0f1622f27c197f3d7fc9f6db3366876f9d04e39a24753b4a9c965c")
            public fun certificate(
                certificate: VirtualGatewayListenerTlsCertificateProperty.Builder.() -> Unit
            )

            /**
             * @param mode Specify one of the following modes.
             * * ** STRICT – Listener only accepts connections with TLS enabled.
             * * ** PERMISSIVE – Listener accepts connections with or without TLS enabled.
             * * ** DISABLED – Listener only accepts connections without TLS.
             */
            public fun mode(mode: String)

            /**
             * @param validation A reference to an object that represents a virtual gateway's
             *   listener's Transport Layer Security (TLS) validation context.
             */
            public fun validation(validation: IResolvable)

            /**
             * @param validation A reference to an object that represents a virtual gateway's
             *   listener's Transport Layer Security (TLS) validation context.
             */
            public fun validation(validation: VirtualGatewayListenerTlsValidationContextProperty)

            /**
             * @param validation A reference to an object that represents a virtual gateway's
             *   listener's Transport Layer Security (TLS) validation context.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("49804e56c344e5028b80553eeac2c64d3adb322daa597e1e029053463ab8bef4")
            public fun validation(
                validation: VirtualGatewayListenerTlsValidationContextProperty.Builder.() -> Unit
            )
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsProperty.Builder =
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway
                    .VirtualGatewayListenerTlsProperty
                    .builder()

            /**
             * @param certificate An object that represents a Transport Layer Security (TLS)
             *   certificate.
             */
            override fun certificate(certificate: IResolvable) {
                cdkBuilder.certificate(certificate.let(IResolvable::unwrap))
            }

            /**
             * @param certificate An object that represents a Transport Layer Security (TLS)
             *   certificate.
             */
            override fun certificate(certificate: VirtualGatewayListenerTlsCertificateProperty) {
                cdkBuilder.certificate(
                    certificate.let(VirtualGatewayListenerTlsCertificateProperty::unwrap)
                )
            }

            /**
             * @param certificate An object that represents a Transport Layer Security (TLS)
             *   certificate.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("f22287334a0f1622f27c197f3d7fc9f6db3366876f9d04e39a24753b4a9c965c")
            override fun certificate(
                certificate: VirtualGatewayListenerTlsCertificateProperty.Builder.() -> Unit
            ): Unit = certificate(VirtualGatewayListenerTlsCertificateProperty(certificate))

            /**
             * @param mode Specify one of the following modes.
             * * ** STRICT – Listener only accepts connections with TLS enabled.
             * * ** PERMISSIVE – Listener accepts connections with or without TLS enabled.
             * * ** DISABLED – Listener only accepts connections without TLS.
             */
            override fun mode(mode: String) {
                cdkBuilder.mode(mode)
            }

            /**
             * @param validation A reference to an object that represents a virtual gateway's
             *   listener's Transport Layer Security (TLS) validation context.
             */
            override fun validation(validation: IResolvable) {
                cdkBuilder.validation(validation.let(IResolvable::unwrap))
            }

            /**
             * @param validation A reference to an object that represents a virtual gateway's
             *   listener's Transport Layer Security (TLS) validation context.
             */
            override fun validation(
                validation: VirtualGatewayListenerTlsValidationContextProperty
            ) {
                cdkBuilder.validation(
                    validation.let(VirtualGatewayListenerTlsValidationContextProperty::unwrap)
                )
            }

            /**
             * @param validation A reference to an object that represents a virtual gateway's
             *   listener's Transport Layer Security (TLS) validation context.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("49804e56c344e5028b80553eeac2c64d3adb322daa597e1e029053463ab8bef4")
            override fun validation(
                validation: VirtualGatewayListenerTlsValidationContextProperty.Builder.() -> Unit
            ): Unit = validation(VirtualGatewayListenerTlsValidationContextProperty(validation))

            public fun build():
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsProperty,
        ) : VirtualGatewayListenerTlsProperty {
            /**
             * An object that represents a Transport Layer Security (TLS) certificate.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaylistenertls.html#cfn-appmesh-virtualgateway-virtualgatewaylistenertls-certificate)
             */
            override fun certificate(): Any = unwrap(this).getCertificate()

            /**
             * Specify one of the following modes.
             * * ** STRICT – Listener only accepts connections with TLS enabled.
             * * ** PERMISSIVE – Listener accepts connections with or without TLS enabled.
             * * ** DISABLED – Listener only accepts connections without TLS.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaylistenertls.html#cfn-appmesh-virtualgateway-virtualgatewaylistenertls-mode)
             */
            override fun mode(): String = unwrap(this).getMode()

            /**
             * A reference to an object that represents a virtual gateway's listener's Transport
             * Layer Security (TLS) validation context.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaylistenertls.html#cfn-appmesh-virtualgateway-virtualgatewaylistenertls-validation)
             */
            override fun validation(): Any? = unwrap(this).getValidation()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): VirtualGatewayListenerTlsProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsProperty
            ): VirtualGatewayListenerTlsProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: VirtualGatewayListenerTlsProperty
            ): software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface VirtualGatewayClientTlsCertificateProperty {
        /**
         * An object that represents a local file certificate.
         *
         * The certificate must meet specific requirements and you must have proxy authorization
         * enabled. For more information, see
         * [Transport Layer Security (TLS)](https://docs.aws.amazon.com/app-mesh/latest/userguide/tls.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayclienttlscertificate.html#cfn-appmesh-virtualgateway-virtualgatewayclienttlscertificate-file)
         */
        public fun `file`(): Any? = unwrap(this).getFile()

        /**
         * A reference to an object that represents a virtual gateway's client's Secret Discovery
         * Service certificate.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayclienttlscertificate.html#cfn-appmesh-virtualgateway-virtualgatewayclienttlscertificate-sds)
         */
        public fun sds(): Any? = unwrap(this).getSds()

        /** A builder for [VirtualGatewayClientTlsCertificateProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param file An object that represents a local file certificate. The certificate must
             *   meet specific requirements and you must have proxy authorization enabled. For more
             *   information, see
             *   [Transport Layer Security (TLS)](https://docs.aws.amazon.com/app-mesh/latest/userguide/tls.html)
             *   .
             */
            public fun `file`(`file`: IResolvable)

            /**
             * @param file An object that represents a local file certificate. The certificate must
             *   meet specific requirements and you must have proxy authorization enabled. For more
             *   information, see
             *   [Transport Layer Security (TLS)](https://docs.aws.amazon.com/app-mesh/latest/userguide/tls.html)
             *   .
             */
            public fun `file`(`file`: VirtualGatewayListenerTlsFileCertificateProperty)

            /**
             * @param file An object that represents a local file certificate. The certificate must
             *   meet specific requirements and you must have proxy authorization enabled. For more
             *   information, see
             *   [Transport Layer Security (TLS)](https://docs.aws.amazon.com/app-mesh/latest/userguide/tls.html)
             *   .
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("5ca69fac264b48ac447be901cf3db1123d068a277af2769cd36232d3b1f2cf70")
            public fun `file`(
                `file`: VirtualGatewayListenerTlsFileCertificateProperty.Builder.() -> Unit
            )

            /**
             * @param sds A reference to an object that represents a virtual gateway's client's
             *   Secret Discovery Service certificate.
             */
            public fun sds(sds: IResolvable)

            /**
             * @param sds A reference to an object that represents a virtual gateway's client's
             *   Secret Discovery Service certificate.
             */
            public fun sds(sds: VirtualGatewayListenerTlsSdsCertificateProperty)

            /**
             * @param sds A reference to an object that represents a virtual gateway's client's
             *   Secret Discovery Service certificate.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("003675a5f0d1468a62b543a888053eef80c314e2965bdebad6ba4731b1e844fa")
            public fun sds(sds: VirtualGatewayListenerTlsSdsCertificateProperty.Builder.() -> Unit)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayClientTlsCertificateProperty.Builder =
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway
                    .VirtualGatewayClientTlsCertificateProperty
                    .builder()

            /**
             * @param file An object that represents a local file certificate. The certificate must
             *   meet specific requirements and you must have proxy authorization enabled. For more
             *   information, see
             *   [Transport Layer Security (TLS)](https://docs.aws.amazon.com/app-mesh/latest/userguide/tls.html)
             *   .
             */
            override fun `file`(`file`: IResolvable) {
                cdkBuilder.`file`(`file`.let(IResolvable::unwrap))
            }

            /**
             * @param file An object that represents a local file certificate. The certificate must
             *   meet specific requirements and you must have proxy authorization enabled. For more
             *   information, see
             *   [Transport Layer Security (TLS)](https://docs.aws.amazon.com/app-mesh/latest/userguide/tls.html)
             *   .
             */
            override fun `file`(`file`: VirtualGatewayListenerTlsFileCertificateProperty) {
                cdkBuilder.`file`(
                    `file`.let(VirtualGatewayListenerTlsFileCertificateProperty::unwrap)
                )
            }

            /**
             * @param file An object that represents a local file certificate. The certificate must
             *   meet specific requirements and you must have proxy authorization enabled. For more
             *   information, see
             *   [Transport Layer Security (TLS)](https://docs.aws.amazon.com/app-mesh/latest/userguide/tls.html)
             *   .
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("5ca69fac264b48ac447be901cf3db1123d068a277af2769cd36232d3b1f2cf70")
            override fun `file`(
                `file`: VirtualGatewayListenerTlsFileCertificateProperty.Builder.() -> Unit
            ): Unit = `file`(VirtualGatewayListenerTlsFileCertificateProperty(`file`))

            /**
             * @param sds A reference to an object that represents a virtual gateway's client's
             *   Secret Discovery Service certificate.
             */
            override fun sds(sds: IResolvable) {
                cdkBuilder.sds(sds.let(IResolvable::unwrap))
            }

            /**
             * @param sds A reference to an object that represents a virtual gateway's client's
             *   Secret Discovery Service certificate.
             */
            override fun sds(sds: VirtualGatewayListenerTlsSdsCertificateProperty) {
                cdkBuilder.sds(sds.let(VirtualGatewayListenerTlsSdsCertificateProperty::unwrap))
            }

            /**
             * @param sds A reference to an object that represents a virtual gateway's client's
             *   Secret Discovery Service certificate.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("003675a5f0d1468a62b543a888053eef80c314e2965bdebad6ba4731b1e844fa")
            override fun sds(
                sds: VirtualGatewayListenerTlsSdsCertificateProperty.Builder.() -> Unit
            ): Unit = sds(VirtualGatewayListenerTlsSdsCertificateProperty(sds))

            public fun build():
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayClientTlsCertificateProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayClientTlsCertificateProperty,
        ) : VirtualGatewayClientTlsCertificateProperty {
            /**
             * An object that represents a local file certificate.
             *
             * The certificate must meet specific requirements and you must have proxy authorization
             * enabled. For more information, see
             * [Transport Layer Security (TLS)](https://docs.aws.amazon.com/app-mesh/latest/userguide/tls.html)
             * .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayclienttlscertificate.html#cfn-appmesh-virtualgateway-virtualgatewayclienttlscertificate-file)
             */
            override fun `file`(): Any? = unwrap(this).getFile()

            /**
             * A reference to an object that represents a virtual gateway's client's Secret
             * Discovery Service certificate.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayclienttlscertificate.html#cfn-appmesh-virtualgateway-virtualgatewayclienttlscertificate-sds)
             */
            override fun sds(): Any? = unwrap(this).getSds()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): VirtualGatewayClientTlsCertificateProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayClientTlsCertificateProperty
            ): VirtualGatewayClientTlsCertificateProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: VirtualGatewayClientTlsCertificateProperty
            ): software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayClientTlsCertificateProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface VirtualGatewayTlsValidationContextProperty {
        /**
         * A reference to an object that represents the SANs for a virtual gateway's listener's
         * Transport Layer Security (TLS) validation context.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaytlsvalidationcontext.html#cfn-appmesh-virtualgateway-virtualgatewaytlsvalidationcontext-subjectalternativenames)
         */
        public fun subjectAlternativeNames(): Any? = unwrap(this).getSubjectAlternativeNames()

        /**
         * A reference to where to retrieve the trust chain when validating a peer’s Transport Layer
         * Security (TLS) certificate.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaytlsvalidationcontext.html#cfn-appmesh-virtualgateway-virtualgatewaytlsvalidationcontext-trust)
         */
        public fun trust(): Any

        /** A builder for [VirtualGatewayTlsValidationContextProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param subjectAlternativeNames A reference to an object that represents the SANs for
             *   a virtual gateway's listener's Transport Layer Security (TLS) validation context.
             */
            public fun subjectAlternativeNames(subjectAlternativeNames: IResolvable)

            /**
             * @param subjectAlternativeNames A reference to an object that represents the SANs for
             *   a virtual gateway's listener's Transport Layer Security (TLS) validation context.
             */
            public fun subjectAlternativeNames(
                subjectAlternativeNames: SubjectAlternativeNamesProperty
            )

            /**
             * @param subjectAlternativeNames A reference to an object that represents the SANs for
             *   a virtual gateway's listener's Transport Layer Security (TLS) validation context.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("edaf23f43617162815f82a930a2a301f6c99b891800fb28eaa8887babfe2ccba")
            public fun subjectAlternativeNames(
                subjectAlternativeNames: SubjectAlternativeNamesProperty.Builder.() -> Unit
            )

            /**
             * @param trust A reference to where to retrieve the trust chain when validating a
             *   peer’s Transport Layer Security (TLS) certificate.
             */
            public fun trust(trust: IResolvable)

            /**
             * @param trust A reference to where to retrieve the trust chain when validating a
             *   peer’s Transport Layer Security (TLS) certificate.
             */
            public fun trust(trust: VirtualGatewayTlsValidationContextTrustProperty)

            /**
             * @param trust A reference to where to retrieve the trust chain when validating a
             *   peer’s Transport Layer Security (TLS) certificate.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("cbcc999aee919483ce3fa632feef20067653951c342ca9eff59c026f4655f5dc")
            public fun trust(
                trust: VirtualGatewayTlsValidationContextTrustProperty.Builder.() -> Unit
            )
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextProperty.Builder =
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway
                    .VirtualGatewayTlsValidationContextProperty
                    .builder()

            /**
             * @param subjectAlternativeNames A reference to an object that represents the SANs for
             *   a virtual gateway's listener's Transport Layer Security (TLS) validation context.
             */
            override fun subjectAlternativeNames(subjectAlternativeNames: IResolvable) {
                cdkBuilder.subjectAlternativeNames(subjectAlternativeNames.let(IResolvable::unwrap))
            }

            /**
             * @param subjectAlternativeNames A reference to an object that represents the SANs for
             *   a virtual gateway's listener's Transport Layer Security (TLS) validation context.
             */
            override fun subjectAlternativeNames(
                subjectAlternativeNames: SubjectAlternativeNamesProperty
            ) {
                cdkBuilder.subjectAlternativeNames(
                    subjectAlternativeNames.let(SubjectAlternativeNamesProperty::unwrap)
                )
            }

            /**
             * @param subjectAlternativeNames A reference to an object that represents the SANs for
             *   a virtual gateway's listener's Transport Layer Security (TLS) validation context.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("edaf23f43617162815f82a930a2a301f6c99b891800fb28eaa8887babfe2ccba")
            override fun subjectAlternativeNames(
                subjectAlternativeNames: SubjectAlternativeNamesProperty.Builder.() -> Unit
            ): Unit =
                subjectAlternativeNames(SubjectAlternativeNamesProperty(subjectAlternativeNames))

            /**
             * @param trust A reference to where to retrieve the trust chain when validating a
             *   peer’s Transport Layer Security (TLS) certificate.
             */
            override fun trust(trust: IResolvable) {
                cdkBuilder.trust(trust.let(IResolvable::unwrap))
            }

            /**
             * @param trust A reference to where to retrieve the trust chain when validating a
             *   peer’s Transport Layer Security (TLS) certificate.
             */
            override fun trust(trust: VirtualGatewayTlsValidationContextTrustProperty) {
                cdkBuilder.trust(trust.let(VirtualGatewayTlsValidationContextTrustProperty::unwrap))
            }

            /**
             * @param trust A reference to where to retrieve the trust chain when validating a
             *   peer’s Transport Layer Security (TLS) certificate.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("cbcc999aee919483ce3fa632feef20067653951c342ca9eff59c026f4655f5dc")
            override fun trust(
                trust: VirtualGatewayTlsValidationContextTrustProperty.Builder.() -> Unit
            ): Unit = trust(VirtualGatewayTlsValidationContextTrustProperty(trust))

            public fun build():
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextProperty,
        ) : VirtualGatewayTlsValidationContextProperty {
            /**
             * A reference to an object that represents the SANs for a virtual gateway's listener's
             * Transport Layer Security (TLS) validation context.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaytlsvalidationcontext.html#cfn-appmesh-virtualgateway-virtualgatewaytlsvalidationcontext-subjectalternativenames)
             */
            override fun subjectAlternativeNames(): Any? = unwrap(this).getSubjectAlternativeNames()

            /**
             * A reference to where to retrieve the trust chain when validating a peer’s Transport
             * Layer Security (TLS) certificate.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaytlsvalidationcontext.html#cfn-appmesh-virtualgateway-virtualgatewaytlsvalidationcontext-trust)
             */
            override fun trust(): Any = unwrap(this).getTrust()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): VirtualGatewayTlsValidationContextProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextProperty
            ): VirtualGatewayTlsValidationContextProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: VirtualGatewayTlsValidationContextProperty
            ): software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayTlsValidationContextProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface VirtualGatewayListenerTlsAcmCertificateProperty {
        /**
         * The Amazon Resource Name (ARN) for the certificate.
         *
         * The certificate must meet specific requirements and you must have proxy authorization
         * enabled. For more information, see
         * [Transport Layer Security (TLS)](https://docs.aws.amazon.com/app-mesh/latest/userguide/tls.html#virtual-node-tls-prerequisites)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaylistenertlsacmcertificate.html#cfn-appmesh-virtualgateway-virtualgatewaylistenertlsacmcertificate-certificatearn)
         */
        public fun certificateArn(): String

        /** A builder for [VirtualGatewayListenerTlsAcmCertificateProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param certificateArn The Amazon Resource Name (ARN) for the certificate. The
             *   certificate must meet specific requirements and you must have proxy authorization
             *   enabled. For more information, see
             *   [Transport Layer Security (TLS)](https://docs.aws.amazon.com/app-mesh/latest/userguide/tls.html#virtual-node-tls-prerequisites)
             *   .
             */
            public fun certificateArn(certificateArn: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsAcmCertificateProperty.Builder =
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway
                    .VirtualGatewayListenerTlsAcmCertificateProperty
                    .builder()

            /**
             * @param certificateArn The Amazon Resource Name (ARN) for the certificate. The
             *   certificate must meet specific requirements and you must have proxy authorization
             *   enabled. For more information, see
             *   [Transport Layer Security (TLS)](https://docs.aws.amazon.com/app-mesh/latest/userguide/tls.html#virtual-node-tls-prerequisites)
             *   .
             */
            override fun certificateArn(certificateArn: String) {
                cdkBuilder.certificateArn(certificateArn)
            }

            public fun build():
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsAcmCertificateProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsAcmCertificateProperty,
        ) : VirtualGatewayListenerTlsAcmCertificateProperty {
            /**
             * The Amazon Resource Name (ARN) for the certificate.
             *
             * The certificate must meet specific requirements and you must have proxy authorization
             * enabled. For more information, see
             * [Transport Layer Security (TLS)](https://docs.aws.amazon.com/app-mesh/latest/userguide/tls.html#virtual-node-tls-prerequisites)
             * .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaylistenertlsacmcertificate.html#cfn-appmesh-virtualgateway-virtualgatewaylistenertlsacmcertificate-certificatearn)
             */
            override fun certificateArn(): String = unwrap(this).getCertificateArn()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): VirtualGatewayListenerTlsAcmCertificateProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsAcmCertificateProperty
            ): VirtualGatewayListenerTlsAcmCertificateProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: VirtualGatewayListenerTlsAcmCertificateProperty
            ): software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsAcmCertificateProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface VirtualGatewayListenerTlsFileCertificateProperty {
        /**
         * The certificate chain for the certificate.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaylistenertlsfilecertificate.html#cfn-appmesh-virtualgateway-virtualgatewaylistenertlsfilecertificate-certificatechain)
         */
        public fun certificateChain(): String

        /**
         * The private key for a certificate stored on the file system of the mesh endpoint that the
         * proxy is running on.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaylistenertlsfilecertificate.html#cfn-appmesh-virtualgateway-virtualgatewaylistenertlsfilecertificate-privatekey)
         */
        public fun privateKey(): String

        /** A builder for [VirtualGatewayListenerTlsFileCertificateProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param certificateChain The certificate chain for the certificate. */
            public fun certificateChain(certificateChain: String)

            /**
             * @param privateKey The private key for a certificate stored on the file system of the
             *   mesh endpoint that the proxy is running on.
             */
            public fun privateKey(privateKey: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsFileCertificateProperty.Builder =
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway
                    .VirtualGatewayListenerTlsFileCertificateProperty
                    .builder()

            /** @param certificateChain The certificate chain for the certificate. */
            override fun certificateChain(certificateChain: String) {
                cdkBuilder.certificateChain(certificateChain)
            }

            /**
             * @param privateKey The private key for a certificate stored on the file system of the
             *   mesh endpoint that the proxy is running on.
             */
            override fun privateKey(privateKey: String) {
                cdkBuilder.privateKey(privateKey)
            }

            public fun build():
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsFileCertificateProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsFileCertificateProperty,
        ) : VirtualGatewayListenerTlsFileCertificateProperty {
            /**
             * The certificate chain for the certificate.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaylistenertlsfilecertificate.html#cfn-appmesh-virtualgateway-virtualgatewaylistenertlsfilecertificate-certificatechain)
             */
            override fun certificateChain(): String = unwrap(this).getCertificateChain()

            /**
             * The private key for a certificate stored on the file system of the mesh endpoint that
             * the proxy is running on.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaylistenertlsfilecertificate.html#cfn-appmesh-virtualgateway-virtualgatewaylistenertlsfilecertificate-privatekey)
             */
            override fun privateKey(): String = unwrap(this).getPrivateKey()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): VirtualGatewayListenerTlsFileCertificateProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsFileCertificateProperty
            ): VirtualGatewayListenerTlsFileCertificateProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: VirtualGatewayListenerTlsFileCertificateProperty
            ): software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsFileCertificateProperty =
                (wrapped as Wrapper).cdkObject
        }
    }
}
