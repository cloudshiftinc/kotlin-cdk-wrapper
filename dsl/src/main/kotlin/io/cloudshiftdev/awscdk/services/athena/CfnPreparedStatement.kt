package io.cloudshiftdev.awscdk.services.athena

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.String
import kotlin.Unit
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnPreparedStatement
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.athena.CfnPreparedStatement,
) : CfnResource(cdkObject), IInspectable {
    /** The description of the prepared statement. */
    public open fun description(): String? = unwrap(this).getDescription()

    /** The description of the prepared statement. */
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

    /** The query string for the prepared statement. */
    public open fun queryStatement(): String = unwrap(this).getQueryStatement()

    /** The query string for the prepared statement. */
    public open fun queryStatement(`value`: String) {
        unwrap(this).setQueryStatement(`value`)
    }

    /** The name of the prepared statement. */
    public open fun statementName(): String = unwrap(this).getStatementName()

    /** The name of the prepared statement. */
    public open fun statementName(`value`: String) {
        unwrap(this).setStatementName(`value`)
    }

    /** The workgroup to which the prepared statement belongs. */
    public open fun workGroup(): String = unwrap(this).getWorkGroup()

    /** The workgroup to which the prepared statement belongs. */
    public open fun workGroup(`value`: String) {
        unwrap(this).setWorkGroup(`value`)
    }

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.athena.CfnPreparedStatement]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * The description of the prepared statement.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-preparedstatement.html#cfn-athena-preparedstatement-description)
         *
         * @param description The description of the prepared statement.
         */
        public fun description(description: String)

        /**
         * The query string for the prepared statement.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-preparedstatement.html#cfn-athena-preparedstatement-querystatement)
         *
         * @param queryStatement The query string for the prepared statement.
         */
        public fun queryStatement(queryStatement: String)

        /**
         * The name of the prepared statement.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-preparedstatement.html#cfn-athena-preparedstatement-statementname)
         *
         * @param statementName The name of the prepared statement.
         */
        public fun statementName(statementName: String)

        /**
         * The workgroup to which the prepared statement belongs.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-preparedstatement.html#cfn-athena-preparedstatement-workgroup)
         *
         * @param workGroup The workgroup to which the prepared statement belongs.
         */
        public fun workGroup(workGroup: String)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.athena.CfnPreparedStatement.Builder =
            software.amazon.awscdk.services.athena.CfnPreparedStatement.Builder.create(scope, id)

        /**
         * The description of the prepared statement.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-preparedstatement.html#cfn-athena-preparedstatement-description)
         *
         * @param description The description of the prepared statement.
         */
        override fun description(description: String) {
            cdkBuilder.description(description)
        }

        /**
         * The query string for the prepared statement.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-preparedstatement.html#cfn-athena-preparedstatement-querystatement)
         *
         * @param queryStatement The query string for the prepared statement.
         */
        override fun queryStatement(queryStatement: String) {
            cdkBuilder.queryStatement(queryStatement)
        }

        /**
         * The name of the prepared statement.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-preparedstatement.html#cfn-athena-preparedstatement-statementname)
         *
         * @param statementName The name of the prepared statement.
         */
        override fun statementName(statementName: String) {
            cdkBuilder.statementName(statementName)
        }

        /**
         * The workgroup to which the prepared statement belongs.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-preparedstatement.html#cfn-athena-preparedstatement-workgroup)
         *
         * @param workGroup The workgroup to which the prepared statement belongs.
         */
        override fun workGroup(workGroup: String) {
            cdkBuilder.workGroup(workGroup)
        }

        public fun build(): software.amazon.awscdk.services.athena.CfnPreparedStatement =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnPreparedStatement {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnPreparedStatement(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.athena.CfnPreparedStatement
        ): CfnPreparedStatement = CfnPreparedStatement(cdkObject)

        internal fun unwrap(
            wrapped: CfnPreparedStatement
        ): software.amazon.awscdk.services.athena.CfnPreparedStatement = wrapped.cdkObject
    }
}
