package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnNetworkInsightsAccessScopeAnalysis
internal constructor(
    private val cdkObject:
        software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScopeAnalysis,
) : CfnResource(cdkObject), IInspectable, ITaggable {
    /** The number of network interfaces analyzed. */
    public open fun attrAnalyzedEniCount(): Number = unwrap(this).getAttrAnalyzedEniCount()

    /** The end date of the analysis. */
    public open fun attrEndDate(): String = unwrap(this).getAttrEndDate()

    /** Indicates whether there are findings (true | false | unknown). */
    public open fun attrFindingsFound(): String = unwrap(this).getAttrFindingsFound()

    /** The ARN of the Network Access Scope analysis. */
    public open fun attrNetworkInsightsAccessScopeAnalysisArn(): String =
        unwrap(this).getAttrNetworkInsightsAccessScopeAnalysisArn()

    /** The ID of the Network Access Scope analysis. */
    public open fun attrNetworkInsightsAccessScopeAnalysisId(): String =
        unwrap(this).getAttrNetworkInsightsAccessScopeAnalysisId()

    /** The start date of the analysis. */
    public open fun attrStartDate(): String = unwrap(this).getAttrStartDate()

    /** The status of the analysis (running | succeeded | failed). */
    public open fun attrStatus(): String = unwrap(this).getAttrStatus()

    /** The status message. */
    public open fun attrStatusMessage(): String = unwrap(this).getAttrStatusMessage()

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** The ID of the Network Access Scope. */
    public open fun networkInsightsAccessScopeId(): String =
        unwrap(this).getNetworkInsightsAccessScopeId()

    /** The ID of the Network Access Scope. */
    public open fun networkInsightsAccessScopeId(`value`: String) {
        unwrap(this).setNetworkInsightsAccessScopeId(`value`)
    }

    /** Tag Manager which manages the tags for this resource. */
    public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

    /** The tags. */
    public open fun tagsRaw(): List<CfnTag> =
        unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?: emptyList()

    /** The tags. */
    public open fun tagsRaw(`value`: List<CfnTag>) {
        unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
    }

    /** The tags. */
    public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

    /**
     * A fluent builder for
     * [io.cloudshiftdev.awscdk.services.ec2.CfnNetworkInsightsAccessScopeAnalysis].
     */
    @CdkDslMarker
    public interface Builder {
        /**
         * The ID of the Network Access Scope.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsaccessscopeanalysis.html#cfn-ec2-networkinsightsaccessscopeanalysis-networkinsightsaccessscopeid)
         *
         * @param networkInsightsAccessScopeId The ID of the Network Access Scope.
         */
        public fun networkInsightsAccessScopeId(networkInsightsAccessScopeId: String)

        /**
         * The tags.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsaccessscopeanalysis.html#cfn-ec2-networkinsightsaccessscopeanalysis-tags)
         *
         * @param tags The tags.
         */
        public fun tags(tags: List<CfnTag>)

        /**
         * The tags.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsaccessscopeanalysis.html#cfn-ec2-networkinsightsaccessscopeanalysis-tags)
         *
         * @param tags The tags.
         */
        public fun tags(vararg tags: CfnTag)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScopeAnalysis.Builder =
            software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScopeAnalysis.Builder
                .create(scope, id)

        /**
         * The ID of the Network Access Scope.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsaccessscopeanalysis.html#cfn-ec2-networkinsightsaccessscopeanalysis-networkinsightsaccessscopeid)
         *
         * @param networkInsightsAccessScopeId The ID of the Network Access Scope.
         */
        override fun networkInsightsAccessScopeId(networkInsightsAccessScopeId: String) {
            cdkBuilder.networkInsightsAccessScopeId(networkInsightsAccessScopeId)
        }

        /**
         * The tags.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsaccessscopeanalysis.html#cfn-ec2-networkinsightsaccessscopeanalysis-tags)
         *
         * @param tags The tags.
         */
        override fun tags(tags: List<CfnTag>) {
            cdkBuilder.tags(tags.map(CfnTag::unwrap))
        }

        /**
         * The tags.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsaccessscopeanalysis.html#cfn-ec2-networkinsightsaccessscopeanalysis-tags)
         *
         * @param tags The tags.
         */
        override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

        public fun build():
            software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScopeAnalysis =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnNetworkInsightsAccessScopeAnalysis {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnNetworkInsightsAccessScopeAnalysis(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScopeAnalysis
        ): CfnNetworkInsightsAccessScopeAnalysis = CfnNetworkInsightsAccessScopeAnalysis(cdkObject)

        internal fun unwrap(
            wrapped: CfnNetworkInsightsAccessScopeAnalysis
        ): software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScopeAnalysis =
            wrapped.cdkObject
    }
}
