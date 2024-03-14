package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTrafficDistributionGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.connect.CfnTrafficDistributionGroup,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrIsDefault(): IResolvable =
      unwrap(this).getAttrIsDefault().let(IResolvable::wrap)

  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  public open fun attrTrafficDistributionGroupArn(): String =
      unwrap(this).getAttrTrafficDistributionGroupArn()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun instanceArn(): String = unwrap(this).getInstanceArn()

  public open fun instanceArn(`value`: String) {
    unwrap(this).setInstanceArn(`value`)
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun description(description: String)

    public fun instanceArn(instanceArn: String)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.connect.CfnTrafficDistributionGroup.Builder =
        software.amazon.awscdk.services.connect.CfnTrafficDistributionGroup.Builder.create(scope,
        id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.connect.CfnTrafficDistributionGroup =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTrafficDistributionGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTrafficDistributionGroup(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnTrafficDistributionGroup):
        CfnTrafficDistributionGroup = CfnTrafficDistributionGroup(cdkObject)

    internal fun unwrap(wrapped: CfnTrafficDistributionGroup):
        software.amazon.awscdk.services.connect.CfnTrafficDistributionGroup = wrapped.cdkObject
  }
}
