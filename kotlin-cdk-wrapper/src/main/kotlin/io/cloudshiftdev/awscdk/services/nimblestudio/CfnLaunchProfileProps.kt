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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-ec2subnetids)
   */
  public fun ec2SubnetIds(): List<String>

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-launchprofileprotocolversions)
   */
  public fun launchProfileProtocolVersions(): List<String>

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-name)
   */
  public fun name(): String

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-streamconfiguration)
   */
  public fun streamConfiguration(): Any

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-studiocomponentids)
   */
  public fun studioComponentIds(): List<String>

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-studioid)
   */
  public fun studioId(): String

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A builder for [CfnLaunchProfileProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description the value to be set.
     */
    public fun description(description: String)

    /**
     * @param ec2SubnetIds the value to be set. 
     */
    public fun ec2SubnetIds(ec2SubnetIds: List<String>)

    /**
     * @param ec2SubnetIds the value to be set. 
     */
    public fun ec2SubnetIds(vararg ec2SubnetIds: String)

    /**
     * @param launchProfileProtocolVersions the value to be set. 
     */
    public fun launchProfileProtocolVersions(launchProfileProtocolVersions: List<String>)

    /**
     * @param launchProfileProtocolVersions the value to be set. 
     */
    public fun launchProfileProtocolVersions(vararg launchProfileProtocolVersions: String)

    /**
     * @param name the value to be set. 
     */
    public fun name(name: String)

    /**
     * @param streamConfiguration the value to be set. 
     */
    public fun streamConfiguration(streamConfiguration: IResolvable)

    /**
     * @param streamConfiguration the value to be set. 
     */
    public
        fun streamConfiguration(streamConfiguration: CfnLaunchProfile.StreamConfigurationProperty)

    /**
     * @param streamConfiguration the value to be set. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1e89e2675aaf68f9e3ab063388960cfad7ee36672343e686bb07cbd5d83c5d40")
    public
        fun streamConfiguration(streamConfiguration: CfnLaunchProfile.StreamConfigurationProperty.Builder.() -> Unit)

    /**
     * @param studioComponentIds the value to be set. 
     */
    public fun studioComponentIds(studioComponentIds: List<String>)

    /**
     * @param studioComponentIds the value to be set. 
     */
    public fun studioComponentIds(vararg studioComponentIds: String)

    /**
     * @param studioId the value to be set. 
     */
    public fun studioId(studioId: String)

    /**
     * @param tags the value to be set.
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.nimblestudio.CfnLaunchProfileProps.Builder =
        software.amazon.awscdk.services.nimblestudio.CfnLaunchProfileProps.builder()

    /**
     * @param description the value to be set.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param ec2SubnetIds the value to be set. 
     */
    override fun ec2SubnetIds(ec2SubnetIds: List<String>) {
      cdkBuilder.ec2SubnetIds(ec2SubnetIds)
    }

    /**
     * @param ec2SubnetIds the value to be set. 
     */
    override fun ec2SubnetIds(vararg ec2SubnetIds: String): Unit =
        ec2SubnetIds(ec2SubnetIds.toList())

    /**
     * @param launchProfileProtocolVersions the value to be set. 
     */
    override fun launchProfileProtocolVersions(launchProfileProtocolVersions: List<String>) {
      cdkBuilder.launchProfileProtocolVersions(launchProfileProtocolVersions)
    }

    /**
     * @param launchProfileProtocolVersions the value to be set. 
     */
    override fun launchProfileProtocolVersions(vararg launchProfileProtocolVersions: String): Unit =
        launchProfileProtocolVersions(launchProfileProtocolVersions.toList())

    /**
     * @param name the value to be set. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param streamConfiguration the value to be set. 
     */
    override fun streamConfiguration(streamConfiguration: IResolvable) {
      cdkBuilder.streamConfiguration(streamConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param streamConfiguration the value to be set. 
     */
    override
        fun streamConfiguration(streamConfiguration: CfnLaunchProfile.StreamConfigurationProperty) {
      cdkBuilder.streamConfiguration(streamConfiguration.let(CfnLaunchProfile.StreamConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param streamConfiguration the value to be set. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1e89e2675aaf68f9e3ab063388960cfad7ee36672343e686bb07cbd5d83c5d40")
    override
        fun streamConfiguration(streamConfiguration: CfnLaunchProfile.StreamConfigurationProperty.Builder.() -> Unit):
        Unit =
        streamConfiguration(CfnLaunchProfile.StreamConfigurationProperty(streamConfiguration))

    /**
     * @param studioComponentIds the value to be set. 
     */
    override fun studioComponentIds(studioComponentIds: List<String>) {
      cdkBuilder.studioComponentIds(studioComponentIds)
    }

    /**
     * @param studioComponentIds the value to be set. 
     */
    override fun studioComponentIds(vararg studioComponentIds: String): Unit =
        studioComponentIds(studioComponentIds.toList())

    /**
     * @param studioId the value to be set. 
     */
    override fun studioId(studioId: String) {
      cdkBuilder.studioId(studioId)
    }

    /**
     * @param tags the value to be set.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.nimblestudio.CfnLaunchProfileProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.nimblestudio.CfnLaunchProfileProps,
  ) : CdkObject(cdkObject),
      CfnLaunchProfileProps {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-ec2subnetids)
     */
    override fun ec2SubnetIds(): List<String> = unwrap(this).getEc2SubnetIds()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-launchprofileprotocolversions)
     */
    override fun launchProfileProtocolVersions(): List<String> =
        unwrap(this).getLaunchProfileProtocolVersions()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-streamconfiguration)
     */
    override fun streamConfiguration(): Any = unwrap(this).getStreamConfiguration()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-studiocomponentids)
     */
    override fun studioComponentIds(): List<String> = unwrap(this).getStudioComponentIds()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-studioid)
     */
    override fun studioId(): String = unwrap(this).getStudioId()

    /**
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
        CfnLaunchProfileProps = CdkObjectWrappers.wrap(cdkObject) as? CfnLaunchProfileProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLaunchProfileProps):
        software.amazon.awscdk.services.nimblestudio.CfnLaunchProfileProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.nimblestudio.CfnLaunchProfileProps
  }
}
