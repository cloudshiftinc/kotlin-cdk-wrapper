@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

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
  public inline fun cfnLaunchProfile(
    scope: Construct,
    id: String,
    block: CfnLaunchProfileDsl.() -> Unit = {},
  ): CfnLaunchProfile {
    val builder = CfnLaunchProfileDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnLaunchProfileProps(block: CfnLaunchProfilePropsDsl.() -> Unit = {}):
      CfnLaunchProfileProps {
    val builder = CfnLaunchProfilePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLaunchProfileStreamConfigurationProperty(block: CfnLaunchProfileStreamConfigurationPropertyDsl.() -> Unit
      = {}): CfnLaunchProfile.StreamConfigurationProperty {
    val builder = CfnLaunchProfileStreamConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLaunchProfileStreamConfigurationSessionBackupProperty(block: CfnLaunchProfileStreamConfigurationSessionBackupPropertyDsl.() -> Unit
      = {}): CfnLaunchProfile.StreamConfigurationSessionBackupProperty {
    val builder = CfnLaunchProfileStreamConfigurationSessionBackupPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLaunchProfileStreamConfigurationSessionStorageProperty(block: CfnLaunchProfileStreamConfigurationSessionStoragePropertyDsl.() -> Unit
      = {}): CfnLaunchProfile.StreamConfigurationSessionStorageProperty {
    val builder = CfnLaunchProfileStreamConfigurationSessionStoragePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLaunchProfileStreamingSessionStorageRootProperty(block: CfnLaunchProfileStreamingSessionStorageRootPropertyDsl.() -> Unit
      = {}): CfnLaunchProfile.StreamingSessionStorageRootProperty {
    val builder = CfnLaunchProfileStreamingSessionStorageRootPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLaunchProfileVolumeConfigurationProperty(block: CfnLaunchProfileVolumeConfigurationPropertyDsl.() -> Unit
      = {}): CfnLaunchProfile.VolumeConfigurationProperty {
    val builder = CfnLaunchProfileVolumeConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnStreamingImage(
    scope: Construct,
    id: String,
    block: CfnStreamingImageDsl.() -> Unit = {},
  ): CfnStreamingImage {
    val builder = CfnStreamingImageDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnStreamingImageProps(block: CfnStreamingImagePropsDsl.() -> Unit = {}):
      CfnStreamingImageProps {
    val builder = CfnStreamingImagePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStreamingImageStreamingImageEncryptionConfigurationProperty(block: CfnStreamingImageStreamingImageEncryptionConfigurationPropertyDsl.() -> Unit
      = {}): CfnStreamingImage.StreamingImageEncryptionConfigurationProperty {
    val builder = CfnStreamingImageStreamingImageEncryptionConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnStudio(
    scope: Construct,
    id: String,
    block: CfnStudioDsl.() -> Unit = {},
  ): CfnStudio {
    val builder = CfnStudioDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnStudioComponent(
    scope: Construct,
    id: String,
    block: CfnStudioComponentDsl.() -> Unit = {},
  ): CfnStudioComponent {
    val builder = CfnStudioComponentDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStudioComponentActiveDirectoryComputerAttributeProperty(block: CfnStudioComponentActiveDirectoryComputerAttributePropertyDsl.() -> Unit
      = {}): CfnStudioComponent.ActiveDirectoryComputerAttributeProperty {
    val builder = CfnStudioComponentActiveDirectoryComputerAttributePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStudioComponentActiveDirectoryConfigurationProperty(block: CfnStudioComponentActiveDirectoryConfigurationPropertyDsl.() -> Unit
      = {}): CfnStudioComponent.ActiveDirectoryConfigurationProperty {
    val builder = CfnStudioComponentActiveDirectoryConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStudioComponentComputeFarmConfigurationProperty(block: CfnStudioComponentComputeFarmConfigurationPropertyDsl.() -> Unit
      = {}): CfnStudioComponent.ComputeFarmConfigurationProperty {
    val builder = CfnStudioComponentComputeFarmConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStudioComponentLicenseServiceConfigurationProperty(block: CfnStudioComponentLicenseServiceConfigurationPropertyDsl.() -> Unit
      = {}): CfnStudioComponent.LicenseServiceConfigurationProperty {
    val builder = CfnStudioComponentLicenseServiceConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnStudioComponentProps(block: CfnStudioComponentPropsDsl.() -> Unit = {}):
      CfnStudioComponentProps {
    val builder = CfnStudioComponentPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStudioComponentScriptParameterKeyValueProperty(block: CfnStudioComponentScriptParameterKeyValuePropertyDsl.() -> Unit
      = {}): CfnStudioComponent.ScriptParameterKeyValueProperty {
    val builder = CfnStudioComponentScriptParameterKeyValuePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStudioComponentSharedFileSystemConfigurationProperty(block: CfnStudioComponentSharedFileSystemConfigurationPropertyDsl.() -> Unit
      = {}): CfnStudioComponent.SharedFileSystemConfigurationProperty {
    val builder = CfnStudioComponentSharedFileSystemConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStudioComponentStudioComponentConfigurationProperty(block: CfnStudioComponentStudioComponentConfigurationPropertyDsl.() -> Unit
      = {}): CfnStudioComponent.StudioComponentConfigurationProperty {
    val builder = CfnStudioComponentStudioComponentConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStudioComponentStudioComponentInitializationScriptProperty(block: CfnStudioComponentStudioComponentInitializationScriptPropertyDsl.() -> Unit
      = {}): CfnStudioComponent.StudioComponentInitializationScriptProperty {
    val builder = CfnStudioComponentStudioComponentInitializationScriptPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnStudioProps(block: CfnStudioPropsDsl.() -> Unit = {}): CfnStudioProps {
    val builder = CfnStudioPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStudioStudioEncryptionConfigurationProperty(block: CfnStudioStudioEncryptionConfigurationPropertyDsl.() -> Unit
      = {}): CfnStudio.StudioEncryptionConfigurationProperty {
    val builder = CfnStudioStudioEncryptionConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
