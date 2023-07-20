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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTheme
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnThemeThemeVersionPropertyDsl {
    private val cdkBuilder: CfnTheme.ThemeVersionProperty.Builder =
        CfnTheme.ThemeVersionProperty.builder()

    private val _errors: MutableList<Any> = mutableListOf()

    public fun arn(arn: String) {
        cdkBuilder.arn(arn)
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

    public fun createdTime(createdTime: String) {
        cdkBuilder.createdTime(createdTime)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun errors(vararg errors: Any) {
        _errors.addAll(listOf(*errors))
    }

    public fun errors(errors: Collection<Any>) {
        _errors.addAll(errors)
    }

    public fun errors(errors: IResolvable) {
        cdkBuilder.errors(errors)
    }

    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    public fun versionNumber(versionNumber: Number) {
        cdkBuilder.versionNumber(versionNumber)
    }

    public fun build(): CfnTheme.ThemeVersionProperty {
        if (_errors.isNotEmpty()) cdkBuilder.errors(_errors)
        return cdkBuilder.build()
    }
}
