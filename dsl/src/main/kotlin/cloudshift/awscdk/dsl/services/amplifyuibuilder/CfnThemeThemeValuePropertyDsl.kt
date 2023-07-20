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

package cloudshift.awscdk.dsl.services.amplifyuibuilder

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amplifyuibuilder.CfnTheme
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnThemeThemeValuePropertyDsl {
    private val cdkBuilder: CfnTheme.ThemeValueProperty.Builder =
        CfnTheme.ThemeValueProperty.builder()

    private val _children: MutableList<Any> = mutableListOf()

    public fun children(vararg children: Any) {
        _children.addAll(listOf(*children))
    }

    public fun children(children: Collection<Any>) {
        _children.addAll(children)
    }

    public fun children(children: IResolvable) {
        cdkBuilder.children(children)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnTheme.ThemeValueProperty {
        if (_children.isNotEmpty()) cdkBuilder.children(_children)
        return cdkBuilder.build()
    }
}
