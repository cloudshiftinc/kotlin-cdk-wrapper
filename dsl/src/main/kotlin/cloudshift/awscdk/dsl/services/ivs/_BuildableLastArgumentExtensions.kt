@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ivs

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.ivs.CfnChannel
import software.amazon.awscdk.services.ivs.CfnPlaybackKeyPair
import software.amazon.awscdk.services.ivs.CfnRecordingConfiguration
import software.amazon.awscdk.services.ivs.CfnStreamKey

public inline fun CfnChannel.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnPlaybackKeyPair.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnRecordingConfiguration.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnRecordingConfiguration.setDestinationConfiguration(block: CfnRecordingConfigurationDestinationConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnRecordingConfigurationDestinationConfigurationPropertyDsl()
  builder.apply(block)
  return setDestinationConfiguration(builder.build())
}

public inline
    fun CfnRecordingConfiguration.setThumbnailConfiguration(block: CfnRecordingConfigurationThumbnailConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnRecordingConfigurationThumbnailConfigurationPropertyDsl()
  builder.apply(block)
  return setThumbnailConfiguration(builder.build())
}

public inline fun CfnStreamKey.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}
