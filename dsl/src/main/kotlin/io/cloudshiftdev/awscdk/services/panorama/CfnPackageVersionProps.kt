package io.cloudshiftdev.awscdk.services.panorama

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface CfnPackageVersionProps {
  /**
   * Whether to mark the new version as the latest version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-packageversion.html#cfn-panorama-packageversion-marklatest)
   */
  public fun markLatest(): Any? = unwrap(this).getMarkLatest()

  /**
   * An owner account.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-packageversion.html#cfn-panorama-packageversion-owneraccount)
   */
  public fun ownerAccount(): String? = unwrap(this).getOwnerAccount()

  /**
   * A package ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-packageversion.html#cfn-panorama-packageversion-packageid)
   */
  public fun packageId(): String

  /**
   * A package version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-packageversion.html#cfn-panorama-packageversion-packageversion)
   */
  public fun packageVersion(): String

  /**
   * A patch version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-packageversion.html#cfn-panorama-packageversion-patchversion)
   */
  public fun patchVersion(): String

  /**
   * If the version was marked latest, the new version to maker as latest.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-packageversion.html#cfn-panorama-packageversion-updatedlatestpatchversion)
   */
  public fun updatedLatestPatchVersion(): String? = unwrap(this).getUpdatedLatestPatchVersion()

  /**
   * A builder for [CfnPackageVersionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param markLatest Whether to mark the new version as the latest version.
     */
    public fun markLatest(markLatest: Boolean)

    /**
     * @param markLatest Whether to mark the new version as the latest version.
     */
    public fun markLatest(markLatest: IResolvable)

    /**
     * @param ownerAccount An owner account.
     */
    public fun ownerAccount(ownerAccount: String)

    /**
     * @param packageId A package ID. 
     */
    public fun packageId(packageId: String)

    /**
     * @param packageVersion A package version. 
     */
    public fun packageVersion(packageVersion: String)

    /**
     * @param patchVersion A patch version. 
     */
    public fun patchVersion(patchVersion: String)

    /**
     * @param updatedLatestPatchVersion If the version was marked latest, the new version to maker
     * as latest.
     */
    public fun updatedLatestPatchVersion(updatedLatestPatchVersion: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.panorama.CfnPackageVersionProps.Builder
        = software.amazon.awscdk.services.panorama.CfnPackageVersionProps.builder()

    /**
     * @param markLatest Whether to mark the new version as the latest version.
     */
    override fun markLatest(markLatest: Boolean) {
      cdkBuilder.markLatest(markLatest)
    }

    /**
     * @param markLatest Whether to mark the new version as the latest version.
     */
    override fun markLatest(markLatest: IResolvable) {
      cdkBuilder.markLatest(markLatest.let(IResolvable::unwrap))
    }

    /**
     * @param ownerAccount An owner account.
     */
    override fun ownerAccount(ownerAccount: String) {
      cdkBuilder.ownerAccount(ownerAccount)
    }

    /**
     * @param packageId A package ID. 
     */
    override fun packageId(packageId: String) {
      cdkBuilder.packageId(packageId)
    }

    /**
     * @param packageVersion A package version. 
     */
    override fun packageVersion(packageVersion: String) {
      cdkBuilder.packageVersion(packageVersion)
    }

    /**
     * @param patchVersion A patch version. 
     */
    override fun patchVersion(patchVersion: String) {
      cdkBuilder.patchVersion(patchVersion)
    }

    /**
     * @param updatedLatestPatchVersion If the version was marked latest, the new version to maker
     * as latest.
     */
    override fun updatedLatestPatchVersion(updatedLatestPatchVersion: String) {
      cdkBuilder.updatedLatestPatchVersion(updatedLatestPatchVersion)
    }

    public fun build(): software.amazon.awscdk.services.panorama.CfnPackageVersionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.panorama.CfnPackageVersionProps,
  ) : CdkObject(cdkObject), CfnPackageVersionProps {
    /**
     * Whether to mark the new version as the latest version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-packageversion.html#cfn-panorama-packageversion-marklatest)
     */
    override fun markLatest(): Any? = unwrap(this).getMarkLatest()

    /**
     * An owner account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-packageversion.html#cfn-panorama-packageversion-owneraccount)
     */
    override fun ownerAccount(): String? = unwrap(this).getOwnerAccount()

    /**
     * A package ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-packageversion.html#cfn-panorama-packageversion-packageid)
     */
    override fun packageId(): String = unwrap(this).getPackageId()

    /**
     * A package version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-packageversion.html#cfn-panorama-packageversion-packageversion)
     */
    override fun packageVersion(): String = unwrap(this).getPackageVersion()

    /**
     * A patch version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-packageversion.html#cfn-panorama-packageversion-patchversion)
     */
    override fun patchVersion(): String = unwrap(this).getPatchVersion()

    /**
     * If the version was marked latest, the new version to maker as latest.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-packageversion.html#cfn-panorama-packageversion-updatedlatestpatchversion)
     */
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
