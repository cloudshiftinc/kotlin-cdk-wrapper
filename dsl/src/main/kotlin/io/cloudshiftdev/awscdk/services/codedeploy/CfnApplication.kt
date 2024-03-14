package io.cloudshiftdev.awscdk.services.codedeploy

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

public open class CfnApplication
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.codedeploy.CfnApplication,
) : CfnResource(cdkObject), IInspectable, ITaggable {
    /** A name for the application. */
    public open fun applicationName(): String? = unwrap(this).getApplicationName()

    /** A name for the application. */
    public open fun applicationName(`value`: String) {
        unwrap(this).setApplicationName(`value`)
    }

    /** The compute platform that CodeDeploy deploys the application to. */
    public open fun computePlatform(): String? = unwrap(this).getComputePlatform()

    /** The compute platform that CodeDeploy deploys the application to. */
    public open fun computePlatform(`value`: String) {
        unwrap(this).setComputePlatform(`value`)
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

    /**
     * The metadata that you apply to CodeDeploy applications to help you organize and categorize
     * them.
     */
    public open fun tagsRaw(): List<CfnTag> =
        unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The metadata that you apply to CodeDeploy applications to help you organize and categorize
     * them.
     */
    public open fun tagsRaw(`value`: List<CfnTag>) {
        unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
    }

    /**
     * The metadata that you apply to CodeDeploy applications to help you organize and categorize
     * them.
     */
    public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.codedeploy.CfnApplication]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * A name for the application.
         *
         * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses
         * that ID for the application name. For more information, see
         * [Name Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html)
         * .
         *
         * Updates to `ApplicationName` are not supported.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-application.html#cfn-codedeploy-application-applicationname)
         *
         * @param applicationName A name for the application.
         */
        public fun applicationName(applicationName: String)

        /**
         * The compute platform that CodeDeploy deploys the application to.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-application.html#cfn-codedeploy-application-computeplatform)
         *
         * @param computePlatform The compute platform that CodeDeploy deploys the application to.
         */
        public fun computePlatform(computePlatform: String)

        /**
         * The metadata that you apply to CodeDeploy applications to help you organize and
         * categorize them.
         *
         * Each tag consists of a key and an optional value, both of which you define.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-application.html#cfn-codedeploy-application-tags)
         *
         * @param tags The metadata that you apply to CodeDeploy applications to help you organize
         *   and categorize them.
         */
        public fun tags(tags: List<CfnTag>)

        /**
         * The metadata that you apply to CodeDeploy applications to help you organize and
         * categorize them.
         *
         * Each tag consists of a key and an optional value, both of which you define.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-application.html#cfn-codedeploy-application-tags)
         *
         * @param tags The metadata that you apply to CodeDeploy applications to help you organize
         *   and categorize them.
         */
        public fun tags(vararg tags: CfnTag)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.codedeploy.CfnApplication.Builder =
            software.amazon.awscdk.services.codedeploy.CfnApplication.Builder.create(scope, id)

        /**
         * A name for the application.
         *
         * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses
         * that ID for the application name. For more information, see
         * [Name Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html)
         * .
         *
         * Updates to `ApplicationName` are not supported.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-application.html#cfn-codedeploy-application-applicationname)
         *
         * @param applicationName A name for the application.
         */
        override fun applicationName(applicationName: String) {
            cdkBuilder.applicationName(applicationName)
        }

        /**
         * The compute platform that CodeDeploy deploys the application to.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-application.html#cfn-codedeploy-application-computeplatform)
         *
         * @param computePlatform The compute platform that CodeDeploy deploys the application to.
         */
        override fun computePlatform(computePlatform: String) {
            cdkBuilder.computePlatform(computePlatform)
        }

        /**
         * The metadata that you apply to CodeDeploy applications to help you organize and
         * categorize them.
         *
         * Each tag consists of a key and an optional value, both of which you define.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-application.html#cfn-codedeploy-application-tags)
         *
         * @param tags The metadata that you apply to CodeDeploy applications to help you organize
         *   and categorize them.
         */
        override fun tags(tags: List<CfnTag>) {
            cdkBuilder.tags(tags.map(CfnTag::unwrap))
        }

        /**
         * The metadata that you apply to CodeDeploy applications to help you organize and
         * categorize them.
         *
         * Each tag consists of a key and an optional value, both of which you define.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-application.html#cfn-codedeploy-application-tags)
         *
         * @param tags The metadata that you apply to CodeDeploy applications to help you organize
         *   and categorize them.
         */
        override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

        public fun build(): software.amazon.awscdk.services.codedeploy.CfnApplication =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnApplication {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnApplication(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.codedeploy.CfnApplication
        ): CfnApplication = CfnApplication(cdkObject)

        internal fun unwrap(
            wrapped: CfnApplication
        ): software.amazon.awscdk.services.codedeploy.CfnApplication = wrapped.cdkObject
    }
}
