@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.detective

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Unit
import kotlin.collections.List

public interface CfnGraphProps {
  public fun autoEnableMembers(): Any? = unwrap(this).getAutoEnableMembers()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun autoEnableMembers(autoEnableMembers: Boolean)

    public fun autoEnableMembers(autoEnableMembers: IResolvable)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.detective.CfnGraphProps.Builder =
        software.amazon.awscdk.services.detective.CfnGraphProps.builder()

    override fun autoEnableMembers(autoEnableMembers: Boolean) {
      cdkBuilder.autoEnableMembers(autoEnableMembers)
    }

    override fun autoEnableMembers(autoEnableMembers: IResolvable) {
      cdkBuilder.autoEnableMembers(autoEnableMembers.let(IResolvable::unwrap))
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.detective.CfnGraphProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.detective.CfnGraphProps,
  ) : CdkObject(cdkObject), CfnGraphProps {
    override fun autoEnableMembers(): Any? = unwrap(this).getAutoEnableMembers()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnGraphProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.detective.CfnGraphProps):
        CfnGraphProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnGraphProps):
        software.amazon.awscdk.services.detective.CfnGraphProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.detective.CfnGraphProps
  }
}
