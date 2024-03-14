package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
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

public open class CfnDBClusterParameterGroup
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.rds.CfnDBClusterParameterGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
    /** The name of the DB cluster parameter group. */
    public open fun dbClusterParameterGroupName(): String? =
        unwrap(this).getDbClusterParameterGroupName()

    /** The name of the DB cluster parameter group. */
    public open fun dbClusterParameterGroupName(`value`: String) {
        unwrap(this).setDbClusterParameterGroupName(`value`)
    }

    /** A friendly description for this DB cluster parameter group. */
    public open fun description(): String = unwrap(this).getDescription()

    /** A friendly description for this DB cluster parameter group. */
    public open fun description(`value`: String) {
        unwrap(this).setDescription(`value`)
    }

    /** The DB cluster parameter group family name. */
    public open fun family(): String = unwrap(this).getFamily()

    /** The DB cluster parameter group family name. */
    public open fun family(`value`: String) {
        unwrap(this).setFamily(`value`)
    }

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** Provides a list of parameters for the DB cluster parameter group. */
    public open fun parameters(): Any = unwrap(this).getParameters()

    /** Provides a list of parameters for the DB cluster parameter group. */
    public open fun parameters(`value`: Any) {
        unwrap(this).setParameters(`value`)
    }

    /** Tag Manager which manages the tags for this resource. */
    public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

    /** An optional array of key-value pairs to apply to this DB cluster parameter group. */
    public open fun tagsRaw(): List<CfnTag> =
        unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?: emptyList()

    /** An optional array of key-value pairs to apply to this DB cluster parameter group. */
    public open fun tagsRaw(`value`: List<CfnTag>) {
        unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
    }

    /** An optional array of key-value pairs to apply to this DB cluster parameter group. */
    public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.rds.CfnDBClusterParameterGroup]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * The name of the DB cluster parameter group.
         *
         * Constraints:
         * * Must not match the name of an existing DB cluster parameter group.
         *
         * If you don't specify a value for `DBClusterParameterGroupName` property, a name is
         * automatically created for the DB cluster parameter group.
         *
         * This value is stored as a lowercase string.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbclusterparametergroup.html#cfn-rds-dbclusterparametergroup-dbclusterparametergroupname)
         *
         * @param dbClusterParameterGroupName The name of the DB cluster parameter group.
         */
        public fun dbClusterParameterGroupName(dbClusterParameterGroupName: String)

        /**
         * A friendly description for this DB cluster parameter group.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbclusterparametergroup.html#cfn-rds-dbclusterparametergroup-description)
         *
         * @param description A friendly description for this DB cluster parameter group.
         */
        public fun description(description: String)

        /**
         * The DB cluster parameter group family name.
         *
         * A DB cluster parameter group can be associated with one and only one DB cluster parameter
         * group family, and can be applied only to a DB cluster running a DB engine and engine
         * version compatible with that DB cluster parameter group family.
         *
         * The DB cluster parameter group family can't be changed when updating a DB cluster
         * parameter group.
         *
         * To list all of the available parameter group families, use the following command:
         *
         * `aws rds describe-db-engine-versions --query "DBEngineVersions[].DBParameterGroupFamily"`
         *
         * The output contains duplicates.
         *
         * For more information, see
         * `[CreateDBClusterParameterGroup](https://docs.aws.amazon.com//AmazonRDS/latest/APIReference/API_CreateDBClusterParameterGroup.html)`
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbclusterparametergroup.html#cfn-rds-dbclusterparametergroup-family)
         *
         * @param family The DB cluster parameter group family name.
         */
        public fun family(family: String)

        /**
         * Provides a list of parameters for the DB cluster parameter group.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbclusterparametergroup.html#cfn-rds-dbclusterparametergroup-parameters)
         *
         * @param parameters Provides a list of parameters for the DB cluster parameter group.
         */
        public fun parameters(parameters: Any)

        /**
         * An optional array of key-value pairs to apply to this DB cluster parameter group.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbclusterparametergroup.html#cfn-rds-dbclusterparametergroup-tags)
         *
         * @param tags An optional array of key-value pairs to apply to this DB cluster parameter
         *   group.
         */
        public fun tags(tags: List<CfnTag>)

        /**
         * An optional array of key-value pairs to apply to this DB cluster parameter group.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbclusterparametergroup.html#cfn-rds-dbclusterparametergroup-tags)
         *
         * @param tags An optional array of key-value pairs to apply to this DB cluster parameter
         *   group.
         */
        public fun tags(vararg tags: CfnTag)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.rds.CfnDBClusterParameterGroup.Builder =
            software.amazon.awscdk.services.rds.CfnDBClusterParameterGroup.Builder.create(scope, id)

        /**
         * The name of the DB cluster parameter group.
         *
         * Constraints:
         * * Must not match the name of an existing DB cluster parameter group.
         *
         * If you don't specify a value for `DBClusterParameterGroupName` property, a name is
         * automatically created for the DB cluster parameter group.
         *
         * This value is stored as a lowercase string.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbclusterparametergroup.html#cfn-rds-dbclusterparametergroup-dbclusterparametergroupname)
         *
         * @param dbClusterParameterGroupName The name of the DB cluster parameter group.
         */
        override fun dbClusterParameterGroupName(dbClusterParameterGroupName: String) {
            cdkBuilder.dbClusterParameterGroupName(dbClusterParameterGroupName)
        }

        /**
         * A friendly description for this DB cluster parameter group.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbclusterparametergroup.html#cfn-rds-dbclusterparametergroup-description)
         *
         * @param description A friendly description for this DB cluster parameter group.
         */
        override fun description(description: String) {
            cdkBuilder.description(description)
        }

        /**
         * The DB cluster parameter group family name.
         *
         * A DB cluster parameter group can be associated with one and only one DB cluster parameter
         * group family, and can be applied only to a DB cluster running a DB engine and engine
         * version compatible with that DB cluster parameter group family.
         *
         * The DB cluster parameter group family can't be changed when updating a DB cluster
         * parameter group.
         *
         * To list all of the available parameter group families, use the following command:
         *
         * `aws rds describe-db-engine-versions --query "DBEngineVersions[].DBParameterGroupFamily"`
         *
         * The output contains duplicates.
         *
         * For more information, see
         * `[CreateDBClusterParameterGroup](https://docs.aws.amazon.com//AmazonRDS/latest/APIReference/API_CreateDBClusterParameterGroup.html)`
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbclusterparametergroup.html#cfn-rds-dbclusterparametergroup-family)
         *
         * @param family The DB cluster parameter group family name.
         */
        override fun family(family: String) {
            cdkBuilder.family(family)
        }

        /**
         * Provides a list of parameters for the DB cluster parameter group.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbclusterparametergroup.html#cfn-rds-dbclusterparametergroup-parameters)
         *
         * @param parameters Provides a list of parameters for the DB cluster parameter group.
         */
        override fun parameters(parameters: Any) {
            cdkBuilder.parameters(parameters)
        }

        /**
         * An optional array of key-value pairs to apply to this DB cluster parameter group.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbclusterparametergroup.html#cfn-rds-dbclusterparametergroup-tags)
         *
         * @param tags An optional array of key-value pairs to apply to this DB cluster parameter
         *   group.
         */
        override fun tags(tags: List<CfnTag>) {
            cdkBuilder.tags(tags.map(CfnTag::unwrap))
        }

        /**
         * An optional array of key-value pairs to apply to this DB cluster parameter group.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbclusterparametergroup.html#cfn-rds-dbclusterparametergroup-tags)
         *
         * @param tags An optional array of key-value pairs to apply to this DB cluster parameter
         *   group.
         */
        override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

        public fun build(): software.amazon.awscdk.services.rds.CfnDBClusterParameterGroup =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnDBClusterParameterGroup {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnDBClusterParameterGroup(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.rds.CfnDBClusterParameterGroup
        ): CfnDBClusterParameterGroup = CfnDBClusterParameterGroup(cdkObject)

        internal fun unwrap(
            wrapped: CfnDBClusterParameterGroup
        ): software.amazon.awscdk.services.rds.CfnDBClusterParameterGroup = wrapped.cdkObject
    }
}
