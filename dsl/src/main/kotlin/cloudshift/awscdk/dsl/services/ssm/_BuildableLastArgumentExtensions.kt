@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssm

import kotlin.Unit
import software.amazon.awscdk.services.ssm.CfnAssociation
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask
import software.amazon.awscdk.services.ssm.CfnPatchBaseline
import software.amazon.awscdk.services.ssm.CfnResourceDataSync

/**
 * Information about an Amazon S3 bucket to write Run Command task-level logs to.
 */
public inline
    fun CfnMaintenanceWindowTask.setLoggingInfo(block: CfnMaintenanceWindowTaskLoggingInfoPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnMaintenanceWindowTaskLoggingInfoPropertyDsl()
  builder.apply(block)
  return setLoggingInfo(builder.build())
}

/**
 * The parameters to pass to the task when it runs.
 */
public inline
    fun CfnMaintenanceWindowTask.setTaskInvocationParameters(block: CfnMaintenanceWindowTaskTaskInvocationParametersPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnMaintenanceWindowTaskTaskInvocationParametersPropertyDsl()
  builder.apply(block)
  return setTaskInvocationParameters(builder.build())
}

/**
 * A set of rules used to include patches in the baseline.
 */
public inline
    fun CfnPatchBaseline.setApprovalRules(block: CfnPatchBaselineRuleGroupPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnPatchBaselineRuleGroupPropertyDsl()
  builder.apply(block)
  return setApprovalRules(builder.build())
}

/**
 * A set of global filters used to include patches in the baseline.
 */
public inline
    fun CfnPatchBaseline.setGlobalFilters(block: CfnPatchBaselinePatchFilterGroupPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnPatchBaselinePatchFilterGroupPropertyDsl()
  builder.apply(block)
  return setGlobalFilters(builder.build())
}

/**
 * An Amazon Simple Storage Service (Amazon S3) bucket where you want to store the output details of
 * the request.
 */
public inline
    fun CfnAssociation.setOutputLocation(block: CfnAssociationInstanceAssociationOutputLocationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnAssociationInstanceAssociationOutputLocationPropertyDsl()
  builder.apply(block)
  return setOutputLocation(builder.build())
}

/**
 * Configuration information for the target S3 bucket.
 */
public inline
    fun CfnResourceDataSync.setS3Destination(block: CfnResourceDataSyncS3DestinationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnResourceDataSyncS3DestinationPropertyDsl()
  builder.apply(block)
  return setS3Destination(builder.build())
}

/**
 * Information about the source where the data was synchronized.
 */
public inline
    fun CfnResourceDataSync.setSyncSource(block: CfnResourceDataSyncSyncSourcePropertyDsl.() -> Unit
    = {}) {
  val builder = CfnResourceDataSyncSyncSourcePropertyDsl()
  builder.apply(block)
  return setSyncSource(builder.build())
}
