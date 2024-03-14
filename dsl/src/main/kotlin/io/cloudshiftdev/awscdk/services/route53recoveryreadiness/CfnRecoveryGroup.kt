package io.cloudshiftdev.awscdk.services.route53recoveryreadiness

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

public open class CfnRecoveryGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.route53recoveryreadiness.CfnRecoveryGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrRecoveryGroupArn(): String = unwrap(this).getAttrRecoveryGroupArn()

  public open fun cells(): List<String> = unwrap(this).getCells() ?: emptyList()

  public open fun cells(`value`: List<String>) {
    unwrap(this).setCells(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun recoveryGroupName(): String? = unwrap(this).getRecoveryGroupName()

  public open fun recoveryGroupName(`value`: String) {
    unwrap(this).setRecoveryGroupName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun cells(cells: List<String>)

    public fun recoveryGroupName(recoveryGroupName: String)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53recoveryreadiness.CfnRecoveryGroup.Builder =
        software.amazon.awscdk.services.route53recoveryreadiness.CfnRecoveryGroup.Builder.create(scope,
        id)

    override fun cells(cells: List<String>) {
      cdkBuilder.cells(cells)
    }

    override fun recoveryGroupName(recoveryGroupName: String) {
      cdkBuilder.recoveryGroupName(recoveryGroupName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.route53recoveryreadiness.CfnRecoveryGroup =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRecoveryGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRecoveryGroup(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53recoveryreadiness.CfnRecoveryGroup):
        CfnRecoveryGroup = CfnRecoveryGroup(cdkObject)

    internal fun unwrap(wrapped: CfnRecoveryGroup):
        software.amazon.awscdk.services.route53recoveryreadiness.CfnRecoveryGroup =
        wrapped.cdkObject
  }
}
