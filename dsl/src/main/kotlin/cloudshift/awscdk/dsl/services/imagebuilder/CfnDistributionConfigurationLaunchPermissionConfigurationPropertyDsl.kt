@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.imagebuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration

@CdkDslMarker
public class CfnDistributionConfigurationLaunchPermissionConfigurationPropertyDsl {
  private val cdkBuilder: CfnDistributionConfiguration.LaunchPermissionConfigurationProperty.Builder
      = CfnDistributionConfiguration.LaunchPermissionConfigurationProperty.builder()

  private val _organizationArns: MutableList<String> = mutableListOf()

  private val _organizationalUnitArns: MutableList<String> = mutableListOf()

  private val _userGroups: MutableList<String> = mutableListOf()

  private val _userIds: MutableList<String> = mutableListOf()

  /**
   * @param organizationArns The ARN for an AWS Organization that you want to share your AMI with.
   * For more information, see [What is AWS Organizations
   * ?](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_introduction.html) .
   */
  public fun organizationArns(vararg organizationArns: String) {
    _organizationArns.addAll(listOf(*organizationArns))
  }

  /**
   * @param organizationArns The ARN for an AWS Organization that you want to share your AMI with.
   * For more information, see [What is AWS Organizations
   * ?](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_introduction.html) .
   */
  public fun organizationArns(organizationArns: Collection<String>) {
    _organizationArns.addAll(organizationArns)
  }

  /**
   * @param organizationalUnitArns The ARN for an AWS Organizations organizational unit (OU) that
   * you want to share your AMI with.
   * For more information about key concepts for AWS Organizations , see [AWS Organizations
   * terminology and
   * concepts](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html)
   * .
   */
  public fun organizationalUnitArns(vararg organizationalUnitArns: String) {
    _organizationalUnitArns.addAll(listOf(*organizationalUnitArns))
  }

  /**
   * @param organizationalUnitArns The ARN for an AWS Organizations organizational unit (OU) that
   * you want to share your AMI with.
   * For more information about key concepts for AWS Organizations , see [AWS Organizations
   * terminology and
   * concepts](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html)
   * .
   */
  public fun organizationalUnitArns(organizationalUnitArns: Collection<String>) {
    _organizationalUnitArns.addAll(organizationalUnitArns)
  }

  /**
   * @param userGroups The name of the group.
   */
  public fun userGroups(vararg userGroups: String) {
    _userGroups.addAll(listOf(*userGroups))
  }

  /**
   * @param userGroups The name of the group.
   */
  public fun userGroups(userGroups: Collection<String>) {
    _userGroups.addAll(userGroups)
  }

  /**
   * @param userIds The AWS account ID.
   */
  public fun userIds(vararg userIds: String) {
    _userIds.addAll(listOf(*userIds))
  }

  /**
   * @param userIds The AWS account ID.
   */
  public fun userIds(userIds: Collection<String>) {
    _userIds.addAll(userIds)
  }

  public fun build(): CfnDistributionConfiguration.LaunchPermissionConfigurationProperty {
    if(_organizationArns.isNotEmpty()) cdkBuilder.organizationArns(_organizationArns)
    if(_organizationalUnitArns.isNotEmpty())
        cdkBuilder.organizationalUnitArns(_organizationalUnitArns)
    if(_userGroups.isNotEmpty()) cdkBuilder.userGroups(_userGroups)
    if(_userIds.isNotEmpty()) cdkBuilder.userIds(_userIds)
    return cdkBuilder.build()
  }
}
