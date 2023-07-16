@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.auditmanager

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.auditmanager.CfnAssessment

public inline fun CfnAssessment.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnAssessment.setAssessmentReportsDestination(block: CfnAssessmentAssessmentReportsDestinationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnAssessmentAssessmentReportsDestinationPropertyDsl()
  builder.apply(block)
  return setAssessmentReportsDestination(builder.build())
}

public inline fun CfnAssessment.setAwsAccount(block: CfnAssessmentAWSAccountPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnAssessmentAWSAccountPropertyDsl()
  builder.apply(block)
  return setAwsAccount(builder.build())
}

public inline fun CfnAssessment.setScope(block: CfnAssessmentScopePropertyDsl.() -> Unit = {}) {
  val builder = CfnAssessmentScopePropertyDsl()
  builder.apply(block)
  return setScope(builder.build())
}
