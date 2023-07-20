@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot1click

import kotlin.Unit
import software.amazon.awscdk.services.iot1click.CfnProject

public inline
    fun CfnProject.setPlacementTemplate(block: CfnProjectPlacementTemplatePropertyDsl.() -> Unit =
    {}) {
  val builder = CfnProjectPlacementTemplatePropertyDsl()
  builder.apply(block)
  return setPlacementTemplate(builder.build())
}
