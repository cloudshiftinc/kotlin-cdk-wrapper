@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssm

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.ssm.CfnAssociation
import software.amazon.awscdk.services.ssm.CfnDocument
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindow
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTarget
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask
import software.amazon.awscdk.services.ssm.CfnParameter
import software.amazon.awscdk.services.ssm.CfnPatchBaseline
import software.amazon.awscdk.services.ssm.CfnResourceDataSync
import software.amazon.awscdk.services.ssm.CfnResourcePolicy

public inline fun CfnAssociation.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnAssociation.setOutputLocation(block: CfnAssociationInstanceAssociationOutputLocationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnAssociationInstanceAssociationOutputLocationPropertyDsl()
  builder.apply(block)
  return setOutputLocation(builder.build())
}

public inline fun CfnDocument.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnMaintenanceWindow.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnMaintenanceWindowTarget.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnMaintenanceWindowTask.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnMaintenanceWindowTask.setLoggingInfo(block: CfnMaintenanceWindowTaskLoggingInfoPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnMaintenanceWindowTaskLoggingInfoPropertyDsl()
  builder.apply(block)
  return setLoggingInfo(builder.build())
}

public inline
    fun CfnMaintenanceWindowTask.setTaskInvocationParameters(block: CfnMaintenanceWindowTaskTaskInvocationParametersPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnMaintenanceWindowTaskTaskInvocationParametersPropertyDsl()
  builder.apply(block)
  return setTaskInvocationParameters(builder.build())
}

public inline fun CfnParameter.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnPatchBaseline.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnPatchBaseline.setApprovalRules(block: CfnPatchBaselineRuleGroupPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnPatchBaselineRuleGroupPropertyDsl()
  builder.apply(block)
  return setApprovalRules(builder.build())
}

public inline
    fun CfnPatchBaseline.setGlobalFilters(block: CfnPatchBaselinePatchFilterGroupPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnPatchBaselinePatchFilterGroupPropertyDsl()
  builder.apply(block)
  return setGlobalFilters(builder.build())
}

public inline fun CfnResourceDataSync.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnResourceDataSync.setS3Destination(block: CfnResourceDataSyncS3DestinationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnResourceDataSyncS3DestinationPropertyDsl()
  builder.apply(block)
  return setS3Destination(builder.build())
}

public inline
    fun CfnResourceDataSync.setSyncSource(block: CfnResourceDataSyncSyncSourcePropertyDsl.() -> Unit
    = {}) {
  val builder = CfnResourceDataSyncSyncSourcePropertyDsl()
  builder.apply(block)
  return setSyncSource(builder.build())
}

public inline fun CfnResourcePolicy.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}
