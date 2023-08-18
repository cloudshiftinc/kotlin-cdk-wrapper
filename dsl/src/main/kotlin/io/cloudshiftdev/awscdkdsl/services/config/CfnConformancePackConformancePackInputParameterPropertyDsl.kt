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

package io.cloudshiftdev.awscdkdsl.services.config

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.config.CfnConformancePack

/**
 * Input parameters in the form of key-value pairs for the conformance pack, both of which you
 * define.
 *
 * Keys can have a maximum character length of 255 characters, and values can have a maximum length
 * of 4096 characters.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.config.*;
 * ConformancePackInputParameterProperty conformancePackInputParameterProperty =
 * ConformancePackInputParameterProperty.builder()
 * .parameterName("parameterName")
 * .parameterValue("parameterValue")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-conformancepack-conformancepackinputparameter.html)
 */
@CdkDslMarker
public class CfnConformancePackConformancePackInputParameterPropertyDsl {
    private val cdkBuilder: CfnConformancePack.ConformancePackInputParameterProperty.Builder =
        CfnConformancePack.ConformancePackInputParameterProperty.builder()

    /** @param parameterName One part of a key-value pair. */
    public fun parameterName(parameterName: String) {
        cdkBuilder.parameterName(parameterName)
    }

    /** @param parameterValue Another part of the key-value pair. */
    public fun parameterValue(parameterValue: String) {
        cdkBuilder.parameterValue(parameterValue)
    }

    public fun build(): CfnConformancePack.ConformancePackInputParameterProperty =
        cdkBuilder.build()
}
