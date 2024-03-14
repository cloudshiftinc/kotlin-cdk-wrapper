package io.cloudshiftdev.awscdk.services.dms

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnInstanceProfile
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.dms.CfnInstanceProfile,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
    /** The Amazon Resource Name (ARN) string that uniquely identifies the instance profile. */
    public open fun attrInstanceProfileArn(): String = unwrap(this).getAttrInstanceProfileArn()

    /** The time the instance profile was created. */
    public open fun attrInstanceProfileCreationTime(): String =
        unwrap(this).getAttrInstanceProfileCreationTime()

    /** The Availability Zone where the instance profile runs. */
    public open fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    /** The Availability Zone where the instance profile runs. */
    public open fun availabilityZone(`value`: String) {
        unwrap(this).setAvailabilityZone(`value`)
    }

    /** Tag Manager which manages the tags for this resource. */
    public override fun cdkTagManager(): TagManager =
        unwrap(this).getCdkTagManager().let(TagManager::wrap)

    /** A description of the instance profile. */
    public open fun description(): String? = unwrap(this).getDescription()

    /** A description of the instance profile. */
    public open fun description(`value`: String) {
        unwrap(this).setDescription(`value`)
    }

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** The identifier of the instance profile. */
    public open fun instanceProfileIdentifier(): String? =
        unwrap(this).getInstanceProfileIdentifier()

    /** The identifier of the instance profile. */
    public open fun instanceProfileIdentifier(`value`: String) {
        unwrap(this).setInstanceProfileIdentifier(`value`)
    }

    /** The user-friendly name for the instance profile. */
    public open fun instanceProfileName(): String? = unwrap(this).getInstanceProfileName()

    /** The user-friendly name for the instance profile. */
    public open fun instanceProfileName(`value`: String) {
        unwrap(this).setInstanceProfileName(`value`)
    }

    /**
     * The Amazon Resource Name (ARN) of the AWS KMS key that is used to encrypt the connection
     * parameters for the instance profile.
     */
    public open fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    /**
     * The Amazon Resource Name (ARN) of the AWS KMS key that is used to encrypt the connection
     * parameters for the instance profile.
     */
    public open fun kmsKeyArn(`value`: String) {
        unwrap(this).setKmsKeyArn(`value`)
    }

    /** Specifies the network type for the instance profile. */
    public open fun networkType(): String? = unwrap(this).getNetworkType()

    /** Specifies the network type for the instance profile. */
    public open fun networkType(`value`: String) {
        unwrap(this).setNetworkType(`value`)
    }

    /** Specifies the accessibility options for the instance profile. */
    public open fun publiclyAccessible(): Any? = unwrap(this).getPubliclyAccessible()

    /** Specifies the accessibility options for the instance profile. */
    public open fun publiclyAccessible(`value`: Boolean) {
        unwrap(this).setPubliclyAccessible(`value`)
    }

    /** Specifies the accessibility options for the instance profile. */
    public open fun publiclyAccessible(`value`: IResolvable) {
        unwrap(this).setPubliclyAccessible(`value`.let(IResolvable::unwrap))
    }

    /** The identifier of the subnet group that is associated with the instance profile. */
    public open fun subnetGroupIdentifier(): String? = unwrap(this).getSubnetGroupIdentifier()

    /** The identifier of the subnet group that is associated with the instance profile. */
    public open fun subnetGroupIdentifier(`value`: String) {
        unwrap(this).setSubnetGroupIdentifier(`value`)
    }

    /** An array of key-value pairs to apply to this resource. */
    public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /** An array of key-value pairs to apply to this resource. */
    public open fun tags(`value`: List<CfnTag>) {
        unwrap(this).setTags(`value`.map(CfnTag::unwrap))
    }

    /** An array of key-value pairs to apply to this resource. */
    public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

    /** The VPC security groups that are used with the instance profile. */
    public open fun vpcSecurityGroups(): List<String> =
        unwrap(this).getVpcSecurityGroups() ?: emptyList()

    /** The VPC security groups that are used with the instance profile. */
    public open fun vpcSecurityGroups(`value`: List<String>) {
        unwrap(this).setVpcSecurityGroups(`value`)
    }

    /** The VPC security groups that are used with the instance profile. */
    public open fun vpcSecurityGroups(vararg `value`: String): Unit =
        vpcSecurityGroups(`value`.toList())

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.dms.CfnInstanceProfile]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * The Availability Zone where the instance profile runs.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-instanceprofile.html#cfn-dms-instanceprofile-availabilityzone)
         *
         * @param availabilityZone The Availability Zone where the instance profile runs.
         */
        public fun availabilityZone(availabilityZone: String)

        /**
         * A description of the instance profile.
         *
         * Descriptions can have up to 31 characters. A description can contain only ASCII letters,
         * digits, and hyphens ('-'). Also, it can't end with a hyphen or contain two consecutive
         * hyphens, and can only begin with a letter.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-instanceprofile.html#cfn-dms-instanceprofile-description)
         *
         * @param description A description of the instance profile.
         */
        public fun description(description: String)

        /**
         * The identifier of the instance profile.
         *
         * Identifiers must begin with a letter and must contain only ASCII letters, digits, and
         * hyphens. They can't end with a hyphen, or contain two consecutive hyphens.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-instanceprofile.html#cfn-dms-instanceprofile-instanceprofileidentifier)
         *
         * @param instanceProfileIdentifier The identifier of the instance profile.
         */
        public fun instanceProfileIdentifier(instanceProfileIdentifier: String)

        /**
         * The user-friendly name for the instance profile.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-instanceprofile.html#cfn-dms-instanceprofile-instanceprofilename)
         *
         * @param instanceProfileName The user-friendly name for the instance profile.
         */
        public fun instanceProfileName(instanceProfileName: String)

        /**
         * The Amazon Resource Name (ARN) of the AWS KMS key that is used to encrypt the connection
         * parameters for the instance profile.
         *
         * If you don't specify a value for the `KmsKeyArn` parameter, then AWS DMS uses your
         * default encryption key.
         *
         * AWS KMS creates the default encryption key for your AWS account . Your AWS account has a
         * different default encryption key for each AWS Region .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-instanceprofile.html#cfn-dms-instanceprofile-kmskeyarn)
         *
         * @param kmsKeyArn The Amazon Resource Name (ARN) of the AWS KMS key that is used to
         *   encrypt the connection parameters for the instance profile.
         */
        public fun kmsKeyArn(kmsKeyArn: String)

        /**
         * Specifies the network type for the instance profile.
         *
         * A value of `IPV4` represents an instance profile with IPv4 network type and only supports
         * IPv4 addressing. A value of `IPV6` represents an instance profile with IPv6 network type
         * and only supports IPv6 addressing. A value of `DUAL` represents an instance profile with
         * dual network type that supports IPv4 and IPv6 addressing.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-instanceprofile.html#cfn-dms-instanceprofile-networktype)
         *
         * @param networkType Specifies the network type for the instance profile.
         */
        public fun networkType(networkType: String)

        /**
         * Specifies the accessibility options for the instance profile.
         *
         * A value of `true` represents an instance profile with a public IP address. A value of
         * `false` represents an instance profile with a private IP address. The default value is
         * `true` .
         *
         * Default: - false
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-instanceprofile.html#cfn-dms-instanceprofile-publiclyaccessible)
         *
         * @param publiclyAccessible Specifies the accessibility options for the instance profile.
         */
        public fun publiclyAccessible(publiclyAccessible: Boolean)

        /**
         * Specifies the accessibility options for the instance profile.
         *
         * A value of `true` represents an instance profile with a public IP address. A value of
         * `false` represents an instance profile with a private IP address. The default value is
         * `true` .
         *
         * Default: - false
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-instanceprofile.html#cfn-dms-instanceprofile-publiclyaccessible)
         *
         * @param publiclyAccessible Specifies the accessibility options for the instance profile.
         */
        public fun publiclyAccessible(publiclyAccessible: IResolvable)

        /**
         * The identifier of the subnet group that is associated with the instance profile.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-instanceprofile.html#cfn-dms-instanceprofile-subnetgroupidentifier)
         *
         * @param subnetGroupIdentifier The identifier of the subnet group that is associated with
         *   the instance profile.
         */
        public fun subnetGroupIdentifier(subnetGroupIdentifier: String)

        /**
         * An array of key-value pairs to apply to this resource.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-instanceprofile.html#cfn-dms-instanceprofile-tags)
         *
         * @param tags An array of key-value pairs to apply to this resource.
         */
        public fun tags(tags: List<CfnTag>)

        /**
         * An array of key-value pairs to apply to this resource.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-instanceprofile.html#cfn-dms-instanceprofile-tags)
         *
         * @param tags An array of key-value pairs to apply to this resource.
         */
        public fun tags(vararg tags: CfnTag)

        /**
         * The VPC security groups that are used with the instance profile.
         *
         * The VPC security group must work with the VPC containing the instance profile.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-instanceprofile.html#cfn-dms-instanceprofile-vpcsecuritygroups)
         *
         * @param vpcSecurityGroups The VPC security groups that are used with the instance profile.
         */
        public fun vpcSecurityGroups(vpcSecurityGroups: List<String>)

        /**
         * The VPC security groups that are used with the instance profile.
         *
         * The VPC security group must work with the VPC containing the instance profile.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-instanceprofile.html#cfn-dms-instanceprofile-vpcsecuritygroups)
         *
         * @param vpcSecurityGroups The VPC security groups that are used with the instance profile.
         */
        public fun vpcSecurityGroups(vararg vpcSecurityGroups: String)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.dms.CfnInstanceProfile.Builder =
            software.amazon.awscdk.services.dms.CfnInstanceProfile.Builder.create(scope, id)

        /**
         * The Availability Zone where the instance profile runs.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-instanceprofile.html#cfn-dms-instanceprofile-availabilityzone)
         *
         * @param availabilityZone The Availability Zone where the instance profile runs.
         */
        override fun availabilityZone(availabilityZone: String) {
            cdkBuilder.availabilityZone(availabilityZone)
        }

        /**
         * A description of the instance profile.
         *
         * Descriptions can have up to 31 characters. A description can contain only ASCII letters,
         * digits, and hyphens ('-'). Also, it can't end with a hyphen or contain two consecutive
         * hyphens, and can only begin with a letter.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-instanceprofile.html#cfn-dms-instanceprofile-description)
         *
         * @param description A description of the instance profile.
         */
        override fun description(description: String) {
            cdkBuilder.description(description)
        }

        /**
         * The identifier of the instance profile.
         *
         * Identifiers must begin with a letter and must contain only ASCII letters, digits, and
         * hyphens. They can't end with a hyphen, or contain two consecutive hyphens.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-instanceprofile.html#cfn-dms-instanceprofile-instanceprofileidentifier)
         *
         * @param instanceProfileIdentifier The identifier of the instance profile.
         */
        override fun instanceProfileIdentifier(instanceProfileIdentifier: String) {
            cdkBuilder.instanceProfileIdentifier(instanceProfileIdentifier)
        }

        /**
         * The user-friendly name for the instance profile.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-instanceprofile.html#cfn-dms-instanceprofile-instanceprofilename)
         *
         * @param instanceProfileName The user-friendly name for the instance profile.
         */
        override fun instanceProfileName(instanceProfileName: String) {
            cdkBuilder.instanceProfileName(instanceProfileName)
        }

        /**
         * The Amazon Resource Name (ARN) of the AWS KMS key that is used to encrypt the connection
         * parameters for the instance profile.
         *
         * If you don't specify a value for the `KmsKeyArn` parameter, then AWS DMS uses your
         * default encryption key.
         *
         * AWS KMS creates the default encryption key for your AWS account . Your AWS account has a
         * different default encryption key for each AWS Region .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-instanceprofile.html#cfn-dms-instanceprofile-kmskeyarn)
         *
         * @param kmsKeyArn The Amazon Resource Name (ARN) of the AWS KMS key that is used to
         *   encrypt the connection parameters for the instance profile.
         */
        override fun kmsKeyArn(kmsKeyArn: String) {
            cdkBuilder.kmsKeyArn(kmsKeyArn)
        }

        /**
         * Specifies the network type for the instance profile.
         *
         * A value of `IPV4` represents an instance profile with IPv4 network type and only supports
         * IPv4 addressing. A value of `IPV6` represents an instance profile with IPv6 network type
         * and only supports IPv6 addressing. A value of `DUAL` represents an instance profile with
         * dual network type that supports IPv4 and IPv6 addressing.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-instanceprofile.html#cfn-dms-instanceprofile-networktype)
         *
         * @param networkType Specifies the network type for the instance profile.
         */
        override fun networkType(networkType: String) {
            cdkBuilder.networkType(networkType)
        }

        /**
         * Specifies the accessibility options for the instance profile.
         *
         * A value of `true` represents an instance profile with a public IP address. A value of
         * `false` represents an instance profile with a private IP address. The default value is
         * `true` .
         *
         * Default: - false
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-instanceprofile.html#cfn-dms-instanceprofile-publiclyaccessible)
         *
         * @param publiclyAccessible Specifies the accessibility options for the instance profile.
         */
        override fun publiclyAccessible(publiclyAccessible: Boolean) {
            cdkBuilder.publiclyAccessible(publiclyAccessible)
        }

        /**
         * Specifies the accessibility options for the instance profile.
         *
         * A value of `true` represents an instance profile with a public IP address. A value of
         * `false` represents an instance profile with a private IP address. The default value is
         * `true` .
         *
         * Default: - false
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-instanceprofile.html#cfn-dms-instanceprofile-publiclyaccessible)
         *
         * @param publiclyAccessible Specifies the accessibility options for the instance profile.
         */
        override fun publiclyAccessible(publiclyAccessible: IResolvable) {
            cdkBuilder.publiclyAccessible(publiclyAccessible.let(IResolvable::unwrap))
        }

        /**
         * The identifier of the subnet group that is associated with the instance profile.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-instanceprofile.html#cfn-dms-instanceprofile-subnetgroupidentifier)
         *
         * @param subnetGroupIdentifier The identifier of the subnet group that is associated with
         *   the instance profile.
         */
        override fun subnetGroupIdentifier(subnetGroupIdentifier: String) {
            cdkBuilder.subnetGroupIdentifier(subnetGroupIdentifier)
        }

        /**
         * An array of key-value pairs to apply to this resource.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-instanceprofile.html#cfn-dms-instanceprofile-tags)
         *
         * @param tags An array of key-value pairs to apply to this resource.
         */
        override fun tags(tags: List<CfnTag>) {
            cdkBuilder.tags(tags.map(CfnTag::unwrap))
        }

        /**
         * An array of key-value pairs to apply to this resource.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-instanceprofile.html#cfn-dms-instanceprofile-tags)
         *
         * @param tags An array of key-value pairs to apply to this resource.
         */
        override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

        /**
         * The VPC security groups that are used with the instance profile.
         *
         * The VPC security group must work with the VPC containing the instance profile.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-instanceprofile.html#cfn-dms-instanceprofile-vpcsecuritygroups)
         *
         * @param vpcSecurityGroups The VPC security groups that are used with the instance profile.
         */
        override fun vpcSecurityGroups(vpcSecurityGroups: List<String>) {
            cdkBuilder.vpcSecurityGroups(vpcSecurityGroups)
        }

        /**
         * The VPC security groups that are used with the instance profile.
         *
         * The VPC security group must work with the VPC containing the instance profile.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-instanceprofile.html#cfn-dms-instanceprofile-vpcsecuritygroups)
         *
         * @param vpcSecurityGroups The VPC security groups that are used with the instance profile.
         */
        override fun vpcSecurityGroups(vararg vpcSecurityGroups: String): Unit =
            vpcSecurityGroups(vpcSecurityGroups.toList())

        public fun build(): software.amazon.awscdk.services.dms.CfnInstanceProfile =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnInstanceProfile {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnInstanceProfile(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.dms.CfnInstanceProfile
        ): CfnInstanceProfile = CfnInstanceProfile(cdkObject)

        internal fun unwrap(
            wrapped: CfnInstanceProfile
        ): software.amazon.awscdk.services.dms.CfnInstanceProfile = wrapped.cdkObject
    }
}
