@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.systemsmanagersap

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.systemsmanagersap.CfnApplication
import software.amazon.awscdk.services.systemsmanagersap.CfnApplicationProps
import software.constructs.Construct

public object systemsmanagersap {
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
      fun cfnApplicationCredentialProperty(block: CfnApplicationCredentialPropertyDsl.() -> Unit =
      {}): CfnApplication.CredentialProperty {
    val builder = CfnApplicationCredentialPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnApplicationProps(block: CfnApplicationPropsDsl.() -> Unit = {}):
      CfnApplicationProps {
    val builder = CfnApplicationPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
