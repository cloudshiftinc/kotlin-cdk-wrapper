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

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecs.CfnCapacityProvider
import software.constructs.Construct

/**
 * Creates a new capacity provider.
 *
 * Capacity providers are associated with an Amazon ECS cluster and are used in capacity provider
 * strategies to facilitate cluster auto scaling.
 *
 * Only capacity providers that use an Auto Scaling group can be created. Amazon ECS tasks on AWS
 * Fargate use the `FARGATE` and `FARGATE_SPOT` capacity providers. These providers are available to
 * all accounts in the AWS Regions that AWS Fargate supports.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * CfnCapacityProvider cfnCapacityProvider = CfnCapacityProvider.Builder.create(this,
 * "MyCfnCapacityProvider")
 * .autoScalingGroupProvider(AutoScalingGroupProviderProperty.builder()
 * .autoScalingGroupArn("autoScalingGroupArn")
 * // the properties below are optional
 * .managedScaling(ManagedScalingProperty.builder()
 * .instanceWarmupPeriod(123)
 * .maximumScalingStepSize(123)
 * .minimumScalingStepSize(123)
 * .status("status")
 * .targetCapacity(123)
 * .build())
 * .managedTerminationProtection("managedTerminationProtection")
 * .build())
 * // the properties below are optional
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-capacityprovider.html)
 */
@CdkDslMarker
public class CfnCapacityProviderDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnCapacityProvider.Builder =
        CfnCapacityProvider.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The Auto Scaling group settings for the capacity provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-capacityprovider.html#cfn-ecs-capacityprovider-autoscalinggroupprovider)
     *
     * @param autoScalingGroupProvider The Auto Scaling group settings for the capacity provider.
     */
    public fun autoScalingGroupProvider(autoScalingGroupProvider: IResolvable) {
        cdkBuilder.autoScalingGroupProvider(autoScalingGroupProvider)
    }

    /**
     * The Auto Scaling group settings for the capacity provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-capacityprovider.html#cfn-ecs-capacityprovider-autoscalinggroupprovider)
     *
     * @param autoScalingGroupProvider The Auto Scaling group settings for the capacity provider.
     */
    public fun autoScalingGroupProvider(
        autoScalingGroupProvider: CfnCapacityProvider.AutoScalingGroupProviderProperty
    ) {
        cdkBuilder.autoScalingGroupProvider(autoScalingGroupProvider)
    }

    /**
     * The name of the capacity provider.
     *
     * If a name is specified, it cannot start with `aws` , `ecs` , or `fargate` . If no name is
     * specified, a default name in the `CFNStackName-CFNResourceName-RandomString` format is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-capacityprovider.html#cfn-ecs-capacityprovider-name)
     *
     * @param name The name of the capacity provider.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The metadata that you apply to the capacity provider to help you categorize and organize it.
     *
     * Each tag consists of a key and an optional value. You define both.
     *
     * The following basic restrictions apply to tags:
     * * Maximum number of tags per resource - 50
     * * For each resource, each tag key must be unique, and each tag key can have only one value.
     * * Maximum key length - 128 Unicode characters in UTF-8
     * * Maximum value length - 256 Unicode characters in UTF-8
     * * If your tagging schema is used across multiple services and resources, remember that other
     *   services may have restrictions on allowed characters. Generally allowed characters are:
     *   letters, numbers, and spaces representable in UTF-8, and the following characters: + - = .
     *   _ : /
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-capacityprovider.html#cfn-ecs-capacityprovider-tags)
     *
     * @param tags The metadata that you apply to the capacity provider to help you categorize and
     *   organize it.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The metadata that you apply to the capacity provider to help you categorize and organize it.
     *
     * Each tag consists of a key and an optional value. You define both.
     *
     * The following basic restrictions apply to tags:
     * * Maximum number of tags per resource - 50
     * * For each resource, each tag key must be unique, and each tag key can have only one value.
     * * Maximum key length - 128 Unicode characters in UTF-8
     * * Maximum value length - 256 Unicode characters in UTF-8
     * * If your tagging schema is used across multiple services and resources, remember that other
     *   services may have restrictions on allowed characters. Generally allowed characters are:
     *   letters, numbers, and spaces representable in UTF-8, and the following characters: + - = .
     *   _ : /
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-capacityprovider.html#cfn-ecs-capacityprovider-tags)
     *
     * @param tags The metadata that you apply to the capacity provider to help you categorize and
     *   organize it.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnCapacityProvider {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
