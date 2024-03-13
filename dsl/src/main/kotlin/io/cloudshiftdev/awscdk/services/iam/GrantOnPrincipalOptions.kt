package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.constructs.IConstruct
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface GrantOnPrincipalOptions : CommonGrantOptions {
  public fun scope(): IConstruct? = unwrap(this).getScope()?.let(IConstruct::wrap)

  public interface Builder {
    public fun actions(actions: List<String>) {
    }

    public fun conditions(conditions: Map<String, Map<String, Any>>) {
    }

    public fun grantee(grantee: IGrantable) {
    }

    public fun resourceArns(resourceArns: List<String>) {
    }

    public fun scope(scope: IConstruct) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.GrantOnPrincipalOptions.Builder =
        software.amazon.awscdk.services.iam.GrantOnPrincipalOptions.builder()

    public override fun actions(actions: List<String>) {
      cdkBuilder.actions(actions)
    }

    public override fun conditions(conditions: Map<String, Map<String, Any>>) {
      cdkBuilder.conditions(conditions)
    }

    public override fun grantee(grantee: IGrantable) {
      cdkBuilder.grantee(grantee.let(IGrantable::unwrap))
    }

    public override fun resourceArns(resourceArns: List<String>) {
      cdkBuilder.resourceArns(resourceArns)
    }

    public override fun scope(scope: IConstruct) {
      cdkBuilder.scope(scope.let(IConstruct::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.iam.GrantOnPrincipalOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.iam.GrantOnPrincipalOptions,
  ) : GrantOnPrincipalOptions {
    public override fun actions(): List<String> = unwrap(this).getActions() ?: emptyList()

    public override fun conditions(): Map<String, Map<String, Any>> = unwrap(this).getConditions()
        ?: emptyMap()

    public override fun grantee(): IGrantable = unwrap(this).getGrantee().let(IGrantable::wrap)

    public override fun resourceArns(): List<String> = unwrap(this).getResourceArns() ?: emptyList()

    public override fun scope(): IConstruct? = unwrap(this).getScope()?.let(IConstruct::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): GrantOnPrincipalOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.GrantOnPrincipalOptions):
        GrantOnPrincipalOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: GrantOnPrincipalOptions):
        software.amazon.awscdk.services.iam.GrantOnPrincipalOptions = (wrapped as Wrapper).cdkObject
  }
}
