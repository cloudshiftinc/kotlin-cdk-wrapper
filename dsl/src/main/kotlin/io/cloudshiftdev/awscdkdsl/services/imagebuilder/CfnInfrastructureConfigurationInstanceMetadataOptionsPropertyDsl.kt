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

package io.cloudshiftdev.awscdkdsl.services.imagebuilder

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration

/**
 * The instance metadata options that apply to the HTTP requests that pipeline builds use to launch
 * EC2 build and test instances.
 *
 * For more information about instance metadata options, see
 * [Configure the instance metadata options](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/configuring-instance-metadata-options.html)
 * in the **Amazon EC2 User Guide** for Linux instances, or
 * [Configure the instance metadata options](https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/configuring-instance-metadata-options.html)
 * in the **Amazon EC2 Windows Guide** for Windows instances.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.imagebuilder.*;
 * InstanceMetadataOptionsProperty instanceMetadataOptionsProperty =
 * InstanceMetadataOptionsProperty.builder()
 * .httpPutResponseHopLimit(123)
 * .httpTokens("httpTokens")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-infrastructureconfiguration-instancemetadataoptions.html)
 */
@CdkDslMarker
public class CfnInfrastructureConfigurationInstanceMetadataOptionsPropertyDsl {
    private val cdkBuilder: CfnInfrastructureConfiguration.InstanceMetadataOptionsProperty.Builder =
        CfnInfrastructureConfiguration.InstanceMetadataOptionsProperty.builder()

    /**
     * @param httpPutResponseHopLimit Limit the number of hops that an instance metadata request can
     *   traverse to reach its destination. The default is one hop. However, if HTTP tokens are
     *   required, container image builds need a minimum of two hops.
     */
    public fun httpPutResponseHopLimit(httpPutResponseHopLimit: Number) {
        cdkBuilder.httpPutResponseHopLimit(httpPutResponseHopLimit)
    }

    /**
     * @param httpTokens Indicates whether a signed token header is required for instance metadata
     *   retrieval requests. The values affect the response as follows:
     * * *required* – When you retrieve the IAM role credentials, version 2.0 credentials are
     *   returned in all cases.
     * * *optional* – You can include a signed token header in your request to retrieve instance
     *   metadata, or you can leave it out. If you include it, version 2.0 credentials are returned
     *   for the IAM role. Otherwise, version 1.0 credentials are returned.
     *
     * The default setting is *optional* .
     */
    public fun httpTokens(httpTokens: String) {
        cdkBuilder.httpTokens(httpTokens)
    }

    public fun build(): CfnInfrastructureConfiguration.InstanceMetadataOptionsProperty =
        cdkBuilder.build()
}
