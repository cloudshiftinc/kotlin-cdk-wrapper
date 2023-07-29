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
 * Inspect one query argument in the web request, identified by name, for example *UserName* or
 * *SalesRegion* .
 *
 * The name isn't case sensitive.
 *
 * This is used to indicate the web request component to inspect, in the `FieldToMatch`
 * specification.
 *
 * Example JSON: `"SingleQueryArgument": { "Name": "myArgument" }`
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wafv2.*;
 * SingleQueryArgumentProperty singleQueryArgumentProperty = SingleQueryArgumentProperty.builder()
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-singlequeryargument.html)
 */
@CdkDslMarker
public class CfnWebACLSingleQueryArgumentPropertyDsl {
    private val cdkBuilder: CfnWebACL.SingleQueryArgumentProperty.Builder =
        CfnWebACL.SingleQueryArgumentProperty.builder()

    /** @param name The name of the query argument to inspect. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnWebACL.SingleQueryArgumentProperty = cdkBuilder.build()
}
