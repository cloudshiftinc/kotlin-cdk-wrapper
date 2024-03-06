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
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy

/**
 * Defines criteria for AMIs that are excluded from lifecycle actions.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.imagebuilder.*;
 * AmiExclusionRulesProperty amiExclusionRulesProperty = AmiExclusionRulesProperty.builder()
 * .isPublic(false)
 * .lastLaunched(LastLaunchedProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .regions(List.of("regions"))
 * .sharedAccounts(List.of("sharedAccounts"))
 * .tagMap(Map.of(
 * "tagMapKey", "tagMap"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-amiexclusionrules.html)
 */
@CdkDslMarker
public class CfnLifecyclePolicyAmiExclusionRulesPropertyDsl {
    private val cdkBuilder: CfnLifecyclePolicy.AmiExclusionRulesProperty.Builder =
        CfnLifecyclePolicy.AmiExclusionRulesProperty.builder()

    private val _regions: MutableList<String> = mutableListOf()

    private val _sharedAccounts: MutableList<String> = mutableListOf()

    /** @param isPublic Configures whether public AMIs are excluded from the lifecycle action. */
    public fun isPublic(isPublic: Boolean) {
        cdkBuilder.isPublic(isPublic)
    }

    /** @param isPublic Configures whether public AMIs are excluded from the lifecycle action. */
    public fun isPublic(isPublic: IResolvable) {
        cdkBuilder.isPublic(isPublic)
    }

    /**
     * @param lastLaunched Specifies configuration details for Image Builder to exclude the most
     *   recent resources from lifecycle actions.
     */
    public fun lastLaunched(lastLaunched: IResolvable) {
        cdkBuilder.lastLaunched(lastLaunched)
    }

    /**
     * @param lastLaunched Specifies configuration details for Image Builder to exclude the most
     *   recent resources from lifecycle actions.
     */
    public fun lastLaunched(lastLaunched: CfnLifecyclePolicy.LastLaunchedProperty) {
        cdkBuilder.lastLaunched(lastLaunched)
    }

    /** @param regions Configures AWS Region s that are excluded from the lifecycle action. */
    public fun regions(vararg regions: String) {
        _regions.addAll(listOf(*regions))
    }

    /** @param regions Configures AWS Region s that are excluded from the lifecycle action. */
    public fun regions(regions: Collection<String>) {
        _regions.addAll(regions)
    }

    /**
     * @param sharedAccounts Specifies AWS account s whose resources are excluded from the lifecycle
     *   action.
     */
    public fun sharedAccounts(vararg sharedAccounts: String) {
        _sharedAccounts.addAll(listOf(*sharedAccounts))
    }

    /**
     * @param sharedAccounts Specifies AWS account s whose resources are excluded from the lifecycle
     *   action.
     */
    public fun sharedAccounts(sharedAccounts: Collection<String>) {
        _sharedAccounts.addAll(sharedAccounts)
    }

    /**
     * @param tagMap Lists tags that should be excluded from lifecycle actions for the AMIs that
     *   have them.
     */
    public fun tagMap(tagMap: Map<String, String>) {
        cdkBuilder.tagMap(tagMap)
    }

    /**
     * @param tagMap Lists tags that should be excluded from lifecycle actions for the AMIs that
     *   have them.
     */
    public fun tagMap(tagMap: IResolvable) {
        cdkBuilder.tagMap(tagMap)
    }

    public fun build(): CfnLifecyclePolicy.AmiExclusionRulesProperty {
        if (_regions.isNotEmpty()) cdkBuilder.regions(_regions)
        if (_sharedAccounts.isNotEmpty()) cdkBuilder.sharedAccounts(_sharedAccounts)
        return cdkBuilder.build()
    }
}
