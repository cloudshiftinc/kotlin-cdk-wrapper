@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.resourceexplorer2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface CfnIndexProps {
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  public fun type(): String

  @CdkDslMarker
  public interface Builder {
    public fun tags(tags: Map<String, String>)

    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.resourceexplorer2.CfnIndexProps.Builder
        = software.amazon.awscdk.services.resourceexplorer2.CfnIndexProps.builder()

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.resourceexplorer2.CfnIndexProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.resourceexplorer2.CfnIndexProps,
  ) : CdkObject(cdkObject), CfnIndexProps {
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnIndexProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.resourceexplorer2.CfnIndexProps):
        CfnIndexProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnIndexProps):
        software.amazon.awscdk.services.resourceexplorer2.CfnIndexProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.resourceexplorer2.CfnIndexProps
  }
}
