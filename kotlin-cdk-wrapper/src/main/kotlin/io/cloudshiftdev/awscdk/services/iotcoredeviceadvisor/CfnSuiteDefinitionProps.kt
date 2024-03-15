@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotcoredeviceadvisor

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Unit
import kotlin.collections.List

public interface CfnSuiteDefinitionProps {
  public fun suiteDefinitionConfiguration(): Any

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun suiteDefinitionConfiguration(suiteDefinitionConfiguration: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinitionProps.Builder =
        software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinitionProps.builder()

    override fun suiteDefinitionConfiguration(suiteDefinitionConfiguration: Any) {
      cdkBuilder.suiteDefinitionConfiguration(suiteDefinitionConfiguration)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinitionProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinitionProps,
  ) : CdkObject(cdkObject), CfnSuiteDefinitionProps {
    override fun suiteDefinitionConfiguration(): Any =
        unwrap(this).getSuiteDefinitionConfiguration()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSuiteDefinitionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinitionProps):
        CfnSuiteDefinitionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSuiteDefinitionProps):
        software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinitionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinitionProps
  }
}
