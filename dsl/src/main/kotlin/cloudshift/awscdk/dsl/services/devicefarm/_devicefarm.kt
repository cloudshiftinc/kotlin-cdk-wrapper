@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.devicefarm

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.devicefarm.CfnDevicePool
import software.amazon.awscdk.services.devicefarm.CfnDevicePoolProps
import software.amazon.awscdk.services.devicefarm.CfnInstanceProfile
import software.amazon.awscdk.services.devicefarm.CfnInstanceProfileProps
import software.amazon.awscdk.services.devicefarm.CfnNetworkProfile
import software.amazon.awscdk.services.devicefarm.CfnNetworkProfileProps
import software.amazon.awscdk.services.devicefarm.CfnProject
import software.amazon.awscdk.services.devicefarm.CfnProjectProps
import software.amazon.awscdk.services.devicefarm.CfnTestGridProject
import software.amazon.awscdk.services.devicefarm.CfnTestGridProjectProps
import software.amazon.awscdk.services.devicefarm.CfnVPCEConfiguration
import software.amazon.awscdk.services.devicefarm.CfnVPCEConfigurationProps
import software.constructs.Construct

public object devicefarm {
  /**
   * Represents a request to the create device pool operation.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.devicefarm.*;
   * CfnDevicePool cfnDevicePool = CfnDevicePool.Builder.create(this, "MyCfnDevicePool")
   * .name("name")
   * .projectArn("projectArn")
   * .rules(List.of(RuleProperty.builder()
   * .attribute("attribute")
   * .operator("operator")
   * .value("value")
   * .build()))
   * // the properties below are optional
   * .description("description")
   * .maxDevices(123)
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-devicepool.html)
   */
  public inline fun cfnDevicePool(
    scope: Construct,
    id: String,
    block: CfnDevicePoolDsl.() -> Unit = {},
  ): CfnDevicePool {
    val builder = CfnDevicePoolDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnDevicePool`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.devicefarm.*;
   * CfnDevicePoolProps cfnDevicePoolProps = CfnDevicePoolProps.builder()
   * .name("name")
   * .projectArn("projectArn")
   * .rules(List.of(RuleProperty.builder()
   * .attribute("attribute")
   * .operator("operator")
   * .value("value")
   * .build()))
   * // the properties below are optional
   * .description("description")
   * .maxDevices(123)
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-devicepool.html)
   */
  public inline fun cfnDevicePoolProps(block: CfnDevicePoolPropsDsl.() -> Unit = {}):
      CfnDevicePoolProps {
    val builder = CfnDevicePoolPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Represents a condition for a device pool.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.devicefarm.*;
   * RuleProperty ruleProperty = RuleProperty.builder()
   * .attribute("attribute")
   * .operator("operator")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-devicefarm-devicepool-rule.html)
   */
  public inline fun cfnDevicePoolRuleProperty(block: CfnDevicePoolRulePropertyDsl.() -> Unit = {}):
      CfnDevicePool.RuleProperty {
    val builder = CfnDevicePoolRulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Creates a profile that can be applied to one or more private fleet device instances.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.devicefarm.*;
   * CfnInstanceProfile cfnInstanceProfile = CfnInstanceProfile.Builder.create(this,
   * "MyCfnInstanceProfile")
   * .name("name")
   * // the properties below are optional
   * .description("description")
   * .excludeAppPackagesFromCleanup(List.of("excludeAppPackagesFromCleanup"))
   * .packageCleanup(false)
   * .rebootAfterUse(false)
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-instanceprofile.html)
   */
  public inline fun cfnInstanceProfile(
    scope: Construct,
    id: String,
    block: CfnInstanceProfileDsl.() -> Unit = {},
  ): CfnInstanceProfile {
    val builder = CfnInstanceProfileDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnInstanceProfile`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.devicefarm.*;
   * CfnInstanceProfileProps cfnInstanceProfileProps = CfnInstanceProfileProps.builder()
   * .name("name")
   * // the properties below are optional
   * .description("description")
   * .excludeAppPackagesFromCleanup(List.of("excludeAppPackagesFromCleanup"))
   * .packageCleanup(false)
   * .rebootAfterUse(false)
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-instanceprofile.html)
   */
  public inline fun cfnInstanceProfileProps(block: CfnInstanceProfilePropsDsl.() -> Unit = {}):
      CfnInstanceProfileProps {
    val builder = CfnInstanceProfilePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Creates a network profile.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.devicefarm.*;
   * CfnNetworkProfile cfnNetworkProfile = CfnNetworkProfile.Builder.create(this,
   * "MyCfnNetworkProfile")
   * .name("name")
   * .projectArn("projectArn")
   * // the properties below are optional
   * .description("description")
   * .downlinkBandwidthBits(123)
   * .downlinkDelayMs(123)
   * .downlinkJitterMs(123)
   * .downlinkLossPercent(123)
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .uplinkBandwidthBits(123)
   * .uplinkDelayMs(123)
   * .uplinkJitterMs(123)
   * .uplinkLossPercent(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html)
   */
  public inline fun cfnNetworkProfile(
    scope: Construct,
    id: String,
    block: CfnNetworkProfileDsl.() -> Unit = {},
  ): CfnNetworkProfile {
    val builder = CfnNetworkProfileDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnNetworkProfile`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.devicefarm.*;
   * CfnNetworkProfileProps cfnNetworkProfileProps = CfnNetworkProfileProps.builder()
   * .name("name")
   * .projectArn("projectArn")
   * // the properties below are optional
   * .description("description")
   * .downlinkBandwidthBits(123)
   * .downlinkDelayMs(123)
   * .downlinkJitterMs(123)
   * .downlinkLossPercent(123)
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .uplinkBandwidthBits(123)
   * .uplinkDelayMs(123)
   * .uplinkJitterMs(123)
   * .uplinkLossPercent(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-networkprofile.html)
   */
  public inline fun cfnNetworkProfileProps(block: CfnNetworkProfilePropsDsl.() -> Unit = {}):
      CfnNetworkProfileProps {
    val builder = CfnNetworkProfilePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Creates a project.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.devicefarm.*;
   * CfnProject cfnProject = CfnProject.Builder.create(this, "MyCfnProject")
   * .name("name")
   * // the properties below are optional
   * .defaultJobTimeoutMinutes(123)
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .vpcConfig(VpcConfigProperty.builder()
   * .securityGroupIds(List.of("securityGroupIds"))
   * .subnetIds(List.of("subnetIds"))
   * .vpcId("vpcId")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-project.html)
   */
  public inline fun cfnProject(
    scope: Construct,
    id: String,
    block: CfnProjectDsl.() -> Unit = {},
  ): CfnProject {
    val builder = CfnProjectDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnProject`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.devicefarm.*;
   * CfnProjectProps cfnProjectProps = CfnProjectProps.builder()
   * .name("name")
   * // the properties below are optional
   * .defaultJobTimeoutMinutes(123)
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .vpcConfig(VpcConfigProperty.builder()
   * .securityGroupIds(List.of("securityGroupIds"))
   * .subnetIds(List.of("subnetIds"))
   * .vpcId("vpcId")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-project.html)
   */
  public inline fun cfnProjectProps(block: CfnProjectPropsDsl.() -> Unit = {}): CfnProjectProps {
    val builder = CfnProjectPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The VPC security groups and subnets that are attached to a project.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.devicefarm.*;
   * VpcConfigProperty vpcConfigProperty = VpcConfigProperty.builder()
   * .securityGroupIds(List.of("securityGroupIds"))
   * .subnetIds(List.of("subnetIds"))
   * .vpcId("vpcId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-devicefarm-project-vpcconfig.html)
   */
  public inline fun cfnProjectVpcConfigProperty(block: CfnProjectVpcConfigPropertyDsl.() -> Unit =
      {}): CfnProject.VpcConfigProperty {
    val builder = CfnProjectVpcConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A Selenium testing project.
   *
   * Projects are used to collect and collate sessions.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.devicefarm.*;
   * CfnTestGridProject cfnTestGridProject = CfnTestGridProject.Builder.create(this,
   * "MyCfnTestGridProject")
   * .name("name")
   * // the properties below are optional
   * .description("description")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .vpcConfig(VpcConfigProperty.builder()
   * .securityGroupIds(List.of("securityGroupIds"))
   * .subnetIds(List.of("subnetIds"))
   * .vpcId("vpcId")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-testgridproject.html)
   */
  public inline fun cfnTestGridProject(
    scope: Construct,
    id: String,
    block: CfnTestGridProjectDsl.() -> Unit = {},
  ): CfnTestGridProject {
    val builder = CfnTestGridProjectDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnTestGridProject`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.devicefarm.*;
   * CfnTestGridProjectProps cfnTestGridProjectProps = CfnTestGridProjectProps.builder()
   * .name("name")
   * // the properties below are optional
   * .description("description")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .vpcConfig(VpcConfigProperty.builder()
   * .securityGroupIds(List.of("securityGroupIds"))
   * .subnetIds(List.of("subnetIds"))
   * .vpcId("vpcId")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-testgridproject.html)
   */
  public inline fun cfnTestGridProjectProps(block: CfnTestGridProjectPropsDsl.() -> Unit = {}):
      CfnTestGridProjectProps {
    val builder = CfnTestGridProjectPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The VPC security groups and subnets attached to the `TestGrid` project.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.devicefarm.*;
   * VpcConfigProperty vpcConfigProperty = VpcConfigProperty.builder()
   * .securityGroupIds(List.of("securityGroupIds"))
   * .subnetIds(List.of("subnetIds"))
   * .vpcId("vpcId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-devicefarm-testgridproject-vpcconfig.html)
   */
  public inline
      fun cfnTestGridProjectVpcConfigProperty(block: CfnTestGridProjectVpcConfigPropertyDsl.() -> Unit
      = {}): CfnTestGridProject.VpcConfigProperty {
    val builder = CfnTestGridProjectVpcConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Creates a configuration record in Device Farm for your Amazon Virtual Private Cloud (VPC)
   * endpoint service.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.devicefarm.*;
   * CfnVPCEConfiguration cfnVPCEConfiguration = CfnVPCEConfiguration.Builder.create(this,
   * "MyCfnVPCEConfiguration")
   * .serviceDnsName("serviceDnsName")
   * .vpceConfigurationName("vpceConfigurationName")
   * .vpceServiceName("vpceServiceName")
   * // the properties below are optional
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .vpceConfigurationDescription("vpceConfigurationDescription")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-vpceconfiguration.html)
   */
  public inline fun cfnVPCEConfiguration(
    scope: Construct,
    id: String,
    block: CfnVPCEConfigurationDsl.() -> Unit = {},
  ): CfnVPCEConfiguration {
    val builder = CfnVPCEConfigurationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnVPCEConfiguration`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.devicefarm.*;
   * CfnVPCEConfigurationProps cfnVPCEConfigurationProps = CfnVPCEConfigurationProps.builder()
   * .serviceDnsName("serviceDnsName")
   * .vpceConfigurationName("vpceConfigurationName")
   * .vpceServiceName("vpceServiceName")
   * // the properties below are optional
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .vpceConfigurationDescription("vpceConfigurationDescription")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-vpceconfiguration.html)
   */
  public inline fun cfnVPCEConfigurationProps(block: CfnVPCEConfigurationPropsDsl.() -> Unit = {}):
      CfnVPCEConfigurationProps {
    val builder = CfnVPCEConfigurationPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
