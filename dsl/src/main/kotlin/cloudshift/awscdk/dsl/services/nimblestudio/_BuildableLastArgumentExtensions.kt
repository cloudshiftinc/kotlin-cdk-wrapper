@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.nimblestudio

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile
import software.amazon.awscdk.services.nimblestudio.CfnStreamingImage
import software.amazon.awscdk.services.nimblestudio.CfnStudio
import software.amazon.awscdk.services.nimblestudio.CfnStudioComponent

public inline fun CfnLaunchProfile.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnLaunchProfile.setStreamConfiguration(block: CfnLaunchProfileStreamConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnLaunchProfileStreamConfigurationPropertyDsl()
  builder.apply(block)
  return setStreamConfiguration(builder.build())
}

public inline fun CfnStreamingImage.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnStudio.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnStudio.setStudioEncryptionConfiguration(block: CfnStudioStudioEncryptionConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnStudioStudioEncryptionConfigurationPropertyDsl()
  builder.apply(block)
  return setStudioEncryptionConfiguration(builder.build())
}

public inline fun CfnStudioComponent.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnStudioComponent.setConfiguration(block: CfnStudioComponentStudioComponentConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnStudioComponentStudioComponentConfigurationPropertyDsl()
  builder.apply(block)
  return setConfiguration(builder.build())
}
