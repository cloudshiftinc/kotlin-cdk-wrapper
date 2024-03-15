@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface GrantOnPrincipalAndResourceOptions : CommonGrantOptions {
  public fun resource(): IResourceWithPolicy

  public fun resourcePolicyPrincipal(): IPrincipal? =
      unwrap(this).getResourcePolicyPrincipal()?.let(IPrincipal::wrap)

  public fun resourceSelfArns(): List<String> = unwrap(this).getResourceSelfArns() ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun actions(actions: List<String>)

    public fun actions(vararg actions: String)

    public fun conditions(conditions: Map<String, Map<String, Any>>)

    public fun grantee(grantee: IGrantable)

    public fun resource(resource: IResourceWithPolicy)

    public fun resourceArns(resourceArns: List<String>)

    public fun resourceArns(vararg resourceArns: String)

    public fun resourcePolicyPrincipal(resourcePolicyPrincipal: IPrincipal)

    public fun resourceSelfArns(resourceSelfArns: List<String>)

    public fun resourceSelfArns(vararg resourceSelfArns: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.iam.GrantOnPrincipalAndResourceOptions.Builder =
        software.amazon.awscdk.services.iam.GrantOnPrincipalAndResourceOptions.builder()

    override fun actions(actions: List<String>) {
      cdkBuilder.actions(actions)
    }

    override fun actions(vararg actions: String): Unit = actions(actions.toList())

    override fun conditions(conditions: Map<String, Map<String, Any>>) {
      cdkBuilder.conditions(conditions)
    }

    override fun grantee(grantee: IGrantable) {
      cdkBuilder.grantee(grantee.let(IGrantable::unwrap))
    }

    override fun resource(resource: IResourceWithPolicy) {
      cdkBuilder.resource(resource.let(IResourceWithPolicy::unwrap))
    }

    override fun resourceArns(resourceArns: List<String>) {
      cdkBuilder.resourceArns(resourceArns)
    }

    override fun resourceArns(vararg resourceArns: String): Unit =
        resourceArns(resourceArns.toList())

    override fun resourcePolicyPrincipal(resourcePolicyPrincipal: IPrincipal) {
      cdkBuilder.resourcePolicyPrincipal(resourcePolicyPrincipal.let(IPrincipal::unwrap))
    }

    override fun resourceSelfArns(resourceSelfArns: List<String>) {
      cdkBuilder.resourceSelfArns(resourceSelfArns)
    }

    override fun resourceSelfArns(vararg resourceSelfArns: String): Unit =
        resourceSelfArns(resourceSelfArns.toList())

    public fun build(): software.amazon.awscdk.services.iam.GrantOnPrincipalAndResourceOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iam.GrantOnPrincipalAndResourceOptions,
  ) : CdkObject(cdkObject), GrantOnPrincipalAndResourceOptions {
    override fun actions(): List<String> = unwrap(this).getActions()

    override fun conditions(): Map<String, Map<String, Any>> = unwrap(this).getConditions() ?:
        emptyMap()

    override fun grantee(): IGrantable = unwrap(this).getGrantee().let(IGrantable::wrap)

    override fun resource(): IResourceWithPolicy =
        unwrap(this).getResource().let(IResourceWithPolicy::wrap)

    override fun resourceArns(): List<String> = unwrap(this).getResourceArns()

    override fun resourcePolicyPrincipal(): IPrincipal? =
        unwrap(this).getResourcePolicyPrincipal()?.let(IPrincipal::wrap)

    override fun resourceSelfArns(): List<String> = unwrap(this).getResourceSelfArns() ?:
        emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GrantOnPrincipalAndResourceOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.iam.GrantOnPrincipalAndResourceOptions):
        GrantOnPrincipalAndResourceOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: GrantOnPrincipalAndResourceOptions):
        software.amazon.awscdk.services.iam.GrantOnPrincipalAndResourceOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.iam.GrantOnPrincipalAndResourceOptions
  }
}
