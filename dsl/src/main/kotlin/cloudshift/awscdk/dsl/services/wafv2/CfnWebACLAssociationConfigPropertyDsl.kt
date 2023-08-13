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

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnWebACL

/**
 * Specifies custom configurations for the associations between the web ACL and protected resources.
 *
 * Use this to customize the maximum size of the request body that your protected CloudFront
 * distributions forward to AWS WAF for inspection. The default is 16 KB (16,384 bytes).
 *
 * You are charged additional fees when your protected resources forward body sizes that are larger
 * than the default. For more information, see
 * [AWS WAF Pricing](https://docs.aws.amazon.com/waf/pricing/) .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wafv2.*;
 * AssociationConfigProperty associationConfigProperty = AssociationConfigProperty.builder()
 * .requestBody(Map.of(
 * "requestBodyKey", RequestBodyAssociatedResourceTypeConfigProperty.builder()
 * .defaultSizeInspectionLimit("defaultSizeInspectionLimit")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-associationconfig.html)
 */
@CdkDslMarker
public class CfnWebACLAssociationConfigPropertyDsl {
    private val cdkBuilder: CfnWebACL.AssociationConfigProperty.Builder =
        CfnWebACL.AssociationConfigProperty.builder()

    /**
     * @param requestBody Customizes the maximum size of the request body that your protected
     *   CloudFront distributions forward to AWS WAF for inspection. The default size is 16 KB
     *   (16,384 bytes).
     *
     * You are charged additional fees when your protected resources forward body sizes that are
     * larger than the default. For more information, see
     * [AWS WAF Pricing](https://docs.aws.amazon.com/waf/pricing/) .
     */
    public fun requestBody(requestBody: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(requestBody)
        cdkBuilder.requestBody(builder.map)
    }

    /**
     * @param requestBody Customizes the maximum size of the request body that your protected
     *   CloudFront distributions forward to AWS WAF for inspection. The default size is 16 KB
     *   (16,384 bytes).
     *
     * You are charged additional fees when your protected resources forward body sizes that are
     * larger than the default. For more information, see
     * [AWS WAF Pricing](https://docs.aws.amazon.com/waf/pricing/) .
     */
    public fun requestBody(requestBody: Map<String, Any>) {
        cdkBuilder.requestBody(requestBody)
    }

    /**
     * @param requestBody Customizes the maximum size of the request body that your protected
     *   CloudFront distributions forward to AWS WAF for inspection. The default size is 16 KB
     *   (16,384 bytes).
     *
     * You are charged additional fees when your protected resources forward body sizes that are
     * larger than the default. For more information, see
     * [AWS WAF Pricing](https://docs.aws.amazon.com/waf/pricing/) .
     */
    public fun requestBody(requestBody: IResolvable) {
        cdkBuilder.requestBody(requestBody)
    }

    public fun build(): CfnWebACL.AssociationConfigProperty = cdkBuilder.build()
}
