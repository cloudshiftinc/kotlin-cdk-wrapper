package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.services.iam.PolicyDocument
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class ResourcePolicy internal constructor(
  private val cdkObject: software.amazon.awscdk.services.logs.ResourcePolicy,
) : Resource(cdkObject) {
  public open fun document(): PolicyDocument = unwrap(this).getDocument().let(PolicyDocument::wrap)

  public interface Builder {
    public fun policyStatements(policyStatements: List<PolicyStatement>) {
    }

    public fun resourcePolicyName(resourcePolicyName: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.ResourcePolicy.Builder =
        software.amazon.awscdk.services.logs.ResourcePolicy.Builder.create(scope, id)

    public override fun policyStatements(policyStatements: List<PolicyStatement>) {
      cdkBuilder.policyStatements(policyStatements.map(PolicyStatement::unwrap))
    }

    public override fun resourcePolicyName(resourcePolicyName: String) {
      cdkBuilder.resourcePolicyName(resourcePolicyName)
    }

    public fun build(): software.amazon.awscdk.services.logs.ResourcePolicy = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ResourcePolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ResourcePolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.ResourcePolicy):
        ResourcePolicy = ResourcePolicy(cdkObject)

    internal fun unwrap(wrapped: ResourcePolicy):
        software.amazon.awscdk.services.logs.ResourcePolicy = wrapped.cdkObject
  }
}
