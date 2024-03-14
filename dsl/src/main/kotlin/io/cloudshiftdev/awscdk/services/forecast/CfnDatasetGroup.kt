package io.cloudshiftdev.awscdk.services.forecast

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDatasetGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.forecast.CfnDatasetGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrDatasetGroupArn(): String = unwrap(this).getAttrDatasetGroupArn()

  public open fun datasetArns(): List<String> = unwrap(this).getDatasetArns() ?: emptyList()

  public open fun datasetArns(`value`: List<String>) {
    unwrap(this).setDatasetArns(`value`)
  }

  public open fun datasetGroupName(): String = unwrap(this).getDatasetGroupName()

  public open fun datasetGroupName(`value`: String) {
    unwrap(this).setDatasetGroupName(`value`)
  }

  public open fun domain(): String = unwrap(this).getDomain()

  public open fun domain(`value`: String) {
    unwrap(this).setDomain(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun datasetArns(datasetArns: List<String>)

    public fun datasetGroupName(datasetGroupName: String)

    public fun domain(domain: String)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.forecast.CfnDatasetGroup.Builder =
        software.amazon.awscdk.services.forecast.CfnDatasetGroup.Builder.create(scope, id)

    override fun datasetArns(datasetArns: List<String>) {
      cdkBuilder.datasetArns(datasetArns)
    }

    override fun datasetGroupName(datasetGroupName: String) {
      cdkBuilder.datasetGroupName(datasetGroupName)
    }

    override fun domain(domain: String) {
      cdkBuilder.domain(domain)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.forecast.CfnDatasetGroup =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDatasetGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDatasetGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.forecast.CfnDatasetGroup):
        CfnDatasetGroup = CfnDatasetGroup(cdkObject)

    internal fun unwrap(wrapped: CfnDatasetGroup):
        software.amazon.awscdk.services.forecast.CfnDatasetGroup = wrapped.cdkObject
  }
}
