@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.fsx

public enum class FileSystemTypeVersion(
  private val cdkObject: software.amazon.awscdk.services.fsx.FileSystemTypeVersion,
) {
  V_2_10(software.amazon.awscdk.services.fsx.FileSystemTypeVersion.V_2_10),
  V_2_12(software.amazon.awscdk.services.fsx.FileSystemTypeVersion.V_2_12),
  V_2_15(software.amazon.awscdk.services.fsx.FileSystemTypeVersion.V_2_15),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.fsx.FileSystemTypeVersion):
        FileSystemTypeVersion = when (cdkObject) {
      software.amazon.awscdk.services.fsx.FileSystemTypeVersion.V_2_10 ->
          FileSystemTypeVersion.V_2_10
      software.amazon.awscdk.services.fsx.FileSystemTypeVersion.V_2_12 ->
          FileSystemTypeVersion.V_2_12
      software.amazon.awscdk.services.fsx.FileSystemTypeVersion.V_2_15 ->
          FileSystemTypeVersion.V_2_15
    }

    internal fun unwrap(wrapped: FileSystemTypeVersion):
        software.amazon.awscdk.services.fsx.FileSystemTypeVersion = wrapped.cdkObject
  }
}
