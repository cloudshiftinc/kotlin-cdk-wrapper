@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lightsail

import kotlin.Unit
import software.amazon.awscdk.services.lightsail.CfnBucket
import software.amazon.awscdk.services.lightsail.CfnContainer
import software.amazon.awscdk.services.lightsail.CfnDisk
import software.amazon.awscdk.services.lightsail.CfnDistribution
import software.amazon.awscdk.services.lightsail.CfnInstance

public inline
    fun CfnDistribution.setDefaultCacheBehavior(block: CfnDistributionCacheBehaviorPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDistributionCacheBehaviorPropertyDsl()
  builder.apply(block)
  return setDefaultCacheBehavior(builder.build())
}

public inline fun CfnDistribution.setOrigin(block: CfnDistributionInputOriginPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDistributionInputOriginPropertyDsl()
  builder.apply(block)
  return setOrigin(builder.build())
}

public inline
    fun CfnDistribution.setCacheBehaviorSettings(block: CfnDistributionCacheSettingsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDistributionCacheSettingsPropertyDsl()
  builder.apply(block)
  return setCacheBehaviorSettings(builder.build())
}

public inline fun CfnDisk.setLocation(block: CfnDiskLocationPropertyDsl.() -> Unit = {}) {
  val builder = CfnDiskLocationPropertyDsl()
  builder.apply(block)
  return setLocation(builder.build())
}

public inline
    fun CfnContainer.setContainerServiceDeployment(block: CfnContainerContainerServiceDeploymentPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnContainerContainerServiceDeploymentPropertyDsl()
  builder.apply(block)
  return setContainerServiceDeployment(builder.build())
}

public inline fun CfnInstance.setHardware(block: CfnInstanceHardwarePropertyDsl.() -> Unit = {}) {
  val builder = CfnInstanceHardwarePropertyDsl()
  builder.apply(block)
  return setHardware(builder.build())
}

public inline fun CfnInstance.setLocation(block: CfnInstanceLocationPropertyDsl.() -> Unit = {}) {
  val builder = CfnInstanceLocationPropertyDsl()
  builder.apply(block)
  return setLocation(builder.build())
}

public inline fun CfnInstance.setNetworking(block: CfnInstanceNetworkingPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnInstanceNetworkingPropertyDsl()
  builder.apply(block)
  return setNetworking(builder.build())
}

public inline fun CfnInstance.setState(block: CfnInstanceStatePropertyDsl.() -> Unit = {}) {
  val builder = CfnInstanceStatePropertyDsl()
  builder.apply(block)
  return setState(builder.build())
}

public inline fun CfnBucket.setAccessRules(block: CfnBucketAccessRulesPropertyDsl.() -> Unit = {}) {
  val builder = CfnBucketAccessRulesPropertyDsl()
  builder.apply(block)
  return setAccessRules(builder.build())
}
