package io.cloudshiftdev.awscdk.services.workspacesweb

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnIdentityProvider internal constructor(
  private val cdkObject: software.amazon.awscdk.services.workspacesweb.CfnIdentityProvider,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrIdentityProviderArn(): String = unwrap(this).getAttrIdentityProviderArn()

  public open fun identityProviderDetails(): Any = unwrap(this).getIdentityProviderDetails()

  public open fun identityProviderDetails(`value`: IResolvable) {
    unwrap(this).setIdentityProviderDetails(`value`.let(IResolvable::unwrap))
  }

  public open fun identityProviderDetails(`value`: Map<String, String>) {
    unwrap(this).setIdentityProviderDetails(`value`)
  }

  public open fun identityProviderName(): String = unwrap(this).getIdentityProviderName()

  public open fun identityProviderName(`value`: String) {
    unwrap(this).setIdentityProviderName(`value`)
  }

  public open fun identityProviderType(): String = unwrap(this).getIdentityProviderType()

  public open fun identityProviderType(`value`: String) {
    unwrap(this).setIdentityProviderType(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun portalArn(): String? = unwrap(this).getPortalArn()

  public open fun portalArn(`value`: String) {
    unwrap(this).setPortalArn(`value`)
  }

  public interface Builder {
    public fun identityProviderDetails(identityProviderDetails: IResolvable)

    public fun identityProviderDetails(identityProviderDetails: Map<String, String>)

    public fun identityProviderName(identityProviderName: String)

    public fun identityProviderType(identityProviderType: String)

    public fun portalArn(portalArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.workspacesweb.CfnIdentityProvider.Builder =
        software.amazon.awscdk.services.workspacesweb.CfnIdentityProvider.Builder.create(scope, id)

    override fun identityProviderDetails(identityProviderDetails: IResolvable) {
      cdkBuilder.identityProviderDetails(identityProviderDetails.let(IResolvable::unwrap))
    }

    override fun identityProviderDetails(identityProviderDetails: Map<String, String>) {
      cdkBuilder.identityProviderDetails(identityProviderDetails)
    }

    override fun identityProviderName(identityProviderName: String) {
      cdkBuilder.identityProviderName(identityProviderName)
    }

    override fun identityProviderType(identityProviderType: String) {
      cdkBuilder.identityProviderType(identityProviderType)
    }

    override fun portalArn(portalArn: String) {
      cdkBuilder.portalArn(portalArn)
    }

    public fun build(): software.amazon.awscdk.services.workspacesweb.CfnIdentityProvider =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnIdentityProvider {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnIdentityProvider(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.workspacesweb.CfnIdentityProvider):
        CfnIdentityProvider = CfnIdentityProvider(cdkObject)

    internal fun unwrap(wrapped: CfnIdentityProvider):
        software.amazon.awscdk.services.workspacesweb.CfnIdentityProvider = wrapped.cdkObject
  }
}
