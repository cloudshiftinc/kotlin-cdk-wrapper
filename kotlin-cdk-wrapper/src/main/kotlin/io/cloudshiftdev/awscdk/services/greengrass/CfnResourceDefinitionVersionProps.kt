@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.greengrass

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnResourceDefinitionVersionProps {
  public fun resourceDefinitionId(): String

  public fun resources(): Any

  @CdkDslMarker
  public interface Builder {
    public fun resourceDefinitionId(resourceDefinitionId: String)

    public fun resources(resources: IResolvable)

    public fun resources(resources: List<Any>)

    public fun resources(vararg resources: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersionProps.Builder =
        software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersionProps.builder()

    override fun resourceDefinitionId(resourceDefinitionId: String) {
      cdkBuilder.resourceDefinitionId(resourceDefinitionId)
    }

    override fun resources(resources: IResolvable) {
      cdkBuilder.resources(resources.let(IResolvable::unwrap))
    }

    override fun resources(resources: List<Any>) {
      cdkBuilder.resources(resources)
    }

    override fun resources(vararg resources: Any): Unit = resources(resources.toList())

    public fun build(): software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersionProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersionProps,
  ) : CdkObject(cdkObject), CfnResourceDefinitionVersionProps {
    override fun resourceDefinitionId(): String = unwrap(this).getResourceDefinitionId()

    override fun resources(): Any = unwrap(this).getResources()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnResourceDefinitionVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersionProps):
        CfnResourceDefinitionVersionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnResourceDefinitionVersionProps):
        software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersionProps
  }
}
