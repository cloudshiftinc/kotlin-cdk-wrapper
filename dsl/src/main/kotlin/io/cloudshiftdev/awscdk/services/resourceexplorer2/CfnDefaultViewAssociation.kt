package io.cloudshiftdev.awscdk.services.resourceexplorer2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.String
import kotlin.Unit
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDefaultViewAssociation
internal constructor(
    private val cdkObject:
        software.amazon.awscdk.services.resourceexplorer2.CfnDefaultViewAssociation,
) : CfnResource(cdkObject), IInspectable {
    /**
     * The unique identifier of the principal for which the specified view was made the default for
     * the AWS Region that contains the view.
     *
     * For example:
     *
     * `123456789012`
     */
    public open fun attrAssociatedAwsPrincipal(): String =
        unwrap(this).getAttrAssociatedAwsPrincipal()

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /**
     * The ARN of the view to set as the default for the AWS Region and AWS account in which you
     * call this operation.
     */
    public open fun viewArn(): String = unwrap(this).getViewArn()

    /**
     * The ARN of the view to set as the default for the AWS Region and AWS account in which you
     * call this operation.
     */
    public open fun viewArn(`value`: String) {
        unwrap(this).setViewArn(`value`)
    }

    /**
     * A fluent builder for
     * [io.cloudshiftdev.awscdk.services.resourceexplorer2.CfnDefaultViewAssociation].
     */
    @CdkDslMarker
    public interface Builder {
        /**
         * The ARN of the view to set as the default for the AWS Region and AWS account in which you
         * call this operation.
         *
         * The specified view must already exist in the specified Region.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-defaultviewassociation.html#cfn-resourceexplorer2-defaultviewassociation-viewarn)
         *
         * @param viewArn The ARN of the view to set as the default for the AWS Region and AWS
         *   account in which you call this operation.
         */
        public fun viewArn(viewArn: String)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.resourceexplorer2.CfnDefaultViewAssociation.Builder =
            software.amazon.awscdk.services.resourceexplorer2.CfnDefaultViewAssociation.Builder
                .create(scope, id)

        /**
         * The ARN of the view to set as the default for the AWS Region and AWS account in which you
         * call this operation.
         *
         * The specified view must already exist in the specified Region.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-defaultviewassociation.html#cfn-resourceexplorer2-defaultviewassociation-viewarn)
         *
         * @param viewArn The ARN of the view to set as the default for the AWS Region and AWS
         *   account in which you call this operation.
         */
        override fun viewArn(viewArn: String) {
            cdkBuilder.viewArn(viewArn)
        }

        public fun build():
            software.amazon.awscdk.services.resourceexplorer2.CfnDefaultViewAssociation =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnDefaultViewAssociation {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnDefaultViewAssociation(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.resourceexplorer2.CfnDefaultViewAssociation
        ): CfnDefaultViewAssociation = CfnDefaultViewAssociation(cdkObject)

        internal fun unwrap(
            wrapped: CfnDefaultViewAssociation
        ): software.amazon.awscdk.services.resourceexplorer2.CfnDefaultViewAssociation =
            wrapped.cdkObject
    }
}
