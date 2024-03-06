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
import kotlin.String
import software.amazon.awscdk.services.appflow.CfnFlow

/**
 * The API of the connector application that Amazon AppFlow uses to transfer your data.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * DataTransferApiProperty dataTransferApiProperty = DataTransferApiProperty.builder()
 * .name("name")
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-datatransferapi.html)
 */
@CdkDslMarker
public class CfnFlowDataTransferApiPropertyDsl {
    private val cdkBuilder: CfnFlow.DataTransferApiProperty.Builder =
        CfnFlow.DataTransferApiProperty.builder()

    /** @param name The name of the connector application API. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param type You can specify one of the following types:.
     * * **AUTOMATIC** - The default. Optimizes a flow for datasets that fluctuate in size from
     *   small to large. For each flow run, Amazon AppFlow chooses to use the SYNC or ASYNC API type
     *   based on the amount of data that the run transfers.
     * * **SYNC** - A synchronous API. This type of API optimizes a flow for small to medium-sized
     *   datasets.
     * * **ASYNC** - An asynchronous API. This type of API optimizes a flow for large datasets.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnFlow.DataTransferApiProperty = cdkBuilder.build()
}
