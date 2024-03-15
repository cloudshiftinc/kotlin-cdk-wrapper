@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
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

  @CdkDslMarker
  public interface Builder {
    public fun action(action: String)

    public fun eventSourceToken(eventSourceToken: String)

    public fun functionUrlAuthType(functionUrlAuthType: FunctionUrlAuthType)

    public fun organizationId(organizationId: String)

    public fun principal(principal: IPrincipal)

    public fun scope(scope: Construct)

    public fun sourceAccount(sourceAccount: String)

    public fun sourceArn(sourceArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.Permission.Builder =
        software.amazon.awscdk.services.lambda.Permission.builder()

    override fun action(action: String) {
      cdkBuilder.action(action)
    }

    override fun eventSourceToken(eventSourceToken: String) {
      cdkBuilder.eventSourceToken(eventSourceToken)
    }

    override fun functionUrlAuthType(functionUrlAuthType: FunctionUrlAuthType) {
      cdkBuilder.functionUrlAuthType(functionUrlAuthType.let(FunctionUrlAuthType::unwrap))
    }

    override fun organizationId(organizationId: String) {
      cdkBuilder.organizationId(organizationId)
    }

    override fun principal(principal: IPrincipal) {
      cdkBuilder.principal(principal.let(IPrincipal::unwrap))
    }

    override fun scope(scope: Construct) {
      cdkBuilder.scope(scope.let(Construct::unwrap))
    }

    override fun sourceAccount(sourceAccount: String) {
      cdkBuilder.sourceAccount(sourceAccount)
    }

    override fun sourceArn(sourceArn: String) {
      cdkBuilder.sourceArn(sourceArn)
    }

    public fun build(): software.amazon.awscdk.services.lambda.Permission = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.Permission,
  ) : CdkObject(cdkObject), Permission {
    override fun action(): String? = unwrap(this).getAction()

    override fun eventSourceToken(): String? = unwrap(this).getEventSourceToken()

    override fun functionUrlAuthType(): FunctionUrlAuthType? =
        unwrap(this).getFunctionUrlAuthType()?.let(FunctionUrlAuthType::wrap)

    override fun organizationId(): String? = unwrap(this).getOrganizationId()

    override fun principal(): IPrincipal = unwrap(this).getPrincipal().let(IPrincipal::wrap)

    override fun scope(): Construct? = unwrap(this).getScope()?.let(Construct::wrap)

    override fun sourceAccount(): String? = unwrap(this).getSourceAccount()

    override fun sourceArn(): String? = unwrap(this).getSourceArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): Permission {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.Permission): Permission =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Permission): software.amazon.awscdk.services.lambda.Permission =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.lambda.Permission
  }
}
