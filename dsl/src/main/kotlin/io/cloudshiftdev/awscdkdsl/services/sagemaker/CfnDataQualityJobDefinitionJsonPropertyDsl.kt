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

package io.cloudshiftdev.awscdkdsl.services.sagemaker

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition

/**
 * The Json format.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * JsonProperty jsonProperty = JsonProperty.builder()
 * .line(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-dataqualityjobdefinition-json.html)
 */
@CdkDslMarker
public class CfnDataQualityJobDefinitionJsonPropertyDsl {
    private val cdkBuilder: CfnDataQualityJobDefinition.JsonProperty.Builder =
        CfnDataQualityJobDefinition.JsonProperty.builder()

    /** @param line A boolean flag indicating if it is JSON line format. */
    public fun line(line: Boolean) {
        cdkBuilder.line(line)
    }

    /** @param line A boolean flag indicating if it is JSON line format. */
    public fun line(line: IResolvable) {
        cdkBuilder.line(line)
    }

    public fun build(): CfnDataQualityJobDefinition.JsonProperty = cdkBuilder.build()
}
