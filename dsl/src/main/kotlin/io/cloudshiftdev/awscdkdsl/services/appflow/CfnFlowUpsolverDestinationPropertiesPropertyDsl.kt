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
 * The properties that are applied when Upsolver is used as a destination.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * UpsolverDestinationPropertiesProperty upsolverDestinationPropertiesProperty =
 * UpsolverDestinationPropertiesProperty.builder()
 * .bucketName("bucketName")
 * .s3OutputFormatConfig(UpsolverS3OutputFormatConfigProperty.builder()
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
 * .build())
 * // the properties below are optional
 * .bucketPrefix("bucketPrefix")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-upsolverdestinationproperties.html)
 */
@CdkDslMarker
public class CfnFlowUpsolverDestinationPropertiesPropertyDsl {
    private val cdkBuilder: CfnFlow.UpsolverDestinationPropertiesProperty.Builder =
        CfnFlow.UpsolverDestinationPropertiesProperty.builder()

    /**
     * @param bucketName The Upsolver Amazon S3 bucket name in which Amazon AppFlow places the
     *   transferred data.
     */
    public fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
    }

    /**
     * @param bucketPrefix The object key for the destination Upsolver Amazon S3 bucket in which
     *   Amazon AppFlow places the files.
     */
    public fun bucketPrefix(bucketPrefix: String) {
        cdkBuilder.bucketPrefix(bucketPrefix)
    }

    /**
     * @param s3OutputFormatConfig The configuration that determines how data is formatted when
     *   Upsolver is used as the flow destination.
     */
    public fun s3OutputFormatConfig(s3OutputFormatConfig: IResolvable) {
        cdkBuilder.s3OutputFormatConfig(s3OutputFormatConfig)
    }

    /**
     * @param s3OutputFormatConfig The configuration that determines how data is formatted when
     *   Upsolver is used as the flow destination.
     */
    public fun s3OutputFormatConfig(
        s3OutputFormatConfig: CfnFlow.UpsolverS3OutputFormatConfigProperty
    ) {
        cdkBuilder.s3OutputFormatConfig(s3OutputFormatConfig)
    }

    public fun build(): CfnFlow.UpsolverDestinationPropertiesProperty = cdkBuilder.build()
}
