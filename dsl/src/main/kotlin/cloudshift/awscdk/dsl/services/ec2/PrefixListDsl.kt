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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.AddressFamily
import software.amazon.awscdk.services.ec2.CfnPrefixList
import software.amazon.awscdk.services.ec2.PrefixList
import software.constructs.Construct

/**
 * A managed prefix list.
 *
 * Example:
 * ```
 * PrefixList.Builder.create(this, "EmptyPrefixList")
 * .maxEntries(100)
 * .build();
 * ```
 */
@CdkDslMarker
public class PrefixListDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: PrefixList.Builder = PrefixList.Builder.create(scope, id)

    private val _entries: MutableList<CfnPrefixList.EntryProperty> = mutableListOf()

    /**
     * The address family of the prefix list.
     *
     * Default: AddressFamily.IP_V4
     *
     * @param addressFamily The address family of the prefix list.
     */
    public fun addressFamily(addressFamily: AddressFamily) {
        cdkBuilder.addressFamily(addressFamily)
    }

    /**
     * The list of entries for the prefix list.
     *
     * Default: []
     *
     * @param entries The list of entries for the prefix list.
     */
    public fun entries(entries: CfnPrefixListEntryPropertyDsl.() -> Unit) {
        _entries.add(CfnPrefixListEntryPropertyDsl().apply(entries).build())
    }

    /**
     * The list of entries for the prefix list.
     *
     * Default: []
     *
     * @param entries The list of entries for the prefix list.
     */
    public fun entries(entries: Collection<CfnPrefixList.EntryProperty>) {
        _entries.addAll(entries)
    }

    /**
     * The maximum number of entries for the prefix list.
     *
     * Default: Automatically-calculated
     *
     * @param maxEntries The maximum number of entries for the prefix list.
     */
    public fun maxEntries(maxEntries: Number) {
        cdkBuilder.maxEntries(maxEntries)
    }

    /**
     * The name of the prefix list.
     *
     * Default: None
     *
     * @param prefixListName The name of the prefix list.
     */
    public fun prefixListName(prefixListName: String) {
        cdkBuilder.prefixListName(prefixListName)
    }

    public fun build(): PrefixList {
        if (_entries.isNotEmpty()) cdkBuilder.entries(_entries)
        return cdkBuilder.build()
    }
}
