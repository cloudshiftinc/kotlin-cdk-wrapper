@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class StackSetDeploymentModel internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.codepipeline.actions.StackSetDeploymentModel,
) : CdkObject(cdkObject) {
  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.codepipeline.actions.StackSetDeploymentModel,
  ) : StackSetDeploymentModel(cdkObject)

  public companion object {
    public fun organizations(): StackSetDeploymentModel =
        software.amazon.awscdk.services.codepipeline.actions.StackSetDeploymentModel.organizations().let(StackSetDeploymentModel::wrap)

    public fun organizations(props: OrganizationsDeploymentProps): StackSetDeploymentModel =
        software.amazon.awscdk.services.codepipeline.actions.StackSetDeploymentModel.organizations(props.let(OrganizationsDeploymentProps::unwrap)).let(StackSetDeploymentModel::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e105658e12856cc49c5140211e41158380b040deac477a50924f8cf64ea4dd3c")
    public fun organizations(props: OrganizationsDeploymentProps.Builder.() -> Unit):
        StackSetDeploymentModel = organizations(OrganizationsDeploymentProps(props))

    public fun selfManaged(): StackSetDeploymentModel =
        software.amazon.awscdk.services.codepipeline.actions.StackSetDeploymentModel.selfManaged().let(StackSetDeploymentModel::wrap)

    public fun selfManaged(props: SelfManagedDeploymentProps): StackSetDeploymentModel =
        software.amazon.awscdk.services.codepipeline.actions.StackSetDeploymentModel.selfManaged(props.let(SelfManagedDeploymentProps::unwrap)).let(StackSetDeploymentModel::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("70b9e9c45bd8d5aa4c4dd5196158ab5f3f2068a91a1e44c4fbf43ff439475cdc")
    public fun selfManaged(props: SelfManagedDeploymentProps.Builder.() -> Unit):
        StackSetDeploymentModel = selfManaged(SelfManagedDeploymentProps(props))

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.StackSetDeploymentModel):
        StackSetDeploymentModel = Wrapper(cdkObject)

    internal fun unwrap(wrapped: StackSetDeploymentModel):
        software.amazon.awscdk.services.codepipeline.actions.StackSetDeploymentModel = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.StackSetDeploymentModel
  }
}
