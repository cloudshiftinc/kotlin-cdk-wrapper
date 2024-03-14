package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Unit

public interface OrganizationsDeploymentProps {
  /**
   * Automatically deploy to new accounts added to Organizational Units.
   *
   * Whether AWS CloudFormation StackSets automatically deploys to AWS
   * Organizations accounts that are added to a target organization or
   * organizational unit (OU).
   *
   * Default: Disabled
   */
  public fun autoDeployment(): StackSetOrganizationsAutoDeployment? =
      unwrap(this).getAutoDeployment()?.let(StackSetOrganizationsAutoDeployment::wrap)

  /**
   * A builder for [OrganizationsDeploymentProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param autoDeployment Automatically deploy to new accounts added to Organizational Units.
     * Whether AWS CloudFormation StackSets automatically deploys to AWS
     * Organizations accounts that are added to a target organization or
     * organizational unit (OU).
     */
    public fun autoDeployment(autoDeployment: StackSetOrganizationsAutoDeployment)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.OrganizationsDeploymentProps.Builder =
        software.amazon.awscdk.services.codepipeline.actions.OrganizationsDeploymentProps.builder()

    /**
     * @param autoDeployment Automatically deploy to new accounts added to Organizational Units.
     * Whether AWS CloudFormation StackSets automatically deploys to AWS
     * Organizations accounts that are added to a target organization or
     * organizational unit (OU).
     */
    override fun autoDeployment(autoDeployment: StackSetOrganizationsAutoDeployment) {
      cdkBuilder.autoDeployment(autoDeployment.let(StackSetOrganizationsAutoDeployment::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.codepipeline.actions.OrganizationsDeploymentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.codepipeline.actions.OrganizationsDeploymentProps,
  ) : CdkObject(cdkObject), OrganizationsDeploymentProps {
    /**
     * Automatically deploy to new accounts added to Organizational Units.
     *
     * Whether AWS CloudFormation StackSets automatically deploys to AWS
     * Organizations accounts that are added to a target organization or
     * organizational unit (OU).
     *
     * Default: Disabled
     */
    override fun autoDeployment(): StackSetOrganizationsAutoDeployment? =
        unwrap(this).getAutoDeployment()?.let(StackSetOrganizationsAutoDeployment::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): OrganizationsDeploymentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.OrganizationsDeploymentProps):
        OrganizationsDeploymentProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: OrganizationsDeploymentProps):
        software.amazon.awscdk.services.codepipeline.actions.OrganizationsDeploymentProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.OrganizationsDeploymentProps
  }
}
