@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrassv2

import kotlin.Unit
import software.amazon.awscdk.services.greengrassv2.CfnComponentVersion
import software.amazon.awscdk.services.greengrassv2.CfnDeployment

/**
 * The deployment policies for the deployment.
 */
public inline
    fun CfnDeployment.setDeploymentPolicies(block: CfnDeploymentDeploymentPoliciesPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDeploymentDeploymentPoliciesPropertyDsl()
  builder.apply(block)
  return setDeploymentPolicies(builder.build())
}

/**
 * The job configuration for the deployment configuration.
 */
public inline
    fun CfnDeployment.setIotJobConfiguration(block: CfnDeploymentDeploymentIoTJobConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDeploymentDeploymentIoTJobConfigurationPropertyDsl()
  builder.apply(block)
  return setIotJobConfiguration(builder.build())
}

/**
 * The parameters to create a component from a Lambda function.
 */
public inline
    fun CfnComponentVersion.setLambdaFunction(block: CfnComponentVersionLambdaFunctionRecipeSourcePropertyDsl.() -> Unit
    = {}) {
  val builder = CfnComponentVersionLambdaFunctionRecipeSourcePropertyDsl()
  builder.apply(block)
  return setLambdaFunction(builder.build())
}
