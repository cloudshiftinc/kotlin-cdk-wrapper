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
 * SAP Source connector page size.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * SAPODataPaginationConfigProperty sAPODataPaginationConfigProperty =
 * SAPODataPaginationConfigProperty.builder()
 * .maxPageSize(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sapodatapaginationconfig.html)
 */
@CdkDslMarker
public class CfnFlowSAPODataPaginationConfigPropertyDsl {
    private val cdkBuilder: CfnFlow.SAPODataPaginationConfigProperty.Builder =
        CfnFlow.SAPODataPaginationConfigProperty.builder()

    /** @param maxPageSize the value to be set. */
    public fun maxPageSize(maxPageSize: Number) {
        cdkBuilder.maxPageSize(maxPageSize)
    }

    public fun build(): CfnFlow.SAPODataPaginationConfigProperty = cdkBuilder.build()
}
