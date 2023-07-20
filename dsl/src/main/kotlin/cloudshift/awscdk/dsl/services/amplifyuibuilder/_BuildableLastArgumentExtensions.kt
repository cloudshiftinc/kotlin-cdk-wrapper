@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.amplifyuibuilder

import kotlin.Unit
import software.amazon.awscdk.services.amplifyuibuilder.CfnForm

public inline fun CfnForm.setDataType(block: CfnFormFormDataTypeConfigPropertyDsl.() -> Unit = {}) {
  val builder = CfnFormFormDataTypeConfigPropertyDsl()
  builder.apply(block)
  return setDataType(builder.build())
}

public inline fun CfnForm.setStyle(block: CfnFormFormStylePropertyDsl.() -> Unit = {}) {
  val builder = CfnFormFormStylePropertyDsl()
  builder.apply(block)
  return setStyle(builder.build())
}

public inline fun CfnForm.setCta(block: CfnFormFormCTAPropertyDsl.() -> Unit = {}) {
  val builder = CfnFormFormCTAPropertyDsl()
  builder.apply(block)
  return setCta(builder.build())
}
