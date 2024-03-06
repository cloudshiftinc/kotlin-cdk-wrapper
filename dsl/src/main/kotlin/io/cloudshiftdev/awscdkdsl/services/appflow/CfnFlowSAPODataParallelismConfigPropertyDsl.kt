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

package io.cloudshiftdev.awscdkdsl.services.appflow

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.appflow.CfnFlow

/**
 * SAP Source connector parallelism factor.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * SAPODataParallelismConfigProperty sAPODataParallelismConfigProperty =
 * SAPODataParallelismConfigProperty.builder()
 * .maxParallelism(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sapodataparallelismconfig.html)
 */
@CdkDslMarker
public class CfnFlowSAPODataParallelismConfigPropertyDsl {
    private val cdkBuilder: CfnFlow.SAPODataParallelismConfigProperty.Builder =
        CfnFlow.SAPODataParallelismConfigProperty.builder()

    /** @param maxParallelism the value to be set. */
    public fun maxParallelism(maxParallelism: Number) {
        cdkBuilder.maxParallelism(maxParallelism)
    }

    public fun build(): CfnFlow.SAPODataParallelismConfigProperty = cdkBuilder.build()
}
