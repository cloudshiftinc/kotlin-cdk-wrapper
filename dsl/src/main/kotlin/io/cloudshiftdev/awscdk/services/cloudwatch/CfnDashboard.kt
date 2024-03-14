package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.String
import kotlin.Unit
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDashboard
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.cloudwatch.CfnDashboard,
) : CfnResource(cdkObject), IInspectable {
    /**  */
    public open fun attrId(): String = unwrap(this).getAttrId()

    /**
     * The detailed information about the dashboard in JSON format, including the widgets to include
     * and their location on the dashboard.
     */
    public open fun dashboardBody(): String = unwrap(this).getDashboardBody()

    /**
     * The detailed information about the dashboard in JSON format, including the widgets to include
     * and their location on the dashboard.
     */
    public open fun dashboardBody(`value`: String) {
        unwrap(this).setDashboardBody(`value`)
    }

    /** The name of the dashboard. */
    public open fun dashboardName(): String? = unwrap(this).getDashboardName()

    /** The name of the dashboard. */
    public open fun dashboardName(`value`: String) {
        unwrap(this).setDashboardName(`value`)
    }

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.cloudwatch.CfnDashboard]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * The detailed information about the dashboard in JSON format, including the widgets to
         * include and their location on the dashboard.
         *
         * For more information about the syntax, see
         * [Dashboard Body Structure and Syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/CloudWatch-Dashboard-Body-Structure.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-dashboard.html#cfn-cloudwatch-dashboard-dashboardbody)
         *
         * @param dashboardBody The detailed information about the dashboard in JSON format,
         *   including the widgets to include and their location on the dashboard.
         */
        public fun dashboardBody(dashboardBody: String)

        /**
         * The name of the dashboard.
         *
         * The name must be between 1 and 255 characters. If you do not specify a name, one will be
         * generated automatically.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-dashboard.html#cfn-cloudwatch-dashboard-dashboardname)
         *
         * @param dashboardName The name of the dashboard.
         */
        public fun dashboardName(dashboardName: String)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.CfnDashboard.Builder =
            software.amazon.awscdk.services.cloudwatch.CfnDashboard.Builder.create(scope, id)

        /**
         * The detailed information about the dashboard in JSON format, including the widgets to
         * include and their location on the dashboard.
         *
         * For more information about the syntax, see
         * [Dashboard Body Structure and Syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/CloudWatch-Dashboard-Body-Structure.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-dashboard.html#cfn-cloudwatch-dashboard-dashboardbody)
         *
         * @param dashboardBody The detailed information about the dashboard in JSON format,
         *   including the widgets to include and their location on the dashboard.
         */
        override fun dashboardBody(dashboardBody: String) {
            cdkBuilder.dashboardBody(dashboardBody)
        }

        /**
         * The name of the dashboard.
         *
         * The name must be between 1 and 255 characters. If you do not specify a name, one will be
         * generated automatically.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-dashboard.html#cfn-cloudwatch-dashboard-dashboardname)
         *
         * @param dashboardName The name of the dashboard.
         */
        override fun dashboardName(dashboardName: String) {
            cdkBuilder.dashboardName(dashboardName)
        }

        public fun build(): software.amazon.awscdk.services.cloudwatch.CfnDashboard =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnDashboard {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnDashboard(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.cloudwatch.CfnDashboard
        ): CfnDashboard = CfnDashboard(cdkObject)

        internal fun unwrap(
            wrapped: CfnDashboard
        ): software.amazon.awscdk.services.cloudwatch.CfnDashboard = wrapped.cdkObject
    }
}
