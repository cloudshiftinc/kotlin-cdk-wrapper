@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudtrail

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudtrail.CfnResourcePolicyProps

/**
 * Properties for defining a `CfnResourcePolicy`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudtrail.*;
 * Object resourcePolicy;
 * CfnResourcePolicyProps cfnResourcePolicyProps = CfnResourcePolicyProps.builder()
 * .resourceArn("resourceArn")
 * .resourcePolicy(resourcePolicy)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-resourcepolicy.html)
 */
@CdkDslMarker
public class CfnResourcePolicyPropsDsl {
  private val cdkBuilder: CfnResourcePolicyProps.Builder = CfnResourcePolicyProps.builder()

  /**
   * @param resourceArn The Amazon Resource Name (ARN) of the CloudTrail channel attached to the
   * resource-based policy. 
   * The following is the format of a resource ARN:
   * `arn:aws:cloudtrail:us-east-2:123456789012:channel/MyChannel` .
   */
  public fun resourceArn(resourceArn: String) {
    cdkBuilder.resourceArn(resourceArn)
  }

  /**
   * @param resourcePolicy A JSON-formatted string for an AWS resource-based policy. 
   * The following are requirements for the resource policy:
   *
   * * Contains only one action: cloudtrail-data:PutAuditEvents
   * * Contains at least one statement. The policy can have a maximum of 20 statements.
   * * Each statement contains at least one principal. A statement can have a maximum of 50
   * principals.
   */
  public fun resourcePolicy(resourcePolicy: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(resourcePolicy)
    cdkBuilder.resourcePolicy(builder.map)
  }

  /**
   * @param resourcePolicy A JSON-formatted string for an AWS resource-based policy. 
   * The following are requirements for the resource policy:
   *
   * * Contains only one action: cloudtrail-data:PutAuditEvents
   * * Contains at least one statement. The policy can have a maximum of 20 statements.
   * * Each statement contains at least one principal. A statement can have a maximum of 50
   * principals.
   */
  public fun resourcePolicy(resourcePolicy: Any) {
    cdkBuilder.resourcePolicy(resourcePolicy)
  }

  public fun build(): CfnResourcePolicyProps = cdkBuilder.build()
}
