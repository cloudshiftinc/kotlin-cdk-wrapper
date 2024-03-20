@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.collections.List

/**
 * A collection of configuration elements.
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
public open class InitConfig internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.InitConfig,
) : CdkObject(cdkObject) {
  public constructor(elements: List<InitElement>) :
      this(software.amazon.awscdk.services.ec2.InitConfig(elements.map(InitElement::unwrap))
  )

  public constructor(vararg elements: InitElement) : this(elements.toList()
  )

  /**
   * Add one or more elements to the config.
   *
   * @param elements 
   */
  public open fun add(vararg elements: InitElement) {
    unwrap(this).add(*elements.map(InitElement::unwrap).toTypedArray())
  }

  /**
   * Whether this configset has elements or not.
   */
  public open fun isEmpty(): Boolean = unwrap(this).isEmpty()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.InitConfig): InitConfig =
        InitConfig(cdkObject)

    internal fun unwrap(wrapped: InitConfig): software.amazon.awscdk.services.ec2.InitConfig =
        wrapped.cdkObject
  }
}
