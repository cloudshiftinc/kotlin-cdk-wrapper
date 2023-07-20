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

package cloudshift.awscdk.dsl.services.ssm

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ssm.ParameterTier
import software.amazon.awscdk.services.ssm.StringListParameter
import software.constructs.Construct
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class StringListParameterDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: StringListParameter.Builder = StringListParameter.Builder.create(
        scope,
        id,
    )

    private val _stringListValue: MutableList<String> = mutableListOf()

    public fun allowedPattern(allowedPattern: String) {
        cdkBuilder.allowedPattern(allowedPattern)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun parameterName(parameterName: String) {
        cdkBuilder.parameterName(parameterName)
    }

    public fun simpleName(simpleName: Boolean) {
        cdkBuilder.simpleName(simpleName)
    }

    public fun stringListValue(vararg stringListValue: String) {
        _stringListValue.addAll(listOf(*stringListValue))
    }

    public fun stringListValue(stringListValue: Collection<String>) {
        _stringListValue.addAll(stringListValue)
    }

    public fun tier(tier: ParameterTier) {
        cdkBuilder.tier(tier)
    }

    public fun build(): StringListParameter {
        if (_stringListValue.isNotEmpty()) cdkBuilder.stringListValue(_stringListValue)
        return cdkBuilder.build()
    }
}
