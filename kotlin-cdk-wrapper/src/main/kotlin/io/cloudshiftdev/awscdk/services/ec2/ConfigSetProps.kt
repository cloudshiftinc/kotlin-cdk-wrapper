@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Options for CloudFormationInit.withConfigSets.
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * InstanceType instanceType;
 * IMachineImage machineImage;
 * Instance.Builder.create(this, "Instance")
 * .vpc(vpc)
 * .instanceType(instanceType)
 * .machineImage(machineImage)
 * // Showing the most complex setup, if you have simpler requirements
 * // you can use `CloudFormationInit.fromElements()`.
 * .init(CloudFormationInit.fromConfigSets(ConfigSetProps.builder()
 * .configSets(Map.of(
 * // Applies the configs below in this order
 * "default", List.of("yumPreinstall", "config")))
 * .configs(Map.of(
 * "yumPreinstall", new InitConfig(List.of(InitPackage.yum("git"))),
 * "config", new InitConfig(List.of(InitFile.fromObject("/etc/stack.json", Map.of(
 * "stackId", Stack.of(this).getStackId(),
 * "stackName", Stack.of(this).getStackName(),
 * "region", Stack.of(this).getRegion())), InitGroup.fromName("my-group"),
 * InitUser.fromName("my-user"),
 * InitPackage.rpm("http://mirrors.ukfast.co.uk/sites/dl.fedoraproject.org/pub/epel/8/Everything/x86_64/Packages/r/rubygem-git-1.5.0-2.el8.noarch.rpm")))))
 * .build()))
 * .initOptions(ApplyCloudFormationInitOptions.builder()
 * // Optional, which configsets to activate (['default'] by default)
 * .configSets(List.of("default"))
 * // Optional, how long the installation is expected to take (5 minutes by default)
 * .timeout(Duration.minutes(30))
 * // Optional, whether to include the --url argument when running cfn-init and cfn-signal commands
 * (false by default)
 * .includeUrl(true)
 * // Optional, whether to include the --role argument when running cfn-init and cfn-signal commands
 * (false by default)
 * .includeRole(true)
 * .build())
 * .build();
 * ```
 */
public interface ConfigSetProps {
  /**
   * The definitions of each config set.
   */
  public fun configSets(): Map<String, List<String>>

  /**
   * The sets of configs to pick from.
   */
  public fun configs(): Map<String, InitConfig>

  /**
   * A builder for [ConfigSetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param configSets The definitions of each config set. 
     */
    public fun configSets(configSets: Map<String, List<String>>)

    /**
     * @param configs The sets of configs to pick from. 
     */
    public fun configs(configs: Map<String, InitConfig>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.ConfigSetProps.Builder =
        software.amazon.awscdk.services.ec2.ConfigSetProps.builder()

    /**
     * @param configSets The definitions of each config set. 
     */
    override fun configSets(configSets: Map<String, List<String>>) {
      cdkBuilder.configSets(configSets)
    }

    /**
     * @param configs The sets of configs to pick from. 
     */
    override fun configs(configs: Map<String, InitConfig>) {
      cdkBuilder.configs(configs.mapValues{InitConfig.unwrap(it.value)})
    }

    public fun build(): software.amazon.awscdk.services.ec2.ConfigSetProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.ConfigSetProps,
  ) : CdkObject(cdkObject),
      ConfigSetProps {
    /**
     * The definitions of each config set.
     */
    override fun configSets(): Map<String, List<String>> = unwrap(this).getConfigSets() ?:
        emptyMap()

    /**
     * The sets of configs to pick from.
     */
    override fun configs(): Map<String, InitConfig> =
        unwrap(this).getConfigs().mapValues{InitConfig.wrap(it.value)}
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ConfigSetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.ConfigSetProps): ConfigSetProps
        = CdkObjectWrappers.wrap(cdkObject) as? ConfigSetProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ConfigSetProps): software.amazon.awscdk.services.ec2.ConfigSetProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.ConfigSetProps
  }
}
