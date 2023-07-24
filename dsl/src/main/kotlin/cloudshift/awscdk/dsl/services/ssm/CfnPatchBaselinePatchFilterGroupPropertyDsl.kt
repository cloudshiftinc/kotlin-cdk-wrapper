@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.ssm

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssm.CfnPatchBaseline
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

/**
 * The `PatchFilterGroup` property type specifies a set of patch filters for an AWS Systems Manager
 * patch baseline, typically used for approval rules for a Systems Manager patch baseline.
 *
 * `PatchFilterGroup` is the property type for the `GlobalFilters` property of the
 * [AWS::SSM::PatchBaseline](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html)
 * resource and the `PatchFilterGroup` property of the
 * [Rule](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rule.html)
 * property type.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ssm.*;
 * PatchFilterGroupProperty patchFilterGroupProperty = PatchFilterGroupProperty.builder()
 * .patchFilters(List.of(PatchFilterProperty.builder()
 * .key("key")
 * .values(List.of("values"))
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfiltergroup.html)
 */
@CdkDslMarker
public class CfnPatchBaselinePatchFilterGroupPropertyDsl {
    private val cdkBuilder: CfnPatchBaseline.PatchFilterGroupProperty.Builder =
        CfnPatchBaseline.PatchFilterGroupProperty.builder()

    private val _patchFilters: MutableList<Any> = mutableListOf()

    /**
     * @param patchFilters The set of patch filters that make up the group.
     */
    public fun patchFilters(vararg patchFilters: Any) {
        _patchFilters.addAll(listOf(*patchFilters))
    }

    /**
     * @param patchFilters The set of patch filters that make up the group.
     */
    public fun patchFilters(patchFilters: Collection<Any>) {
        _patchFilters.addAll(patchFilters)
    }

    /**
     * @param patchFilters The set of patch filters that make up the group.
     */
    public fun patchFilters(patchFilters: IResolvable) {
        cdkBuilder.patchFilters(patchFilters)
    }

    public fun build(): CfnPatchBaseline.PatchFilterGroupProperty {
        if (_patchFilters.isNotEmpty()) cdkBuilder.patchFilters(_patchFilters)
        return cdkBuilder.build()
    }
}
