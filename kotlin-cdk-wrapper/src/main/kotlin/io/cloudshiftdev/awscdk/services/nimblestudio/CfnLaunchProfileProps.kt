@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.nimblestudio

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
 * Properties for defining a `CfnLaunchProfile`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.nimblestudio.*;
 * CfnLaunchProfileProps cfnLaunchProfileProps = CfnLaunchProfileProps.builder()
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
public interface CfnLaunchProfileProps {
  /**
   * A human-readable description of the launch profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * Unique identifiers for a collection of EC2 subnets.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-ec2subnetids)
   */
  public fun ec2SubnetIds(): List<String>

  /**
   * The version number of the protocol that is used by the launch profile.
   *
   * The only valid version is "2021-03-31".
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-launchprofileprotocolversions)
   */
  public fun launchProfileProtocolVersions(): List<String>

  /**
   * A friendly name for the launch profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-name)
   */
  public fun name(): String

  /**
   * A configuration for a streaming session.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-streamconfiguration)
   */
  public fun streamConfiguration(): Any

  /**
   * Unique identifiers for a collection of studio components that can be used with this launch
   * profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-studiocomponentids)
   */
  public fun studioComponentIds(): List<String>

  /**
   * The unique identifier for a studio resource.
   *
   * In Nimble Studio , all other resources are contained in a studio resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-studioid)
   */
  public fun studioId(): String

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A builder for [CfnLaunchProfileProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A human-readable description of the launch profile.
     */
    public fun description(description: String)

    /**
     * @param ec2SubnetIds Unique identifiers for a collection of EC2 subnets. 
     */
    public fun ec2SubnetIds(ec2SubnetIds: List<String>)

    /**
     * @param ec2SubnetIds Unique identifiers for a collection of EC2 subnets. 
     */
    public fun ec2SubnetIds(vararg ec2SubnetIds: String)

    /**
     * @param launchProfileProtocolVersions The version number of the protocol that is used by the
     * launch profile. 
     * The only valid version is "2021-03-31".
     */
    public fun launchProfileProtocolVersions(launchProfileProtocolVersions: List<String>)

    /**
     * @param launchProfileProtocolVersions The version number of the protocol that is used by the
     * launch profile. 
     * The only valid version is "2021-03-31".
     */
    public fun launchProfileProtocolVersions(vararg launchProfileProtocolVersions: String)

    /**
     * @param name A friendly name for the launch profile. 
     */
    public fun name(name: String)

    /**
     * @param streamConfiguration A configuration for a streaming session. 
     */
    public fun streamConfiguration(streamConfiguration: IResolvable)

    /**
     * @param streamConfiguration A configuration for a streaming session. 
     */
    public
        fun streamConfiguration(streamConfiguration: CfnLaunchProfile.StreamConfigurationProperty)

    /**
     * @param streamConfiguration A configuration for a streaming session. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1e89e2675aaf68f9e3ab063388960cfad7ee36672343e686bb07cbd5d83c5d40")
    public
        fun streamConfiguration(streamConfiguration: CfnLaunchProfile.StreamConfigurationProperty.Builder.() -> Unit)

    /**
     * @param studioComponentIds Unique identifiers for a collection of studio components that can
     * be used with this launch profile. 
     */
    public fun studioComponentIds(studioComponentIds: List<String>)

    /**
     * @param studioComponentIds Unique identifiers for a collection of studio components that can
     * be used with this launch profile. 
     */
    public fun studioComponentIds(vararg studioComponentIds: String)

    /**
     * @param studioId The unique identifier for a studio resource. 
     * In Nimble Studio , all other resources are contained in a studio resource.
     */
    public fun studioId(studioId: String)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.nimblestudio.CfnLaunchProfileProps.Builder =
        software.amazon.awscdk.services.nimblestudio.CfnLaunchProfileProps.builder()

    /**
     * @param description A human-readable description of the launch profile.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param ec2SubnetIds Unique identifiers for a collection of EC2 subnets. 
     */
    override fun ec2SubnetIds(ec2SubnetIds: List<String>) {
      cdkBuilder.ec2SubnetIds(ec2SubnetIds)
    }

    /**
     * @param ec2SubnetIds Unique identifiers for a collection of EC2 subnets. 
     */
    override fun ec2SubnetIds(vararg ec2SubnetIds: String): Unit =
        ec2SubnetIds(ec2SubnetIds.toList())

    /**
     * @param launchProfileProtocolVersions The version number of the protocol that is used by the
     * launch profile. 
     * The only valid version is "2021-03-31".
     */
    override fun launchProfileProtocolVersions(launchProfileProtocolVersions: List<String>) {
      cdkBuilder.launchProfileProtocolVersions(launchProfileProtocolVersions)
    }

    /**
     * @param launchProfileProtocolVersions The version number of the protocol that is used by the
     * launch profile. 
     * The only valid version is "2021-03-31".
     */
    override fun launchProfileProtocolVersions(vararg launchProfileProtocolVersions: String): Unit =
        launchProfileProtocolVersions(launchProfileProtocolVersions.toList())

    /**
     * @param name A friendly name for the launch profile. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param streamConfiguration A configuration for a streaming session. 
     */
    override fun streamConfiguration(streamConfiguration: IResolvable) {
      cdkBuilder.streamConfiguration(streamConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param streamConfiguration A configuration for a streaming session. 
     */
    override
        fun streamConfiguration(streamConfiguration: CfnLaunchProfile.StreamConfigurationProperty) {
      cdkBuilder.streamConfiguration(streamConfiguration.let(CfnLaunchProfile.StreamConfigurationProperty::unwrap))
    }

    /**
     * @param streamConfiguration A configuration for a streaming session. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1e89e2675aaf68f9e3ab063388960cfad7ee36672343e686bb07cbd5d83c5d40")
    override
        fun streamConfiguration(streamConfiguration: CfnLaunchProfile.StreamConfigurationProperty.Builder.() -> Unit):
        Unit =
        streamConfiguration(CfnLaunchProfile.StreamConfigurationProperty(streamConfiguration))

    /**
     * @param studioComponentIds Unique identifiers for a collection of studio components that can
     * be used with this launch profile. 
     */
    override fun studioComponentIds(studioComponentIds: List<String>) {
      cdkBuilder.studioComponentIds(studioComponentIds)
    }

    /**
     * @param studioComponentIds Unique identifiers for a collection of studio components that can
     * be used with this launch profile. 
     */
    override fun studioComponentIds(vararg studioComponentIds: String): Unit =
        studioComponentIds(studioComponentIds.toList())

    /**
     * @param studioId The unique identifier for a studio resource. 
     * In Nimble Studio , all other resources are contained in a studio resource.
     */
    override fun studioId(studioId: String) {
      cdkBuilder.studioId(studioId)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.nimblestudio.CfnLaunchProfileProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.nimblestudio.CfnLaunchProfileProps,
  ) : CdkObject(cdkObject), CfnLaunchProfileProps {
    /**
     * A human-readable description of the launch profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Unique identifiers for a collection of EC2 subnets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-ec2subnetids)
     */
    override fun ec2SubnetIds(): List<String> = unwrap(this).getEc2SubnetIds()

    /**
     * The version number of the protocol that is used by the launch profile.
     *
     * The only valid version is "2021-03-31".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-launchprofileprotocolversions)
     */
    override fun launchProfileProtocolVersions(): List<String> =
        unwrap(this).getLaunchProfileProtocolVersions()

    /**
     * A friendly name for the launch profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * A configuration for a streaming session.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-streamconfiguration)
     */
    override fun streamConfiguration(): Any = unwrap(this).getStreamConfiguration()

    /**
     * Unique identifiers for a collection of studio components that can be used with this launch
     * profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-studiocomponentids)
     */
    override fun studioComponentIds(): List<String> = unwrap(this).getStudioComponentIds()

    /**
     * The unique identifier for a studio resource.
     *
     * In Nimble Studio , all other resources are contained in a studio resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-studioid)
     */
    override fun studioId(): String = unwrap(this).getStudioId()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLaunchProfileProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.nimblestudio.CfnLaunchProfileProps):
        CfnLaunchProfileProps = CdkObjectWrappers.wrap(cdkObject) as CfnLaunchProfileProps

    internal fun unwrap(wrapped: CfnLaunchProfileProps):
        software.amazon.awscdk.services.nimblestudio.CfnLaunchProfileProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.nimblestudio.CfnLaunchProfileProps
  }
}
