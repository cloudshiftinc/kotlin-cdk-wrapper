package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnIdentityPoolPrincipalTag internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cognito.CfnIdentityPoolPrincipalTag,
) : CfnResource(cdkObject), IInspectable {
  public open fun identityPoolId(): String = unwrap(this).getIdentityPoolId()

  public open fun identityPoolId(`value`: String) {
    unwrap(this).setIdentityPoolId(`value`)
  }

  public open fun identityProviderName(): String = unwrap(this).getIdentityProviderName()

  public open fun identityProviderName(`value`: String) {
    unwrap(this).setIdentityProviderName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun principalTags(): Any? = unwrap(this).getPrincipalTags()

  public open fun principalTags(`value`: Any) {
    unwrap(this).setPrincipalTags(`value`)
  }

  public open fun useDefaults(): Any? = unwrap(this).getUseDefaults()

  public open fun useDefaults(`value`: Boolean) {
    unwrap(this).setUseDefaults(`value`)
  }

  public open fun useDefaults(`value`: IResolvable) {
    unwrap(this).setUseDefaults(`value`.let(IResolvable::unwrap))
  }

  public interface Builder {
    public fun identityPoolId(identityPoolId: String)

    public fun identityProviderName(identityProviderName: String)

    public fun principalTags(principalTags: Any)

    public fun useDefaults(useDefaults: Boolean)

    public fun useDefaults(useDefaults: IResolvable)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.CfnIdentityPoolPrincipalTag.Builder =
        software.amazon.awscdk.services.cognito.CfnIdentityPoolPrincipalTag.Builder.create(scope,
        id)

    override fun identityPoolId(identityPoolId: String) {
      cdkBuilder.identityPoolId(identityPoolId)
    }

    override fun identityProviderName(identityProviderName: String) {
      cdkBuilder.identityProviderName(identityProviderName)
    }

    override fun principalTags(principalTags: Any) {
      cdkBuilder.principalTags(principalTags)
    }

    override fun useDefaults(useDefaults: Boolean) {
      cdkBuilder.useDefaults(useDefaults)
    }

    override fun useDefaults(useDefaults: IResolvable) {
      cdkBuilder.useDefaults(useDefaults.let(IResolvable::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cognito.CfnIdentityPoolPrincipalTag =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnIdentityPoolPrincipalTag {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnIdentityPoolPrincipalTag(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnIdentityPoolPrincipalTag):
        CfnIdentityPoolPrincipalTag = CfnIdentityPoolPrincipalTag(cdkObject)

    internal fun unwrap(wrapped: CfnIdentityPoolPrincipalTag):
        software.amazon.awscdk.services.cognito.CfnIdentityPoolPrincipalTag = wrapped.cdkObject
  }
}
