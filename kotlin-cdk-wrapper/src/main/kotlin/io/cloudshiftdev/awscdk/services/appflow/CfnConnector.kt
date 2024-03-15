@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appflow

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnConnector internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appflow.CfnConnector,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrConnectorArn(): String = unwrap(this).getAttrConnectorArn()

  public open fun connectorLabel(): String? = unwrap(this).getConnectorLabel()

  public open fun connectorLabel(`value`: String) {
    unwrap(this).setConnectorLabel(`value`)
  }

  public open fun connectorProvisioningConfig(): Any = unwrap(this).getConnectorProvisioningConfig()

  public open fun connectorProvisioningConfig(`value`: IResolvable) {
    unwrap(this).setConnectorProvisioningConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun connectorProvisioningConfig(`value`: ConnectorProvisioningConfigProperty) {
    unwrap(this).setConnectorProvisioningConfig(`value`.let(ConnectorProvisioningConfigProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("69453e53ec25d11f99e9604d35c506312f73363ec7104e8e64a4bdf22805b677")
  public open
      fun connectorProvisioningConfig(`value`: ConnectorProvisioningConfigProperty.Builder.() -> Unit):
      Unit = connectorProvisioningConfig(ConnectorProvisioningConfigProperty(`value`))

  public open fun connectorProvisioningType(): String = unwrap(this).getConnectorProvisioningType()

  public open fun connectorProvisioningType(`value`: String) {
    unwrap(this).setConnectorProvisioningType(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  @CdkDslMarker
  public interface Builder {
    public fun connectorLabel(connectorLabel: String)

    public fun connectorProvisioningConfig(connectorProvisioningConfig: IResolvable)

    public
        fun connectorProvisioningConfig(connectorProvisioningConfig: ConnectorProvisioningConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("11e561cbca072ea56030f196d2486de545587240ded38203a38b4ee9b0e3bbe5")
    public
        fun connectorProvisioningConfig(connectorProvisioningConfig: ConnectorProvisioningConfigProperty.Builder.() -> Unit)

    public fun connectorProvisioningType(connectorProvisioningType: String)

    public fun description(description: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appflow.CfnConnector.Builder =
        software.amazon.awscdk.services.appflow.CfnConnector.Builder.create(scope, id)

    override fun connectorLabel(connectorLabel: String) {
      cdkBuilder.connectorLabel(connectorLabel)
    }

    override fun connectorProvisioningConfig(connectorProvisioningConfig: IResolvable) {
      cdkBuilder.connectorProvisioningConfig(connectorProvisioningConfig.let(IResolvable::unwrap))
    }

    override
        fun connectorProvisioningConfig(connectorProvisioningConfig: ConnectorProvisioningConfigProperty) {
      cdkBuilder.connectorProvisioningConfig(connectorProvisioningConfig.let(ConnectorProvisioningConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("11e561cbca072ea56030f196d2486de545587240ded38203a38b4ee9b0e3bbe5")
    override
        fun connectorProvisioningConfig(connectorProvisioningConfig: ConnectorProvisioningConfigProperty.Builder.() -> Unit):
        Unit =
        connectorProvisioningConfig(ConnectorProvisioningConfigProperty(connectorProvisioningConfig))

    override fun connectorProvisioningType(connectorProvisioningType: String) {
      cdkBuilder.connectorProvisioningType(connectorProvisioningType)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public fun build(): software.amazon.awscdk.services.appflow.CfnConnector = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.appflow.CfnConnector.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnConnector {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnConnector(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnector): CfnConnector
        = CfnConnector(cdkObject)

    internal fun unwrap(wrapped: CfnConnector): software.amazon.awscdk.services.appflow.CfnConnector
        = wrapped.cdkObject
  }

  public interface ConnectorProvisioningConfigProperty {
    public fun lambda(): Any? = unwrap(this).getLambda()

    @CdkDslMarker
    public interface Builder {
      public fun lambda(lambda: IResolvable)

      public fun lambda(lambda: LambdaConnectorProvisioningConfigProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5950ab3d5fc3efe717c0d5750d63b530f6dc218e2d5f862378656fa69ec5b00f")
      public fun lambda(lambda: LambdaConnectorProvisioningConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnector.ConnectorProvisioningConfigProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnector.ConnectorProvisioningConfigProperty.builder()

      override fun lambda(lambda: IResolvable) {
        cdkBuilder.lambda(lambda.let(IResolvable::unwrap))
      }

      override fun lambda(lambda: LambdaConnectorProvisioningConfigProperty) {
        cdkBuilder.lambda(lambda.let(LambdaConnectorProvisioningConfigProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5950ab3d5fc3efe717c0d5750d63b530f6dc218e2d5f862378656fa69ec5b00f")
      override fun lambda(lambda: LambdaConnectorProvisioningConfigProperty.Builder.() -> Unit):
          Unit = lambda(LambdaConnectorProvisioningConfigProperty(lambda))

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnector.ConnectorProvisioningConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnector.ConnectorProvisioningConfigProperty,
    ) : CdkObject(cdkObject), ConnectorProvisioningConfigProperty {
      override fun lambda(): Any? = unwrap(this).getLambda()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ConnectorProvisioningConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnector.ConnectorProvisioningConfigProperty):
          ConnectorProvisioningConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConnectorProvisioningConfigProperty):
          software.amazon.awscdk.services.appflow.CfnConnector.ConnectorProvisioningConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnector.ConnectorProvisioningConfigProperty
    }
  }

  public interface LambdaConnectorProvisioningConfigProperty {
    public fun lambdaArn(): String

    @CdkDslMarker
    public interface Builder {
      public fun lambdaArn(lambdaArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnector.LambdaConnectorProvisioningConfigProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnector.LambdaConnectorProvisioningConfigProperty.builder()

      override fun lambdaArn(lambdaArn: String) {
        cdkBuilder.lambdaArn(lambdaArn)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnector.LambdaConnectorProvisioningConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnector.LambdaConnectorProvisioningConfigProperty,
    ) : CdkObject(cdkObject), LambdaConnectorProvisioningConfigProperty {
      override fun lambdaArn(): String = unwrap(this).getLambdaArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          LambdaConnectorProvisioningConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnector.LambdaConnectorProvisioningConfigProperty):
          LambdaConnectorProvisioningConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LambdaConnectorProvisioningConfigProperty):
          software.amazon.awscdk.services.appflow.CfnConnector.LambdaConnectorProvisioningConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnector.LambdaConnectorProvisioningConfigProperty
    }
  }
}
