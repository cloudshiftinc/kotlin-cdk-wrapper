package io.cloudshiftdev.awscdk.services.datasync

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

public open class CfnLocationNFS
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.datasync.CfnLocationNFS,
) : CfnResource(cdkObject), IInspectable, ITaggable {
    /** The Amazon Resource Name (ARN) of the NFS location that you created. */
    public open fun attrLocationArn(): String = unwrap(this).getAttrLocationArn()

    /** The URI of the NFS location that you created. */
    public open fun attrLocationUri(): String = unwrap(this).getAttrLocationUri()

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** Specifies the options that DataSync can use to mount your NFS file server. */
    public open fun mountOptions(): Any? = unwrap(this).getMountOptions()

    /** Specifies the options that DataSync can use to mount your NFS file server. */
    public open fun mountOptions(`value`: IResolvable) {
        unwrap(this).setMountOptions(`value`.let(IResolvable::unwrap))
    }

    /** Specifies the options that DataSync can use to mount your NFS file server. */
    public open fun mountOptions(`value`: MountOptionsProperty) {
        unwrap(this).setMountOptions(`value`.let(MountOptionsProperty::unwrap))
    }

    /** Specifies the options that DataSync can use to mount your NFS file server. */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a9b22858853b8359d646bd681ee53e427c6af8dcb5d72845a37b747060760769")
    public open fun mountOptions(`value`: MountOptionsProperty.Builder.() -> Unit): Unit =
        mountOptions(MountOptionsProperty(`value`))

    /**
     * Specifies the Amazon Resource Name (ARN) of the DataSync agent that want to connect to your
     * NFS file server.
     */
    public open fun onPremConfig(): Any = unwrap(this).getOnPremConfig()

    /**
     * Specifies the Amazon Resource Name (ARN) of the DataSync agent that want to connect to your
     * NFS file server.
     */
    public open fun onPremConfig(`value`: IResolvable) {
        unwrap(this).setOnPremConfig(`value`.let(IResolvable::unwrap))
    }

    /**
     * Specifies the Amazon Resource Name (ARN) of the DataSync agent that want to connect to your
     * NFS file server.
     */
    public open fun onPremConfig(`value`: OnPremConfigProperty) {
        unwrap(this).setOnPremConfig(`value`.let(OnPremConfigProperty::unwrap))
    }

    /**
     * Specifies the Amazon Resource Name (ARN) of the DataSync agent that want to connect to your
     * NFS file server.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f328cb85a4520771a5c3249f99e0e412aa4de6fe0af00582df57c9ea64185a75")
    public open fun onPremConfig(`value`: OnPremConfigProperty.Builder.() -> Unit): Unit =
        onPremConfig(OnPremConfigProperty(`value`))

    /**
     * Specifies the Domain Name System (DNS) name or IP version 4 address of the NFS file server
     * that your DataSync agent connects to.
     */
    public open fun serverHostname(): String? = unwrap(this).getServerHostname()

    /**
     * Specifies the Domain Name System (DNS) name or IP version 4 address of the NFS file server
     * that your DataSync agent connects to.
     */
    public open fun serverHostname(`value`: String) {
        unwrap(this).setServerHostname(`value`)
    }

    /** Specifies the export path in your NFS file server that you want DataSync to mount. */
    public open fun subdirectory(): String? = unwrap(this).getSubdirectory()

    /** Specifies the export path in your NFS file server that you want DataSync to mount. */
    public open fun subdirectory(`value`: String) {
        unwrap(this).setSubdirectory(`value`)
    }

    /** Tag Manager which manages the tags for this resource. */
    public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

    /** Specifies labels that help you categorize, filter, and search for your AWS resources. */
    public open fun tagsRaw(): List<CfnTag> =
        unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?: emptyList()

    /** Specifies labels that help you categorize, filter, and search for your AWS resources. */
    public open fun tagsRaw(`value`: List<CfnTag>) {
        unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
    }

    /** Specifies labels that help you categorize, filter, and search for your AWS resources. */
    public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.datasync.CfnLocationNFS]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * Specifies the options that DataSync can use to mount your NFS file server.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationnfs.html#cfn-datasync-locationnfs-mountoptions)
         *
         * @param mountOptions Specifies the options that DataSync can use to mount your NFS file
         *   server.
         */
        public fun mountOptions(mountOptions: IResolvable)

        /**
         * Specifies the options that DataSync can use to mount your NFS file server.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationnfs.html#cfn-datasync-locationnfs-mountoptions)
         *
         * @param mountOptions Specifies the options that DataSync can use to mount your NFS file
         *   server.
         */
        public fun mountOptions(mountOptions: MountOptionsProperty)

        /**
         * Specifies the options that DataSync can use to mount your NFS file server.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationnfs.html#cfn-datasync-locationnfs-mountoptions)
         *
         * @param mountOptions Specifies the options that DataSync can use to mount your NFS file
         *   server.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("25a432ce7f1c75dc7f0fe7de40701517a3b87f70b0202663b66a2091262a75ad")
        public fun mountOptions(mountOptions: MountOptionsProperty.Builder.() -> Unit)

        /**
         * Specifies the Amazon Resource Name (ARN) of the DataSync agent that want to connect to
         * your NFS file server.
         *
         * You can specify more than one agent. For more information, see
         * [Using multiple agents for transfers](https://docs.aws.amazon.com/datasync/latest/userguide/multiple-agents.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationnfs.html#cfn-datasync-locationnfs-onpremconfig)
         *
         * @param onPremConfig Specifies the Amazon Resource Name (ARN) of the DataSync agent that
         *   want to connect to your NFS file server.
         */
        public fun onPremConfig(onPremConfig: IResolvable)

        /**
         * Specifies the Amazon Resource Name (ARN) of the DataSync agent that want to connect to
         * your NFS file server.
         *
         * You can specify more than one agent. For more information, see
         * [Using multiple agents for transfers](https://docs.aws.amazon.com/datasync/latest/userguide/multiple-agents.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationnfs.html#cfn-datasync-locationnfs-onpremconfig)
         *
         * @param onPremConfig Specifies the Amazon Resource Name (ARN) of the DataSync agent that
         *   want to connect to your NFS file server.
         */
        public fun onPremConfig(onPremConfig: OnPremConfigProperty)

        /**
         * Specifies the Amazon Resource Name (ARN) of the DataSync agent that want to connect to
         * your NFS file server.
         *
         * You can specify more than one agent. For more information, see
         * [Using multiple agents for transfers](https://docs.aws.amazon.com/datasync/latest/userguide/multiple-agents.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationnfs.html#cfn-datasync-locationnfs-onpremconfig)
         *
         * @param onPremConfig Specifies the Amazon Resource Name (ARN) of the DataSync agent that
         *   want to connect to your NFS file server.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("2cd9f0ae144cf14221414b6db7af184a49d45996e7a95573bd995075ba3c701f")
        public fun onPremConfig(onPremConfig: OnPremConfigProperty.Builder.() -> Unit)

        /**
         * Specifies the Domain Name System (DNS) name or IP version 4 address of the NFS file
         * server that your DataSync agent connects to.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationnfs.html#cfn-datasync-locationnfs-serverhostname)
         *
         * @param serverHostname Specifies the Domain Name System (DNS) name or IP version 4 address
         *   of the NFS file server that your DataSync agent connects to.
         */
        public fun serverHostname(serverHostname: String)

        /**
         * Specifies the export path in your NFS file server that you want DataSync to mount.
         *
         * This path (or a subdirectory of the path) is where DataSync transfers data to or from.
         * For information on configuring an export for DataSync, see
         * [Accessing NFS file servers](https://docs.aws.amazon.com/datasync/latest/userguide/create-nfs-location.html#accessing-nfs)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationnfs.html#cfn-datasync-locationnfs-subdirectory)
         *
         * @param subdirectory Specifies the export path in your NFS file server that you want
         *   DataSync to mount.
         */
        public fun subdirectory(subdirectory: String)

        /**
         * Specifies labels that help you categorize, filter, and search for your AWS resources.
         *
         * We recommend creating at least a name tag for your location.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationnfs.html#cfn-datasync-locationnfs-tags)
         *
         * @param tags Specifies labels that help you categorize, filter, and search for your AWS
         *   resources.
         */
        public fun tags(tags: List<CfnTag>)

        /**
         * Specifies labels that help you categorize, filter, and search for your AWS resources.
         *
         * We recommend creating at least a name tag for your location.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationnfs.html#cfn-datasync-locationnfs-tags)
         *
         * @param tags Specifies labels that help you categorize, filter, and search for your AWS
         *   resources.
         */
        public fun tags(vararg tags: CfnTag)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.datasync.CfnLocationNFS.Builder =
            software.amazon.awscdk.services.datasync.CfnLocationNFS.Builder.create(scope, id)

        /**
         * Specifies the options that DataSync can use to mount your NFS file server.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationnfs.html#cfn-datasync-locationnfs-mountoptions)
         *
         * @param mountOptions Specifies the options that DataSync can use to mount your NFS file
         *   server.
         */
        override fun mountOptions(mountOptions: IResolvable) {
            cdkBuilder.mountOptions(mountOptions.let(IResolvable::unwrap))
        }

        /**
         * Specifies the options that DataSync can use to mount your NFS file server.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationnfs.html#cfn-datasync-locationnfs-mountoptions)
         *
         * @param mountOptions Specifies the options that DataSync can use to mount your NFS file
         *   server.
         */
        override fun mountOptions(mountOptions: MountOptionsProperty) {
            cdkBuilder.mountOptions(mountOptions.let(MountOptionsProperty::unwrap))
        }

        /**
         * Specifies the options that DataSync can use to mount your NFS file server.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationnfs.html#cfn-datasync-locationnfs-mountoptions)
         *
         * @param mountOptions Specifies the options that DataSync can use to mount your NFS file
         *   server.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("25a432ce7f1c75dc7f0fe7de40701517a3b87f70b0202663b66a2091262a75ad")
        override fun mountOptions(mountOptions: MountOptionsProperty.Builder.() -> Unit): Unit =
            mountOptions(MountOptionsProperty(mountOptions))

        /**
         * Specifies the Amazon Resource Name (ARN) of the DataSync agent that want to connect to
         * your NFS file server.
         *
         * You can specify more than one agent. For more information, see
         * [Using multiple agents for transfers](https://docs.aws.amazon.com/datasync/latest/userguide/multiple-agents.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationnfs.html#cfn-datasync-locationnfs-onpremconfig)
         *
         * @param onPremConfig Specifies the Amazon Resource Name (ARN) of the DataSync agent that
         *   want to connect to your NFS file server.
         */
        override fun onPremConfig(onPremConfig: IResolvable) {
            cdkBuilder.onPremConfig(onPremConfig.let(IResolvable::unwrap))
        }

        /**
         * Specifies the Amazon Resource Name (ARN) of the DataSync agent that want to connect to
         * your NFS file server.
         *
         * You can specify more than one agent. For more information, see
         * [Using multiple agents for transfers](https://docs.aws.amazon.com/datasync/latest/userguide/multiple-agents.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationnfs.html#cfn-datasync-locationnfs-onpremconfig)
         *
         * @param onPremConfig Specifies the Amazon Resource Name (ARN) of the DataSync agent that
         *   want to connect to your NFS file server.
         */
        override fun onPremConfig(onPremConfig: OnPremConfigProperty) {
            cdkBuilder.onPremConfig(onPremConfig.let(OnPremConfigProperty::unwrap))
        }

        /**
         * Specifies the Amazon Resource Name (ARN) of the DataSync agent that want to connect to
         * your NFS file server.
         *
         * You can specify more than one agent. For more information, see
         * [Using multiple agents for transfers](https://docs.aws.amazon.com/datasync/latest/userguide/multiple-agents.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationnfs.html#cfn-datasync-locationnfs-onpremconfig)
         *
         * @param onPremConfig Specifies the Amazon Resource Name (ARN) of the DataSync agent that
         *   want to connect to your NFS file server.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("2cd9f0ae144cf14221414b6db7af184a49d45996e7a95573bd995075ba3c701f")
        override fun onPremConfig(onPremConfig: OnPremConfigProperty.Builder.() -> Unit): Unit =
            onPremConfig(OnPremConfigProperty(onPremConfig))

        /**
         * Specifies the Domain Name System (DNS) name or IP version 4 address of the NFS file
         * server that your DataSync agent connects to.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationnfs.html#cfn-datasync-locationnfs-serverhostname)
         *
         * @param serverHostname Specifies the Domain Name System (DNS) name or IP version 4 address
         *   of the NFS file server that your DataSync agent connects to.
         */
        override fun serverHostname(serverHostname: String) {
            cdkBuilder.serverHostname(serverHostname)
        }

        /**
         * Specifies the export path in your NFS file server that you want DataSync to mount.
         *
         * This path (or a subdirectory of the path) is where DataSync transfers data to or from.
         * For information on configuring an export for DataSync, see
         * [Accessing NFS file servers](https://docs.aws.amazon.com/datasync/latest/userguide/create-nfs-location.html#accessing-nfs)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationnfs.html#cfn-datasync-locationnfs-subdirectory)
         *
         * @param subdirectory Specifies the export path in your NFS file server that you want
         *   DataSync to mount.
         */
        override fun subdirectory(subdirectory: String) {
            cdkBuilder.subdirectory(subdirectory)
        }

        /**
         * Specifies labels that help you categorize, filter, and search for your AWS resources.
         *
         * We recommend creating at least a name tag for your location.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationnfs.html#cfn-datasync-locationnfs-tags)
         *
         * @param tags Specifies labels that help you categorize, filter, and search for your AWS
         *   resources.
         */
        override fun tags(tags: List<CfnTag>) {
            cdkBuilder.tags(tags.map(CfnTag::unwrap))
        }

        /**
         * Specifies labels that help you categorize, filter, and search for your AWS resources.
         *
         * We recommend creating at least a name tag for your location.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationnfs.html#cfn-datasync-locationnfs-tags)
         *
         * @param tags Specifies labels that help you categorize, filter, and search for your AWS
         *   resources.
         */
        override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

        public fun build(): software.amazon.awscdk.services.datasync.CfnLocationNFS =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnLocationNFS {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnLocationNFS(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.datasync.CfnLocationNFS
        ): CfnLocationNFS = CfnLocationNFS(cdkObject)

        internal fun unwrap(
            wrapped: CfnLocationNFS
        ): software.amazon.awscdk.services.datasync.CfnLocationNFS = wrapped.cdkObject
    }

    public interface OnPremConfigProperty {
        /**
         * The Amazon Resource Names (ARNs) of the agents connecting to a transfer location.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationnfs-onpremconfig.html#cfn-datasync-locationnfs-onpremconfig-agentarns)
         */
        public fun agentArns(): List<String>

        /** A builder for [OnPremConfigProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param agentArns The Amazon Resource Names (ARNs) of the agents connecting to a
             *   transfer location.
             */
            public fun agentArns(agentArns: List<String>)

            /**
             * @param agentArns The Amazon Resource Names (ARNs) of the agents connecting to a
             *   transfer location.
             */
            public fun agentArns(vararg agentArns: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.datasync.CfnLocationNFS.OnPremConfigProperty.Builder =
                software.amazon.awscdk.services.datasync.CfnLocationNFS.OnPremConfigProperty
                    .builder()

            /**
             * @param agentArns The Amazon Resource Names (ARNs) of the agents connecting to a
             *   transfer location.
             */
            override fun agentArns(agentArns: List<String>) {
                cdkBuilder.agentArns(agentArns)
            }

            /**
             * @param agentArns The Amazon Resource Names (ARNs) of the agents connecting to a
             *   transfer location.
             */
            override fun agentArns(vararg agentArns: String): Unit = agentArns(agentArns.toList())

            public fun build():
                software.amazon.awscdk.services.datasync.CfnLocationNFS.OnPremConfigProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.datasync.CfnLocationNFS.OnPremConfigProperty,
        ) : OnPremConfigProperty {
            /**
             * The Amazon Resource Names (ARNs) of the agents connecting to a transfer location.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationnfs-onpremconfig.html#cfn-datasync-locationnfs-onpremconfig-agentarns)
             */
            override fun agentArns(): List<String> = unwrap(this).getAgentArns()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): OnPremConfigProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.datasync.CfnLocationNFS.OnPremConfigProperty
            ): OnPremConfigProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: OnPremConfigProperty
            ): software.amazon.awscdk.services.datasync.CfnLocationNFS.OnPremConfigProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface MountOptionsProperty {
        /**
         * Specifies the NFS version that you want DataSync to use when mounting your NFS share.
         *
         * If the server refuses to use the version specified, the task fails.
         *
         * You can specify the following options:
         * * `AUTOMATIC` (default): DataSync chooses NFS version 4.1.
         * * `NFS3` : Stateless protocol version that allows for asynchronous writes on the server.
         * * `NFSv4_0` : Stateful, firewall-friendly protocol version that supports delegations and
         *   pseudo file systems.
         * * `NFSv4_1` : Stateful protocol version that supports sessions, directory delegations,
         *   and parallel data processing. NFS version 4.1 also includes all features available in
         *   version 4.0.
         *
         * DataSync currently only supports NFS version 3 with Amazon FSx for NetApp ONTAP
         * locations.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationnfs-mountoptions.html#cfn-datasync-locationnfs-mountoptions-version)
         */
        public fun version(): String? = unwrap(this).getVersion()

        /** A builder for [MountOptionsProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param version Specifies the NFS version that you want DataSync to use when mounting
             *   your NFS share. If the server refuses to use the version specified, the task fails.
             *
             * You can specify the following options:
             * * `AUTOMATIC` (default): DataSync chooses NFS version 4.1.
             * * `NFS3` : Stateless protocol version that allows for asynchronous writes on the
             *   server.
             * * `NFSv4_0` : Stateful, firewall-friendly protocol version that supports delegations
             *   and pseudo file systems.
             * * `NFSv4_1` : Stateful protocol version that supports sessions, directory
             *   delegations, and parallel data processing. NFS version 4.1 also includes all
             *   features available in version 4.0.
             *
             * DataSync currently only supports NFS version 3 with Amazon FSx for NetApp ONTAP
             * locations.
             */
            public fun version(version: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.datasync.CfnLocationNFS.MountOptionsProperty.Builder =
                software.amazon.awscdk.services.datasync.CfnLocationNFS.MountOptionsProperty
                    .builder()

            /**
             * @param version Specifies the NFS version that you want DataSync to use when mounting
             *   your NFS share. If the server refuses to use the version specified, the task fails.
             *
             * You can specify the following options:
             * * `AUTOMATIC` (default): DataSync chooses NFS version 4.1.
             * * `NFS3` : Stateless protocol version that allows for asynchronous writes on the
             *   server.
             * * `NFSv4_0` : Stateful, firewall-friendly protocol version that supports delegations
             *   and pseudo file systems.
             * * `NFSv4_1` : Stateful protocol version that supports sessions, directory
             *   delegations, and parallel data processing. NFS version 4.1 also includes all
             *   features available in version 4.0.
             *
             * DataSync currently only supports NFS version 3 with Amazon FSx for NetApp ONTAP
             * locations.
             */
            override fun version(version: String) {
                cdkBuilder.version(version)
            }

            public fun build():
                software.amazon.awscdk.services.datasync.CfnLocationNFS.MountOptionsProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.datasync.CfnLocationNFS.MountOptionsProperty,
        ) : MountOptionsProperty {
            /**
             * Specifies the NFS version that you want DataSync to use when mounting your NFS share.
             *
             * If the server refuses to use the version specified, the task fails.
             *
             * You can specify the following options:
             * * `AUTOMATIC` (default): DataSync chooses NFS version 4.1.
             * * `NFS3` : Stateless protocol version that allows for asynchronous writes on the
             *   server.
             * * `NFSv4_0` : Stateful, firewall-friendly protocol version that supports delegations
             *   and pseudo file systems.
             * * `NFSv4_1` : Stateful protocol version that supports sessions, directory
             *   delegations, and parallel data processing. NFS version 4.1 also includes all
             *   features available in version 4.0.
             *
             * DataSync currently only supports NFS version 3 with Amazon FSx for NetApp ONTAP
             * locations.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationnfs-mountoptions.html#cfn-datasync-locationnfs-mountoptions-version)
             */
            override fun version(): String? = unwrap(this).getVersion()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): MountOptionsProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.datasync.CfnLocationNFS.MountOptionsProperty
            ): MountOptionsProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: MountOptionsProperty
            ): software.amazon.awscdk.services.datasync.CfnLocationNFS.MountOptionsProperty =
                (wrapped as Wrapper).cdkObject
        }
    }
}
