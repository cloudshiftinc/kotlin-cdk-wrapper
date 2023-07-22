@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.ResourceProps

@CdkDslMarker
public class ResourcePropsDsl {
  private val cdkBuilder: ResourceProps.Builder = ResourceProps.builder()

  /**
   * @param account The AWS account ID this resource belongs to.
   */
  public fun account(account: String) {
    cdkBuilder.account(account)
  }

  /**
   * @param environmentFromArn ARN to deduce region and account from.
   * The ARN is parsed and the account and region are taken from the ARN.
   * This should be used for imported resources.
   *
   * Cannot be supplied together with either `account` or `region`.
   */
  public fun environmentFromArn(environmentFromArn: String) {
    cdkBuilder.environmentFromArn(environmentFromArn)
  }

  /**
   * @param physicalName The value passed in by users to the physical name prop of the resource.
   * * `undefined` implies that a physical name will be allocated by
   * CloudFormation during deployment.
   * * a concrete value implies a specific physical name
   * * `PhysicalName.GENERATE_IF_NEEDED` is a marker that indicates that a physical will only be
   * generated
   * by the CDK if it is needed for cross-environment references. Otherwise, it will be allocated by
   * CloudFormation.
   */
  public fun physicalName(physicalName: String) {
    cdkBuilder.physicalName(physicalName)
  }

  /**
   * @param region The AWS region this resource belongs to.
   */
  public fun region(region: String) {
    cdkBuilder.region(region)
  }

  public fun build(): ResourceProps = cdkBuilder.build()
}
