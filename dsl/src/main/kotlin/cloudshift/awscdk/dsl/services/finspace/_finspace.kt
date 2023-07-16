@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.finspace

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.finspace.CfnEnvironment
import software.amazon.awscdk.services.finspace.CfnEnvironmentProps
import software.constructs.Construct

public object finspace {
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
      fun cfnEnvironmentAttributeMapItemsProperty(block: CfnEnvironmentAttributeMapItemsPropertyDsl.() -> Unit
      = {}): CfnEnvironment.AttributeMapItemsProperty {
    val builder = CfnEnvironmentAttributeMapItemsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEnvironmentFederationParametersProperty(block: CfnEnvironmentFederationParametersPropertyDsl.() -> Unit
      = {}): CfnEnvironment.FederationParametersProperty {
    val builder = CfnEnvironmentFederationParametersPropertyDsl()
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
      fun cfnEnvironmentSuperuserParametersProperty(block: CfnEnvironmentSuperuserParametersPropertyDsl.() -> Unit
      = {}): CfnEnvironment.SuperuserParametersProperty {
    val builder = CfnEnvironmentSuperuserParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
