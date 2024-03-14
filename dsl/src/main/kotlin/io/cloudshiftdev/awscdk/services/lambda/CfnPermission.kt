package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnPermission internal constructor(
  private val cdkObject: software.amazon.awscdk.services.lambda.CfnPermission,
) : CfnResource(cdkObject), IInspectable {
  public open fun action(): String = unwrap(this).getAction()

  public open fun action(`value`: String) {
    unwrap(this).setAction(`value`)
  }

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun eventSourceToken(): String? = unwrap(this).getEventSourceToken()

  public open fun eventSourceToken(`value`: String) {
    unwrap(this).setEventSourceToken(`value`)
  }

  public open fun functionName(): String = unwrap(this).getFunctionName()

  public open fun functionName(`value`: String) {
    unwrap(this).setFunctionName(`value`)
  }

  public open fun functionUrlAuthType(): String? = unwrap(this).getFunctionUrlAuthType()

  public open fun functionUrlAuthType(`value`: String) {
    unwrap(this).setFunctionUrlAuthType(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun principal(): String = unwrap(this).getPrincipal()

  public open fun principal(`value`: String) {
    unwrap(this).setPrincipal(`value`)
  }

  public open fun principalOrgId(): String? = unwrap(this).getPrincipalOrgId()

  public open fun principalOrgId(`value`: String) {
    unwrap(this).setPrincipalOrgId(`value`)
  }

  public open fun sourceAccount(): String? = unwrap(this).getSourceAccount()

  public open fun sourceAccount(`value`: String) {
    unwrap(this).setSourceAccount(`value`)
  }

  public open fun sourceArn(): String? = unwrap(this).getSourceArn()

  public open fun sourceArn(`value`: String) {
    unwrap(this).setSourceArn(`value`)
  }

  public interface Builder {
    public fun action(action: String) {
    }

    public fun eventSourceToken(eventSourceToken: String) {
    }

    public fun functionName(functionName: String) {
    }

    public fun functionUrlAuthType(functionUrlAuthType: String) {
    }

    public fun principal(principal: String) {
    }

    public fun principalOrgId(principalOrgId: String) {
    }

    public fun sourceAccount(sourceAccount: String) {
    }

    public fun sourceArn(sourceArn: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.CfnPermission.Builder =
        software.amazon.awscdk.services.lambda.CfnPermission.Builder.create(scope, id)

    public override fun action(action: String) {
      cdkBuilder.action(action)
    }

    public override fun eventSourceToken(eventSourceToken: String) {
      cdkBuilder.eventSourceToken(eventSourceToken)
    }

    public override fun functionName(functionName: String) {
      cdkBuilder.functionName(functionName)
    }

    public override fun functionUrlAuthType(functionUrlAuthType: String) {
      cdkBuilder.functionUrlAuthType(functionUrlAuthType)
    }

    public override fun principal(principal: String) {
      cdkBuilder.principal(principal)
    }

    public override fun principalOrgId(principalOrgId: String) {
      cdkBuilder.principalOrgId(principalOrgId)
    }

    public override fun sourceAccount(sourceAccount: String) {
      cdkBuilder.sourceAccount(sourceAccount)
    }

    public override fun sourceArn(sourceArn: String) {
      cdkBuilder.sourceArn(sourceArn)
    }

    public fun build(): software.amazon.awscdk.services.lambda.CfnPermission = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPermission {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPermission(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnPermission):
        CfnPermission = CfnPermission(cdkObject)

    internal fun unwrap(wrapped: CfnPermission):
        software.amazon.awscdk.services.lambda.CfnPermission = wrapped.cdkObject
  }
}
