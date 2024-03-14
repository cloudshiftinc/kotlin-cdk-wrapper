package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnUserPoolUICustomizationAttachment internal constructor(
  private val cdkObject:
      software.amazon.awscdk.services.cognito.CfnUserPoolUICustomizationAttachment,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun clientId(): String = unwrap(this).getClientId()

  public open fun clientId(`value`: String) {
    unwrap(this).setClientId(`value`)
  }

  public open fun css(): String? = unwrap(this).getCss()

  public open fun css(`value`: String) {
    unwrap(this).setCss(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun userPoolId(): String = unwrap(this).getUserPoolId()

  public open fun userPoolId(`value`: String) {
    unwrap(this).setUserPoolId(`value`)
  }

  public interface Builder {
    public fun clientId(clientId: String)

    public fun css(css: String)

    public fun userPoolId(userPoolId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.CfnUserPoolUICustomizationAttachment.Builder =
        software.amazon.awscdk.services.cognito.CfnUserPoolUICustomizationAttachment.Builder.create(scope,
        id)

    override fun clientId(clientId: String) {
      cdkBuilder.clientId(clientId)
    }

    override fun css(css: String) {
      cdkBuilder.css(css)
    }

    override fun userPoolId(userPoolId: String) {
      cdkBuilder.userPoolId(userPoolId)
    }

    public fun build(): software.amazon.awscdk.services.cognito.CfnUserPoolUICustomizationAttachment
        = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnUserPoolUICustomizationAttachment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnUserPoolUICustomizationAttachment(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolUICustomizationAttachment):
        CfnUserPoolUICustomizationAttachment = CfnUserPoolUICustomizationAttachment(cdkObject)

    internal fun unwrap(wrapped: CfnUserPoolUICustomizationAttachment):
        software.amazon.awscdk.services.cognito.CfnUserPoolUICustomizationAttachment =
        wrapped.cdkObject
  }
}
