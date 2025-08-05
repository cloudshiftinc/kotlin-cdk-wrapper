@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

public enum class ArtifactType(
  private val cdkObject: software.amazon.awscdk.cloudassembly.schema.ArtifactType,
) {
  NONE(software.amazon.awscdk.cloudassembly.schema.ArtifactType.NONE),
  AWS_CLOUDFORMATION_STACK(software.amazon.awscdk.cloudassembly.schema.ArtifactType.AWS_CLOUDFORMATION_STACK),
  CDK_TREE(software.amazon.awscdk.cloudassembly.schema.ArtifactType.CDK_TREE),
  ASSET_MANIFEST(software.amazon.awscdk.cloudassembly.schema.ArtifactType.ASSET_MANIFEST),
  NESTED_CLOUD_ASSEMBLY(software.amazon.awscdk.cloudassembly.schema.ArtifactType.NESTED_CLOUD_ASSEMBLY),
  FEATURE_FLAG_REPORT(software.amazon.awscdk.cloudassembly.schema.ArtifactType.FEATURE_FLAG_REPORT),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.ArtifactType):
        ArtifactType = when (cdkObject) {
      software.amazon.awscdk.cloudassembly.schema.ArtifactType.NONE -> ArtifactType.NONE
      software.amazon.awscdk.cloudassembly.schema.ArtifactType.AWS_CLOUDFORMATION_STACK ->
          ArtifactType.AWS_CLOUDFORMATION_STACK
      software.amazon.awscdk.cloudassembly.schema.ArtifactType.CDK_TREE -> ArtifactType.CDK_TREE
      software.amazon.awscdk.cloudassembly.schema.ArtifactType.ASSET_MANIFEST ->
          ArtifactType.ASSET_MANIFEST
      software.amazon.awscdk.cloudassembly.schema.ArtifactType.NESTED_CLOUD_ASSEMBLY ->
          ArtifactType.NESTED_CLOUD_ASSEMBLY
      software.amazon.awscdk.cloudassembly.schema.ArtifactType.FEATURE_FLAG_REPORT ->
          ArtifactType.FEATURE_FLAG_REPORT
    }

    internal fun unwrap(wrapped: ArtifactType):
        software.amazon.awscdk.cloudassembly.schema.ArtifactType = wrapped.cdkObject
  }
}
