@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eventschemas

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnDiscovererProps {
  public fun crossAccount(): Any? = unwrap(this).getCrossAccount()

  public fun description(): String? = unwrap(this).getDescription()

  public fun sourceArn(): String

  public fun tags(): List<CfnDiscoverer.TagsEntryProperty> =
      unwrap(this).getTags()?.map(CfnDiscoverer.TagsEntryProperty::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun crossAccount(crossAccount: Boolean)

    public fun crossAccount(crossAccount: IResolvable)

    public fun description(description: String)

    public fun sourceArn(sourceArn: String)

    public fun tags(tags: List<CfnDiscoverer.TagsEntryProperty>)

    public fun tags(vararg tags: CfnDiscoverer.TagsEntryProperty)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eventschemas.CfnDiscovererProps.Builder
        = software.amazon.awscdk.services.eventschemas.CfnDiscovererProps.builder()

    override fun crossAccount(crossAccount: Boolean) {
      cdkBuilder.crossAccount(crossAccount)
    }

    override fun crossAccount(crossAccount: IResolvable) {
      cdkBuilder.crossAccount(crossAccount.let(IResolvable::unwrap))
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun sourceArn(sourceArn: String) {
      cdkBuilder.sourceArn(sourceArn)
    }

    override fun tags(tags: List<CfnDiscoverer.TagsEntryProperty>) {
      cdkBuilder.tags(tags.map(CfnDiscoverer.TagsEntryProperty::unwrap))
    }

    override fun tags(vararg tags: CfnDiscoverer.TagsEntryProperty): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.eventschemas.CfnDiscovererProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.eventschemas.CfnDiscovererProps,
  ) : CdkObject(cdkObject), CfnDiscovererProps {
    override fun crossAccount(): Any? = unwrap(this).getCrossAccount()

    override fun description(): String? = unwrap(this).getDescription()

    override fun sourceArn(): String = unwrap(this).getSourceArn()

    override fun tags(): List<CfnDiscoverer.TagsEntryProperty> =
        unwrap(this).getTags()?.map(CfnDiscoverer.TagsEntryProperty::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDiscovererProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eventschemas.CfnDiscovererProps):
        CfnDiscovererProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDiscovererProps):
        software.amazon.awscdk.services.eventschemas.CfnDiscovererProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.eventschemas.CfnDiscovererProps
  }
}
