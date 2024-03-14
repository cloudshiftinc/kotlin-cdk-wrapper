package io.cloudshiftdev.awscdk.services.codepipeline.actions

public enum class StackSetOrganizationsAutoDeployment(
  private val cdkObject:
      software.amazon.awscdk.services.codepipeline.actions.StackSetOrganizationsAutoDeployment,
) {
  ENABLED(software.amazon.awscdk.services.codepipeline.actions.StackSetOrganizationsAutoDeployment.ENABLED),
  DISABLED(software.amazon.awscdk.services.codepipeline.actions.StackSetOrganizationsAutoDeployment.DISABLED),
  ENABLED_WITH_STACK_RETENTION(software.amazon.awscdk.services.codepipeline.actions.StackSetOrganizationsAutoDeployment.ENABLED_WITH_STACK_RETENTION),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.StackSetOrganizationsAutoDeployment):
        StackSetOrganizationsAutoDeployment = when (cdkObject) {
      software.amazon.awscdk.services.codepipeline.actions.StackSetOrganizationsAutoDeployment.ENABLED ->
          StackSetOrganizationsAutoDeployment.ENABLED
      software.amazon.awscdk.services.codepipeline.actions.StackSetOrganizationsAutoDeployment.DISABLED ->
          StackSetOrganizationsAutoDeployment.DISABLED
      software.amazon.awscdk.services.codepipeline.actions.StackSetOrganizationsAutoDeployment.ENABLED_WITH_STACK_RETENTION ->
          StackSetOrganizationsAutoDeployment.ENABLED_WITH_STACK_RETENTION
    }

    internal fun unwrap(wrapped: StackSetOrganizationsAutoDeployment):
        software.amazon.awscdk.services.codepipeline.actions.StackSetOrganizationsAutoDeployment =
        wrapped.cdkObject
  }
}
