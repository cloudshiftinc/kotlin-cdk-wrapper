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
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html.
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
public open class CfnLaunchProfile(
  cdkObject: software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnLaunchProfileProps,
  ) :
      this(software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnLaunchProfileProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnLaunchProfileProps.Builder.() -> Unit,
  ) : this(scope, id, CfnLaunchProfileProps(props)
  )

  /**
   *
   */
  public open fun attrLaunchProfileId(): String = unwrap(this).getAttrLaunchProfileId()

  /**
   *
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   *
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   *
   */
  public open fun ec2SubnetIds(): List<String> = unwrap(this).getEc2SubnetIds()

  /**
   *
   */
  public open fun ec2SubnetIds(`value`: List<String>) {
    unwrap(this).setEc2SubnetIds(`value`)
  }

  /**
   *
   */
  public open fun ec2SubnetIds(vararg `value`: String): Unit = ec2SubnetIds(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   *
   */
  public open fun launchProfileProtocolVersions(): List<String> =
      unwrap(this).getLaunchProfileProtocolVersions()

  /**
   *
   */
  public open fun launchProfileProtocolVersions(`value`: List<String>) {
    unwrap(this).setLaunchProfileProtocolVersions(`value`)
  }

  /**
   *
   */
  public open fun launchProfileProtocolVersions(vararg `value`: String): Unit =
      launchProfileProtocolVersions(`value`.toList())

  /**
   *
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   *
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   *
   */
  public open fun streamConfiguration(): Any = unwrap(this).getStreamConfiguration()

  /**
   *
   */
  public open fun streamConfiguration(`value`: IResolvable) {
    unwrap(this).setStreamConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   *
   */
  public open fun streamConfiguration(`value`: StreamConfigurationProperty) {
    unwrap(this).setStreamConfiguration(`value`.let(StreamConfigurationProperty.Companion::unwrap))
  }

  /**
   *
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f283d6cd17a9b024cb69645d2866d3e444cfc421682064b274a8879a890dadb4")
  public open fun streamConfiguration(`value`: StreamConfigurationProperty.Builder.() -> Unit): Unit
      = streamConfiguration(StreamConfigurationProperty(`value`))

  /**
   *
   */
  public open fun studioComponentIds(): List<String> = unwrap(this).getStudioComponentIds()

  /**
   *
   */
  public open fun studioComponentIds(`value`: List<String>) {
    unwrap(this).setStudioComponentIds(`value`)
  }

  /**
   *
   */
  public open fun studioComponentIds(vararg `value`: String): Unit =
      studioComponentIds(`value`.toList())

  /**
   *
   */
  public open fun studioId(): String = unwrap(this).getStudioId()

  /**
   *
   */
  public open fun studioId(`value`: String) {
    unwrap(this).setStudioId(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   *
   */
  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  /**
   *
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-description)
     * @param description 
     */
    public fun description(description: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-ec2subnetids)
     * @param ec2SubnetIds 
     */
    public fun ec2SubnetIds(ec2SubnetIds: List<String>)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-ec2subnetids)
     * @param ec2SubnetIds 
     */
    public fun ec2SubnetIds(vararg ec2SubnetIds: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-launchprofileprotocolversions)
     * @param launchProfileProtocolVersions 
     */
    public fun launchProfileProtocolVersions(launchProfileProtocolVersions: List<String>)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-launchprofileprotocolversions)
     * @param launchProfileProtocolVersions 
     */
    public fun launchProfileProtocolVersions(vararg launchProfileProtocolVersions: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-name)
     * @param name 
     */
    public fun name(name: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-streamconfiguration)
     * @param streamConfiguration 
     */
    public fun streamConfiguration(streamConfiguration: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-streamconfiguration)
     * @param streamConfiguration 
     */
    public fun streamConfiguration(streamConfiguration: StreamConfigurationProperty)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-streamconfiguration)
     * @param streamConfiguration 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b3698d518770f3d74705b416bc81e2434819c2c071182060cb23be9cccdc6f03")
    public
        fun streamConfiguration(streamConfiguration: StreamConfigurationProperty.Builder.() -> Unit)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-studiocomponentids)
     * @param studioComponentIds 
     */
    public fun studioComponentIds(studioComponentIds: List<String>)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-studiocomponentids)
     * @param studioComponentIds 
     */
    public fun studioComponentIds(vararg studioComponentIds: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-studioid)
     * @param studioId 
     */
    public fun studioId(studioId: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-tags)
     * @param tags 
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-description)
     * @param description 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-ec2subnetids)
     * @param ec2SubnetIds 
     */
    override fun ec2SubnetIds(ec2SubnetIds: List<String>) {
      cdkBuilder.ec2SubnetIds(ec2SubnetIds)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-ec2subnetids)
     * @param ec2SubnetIds 
     */
    override fun ec2SubnetIds(vararg ec2SubnetIds: String): Unit =
        ec2SubnetIds(ec2SubnetIds.toList())

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-launchprofileprotocolversions)
     * @param launchProfileProtocolVersions 
     */
    override fun launchProfileProtocolVersions(launchProfileProtocolVersions: List<String>) {
      cdkBuilder.launchProfileProtocolVersions(launchProfileProtocolVersions)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-launchprofileprotocolversions)
     * @param launchProfileProtocolVersions 
     */
    override fun launchProfileProtocolVersions(vararg launchProfileProtocolVersions: String): Unit =
        launchProfileProtocolVersions(launchProfileProtocolVersions.toList())

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-name)
     * @param name 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-streamconfiguration)
     * @param streamConfiguration 
     */
    override fun streamConfiguration(streamConfiguration: IResolvable) {
      cdkBuilder.streamConfiguration(streamConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-streamconfiguration)
     * @param streamConfiguration 
     */
    override fun streamConfiguration(streamConfiguration: StreamConfigurationProperty) {
      cdkBuilder.streamConfiguration(streamConfiguration.let(StreamConfigurationProperty.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-streamconfiguration)
     * @param streamConfiguration 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b3698d518770f3d74705b416bc81e2434819c2c071182060cb23be9cccdc6f03")
    override
        fun streamConfiguration(streamConfiguration: StreamConfigurationProperty.Builder.() -> Unit):
        Unit = streamConfiguration(StreamConfigurationProperty(streamConfiguration))

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-studiocomponentids)
     * @param studioComponentIds 
     */
    override fun studioComponentIds(studioComponentIds: List<String>) {
      cdkBuilder.studioComponentIds(studioComponentIds)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-studiocomponentids)
     * @param studioComponentIds 
     */
    override fun studioComponentIds(vararg studioComponentIds: String): Unit =
        studioComponentIds(studioComponentIds.toList())

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-studioid)
     * @param studioId 
     */
    override fun studioId(studioId: String) {
      cdkBuilder.studioId(studioId)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html#cfn-nimblestudio-launchprofile-tags)
     * @param tags 
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
        software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile = wrapped.cdkObject as
        software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile
  }

  /**
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamconfiguration.html#cfn-nimblestudio-launchprofile-streamconfiguration-automaticterminationmode)
     */
    public fun automaticTerminationMode(): String? = unwrap(this).getAutomaticTerminationMode()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamconfiguration.html#cfn-nimblestudio-launchprofile-streamconfiguration-clipboardmode)
     */
    public fun clipboardMode(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamconfiguration.html#cfn-nimblestudio-launchprofile-streamconfiguration-ec2instancetypes)
     */
    public fun ec2InstanceTypes(): List<String>

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamconfiguration.html#cfn-nimblestudio-launchprofile-streamconfiguration-maxsessionlengthinminutes)
     */
    public fun maxSessionLengthInMinutes(): Number? = unwrap(this).getMaxSessionLengthInMinutes()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamconfiguration.html#cfn-nimblestudio-launchprofile-streamconfiguration-maxstoppedsessionlengthinminutes)
     */
    public fun maxStoppedSessionLengthInMinutes(): Number? =
        unwrap(this).getMaxStoppedSessionLengthInMinutes()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamconfiguration.html#cfn-nimblestudio-launchprofile-streamconfiguration-sessionbackup)
     */
    public fun sessionBackup(): Any? = unwrap(this).getSessionBackup()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamconfiguration.html#cfn-nimblestudio-launchprofile-streamconfiguration-sessionpersistencemode)
     */
    public fun sessionPersistenceMode(): String? = unwrap(this).getSessionPersistenceMode()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamconfiguration.html#cfn-nimblestudio-launchprofile-streamconfiguration-sessionstorage)
     */
    public fun sessionStorage(): Any? = unwrap(this).getSessionStorage()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamconfiguration.html#cfn-nimblestudio-launchprofile-streamconfiguration-streamingimageids)
     */
    public fun streamingImageIds(): List<String>

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamconfiguration.html#cfn-nimblestudio-launchprofile-streamconfiguration-volumeconfiguration)
     */
    public fun volumeConfiguration(): Any? = unwrap(this).getVolumeConfiguration()

    /**
     * A builder for [StreamConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param automaticTerminationMode the value to be set.
       */
      public fun automaticTerminationMode(automaticTerminationMode: String)

      /**
       * @param clipboardMode the value to be set. 
       */
      public fun clipboardMode(clipboardMode: String)

      /**
       * @param ec2InstanceTypes the value to be set. 
       */
      public fun ec2InstanceTypes(ec2InstanceTypes: List<String>)

      /**
       * @param ec2InstanceTypes the value to be set. 
       */
      public fun ec2InstanceTypes(vararg ec2InstanceTypes: String)

      /**
       * @param maxSessionLengthInMinutes the value to be set.
       */
      public fun maxSessionLengthInMinutes(maxSessionLengthInMinutes: Number)

      /**
       * @param maxStoppedSessionLengthInMinutes the value to be set.
       */
      public fun maxStoppedSessionLengthInMinutes(maxStoppedSessionLengthInMinutes: Number)

      /**
       * @param sessionBackup the value to be set.
       */
      public fun sessionBackup(sessionBackup: IResolvable)

      /**
       * @param sessionBackup the value to be set.
       */
      public fun sessionBackup(sessionBackup: StreamConfigurationSessionBackupProperty)

      /**
       * @param sessionBackup the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9ddc4c021317db72cacf355d33a0c36a14aca572e2f04692d19d4565d4472214")
      public
          fun sessionBackup(sessionBackup: StreamConfigurationSessionBackupProperty.Builder.() -> Unit)

      /**
       * @param sessionPersistenceMode the value to be set.
       */
      public fun sessionPersistenceMode(sessionPersistenceMode: String)

      /**
       * @param sessionStorage the value to be set.
       */
      public fun sessionStorage(sessionStorage: IResolvable)

      /**
       * @param sessionStorage the value to be set.
       */
      public fun sessionStorage(sessionStorage: StreamConfigurationSessionStorageProperty)

      /**
       * @param sessionStorage the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cf2fcfb08f02da9561ce6289f8628c8d85bbd7c1be0d4d3ea22f5b6921890323")
      public
          fun sessionStorage(sessionStorage: StreamConfigurationSessionStorageProperty.Builder.() -> Unit)

      /**
       * @param streamingImageIds the value to be set. 
       */
      public fun streamingImageIds(streamingImageIds: List<String>)

      /**
       * @param streamingImageIds the value to be set. 
       */
      public fun streamingImageIds(vararg streamingImageIds: String)

      /**
       * @param volumeConfiguration the value to be set.
       */
      public fun volumeConfiguration(volumeConfiguration: IResolvable)

      /**
       * @param volumeConfiguration the value to be set.
       */
      public fun volumeConfiguration(volumeConfiguration: VolumeConfigurationProperty)

      /**
       * @param volumeConfiguration the value to be set.
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
       * @param automaticTerminationMode the value to be set.
       */
      override fun automaticTerminationMode(automaticTerminationMode: String) {
        cdkBuilder.automaticTerminationMode(automaticTerminationMode)
      }

      /**
       * @param clipboardMode the value to be set. 
       */
      override fun clipboardMode(clipboardMode: String) {
        cdkBuilder.clipboardMode(clipboardMode)
      }

      /**
       * @param ec2InstanceTypes the value to be set. 
       */
      override fun ec2InstanceTypes(ec2InstanceTypes: List<String>) {
        cdkBuilder.ec2InstanceTypes(ec2InstanceTypes)
      }

      /**
       * @param ec2InstanceTypes the value to be set. 
       */
      override fun ec2InstanceTypes(vararg ec2InstanceTypes: String): Unit =
          ec2InstanceTypes(ec2InstanceTypes.toList())

      /**
       * @param maxSessionLengthInMinutes the value to be set.
       */
      override fun maxSessionLengthInMinutes(maxSessionLengthInMinutes: Number) {
        cdkBuilder.maxSessionLengthInMinutes(maxSessionLengthInMinutes)
      }

      /**
       * @param maxStoppedSessionLengthInMinutes the value to be set.
       */
      override fun maxStoppedSessionLengthInMinutes(maxStoppedSessionLengthInMinutes: Number) {
        cdkBuilder.maxStoppedSessionLengthInMinutes(maxStoppedSessionLengthInMinutes)
      }

      /**
       * @param sessionBackup the value to be set.
       */
      override fun sessionBackup(sessionBackup: IResolvable) {
        cdkBuilder.sessionBackup(sessionBackup.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param sessionBackup the value to be set.
       */
      override fun sessionBackup(sessionBackup: StreamConfigurationSessionBackupProperty) {
        cdkBuilder.sessionBackup(sessionBackup.let(StreamConfigurationSessionBackupProperty.Companion::unwrap))
      }

      /**
       * @param sessionBackup the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9ddc4c021317db72cacf355d33a0c36a14aca572e2f04692d19d4565d4472214")
      override
          fun sessionBackup(sessionBackup: StreamConfigurationSessionBackupProperty.Builder.() -> Unit):
          Unit = sessionBackup(StreamConfigurationSessionBackupProperty(sessionBackup))

      /**
       * @param sessionPersistenceMode the value to be set.
       */
      override fun sessionPersistenceMode(sessionPersistenceMode: String) {
        cdkBuilder.sessionPersistenceMode(sessionPersistenceMode)
      }

      /**
       * @param sessionStorage the value to be set.
       */
      override fun sessionStorage(sessionStorage: IResolvable) {
        cdkBuilder.sessionStorage(sessionStorage.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param sessionStorage the value to be set.
       */
      override fun sessionStorage(sessionStorage: StreamConfigurationSessionStorageProperty) {
        cdkBuilder.sessionStorage(sessionStorage.let(StreamConfigurationSessionStorageProperty.Companion::unwrap))
      }

      /**
       * @param sessionStorage the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cf2fcfb08f02da9561ce6289f8628c8d85bbd7c1be0d4d3ea22f5b6921890323")
      override
          fun sessionStorage(sessionStorage: StreamConfigurationSessionStorageProperty.Builder.() -> Unit):
          Unit = sessionStorage(StreamConfigurationSessionStorageProperty(sessionStorage))

      /**
       * @param streamingImageIds the value to be set. 
       */
      override fun streamingImageIds(streamingImageIds: List<String>) {
        cdkBuilder.streamingImageIds(streamingImageIds)
      }

      /**
       * @param streamingImageIds the value to be set. 
       */
      override fun streamingImageIds(vararg streamingImageIds: String): Unit =
          streamingImageIds(streamingImageIds.toList())

      /**
       * @param volumeConfiguration the value to be set.
       */
      override fun volumeConfiguration(volumeConfiguration: IResolvable) {
        cdkBuilder.volumeConfiguration(volumeConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param volumeConfiguration the value to be set.
       */
      override fun volumeConfiguration(volumeConfiguration: VolumeConfigurationProperty) {
        cdkBuilder.volumeConfiguration(volumeConfiguration.let(VolumeConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param volumeConfiguration the value to be set.
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
      cdkObject: software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamConfigurationProperty,
    ) : CdkObject(cdkObject),
        StreamConfigurationProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamconfiguration.html#cfn-nimblestudio-launchprofile-streamconfiguration-automaticterminationmode)
       */
      override fun automaticTerminationMode(): String? = unwrap(this).getAutomaticTerminationMode()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamconfiguration.html#cfn-nimblestudio-launchprofile-streamconfiguration-clipboardmode)
       */
      override fun clipboardMode(): String = unwrap(this).getClipboardMode()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamconfiguration.html#cfn-nimblestudio-launchprofile-streamconfiguration-ec2instancetypes)
       */
      override fun ec2InstanceTypes(): List<String> = unwrap(this).getEc2InstanceTypes()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamconfiguration.html#cfn-nimblestudio-launchprofile-streamconfiguration-maxsessionlengthinminutes)
       */
      override fun maxSessionLengthInMinutes(): Number? =
          unwrap(this).getMaxSessionLengthInMinutes()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamconfiguration.html#cfn-nimblestudio-launchprofile-streamconfiguration-maxstoppedsessionlengthinminutes)
       */
      override fun maxStoppedSessionLengthInMinutes(): Number? =
          unwrap(this).getMaxStoppedSessionLengthInMinutes()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamconfiguration.html#cfn-nimblestudio-launchprofile-streamconfiguration-sessionbackup)
       */
      override fun sessionBackup(): Any? = unwrap(this).getSessionBackup()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamconfiguration.html#cfn-nimblestudio-launchprofile-streamconfiguration-sessionpersistencemode)
       */
      override fun sessionPersistenceMode(): String? = unwrap(this).getSessionPersistenceMode()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamconfiguration.html#cfn-nimblestudio-launchprofile-streamconfiguration-sessionstorage)
       */
      override fun sessionStorage(): Any? = unwrap(this).getSessionStorage()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamconfiguration.html#cfn-nimblestudio-launchprofile-streamconfiguration-streamingimageids)
       */
      override fun streamingImageIds(): List<String> = unwrap(this).getStreamingImageIds()

      /**
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamconfigurationsessionbackup.html#cfn-nimblestudio-launchprofile-streamconfigurationsessionbackup-maxbackupstoretain)
     */
    public fun maxBackupsToRetain(): Number? = unwrap(this).getMaxBackupsToRetain()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamconfigurationsessionbackup.html#cfn-nimblestudio-launchprofile-streamconfigurationsessionbackup-mode)
     */
    public fun mode(): String? = unwrap(this).getMode()

    /**
     * A builder for [StreamConfigurationSessionBackupProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maxBackupsToRetain the value to be set.
       */
      public fun maxBackupsToRetain(maxBackupsToRetain: Number)

      /**
       * @param mode the value to be set.
       */
      public fun mode(mode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamConfigurationSessionBackupProperty.Builder
          =
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamConfigurationSessionBackupProperty.builder()

      /**
       * @param maxBackupsToRetain the value to be set.
       */
      override fun maxBackupsToRetain(maxBackupsToRetain: Number) {
        cdkBuilder.maxBackupsToRetain(maxBackupsToRetain)
      }

      /**
       * @param mode the value to be set.
       */
      override fun mode(mode: String) {
        cdkBuilder.mode(mode)
      }

      public fun build():
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamConfigurationSessionBackupProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamConfigurationSessionBackupProperty,
    ) : CdkObject(cdkObject),
        StreamConfigurationSessionBackupProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamconfigurationsessionbackup.html#cfn-nimblestudio-launchprofile-streamconfigurationsessionbackup-maxbackupstoretain)
       */
      override fun maxBackupsToRetain(): Number? = unwrap(this).getMaxBackupsToRetain()

      /**
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

  /**
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamconfigurationsessionstorage.html#cfn-nimblestudio-launchprofile-streamconfigurationsessionstorage-mode)
     */
    public fun mode(): List<String>

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamconfigurationsessionstorage.html#cfn-nimblestudio-launchprofile-streamconfigurationsessionstorage-root)
     */
    public fun root(): Any? = unwrap(this).getRoot()

    /**
     * A builder for [StreamConfigurationSessionStorageProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param mode the value to be set. 
       */
      public fun mode(mode: List<String>)

      /**
       * @param mode the value to be set. 
       */
      public fun mode(vararg mode: String)

      /**
       * @param root the value to be set.
       */
      public fun root(root: IResolvable)

      /**
       * @param root the value to be set.
       */
      public fun root(root: StreamingSessionStorageRootProperty)

      /**
       * @param root the value to be set.
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
       * @param mode the value to be set. 
       */
      override fun mode(mode: List<String>) {
        cdkBuilder.mode(mode)
      }

      /**
       * @param mode the value to be set. 
       */
      override fun mode(vararg mode: String): Unit = mode(mode.toList())

      /**
       * @param root the value to be set.
       */
      override fun root(root: IResolvable) {
        cdkBuilder.root(root.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param root the value to be set.
       */
      override fun root(root: StreamingSessionStorageRootProperty) {
        cdkBuilder.root(root.let(StreamingSessionStorageRootProperty.Companion::unwrap))
      }

      /**
       * @param root the value to be set.
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
      cdkObject: software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamConfigurationSessionStorageProperty,
    ) : CdkObject(cdkObject),
        StreamConfigurationSessionStorageProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamconfigurationsessionstorage.html#cfn-nimblestudio-launchprofile-streamconfigurationsessionstorage-mode)
       */
      override fun mode(): List<String> = unwrap(this).getMode()

      /**
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamingsessionstorageroot.html#cfn-nimblestudio-launchprofile-streamingsessionstorageroot-linux)
     */
    public fun linux(): String? = unwrap(this).getLinux()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamingsessionstorageroot.html#cfn-nimblestudio-launchprofile-streamingsessionstorageroot-windows)
     */
    public fun windows(): String? = unwrap(this).getWindows()

    /**
     * A builder for [StreamingSessionStorageRootProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param linux the value to be set.
       */
      public fun linux(linux: String)

      /**
       * @param windows the value to be set.
       */
      public fun windows(windows: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamingSessionStorageRootProperty.Builder
          =
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamingSessionStorageRootProperty.builder()

      /**
       * @param linux the value to be set.
       */
      override fun linux(linux: String) {
        cdkBuilder.linux(linux)
      }

      /**
       * @param windows the value to be set.
       */
      override fun windows(windows: String) {
        cdkBuilder.windows(windows)
      }

      public fun build():
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamingSessionStorageRootProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamingSessionStorageRootProperty,
    ) : CdkObject(cdkObject),
        StreamingSessionStorageRootProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamingsessionstorageroot.html#cfn-nimblestudio-launchprofile-streamingsessionstorageroot-linux)
       */
      override fun linux(): String? = unwrap(this).getLinux()

      /**
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-volumeconfiguration.html#cfn-nimblestudio-launchprofile-volumeconfiguration-iops)
     */
    public fun iops(): Number? = unwrap(this).getIops()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-volumeconfiguration.html#cfn-nimblestudio-launchprofile-volumeconfiguration-size)
     */
    public fun size(): Number? = unwrap(this).getSize()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-volumeconfiguration.html#cfn-nimblestudio-launchprofile-volumeconfiguration-throughput)
     */
    public fun throughput(): Number? = unwrap(this).getThroughput()

    /**
     * A builder for [VolumeConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param iops the value to be set.
       */
      public fun iops(iops: Number)

      /**
       * @param size the value to be set.
       */
      public fun size(size: Number)

      /**
       * @param throughput the value to be set.
       */
      public fun throughput(throughput: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.VolumeConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.VolumeConfigurationProperty.builder()

      /**
       * @param iops the value to be set.
       */
      override fun iops(iops: Number) {
        cdkBuilder.iops(iops)
      }

      /**
       * @param size the value to be set.
       */
      override fun size(size: Number) {
        cdkBuilder.size(size)
      }

      /**
       * @param throughput the value to be set.
       */
      override fun throughput(throughput: Number) {
        cdkBuilder.throughput(throughput)
      }

      public fun build():
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.VolumeConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.VolumeConfigurationProperty,
    ) : CdkObject(cdkObject),
        VolumeConfigurationProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-volumeconfiguration.html#cfn-nimblestudio-launchprofile-volumeconfiguration-iops)
       */
      override fun iops(): Number? = unwrap(this).getIops()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-volumeconfiguration.html#cfn-nimblestudio-launchprofile-volumeconfiguration-size)
       */
      override fun size(): Number? = unwrap(this).getSize()

      /**
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
}
