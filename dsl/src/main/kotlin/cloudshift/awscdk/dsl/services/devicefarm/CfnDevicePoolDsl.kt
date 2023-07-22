@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.devicefarm

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.devicefarm.CfnDevicePool
import software.constructs.Construct

/**
 * Represents a request to the create device pool operation.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.devicefarm.*;
 * CfnDevicePool cfnDevicePool = CfnDevicePool.Builder.create(this, "MyCfnDevicePool")
 * .name("name")
 * .projectArn("projectArn")
 * .rules(List.of(RuleProperty.builder()
 * .attribute("attribute")
 * .operator("operator")
 * .value("value")
 * .build()))
 * // the properties below are optional
 * .description("description")
 * .maxDevices(123)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-devicepool.html)
 */
@CdkDslMarker
public class CfnDevicePoolDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnDevicePool.Builder = CfnDevicePool.Builder.create(scope, id)

  private val _rules: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The device pool's description.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-devicepool.html#cfn-devicefarm-devicepool-description)
   * @param description The device pool's description. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The number of devices that Device Farm can add to your device pool.
   *
   * Device Farm adds devices that are available and meet the criteria that you assign for the
   * `rules` parameter. Depending on how many devices meet these constraints, your device pool might
   * contain fewer devices than the value for this parameter.
   *
   * By specifying the maximum number of devices, you can control the costs that you incur by
   * running tests.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-devicepool.html#cfn-devicefarm-devicepool-maxdevices)
   * @param maxDevices The number of devices that Device Farm can add to your device pool. 
   */
  public fun maxDevices(maxDevices: Number) {
    cdkBuilder.maxDevices(maxDevices)
  }

  /**
   * The device pool's name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-devicepool.html#cfn-devicefarm-devicepool-name)
   * @param name The device pool's name. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The ARN of the project for the device pool.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-devicepool.html#cfn-devicefarm-devicepool-projectarn)
   * @param projectArn The ARN of the project for the device pool. 
   */
  public fun projectArn(projectArn: String) {
    cdkBuilder.projectArn(projectArn)
  }

  /**
   * The device pool's rules.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-devicepool.html#cfn-devicefarm-devicepool-rules)
   * @param rules The device pool's rules. 
   */
  public fun rules(vararg rules: Any) {
    _rules.addAll(listOf(*rules))
  }

  /**
   * The device pool's rules.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-devicepool.html#cfn-devicefarm-devicepool-rules)
   * @param rules The device pool's rules. 
   */
  public fun rules(rules: Collection<Any>) {
    _rules.addAll(rules)
  }

  /**
   * The device pool's rules.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-devicepool.html#cfn-devicefarm-devicepool-rules)
   * @param rules The device pool's rules. 
   */
  public fun rules(rules: IResolvable) {
    cdkBuilder.rules(rules)
  }

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * in the *guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-devicepool.html#cfn-devicefarm-devicepool-tags)
   * @param tags An array of key-value pairs to apply to this resource. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * in the *guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-devicepool.html#cfn-devicefarm-devicepool-tags)
   * @param tags An array of key-value pairs to apply to this resource. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnDevicePool {
    if(_rules.isNotEmpty()) cdkBuilder.rules(_rules)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
