package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnInstanceProfile internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iam.CfnInstanceProfile,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun instanceProfileName(): String? = unwrap(this).getInstanceProfileName()

  public open fun instanceProfileName(`value`: String) {
    unwrap(this).setInstanceProfileName(`value`)
  }

  public open fun path(): String? = unwrap(this).getPath()

  public open fun path(`value`: String) {
    unwrap(this).setPath(`value`)
  }

  public open fun roles(): List<String> = unwrap(this).getRoles() ?: emptyList()

  public open fun roles(`value`: List<String>) {
    unwrap(this).setRoles(`value`)
  }

  public interface Builder {
    public fun instanceProfileName(instanceProfileName: String)

    public fun path(path: String)

    public fun roles(roles: List<String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.CfnInstanceProfile.Builder =
        software.amazon.awscdk.services.iam.CfnInstanceProfile.Builder.create(scope, id)

    override fun instanceProfileName(instanceProfileName: String) {
      cdkBuilder.instanceProfileName(instanceProfileName)
    }

    override fun path(path: String) {
      cdkBuilder.path(path)
    }

    override fun roles(roles: List<String>) {
      cdkBuilder.roles(roles)
    }

    public fun build(): software.amazon.awscdk.services.iam.CfnInstanceProfile = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnInstanceProfile {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnInstanceProfile(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CfnInstanceProfile):
        CfnInstanceProfile = CfnInstanceProfile(cdkObject)

    internal fun unwrap(wrapped: CfnInstanceProfile):
        software.amazon.awscdk.services.iam.CfnInstanceProfile = wrapped.cdkObject
  }
}
