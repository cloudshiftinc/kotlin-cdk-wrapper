package io.cloudshiftdev.awscdk.services.detective

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnOrganizationAdmin internal constructor(
  private val cdkObject: software.amazon.awscdk.services.detective.CfnOrganizationAdmin,
) : CfnResource(cdkObject), IInspectable {
  public open fun accountId(): String = unwrap(this).getAccountId()

  public open fun accountId(`value`: String) {
    unwrap(this).setAccountId(`value`)
  }

  public open fun attrGraphArn(): String = unwrap(this).getAttrGraphArn()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public interface Builder {
    public fun accountId(accountId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.detective.CfnOrganizationAdmin.Builder =
        software.amazon.awscdk.services.detective.CfnOrganizationAdmin.Builder.create(scope, id)

    override fun accountId(accountId: String) {
      cdkBuilder.accountId(accountId)
    }

    public fun build(): software.amazon.awscdk.services.detective.CfnOrganizationAdmin =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnOrganizationAdmin {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnOrganizationAdmin(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.detective.CfnOrganizationAdmin):
        CfnOrganizationAdmin = CfnOrganizationAdmin(cdkObject)

    internal fun unwrap(wrapped: CfnOrganizationAdmin):
        software.amazon.awscdk.services.detective.CfnOrganizationAdmin = wrapped.cdkObject
  }
}
