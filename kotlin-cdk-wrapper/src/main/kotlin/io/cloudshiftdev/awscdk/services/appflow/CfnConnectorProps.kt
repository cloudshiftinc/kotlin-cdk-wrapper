@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appflow

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnConnectorProps {
  public fun connectorLabel(): String? = unwrap(this).getConnectorLabel()

  public fun connectorProvisioningConfig(): Any

  public fun connectorProvisioningType(): String

  public fun description(): String? = unwrap(this).getDescription()

  @CdkDslMarker
  public interface Builder {
    public fun connectorLabel(connectorLabel: String)

    public fun connectorProvisioningConfig(connectorProvisioningConfig: IResolvable)

    public
        fun connectorProvisioningConfig(connectorProvisioningConfig: CfnConnector.ConnectorProvisioningConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3ffc62cfc1111a9c64c2c7ab103008c5a6504ddfad1ebc8d6fd88dd7c2bef78e")
    public
        fun connectorProvisioningConfig(connectorProvisioningConfig: CfnConnector.ConnectorProvisioningConfigProperty.Builder.() -> Unit)

    public fun connectorProvisioningType(connectorProvisioningType: String)

    public fun description(description: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appflow.CfnConnectorProps.Builder =
        software.amazon.awscdk.services.appflow.CfnConnectorProps.builder()

    override fun connectorLabel(connectorLabel: String) {
      cdkBuilder.connectorLabel(connectorLabel)
    }

    override fun connectorProvisioningConfig(connectorProvisioningConfig: IResolvable) {
      cdkBuilder.connectorProvisioningConfig(connectorProvisioningConfig.let(IResolvable::unwrap))
    }

    override
        fun connectorProvisioningConfig(connectorProvisioningConfig: CfnConnector.ConnectorProvisioningConfigProperty) {
      cdkBuilder.connectorProvisioningConfig(connectorProvisioningConfig.let(CfnConnector.ConnectorProvisioningConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3ffc62cfc1111a9c64c2c7ab103008c5a6504ddfad1ebc8d6fd88dd7c2bef78e")
    override
        fun connectorProvisioningConfig(connectorProvisioningConfig: CfnConnector.ConnectorProvisioningConfigProperty.Builder.() -> Unit):
        Unit =
        connectorProvisioningConfig(CfnConnector.ConnectorProvisioningConfigProperty(connectorProvisioningConfig))

    override fun connectorProvisioningType(connectorProvisioningType: String) {
      cdkBuilder.connectorProvisioningType(connectorProvisioningType)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public fun build(): software.amazon.awscdk.services.appflow.CfnConnectorProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProps,
  ) : CdkObject(cdkObject), CfnConnectorProps {
    override fun connectorLabel(): String? = unwrap(this).getConnectorLabel()

    override fun connectorProvisioningConfig(): Any = unwrap(this).getConnectorProvisioningConfig()

    override fun connectorProvisioningType(): String = unwrap(this).getConnectorProvisioningType()

    override fun description(): String? = unwrap(this).getDescription()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnConnectorProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProps):
        CfnConnectorProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnConnectorProps):
        software.amazon.awscdk.services.appflow.CfnConnectorProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.appflow.CfnConnectorProps
  }
}
