package io.cloudshiftdev.awscdk.services.rds

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

public open class CfnDBSubnetGroup
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.rds.CfnDBSubnetGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
    /** The description for the DB subnet group. */
    public open fun dbSubnetGroupDescription(): String = unwrap(this).getDbSubnetGroupDescription()

    /** The description for the DB subnet group. */
    public open fun dbSubnetGroupDescription(`value`: String) {
        unwrap(this).setDbSubnetGroupDescription(`value`)
    }

    /**
     * The name for the DB subnet group.
     *
     * This value is stored as a lowercase string.
     */
    public open fun dbSubnetGroupName(): String? = unwrap(this).getDbSubnetGroupName()

    /**
     * The name for the DB subnet group.
     *
     * This value is stored as a lowercase string.
     */
    public open fun dbSubnetGroupName(`value`: String) {
        unwrap(this).setDbSubnetGroupName(`value`)
    }

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** The EC2 Subnet IDs for the DB subnet group. */
    public open fun subnetIds(): List<String> = unwrap(this).getSubnetIds()

    /** The EC2 Subnet IDs for the DB subnet group. */
    public open fun subnetIds(`value`: List<String>) {
        unwrap(this).setSubnetIds(`value`)
    }

    /** The EC2 Subnet IDs for the DB subnet group. */
    public open fun subnetIds(vararg `value`: String): Unit = subnetIds(`value`.toList())

    /** Tag Manager which manages the tags for this resource. */
    public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

    /** An optional array of key-value pairs to apply to this DB subnet group. */
    public open fun tagsRaw(): List<CfnTag> =
        unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?: emptyList()

    /** An optional array of key-value pairs to apply to this DB subnet group. */
    public open fun tagsRaw(`value`: List<CfnTag>) {
        unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
    }

    /** An optional array of key-value pairs to apply to this DB subnet group. */
    public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.rds.CfnDBSubnetGroup]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * The description for the DB subnet group.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnetgroup.html#cfn-rds-dbsubnetgroup-dbsubnetgroupdescription)
         *
         * @param dbSubnetGroupDescription The description for the DB subnet group.
         */
        public fun dbSubnetGroupDescription(dbSubnetGroupDescription: String)

        /**
         * The name for the DB subnet group. This value is stored as a lowercase string.
         *
         * Constraints: Must contain no more than 255 lowercase alphanumeric characters or hyphens.
         * Must not be "Default".
         *
         * Example: `mysubnetgroup`
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnetgroup.html#cfn-rds-dbsubnetgroup-dbsubnetgroupname)
         *
         * @param dbSubnetGroupName The name for the DB subnet group. This value is stored as a
         *   lowercase string.
         */
        public fun dbSubnetGroupName(dbSubnetGroupName: String)

        /**
         * The EC2 Subnet IDs for the DB subnet group.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnetgroup.html#cfn-rds-dbsubnetgroup-subnetids)
         *
         * @param subnetIds The EC2 Subnet IDs for the DB subnet group.
         */
        public fun subnetIds(subnetIds: List<String>)

        /**
         * The EC2 Subnet IDs for the DB subnet group.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnetgroup.html#cfn-rds-dbsubnetgroup-subnetids)
         *
         * @param subnetIds The EC2 Subnet IDs for the DB subnet group.
         */
        public fun subnetIds(vararg subnetIds: String)

        /**
         * An optional array of key-value pairs to apply to this DB subnet group.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnetgroup.html#cfn-rds-dbsubnetgroup-tags)
         *
         * @param tags An optional array of key-value pairs to apply to this DB subnet group.
         */
        public fun tags(tags: List<CfnTag>)

        /**
         * An optional array of key-value pairs to apply to this DB subnet group.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnetgroup.html#cfn-rds-dbsubnetgroup-tags)
         *
         * @param tags An optional array of key-value pairs to apply to this DB subnet group.
         */
        public fun tags(vararg tags: CfnTag)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.rds.CfnDBSubnetGroup.Builder =
            software.amazon.awscdk.services.rds.CfnDBSubnetGroup.Builder.create(scope, id)

        /**
         * The description for the DB subnet group.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnetgroup.html#cfn-rds-dbsubnetgroup-dbsubnetgroupdescription)
         *
         * @param dbSubnetGroupDescription The description for the DB subnet group.
         */
        override fun dbSubnetGroupDescription(dbSubnetGroupDescription: String) {
            cdkBuilder.dbSubnetGroupDescription(dbSubnetGroupDescription)
        }

        /**
         * The name for the DB subnet group. This value is stored as a lowercase string.
         *
         * Constraints: Must contain no more than 255 lowercase alphanumeric characters or hyphens.
         * Must not be "Default".
         *
         * Example: `mysubnetgroup`
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnetgroup.html#cfn-rds-dbsubnetgroup-dbsubnetgroupname)
         *
         * @param dbSubnetGroupName The name for the DB subnet group. This value is stored as a
         *   lowercase string.
         */
        override fun dbSubnetGroupName(dbSubnetGroupName: String) {
            cdkBuilder.dbSubnetGroupName(dbSubnetGroupName)
        }

        /**
         * The EC2 Subnet IDs for the DB subnet group.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnetgroup.html#cfn-rds-dbsubnetgroup-subnetids)
         *
         * @param subnetIds The EC2 Subnet IDs for the DB subnet group.
         */
        override fun subnetIds(subnetIds: List<String>) {
            cdkBuilder.subnetIds(subnetIds)
        }

        /**
         * The EC2 Subnet IDs for the DB subnet group.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnetgroup.html#cfn-rds-dbsubnetgroup-subnetids)
         *
         * @param subnetIds The EC2 Subnet IDs for the DB subnet group.
         */
        override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

        /**
         * An optional array of key-value pairs to apply to this DB subnet group.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnetgroup.html#cfn-rds-dbsubnetgroup-tags)
         *
         * @param tags An optional array of key-value pairs to apply to this DB subnet group.
         */
        override fun tags(tags: List<CfnTag>) {
            cdkBuilder.tags(tags.map(CfnTag::unwrap))
        }

        /**
         * An optional array of key-value pairs to apply to this DB subnet group.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsubnetgroup.html#cfn-rds-dbsubnetgroup-tags)
         *
         * @param tags An optional array of key-value pairs to apply to this DB subnet group.
         */
        override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

        public fun build(): software.amazon.awscdk.services.rds.CfnDBSubnetGroup =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnDBSubnetGroup {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnDBSubnetGroup(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.rds.CfnDBSubnetGroup
        ): CfnDBSubnetGroup = CfnDBSubnetGroup(cdkObject)

        internal fun unwrap(
            wrapped: CfnDBSubnetGroup
        ): software.amazon.awscdk.services.rds.CfnDBSubnetGroup = wrapped.cdkObject
    }
}
