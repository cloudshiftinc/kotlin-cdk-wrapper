@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloud_assembly_schema

public enum class ArtifactMetadataEntryType(
  private val cdkObject: software.amazon.awscdk.cloud_assembly_schema.ArtifactMetadataEntryType,
) {
  ASSET(software.amazon.awscdk.cloud_assembly_schema.ArtifactMetadataEntryType.ASSET),
  INFO(software.amazon.awscdk.cloud_assembly_schema.ArtifactMetadataEntryType.INFO),
  WARN(software.amazon.awscdk.cloud_assembly_schema.ArtifactMetadataEntryType.WARN),
  ERROR(software.amazon.awscdk.cloud_assembly_schema.ArtifactMetadataEntryType.ERROR),
  LOGICAL_ID(software.amazon.awscdk.cloud_assembly_schema.ArtifactMetadataEntryType.LOGICAL_ID),
  STACK_TAGS(software.amazon.awscdk.cloud_assembly_schema.ArtifactMetadataEntryType.STACK_TAGS),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.cloud_assembly_schema.ArtifactMetadataEntryType):
        ArtifactMetadataEntryType = when (cdkObject) {
      software.amazon.awscdk.cloud_assembly_schema.ArtifactMetadataEntryType.ASSET ->
          ArtifactMetadataEntryType.ASSET
      software.amazon.awscdk.cloud_assembly_schema.ArtifactMetadataEntryType.INFO ->
          ArtifactMetadataEntryType.INFO
      software.amazon.awscdk.cloud_assembly_schema.ArtifactMetadataEntryType.WARN ->
          ArtifactMetadataEntryType.WARN
      software.amazon.awscdk.cloud_assembly_schema.ArtifactMetadataEntryType.ERROR ->
          ArtifactMetadataEntryType.ERROR
      software.amazon.awscdk.cloud_assembly_schema.ArtifactMetadataEntryType.LOGICAL_ID ->
          ArtifactMetadataEntryType.LOGICAL_ID
      software.amazon.awscdk.cloud_assembly_schema.ArtifactMetadataEntryType.STACK_TAGS ->
          ArtifactMetadataEntryType.STACK_TAGS
    }

    internal fun unwrap(wrapped: ArtifactMetadataEntryType):
        software.amazon.awscdk.cloud_assembly_schema.ArtifactMetadataEntryType = wrapped.cdkObject
  }
}
