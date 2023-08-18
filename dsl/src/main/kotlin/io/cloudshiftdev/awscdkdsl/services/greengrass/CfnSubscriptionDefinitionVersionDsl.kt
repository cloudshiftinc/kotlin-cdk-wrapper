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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersion
import software.constructs.Construct

/**
 * The `AWS::Greengrass::SubscriptionDefinitionVersion` resource represents a subscription
 * definition version for AWS IoT Greengrass .
 *
 * A subscription definition version contains a list of subscriptions.
 *
 * To create a subscription definition version, you must specify the ID of the subscription
 * definition that you want to associate with the version. For information about creating a
 * subscription definition, see
 * [`AWS::Greengrass::SubscriptionDefinition`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinition.html)
 * .
 *
 * After you create a subscription definition version that contains the subscriptions you want to
 * deploy, you must add it to your group version. For more information, see
 * [`AWS::Greengrass::Group`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrass.*;
 * CfnSubscriptionDefinitionVersion cfnSubscriptionDefinitionVersion =
 * CfnSubscriptionDefinitionVersion.Builder.create(this, "MyCfnSubscriptionDefinitionVersion")
 * .subscriptionDefinitionId("subscriptionDefinitionId")
 * .subscriptions(List.of(SubscriptionProperty.builder()
 * .id("id")
 * .source("source")
 * .subject("subject")
 * .target("target")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinitionversion.html)
 */
@CdkDslMarker
public class CfnSubscriptionDefinitionVersionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnSubscriptionDefinitionVersion.Builder =
        CfnSubscriptionDefinitionVersion.Builder.create(scope, id)

    private val _subscriptions: MutableList<Any> = mutableListOf()

    /**
     * The ID of the subscription definition associated with this version.
     *
     * This value is a GUID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinitionversion.html#cfn-greengrass-subscriptiondefinitionversion-subscriptiondefinitionid)
     *
     * @param subscriptionDefinitionId The ID of the subscription definition associated with this
     *   version.
     */
    public fun subscriptionDefinitionId(subscriptionDefinitionId: String) {
        cdkBuilder.subscriptionDefinitionId(subscriptionDefinitionId)
    }

    /**
     * The subscriptions in this version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinitionversion.html#cfn-greengrass-subscriptiondefinitionversion-subscriptions)
     *
     * @param subscriptions The subscriptions in this version.
     */
    public fun subscriptions(vararg subscriptions: Any) {
        _subscriptions.addAll(listOf(*subscriptions))
    }

    /**
     * The subscriptions in this version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinitionversion.html#cfn-greengrass-subscriptiondefinitionversion-subscriptions)
     *
     * @param subscriptions The subscriptions in this version.
     */
    public fun subscriptions(subscriptions: Collection<Any>) {
        _subscriptions.addAll(subscriptions)
    }

    /**
     * The subscriptions in this version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinitionversion.html#cfn-greengrass-subscriptiondefinitionversion-subscriptions)
     *
     * @param subscriptions The subscriptions in this version.
     */
    public fun subscriptions(subscriptions: IResolvable) {
        cdkBuilder.subscriptions(subscriptions)
    }

    public fun build(): CfnSubscriptionDefinitionVersion {
        if (_subscriptions.isNotEmpty()) cdkBuilder.subscriptions(_subscriptions)
        return cdkBuilder.build()
    }
}
