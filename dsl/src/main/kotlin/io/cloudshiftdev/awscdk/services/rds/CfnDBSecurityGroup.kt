package io.cloudshiftdev.awscdk.services.rds

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
import kotlin.Unit
import kotlin.collections.List
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDBSecurityGroup
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.rds.CfnDBSecurityGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
    /**  */
    public open fun attrId(): String = unwrap(this).getAttrId()

    /** Ingress rules to be applied to the DB security group. */
    public open fun dbSecurityGroupIngress(): Any = unwrap(this).getDbSecurityGroupIngress()

    /** Ingress rules to be applied to the DB security group. */
    public open fun dbSecurityGroupIngress(`value`: IResolvable) {
        unwrap(this).setDbSecurityGroupIngress(`value`.let(IResolvable::unwrap))
    }

    /** Ingress rules to be applied to the DB security group. */
    public open fun dbSecurityGroupIngress(__idx_ac66f0: List<Any>) {
        unwrap(this).setDbSecurityGroupIngress(__idx_ac66f0)
    }

    /** Ingress rules to be applied to the DB security group. */
    public open fun dbSecurityGroupIngress(vararg __idx_ac66f0: Any): Unit =
        dbSecurityGroupIngress(__idx_ac66f0.toList())

    /**
     * The identifier of an Amazon VPC.
     *
     * This property indicates the VPC that this DB security group belongs to.
     */
    public open fun ec2VpcId(): String? = unwrap(this).getEc2VpcId()

    /**
     * The identifier of an Amazon VPC.
     *
     * This property indicates the VPC that this DB security group belongs to.
     */
    public open fun ec2VpcId(`value`: String) {
        unwrap(this).setEc2VpcId(`value`)
    }

    /** Provides the description of the DB security group. */
    public open fun groupDescription(): String = unwrap(this).getGroupDescription()

    /** Provides the description of the DB security group. */
    public open fun groupDescription(`value`: String) {
        unwrap(this).setGroupDescription(`value`)
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

    /** An optional array of key-value pairs to apply to this DB security group. */
    public open fun tagsRaw(): List<CfnTag> =
        unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?: emptyList()

    /** An optional array of key-value pairs to apply to this DB security group. */
    public open fun tagsRaw(`value`: List<CfnTag>) {
        unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
    }

    /** An optional array of key-value pairs to apply to this DB security group. */
    public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.rds.CfnDBSecurityGroup]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * Ingress rules to be applied to the DB security group.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroup.html#cfn-rds-dbsecuritygroup-dbsecuritygroupingress)
         *
         * @param dbSecurityGroupIngress Ingress rules to be applied to the DB security group.
         */
        public fun dbSecurityGroupIngress(dbSecurityGroupIngress: IResolvable)

        /**
         * Ingress rules to be applied to the DB security group.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroup.html#cfn-rds-dbsecuritygroup-dbsecuritygroupingress)
         *
         * @param dbSecurityGroupIngress Ingress rules to be applied to the DB security group.
         */
        public fun dbSecurityGroupIngress(dbSecurityGroupIngress: List<Any>)

        /**
         * Ingress rules to be applied to the DB security group.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroup.html#cfn-rds-dbsecuritygroup-dbsecuritygroupingress)
         *
         * @param dbSecurityGroupIngress Ingress rules to be applied to the DB security group.
         */
        public fun dbSecurityGroupIngress(vararg dbSecurityGroupIngress: Any)

        /**
         * The identifier of an Amazon VPC. This property indicates the VPC that this DB security
         * group belongs to.
         *
         * The `EC2VpcId` property is for backward compatibility with older regions, and is no
         * longer recommended for providing security information to an RDS DB instance.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroup.html#cfn-rds-dbsecuritygroup-ec2vpcid)
         *
         * @param ec2VpcId The identifier of an Amazon VPC. This property indicates the VPC that
         *   this DB security group belongs to.
         */
        public fun ec2VpcId(ec2VpcId: String)

        /**
         * Provides the description of the DB security group.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroup.html#cfn-rds-dbsecuritygroup-groupdescription)
         *
         * @param groupDescription Provides the description of the DB security group.
         */
        public fun groupDescription(groupDescription: String)

        /**
         * An optional array of key-value pairs to apply to this DB security group.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroup.html#cfn-rds-dbsecuritygroup-tags)
         *
         * @param tags An optional array of key-value pairs to apply to this DB security group.
         */
        public fun tags(tags: List<CfnTag>)

        /**
         * An optional array of key-value pairs to apply to this DB security group.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroup.html#cfn-rds-dbsecuritygroup-tags)
         *
         * @param tags An optional array of key-value pairs to apply to this DB security group.
         */
        public fun tags(vararg tags: CfnTag)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.rds.CfnDBSecurityGroup.Builder =
            software.amazon.awscdk.services.rds.CfnDBSecurityGroup.Builder.create(scope, id)

        /**
         * Ingress rules to be applied to the DB security group.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroup.html#cfn-rds-dbsecuritygroup-dbsecuritygroupingress)
         *
         * @param dbSecurityGroupIngress Ingress rules to be applied to the DB security group.
         */
        override fun dbSecurityGroupIngress(dbSecurityGroupIngress: IResolvable) {
            cdkBuilder.dbSecurityGroupIngress(dbSecurityGroupIngress.let(IResolvable::unwrap))
        }

        /**
         * Ingress rules to be applied to the DB security group.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroup.html#cfn-rds-dbsecuritygroup-dbsecuritygroupingress)
         *
         * @param dbSecurityGroupIngress Ingress rules to be applied to the DB security group.
         */
        override fun dbSecurityGroupIngress(dbSecurityGroupIngress: List<Any>) {
            cdkBuilder.dbSecurityGroupIngress(dbSecurityGroupIngress)
        }

        /**
         * Ingress rules to be applied to the DB security group.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroup.html#cfn-rds-dbsecuritygroup-dbsecuritygroupingress)
         *
         * @param dbSecurityGroupIngress Ingress rules to be applied to the DB security group.
         */
        override fun dbSecurityGroupIngress(vararg dbSecurityGroupIngress: Any): Unit =
            dbSecurityGroupIngress(dbSecurityGroupIngress.toList())

        /**
         * The identifier of an Amazon VPC. This property indicates the VPC that this DB security
         * group belongs to.
         *
         * The `EC2VpcId` property is for backward compatibility with older regions, and is no
         * longer recommended for providing security information to an RDS DB instance.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroup.html#cfn-rds-dbsecuritygroup-ec2vpcid)
         *
         * @param ec2VpcId The identifier of an Amazon VPC. This property indicates the VPC that
         *   this DB security group belongs to.
         */
        override fun ec2VpcId(ec2VpcId: String) {
            cdkBuilder.ec2VpcId(ec2VpcId)
        }

        /**
         * Provides the description of the DB security group.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroup.html#cfn-rds-dbsecuritygroup-groupdescription)
         *
         * @param groupDescription Provides the description of the DB security group.
         */
        override fun groupDescription(groupDescription: String) {
            cdkBuilder.groupDescription(groupDescription)
        }

        /**
         * An optional array of key-value pairs to apply to this DB security group.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroup.html#cfn-rds-dbsecuritygroup-tags)
         *
         * @param tags An optional array of key-value pairs to apply to this DB security group.
         */
        override fun tags(tags: List<CfnTag>) {
            cdkBuilder.tags(tags.map(CfnTag::unwrap))
        }

        /**
         * An optional array of key-value pairs to apply to this DB security group.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroup.html#cfn-rds-dbsecuritygroup-tags)
         *
         * @param tags An optional array of key-value pairs to apply to this DB security group.
         */
        override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

        public fun build(): software.amazon.awscdk.services.rds.CfnDBSecurityGroup =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnDBSecurityGroup {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnDBSecurityGroup(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.rds.CfnDBSecurityGroup
        ): CfnDBSecurityGroup = CfnDBSecurityGroup(cdkObject)

        internal fun unwrap(
            wrapped: CfnDBSecurityGroup
        ): software.amazon.awscdk.services.rds.CfnDBSecurityGroup = wrapped.cdkObject
    }

    public interface IngressProperty {
        /**
         * The IP range to authorize.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbsecuritygroup-ingress.html#cfn-rds-dbsecuritygroup-ingress-cidrip)
         */
        public fun cidrip(): String? = unwrap(this).getCidrip()

        /**
         * Id of the EC2 security group to authorize.
         *
         * For VPC DB security groups, `EC2SecurityGroupId` must be provided. Otherwise,
         * `EC2SecurityGroupOwnerId` and either `EC2SecurityGroupName` or `EC2SecurityGroupId` must
         * be provided.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbsecuritygroup-ingress.html#cfn-rds-dbsecuritygroup-ingress-ec2securitygroupid)
         */
        public fun ec2SecurityGroupId(): String? = unwrap(this).getEc2SecurityGroupId()

        /**
         * Name of the EC2 security group to authorize.
         *
         * For VPC DB security groups, `EC2SecurityGroupId` must be provided. Otherwise,
         * `EC2SecurityGroupOwnerId` and either `EC2SecurityGroupName` or `EC2SecurityGroupId` must
         * be provided.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbsecuritygroup-ingress.html#cfn-rds-dbsecuritygroup-ingress-ec2securitygroupname)
         */
        public fun ec2SecurityGroupName(): String? = unwrap(this).getEc2SecurityGroupName()

        /**
         * AWS account number of the owner of the EC2 security group specified in the
         * `EC2SecurityGroupName` parameter.
         *
         * The AWS access key ID isn't an acceptable value. For VPC DB security groups,
         * `EC2SecurityGroupId` must be provided. Otherwise, `EC2SecurityGroupOwnerId` and either
         * `EC2SecurityGroupName` or `EC2SecurityGroupId` must be provided.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbsecuritygroup-ingress.html#cfn-rds-dbsecuritygroup-ingress-ec2securitygroupownerid)
         */
        public fun ec2SecurityGroupOwnerId(): String? = unwrap(this).getEc2SecurityGroupOwnerId()

        /** A builder for [IngressProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param cidrip The IP range to authorize. */
            public fun cidrip(cidrip: String)

            /**
             * @param ec2SecurityGroupId Id of the EC2 security group to authorize. For VPC DB
             *   security groups, `EC2SecurityGroupId` must be provided. Otherwise,
             *   `EC2SecurityGroupOwnerId` and either `EC2SecurityGroupName` or `EC2SecurityGroupId`
             *   must be provided.
             */
            public fun ec2SecurityGroupId(ec2SecurityGroupId: String)

            /**
             * @param ec2SecurityGroupName Name of the EC2 security group to authorize. For VPC DB
             *   security groups, `EC2SecurityGroupId` must be provided. Otherwise,
             *   `EC2SecurityGroupOwnerId` and either `EC2SecurityGroupName` or `EC2SecurityGroupId`
             *   must be provided.
             */
            public fun ec2SecurityGroupName(ec2SecurityGroupName: String)

            /**
             * @param ec2SecurityGroupOwnerId AWS account number of the owner of the EC2 security
             *   group specified in the `EC2SecurityGroupName` parameter. The AWS access key ID
             *   isn't an acceptable value. For VPC DB security groups, `EC2SecurityGroupId` must be
             *   provided. Otherwise, `EC2SecurityGroupOwnerId` and either `EC2SecurityGroupName` or
             *   `EC2SecurityGroupId` must be provided.
             */
            public fun ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.rds.CfnDBSecurityGroup.IngressProperty.Builder =
                software.amazon.awscdk.services.rds.CfnDBSecurityGroup.IngressProperty.builder()

            /** @param cidrip The IP range to authorize. */
            override fun cidrip(cidrip: String) {
                cdkBuilder.cidrip(cidrip)
            }

            /**
             * @param ec2SecurityGroupId Id of the EC2 security group to authorize. For VPC DB
             *   security groups, `EC2SecurityGroupId` must be provided. Otherwise,
             *   `EC2SecurityGroupOwnerId` and either `EC2SecurityGroupName` or `EC2SecurityGroupId`
             *   must be provided.
             */
            override fun ec2SecurityGroupId(ec2SecurityGroupId: String) {
                cdkBuilder.ec2SecurityGroupId(ec2SecurityGroupId)
            }

            /**
             * @param ec2SecurityGroupName Name of the EC2 security group to authorize. For VPC DB
             *   security groups, `EC2SecurityGroupId` must be provided. Otherwise,
             *   `EC2SecurityGroupOwnerId` and either `EC2SecurityGroupName` or `EC2SecurityGroupId`
             *   must be provided.
             */
            override fun ec2SecurityGroupName(ec2SecurityGroupName: String) {
                cdkBuilder.ec2SecurityGroupName(ec2SecurityGroupName)
            }

            /**
             * @param ec2SecurityGroupOwnerId AWS account number of the owner of the EC2 security
             *   group specified in the `EC2SecurityGroupName` parameter. The AWS access key ID
             *   isn't an acceptable value. For VPC DB security groups, `EC2SecurityGroupId` must be
             *   provided. Otherwise, `EC2SecurityGroupOwnerId` and either `EC2SecurityGroupName` or
             *   `EC2SecurityGroupId` must be provided.
             */
            override fun ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId: String) {
                cdkBuilder.ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId)
            }

            public fun build():
                software.amazon.awscdk.services.rds.CfnDBSecurityGroup.IngressProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.rds.CfnDBSecurityGroup.IngressProperty,
        ) : IngressProperty {
            /**
             * The IP range to authorize.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbsecuritygroup-ingress.html#cfn-rds-dbsecuritygroup-ingress-cidrip)
             */
            override fun cidrip(): String? = unwrap(this).getCidrip()

            /**
             * Id of the EC2 security group to authorize.
             *
             * For VPC DB security groups, `EC2SecurityGroupId` must be provided. Otherwise,
             * `EC2SecurityGroupOwnerId` and either `EC2SecurityGroupName` or `EC2SecurityGroupId`
             * must be provided.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbsecuritygroup-ingress.html#cfn-rds-dbsecuritygroup-ingress-ec2securitygroupid)
             */
            override fun ec2SecurityGroupId(): String? = unwrap(this).getEc2SecurityGroupId()

            /**
             * Name of the EC2 security group to authorize.
             *
             * For VPC DB security groups, `EC2SecurityGroupId` must be provided. Otherwise,
             * `EC2SecurityGroupOwnerId` and either `EC2SecurityGroupName` or `EC2SecurityGroupId`
             * must be provided.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbsecuritygroup-ingress.html#cfn-rds-dbsecuritygroup-ingress-ec2securitygroupname)
             */
            override fun ec2SecurityGroupName(): String? = unwrap(this).getEc2SecurityGroupName()

            /**
             * AWS account number of the owner of the EC2 security group specified in the
             * `EC2SecurityGroupName` parameter.
             *
             * The AWS access key ID isn't an acceptable value. For VPC DB security groups,
             * `EC2SecurityGroupId` must be provided. Otherwise, `EC2SecurityGroupOwnerId` and
             * either `EC2SecurityGroupName` or `EC2SecurityGroupId` must be provided.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbsecuritygroup-ingress.html#cfn-rds-dbsecuritygroup-ingress-ec2securitygroupownerid)
             */
            override fun ec2SecurityGroupOwnerId(): String? =
                unwrap(this).getEc2SecurityGroupOwnerId()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): IngressProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.rds.CfnDBSecurityGroup.IngressProperty
            ): IngressProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: IngressProperty
            ): software.amazon.awscdk.services.rds.CfnDBSecurityGroup.IngressProperty =
                (wrapped as Wrapper).cdkObject
        }
    }
}
