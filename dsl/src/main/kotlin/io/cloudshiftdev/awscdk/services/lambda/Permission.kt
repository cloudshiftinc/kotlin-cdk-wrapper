package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.services.iam.IPrincipal
import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.Unit

public interface Permission {
  public fun action(): String? = unwrap(this).getAction()

  public fun eventSourceToken(): String? = unwrap(this).getEventSourceToken()

  public fun functionUrlAuthType(): FunctionUrlAuthType? =
      unwrap(this).getFunctionUrlAuthType()?.let(FunctionUrlAuthType::wrap)

  public fun organizationId(): String? = unwrap(this).getOrganizationId()

  public fun principal(): IPrincipal

  public fun scope(): Construct? = unwrap(this).getScope()?.let(Construct::wrap)

  public fun sourceAccount(): String? = unwrap(this).getSourceAccount()

  public fun sourceArn(): String? = unwrap(this).getSourceArn()

  public interface Builder {
    public fun action(action: String) {
    }

    public fun eventSourceToken(eventSourceToken: String) {
    }

    public fun functionUrlAuthType(functionUrlAuthType: FunctionUrlAuthType) {
    }

    public fun organizationId(organizationId: String) {
    }

    public fun principal(principal: IPrincipal) {
    }

    public fun scope(scope: Construct) {
    }

    public fun sourceAccount(sourceAccount: String) {
    }

    public fun sourceArn(sourceArn: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.Permission.Builder =
        software.amazon.awscdk.services.lambda.Permission.builder()

    public override fun action(action: String) {
      cdkBuilder.action(action)
    }

    public override fun eventSourceToken(eventSourceToken: String) {
      cdkBuilder.eventSourceToken(eventSourceToken)
    }

    public override fun functionUrlAuthType(functionUrlAuthType: FunctionUrlAuthType) {
      cdkBuilder.functionUrlAuthType(functionUrlAuthType.let(FunctionUrlAuthType::unwrap))
    }

    public override fun organizationId(organizationId: String) {
      cdkBuilder.organizationId(organizationId)
    }

    public override fun principal(principal: IPrincipal) {
      cdkBuilder.principal(principal.let(IPrincipal::unwrap))
    }

    public override fun scope(scope: Construct) {
      cdkBuilder.scope(scope.let(Construct::unwrap))
    }

    public override fun sourceAccount(sourceAccount: String) {
      cdkBuilder.sourceAccount(sourceAccount)
    }

    public override fun sourceArn(sourceArn: String) {
      cdkBuilder.sourceArn(sourceArn)
    }

    public fun build(): software.amazon.awscdk.services.lambda.Permission = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.lambda.Permission,
  ) : Permission {
    public override fun action(): String? = unwrap(this).getAction()

    public override fun eventSourceToken(): String? = unwrap(this).getEventSourceToken()

    public override fun functionUrlAuthType(): FunctionUrlAuthType? =
        unwrap(this).getFunctionUrlAuthType()?.let(FunctionUrlAuthType::wrap)

    public override fun organizationId(): String? = unwrap(this).getOrganizationId()

    public override fun principal(): IPrincipal = unwrap(this).getPrincipal().let(IPrincipal::wrap)

    public override fun scope(): Construct? = unwrap(this).getScope()?.let(Construct::wrap)

    public override fun sourceAccount(): String? = unwrap(this).getSourceAccount()

    public override fun sourceArn(): String? = unwrap(this).getSourceArn()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): Permission {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.Permission): Permission =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Permission): software.amazon.awscdk.services.lambda.Permission =
        (wrapped as Wrapper).cdkObject
  }
}
