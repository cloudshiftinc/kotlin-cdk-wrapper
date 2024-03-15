@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.opsworks

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface CfnUserProfileProps {
  public fun allowSelfManagement(): Any? = unwrap(this).getAllowSelfManagement()

  public fun iamUserArn(): String

  public fun sshPublicKey(): String? = unwrap(this).getSshPublicKey()

  public fun sshUsername(): String? = unwrap(this).getSshUsername()

  @CdkDslMarker
  public interface Builder {
    public fun allowSelfManagement(allowSelfManagement: Boolean)

    public fun allowSelfManagement(allowSelfManagement: IResolvable)

    public fun iamUserArn(iamUserArn: String)

    public fun sshPublicKey(sshPublicKey: String)

    public fun sshUsername(sshUsername: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.opsworks.CfnUserProfileProps.Builder =
        software.amazon.awscdk.services.opsworks.CfnUserProfileProps.builder()

    override fun allowSelfManagement(allowSelfManagement: Boolean) {
      cdkBuilder.allowSelfManagement(allowSelfManagement)
    }

    override fun allowSelfManagement(allowSelfManagement: IResolvable) {
      cdkBuilder.allowSelfManagement(allowSelfManagement.let(IResolvable::unwrap))
    }

    override fun iamUserArn(iamUserArn: String) {
      cdkBuilder.iamUserArn(iamUserArn)
    }

    override fun sshPublicKey(sshPublicKey: String) {
      cdkBuilder.sshPublicKey(sshPublicKey)
    }

    override fun sshUsername(sshUsername: String) {
      cdkBuilder.sshUsername(sshUsername)
    }

    public fun build(): software.amazon.awscdk.services.opsworks.CfnUserProfileProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.opsworks.CfnUserProfileProps,
  ) : CdkObject(cdkObject), CfnUserProfileProps {
    override fun allowSelfManagement(): Any? = unwrap(this).getAllowSelfManagement()

    override fun iamUserArn(): String = unwrap(this).getIamUserArn()

    override fun sshPublicKey(): String? = unwrap(this).getSshPublicKey()

    override fun sshUsername(): String? = unwrap(this).getSshUsername()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnUserProfileProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.opsworks.CfnUserProfileProps):
        CfnUserProfileProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnUserProfileProps):
        software.amazon.awscdk.services.opsworks.CfnUserProfileProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.opsworks.CfnUserProfileProps
  }
}
