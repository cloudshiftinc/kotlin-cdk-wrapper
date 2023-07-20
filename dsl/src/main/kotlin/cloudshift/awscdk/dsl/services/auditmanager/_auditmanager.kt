@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.auditmanager

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.auditmanager.CfnAssessment
import software.amazon.awscdk.services.auditmanager.CfnAssessmentProps
import software.constructs.Construct

public object auditmanager {
  public inline fun cfnAssessment(
    scope: Construct,
    id: String,
    block: CfnAssessmentDsl.() -> Unit = {},
  ): CfnAssessment {
    val builder = CfnAssessmentDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAssessmentAWSAccountProperty(block: CfnAssessmentAWSAccountPropertyDsl.() -> Unit =
      {}): CfnAssessment.AWSAccountProperty {
    val builder = CfnAssessmentAWSAccountPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAssessmentAWSServiceProperty(block: CfnAssessmentAWSServicePropertyDsl.() -> Unit =
      {}): CfnAssessment.AWSServiceProperty {
    val builder = CfnAssessmentAWSServicePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAssessmentAssessmentReportsDestinationProperty(block: CfnAssessmentAssessmentReportsDestinationPropertyDsl.() -> Unit
      = {}): CfnAssessment.AssessmentReportsDestinationProperty {
    val builder = CfnAssessmentAssessmentReportsDestinationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAssessmentDelegationProperty(block: CfnAssessmentDelegationPropertyDsl.() -> Unit =
      {}): CfnAssessment.DelegationProperty {
    val builder = CfnAssessmentDelegationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAssessmentProps(block: CfnAssessmentPropsDsl.() -> Unit = {}):
      CfnAssessmentProps {
    val builder = CfnAssessmentPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAssessmentRoleProperty(block: CfnAssessmentRolePropertyDsl.() -> Unit = {}):
      CfnAssessment.RoleProperty {
    val builder = CfnAssessmentRolePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAssessmentScopeProperty(block: CfnAssessmentScopePropertyDsl.() -> Unit =
      {}): CfnAssessment.ScopeProperty {
    val builder = CfnAssessmentScopePropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
