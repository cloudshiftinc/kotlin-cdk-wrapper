@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.greengrass

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnConnectorDefinitionVersionProps {
  public fun connectorDefinitionId(): String

  public fun connectors(): Any

  @CdkDslMarker
  public interface Builder {
    public fun connectorDefinitionId(connectorDefinitionId: String)

    public fun connectors(connectors: IResolvable)

    public fun connectors(connectors: List<Any>)

    public fun connectors(vararg connectors: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionVersionProps.Builder =
        software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionVersionProps.builder()

    override fun connectorDefinitionId(connectorDefinitionId: String) {
      cdkBuilder.connectorDefinitionId(connectorDefinitionId)
    }

    override fun connectors(connectors: IResolvable) {
      cdkBuilder.connectors(connectors.let(IResolvable::unwrap))
    }

    override fun connectors(connectors: List<Any>) {
      cdkBuilder.connectors(connectors)
    }

    override fun connectors(vararg connectors: Any): Unit = connectors(connectors.toList())

    public fun build():
        software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionVersionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionVersionProps,
  ) : CdkObject(cdkObject), CfnConnectorDefinitionVersionProps {
    override fun connectorDefinitionId(): String = unwrap(this).getConnectorDefinitionId()

    override fun connectors(): Any = unwrap(this).getConnectors()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnConnectorDefinitionVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionVersionProps):
        CfnConnectorDefinitionVersionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnConnectorDefinitionVersionProps):
        software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionVersionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionVersionProps
  }
}
