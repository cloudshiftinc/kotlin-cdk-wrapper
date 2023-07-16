@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3objectlambda

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint
import software.amazon.awscdk.services.s3objectlambda.CfnAccessPointPolicy

public inline fun CfnAccessPoint.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnAccessPoint.setObjectLambdaConfiguration(block: CfnAccessPointObjectLambdaConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnAccessPointObjectLambdaConfigurationPropertyDsl()
  builder.apply(block)
  return setObjectLambdaConfiguration(builder.build())
}

public inline fun CfnAccessPointPolicy.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}
