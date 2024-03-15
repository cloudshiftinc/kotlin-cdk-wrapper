@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.acmpca

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnPermissionProps {
  public fun actions(): List<String>

  public fun certificateAuthorityArn(): String

  public fun principal(): String

  public fun sourceAccount(): String? = unwrap(this).getSourceAccount()

  @CdkDslMarker
  public interface Builder {
    public fun actions(actions: List<String>)

    public fun actions(vararg actions: String)

    public fun certificateAuthorityArn(certificateAuthorityArn: String)

    public fun principal(principal: String)

    public fun sourceAccount(sourceAccount: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.acmpca.CfnPermissionProps.Builder =
        software.amazon.awscdk.services.acmpca.CfnPermissionProps.builder()

    override fun actions(actions: List<String>) {
      cdkBuilder.actions(actions)
    }

    override fun actions(vararg actions: String): Unit = actions(actions.toList())

    override fun certificateAuthorityArn(certificateAuthorityArn: String) {
      cdkBuilder.certificateAuthorityArn(certificateAuthorityArn)
    }

    override fun principal(principal: String) {
      cdkBuilder.principal(principal)
    }

    override fun sourceAccount(sourceAccount: String) {
      cdkBuilder.sourceAccount(sourceAccount)
    }

    public fun build(): software.amazon.awscdk.services.acmpca.CfnPermissionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.acmpca.CfnPermissionProps,
  ) : CdkObject(cdkObject), CfnPermissionProps {
    override fun actions(): List<String> = unwrap(this).getActions()

    override fun certificateAuthorityArn(): String = unwrap(this).getCertificateAuthorityArn()

    override fun principal(): String = unwrap(this).getPrincipal()

    override fun sourceAccount(): String? = unwrap(this).getSourceAccount()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPermissionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnPermissionProps):
        CfnPermissionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPermissionProps):
        software.amazon.awscdk.services.acmpca.CfnPermissionProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.acmpca.CfnPermissionProps
  }
}
