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

package io.cloudshiftdev.awscdkdsl.services.cleanrooms

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate

/**
 * Optional.
 *
 * The member who can query can provide this placeholder for a literal data value in an analysis
 * template.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cleanrooms.*;
 * AnalysisParameterProperty analysisParameterProperty = AnalysisParameterProperty.builder()
 * .name("name")
 * .type("type")
 * // the properties below are optional
 * .defaultValue("defaultValue")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-analysistemplate-analysisparameter.html)
 */
@CdkDslMarker
public class CfnAnalysisTemplateAnalysisParameterPropertyDsl {
    private val cdkBuilder: CfnAnalysisTemplate.AnalysisParameterProperty.Builder =
        CfnAnalysisTemplate.AnalysisParameterProperty.builder()

    /**
     * @param defaultValue Optional. The default value that is applied in the analysis template. The
     *   member who can query can override this value in the query editor.
     */
    public fun defaultValue(defaultValue: String) {
        cdkBuilder.defaultValue(defaultValue)
    }

    /**
     * @param name The name of the parameter. The name must use only alphanumeric, underscore (_),
     *   or hyphen (-) characters but cannot start or end with a hyphen.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param type The type of parameter. */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnAnalysisTemplate.AnalysisParameterProperty = cdkBuilder.build()
}
