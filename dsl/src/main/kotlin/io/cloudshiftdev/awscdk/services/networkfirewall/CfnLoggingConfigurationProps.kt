package io.cloudshiftdev.awscdk.services.networkfirewall

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnLoggingConfigurationProps {
  /**
   * The Amazon Resource Name (ARN) of the `Firewall` that the logging configuration is associated
   * with.
   *
   * You can't change the firewall specification after you create the logging configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-loggingconfiguration.html#cfn-networkfirewall-loggingconfiguration-firewallarn)
   */
  public fun firewallArn(): String

  /**
   * The name of the firewall that the logging configuration is associated with.
   *
   * You can't change the firewall specification after you create the logging configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-loggingconfiguration.html#cfn-networkfirewall-loggingconfiguration-firewallname)
   */
  public fun firewallName(): String? = unwrap(this).getFirewallName()

  /**
   * Defines how AWS Network Firewall performs logging for a `Firewall` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-loggingconfiguration.html#cfn-networkfirewall-loggingconfiguration-loggingconfiguration)
   */
  public fun loggingConfiguration(): Any

  /**
   * A builder for [CfnLoggingConfigurationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param firewallArn The Amazon Resource Name (ARN) of the `Firewall` that the logging
     * configuration is associated with. 
     * You can't change the firewall specification after you create the logging configuration.
     */
    public fun firewallArn(firewallArn: String)

    /**
     * @param firewallName The name of the firewall that the logging configuration is associated
     * with.
     * You can't change the firewall specification after you create the logging configuration.
     */
    public fun firewallName(firewallName: String)

    /**
     * @param loggingConfiguration Defines how AWS Network Firewall performs logging for a
     * `Firewall` . 
     */
    public fun loggingConfiguration(loggingConfiguration: IResolvable)

    /**
     * @param loggingConfiguration Defines how AWS Network Firewall performs logging for a
     * `Firewall` . 
     */
    public
        fun loggingConfiguration(loggingConfiguration: CfnLoggingConfiguration.LoggingConfigurationProperty)

    /**
     * @param loggingConfiguration Defines how AWS Network Firewall performs logging for a
     * `Firewall` . 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("faae8690cb2209a2d404af701049d8897df79de9825f4a0ae3fbefad45be0c21")
    public
        fun loggingConfiguration(loggingConfiguration: CfnLoggingConfiguration.LoggingConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.networkfirewall.CfnLoggingConfigurationProps.Builder =
        software.amazon.awscdk.services.networkfirewall.CfnLoggingConfigurationProps.builder()

    /**
     * @param firewallArn The Amazon Resource Name (ARN) of the `Firewall` that the logging
     * configuration is associated with. 
     * You can't change the firewall specification after you create the logging configuration.
     */
    override fun firewallArn(firewallArn: String) {
      cdkBuilder.firewallArn(firewallArn)
    }

    /**
     * @param firewallName The name of the firewall that the logging configuration is associated
     * with.
     * You can't change the firewall specification after you create the logging configuration.
     */
    override fun firewallName(firewallName: String) {
      cdkBuilder.firewallName(firewallName)
    }

    /**
     * @param loggingConfiguration Defines how AWS Network Firewall performs logging for a
     * `Firewall` . 
     */
    override fun loggingConfiguration(loggingConfiguration: IResolvable) {
      cdkBuilder.loggingConfiguration(loggingConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param loggingConfiguration Defines how AWS Network Firewall performs logging for a
     * `Firewall` . 
     */
    override
        fun loggingConfiguration(loggingConfiguration: CfnLoggingConfiguration.LoggingConfigurationProperty) {
      cdkBuilder.loggingConfiguration(loggingConfiguration.let(CfnLoggingConfiguration.LoggingConfigurationProperty::unwrap))
    }

    /**
     * @param loggingConfiguration Defines how AWS Network Firewall performs logging for a
     * `Firewall` . 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
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
    /**
     * The Amazon Resource Name (ARN) of the `Firewall` that the logging configuration is associated
     * with.
     *
     * You can't change the firewall specification after you create the logging configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-loggingconfiguration.html#cfn-networkfirewall-loggingconfiguration-firewallarn)
     */
    override fun firewallArn(): String = unwrap(this).getFirewallArn()

    /**
     * The name of the firewall that the logging configuration is associated with.
     *
     * You can't change the firewall specification after you create the logging configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-loggingconfiguration.html#cfn-networkfirewall-loggingconfiguration-firewallname)
     */
    override fun firewallName(): String? = unwrap(this).getFirewallName()

    /**
     * Defines how AWS Network Firewall performs logging for a `Firewall` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-loggingconfiguration.html#cfn-networkfirewall-loggingconfiguration-loggingconfiguration)
     */
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
