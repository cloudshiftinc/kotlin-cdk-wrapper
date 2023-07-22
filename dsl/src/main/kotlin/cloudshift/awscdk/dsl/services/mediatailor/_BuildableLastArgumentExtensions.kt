@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediatailor

import kotlin.Unit
import software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration

/**
 * The configuration for avail suppression, also known as ad suppression.
 */
public inline
    fun CfnPlaybackConfiguration.setAvailSuppression(block: CfnPlaybackConfigurationAvailSuppressionPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnPlaybackConfigurationAvailSuppressionPropertyDsl()
  builder.apply(block)
  return setAvailSuppression(builder.build())
}

/**
 * The configuration for bumpers.
 */
public inline
    fun CfnPlaybackConfiguration.setBumper(block: CfnPlaybackConfigurationBumperPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnPlaybackConfigurationBumperPropertyDsl()
  builder.apply(block)
  return setBumper(builder.build())
}

/**
 * The configuration for using a content delivery network (CDN), like Amazon CloudFront, for content
 * and ad segment management.
 */
public inline
    fun CfnPlaybackConfiguration.setCdnConfiguration(block: CfnPlaybackConfigurationCdnConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnPlaybackConfigurationCdnConfigurationPropertyDsl()
  builder.apply(block)
  return setCdnConfiguration(builder.build())
}

/**
 * The configuration for DASH PUT operations.
 */
public inline
    fun CfnPlaybackConfiguration.setDashConfiguration(block: CfnPlaybackConfigurationDashConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnPlaybackConfigurationDashConfigurationPropertyDsl()
  builder.apply(block)
  return setDashConfiguration(builder.build())
}

/**
 * The configuration for HLS content.
 */
public inline
    fun CfnPlaybackConfiguration.setHlsConfiguration(block: CfnPlaybackConfigurationHlsConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnPlaybackConfigurationHlsConfigurationPropertyDsl()
  builder.apply(block)
  return setHlsConfiguration(builder.build())
}

/**
 * The configuration for pre-roll ad insertion.
 */
public inline
    fun CfnPlaybackConfiguration.setLivePreRollConfiguration(block: CfnPlaybackConfigurationLivePreRollConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnPlaybackConfigurationLivePreRollConfigurationPropertyDsl()
  builder.apply(block)
  return setLivePreRollConfiguration(builder.build())
}

/**
 * The configuration for manifest processing rules.
 */
public inline
    fun CfnPlaybackConfiguration.setManifestProcessingRules(block: CfnPlaybackConfigurationManifestProcessingRulesPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnPlaybackConfigurationManifestProcessingRulesPropertyDsl()
  builder.apply(block)
  return setManifestProcessingRules(builder.build())
}
