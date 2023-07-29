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
import kotlin.String
import software.amazon.awscdk.services.wafv2.CfnWebACL

/**
 * The identifier of the username or password field, used in the `ManagedRuleGroupConfig` settings.
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
     * @param identifier The name of the username or password field, used in the
     *   `ManagedRuleGroupConfig` settings. When the `PayloadType` is `JSON` , the identifier must
     *   be in JSON pointer syntax. For example `/form/username` . For information about the JSON
     *   Pointer syntax, see the Internet Engineering Task Force (IETF) documentation
     *   [JavaScript Object Notation (JSON) Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901)
     *   .
     *
     * When the `PayloadType` is `FORM_ENCODED` , use the HTML form names. For example, `username` .
     */
    public fun identifier(identifier: String) {
        cdkBuilder.identifier(identifier)
    }

    public fun build(): CfnWebACL.FieldIdentifierProperty = cdkBuilder.build()
}
