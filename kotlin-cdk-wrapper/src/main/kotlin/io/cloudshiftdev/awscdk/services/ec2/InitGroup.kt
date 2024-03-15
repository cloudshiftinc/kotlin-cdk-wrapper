@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import kotlin.Number
import kotlin.String

/**
 * Create Linux/UNIX groups and assign group IDs.
 *
 * Not supported for Windows systems.
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
public open class InitGroup internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.InitGroup,
) : InitElement(cdkObject) {
  /**
   * Returns the init element type for this element.
   */
  public override fun elementType(): String = unwrap(this).getElementType()

  public companion object {
    public fun fromName(groupName: String): InitGroup =
        software.amazon.awscdk.services.ec2.InitGroup.fromName(groupName).let(InitGroup::wrap)

    public fun fromName(groupName: String, groupId: Number): InitGroup =
        software.amazon.awscdk.services.ec2.InitGroup.fromName(groupName,
        groupId).let(InitGroup::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.InitGroup): InitGroup =
        InitGroup(cdkObject)

    internal fun unwrap(wrapped: InitGroup): software.amazon.awscdk.services.ec2.InitGroup =
        wrapped.cdkObject
  }
}
