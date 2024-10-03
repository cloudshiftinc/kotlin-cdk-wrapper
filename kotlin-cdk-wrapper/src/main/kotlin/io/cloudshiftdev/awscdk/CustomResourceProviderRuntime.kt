@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

public enum class CustomResourceProviderRuntime(
  private val cdkObject: software.amazon.awscdk.CustomResourceProviderRuntime,
) {
  NODEJS_12_X(software.amazon.awscdk.CustomResourceProviderRuntime.NODEJS_12_X),
  NODEJS_14_X(software.amazon.awscdk.CustomResourceProviderRuntime.NODEJS_14_X),
  NODEJS_16_X(software.amazon.awscdk.CustomResourceProviderRuntime.NODEJS_16_X),
  NODEJS_18_X(software.amazon.awscdk.CustomResourceProviderRuntime.NODEJS_18_X),
  NODEJS_20_X(software.amazon.awscdk.CustomResourceProviderRuntime.NODEJS_20_X),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.CustomResourceProviderRuntime):
        CustomResourceProviderRuntime = when (cdkObject) {
      software.amazon.awscdk.CustomResourceProviderRuntime.NODEJS_12_X ->
          CustomResourceProviderRuntime.NODEJS_12_X
      software.amazon.awscdk.CustomResourceProviderRuntime.NODEJS_14_X ->
          CustomResourceProviderRuntime.NODEJS_14_X
      software.amazon.awscdk.CustomResourceProviderRuntime.NODEJS_16_X ->
          CustomResourceProviderRuntime.NODEJS_16_X
      software.amazon.awscdk.CustomResourceProviderRuntime.NODEJS_18_X ->
          CustomResourceProviderRuntime.NODEJS_18_X
      software.amazon.awscdk.CustomResourceProviderRuntime.NODEJS_20_X ->
          CustomResourceProviderRuntime.NODEJS_20_X
    }

    internal fun unwrap(wrapped: CustomResourceProviderRuntime):
        software.amazon.awscdk.CustomResourceProviderRuntime = wrapped.cdkObject
  }
}
