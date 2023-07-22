@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.vpclattice

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.vpclattice.CfnTargetGroup
import software.constructs.Construct

/**
 * Creates a target group.
 *
 * A target group is a collection of targets, or compute resources, that run your application or
 * service. A target group can only be used by a single service.
 *
 * For more information, see [Target
 * groups](https://docs.aws.amazon.com/vpc-lattice/latest/ug/target-groups.html) in the *Amazon VPC
 * Lattice User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.vpclattice.*;
 * CfnTargetGroup cfnTargetGroup = CfnTargetGroup.Builder.create(this, "MyCfnTargetGroup")
 * .type("type")
 * // the properties below are optional
 * .config(TargetGroupConfigProperty.builder()
 * .port(123)
 * .protocol("protocol")
 * .vpcIdentifier("vpcIdentifier")
 * // the properties below are optional
 * .healthCheck(HealthCheckConfigProperty.builder()
 * .enabled(false)
 * .healthCheckIntervalSeconds(123)
 * .healthCheckTimeoutSeconds(123)
 * .healthyThresholdCount(123)
 * .matcher(MatcherProperty.builder()
 * .httpCode("httpCode")
 * .build())
 * .path("path")
 * .port(123)
 * .protocol("protocol")
 * .protocolVersion("protocolVersion")
 * .unhealthyThresholdCount(123)
 * .build())
 * .ipAddressType("ipAddressType")
 * .protocolVersion("protocolVersion")
 * .build())
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .targets(List.of(TargetProperty.builder()
 * .id("id")
 * // the properties below are optional
 * .port(123)
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-targetgroup.html)
 */
@CdkDslMarker
public class CfnTargetGroupDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnTargetGroup.Builder = CfnTargetGroup.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  private val _targets: MutableList<Any> = mutableListOf()

  /**
   * The target group configuration.
   *
   * If `type` is set to `LAMBDA` , this parameter doesn't apply.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-targetgroup.html#cfn-vpclattice-targetgroup-config)
   * @param config The target group configuration. 
   */
  public fun config(config: IResolvable) {
    cdkBuilder.config(config)
  }

  /**
   * The target group configuration.
   *
   * If `type` is set to `LAMBDA` , this parameter doesn't apply.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-targetgroup.html#cfn-vpclattice-targetgroup-config)
   * @param config The target group configuration. 
   */
  public fun config(config: CfnTargetGroup.TargetGroupConfigProperty) {
    cdkBuilder.config(config)
  }

  /**
   * The name of the target group.
   *
   * The name must be unique within the account. The valid characters are a-z, 0-9, and hyphens (-).
   * You can't use a hyphen as the first or last character, or immediately after another hyphen.
   *
   * If you don't specify a name, CloudFormation generates one. However, if you specify a name, and
   * later want to replace the resource, you must specify a new name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-targetgroup.html#cfn-vpclattice-targetgroup-name)
   * @param name The name of the target group. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The tags for the target group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-targetgroup.html#cfn-vpclattice-targetgroup-tags)
   * @param tags The tags for the target group. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * The tags for the target group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-targetgroup.html#cfn-vpclattice-targetgroup-tags)
   * @param tags The tags for the target group. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * Describes a target.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-targetgroup.html#cfn-vpclattice-targetgroup-targets)
   * @param targets Describes a target. 
   */
  public fun targets(vararg targets: Any) {
    _targets.addAll(listOf(*targets))
  }

  /**
   * Describes a target.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-targetgroup.html#cfn-vpclattice-targetgroup-targets)
   * @param targets Describes a target. 
   */
  public fun targets(targets: Collection<Any>) {
    _targets.addAll(targets)
  }

  /**
   * Describes a target.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-targetgroup.html#cfn-vpclattice-targetgroup-targets)
   * @param targets Describes a target. 
   */
  public fun targets(targets: IResolvable) {
    cdkBuilder.targets(targets)
  }

  /**
   * The type of target group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-targetgroup.html#cfn-vpclattice-targetgroup-type)
   * @param type The type of target group. 
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnTargetGroup {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    if(_targets.isNotEmpty()) cdkBuilder.targets(_targets)
    return cdkBuilder.build()
  }
}
