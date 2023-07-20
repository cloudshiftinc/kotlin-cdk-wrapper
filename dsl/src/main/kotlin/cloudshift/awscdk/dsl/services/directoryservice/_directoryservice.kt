@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.directoryservice

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.directoryservice.CfnMicrosoftAD
import software.amazon.awscdk.services.directoryservice.CfnMicrosoftADProps
import software.amazon.awscdk.services.directoryservice.CfnSimpleAD
import software.amazon.awscdk.services.directoryservice.CfnSimpleADProps
import software.constructs.Construct

public object directoryservice {
  public inline fun cfnMicrosoftAD(
    scope: Construct,
    id: String,
    block: CfnMicrosoftADDsl.() -> Unit = {},
  ): CfnMicrosoftAD {
    val builder = CfnMicrosoftADDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnMicrosoftADProps(block: CfnMicrosoftADPropsDsl.() -> Unit = {}):
      CfnMicrosoftADProps {
    val builder = CfnMicrosoftADPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnMicrosoftADVpcSettingsProperty(block: CfnMicrosoftADVpcSettingsPropertyDsl.() -> Unit =
      {}): CfnMicrosoftAD.VpcSettingsProperty {
    val builder = CfnMicrosoftADVpcSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSimpleAD(
    scope: Construct,
    id: String,
    block: CfnSimpleADDsl.() -> Unit = {},
  ): CfnSimpleAD {
    val builder = CfnSimpleADDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSimpleADProps(block: CfnSimpleADPropsDsl.() -> Unit = {}): CfnSimpleADProps {
    val builder = CfnSimpleADPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSimpleADVpcSettingsProperty(block: CfnSimpleADVpcSettingsPropertyDsl.() -> Unit = {}):
      CfnSimpleAD.VpcSettingsProperty {
    val builder = CfnSimpleADVpcSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
