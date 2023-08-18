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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnFlow

/**
 * The configuration that determines how Amazon AppFlow formats the flow output data when Upsolver
 * is used as the destination.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * UpsolverS3OutputFormatConfigProperty upsolverS3OutputFormatConfigProperty =
 * UpsolverS3OutputFormatConfigProperty.builder()
 * .prefixConfig(PrefixConfigProperty.builder()
 * .pathPrefixHierarchy(List.of("pathPrefixHierarchy"))
 * .prefixFormat("prefixFormat")
 * .prefixType("prefixType")
 * .build())
 * // the properties below are optional
 * .aggregationConfig(AggregationConfigProperty.builder()
 * .aggregationType("aggregationType")
 * .targetFileSize(123)
 * .build())
 * .fileType("fileType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-upsolvers3outputformatconfig.html)
 */
@CdkDslMarker
public class CfnFlowUpsolverS3OutputFormatConfigPropertyDsl {
    private val cdkBuilder: CfnFlow.UpsolverS3OutputFormatConfigProperty.Builder =
        CfnFlow.UpsolverS3OutputFormatConfigProperty.builder()

    /**
     * @param aggregationConfig The aggregation settings that you can use to customize the output
     *   format of your flow data.
     */
    public fun aggregationConfig(aggregationConfig: IResolvable) {
        cdkBuilder.aggregationConfig(aggregationConfig)
    }

    /**
     * @param aggregationConfig The aggregation settings that you can use to customize the output
     *   format of your flow data.
     */
    public fun aggregationConfig(aggregationConfig: CfnFlow.AggregationConfigProperty) {
        cdkBuilder.aggregationConfig(aggregationConfig)
    }

    /**
     * @param fileType Indicates the file type that Amazon AppFlow places in the Upsolver Amazon S3
     *   bucket.
     */
    public fun fileType(fileType: String) {
        cdkBuilder.fileType(fileType)
    }

    /**
     * @param prefixConfig Specifies elements that Amazon AppFlow includes in the file and folder
     *   names in the flow destination.
     */
    public fun prefixConfig(prefixConfig: IResolvable) {
        cdkBuilder.prefixConfig(prefixConfig)
    }

    /**
     * @param prefixConfig Specifies elements that Amazon AppFlow includes in the file and folder
     *   names in the flow destination.
     */
    public fun prefixConfig(prefixConfig: CfnFlow.PrefixConfigProperty) {
        cdkBuilder.prefixConfig(prefixConfig)
    }

    public fun build(): CfnFlow.UpsolverS3OutputFormatConfigProperty = cdkBuilder.build()
}
