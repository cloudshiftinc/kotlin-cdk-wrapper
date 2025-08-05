@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.gameliftstreams

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::GameLiftStreams::StreamGroup` resource defines a group of compute resources that will
 * be running and streaming your game.
 *
 * When you create a stream group, you specify the hardware configuration (CPU, GPU, RAM) that will
 * run your game (known as the *stream class* ), the geographical locations where your game can run,
 * and the number of streams that can run simultaneously in each location (known as *stream capacity*
 * ). Stream groups manage how Amazon GameLift Streams allocates resources and handles concurrent
 * streams, allowing you to effectively manage capacity and costs.
 *
 * There are two types of stream capacity: always-on and on-demand.
 *
 * * *Always-on* : The streaming capacity that is allocated and ready to handle stream requests
 * without delay. You pay for this capacity whether it's in use or not. Best for quickest time from
 * streaming request to streaming session.
 * * *On-demand* : The streaming capacity that Amazon GameLift Streams can allocate in response to
 * stream requests, and then de-allocate when the session has terminated. This offers a cost control
 * measure at the expense of a greater startup time (typically under 5 minutes).
 *
 *
 * Application association is not currently supported in AWS CloudFormation . To link additional
 * applications to a stream group, use the Amazon GameLift Streams console or the AWS CLI .
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.gameliftstreams.*;
 * CfnStreamGroup cfnStreamGroup = CfnStreamGroup.Builder.create(this, "MyCfnStreamGroup")
 * .description("description")
 * .locationConfigurations(List.of(LocationConfigurationProperty.builder()
 * .locationName("locationName")
 * // the properties below are optional
 * .alwaysOnCapacity(123)
 * .onDemandCapacity(123)
 * .build()))
 * .streamClass("streamClass")
 * // the properties below are optional
 * .defaultApplication(DefaultApplicationProperty.builder()
 * .arn("arn")
 * .id("id")
 * .build())
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gameliftstreams-streamgroup.html)
 */
public open class CfnStreamGroup(
  cdkObject: software.amazon.awscdk.services.gameliftstreams.CfnStreamGroup,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnStreamGroupProps,
  ) :
      this(software.amazon.awscdk.services.gameliftstreams.CfnStreamGroup(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnStreamGroupProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnStreamGroupProps.Builder.() -> Unit,
  ) : this(scope, id, CfnStreamGroupProps(props)
  )

  /**
   * An [Amazon Resource Name
   * (ARN)](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference-arns.html) that uniquely
   * identifies the stream group resource. For example:
   * `arn:aws:gameliftstreams:us-west-2:123456789012:streamgroup/sg-1AB2C3De4` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * An ID that uniquely identifies the stream group resource.
   *
   * For example: `sg-1AB2C3De4` .
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Object that identifies the Amazon GameLift Streams application to stream with this stream
   * group.
   */
  public open fun defaultApplication(): Any? = unwrap(this).getDefaultApplication()

  /**
   * Object that identifies the Amazon GameLift Streams application to stream with this stream
   * group.
   */
  public open fun defaultApplication(`value`: IResolvable) {
    unwrap(this).setDefaultApplication(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Object that identifies the Amazon GameLift Streams application to stream with this stream
   * group.
   */
  public open fun defaultApplication(`value`: DefaultApplicationProperty) {
    unwrap(this).setDefaultApplication(`value`.let(DefaultApplicationProperty.Companion::unwrap))
  }

  /**
   * Object that identifies the Amazon GameLift Streams application to stream with this stream
   * group.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b5f7909c8afbb170f22eb74f328761603953ff8cc9e1cf6140ee6e8a139d45ab")
  public open fun defaultApplication(`value`: DefaultApplicationProperty.Builder.() -> Unit): Unit =
      defaultApplication(DefaultApplicationProperty(`value`))

  /**
   * A descriptive label for the stream group.
   */
  public open fun description(): String = unwrap(this).getDescription()

  /**
   * A descriptive label for the stream group.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * A set of one or more locations and the streaming capacity for each location.
   */
  public open fun locationConfigurations(): Any = unwrap(this).getLocationConfigurations()

  /**
   * A set of one or more locations and the streaming capacity for each location.
   */
  public open fun locationConfigurations(`value`: IResolvable) {
    unwrap(this).setLocationConfigurations(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A set of one or more locations and the streaming capacity for each location.
   */
  public open fun locationConfigurations(`value`: List<Any>) {
    unwrap(this).setLocationConfigurations(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * A set of one or more locations and the streaming capacity for each location.
   */
  public open fun locationConfigurations(vararg `value`: Any): Unit =
      locationConfigurations(`value`.toList())

  /**
   * The target stream quality for sessions that are hosted in this stream group.
   */
  public open fun streamClass(): String = unwrap(this).getStreamClass()

  /**
   * The target stream quality for sessions that are hosted in this stream group.
   */
  public open fun streamClass(`value`: String) {
    unwrap(this).setStreamClass(`value`)
  }

  /**
   * A list of labels to assign to the new stream group resource.
   */
  public open fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A list of labels to assign to the new stream group resource.
   */
  public open fun tags(`value`: Map<String, String>) {
    unwrap(this).setTags(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.gameliftstreams.CfnStreamGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Object that identifies the Amazon GameLift Streams application to stream with this stream
     * group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gameliftstreams-streamgroup.html#cfn-gameliftstreams-streamgroup-defaultapplication)
     * @param defaultApplication Object that identifies the Amazon GameLift Streams application to
     * stream with this stream group. 
     */
    public fun defaultApplication(defaultApplication: IResolvable)

    /**
     * Object that identifies the Amazon GameLift Streams application to stream with this stream
     * group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gameliftstreams-streamgroup.html#cfn-gameliftstreams-streamgroup-defaultapplication)
     * @param defaultApplication Object that identifies the Amazon GameLift Streams application to
     * stream with this stream group. 
     */
    public fun defaultApplication(defaultApplication: DefaultApplicationProperty)

    /**
     * Object that identifies the Amazon GameLift Streams application to stream with this stream
     * group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gameliftstreams-streamgroup.html#cfn-gameliftstreams-streamgroup-defaultapplication)
     * @param defaultApplication Object that identifies the Amazon GameLift Streams application to
     * stream with this stream group. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8864b5135dda641c66cdcd114ef37c998b2688489b24ad3ddef36297e3a5e642")
    public fun defaultApplication(defaultApplication: DefaultApplicationProperty.Builder.() -> Unit)

    /**
     * A descriptive label for the stream group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gameliftstreams-streamgroup.html#cfn-gameliftstreams-streamgroup-description)
     * @param description A descriptive label for the stream group. 
     */
    public fun description(description: String)

    /**
     * A set of one or more locations and the streaming capacity for each location.
     *
     * One of the locations MUST be your primary location, which is the AWS Region where you are
     * specifying this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gameliftstreams-streamgroup.html#cfn-gameliftstreams-streamgroup-locationconfigurations)
     * @param locationConfigurations A set of one or more locations and the streaming capacity for
     * each location. 
     */
    public fun locationConfigurations(locationConfigurations: IResolvable)

    /**
     * A set of one or more locations and the streaming capacity for each location.
     *
     * One of the locations MUST be your primary location, which is the AWS Region where you are
     * specifying this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gameliftstreams-streamgroup.html#cfn-gameliftstreams-streamgroup-locationconfigurations)
     * @param locationConfigurations A set of one or more locations and the streaming capacity for
     * each location. 
     */
    public fun locationConfigurations(locationConfigurations: List<Any>)

    /**
     * A set of one or more locations and the streaming capacity for each location.
     *
     * One of the locations MUST be your primary location, which is the AWS Region where you are
     * specifying this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gameliftstreams-streamgroup.html#cfn-gameliftstreams-streamgroup-locationconfigurations)
     * @param locationConfigurations A set of one or more locations and the streaming capacity for
     * each location. 
     */
    public fun locationConfigurations(vararg locationConfigurations: Any)

    /**
     * The target stream quality for sessions that are hosted in this stream group.
     *
     * Set a stream class that is appropriate to the type of content that you're streaming. Stream
     * class determines the type of computing resources Amazon GameLift Streams uses and impacts the
     * cost of streaming. The following options are available:
     *
     * A stream class can be one of the following:
     *
     * * *`gen5n_win2022` (NVIDIA, ultra)* Supports applications with extremely high 3D scene
     * complexity. Runs applications on Microsoft Windows Server 2022 Base and supports DirectX 12.
     * Compatible with Unreal Engine versions up through 5.4, 32 and 64-bit applications, and
     * anti-cheat technology. Uses NVIDIA A10G Tensor GPU.
     * * Reference resolution: 1080p
     * * Reference frame rate: 60 fps
     * * Workload specifications: 8 vCPUs, 32 GB RAM, 24 GB VRAM
     * * Tenancy: Supports 1 concurrent stream session
     * * *`gen5n_high` (NVIDIA, high)* Supports applications with moderate to high 3D scene
     * complexity. Uses NVIDIA A10G Tensor GPU.
     * * Reference resolution: 1080p
     * * Reference frame rate: 60 fps
     * * Workload specifications: 4 vCPUs, 16 GB RAM, 12 GB VRAM
     * * Tenancy: Supports up to 2 concurrent stream sessions
     * * *`gen5n_ultra` (NVIDIA, ultra)* Supports applications with extremely high 3D scene
     * complexity. Uses dedicated NVIDIA A10G Tensor GPU.
     * * Reference resolution: 1080p
     * * Reference frame rate: 60 fps
     * * Workload specifications: 8 vCPUs, 32 GB RAM, 24 GB VRAM
     * * Tenancy: Supports 1 concurrent stream session
     * * *`gen4n_win2022` (NVIDIA, ultra)* Supports applications with extremely high 3D scene
     * complexity. Runs applications on Microsoft Windows Server 2022 Base and supports DirectX 12.
     * Compatible with Unreal Engine versions up through 5.4, 32 and 64-bit applications, and
     * anti-cheat technology. Uses NVIDIA T4 Tensor GPU.
     * * Reference resolution: 1080p
     * * Reference frame rate: 60 fps
     * * Workload specifications: 8 vCPUs, 32 GB RAM, 16 GB VRAM
     * * Tenancy: Supports 1 concurrent stream session
     * * *`gen4n_high` (NVIDIA, high)* Supports applications with moderate to high 3D scene
     * complexity. Uses NVIDIA T4 Tensor GPU.
     * * Reference resolution: 1080p
     * * Reference frame rate: 60 fps
     * * Workload specifications: 4 vCPUs, 16 GB RAM, 8 GB VRAM
     * * Tenancy: Supports up to 2 concurrent stream sessions
     * * *`gen4n_ultra` (NVIDIA, ultra)* Supports applications with high 3D scene complexity. Uses
     * dedicated NVIDIA T4 Tensor GPU.
     * * Reference resolution: 1080p
     * * Reference frame rate: 60 fps
     * * Workload specifications: 8 vCPUs, 32 GB RAM, 16 GB VRAM
     * * Tenancy: Supports 1 concurrent stream session
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gameliftstreams-streamgroup.html#cfn-gameliftstreams-streamgroup-streamclass)
     * @param streamClass The target stream quality for sessions that are hosted in this stream
     * group. 
     */
    public fun streamClass(streamClass: String)

    /**
     * A list of labels to assign to the new stream group resource.
     *
     * Tags are developer-defined key-value pairs. Tagging AWS resources is useful for resource
     * management, access management and cost allocation. See [Tagging AWS
     * Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
     * Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gameliftstreams-streamgroup.html#cfn-gameliftstreams-streamgroup-tags)
     * @param tags A list of labels to assign to the new stream group resource. 
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.gameliftstreams.CfnStreamGroup.Builder =
        software.amazon.awscdk.services.gameliftstreams.CfnStreamGroup.Builder.create(scope, id)

    /**
     * Object that identifies the Amazon GameLift Streams application to stream with this stream
     * group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gameliftstreams-streamgroup.html#cfn-gameliftstreams-streamgroup-defaultapplication)
     * @param defaultApplication Object that identifies the Amazon GameLift Streams application to
     * stream with this stream group. 
     */
    override fun defaultApplication(defaultApplication: IResolvable) {
      cdkBuilder.defaultApplication(defaultApplication.let(IResolvable.Companion::unwrap))
    }

    /**
     * Object that identifies the Amazon GameLift Streams application to stream with this stream
     * group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gameliftstreams-streamgroup.html#cfn-gameliftstreams-streamgroup-defaultapplication)
     * @param defaultApplication Object that identifies the Amazon GameLift Streams application to
     * stream with this stream group. 
     */
    override fun defaultApplication(defaultApplication: DefaultApplicationProperty) {
      cdkBuilder.defaultApplication(defaultApplication.let(DefaultApplicationProperty.Companion::unwrap))
    }

    /**
     * Object that identifies the Amazon GameLift Streams application to stream with this stream
     * group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gameliftstreams-streamgroup.html#cfn-gameliftstreams-streamgroup-defaultapplication)
     * @param defaultApplication Object that identifies the Amazon GameLift Streams application to
     * stream with this stream group. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8864b5135dda641c66cdcd114ef37c998b2688489b24ad3ddef36297e3a5e642")
    override
        fun defaultApplication(defaultApplication: DefaultApplicationProperty.Builder.() -> Unit):
        Unit = defaultApplication(DefaultApplicationProperty(defaultApplication))

    /**
     * A descriptive label for the stream group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gameliftstreams-streamgroup.html#cfn-gameliftstreams-streamgroup-description)
     * @param description A descriptive label for the stream group. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * A set of one or more locations and the streaming capacity for each location.
     *
     * One of the locations MUST be your primary location, which is the AWS Region where you are
     * specifying this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gameliftstreams-streamgroup.html#cfn-gameliftstreams-streamgroup-locationconfigurations)
     * @param locationConfigurations A set of one or more locations and the streaming capacity for
     * each location. 
     */
    override fun locationConfigurations(locationConfigurations: IResolvable) {
      cdkBuilder.locationConfigurations(locationConfigurations.let(IResolvable.Companion::unwrap))
    }

    /**
     * A set of one or more locations and the streaming capacity for each location.
     *
     * One of the locations MUST be your primary location, which is the AWS Region where you are
     * specifying this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gameliftstreams-streamgroup.html#cfn-gameliftstreams-streamgroup-locationconfigurations)
     * @param locationConfigurations A set of one or more locations and the streaming capacity for
     * each location. 
     */
    override fun locationConfigurations(locationConfigurations: List<Any>) {
      cdkBuilder.locationConfigurations(locationConfigurations.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * A set of one or more locations and the streaming capacity for each location.
     *
     * One of the locations MUST be your primary location, which is the AWS Region where you are
     * specifying this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gameliftstreams-streamgroup.html#cfn-gameliftstreams-streamgroup-locationconfigurations)
     * @param locationConfigurations A set of one or more locations and the streaming capacity for
     * each location. 
     */
    override fun locationConfigurations(vararg locationConfigurations: Any): Unit =
        locationConfigurations(locationConfigurations.toList())

    /**
     * The target stream quality for sessions that are hosted in this stream group.
     *
     * Set a stream class that is appropriate to the type of content that you're streaming. Stream
     * class determines the type of computing resources Amazon GameLift Streams uses and impacts the
     * cost of streaming. The following options are available:
     *
     * A stream class can be one of the following:
     *
     * * *`gen5n_win2022` (NVIDIA, ultra)* Supports applications with extremely high 3D scene
     * complexity. Runs applications on Microsoft Windows Server 2022 Base and supports DirectX 12.
     * Compatible with Unreal Engine versions up through 5.4, 32 and 64-bit applications, and
     * anti-cheat technology. Uses NVIDIA A10G Tensor GPU.
     * * Reference resolution: 1080p
     * * Reference frame rate: 60 fps
     * * Workload specifications: 8 vCPUs, 32 GB RAM, 24 GB VRAM
     * * Tenancy: Supports 1 concurrent stream session
     * * *`gen5n_high` (NVIDIA, high)* Supports applications with moderate to high 3D scene
     * complexity. Uses NVIDIA A10G Tensor GPU.
     * * Reference resolution: 1080p
     * * Reference frame rate: 60 fps
     * * Workload specifications: 4 vCPUs, 16 GB RAM, 12 GB VRAM
     * * Tenancy: Supports up to 2 concurrent stream sessions
     * * *`gen5n_ultra` (NVIDIA, ultra)* Supports applications with extremely high 3D scene
     * complexity. Uses dedicated NVIDIA A10G Tensor GPU.
     * * Reference resolution: 1080p
     * * Reference frame rate: 60 fps
     * * Workload specifications: 8 vCPUs, 32 GB RAM, 24 GB VRAM
     * * Tenancy: Supports 1 concurrent stream session
     * * *`gen4n_win2022` (NVIDIA, ultra)* Supports applications with extremely high 3D scene
     * complexity. Runs applications on Microsoft Windows Server 2022 Base and supports DirectX 12.
     * Compatible with Unreal Engine versions up through 5.4, 32 and 64-bit applications, and
     * anti-cheat technology. Uses NVIDIA T4 Tensor GPU.
     * * Reference resolution: 1080p
     * * Reference frame rate: 60 fps
     * * Workload specifications: 8 vCPUs, 32 GB RAM, 16 GB VRAM
     * * Tenancy: Supports 1 concurrent stream session
     * * *`gen4n_high` (NVIDIA, high)* Supports applications with moderate to high 3D scene
     * complexity. Uses NVIDIA T4 Tensor GPU.
     * * Reference resolution: 1080p
     * * Reference frame rate: 60 fps
     * * Workload specifications: 4 vCPUs, 16 GB RAM, 8 GB VRAM
     * * Tenancy: Supports up to 2 concurrent stream sessions
     * * *`gen4n_ultra` (NVIDIA, ultra)* Supports applications with high 3D scene complexity. Uses
     * dedicated NVIDIA T4 Tensor GPU.
     * * Reference resolution: 1080p
     * * Reference frame rate: 60 fps
     * * Workload specifications: 8 vCPUs, 32 GB RAM, 16 GB VRAM
     * * Tenancy: Supports 1 concurrent stream session
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gameliftstreams-streamgroup.html#cfn-gameliftstreams-streamgroup-streamclass)
     * @param streamClass The target stream quality for sessions that are hosted in this stream
     * group. 
     */
    override fun streamClass(streamClass: String) {
      cdkBuilder.streamClass(streamClass)
    }

    /**
     * A list of labels to assign to the new stream group resource.
     *
     * Tags are developer-defined key-value pairs. Tagging AWS resources is useful for resource
     * management, access management and cost allocation. See [Tagging AWS
     * Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
     * Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gameliftstreams-streamgroup.html#cfn-gameliftstreams-streamgroup-tags)
     * @param tags A list of labels to assign to the new stream group resource. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.gameliftstreams.CfnStreamGroup =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.gameliftstreams.CfnStreamGroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnStreamGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnStreamGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.gameliftstreams.CfnStreamGroup):
        CfnStreamGroup = CfnStreamGroup(cdkObject)

    internal fun unwrap(wrapped: CfnStreamGroup):
        software.amazon.awscdk.services.gameliftstreams.CfnStreamGroup = wrapped.cdkObject as
        software.amazon.awscdk.services.gameliftstreams.CfnStreamGroup
  }

  /**
   * Represents the default Amazon GameLift Streams application that a stream group hosts.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.gameliftstreams.*;
   * DefaultApplicationProperty defaultApplicationProperty = DefaultApplicationProperty.builder()
   * .arn("arn")
   * .id("id")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gameliftstreams-streamgroup-defaultapplication.html)
   */
  public interface DefaultApplicationProperty {
    /**
     * An [Amazon Resource Name
     * (ARN)](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference-arns.html) that uniquely
     * identifies the application resource. Example ARN:
     * `arn:aws:gameliftstreams:us-west-2:111122223333:application/a-9ZY8X7Wv6` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gameliftstreams-streamgroup-defaultapplication.html#cfn-gameliftstreams-streamgroup-defaultapplication-arn)
     */
    public fun arn(): String? = unwrap(this).getArn()

    /**
     * An ID that uniquely identifies the application resource.
     *
     * Example ID: `a-9ZY8X7Wv6` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gameliftstreams-streamgroup-defaultapplication.html#cfn-gameliftstreams-streamgroup-defaultapplication-id)
     */
    public fun id(): String? = unwrap(this).getId()

    /**
     * A builder for [DefaultApplicationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param arn An [Amazon Resource Name
       * (ARN)](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference-arns.html) that uniquely
       * identifies the application resource. Example ARN:
       * `arn:aws:gameliftstreams:us-west-2:111122223333:application/a-9ZY8X7Wv6` .
       */
      public fun arn(arn: String)

      /**
       * @param id An ID that uniquely identifies the application resource.
       * Example ID: `a-9ZY8X7Wv6` .
       */
      public fun id(id: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gameliftstreams.CfnStreamGroup.DefaultApplicationProperty.Builder
          =
          software.amazon.awscdk.services.gameliftstreams.CfnStreamGroup.DefaultApplicationProperty.builder()

      /**
       * @param arn An [Amazon Resource Name
       * (ARN)](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference-arns.html) that uniquely
       * identifies the application resource. Example ARN:
       * `arn:aws:gameliftstreams:us-west-2:111122223333:application/a-9ZY8X7Wv6` .
       */
      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      /**
       * @param id An ID that uniquely identifies the application resource.
       * Example ID: `a-9ZY8X7Wv6` .
       */
      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      public fun build():
          software.amazon.awscdk.services.gameliftstreams.CfnStreamGroup.DefaultApplicationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.gameliftstreams.CfnStreamGroup.DefaultApplicationProperty,
    ) : CdkObject(cdkObject),
        DefaultApplicationProperty {
      /**
       * An [Amazon Resource Name
       * (ARN)](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference-arns.html) that uniquely
       * identifies the application resource. Example ARN:
       * `arn:aws:gameliftstreams:us-west-2:111122223333:application/a-9ZY8X7Wv6` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gameliftstreams-streamgroup-defaultapplication.html#cfn-gameliftstreams-streamgroup-defaultapplication-arn)
       */
      override fun arn(): String? = unwrap(this).getArn()

      /**
       * An ID that uniquely identifies the application resource.
       *
       * Example ID: `a-9ZY8X7Wv6` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gameliftstreams-streamgroup-defaultapplication.html#cfn-gameliftstreams-streamgroup-defaultapplication-id)
       */
      override fun id(): String? = unwrap(this).getId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DefaultApplicationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gameliftstreams.CfnStreamGroup.DefaultApplicationProperty):
          DefaultApplicationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DefaultApplicationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DefaultApplicationProperty):
          software.amazon.awscdk.services.gameliftstreams.CfnStreamGroup.DefaultApplicationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.gameliftstreams.CfnStreamGroup.DefaultApplicationProperty
    }
  }

  /**
   * Configuration settings that define a stream group's stream capacity for a location.
   *
   * When configuring a location for the first time, you must specify a numeric value for at least
   * one of the two capacity types.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.gameliftstreams.*;
   * LocationConfigurationProperty locationConfigurationProperty =
   * LocationConfigurationProperty.builder()
   * .locationName("locationName")
   * // the properties below are optional
   * .alwaysOnCapacity(123)
   * .onDemandCapacity(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gameliftstreams-streamgroup-locationconfiguration.html)
   */
  public interface LocationConfigurationProperty {
    /**
     * The streaming capacity that is allocated and ready to handle stream requests without delay.
     *
     * You pay for this capacity whether it's in use or not. Best for quickest time from streaming
     * request to streaming session.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gameliftstreams-streamgroup-locationconfiguration.html#cfn-gameliftstreams-streamgroup-locationconfiguration-alwaysoncapacity)
     */
    public fun alwaysOnCapacity(): Number? = unwrap(this).getAlwaysOnCapacity()

    /**
     * A location's name.
     *
     * For example, `us-east-1` . For a complete list of locations that Amazon GameLift Streams
     * supports, refer to [Regions, quotas, and
     * limitations](https://docs.aws.amazon.com/gameliftstreams/latest/developerguide/regions-quotas.html)
     * in the *Amazon GameLift Streams Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gameliftstreams-streamgroup-locationconfiguration.html#cfn-gameliftstreams-streamgroup-locationconfiguration-locationname)
     */
    public fun locationName(): String

    /**
     * The streaming capacity that Amazon GameLift Streams can allocate in response to stream
     * requests, and then de-allocate when the session has terminated.
     *
     * This offers a cost control measure at the expense of a greater startup time (typically under
     * 5 minutes).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gameliftstreams-streamgroup-locationconfiguration.html#cfn-gameliftstreams-streamgroup-locationconfiguration-ondemandcapacity)
     */
    public fun onDemandCapacity(): Number? = unwrap(this).getOnDemandCapacity()

    /**
     * A builder for [LocationConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param alwaysOnCapacity The streaming capacity that is allocated and ready to handle stream
       * requests without delay.
       * You pay for this capacity whether it's in use or not. Best for quickest time from streaming
       * request to streaming session.
       */
      public fun alwaysOnCapacity(alwaysOnCapacity: Number)

      /**
       * @param locationName A location's name. 
       * For example, `us-east-1` . For a complete list of locations that Amazon GameLift Streams
       * supports, refer to [Regions, quotas, and
       * limitations](https://docs.aws.amazon.com/gameliftstreams/latest/developerguide/regions-quotas.html)
       * in the *Amazon GameLift Streams Developer Guide* .
       */
      public fun locationName(locationName: String)

      /**
       * @param onDemandCapacity The streaming capacity that Amazon GameLift Streams can allocate in
       * response to stream requests, and then de-allocate when the session has terminated.
       * This offers a cost control measure at the expense of a greater startup time (typically
       * under 5 minutes).
       */
      public fun onDemandCapacity(onDemandCapacity: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gameliftstreams.CfnStreamGroup.LocationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.gameliftstreams.CfnStreamGroup.LocationConfigurationProperty.builder()

      /**
       * @param alwaysOnCapacity The streaming capacity that is allocated and ready to handle stream
       * requests without delay.
       * You pay for this capacity whether it's in use or not. Best for quickest time from streaming
       * request to streaming session.
       */
      override fun alwaysOnCapacity(alwaysOnCapacity: Number) {
        cdkBuilder.alwaysOnCapacity(alwaysOnCapacity)
      }

      /**
       * @param locationName A location's name. 
       * For example, `us-east-1` . For a complete list of locations that Amazon GameLift Streams
       * supports, refer to [Regions, quotas, and
       * limitations](https://docs.aws.amazon.com/gameliftstreams/latest/developerguide/regions-quotas.html)
       * in the *Amazon GameLift Streams Developer Guide* .
       */
      override fun locationName(locationName: String) {
        cdkBuilder.locationName(locationName)
      }

      /**
       * @param onDemandCapacity The streaming capacity that Amazon GameLift Streams can allocate in
       * response to stream requests, and then de-allocate when the session has terminated.
       * This offers a cost control measure at the expense of a greater startup time (typically
       * under 5 minutes).
       */
      override fun onDemandCapacity(onDemandCapacity: Number) {
        cdkBuilder.onDemandCapacity(onDemandCapacity)
      }

      public fun build():
          software.amazon.awscdk.services.gameliftstreams.CfnStreamGroup.LocationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.gameliftstreams.CfnStreamGroup.LocationConfigurationProperty,
    ) : CdkObject(cdkObject),
        LocationConfigurationProperty {
      /**
       * The streaming capacity that is allocated and ready to handle stream requests without delay.
       *
       * You pay for this capacity whether it's in use or not. Best for quickest time from streaming
       * request to streaming session.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gameliftstreams-streamgroup-locationconfiguration.html#cfn-gameliftstreams-streamgroup-locationconfiguration-alwaysoncapacity)
       */
      override fun alwaysOnCapacity(): Number? = unwrap(this).getAlwaysOnCapacity()

      /**
       * A location's name.
       *
       * For example, `us-east-1` . For a complete list of locations that Amazon GameLift Streams
       * supports, refer to [Regions, quotas, and
       * limitations](https://docs.aws.amazon.com/gameliftstreams/latest/developerguide/regions-quotas.html)
       * in the *Amazon GameLift Streams Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gameliftstreams-streamgroup-locationconfiguration.html#cfn-gameliftstreams-streamgroup-locationconfiguration-locationname)
       */
      override fun locationName(): String = unwrap(this).getLocationName()

      /**
       * The streaming capacity that Amazon GameLift Streams can allocate in response to stream
       * requests, and then de-allocate when the session has terminated.
       *
       * This offers a cost control measure at the expense of a greater startup time (typically
       * under 5 minutes).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gameliftstreams-streamgroup-locationconfiguration.html#cfn-gameliftstreams-streamgroup-locationconfiguration-ondemandcapacity)
       */
      override fun onDemandCapacity(): Number? = unwrap(this).getOnDemandCapacity()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LocationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gameliftstreams.CfnStreamGroup.LocationConfigurationProperty):
          LocationConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          LocationConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LocationConfigurationProperty):
          software.amazon.awscdk.services.gameliftstreams.CfnStreamGroup.LocationConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.gameliftstreams.CfnStreamGroup.LocationConfigurationProperty
    }
  }
}
