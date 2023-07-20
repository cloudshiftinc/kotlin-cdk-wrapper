@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appstream

import kotlin.Unit
import software.amazon.awscdk.services.appstream.CfnAppBlock
import software.amazon.awscdk.services.appstream.CfnAppBlockBuilder
import software.amazon.awscdk.services.appstream.CfnApplication
import software.amazon.awscdk.services.appstream.CfnDirectoryConfig
import software.amazon.awscdk.services.appstream.CfnFleet
import software.amazon.awscdk.services.appstream.CfnImageBuilder
import software.amazon.awscdk.services.appstream.CfnStack

public inline fun CfnAppBlock.setSourceS3Location(block: CfnAppBlockS3LocationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnAppBlockS3LocationPropertyDsl()
  builder.apply(block)
  return setSourceS3Location(builder.build())
}

public inline
    fun CfnAppBlock.setPostSetupScriptDetails(block: CfnAppBlockScriptDetailsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnAppBlockScriptDetailsPropertyDsl()
  builder.apply(block)
  return setPostSetupScriptDetails(builder.build())
}

public inline
    fun CfnAppBlock.setSetupScriptDetails(block: CfnAppBlockScriptDetailsPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnAppBlockScriptDetailsPropertyDsl()
  builder.apply(block)
  return setSetupScriptDetails(builder.build())
}

public inline
    fun CfnDirectoryConfig.setServiceAccountCredentials(block: CfnDirectoryConfigServiceAccountCredentialsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDirectoryConfigServiceAccountCredentialsPropertyDsl()
  builder.apply(block)
  return setServiceAccountCredentials(builder.build())
}

public inline
    fun CfnDirectoryConfig.setCertificateBasedAuthProperties(block: CfnDirectoryConfigCertificateBasedAuthPropertiesPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDirectoryConfigCertificateBasedAuthPropertiesPropertyDsl()
  builder.apply(block)
  return setCertificateBasedAuthProperties(builder.build())
}

public inline fun CfnFleet.setComputeCapacity(block: CfnFleetComputeCapacityPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnFleetComputeCapacityPropertyDsl()
  builder.apply(block)
  return setComputeCapacity(builder.build())
}

public inline fun CfnFleet.setDomainJoinInfo(block: CfnFleetDomainJoinInfoPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnFleetDomainJoinInfoPropertyDsl()
  builder.apply(block)
  return setDomainJoinInfo(builder.build())
}

public inline
    fun CfnFleet.setSessionScriptS3Location(block: CfnFleetS3LocationPropertyDsl.() -> Unit = {}) {
  val builder = CfnFleetS3LocationPropertyDsl()
  builder.apply(block)
  return setSessionScriptS3Location(builder.build())
}

public inline fun CfnFleet.setVpcConfig(block: CfnFleetVpcConfigPropertyDsl.() -> Unit = {}) {
  val builder = CfnFleetVpcConfigPropertyDsl()
  builder.apply(block)
  return setVpcConfig(builder.build())
}

public inline
    fun CfnApplication.setIconS3Location(block: CfnApplicationS3LocationPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnApplicationS3LocationPropertyDsl()
  builder.apply(block)
  return setIconS3Location(builder.build())
}

public inline
    fun CfnStack.setApplicationSettings(block: CfnStackApplicationSettingsPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnStackApplicationSettingsPropertyDsl()
  builder.apply(block)
  return setApplicationSettings(builder.build())
}

public inline
    fun CfnStack.setStreamingExperienceSettings(block: CfnStackStreamingExperienceSettingsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnStackStreamingExperienceSettingsPropertyDsl()
  builder.apply(block)
  return setStreamingExperienceSettings(builder.build())
}

public inline
    fun CfnAppBlockBuilder.setVpcConfig(block: CfnAppBlockBuilderVpcConfigPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnAppBlockBuilderVpcConfigPropertyDsl()
  builder.apply(block)
  return setVpcConfig(builder.build())
}

public inline
    fun CfnImageBuilder.setDomainJoinInfo(block: CfnImageBuilderDomainJoinInfoPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnImageBuilderDomainJoinInfoPropertyDsl()
  builder.apply(block)
  return setDomainJoinInfo(builder.build())
}

public inline fun CfnImageBuilder.setVpcConfig(block: CfnImageBuilderVpcConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnImageBuilderVpcConfigPropertyDsl()
  builder.apply(block)
  return setVpcConfig(builder.build())
}
