package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Number
import kotlin.String
import kotlin.Unit
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnViewVersion
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.connect.CfnViewVersion,
) : CfnResource(cdkObject), IInspectable {
    /** Current version of the view. */
    public open fun attrVersion(): Number = unwrap(this).getAttrVersion()

    /** The Amazon Resource Name (ARN) of the view version. */
    public open fun attrViewVersionArn(): String = unwrap(this).getAttrViewVersionArn()

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** The description of the view version. */
    public open fun versionDescription(): String? = unwrap(this).getVersionDescription()

    /** The description of the view version. */
    public open fun versionDescription(`value`: String) {
        unwrap(this).setVersionDescription(`value`)
    }

    /** The unqualified Amazon Resource Name (ARN) of the view. */
    public open fun viewArn(): String = unwrap(this).getViewArn()

    /** The unqualified Amazon Resource Name (ARN) of the view. */
    public open fun viewArn(`value`: String) {
        unwrap(this).setViewArn(`value`)
    }

    /** Indicates the checksum value of the latest published view content. */
    public open fun viewContentSha256(): String? = unwrap(this).getViewContentSha256()

    /** Indicates the checksum value of the latest published view content. */
    public open fun viewContentSha256(`value`: String) {
        unwrap(this).setViewContentSha256(`value`)
    }

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.connect.CfnViewVersion]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * The description of the view version.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-viewversion.html#cfn-connect-viewversion-versiondescription)
         *
         * @param versionDescription The description of the view version.
         */
        public fun versionDescription(versionDescription: String)

        /**
         * The unqualified Amazon Resource Name (ARN) of the view.
         *
         * For example:
         *
         * `arn:&lt;partition&gt;:connect:&lt;region&gt;:&lt;accountId&gt;:instance/00000000-0000-0000-0000-000000000000/view/00000000-0000-0000-0000-000000000000`
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-viewversion.html#cfn-connect-viewversion-viewarn)
         *
         * @param viewArn The unqualified Amazon Resource Name (ARN) of the view.
         */
        public fun viewArn(viewArn: String)

        /**
         * Indicates the checksum value of the latest published view content.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-viewversion.html#cfn-connect-viewversion-viewcontentsha256)
         *
         * @param viewContentSha256 Indicates the checksum value of the latest published view
         *   content.
         */
        public fun viewContentSha256(viewContentSha256: String)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.connect.CfnViewVersion.Builder =
            software.amazon.awscdk.services.connect.CfnViewVersion.Builder.create(scope, id)

        /**
         * The description of the view version.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-viewversion.html#cfn-connect-viewversion-versiondescription)
         *
         * @param versionDescription The description of the view version.
         */
        override fun versionDescription(versionDescription: String) {
            cdkBuilder.versionDescription(versionDescription)
        }

        /**
         * The unqualified Amazon Resource Name (ARN) of the view.
         *
         * For example:
         *
         * `arn:&lt;partition&gt;:connect:&lt;region&gt;:&lt;accountId&gt;:instance/00000000-0000-0000-0000-000000000000/view/00000000-0000-0000-0000-000000000000`
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-viewversion.html#cfn-connect-viewversion-viewarn)
         *
         * @param viewArn The unqualified Amazon Resource Name (ARN) of the view.
         */
        override fun viewArn(viewArn: String) {
            cdkBuilder.viewArn(viewArn)
        }

        /**
         * Indicates the checksum value of the latest published view content.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-viewversion.html#cfn-connect-viewversion-viewcontentsha256)
         *
         * @param viewContentSha256 Indicates the checksum value of the latest published view
         *   content.
         */
        override fun viewContentSha256(viewContentSha256: String) {
            cdkBuilder.viewContentSha256(viewContentSha256)
        }

        public fun build(): software.amazon.awscdk.services.connect.CfnViewVersion =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnViewVersion {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnViewVersion(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.connect.CfnViewVersion
        ): CfnViewVersion = CfnViewVersion(cdkObject)

        internal fun unwrap(
            wrapped: CfnViewVersion
        ): software.amazon.awscdk.services.connect.CfnViewVersion = wrapped.cdkObject
    }
}
