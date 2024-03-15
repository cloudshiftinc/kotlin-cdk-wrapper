@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.panorama

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Registers a package version.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.panorama.*;
 * CfnPackageVersion cfnPackageVersion = CfnPackageVersion.Builder.create(this,
 * "MyCfnPackageVersion")
 * .packageId("packageId")
 * .packageVersion("packageVersion")
 * .patchVersion("patchVersion")
 * // the properties below are optional
 * .markLatest(false)
 * .ownerAccount("ownerAccount")
 * .updatedLatestPatchVersion("updatedLatestPatchVersion")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-packageversion.html)
 */
public open class CfnPackageVersion internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.panorama.CfnPackageVersion,
) : CfnResource(cdkObject), IInspectable {
  /**
   * Whether the package version is the latest version.
   */
  public open fun attrIsLatestPatch(): IResolvable =
      unwrap(this).getAttrIsLatestPatch().let(IResolvable::wrap)

  /**
   * The package version's ARN.
   */
  public open fun attrPackageArn(): String = unwrap(this).getAttrPackageArn()

  /**
   * The package version's name.
   */
  public open fun attrPackageName(): String = unwrap(this).getAttrPackageName()

  /**
   * The package version's registered time.
   */
  public open fun attrRegisteredTime(): Number = unwrap(this).getAttrRegisteredTime()

  /**
   * The package version's status.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * The package version's status description.
   */
  public open fun attrStatusDescription(): String = unwrap(this).getAttrStatusDescription()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Whether to mark the new version as the latest version.
   */
  public open fun markLatest(): Any? = unwrap(this).getMarkLatest()

  /**
   * Whether to mark the new version as the latest version.
   */
  public open fun markLatest(`value`: Boolean) {
    unwrap(this).setMarkLatest(`value`)
  }

  /**
   * Whether to mark the new version as the latest version.
   */
  public open fun markLatest(`value`: IResolvable) {
    unwrap(this).setMarkLatest(`value`.let(IResolvable::unwrap))
  }

  /**
   * An owner account.
   */
  public open fun ownerAccount(): String? = unwrap(this).getOwnerAccount()

  /**
   * An owner account.
   */
  public open fun ownerAccount(`value`: String) {
    unwrap(this).setOwnerAccount(`value`)
  }

  /**
   * A package ID.
   */
  public open fun packageId(): String = unwrap(this).getPackageId()

  /**
   * A package ID.
   */
  public open fun packageId(`value`: String) {
    unwrap(this).setPackageId(`value`)
  }

  /**
   * A package version.
   */
  public open fun packageVersion(): String = unwrap(this).getPackageVersion()

  /**
   * A package version.
   */
  public open fun packageVersion(`value`: String) {
    unwrap(this).setPackageVersion(`value`)
  }

  /**
   * A patch version.
   */
  public open fun patchVersion(): String = unwrap(this).getPatchVersion()

  /**
   * A patch version.
   */
  public open fun patchVersion(`value`: String) {
    unwrap(this).setPatchVersion(`value`)
  }

  /**
   * If the version was marked latest, the new version to maker as latest.
   */
  public open fun updatedLatestPatchVersion(): String? = unwrap(this).getUpdatedLatestPatchVersion()

  /**
   * If the version was marked latest, the new version to maker as latest.
   */
  public open fun updatedLatestPatchVersion(`value`: String) {
    unwrap(this).setUpdatedLatestPatchVersion(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.panorama.CfnPackageVersion].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Whether to mark the new version as the latest version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-packageversion.html#cfn-panorama-packageversion-marklatest)
     * @param markLatest Whether to mark the new version as the latest version. 
     */
    public fun markLatest(markLatest: Boolean)

    /**
     * Whether to mark the new version as the latest version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-packageversion.html#cfn-panorama-packageversion-marklatest)
     * @param markLatest Whether to mark the new version as the latest version. 
     */
    public fun markLatest(markLatest: IResolvable)

    /**
     * An owner account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-packageversion.html#cfn-panorama-packageversion-owneraccount)
     * @param ownerAccount An owner account. 
     */
    public fun ownerAccount(ownerAccount: String)

    /**
     * A package ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-packageversion.html#cfn-panorama-packageversion-packageid)
     * @param packageId A package ID. 
     */
    public fun packageId(packageId: String)

    /**
     * A package version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-packageversion.html#cfn-panorama-packageversion-packageversion)
     * @param packageVersion A package version. 
     */
    public fun packageVersion(packageVersion: String)

    /**
     * A patch version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-packageversion.html#cfn-panorama-packageversion-patchversion)
     * @param patchVersion A patch version. 
     */
    public fun patchVersion(patchVersion: String)

    /**
     * If the version was marked latest, the new version to maker as latest.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-packageversion.html#cfn-panorama-packageversion-updatedlatestpatchversion)
     * @param updatedLatestPatchVersion If the version was marked latest, the new version to maker
     * as latest. 
     */
    public fun updatedLatestPatchVersion(updatedLatestPatchVersion: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.panorama.CfnPackageVersion.Builder =
        software.amazon.awscdk.services.panorama.CfnPackageVersion.Builder.create(scope, id)

    /**
     * Whether to mark the new version as the latest version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-packageversion.html#cfn-panorama-packageversion-marklatest)
     * @param markLatest Whether to mark the new version as the latest version. 
     */
    override fun markLatest(markLatest: Boolean) {
      cdkBuilder.markLatest(markLatest)
    }

    /**
     * Whether to mark the new version as the latest version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-packageversion.html#cfn-panorama-packageversion-marklatest)
     * @param markLatest Whether to mark the new version as the latest version. 
     */
    override fun markLatest(markLatest: IResolvable) {
      cdkBuilder.markLatest(markLatest.let(IResolvable::unwrap))
    }

    /**
     * An owner account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-packageversion.html#cfn-panorama-packageversion-owneraccount)
     * @param ownerAccount An owner account. 
     */
    override fun ownerAccount(ownerAccount: String) {
      cdkBuilder.ownerAccount(ownerAccount)
    }

    /**
     * A package ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-packageversion.html#cfn-panorama-packageversion-packageid)
     * @param packageId A package ID. 
     */
    override fun packageId(packageId: String) {
      cdkBuilder.packageId(packageId)
    }

    /**
     * A package version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-packageversion.html#cfn-panorama-packageversion-packageversion)
     * @param packageVersion A package version. 
     */
    override fun packageVersion(packageVersion: String) {
      cdkBuilder.packageVersion(packageVersion)
    }

    /**
     * A patch version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-packageversion.html#cfn-panorama-packageversion-patchversion)
     * @param patchVersion A patch version. 
     */
    override fun patchVersion(patchVersion: String) {
      cdkBuilder.patchVersion(patchVersion)
    }

    /**
     * If the version was marked latest, the new version to maker as latest.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-packageversion.html#cfn-panorama-packageversion-updatedlatestpatchversion)
     * @param updatedLatestPatchVersion If the version was marked latest, the new version to maker
     * as latest. 
     */
    override fun updatedLatestPatchVersion(updatedLatestPatchVersion: String) {
      cdkBuilder.updatedLatestPatchVersion(updatedLatestPatchVersion)
    }

    public fun build(): software.amazon.awscdk.services.panorama.CfnPackageVersion =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.panorama.CfnPackageVersion.CFN_RESOURCE_TYPE_NAME

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
