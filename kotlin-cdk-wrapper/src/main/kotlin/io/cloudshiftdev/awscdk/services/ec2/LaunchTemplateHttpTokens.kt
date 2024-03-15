@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

public enum class LaunchTemplateHttpTokens(
  private val cdkObject: software.amazon.awscdk.services.ec2.LaunchTemplateHttpTokens,
) {
  OPTIONAL(software.amazon.awscdk.services.ec2.LaunchTemplateHttpTokens.OPTIONAL),
  REQUIRED(software.amazon.awscdk.services.ec2.LaunchTemplateHttpTokens.REQUIRED),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.LaunchTemplateHttpTokens):
        LaunchTemplateHttpTokens = when (cdkObject) {
      software.amazon.awscdk.services.ec2.LaunchTemplateHttpTokens.OPTIONAL ->
          LaunchTemplateHttpTokens.OPTIONAL
      software.amazon.awscdk.services.ec2.LaunchTemplateHttpTokens.REQUIRED ->
          LaunchTemplateHttpTokens.REQUIRED
    }

    internal fun unwrap(wrapped: LaunchTemplateHttpTokens):
        software.amazon.awscdk.services.ec2.LaunchTemplateHttpTokens = wrapped.cdkObject
  }
}
