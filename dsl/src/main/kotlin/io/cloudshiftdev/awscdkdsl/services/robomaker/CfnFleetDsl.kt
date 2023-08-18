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

package io.cloudshiftdev.awscdkdsl.services.robomaker

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.robomaker.CfnFleet
import software.constructs.Construct

/**
 * The following resource is now deprecated.
 *
 * This resource can no longer be provisioned via stack create or update operations, and should not
 * be included in your stack templates.
 *
 * We recommend migrating to AWS IoT Greengrass Version 2. For more information, see
 * [Support Changes: May 2, 2022](https://docs.aws.amazon.com/robomaker/latest/dg/chapter-support-policy.html#software-support-policy-may2022)
 * in the *AWS RoboMaker Developer Guide* .
 *
 * The `AWS::RoboMaker::Fleet` resource creates an AWS RoboMaker fleet. Fleets contain robots and
 * can receive deployments.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.robomaker.*;
 * CfnFleet cfnFleet = CfnFleet.Builder.create(this, "MyCfnFleet")
 * .name("name")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-fleet.html)
 */
@CdkDslMarker
public class CfnFleetDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnFleet.Builder = CfnFleet.Builder.create(scope, id)

    /**
     * The name of the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-fleet.html#cfn-robomaker-fleet-name)
     *
     * @param name The name of the fleet.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The list of all tags added to the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-fleet.html#cfn-robomaker-fleet-tags)
     *
     * @param tags The list of all tags added to the fleet.
     */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnFleet = cdkBuilder.build()
}
