@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnActivityProps {
  public fun name(): String

  public fun tags(): List<CfnActivity.TagsEntryProperty> =
      unwrap(this).getTags()?.map(CfnActivity.TagsEntryProperty::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun name(name: String)

    public fun tags(tags: List<CfnActivity.TagsEntryProperty>)

    public fun tags(vararg tags: CfnActivity.TagsEntryProperty)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.CfnActivityProps.Builder =
        software.amazon.awscdk.services.stepfunctions.CfnActivityProps.builder()

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnActivity.TagsEntryProperty>) {
      cdkBuilder.tags(tags.map(CfnActivity.TagsEntryProperty::unwrap))
    }

    override fun tags(vararg tags: CfnActivity.TagsEntryProperty): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.stepfunctions.CfnActivityProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.CfnActivityProps,
  ) : CdkObject(cdkObject), CfnActivityProps {
    override fun name(): String = unwrap(this).getName()

    override fun tags(): List<CfnActivity.TagsEntryProperty> =
        unwrap(this).getTags()?.map(CfnActivity.TagsEntryProperty::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnActivityProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.CfnActivityProps):
        CfnActivityProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnActivityProps):
        software.amazon.awscdk.services.stepfunctions.CfnActivityProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.CfnActivityProps
  }
}
