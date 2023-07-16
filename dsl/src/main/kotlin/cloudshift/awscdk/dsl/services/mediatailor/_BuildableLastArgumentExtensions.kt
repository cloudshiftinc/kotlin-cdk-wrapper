@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediatailor

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration

public inline fun CfnPlaybackConfiguration.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnPlaybackConfiguration.setAvailSuppression(block: CfnPlaybackConfigurationAvailSuppressionPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnPlaybackConfigurationAvailSuppressionPropertyDsl()
  builder.apply(block)
  return setAvailSuppression(builder.build())
}

public inline
    fun CfnPlaybackConfiguration.setBumper(block: CfnPlaybackConfigurationBumperPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnPlaybackConfigurationBumperPropertyDsl()
  builder.apply(block)
  return setBumper(builder.build())
}

public inline
    fun CfnPlaybackConfiguration.setCdnConfiguration(block: CfnPlaybackConfigurationCdnConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnPlaybackConfigurationCdnConfigurationPropertyDsl()
  builder.apply(block)
  return setCdnConfiguration(builder.build())
}

public inline
    fun CfnPlaybackConfiguration.setDashConfiguration(block: CfnPlaybackConfigurationDashConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnPlaybackConfigurationDashConfigurationPropertyDsl()
  builder.apply(block)
  return setDashConfiguration(builder.build())
}

public inline
    fun CfnPlaybackConfiguration.setHlsConfiguration(block: CfnPlaybackConfigurationHlsConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnPlaybackConfigurationHlsConfigurationPropertyDsl()
  builder.apply(block)
  return setHlsConfiguration(builder.build())
}

public inline
    fun CfnPlaybackConfiguration.setLivePreRollConfiguration(block: CfnPlaybackConfigurationLivePreRollConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnPlaybackConfigurationLivePreRollConfigurationPropertyDsl()
  builder.apply(block)
  return setLivePreRollConfiguration(builder.build())
}

public inline
    fun CfnPlaybackConfiguration.setManifestProcessingRules(block: CfnPlaybackConfigurationManifestProcessingRulesPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnPlaybackConfigurationManifestProcessingRulesPropertyDsl()
  builder.apply(block)
  return setManifestProcessingRules(builder.build())
}
