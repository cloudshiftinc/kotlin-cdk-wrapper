@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

public enum class AuthType(
  private val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.AuthType,
) {
  NO_AUTH(software.amazon.awscdk.services.stepfunctions.tasks.AuthType.NO_AUTH),
  IAM_ROLE(software.amazon.awscdk.services.stepfunctions.tasks.AuthType.IAM_ROLE),
  RESOURCE_POLICY(software.amazon.awscdk.services.stepfunctions.tasks.AuthType.RESOURCE_POLICY),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.AuthType):
        AuthType = when (cdkObject) {
      software.amazon.awscdk.services.stepfunctions.tasks.AuthType.NO_AUTH -> AuthType.NO_AUTH
      software.amazon.awscdk.services.stepfunctions.tasks.AuthType.IAM_ROLE -> AuthType.IAM_ROLE
      software.amazon.awscdk.services.stepfunctions.tasks.AuthType.RESOURCE_POLICY ->
          AuthType.RESOURCE_POLICY
    }

    internal fun unwrap(wrapped: AuthType):
        software.amazon.awscdk.services.stepfunctions.tasks.AuthType = wrapped.cdkObject
  }
}
