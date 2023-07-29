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

package cloudshift.awscdk.dsl.services.ssm

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ssm.CfnPatchBaseline

/**
 * The `PatchFilter` property type defines a patch filter for an AWS Systems Manager patch baseline.
 *
 * The `PatchFilters` property of the
 * [PatchFilterGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfiltergroup.html)
 * property type contains a list of `PatchFilter` property types.
 *
 * You can view lists of valid values for the patch properties by running the
 * `DescribePatchProperties` command. For more information, see
 * [DescribePatchProperties](https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_DescribePatchProperties.html)
 * in the *AWS Systems Manager API Reference* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ssm.*;
 * PatchFilterProperty patchFilterProperty = PatchFilterProperty.builder()
 * .key("key")
 * .values(List.of("values"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfilter.html)
 */
@CdkDslMarker
public class CfnPatchBaselinePatchFilterPropertyDsl {
    private val cdkBuilder: CfnPatchBaseline.PatchFilterProperty.Builder =
        CfnPatchBaseline.PatchFilterProperty.builder()

    private val _values: MutableList<String> = mutableListOf()

    /**
     * @param key The key for the filter. For information about valid keys, see
     *   [PatchFilter](https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_PatchFilter.html)
     *   in the *AWS Systems Manager API Reference* .
     */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /**
     * @param values The value for the filter key. For information about valid values for each key
     *   based on operating system type, see
     *   [PatchFilter](https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_PatchFilter.html)
     *   in the *AWS Systems Manager API Reference* .
     */
    public fun values(vararg values: String) {
        _values.addAll(listOf(*values))
    }

    /**
     * @param values The value for the filter key. For information about valid values for each key
     *   based on operating system type, see
     *   [PatchFilter](https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_PatchFilter.html)
     *   in the *AWS Systems Manager API Reference* .
     */
    public fun values(values: Collection<String>) {
        _values.addAll(values)
    }

    public fun build(): CfnPatchBaseline.PatchFilterProperty {
        if (_values.isNotEmpty()) cdkBuilder.values(_values)
        return cdkBuilder.build()
    }
}
