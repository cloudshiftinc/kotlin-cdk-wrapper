@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.gamelift

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * *This data type is used with the Amazon GameLift containers feature, which is currently in public
 * preview.*.
 *
 * The properties that describe a container group resource. Container group definition properties
 * can't be updated. To change a property, create a new container group definition.
 *
 * *Used with:* `CreateContainerGroupDefinition`
 *
 * *Returned by:* `DescribeContainerGroupDefinition` , `ListContainerGroupDefinitions`
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.gamelift.*;
 * CfnContainerGroupDefinition cfnContainerGroupDefinition =
 * CfnContainerGroupDefinition.Builder.create(this, "MyCfnContainerGroupDefinition")
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
public open class CfnContainerGroupDefinition(
  cdkObject: software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnContainerGroupDefinitionProps,
  ) :
      this(software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnContainerGroupDefinitionProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnContainerGroupDefinitionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnContainerGroupDefinitionProps(props)
  )

  /**
   * The Amazon Resource Name (
   * [ARN](https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html) ) that is assigned to an
   * Amazon GameLift `ContainerGroupDefinition` resource. It uniquely identifies the resource across
   * all AWS Regions. Format is `arn:aws:gamelift:&lt;region&gt;::containergroupdefinition/[container
   * group definition name]` .
   */
  public open fun attrContainerGroupDefinitionArn(): String =
      unwrap(this).getAttrContainerGroupDefinitionArn()

  /**
   * A time stamp indicating when this data object was created.
   *
   * Format is a number expressed in Unix time as milliseconds (for example `"1469498468.057"` ).
   */
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The set of container definitions that are included in the container group.
   */
  public open fun containerDefinitions(): Any = unwrap(this).getContainerDefinitions()

  /**
   * The set of container definitions that are included in the container group.
   */
  public open fun containerDefinitions(`value`: IResolvable) {
    unwrap(this).setContainerDefinitions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The set of container definitions that are included in the container group.
   */
  public open fun containerDefinitions(`value`: List<Any>) {
    unwrap(this).setContainerDefinitions(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The set of container definitions that are included in the container group.
   */
  public open fun containerDefinitions(vararg `value`: Any): Unit =
      containerDefinitions(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * A descriptive identifier for the container group definition.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * A descriptive identifier for the container group definition.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The platform required for all containers in the container group definition.
   */
  public open fun operatingSystem(): String = unwrap(this).getOperatingSystem()

  /**
   * The platform required for all containers in the container group definition.
   */
  public open fun operatingSystem(`value`: String) {
    unwrap(this).setOperatingSystem(`value`)
  }

  /**
   * The method for deploying the container group across fleet instances.
   */
  public open fun schedulingStrategy(): String? = unwrap(this).getSchedulingStrategy()

  /**
   * The method for deploying the container group across fleet instances.
   */
  public open fun schedulingStrategy(`value`: String) {
    unwrap(this).setSchedulingStrategy(`value`)
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * The amount of CPU units on a fleet instance to allocate for the container group.
   */
  public open fun totalCpuLimit(): Number = unwrap(this).getTotalCpuLimit()

  /**
   * The amount of CPU units on a fleet instance to allocate for the container group.
   */
  public open fun totalCpuLimit(`value`: Number) {
    unwrap(this).setTotalCpuLimit(`value`)
  }

  /**
   * The amount of memory (in MiB) on a fleet instance to allocate for the container group.
   */
  public open fun totalMemoryLimit(): Number = unwrap(this).getTotalMemoryLimit()

  /**
   * The amount of memory (in MiB) on a fleet instance to allocate for the container group.
   */
  public open fun totalMemoryLimit(`value`: Number) {
    unwrap(this).setTotalMemoryLimit(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.gamelift.CfnContainerGroupDefinition].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The set of container definitions that are included in the container group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-containerdefinitions)
     * @param containerDefinitions The set of container definitions that are included in the
     * container group. 
     */
    public fun containerDefinitions(containerDefinitions: IResolvable)

    /**
     * The set of container definitions that are included in the container group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-containerdefinitions)
     * @param containerDefinitions The set of container definitions that are included in the
     * container group. 
     */
    public fun containerDefinitions(containerDefinitions: List<Any>)

    /**
     * The set of container definitions that are included in the container group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-containerdefinitions)
     * @param containerDefinitions The set of container definitions that are included in the
     * container group. 
     */
    public fun containerDefinitions(vararg containerDefinitions: Any)

    /**
     * A descriptive identifier for the container group definition.
     *
     * The name value is unique in an AWS Region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-name)
     * @param name A descriptive identifier for the container group definition. 
     */
    public fun name(name: String)

    /**
     * The platform required for all containers in the container group definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-operatingsystem)
     * @param operatingSystem The platform required for all containers in the container group
     * definition. 
     */
    public fun operatingSystem(operatingSystem: String)

    /**
     * The method for deploying the container group across fleet instances.
     *
     * A replica container group might have multiple copies on each fleet instance. A daemon
     * container group maintains only one copy per fleet instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-schedulingstrategy)
     * @param schedulingStrategy The method for deploying the container group across fleet
     * instances. 
     */
    public fun schedulingStrategy(schedulingStrategy: String)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)

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
     * @param totalCpuLimit The amount of CPU units on a fleet instance to allocate for the
     * container group. 
     */
    public fun totalCpuLimit(totalCpuLimit: Number)

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
     * @param totalMemoryLimit The amount of memory (in MiB) on a fleet instance to allocate for the
     * container group. 
     */
    public fun totalMemoryLimit(totalMemoryLimit: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.Builder =
        software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.Builder.create(scope,
        id)

    /**
     * The set of container definitions that are included in the container group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-containerdefinitions)
     * @param containerDefinitions The set of container definitions that are included in the
     * container group. 
     */
    override fun containerDefinitions(containerDefinitions: IResolvable) {
      cdkBuilder.containerDefinitions(containerDefinitions.let(IResolvable.Companion::unwrap))
    }

    /**
     * The set of container definitions that are included in the container group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-containerdefinitions)
     * @param containerDefinitions The set of container definitions that are included in the
     * container group. 
     */
    override fun containerDefinitions(containerDefinitions: List<Any>) {
      cdkBuilder.containerDefinitions(containerDefinitions.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The set of container definitions that are included in the container group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-containerdefinitions)
     * @param containerDefinitions The set of container definitions that are included in the
     * container group. 
     */
    override fun containerDefinitions(vararg containerDefinitions: Any): Unit =
        containerDefinitions(containerDefinitions.toList())

    /**
     * A descriptive identifier for the container group definition.
     *
     * The name value is unique in an AWS Region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-name)
     * @param name A descriptive identifier for the container group definition. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The platform required for all containers in the container group definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-operatingsystem)
     * @param operatingSystem The platform required for all containers in the container group
     * definition. 
     */
    override fun operatingSystem(operatingSystem: String) {
      cdkBuilder.operatingSystem(operatingSystem)
    }

    /**
     * The method for deploying the container group across fleet instances.
     *
     * A replica container group might have multiple copies on each fleet instance. A daemon
     * container group maintains only one copy per fleet instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-schedulingstrategy)
     * @param schedulingStrategy The method for deploying the container group across fleet
     * instances. 
     */
    override fun schedulingStrategy(schedulingStrategy: String) {
      cdkBuilder.schedulingStrategy(schedulingStrategy)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

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
     * @param totalCpuLimit The amount of CPU units on a fleet instance to allocate for the
     * container group. 
     */
    override fun totalCpuLimit(totalCpuLimit: Number) {
      cdkBuilder.totalCpuLimit(totalCpuLimit)
    }

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
     * @param totalMemoryLimit The amount of memory (in MiB) on a fleet instance to allocate for the
     * container group. 
     */
    override fun totalMemoryLimit(totalMemoryLimit: Number) {
      cdkBuilder.totalMemoryLimit(totalMemoryLimit)
    }

    public fun build(): software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnContainerGroupDefinition {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnContainerGroupDefinition(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition):
        CfnContainerGroupDefinition = CfnContainerGroupDefinition(cdkObject)

    internal fun unwrap(wrapped: CfnContainerGroupDefinition):
        software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition = wrapped.cdkObject as
        software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition
  }

  /**
   * *This data type is used with the Amazon GameLift containers feature, which is currently in
   * public preview.*.
   *
   * Describes a container in a container fleet, the resources available to the container, and the
   * commands that are run when the container starts. Container properties can't be updated. To change
   * a property, create a new container group definition. See also `ContainerDefinitionInput` .
   *
   * *Part of:* `ContainerGroupDefinition`
   *
   * *Returned by:* `DescribeContainerGroupDefinition` , `ListContainerGroupDefinitions`
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.gamelift.*;
   * ContainerDefinitionProperty containerDefinitionProperty = ContainerDefinitionProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-containerdefinition.html)
   */
  public interface ContainerDefinitionProperty {
    /**
     * A command that's passed to the container on startup.
     *
     * Each argument for the command is an additional string in the array. See the
     * [ContainerDefinition::command](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-command)
     * parameter in the *Amazon Elastic Container Service API reference.*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-containerdefinition.html#cfn-gamelift-containergroupdefinition-containerdefinition-command)
     */
    public fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

    /**
     * The container definition identifier.
     *
     * Container names are unique within a container group definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-containerdefinition.html#cfn-gamelift-containergroupdefinition-containerdefinition-containername)
     */
    public fun containerName(): String

    /**
     * The number of CPU units that are reserved for the container.
     *
     * Note: 1 vCPU unit equals 1024 CPU units. If no resources are reserved, the container shares
     * the total CPU limit for the container group.
     *
     * *Related data type:* `ContainerGroupDefinition$TotalCpuLimit`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-containerdefinition.html#cfn-gamelift-containergroupdefinition-containerdefinition-cpu)
     */
    public fun cpu(): Number? = unwrap(this).getCpu()

    /**
     * Indicates that the container relies on the status of other containers in the same container
     * group during its startup and shutdown sequences.
     *
     * A container might have dependencies on multiple containers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-containerdefinition.html#cfn-gamelift-containergroupdefinition-containerdefinition-dependson)
     */
    public fun dependsOn(): Any? = unwrap(this).getDependsOn()

    /**
     * The entry point that's passed to the container on startup.
     *
     * If there are multiple arguments, each argument is an additional string in the array. See the
     * [ContainerDefinition::entryPoint](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-entryPoint)
     * parameter in the *Amazon Elastic Container Service API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-containerdefinition.html#cfn-gamelift-containergroupdefinition-containerdefinition-entrypoint)
     */
    public fun entryPoint(): List<String> = unwrap(this).getEntryPoint() ?: emptyList()

    /**
     * A set of environment variables that's passed to the container on startup.
     *
     * See the
     * [ContainerDefinition::environment](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-environment)
     * parameter in the *Amazon Elastic Container Service API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-containerdefinition.html#cfn-gamelift-containergroupdefinition-containerdefinition-environment)
     */
    public fun environment(): Any? = unwrap(this).getEnvironment()

    /**
     * Indicates whether the container is vital to the container group.
     *
     * If an essential container fails, the entire container group is restarted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-containerdefinition.html#cfn-gamelift-containergroupdefinition-containerdefinition-essential)
     */
    public fun essential(): Any? = unwrap(this).getEssential()

    /**
     * A configuration for a non-terminal health check.
     *
     * A container, which automatically restarts if it stops functioning, also restarts if it fails
     * this health check. If an essential container in the daemon group fails a health check, the
     * entire container group is restarted. The essential container in the replica group doesn't use
     * this health check mechanism, because the Amazon GameLift Agent automatically handles the task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-containerdefinition.html#cfn-gamelift-containergroupdefinition-containerdefinition-healthcheck)
     */
    public fun healthCheck(): Any? = unwrap(this).getHealthCheck()

    /**
     * The URI to the image that $short;
     *
     * copied and deployed to a container fleet. For a more specific identifier, see
     * `ResolvedImageDigest` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-containerdefinition.html#cfn-gamelift-containergroupdefinition-containerdefinition-imageuri)
     */
    public fun imageUri(): String

    /**
     * The amount of memory that Amazon GameLift makes available to the container.
     *
     * If memory limits aren't set for an individual container, the container shares the container
     * group's total memory allocation.
     *
     * *Related data type:* `ContainerGroupDefinition$TotalMemoryLimit`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-containerdefinition.html#cfn-gamelift-containergroupdefinition-containerdefinition-memorylimits)
     */
    public fun memoryLimits(): Any? = unwrap(this).getMemoryLimits()

    /**
     * Defines the ports that are available to assign to processes in the container.
     *
     * For example, a game server process requires a container port to allow game clients to connect
     * to it. Container ports aren't directly accessed by inbound traffic. Amazon GameLift maps these
     * container ports to externally accessible connection ports, which are assigned as needed from the
     * container fleet's `ConnectionPortRange` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-containerdefinition.html#cfn-gamelift-containergroupdefinition-containerdefinition-portconfiguration)
     */
    public fun portConfiguration(): Any? = unwrap(this).getPortConfiguration()

    /**
     * A unique and immutable identifier for the container image that is deployed to a container
     * fleet.
     *
     * The digest is a SHA 256 hash of the container image manifest.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-containerdefinition.html#cfn-gamelift-containergroupdefinition-containerdefinition-resolvedimagedigest)
     */
    public fun resolvedImageDigest(): String? = unwrap(this).getResolvedImageDigest()

    /**
     * The directory in the container where commands are run.
     *
     * See the
     * [ContainerDefinition::workingDirectory](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-workingDirectory)
     * parameter in the *Amazon Elastic Container Service API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-containerdefinition.html#cfn-gamelift-containergroupdefinition-containerdefinition-workingdirectory)
     */
    public fun workingDirectory(): String? = unwrap(this).getWorkingDirectory()

    /**
     * A builder for [ContainerDefinitionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param command A command that's passed to the container on startup.
       * Each argument for the command is an additional string in the array. See the
       * [ContainerDefinition::command](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-command)
       * parameter in the *Amazon Elastic Container Service API reference.*
       */
      public fun command(command: List<String>)

      /**
       * @param command A command that's passed to the container on startup.
       * Each argument for the command is an additional string in the array. See the
       * [ContainerDefinition::command](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-command)
       * parameter in the *Amazon Elastic Container Service API reference.*
       */
      public fun command(vararg command: String)

      /**
       * @param containerName The container definition identifier. 
       * Container names are unique within a container group definition.
       */
      public fun containerName(containerName: String)

      /**
       * @param cpu The number of CPU units that are reserved for the container.
       * Note: 1 vCPU unit equals 1024 CPU units. If no resources are reserved, the container shares
       * the total CPU limit for the container group.
       *
       * *Related data type:* `ContainerGroupDefinition$TotalCpuLimit`
       */
      public fun cpu(cpu: Number)

      /**
       * @param dependsOn Indicates that the container relies on the status of other containers in
       * the same container group during its startup and shutdown sequences.
       * A container might have dependencies on multiple containers.
       */
      public fun dependsOn(dependsOn: IResolvable)

      /**
       * @param dependsOn Indicates that the container relies on the status of other containers in
       * the same container group during its startup and shutdown sequences.
       * A container might have dependencies on multiple containers.
       */
      public fun dependsOn(dependsOn: List<Any>)

      /**
       * @param dependsOn Indicates that the container relies on the status of other containers in
       * the same container group during its startup and shutdown sequences.
       * A container might have dependencies on multiple containers.
       */
      public fun dependsOn(vararg dependsOn: Any)

      /**
       * @param entryPoint The entry point that's passed to the container on startup.
       * If there are multiple arguments, each argument is an additional string in the array. See
       * the
       * [ContainerDefinition::entryPoint](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-entryPoint)
       * parameter in the *Amazon Elastic Container Service API Reference* .
       */
      public fun entryPoint(entryPoint: List<String>)

      /**
       * @param entryPoint The entry point that's passed to the container on startup.
       * If there are multiple arguments, each argument is an additional string in the array. See
       * the
       * [ContainerDefinition::entryPoint](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-entryPoint)
       * parameter in the *Amazon Elastic Container Service API Reference* .
       */
      public fun entryPoint(vararg entryPoint: String)

      /**
       * @param environment A set of environment variables that's passed to the container on
       * startup.
       * See the
       * [ContainerDefinition::environment](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-environment)
       * parameter in the *Amazon Elastic Container Service API Reference* .
       */
      public fun environment(environment: IResolvable)

      /**
       * @param environment A set of environment variables that's passed to the container on
       * startup.
       * See the
       * [ContainerDefinition::environment](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-environment)
       * parameter in the *Amazon Elastic Container Service API Reference* .
       */
      public fun environment(environment: List<Any>)

      /**
       * @param environment A set of environment variables that's passed to the container on
       * startup.
       * See the
       * [ContainerDefinition::environment](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-environment)
       * parameter in the *Amazon Elastic Container Service API Reference* .
       */
      public fun environment(vararg environment: Any)

      /**
       * @param essential Indicates whether the container is vital to the container group.
       * If an essential container fails, the entire container group is restarted.
       */
      public fun essential(essential: Boolean)

      /**
       * @param essential Indicates whether the container is vital to the container group.
       * If an essential container fails, the entire container group is restarted.
       */
      public fun essential(essential: IResolvable)

      /**
       * @param healthCheck A configuration for a non-terminal health check.
       * A container, which automatically restarts if it stops functioning, also restarts if it
       * fails this health check. If an essential container in the daemon group fails a health check,
       * the entire container group is restarted. The essential container in the replica group doesn't
       * use this health check mechanism, because the Amazon GameLift Agent automatically handles the
       * task.
       */
      public fun healthCheck(healthCheck: IResolvable)

      /**
       * @param healthCheck A configuration for a non-terminal health check.
       * A container, which automatically restarts if it stops functioning, also restarts if it
       * fails this health check. If an essential container in the daemon group fails a health check,
       * the entire container group is restarted. The essential container in the replica group doesn't
       * use this health check mechanism, because the Amazon GameLift Agent automatically handles the
       * task.
       */
      public fun healthCheck(healthCheck: ContainerHealthCheckProperty)

      /**
       * @param healthCheck A configuration for a non-terminal health check.
       * A container, which automatically restarts if it stops functioning, also restarts if it
       * fails this health check. If an essential container in the daemon group fails a health check,
       * the entire container group is restarted. The essential container in the replica group doesn't
       * use this health check mechanism, because the Amazon GameLift Agent automatically handles the
       * task.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c695f15588c8baffb7b34ca883e74a62d7c21d5b7a03cda2a5672c390a526fe7")
      public fun healthCheck(healthCheck: ContainerHealthCheckProperty.Builder.() -> Unit)

      /**
       * @param imageUri The URI to the image that $short;. 
       * copied and deployed to a container fleet. For a more specific identifier, see
       * `ResolvedImageDigest` .
       */
      public fun imageUri(imageUri: String)

      /**
       * @param memoryLimits The amount of memory that Amazon GameLift makes available to the
       * container.
       * If memory limits aren't set for an individual container, the container shares the container
       * group's total memory allocation.
       *
       * *Related data type:* `ContainerGroupDefinition$TotalMemoryLimit`
       */
      public fun memoryLimits(memoryLimits: IResolvable)

      /**
       * @param memoryLimits The amount of memory that Amazon GameLift makes available to the
       * container.
       * If memory limits aren't set for an individual container, the container shares the container
       * group's total memory allocation.
       *
       * *Related data type:* `ContainerGroupDefinition$TotalMemoryLimit`
       */
      public fun memoryLimits(memoryLimits: MemoryLimitsProperty)

      /**
       * @param memoryLimits The amount of memory that Amazon GameLift makes available to the
       * container.
       * If memory limits aren't set for an individual container, the container shares the container
       * group's total memory allocation.
       *
       * *Related data type:* `ContainerGroupDefinition$TotalMemoryLimit`
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6247ae715da731da25727bc99d6c4a6f04ad1377b88e7f489954fec050ae5914")
      public fun memoryLimits(memoryLimits: MemoryLimitsProperty.Builder.() -> Unit)

      /**
       * @param portConfiguration Defines the ports that are available to assign to processes in the
       * container.
       * For example, a game server process requires a container port to allow game clients to
       * connect to it. Container ports aren't directly accessed by inbound traffic. Amazon GameLift
       * maps these container ports to externally accessible connection ports, which are assigned as
       * needed from the container fleet's `ConnectionPortRange` .
       */
      public fun portConfiguration(portConfiguration: IResolvable)

      /**
       * @param portConfiguration Defines the ports that are available to assign to processes in the
       * container.
       * For example, a game server process requires a container port to allow game clients to
       * connect to it. Container ports aren't directly accessed by inbound traffic. Amazon GameLift
       * maps these container ports to externally accessible connection ports, which are assigned as
       * needed from the container fleet's `ConnectionPortRange` .
       */
      public fun portConfiguration(portConfiguration: PortConfigurationProperty)

      /**
       * @param portConfiguration Defines the ports that are available to assign to processes in the
       * container.
       * For example, a game server process requires a container port to allow game clients to
       * connect to it. Container ports aren't directly accessed by inbound traffic. Amazon GameLift
       * maps these container ports to externally accessible connection ports, which are assigned as
       * needed from the container fleet's `ConnectionPortRange` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bd5beb617276644a5d92197c695c03a4e6f5835acec002c6c789b87cd7f7624a")
      public fun portConfiguration(portConfiguration: PortConfigurationProperty.Builder.() -> Unit)

      /**
       * @param resolvedImageDigest A unique and immutable identifier for the container image that
       * is deployed to a container fleet.
       * The digest is a SHA 256 hash of the container image manifest.
       */
      public fun resolvedImageDigest(resolvedImageDigest: String)

      /**
       * @param workingDirectory The directory in the container where commands are run.
       * See the
       * [ContainerDefinition::workingDirectory](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-workingDirectory)
       * parameter in the *Amazon Elastic Container Service API Reference* .
       */
      public fun workingDirectory(workingDirectory: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.ContainerDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.ContainerDefinitionProperty.builder()

      /**
       * @param command A command that's passed to the container on startup.
       * Each argument for the command is an additional string in the array. See the
       * [ContainerDefinition::command](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-command)
       * parameter in the *Amazon Elastic Container Service API reference.*
       */
      override fun command(command: List<String>) {
        cdkBuilder.command(command)
      }

      /**
       * @param command A command that's passed to the container on startup.
       * Each argument for the command is an additional string in the array. See the
       * [ContainerDefinition::command](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-command)
       * parameter in the *Amazon Elastic Container Service API reference.*
       */
      override fun command(vararg command: String): Unit = command(command.toList())

      /**
       * @param containerName The container definition identifier. 
       * Container names are unique within a container group definition.
       */
      override fun containerName(containerName: String) {
        cdkBuilder.containerName(containerName)
      }

      /**
       * @param cpu The number of CPU units that are reserved for the container.
       * Note: 1 vCPU unit equals 1024 CPU units. If no resources are reserved, the container shares
       * the total CPU limit for the container group.
       *
       * *Related data type:* `ContainerGroupDefinition$TotalCpuLimit`
       */
      override fun cpu(cpu: Number) {
        cdkBuilder.cpu(cpu)
      }

      /**
       * @param dependsOn Indicates that the container relies on the status of other containers in
       * the same container group during its startup and shutdown sequences.
       * A container might have dependencies on multiple containers.
       */
      override fun dependsOn(dependsOn: IResolvable) {
        cdkBuilder.dependsOn(dependsOn.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param dependsOn Indicates that the container relies on the status of other containers in
       * the same container group during its startup and shutdown sequences.
       * A container might have dependencies on multiple containers.
       */
      override fun dependsOn(dependsOn: List<Any>) {
        cdkBuilder.dependsOn(dependsOn.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param dependsOn Indicates that the container relies on the status of other containers in
       * the same container group during its startup and shutdown sequences.
       * A container might have dependencies on multiple containers.
       */
      override fun dependsOn(vararg dependsOn: Any): Unit = dependsOn(dependsOn.toList())

      /**
       * @param entryPoint The entry point that's passed to the container on startup.
       * If there are multiple arguments, each argument is an additional string in the array. See
       * the
       * [ContainerDefinition::entryPoint](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-entryPoint)
       * parameter in the *Amazon Elastic Container Service API Reference* .
       */
      override fun entryPoint(entryPoint: List<String>) {
        cdkBuilder.entryPoint(entryPoint)
      }

      /**
       * @param entryPoint The entry point that's passed to the container on startup.
       * If there are multiple arguments, each argument is an additional string in the array. See
       * the
       * [ContainerDefinition::entryPoint](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-entryPoint)
       * parameter in the *Amazon Elastic Container Service API Reference* .
       */
      override fun entryPoint(vararg entryPoint: String): Unit = entryPoint(entryPoint.toList())

      /**
       * @param environment A set of environment variables that's passed to the container on
       * startup.
       * See the
       * [ContainerDefinition::environment](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-environment)
       * parameter in the *Amazon Elastic Container Service API Reference* .
       */
      override fun environment(environment: IResolvable) {
        cdkBuilder.environment(environment.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param environment A set of environment variables that's passed to the container on
       * startup.
       * See the
       * [ContainerDefinition::environment](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-environment)
       * parameter in the *Amazon Elastic Container Service API Reference* .
       */
      override fun environment(environment: List<Any>) {
        cdkBuilder.environment(environment.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param environment A set of environment variables that's passed to the container on
       * startup.
       * See the
       * [ContainerDefinition::environment](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-environment)
       * parameter in the *Amazon Elastic Container Service API Reference* .
       */
      override fun environment(vararg environment: Any): Unit = environment(environment.toList())

      /**
       * @param essential Indicates whether the container is vital to the container group.
       * If an essential container fails, the entire container group is restarted.
       */
      override fun essential(essential: Boolean) {
        cdkBuilder.essential(essential)
      }

      /**
       * @param essential Indicates whether the container is vital to the container group.
       * If an essential container fails, the entire container group is restarted.
       */
      override fun essential(essential: IResolvable) {
        cdkBuilder.essential(essential.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param healthCheck A configuration for a non-terminal health check.
       * A container, which automatically restarts if it stops functioning, also restarts if it
       * fails this health check. If an essential container in the daemon group fails a health check,
       * the entire container group is restarted. The essential container in the replica group doesn't
       * use this health check mechanism, because the Amazon GameLift Agent automatically handles the
       * task.
       */
      override fun healthCheck(healthCheck: IResolvable) {
        cdkBuilder.healthCheck(healthCheck.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param healthCheck A configuration for a non-terminal health check.
       * A container, which automatically restarts if it stops functioning, also restarts if it
       * fails this health check. If an essential container in the daemon group fails a health check,
       * the entire container group is restarted. The essential container in the replica group doesn't
       * use this health check mechanism, because the Amazon GameLift Agent automatically handles the
       * task.
       */
      override fun healthCheck(healthCheck: ContainerHealthCheckProperty) {
        cdkBuilder.healthCheck(healthCheck.let(ContainerHealthCheckProperty.Companion::unwrap))
      }

      /**
       * @param healthCheck A configuration for a non-terminal health check.
       * A container, which automatically restarts if it stops functioning, also restarts if it
       * fails this health check. If an essential container in the daemon group fails a health check,
       * the entire container group is restarted. The essential container in the replica group doesn't
       * use this health check mechanism, because the Amazon GameLift Agent automatically handles the
       * task.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c695f15588c8baffb7b34ca883e74a62d7c21d5b7a03cda2a5672c390a526fe7")
      override fun healthCheck(healthCheck: ContainerHealthCheckProperty.Builder.() -> Unit): Unit =
          healthCheck(ContainerHealthCheckProperty(healthCheck))

      /**
       * @param imageUri The URI to the image that $short;. 
       * copied and deployed to a container fleet. For a more specific identifier, see
       * `ResolvedImageDigest` .
       */
      override fun imageUri(imageUri: String) {
        cdkBuilder.imageUri(imageUri)
      }

      /**
       * @param memoryLimits The amount of memory that Amazon GameLift makes available to the
       * container.
       * If memory limits aren't set for an individual container, the container shares the container
       * group's total memory allocation.
       *
       * *Related data type:* `ContainerGroupDefinition$TotalMemoryLimit`
       */
      override fun memoryLimits(memoryLimits: IResolvable) {
        cdkBuilder.memoryLimits(memoryLimits.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param memoryLimits The amount of memory that Amazon GameLift makes available to the
       * container.
       * If memory limits aren't set for an individual container, the container shares the container
       * group's total memory allocation.
       *
       * *Related data type:* `ContainerGroupDefinition$TotalMemoryLimit`
       */
      override fun memoryLimits(memoryLimits: MemoryLimitsProperty) {
        cdkBuilder.memoryLimits(memoryLimits.let(MemoryLimitsProperty.Companion::unwrap))
      }

      /**
       * @param memoryLimits The amount of memory that Amazon GameLift makes available to the
       * container.
       * If memory limits aren't set for an individual container, the container shares the container
       * group's total memory allocation.
       *
       * *Related data type:* `ContainerGroupDefinition$TotalMemoryLimit`
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6247ae715da731da25727bc99d6c4a6f04ad1377b88e7f489954fec050ae5914")
      override fun memoryLimits(memoryLimits: MemoryLimitsProperty.Builder.() -> Unit): Unit =
          memoryLimits(MemoryLimitsProperty(memoryLimits))

      /**
       * @param portConfiguration Defines the ports that are available to assign to processes in the
       * container.
       * For example, a game server process requires a container port to allow game clients to
       * connect to it. Container ports aren't directly accessed by inbound traffic. Amazon GameLift
       * maps these container ports to externally accessible connection ports, which are assigned as
       * needed from the container fleet's `ConnectionPortRange` .
       */
      override fun portConfiguration(portConfiguration: IResolvable) {
        cdkBuilder.portConfiguration(portConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param portConfiguration Defines the ports that are available to assign to processes in the
       * container.
       * For example, a game server process requires a container port to allow game clients to
       * connect to it. Container ports aren't directly accessed by inbound traffic. Amazon GameLift
       * maps these container ports to externally accessible connection ports, which are assigned as
       * needed from the container fleet's `ConnectionPortRange` .
       */
      override fun portConfiguration(portConfiguration: PortConfigurationProperty) {
        cdkBuilder.portConfiguration(portConfiguration.let(PortConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param portConfiguration Defines the ports that are available to assign to processes in the
       * container.
       * For example, a game server process requires a container port to allow game clients to
       * connect to it. Container ports aren't directly accessed by inbound traffic. Amazon GameLift
       * maps these container ports to externally accessible connection ports, which are assigned as
       * needed from the container fleet's `ConnectionPortRange` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bd5beb617276644a5d92197c695c03a4e6f5835acec002c6c789b87cd7f7624a")
      override
          fun portConfiguration(portConfiguration: PortConfigurationProperty.Builder.() -> Unit):
          Unit = portConfiguration(PortConfigurationProperty(portConfiguration))

      /**
       * @param resolvedImageDigest A unique and immutable identifier for the container image that
       * is deployed to a container fleet.
       * The digest is a SHA 256 hash of the container image manifest.
       */
      override fun resolvedImageDigest(resolvedImageDigest: String) {
        cdkBuilder.resolvedImageDigest(resolvedImageDigest)
      }

      /**
       * @param workingDirectory The directory in the container where commands are run.
       * See the
       * [ContainerDefinition::workingDirectory](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-workingDirectory)
       * parameter in the *Amazon Elastic Container Service API Reference* .
       */
      override fun workingDirectory(workingDirectory: String) {
        cdkBuilder.workingDirectory(workingDirectory)
      }

      public fun build():
          software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.ContainerDefinitionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.ContainerDefinitionProperty,
    ) : CdkObject(cdkObject), ContainerDefinitionProperty {
      /**
       * A command that's passed to the container on startup.
       *
       * Each argument for the command is an additional string in the array. See the
       * [ContainerDefinition::command](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-command)
       * parameter in the *Amazon Elastic Container Service API reference.*
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-containerdefinition.html#cfn-gamelift-containergroupdefinition-containerdefinition-command)
       */
      override fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

      /**
       * The container definition identifier.
       *
       * Container names are unique within a container group definition.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-containerdefinition.html#cfn-gamelift-containergroupdefinition-containerdefinition-containername)
       */
      override fun containerName(): String = unwrap(this).getContainerName()

      /**
       * The number of CPU units that are reserved for the container.
       *
       * Note: 1 vCPU unit equals 1024 CPU units. If no resources are reserved, the container shares
       * the total CPU limit for the container group.
       *
       * *Related data type:* `ContainerGroupDefinition$TotalCpuLimit`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-containerdefinition.html#cfn-gamelift-containergroupdefinition-containerdefinition-cpu)
       */
      override fun cpu(): Number? = unwrap(this).getCpu()

      /**
       * Indicates that the container relies on the status of other containers in the same container
       * group during its startup and shutdown sequences.
       *
       * A container might have dependencies on multiple containers.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-containerdefinition.html#cfn-gamelift-containergroupdefinition-containerdefinition-dependson)
       */
      override fun dependsOn(): Any? = unwrap(this).getDependsOn()

      /**
       * The entry point that's passed to the container on startup.
       *
       * If there are multiple arguments, each argument is an additional string in the array. See
       * the
       * [ContainerDefinition::entryPoint](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-entryPoint)
       * parameter in the *Amazon Elastic Container Service API Reference* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-containerdefinition.html#cfn-gamelift-containergroupdefinition-containerdefinition-entrypoint)
       */
      override fun entryPoint(): List<String> = unwrap(this).getEntryPoint() ?: emptyList()

      /**
       * A set of environment variables that's passed to the container on startup.
       *
       * See the
       * [ContainerDefinition::environment](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-environment)
       * parameter in the *Amazon Elastic Container Service API Reference* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-containerdefinition.html#cfn-gamelift-containergroupdefinition-containerdefinition-environment)
       */
      override fun environment(): Any? = unwrap(this).getEnvironment()

      /**
       * Indicates whether the container is vital to the container group.
       *
       * If an essential container fails, the entire container group is restarted.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-containerdefinition.html#cfn-gamelift-containergroupdefinition-containerdefinition-essential)
       */
      override fun essential(): Any? = unwrap(this).getEssential()

      /**
       * A configuration for a non-terminal health check.
       *
       * A container, which automatically restarts if it stops functioning, also restarts if it
       * fails this health check. If an essential container in the daemon group fails a health check,
       * the entire container group is restarted. The essential container in the replica group doesn't
       * use this health check mechanism, because the Amazon GameLift Agent automatically handles the
       * task.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-containerdefinition.html#cfn-gamelift-containergroupdefinition-containerdefinition-healthcheck)
       */
      override fun healthCheck(): Any? = unwrap(this).getHealthCheck()

      /**
       * The URI to the image that $short;
       *
       * copied and deployed to a container fleet. For a more specific identifier, see
       * `ResolvedImageDigest` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-containerdefinition.html#cfn-gamelift-containergroupdefinition-containerdefinition-imageuri)
       */
      override fun imageUri(): String = unwrap(this).getImageUri()

      /**
       * The amount of memory that Amazon GameLift makes available to the container.
       *
       * If memory limits aren't set for an individual container, the container shares the container
       * group's total memory allocation.
       *
       * *Related data type:* `ContainerGroupDefinition$TotalMemoryLimit`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-containerdefinition.html#cfn-gamelift-containergroupdefinition-containerdefinition-memorylimits)
       */
      override fun memoryLimits(): Any? = unwrap(this).getMemoryLimits()

      /**
       * Defines the ports that are available to assign to processes in the container.
       *
       * For example, a game server process requires a container port to allow game clients to
       * connect to it. Container ports aren't directly accessed by inbound traffic. Amazon GameLift
       * maps these container ports to externally accessible connection ports, which are assigned as
       * needed from the container fleet's `ConnectionPortRange` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-containerdefinition.html#cfn-gamelift-containergroupdefinition-containerdefinition-portconfiguration)
       */
      override fun portConfiguration(): Any? = unwrap(this).getPortConfiguration()

      /**
       * A unique and immutable identifier for the container image that is deployed to a container
       * fleet.
       *
       * The digest is a SHA 256 hash of the container image manifest.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-containerdefinition.html#cfn-gamelift-containergroupdefinition-containerdefinition-resolvedimagedigest)
       */
      override fun resolvedImageDigest(): String? = unwrap(this).getResolvedImageDigest()

      /**
       * The directory in the container where commands are run.
       *
       * See the
       * [ContainerDefinition::workingDirectory](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-workingDirectory)
       * parameter in the *Amazon Elastic Container Service API Reference* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-containerdefinition.html#cfn-gamelift-containergroupdefinition-containerdefinition-workingdirectory)
       */
      override fun workingDirectory(): String? = unwrap(this).getWorkingDirectory()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ContainerDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.ContainerDefinitionProperty):
          ContainerDefinitionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ContainerDefinitionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ContainerDefinitionProperty):
          software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.ContainerDefinitionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.ContainerDefinitionProperty
    }
  }

  /**
   * *This data type is used with the Amazon GameLift containers feature, which is currently in
   * public preview.*.
   *
   * A container's dependency on another container in the same container group. The dependency
   * impacts how the dependent container is able to start or shut down based the status of the other
   * container.
   *
   * For example, ContainerA is configured with the following dependency: a `START` dependency on
   * ContainerB. This means that ContainerA can't start until ContainerB has started. It also means
   * that ContainerA must shut down before ContainerB.
   *
   * *Part of:* `ContainerDefinition`
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.gamelift.*;
   * ContainerDependencyProperty containerDependencyProperty = ContainerDependencyProperty.builder()
   * .condition("condition")
   * .containerName("containerName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-containerdependency.html)
   */
  public interface ContainerDependencyProperty {
    /**
     * The condition that the dependency container must reach before the dependent container can
     * start. Valid conditions include:.
     *
     * * START - The dependency container must have started.
     * * COMPLETE - The dependency container has run to completion (exits). Use this condition with
     * nonessential containers, such as those that run a script and then exit. The dependency container
     * can't be an essential container.
     * * SUCCESS - The dependency container has run to completion and exited with a zero status. The
     * dependency container can't be an essential container.
     * * HEALTHY - The dependency container has passed its Docker health check. Use this condition
     * with dependency containers that have health checks configured. This condition is confirmed at
     * container group startup only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-containerdependency.html#cfn-gamelift-containergroupdefinition-containerdependency-condition)
     */
    public fun condition(): String

    /**
     * A descriptive label for the container definition that this container depends on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-containerdependency.html#cfn-gamelift-containergroupdefinition-containerdependency-containername)
     */
    public fun containerName(): String

    /**
     * A builder for [ContainerDependencyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param condition The condition that the dependency container must reach before the
       * dependent container can start. Valid conditions include:. 
       * * START - The dependency container must have started.
       * * COMPLETE - The dependency container has run to completion (exits). Use this condition
       * with nonessential containers, such as those that run a script and then exit. The dependency
       * container can't be an essential container.
       * * SUCCESS - The dependency container has run to completion and exited with a zero status.
       * The dependency container can't be an essential container.
       * * HEALTHY - The dependency container has passed its Docker health check. Use this condition
       * with dependency containers that have health checks configured. This condition is confirmed at
       * container group startup only.
       */
      public fun condition(condition: String)

      /**
       * @param containerName A descriptive label for the container definition that this container
       * depends on. 
       */
      public fun containerName(containerName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.ContainerDependencyProperty.Builder
          =
          software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.ContainerDependencyProperty.builder()

      /**
       * @param condition The condition that the dependency container must reach before the
       * dependent container can start. Valid conditions include:. 
       * * START - The dependency container must have started.
       * * COMPLETE - The dependency container has run to completion (exits). Use this condition
       * with nonessential containers, such as those that run a script and then exit. The dependency
       * container can't be an essential container.
       * * SUCCESS - The dependency container has run to completion and exited with a zero status.
       * The dependency container can't be an essential container.
       * * HEALTHY - The dependency container has passed its Docker health check. Use this condition
       * with dependency containers that have health checks configured. This condition is confirmed at
       * container group startup only.
       */
      override fun condition(condition: String) {
        cdkBuilder.condition(condition)
      }

      /**
       * @param containerName A descriptive label for the container definition that this container
       * depends on. 
       */
      override fun containerName(containerName: String) {
        cdkBuilder.containerName(containerName)
      }

      public fun build():
          software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.ContainerDependencyProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.ContainerDependencyProperty,
    ) : CdkObject(cdkObject), ContainerDependencyProperty {
      /**
       * The condition that the dependency container must reach before the dependent container can
       * start. Valid conditions include:.
       *
       * * START - The dependency container must have started.
       * * COMPLETE - The dependency container has run to completion (exits). Use this condition
       * with nonessential containers, such as those that run a script and then exit. The dependency
       * container can't be an essential container.
       * * SUCCESS - The dependency container has run to completion and exited with a zero status.
       * The dependency container can't be an essential container.
       * * HEALTHY - The dependency container has passed its Docker health check. Use this condition
       * with dependency containers that have health checks configured. This condition is confirmed at
       * container group startup only.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-containerdependency.html#cfn-gamelift-containergroupdefinition-containerdependency-condition)
       */
      override fun condition(): String = unwrap(this).getCondition()

      /**
       * A descriptive label for the container definition that this container depends on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-containerdependency.html#cfn-gamelift-containergroupdefinition-containerdependency-containername)
       */
      override fun containerName(): String = unwrap(this).getContainerName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ContainerDependencyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.ContainerDependencyProperty):
          ContainerDependencyProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ContainerDependencyProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ContainerDependencyProperty):
          software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.ContainerDependencyProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.ContainerDependencyProperty
    }
  }

  /**
   * *This data type is used with the Amazon GameLift containers feature, which is currently in
   * public preview.*.
   *
   * An environment variable to set inside a container, in the form of a key-value pair.
   *
   * *Related data type:* `ContainerDefinition$Environment`
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.gamelift.*;
   * ContainerEnvironmentProperty containerEnvironmentProperty =
   * ContainerEnvironmentProperty.builder()
   * .name("name")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-containerenvironment.html)
   */
  public interface ContainerEnvironmentProperty {
    /**
     * The environment variable name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-containerenvironment.html#cfn-gamelift-containergroupdefinition-containerenvironment-name)
     */
    public fun name(): String

    /**
     * The environment variable value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-containerenvironment.html#cfn-gamelift-containergroupdefinition-containerenvironment-value)
     */
    public fun `value`(): String

    /**
     * A builder for [ContainerEnvironmentProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The environment variable name. 
       */
      public fun name(name: String)

      /**
       * @param value The environment variable value. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.ContainerEnvironmentProperty.Builder
          =
          software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.ContainerEnvironmentProperty.builder()

      /**
       * @param name The environment variable name. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param value The environment variable value. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.ContainerEnvironmentProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.ContainerEnvironmentProperty,
    ) : CdkObject(cdkObject), ContainerEnvironmentProperty {
      /**
       * The environment variable name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-containerenvironment.html#cfn-gamelift-containergroupdefinition-containerenvironment-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The environment variable value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-containerenvironment.html#cfn-gamelift-containergroupdefinition-containerenvironment-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ContainerEnvironmentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.ContainerEnvironmentProperty):
          ContainerEnvironmentProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ContainerEnvironmentProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ContainerEnvironmentProperty):
          software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.ContainerEnvironmentProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.ContainerEnvironmentProperty
    }
  }

  /**
   * Instructions on when and how to check the health of a container in a container fleet.
   *
   * When health check properties are set in a container definition, they override any Docker health
   * checks in the container image. For more information on container health checks, see [HealthCheck
   * command](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_HealthCheck.html#ECS-Type-HealthCheck-command)
   * in the *Amazon Elastic Container Service API* .
   *
   * The following example instructions tell the container to wait 100 seconds after launch before
   * counting failed health checks, then initiate the health check command every 60 seconds. After
   * issuing the health check command, wait 10 seconds for it to succeed. If it fails, retry the
   * command 3 times before considering the container to be unhealthy.
   *
   * `{"Command": [ "CMD-SHELL", "ps cax | grep "processmanager" || exit 1" ], "Interval": 300,
   * "Timeout": 30, "Retries": 5, "StartPeriod": 100 }`
   *
   * *Part of:* `ContainerDefinition$HealthCheck`
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.gamelift.*;
   * ContainerHealthCheckProperty containerHealthCheckProperty =
   * ContainerHealthCheckProperty.builder()
   * .command(List.of("command"))
   * // the properties below are optional
   * .interval(123)
   * .retries(123)
   * .startPeriod(123)
   * .timeout(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-containerhealthcheck.html)
   */
  public interface ContainerHealthCheckProperty {
    /**
     * A string array that specifies the command that the container runs to determine if it's
     * healthy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-containerhealthcheck.html#cfn-gamelift-containergroupdefinition-containerhealthcheck-command)
     */
    public fun command(): List<String>

    /**
     * The time period (in seconds) between each health check.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-containerhealthcheck.html#cfn-gamelift-containergroupdefinition-containerhealthcheck-interval)
     */
    public fun interval(): Number? = unwrap(this).getInterval()

    /**
     * The number of times to retry a failed health check before the container is considered
     * unhealthy.
     *
     * The first run of the command does not count as a retry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-containerhealthcheck.html#cfn-gamelift-containergroupdefinition-containerhealthcheck-retries)
     */
    public fun retries(): Number? = unwrap(this).getRetries()

    /**
     * The optional grace period (in seconds) to give a container time to bootstrap before the first
     * failed health check counts toward the number of retries.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-containerhealthcheck.html#cfn-gamelift-containergroupdefinition-containerhealthcheck-startperiod)
     */
    public fun startPeriod(): Number? = unwrap(this).getStartPeriod()

    /**
     * The time period (in seconds) to wait for a health check to succeed before a failed health
     * check is counted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-containerhealthcheck.html#cfn-gamelift-containergroupdefinition-containerhealthcheck-timeout)
     */
    public fun timeout(): Number? = unwrap(this).getTimeout()

    /**
     * A builder for [ContainerHealthCheckProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param command A string array that specifies the command that the container runs to
       * determine if it's healthy. 
       */
      public fun command(command: List<String>)

      /**
       * @param command A string array that specifies the command that the container runs to
       * determine if it's healthy. 
       */
      public fun command(vararg command: String)

      /**
       * @param interval The time period (in seconds) between each health check.
       */
      public fun interval(interval: Number)

      /**
       * @param retries The number of times to retry a failed health check before the container is
       * considered unhealthy.
       * The first run of the command does not count as a retry.
       */
      public fun retries(retries: Number)

      /**
       * @param startPeriod The optional grace period (in seconds) to give a container time to
       * bootstrap before the first failed health check counts toward the number of retries.
       */
      public fun startPeriod(startPeriod: Number)

      /**
       * @param timeout The time period (in seconds) to wait for a health check to succeed before a
       * failed health check is counted.
       */
      public fun timeout(timeout: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.ContainerHealthCheckProperty.Builder
          =
          software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.ContainerHealthCheckProperty.builder()

      /**
       * @param command A string array that specifies the command that the container runs to
       * determine if it's healthy. 
       */
      override fun command(command: List<String>) {
        cdkBuilder.command(command)
      }

      /**
       * @param command A string array that specifies the command that the container runs to
       * determine if it's healthy. 
       */
      override fun command(vararg command: String): Unit = command(command.toList())

      /**
       * @param interval The time period (in seconds) between each health check.
       */
      override fun interval(interval: Number) {
        cdkBuilder.interval(interval)
      }

      /**
       * @param retries The number of times to retry a failed health check before the container is
       * considered unhealthy.
       * The first run of the command does not count as a retry.
       */
      override fun retries(retries: Number) {
        cdkBuilder.retries(retries)
      }

      /**
       * @param startPeriod The optional grace period (in seconds) to give a container time to
       * bootstrap before the first failed health check counts toward the number of retries.
       */
      override fun startPeriod(startPeriod: Number) {
        cdkBuilder.startPeriod(startPeriod)
      }

      /**
       * @param timeout The time period (in seconds) to wait for a health check to succeed before a
       * failed health check is counted.
       */
      override fun timeout(timeout: Number) {
        cdkBuilder.timeout(timeout)
      }

      public fun build():
          software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.ContainerHealthCheckProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.ContainerHealthCheckProperty,
    ) : CdkObject(cdkObject), ContainerHealthCheckProperty {
      /**
       * A string array that specifies the command that the container runs to determine if it's
       * healthy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-containerhealthcheck.html#cfn-gamelift-containergroupdefinition-containerhealthcheck-command)
       */
      override fun command(): List<String> = unwrap(this).getCommand()

      /**
       * The time period (in seconds) between each health check.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-containerhealthcheck.html#cfn-gamelift-containergroupdefinition-containerhealthcheck-interval)
       */
      override fun interval(): Number? = unwrap(this).getInterval()

      /**
       * The number of times to retry a failed health check before the container is considered
       * unhealthy.
       *
       * The first run of the command does not count as a retry.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-containerhealthcheck.html#cfn-gamelift-containergroupdefinition-containerhealthcheck-retries)
       */
      override fun retries(): Number? = unwrap(this).getRetries()

      /**
       * The optional grace period (in seconds) to give a container time to bootstrap before the
       * first failed health check counts toward the number of retries.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-containerhealthcheck.html#cfn-gamelift-containergroupdefinition-containerhealthcheck-startperiod)
       */
      override fun startPeriod(): Number? = unwrap(this).getStartPeriod()

      /**
       * The time period (in seconds) to wait for a health check to succeed before a failed health
       * check is counted.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-containerhealthcheck.html#cfn-gamelift-containergroupdefinition-containerhealthcheck-timeout)
       */
      override fun timeout(): Number? = unwrap(this).getTimeout()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ContainerHealthCheckProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.ContainerHealthCheckProperty):
          ContainerHealthCheckProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ContainerHealthCheckProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ContainerHealthCheckProperty):
          software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.ContainerHealthCheckProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.ContainerHealthCheckProperty
    }
  }

  /**
   * *This data type is used with the Amazon GameLift containers feature, which is currently in
   * public preview.*.
   *
   * A set of one or more port numbers that can be opened on the container.
   *
   * *Part of:* `ContainerPortConfiguration`
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.gamelift.*;
   * ContainerPortRangeProperty containerPortRangeProperty = ContainerPortRangeProperty.builder()
   * .fromPort(123)
   * .protocol("protocol")
   * .toPort(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-containerportrange.html)
   */
  public interface ContainerPortRangeProperty {
    /**
     * A starting value for the range of allowed port numbers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-containerportrange.html#cfn-gamelift-containergroupdefinition-containerportrange-fromport)
     */
    public fun fromPort(): Number

    /**
     * The network protocol that these ports support.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-containerportrange.html#cfn-gamelift-containergroupdefinition-containerportrange-protocol)
     */
    public fun protocol(): String

    /**
     * An ending value for the range of allowed port numbers.
     *
     * Port numbers are end-inclusive. This value must be equal to or greater than `FromPort` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-containerportrange.html#cfn-gamelift-containergroupdefinition-containerportrange-toport)
     */
    public fun toPort(): Number

    /**
     * A builder for [ContainerPortRangeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param fromPort A starting value for the range of allowed port numbers. 
       */
      public fun fromPort(fromPort: Number)

      /**
       * @param protocol The network protocol that these ports support. 
       */
      public fun protocol(protocol: String)

      /**
       * @param toPort An ending value for the range of allowed port numbers. 
       * Port numbers are end-inclusive. This value must be equal to or greater than `FromPort` .
       */
      public fun toPort(toPort: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.ContainerPortRangeProperty.Builder
          =
          software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.ContainerPortRangeProperty.builder()

      /**
       * @param fromPort A starting value for the range of allowed port numbers. 
       */
      override fun fromPort(fromPort: Number) {
        cdkBuilder.fromPort(fromPort)
      }

      /**
       * @param protocol The network protocol that these ports support. 
       */
      override fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
      }

      /**
       * @param toPort An ending value for the range of allowed port numbers. 
       * Port numbers are end-inclusive. This value must be equal to or greater than `FromPort` .
       */
      override fun toPort(toPort: Number) {
        cdkBuilder.toPort(toPort)
      }

      public fun build():
          software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.ContainerPortRangeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.ContainerPortRangeProperty,
    ) : CdkObject(cdkObject), ContainerPortRangeProperty {
      /**
       * A starting value for the range of allowed port numbers.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-containerportrange.html#cfn-gamelift-containergroupdefinition-containerportrange-fromport)
       */
      override fun fromPort(): Number = unwrap(this).getFromPort()

      /**
       * The network protocol that these ports support.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-containerportrange.html#cfn-gamelift-containergroupdefinition-containerportrange-protocol)
       */
      override fun protocol(): String = unwrap(this).getProtocol()

      /**
       * An ending value for the range of allowed port numbers.
       *
       * Port numbers are end-inclusive. This value must be equal to or greater than `FromPort` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-containerportrange.html#cfn-gamelift-containergroupdefinition-containerportrange-toport)
       */
      override fun toPort(): Number = unwrap(this).getToPort()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ContainerPortRangeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.ContainerPortRangeProperty):
          ContainerPortRangeProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ContainerPortRangeProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ContainerPortRangeProperty):
          software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.ContainerPortRangeProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.ContainerPortRangeProperty
    }
  }

  /**
   * Specifies how much memory is available to the container.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.gamelift.*;
   * MemoryLimitsProperty memoryLimitsProperty = MemoryLimitsProperty.builder()
   * .hardLimit(123)
   * .softLimit(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-memorylimits.html)
   */
  public interface MemoryLimitsProperty {
    /**
     * The hard limit of memory to reserve for the container.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-memorylimits.html#cfn-gamelift-containergroupdefinition-memorylimits-hardlimit)
     */
    public fun hardLimit(): Number? = unwrap(this).getHardLimit()

    /**
     * The amount of memory that is reserved for the container.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-memorylimits.html#cfn-gamelift-containergroupdefinition-memorylimits-softlimit)
     */
    public fun softLimit(): Number? = unwrap(this).getSoftLimit()

    /**
     * A builder for [MemoryLimitsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param hardLimit The hard limit of memory to reserve for the container.
       */
      public fun hardLimit(hardLimit: Number)

      /**
       * @param softLimit The amount of memory that is reserved for the container.
       */
      public fun softLimit(softLimit: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.MemoryLimitsProperty.Builder
          =
          software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.MemoryLimitsProperty.builder()

      /**
       * @param hardLimit The hard limit of memory to reserve for the container.
       */
      override fun hardLimit(hardLimit: Number) {
        cdkBuilder.hardLimit(hardLimit)
      }

      /**
       * @param softLimit The amount of memory that is reserved for the container.
       */
      override fun softLimit(softLimit: Number) {
        cdkBuilder.softLimit(softLimit)
      }

      public fun build():
          software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.MemoryLimitsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.MemoryLimitsProperty,
    ) : CdkObject(cdkObject), MemoryLimitsProperty {
      /**
       * The hard limit of memory to reserve for the container.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-memorylimits.html#cfn-gamelift-containergroupdefinition-memorylimits-hardlimit)
       */
      override fun hardLimit(): Number? = unwrap(this).getHardLimit()

      /**
       * The amount of memory that is reserved for the container.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-memorylimits.html#cfn-gamelift-containergroupdefinition-memorylimits-softlimit)
       */
      override fun softLimit(): Number? = unwrap(this).getSoftLimit()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MemoryLimitsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.MemoryLimitsProperty):
          MemoryLimitsProperty = CdkObjectWrappers.wrap(cdkObject) as? MemoryLimitsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: MemoryLimitsProperty):
          software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.MemoryLimitsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.MemoryLimitsProperty
    }
  }

  /**
   * Defines the ports on a container.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.gamelift.*;
   * PortConfigurationProperty portConfigurationProperty = PortConfigurationProperty.builder()
   * .containerPortRanges(List.of(ContainerPortRangeProperty.builder()
   * .fromPort(123)
   * .protocol("protocol")
   * .toPort(123)
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-portconfiguration.html)
   */
  public interface PortConfigurationProperty {
    /**
     * Specifies one or more ranges of ports on a container.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-portconfiguration.html#cfn-gamelift-containergroupdefinition-portconfiguration-containerportranges)
     */
    public fun containerPortRanges(): Any

    /**
     * A builder for [PortConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param containerPortRanges Specifies one or more ranges of ports on a container. 
       */
      public fun containerPortRanges(containerPortRanges: IResolvable)

      /**
       * @param containerPortRanges Specifies one or more ranges of ports on a container. 
       */
      public fun containerPortRanges(containerPortRanges: List<Any>)

      /**
       * @param containerPortRanges Specifies one or more ranges of ports on a container. 
       */
      public fun containerPortRanges(vararg containerPortRanges: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.PortConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.PortConfigurationProperty.builder()

      /**
       * @param containerPortRanges Specifies one or more ranges of ports on a container. 
       */
      override fun containerPortRanges(containerPortRanges: IResolvable) {
        cdkBuilder.containerPortRanges(containerPortRanges.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param containerPortRanges Specifies one or more ranges of ports on a container. 
       */
      override fun containerPortRanges(containerPortRanges: List<Any>) {
        cdkBuilder.containerPortRanges(containerPortRanges.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param containerPortRanges Specifies one or more ranges of ports on a container. 
       */
      override fun containerPortRanges(vararg containerPortRanges: Any): Unit =
          containerPortRanges(containerPortRanges.toList())

      public fun build():
          software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.PortConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.PortConfigurationProperty,
    ) : CdkObject(cdkObject), PortConfigurationProperty {
      /**
       * Specifies one or more ranges of ports on a container.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-portconfiguration.html#cfn-gamelift-containergroupdefinition-portconfiguration-containerportranges)
       */
      override fun containerPortRanges(): Any = unwrap(this).getContainerPortRanges()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PortConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.PortConfigurationProperty):
          PortConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PortConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PortConfigurationProperty):
          software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.PortConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.PortConfigurationProperty
    }
  }
}
