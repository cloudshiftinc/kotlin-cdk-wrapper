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

package io.cloudshiftdev.awscdkdsl.services.datapipeline

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.datapipeline.CfnPipeline

/**
 * `Attribute` is a property of `ParameterObject` that defines the attributes of a parameter object
 * as key-value pairs.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datapipeline.*;
 * ParameterAttributeProperty parameterAttributeProperty = ParameterAttributeProperty.builder()
 * .key("key")
 * .stringValue("stringValue")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parameterattribute.html)
 */
@CdkDslMarker
public class CfnPipelineParameterAttributePropertyDsl {
    private val cdkBuilder: CfnPipeline.ParameterAttributeProperty.Builder =
        CfnPipeline.ParameterAttributeProperty.builder()

    /** @param key The field identifier. */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /** @param stringValue The field value, expressed as a String. */
    public fun stringValue(stringValue: String) {
        cdkBuilder.stringValue(stringValue)
    }

    public fun build(): CfnPipeline.ParameterAttributeProperty = cdkBuilder.build()
}
