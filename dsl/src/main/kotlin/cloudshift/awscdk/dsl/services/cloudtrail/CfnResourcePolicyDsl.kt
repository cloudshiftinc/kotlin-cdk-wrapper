@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudtrail

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudtrail.CfnResourcePolicy
import software.constructs.Construct

@CdkDslMarker
public class CfnResourcePolicyDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnResourcePolicy.Builder = CfnResourcePolicy.Builder.create(scope, id)

  /**
   * The Amazon Resource Name (ARN) of the CloudTrail channel attached to the resource-based policy.
   *
   * The following is the format of a resource ARN:
   * `arn:aws:cloudtrail:us-east-2:123456789012:channel/MyChannel` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-resourcepolicy.html#cfn-cloudtrail-resourcepolicy-resourcearn)
   * @param resourceArn The Amazon Resource Name (ARN) of the CloudTrail channel attached to the
   * resource-based policy. 
   */
  public fun resourceArn(resourceArn: String) {
    cdkBuilder.resourceArn(resourceArn)
  }

  /**
   * A JSON-formatted string for an AWS resource-based policy.
   *
   * The following are requirements for the resource policy:
   *
   * * Contains only one action: cloudtrail-data:PutAuditEvents
   * * Contains at least one statement. The policy can have a maximum of 20 statements.
   * * Each statement contains at least one principal. A statement can have a maximum of 50
   * principals.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-resourcepolicy.html#cfn-cloudtrail-resourcepolicy-resourcepolicy)
   * @param resourcePolicy A JSON-formatted string for an AWS resource-based policy. 
   */
  public fun resourcePolicy(resourcePolicy: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(resourcePolicy)
    cdkBuilder.resourcePolicy(builder.map)
  }

  /**
   * A JSON-formatted string for an AWS resource-based policy.
   *
   * The following are requirements for the resource policy:
   *
   * * Contains only one action: cloudtrail-data:PutAuditEvents
   * * Contains at least one statement. The policy can have a maximum of 20 statements.
   * * Each statement contains at least one principal. A statement can have a maximum of 50
   * principals.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-resourcepolicy.html#cfn-cloudtrail-resourcepolicy-resourcepolicy)
   * @param resourcePolicy A JSON-formatted string for an AWS resource-based policy. 
   */
  public fun resourcePolicy(resourcePolicy: Any) {
    cdkBuilder.resourcePolicy(resourcePolicy)
  }

  public fun build(): CfnResourcePolicy = cdkBuilder.build()
}
