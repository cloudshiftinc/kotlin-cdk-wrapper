@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appintegrations

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appintegrations.CfnDataIntegration
import software.amazon.awscdk.services.appintegrations.CfnDataIntegrationProps
import software.amazon.awscdk.services.appintegrations.CfnEventIntegration
import software.amazon.awscdk.services.appintegrations.CfnEventIntegrationProps
import software.constructs.Construct

public object appintegrations {
  public inline fun cfnDataIntegration(
    scope: Construct,
    id: String,
    block: CfnDataIntegrationDsl.() -> Unit = {},
  ): CfnDataIntegration {
    val builder = CfnDataIntegrationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataIntegrationFileConfigurationProperty(block: CfnDataIntegrationFileConfigurationPropertyDsl.() -> Unit
      = {}): CfnDataIntegration.FileConfigurationProperty {
    val builder = CfnDataIntegrationFileConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDataIntegrationProps(block: CfnDataIntegrationPropsDsl.() -> Unit = {}):
      CfnDataIntegrationProps {
    val builder = CfnDataIntegrationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataIntegrationScheduleConfigProperty(block: CfnDataIntegrationScheduleConfigPropertyDsl.() -> Unit
      = {}): CfnDataIntegration.ScheduleConfigProperty {
    val builder = CfnDataIntegrationScheduleConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEventIntegration(
    scope: Construct,
    id: String,
    block: CfnEventIntegrationDsl.() -> Unit = {},
  ): CfnEventIntegration {
    val builder = CfnEventIntegrationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEventIntegrationEventFilterProperty(block: CfnEventIntegrationEventFilterPropertyDsl.() -> Unit
      = {}): CfnEventIntegration.EventFilterProperty {
    val builder = CfnEventIntegrationEventFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEventIntegrationProps(block: CfnEventIntegrationPropsDsl.() -> Unit = {}):
      CfnEventIntegrationProps {
    val builder = CfnEventIntegrationPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
