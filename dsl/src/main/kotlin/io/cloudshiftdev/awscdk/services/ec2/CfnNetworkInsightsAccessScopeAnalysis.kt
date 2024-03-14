package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnNetworkInsightsAccessScopeAnalysis internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScopeAnalysis,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrAnalyzedEniCount(): Number = unwrap(this).getAttrAnalyzedEniCount()

  public open fun attrEndDate(): String = unwrap(this).getAttrEndDate()

  public open fun attrFindingsFound(): String = unwrap(this).getAttrFindingsFound()

  public open fun attrNetworkInsightsAccessScopeAnalysisArn(): String =
      unwrap(this).getAttrNetworkInsightsAccessScopeAnalysisArn()

  public open fun attrNetworkInsightsAccessScopeAnalysisId(): String =
      unwrap(this).getAttrNetworkInsightsAccessScopeAnalysisId()

  public open fun attrStartDate(): String = unwrap(this).getAttrStartDate()

  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  public open fun attrStatusMessage(): String = unwrap(this).getAttrStatusMessage()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun networkInsightsAccessScopeId(): String =
      unwrap(this).getNetworkInsightsAccessScopeId()

  public open fun networkInsightsAccessScopeId(`value`: String) {
    unwrap(this).setNetworkInsightsAccessScopeId(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun networkInsightsAccessScopeId(networkInsightsAccessScopeId: String)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScopeAnalysis.Builder =
        software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScopeAnalysis.Builder.create(scope,
        id)

    override fun networkInsightsAccessScopeId(networkInsightsAccessScopeId: String) {
      cdkBuilder.networkInsightsAccessScopeId(networkInsightsAccessScopeId)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScopeAnalysis =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnNetworkInsightsAccessScopeAnalysis {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnNetworkInsightsAccessScopeAnalysis(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScopeAnalysis):
        CfnNetworkInsightsAccessScopeAnalysis = CfnNetworkInsightsAccessScopeAnalysis(cdkObject)

    internal fun unwrap(wrapped: CfnNetworkInsightsAccessScopeAnalysis):
        software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScopeAnalysis =
        wrapped.cdkObject
  }
}
