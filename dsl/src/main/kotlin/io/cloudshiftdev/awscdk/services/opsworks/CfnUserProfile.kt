package io.cloudshiftdev.awscdk.services.opsworks

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

public open class CfnUserProfile internal constructor(
  private val cdkObject: software.amazon.awscdk.services.opsworks.CfnUserProfile,
) : CfnResource(cdkObject), IInspectable {
  public open fun allowSelfManagement(): Any? = unwrap(this).getAllowSelfManagement()

  public open fun allowSelfManagement(`value`: Boolean) {
    unwrap(this).setAllowSelfManagement(`value`)
  }

  public open fun allowSelfManagement(`value`: IResolvable) {
    unwrap(this).setAllowSelfManagement(`value`.let(IResolvable::unwrap))
  }

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrSshUsername(): String = unwrap(this).getAttrSshUsername()

  public open fun iamUserArn(): String = unwrap(this).getIamUserArn()

  public open fun iamUserArn(`value`: String) {
    unwrap(this).setIamUserArn(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun sshPublicKey(): String? = unwrap(this).getSshPublicKey()

  public open fun sshPublicKey(`value`: String) {
    unwrap(this).setSshPublicKey(`value`)
  }

  public open fun sshUsername(): String? = unwrap(this).getSshUsername()

  public open fun sshUsername(`value`: String) {
    unwrap(this).setSshUsername(`value`)
  }

  public interface Builder {
    public fun allowSelfManagement(allowSelfManagement: Boolean) {
    }

    public fun allowSelfManagement(allowSelfManagement: IResolvable) {
    }

    public fun iamUserArn(iamUserArn: String) {
    }

    public fun sshPublicKey(sshPublicKey: String) {
    }

    public fun sshUsername(sshUsername: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.opsworks.CfnUserProfile.Builder =
        software.amazon.awscdk.services.opsworks.CfnUserProfile.Builder.create(scope, id)

    public override fun allowSelfManagement(allowSelfManagement: Boolean) {
      cdkBuilder.allowSelfManagement(allowSelfManagement)
    }

    public override fun allowSelfManagement(allowSelfManagement: IResolvable) {
      cdkBuilder.allowSelfManagement(allowSelfManagement.let(IResolvable::unwrap))
    }

    public override fun iamUserArn(iamUserArn: String) {
      cdkBuilder.iamUserArn(iamUserArn)
    }

    public override fun sshPublicKey(sshPublicKey: String) {
      cdkBuilder.sshPublicKey(sshPublicKey)
    }

    public override fun sshUsername(sshUsername: String) {
      cdkBuilder.sshUsername(sshUsername)
    }

    public fun build(): software.amazon.awscdk.services.opsworks.CfnUserProfile = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnUserProfile {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnUserProfile(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.opsworks.CfnUserProfile):
        CfnUserProfile = CfnUserProfile(cdkObject)

    internal fun unwrap(wrapped: CfnUserProfile):
        software.amazon.awscdk.services.opsworks.CfnUserProfile = wrapped.cdkObject
  }
}
