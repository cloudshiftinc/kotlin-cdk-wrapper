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

package io.cloudshiftdev.awscdkdsl.services.wafv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.wafv2.CfnWebACL

/**
 * Customizes the maximum size of the request body that your protected CloudFront distributions
 * forward to AWS WAF for inspection.
 *
 * The default size is 16 KB (16,384 bytes).
 *
 * You are charged additional fees when your protected resources forward body sizes that are larger
 * than the default. For more information, see
 * [AWS WAF Pricing](https://docs.aws.amazon.com/waf/pricing/) .
 *
 * This is used in the `AssociationConfig` of the web ACL.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wafv2.*;
 * RequestBodyAssociatedResourceTypeConfigProperty requestBodyAssociatedResourceTypeConfigProperty =
 * RequestBodyAssociatedResourceTypeConfigProperty.builder()
 * .defaultSizeInspectionLimit("defaultSizeInspectionLimit")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-requestbodyassociatedresourcetypeconfig.html)
 */
@CdkDslMarker
public class CfnWebACLRequestBodyAssociatedResourceTypeConfigPropertyDsl {
    private val cdkBuilder: CfnWebACL.RequestBodyAssociatedResourceTypeConfigProperty.Builder =
        CfnWebACL.RequestBodyAssociatedResourceTypeConfigProperty.builder()

    /**
     * @param defaultSizeInspectionLimit Specifies the maximum size of the web request body
     *   component that an associated CloudFront distribution should send to AWS WAF for inspection.
     *   This applies to statements in the web ACL that inspect the body or JSON body.
     *
     * Default: `16 KB (16,384 bytes)`
     */
    public fun defaultSizeInspectionLimit(defaultSizeInspectionLimit: String) {
        cdkBuilder.defaultSizeInspectionLimit(defaultSizeInspectionLimit)
    }

    public fun build(): CfnWebACL.RequestBodyAssociatedResourceTypeConfigProperty =
        cdkBuilder.build()
}
