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
 * The identifier of a field in the web request payload that contains customer data.
 *
 * This data type is used to specify fields in the `RequestInspection` and `RequestInspectionACFP`
 * configurations, which are used in the managed rule group configurations
 * `AWSManagedRulesATPRuleSet` and `AWSManagedRulesACFPRuleSet` , respectively.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wafv2.*;
 * FieldIdentifierProperty fieldIdentifierProperty = FieldIdentifierProperty.builder()
 * .identifier("identifier")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-fieldidentifier.html)
 */
@CdkDslMarker
public class CfnWebACLFieldIdentifierPropertyDsl {
    private val cdkBuilder: CfnWebACL.FieldIdentifierProperty.Builder =
        CfnWebACL.FieldIdentifierProperty.builder()

    /**
     * @param identifier The name of the field. When the `PayloadType` in the request inspection is
     *   `JSON` , this identifier must be in JSON pointer syntax. For example `/form/username` . For
     *   information about the JSON Pointer syntax, see the Internet Engineering Task Force (IETF)
     *   documentation
     *   [JavaScript Object Notation (JSON) Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901)
     *   .
     *
     * When the `PayloadType` is `FORM_ENCODED` , use the HTML form names. For example, `username` .
     *
     * For more information, see the descriptions for each field type in the request inspection
     * properties.
     */
    public fun identifier(identifier: String) {
        cdkBuilder.identifier(identifier)
    }

    public fun build(): CfnWebACL.FieldIdentifierProperty = cdkBuilder.build()
}
