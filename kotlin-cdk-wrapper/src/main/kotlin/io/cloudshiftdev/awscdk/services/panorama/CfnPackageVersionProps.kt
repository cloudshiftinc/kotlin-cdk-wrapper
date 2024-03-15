@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.panorama

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface CfnPackageVersionProps {
  public fun markLatest(): Any? = unwrap(this).getMarkLatest()

  public fun ownerAccount(): String? = unwrap(this).getOwnerAccount()

  public fun packageId(): String

  public fun packageVersion(): String

  public fun patchVersion(): String

  public fun updatedLatestPatchVersion(): String? = unwrap(this).getUpdatedLatestPatchVersion()

  @CdkDslMarker
  public interface Builder {
    public fun markLatest(markLatest: Boolean)

    public fun markLatest(markLatest: IResolvable)

    public fun ownerAccount(ownerAccount: String)

    public fun packageId(packageId: String)

    public fun packageVersion(packageVersion: String)

    public fun patchVersion(patchVersion: String)

    public fun updatedLatestPatchVersion(updatedLatestPatchVersion: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.panorama.CfnPackageVersionProps.Builder
        = software.amazon.awscdk.services.panorama.CfnPackageVersionProps.builder()

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

    public fun build(): software.amazon.awscdk.services.panorama.CfnPackageVersionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.panorama.CfnPackageVersionProps,
  ) : CdkObject(cdkObject), CfnPackageVersionProps {
    override fun markLatest(): Any? = unwrap(this).getMarkLatest()

    override fun ownerAccount(): String? = unwrap(this).getOwnerAccount()

    override fun packageId(): String = unwrap(this).getPackageId()

    override fun packageVersion(): String = unwrap(this).getPackageVersion()

    override fun patchVersion(): String = unwrap(this).getPatchVersion()

    override fun updatedLatestPatchVersion(): String? = unwrap(this).getUpdatedLatestPatchVersion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPackageVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.panorama.CfnPackageVersionProps):
        CfnPackageVersionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPackageVersionProps):
        software.amazon.awscdk.services.panorama.CfnPackageVersionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.panorama.CfnPackageVersionProps
  }
}
