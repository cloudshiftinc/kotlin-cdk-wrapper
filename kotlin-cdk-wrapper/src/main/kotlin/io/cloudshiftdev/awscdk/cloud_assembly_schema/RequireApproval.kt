@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloud_assembly_schema

public enum class RequireApproval(
  private val cdkObject: software.amazon.awscdk.cloud_assembly_schema.RequireApproval,
) {
  NEVER(software.amazon.awscdk.cloud_assembly_schema.RequireApproval.NEVER),
  ANYCHANGE(software.amazon.awscdk.cloud_assembly_schema.RequireApproval.ANYCHANGE),
  BROADENING(software.amazon.awscdk.cloud_assembly_schema.RequireApproval.BROADENING),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.cloud_assembly_schema.RequireApproval):
        RequireApproval = when (cdkObject) {
      software.amazon.awscdk.cloud_assembly_schema.RequireApproval.NEVER -> RequireApproval.NEVER
      software.amazon.awscdk.cloud_assembly_schema.RequireApproval.ANYCHANGE ->
          RequireApproval.ANYCHANGE
      software.amazon.awscdk.cloud_assembly_schema.RequireApproval.BROADENING ->
          RequireApproval.BROADENING
    }

    internal fun unwrap(wrapped: RequireApproval):
        software.amazon.awscdk.cloud_assembly_schema.RequireApproval = wrapped.cdkObject
  }
}
