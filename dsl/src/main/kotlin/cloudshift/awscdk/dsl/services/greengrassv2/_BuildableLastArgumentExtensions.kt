@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrassv2

import kotlin.Unit
import software.amazon.awscdk.services.greengrassv2.CfnComponentVersion
import software.amazon.awscdk.services.greengrassv2.CfnDeployment

public inline
    fun CfnComponentVersion.setLambdaFunction(block: CfnComponentVersionLambdaFunctionRecipeSourcePropertyDsl.() -> Unit
    = {}) {
  val builder = CfnComponentVersionLambdaFunctionRecipeSourcePropertyDsl()
  builder.apply(block)
  return setLambdaFunction(builder.build())
}

public inline
    fun CfnDeployment.setDeploymentPolicies(block: CfnDeploymentDeploymentPoliciesPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDeploymentDeploymentPoliciesPropertyDsl()
  builder.apply(block)
  return setDeploymentPolicies(builder.build())
}

public inline
    fun CfnDeployment.setIotJobConfiguration(block: CfnDeploymentDeploymentIoTJobConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDeploymentDeploymentIoTJobConfigurationPropertyDsl()
  builder.apply(block)
  return setIotJobConfiguration(builder.build())
}
