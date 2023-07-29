@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.nimblestudio

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile
import software.amazon.awscdk.services.nimblestudio.CfnLaunchProfileProps
import software.amazon.awscdk.services.nimblestudio.CfnStreamingImage
import software.amazon.awscdk.services.nimblestudio.CfnStreamingImageProps
import software.amazon.awscdk.services.nimblestudio.CfnStudio
import software.amazon.awscdk.services.nimblestudio.CfnStudioComponent
import software.amazon.awscdk.services.nimblestudio.CfnStudioComponentProps
import software.amazon.awscdk.services.nimblestudio.CfnStudioProps
import software.constructs.Construct

public object nimblestudio {
    /**
     * The `AWS::NimbleStudio::LaunchProfile` resource represents access permissions for a set of
     * studio components, including types of workstations, render farms, and shared file systems.
     *
     * Launch profiles are shared with studio users to give them access to the set of studio
     * components.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.nimblestudio.*;
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
    public inline fun cfnLaunchProfile(
        scope: Construct,
        id: String,
        block: CfnLaunchProfileDsl.() -> Unit = {},
    ): CfnLaunchProfile {
        val builder = CfnLaunchProfileDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnLaunchProfile`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.nimblestudio.*;
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
    public inline fun cfnLaunchProfileProps(
        block: CfnLaunchProfilePropsDsl.() -> Unit = {}
    ): CfnLaunchProfileProps {
        val builder = CfnLaunchProfilePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A configuration for a streaming session.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.nimblestudio.*;
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
    public inline fun cfnLaunchProfileStreamConfigurationProperty(
        block: CfnLaunchProfileStreamConfigurationPropertyDsl.() -> Unit = {}
    ): CfnLaunchProfile.StreamConfigurationProperty {
        val builder = CfnLaunchProfileStreamConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configures how streaming sessions are backed up when launched from this launch profile.</p>.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.nimblestudio.*;
     * StreamConfigurationSessionBackupProperty streamConfigurationSessionBackupProperty =
     * StreamConfigurationSessionBackupProperty.builder()
     * .maxBackupsToRetain(123)
     * .mode("mode")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamconfigurationsessionbackup.html)
     */
    public inline fun cfnLaunchProfileStreamConfigurationSessionBackupProperty(
        block: CfnLaunchProfileStreamConfigurationSessionBackupPropertyDsl.() -> Unit = {}
    ): CfnLaunchProfile.StreamConfigurationSessionBackupProperty {
        val builder = CfnLaunchProfileStreamConfigurationSessionBackupPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration for a streaming session’s upload storage.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.nimblestudio.*;
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
    public inline fun cfnLaunchProfileStreamConfigurationSessionStorageProperty(
        block: CfnLaunchProfileStreamConfigurationSessionStoragePropertyDsl.() -> Unit = {}
    ): CfnLaunchProfile.StreamConfigurationSessionStorageProperty {
        val builder = CfnLaunchProfileStreamConfigurationSessionStoragePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The upload storage root location (folder) on streaming workstations where files are uploaded.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.nimblestudio.*;
     * StreamingSessionStorageRootProperty streamingSessionStorageRootProperty =
     * StreamingSessionStorageRootProperty.builder()
     * .linux("linux")
     * .windows("windows")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamingsessionstorageroot.html)
     */
    public inline fun cfnLaunchProfileStreamingSessionStorageRootProperty(
        block: CfnLaunchProfileStreamingSessionStorageRootPropertyDsl.() -> Unit = {}
    ): CfnLaunchProfile.StreamingSessionStorageRootProperty {
        val builder = CfnLaunchProfileStreamingSessionStorageRootPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Custom volume configuration for the root volumes that are attached to streaming sessions.</p>
     * This parameter is only allowed when `sessionPersistenceMode` is `ACTIVATED`.</p>.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.nimblestudio.*;
     * VolumeConfigurationProperty volumeConfigurationProperty = VolumeConfigurationProperty.builder()
     * .iops(123)
     * .size(123)
     * .throughput(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-volumeconfiguration.html)
     */
    public inline fun cfnLaunchProfileVolumeConfigurationProperty(
        block: CfnLaunchProfileVolumeConfigurationPropertyDsl.() -> Unit = {}
    ): CfnLaunchProfile.VolumeConfigurationProperty {
        val builder = CfnLaunchProfileVolumeConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::NimbleStudio::StreamingImage` resource creates a streaming image in a studio.
     *
     * A streaming image defines the operating system and software to be used in an streaming
     * session.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.nimblestudio.*;
     * CfnStreamingImage cfnStreamingImage = CfnStreamingImage.Builder.create(this,
     * "MyCfnStreamingImage")
     * .ec2ImageId("ec2ImageId")
     * .name("name")
     * .studioId("studioId")
     * // the properties below are optional
     * .description("description")
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-streamingimage.html)
     */
    public inline fun cfnStreamingImage(
        scope: Construct,
        id: String,
        block: CfnStreamingImageDsl.() -> Unit = {},
    ): CfnStreamingImage {
        val builder = CfnStreamingImageDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnStreamingImage`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.nimblestudio.*;
     * CfnStreamingImageProps cfnStreamingImageProps = CfnStreamingImageProps.builder()
     * .ec2ImageId("ec2ImageId")
     * .name("name")
     * .studioId("studioId")
     * // the properties below are optional
     * .description("description")
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-streamingimage.html)
     */
    public inline fun cfnStreamingImageProps(
        block: CfnStreamingImagePropsDsl.() -> Unit = {}
    ): CfnStreamingImageProps {
        val builder = CfnStreamingImagePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * TODO</p>.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.nimblestudio.*;
     * StreamingImageEncryptionConfigurationProperty streamingImageEncryptionConfigurationProperty =
     * StreamingImageEncryptionConfigurationProperty.builder()
     * .keyType("keyType")
     * // the properties below are optional
     * .keyArn("keyArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-streamingimage-streamingimageencryptionconfiguration.html)
     */
    public inline fun cfnStreamingImageStreamingImageEncryptionConfigurationProperty(
        block: CfnStreamingImageStreamingImageEncryptionConfigurationPropertyDsl.() -> Unit = {}
    ): CfnStreamingImage.StreamingImageEncryptionConfigurationProperty {
        val builder = CfnStreamingImageStreamingImageEncryptionConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::NimbleStudio::Studio` resource creates a new studio resource. In , all other
     * resources are contained in a studio.
     *
     * When creating a studio, two IAM roles must be provided: the admin role and the user role.
     * These roles are assumed by your users when they log in to the portal. The user role must have
     * the AmazonNimbleStudio-StudioUser managed policy attached for the portal to function
     * properly. The Admin Role must have the AmazonNimbleStudio-StudioAdmin managed policy attached
     * for the portal to function properly.
     *
     * You can optionally specify an AWS Key Management Service key in the
     * StudioEncryptionConfiguration. In Nimble Studio, resource names, descriptions, initialization
     * scripts, and other data you provide are always encrypted at rest using an AWS Key Management
     * Service key. By default, this key is owned by AWS and managed on your behalf. You may provide
     * your own AWS Key Management Service key when calling CreateStudio to encrypt this data using
     * a key that you own and manage. When providing an AWS Key Management Service key during studio
     * creation, creates AWS Key Management Service grants in your account to provide your studio
     * user and admin roles access to these AWS Key Management Service keys. If you delete this
     * grant, the studio will no longer be accessible to your portal users. If you delete the studio
     * AWS Key Management Service key, your studio will no longer be accessible.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.nimblestudio.*;
     * CfnStudio cfnStudio = CfnStudio.Builder.create(this, "MyCfnStudio")
     * .adminRoleArn("adminRoleArn")
     * .displayName("displayName")
     * .studioName("studioName")
     * .userRoleArn("userRoleArn")
     * // the properties below are optional
     * .studioEncryptionConfiguration(StudioEncryptionConfigurationProperty.builder()
     * .keyType("keyType")
     * // the properties below are optional
     * .keyArn("keyArn")
     * .build())
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studio.html)
     */
    public inline fun cfnStudio(
        scope: Construct,
        id: String,
        block: CfnStudioDsl.() -> Unit = {},
    ): CfnStudio {
        val builder = CfnStudioDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::NimbleStudio::StudioComponent` resource represents a network resource that is used
     * by a studio's users and workflows.
     *
     * A typical studio contains studio components for the following: a render farm, an Active
     * Directory, a licensing service, and a shared file system.
     *
     * Access to a studio component is managed by specifying security groups for the resource, as
     * well as its endpoint.
     *
     * A studio component also has a set of initialization scripts, which are returned by
     * `GetLaunchProfileInitialization` . These initialization scripts run on streaming sessions
     * when they start. They provide users with flexibility in controlling how studio resources are
     * configured on a streaming session.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.nimblestudio.*;
     * CfnStudioComponent cfnStudioComponent = CfnStudioComponent.Builder.create(this,
     * "MyCfnStudioComponent")
     * .name("name")
     * .studioId("studioId")
     * .type("type")
     * // the properties below are optional
     * .configuration(StudioComponentConfigurationProperty.builder()
     * .activeDirectoryConfiguration(ActiveDirectoryConfigurationProperty.builder()
     * .computerAttributes(List.of(ActiveDirectoryComputerAttributeProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .directoryId("directoryId")
     * .organizationalUnitDistinguishedName("organizationalUnitDistinguishedName")
     * .build())
     * .computeFarmConfiguration(ComputeFarmConfigurationProperty.builder()
     * .activeDirectoryUser("activeDirectoryUser")
     * .endpoint("endpoint")
     * .build())
     * .licenseServiceConfiguration(LicenseServiceConfigurationProperty.builder()
     * .endpoint("endpoint")
     * .build())
     * .sharedFileSystemConfiguration(SharedFileSystemConfigurationProperty.builder()
     * .endpoint("endpoint")
     * .fileSystemId("fileSystemId")
     * .linuxMountPoint("linuxMountPoint")
     * .shareName("shareName")
     * .windowsMountDrive("windowsMountDrive")
     * .build())
     * .build())
     * .description("description")
     * .ec2SecurityGroupIds(List.of("ec2SecurityGroupIds"))
     * .initializationScripts(List.of(StudioComponentInitializationScriptProperty.builder()
     * .launchProfileProtocolVersion("launchProfileProtocolVersion")
     * .platform("platform")
     * .runContext("runContext")
     * .script("script")
     * .build()))
     * .runtimeRoleArn("runtimeRoleArn")
     * .scriptParameters(List.of(ScriptParameterKeyValueProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .secureInitializationRoleArn("secureInitializationRoleArn")
     * .subtype("subtype")
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html)
     */
    public inline fun cfnStudioComponent(
        scope: Construct,
        id: String,
        block: CfnStudioComponentDsl.() -> Unit = {},
    ): CfnStudioComponent {
        val builder = CfnStudioComponentDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * An LDAP attribute of an Active Directory computer account, in the form of a name:value pair.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.nimblestudio.*;
     * ActiveDirectoryComputerAttributeProperty activeDirectoryComputerAttributeProperty =
     * ActiveDirectoryComputerAttributeProperty.builder()
     * .name("name")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-activedirectorycomputerattribute.html)
     */
    public inline fun cfnStudioComponentActiveDirectoryComputerAttributeProperty(
        block: CfnStudioComponentActiveDirectoryComputerAttributePropertyDsl.() -> Unit = {}
    ): CfnStudioComponent.ActiveDirectoryComputerAttributeProperty {
        val builder = CfnStudioComponentActiveDirectoryComputerAttributePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration for a AWS Directory Service for Microsoft Active Directory studio resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.nimblestudio.*;
     * ActiveDirectoryConfigurationProperty activeDirectoryConfigurationProperty =
     * ActiveDirectoryConfigurationProperty.builder()
     * .computerAttributes(List.of(ActiveDirectoryComputerAttributeProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .directoryId("directoryId")
     * .organizationalUnitDistinguishedName("organizationalUnitDistinguishedName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-activedirectoryconfiguration.html)
     */
    public inline fun cfnStudioComponentActiveDirectoryConfigurationProperty(
        block: CfnStudioComponentActiveDirectoryConfigurationPropertyDsl.() -> Unit = {}
    ): CfnStudioComponent.ActiveDirectoryConfigurationProperty {
        val builder = CfnStudioComponentActiveDirectoryConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration for a render farm that is associated with a studio resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.nimblestudio.*;
     * ComputeFarmConfigurationProperty computeFarmConfigurationProperty =
     * ComputeFarmConfigurationProperty.builder()
     * .activeDirectoryUser("activeDirectoryUser")
     * .endpoint("endpoint")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-computefarmconfiguration.html)
     */
    public inline fun cfnStudioComponentComputeFarmConfigurationProperty(
        block: CfnStudioComponentComputeFarmConfigurationPropertyDsl.() -> Unit = {}
    ): CfnStudioComponent.ComputeFarmConfigurationProperty {
        val builder = CfnStudioComponentComputeFarmConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration for a license service that is associated with a studio resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.nimblestudio.*;
     * LicenseServiceConfigurationProperty licenseServiceConfigurationProperty =
     * LicenseServiceConfigurationProperty.builder()
     * .endpoint("endpoint")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-licenseserviceconfiguration.html)
     */
    public inline fun cfnStudioComponentLicenseServiceConfigurationProperty(
        block: CfnStudioComponentLicenseServiceConfigurationPropertyDsl.() -> Unit = {}
    ): CfnStudioComponent.LicenseServiceConfigurationProperty {
        val builder = CfnStudioComponentLicenseServiceConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnStudioComponent`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.nimblestudio.*;
     * CfnStudioComponentProps cfnStudioComponentProps = CfnStudioComponentProps.builder()
     * .name("name")
     * .studioId("studioId")
     * .type("type")
     * // the properties below are optional
     * .configuration(StudioComponentConfigurationProperty.builder()
     * .activeDirectoryConfiguration(ActiveDirectoryConfigurationProperty.builder()
     * .computerAttributes(List.of(ActiveDirectoryComputerAttributeProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .directoryId("directoryId")
     * .organizationalUnitDistinguishedName("organizationalUnitDistinguishedName")
     * .build())
     * .computeFarmConfiguration(ComputeFarmConfigurationProperty.builder()
     * .activeDirectoryUser("activeDirectoryUser")
     * .endpoint("endpoint")
     * .build())
     * .licenseServiceConfiguration(LicenseServiceConfigurationProperty.builder()
     * .endpoint("endpoint")
     * .build())
     * .sharedFileSystemConfiguration(SharedFileSystemConfigurationProperty.builder()
     * .endpoint("endpoint")
     * .fileSystemId("fileSystemId")
     * .linuxMountPoint("linuxMountPoint")
     * .shareName("shareName")
     * .windowsMountDrive("windowsMountDrive")
     * .build())
     * .build())
     * .description("description")
     * .ec2SecurityGroupIds(List.of("ec2SecurityGroupIds"))
     * .initializationScripts(List.of(StudioComponentInitializationScriptProperty.builder()
     * .launchProfileProtocolVersion("launchProfileProtocolVersion")
     * .platform("platform")
     * .runContext("runContext")
     * .script("script")
     * .build()))
     * .runtimeRoleArn("runtimeRoleArn")
     * .scriptParameters(List.of(ScriptParameterKeyValueProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .secureInitializationRoleArn("secureInitializationRoleArn")
     * .subtype("subtype")
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studiocomponent.html)
     */
    public inline fun cfnStudioComponentProps(
        block: CfnStudioComponentPropsDsl.() -> Unit = {}
    ): CfnStudioComponentProps {
        val builder = CfnStudioComponentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A parameter for a studio component script, in the form of a key-value pair.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.nimblestudio.*;
     * ScriptParameterKeyValueProperty scriptParameterKeyValueProperty =
     * ScriptParameterKeyValueProperty.builder()
     * .key("key")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-scriptparameterkeyvalue.html)
     */
    public inline fun cfnStudioComponentScriptParameterKeyValueProperty(
        block: CfnStudioComponentScriptParameterKeyValuePropertyDsl.() -> Unit = {}
    ): CfnStudioComponent.ScriptParameterKeyValueProperty {
        val builder = CfnStudioComponentScriptParameterKeyValuePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration for a shared file storage system that is associated with a studio resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.nimblestudio.*;
     * SharedFileSystemConfigurationProperty sharedFileSystemConfigurationProperty =
     * SharedFileSystemConfigurationProperty.builder()
     * .endpoint("endpoint")
     * .fileSystemId("fileSystemId")
     * .linuxMountPoint("linuxMountPoint")
     * .shareName("shareName")
     * .windowsMountDrive("windowsMountDrive")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-sharedfilesystemconfiguration.html)
     */
    public inline fun cfnStudioComponentSharedFileSystemConfigurationProperty(
        block: CfnStudioComponentSharedFileSystemConfigurationPropertyDsl.() -> Unit = {}
    ): CfnStudioComponent.SharedFileSystemConfigurationProperty {
        val builder = CfnStudioComponentSharedFileSystemConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration of the studio component, based on component type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.nimblestudio.*;
     * StudioComponentConfigurationProperty studioComponentConfigurationProperty =
     * StudioComponentConfigurationProperty.builder()
     * .activeDirectoryConfiguration(ActiveDirectoryConfigurationProperty.builder()
     * .computerAttributes(List.of(ActiveDirectoryComputerAttributeProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .directoryId("directoryId")
     * .organizationalUnitDistinguishedName("organizationalUnitDistinguishedName")
     * .build())
     * .computeFarmConfiguration(ComputeFarmConfigurationProperty.builder()
     * .activeDirectoryUser("activeDirectoryUser")
     * .endpoint("endpoint")
     * .build())
     * .licenseServiceConfiguration(LicenseServiceConfigurationProperty.builder()
     * .endpoint("endpoint")
     * .build())
     * .sharedFileSystemConfiguration(SharedFileSystemConfigurationProperty.builder()
     * .endpoint("endpoint")
     * .fileSystemId("fileSystemId")
     * .linuxMountPoint("linuxMountPoint")
     * .shareName("shareName")
     * .windowsMountDrive("windowsMountDrive")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-studiocomponentconfiguration.html)
     */
    public inline fun cfnStudioComponentStudioComponentConfigurationProperty(
        block: CfnStudioComponentStudioComponentConfigurationPropertyDsl.() -> Unit = {}
    ): CfnStudioComponent.StudioComponentConfigurationProperty {
        val builder = CfnStudioComponentStudioComponentConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Initialization scripts for studio components.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.nimblestudio.*;
     * StudioComponentInitializationScriptProperty studioComponentInitializationScriptProperty =
     * StudioComponentInitializationScriptProperty.builder()
     * .launchProfileProtocolVersion("launchProfileProtocolVersion")
     * .platform("platform")
     * .runContext("runContext")
     * .script("script")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-studiocomponentinitializationscript.html)
     */
    public inline fun cfnStudioComponentStudioComponentInitializationScriptProperty(
        block: CfnStudioComponentStudioComponentInitializationScriptPropertyDsl.() -> Unit = {}
    ): CfnStudioComponent.StudioComponentInitializationScriptProperty {
        val builder = CfnStudioComponentStudioComponentInitializationScriptPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnStudio`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.nimblestudio.*;
     * CfnStudioProps cfnStudioProps = CfnStudioProps.builder()
     * .adminRoleArn("adminRoleArn")
     * .displayName("displayName")
     * .studioName("studioName")
     * .userRoleArn("userRoleArn")
     * // the properties below are optional
     * .studioEncryptionConfiguration(StudioEncryptionConfigurationProperty.builder()
     * .keyType("keyType")
     * // the properties below are optional
     * .keyArn("keyArn")
     * .build())
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studio.html)
     */
    public inline fun cfnStudioProps(block: CfnStudioPropsDsl.() -> Unit = {}): CfnStudioProps {
        val builder = CfnStudioPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration of the encryption method that is used for the studio.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.nimblestudio.*;
     * StudioEncryptionConfigurationProperty studioEncryptionConfigurationProperty =
     * StudioEncryptionConfigurationProperty.builder()
     * .keyType("keyType")
     * // the properties below are optional
     * .keyArn("keyArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studio-studioencryptionconfiguration.html)
     */
    public inline fun cfnStudioStudioEncryptionConfigurationProperty(
        block: CfnStudioStudioEncryptionConfigurationPropertyDsl.() -> Unit = {}
    ): CfnStudio.StudioEncryptionConfigurationProperty {
        val builder = CfnStudioStudioEncryptionConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
