@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53recoveryreadiness

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53recoveryreadiness.CfnCell
import software.amazon.awscdk.services.route53recoveryreadiness.CfnCellProps
import software.amazon.awscdk.services.route53recoveryreadiness.CfnReadinessCheck
import software.amazon.awscdk.services.route53recoveryreadiness.CfnReadinessCheckProps
import software.amazon.awscdk.services.route53recoveryreadiness.CfnRecoveryGroup
import software.amazon.awscdk.services.route53recoveryreadiness.CfnRecoveryGroupProps
import software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet
import software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSetProps
import software.constructs.Construct

public object route53recoveryreadiness {
  public inline fun cfnCell(
    scope: Construct,
    id: String,
    block: CfnCellDsl.() -> Unit = {},
  ): CfnCell {
    val builder = CfnCellDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnCellProps(block: CfnCellPropsDsl.() -> Unit = {}): CfnCellProps {
    val builder = CfnCellPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnReadinessCheck(
    scope: Construct,
    id: String,
    block: CfnReadinessCheckDsl.() -> Unit = {},
  ): CfnReadinessCheck {
    val builder = CfnReadinessCheckDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnReadinessCheckProps(block: CfnReadinessCheckPropsDsl.() -> Unit = {}):
      CfnReadinessCheckProps {
    val builder = CfnReadinessCheckPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRecoveryGroup(
    scope: Construct,
    id: String,
    block: CfnRecoveryGroupDsl.() -> Unit = {},
  ): CfnRecoveryGroup {
    val builder = CfnRecoveryGroupDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRecoveryGroupProps(block: CfnRecoveryGroupPropsDsl.() -> Unit = {}):
      CfnRecoveryGroupProps {
    val builder = CfnRecoveryGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnResourceSet(
    scope: Construct,
    id: String,
    block: CfnResourceSetDsl.() -> Unit = {},
  ): CfnResourceSet {
    val builder = CfnResourceSetDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnResourceSetDNSTargetResourceProperty(block: CfnResourceSetDNSTargetResourcePropertyDsl.() -> Unit
      = {}): CfnResourceSet.DNSTargetResourceProperty {
    val builder = CfnResourceSetDNSTargetResourcePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnResourceSetNLBResourceProperty(block: CfnResourceSetNLBResourcePropertyDsl.() -> Unit =
      {}): CfnResourceSet.NLBResourceProperty {
    val builder = CfnResourceSetNLBResourcePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnResourceSetProps(block: CfnResourceSetPropsDsl.() -> Unit = {}):
      CfnResourceSetProps {
    val builder = CfnResourceSetPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnResourceSetR53ResourceRecordProperty(block: CfnResourceSetR53ResourceRecordPropertyDsl.() -> Unit
      = {}): CfnResourceSet.R53ResourceRecordProperty {
    val builder = CfnResourceSetR53ResourceRecordPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnResourceSetResourceProperty(block: CfnResourceSetResourcePropertyDsl.() -> Unit = {}):
      CfnResourceSet.ResourceProperty {
    val builder = CfnResourceSetResourcePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnResourceSetTargetResourceProperty(block: CfnResourceSetTargetResourcePropertyDsl.() -> Unit
      = {}): CfnResourceSet.TargetResourceProperty {
    val builder = CfnResourceSetTargetResourcePropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
