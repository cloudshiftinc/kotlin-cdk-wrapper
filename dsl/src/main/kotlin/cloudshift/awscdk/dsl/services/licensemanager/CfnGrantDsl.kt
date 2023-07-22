@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.licensemanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.licensemanager.CfnGrant
import software.constructs.Construct

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
 * import software.amazon.awscdk.services.licensemanager.*;
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
@CdkDslMarker
public class CfnGrantDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnGrant.Builder = CfnGrant.Builder.create(scope, id)

  private val _allowedOperations: MutableList<String> = mutableListOf()

  private val _principals: MutableList<String> = mutableListOf()

  /**
   * Allowed operations for the grant.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-grant.html#cfn-licensemanager-grant-allowedoperations)
   * @param allowedOperations Allowed operations for the grant. 
   */
  public fun allowedOperations(vararg allowedOperations: String) {
    _allowedOperations.addAll(listOf(*allowedOperations))
  }

  /**
   * Allowed operations for the grant.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-grant.html#cfn-licensemanager-grant-allowedoperations)
   * @param allowedOperations Allowed operations for the grant. 
   */
  public fun allowedOperations(allowedOperations: Collection<String>) {
    _allowedOperations.addAll(allowedOperations)
  }

  /**
   * Grant name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-grant.html#cfn-licensemanager-grant-grantname)
   * @param grantName Grant name. 
   */
  public fun grantName(grantName: String) {
    cdkBuilder.grantName(grantName)
  }

  /**
   * Home Region of the grant.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-grant.html#cfn-licensemanager-grant-homeregion)
   * @param homeRegion Home Region of the grant. 
   */
  public fun homeRegion(homeRegion: String) {
    cdkBuilder.homeRegion(homeRegion)
  }

  /**
   * License ARN.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-grant.html#cfn-licensemanager-grant-licensearn)
   * @param licenseArn License ARN. 
   */
  public fun licenseArn(licenseArn: String) {
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
  public fun principals(vararg principals: String) {
    _principals.addAll(listOf(*principals))
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
  public fun principals(principals: Collection<String>) {
    _principals.addAll(principals)
  }

  /**
   * Granted license status.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-grant.html#cfn-licensemanager-grant-status)
   * @param status Granted license status. 
   */
  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  public fun build(): CfnGrant {
    if(_allowedOperations.isNotEmpty()) cdkBuilder.allowedOperations(_allowedOperations)
    if(_principals.isNotEmpty()) cdkBuilder.principals(_principals)
    return cdkBuilder.build()
  }
}
