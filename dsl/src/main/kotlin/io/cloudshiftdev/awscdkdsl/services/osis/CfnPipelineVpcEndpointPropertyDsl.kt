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

package io.cloudshiftdev.awscdkdsl.services.osis

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.osis.CfnPipeline

/**
 * An OpenSearch Ingestion-managed VPC endpoint that will access one or more pipelines.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.osis.*;
 * VpcEndpointProperty vpcEndpointProperty = VpcEndpointProperty.builder()
 * .vpcEndpointId("vpcEndpointId")
 * .vpcId("vpcId")
 * .vpcOptions(VpcOptionsProperty.builder()
 * .subnetIds(List.of("subnetIds"))
 * // the properties below are optional
 * .securityGroupIds(List.of("securityGroupIds"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-osis-pipeline-vpcendpoint.html)
 */
@CdkDslMarker
public class CfnPipelineVpcEndpointPropertyDsl {
    private val cdkBuilder: CfnPipeline.VpcEndpointProperty.Builder =
        CfnPipeline.VpcEndpointProperty.builder()

    /** @param vpcEndpointId The unique identifier of the endpoint. */
    public fun vpcEndpointId(vpcEndpointId: String) {
        cdkBuilder.vpcEndpointId(vpcEndpointId)
    }

    /**
     * @param vpcId The ID for your VPC. AWS PrivateLink generates this value when you create a VPC.
     */
    public fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
    }

    /**
     * @param vpcOptions Information about the VPC, including associated subnets and security
     *   groups.
     */
    public fun vpcOptions(vpcOptions: IResolvable) {
        cdkBuilder.vpcOptions(vpcOptions)
    }

    /**
     * @param vpcOptions Information about the VPC, including associated subnets and security
     *   groups.
     */
    public fun vpcOptions(vpcOptions: CfnPipeline.VpcOptionsProperty) {
        cdkBuilder.vpcOptions(vpcOptions)
    }

    public fun build(): CfnPipeline.VpcEndpointProperty = cdkBuilder.build()
}
