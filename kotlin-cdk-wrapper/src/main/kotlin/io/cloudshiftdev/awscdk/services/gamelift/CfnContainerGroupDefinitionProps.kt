@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.gamelift

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnContainerGroupDefinition`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.gamelift.*;
 * CfnContainerGroupDefinitionProps cfnContainerGroupDefinitionProps =
 * CfnContainerGroupDefinitionProps.builder()
 * .name("name")
 * .operatingSystem("operatingSystem")
 * .totalMemoryLimitMebibytes(123)
 * .totalVcpuLimit(123)
 * // the properties below are optional
 * .containerGroupType("containerGroupType")
 * .gameServerContainerDefinition(GameServerContainerDefinitionProperty.builder()
 * .containerName("containerName")
 * .imageUri("imageUri")
 * .serverSdkVersion("serverSdkVersion")
 * // the properties below are optional
 * .dependsOn(List.of(ContainerDependencyProperty.builder()
 * .condition("condition")
 * .containerName("containerName")
 * .build()))
 * .environmentOverride(List.of(ContainerEnvironmentProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .mountPoints(List.of(ContainerMountPointProperty.builder()
 * .instancePath("instancePath")
 * // the properties below are optional
 * .accessLevel("accessLevel")
 * .containerPath("containerPath")
 * .build()))
 * .portConfiguration(PortConfigurationProperty.builder()
 * .containerPortRanges(List.of(ContainerPortRangeProperty.builder()
 * .fromPort(123)
 * .protocol("protocol")
 * .toPort(123)
 * .build()))
 * .build())
 * .resolvedImageDigest("resolvedImageDigest")
 * .build())
 * .sourceVersionNumber(123)
 * .supportContainerDefinitions(List.of(SupportContainerDefinitionProperty.builder()
 * .containerName("containerName")
 * .imageUri("imageUri")
 * // the properties below are optional
 * .dependsOn(List.of(ContainerDependencyProperty.builder()
 * .condition("condition")
 * .containerName("containerName")
 * .build()))
 * .environmentOverride(List.of(ContainerEnvironmentProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .essential(false)
 * .healthCheck(ContainerHealthCheckProperty.builder()
 * .command(List.of("command"))
 * // the properties below are optional
 * .interval(123)
 * .retries(123)
 * .startPeriod(123)
 * .timeout(123)
 * .build())
 * .memoryHardLimitMebibytes(123)
 * .mountPoints(List.of(ContainerMountPointProperty.builder()
 * .instancePath("instancePath")
 * // the properties below are optional
 * .accessLevel("accessLevel")
 * .containerPath("containerPath")
 * .build()))
 * .portConfiguration(PortConfigurationProperty.builder()
 * .containerPortRanges(List.of(ContainerPortRangeProperty.builder()
 * .fromPort(123)
 * .protocol("protocol")
 * .toPort(123)
 * .build()))
 * .build())
 * .resolvedImageDigest("resolvedImageDigest")
 * .vcpu(123)
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .versionDescription("versionDescription")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html)
 */
public interface CfnContainerGroupDefinitionProps {
  /**
   * The type of container group.
   *
   * Container group type determines how Amazon GameLift Servers deploys the container group on each
   * fleet instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-containergrouptype)
   */
  public fun containerGroupType(): String? = unwrap(this).getContainerGroupType()

  /**
   * The definition for the game server container in this group.
   *
   * This property is used only when the container group type is `GAME_SERVER` . This container
   * definition specifies a container image with the game server build.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-gameservercontainerdefinition)
   */
  public fun gameServerContainerDefinition(): Any? = unwrap(this).getGameServerContainerDefinition()

  /**
   * A descriptive identifier for the container group definition.
   *
   * The name value is unique in an AWS Region.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-name)
   */
  public fun name(): String

  /**
   * The platform that all containers in the container group definition run on.
   *
   *
   * Amazon Linux 2 (AL2) will reach end of support on 6/30/2025. See more details in the [Amazon
   * Linux 2 FAQs](https://docs.aws.amazon.com/amazon-linux-2/faqs/) . For game servers that are hosted
   * on AL2 and use server SDK version 4.x for Amazon GameLift Servers, first update the game server
   * build to server SDK 5.x, and then deploy to AL2023 instances. See [Migrate to server SDK version
   * 5.](https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-serversdk5-migration.html)
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-operatingsystem)
   */
  public fun operatingSystem(): String

  /**
   * A specific ContainerGroupDefinition version to be updated.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-sourceversionnumber)
   */
  public fun sourceVersionNumber(): Number? = unwrap(this).getSourceVersionNumber()

  /**
   * The set of definitions for support containers in this group.
   *
   * A container group definition might have zero support container definitions. Support container
   * can be used in any type of container group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-supportcontainerdefinitions)
   */
  public fun supportContainerDefinitions(): Any? = unwrap(this).getSupportContainerDefinitions()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The amount of memory (in MiB) on a fleet instance to allocate for the container group.
   *
   * All containers in the group share these resources.
   *
   * You can set a limit for each container definition in the group. If individual containers have
   * limits, this total value must be greater than any individual container's memory limit.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-totalmemorylimitmebibytes)
   */
  public fun totalMemoryLimitMebibytes(): Number

  /**
   * The amount of vCPU units on a fleet instance to allocate for the container group (1 vCPU is
   * equal to 1024 CPU units).
   *
   * All containers in the group share these resources. You can set a limit for each container
   * definition in the group. If individual containers have limits, this total value must be equal to
   * or greater than the sum of the limits for each container in the group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-totalvcpulimit)
   */
  public fun totalVcpuLimit(): Number

  /**
   * An optional description that was provided for a container group definition update.
   *
   * Each version can have a unique description.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-versiondescription)
   */
  public fun versionDescription(): String? = unwrap(this).getVersionDescription()

  /**
   * A builder for [CfnContainerGroupDefinitionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param containerGroupType The type of container group.
     * Container group type determines how Amazon GameLift Servers deploys the container group on
     * each fleet instance.
     */
    public fun containerGroupType(containerGroupType: String)

    /**
     * @param gameServerContainerDefinition The definition for the game server container in this
     * group.
     * This property is used only when the container group type is `GAME_SERVER` . This container
     * definition specifies a container image with the game server build.
     */
    public fun gameServerContainerDefinition(gameServerContainerDefinition: IResolvable)

    /**
     * @param gameServerContainerDefinition The definition for the game server container in this
     * group.
     * This property is used only when the container group type is `GAME_SERVER` . This container
     * definition specifies a container image with the game server build.
     */
    public
        fun gameServerContainerDefinition(gameServerContainerDefinition: CfnContainerGroupDefinition.GameServerContainerDefinitionProperty)

    /**
     * @param gameServerContainerDefinition The definition for the game server container in this
     * group.
     * This property is used only when the container group type is `GAME_SERVER` . This container
     * definition specifies a container image with the game server build.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3cf7546d1b262c380d1d87329314b91139b26f392e21caf28b685aca186ec6d2")
    public
        fun gameServerContainerDefinition(gameServerContainerDefinition: CfnContainerGroupDefinition.GameServerContainerDefinitionProperty.Builder.() -> Unit)

    /**
     * @param name A descriptive identifier for the container group definition. 
     * The name value is unique in an AWS Region.
     */
    public fun name(name: String)

    /**
     * @param operatingSystem The platform that all containers in the container group definition run
     * on. 
     *
     * Amazon Linux 2 (AL2) will reach end of support on 6/30/2025. See more details in the [Amazon
     * Linux 2 FAQs](https://docs.aws.amazon.com/amazon-linux-2/faqs/) . For game servers that are
     * hosted on AL2 and use server SDK version 4.x for Amazon GameLift Servers, first update the game
     * server build to server SDK 5.x, and then deploy to AL2023 instances. See [Migrate to server SDK
     * version
     * 5.](https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-serversdk5-migration.html)
     */
    public fun operatingSystem(operatingSystem: String)

    /**
     * @param sourceVersionNumber A specific ContainerGroupDefinition version to be updated.
     */
    public fun sourceVersionNumber(sourceVersionNumber: Number)

    /**
     * @param supportContainerDefinitions The set of definitions for support containers in this
     * group.
     * A container group definition might have zero support container definitions. Support container
     * can be used in any type of container group.
     */
    public fun supportContainerDefinitions(supportContainerDefinitions: IResolvable)

    /**
     * @param supportContainerDefinitions The set of definitions for support containers in this
     * group.
     * A container group definition might have zero support container definitions. Support container
     * can be used in any type of container group.
     */
    public fun supportContainerDefinitions(supportContainerDefinitions: List<Any>)

    /**
     * @param supportContainerDefinitions The set of definitions for support containers in this
     * group.
     * A container group definition might have zero support container definitions. Support container
     * can be used in any type of container group.
     */
    public fun supportContainerDefinitions(vararg supportContainerDefinitions: Any)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param totalMemoryLimitMebibytes The amount of memory (in MiB) on a fleet instance to
     * allocate for the container group. 
     * All containers in the group share these resources.
     *
     * You can set a limit for each container definition in the group. If individual containers have
     * limits, this total value must be greater than any individual container's memory limit.
     */
    public fun totalMemoryLimitMebibytes(totalMemoryLimitMebibytes: Number)

    /**
     * @param totalVcpuLimit The amount of vCPU units on a fleet instance to allocate for the
     * container group (1 vCPU is equal to 1024 CPU units). 
     * All containers in the group share these resources. You can set a limit for each container
     * definition in the group. If individual containers have limits, this total value must be equal to
     * or greater than the sum of the limits for each container in the group.
     */
    public fun totalVcpuLimit(totalVcpuLimit: Number)

    /**
     * @param versionDescription An optional description that was provided for a container group
     * definition update.
     * Each version can have a unique description.
     */
    public fun versionDescription(versionDescription: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinitionProps.Builder =
        software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinitionProps.builder()

    /**
     * @param containerGroupType The type of container group.
     * Container group type determines how Amazon GameLift Servers deploys the container group on
     * each fleet instance.
     */
    override fun containerGroupType(containerGroupType: String) {
      cdkBuilder.containerGroupType(containerGroupType)
    }

    /**
     * @param gameServerContainerDefinition The definition for the game server container in this
     * group.
     * This property is used only when the container group type is `GAME_SERVER` . This container
     * definition specifies a container image with the game server build.
     */
    override fun gameServerContainerDefinition(gameServerContainerDefinition: IResolvable) {
      cdkBuilder.gameServerContainerDefinition(gameServerContainerDefinition.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param gameServerContainerDefinition The definition for the game server container in this
     * group.
     * This property is used only when the container group type is `GAME_SERVER` . This container
     * definition specifies a container image with the game server build.
     */
    override
        fun gameServerContainerDefinition(gameServerContainerDefinition: CfnContainerGroupDefinition.GameServerContainerDefinitionProperty) {
      cdkBuilder.gameServerContainerDefinition(gameServerContainerDefinition.let(CfnContainerGroupDefinition.GameServerContainerDefinitionProperty.Companion::unwrap))
    }

    /**
     * @param gameServerContainerDefinition The definition for the game server container in this
     * group.
     * This property is used only when the container group type is `GAME_SERVER` . This container
     * definition specifies a container image with the game server build.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3cf7546d1b262c380d1d87329314b91139b26f392e21caf28b685aca186ec6d2")
    override
        fun gameServerContainerDefinition(gameServerContainerDefinition: CfnContainerGroupDefinition.GameServerContainerDefinitionProperty.Builder.() -> Unit):
        Unit =
        gameServerContainerDefinition(CfnContainerGroupDefinition.GameServerContainerDefinitionProperty(gameServerContainerDefinition))

    /**
     * @param name A descriptive identifier for the container group definition. 
     * The name value is unique in an AWS Region.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param operatingSystem The platform that all containers in the container group definition run
     * on. 
     *
     * Amazon Linux 2 (AL2) will reach end of support on 6/30/2025. See more details in the [Amazon
     * Linux 2 FAQs](https://docs.aws.amazon.com/amazon-linux-2/faqs/) . For game servers that are
     * hosted on AL2 and use server SDK version 4.x for Amazon GameLift Servers, first update the game
     * server build to server SDK 5.x, and then deploy to AL2023 instances. See [Migrate to server SDK
     * version
     * 5.](https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-serversdk5-migration.html)
     */
    override fun operatingSystem(operatingSystem: String) {
      cdkBuilder.operatingSystem(operatingSystem)
    }

    /**
     * @param sourceVersionNumber A specific ContainerGroupDefinition version to be updated.
     */
    override fun sourceVersionNumber(sourceVersionNumber: Number) {
      cdkBuilder.sourceVersionNumber(sourceVersionNumber)
    }

    /**
     * @param supportContainerDefinitions The set of definitions for support containers in this
     * group.
     * A container group definition might have zero support container definitions. Support container
     * can be used in any type of container group.
     */
    override fun supportContainerDefinitions(supportContainerDefinitions: IResolvable) {
      cdkBuilder.supportContainerDefinitions(supportContainerDefinitions.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param supportContainerDefinitions The set of definitions for support containers in this
     * group.
     * A container group definition might have zero support container definitions. Support container
     * can be used in any type of container group.
     */
    override fun supportContainerDefinitions(supportContainerDefinitions: List<Any>) {
      cdkBuilder.supportContainerDefinitions(supportContainerDefinitions.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param supportContainerDefinitions The set of definitions for support containers in this
     * group.
     * A container group definition might have zero support container definitions. Support container
     * can be used in any type of container group.
     */
    override fun supportContainerDefinitions(vararg supportContainerDefinitions: Any): Unit =
        supportContainerDefinitions(supportContainerDefinitions.toList())

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param totalMemoryLimitMebibytes The amount of memory (in MiB) on a fleet instance to
     * allocate for the container group. 
     * All containers in the group share these resources.
     *
     * You can set a limit for each container definition in the group. If individual containers have
     * limits, this total value must be greater than any individual container's memory limit.
     */
    override fun totalMemoryLimitMebibytes(totalMemoryLimitMebibytes: Number) {
      cdkBuilder.totalMemoryLimitMebibytes(totalMemoryLimitMebibytes)
    }

    /**
     * @param totalVcpuLimit The amount of vCPU units on a fleet instance to allocate for the
     * container group (1 vCPU is equal to 1024 CPU units). 
     * All containers in the group share these resources. You can set a limit for each container
     * definition in the group. If individual containers have limits, this total value must be equal to
     * or greater than the sum of the limits for each container in the group.
     */
    override fun totalVcpuLimit(totalVcpuLimit: Number) {
      cdkBuilder.totalVcpuLimit(totalVcpuLimit)
    }

    /**
     * @param versionDescription An optional description that was provided for a container group
     * definition update.
     * Each version can have a unique description.
     */
    override fun versionDescription(versionDescription: String) {
      cdkBuilder.versionDescription(versionDescription)
    }

    public fun build(): software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinitionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinitionProps,
  ) : CdkObject(cdkObject),
      CfnContainerGroupDefinitionProps {
    /**
     * The type of container group.
     *
     * Container group type determines how Amazon GameLift Servers deploys the container group on
     * each fleet instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-containergrouptype)
     */
    override fun containerGroupType(): String? = unwrap(this).getContainerGroupType()

    /**
     * The definition for the game server container in this group.
     *
     * This property is used only when the container group type is `GAME_SERVER` . This container
     * definition specifies a container image with the game server build.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-gameservercontainerdefinition)
     */
    override fun gameServerContainerDefinition(): Any? =
        unwrap(this).getGameServerContainerDefinition()

    /**
     * A descriptive identifier for the container group definition.
     *
     * The name value is unique in an AWS Region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The platform that all containers in the container group definition run on.
     *
     *
     * Amazon Linux 2 (AL2) will reach end of support on 6/30/2025. See more details in the [Amazon
     * Linux 2 FAQs](https://docs.aws.amazon.com/amazon-linux-2/faqs/) . For game servers that are
     * hosted on AL2 and use server SDK version 4.x for Amazon GameLift Servers, first update the game
     * server build to server SDK 5.x, and then deploy to AL2023 instances. See [Migrate to server SDK
     * version
     * 5.](https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-serversdk5-migration.html)
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-operatingsystem)
     */
    override fun operatingSystem(): String = unwrap(this).getOperatingSystem()

    /**
     * A specific ContainerGroupDefinition version to be updated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-sourceversionnumber)
     */
    override fun sourceVersionNumber(): Number? = unwrap(this).getSourceVersionNumber()

    /**
     * The set of definitions for support containers in this group.
     *
     * A container group definition might have zero support container definitions. Support container
     * can be used in any type of container group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-supportcontainerdefinitions)
     */
    override fun supportContainerDefinitions(): Any? = unwrap(this).getSupportContainerDefinitions()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The amount of memory (in MiB) on a fleet instance to allocate for the container group.
     *
     * All containers in the group share these resources.
     *
     * You can set a limit for each container definition in the group. If individual containers have
     * limits, this total value must be greater than any individual container's memory limit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-totalmemorylimitmebibytes)
     */
    override fun totalMemoryLimitMebibytes(): Number = unwrap(this).getTotalMemoryLimitMebibytes()

    /**
     * The amount of vCPU units on a fleet instance to allocate for the container group (1 vCPU is
     * equal to 1024 CPU units).
     *
     * All containers in the group share these resources. You can set a limit for each container
     * definition in the group. If individual containers have limits, this total value must be equal to
     * or greater than the sum of the limits for each container in the group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-totalvcpulimit)
     */
    override fun totalVcpuLimit(): Number = unwrap(this).getTotalVcpuLimit()

    /**
     * An optional description that was provided for a container group definition update.
     *
     * Each version can have a unique description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-versiondescription)
     */
    override fun versionDescription(): String? = unwrap(this).getVersionDescription()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnContainerGroupDefinitionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinitionProps):
        CfnContainerGroupDefinitionProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnContainerGroupDefinitionProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnContainerGroupDefinitionProps):
        software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinitionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinitionProps
  }
}
