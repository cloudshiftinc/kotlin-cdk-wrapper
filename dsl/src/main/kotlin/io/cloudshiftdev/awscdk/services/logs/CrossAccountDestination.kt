package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.iam.PolicyDocument
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CrossAccountDestination internal constructor(
  private val cdkObject: software.amazon.awscdk.services.logs.CrossAccountDestination,
) : Resource(cdkObject), ILogSubscriptionDestination {
  public open fun addToPolicy(statement: PolicyStatement) {
    unwrap(this).addToPolicy(statement.let(PolicyStatement::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2eea211fe501e0e50683eae70fa3c2771f31519727d8e172bc0eb1dfa9f6b6cb")
  public open fun addToPolicy(statement: PolicyStatement.Builder.() -> Unit): Unit =
      addToPolicy(PolicyStatement(statement))

  public override fun bind(_scope: CloudshiftdevConstructsConstruct, _sourceLogGroup: ILogGroup):
      LogSubscriptionDestinationConfig =
      unwrap(this).bind(_scope.let(CloudshiftdevConstructsConstruct::unwrap),
      _sourceLogGroup.let(ILogGroup::unwrap)).let(LogSubscriptionDestinationConfig::wrap)

  public open fun destinationArn(): String = unwrap(this).getDestinationArn()

  public open fun destinationName(): String = unwrap(this).getDestinationName()

  public open fun policyDocument(): PolicyDocument =
      unwrap(this).getPolicyDocument().let(PolicyDocument::wrap)

  public interface Builder {
    public fun destinationName(destinationName: String) {
    }

    public fun role(role: IRole) {
    }

    public fun targetArn(targetArn: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.CrossAccountDestination.Builder =
        software.amazon.awscdk.services.logs.CrossAccountDestination.Builder.create(scope, id)

    public override fun destinationName(destinationName: String) {
      cdkBuilder.destinationName(destinationName)
    }

    public override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    public override fun targetArn(targetArn: String) {
      cdkBuilder.targetArn(targetArn)
    }

    public fun build(): software.amazon.awscdk.services.logs.CrossAccountDestination =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CrossAccountDestination {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CrossAccountDestination(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.CrossAccountDestination):
        CrossAccountDestination = CrossAccountDestination(cdkObject)

    internal fun unwrap(wrapped: CrossAccountDestination):
        software.amazon.awscdk.services.logs.CrossAccountDestination = wrapped.cdkObject
  }
}
