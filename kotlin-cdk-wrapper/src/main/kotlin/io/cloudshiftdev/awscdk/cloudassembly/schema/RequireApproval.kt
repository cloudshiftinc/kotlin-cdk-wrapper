@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

public enum class RequireApproval(
  private val cdkObject: software.amazon.awscdk.cloudassembly.schema.RequireApproval,
) {
  NEVER(software.amazon.awscdk.cloudassembly.schema.RequireApproval.NEVER),
  ANYCHANGE(software.amazon.awscdk.cloudassembly.schema.RequireApproval.ANYCHANGE),
  BROADENING(software.amazon.awscdk.cloudassembly.schema.RequireApproval.BROADENING),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.RequireApproval):
        RequireApproval = when (cdkObject) {
      software.amazon.awscdk.cloudassembly.schema.RequireApproval.NEVER -> RequireApproval.NEVER
      software.amazon.awscdk.cloudassembly.schema.RequireApproval.ANYCHANGE ->
          RequireApproval.ANYCHANGE
      software.amazon.awscdk.cloudassembly.schema.RequireApproval.BROADENING ->
          RequireApproval.BROADENING
    }

    internal fun unwrap(wrapped: RequireApproval):
        software.amazon.awscdk.cloudassembly.schema.RequireApproval = wrapped.cdkObject
  }
}
