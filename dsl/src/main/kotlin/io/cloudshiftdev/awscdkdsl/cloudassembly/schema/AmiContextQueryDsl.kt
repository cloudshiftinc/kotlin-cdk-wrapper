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

package io.cloudshiftdev.awscdkdsl.cloudassembly.schema

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.cloudassembly.schema.AmiContextQuery

/**
 * Query to AMI context provider.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.cloudassembly.schema.*;
 * AmiContextQuery amiContextQuery = AmiContextQuery.builder()
 * .account("account")
 * .filters(Map.of(
 * "filtersKey", List.of("filters")))
 * .region("region")
 * // the properties below are optional
 * .lookupRoleArn("lookupRoleArn")
 * .owners(List.of("owners"))
 * .build();
 * ```
 */
@CdkDslMarker
public class AmiContextQueryDsl {
    private val cdkBuilder: AmiContextQuery.Builder = AmiContextQuery.builder()

    private val _owners: MutableList<String> = mutableListOf()

    /** @param account Account to query. */
    public fun account(account: String) {
        cdkBuilder.account(account)
    }

    /** @param filters Filters to DescribeImages call. */
    public fun filters(filters: Map<String, List<String>>) {
        cdkBuilder.filters(filters)
    }

    /**
     * @param lookupRoleArn The ARN of the role that should be used to look up the missing values.
     */
    public fun lookupRoleArn(lookupRoleArn: String) {
        cdkBuilder.lookupRoleArn(lookupRoleArn)
    }

    /** @param owners Owners to DescribeImages call. */
    public fun owners(vararg owners: String) {
        _owners.addAll(listOf(*owners))
    }

    /** @param owners Owners to DescribeImages call. */
    public fun owners(owners: Collection<String>) {
        _owners.addAll(owners)
    }

    /** @param region Region to query. */
    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    public fun build(): AmiContextQuery {
        if (_owners.isNotEmpty()) cdkBuilder.owners(_owners)
        return cdkBuilder.build()
    }
}
