package io.cloudshiftdev.awscdk.services.frauddetector

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

public open class CfnList internal constructor(
  private val cdkObject: software.amazon.awscdk.services.frauddetector.CfnList,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCreatedTime(): String = unwrap(this).getAttrCreatedTime()

  public open fun attrLastUpdatedTime(): String = unwrap(this).getAttrLastUpdatedTime()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun elements(): List<String> = unwrap(this).getElements() ?: emptyList()

  public open fun elements(`value`: List<String>) {
    unwrap(this).setElements(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun variableType(): String? = unwrap(this).getVariableType()

  public open fun variableType(`value`: String) {
    unwrap(this).setVariableType(`value`)
  }

  public interface Builder {
    public fun description(description: String)

    public fun elements(elements: List<String>)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun variableType(variableType: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.frauddetector.CfnList.Builder =
        software.amazon.awscdk.services.frauddetector.CfnList.Builder.create(scope, id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun elements(elements: List<String>) {
      cdkBuilder.elements(elements)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun variableType(variableType: String) {
      cdkBuilder.variableType(variableType)
    }

    public fun build(): software.amazon.awscdk.services.frauddetector.CfnList = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnList {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnList(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.frauddetector.CfnList): CfnList =
        CfnList(cdkObject)

    internal fun unwrap(wrapped: CfnList): software.amazon.awscdk.services.frauddetector.CfnList =
        wrapped.cdkObject
  }
}
