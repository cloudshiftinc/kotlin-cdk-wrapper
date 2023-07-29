@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition
import software.constructs.Construct

/**
 * The `AWS::Greengrass::SubscriptionDefinition` resource represents a subscription definition for
 * AWS IoT Greengrass .
 *
 * Subscription definitions are used to organize your subscription definition versions.
 *
 * Subscription definitions can reference multiple subscription definition versions. All
 * subscription definition versions must be associated with a subscription definition. Each
 * subscription definition version can contain one or more subscriptions.
 *
 * When you create a subscription definition, you can optionally include an initial subscription
 * definition version. To associate a subscription definition version later, create an
 * [`AWS::Greengrass::SubscriptionDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinitionversion.html)
 * resource and specify the ID of this subscription definition.
 *
 * After you create the subscription definition version that contains the subscriptions you want to
 * deploy, you must add it to your group version. For more information, see
 * [`AWS::Greengrass::Group`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrass.*;
 * Object tags;
 * CfnSubscriptionDefinition cfnSubscriptionDefinition =
 * CfnSubscriptionDefinition.Builder.create(this, "MyCfnSubscriptionDefinition")
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
public class CfnSubscriptionDefinitionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnSubscriptionDefinition.Builder =
        CfnSubscriptionDefinition.Builder.create(scope, id)

    /**
     * The subscription definition version to include when the subscription definition is created.
     *
     * A subscription definition version contains a list of
     * [`subscription`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-subscriptiondefinition-subscription.html)
     * property types.
     *
     * To associate a subscription definition version after the subscription definition is created,
     * create an
     * [`AWS::Greengrass::SubscriptionDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinitionversion.html)
     * resource and specify the ID of this subscription definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinition.html#cfn-greengrass-subscriptiondefinition-initialversion)
     *
     * @param initialVersion The subscription definition version to include when the subscription
     *   definition is created.
     */
    public fun initialVersion(initialVersion: IResolvable) {
        cdkBuilder.initialVersion(initialVersion)
    }

    /**
     * The subscription definition version to include when the subscription definition is created.
     *
     * A subscription definition version contains a list of
     * [`subscription`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-subscriptiondefinition-subscription.html)
     * property types.
     *
     * To associate a subscription definition version after the subscription definition is created,
     * create an
     * [`AWS::Greengrass::SubscriptionDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinitionversion.html)
     * resource and specify the ID of this subscription definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinition.html#cfn-greengrass-subscriptiondefinition-initialversion)
     *
     * @param initialVersion The subscription definition version to include when the subscription
     *   definition is created.
     */
    public fun initialVersion(
        initialVersion: CfnSubscriptionDefinition.SubscriptionDefinitionVersionProperty
    ) {
        cdkBuilder.initialVersion(initialVersion)
    }

    /**
     * The name of the subscription definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinition.html#cfn-greengrass-subscriptiondefinition-name)
     *
     * @param name The name of the subscription definition.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * Application-specific metadata to attach to the subscription definition.
     *
     * You can use tags in IAM policies to control access to AWS IoT Greengrass resources. You can
     * also use tags to categorize your resources. For more information, see
     * [Tagging Your AWS IoT Greengrass Resources](https://docs.aws.amazon.com/greengrass/latest/developerguide/tagging.html)
     * in the *Developer Guide* .
     *
     * This `Json` property type is processed as a map of key-value pairs. It uses the following
     * format, which is different from most `Tags` implementations in AWS CloudFormation templates.
     *
     * ```
     * "Tags": { "KeyName0": "value", "KeyName1": "value", "KeyName2": "value"
     * }
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinition.html#cfn-greengrass-subscriptiondefinition-tags)
     *
     * @param tags Application-specific metadata to attach to the subscription definition.
     */
    public fun tags(tags: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(tags)
        cdkBuilder.tags(builder.map)
    }

    /**
     * Application-specific metadata to attach to the subscription definition.
     *
     * You can use tags in IAM policies to control access to AWS IoT Greengrass resources. You can
     * also use tags to categorize your resources. For more information, see
     * [Tagging Your AWS IoT Greengrass Resources](https://docs.aws.amazon.com/greengrass/latest/developerguide/tagging.html)
     * in the *Developer Guide* .
     *
     * This `Json` property type is processed as a map of key-value pairs. It uses the following
     * format, which is different from most `Tags` implementations in AWS CloudFormation templates.
     *
     * ```
     * "Tags": { "KeyName0": "value", "KeyName1": "value", "KeyName2": "value"
     * }
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinition.html#cfn-greengrass-subscriptiondefinition-tags)
     *
     * @param tags Application-specific metadata to attach to the subscription definition.
     */
    public fun tags(tags: Any) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnSubscriptionDefinition = cdkBuilder.build()
}
