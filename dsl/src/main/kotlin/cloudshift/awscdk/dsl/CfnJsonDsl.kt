@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.CfnJson
import software.constructs.Construct

/**
 * Captures a synthesis-time JSON object a CloudFormation reference which resolves during deployment
 * to the resolved values of the JSON object.
 *
 * The main use case for this is to overcome a limitation in CloudFormation that
 * does not allow using intrinsic functions as dictionary keys (because
 * dictionary keys in JSON must be strings). Specifically this is common in IAM
 * conditions such as `StringEquals: { lhs: "rhs" }` where you want "lhs" to be
 * a reference.
 *
 * This object is resolvable, so it can be used as a value.
 *
 * This construct is backed by a custom resource.
 *
 * Example:
 *
 * ```
 * CfnParameter tagParam = new CfnParameter(this, "TagName");
 * CfnJson stringEquals = CfnJson.Builder.create(this, "ConditionJson")
 * .value(Map.of(
 * String.format("aws:PrincipalTag/%s", tagParam.getValueAsString()), true))
 * .build();
 * PrincipalBase principal = new AccountRootPrincipal().withConditions(Map.of(
 * "StringEquals", stringEquals));
 * Role.Builder.create(this, "MyRole").assumedBy(principal).build();
 * ```
 */
@CdkDslMarker
public class CfnJsonDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnJson.Builder = CfnJson.Builder.create(scope, id)

  /**
   * The value to resolve.
   *
   * Can be any JavaScript object, including tokens and
   * references in keys or values.
   *
   * @param value The value to resolve. 
   */
  public fun `value`(`value`: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(`value`)
    cdkBuilder.`value`(builder.map)
  }

  /**
   * The value to resolve.
   *
   * Can be any JavaScript object, including tokens and
   * references in keys or values.
   *
   * @param value The value to resolve. 
   */
  public fun `value`(`value`: Any) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnJson = cdkBuilder.build()
}
