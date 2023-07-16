@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.amplifyuibuilder

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.amplifyuibuilder.CfnComponent
import software.amazon.awscdk.services.amplifyuibuilder.CfnForm
import software.amazon.awscdk.services.amplifyuibuilder.CfnTheme

public inline fun CfnComponent.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnForm.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnForm.setCta(block: CfnFormFormCTAPropertyDsl.() -> Unit = {}) {
  val builder = CfnFormFormCTAPropertyDsl()
  builder.apply(block)
  return setCta(builder.build())
}

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

public inline fun CfnTheme.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}
