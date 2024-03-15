@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.workspacesweb

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface CfnIdentityProviderProps {
  public fun identityProviderDetails(): Any

  public fun identityProviderName(): String

  public fun identityProviderType(): String

  public fun portalArn(): String? = unwrap(this).getPortalArn()

  @CdkDslMarker
  public interface Builder {
    public fun identityProviderDetails(identityProviderDetails: IResolvable)

    public fun identityProviderDetails(identityProviderDetails: Map<String, String>)

    public fun identityProviderName(identityProviderName: String)

    public fun identityProviderType(identityProviderType: String)

    public fun portalArn(portalArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.workspacesweb.CfnIdentityProviderProps.Builder =
        software.amazon.awscdk.services.workspacesweb.CfnIdentityProviderProps.builder()

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

    public fun build(): software.amazon.awscdk.services.workspacesweb.CfnIdentityProviderProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.workspacesweb.CfnIdentityProviderProps,
  ) : CdkObject(cdkObject), CfnIdentityProviderProps {
    override fun identityProviderDetails(): Any = unwrap(this).getIdentityProviderDetails()

    override fun identityProviderName(): String = unwrap(this).getIdentityProviderName()

    override fun identityProviderType(): String = unwrap(this).getIdentityProviderType()

    override fun portalArn(): String? = unwrap(this).getPortalArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnIdentityProviderProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.workspacesweb.CfnIdentityProviderProps):
        CfnIdentityProviderProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnIdentityProviderProps):
        software.amazon.awscdk.services.workspacesweb.CfnIdentityProviderProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.workspacesweb.CfnIdentityProviderProps
  }
}
