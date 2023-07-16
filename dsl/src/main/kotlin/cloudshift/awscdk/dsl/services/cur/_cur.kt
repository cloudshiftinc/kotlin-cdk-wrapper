@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cur

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cur.CfnReportDefinition
import software.amazon.awscdk.services.cur.CfnReportDefinitionProps
import software.constructs.Construct

public object cur {
  public inline fun cfnReportDefinition(
    scope: Construct,
    id: String,
    block: CfnReportDefinitionDsl.() -> Unit = {},
  ): CfnReportDefinition {
    val builder = CfnReportDefinitionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnReportDefinitionProps(block: CfnReportDefinitionPropsDsl.() -> Unit = {}):
      CfnReportDefinitionProps {
    val builder = CfnReportDefinitionPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
