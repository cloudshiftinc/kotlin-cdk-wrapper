@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.licensemanager

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies a grant.
 *
 * A grant shares the use of license entitlements with specific AWS accounts . For more information,
 * see [Granted
 * licenses](https://docs.aws.amazon.com/license-manager/latest/userguide/granted-licenses.html) in the
 * *AWS License Manager User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.licensemanager.*;
 * CfnGrant cfnGrant = CfnGrant.Builder.create(this, "MyCfnGrant")
 * .allowedOperations(List.of("allowedOperations"))
 * .grantName("grantName")
 * .homeRegion("homeRegion")
 * .licenseArn("licenseArn")
 * .principals(List.of("principals"))
 * .status("status")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-grant.html)
 */
public open class CfnGrant internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.licensemanager.CfnGrant,
) : CfnResource(cdkObject), IInspectable {
  /**
   * Allowed operations for the grant.
   */
  public open fun allowedOperations(): List<String> = unwrap(this).getAllowedOperations() ?:
      emptyList()

  /**
   * Allowed operations for the grant.
   */
  public open fun allowedOperations(`value`: List<String>) {
    unwrap(this).setAllowedOperations(`value`)
  }

  /**
   * Allowed operations for the grant.
   */
  public open fun allowedOperations(vararg `value`: String): Unit =
      allowedOperations(`value`.toList())

  /**
   * The Amazon Resource Name (ARN) of the grant.
   */
  public open fun attrGrantArn(): String = unwrap(this).getAttrGrantArn()

  /**
   * The grant version.
   */
  public open fun attrVersion(): String = unwrap(this).getAttrVersion()

  /**
   * Grant name.
   */
  public open fun grantName(): String? = unwrap(this).getGrantName()

  /**
   * Grant name.
   */
  public open fun grantName(`value`: String) {
    unwrap(this).setGrantName(`value`)
  }

  /**
   * Home Region of the grant.
   */
  public open fun homeRegion(): String? = unwrap(this).getHomeRegion()

  /**
   * Home Region of the grant.
   */
  public open fun homeRegion(`value`: String) {
    unwrap(this).setHomeRegion(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * License ARN.
   */
  public open fun licenseArn(): String? = unwrap(this).getLicenseArn()

  /**
   * License ARN.
   */
  public open fun licenseArn(`value`: String) {
    unwrap(this).setLicenseArn(`value`)
  }

  /**
   * The grant principals.
   *
   * You can specify one of the following as an Amazon Resource Name (ARN):.
   */
  public open fun principals(): List<String> = unwrap(this).getPrincipals() ?: emptyList()

  /**
   * The grant principals.
   *
   * You can specify one of the following as an Amazon Resource Name (ARN):.
   */
  public open fun principals(`value`: List<String>) {
    unwrap(this).setPrincipals(`value`)
  }

  /**
   * The grant principals.
   *
   * You can specify one of the following as an Amazon Resource Name (ARN):.
   */
  public open fun principals(vararg `value`: String): Unit = principals(`value`.toList())

  /**
   * Granted license status.
   */
  public open fun status(): String? = unwrap(this).getStatus()

  /**
   * Granted license status.
   */
  public open fun status(`value`: String) {
    unwrap(this).setStatus(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.licensemanager.CfnGrant].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Allowed operations for the grant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-grant.html#cfn-licensemanager-grant-allowedoperations)
     * @param allowedOperations Allowed operations for the grant. 
     */
    public fun allowedOperations(allowedOperations: List<String>)

    /**
     * Allowed operations for the grant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-grant.html#cfn-licensemanager-grant-allowedoperations)
     * @param allowedOperations Allowed operations for the grant. 
     */
    public fun allowedOperations(vararg allowedOperations: String)

    /**
     * Grant name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-grant.html#cfn-licensemanager-grant-grantname)
     * @param grantName Grant name. 
     */
    public fun grantName(grantName: String)

    /**
     * Home Region of the grant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-grant.html#cfn-licensemanager-grant-homeregion)
     * @param homeRegion Home Region of the grant. 
     */
    public fun homeRegion(homeRegion: String)

    /**
     * License ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-grant.html#cfn-licensemanager-grant-licensearn)
     * @param licenseArn License ARN. 
     */
    public fun licenseArn(licenseArn: String)

    /**
     * The grant principals. You can specify one of the following as an Amazon Resource Name (ARN):.
     *
     * * An AWS account, which includes only the account specified.
     * * An organizational unit (OU), which includes all accounts in the OU.
     * * An organization, which will include all accounts across your organization.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-grant.html#cfn-licensemanager-grant-principals)
     * @param principals The grant principals. You can specify one of the following as an Amazon
     * Resource Name (ARN):. 
     */
    public fun principals(principals: List<String>)

    /**
     * The grant principals. You can specify one of the following as an Amazon Resource Name (ARN):.
     *
     * * An AWS account, which includes only the account specified.
     * * An organizational unit (OU), which includes all accounts in the OU.
     * * An organization, which will include all accounts across your organization.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-grant.html#cfn-licensemanager-grant-principals)
     * @param principals The grant principals. You can specify one of the following as an Amazon
     * Resource Name (ARN):. 
     */
    public fun principals(vararg principals: String)

    /**
     * Granted license status.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-grant.html#cfn-licensemanager-grant-status)
     * @param status Granted license status. 
     */
    public fun status(status: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.licensemanager.CfnGrant.Builder =
        software.amazon.awscdk.services.licensemanager.CfnGrant.Builder.create(scope, id)

    /**
     * Allowed operations for the grant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-grant.html#cfn-licensemanager-grant-allowedoperations)
     * @param allowedOperations Allowed operations for the grant. 
     */
    override fun allowedOperations(allowedOperations: List<String>) {
      cdkBuilder.allowedOperations(allowedOperations)
    }

    /**
     * Allowed operations for the grant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-grant.html#cfn-licensemanager-grant-allowedoperations)
     * @param allowedOperations Allowed operations for the grant. 
     */
    override fun allowedOperations(vararg allowedOperations: String): Unit =
        allowedOperations(allowedOperations.toList())

    /**
     * Grant name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-grant.html#cfn-licensemanager-grant-grantname)
     * @param grantName Grant name. 
     */
    override fun grantName(grantName: String) {
      cdkBuilder.grantName(grantName)
    }

    /**
     * Home Region of the grant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-grant.html#cfn-licensemanager-grant-homeregion)
     * @param homeRegion Home Region of the grant. 
     */
    override fun homeRegion(homeRegion: String) {
      cdkBuilder.homeRegion(homeRegion)
    }

    /**
     * License ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-grant.html#cfn-licensemanager-grant-licensearn)
     * @param licenseArn License ARN. 
     */
    override fun licenseArn(licenseArn: String) {
      cdkBuilder.licenseArn(licenseArn)
    }

    /**
     * The grant principals. You can specify one of the following as an Amazon Resource Name (ARN):.
     *
     * * An AWS account, which includes only the account specified.
     * * An organizational unit (OU), which includes all accounts in the OU.
     * * An organization, which will include all accounts across your organization.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-grant.html#cfn-licensemanager-grant-principals)
     * @param principals The grant principals. You can specify one of the following as an Amazon
     * Resource Name (ARN):. 
     */
    override fun principals(principals: List<String>) {
      cdkBuilder.principals(principals)
    }

    /**
     * The grant principals. You can specify one of the following as an Amazon Resource Name (ARN):.
     *
     * * An AWS account, which includes only the account specified.
     * * An organizational unit (OU), which includes all accounts in the OU.
     * * An organization, which will include all accounts across your organization.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-grant.html#cfn-licensemanager-grant-principals)
     * @param principals The grant principals. You can specify one of the following as an Amazon
     * Resource Name (ARN):. 
     */
    override fun principals(vararg principals: String): Unit = principals(principals.toList())

    /**
     * Granted license status.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-grant.html#cfn-licensemanager-grant-status)
     * @param status Granted license status. 
     */
    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    public fun build(): software.amazon.awscdk.services.licensemanager.CfnGrant = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.licensemanager.CfnGrant.CFN_RESOURCE_TYPE_NAME

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
