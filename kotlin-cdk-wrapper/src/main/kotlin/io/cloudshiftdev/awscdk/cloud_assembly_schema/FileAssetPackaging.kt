@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloud_assembly_schema

public enum class FileAssetPackaging(
  private val cdkObject: software.amazon.awscdk.cloud_assembly_schema.FileAssetPackaging,
) {
  FILE(software.amazon.awscdk.cloud_assembly_schema.FileAssetPackaging.FILE),
  ZIP_DIRECTORY(software.amazon.awscdk.cloud_assembly_schema.FileAssetPackaging.ZIP_DIRECTORY),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.cloud_assembly_schema.FileAssetPackaging):
        FileAssetPackaging = when (cdkObject) {
      software.amazon.awscdk.cloud_assembly_schema.FileAssetPackaging.FILE ->
          FileAssetPackaging.FILE
      software.amazon.awscdk.cloud_assembly_schema.FileAssetPackaging.ZIP_DIRECTORY ->
          FileAssetPackaging.ZIP_DIRECTORY
    }

    internal fun unwrap(wrapped: FileAssetPackaging):
        software.amazon.awscdk.cloud_assembly_schema.FileAssetPackaging = wrapped.cdkObject
  }
}
