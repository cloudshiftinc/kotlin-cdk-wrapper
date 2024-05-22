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
 * .containerDefinitions(List.of(ContainerDefinitionProperty.builder()
 * .containerName("containerName")
 * .imageUri("imageUri")
 * // the properties below are optional
 * .command(List.of("command"))
 * .cpu(123)
 * .dependsOn(List.of(ContainerDependencyProperty.builder()
 * .condition("condition")
 * .containerName("containerName")
 * .build()))
 * .entryPoint(List.of("entryPoint"))
 * .environment(List.of(ContainerEnvironmentProperty.builder()
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
 * .memoryLimits(MemoryLimitsProperty.builder()
 * .hardLimit(123)
 * .softLimit(123)
 * .build())
 * .portConfiguration(PortConfigurationProperty.builder()
 * .containerPortRanges(List.of(ContainerPortRangeProperty.builder()
 * .fromPort(123)
 * .protocol("protocol")
 * .toPort(123)
 * .build()))
 * .build())
 * .resolvedImageDigest("resolvedImageDigest")
 * .workingDirectory("workingDirectory")
 * .build()))
 * .name("name")
 * .operatingSystem("operatingSystem")
 * .totalCpuLimit(123)
 * .totalMemoryLimit(123)
 * // the properties below are optional
 * .schedulingStrategy("schedulingStrategy")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html)
 */
public interface CfnContainerGroupDefinitionProps {
  /**
   * The set of container definitions that are included in the container group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-containerdefinitions)
   */
  public fun containerDefinitions(): Any

  /**
   * A descriptive identifier for the container group definition.
   *
   * The name value is unique in an AWS Region.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-name)
   */
  public fun name(): String

  /**
   * The platform required for all containers in the container group definition.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-operatingsystem)
   */
  public fun operatingSystem(): String

  /**
   * The method for deploying the container group across fleet instances.
   *
   * A replica container group might have multiple copies on each fleet instance. A daemon container
   * group maintains only one copy per fleet instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-schedulingstrategy)
   */
  public fun schedulingStrategy(): String? = unwrap(this).getSchedulingStrategy()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The amount of CPU units on a fleet instance to allocate for the container group.
   *
   * All containers in the group share these resources. This property is an integer value in CPU
   * units (1 vCPU is equal to 1024 CPU units).
   *
   * You can set additional limits for each `ContainerDefinition` in the group. If individual
   * containers have limits, this value must be equal to or greater than the sum of all
   * container-specific CPU limits in the group.
   *
   * For more details on memory allocation, see the [Container fleet design
   * guide](https://docs.aws.amazon.com/gamelift/latest/developerguide/containers-design-fleet) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-totalcpulimit)
   */
  public fun totalCpuLimit(): Number

  /**
   * The amount of memory (in MiB) on a fleet instance to allocate for the container group.
   *
   * All containers in the group share these resources.
   *
   * You can set additional limits for each `ContainerDefinition` in the group. If individual
   * containers have limits, this value must meet the following requirements:
   *
   * * Equal to or greater than the sum of all container-specific soft memory limits in the group.
   * * Equal to or greater than any container-specific hard limits in the group.
   *
   * For more details on memory allocation, see the [Container fleet design
   * guide](https://docs.aws.amazon.com/gamelift/latest/developerguide/containers-design-fleet) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-totalmemorylimit)
   */
  public fun totalMemoryLimit(): Number

  /**
   * A builder for [CfnContainerGroupDefinitionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param containerDefinitions The set of container definitions that are included in the
     * container group. 
     */
    public fun containerDefinitions(containerDefinitions: IResolvable)

    /**
     * @param containerDefinitions The set of container definitions that are included in the
     * container group. 
     */
    public fun containerDefinitions(containerDefinitions: List<Any>)

    /**
     * @param containerDefinitions The set of container definitions that are included in the
     * container group. 
     */
    public fun containerDefinitions(vararg containerDefinitions: Any)

    /**
     * @param name A descriptive identifier for the container group definition. 
     * The name value is unique in an AWS Region.
     */
    public fun name(name: String)

    /**
     * @param operatingSystem The platform required for all containers in the container group
     * definition. 
     */
    public fun operatingSystem(operatingSystem: String)

    /**
     * @param schedulingStrategy The method for deploying the container group across fleet
     * instances.
     * A replica container group might have multiple copies on each fleet instance. A daemon
     * container group maintains only one copy per fleet instance.
     */
    public fun schedulingStrategy(schedulingStrategy: String)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param totalCpuLimit The amount of CPU units on a fleet instance to allocate for the
     * container group. 
     * All containers in the group share these resources. This property is an integer value in CPU
     * units (1 vCPU is equal to 1024 CPU units).
     *
     * You can set additional limits for each `ContainerDefinition` in the group. If individual
     * containers have limits, this value must be equal to or greater than the sum of all
     * container-specific CPU limits in the group.
     *
     * For more details on memory allocation, see the [Container fleet design
     * guide](https://docs.aws.amazon.com/gamelift/latest/developerguide/containers-design-fleet) .
     */
    public fun totalCpuLimit(totalCpuLimit: Number)

    /**
     * @param totalMemoryLimit The amount of memory (in MiB) on a fleet instance to allocate for the
     * container group. 
     * All containers in the group share these resources.
     *
     * You can set additional limits for each `ContainerDefinition` in the group. If individual
     * containers have limits, this value must meet the following requirements:
     *
     * * Equal to or greater than the sum of all container-specific soft memory limits in the group.
     * * Equal to or greater than any container-specific hard limits in the group.
     *
     * For more details on memory allocation, see the [Container fleet design
     * guide](https://docs.aws.amazon.com/gamelift/latest/developerguide/containers-design-fleet) .
     */
    public fun totalMemoryLimit(totalMemoryLimit: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinitionProps.Builder =
        software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinitionProps.builder()

    /**
     * @param containerDefinitions The set of container definitions that are included in the
     * container group. 
     */
    override fun containerDefinitions(containerDefinitions: IResolvable) {
      cdkBuilder.containerDefinitions(containerDefinitions.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param containerDefinitions The set of container definitions that are included in the
     * container group. 
     */
    override fun containerDefinitions(containerDefinitions: List<Any>) {
      cdkBuilder.containerDefinitions(containerDefinitions.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param containerDefinitions The set of container definitions that are included in the
     * container group. 
     */
    override fun containerDefinitions(vararg containerDefinitions: Any): Unit =
        containerDefinitions(containerDefinitions.toList())

    /**
     * @param name A descriptive identifier for the container group definition. 
     * The name value is unique in an AWS Region.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param operatingSystem The platform required for all containers in the container group
     * definition. 
     */
    override fun operatingSystem(operatingSystem: String) {
      cdkBuilder.operatingSystem(operatingSystem)
    }

    /**
     * @param schedulingStrategy The method for deploying the container group across fleet
     * instances.
     * A replica container group might have multiple copies on each fleet instance. A daemon
     * container group maintains only one copy per fleet instance.
     */
    override fun schedulingStrategy(schedulingStrategy: String) {
      cdkBuilder.schedulingStrategy(schedulingStrategy)
    }

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
     * @param totalCpuLimit The amount of CPU units on a fleet instance to allocate for the
     * container group. 
     * All containers in the group share these resources. This property is an integer value in CPU
     * units (1 vCPU is equal to 1024 CPU units).
     *
     * You can set additional limits for each `ContainerDefinition` in the group. If individual
     * containers have limits, this value must be equal to or greater than the sum of all
     * container-specific CPU limits in the group.
     *
     * For more details on memory allocation, see the [Container fleet design
     * guide](https://docs.aws.amazon.com/gamelift/latest/developerguide/containers-design-fleet) .
     */
    override fun totalCpuLimit(totalCpuLimit: Number) {
      cdkBuilder.totalCpuLimit(totalCpuLimit)
    }

    /**
     * @param totalMemoryLimit The amount of memory (in MiB) on a fleet instance to allocate for the
     * container group. 
     * All containers in the group share these resources.
     *
     * You can set additional limits for each `ContainerDefinition` in the group. If individual
     * containers have limits, this value must meet the following requirements:
     *
     * * Equal to or greater than the sum of all container-specific soft memory limits in the group.
     * * Equal to or greater than any container-specific hard limits in the group.
     *
     * For more details on memory allocation, see the [Container fleet design
     * guide](https://docs.aws.amazon.com/gamelift/latest/developerguide/containers-design-fleet) .
     */
    override fun totalMemoryLimit(totalMemoryLimit: Number) {
      cdkBuilder.totalMemoryLimit(totalMemoryLimit)
    }

    public fun build(): software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinitionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinitionProps,
  ) : CdkObject(cdkObject), CfnContainerGroupDefinitionProps {
    /**
     * The set of container definitions that are included in the container group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-containerdefinitions)
     */
    override fun containerDefinitions(): Any = unwrap(this).getContainerDefinitions()

    /**
     * A descriptive identifier for the container group definition.
     *
     * The name value is unique in an AWS Region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The platform required for all containers in the container group definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-operatingsystem)
     */
    override fun operatingSystem(): String = unwrap(this).getOperatingSystem()

    /**
     * The method for deploying the container group across fleet instances.
     *
     * A replica container group might have multiple copies on each fleet instance. A daemon
     * container group maintains only one copy per fleet instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-schedulingstrategy)
     */
    override fun schedulingStrategy(): String? = unwrap(this).getSchedulingStrategy()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The amount of CPU units on a fleet instance to allocate for the container group.
     *
     * All containers in the group share these resources. This property is an integer value in CPU
     * units (1 vCPU is equal to 1024 CPU units).
     *
     * You can set additional limits for each `ContainerDefinition` in the group. If individual
     * containers have limits, this value must be equal to or greater than the sum of all
     * container-specific CPU limits in the group.
     *
     * For more details on memory allocation, see the [Container fleet design
     * guide](https://docs.aws.amazon.com/gamelift/latest/developerguide/containers-design-fleet) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-totalcpulimit)
     */
    override fun totalCpuLimit(): Number = unwrap(this).getTotalCpuLimit()

    /**
     * The amount of memory (in MiB) on a fleet instance to allocate for the container group.
     *
     * All containers in the group share these resources.
     *
     * You can set additional limits for each `ContainerDefinition` in the group. If individual
     * containers have limits, this value must meet the following requirements:
     *
     * * Equal to or greater than the sum of all container-specific soft memory limits in the group.
     * * Equal to or greater than any container-specific hard limits in the group.
     *
     * For more details on memory allocation, see the [Container fleet design
     * guide](https://docs.aws.amazon.com/gamelift/latest/developerguide/containers-design-fleet) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-totalmemorylimit)
     */
    override fun totalMemoryLimit(): Number = unwrap(this).getTotalMemoryLimit()
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
