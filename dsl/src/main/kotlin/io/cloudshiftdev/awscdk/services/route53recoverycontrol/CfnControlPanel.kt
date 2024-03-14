package io.cloudshiftdev.awscdk.services.route53recoverycontrol

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnControlPanel internal constructor(
  private val cdkObject: software.amazon.awscdk.services.route53recoverycontrol.CfnControlPanel,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrControlPanelArn(): String = unwrap(this).getAttrControlPanelArn()

  public open fun attrDefaultControlPanel(): IResolvable =
      unwrap(this).getAttrDefaultControlPanel().let(IResolvable::wrap)

  public open fun attrRoutingControlCount(): Number = unwrap(this).getAttrRoutingControlCount()

  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  public open fun clusterArn(): String? = unwrap(this).getClusterArn()

  public open fun clusterArn(`value`: String) {
    unwrap(this).setClusterArn(`value`)
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

  public interface Builder {
    public fun clusterArn(clusterArn: String)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53recoverycontrol.CfnControlPanel.Builder =
        software.amazon.awscdk.services.route53recoverycontrol.CfnControlPanel.Builder.create(scope,
        id)

    override fun clusterArn(clusterArn: String) {
      cdkBuilder.clusterArn(clusterArn)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.route53recoverycontrol.CfnControlPanel =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnControlPanel {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnControlPanel(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53recoverycontrol.CfnControlPanel):
        CfnControlPanel = CfnControlPanel(cdkObject)

    internal fun unwrap(wrapped: CfnControlPanel):
        software.amazon.awscdk.services.route53recoverycontrol.CfnControlPanel = wrapped.cdkObject
  }
}
