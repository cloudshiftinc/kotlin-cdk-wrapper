@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch.actions

public enum class OpsItemCategory(
  private val cdkObject: software.amazon.awscdk.services.cloudwatch.actions.OpsItemCategory,
) {
  AVAILABILITY(software.amazon.awscdk.services.cloudwatch.actions.OpsItemCategory.AVAILABILITY),
  COST(software.amazon.awscdk.services.cloudwatch.actions.OpsItemCategory.COST),
  PERFORMANCE(software.amazon.awscdk.services.cloudwatch.actions.OpsItemCategory.PERFORMANCE),
  RECOVERY(software.amazon.awscdk.services.cloudwatch.actions.OpsItemCategory.RECOVERY),
  SECURITY(software.amazon.awscdk.services.cloudwatch.actions.OpsItemCategory.SECURITY),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.actions.OpsItemCategory):
        OpsItemCategory = when (cdkObject) {
      software.amazon.awscdk.services.cloudwatch.actions.OpsItemCategory.AVAILABILITY ->
          OpsItemCategory.AVAILABILITY
      software.amazon.awscdk.services.cloudwatch.actions.OpsItemCategory.COST ->
          OpsItemCategory.COST
      software.amazon.awscdk.services.cloudwatch.actions.OpsItemCategory.PERFORMANCE ->
          OpsItemCategory.PERFORMANCE
      software.amazon.awscdk.services.cloudwatch.actions.OpsItemCategory.RECOVERY ->
          OpsItemCategory.RECOVERY
      software.amazon.awscdk.services.cloudwatch.actions.OpsItemCategory.SECURITY ->
          OpsItemCategory.SECURITY
    }

    internal fun unwrap(wrapped: OpsItemCategory):
        software.amazon.awscdk.services.cloudwatch.actions.OpsItemCategory = wrapped.cdkObject
  }
}
