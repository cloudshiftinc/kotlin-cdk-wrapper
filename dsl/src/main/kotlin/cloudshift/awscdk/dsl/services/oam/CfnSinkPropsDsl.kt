@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.oam

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.services.oam.CfnSinkProps

/**
 * Properties for defining a `CfnSink`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.oam.*;
 * Object policy;
 * CfnSinkProps cfnSinkProps = CfnSinkProps.builder()
 * .name("name")
 * // the properties below are optional
 * .policy(policy)
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-oam-sink.html)
 */
@CdkDslMarker
public class CfnSinkPropsDsl {
  private val cdkBuilder: CfnSinkProps.Builder = CfnSinkProps.builder()

  /**
   * @param name A name for the sink. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param policy The IAM policy that grants permissions to source accounts to link to this sink.
   * The policy can grant permission in the following ways:
   *
   * * Include organization IDs or organization paths to permit all accounts in an organization
   * * Include account IDs to permit the specified accounts
   */
  public fun policy(policy: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(policy)
    cdkBuilder.policy(builder.map)
  }

  /**
   * @param policy The IAM policy that grants permissions to source accounts to link to this sink.
   * The policy can grant permission in the following ways:
   *
   * * Include organization IDs or organization paths to permit all accounts in an organization
   * * Include account IDs to permit the specified accounts
   */
  public fun policy(policy: Any) {
    cdkBuilder.policy(policy)
  }

  /**
   * @param tags An array of key-value pairs to apply to the sink.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnSinkProps = cdkBuilder.build()
}
