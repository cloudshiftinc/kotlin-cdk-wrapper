@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.inspector

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.inspector.CfnAssessmentTarget
import software.amazon.awscdk.services.inspector.CfnAssessmentTargetProps
import software.amazon.awscdk.services.inspector.CfnAssessmentTemplate
import software.amazon.awscdk.services.inspector.CfnAssessmentTemplateProps
import software.amazon.awscdk.services.inspector.CfnResourceGroup
import software.amazon.awscdk.services.inspector.CfnResourceGroupProps
import software.constructs.Construct

public object inspector {
  public inline fun cfnAssessmentTarget(
    scope: Construct,
    id: String,
    block: CfnAssessmentTargetDsl.() -> Unit = {},
  ): CfnAssessmentTarget {
    val builder = CfnAssessmentTargetDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAssessmentTargetProps(block: CfnAssessmentTargetPropsDsl.() -> Unit = {}):
      CfnAssessmentTargetProps {
    val builder = CfnAssessmentTargetPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAssessmentTemplate(
    scope: Construct,
    id: String,
    block: CfnAssessmentTemplateDsl.() -> Unit = {},
  ): CfnAssessmentTemplate {
    val builder = CfnAssessmentTemplateDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAssessmentTemplateProps(block: CfnAssessmentTemplatePropsDsl.() -> Unit =
      {}): CfnAssessmentTemplateProps {
    val builder = CfnAssessmentTemplatePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnResourceGroup(
    scope: Construct,
    id: String,
    block: CfnResourceGroupDsl.() -> Unit = {},
  ): CfnResourceGroup {
    val builder = CfnResourceGroupDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnResourceGroupProps(block: CfnResourceGroupPropsDsl.() -> Unit = {}):
      CfnResourceGroupProps {
    val builder = CfnResourceGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
