package io.cloudshiftdev.awscdk.services.appstream

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnApplicationEntitlementAssociation internal constructor(
  private val cdkObject:
      software.amazon.awscdk.services.appstream.CfnApplicationEntitlementAssociation,
) : CfnResource(cdkObject), IInspectable {
  public open fun applicationIdentifier(): String = unwrap(this).getApplicationIdentifier()

  public open fun applicationIdentifier(`value`: String) {
    unwrap(this).setApplicationIdentifier(`value`)
  }

  public open fun entitlementName(): String = unwrap(this).getEntitlementName()

  public open fun entitlementName(`value`: String) {
    unwrap(this).setEntitlementName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun stackName(): String = unwrap(this).getStackName()

  public open fun stackName(`value`: String) {
    unwrap(this).setStackName(`value`)
  }

  public interface Builder {
    public fun applicationIdentifier(applicationIdentifier: String) {
    }

    public fun entitlementName(entitlementName: String) {
    }

    public fun stackName(stackName: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appstream.CfnApplicationEntitlementAssociation.Builder =
        software.amazon.awscdk.services.appstream.CfnApplicationEntitlementAssociation.Builder.create(scope,
        id)

    public override fun applicationIdentifier(applicationIdentifier: String) {
      cdkBuilder.applicationIdentifier(applicationIdentifier)
    }

    public override fun entitlementName(entitlementName: String) {
      cdkBuilder.entitlementName(entitlementName)
    }

    public override fun stackName(stackName: String) {
      cdkBuilder.stackName(stackName)
    }

    public fun build():
        software.amazon.awscdk.services.appstream.CfnApplicationEntitlementAssociation =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApplicationEntitlementAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApplicationEntitlementAssociation(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnApplicationEntitlementAssociation):
        CfnApplicationEntitlementAssociation = CfnApplicationEntitlementAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationEntitlementAssociation):
        software.amazon.awscdk.services.appstream.CfnApplicationEntitlementAssociation =
        wrapped.cdkObject
  }
}
