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
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnPrefixListProps
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnPrefixListPropsDsl {
    private val cdkBuilder: CfnPrefixListProps.Builder = CfnPrefixListProps.builder()

    private val _entries: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun addressFamily(addressFamily: String) {
        cdkBuilder.addressFamily(addressFamily)
    }

    public fun entries(vararg entries: Any) {
        _entries.addAll(listOf(*entries))
    }

    public fun entries(entries: Collection<Any>) {
        _entries.addAll(entries)
    }

    public fun entries(entries: IResolvable) {
        cdkBuilder.entries(entries)
    }

    public fun maxEntries(maxEntries: Number) {
        cdkBuilder.maxEntries(maxEntries)
    }

    public fun prefixListName(prefixListName: String) {
        cdkBuilder.prefixListName(prefixListName)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnPrefixListProps {
        if (_entries.isNotEmpty()) cdkBuilder.entries(_entries)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
