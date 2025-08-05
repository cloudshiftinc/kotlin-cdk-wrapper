@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloud_assembly_schema

public enum class ArtifactType(
  private val cdkObject: software.amazon.awscdk.cloud_assembly_schema.ArtifactType,
) {
  NONE(software.amazon.awscdk.cloud_assembly_schema.ArtifactType.NONE),
  AWS_CLOUDFORMATION_STACK(software.amazon.awscdk.cloud_assembly_schema.ArtifactType.AWS_CLOUDFORMATION_STACK),
  CDK_TREE(software.amazon.awscdk.cloud_assembly_schema.ArtifactType.CDK_TREE),
  ASSET_MANIFEST(software.amazon.awscdk.cloud_assembly_schema.ArtifactType.ASSET_MANIFEST),
  NESTED_CLOUD_ASSEMBLY(software.amazon.awscdk.cloud_assembly_schema.ArtifactType.NESTED_CLOUD_ASSEMBLY),
  FEATURE_FLAG_REPORT(software.amazon.awscdk.cloud_assembly_schema.ArtifactType.FEATURE_FLAG_REPORT),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.cloud_assembly_schema.ArtifactType):
        ArtifactType = when (cdkObject) {
      software.amazon.awscdk.cloud_assembly_schema.ArtifactType.NONE -> ArtifactType.NONE
      software.amazon.awscdk.cloud_assembly_schema.ArtifactType.AWS_CLOUDFORMATION_STACK ->
          ArtifactType.AWS_CLOUDFORMATION_STACK
      software.amazon.awscdk.cloud_assembly_schema.ArtifactType.CDK_TREE -> ArtifactType.CDK_TREE
      software.amazon.awscdk.cloud_assembly_schema.ArtifactType.ASSET_MANIFEST ->
          ArtifactType.ASSET_MANIFEST
      software.amazon.awscdk.cloud_assembly_schema.ArtifactType.NESTED_CLOUD_ASSEMBLY ->
          ArtifactType.NESTED_CLOUD_ASSEMBLY
      software.amazon.awscdk.cloud_assembly_schema.ArtifactType.FEATURE_FLAG_REPORT ->
          ArtifactType.FEATURE_FLAG_REPORT
    }

    internal fun unwrap(wrapped: ArtifactType):
        software.amazon.awscdk.cloud_assembly_schema.ArtifactType = wrapped.cdkObject
  }
}
