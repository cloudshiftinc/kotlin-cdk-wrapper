@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

public enum class NodegroupAmiType(
  private val cdkObject: software.amazon.awscdk.services.eks.NodegroupAmiType,
) {
  AL2_X86_64(software.amazon.awscdk.services.eks.NodegroupAmiType.AL2_X86_64),
  AL2_X86_64_GPU(software.amazon.awscdk.services.eks.NodegroupAmiType.AL2_X86_64_GPU),
  AL2_ARM_64(software.amazon.awscdk.services.eks.NodegroupAmiType.AL2_ARM_64),
  BOTTLEROCKET_ARM_64(software.amazon.awscdk.services.eks.NodegroupAmiType.BOTTLEROCKET_ARM_64),
  BOTTLEROCKET_X86_64(software.amazon.awscdk.services.eks.NodegroupAmiType.BOTTLEROCKET_X86_64),
  BOTTLEROCKET_ARM_64_NVIDIA(software.amazon.awscdk.services.eks.NodegroupAmiType.BOTTLEROCKET_ARM_64_NVIDIA),
  BOTTLEROCKET_X86_64_NVIDIA(software.amazon.awscdk.services.eks.NodegroupAmiType.BOTTLEROCKET_X86_64_NVIDIA),
  WINDOWS_CORE_2019_X86_64(software.amazon.awscdk.services.eks.NodegroupAmiType.WINDOWS_CORE_2019_X86_64),
  WINDOWS_CORE_2022_X86_64(software.amazon.awscdk.services.eks.NodegroupAmiType.WINDOWS_CORE_2022_X86_64),
  WINDOWS_FULL_2019_X86_64(software.amazon.awscdk.services.eks.NodegroupAmiType.WINDOWS_FULL_2019_X86_64),
  WINDOWS_FULL_2022_X86_64(software.amazon.awscdk.services.eks.NodegroupAmiType.WINDOWS_FULL_2022_X86_64),
  AL2023_X86_64_STANDARD(software.amazon.awscdk.services.eks.NodegroupAmiType.AL2023_X86_64_STANDARD),
  AL2023_ARM_64_STANDARD(software.amazon.awscdk.services.eks.NodegroupAmiType.AL2023_ARM_64_STANDARD),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.NodegroupAmiType):
        NodegroupAmiType = when (cdkObject) {
      software.amazon.awscdk.services.eks.NodegroupAmiType.AL2_X86_64 -> NodegroupAmiType.AL2_X86_64
      software.amazon.awscdk.services.eks.NodegroupAmiType.AL2_X86_64_GPU ->
          NodegroupAmiType.AL2_X86_64_GPU
      software.amazon.awscdk.services.eks.NodegroupAmiType.AL2_ARM_64 -> NodegroupAmiType.AL2_ARM_64
      software.amazon.awscdk.services.eks.NodegroupAmiType.BOTTLEROCKET_ARM_64 ->
          NodegroupAmiType.BOTTLEROCKET_ARM_64
      software.amazon.awscdk.services.eks.NodegroupAmiType.BOTTLEROCKET_X86_64 ->
          NodegroupAmiType.BOTTLEROCKET_X86_64
      software.amazon.awscdk.services.eks.NodegroupAmiType.BOTTLEROCKET_ARM_64_NVIDIA ->
          NodegroupAmiType.BOTTLEROCKET_ARM_64_NVIDIA
      software.amazon.awscdk.services.eks.NodegroupAmiType.BOTTLEROCKET_X86_64_NVIDIA ->
          NodegroupAmiType.BOTTLEROCKET_X86_64_NVIDIA
      software.amazon.awscdk.services.eks.NodegroupAmiType.WINDOWS_CORE_2019_X86_64 ->
          NodegroupAmiType.WINDOWS_CORE_2019_X86_64
      software.amazon.awscdk.services.eks.NodegroupAmiType.WINDOWS_CORE_2022_X86_64 ->
          NodegroupAmiType.WINDOWS_CORE_2022_X86_64
      software.amazon.awscdk.services.eks.NodegroupAmiType.WINDOWS_FULL_2019_X86_64 ->
          NodegroupAmiType.WINDOWS_FULL_2019_X86_64
      software.amazon.awscdk.services.eks.NodegroupAmiType.WINDOWS_FULL_2022_X86_64 ->
          NodegroupAmiType.WINDOWS_FULL_2022_X86_64
      software.amazon.awscdk.services.eks.NodegroupAmiType.AL2023_X86_64_STANDARD ->
          NodegroupAmiType.AL2023_X86_64_STANDARD
      software.amazon.awscdk.services.eks.NodegroupAmiType.AL2023_ARM_64_STANDARD ->
          NodegroupAmiType.AL2023_ARM_64_STANDARD
    }

    internal fun unwrap(wrapped: NodegroupAmiType):
        software.amazon.awscdk.services.eks.NodegroupAmiType = wrapped.cdkObject
  }
}
