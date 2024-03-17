@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.nimblestudio

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
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
 * The `AWS::NimbleStudio::LaunchProfile` resource represents access permissions for a set of studio
 * components, including types of workstations, render farms, and shared file systems.
 *
 * Launch profiles are shared with studio users to give them access to the set of studio components.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.nimblestudio.*;
 * CfnLaunchProfile cfnLaunchProfile = CfnLaunchProfile.Builder.create(this, "MyCfnLaunchProfile")
 * .ec2SubnetIds(List.of("ec2SubnetIds"))
 * .launchProfileProtocolVersions(List.of("launchProfileProtocolVersions"))
 * .name("name")
 * .streamConfiguration(StreamConfigurationProperty.builder()
 * .clipboardMode("clipboardMode")
 * .ec2InstanceTypes(List.of("ec2InstanceTypes"))
 * .streamingImageIds(List.of("streamingImageIds"))
 * // the properties below are optional
 * .automaticTerminationMode("automaticTerminationMode")
 * .maxSessionLengthInMinutes(123)
 * .maxStoppedSessionLengthInMinutes(123)
 * .sessionBackup(StreamConfigurationSessionBackupProperty.builder()
 * .maxBackupsToRetain(123)
 * .mode("mode")
 * .build())
 * .sessionPersistenceMode("sessionPersistenceMode")
 * .sessionStorage(StreamConfigurationSessionStorageProperty.builder()
 * .mode(List.of("mode"))
 * // the properties below are optional
 * .root(StreamingSessionStorageRootProperty.builder()
 * .linux("linux")
 * .windows("windows")
 * .build())
 * .build())
 * .volumeConfiguration(VolumeConfigurationProperty.builder()
 * .iops(123)
 * .size(123)
 * .throughput(123)
 * .build())
 * .build())
 * .studioComponentIds(List.of("studioComponentIds"))
 * .studioId("studioId")
 * // the properties below are optional
 * .description("description")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html)
 */
public open class CfnLaunchProfile internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The unique identifier for the launch profile resource.
   */
  public open fun attrLaunchProfileId(): String = unwrap(this).getAttrLaunchProfileId()

  /**
   * A human-readable description of the launch profile.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A human-readable description of the launch profile.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Unique identifiers for a collection of EC2 subnets.
   */
  public open fun ec2SubnetIds(): List<String> = unwrap(this).getEc2SubnetIds()

  /**
   * Unique identifiers for a collection of EC2 subnets.
   */
  public open fun ec2SubnetIds(`value`: List<String>) {
    unwrap(this).setEc2SubnetIds(`value`)
  }

  /**
   * Unique identifiers for a collection of EC2 subnets.
   */
  public open fun ec2SubnetIds(vararg `value`: String): Unit = ec2SubnetIds(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The version number of the protocol that is used by the launch profile.
   */
  public open fun launchProfileProtocolVersions(): List<String> =
      unwrap(this).getLaunchProfileProtocolVersions()

  /**
   * The version number of the protocol that is used by the launch profile.
   */
  public open fun launchProfileProtocolVersions(`value`: List<String>) {
    unwrap(this).setLaunchProfileProtocolVersions(`value`)
  }

  /**
   * The version number of the protocol that is used by the launch profile.
   */
  public open fun launchProfileProtocolVersions(vararg `value`: String): Unit =
      launchProfileProtocolVersions(`value`.toList())

  /**
   * A friendly name for the launch profile.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * A friendly name for the launch profile.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * A configuration for a streaming session.
   */
  public open fun streamConfiguration(): Any = unwrap(this).getStreamConfiguration()

  /**
   * A configuration for a streaming session.
   */
  public open fun streamConfiguration(`value`: IResolvable) {
    unwrap(this).setStreamConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * A configuration for a streaming session.
   */
  public open fun streamConfiguration(`value`: StreamConfigurationProperty) {
    unwrap(this).setStreamConfiguration(`value`.let(StreamConfigurationProperty::unwrap))
  }

  /**
   * A configuration for a streaming session.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f283d6cd17a9b024cb69645d2866d3e444cfc421682064b274a8879a890dadb4")
  public open fun streamConfiguration(`value`: StreamConfigurationProperty.Builder.() -> Unit): Unit
      = streamConfiguration(StreamConfigurationProperty(`value`))

  /**
   * Unique identifiers for a collection of studio components that can be used with this launch
   * profile.
   */
  public open fun studioComponentIds(): List<String> = unwrap(this).getStudioComponentIds()

  /**
   * Unique identifiers for a collection of studio components that can be used with this launch
   * profile.
   */
  public open fun studioComponentIds(`value`: List<String>) {
    unwrap(this).setStudioComponentIds(`value`)
  }

  /**
   * Unique identifiers for a collection of studio components that can be used with this launch
   * profile.
   */
  public open fun studioComponentIds(vararg `value`: String): Unit =
      studioComponentIds(`value`.toList())

  /**
   * The unique identifier for a studio resource.
   */
  public open fun studioId(): String = unwrap(this).getStudioId()

  /**
   * The unique identifier for a studio resource.
   */
  public open fun studioId(`value`: String) {
    unwrap(this).setStudioId(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.nimblestudio.CfnLaunchProfile].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A human-readable description of the launch profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-description)
     * @param description A human-readable description of the launch profile. 
     */
    public fun description(description: String)

    /**
     * Unique identifiers for a collection of EC2 subnets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-ec2subnetids)
     * @param ec2SubnetIds Unique identifiers for a collection of EC2 subnets. 
     */
    public fun ec2SubnetIds(ec2SubnetIds: List<String>)

    /**
     * Unique identifiers for a collection of EC2 subnets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-ec2subnetids)
     * @param ec2SubnetIds Unique identifiers for a collection of EC2 subnets. 
     */
    public fun ec2SubnetIds(vararg ec2SubnetIds: String)

    /**
     * The version number of the protocol that is used by the launch profile.
     *
     * The only valid version is "2021-03-31".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-launchprofileprotocolversions)
     * @param launchProfileProtocolVersions The version number of the protocol that is used by the
     * launch profile. 
     */
    public fun launchProfileProtocolVersions(launchProfileProtocolVersions: List<String>)

    /**
     * The version number of the protocol that is used by the launch profile.
     *
     * The only valid version is "2021-03-31".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-launchprofileprotocolversions)
     * @param launchProfileProtocolVersions The version number of the protocol that is used by the
     * launch profile. 
     */
    public fun launchProfileProtocolVersions(vararg launchProfileProtocolVersions: String)

    /**
     * A friendly name for the launch profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-name)
     * @param name A friendly name for the launch profile. 
     */
    public fun name(name: String)

    /**
     * A configuration for a streaming session.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-streamconfiguration)
     * @param streamConfiguration A configuration for a streaming session. 
     */
    public fun streamConfiguration(streamConfiguration: IResolvable)

    /**
     * A configuration for a streaming session.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-streamconfiguration)
     * @param streamConfiguration A configuration for a streaming session. 
     */
    public fun streamConfiguration(streamConfiguration: StreamConfigurationProperty)

    /**
     * A configuration for a streaming session.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-streamconfiguration)
     * @param streamConfiguration A configuration for a streaming session. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b3698d518770f3d74705b416bc81e2434819c2c071182060cb23be9cccdc6f03")
    public
        fun streamConfiguration(streamConfiguration: StreamConfigurationProperty.Builder.() -> Unit)

    /**
     * Unique identifiers for a collection of studio components that can be used with this launch
     * profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-studiocomponentids)
     * @param studioComponentIds Unique identifiers for a collection of studio components that can
     * be used with this launch profile. 
     */
    public fun studioComponentIds(studioComponentIds: List<String>)

    /**
     * Unique identifiers for a collection of studio components that can be used with this launch
     * profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-studiocomponentids)
     * @param studioComponentIds Unique identifiers for a collection of studio components that can
     * be used with this launch profile. 
     */
    public fun studioComponentIds(vararg studioComponentIds: String)

    /**
     * The unique identifier for a studio resource.
     *
     * In Nimble Studio , all other resources are contained in a studio resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-studioid)
     * @param studioId The unique identifier for a studio resource. 
     */
    public fun studioId(studioId: String)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.Builder =
        software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.Builder.create(scope, id)

    /**
     * A human-readable description of the launch profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-description)
     * @param description A human-readable description of the launch profile. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * Unique identifiers for a collection of EC2 subnets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-ec2subnetids)
     * @param ec2SubnetIds Unique identifiers for a collection of EC2 subnets. 
     */
    override fun ec2SubnetIds(ec2SubnetIds: List<String>) {
      cdkBuilder.ec2SubnetIds(ec2SubnetIds)
    }

    /**
     * Unique identifiers for a collection of EC2 subnets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-ec2subnetids)
     * @param ec2SubnetIds Unique identifiers for a collection of EC2 subnets. 
     */
    override fun ec2SubnetIds(vararg ec2SubnetIds: String): Unit =
        ec2SubnetIds(ec2SubnetIds.toList())

    /**
     * The version number of the protocol that is used by the launch profile.
     *
     * The only valid version is "2021-03-31".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-launchprofileprotocolversions)
     * @param launchProfileProtocolVersions The version number of the protocol that is used by the
     * launch profile. 
     */
    override fun launchProfileProtocolVersions(launchProfileProtocolVersions: List<String>) {
      cdkBuilder.launchProfileProtocolVersions(launchProfileProtocolVersions)
    }

    /**
     * The version number of the protocol that is used by the launch profile.
     *
     * The only valid version is "2021-03-31".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-launchprofileprotocolversions)
     * @param launchProfileProtocolVersions The version number of the protocol that is used by the
     * launch profile. 
     */
    override fun launchProfileProtocolVersions(vararg launchProfileProtocolVersions: String): Unit =
        launchProfileProtocolVersions(launchProfileProtocolVersions.toList())

    /**
     * A friendly name for the launch profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-name)
     * @param name A friendly name for the launch profile. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * A configuration for a streaming session.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-streamconfiguration)
     * @param streamConfiguration A configuration for a streaming session. 
     */
    override fun streamConfiguration(streamConfiguration: IResolvable) {
      cdkBuilder.streamConfiguration(streamConfiguration.let(IResolvable::unwrap))
    }

    /**
     * A configuration for a streaming session.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-streamconfiguration)
     * @param streamConfiguration A configuration for a streaming session. 
     */
    override fun streamConfiguration(streamConfiguration: StreamConfigurationProperty) {
      cdkBuilder.streamConfiguration(streamConfiguration.let(StreamConfigurationProperty::unwrap))
    }

    /**
     * A configuration for a streaming session.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-streamconfiguration)
     * @param streamConfiguration A configuration for a streaming session. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b3698d518770f3d74705b416bc81e2434819c2c071182060cb23be9cccdc6f03")
    override
        fun streamConfiguration(streamConfiguration: StreamConfigurationProperty.Builder.() -> Unit):
        Unit = streamConfiguration(StreamConfigurationProperty(streamConfiguration))

    /**
     * Unique identifiers for a collection of studio components that can be used with this launch
     * profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-studiocomponentids)
     * @param studioComponentIds Unique identifiers for a collection of studio components that can
     * be used with this launch profile. 
     */
    override fun studioComponentIds(studioComponentIds: List<String>) {
      cdkBuilder.studioComponentIds(studioComponentIds)
    }

    /**
     * Unique identifiers for a collection of studio components that can be used with this launch
     * profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-studiocomponentids)
     * @param studioComponentIds Unique identifiers for a collection of studio components that can
     * be used with this launch profile. 
     */
    override fun studioComponentIds(vararg studioComponentIds: String): Unit =
        studioComponentIds(studioComponentIds.toList())

    /**
     * The unique identifier for a studio resource.
     *
     * In Nimble Studio , all other resources are contained in a studio resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-studioid)
     * @param studioId The unique identifier for a studio resource. 
     */
    override fun studioId(studioId: String) {
      cdkBuilder.studioId(studioId)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLaunchProfile {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLaunchProfile(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile):
        CfnLaunchProfile = CfnLaunchProfile(cdkObject)

    internal fun unwrap(wrapped: CfnLaunchProfile):
        software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile = wrapped.cdkObject
  }

  /**
   * Custom volume configuration for the root volumes that are attached to streaming sessions.
   *
   * This parameter is only allowed when `sessionPersistenceMode` is `ACTIVATED` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.nimblestudio.*;
   * VolumeConfigurationProperty volumeConfigurationProperty = VolumeConfigurationProperty.builder()
   * .iops(123)
   * .size(123)
   * .throughput(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-volumeconfiguration.html)
   */
  public interface VolumeConfigurationProperty {
    /**
     * The number of I/O operations per second for the root volume that is attached to streaming
     * session.
     *
     * Default: - 3000
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-volumeconfiguration.html#cfn-nimblestudio-launchprofile-volumeconfiguration-iops)
     */
    public fun iops(): Number? = unwrap(this).getIops()

    /**
     * The size of the root volume that is attached to the streaming session.
     *
     * The root volume size is measured in GiBs.
     *
     * Default: - 500
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-volumeconfiguration.html#cfn-nimblestudio-launchprofile-volumeconfiguration-size)
     */
    public fun size(): Number? = unwrap(this).getSize()

    /**
     * The throughput to provision for the root volume that is attached to the streaming session.
     *
     * The throughput is measured in MiB/s.
     *
     * Default: - 125
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-volumeconfiguration.html#cfn-nimblestudio-launchprofile-volumeconfiguration-throughput)
     */
    public fun throughput(): Number? = unwrap(this).getThroughput()

    /**
     * A builder for [VolumeConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param iops The number of I/O operations per second for the root volume that is attached to
       * streaming session.
       */
      public fun iops(iops: Number)

      /**
       * @param size The size of the root volume that is attached to the streaming session.
       * The root volume size is measured in GiBs.
       */
      public fun size(size: Number)

      /**
       * @param throughput The throughput to provision for the root volume that is attached to the
       * streaming session.
       * The throughput is measured in MiB/s.
       */
      public fun throughput(throughput: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.VolumeConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.VolumeConfigurationProperty.builder()

      /**
       * @param iops The number of I/O operations per second for the root volume that is attached to
       * streaming session.
       */
      override fun iops(iops: Number) {
        cdkBuilder.iops(iops)
      }

      /**
       * @param size The size of the root volume that is attached to the streaming session.
       * The root volume size is measured in GiBs.
       */
      override fun size(size: Number) {
        cdkBuilder.size(size)
      }

      /**
       * @param throughput The throughput to provision for the root volume that is attached to the
       * streaming session.
       * The throughput is measured in MiB/s.
       */
      override fun throughput(throughput: Number) {
        cdkBuilder.throughput(throughput)
      }

      public fun build():
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.VolumeConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.VolumeConfigurationProperty,
    ) : CdkObject(cdkObject), VolumeConfigurationProperty {
      /**
       * The number of I/O operations per second for the root volume that is attached to streaming
       * session.
       *
       * Default: - 3000
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-volumeconfiguration.html#cfn-nimblestudio-launchprofile-volumeconfiguration-iops)
       */
      override fun iops(): Number? = unwrap(this).getIops()

      /**
       * The size of the root volume that is attached to the streaming session.
       *
       * The root volume size is measured in GiBs.
       *
       * Default: - 500
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-volumeconfiguration.html#cfn-nimblestudio-launchprofile-volumeconfiguration-size)
       */
      override fun size(): Number? = unwrap(this).getSize()

      /**
       * The throughput to provision for the root volume that is attached to the streaming session.
       *
       * The throughput is measured in MiB/s.
       *
       * Default: - 125
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-volumeconfiguration.html#cfn-nimblestudio-launchprofile-volumeconfiguration-throughput)
       */
      override fun throughput(): Number? = unwrap(this).getThroughput()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VolumeConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.VolumeConfigurationProperty):
          VolumeConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          VolumeConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: VolumeConfigurationProperty):
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.VolumeConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.VolumeConfigurationProperty
    }
  }

  /**
   * A configuration for a streaming session.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.nimblestudio.*;
   * StreamConfigurationProperty streamConfigurationProperty = StreamConfigurationProperty.builder()
   * .clipboardMode("clipboardMode")
   * .ec2InstanceTypes(List.of("ec2InstanceTypes"))
   * .streamingImageIds(List.of("streamingImageIds"))
   * // the properties below are optional
   * .automaticTerminationMode("automaticTerminationMode")
   * .maxSessionLengthInMinutes(123)
   * .maxStoppedSessionLengthInMinutes(123)
   * .sessionBackup(StreamConfigurationSessionBackupProperty.builder()
   * .maxBackupsToRetain(123)
   * .mode("mode")
   * .build())
   * .sessionPersistenceMode("sessionPersistenceMode")
   * .sessionStorage(StreamConfigurationSessionStorageProperty.builder()
   * .mode(List.of("mode"))
   * // the properties below are optional
   * .root(StreamingSessionStorageRootProperty.builder()
   * .linux("linux")
   * .windows("windows")
   * .build())
   * .build())
   * .volumeConfiguration(VolumeConfigurationProperty.builder()
   * .iops(123)
   * .size(123)
   * .throughput(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamconfiguration.html)
   */
  public interface StreamConfigurationProperty {
    /**
     * Indicates if a streaming session created from this launch profile should be terminated
     * automatically or retained without termination after being in a `STOPPED` state.
     *
     * * When `ACTIVATED` , the streaming session is scheduled for termination after being in the
     * `STOPPED` state for the time specified in `maxStoppedSessionLengthInMinutes` .
     * * When `DEACTIVATED` , the streaming session can remain in the `STOPPED` state indefinitely.
     *
     * This parameter is only allowed when `sessionPersistenceMode` is `ACTIVATED` . When allowed,
     * the default value for this parameter is `DEACTIVATED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamconfiguration.html#cfn-nimblestudio-launchprofile-streamconfiguration-automaticterminationmode)
     */
    public fun automaticTerminationMode(): String? = unwrap(this).getAutomaticTerminationMode()

    /**
     * Allows or deactivates the use of the system clipboard to copy and paste between the streaming
     * session and streaming client.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamconfiguration.html#cfn-nimblestudio-launchprofile-streamconfiguration-clipboardmode)
     */
    public fun clipboardMode(): String

    /**
     * The EC2 instance types that users can select from when launching a streaming session with
     * this launch profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamconfiguration.html#cfn-nimblestudio-launchprofile-streamconfiguration-ec2instancetypes)
     */
    public fun ec2InstanceTypes(): List<String>

    /**
     * The length of time, in minutes, that a streaming session can be active before it is stopped
     * or terminated.
     *
     * After this point, Nimble Studio automatically terminates or stops the session. The default
     * length of time is 690 minutes, and the maximum length of time is 30 days.
     *
     * Default: - 690
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamconfiguration.html#cfn-nimblestudio-launchprofile-streamconfiguration-maxsessionlengthinminutes)
     */
    public fun maxSessionLengthInMinutes(): Number? = unwrap(this).getMaxSessionLengthInMinutes()

    /**
     * Integer that determines if you can start and stop your sessions and how long a session can
     * stay in the `STOPPED` state.
     *
     * The default value is 0. The maximum value is 5760.
     *
     * This field is allowed only when `sessionPersistenceMode` is `ACTIVATED` and
     * `automaticTerminationMode` is `ACTIVATED` .
     *
     * If the value is set to 0, your sessions can’t be `STOPPED` . If you then call
     * `StopStreamingSession` , the session fails. If the time that a session stays in the `READY`
     * state exceeds the `maxSessionLengthInMinutes` value, the session will automatically be
     * terminated (instead of `STOPPED` ).
     *
     * If the value is set to a positive number, the session can be stopped. You can call
     * `StopStreamingSession` to stop sessions in the `READY` state. If the time that a session stays
     * in the `READY` state exceeds the `maxSessionLengthInMinutes` value, the session will
     * automatically be stopped (instead of terminated).
     *
     * Default: - 0
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamconfiguration.html#cfn-nimblestudio-launchprofile-streamconfiguration-maxstoppedsessionlengthinminutes)
     */
    public fun maxStoppedSessionLengthInMinutes(): Number? =
        unwrap(this).getMaxStoppedSessionLengthInMinutes()

    /**
     * Information about the streaming session backup.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamconfiguration.html#cfn-nimblestudio-launchprofile-streamconfiguration-sessionbackup)
     */
    public fun sessionBackup(): Any? = unwrap(this).getSessionBackup()

    /**
     * Determine if a streaming session created from this launch profile can configure persistent
     * storage.
     *
     * This means that `volumeConfiguration` and `automaticTerminationMode` are configured.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamconfiguration.html#cfn-nimblestudio-launchprofile-streamconfiguration-sessionpersistencemode)
     */
    public fun sessionPersistenceMode(): String? = unwrap(this).getSessionPersistenceMode()

    /**
     * The upload storage for a streaming session.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamconfiguration.html#cfn-nimblestudio-launchprofile-streamconfiguration-sessionstorage)
     */
    public fun sessionStorage(): Any? = unwrap(this).getSessionStorage()

    /**
     * The streaming images that users can select from when launching a streaming session with this
     * launch profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamconfiguration.html#cfn-nimblestudio-launchprofile-streamconfiguration-streamingimageids)
     */
    public fun streamingImageIds(): List<String>

    /**
     * Custom volume configuration for the root volumes that are attached to streaming sessions.
     *
     * This parameter is only allowed when `sessionPersistenceMode` is `ACTIVATED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamconfiguration.html#cfn-nimblestudio-launchprofile-streamconfiguration-volumeconfiguration)
     */
    public fun volumeConfiguration(): Any? = unwrap(this).getVolumeConfiguration()

    /**
     * A builder for [StreamConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param automaticTerminationMode Indicates if a streaming session created from this launch
       * profile should be terminated automatically or retained without termination after being in a
       * `STOPPED` state.
       * * When `ACTIVATED` , the streaming session is scheduled for termination after being in the
       * `STOPPED` state for the time specified in `maxStoppedSessionLengthInMinutes` .
       * * When `DEACTIVATED` , the streaming session can remain in the `STOPPED` state
       * indefinitely.
       *
       * This parameter is only allowed when `sessionPersistenceMode` is `ACTIVATED` . When allowed,
       * the default value for this parameter is `DEACTIVATED` .
       */
      public fun automaticTerminationMode(automaticTerminationMode: String)

      /**
       * @param clipboardMode Allows or deactivates the use of the system clipboard to copy and
       * paste between the streaming session and streaming client. 
       */
      public fun clipboardMode(clipboardMode: String)

      /**
       * @param ec2InstanceTypes The EC2 instance types that users can select from when launching a
       * streaming session with this launch profile. 
       */
      public fun ec2InstanceTypes(ec2InstanceTypes: List<String>)

      /**
       * @param ec2InstanceTypes The EC2 instance types that users can select from when launching a
       * streaming session with this launch profile. 
       */
      public fun ec2InstanceTypes(vararg ec2InstanceTypes: String)

      /**
       * @param maxSessionLengthInMinutes The length of time, in minutes, that a streaming session
       * can be active before it is stopped or terminated.
       * After this point, Nimble Studio automatically terminates or stops the session. The default
       * length of time is 690 minutes, and the maximum length of time is 30 days.
       */
      public fun maxSessionLengthInMinutes(maxSessionLengthInMinutes: Number)

      /**
       * @param maxStoppedSessionLengthInMinutes Integer that determines if you can start and stop
       * your sessions and how long a session can stay in the `STOPPED` state.
       * The default value is 0. The maximum value is 5760.
       *
       * This field is allowed only when `sessionPersistenceMode` is `ACTIVATED` and
       * `automaticTerminationMode` is `ACTIVATED` .
       *
       * If the value is set to 0, your sessions can’t be `STOPPED` . If you then call
       * `StopStreamingSession` , the session fails. If the time that a session stays in the `READY`
       * state exceeds the `maxSessionLengthInMinutes` value, the session will automatically be
       * terminated (instead of `STOPPED` ).
       *
       * If the value is set to a positive number, the session can be stopped. You can call
       * `StopStreamingSession` to stop sessions in the `READY` state. If the time that a session stays
       * in the `READY` state exceeds the `maxSessionLengthInMinutes` value, the session will
       * automatically be stopped (instead of terminated).
       */
      public fun maxStoppedSessionLengthInMinutes(maxStoppedSessionLengthInMinutes: Number)

      /**
       * @param sessionBackup Information about the streaming session backup.
       */
      public fun sessionBackup(sessionBackup: IResolvable)

      /**
       * @param sessionBackup Information about the streaming session backup.
       */
      public fun sessionBackup(sessionBackup: StreamConfigurationSessionBackupProperty)

      /**
       * @param sessionBackup Information about the streaming session backup.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9ddc4c021317db72cacf355d33a0c36a14aca572e2f04692d19d4565d4472214")
      public
          fun sessionBackup(sessionBackup: StreamConfigurationSessionBackupProperty.Builder.() -> Unit)

      /**
       * @param sessionPersistenceMode Determine if a streaming session created from this launch
       * profile can configure persistent storage.
       * This means that `volumeConfiguration` and `automaticTerminationMode` are configured.
       */
      public fun sessionPersistenceMode(sessionPersistenceMode: String)

      /**
       * @param sessionStorage The upload storage for a streaming session.
       */
      public fun sessionStorage(sessionStorage: IResolvable)

      /**
       * @param sessionStorage The upload storage for a streaming session.
       */
      public fun sessionStorage(sessionStorage: StreamConfigurationSessionStorageProperty)

      /**
       * @param sessionStorage The upload storage for a streaming session.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cf2fcfb08f02da9561ce6289f8628c8d85bbd7c1be0d4d3ea22f5b6921890323")
      public
          fun sessionStorage(sessionStorage: StreamConfigurationSessionStorageProperty.Builder.() -> Unit)

      /**
       * @param streamingImageIds The streaming images that users can select from when launching a
       * streaming session with this launch profile. 
       */
      public fun streamingImageIds(streamingImageIds: List<String>)

      /**
       * @param streamingImageIds The streaming images that users can select from when launching a
       * streaming session with this launch profile. 
       */
      public fun streamingImageIds(vararg streamingImageIds: String)

      /**
       * @param volumeConfiguration Custom volume configuration for the root volumes that are
       * attached to streaming sessions.
       * This parameter is only allowed when `sessionPersistenceMode` is `ACTIVATED` .
       */
      public fun volumeConfiguration(volumeConfiguration: IResolvable)

      /**
       * @param volumeConfiguration Custom volume configuration for the root volumes that are
       * attached to streaming sessions.
       * This parameter is only allowed when `sessionPersistenceMode` is `ACTIVATED` .
       */
      public fun volumeConfiguration(volumeConfiguration: VolumeConfigurationProperty)

      /**
       * @param volumeConfiguration Custom volume configuration for the root volumes that are
       * attached to streaming sessions.
       * This parameter is only allowed when `sessionPersistenceMode` is `ACTIVATED` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("afd8c78b11abc1309c12b60352c63def2d14cf73b2a59c3faa574426649e5b85")
      public
          fun volumeConfiguration(volumeConfiguration: VolumeConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamConfigurationProperty.builder()

      /**
       * @param automaticTerminationMode Indicates if a streaming session created from this launch
       * profile should be terminated automatically or retained without termination after being in a
       * `STOPPED` state.
       * * When `ACTIVATED` , the streaming session is scheduled for termination after being in the
       * `STOPPED` state for the time specified in `maxStoppedSessionLengthInMinutes` .
       * * When `DEACTIVATED` , the streaming session can remain in the `STOPPED` state
       * indefinitely.
       *
       * This parameter is only allowed when `sessionPersistenceMode` is `ACTIVATED` . When allowed,
       * the default value for this parameter is `DEACTIVATED` .
       */
      override fun automaticTerminationMode(automaticTerminationMode: String) {
        cdkBuilder.automaticTerminationMode(automaticTerminationMode)
      }

      /**
       * @param clipboardMode Allows or deactivates the use of the system clipboard to copy and
       * paste between the streaming session and streaming client. 
       */
      override fun clipboardMode(clipboardMode: String) {
        cdkBuilder.clipboardMode(clipboardMode)
      }

      /**
       * @param ec2InstanceTypes The EC2 instance types that users can select from when launching a
       * streaming session with this launch profile. 
       */
      override fun ec2InstanceTypes(ec2InstanceTypes: List<String>) {
        cdkBuilder.ec2InstanceTypes(ec2InstanceTypes)
      }

      /**
       * @param ec2InstanceTypes The EC2 instance types that users can select from when launching a
       * streaming session with this launch profile. 
       */
      override fun ec2InstanceTypes(vararg ec2InstanceTypes: String): Unit =
          ec2InstanceTypes(ec2InstanceTypes.toList())

      /**
       * @param maxSessionLengthInMinutes The length of time, in minutes, that a streaming session
       * can be active before it is stopped or terminated.
       * After this point, Nimble Studio automatically terminates or stops the session. The default
       * length of time is 690 minutes, and the maximum length of time is 30 days.
       */
      override fun maxSessionLengthInMinutes(maxSessionLengthInMinutes: Number) {
        cdkBuilder.maxSessionLengthInMinutes(maxSessionLengthInMinutes)
      }

      /**
       * @param maxStoppedSessionLengthInMinutes Integer that determines if you can start and stop
       * your sessions and how long a session can stay in the `STOPPED` state.
       * The default value is 0. The maximum value is 5760.
       *
       * This field is allowed only when `sessionPersistenceMode` is `ACTIVATED` and
       * `automaticTerminationMode` is `ACTIVATED` .
       *
       * If the value is set to 0, your sessions can’t be `STOPPED` . If you then call
       * `StopStreamingSession` , the session fails. If the time that a session stays in the `READY`
       * state exceeds the `maxSessionLengthInMinutes` value, the session will automatically be
       * terminated (instead of `STOPPED` ).
       *
       * If the value is set to a positive number, the session can be stopped. You can call
       * `StopStreamingSession` to stop sessions in the `READY` state. If the time that a session stays
       * in the `READY` state exceeds the `maxSessionLengthInMinutes` value, the session will
       * automatically be stopped (instead of terminated).
       */
      override fun maxStoppedSessionLengthInMinutes(maxStoppedSessionLengthInMinutes: Number) {
        cdkBuilder.maxStoppedSessionLengthInMinutes(maxStoppedSessionLengthInMinutes)
      }

      /**
       * @param sessionBackup Information about the streaming session backup.
       */
      override fun sessionBackup(sessionBackup: IResolvable) {
        cdkBuilder.sessionBackup(sessionBackup.let(IResolvable::unwrap))
      }

      /**
       * @param sessionBackup Information about the streaming session backup.
       */
      override fun sessionBackup(sessionBackup: StreamConfigurationSessionBackupProperty) {
        cdkBuilder.sessionBackup(sessionBackup.let(StreamConfigurationSessionBackupProperty::unwrap))
      }

      /**
       * @param sessionBackup Information about the streaming session backup.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9ddc4c021317db72cacf355d33a0c36a14aca572e2f04692d19d4565d4472214")
      override
          fun sessionBackup(sessionBackup: StreamConfigurationSessionBackupProperty.Builder.() -> Unit):
          Unit = sessionBackup(StreamConfigurationSessionBackupProperty(sessionBackup))

      /**
       * @param sessionPersistenceMode Determine if a streaming session created from this launch
       * profile can configure persistent storage.
       * This means that `volumeConfiguration` and `automaticTerminationMode` are configured.
       */
      override fun sessionPersistenceMode(sessionPersistenceMode: String) {
        cdkBuilder.sessionPersistenceMode(sessionPersistenceMode)
      }

      /**
       * @param sessionStorage The upload storage for a streaming session.
       */
      override fun sessionStorage(sessionStorage: IResolvable) {
        cdkBuilder.sessionStorage(sessionStorage.let(IResolvable::unwrap))
      }

      /**
       * @param sessionStorage The upload storage for a streaming session.
       */
      override fun sessionStorage(sessionStorage: StreamConfigurationSessionStorageProperty) {
        cdkBuilder.sessionStorage(sessionStorage.let(StreamConfigurationSessionStorageProperty::unwrap))
      }

      /**
       * @param sessionStorage The upload storage for a streaming session.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cf2fcfb08f02da9561ce6289f8628c8d85bbd7c1be0d4d3ea22f5b6921890323")
      override
          fun sessionStorage(sessionStorage: StreamConfigurationSessionStorageProperty.Builder.() -> Unit):
          Unit = sessionStorage(StreamConfigurationSessionStorageProperty(sessionStorage))

      /**
       * @param streamingImageIds The streaming images that users can select from when launching a
       * streaming session with this launch profile. 
       */
      override fun streamingImageIds(streamingImageIds: List<String>) {
        cdkBuilder.streamingImageIds(streamingImageIds)
      }

      /**
       * @param streamingImageIds The streaming images that users can select from when launching a
       * streaming session with this launch profile. 
       */
      override fun streamingImageIds(vararg streamingImageIds: String): Unit =
          streamingImageIds(streamingImageIds.toList())

      /**
       * @param volumeConfiguration Custom volume configuration for the root volumes that are
       * attached to streaming sessions.
       * This parameter is only allowed when `sessionPersistenceMode` is `ACTIVATED` .
       */
      override fun volumeConfiguration(volumeConfiguration: IResolvable) {
        cdkBuilder.volumeConfiguration(volumeConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param volumeConfiguration Custom volume configuration for the root volumes that are
       * attached to streaming sessions.
       * This parameter is only allowed when `sessionPersistenceMode` is `ACTIVATED` .
       */
      override fun volumeConfiguration(volumeConfiguration: VolumeConfigurationProperty) {
        cdkBuilder.volumeConfiguration(volumeConfiguration.let(VolumeConfigurationProperty::unwrap))
      }

      /**
       * @param volumeConfiguration Custom volume configuration for the root volumes that are
       * attached to streaming sessions.
       * This parameter is only allowed when `sessionPersistenceMode` is `ACTIVATED` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("afd8c78b11abc1309c12b60352c63def2d14cf73b2a59c3faa574426649e5b85")
      override
          fun volumeConfiguration(volumeConfiguration: VolumeConfigurationProperty.Builder.() -> Unit):
          Unit = volumeConfiguration(VolumeConfigurationProperty(volumeConfiguration))

      public fun build():
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamConfigurationProperty,
    ) : CdkObject(cdkObject), StreamConfigurationProperty {
      /**
       * Indicates if a streaming session created from this launch profile should be terminated
       * automatically or retained without termination after being in a `STOPPED` state.
       *
       * * When `ACTIVATED` , the streaming session is scheduled for termination after being in the
       * `STOPPED` state for the time specified in `maxStoppedSessionLengthInMinutes` .
       * * When `DEACTIVATED` , the streaming session can remain in the `STOPPED` state
       * indefinitely.
       *
       * This parameter is only allowed when `sessionPersistenceMode` is `ACTIVATED` . When allowed,
       * the default value for this parameter is `DEACTIVATED` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamconfiguration.html#cfn-nimblestudio-launchprofile-streamconfiguration-automaticterminationmode)
       */
      override fun automaticTerminationMode(): String? = unwrap(this).getAutomaticTerminationMode()

      /**
       * Allows or deactivates the use of the system clipboard to copy and paste between the
       * streaming session and streaming client.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamconfiguration.html#cfn-nimblestudio-launchprofile-streamconfiguration-clipboardmode)
       */
      override fun clipboardMode(): String = unwrap(this).getClipboardMode()

      /**
       * The EC2 instance types that users can select from when launching a streaming session with
       * this launch profile.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamconfiguration.html#cfn-nimblestudio-launchprofile-streamconfiguration-ec2instancetypes)
       */
      override fun ec2InstanceTypes(): List<String> = unwrap(this).getEc2InstanceTypes()

      /**
       * The length of time, in minutes, that a streaming session can be active before it is stopped
       * or terminated.
       *
       * After this point, Nimble Studio automatically terminates or stops the session. The default
       * length of time is 690 minutes, and the maximum length of time is 30 days.
       *
       * Default: - 690
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamconfiguration.html#cfn-nimblestudio-launchprofile-streamconfiguration-maxsessionlengthinminutes)
       */
      override fun maxSessionLengthInMinutes(): Number? =
          unwrap(this).getMaxSessionLengthInMinutes()

      /**
       * Integer that determines if you can start and stop your sessions and how long a session can
       * stay in the `STOPPED` state.
       *
       * The default value is 0. The maximum value is 5760.
       *
       * This field is allowed only when `sessionPersistenceMode` is `ACTIVATED` and
       * `automaticTerminationMode` is `ACTIVATED` .
       *
       * If the value is set to 0, your sessions can’t be `STOPPED` . If you then call
       * `StopStreamingSession` , the session fails. If the time that a session stays in the `READY`
       * state exceeds the `maxSessionLengthInMinutes` value, the session will automatically be
       * terminated (instead of `STOPPED` ).
       *
       * If the value is set to a positive number, the session can be stopped. You can call
       * `StopStreamingSession` to stop sessions in the `READY` state. If the time that a session stays
       * in the `READY` state exceeds the `maxSessionLengthInMinutes` value, the session will
       * automatically be stopped (instead of terminated).
       *
       * Default: - 0
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamconfiguration.html#cfn-nimblestudio-launchprofile-streamconfiguration-maxstoppedsessionlengthinminutes)
       */
      override fun maxStoppedSessionLengthInMinutes(): Number? =
          unwrap(this).getMaxStoppedSessionLengthInMinutes()

      /**
       * Information about the streaming session backup.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamconfiguration.html#cfn-nimblestudio-launchprofile-streamconfiguration-sessionbackup)
       */
      override fun sessionBackup(): Any? = unwrap(this).getSessionBackup()

      /**
       * Determine if a streaming session created from this launch profile can configure persistent
       * storage.
       *
       * This means that `volumeConfiguration` and `automaticTerminationMode` are configured.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamconfiguration.html#cfn-nimblestudio-launchprofile-streamconfiguration-sessionpersistencemode)
       */
      override fun sessionPersistenceMode(): String? = unwrap(this).getSessionPersistenceMode()

      /**
       * The upload storage for a streaming session.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamconfiguration.html#cfn-nimblestudio-launchprofile-streamconfiguration-sessionstorage)
       */
      override fun sessionStorage(): Any? = unwrap(this).getSessionStorage()

      /**
       * The streaming images that users can select from when launching a streaming session with
       * this launch profile.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamconfiguration.html#cfn-nimblestudio-launchprofile-streamconfiguration-streamingimageids)
       */
      override fun streamingImageIds(): List<String> = unwrap(this).getStreamingImageIds()

      /**
       * Custom volume configuration for the root volumes that are attached to streaming sessions.
       *
       * This parameter is only allowed when `sessionPersistenceMode` is `ACTIVATED` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamconfiguration.html#cfn-nimblestudio-launchprofile-streamconfiguration-volumeconfiguration)
       */
      override fun volumeConfiguration(): Any? = unwrap(this).getVolumeConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StreamConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamConfigurationProperty):
          StreamConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          StreamConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: StreamConfigurationProperty):
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamConfigurationProperty
    }
  }

  /**
   * The upload storage root location (folder) on streaming workstations where files are uploaded.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.nimblestudio.*;
   * StreamingSessionStorageRootProperty streamingSessionStorageRootProperty =
   * StreamingSessionStorageRootProperty.builder()
   * .linux("linux")
   * .windows("windows")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamingsessionstorageroot.html)
   */
  public interface StreamingSessionStorageRootProperty {
    /**
     * The folder path in Linux workstations where files are uploaded.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamingsessionstorageroot.html#cfn-nimblestudio-launchprofile-streamingsessionstorageroot-linux)
     */
    public fun linux(): String? = unwrap(this).getLinux()

    /**
     * The folder path in Windows workstations where files are uploaded.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamingsessionstorageroot.html#cfn-nimblestudio-launchprofile-streamingsessionstorageroot-windows)
     */
    public fun windows(): String? = unwrap(this).getWindows()

    /**
     * A builder for [StreamingSessionStorageRootProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param linux The folder path in Linux workstations where files are uploaded.
       */
      public fun linux(linux: String)

      /**
       * @param windows The folder path in Windows workstations where files are uploaded.
       */
      public fun windows(windows: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamingSessionStorageRootProperty.Builder
          =
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamingSessionStorageRootProperty.builder()

      /**
       * @param linux The folder path in Linux workstations where files are uploaded.
       */
      override fun linux(linux: String) {
        cdkBuilder.linux(linux)
      }

      /**
       * @param windows The folder path in Windows workstations where files are uploaded.
       */
      override fun windows(windows: String) {
        cdkBuilder.windows(windows)
      }

      public fun build():
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamingSessionStorageRootProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamingSessionStorageRootProperty,
    ) : CdkObject(cdkObject), StreamingSessionStorageRootProperty {
      /**
       * The folder path in Linux workstations where files are uploaded.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamingsessionstorageroot.html#cfn-nimblestudio-launchprofile-streamingsessionstorageroot-linux)
       */
      override fun linux(): String? = unwrap(this).getLinux()

      /**
       * The folder path in Windows workstations where files are uploaded.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamingsessionstorageroot.html#cfn-nimblestudio-launchprofile-streamingsessionstorageroot-windows)
       */
      override fun windows(): String? = unwrap(this).getWindows()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          StreamingSessionStorageRootProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamingSessionStorageRootProperty):
          StreamingSessionStorageRootProperty = CdkObjectWrappers.wrap(cdkObject) as?
          StreamingSessionStorageRootProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: StreamingSessionStorageRootProperty):
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamingSessionStorageRootProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamingSessionStorageRootProperty
    }
  }

  /**
   * The configuration for a streaming session’s upload storage.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.nimblestudio.*;
   * StreamConfigurationSessionStorageProperty streamConfigurationSessionStorageProperty =
   * StreamConfigurationSessionStorageProperty.builder()
   * .mode(List.of("mode"))
   * // the properties below are optional
   * .root(StreamingSessionStorageRootProperty.builder()
   * .linux("linux")
   * .windows("windows")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamconfigurationsessionstorage.html)
   */
  public interface StreamConfigurationSessionStorageProperty {
    /**
     * Allows artists to upload files to their workstations.
     *
     * The only valid option is `UPLOAD` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamconfigurationsessionstorage.html#cfn-nimblestudio-launchprofile-streamconfigurationsessionstorage-mode)
     */
    public fun mode(): List<String>

    /**
     * The configuration for the upload storage root of the streaming session.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamconfigurationsessionstorage.html#cfn-nimblestudio-launchprofile-streamconfigurationsessionstorage-root)
     */
    public fun root(): Any? = unwrap(this).getRoot()

    /**
     * A builder for [StreamConfigurationSessionStorageProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param mode Allows artists to upload files to their workstations. 
       * The only valid option is `UPLOAD` .
       */
      public fun mode(mode: List<String>)

      /**
       * @param mode Allows artists to upload files to their workstations. 
       * The only valid option is `UPLOAD` .
       */
      public fun mode(vararg mode: String)

      /**
       * @param root The configuration for the upload storage root of the streaming session.
       */
      public fun root(root: IResolvable)

      /**
       * @param root The configuration for the upload storage root of the streaming session.
       */
      public fun root(root: StreamingSessionStorageRootProperty)

      /**
       * @param root The configuration for the upload storage root of the streaming session.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bc0c44feeeddfb6ec40191a44a0bf186008b7d44aa76d4f9f40d5b30baab837d")
      public fun root(root: StreamingSessionStorageRootProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamConfigurationSessionStorageProperty.Builder
          =
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamConfigurationSessionStorageProperty.builder()

      /**
       * @param mode Allows artists to upload files to their workstations. 
       * The only valid option is `UPLOAD` .
       */
      override fun mode(mode: List<String>) {
        cdkBuilder.mode(mode)
      }

      /**
       * @param mode Allows artists to upload files to their workstations. 
       * The only valid option is `UPLOAD` .
       */
      override fun mode(vararg mode: String): Unit = mode(mode.toList())

      /**
       * @param root The configuration for the upload storage root of the streaming session.
       */
      override fun root(root: IResolvable) {
        cdkBuilder.root(root.let(IResolvable::unwrap))
      }

      /**
       * @param root The configuration for the upload storage root of the streaming session.
       */
      override fun root(root: StreamingSessionStorageRootProperty) {
        cdkBuilder.root(root.let(StreamingSessionStorageRootProperty::unwrap))
      }

      /**
       * @param root The configuration for the upload storage root of the streaming session.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bc0c44feeeddfb6ec40191a44a0bf186008b7d44aa76d4f9f40d5b30baab837d")
      override fun root(root: StreamingSessionStorageRootProperty.Builder.() -> Unit): Unit =
          root(StreamingSessionStorageRootProperty(root))

      public fun build():
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamConfigurationSessionStorageProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamConfigurationSessionStorageProperty,
    ) : CdkObject(cdkObject), StreamConfigurationSessionStorageProperty {
      /**
       * Allows artists to upload files to their workstations.
       *
       * The only valid option is `UPLOAD` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamconfigurationsessionstorage.html#cfn-nimblestudio-launchprofile-streamconfigurationsessionstorage-mode)
       */
      override fun mode(): List<String> = unwrap(this).getMode()

      /**
       * The configuration for the upload storage root of the streaming session.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamconfigurationsessionstorage.html#cfn-nimblestudio-launchprofile-streamconfigurationsessionstorage-root)
       */
      override fun root(): Any? = unwrap(this).getRoot()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          StreamConfigurationSessionStorageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamConfigurationSessionStorageProperty):
          StreamConfigurationSessionStorageProperty = CdkObjectWrappers.wrap(cdkObject) as?
          StreamConfigurationSessionStorageProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: StreamConfigurationSessionStorageProperty):
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamConfigurationSessionStorageProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamConfigurationSessionStorageProperty
    }
  }

  /**
   * Configures how streaming sessions are backed up when launched from this launch profile.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.nimblestudio.*;
   * StreamConfigurationSessionBackupProperty streamConfigurationSessionBackupProperty =
   * StreamConfigurationSessionBackupProperty.builder()
   * .maxBackupsToRetain(123)
   * .mode("mode")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamconfigurationsessionbackup.html)
   */
  public interface StreamConfigurationSessionBackupProperty {
    /**
     * The maximum number of backups that each streaming session created from this launch profile
     * can have.
     *
     * Default: - 0
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamconfigurationsessionbackup.html#cfn-nimblestudio-launchprofile-streamconfigurationsessionbackup-maxbackupstoretain)
     */
    public fun maxBackupsToRetain(): Number? = unwrap(this).getMaxBackupsToRetain()

    /**
     * Specifies how artists sessions are backed up.
     *
     * Configures backups for streaming sessions launched with this launch profile. The default
     * value is `DEACTIVATED` , which means that backups are deactivated. To allow backups, set this
     * value to `AUTOMATIC` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamconfigurationsessionbackup.html#cfn-nimblestudio-launchprofile-streamconfigurationsessionbackup-mode)
     */
    public fun mode(): String? = unwrap(this).getMode()

    /**
     * A builder for [StreamConfigurationSessionBackupProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maxBackupsToRetain The maximum number of backups that each streaming session created
       * from this launch profile can have.
       */
      public fun maxBackupsToRetain(maxBackupsToRetain: Number)

      /**
       * @param mode Specifies how artists sessions are backed up.
       * Configures backups for streaming sessions launched with this launch profile. The default
       * value is `DEACTIVATED` , which means that backups are deactivated. To allow backups, set this
       * value to `AUTOMATIC` .
       */
      public fun mode(mode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamConfigurationSessionBackupProperty.Builder
          =
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamConfigurationSessionBackupProperty.builder()

      /**
       * @param maxBackupsToRetain The maximum number of backups that each streaming session created
       * from this launch profile can have.
       */
      override fun maxBackupsToRetain(maxBackupsToRetain: Number) {
        cdkBuilder.maxBackupsToRetain(maxBackupsToRetain)
      }

      /**
       * @param mode Specifies how artists sessions are backed up.
       * Configures backups for streaming sessions launched with this launch profile. The default
       * value is `DEACTIVATED` , which means that backups are deactivated. To allow backups, set this
       * value to `AUTOMATIC` .
       */
      override fun mode(mode: String) {
        cdkBuilder.mode(mode)
      }

      public fun build():
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamConfigurationSessionBackupProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamConfigurationSessionBackupProperty,
    ) : CdkObject(cdkObject), StreamConfigurationSessionBackupProperty {
      /**
       * The maximum number of backups that each streaming session created from this launch profile
       * can have.
       *
       * Default: - 0
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamconfigurationsessionbackup.html#cfn-nimblestudio-launchprofile-streamconfigurationsessionbackup-maxbackupstoretain)
       */
      override fun maxBackupsToRetain(): Number? = unwrap(this).getMaxBackupsToRetain()

      /**
       * Specifies how artists sessions are backed up.
       *
       * Configures backups for streaming sessions launched with this launch profile. The default
       * value is `DEACTIVATED` , which means that backups are deactivated. To allow backups, set this
       * value to `AUTOMATIC` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamconfigurationsessionbackup.html#cfn-nimblestudio-launchprofile-streamconfigurationsessionbackup-mode)
       */
      override fun mode(): String? = unwrap(this).getMode()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          StreamConfigurationSessionBackupProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamConfigurationSessionBackupProperty):
          StreamConfigurationSessionBackupProperty = CdkObjectWrappers.wrap(cdkObject) as?
          StreamConfigurationSessionBackupProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: StreamConfigurationSessionBackupProperty):
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamConfigurationSessionBackupProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamConfigurationSessionBackupProperty
    }
  }
}
