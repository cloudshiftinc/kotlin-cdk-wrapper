@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface CfnIdentityPoolRoleAttachmentProps {
  public fun identityPoolId(): String

  public fun roleMappings(): Any? = unwrap(this).getRoleMappings()

  public fun roles(): Any? = unwrap(this).getRoles()

  @CdkDslMarker
  public interface Builder {
    public fun identityPoolId(identityPoolId: String)

    public fun roleMappings(roleMappings: IResolvable)

    public fun roleMappings(roleMappings: Map<String, Any>)

    public fun roles(roles: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachmentProps.Builder =
        software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachmentProps.builder()

    override fun identityPoolId(identityPoolId: String) {
      cdkBuilder.identityPoolId(identityPoolId)
    }

    override fun roleMappings(roleMappings: IResolvable) {
      cdkBuilder.roleMappings(roleMappings.let(IResolvable::unwrap))
    }

    override fun roleMappings(roleMappings: Map<String, Any>) {
      cdkBuilder.roleMappings(roleMappings)
    }

    override fun roles(roles: Any) {
      cdkBuilder.roles(roles)
    }

    public fun build(): software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachmentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachmentProps,
  ) : CdkObject(cdkObject), CfnIdentityPoolRoleAttachmentProps {
    override fun identityPoolId(): String = unwrap(this).getIdentityPoolId()

    override fun roleMappings(): Any? = unwrap(this).getRoleMappings()

    override fun roles(): Any? = unwrap(this).getRoles()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnIdentityPoolRoleAttachmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachmentProps):
        CfnIdentityPoolRoleAttachmentProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnIdentityPoolRoleAttachmentProps):
        software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachmentProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachmentProps
  }
}
