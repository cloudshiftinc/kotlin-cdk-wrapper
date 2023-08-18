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
 * Inspect one of the headers in the web request, identified by name, for example, `User-Agent` or
 * `Referer` .
 *
 * The name isn't case sensitive.
 *
 * You can filter and inspect all headers with the `FieldToMatch` setting `Headers` .
 *
 * This is used to indicate the web request component to inspect, in the `FieldToMatch`
 * specification.
 *
 * Example JSON: `"SingleHeader": { "Name": "haystack" }`
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wafv2.*;
 * SingleHeaderProperty singleHeaderProperty = SingleHeaderProperty.builder()
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-singleheader.html)
 */
@CdkDslMarker
public class CfnWebACLSingleHeaderPropertyDsl {
    private val cdkBuilder: CfnWebACL.SingleHeaderProperty.Builder =
        CfnWebACL.SingleHeaderProperty.builder()

    /** @param name The name of the query header to inspect. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnWebACL.SingleHeaderProperty = cdkBuilder.build()
}
