@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.inspector

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Unit
import kotlin.collections.List

public interface CfnResourceGroupProps {
  public fun resourceGroupTags(): Any

  @CdkDslMarker
  public interface Builder {
    public fun resourceGroupTags(resourceGroupTags: IResolvable)

    public fun resourceGroupTags(resourceGroupTags: List<Any>)

    public fun resourceGroupTags(vararg resourceGroupTags: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.inspector.CfnResourceGroupProps.Builder
        = software.amazon.awscdk.services.inspector.CfnResourceGroupProps.builder()

    override fun resourceGroupTags(resourceGroupTags: IResolvable) {
      cdkBuilder.resourceGroupTags(resourceGroupTags.let(IResolvable::unwrap))
    }

    override fun resourceGroupTags(resourceGroupTags: List<Any>) {
      cdkBuilder.resourceGroupTags(resourceGroupTags)
    }

    override fun resourceGroupTags(vararg resourceGroupTags: Any): Unit =
        resourceGroupTags(resourceGroupTags.toList())

    public fun build(): software.amazon.awscdk.services.inspector.CfnResourceGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.inspector.CfnResourceGroupProps,
  ) : CdkObject(cdkObject), CfnResourceGroupProps {
    override fun resourceGroupTags(): Any = unwrap(this).getResourceGroupTags()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnResourceGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.inspector.CfnResourceGroupProps):
        CfnResourceGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnResourceGroupProps):
        software.amazon.awscdk.services.inspector.CfnResourceGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.inspector.CfnResourceGroupProps
  }
}
