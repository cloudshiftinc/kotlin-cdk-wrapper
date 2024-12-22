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
 * The properties that describe a container group resource.
 *
 * You can update all properties of a container group definition properties. Updates to a container
 * group definition are saved as new versions.
 *
 * *Used with:*
 * [CreateContainerGroupDefinition](https://docs.aws.amazon.com/gamelift/latest/apireference/API_CreateContainerGroupDefinition.html)
 *
 * *Returned by:*
 * [DescribeContainerGroupDefinition](https://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeContainerGroupDefinition.html)
 * ,
 * [ListContainerGroupDefinitions](https://docs.aws.amazon.com/gamelift/latest/apireference/API_ListContainerGroupDefinitions.html)
 * ,
 * [UpdateContainerGroupDefinition](https://docs.aws.amazon.com/gamelift/latest/apireference/API_UpdateContainerGroupDefinition.html)
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.gamelift.*;
 * CfnContainerGroupDefinition cfnContainerGroupDefinition =
 * CfnContainerGroupDefinition.Builder.create(this, "MyCfnContainerGroupDefinition")
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
public open class CfnContainerGroupDefinition(
  cdkObject: software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
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
   * all AWS Regions. Format is `arn:aws:gamelift:[region]::containergroupdefinition/[container group
   * definition name]:[version]` .
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
   * Current status of the container group definition resource. Values include:.
   *
   * * `COPYING` -- Amazon GameLift is in the process of making copies of all container images that
   * are defined in the group. While in this state, the resource can't be used to create a container
   * fleet.
   * * `READY` -- Amazon GameLift has copied the registry images for all containers that are defined
   * in the group. You can use a container group definition in this status to create a container fleet.
   * * `FAILED` -- Amazon GameLift failed to create a valid container group definition resource. For
   * more details on the cause of the failure, see `StatusReason` . A container group definition
   * resource in failed status will be deleted within a few minutes.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * Additional information about a container group definition that's in `FAILED` status. Possible
   * reasons include:.
   *
   * * An internal issue prevented Amazon GameLift from creating the container group definition
   * resource. Delete the failed resource and call
   * [CreateContainerGroupDefinition](https://docs.aws.amazon.com/gamelift/latest/apireference/API_CreateContainerGroupDefinition.html)
   * again.
   * * An access-denied message means that you don't have permissions to access the container image
   * on ECR. See [IAM permission
   * examples](https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-iam-policy-examples.html.html)
   * for help setting up required IAM permissions for Amazon GameLift.
   * * The `ImageUri` value for at least one of the containers in the container group definition was
   * invalid or not found in the current AWS account.
   * * At least one of the container images referenced in the container group definition exceeds the
   * allowed size. For size limits, see [Amazon GameLift endpoints and
   * quotas](https://docs.aws.amazon.com/general/latest/gr/gamelift.html) .
   * * At least one of the container images referenced in the container group definition uses a
   * different operating system than the one defined for the container group.
   */
  public open fun attrStatusReason(): String = unwrap(this).getAttrStatusReason()

  /**
   * Indicates the version of a particular container group definition.
   *
   * This number is incremented automatically when you update a container group definition. You can
   * view, update, or delete individual versions or the entire container group definition.
   */
  public open fun attrVersionNumber(): Number = unwrap(this).getAttrVersionNumber()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The type of container group.
   */
  public open fun containerGroupType(): String? = unwrap(this).getContainerGroupType()

  /**
   * The type of container group.
   */
  public open fun containerGroupType(`value`: String) {
    unwrap(this).setContainerGroupType(`value`)
  }

  /**
   * The definition for the game server container in this group.
   */
  public open fun gameServerContainerDefinition(): Any? =
      unwrap(this).getGameServerContainerDefinition()

  /**
   * The definition for the game server container in this group.
   */
  public open fun gameServerContainerDefinition(`value`: IResolvable) {
    unwrap(this).setGameServerContainerDefinition(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The definition for the game server container in this group.
   */
  public open fun gameServerContainerDefinition(`value`: GameServerContainerDefinitionProperty) {
    unwrap(this).setGameServerContainerDefinition(`value`.let(GameServerContainerDefinitionProperty.Companion::unwrap))
  }

  /**
   * The definition for the game server container in this group.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1f349b57fa52e3746f97aec716026d12a2b6dc4e00442e0cb55f93abb4a4e530")
  public open
      fun gameServerContainerDefinition(`value`: GameServerContainerDefinitionProperty.Builder.() -> Unit):
      Unit = gameServerContainerDefinition(GameServerContainerDefinitionProperty(`value`))

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
   * The platform that all containers in the container group definition run on.
   */
  public open fun operatingSystem(): String = unwrap(this).getOperatingSystem()

  /**
   * The platform that all containers in the container group definition run on.
   */
  public open fun operatingSystem(`value`: String) {
    unwrap(this).setOperatingSystem(`value`)
  }

  /**
   * A specific ContainerGroupDefinition version to be updated.
   */
  public open fun sourceVersionNumber(): Number? = unwrap(this).getSourceVersionNumber()

  /**
   * A specific ContainerGroupDefinition version to be updated.
   */
  public open fun sourceVersionNumber(`value`: Number) {
    unwrap(this).setSourceVersionNumber(`value`)
  }

  /**
   * The set of definitions for support containers in this group.
   */
  public open fun supportContainerDefinitions(): Any? =
      unwrap(this).getSupportContainerDefinitions()

  /**
   * The set of definitions for support containers in this group.
   */
  public open fun supportContainerDefinitions(`value`: IResolvable) {
    unwrap(this).setSupportContainerDefinitions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The set of definitions for support containers in this group.
   */
  public open fun supportContainerDefinitions(`value`: List<Any>) {
    unwrap(this).setSupportContainerDefinitions(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The set of definitions for support containers in this group.
   */
  public open fun supportContainerDefinitions(vararg `value`: Any): Unit =
      supportContainerDefinitions(`value`.toList())

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
   * The amount of memory (in MiB) on a fleet instance to allocate for the container group.
   */
  public open fun totalMemoryLimitMebibytes(): Number = unwrap(this).getTotalMemoryLimitMebibytes()

  /**
   * The amount of memory (in MiB) on a fleet instance to allocate for the container group.
   */
  public open fun totalMemoryLimitMebibytes(`value`: Number) {
    unwrap(this).setTotalMemoryLimitMebibytes(`value`)
  }

  /**
   * The amount of vCPU units on a fleet instance to allocate for the container group (1 vCPU is
   * equal to 1024 CPU units).
   */
  public open fun totalVcpuLimit(): Number = unwrap(this).getTotalVcpuLimit()

  /**
   * The amount of vCPU units on a fleet instance to allocate for the container group (1 vCPU is
   * equal to 1024 CPU units).
   */
  public open fun totalVcpuLimit(`value`: Number) {
    unwrap(this).setTotalVcpuLimit(`value`)
  }

  /**
   * An optional description that was provided for a container group definition update.
   */
  public open fun versionDescription(): String? = unwrap(this).getVersionDescription()

  /**
   * An optional description that was provided for a container group definition update.
   */
  public open fun versionDescription(`value`: String) {
    unwrap(this).setVersionDescription(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.gamelift.CfnContainerGroupDefinition].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The type of container group.
     *
     * Container group type determines how Amazon GameLift deploys the container group on each fleet
     * instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-containergrouptype)
     * @param containerGroupType The type of container group. 
     */
    public fun containerGroupType(containerGroupType: String)

    /**
     * The definition for the game server container in this group.
     *
     * This property is used only when the container group type is `GAME_SERVER` . This container
     * definition specifies a container image with the game server build.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-gameservercontainerdefinition)
     * @param gameServerContainerDefinition The definition for the game server container in this
     * group. 
     */
    public fun gameServerContainerDefinition(gameServerContainerDefinition: IResolvable)

    /**
     * The definition for the game server container in this group.
     *
     * This property is used only when the container group type is `GAME_SERVER` . This container
     * definition specifies a container image with the game server build.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-gameservercontainerdefinition)
     * @param gameServerContainerDefinition The definition for the game server container in this
     * group. 
     */
    public
        fun gameServerContainerDefinition(gameServerContainerDefinition: GameServerContainerDefinitionProperty)

    /**
     * The definition for the game server container in this group.
     *
     * This property is used only when the container group type is `GAME_SERVER` . This container
     * definition specifies a container image with the game server build.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-gameservercontainerdefinition)
     * @param gameServerContainerDefinition The definition for the game server container in this
     * group. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1af6092d2646d565ceaadc12801667ae13a6ba63cea4fb2807cca641764e0325")
    public
        fun gameServerContainerDefinition(gameServerContainerDefinition: GameServerContainerDefinitionProperty.Builder.() -> Unit)

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
     * The platform that all containers in the container group definition run on.
     *
     *
     * Amazon Linux 2 (AL2) will reach end of support on 6/30/2025. See more details in the [Amazon
     * Linux 2 FAQs](https://docs.aws.amazon.com/https://aws.amazon.com/amazon-linux-2/faqs/) . For
     * game servers that are hosted on AL2 and use Amazon GameLift server SDK 4.x, first update the
     * game server build to server SDK 5.x, and then deploy to AL2023 instances. See [Migrate to Amazon
     * GameLift server SDK version
     * 5.](https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-serversdk5-migration.html)
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-operatingsystem)
     * @param operatingSystem The platform that all containers in the container group definition run
     * on. 
     */
    public fun operatingSystem(operatingSystem: String)

    /**
     * A specific ContainerGroupDefinition version to be updated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-sourceversionnumber)
     * @param sourceVersionNumber A specific ContainerGroupDefinition version to be updated. 
     */
    public fun sourceVersionNumber(sourceVersionNumber: Number)

    /**
     * The set of definitions for support containers in this group.
     *
     * A container group definition might have zero support container definitions. Support container
     * can be used in any type of container group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-supportcontainerdefinitions)
     * @param supportContainerDefinitions The set of definitions for support containers in this
     * group. 
     */
    public fun supportContainerDefinitions(supportContainerDefinitions: IResolvable)

    /**
     * The set of definitions for support containers in this group.
     *
     * A container group definition might have zero support container definitions. Support container
     * can be used in any type of container group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-supportcontainerdefinitions)
     * @param supportContainerDefinitions The set of definitions for support containers in this
     * group. 
     */
    public fun supportContainerDefinitions(supportContainerDefinitions: List<Any>)

    /**
     * The set of definitions for support containers in this group.
     *
     * A container group definition might have zero support container definitions. Support container
     * can be used in any type of container group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-supportcontainerdefinitions)
     * @param supportContainerDefinitions The set of definitions for support containers in this
     * group. 
     */
    public fun supportContainerDefinitions(vararg supportContainerDefinitions: Any)

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
     * The amount of memory (in MiB) on a fleet instance to allocate for the container group.
     *
     * All containers in the group share these resources.
     *
     * You can set a limit for each container definition in the group. If individual containers have
     * limits, this total value must be greater than any individual container's memory limit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-totalmemorylimitmebibytes)
     * @param totalMemoryLimitMebibytes The amount of memory (in MiB) on a fleet instance to
     * allocate for the container group. 
     */
    public fun totalMemoryLimitMebibytes(totalMemoryLimitMebibytes: Number)

    /**
     * The amount of vCPU units on a fleet instance to allocate for the container group (1 vCPU is
     * equal to 1024 CPU units).
     *
     * All containers in the group share these resources. You can set a limit for each container
     * definition in the group. If individual containers have limits, this total value must be equal to
     * or greater than the sum of the limits for each container in the group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-totalvcpulimit)
     * @param totalVcpuLimit The amount of vCPU units on a fleet instance to allocate for the
     * container group (1 vCPU is equal to 1024 CPU units). 
     */
    public fun totalVcpuLimit(totalVcpuLimit: Number)

    /**
     * An optional description that was provided for a container group definition update.
     *
     * Each version can have a unique description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-versiondescription)
     * @param versionDescription An optional description that was provided for a container group
     * definition update. 
     */
    public fun versionDescription(versionDescription: String)
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
     * The type of container group.
     *
     * Container group type determines how Amazon GameLift deploys the container group on each fleet
     * instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-containergrouptype)
     * @param containerGroupType The type of container group. 
     */
    override fun containerGroupType(containerGroupType: String) {
      cdkBuilder.containerGroupType(containerGroupType)
    }

    /**
     * The definition for the game server container in this group.
     *
     * This property is used only when the container group type is `GAME_SERVER` . This container
     * definition specifies a container image with the game server build.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-gameservercontainerdefinition)
     * @param gameServerContainerDefinition The definition for the game server container in this
     * group. 
     */
    override fun gameServerContainerDefinition(gameServerContainerDefinition: IResolvable) {
      cdkBuilder.gameServerContainerDefinition(gameServerContainerDefinition.let(IResolvable.Companion::unwrap))
    }

    /**
     * The definition for the game server container in this group.
     *
     * This property is used only when the container group type is `GAME_SERVER` . This container
     * definition specifies a container image with the game server build.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-gameservercontainerdefinition)
     * @param gameServerContainerDefinition The definition for the game server container in this
     * group. 
     */
    override
        fun gameServerContainerDefinition(gameServerContainerDefinition: GameServerContainerDefinitionProperty) {
      cdkBuilder.gameServerContainerDefinition(gameServerContainerDefinition.let(GameServerContainerDefinitionProperty.Companion::unwrap))
    }

    /**
     * The definition for the game server container in this group.
     *
     * This property is used only when the container group type is `GAME_SERVER` . This container
     * definition specifies a container image with the game server build.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-gameservercontainerdefinition)
     * @param gameServerContainerDefinition The definition for the game server container in this
     * group. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1af6092d2646d565ceaadc12801667ae13a6ba63cea4fb2807cca641764e0325")
    override
        fun gameServerContainerDefinition(gameServerContainerDefinition: GameServerContainerDefinitionProperty.Builder.() -> Unit):
        Unit =
        gameServerContainerDefinition(GameServerContainerDefinitionProperty(gameServerContainerDefinition))

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
     * The platform that all containers in the container group definition run on.
     *
     *
     * Amazon Linux 2 (AL2) will reach end of support on 6/30/2025. See more details in the [Amazon
     * Linux 2 FAQs](https://docs.aws.amazon.com/https://aws.amazon.com/amazon-linux-2/faqs/) . For
     * game servers that are hosted on AL2 and use Amazon GameLift server SDK 4.x, first update the
     * game server build to server SDK 5.x, and then deploy to AL2023 instances. See [Migrate to Amazon
     * GameLift server SDK version
     * 5.](https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-serversdk5-migration.html)
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-operatingsystem)
     * @param operatingSystem The platform that all containers in the container group definition run
     * on. 
     */
    override fun operatingSystem(operatingSystem: String) {
      cdkBuilder.operatingSystem(operatingSystem)
    }

    /**
     * A specific ContainerGroupDefinition version to be updated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-sourceversionnumber)
     * @param sourceVersionNumber A specific ContainerGroupDefinition version to be updated. 
     */
    override fun sourceVersionNumber(sourceVersionNumber: Number) {
      cdkBuilder.sourceVersionNumber(sourceVersionNumber)
    }

    /**
     * The set of definitions for support containers in this group.
     *
     * A container group definition might have zero support container definitions. Support container
     * can be used in any type of container group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-supportcontainerdefinitions)
     * @param supportContainerDefinitions The set of definitions for support containers in this
     * group. 
     */
    override fun supportContainerDefinitions(supportContainerDefinitions: IResolvable) {
      cdkBuilder.supportContainerDefinitions(supportContainerDefinitions.let(IResolvable.Companion::unwrap))
    }

    /**
     * The set of definitions for support containers in this group.
     *
     * A container group definition might have zero support container definitions. Support container
     * can be used in any type of container group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-supportcontainerdefinitions)
     * @param supportContainerDefinitions The set of definitions for support containers in this
     * group. 
     */
    override fun supportContainerDefinitions(supportContainerDefinitions: List<Any>) {
      cdkBuilder.supportContainerDefinitions(supportContainerDefinitions.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The set of definitions for support containers in this group.
     *
     * A container group definition might have zero support container definitions. Support container
     * can be used in any type of container group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-supportcontainerdefinitions)
     * @param supportContainerDefinitions The set of definitions for support containers in this
     * group. 
     */
    override fun supportContainerDefinitions(vararg supportContainerDefinitions: Any): Unit =
        supportContainerDefinitions(supportContainerDefinitions.toList())

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
     * The amount of memory (in MiB) on a fleet instance to allocate for the container group.
     *
     * All containers in the group share these resources.
     *
     * You can set a limit for each container definition in the group. If individual containers have
     * limits, this total value must be greater than any individual container's memory limit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-totalmemorylimitmebibytes)
     * @param totalMemoryLimitMebibytes The amount of memory (in MiB) on a fleet instance to
     * allocate for the container group. 
     */
    override fun totalMemoryLimitMebibytes(totalMemoryLimitMebibytes: Number) {
      cdkBuilder.totalMemoryLimitMebibytes(totalMemoryLimitMebibytes)
    }

    /**
     * The amount of vCPU units on a fleet instance to allocate for the container group (1 vCPU is
     * equal to 1024 CPU units).
     *
     * All containers in the group share these resources. You can set a limit for each container
     * definition in the group. If individual containers have limits, this total value must be equal to
     * or greater than the sum of the limits for each container in the group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-totalvcpulimit)
     * @param totalVcpuLimit The amount of vCPU units on a fleet instance to allocate for the
     * container group (1 vCPU is equal to 1024 CPU units). 
     */
    override fun totalVcpuLimit(totalVcpuLimit: Number) {
      cdkBuilder.totalVcpuLimit(totalVcpuLimit)
    }

    /**
     * An optional description that was provided for a container group definition update.
     *
     * Each version can have a unique description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containergroupdefinition.html#cfn-gamelift-containergroupdefinition-versiondescription)
     * @param versionDescription An optional description that was provided for a container group
     * definition update. 
     */
    override fun versionDescription(versionDescription: String) {
      cdkBuilder.versionDescription(versionDescription)
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
   * A container's dependency on another container in the same container group.
   *
   * The dependency impacts how the dependent container is able to start or shut down based the
   * status of the other container.
   *
   * For example, *ContainerA* is configured with the following dependency: a `START` dependency on
   * *ContainerB* . This means that *ContainerA* can't start until *ContainerB* has started. It also
   * means that *ContainerA* must shut down before *ContainerB* .
   *
   * *Part of:*
   * [GameServerContainerDefinition](https://docs.aws.amazon.com/gamelift/latest/apireference/API_GameServerContainerDefinition.html)
   * ,
   * [GameServerContainerDefinitionInput](https://docs.aws.amazon.com/gamelift/latest/apireference/API_GameServerContainerDefinitionInput.html)
   * ,
   * [SupportContainerDefinition](https://docs.aws.amazon.com/gamelift/latest/apireference/API_SupportContainerDefinition.html)
   * ,
   * [SupportContainerDefinitionInput](https://docs.aws.amazon.com/gamelift/latest/apireference/API_SupportContainerDefinitionInput.html)
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
    ) : CdkObject(cdkObject),
        ContainerDependencyProperty {
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
   * An environment variable to set inside a container, in the form of a key-value pair.
   *
   * *Part of:*
   * [GameServerContainerDefinition](https://docs.aws.amazon.com/gamelift/latest/apireference/API_GameServerContainerDefinition.html)
   * ,
   * [GameServerContainerDefinitionInput](https://docs.aws.amazon.com/gamelift/latest/apireference/API_GameServerContainerDefinitionInput.html)
   * ,
   * [SupportContainerDefinition](https://docs.aws.amazon.com/gamelift/latest/apireference/API_SupportContainerDefinition.html)
   * ,
   * [SupportContainerDefinitionInput](https://docs.aws.amazon.com/gamelift/latest/apireference/API_SupportContainerDefinitionInput.html)
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
    ) : CdkObject(cdkObject),
        ContainerEnvironmentProperty {
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
   * Instructions on when and how to check the health of a support container in a container fleet.
   *
   * These properties override any Docker health checks that are set in the container image. For
   * more information on container health checks, see [HealthCheck
   * command](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_HealthCheck.html#ECS-Type-HealthCheck-command)
   * in the *Amazon Elastic Container Service API* . Game server containers don't have a health check
   * parameter; Amazon GameLift automatically handles health checks for these containers.
   *
   * The following example instructs the container to initiate a health check command every 60
   * seconds and wait 10 seconds for it to succeed. If it fails, retry the command 3 times before
   * flagging the container as unhealthy. It also tells the container to wait 100 seconds after launch
   * before counting failed health checks.
   *
   * `{"Command": [ "CMD-SHELL", "ps cax | grep "processmanager" || exit 1" ], "Interval": 60,
   * "Timeout": 10, "Retries": 3, "StartPeriod": 100 }`
   *
   * *Part of:*
   * [SupportContainerDefinition](https://docs.aws.amazon.com/gamelift/latest/apireference/API_SupportContainerDefinition.html)
   * ,
   * [SupportContainerDefinitionInput](https://docs.aws.amazon.com/gamelift/latest/apireference/API_SupportContainerDefinitionInput.html)
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
     * The number of times to retry a failed health check before flagging the container unhealthy.
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
     * The time period (in seconds) to wait for a health check to succeed before counting a failed
     * health check.
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
       * @param retries The number of times to retry a failed health check before flagging the
       * container unhealthy.
       * The first run of the command does not count as a retry.
       */
      public fun retries(retries: Number)

      /**
       * @param startPeriod The optional grace period (in seconds) to give a container time to
       * bootstrap before the first failed health check counts toward the number of retries.
       */
      public fun startPeriod(startPeriod: Number)

      /**
       * @param timeout The time period (in seconds) to wait for a health check to succeed before
       * counting a failed health check.
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
       * @param retries The number of times to retry a failed health check before flagging the
       * container unhealthy.
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
       * @param timeout The time period (in seconds) to wait for a health check to succeed before
       * counting a failed health check.
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
    ) : CdkObject(cdkObject),
        ContainerHealthCheckProperty {
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
       * The number of times to retry a failed health check before flagging the container unhealthy.
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
       * The time period (in seconds) to wait for a health check to succeed before counting a failed
       * health check.
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
   * A mount point that binds a container to a file or directory on the host system.
   *
   * *Part of:*
   * [GameServerContainerDefinition](https://docs.aws.amazon.com/gamelift/latest/apireference/API_GameServerContainerDefinition.html)
   * ,
   * [](https://docs.aws.amazon.com/gamelift/latest/apireference/API_GameServerContainerDefinitionInput.html)
   * ,
   * [SupportContainerDefinition](https://docs.aws.amazon.com/gamelift/latest/apireference/API_SupportContainerDefinition.html)
   * ,
   * [](https://docs.aws.amazon.com/gamelift/latest/apireference/API_SupportContainerDefinitionInput.html)
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.gamelift.*;
   * ContainerMountPointProperty containerMountPointProperty = ContainerMountPointProperty.builder()
   * .instancePath("instancePath")
   * // the properties below are optional
   * .accessLevel("accessLevel")
   * .containerPath("containerPath")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-containermountpoint.html)
   */
  public interface ContainerMountPointProperty {
    /**
     * The type of access for the container.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-containermountpoint.html#cfn-gamelift-containergroupdefinition-containermountpoint-accesslevel)
     */
    public fun accessLevel(): String? = unwrap(this).getAccessLevel()

    /**
     * The mount path on the container.
     *
     * If this property isn't set, the instance path is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-containermountpoint.html#cfn-gamelift-containergroupdefinition-containermountpoint-containerpath)
     */
    public fun containerPath(): String? = unwrap(this).getContainerPath()

    /**
     * The path to the source file or directory.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-containermountpoint.html#cfn-gamelift-containergroupdefinition-containermountpoint-instancepath)
     */
    public fun instancePath(): String

    /**
     * A builder for [ContainerMountPointProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param accessLevel The type of access for the container.
       */
      public fun accessLevel(accessLevel: String)

      /**
       * @param containerPath The mount path on the container.
       * If this property isn't set, the instance path is used.
       */
      public fun containerPath(containerPath: String)

      /**
       * @param instancePath The path to the source file or directory. 
       */
      public fun instancePath(instancePath: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.ContainerMountPointProperty.Builder
          =
          software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.ContainerMountPointProperty.builder()

      /**
       * @param accessLevel The type of access for the container.
       */
      override fun accessLevel(accessLevel: String) {
        cdkBuilder.accessLevel(accessLevel)
      }

      /**
       * @param containerPath The mount path on the container.
       * If this property isn't set, the instance path is used.
       */
      override fun containerPath(containerPath: String) {
        cdkBuilder.containerPath(containerPath)
      }

      /**
       * @param instancePath The path to the source file or directory. 
       */
      override fun instancePath(instancePath: String) {
        cdkBuilder.instancePath(instancePath)
      }

      public fun build():
          software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.ContainerMountPointProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.ContainerMountPointProperty,
    ) : CdkObject(cdkObject),
        ContainerMountPointProperty {
      /**
       * The type of access for the container.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-containermountpoint.html#cfn-gamelift-containergroupdefinition-containermountpoint-accesslevel)
       */
      override fun accessLevel(): String? = unwrap(this).getAccessLevel()

      /**
       * The mount path on the container.
       *
       * If this property isn't set, the instance path is used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-containermountpoint.html#cfn-gamelift-containergroupdefinition-containermountpoint-containerpath)
       */
      override fun containerPath(): String? = unwrap(this).getContainerPath()

      /**
       * The path to the source file or directory.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-containermountpoint.html#cfn-gamelift-containergroupdefinition-containermountpoint-instancepath)
       */
      override fun instancePath(): String = unwrap(this).getInstancePath()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ContainerMountPointProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.ContainerMountPointProperty):
          ContainerMountPointProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ContainerMountPointProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ContainerMountPointProperty):
          software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.ContainerMountPointProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.ContainerMountPointProperty
    }
  }

  /**
   * A set of one or more port numbers that can be opened on the container.
   *
   * *Part of:*
   * [ContainerPortConfiguration](https://docs.aws.amazon.com/gamelift/latest/apireference/API_ContainerPortConfiguration.html)
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
    ) : CdkObject(cdkObject),
        ContainerPortRangeProperty {
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
   * Describes the game server container in an existing game server container group.
   *
   * A game server container identifies a container image with your game server build. A game server
   * container is automatically considered essential; if an essential container fails, the entire
   * container group restarts.
   *
   * You can update a container definition and deploy the updates to an existing fleet. When
   * creating or updating a game server container group definition, use the property
   * [](https://docs.aws.amazon.com/gamelift/latest/apireference/API_GameServerContainerDefinitionInput)
   * .
   *
   * *Part of:*
   * [ContainerGroupDefinition](https://docs.aws.amazon.com/gamelift/latest/apireference/API_ContainerGroupDefinition.html)
   *
   * *Returned by:*
   * [DescribeContainerGroupDefinition](https://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeContainerGroupDefinition.html)
   * ,
   * [ListContainerGroupDefinitions](https://docs.aws.amazon.com/gamelift/latest/apireference/API_ListContainerGroupDefinitions.html)
   * ,
   * [UpdateContainerGroupDefinition](https://docs.aws.amazon.com/gamelift/latest/apireference/API_UpdateContainerGroupDefinition.html)
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.gamelift.*;
   * GameServerContainerDefinitionProperty gameServerContainerDefinitionProperty =
   * GameServerContainerDefinitionProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-gameservercontainerdefinition.html)
   */
  public interface GameServerContainerDefinitionProperty {
    /**
     * The container definition identifier.
     *
     * Container names are unique within a container group definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-gameservercontainerdefinition.html#cfn-gamelift-containergroupdefinition-gameservercontainerdefinition-containername)
     */
    public fun containerName(): String

    /**
     * Indicates that the container relies on the status of other containers in the same container
     * group during startup and shutdown sequences.
     *
     * A container might have dependencies on multiple containers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-gameservercontainerdefinition.html#cfn-gamelift-containergroupdefinition-gameservercontainerdefinition-dependson)
     */
    public fun dependsOn(): Any? = unwrap(this).getDependsOn()

    /**
     * A set of environment variables that's passed to the container on startup.
     *
     * See the
     * [ContainerDefinition::environment](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-environment)
     * parameter in the *Amazon Elastic Container Service API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-gameservercontainerdefinition.html#cfn-gamelift-containergroupdefinition-gameservercontainerdefinition-environmentoverride)
     */
    public fun environmentOverride(): Any? = unwrap(this).getEnvironmentOverride()

    /**
     * The URI to the image that Amazon GameLift uses when deploying this container to a container
     * fleet.
     *
     * For a more specific identifier, see `ResolvedImageDigest` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-gameservercontainerdefinition.html#cfn-gamelift-containergroupdefinition-gameservercontainerdefinition-imageuri)
     */
    public fun imageUri(): String

    /**
     * A mount point that binds a path inside the container to a file or directory on the host
     * system and lets it access the file or directory.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-gameservercontainerdefinition.html#cfn-gamelift-containergroupdefinition-gameservercontainerdefinition-mountpoints)
     */
    public fun mountPoints(): Any? = unwrap(this).getMountPoints()

    /**
     * The set of ports that are available to bind to processes in the container.
     *
     * For example, a game server process requires a container port to allow game clients to connect
     * to it. Container ports aren't directly accessed by inbound traffic. Amazon GameLift maps these
     * container ports to externally accessible connection ports, which are assigned as needed from the
     * container fleet's `ConnectionPortRange` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-gameservercontainerdefinition.html#cfn-gamelift-containergroupdefinition-gameservercontainerdefinition-portconfiguration)
     */
    public fun portConfiguration(): Any? = unwrap(this).getPortConfiguration()

    /**
     * A unique and immutable identifier for the container image.
     *
     * The digest is a SHA 256 hash of the container image manifest.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-gameservercontainerdefinition.html#cfn-gamelift-containergroupdefinition-gameservercontainerdefinition-resolvedimagedigest)
     */
    public fun resolvedImageDigest(): String? = unwrap(this).getResolvedImageDigest()

    /**
     * The Amazon GameLift server SDK version that the game server is integrated with.
     *
     * Only game servers using 5.2.0 or higher are compatible with container fleets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-gameservercontainerdefinition.html#cfn-gamelift-containergroupdefinition-gameservercontainerdefinition-serversdkversion)
     */
    public fun serverSdkVersion(): String

    /**
     * A builder for [GameServerContainerDefinitionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param containerName The container definition identifier. 
       * Container names are unique within a container group definition.
       */
      public fun containerName(containerName: String)

      /**
       * @param dependsOn Indicates that the container relies on the status of other containers in
       * the same container group during startup and shutdown sequences.
       * A container might have dependencies on multiple containers.
       */
      public fun dependsOn(dependsOn: IResolvable)

      /**
       * @param dependsOn Indicates that the container relies on the status of other containers in
       * the same container group during startup and shutdown sequences.
       * A container might have dependencies on multiple containers.
       */
      public fun dependsOn(dependsOn: List<Any>)

      /**
       * @param dependsOn Indicates that the container relies on the status of other containers in
       * the same container group during startup and shutdown sequences.
       * A container might have dependencies on multiple containers.
       */
      public fun dependsOn(vararg dependsOn: Any)

      /**
       * @param environmentOverride A set of environment variables that's passed to the container on
       * startup.
       * See the
       * [ContainerDefinition::environment](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-environment)
       * parameter in the *Amazon Elastic Container Service API Reference* .
       */
      public fun environmentOverride(environmentOverride: IResolvable)

      /**
       * @param environmentOverride A set of environment variables that's passed to the container on
       * startup.
       * See the
       * [ContainerDefinition::environment](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-environment)
       * parameter in the *Amazon Elastic Container Service API Reference* .
       */
      public fun environmentOverride(environmentOverride: List<Any>)

      /**
       * @param environmentOverride A set of environment variables that's passed to the container on
       * startup.
       * See the
       * [ContainerDefinition::environment](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-environment)
       * parameter in the *Amazon Elastic Container Service API Reference* .
       */
      public fun environmentOverride(vararg environmentOverride: Any)

      /**
       * @param imageUri The URI to the image that Amazon GameLift uses when deploying this
       * container to a container fleet. 
       * For a more specific identifier, see `ResolvedImageDigest` .
       */
      public fun imageUri(imageUri: String)

      /**
       * @param mountPoints A mount point that binds a path inside the container to a file or
       * directory on the host system and lets it access the file or directory.
       */
      public fun mountPoints(mountPoints: IResolvable)

      /**
       * @param mountPoints A mount point that binds a path inside the container to a file or
       * directory on the host system and lets it access the file or directory.
       */
      public fun mountPoints(mountPoints: List<Any>)

      /**
       * @param mountPoints A mount point that binds a path inside the container to a file or
       * directory on the host system and lets it access the file or directory.
       */
      public fun mountPoints(vararg mountPoints: Any)

      /**
       * @param portConfiguration The set of ports that are available to bind to processes in the
       * container.
       * For example, a game server process requires a container port to allow game clients to
       * connect to it. Container ports aren't directly accessed by inbound traffic. Amazon GameLift
       * maps these container ports to externally accessible connection ports, which are assigned as
       * needed from the container fleet's `ConnectionPortRange` .
       */
      public fun portConfiguration(portConfiguration: IResolvable)

      /**
       * @param portConfiguration The set of ports that are available to bind to processes in the
       * container.
       * For example, a game server process requires a container port to allow game clients to
       * connect to it. Container ports aren't directly accessed by inbound traffic. Amazon GameLift
       * maps these container ports to externally accessible connection ports, which are assigned as
       * needed from the container fleet's `ConnectionPortRange` .
       */
      public fun portConfiguration(portConfiguration: PortConfigurationProperty)

      /**
       * @param portConfiguration The set of ports that are available to bind to processes in the
       * container.
       * For example, a game server process requires a container port to allow game clients to
       * connect to it. Container ports aren't directly accessed by inbound traffic. Amazon GameLift
       * maps these container ports to externally accessible connection ports, which are assigned as
       * needed from the container fleet's `ConnectionPortRange` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("732cc90b7eaecab0aebe027fd3a3dc9eb1d42dfdb165634d4e0ad3d6a00a76af")
      public fun portConfiguration(portConfiguration: PortConfigurationProperty.Builder.() -> Unit)

      /**
       * @param resolvedImageDigest A unique and immutable identifier for the container image.
       * The digest is a SHA 256 hash of the container image manifest.
       */
      public fun resolvedImageDigest(resolvedImageDigest: String)

      /**
       * @param serverSdkVersion The Amazon GameLift server SDK version that the game server is
       * integrated with. 
       * Only game servers using 5.2.0 or higher are compatible with container fleets.
       */
      public fun serverSdkVersion(serverSdkVersion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.GameServerContainerDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.GameServerContainerDefinitionProperty.builder()

      /**
       * @param containerName The container definition identifier. 
       * Container names are unique within a container group definition.
       */
      override fun containerName(containerName: String) {
        cdkBuilder.containerName(containerName)
      }

      /**
       * @param dependsOn Indicates that the container relies on the status of other containers in
       * the same container group during startup and shutdown sequences.
       * A container might have dependencies on multiple containers.
       */
      override fun dependsOn(dependsOn: IResolvable) {
        cdkBuilder.dependsOn(dependsOn.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param dependsOn Indicates that the container relies on the status of other containers in
       * the same container group during startup and shutdown sequences.
       * A container might have dependencies on multiple containers.
       */
      override fun dependsOn(dependsOn: List<Any>) {
        cdkBuilder.dependsOn(dependsOn.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param dependsOn Indicates that the container relies on the status of other containers in
       * the same container group during startup and shutdown sequences.
       * A container might have dependencies on multiple containers.
       */
      override fun dependsOn(vararg dependsOn: Any): Unit = dependsOn(dependsOn.toList())

      /**
       * @param environmentOverride A set of environment variables that's passed to the container on
       * startup.
       * See the
       * [ContainerDefinition::environment](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-environment)
       * parameter in the *Amazon Elastic Container Service API Reference* .
       */
      override fun environmentOverride(environmentOverride: IResolvable) {
        cdkBuilder.environmentOverride(environmentOverride.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param environmentOverride A set of environment variables that's passed to the container on
       * startup.
       * See the
       * [ContainerDefinition::environment](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-environment)
       * parameter in the *Amazon Elastic Container Service API Reference* .
       */
      override fun environmentOverride(environmentOverride: List<Any>) {
        cdkBuilder.environmentOverride(environmentOverride.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param environmentOverride A set of environment variables that's passed to the container on
       * startup.
       * See the
       * [ContainerDefinition::environment](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-environment)
       * parameter in the *Amazon Elastic Container Service API Reference* .
       */
      override fun environmentOverride(vararg environmentOverride: Any): Unit =
          environmentOverride(environmentOverride.toList())

      /**
       * @param imageUri The URI to the image that Amazon GameLift uses when deploying this
       * container to a container fleet. 
       * For a more specific identifier, see `ResolvedImageDigest` .
       */
      override fun imageUri(imageUri: String) {
        cdkBuilder.imageUri(imageUri)
      }

      /**
       * @param mountPoints A mount point that binds a path inside the container to a file or
       * directory on the host system and lets it access the file or directory.
       */
      override fun mountPoints(mountPoints: IResolvable) {
        cdkBuilder.mountPoints(mountPoints.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param mountPoints A mount point that binds a path inside the container to a file or
       * directory on the host system and lets it access the file or directory.
       */
      override fun mountPoints(mountPoints: List<Any>) {
        cdkBuilder.mountPoints(mountPoints.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param mountPoints A mount point that binds a path inside the container to a file or
       * directory on the host system and lets it access the file or directory.
       */
      override fun mountPoints(vararg mountPoints: Any): Unit = mountPoints(mountPoints.toList())

      /**
       * @param portConfiguration The set of ports that are available to bind to processes in the
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
       * @param portConfiguration The set of ports that are available to bind to processes in the
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
       * @param portConfiguration The set of ports that are available to bind to processes in the
       * container.
       * For example, a game server process requires a container port to allow game clients to
       * connect to it. Container ports aren't directly accessed by inbound traffic. Amazon GameLift
       * maps these container ports to externally accessible connection ports, which are assigned as
       * needed from the container fleet's `ConnectionPortRange` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("732cc90b7eaecab0aebe027fd3a3dc9eb1d42dfdb165634d4e0ad3d6a00a76af")
      override
          fun portConfiguration(portConfiguration: PortConfigurationProperty.Builder.() -> Unit):
          Unit = portConfiguration(PortConfigurationProperty(portConfiguration))

      /**
       * @param resolvedImageDigest A unique and immutable identifier for the container image.
       * The digest is a SHA 256 hash of the container image manifest.
       */
      override fun resolvedImageDigest(resolvedImageDigest: String) {
        cdkBuilder.resolvedImageDigest(resolvedImageDigest)
      }

      /**
       * @param serverSdkVersion The Amazon GameLift server SDK version that the game server is
       * integrated with. 
       * Only game servers using 5.2.0 or higher are compatible with container fleets.
       */
      override fun serverSdkVersion(serverSdkVersion: String) {
        cdkBuilder.serverSdkVersion(serverSdkVersion)
      }

      public fun build():
          software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.GameServerContainerDefinitionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.GameServerContainerDefinitionProperty,
    ) : CdkObject(cdkObject),
        GameServerContainerDefinitionProperty {
      /**
       * The container definition identifier.
       *
       * Container names are unique within a container group definition.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-gameservercontainerdefinition.html#cfn-gamelift-containergroupdefinition-gameservercontainerdefinition-containername)
       */
      override fun containerName(): String = unwrap(this).getContainerName()

      /**
       * Indicates that the container relies on the status of other containers in the same container
       * group during startup and shutdown sequences.
       *
       * A container might have dependencies on multiple containers.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-gameservercontainerdefinition.html#cfn-gamelift-containergroupdefinition-gameservercontainerdefinition-dependson)
       */
      override fun dependsOn(): Any? = unwrap(this).getDependsOn()

      /**
       * A set of environment variables that's passed to the container on startup.
       *
       * See the
       * [ContainerDefinition::environment](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-environment)
       * parameter in the *Amazon Elastic Container Service API Reference* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-gameservercontainerdefinition.html#cfn-gamelift-containergroupdefinition-gameservercontainerdefinition-environmentoverride)
       */
      override fun environmentOverride(): Any? = unwrap(this).getEnvironmentOverride()

      /**
       * The URI to the image that Amazon GameLift uses when deploying this container to a container
       * fleet.
       *
       * For a more specific identifier, see `ResolvedImageDigest` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-gameservercontainerdefinition.html#cfn-gamelift-containergroupdefinition-gameservercontainerdefinition-imageuri)
       */
      override fun imageUri(): String = unwrap(this).getImageUri()

      /**
       * A mount point that binds a path inside the container to a file or directory on the host
       * system and lets it access the file or directory.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-gameservercontainerdefinition.html#cfn-gamelift-containergroupdefinition-gameservercontainerdefinition-mountpoints)
       */
      override fun mountPoints(): Any? = unwrap(this).getMountPoints()

      /**
       * The set of ports that are available to bind to processes in the container.
       *
       * For example, a game server process requires a container port to allow game clients to
       * connect to it. Container ports aren't directly accessed by inbound traffic. Amazon GameLift
       * maps these container ports to externally accessible connection ports, which are assigned as
       * needed from the container fleet's `ConnectionPortRange` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-gameservercontainerdefinition.html#cfn-gamelift-containergroupdefinition-gameservercontainerdefinition-portconfiguration)
       */
      override fun portConfiguration(): Any? = unwrap(this).getPortConfiguration()

      /**
       * A unique and immutable identifier for the container image.
       *
       * The digest is a SHA 256 hash of the container image manifest.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-gameservercontainerdefinition.html#cfn-gamelift-containergroupdefinition-gameservercontainerdefinition-resolvedimagedigest)
       */
      override fun resolvedImageDigest(): String? = unwrap(this).getResolvedImageDigest()

      /**
       * The Amazon GameLift server SDK version that the game server is integrated with.
       *
       * Only game servers using 5.2.0 or higher are compatible with container fleets.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-gameservercontainerdefinition.html#cfn-gamelift-containergroupdefinition-gameservercontainerdefinition-serversdkversion)
       */
      override fun serverSdkVersion(): String = unwrap(this).getServerSdkVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          GameServerContainerDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.GameServerContainerDefinitionProperty):
          GameServerContainerDefinitionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          GameServerContainerDefinitionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: GameServerContainerDefinitionProperty):
          software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.GameServerContainerDefinitionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.GameServerContainerDefinitionProperty
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
    ) : CdkObject(cdkObject),
        PortConfigurationProperty {
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

  /**
   * Describes a support container in a container group.
   *
   * A support container might be in a game server container group or a per-instance container
   * group. Support containers don't run game server processes.
   *
   * You can update a support container definition and deploy the updates to an existing fleet. When
   * creating or updating a game server container group definition, use the property
   * [GameServerContainerDefinitionInput](https://docs.aws.amazon.com/gamelift/latest/apireference/API_GameServerContainerDefinitionInput.html)
   * .
   *
   * *Part of:*
   * [ContainerGroupDefinition](https://docs.aws.amazon.com/gamelift/latest/apireference/API_ContainerGroupDefinition.html)
   *
   * *Returned by:*
   * [DescribeContainerGroupDefinition](https://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeContainerGroupDefinition.html)
   * ,
   * [ListContainerGroupDefinitions](https://docs.aws.amazon.com/gamelift/latest/apireference/API_ListContainerGroupDefinitions.html)
   * ,
   * [UpdateContainerGroupDefinition](https://docs.aws.amazon.com/gamelift/latest/apireference/API_UpdateContainerGroupDefinition.html)
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.gamelift.*;
   * SupportContainerDefinitionProperty supportContainerDefinitionProperty =
   * SupportContainerDefinitionProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-supportcontainerdefinition.html)
   */
  public interface SupportContainerDefinitionProperty {
    /**
     * The container definition identifier.
     *
     * Container names are unique within a container group definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-supportcontainerdefinition.html#cfn-gamelift-containergroupdefinition-supportcontainerdefinition-containername)
     */
    public fun containerName(): String

    /**
     * Indicates that the container relies on the status of other containers in the same container
     * group during its startup and shutdown sequences.
     *
     * A container might have dependencies on multiple containers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-supportcontainerdefinition.html#cfn-gamelift-containergroupdefinition-supportcontainerdefinition-dependson)
     */
    public fun dependsOn(): Any? = unwrap(this).getDependsOn()

    /**
     * A set of environment variables that's passed to the container on startup.
     *
     * See the
     * [ContainerDefinition::environment](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-environment)
     * parameter in the *Amazon Elastic Container Service API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-supportcontainerdefinition.html#cfn-gamelift-containergroupdefinition-supportcontainerdefinition-environmentoverride)
     */
    public fun environmentOverride(): Any? = unwrap(this).getEnvironmentOverride()

    /**
     * Indicates whether the container is vital to the container group.
     *
     * If an essential container fails, the entire container group restarts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-supportcontainerdefinition.html#cfn-gamelift-containergroupdefinition-supportcontainerdefinition-essential)
     */
    public fun essential(): Any? = unwrap(this).getEssential()

    /**
     * A configuration for a non-terminal health check.
     *
     * A support container automatically restarts if it stops functioning or if it fails this health
     * check.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-supportcontainerdefinition.html#cfn-gamelift-containergroupdefinition-supportcontainerdefinition-healthcheck)
     */
    public fun healthCheck(): Any? = unwrap(this).getHealthCheck()

    /**
     * The URI to the image that Amazon GameLift deploys to a container fleet.
     *
     * For a more specific identifier, see `ResolvedImageDigest` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-supportcontainerdefinition.html#cfn-gamelift-containergroupdefinition-supportcontainerdefinition-imageuri)
     */
    public fun imageUri(): String

    /**
     * The amount of memory that Amazon GameLift makes available to the container.
     *
     * If memory limits aren't set for an individual container, the container shares the container
     * group's total memory allocation.
     *
     * *Related data type:* [ContainerGroupDefinition
     * TotalMemoryLimitMebibytes](https://docs.aws.amazon.com/gamelift/latest/apireference/API_ContainerGroupDefinition.html)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-supportcontainerdefinition.html#cfn-gamelift-containergroupdefinition-supportcontainerdefinition-memoryhardlimitmebibytes)
     */
    public fun memoryHardLimitMebibytes(): Number? = unwrap(this).getMemoryHardLimitMebibytes()

    /**
     * A mount point that binds a path inside the container to a file or directory on the host
     * system and lets it access the file or directory.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-supportcontainerdefinition.html#cfn-gamelift-containergroupdefinition-supportcontainerdefinition-mountpoints)
     */
    public fun mountPoints(): Any? = unwrap(this).getMountPoints()

    /**
     * A set of ports that allow access to the container from external users.
     *
     * Processes running in the container can bind to a one of these ports. Container ports aren't
     * directly accessed by inbound traffic. Amazon GameLift maps these container ports to externally
     * accessible connection ports, which are assigned as needed from the container fleet's
     * `ConnectionPortRange` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-supportcontainerdefinition.html#cfn-gamelift-containergroupdefinition-supportcontainerdefinition-portconfiguration)
     */
    public fun portConfiguration(): Any? = unwrap(this).getPortConfiguration()

    /**
     * A unique and immutable identifier for the container image.
     *
     * The digest is a SHA 256 hash of the container image manifest.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-supportcontainerdefinition.html#cfn-gamelift-containergroupdefinition-supportcontainerdefinition-resolvedimagedigest)
     */
    public fun resolvedImageDigest(): String? = unwrap(this).getResolvedImageDigest()

    /**
     * The number of vCPU units that are reserved for the container.
     *
     * If no resources are reserved, the container shares the total vCPU limit for the container
     * group.
     *
     * *Related data type:* [ContainerGroupDefinition
     * TotalVcpuLimit](https://docs.aws.amazon.com/gamelift/latest/apireference/API_ContainerGroupDefinition.html)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-supportcontainerdefinition.html#cfn-gamelift-containergroupdefinition-supportcontainerdefinition-vcpu)
     */
    public fun vcpu(): Number? = unwrap(this).getVcpu()

    /**
     * A builder for [SupportContainerDefinitionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param containerName The container definition identifier. 
       * Container names are unique within a container group definition.
       */
      public fun containerName(containerName: String)

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
       * @param environmentOverride A set of environment variables that's passed to the container on
       * startup.
       * See the
       * [ContainerDefinition::environment](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-environment)
       * parameter in the *Amazon Elastic Container Service API Reference* .
       */
      public fun environmentOverride(environmentOverride: IResolvable)

      /**
       * @param environmentOverride A set of environment variables that's passed to the container on
       * startup.
       * See the
       * [ContainerDefinition::environment](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-environment)
       * parameter in the *Amazon Elastic Container Service API Reference* .
       */
      public fun environmentOverride(environmentOverride: List<Any>)

      /**
       * @param environmentOverride A set of environment variables that's passed to the container on
       * startup.
       * See the
       * [ContainerDefinition::environment](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-environment)
       * parameter in the *Amazon Elastic Container Service API Reference* .
       */
      public fun environmentOverride(vararg environmentOverride: Any)

      /**
       * @param essential Indicates whether the container is vital to the container group.
       * If an essential container fails, the entire container group restarts.
       */
      public fun essential(essential: Boolean)

      /**
       * @param essential Indicates whether the container is vital to the container group.
       * If an essential container fails, the entire container group restarts.
       */
      public fun essential(essential: IResolvable)

      /**
       * @param healthCheck A configuration for a non-terminal health check.
       * A support container automatically restarts if it stops functioning or if it fails this
       * health check.
       */
      public fun healthCheck(healthCheck: IResolvable)

      /**
       * @param healthCheck A configuration for a non-terminal health check.
       * A support container automatically restarts if it stops functioning or if it fails this
       * health check.
       */
      public fun healthCheck(healthCheck: ContainerHealthCheckProperty)

      /**
       * @param healthCheck A configuration for a non-terminal health check.
       * A support container automatically restarts if it stops functioning or if it fails this
       * health check.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d4733af0b8859b5b2ee253e08f2e5ba01869d06af819e11c0c777b877a70cae8")
      public fun healthCheck(healthCheck: ContainerHealthCheckProperty.Builder.() -> Unit)

      /**
       * @param imageUri The URI to the image that Amazon GameLift deploys to a container fleet. 
       * For a more specific identifier, see `ResolvedImageDigest` .
       */
      public fun imageUri(imageUri: String)

      /**
       * @param memoryHardLimitMebibytes The amount of memory that Amazon GameLift makes available
       * to the container.
       * If memory limits aren't set for an individual container, the container shares the container
       * group's total memory allocation.
       *
       * *Related data type:* [ContainerGroupDefinition
       * TotalMemoryLimitMebibytes](https://docs.aws.amazon.com/gamelift/latest/apireference/API_ContainerGroupDefinition.html)
       */
      public fun memoryHardLimitMebibytes(memoryHardLimitMebibytes: Number)

      /**
       * @param mountPoints A mount point that binds a path inside the container to a file or
       * directory on the host system and lets it access the file or directory.
       */
      public fun mountPoints(mountPoints: IResolvable)

      /**
       * @param mountPoints A mount point that binds a path inside the container to a file or
       * directory on the host system and lets it access the file or directory.
       */
      public fun mountPoints(mountPoints: List<Any>)

      /**
       * @param mountPoints A mount point that binds a path inside the container to a file or
       * directory on the host system and lets it access the file or directory.
       */
      public fun mountPoints(vararg mountPoints: Any)

      /**
       * @param portConfiguration A set of ports that allow access to the container from external
       * users.
       * Processes running in the container can bind to a one of these ports. Container ports aren't
       * directly accessed by inbound traffic. Amazon GameLift maps these container ports to externally
       * accessible connection ports, which are assigned as needed from the container fleet's
       * `ConnectionPortRange` .
       */
      public fun portConfiguration(portConfiguration: IResolvable)

      /**
       * @param portConfiguration A set of ports that allow access to the container from external
       * users.
       * Processes running in the container can bind to a one of these ports. Container ports aren't
       * directly accessed by inbound traffic. Amazon GameLift maps these container ports to externally
       * accessible connection ports, which are assigned as needed from the container fleet's
       * `ConnectionPortRange` .
       */
      public fun portConfiguration(portConfiguration: PortConfigurationProperty)

      /**
       * @param portConfiguration A set of ports that allow access to the container from external
       * users.
       * Processes running in the container can bind to a one of these ports. Container ports aren't
       * directly accessed by inbound traffic. Amazon GameLift maps these container ports to externally
       * accessible connection ports, which are assigned as needed from the container fleet's
       * `ConnectionPortRange` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c0cd3a552b122c53f56756db99e81e0c8f327c9edd1e52ca200d4ffce4e2e667")
      public fun portConfiguration(portConfiguration: PortConfigurationProperty.Builder.() -> Unit)

      /**
       * @param resolvedImageDigest A unique and immutable identifier for the container image.
       * The digest is a SHA 256 hash of the container image manifest.
       */
      public fun resolvedImageDigest(resolvedImageDigest: String)

      /**
       * @param vcpu The number of vCPU units that are reserved for the container.
       * If no resources are reserved, the container shares the total vCPU limit for the container
       * group.
       *
       * *Related data type:* [ContainerGroupDefinition
       * TotalVcpuLimit](https://docs.aws.amazon.com/gamelift/latest/apireference/API_ContainerGroupDefinition.html)
       */
      public fun vcpu(vcpu: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.SupportContainerDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.SupportContainerDefinitionProperty.builder()

      /**
       * @param containerName The container definition identifier. 
       * Container names are unique within a container group definition.
       */
      override fun containerName(containerName: String) {
        cdkBuilder.containerName(containerName)
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
       * @param environmentOverride A set of environment variables that's passed to the container on
       * startup.
       * See the
       * [ContainerDefinition::environment](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-environment)
       * parameter in the *Amazon Elastic Container Service API Reference* .
       */
      override fun environmentOverride(environmentOverride: IResolvable) {
        cdkBuilder.environmentOverride(environmentOverride.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param environmentOverride A set of environment variables that's passed to the container on
       * startup.
       * See the
       * [ContainerDefinition::environment](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-environment)
       * parameter in the *Amazon Elastic Container Service API Reference* .
       */
      override fun environmentOverride(environmentOverride: List<Any>) {
        cdkBuilder.environmentOverride(environmentOverride.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param environmentOverride A set of environment variables that's passed to the container on
       * startup.
       * See the
       * [ContainerDefinition::environment](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-environment)
       * parameter in the *Amazon Elastic Container Service API Reference* .
       */
      override fun environmentOverride(vararg environmentOverride: Any): Unit =
          environmentOverride(environmentOverride.toList())

      /**
       * @param essential Indicates whether the container is vital to the container group.
       * If an essential container fails, the entire container group restarts.
       */
      override fun essential(essential: Boolean) {
        cdkBuilder.essential(essential)
      }

      /**
       * @param essential Indicates whether the container is vital to the container group.
       * If an essential container fails, the entire container group restarts.
       */
      override fun essential(essential: IResolvable) {
        cdkBuilder.essential(essential.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param healthCheck A configuration for a non-terminal health check.
       * A support container automatically restarts if it stops functioning or if it fails this
       * health check.
       */
      override fun healthCheck(healthCheck: IResolvable) {
        cdkBuilder.healthCheck(healthCheck.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param healthCheck A configuration for a non-terminal health check.
       * A support container automatically restarts if it stops functioning or if it fails this
       * health check.
       */
      override fun healthCheck(healthCheck: ContainerHealthCheckProperty) {
        cdkBuilder.healthCheck(healthCheck.let(ContainerHealthCheckProperty.Companion::unwrap))
      }

      /**
       * @param healthCheck A configuration for a non-terminal health check.
       * A support container automatically restarts if it stops functioning or if it fails this
       * health check.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d4733af0b8859b5b2ee253e08f2e5ba01869d06af819e11c0c777b877a70cae8")
      override fun healthCheck(healthCheck: ContainerHealthCheckProperty.Builder.() -> Unit): Unit =
          healthCheck(ContainerHealthCheckProperty(healthCheck))

      /**
       * @param imageUri The URI to the image that Amazon GameLift deploys to a container fleet. 
       * For a more specific identifier, see `ResolvedImageDigest` .
       */
      override fun imageUri(imageUri: String) {
        cdkBuilder.imageUri(imageUri)
      }

      /**
       * @param memoryHardLimitMebibytes The amount of memory that Amazon GameLift makes available
       * to the container.
       * If memory limits aren't set for an individual container, the container shares the container
       * group's total memory allocation.
       *
       * *Related data type:* [ContainerGroupDefinition
       * TotalMemoryLimitMebibytes](https://docs.aws.amazon.com/gamelift/latest/apireference/API_ContainerGroupDefinition.html)
       */
      override fun memoryHardLimitMebibytes(memoryHardLimitMebibytes: Number) {
        cdkBuilder.memoryHardLimitMebibytes(memoryHardLimitMebibytes)
      }

      /**
       * @param mountPoints A mount point that binds a path inside the container to a file or
       * directory on the host system and lets it access the file or directory.
       */
      override fun mountPoints(mountPoints: IResolvable) {
        cdkBuilder.mountPoints(mountPoints.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param mountPoints A mount point that binds a path inside the container to a file or
       * directory on the host system and lets it access the file or directory.
       */
      override fun mountPoints(mountPoints: List<Any>) {
        cdkBuilder.mountPoints(mountPoints.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param mountPoints A mount point that binds a path inside the container to a file or
       * directory on the host system and lets it access the file or directory.
       */
      override fun mountPoints(vararg mountPoints: Any): Unit = mountPoints(mountPoints.toList())

      /**
       * @param portConfiguration A set of ports that allow access to the container from external
       * users.
       * Processes running in the container can bind to a one of these ports. Container ports aren't
       * directly accessed by inbound traffic. Amazon GameLift maps these container ports to externally
       * accessible connection ports, which are assigned as needed from the container fleet's
       * `ConnectionPortRange` .
       */
      override fun portConfiguration(portConfiguration: IResolvable) {
        cdkBuilder.portConfiguration(portConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param portConfiguration A set of ports that allow access to the container from external
       * users.
       * Processes running in the container can bind to a one of these ports. Container ports aren't
       * directly accessed by inbound traffic. Amazon GameLift maps these container ports to externally
       * accessible connection ports, which are assigned as needed from the container fleet's
       * `ConnectionPortRange` .
       */
      override fun portConfiguration(portConfiguration: PortConfigurationProperty) {
        cdkBuilder.portConfiguration(portConfiguration.let(PortConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param portConfiguration A set of ports that allow access to the container from external
       * users.
       * Processes running in the container can bind to a one of these ports. Container ports aren't
       * directly accessed by inbound traffic. Amazon GameLift maps these container ports to externally
       * accessible connection ports, which are assigned as needed from the container fleet's
       * `ConnectionPortRange` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c0cd3a552b122c53f56756db99e81e0c8f327c9edd1e52ca200d4ffce4e2e667")
      override
          fun portConfiguration(portConfiguration: PortConfigurationProperty.Builder.() -> Unit):
          Unit = portConfiguration(PortConfigurationProperty(portConfiguration))

      /**
       * @param resolvedImageDigest A unique and immutable identifier for the container image.
       * The digest is a SHA 256 hash of the container image manifest.
       */
      override fun resolvedImageDigest(resolvedImageDigest: String) {
        cdkBuilder.resolvedImageDigest(resolvedImageDigest)
      }

      /**
       * @param vcpu The number of vCPU units that are reserved for the container.
       * If no resources are reserved, the container shares the total vCPU limit for the container
       * group.
       *
       * *Related data type:* [ContainerGroupDefinition
       * TotalVcpuLimit](https://docs.aws.amazon.com/gamelift/latest/apireference/API_ContainerGroupDefinition.html)
       */
      override fun vcpu(vcpu: Number) {
        cdkBuilder.vcpu(vcpu)
      }

      public fun build():
          software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.SupportContainerDefinitionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.SupportContainerDefinitionProperty,
    ) : CdkObject(cdkObject),
        SupportContainerDefinitionProperty {
      /**
       * The container definition identifier.
       *
       * Container names are unique within a container group definition.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-supportcontainerdefinition.html#cfn-gamelift-containergroupdefinition-supportcontainerdefinition-containername)
       */
      override fun containerName(): String = unwrap(this).getContainerName()

      /**
       * Indicates that the container relies on the status of other containers in the same container
       * group during its startup and shutdown sequences.
       *
       * A container might have dependencies on multiple containers.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-supportcontainerdefinition.html#cfn-gamelift-containergroupdefinition-supportcontainerdefinition-dependson)
       */
      override fun dependsOn(): Any? = unwrap(this).getDependsOn()

      /**
       * A set of environment variables that's passed to the container on startup.
       *
       * See the
       * [ContainerDefinition::environment](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html#ECS-Type-ContainerDefinition-environment)
       * parameter in the *Amazon Elastic Container Service API Reference* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-supportcontainerdefinition.html#cfn-gamelift-containergroupdefinition-supportcontainerdefinition-environmentoverride)
       */
      override fun environmentOverride(): Any? = unwrap(this).getEnvironmentOverride()

      /**
       * Indicates whether the container is vital to the container group.
       *
       * If an essential container fails, the entire container group restarts.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-supportcontainerdefinition.html#cfn-gamelift-containergroupdefinition-supportcontainerdefinition-essential)
       */
      override fun essential(): Any? = unwrap(this).getEssential()

      /**
       * A configuration for a non-terminal health check.
       *
       * A support container automatically restarts if it stops functioning or if it fails this
       * health check.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-supportcontainerdefinition.html#cfn-gamelift-containergroupdefinition-supportcontainerdefinition-healthcheck)
       */
      override fun healthCheck(): Any? = unwrap(this).getHealthCheck()

      /**
       * The URI to the image that Amazon GameLift deploys to a container fleet.
       *
       * For a more specific identifier, see `ResolvedImageDigest` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-supportcontainerdefinition.html#cfn-gamelift-containergroupdefinition-supportcontainerdefinition-imageuri)
       */
      override fun imageUri(): String = unwrap(this).getImageUri()

      /**
       * The amount of memory that Amazon GameLift makes available to the container.
       *
       * If memory limits aren't set for an individual container, the container shares the container
       * group's total memory allocation.
       *
       * *Related data type:* [ContainerGroupDefinition
       * TotalMemoryLimitMebibytes](https://docs.aws.amazon.com/gamelift/latest/apireference/API_ContainerGroupDefinition.html)
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-supportcontainerdefinition.html#cfn-gamelift-containergroupdefinition-supportcontainerdefinition-memoryhardlimitmebibytes)
       */
      override fun memoryHardLimitMebibytes(): Number? = unwrap(this).getMemoryHardLimitMebibytes()

      /**
       * A mount point that binds a path inside the container to a file or directory on the host
       * system and lets it access the file or directory.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-supportcontainerdefinition.html#cfn-gamelift-containergroupdefinition-supportcontainerdefinition-mountpoints)
       */
      override fun mountPoints(): Any? = unwrap(this).getMountPoints()

      /**
       * A set of ports that allow access to the container from external users.
       *
       * Processes running in the container can bind to a one of these ports. Container ports aren't
       * directly accessed by inbound traffic. Amazon GameLift maps these container ports to externally
       * accessible connection ports, which are assigned as needed from the container fleet's
       * `ConnectionPortRange` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-supportcontainerdefinition.html#cfn-gamelift-containergroupdefinition-supportcontainerdefinition-portconfiguration)
       */
      override fun portConfiguration(): Any? = unwrap(this).getPortConfiguration()

      /**
       * A unique and immutable identifier for the container image.
       *
       * The digest is a SHA 256 hash of the container image manifest.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-supportcontainerdefinition.html#cfn-gamelift-containergroupdefinition-supportcontainerdefinition-resolvedimagedigest)
       */
      override fun resolvedImageDigest(): String? = unwrap(this).getResolvedImageDigest()

      /**
       * The number of vCPU units that are reserved for the container.
       *
       * If no resources are reserved, the container shares the total vCPU limit for the container
       * group.
       *
       * *Related data type:* [ContainerGroupDefinition
       * TotalVcpuLimit](https://docs.aws.amazon.com/gamelift/latest/apireference/API_ContainerGroupDefinition.html)
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containergroupdefinition-supportcontainerdefinition.html#cfn-gamelift-containergroupdefinition-supportcontainerdefinition-vcpu)
       */
      override fun vcpu(): Number? = unwrap(this).getVcpu()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SupportContainerDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.SupportContainerDefinitionProperty):
          SupportContainerDefinitionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SupportContainerDefinitionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SupportContainerDefinitionProperty):
          software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.SupportContainerDefinitionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition.SupportContainerDefinitionProperty
    }
  }
}
