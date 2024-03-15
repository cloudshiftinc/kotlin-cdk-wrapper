@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ssmincidents

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Unit
import kotlin.collections.List

public interface CfnReplicationSetProps {
  public fun deletionProtected(): Any? = unwrap(this).getDeletionProtected()

  public fun regions(): Any

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun deletionProtected(deletionProtected: Boolean)

    public fun deletionProtected(deletionProtected: IResolvable)

    public fun regions(regions: IResolvable)

    public fun regions(regions: List<Any>)

    public fun regions(vararg regions: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ssmincidents.CfnReplicationSetProps.Builder =
        software.amazon.awscdk.services.ssmincidents.CfnReplicationSetProps.builder()

    override fun deletionProtected(deletionProtected: Boolean) {
      cdkBuilder.deletionProtected(deletionProtected)
    }

    override fun deletionProtected(deletionProtected: IResolvable) {
      cdkBuilder.deletionProtected(deletionProtected.let(IResolvable::unwrap))
    }

    override fun regions(regions: IResolvable) {
      cdkBuilder.regions(regions.let(IResolvable::unwrap))
    }

    override fun regions(regions: List<Any>) {
      cdkBuilder.regions(regions)
    }

    override fun regions(vararg regions: Any): Unit = regions(regions.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ssmincidents.CfnReplicationSetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ssmincidents.CfnReplicationSetProps,
  ) : CdkObject(cdkObject), CfnReplicationSetProps {
    override fun deletionProtected(): Any? = unwrap(this).getDeletionProtected()

    override fun regions(): Any = unwrap(this).getRegions()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnReplicationSetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ssmincidents.CfnReplicationSetProps):
        CfnReplicationSetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnReplicationSetProps):
        software.amazon.awscdk.services.ssmincidents.CfnReplicationSetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ssmincidents.CfnReplicationSetProps
  }
}
