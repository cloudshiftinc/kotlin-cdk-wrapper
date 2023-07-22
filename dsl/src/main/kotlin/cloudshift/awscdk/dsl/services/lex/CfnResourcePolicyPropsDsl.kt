@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lex.CfnResourcePolicyProps

/**
 * Properties for defining a `CfnResourcePolicy`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lex.*;
 * Object policy;
 * CfnResourcePolicyProps cfnResourcePolicyProps = CfnResourcePolicyProps.builder()
 * .policy(policy)
 * .resourceArn("resourceArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-resourcepolicy.html)
 */
@CdkDslMarker
public class CfnResourcePolicyPropsDsl {
  private val cdkBuilder: CfnResourcePolicyProps.Builder = CfnResourcePolicyProps.builder()

  /**
   * @param policy A resource policy to add to the resource. 
   * The policy is a JSON structure that contains one or more statements that define the policy. The
   * policy must follow IAM syntax. If the policy isn't valid, Amazon Lex returns a validation
   * exception.
   */
  public fun policy(policy: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(policy)
    cdkBuilder.policy(builder.map)
  }

  /**
   * @param policy A resource policy to add to the resource. 
   * The policy is a JSON structure that contains one or more statements that define the policy. The
   * policy must follow IAM syntax. If the policy isn't valid, Amazon Lex returns a validation
   * exception.
   */
  public fun policy(policy: Any) {
    cdkBuilder.policy(policy)
  }

  /**
   * @param resourceArn The Amazon Resource Name (ARN) of the bot or bot alias that the resource
   * policy is attached to. 
   */
  public fun resourceArn(resourceArn: String) {
    cdkBuilder.resourceArn(resourceArn)
  }

  public fun build(): CfnResourcePolicyProps = cdkBuilder.build()
}
