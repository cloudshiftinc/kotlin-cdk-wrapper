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
import software.amazon.awscdk.services.ssm.ParameterType
import software.amazon.awscdk.services.ssm.ParameterValueType
import software.amazon.awscdk.services.ssm.StringParameterAttributes
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class StringParameterAttributesDsl {
    private val cdkBuilder: StringParameterAttributes.Builder = StringParameterAttributes.builder()

    public fun forceDynamicReference(forceDynamicReference: Boolean) {
        cdkBuilder.forceDynamicReference(forceDynamicReference)
    }

    public fun parameterName(parameterName: String) {
        cdkBuilder.parameterName(parameterName)
    }

    public fun simpleName(simpleName: Boolean) {
        cdkBuilder.simpleName(simpleName)
    }

    @Deprecated(message = "deprecated in CDK")
    public fun type(type: ParameterType) {
        cdkBuilder.type(type)
    }

    public fun valueType(valueType: ParameterValueType) {
        cdkBuilder.valueType(valueType)
    }

    public fun version(version: Number) {
        cdkBuilder.version(version)
    }

    public fun build(): StringParameterAttributes = cdkBuilder.build()
}
