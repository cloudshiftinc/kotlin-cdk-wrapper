@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ec2.AddressFamily
import software.amazon.awscdk.services.ec2.CfnPrefixList
import software.amazon.awscdk.services.ec2.PrefixListProps
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class PrefixListPropsDsl {
    private val cdkBuilder: PrefixListProps.Builder = PrefixListProps.builder()

    private val _entries: MutableList<CfnPrefixList.EntryProperty> = mutableListOf()

    public fun addressFamily(addressFamily: AddressFamily) {
        cdkBuilder.addressFamily(addressFamily)
    }

    public fun entries(entries: CfnPrefixListEntryPropertyDsl.() -> Unit) {
        _entries.add(CfnPrefixListEntryPropertyDsl().apply(entries).build())
    }

    public fun entries(entries: Collection<CfnPrefixList.EntryProperty>) {
        _entries.addAll(entries)
    }

    public fun maxEntries(maxEntries: Number) {
        cdkBuilder.maxEntries(maxEntries)
    }

    public fun prefixListName(prefixListName: String) {
        cdkBuilder.prefixListName(prefixListName)
    }

    public fun build(): PrefixListProps {
        if (_entries.isNotEmpty()) cdkBuilder.entries(_entries)
        return cdkBuilder.build()
    }
}
