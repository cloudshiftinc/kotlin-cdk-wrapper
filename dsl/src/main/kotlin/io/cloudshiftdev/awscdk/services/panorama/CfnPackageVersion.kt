package io.cloudshiftdev.awscdk.services.panorama

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnPackageVersion internal constructor(
  private val cdkObject: software.amazon.awscdk.services.panorama.CfnPackageVersion,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrIsLatestPatch(): IResolvable =
      unwrap(this).getAttrIsLatestPatch().let(IResolvable::wrap)

  public open fun attrPackageArn(): String = unwrap(this).getAttrPackageArn()

  public open fun attrPackageName(): String = unwrap(this).getAttrPackageName()

  public open fun attrRegisteredTime(): Number = unwrap(this).getAttrRegisteredTime()

  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  public open fun attrStatusDescription(): String = unwrap(this).getAttrStatusDescription()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun markLatest(): Any? = unwrap(this).getMarkLatest()

  public open fun markLatest(`value`: Boolean) {
    unwrap(this).setMarkLatest(`value`)
  }

  public open fun markLatest(`value`: IResolvable) {
    unwrap(this).setMarkLatest(`value`.let(IResolvable::unwrap))
  }

  public open fun ownerAccount(): String? = unwrap(this).getOwnerAccount()

  public open fun ownerAccount(`value`: String) {
    unwrap(this).setOwnerAccount(`value`)
  }

  public open fun packageId(): String = unwrap(this).getPackageId()

  public open fun packageId(`value`: String) {
    unwrap(this).setPackageId(`value`)
  }

  public open fun packageVersion(): String = unwrap(this).getPackageVersion()

  public open fun packageVersion(`value`: String) {
    unwrap(this).setPackageVersion(`value`)
  }

  public open fun patchVersion(): String = unwrap(this).getPatchVersion()

  public open fun patchVersion(`value`: String) {
    unwrap(this).setPatchVersion(`value`)
  }

  public open fun updatedLatestPatchVersion(): String? = unwrap(this).getUpdatedLatestPatchVersion()

  public open fun updatedLatestPatchVersion(`value`: String) {
    unwrap(this).setUpdatedLatestPatchVersion(`value`)
  }

  public interface Builder {
    public fun markLatest(markLatest: Boolean)

    public fun markLatest(markLatest: IResolvable)

    public fun ownerAccount(ownerAccount: String)

    public fun packageId(packageId: String)

    public fun packageVersion(packageVersion: String)

    public fun patchVersion(patchVersion: String)

    public fun updatedLatestPatchVersion(updatedLatestPatchVersion: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.panorama.CfnPackageVersion.Builder =
        software.amazon.awscdk.services.panorama.CfnPackageVersion.Builder.create(scope, id)

    override fun markLatest(markLatest: Boolean) {
      cdkBuilder.markLatest(markLatest)
    }

    override fun markLatest(markLatest: IResolvable) {
      cdkBuilder.markLatest(markLatest.let(IResolvable::unwrap))
    }

    override fun ownerAccount(ownerAccount: String) {
      cdkBuilder.ownerAccount(ownerAccount)
    }

    override fun packageId(packageId: String) {
      cdkBuilder.packageId(packageId)
    }

    override fun packageVersion(packageVersion: String) {
      cdkBuilder.packageVersion(packageVersion)
    }

    override fun patchVersion(patchVersion: String) {
      cdkBuilder.patchVersion(patchVersion)
    }

    override fun updatedLatestPatchVersion(updatedLatestPatchVersion: String) {
      cdkBuilder.updatedLatestPatchVersion(updatedLatestPatchVersion)
    }

    public fun build(): software.amazon.awscdk.services.panorama.CfnPackageVersion =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPackageVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPackageVersion(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.panorama.CfnPackageVersion):
        CfnPackageVersion = CfnPackageVersion(cdkObject)

    internal fun unwrap(wrapped: CfnPackageVersion):
        software.amazon.awscdk.services.panorama.CfnPackageVersion = wrapped.cdkObject
  }
}
