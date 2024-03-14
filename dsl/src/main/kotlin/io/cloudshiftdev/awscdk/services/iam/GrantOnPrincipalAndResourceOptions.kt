package io.cloudshiftdev.awscdk.services.iam

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

  public interface Builder {
    public fun actions(actions: List<String>)

    public fun conditions(conditions: Map<String, Map<String, Any>>)

    public fun grantee(grantee: IGrantable)

    public fun resource(resource: IResourceWithPolicy)

    public fun resourceArns(resourceArns: List<String>)

    public fun resourcePolicyPrincipal(resourcePolicyPrincipal: IPrincipal)

    public fun resourceSelfArns(resourceSelfArns: List<String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.iam.GrantOnPrincipalAndResourceOptions.Builder =
        software.amazon.awscdk.services.iam.GrantOnPrincipalAndResourceOptions.builder()

    override fun actions(actions: List<String>) {
      cdkBuilder.actions(actions)
    }

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

    override fun resourcePolicyPrincipal(resourcePolicyPrincipal: IPrincipal) {
      cdkBuilder.resourcePolicyPrincipal(resourcePolicyPrincipal.let(IPrincipal::unwrap))
    }

    override fun resourceSelfArns(resourceSelfArns: List<String>) {
      cdkBuilder.resourceSelfArns(resourceSelfArns)
    }

    public fun build(): software.amazon.awscdk.services.iam.GrantOnPrincipalAndResourceOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.iam.GrantOnPrincipalAndResourceOptions,
  ) : GrantOnPrincipalAndResourceOptions {
    override fun actions(): List<String> = unwrap(this).getActions() ?: emptyList()

    override fun conditions(): Map<String, Map<String, Any>> = unwrap(this).getConditions() ?:
        emptyMap()

    override fun grantee(): IGrantable = unwrap(this).getGrantee().let(IGrantable::wrap)

    override fun resource(): IResourceWithPolicy =
        unwrap(this).getResource().let(IResourceWithPolicy::wrap)

    override fun resourceArns(): List<String> = unwrap(this).getResourceArns() ?: emptyList()

    override fun resourcePolicyPrincipal(): IPrincipal? =
        unwrap(this).getResourcePolicyPrincipal()?.let(IPrincipal::wrap)

    override fun resourceSelfArns(): List<String> = unwrap(this).getResourceSelfArns() ?:
        emptyList()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): GrantOnPrincipalAndResourceOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.iam.GrantOnPrincipalAndResourceOptions):
        GrantOnPrincipalAndResourceOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: GrantOnPrincipalAndResourceOptions):
        software.amazon.awscdk.services.iam.GrantOnPrincipalAndResourceOptions = (wrapped as
        Wrapper).cdkObject
  }
}
