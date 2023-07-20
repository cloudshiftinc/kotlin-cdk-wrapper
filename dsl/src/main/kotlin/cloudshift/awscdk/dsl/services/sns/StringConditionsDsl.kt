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

package cloudshift.awscdk.dsl.services.sns

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.sns.StringConditions
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class StringConditionsDsl {
    private val cdkBuilder: StringConditions.Builder = StringConditions.builder()

    private val _allowlist: MutableList<String> = mutableListOf()

    private val _denylist: MutableList<String> = mutableListOf()

    private val _matchPrefixes: MutableList<String> = mutableListOf()

    public fun allowlist(vararg allowlist: String) {
        _allowlist.addAll(listOf(*allowlist))
    }

    public fun allowlist(allowlist: Collection<String>) {
        _allowlist.addAll(allowlist)
    }

    public fun denylist(vararg denylist: String) {
        _denylist.addAll(listOf(*denylist))
    }

    public fun denylist(denylist: Collection<String>) {
        _denylist.addAll(denylist)
    }

    public fun matchPrefixes(vararg matchPrefixes: String) {
        _matchPrefixes.addAll(listOf(*matchPrefixes))
    }

    public fun matchPrefixes(matchPrefixes: Collection<String>) {
        _matchPrefixes.addAll(matchPrefixes)
    }

    public fun build(): StringConditions {
        if (_allowlist.isNotEmpty()) cdkBuilder.allowlist(_allowlist)
        if (_denylist.isNotEmpty()) cdkBuilder.denylist(_denylist)
        if (_matchPrefixes.isNotEmpty()) cdkBuilder.matchPrefixes(_matchPrefixes)
        return cdkBuilder.build()
    }
}
