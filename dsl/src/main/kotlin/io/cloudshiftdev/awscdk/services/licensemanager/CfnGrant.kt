package io.cloudshiftdev.awscdk.services.licensemanager

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnGrant internal constructor(
  private val cdkObject: software.amazon.awscdk.services.licensemanager.CfnGrant,
) : CfnResource(cdkObject), IInspectable {
  public open fun allowedOperations(): List<String> = unwrap(this).getAllowedOperations() ?:
      emptyList()

  public open fun allowedOperations(`value`: List<String>) {
    unwrap(this).setAllowedOperations(`value`)
  }

  public open fun attrGrantArn(): String = unwrap(this).getAttrGrantArn()

  public open fun attrVersion(): String = unwrap(this).getAttrVersion()

  public open fun grantName(): String? = unwrap(this).getGrantName()

  public open fun grantName(`value`: String) {
    unwrap(this).setGrantName(`value`)
  }

  public open fun homeRegion(): String? = unwrap(this).getHomeRegion()

  public open fun homeRegion(`value`: String) {
    unwrap(this).setHomeRegion(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun licenseArn(): String? = unwrap(this).getLicenseArn()

  public open fun licenseArn(`value`: String) {
    unwrap(this).setLicenseArn(`value`)
  }

  public open fun principals(): List<String> = unwrap(this).getPrincipals() ?: emptyList()

  public open fun principals(`value`: List<String>) {
    unwrap(this).setPrincipals(`value`)
  }

  public open fun status(): String? = unwrap(this).getStatus()

  public open fun status(`value`: String) {
    unwrap(this).setStatus(`value`)
  }

  public interface Builder {
    public fun allowedOperations(allowedOperations: List<String>) {
    }

    public fun grantName(grantName: String) {
    }

    public fun homeRegion(homeRegion: String) {
    }

    public fun licenseArn(licenseArn: String) {
    }

    public fun principals(principals: List<String>) {
    }

    public fun status(status: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.licensemanager.CfnGrant.Builder =
        software.amazon.awscdk.services.licensemanager.CfnGrant.Builder.create(scope, id)

    public override fun allowedOperations(allowedOperations: List<String>) {
      cdkBuilder.allowedOperations(allowedOperations)
    }

    public override fun grantName(grantName: String) {
      cdkBuilder.grantName(grantName)
    }

    public override fun homeRegion(homeRegion: String) {
      cdkBuilder.homeRegion(homeRegion)
    }

    public override fun licenseArn(licenseArn: String) {
      cdkBuilder.licenseArn(licenseArn)
    }

    public override fun principals(principals: List<String>) {
      cdkBuilder.principals(principals)
    }

    public override fun status(status: String) {
      cdkBuilder.status(status)
    }

    public fun build(): software.amazon.awscdk.services.licensemanager.CfnGrant = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnGrant {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnGrant(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.licensemanager.CfnGrant): CfnGrant
        = CfnGrant(cdkObject)

    internal fun unwrap(wrapped: CfnGrant): software.amazon.awscdk.services.licensemanager.CfnGrant
        = wrapped.cdkObject
  }
}
