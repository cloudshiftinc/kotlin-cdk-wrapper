@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.signer

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnProfilePermissionProps {
  public fun action(): String

  public fun principal(): String

  public fun profileName(): String

  public fun profileVersion(): String? = unwrap(this).getProfileVersion()

  public fun statementId(): String

  @CdkDslMarker
  public interface Builder {
    public fun action(action: String)

    public fun principal(principal: String)

    public fun profileName(profileName: String)

    public fun profileVersion(profileVersion: String)

    public fun statementId(statementId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.signer.CfnProfilePermissionProps.Builder
        = software.amazon.awscdk.services.signer.CfnProfilePermissionProps.builder()

    override fun action(action: String) {
      cdkBuilder.action(action)
    }

    override fun principal(principal: String) {
      cdkBuilder.principal(principal)
    }

    override fun profileName(profileName: String) {
      cdkBuilder.profileName(profileName)
    }

    override fun profileVersion(profileVersion: String) {
      cdkBuilder.profileVersion(profileVersion)
    }

    override fun statementId(statementId: String) {
      cdkBuilder.statementId(statementId)
    }

    public fun build(): software.amazon.awscdk.services.signer.CfnProfilePermissionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.signer.CfnProfilePermissionProps,
  ) : CdkObject(cdkObject), CfnProfilePermissionProps {
    override fun action(): String = unwrap(this).getAction()

    override fun principal(): String = unwrap(this).getPrincipal()

    override fun profileName(): String = unwrap(this).getProfileName()

    override fun profileVersion(): String? = unwrap(this).getProfileVersion()

    override fun statementId(): String = unwrap(this).getStatementId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnProfilePermissionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.signer.CfnProfilePermissionProps):
        CfnProfilePermissionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnProfilePermissionProps):
        software.amazon.awscdk.services.signer.CfnProfilePermissionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.signer.CfnProfilePermissionProps
  }
}
