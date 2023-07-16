@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.comprehend

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.comprehend.CfnDocumentClassifier
import software.amazon.awscdk.services.comprehend.CfnFlywheel

public inline fun CfnDocumentClassifier.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnDocumentClassifier.setInputDataConfig(block: CfnDocumentClassifierDocumentClassifierInputDataConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDocumentClassifierDocumentClassifierInputDataConfigPropertyDsl()
  builder.apply(block)
  return setInputDataConfig(builder.build())
}

public inline
    fun CfnDocumentClassifier.setOutputDataConfig(block: CfnDocumentClassifierDocumentClassifierOutputDataConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDocumentClassifierDocumentClassifierOutputDataConfigPropertyDsl()
  builder.apply(block)
  return setOutputDataConfig(builder.build())
}

public inline
    fun CfnDocumentClassifier.setVpcConfig(block: CfnDocumentClassifierVpcConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDocumentClassifierVpcConfigPropertyDsl()
  builder.apply(block)
  return setVpcConfig(builder.build())
}

public inline fun CfnFlywheel.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnFlywheel.setDataSecurityConfig(block: CfnFlywheelDataSecurityConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnFlywheelDataSecurityConfigPropertyDsl()
  builder.apply(block)
  return setDataSecurityConfig(builder.build())
}

public inline fun CfnFlywheel.setTaskConfig(block: CfnFlywheelTaskConfigPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnFlywheelTaskConfigPropertyDsl()
  builder.apply(block)
  return setTaskConfig(builder.build())
}
