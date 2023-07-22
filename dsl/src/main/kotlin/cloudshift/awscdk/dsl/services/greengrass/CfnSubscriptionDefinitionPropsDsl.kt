@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition
import software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionProps

/**
 * Properties for defining a `CfnSubscriptionDefinition`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrass.*;
 * Object tags;
 * CfnSubscriptionDefinitionProps cfnSubscriptionDefinitionProps =
 * CfnSubscriptionDefinitionProps.builder()
 * .name("name")
 * // the properties below are optional
 * .initialVersion(SubscriptionDefinitionVersionProperty.builder()
 * .subscriptions(List.of(SubscriptionProperty.builder()
 * .id("id")
 * .source("source")
 * .subject("subject")
 * .target("target")
 * .build()))
 * .build())
 * .tags(tags)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinition.html)
 */
@CdkDslMarker
public class CfnSubscriptionDefinitionPropsDsl {
  private val cdkBuilder: CfnSubscriptionDefinitionProps.Builder =
      CfnSubscriptionDefinitionProps.builder()

  /**
   * @param initialVersion The subscription definition version to include when the subscription
   * definition is created.
   * A subscription definition version contains a list of
   * [`subscription`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-subscriptiondefinition-subscription.html)
   * property types.
   *
   *
   * To associate a subscription definition version after the subscription definition is created,
   * create an
   * [`AWS::Greengrass::SubscriptionDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinitionversion.html)
   * resource and specify the ID of this subscription definition.
   */
  public fun initialVersion(initialVersion: IResolvable) {
    cdkBuilder.initialVersion(initialVersion)
  }

  /**
   * @param initialVersion The subscription definition version to include when the subscription
   * definition is created.
   * A subscription definition version contains a list of
   * [`subscription`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-subscriptiondefinition-subscription.html)
   * property types.
   *
   *
   * To associate a subscription definition version after the subscription definition is created,
   * create an
   * [`AWS::Greengrass::SubscriptionDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinitionversion.html)
   * resource and specify the ID of this subscription definition.
   */
  public
      fun initialVersion(initialVersion: CfnSubscriptionDefinition.SubscriptionDefinitionVersionProperty) {
    cdkBuilder.initialVersion(initialVersion)
  }

  /**
   * @param name The name of the subscription definition. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param tags Application-specific metadata to attach to the subscription definition.
   * You can use tags in IAM policies to control access to AWS IoT Greengrass resources. You can
   * also use tags to categorize your resources. For more information, see [Tagging Your AWS IoT
   * Greengrass Resources](https://docs.aws.amazon.com/greengrass/latest/developerguide/tagging.html)
   * in the *Developer Guide* .
   *
   * This `Json` property type is processed as a map of key-value pairs. It uses the following
   * format, which is different from most `Tags` implementations in AWS CloudFormation templates.
   *
   * ```
   * "Tags": { "KeyName0": "value", "KeyName1": "value", "KeyName2": "value"
   * }
   * ```
   */
  public fun tags(tags: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(tags)
    cdkBuilder.tags(builder.map)
  }

  /**
   * @param tags Application-specific metadata to attach to the subscription definition.
   * You can use tags in IAM policies to control access to AWS IoT Greengrass resources. You can
   * also use tags to categorize your resources. For more information, see [Tagging Your AWS IoT
   * Greengrass Resources](https://docs.aws.amazon.com/greengrass/latest/developerguide/tagging.html)
   * in the *Developer Guide* .
   *
   * This `Json` property type is processed as a map of key-value pairs. It uses the following
   * format, which is different from most `Tags` implementations in AWS CloudFormation templates.
   *
   * ```
   * "Tags": { "KeyName0": "value", "KeyName1": "value", "KeyName2": "value"
   * }
   * ```
   */
  public fun tags(tags: Any) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnSubscriptionDefinitionProps = cdkBuilder.build()
}
