@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.greengrass

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnCoreDefinitionVersionProps {
  public fun coreDefinitionId(): String

  public fun cores(): Any

  @CdkDslMarker
  public interface Builder {
    public fun coreDefinitionId(coreDefinitionId: String)

    public fun cores(cores: IResolvable)

    public fun cores(cores: List<Any>)

    public fun cores(vararg cores: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.greengrass.CfnCoreDefinitionVersionProps.Builder =
        software.amazon.awscdk.services.greengrass.CfnCoreDefinitionVersionProps.builder()

    override fun coreDefinitionId(coreDefinitionId: String) {
      cdkBuilder.coreDefinitionId(coreDefinitionId)
    }

    override fun cores(cores: IResolvable) {
      cdkBuilder.cores(cores.let(IResolvable::unwrap))
    }

    override fun cores(cores: List<Any>) {
      cdkBuilder.cores(cores)
    }

    override fun cores(vararg cores: Any): Unit = cores(cores.toList())

    public fun build(): software.amazon.awscdk.services.greengrass.CfnCoreDefinitionVersionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.greengrass.CfnCoreDefinitionVersionProps,
  ) : CdkObject(cdkObject), CfnCoreDefinitionVersionProps {
    override fun coreDefinitionId(): String = unwrap(this).getCoreDefinitionId()

    override fun cores(): Any = unwrap(this).getCores()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCoreDefinitionVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnCoreDefinitionVersionProps):
        CfnCoreDefinitionVersionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCoreDefinitionVersionProps):
        software.amazon.awscdk.services.greengrass.CfnCoreDefinitionVersionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.greengrass.CfnCoreDefinitionVersionProps
  }
}
