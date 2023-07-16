@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.m2

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.m2.CfnApplication
import software.amazon.awscdk.services.m2.CfnApplicationProps
import software.amazon.awscdk.services.m2.CfnEnvironment
import software.amazon.awscdk.services.m2.CfnEnvironmentProps
import software.constructs.Construct

public object m2 {
  public inline fun cfnApplication(
    scope: Construct,
    id: String,
    block: CfnApplicationDsl.() -> Unit = {},
  ): CfnApplication {
    val builder = CfnApplicationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationDefinitionProperty(block: CfnApplicationDefinitionPropertyDsl.() -> Unit =
      {}): CfnApplication.DefinitionProperty {
    val builder = CfnApplicationDefinitionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnApplicationProps(block: CfnApplicationPropsDsl.() -> Unit = {}):
      CfnApplicationProps {
    val builder = CfnApplicationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEnvironment(
    scope: Construct,
    id: String,
    block: CfnEnvironmentDsl.() -> Unit = {},
  ): CfnEnvironment {
    val builder = CfnEnvironmentDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEnvironmentEfsStorageConfigurationProperty(block: CfnEnvironmentEfsStorageConfigurationPropertyDsl.() -> Unit
      = {}): CfnEnvironment.EfsStorageConfigurationProperty {
    val builder = CfnEnvironmentEfsStorageConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEnvironmentFsxStorageConfigurationProperty(block: CfnEnvironmentFsxStorageConfigurationPropertyDsl.() -> Unit
      = {}): CfnEnvironment.FsxStorageConfigurationProperty {
    val builder = CfnEnvironmentFsxStorageConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEnvironmentHighAvailabilityConfigProperty(block: CfnEnvironmentHighAvailabilityConfigPropertyDsl.() -> Unit
      = {}): CfnEnvironment.HighAvailabilityConfigProperty {
    val builder = CfnEnvironmentHighAvailabilityConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEnvironmentProps(block: CfnEnvironmentPropsDsl.() -> Unit = {}):
      CfnEnvironmentProps {
    val builder = CfnEnvironmentPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEnvironmentStorageConfigurationProperty(block: CfnEnvironmentStorageConfigurationPropertyDsl.() -> Unit
      = {}): CfnEnvironment.StorageConfigurationProperty {
    val builder = CfnEnvironmentStorageConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
