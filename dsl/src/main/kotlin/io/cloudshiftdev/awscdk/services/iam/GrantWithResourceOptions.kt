package io.cloudshiftdev.awscdk.services.iam

import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface GrantWithResourceOptions : CommonGrantOptions {
  public fun resource(): IResourceWithPolicy

  public fun resourceSelfArns(): List<String> = unwrap(this).getResourceSelfArns() ?: emptyList()

  public interface Builder {
    public fun actions(actions: List<String>) {
    }

    public fun conditions(conditions: Map<String, Map<String, Any>>) {
    }

    public fun grantee(grantee: IGrantable) {
    }

    public fun resource(resource: IResourceWithPolicy) {
    }

    public fun resourceArns(resourceArns: List<String>) {
    }

    public fun resourceSelfArns(resourceSelfArns: List<String>) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.GrantWithResourceOptions.Builder =
        software.amazon.awscdk.services.iam.GrantWithResourceOptions.builder()

    public override fun actions(actions: List<String>) {
      cdkBuilder.actions(actions)
    }

    public override fun conditions(conditions: Map<String, Map<String, Any>>) {
      cdkBuilder.conditions(conditions)
    }

    public override fun grantee(grantee: IGrantable) {
      cdkBuilder.grantee(grantee.let(IGrantable::unwrap))
    }

    public override fun resource(resource: IResourceWithPolicy) {
      cdkBuilder.resource(resource.let(IResourceWithPolicy::unwrap))
    }

    public override fun resourceArns(resourceArns: List<String>) {
      cdkBuilder.resourceArns(resourceArns)
    }

    public override fun resourceSelfArns(resourceSelfArns: List<String>) {
      cdkBuilder.resourceSelfArns(resourceSelfArns)
    }

    public fun build(): software.amazon.awscdk.services.iam.GrantWithResourceOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.iam.GrantWithResourceOptions,
  ) : GrantWithResourceOptions {
    public override fun actions(): List<String> = unwrap(this).getActions() ?: emptyList()

    public override fun conditions(): Map<String, Map<String, Any>> = unwrap(this).getConditions()
        ?: emptyMap()

    public override fun grantee(): IGrantable = unwrap(this).getGrantee().let(IGrantable::wrap)

    public override fun resource(): IResourceWithPolicy =
        unwrap(this).getResource().let(IResourceWithPolicy::wrap)

    public override fun resourceArns(): List<String> = unwrap(this).getResourceArns() ?: emptyList()

    public override fun resourceSelfArns(): List<String> = unwrap(this).getResourceSelfArns() ?:
        emptyList()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): GrantWithResourceOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.GrantWithResourceOptions):
        GrantWithResourceOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: GrantWithResourceOptions):
        software.amazon.awscdk.services.iam.GrantWithResourceOptions = (wrapped as
        Wrapper).cdkObject
  }
}
