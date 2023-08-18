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

package io.cloudshiftdev.awscdkdsl.services.refactorspaces

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.refactorspaces.CfnEnvironment
import software.constructs.Construct

/**
 * Creates an AWS Migration Hub Refactor Spaces environment.
 *
 * The caller owns the environment resource, and all Refactor Spaces applications, services, and
 * routes created within the environment. They are referred to as the *environment owner* . The
 * environment owner has cross-account visibility and control of Refactor Spaces resources that are
 * added to the environment by other accounts that the environment is shared with.
 *
 * When creating an environment with a
 * [CreateEnvironment:NetworkFabricType](https://docs.aws.amazon.com/migrationhub-refactor-spaces/latest/APIReference/API_CreateEnvironment.html#migrationhubrefactorspaces-CreateEnvironment-request-NetworkFabricType)
 * of `TRANSIT_GATEWAY` , Refactor Spaces provisions a transit gateway to enable services in VPCs to
 * communicate directly across accounts. If
 * [CreateEnvironment:NetworkFabricType](https://docs.aws.amazon.com/migrationhub-refactor-spaces/latest/APIReference/API_CreateEnvironment.html#migrationhubrefactorspaces-CreateEnvironment-request-NetworkFabricType)
 * is `NONE` , Refactor Spaces does not create a transit gateway and you must use your network
 * infrastructure to route traffic to services with private URL endpoints.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.refactorspaces.*;
 * CfnEnvironment cfnEnvironment = CfnEnvironment.Builder.create(this, "MyCfnEnvironment")
 * .name("name")
 * .networkFabricType("networkFabricType")
 * // the properties below are optional
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-environment.html)
 */
@CdkDslMarker
public class CfnEnvironmentDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnEnvironment.Builder = CfnEnvironment.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * A description of the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-environment.html#cfn-refactorspaces-environment-description)
     *
     * @param description A description of the environment.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The name of the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-environment.html#cfn-refactorspaces-environment-name)
     *
     * @param name The name of the environment.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The network fabric type of the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-environment.html#cfn-refactorspaces-environment-networkfabrictype)
     *
     * @param networkFabricType The network fabric type of the environment.
     */
    public fun networkFabricType(networkFabricType: String) {
        cdkBuilder.networkFabricType(networkFabricType)
    }

    /**
     * The tags assigned to the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-environment.html#cfn-refactorspaces-environment-tags)
     *
     * @param tags The tags assigned to the environment.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags assigned to the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-environment.html#cfn-refactorspaces-environment-tags)
     *
     * @param tags The tags assigned to the environment.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnEnvironment {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
