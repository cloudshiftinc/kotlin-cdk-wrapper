@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.networkfirewall

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnLoggingConfigurationProps {
  public fun firewallArn(): String

  public fun firewallName(): String? = unwrap(this).getFirewallName()

  public fun loggingConfiguration(): Any

  @CdkDslMarker
  public interface Builder {
    public fun firewallArn(firewallArn: String)

    public fun firewallName(firewallName: String)

    public fun loggingConfiguration(loggingConfiguration: IResolvable)

    public
        fun loggingConfiguration(loggingConfiguration: CfnLoggingConfiguration.LoggingConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("faae8690cb2209a2d404af701049d8897df79de9825f4a0ae3fbefad45be0c21")
    public
        fun loggingConfiguration(loggingConfiguration: CfnLoggingConfiguration.LoggingConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.networkfirewall.CfnLoggingConfigurationProps.Builder =
        software.amazon.awscdk.services.networkfirewall.CfnLoggingConfigurationProps.builder()

    override fun firewallArn(firewallArn: String) {
      cdkBuilder.firewallArn(firewallArn)
    }

    override fun firewallName(firewallName: String) {
      cdkBuilder.firewallName(firewallName)
    }

    override fun loggingConfiguration(loggingConfiguration: IResolvable) {
      cdkBuilder.loggingConfiguration(loggingConfiguration.let(IResolvable::unwrap))
    }

    override
        fun loggingConfiguration(loggingConfiguration: CfnLoggingConfiguration.LoggingConfigurationProperty) {
      cdkBuilder.loggingConfiguration(loggingConfiguration.let(CfnLoggingConfiguration.LoggingConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("faae8690cb2209a2d404af701049d8897df79de9825f4a0ae3fbefad45be0c21")
    override
        fun loggingConfiguration(loggingConfiguration: CfnLoggingConfiguration.LoggingConfigurationProperty.Builder.() -> Unit):
        Unit =
        loggingConfiguration(CfnLoggingConfiguration.LoggingConfigurationProperty(loggingConfiguration))

    public fun build(): software.amazon.awscdk.services.networkfirewall.CfnLoggingConfigurationProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.networkfirewall.CfnLoggingConfigurationProps,
  ) : CdkObject(cdkObject), CfnLoggingConfigurationProps {
    override fun firewallArn(): String = unwrap(this).getFirewallArn()

    override fun firewallName(): String? = unwrap(this).getFirewallName()

    override fun loggingConfiguration(): Any = unwrap(this).getLoggingConfiguration()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLoggingConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnLoggingConfigurationProps):
        CfnLoggingConfigurationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLoggingConfigurationProps):
        software.amazon.awscdk.services.networkfirewall.CfnLoggingConfigurationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.networkfirewall.CfnLoggingConfigurationProps
  }
}
