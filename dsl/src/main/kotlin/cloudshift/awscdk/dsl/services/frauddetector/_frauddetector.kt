@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.frauddetector

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.frauddetector.CfnDetector
import software.amazon.awscdk.services.frauddetector.CfnDetectorProps
import software.amazon.awscdk.services.frauddetector.CfnEntityType
import software.amazon.awscdk.services.frauddetector.CfnEntityTypeProps
import software.amazon.awscdk.services.frauddetector.CfnEventType
import software.amazon.awscdk.services.frauddetector.CfnEventTypeProps
import software.amazon.awscdk.services.frauddetector.CfnLabel
import software.amazon.awscdk.services.frauddetector.CfnLabelProps
import software.amazon.awscdk.services.frauddetector.CfnList
import software.amazon.awscdk.services.frauddetector.CfnListProps
import software.amazon.awscdk.services.frauddetector.CfnOutcome
import software.amazon.awscdk.services.frauddetector.CfnOutcomeProps
import software.amazon.awscdk.services.frauddetector.CfnVariable
import software.amazon.awscdk.services.frauddetector.CfnVariableProps
import software.constructs.Construct

public object frauddetector {
  public inline fun cfnDetector(
    scope: Construct,
    id: String,
    block: CfnDetectorDsl.() -> Unit = {},
  ): CfnDetector {
    val builder = CfnDetectorDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDetectorEntityTypeProperty(block: CfnDetectorEntityTypePropertyDsl.() -> Unit
      = {}): CfnDetector.EntityTypeProperty {
    val builder = CfnDetectorEntityTypePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDetectorEventTypeProperty(block: CfnDetectorEventTypePropertyDsl.() -> Unit =
      {}): CfnDetector.EventTypeProperty {
    val builder = CfnDetectorEventTypePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDetectorEventVariableProperty(block: CfnDetectorEventVariablePropertyDsl.() -> Unit =
      {}): CfnDetector.EventVariableProperty {
    val builder = CfnDetectorEventVariablePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDetectorLabelProperty(block: CfnDetectorLabelPropertyDsl.() -> Unit = {}):
      CfnDetector.LabelProperty {
    val builder = CfnDetectorLabelPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDetectorModelProperty(block: CfnDetectorModelPropertyDsl.() -> Unit = {}):
      CfnDetector.ModelProperty {
    val builder = CfnDetectorModelPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDetectorOutcomeProperty(block: CfnDetectorOutcomePropertyDsl.() -> Unit =
      {}): CfnDetector.OutcomeProperty {
    val builder = CfnDetectorOutcomePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDetectorProps(block: CfnDetectorPropsDsl.() -> Unit = {}): CfnDetectorProps {
    val builder = CfnDetectorPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDetectorRuleProperty(block: CfnDetectorRulePropertyDsl.() -> Unit = {}):
      CfnDetector.RuleProperty {
    val builder = CfnDetectorRulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEntityType(
    scope: Construct,
    id: String,
    block: CfnEntityTypeDsl.() -> Unit = {},
  ): CfnEntityType {
    val builder = CfnEntityTypeDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEntityTypeProps(block: CfnEntityTypePropsDsl.() -> Unit = {}):
      CfnEntityTypeProps {
    val builder = CfnEntityTypePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEventType(
    scope: Construct,
    id: String,
    block: CfnEventTypeDsl.() -> Unit = {},
  ): CfnEventType {
    val builder = CfnEventTypeDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEventTypeEntityTypeProperty(block: CfnEventTypeEntityTypePropertyDsl.() -> Unit = {}):
      CfnEventType.EntityTypeProperty {
    val builder = CfnEventTypeEntityTypePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEventTypeEventVariableProperty(block: CfnEventTypeEventVariablePropertyDsl.() -> Unit =
      {}): CfnEventType.EventVariableProperty {
    val builder = CfnEventTypeEventVariablePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEventTypeLabelProperty(block: CfnEventTypeLabelPropertyDsl.() -> Unit = {}):
      CfnEventType.LabelProperty {
    val builder = CfnEventTypeLabelPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEventTypeProps(block: CfnEventTypePropsDsl.() -> Unit = {}):
      CfnEventTypeProps {
    val builder = CfnEventTypePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnLabel(
    scope: Construct,
    id: String,
    block: CfnLabelDsl.() -> Unit = {},
  ): CfnLabel {
    val builder = CfnLabelDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnLabelProps(block: CfnLabelPropsDsl.() -> Unit = {}): CfnLabelProps {
    val builder = CfnLabelPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnList(
    scope: Construct,
    id: String,
    block: CfnListDsl.() -> Unit = {},
  ): CfnList {
    val builder = CfnListDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnListProps(block: CfnListPropsDsl.() -> Unit = {}): CfnListProps {
    val builder = CfnListPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnOutcome(
    scope: Construct,
    id: String,
    block: CfnOutcomeDsl.() -> Unit = {},
  ): CfnOutcome {
    val builder = CfnOutcomeDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnOutcomeProps(block: CfnOutcomePropsDsl.() -> Unit = {}): CfnOutcomeProps {
    val builder = CfnOutcomePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnVariable(
    scope: Construct,
    id: String,
    block: CfnVariableDsl.() -> Unit = {},
  ): CfnVariable {
    val builder = CfnVariableDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnVariableProps(block: CfnVariablePropsDsl.() -> Unit = {}): CfnVariableProps {
    val builder = CfnVariablePropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
