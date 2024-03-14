package io.cloudshiftdev.awscdk.services.secretsmanager

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.services.iam.PolicyDocument
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class ResourcePolicy internal constructor(
  private val cdkObject: software.amazon.awscdk.services.secretsmanager.ResourcePolicy,
) : Resource(cdkObject) {
  public open fun document(): PolicyDocument = unwrap(this).getDocument().let(PolicyDocument::wrap)

  public interface Builder {
    public fun secret(secret: ISecret) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.secretsmanager.ResourcePolicy.Builder =
        software.amazon.awscdk.services.secretsmanager.ResourcePolicy.Builder.create(scope, id)

    public override fun secret(secret: ISecret) {
      cdkBuilder.secret(secret.let(ISecret::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.secretsmanager.ResourcePolicy =
        cdkBuilder.build()
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

    internal fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.ResourcePolicy):
        ResourcePolicy = ResourcePolicy(cdkObject)

    internal fun unwrap(wrapped: ResourcePolicy):
        software.amazon.awscdk.services.secretsmanager.ResourcePolicy = wrapped.cdkObject
  }
}
