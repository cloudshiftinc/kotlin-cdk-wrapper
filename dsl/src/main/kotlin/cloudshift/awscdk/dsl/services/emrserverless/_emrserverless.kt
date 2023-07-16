@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emrserverless

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.emrserverless.CfnApplication
import software.amazon.awscdk.services.emrserverless.CfnApplicationProps
import software.constructs.Construct

public object emrserverless {
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
      fun cfnApplicationAutoStartConfigurationProperty(block: CfnApplicationAutoStartConfigurationPropertyDsl.() -> Unit
      = {}): CfnApplication.AutoStartConfigurationProperty {
    val builder = CfnApplicationAutoStartConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationAutoStopConfigurationProperty(block: CfnApplicationAutoStopConfigurationPropertyDsl.() -> Unit
      = {}): CfnApplication.AutoStopConfigurationProperty {
    val builder = CfnApplicationAutoStopConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationImageConfigurationInputProperty(block: CfnApplicationImageConfigurationInputPropertyDsl.() -> Unit
      = {}): CfnApplication.ImageConfigurationInputProperty {
    val builder = CfnApplicationImageConfigurationInputPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationInitialCapacityConfigKeyValuePairProperty(block: CfnApplicationInitialCapacityConfigKeyValuePairPropertyDsl.() -> Unit
      = {}): CfnApplication.InitialCapacityConfigKeyValuePairProperty {
    val builder = CfnApplicationInitialCapacityConfigKeyValuePairPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationInitialCapacityConfigProperty(block: CfnApplicationInitialCapacityConfigPropertyDsl.() -> Unit
      = {}): CfnApplication.InitialCapacityConfigProperty {
    val builder = CfnApplicationInitialCapacityConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationMaximumAllowedResourcesProperty(block: CfnApplicationMaximumAllowedResourcesPropertyDsl.() -> Unit
      = {}): CfnApplication.MaximumAllowedResourcesProperty {
    val builder = CfnApplicationMaximumAllowedResourcesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationNetworkConfigurationProperty(block: CfnApplicationNetworkConfigurationPropertyDsl.() -> Unit
      = {}): CfnApplication.NetworkConfigurationProperty {
    val builder = CfnApplicationNetworkConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnApplicationProps(block: CfnApplicationPropsDsl.() -> Unit = {}):
      CfnApplicationProps {
    val builder = CfnApplicationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationWorkerConfigurationProperty(block: CfnApplicationWorkerConfigurationPropertyDsl.() -> Unit
      = {}): CfnApplication.WorkerConfigurationProperty {
    val builder = CfnApplicationWorkerConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnApplicationWorkerTypeSpecificationInputProperty(block: CfnApplicationWorkerTypeSpecificationInputPropertyDsl.() -> Unit
      = {}): CfnApplication.WorkerTypeSpecificationInputProperty {
    val builder = CfnApplicationWorkerTypeSpecificationInputPropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
