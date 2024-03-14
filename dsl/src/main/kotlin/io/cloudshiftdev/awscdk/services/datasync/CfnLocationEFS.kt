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

public open class CfnLocationEFS
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.datasync.CfnLocationEFS,
) : CfnResource(cdkObject), IInspectable, ITaggable {
    /**
     * Specifies the Amazon Resource Name (ARN) of the access point that DataSync uses to access the
     * Amazon EFS file system.
     */
    public open fun accessPointArn(): String? = unwrap(this).getAccessPointArn()

    /**
     * Specifies the Amazon Resource Name (ARN) of the access point that DataSync uses to access the
     * Amazon EFS file system.
     */
    public open fun accessPointArn(`value`: String) {
        unwrap(this).setAccessPointArn(`value`)
    }

    /** The Amazon Resource Name (ARN) of the Amazon EFS file system. */
    public open fun attrLocationArn(): String = unwrap(this).getAttrLocationArn()

    /** The URI of the Amazon EFS file system. */
    public open fun attrLocationUri(): String = unwrap(this).getAttrLocationUri()

    /**
     * Specifies the subnet and security groups DataSync uses to access your Amazon EFS file system.
     */
    public open fun ec2Config(): Any = unwrap(this).getEc2Config()

    /**
     * Specifies the subnet and security groups DataSync uses to access your Amazon EFS file system.
     */
    public open fun ec2Config(`value`: IResolvable) {
        unwrap(this).setEc2Config(`value`.let(IResolvable::unwrap))
    }

    /**
     * Specifies the subnet and security groups DataSync uses to access your Amazon EFS file system.
     */
    public open fun ec2Config(`value`: Ec2ConfigProperty) {
        unwrap(this).setEc2Config(`value`.let(Ec2ConfigProperty::unwrap))
    }

    /**
     * Specifies the subnet and security groups DataSync uses to access your Amazon EFS file system.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bbd59d3aeac85bfa898c59dabe52bd2b32abca81026060441aa3ba9774e9c603")
    public open fun ec2Config(`value`: Ec2ConfigProperty.Builder.() -> Unit): Unit =
        ec2Config(Ec2ConfigProperty(`value`))

    /** Specifies the ARN for the Amazon EFS file system. */
    public open fun efsFilesystemArn(): String? = unwrap(this).getEfsFilesystemArn()

    /** Specifies the ARN for the Amazon EFS file system. */
    public open fun efsFilesystemArn(`value`: String) {
        unwrap(this).setEfsFilesystemArn(`value`)
    }

    /**
     * Specifies an AWS Identity and Access Management (IAM) role that DataSync assumes when
     * mounting the Amazon EFS file system.
     */
    public open fun fileSystemAccessRoleArn(): String? = unwrap(this).getFileSystemAccessRoleArn()

    /**
     * Specifies an AWS Identity and Access Management (IAM) role that DataSync assumes when
     * mounting the Amazon EFS file system.
     */
    public open fun fileSystemAccessRoleArn(`value`: String) {
        unwrap(this).setFileSystemAccessRoleArn(`value`)
    }

    /**
     * Specifies whether you want DataSync to use Transport Layer Security (TLS) 1.2 encryption when
     * it copies data to or from the Amazon EFS file system.
     */
    public open fun inTransitEncryption(): String? = unwrap(this).getInTransitEncryption()

    /**
     * Specifies whether you want DataSync to use Transport Layer Security (TLS) 1.2 encryption when
     * it copies data to or from the Amazon EFS file system.
     */
    public open fun inTransitEncryption(`value`: String) {
        unwrap(this).setInTransitEncryption(`value`)
    }

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** Specifies a mount path for your Amazon EFS file system. */
    public open fun subdirectory(): String? = unwrap(this).getSubdirectory()

    /** Specifies a mount path for your Amazon EFS file system. */
    public open fun subdirectory(`value`: String) {
        unwrap(this).setSubdirectory(`value`)
    }

    /** Tag Manager which manages the tags for this resource. */
    public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

    /** Specifies the key-value pair that represents a tag that you want to add to the resource. */
    public open fun tagsRaw(): List<CfnTag> =
        unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?: emptyList()

    /** Specifies the key-value pair that represents a tag that you want to add to the resource. */
    public open fun tagsRaw(`value`: List<CfnTag>) {
        unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
    }

    /** Specifies the key-value pair that represents a tag that you want to add to the resource. */
    public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.datasync.CfnLocationEFS]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * Specifies the Amazon Resource Name (ARN) of the access point that DataSync uses to access
         * the Amazon EFS file system.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationefs.html#cfn-datasync-locationefs-accesspointarn)
         *
         * @param accessPointArn Specifies the Amazon Resource Name (ARN) of the access point that
         *   DataSync uses to access the Amazon EFS file system.
         */
        public fun accessPointArn(accessPointArn: String)

        /**
         * Specifies the subnet and security groups DataSync uses to access your Amazon EFS file
         * system.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationefs.html#cfn-datasync-locationefs-ec2config)
         *
         * @param ec2Config Specifies the subnet and security groups DataSync uses to access your
         *   Amazon EFS file system.
         */
        public fun ec2Config(ec2Config: IResolvable)

        /**
         * Specifies the subnet and security groups DataSync uses to access your Amazon EFS file
         * system.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationefs.html#cfn-datasync-locationefs-ec2config)
         *
         * @param ec2Config Specifies the subnet and security groups DataSync uses to access your
         *   Amazon EFS file system.
         */
        public fun ec2Config(ec2Config: Ec2ConfigProperty)

        /**
         * Specifies the subnet and security groups DataSync uses to access your Amazon EFS file
         * system.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationefs.html#cfn-datasync-locationefs-ec2config)
         *
         * @param ec2Config Specifies the subnet and security groups DataSync uses to access your
         *   Amazon EFS file system.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("b44d49eae9989a9a3a64e1bfb64a4bc4841f8daef030b2d3dd43278f1e25d57a")
        public fun ec2Config(ec2Config: Ec2ConfigProperty.Builder.() -> Unit)

        /**
         * Specifies the ARN for the Amazon EFS file system.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationefs.html#cfn-datasync-locationefs-efsfilesystemarn)
         *
         * @param efsFilesystemArn Specifies the ARN for the Amazon EFS file system.
         */
        public fun efsFilesystemArn(efsFilesystemArn: String)

        /**
         * Specifies an AWS Identity and Access Management (IAM) role that DataSync assumes when
         * mounting the Amazon EFS file system.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationefs.html#cfn-datasync-locationefs-filesystemaccessrolearn)
         *
         * @param fileSystemAccessRoleArn Specifies an AWS Identity and Access Management (IAM) role
         *   that DataSync assumes when mounting the Amazon EFS file system.
         */
        public fun fileSystemAccessRoleArn(fileSystemAccessRoleArn: String)

        /**
         * Specifies whether you want DataSync to use Transport Layer Security (TLS) 1.2 encryption
         * when it copies data to or from the Amazon EFS file system.
         *
         * If you specify an access point using `AccessPointArn` or an IAM role using
         * `FileSystemAccessRoleArn` , you must set this parameter to `TLS1_2` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationefs.html#cfn-datasync-locationefs-intransitencryption)
         *
         * @param inTransitEncryption Specifies whether you want DataSync to use Transport Layer
         *   Security (TLS) 1.2 encryption when it copies data to or from the Amazon EFS file
         *   system.
         */
        public fun inTransitEncryption(inTransitEncryption: String)

        /**
         * Specifies a mount path for your Amazon EFS file system.
         *
         * This is where DataSync reads or writes data (depending on if this is a source or
         * destination location). By default, DataSync uses the root directory, but you can also
         * include subdirectories.
         *
         * You must specify a value with forward slashes (for example, `/path/to/folder` ).
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationefs.html#cfn-datasync-locationefs-subdirectory)
         *
         * @param subdirectory Specifies a mount path for your Amazon EFS file system.
         */
        public fun subdirectory(subdirectory: String)

        /**
         * Specifies the key-value pair that represents a tag that you want to add to the resource.
         *
         * The value can be an empty string. This value helps you manage, filter, and search for
         * your resources. We recommend that you create a name tag for your location.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationefs.html#cfn-datasync-locationefs-tags)
         *
         * @param tags Specifies the key-value pair that represents a tag that you want to add to
         *   the resource.
         */
        public fun tags(tags: List<CfnTag>)

        /**
         * Specifies the key-value pair that represents a tag that you want to add to the resource.
         *
         * The value can be an empty string. This value helps you manage, filter, and search for
         * your resources. We recommend that you create a name tag for your location.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationefs.html#cfn-datasync-locationefs-tags)
         *
         * @param tags Specifies the key-value pair that represents a tag that you want to add to
         *   the resource.
         */
        public fun tags(vararg tags: CfnTag)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.datasync.CfnLocationEFS.Builder =
            software.amazon.awscdk.services.datasync.CfnLocationEFS.Builder.create(scope, id)

        /**
         * Specifies the Amazon Resource Name (ARN) of the access point that DataSync uses to access
         * the Amazon EFS file system.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationefs.html#cfn-datasync-locationefs-accesspointarn)
         *
         * @param accessPointArn Specifies the Amazon Resource Name (ARN) of the access point that
         *   DataSync uses to access the Amazon EFS file system.
         */
        override fun accessPointArn(accessPointArn: String) {
            cdkBuilder.accessPointArn(accessPointArn)
        }

        /**
         * Specifies the subnet and security groups DataSync uses to access your Amazon EFS file
         * system.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationefs.html#cfn-datasync-locationefs-ec2config)
         *
         * @param ec2Config Specifies the subnet and security groups DataSync uses to access your
         *   Amazon EFS file system.
         */
        override fun ec2Config(ec2Config: IResolvable) {
            cdkBuilder.ec2Config(ec2Config.let(IResolvable::unwrap))
        }

        /**
         * Specifies the subnet and security groups DataSync uses to access your Amazon EFS file
         * system.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationefs.html#cfn-datasync-locationefs-ec2config)
         *
         * @param ec2Config Specifies the subnet and security groups DataSync uses to access your
         *   Amazon EFS file system.
         */
        override fun ec2Config(ec2Config: Ec2ConfigProperty) {
            cdkBuilder.ec2Config(ec2Config.let(Ec2ConfigProperty::unwrap))
        }

        /**
         * Specifies the subnet and security groups DataSync uses to access your Amazon EFS file
         * system.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationefs.html#cfn-datasync-locationefs-ec2config)
         *
         * @param ec2Config Specifies the subnet and security groups DataSync uses to access your
         *   Amazon EFS file system.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("b44d49eae9989a9a3a64e1bfb64a4bc4841f8daef030b2d3dd43278f1e25d57a")
        override fun ec2Config(ec2Config: Ec2ConfigProperty.Builder.() -> Unit): Unit =
            ec2Config(Ec2ConfigProperty(ec2Config))

        /**
         * Specifies the ARN for the Amazon EFS file system.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationefs.html#cfn-datasync-locationefs-efsfilesystemarn)
         *
         * @param efsFilesystemArn Specifies the ARN for the Amazon EFS file system.
         */
        override fun efsFilesystemArn(efsFilesystemArn: String) {
            cdkBuilder.efsFilesystemArn(efsFilesystemArn)
        }

        /**
         * Specifies an AWS Identity and Access Management (IAM) role that DataSync assumes when
         * mounting the Amazon EFS file system.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationefs.html#cfn-datasync-locationefs-filesystemaccessrolearn)
         *
         * @param fileSystemAccessRoleArn Specifies an AWS Identity and Access Management (IAM) role
         *   that DataSync assumes when mounting the Amazon EFS file system.
         */
        override fun fileSystemAccessRoleArn(fileSystemAccessRoleArn: String) {
            cdkBuilder.fileSystemAccessRoleArn(fileSystemAccessRoleArn)
        }

        /**
         * Specifies whether you want DataSync to use Transport Layer Security (TLS) 1.2 encryption
         * when it copies data to or from the Amazon EFS file system.
         *
         * If you specify an access point using `AccessPointArn` or an IAM role using
         * `FileSystemAccessRoleArn` , you must set this parameter to `TLS1_2` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationefs.html#cfn-datasync-locationefs-intransitencryption)
         *
         * @param inTransitEncryption Specifies whether you want DataSync to use Transport Layer
         *   Security (TLS) 1.2 encryption when it copies data to or from the Amazon EFS file
         *   system.
         */
        override fun inTransitEncryption(inTransitEncryption: String) {
            cdkBuilder.inTransitEncryption(inTransitEncryption)
        }

        /**
         * Specifies a mount path for your Amazon EFS file system.
         *
         * This is where DataSync reads or writes data (depending on if this is a source or
         * destination location). By default, DataSync uses the root directory, but you can also
         * include subdirectories.
         *
         * You must specify a value with forward slashes (for example, `/path/to/folder` ).
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationefs.html#cfn-datasync-locationefs-subdirectory)
         *
         * @param subdirectory Specifies a mount path for your Amazon EFS file system.
         */
        override fun subdirectory(subdirectory: String) {
            cdkBuilder.subdirectory(subdirectory)
        }

        /**
         * Specifies the key-value pair that represents a tag that you want to add to the resource.
         *
         * The value can be an empty string. This value helps you manage, filter, and search for
         * your resources. We recommend that you create a name tag for your location.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationefs.html#cfn-datasync-locationefs-tags)
         *
         * @param tags Specifies the key-value pair that represents a tag that you want to add to
         *   the resource.
         */
        override fun tags(tags: List<CfnTag>) {
            cdkBuilder.tags(tags.map(CfnTag::unwrap))
        }

        /**
         * Specifies the key-value pair that represents a tag that you want to add to the resource.
         *
         * The value can be an empty string. This value helps you manage, filter, and search for
         * your resources. We recommend that you create a name tag for your location.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationefs.html#cfn-datasync-locationefs-tags)
         *
         * @param tags Specifies the key-value pair that represents a tag that you want to add to
         *   the resource.
         */
        override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

        public fun build(): software.amazon.awscdk.services.datasync.CfnLocationEFS =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnLocationEFS {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnLocationEFS(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.datasync.CfnLocationEFS
        ): CfnLocationEFS = CfnLocationEFS(cdkObject)

        internal fun unwrap(
            wrapped: CfnLocationEFS
        ): software.amazon.awscdk.services.datasync.CfnLocationEFS = wrapped.cdkObject
    }

    public interface Ec2ConfigProperty {
        /**
         * Specifies the Amazon Resource Names (ARNs) of the security groups associated with an
         * Amazon EFS file system's mount target.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationefs-ec2config.html#cfn-datasync-locationefs-ec2config-securitygrouparns)
         */
        public fun securityGroupArns(): List<String>

        /**
         * Specifies the ARN of a subnet where DataSync creates the
         * [network interfaces](https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces)
         * for managing traffic during your transfer.
         *
         * The subnet must be located:
         * * In the same virtual private cloud (VPC) as the Amazon EFS file system.
         * * In the same Availability Zone as at least one mount target for the Amazon EFS file
         *   system.
         *
         * You don't need to specify a subnet that includes a file system mount target.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationefs-ec2config.html#cfn-datasync-locationefs-ec2config-subnetarn)
         */
        public fun subnetArn(): String

        /** A builder for [Ec2ConfigProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param securityGroupArns Specifies the Amazon Resource Names (ARNs) of the security
             *   groups associated with an Amazon EFS file system's mount target.
             */
            public fun securityGroupArns(securityGroupArns: List<String>)

            /**
             * @param securityGroupArns Specifies the Amazon Resource Names (ARNs) of the security
             *   groups associated with an Amazon EFS file system's mount target.
             */
            public fun securityGroupArns(vararg securityGroupArns: String)

            /**
             * @param subnetArn Specifies the ARN of a subnet where DataSync creates the
             *   [network interfaces](https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces)
             *   for managing traffic during your transfer. The subnet must be located:
             * * In the same virtual private cloud (VPC) as the Amazon EFS file system.
             * * In the same Availability Zone as at least one mount target for the Amazon EFS file
             *   system.
             *
             * You don't need to specify a subnet that includes a file system mount target.
             */
            public fun subnetArn(subnetArn: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.datasync.CfnLocationEFS.Ec2ConfigProperty.Builder =
                software.amazon.awscdk.services.datasync.CfnLocationEFS.Ec2ConfigProperty.builder()

            /**
             * @param securityGroupArns Specifies the Amazon Resource Names (ARNs) of the security
             *   groups associated with an Amazon EFS file system's mount target.
             */
            override fun securityGroupArns(securityGroupArns: List<String>) {
                cdkBuilder.securityGroupArns(securityGroupArns)
            }

            /**
             * @param securityGroupArns Specifies the Amazon Resource Names (ARNs) of the security
             *   groups associated with an Amazon EFS file system's mount target.
             */
            override fun securityGroupArns(vararg securityGroupArns: String): Unit =
                securityGroupArns(securityGroupArns.toList())

            /**
             * @param subnetArn Specifies the ARN of a subnet where DataSync creates the
             *   [network interfaces](https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces)
             *   for managing traffic during your transfer. The subnet must be located:
             * * In the same virtual private cloud (VPC) as the Amazon EFS file system.
             * * In the same Availability Zone as at least one mount target for the Amazon EFS file
             *   system.
             *
             * You don't need to specify a subnet that includes a file system mount target.
             */
            override fun subnetArn(subnetArn: String) {
                cdkBuilder.subnetArn(subnetArn)
            }

            public fun build():
                software.amazon.awscdk.services.datasync.CfnLocationEFS.Ec2ConfigProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.datasync.CfnLocationEFS.Ec2ConfigProperty,
        ) : Ec2ConfigProperty {
            /**
             * Specifies the Amazon Resource Names (ARNs) of the security groups associated with an
             * Amazon EFS file system's mount target.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationefs-ec2config.html#cfn-datasync-locationefs-ec2config-securitygrouparns)
             */
            override fun securityGroupArns(): List<String> = unwrap(this).getSecurityGroupArns()

            /**
             * Specifies the ARN of a subnet where DataSync creates the
             * [network interfaces](https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces)
             * for managing traffic during your transfer.
             *
             * The subnet must be located:
             * * In the same virtual private cloud (VPC) as the Amazon EFS file system.
             * * In the same Availability Zone as at least one mount target for the Amazon EFS file
             *   system.
             *
             * You don't need to specify a subnet that includes a file system mount target.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationefs-ec2config.html#cfn-datasync-locationefs-ec2config-subnetarn)
             */
            override fun subnetArn(): String = unwrap(this).getSubnetArn()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): Ec2ConfigProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.datasync.CfnLocationEFS.Ec2ConfigProperty
            ): Ec2ConfigProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: Ec2ConfigProperty
            ): software.amazon.awscdk.services.datasync.CfnLocationEFS.Ec2ConfigProperty =
                (wrapped as Wrapper).cdkObject
        }
    }
}
