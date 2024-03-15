@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnPermissionProps {
  public fun action(): String

  public fun eventSourceToken(): String? = unwrap(this).getEventSourceToken()

  public fun functionName(): String

  public fun functionUrlAuthType(): String? = unwrap(this).getFunctionUrlAuthType()

  public fun principal(): String

  public fun principalOrgId(): String? = unwrap(this).getPrincipalOrgId()

  public fun sourceAccount(): String? = unwrap(this).getSourceAccount()

  public fun sourceArn(): String? = unwrap(this).getSourceArn()

  @CdkDslMarker
  public interface Builder {
    public fun action(action: String)

    public fun eventSourceToken(eventSourceToken: String)

    public fun functionName(functionName: String)

    public fun functionUrlAuthType(functionUrlAuthType: String)

    public fun principal(principal: String)

    public fun principalOrgId(principalOrgId: String)

    public fun sourceAccount(sourceAccount: String)

    public fun sourceArn(sourceArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.CfnPermissionProps.Builder =
        software.amazon.awscdk.services.lambda.CfnPermissionProps.builder()

    override fun action(action: String) {
      cdkBuilder.action(action)
    }

    override fun eventSourceToken(eventSourceToken: String) {
      cdkBuilder.eventSourceToken(eventSourceToken)
    }

    override fun functionName(functionName: String) {
      cdkBuilder.functionName(functionName)
    }

    override fun functionUrlAuthType(functionUrlAuthType: String) {
      cdkBuilder.functionUrlAuthType(functionUrlAuthType)
    }

    override fun principal(principal: String) {
      cdkBuilder.principal(principal)
    }

    override fun principalOrgId(principalOrgId: String) {
      cdkBuilder.principalOrgId(principalOrgId)
    }

    override fun sourceAccount(sourceAccount: String) {
      cdkBuilder.sourceAccount(sourceAccount)
    }

    override fun sourceArn(sourceArn: String) {
      cdkBuilder.sourceArn(sourceArn)
    }

    public fun build(): software.amazon.awscdk.services.lambda.CfnPermissionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.CfnPermissionProps,
  ) : CdkObject(cdkObject), CfnPermissionProps {
    override fun action(): String = unwrap(this).getAction()

    override fun eventSourceToken(): String? = unwrap(this).getEventSourceToken()

    override fun functionName(): String = unwrap(this).getFunctionName()

    override fun functionUrlAuthType(): String? = unwrap(this).getFunctionUrlAuthType()

    override fun principal(): String = unwrap(this).getPrincipal()

    override fun principalOrgId(): String? = unwrap(this).getPrincipalOrgId()

    override fun sourceAccount(): String? = unwrap(this).getSourceAccount()

    override fun sourceArn(): String? = unwrap(this).getSourceArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPermissionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnPermissionProps):
        CfnPermissionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPermissionProps):
        software.amazon.awscdk.services.lambda.CfnPermissionProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.lambda.CfnPermissionProps
  }
}
