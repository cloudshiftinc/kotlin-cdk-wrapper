@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ivs

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ivs.CfnChannel
import software.amazon.awscdk.services.ivs.CfnChannelProps
import software.amazon.awscdk.services.ivs.CfnPlaybackKeyPair
import software.amazon.awscdk.services.ivs.CfnPlaybackKeyPairProps
import software.amazon.awscdk.services.ivs.CfnRecordingConfiguration
import software.amazon.awscdk.services.ivs.CfnRecordingConfigurationProps
import software.amazon.awscdk.services.ivs.CfnStreamKey
import software.amazon.awscdk.services.ivs.CfnStreamKeyProps
import software.constructs.Construct

public object ivs {
  public inline fun cfnChannel(
    scope: Construct,
    id: String,
    block: CfnChannelDsl.() -> Unit = {},
  ): CfnChannel {
    val builder = CfnChannelDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnChannelProps(block: CfnChannelPropsDsl.() -> Unit = {}): CfnChannelProps {
    val builder = CfnChannelPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnPlaybackKeyPair(
    scope: Construct,
    id: String,
    block: CfnPlaybackKeyPairDsl.() -> Unit = {},
  ): CfnPlaybackKeyPair {
    val builder = CfnPlaybackKeyPairDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnPlaybackKeyPairProps(block: CfnPlaybackKeyPairPropsDsl.() -> Unit = {}):
      CfnPlaybackKeyPairProps {
    val builder = CfnPlaybackKeyPairPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRecordingConfiguration(
    scope: Construct,
    id: String,
    block: CfnRecordingConfigurationDsl.() -> Unit = {},
  ): CfnRecordingConfiguration {
    val builder = CfnRecordingConfigurationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRecordingConfigurationDestinationConfigurationProperty(block: CfnRecordingConfigurationDestinationConfigurationPropertyDsl.() -> Unit
      = {}): CfnRecordingConfiguration.DestinationConfigurationProperty {
    val builder = CfnRecordingConfigurationDestinationConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRecordingConfigurationProps(block: CfnRecordingConfigurationPropsDsl.() -> Unit = {}):
      CfnRecordingConfigurationProps {
    val builder = CfnRecordingConfigurationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRecordingConfigurationS3DestinationConfigurationProperty(block: CfnRecordingConfigurationS3DestinationConfigurationPropertyDsl.() -> Unit
      = {}): CfnRecordingConfiguration.S3DestinationConfigurationProperty {
    val builder = CfnRecordingConfigurationS3DestinationConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRecordingConfigurationThumbnailConfigurationProperty(block: CfnRecordingConfigurationThumbnailConfigurationPropertyDsl.() -> Unit
      = {}): CfnRecordingConfiguration.ThumbnailConfigurationProperty {
    val builder = CfnRecordingConfigurationThumbnailConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnStreamKey(
    scope: Construct,
    id: String,
    block: CfnStreamKeyDsl.() -> Unit = {},
  ): CfnStreamKey {
    val builder = CfnStreamKeyDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnStreamKeyProps(block: CfnStreamKeyPropsDsl.() -> Unit = {}):
      CfnStreamKeyProps {
    val builder = CfnStreamKeyPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
