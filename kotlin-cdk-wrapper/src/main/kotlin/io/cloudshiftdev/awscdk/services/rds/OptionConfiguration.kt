@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Configuration properties for an option.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * import io.cloudshiftdev.awscdk.services.rds.*;
 * SecurityGroup securityGroup;
 * Vpc vpc;
 * OptionConfiguration optionConfiguration = OptionConfiguration.builder()
 * .name("name")
 * // the properties below are optional
 * .port(123)
 * .securityGroups(List.of(securityGroup))
 * .settings(Map.of(
 * "settingsKey", "settings"))
 * .version("version")
 * .vpc(vpc)
 * .build();
 * ```
 */
public interface OptionConfiguration {
  /**
   * The name of the option.
   */
  public fun name(): String

  /**
   * The port number that this option uses.
   *
   * If `port` is specified then `vpc`
   * must also be specified.
   *
   * Default: - no port
   */
  public fun port(): Number? = unwrap(this).getPort()

  /**
   * Optional list of security groups to use for this option, if `vpc` is specified.
   *
   * If no groups are provided, a default one will be created.
   *
   * Default: - a default group will be created if `port` or `vpc` are specified.
   */
  public fun securityGroups(): List<ISecurityGroup> =
      unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

  /**
   * The settings for the option.
   *
   * Default: - no settings
   */
  public fun settings(): Map<String, String> = unwrap(this).getSettings() ?: emptyMap()

  /**
   * The version for the option.
   *
   * Default: - no version
   */
  public fun version(): String? = unwrap(this).getVersion()

  /**
   * The VPC where a security group should be created for this option.
   *
   * If `vpc`
   * is specified then `port` must also be specified.
   *
   * Default: - no VPC
   */
  public fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

  /**
   * A builder for [OptionConfiguration]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param name The name of the option. 
     */
    public fun name(name: String)

    /**
     * @param port The port number that this option uses.
     * If `port` is specified then `vpc`
     * must also be specified.
     */
    public fun port(port: Number)

    /**
     * @param securityGroups Optional list of security groups to use for this option, if `vpc` is
     * specified.
     * If no groups are provided, a default one will be created.
     */
    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    /**
     * @param securityGroups Optional list of security groups to use for this option, if `vpc` is
     * specified.
     * If no groups are provided, a default one will be created.
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    /**
     * @param settings The settings for the option.
     */
    public fun tings(settings: Map<String, String>)

    /**
     * @param version The version for the option.
     */
    public fun version(version: String)

    /**
     * @param vpc The VPC where a security group should be created for this option.
     * If `vpc`
     * is specified then `port` must also be specified.
     */
    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.OptionConfiguration.Builder =
        software.amazon.awscdk.services.rds.OptionConfiguration.builder()

    /**
     * @param name The name of the option. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param port The port number that this option uses.
     * If `port` is specified then `vpc`
     * must also be specified.
     */
    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    /**
     * @param securityGroups Optional list of security groups to use for this option, if `vpc` is
     * specified.
     * If no groups are provided, a default one will be created.
     */
    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    /**
     * @param securityGroups Optional list of security groups to use for this option, if `vpc` is
     * specified.
     * If no groups are provided, a default one will be created.
     */
    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    /**
     * @param settings The settings for the option.
     */
    override fun tings(settings: Map<String, String>) {
      cdkBuilder.settings(settings)
    }

    /**
     * @param version The version for the option.
     */
    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    /**
     * @param vpc The VPC where a security group should be created for this option.
     * If `vpc`
     * is specified then `port` must also be specified.
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.rds.OptionConfiguration = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.OptionConfiguration,
  ) : CdkObject(cdkObject), OptionConfiguration {
    /**
     * The name of the option.
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The port number that this option uses.
     *
     * If `port` is specified then `vpc`
     * must also be specified.
     *
     * Default: - no port
     */
    override fun port(): Number? = unwrap(this).getPort()

    /**
     * Optional list of security groups to use for this option, if `vpc` is specified.
     *
     * If no groups are provided, a default one will be created.
     *
     * Default: - a default group will be created if `port` or `vpc` are specified.
     */
    override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

    /**
     * The settings for the option.
     *
     * Default: - no settings
     */
    override fun settings(): Map<String, String> = unwrap(this).getSettings() ?: emptyMap()

    /**
     * The version for the option.
     *
     * Default: - no version
     */
    override fun version(): String? = unwrap(this).getVersion()

    /**
     * The VPC where a security group should be created for this option.
     *
     * If `vpc`
     * is specified then `port` must also be specified.
     *
     * Default: - no VPC
     */
    override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): OptionConfiguration {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.OptionConfiguration):
        OptionConfiguration = Wrapper(cdkObject)

    internal fun unwrap(wrapped: OptionConfiguration):
        software.amazon.awscdk.services.rds.OptionConfiguration = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.rds.OptionConfiguration
  }
}
