@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.triggers

public enum class InvocationType(
  private val cdkObject: software.amazon.awscdk.triggers.InvocationType,
) {
  EVENT(software.amazon.awscdk.triggers.InvocationType.EVENT),
  REQUEST_RESPONSE(software.amazon.awscdk.triggers.InvocationType.REQUEST_RESPONSE),
  DRY_RUN(software.amazon.awscdk.triggers.InvocationType.DRY_RUN),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.triggers.InvocationType): InvocationType =
        when (cdkObject) {
      software.amazon.awscdk.triggers.InvocationType.EVENT -> InvocationType.EVENT
      software.amazon.awscdk.triggers.InvocationType.REQUEST_RESPONSE ->
          InvocationType.REQUEST_RESPONSE
      software.amazon.awscdk.triggers.InvocationType.DRY_RUN -> InvocationType.DRY_RUN
    }

    internal fun unwrap(wrapped: InvocationType): software.amazon.awscdk.triggers.InvocationType =
        wrapped.cdkObject
  }
}
