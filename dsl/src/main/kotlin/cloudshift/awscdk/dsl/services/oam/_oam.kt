@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.oam

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.oam.CfnLink
import software.amazon.awscdk.services.oam.CfnLinkProps
import software.amazon.awscdk.services.oam.CfnSink
import software.amazon.awscdk.services.oam.CfnSinkProps
import software.constructs.Construct

public object oam {
  public inline fun cfnLink(
    scope: Construct,
    id: String,
    block: CfnLinkDsl.() -> Unit = {},
  ): CfnLink {
    val builder = CfnLinkDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnLinkProps(block: CfnLinkPropsDsl.() -> Unit = {}): CfnLinkProps {
    val builder = CfnLinkPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSink(
    scope: Construct,
    id: String,
    block: CfnSinkDsl.() -> Unit = {},
  ): CfnSink {
    val builder = CfnSinkDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSinkProps(block: CfnSinkPropsDsl.() -> Unit = {}): CfnSinkProps {
    val builder = CfnSinkPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
