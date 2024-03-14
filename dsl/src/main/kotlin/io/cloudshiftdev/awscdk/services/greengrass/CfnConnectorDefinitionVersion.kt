package io.cloudshiftdev.awscdk.services.greengrass

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnConnectorDefinitionVersion internal constructor(
  private val cdkObject: software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionVersion,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun connectorDefinitionId(): String = unwrap(this).getConnectorDefinitionId()

  public open fun connectorDefinitionId(`value`: String) {
    unwrap(this).setConnectorDefinitionId(`value`)
  }

  public open fun connectors(): Any = unwrap(this).getConnectors()

  public open fun connectors(`value`: IResolvable) {
    unwrap(this).setConnectors(`value`.let(IResolvable::unwrap))
  }

  public open fun connectors(__idx_ac66f0: List<Any>) {
    unwrap(this).setConnectors(__idx_ac66f0)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public interface Builder {
    public fun connectorDefinitionId(connectorDefinitionId: String)

    public fun connectors(connectors: IResolvable)

    public fun connectors(connectors: List<Any>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionVersion.Builder =
        software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionVersion.Builder.create(scope,
        id)

    override fun connectorDefinitionId(connectorDefinitionId: String) {
      cdkBuilder.connectorDefinitionId(connectorDefinitionId)
    }

    override fun connectors(connectors: IResolvable) {
      cdkBuilder.connectors(connectors.let(IResolvable::unwrap))
    }

    override fun connectors(connectors: List<Any>) {
      cdkBuilder.connectors(connectors)
    }

    public fun build(): software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionVersion =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnConnectorDefinitionVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnConnectorDefinitionVersion(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionVersion):
        CfnConnectorDefinitionVersion = CfnConnectorDefinitionVersion(cdkObject)

    internal fun unwrap(wrapped: CfnConnectorDefinitionVersion):
        software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionVersion = wrapped.cdkObject
  }

  public interface ConnectorProperty {
    public fun connectorArn(): String

    public fun id(): String

    public fun parameters(): Any? = unwrap(this).getParameters()

    public interface Builder {
      public fun connectorArn(connectorArn: String)

      public fun id(id: String)

      public fun parameters(parameters: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionVersion.ConnectorProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionVersion.ConnectorProperty.builder()

      override fun connectorArn(connectorArn: String) {
        cdkBuilder.connectorArn(connectorArn)
      }

      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      override fun parameters(parameters: Any) {
        cdkBuilder.parameters(parameters)
      }

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionVersion.ConnectorProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionVersion.ConnectorProperty,
    ) : ConnectorProperty {
      override fun connectorArn(): String = unwrap(this).getConnectorArn()

      override fun id(): String = unwrap(this).getId()

      override fun parameters(): Any? = unwrap(this).getParameters()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ConnectorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionVersion.ConnectorProperty):
          ConnectorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConnectorProperty):
          software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionVersion.ConnectorProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
