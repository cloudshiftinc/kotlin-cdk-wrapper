@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appflow

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnConnectorProfileProps {
  public fun connectionMode(): String

  public fun connectorLabel(): String? = unwrap(this).getConnectorLabel()

  public fun connectorProfileConfig(): Any? = unwrap(this).getConnectorProfileConfig()

  public fun connectorProfileName(): String

  public fun connectorType(): String

  public fun kmsArn(): String? = unwrap(this).getKmsArn()

  @CdkDslMarker
  public interface Builder {
    public fun connectionMode(connectionMode: String)

    public fun connectorLabel(connectorLabel: String)

    public fun connectorProfileConfig(connectorProfileConfig: IResolvable)

    public
        fun connectorProfileConfig(connectorProfileConfig: CfnConnectorProfile.ConnectorProfileConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a09bc0e0ef2d9eac369cb93da67873d848462a6b911454736f0cca39e400e31e")
    public
        fun connectorProfileConfig(connectorProfileConfig: CfnConnectorProfile.ConnectorProfileConfigProperty.Builder.() -> Unit)

    public fun connectorProfileName(connectorProfileName: String)

    public fun connectorType(connectorType: String)

    public fun kmsArn(kmsArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appflow.CfnConnectorProfileProps.Builder
        = software.amazon.awscdk.services.appflow.CfnConnectorProfileProps.builder()

    override fun connectionMode(connectionMode: String) {
      cdkBuilder.connectionMode(connectionMode)
    }

    override fun connectorLabel(connectorLabel: String) {
      cdkBuilder.connectorLabel(connectorLabel)
    }

    override fun connectorProfileConfig(connectorProfileConfig: IResolvable) {
      cdkBuilder.connectorProfileConfig(connectorProfileConfig.let(IResolvable::unwrap))
    }

    override
        fun connectorProfileConfig(connectorProfileConfig: CfnConnectorProfile.ConnectorProfileConfigProperty) {
      cdkBuilder.connectorProfileConfig(connectorProfileConfig.let(CfnConnectorProfile.ConnectorProfileConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a09bc0e0ef2d9eac369cb93da67873d848462a6b911454736f0cca39e400e31e")
    override
        fun connectorProfileConfig(connectorProfileConfig: CfnConnectorProfile.ConnectorProfileConfigProperty.Builder.() -> Unit):
        Unit =
        connectorProfileConfig(CfnConnectorProfile.ConnectorProfileConfigProperty(connectorProfileConfig))

    override fun connectorProfileName(connectorProfileName: String) {
      cdkBuilder.connectorProfileName(connectorProfileName)
    }

    override fun connectorType(connectorType: String) {
      cdkBuilder.connectorType(connectorType)
    }

    override fun kmsArn(kmsArn: String) {
      cdkBuilder.kmsArn(kmsArn)
    }

    public fun build(): software.amazon.awscdk.services.appflow.CfnConnectorProfileProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfileProps,
  ) : CdkObject(cdkObject), CfnConnectorProfileProps {
    override fun connectionMode(): String = unwrap(this).getConnectionMode()

    override fun connectorLabel(): String? = unwrap(this).getConnectorLabel()

    override fun connectorProfileConfig(): Any? = unwrap(this).getConnectorProfileConfig()

    override fun connectorProfileName(): String = unwrap(this).getConnectorProfileName()

    override fun connectorType(): String = unwrap(this).getConnectorType()

    override fun kmsArn(): String? = unwrap(this).getKmsArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnConnectorProfileProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfileProps):
        CfnConnectorProfileProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnConnectorProfileProps):
        software.amazon.awscdk.services.appflow.CfnConnectorProfileProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appflow.CfnConnectorProfileProps
  }
}
