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

package io.cloudshiftdev.awscdkdsl.services.greengrass

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition

/**
 * A subscription definition version contains a list of
 * [subscriptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-subscriptiondefinition-subscription.html)
 * .
 *
 * After you create a subscription definition version that contains the subscriptions you want to
 * deploy, you must add it to your group version. For more information, see
 * [`AWS::Greengrass::Group`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html)
 * .
 *
 * In an AWS CloudFormation template, `SubscriptionDefinitionVersion` is the property type of the
 * `InitialVersion` property in the
 * [`AWS::Greengrass::SubscriptionDefinition`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinition.html)
 * resource.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrass.*;
 * SubscriptionDefinitionVersionProperty subscriptionDefinitionVersionProperty =
 * SubscriptionDefinitionVersionProperty.builder()
 * .subscriptions(List.of(SubscriptionProperty.builder()
 * .id("id")
 * .source("source")
 * .subject("subject")
 * .target("target")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-subscriptiondefinition-subscriptiondefinitionversion.html)
 */
@CdkDslMarker
public class CfnSubscriptionDefinitionSubscriptionDefinitionVersionPropertyDsl {
    private val cdkBuilder:
        CfnSubscriptionDefinition.SubscriptionDefinitionVersionProperty.Builder =
        CfnSubscriptionDefinition.SubscriptionDefinitionVersionProperty.builder()

    private val _subscriptions: MutableList<Any> = mutableListOf()

    /** @param subscriptions The subscriptions in this version. */
    public fun subscriptions(vararg subscriptions: Any) {
        _subscriptions.addAll(listOf(*subscriptions))
    }

    /** @param subscriptions The subscriptions in this version. */
    public fun subscriptions(subscriptions: Collection<Any>) {
        _subscriptions.addAll(subscriptions)
    }

    /** @param subscriptions The subscriptions in this version. */
    public fun subscriptions(subscriptions: IResolvable) {
        cdkBuilder.subscriptions(subscriptions)
    }

    public fun build(): CfnSubscriptionDefinition.SubscriptionDefinitionVersionProperty {
        if (_subscriptions.isNotEmpty()) cdkBuilder.subscriptions(_subscriptions)
        return cdkBuilder.build()
    }
}
