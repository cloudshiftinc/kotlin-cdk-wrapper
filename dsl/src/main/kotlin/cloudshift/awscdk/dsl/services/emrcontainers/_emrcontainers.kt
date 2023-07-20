@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emrcontainers

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster
import software.amazon.awscdk.services.emrcontainers.CfnVirtualClusterProps
import software.constructs.Construct

public object emrcontainers {
  public inline fun cfnVirtualCluster(
    scope: Construct,
    id: String,
    block: CfnVirtualClusterDsl.() -> Unit = {},
  ): CfnVirtualCluster {
    val builder = CfnVirtualClusterDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnVirtualClusterContainerInfoProperty(block: CfnVirtualClusterContainerInfoPropertyDsl.() -> Unit
      = {}): CfnVirtualCluster.ContainerInfoProperty {
    val builder = CfnVirtualClusterContainerInfoPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnVirtualClusterContainerProviderProperty(block: CfnVirtualClusterContainerProviderPropertyDsl.() -> Unit
      = {}): CfnVirtualCluster.ContainerProviderProperty {
    val builder = CfnVirtualClusterContainerProviderPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnVirtualClusterEksInfoProperty(block: CfnVirtualClusterEksInfoPropertyDsl.() -> Unit =
      {}): CfnVirtualCluster.EksInfoProperty {
    val builder = CfnVirtualClusterEksInfoPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnVirtualClusterProps(block: CfnVirtualClusterPropsDsl.() -> Unit = {}):
      CfnVirtualClusterProps {
    val builder = CfnVirtualClusterPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
