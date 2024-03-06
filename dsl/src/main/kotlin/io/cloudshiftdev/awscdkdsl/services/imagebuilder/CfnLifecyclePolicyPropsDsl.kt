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

package io.cloudshiftdev.awscdkdsl.services.imagebuilder

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy
import software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicyProps

/**
 * Properties for defining a `CfnLifecyclePolicy`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.imagebuilder.*;
 * CfnLifecyclePolicyProps cfnLifecyclePolicyProps = CfnLifecyclePolicyProps.builder()
 * .executionRole("executionRole")
 * .name("name")
 * .policyDetails(List.of(PolicyDetailProperty.builder()
 * .action(ActionProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .includeResources(IncludeResourcesProperty.builder()
 * .amis(false)
 * .containers(false)
 * .snapshots(false)
 * .build())
 * .build())
 * .filter(FilterProperty.builder()
 * .type("type")
 * .value(123)
 * // the properties below are optional
 * .retainAtLeast(123)
 * .unit("unit")
 * .build())
 * // the properties below are optional
 * .exclusionRules(ExclusionRulesProperty.builder()
 * .amis(AmiExclusionRulesProperty.builder()
 * .isPublic(false)
 * .lastLaunched(LastLaunchedProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .regions(List.of("regions"))
 * .sharedAccounts(List.of("sharedAccounts"))
 * .tagMap(Map.of(
 * "tagMapKey", "tagMap"))
 * .build())
 * .tagMap(Map.of(
 * "tagMapKey", "tagMap"))
 * .build())
 * .build()))
 * .resourceSelection(ResourceSelectionProperty.builder()
 * .recipes(List.of(RecipeSelectionProperty.builder()
 * .name("name")
 * .semanticVersion("semanticVersion")
 * .build()))
 * .tagMap(Map.of(
 * "tagMapKey", "tagMap"))
 * .build())
 * .resourceType("resourceType")
 * // the properties below are optional
 * .description("description")
 * .status("status")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-lifecyclepolicy.html)
 */
@CdkDslMarker
public class CfnLifecyclePolicyPropsDsl {
    private val cdkBuilder: CfnLifecyclePolicyProps.Builder = CfnLifecyclePolicyProps.builder()

    private val _policyDetails: MutableList<Any> = mutableListOf()

    /** @param description Optional description for the lifecycle policy. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param executionRole The name or Amazon Resource Name (ARN) for the IAM role you create that
     *   grants Image Builder access to run lifecycle actions.
     */
    public fun executionRole(executionRole: String) {
        cdkBuilder.executionRole(executionRole)
    }

    /** @param name The name of the lifecycle policy to create. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param policyDetails Configuration details for the lifecycle policy rules. */
    public fun policyDetails(vararg policyDetails: Any) {
        _policyDetails.addAll(listOf(*policyDetails))
    }

    /** @param policyDetails Configuration details for the lifecycle policy rules. */
    public fun policyDetails(policyDetails: Collection<Any>) {
        _policyDetails.addAll(policyDetails)
    }

    /** @param policyDetails Configuration details for the lifecycle policy rules. */
    public fun policyDetails(policyDetails: IResolvable) {
        cdkBuilder.policyDetails(policyDetails)
    }

    /**
     * @param resourceSelection Selection criteria for the resources that the lifecycle policy
     *   applies to.
     */
    public fun resourceSelection(resourceSelection: IResolvable) {
        cdkBuilder.resourceSelection(resourceSelection)
    }

    /**
     * @param resourceSelection Selection criteria for the resources that the lifecycle policy
     *   applies to.
     */
    public fun resourceSelection(resourceSelection: CfnLifecyclePolicy.ResourceSelectionProperty) {
        cdkBuilder.resourceSelection(resourceSelection)
    }

    /**
     * @param resourceType The type of Image Builder resource that the lifecycle policy applies to.
     */
    public fun resourceType(resourceType: String) {
        cdkBuilder.resourceType(resourceType)
    }

    /** @param status Indicates whether the lifecycle policy resource is enabled. */
    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    /** @param tags Tags to apply to the lifecycle policy resource. */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnLifecyclePolicyProps {
        if (_policyDetails.isNotEmpty()) cdkBuilder.policyDetails(_policyDetails)
        return cdkBuilder.build()
    }
}
