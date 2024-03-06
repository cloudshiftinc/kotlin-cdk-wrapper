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

package io.cloudshiftdev.awscdkdsl.services.customerprofiles

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.List
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.customerprofiles.CfnDomain

/**
 * A list of matching attributes that represent matching criteria.
 *
 * If two profiles meet at least one of the requirements in the matching attributes list, they will
 * be merged.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.customerprofiles.*;
 * ConsolidationProperty consolidationProperty = ConsolidationProperty.builder()
 * .matchingAttributesList(List.of(List.of("matchingAttributesList")))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-consolidation.html)
 */
@CdkDslMarker
public class CfnDomainConsolidationPropertyDsl {
    private val cdkBuilder: CfnDomain.ConsolidationProperty.Builder =
        CfnDomain.ConsolidationProperty.builder()

    private val _matchingAttributesList: MutableList<List<String>> = mutableListOf()

    /** @param matchingAttributesList A list of matching criteria. */
    public fun matchingAttributesList(vararg matchingAttributesList: List<String>) {
        _matchingAttributesList.addAll(listOf(*matchingAttributesList))
    }

    /** @param matchingAttributesList A list of matching criteria. */
    public fun matchingAttributesList(matchingAttributesList: Collection<List<String>>) {
        _matchingAttributesList.addAll(matchingAttributesList)
    }

    /** @param matchingAttributesList A list of matching criteria. */
    public fun matchingAttributesList(matchingAttributesList: IResolvable) {
        cdkBuilder.matchingAttributesList(matchingAttributesList)
    }

    public fun build(): CfnDomain.ConsolidationProperty {
        if (_matchingAttributesList.isNotEmpty())
            cdkBuilder.matchingAttributesList(_matchingAttributesList)
        return cdkBuilder.build()
    }
}
