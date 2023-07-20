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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTheme
import software.amazon.awscdk.services.quicksight.CfnThemeProps
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnThemePropsDsl {
    private val cdkBuilder: CfnThemeProps.Builder = CfnThemeProps.builder()

    private val _permissions: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun awsAccountId(awsAccountId: String) {
        cdkBuilder.awsAccountId(awsAccountId)
    }

    public fun baseThemeId(baseThemeId: String) {
        cdkBuilder.baseThemeId(baseThemeId)
    }

    public fun configuration(configuration: IResolvable) {
        cdkBuilder.configuration(configuration)
    }

    public fun configuration(configuration: CfnTheme.ThemeConfigurationProperty) {
        cdkBuilder.configuration(configuration)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun permissions(vararg permissions: Any) {
        _permissions.addAll(listOf(*permissions))
    }

    public fun permissions(permissions: Collection<Any>) {
        _permissions.addAll(permissions)
    }

    public fun permissions(permissions: IResolvable) {
        cdkBuilder.permissions(permissions)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun themeId(themeId: String) {
        cdkBuilder.themeId(themeId)
    }

    public fun versionDescription(versionDescription: String) {
        cdkBuilder.versionDescription(versionDescription)
    }

    public fun build(): CfnThemeProps {
        if (_permissions.isNotEmpty()) cdkBuilder.permissions(_permissions)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
