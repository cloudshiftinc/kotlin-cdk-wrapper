@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53recoveryreadiness

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnReadinessCheck internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.route53recoveryreadiness.CfnReadinessCheck,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrReadinessCheckArn(): String = unwrap(this).getAttrReadinessCheckArn()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun readinessCheckName(): String? = unwrap(this).getReadinessCheckName()

  public open fun readinessCheckName(`value`: String) {
    unwrap(this).setReadinessCheckName(`value`)
  }

  public open fun resourceSetName(): String? = unwrap(this).getResourceSetName()

  public open fun resourceSetName(`value`: String) {
    unwrap(this).setResourceSetName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun readinessCheckName(readinessCheckName: String)

    public fun resourceSetName(resourceSetName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53recoveryreadiness.CfnReadinessCheck.Builder =
        software.amazon.awscdk.services.route53recoveryreadiness.CfnReadinessCheck.Builder.create(scope,
        id)

    override fun readinessCheckName(readinessCheckName: String) {
      cdkBuilder.readinessCheckName(readinessCheckName)
    }

    override fun resourceSetName(resourceSetName: String) {
      cdkBuilder.resourceSetName(resourceSetName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.route53recoveryreadiness.CfnReadinessCheck =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.route53recoveryreadiness.CfnReadinessCheck.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnReadinessCheck {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnReadinessCheck(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53recoveryreadiness.CfnReadinessCheck):
        CfnReadinessCheck = CfnReadinessCheck(cdkObject)

    internal fun unwrap(wrapped: CfnReadinessCheck):
        software.amazon.awscdk.services.route53recoveryreadiness.CfnReadinessCheck =
        wrapped.cdkObject
  }
}
