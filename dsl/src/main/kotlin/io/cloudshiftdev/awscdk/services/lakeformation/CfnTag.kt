package io.cloudshiftdev.awscdk.services.lakeformation

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTag internal constructor(
  private val cdkObject: software.amazon.awscdk.services.lakeformation.CfnTag,
) : CfnResource(cdkObject), IInspectable {
  public open fun catalogId(): String? = unwrap(this).getCatalogId()

  public open fun catalogId(`value`: String) {
    unwrap(this).setCatalogId(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun tagKey(): String = unwrap(this).getTagKey()

  public open fun tagKey(`value`: String) {
    unwrap(this).setTagKey(`value`)
  }

  public open fun tagValues(): List<String> = unwrap(this).getTagValues()

  public open fun tagValues(`value`: List<String>) {
    unwrap(this).setTagValues(`value`)
  }

  public open fun tagValues(vararg `value`: String): Unit = tagValues(`value`.toList())

  public interface Builder {
    public fun catalogId(catalogId: String)

    public fun tagKey(tagKey: String)

    public fun tagValues(tagValues: List<String>)

    public fun tagValues(vararg tagValues: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lakeformation.CfnTag.Builder =
        software.amazon.awscdk.services.lakeformation.CfnTag.Builder.create(scope, id)

    override fun catalogId(catalogId: String) {
      cdkBuilder.catalogId(catalogId)
    }

    override fun tagKey(tagKey: String) {
      cdkBuilder.tagKey(tagKey)
    }

    override fun tagValues(tagValues: List<String>) {
      cdkBuilder.tagValues(tagValues)
    }

    override fun tagValues(vararg tagValues: String): Unit = tagValues(tagValues.toList())

    public fun build(): software.amazon.awscdk.services.lakeformation.CfnTag = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTag {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTag(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnTag): CfnTag =
        CfnTag(cdkObject)

    internal fun unwrap(wrapped: CfnTag): software.amazon.awscdk.services.lakeformation.CfnTag =
        wrapped.cdkObject
  }
}
