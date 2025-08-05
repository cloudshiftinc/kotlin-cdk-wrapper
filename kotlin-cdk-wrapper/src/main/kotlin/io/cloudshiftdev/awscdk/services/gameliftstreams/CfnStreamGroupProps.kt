@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.gameliftstreams

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnStreamGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.gameliftstreams.*;
 * CfnStreamGroupProps cfnStreamGroupProps = CfnStreamGroupProps.builder()
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
public interface CfnStreamGroupProps {
  /**
   * Object that identifies the Amazon GameLift Streams application to stream with this stream
   * group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gameliftstreams-streamgroup.html#cfn-gameliftstreams-streamgroup-defaultapplication)
   */
  public fun defaultApplication(): Any? = unwrap(this).getDefaultApplication()

  /**
   * A descriptive label for the stream group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gameliftstreams-streamgroup.html#cfn-gameliftstreams-streamgroup-description)
   */
  public fun description(): String

  /**
   * A set of one or more locations and the streaming capacity for each location.
   *
   * One of the locations MUST be your primary location, which is the AWS Region where you are
   * specifying this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gameliftstreams-streamgroup.html#cfn-gameliftstreams-streamgroup-locationconfigurations)
   */
  public fun locationConfigurations(): Any

  /**
   * The target stream quality for sessions that are hosted in this stream group.
   *
   * Set a stream class that is appropriate to the type of content that you're streaming. Stream
   * class determines the type of computing resources Amazon GameLift Streams uses and impacts the cost
   * of streaming. The following options are available:
   *
   * A stream class can be one of the following:
   *
   * * *`gen5n_win2022` (NVIDIA, ultra)* Supports applications with extremely high 3D scene
   * complexity. Runs applications on Microsoft Windows Server 2022 Base and supports DirectX 12.
   * Compatible with Unreal Engine versions up through 5.4, 32 and 64-bit applications, and anti-cheat
   * technology. Uses NVIDIA A10G Tensor GPU.
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
   * Compatible with Unreal Engine versions up through 5.4, 32 and 64-bit applications, and anti-cheat
   * technology. Uses NVIDIA T4 Tensor GPU.
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
   */
  public fun streamClass(): String

  /**
   * A list of labels to assign to the new stream group resource.
   *
   * Tags are developer-defined key-value pairs. Tagging AWS resources is useful for resource
   * management, access management and cost allocation. See [Tagging AWS
   * Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
   * Reference* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gameliftstreams-streamgroup.html#cfn-gameliftstreams-streamgroup-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A builder for [CfnStreamGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param defaultApplication Object that identifies the Amazon GameLift Streams application to
     * stream with this stream group.
     */
    public fun defaultApplication(defaultApplication: IResolvable)

    /**
     * @param defaultApplication Object that identifies the Amazon GameLift Streams application to
     * stream with this stream group.
     */
    public fun defaultApplication(defaultApplication: CfnStreamGroup.DefaultApplicationProperty)

    /**
     * @param defaultApplication Object that identifies the Amazon GameLift Streams application to
     * stream with this stream group.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cf316de56c467bdb66ede3ee5e9ff429d39a547d7e31eef9f60e1d7aa9f842f9")
    public
        fun defaultApplication(defaultApplication: CfnStreamGroup.DefaultApplicationProperty.Builder.() -> Unit)

    /**
     * @param description A descriptive label for the stream group. 
     */
    public fun description(description: String)

    /**
     * @param locationConfigurations A set of one or more locations and the streaming capacity for
     * each location. 
     * One of the locations MUST be your primary location, which is the AWS Region where you are
     * specifying this resource.
     */
    public fun locationConfigurations(locationConfigurations: IResolvable)

    /**
     * @param locationConfigurations A set of one or more locations and the streaming capacity for
     * each location. 
     * One of the locations MUST be your primary location, which is the AWS Region where you are
     * specifying this resource.
     */
    public fun locationConfigurations(locationConfigurations: List<Any>)

    /**
     * @param locationConfigurations A set of one or more locations and the streaming capacity for
     * each location. 
     * One of the locations MUST be your primary location, which is the AWS Region where you are
     * specifying this resource.
     */
    public fun locationConfigurations(vararg locationConfigurations: Any)

    /**
     * @param streamClass The target stream quality for sessions that are hosted in this stream
     * group. 
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
     */
    public fun streamClass(streamClass: String)

    /**
     * @param tags A list of labels to assign to the new stream group resource.
     * Tags are developer-defined key-value pairs. Tagging AWS resources is useful for resource
     * management, access management and cost allocation. See [Tagging AWS
     * Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
     * Reference* .
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.gameliftstreams.CfnStreamGroupProps.Builder =
        software.amazon.awscdk.services.gameliftstreams.CfnStreamGroupProps.builder()

    /**
     * @param defaultApplication Object that identifies the Amazon GameLift Streams application to
     * stream with this stream group.
     */
    override fun defaultApplication(defaultApplication: IResolvable) {
      cdkBuilder.defaultApplication(defaultApplication.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param defaultApplication Object that identifies the Amazon GameLift Streams application to
     * stream with this stream group.
     */
    override fun defaultApplication(defaultApplication: CfnStreamGroup.DefaultApplicationProperty) {
      cdkBuilder.defaultApplication(defaultApplication.let(CfnStreamGroup.DefaultApplicationProperty.Companion::unwrap))
    }

    /**
     * @param defaultApplication Object that identifies the Amazon GameLift Streams application to
     * stream with this stream group.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cf316de56c467bdb66ede3ee5e9ff429d39a547d7e31eef9f60e1d7aa9f842f9")
    override
        fun defaultApplication(defaultApplication: CfnStreamGroup.DefaultApplicationProperty.Builder.() -> Unit):
        Unit = defaultApplication(CfnStreamGroup.DefaultApplicationProperty(defaultApplication))

    /**
     * @param description A descriptive label for the stream group. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param locationConfigurations A set of one or more locations and the streaming capacity for
     * each location. 
     * One of the locations MUST be your primary location, which is the AWS Region where you are
     * specifying this resource.
     */
    override fun locationConfigurations(locationConfigurations: IResolvable) {
      cdkBuilder.locationConfigurations(locationConfigurations.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param locationConfigurations A set of one or more locations and the streaming capacity for
     * each location. 
     * One of the locations MUST be your primary location, which is the AWS Region where you are
     * specifying this resource.
     */
    override fun locationConfigurations(locationConfigurations: List<Any>) {
      cdkBuilder.locationConfigurations(locationConfigurations.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param locationConfigurations A set of one or more locations and the streaming capacity for
     * each location. 
     * One of the locations MUST be your primary location, which is the AWS Region where you are
     * specifying this resource.
     */
    override fun locationConfigurations(vararg locationConfigurations: Any): Unit =
        locationConfigurations(locationConfigurations.toList())

    /**
     * @param streamClass The target stream quality for sessions that are hosted in this stream
     * group. 
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
     */
    override fun streamClass(streamClass: String) {
      cdkBuilder.streamClass(streamClass)
    }

    /**
     * @param tags A list of labels to assign to the new stream group resource.
     * Tags are developer-defined key-value pairs. Tagging AWS resources is useful for resource
     * management, access management and cost allocation. See [Tagging AWS
     * Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
     * Reference* .
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.gameliftstreams.CfnStreamGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.gameliftstreams.CfnStreamGroupProps,
  ) : CdkObject(cdkObject),
      CfnStreamGroupProps {
    /**
     * Object that identifies the Amazon GameLift Streams application to stream with this stream
     * group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gameliftstreams-streamgroup.html#cfn-gameliftstreams-streamgroup-defaultapplication)
     */
    override fun defaultApplication(): Any? = unwrap(this).getDefaultApplication()

    /**
     * A descriptive label for the stream group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gameliftstreams-streamgroup.html#cfn-gameliftstreams-streamgroup-description)
     */
    override fun description(): String = unwrap(this).getDescription()

    /**
     * A set of one or more locations and the streaming capacity for each location.
     *
     * One of the locations MUST be your primary location, which is the AWS Region where you are
     * specifying this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gameliftstreams-streamgroup.html#cfn-gameliftstreams-streamgroup-locationconfigurations)
     */
    override fun locationConfigurations(): Any = unwrap(this).getLocationConfigurations()

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
     */
    override fun streamClass(): String = unwrap(this).getStreamClass()

    /**
     * A list of labels to assign to the new stream group resource.
     *
     * Tags are developer-defined key-value pairs. Tagging AWS resources is useful for resource
     * management, access management and cost allocation. See [Tagging AWS
     * Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
     * Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gameliftstreams-streamgroup.html#cfn-gameliftstreams-streamgroup-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStreamGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.gameliftstreams.CfnStreamGroupProps):
        CfnStreamGroupProps = CdkObjectWrappers.wrap(cdkObject) as? CfnStreamGroupProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnStreamGroupProps):
        software.amazon.awscdk.services.gameliftstreams.CfnStreamGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.gameliftstreams.CfnStreamGroupProps
  }
}
