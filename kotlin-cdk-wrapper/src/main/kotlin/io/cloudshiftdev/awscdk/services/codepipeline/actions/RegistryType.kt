@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

public enum class RegistryType(
  private val cdkObject: software.amazon.awscdk.services.codepipeline.actions.RegistryType,
) {
  PRIVATE(software.amazon.awscdk.services.codepipeline.actions.RegistryType.PRIVATE),
  PUBLIC(software.amazon.awscdk.services.codepipeline.actions.RegistryType.PUBLIC),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.RegistryType):
        RegistryType = when (cdkObject) {
      software.amazon.awscdk.services.codepipeline.actions.RegistryType.PRIVATE ->
          RegistryType.PRIVATE
      software.amazon.awscdk.services.codepipeline.actions.RegistryType.PUBLIC ->
          RegistryType.PUBLIC
    }

    internal fun unwrap(wrapped: RegistryType):
        software.amazon.awscdk.services.codepipeline.actions.RegistryType = wrapped.cdkObject
  }
}
