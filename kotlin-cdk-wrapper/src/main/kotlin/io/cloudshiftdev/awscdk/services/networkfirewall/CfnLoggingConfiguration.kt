@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.networkfirewall

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnLoggingConfiguration internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration,
) : CfnResource(cdkObject), IInspectable {
  public open fun firewallArn(): String = unwrap(this).getFirewallArn()

  public open fun firewallArn(`value`: String) {
    unwrap(this).setFirewallArn(`value`)
  }

  public open fun firewallName(): String? = unwrap(this).getFirewallName()

  public open fun firewallName(`value`: String) {
    unwrap(this).setFirewallName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun loggingConfiguration(): Any = unwrap(this).getLoggingConfiguration()

  public open fun loggingConfiguration(`value`: IResolvable) {
    unwrap(this).setLoggingConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun loggingConfiguration(`value`: LoggingConfigurationProperty) {
    unwrap(this).setLoggingConfiguration(`value`.let(LoggingConfigurationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("185760fcc632f78f1be64eaf8a3ecbe8ff303cc2f061109b8299ad48e6492b96")
  public open fun loggingConfiguration(`value`: LoggingConfigurationProperty.Builder.() -> Unit):
      Unit = loggingConfiguration(LoggingConfigurationProperty(`value`))

  @CdkDslMarker
  public interface Builder {
    public fun firewallArn(firewallArn: String)

    public fun firewallName(firewallName: String)

    public fun loggingConfiguration(loggingConfiguration: IResolvable)

    public fun loggingConfiguration(loggingConfiguration: LoggingConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4df15cf2f8b365e2efb5e9098a896046bc1524f972d46c534dff35fcc5548328")
    public
        fun loggingConfiguration(loggingConfiguration: LoggingConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration.Builder =
        software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration.Builder.create(scope,
        id)

    override fun firewallArn(firewallArn: String) {
      cdkBuilder.firewallArn(firewallArn)
    }

    override fun firewallName(firewallName: String) {
      cdkBuilder.firewallName(firewallName)
    }

    override fun loggingConfiguration(loggingConfiguration: IResolvable) {
      cdkBuilder.loggingConfiguration(loggingConfiguration.let(IResolvable::unwrap))
    }

    override fun loggingConfiguration(loggingConfiguration: LoggingConfigurationProperty) {
      cdkBuilder.loggingConfiguration(loggingConfiguration.let(LoggingConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4df15cf2f8b365e2efb5e9098a896046bc1524f972d46c534dff35fcc5548328")
    override
        fun loggingConfiguration(loggingConfiguration: LoggingConfigurationProperty.Builder.() -> Unit):
        Unit = loggingConfiguration(LoggingConfigurationProperty(loggingConfiguration))

    public fun build(): software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLoggingConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLoggingConfiguration(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration):
        CfnLoggingConfiguration = CfnLoggingConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnLoggingConfiguration):
        software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration = wrapped.cdkObject
  }

  public interface LogDestinationConfigProperty {
    public fun logDestination(): Any

    public fun logDestinationType(): String

    public fun logType(): String

    @CdkDslMarker
    public interface Builder {
      public fun logDestination(logDestination: IResolvable)

      public fun logDestination(logDestination: Map<String, String>)

      public fun logDestinationType(logDestinationType: String)

      public fun logType(logType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration.LogDestinationConfigProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration.LogDestinationConfigProperty.builder()

      override fun logDestination(logDestination: IResolvable) {
        cdkBuilder.logDestination(logDestination.let(IResolvable::unwrap))
      }

      override fun logDestination(logDestination: Map<String, String>) {
        cdkBuilder.logDestination(logDestination)
      }

      override fun logDestinationType(logDestinationType: String) {
        cdkBuilder.logDestinationType(logDestinationType)
      }

      override fun logType(logType: String) {
        cdkBuilder.logType(logType)
      }

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration.LogDestinationConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration.LogDestinationConfigProperty,
    ) : CdkObject(cdkObject), LogDestinationConfigProperty {
      override fun logDestination(): Any = unwrap(this).getLogDestination()

      override fun logDestinationType(): String = unwrap(this).getLogDestinationType()

      override fun logType(): String = unwrap(this).getLogType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LogDestinationConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration.LogDestinationConfigProperty):
          LogDestinationConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LogDestinationConfigProperty):
          software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration.LogDestinationConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration.LogDestinationConfigProperty
    }
  }

  public interface LoggingConfigurationProperty {
    public fun logDestinationConfigs(): Any

    @CdkDslMarker
    public interface Builder {
      public fun logDestinationConfigs(logDestinationConfigs: IResolvable)

      public fun logDestinationConfigs(logDestinationConfigs: List<Any>)

      public fun logDestinationConfigs(vararg logDestinationConfigs: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration.LoggingConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration.LoggingConfigurationProperty.builder()

      override fun logDestinationConfigs(logDestinationConfigs: IResolvable) {
        cdkBuilder.logDestinationConfigs(logDestinationConfigs.let(IResolvable::unwrap))
      }

      override fun logDestinationConfigs(logDestinationConfigs: List<Any>) {
        cdkBuilder.logDestinationConfigs(logDestinationConfigs)
      }

      override fun logDestinationConfigs(vararg logDestinationConfigs: Any): Unit =
          logDestinationConfigs(logDestinationConfigs.toList())

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration.LoggingConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration.LoggingConfigurationProperty,
    ) : CdkObject(cdkObject), LoggingConfigurationProperty {
      override fun logDestinationConfigs(): Any = unwrap(this).getLogDestinationConfigs()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LoggingConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration.LoggingConfigurationProperty):
          LoggingConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoggingConfigurationProperty):
          software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration.LoggingConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration.LoggingConfigurationProperty
    }
  }
}
