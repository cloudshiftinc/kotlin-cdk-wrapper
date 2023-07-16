@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.simspaceweaver

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.simspaceweaver.CfnSimulation
import software.amazon.awscdk.services.simspaceweaver.CfnSimulationProps
import software.constructs.Construct

public object simspaceweaver {
  public inline fun cfnSimulation(
    scope: Construct,
    id: String,
    block: CfnSimulationDsl.() -> Unit = {},
  ): CfnSimulation {
    val builder = CfnSimulationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSimulationProps(block: CfnSimulationPropsDsl.() -> Unit = {}):
      CfnSimulationProps {
    val builder = CfnSimulationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSimulationS3LocationProperty(block: CfnSimulationS3LocationPropertyDsl.() -> Unit =
      {}): CfnSimulation.S3LocationProperty {
    val builder = CfnSimulationS3LocationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
