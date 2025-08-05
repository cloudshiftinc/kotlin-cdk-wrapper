@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

public enum class ArtifactMetadataEntryType(
  private val cdkObject: software.amazon.awscdk.cloudassembly.schema.ArtifactMetadataEntryType,
) {
  ASSET(software.amazon.awscdk.cloudassembly.schema.ArtifactMetadataEntryType.ASSET),
  INFO(software.amazon.awscdk.cloudassembly.schema.ArtifactMetadataEntryType.INFO),
  WARN(software.amazon.awscdk.cloudassembly.schema.ArtifactMetadataEntryType.WARN),
  ERROR(software.amazon.awscdk.cloudassembly.schema.ArtifactMetadataEntryType.ERROR),
  LOGICAL_ID(software.amazon.awscdk.cloudassembly.schema.ArtifactMetadataEntryType.LOGICAL_ID),
  STACK_TAGS(software.amazon.awscdk.cloudassembly.schema.ArtifactMetadataEntryType.STACK_TAGS),
  DO_NOT_REFACTOR(software.amazon.awscdk.cloudassembly.schema.ArtifactMetadataEntryType.DO_NOT_REFACTOR),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.ArtifactMetadataEntryType):
        ArtifactMetadataEntryType = when (cdkObject) {
      software.amazon.awscdk.cloudassembly.schema.ArtifactMetadataEntryType.ASSET ->
          ArtifactMetadataEntryType.ASSET
      software.amazon.awscdk.cloudassembly.schema.ArtifactMetadataEntryType.INFO ->
          ArtifactMetadataEntryType.INFO
      software.amazon.awscdk.cloudassembly.schema.ArtifactMetadataEntryType.WARN ->
          ArtifactMetadataEntryType.WARN
      software.amazon.awscdk.cloudassembly.schema.ArtifactMetadataEntryType.ERROR ->
          ArtifactMetadataEntryType.ERROR
      software.amazon.awscdk.cloudassembly.schema.ArtifactMetadataEntryType.LOGICAL_ID ->
          ArtifactMetadataEntryType.LOGICAL_ID
      software.amazon.awscdk.cloudassembly.schema.ArtifactMetadataEntryType.STACK_TAGS ->
          ArtifactMetadataEntryType.STACK_TAGS
      software.amazon.awscdk.cloudassembly.schema.ArtifactMetadataEntryType.DO_NOT_REFACTOR ->
          ArtifactMetadataEntryType.DO_NOT_REFACTOR
    }

    internal fun unwrap(wrapped: ArtifactMetadataEntryType):
        software.amazon.awscdk.cloudassembly.schema.ArtifactMetadataEntryType = wrapped.cdkObject
  }
}
