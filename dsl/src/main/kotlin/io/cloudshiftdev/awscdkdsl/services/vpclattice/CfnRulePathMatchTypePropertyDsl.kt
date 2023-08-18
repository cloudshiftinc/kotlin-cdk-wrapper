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

package io.cloudshiftdev.awscdkdsl.services.vpclattice

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.vpclattice.CfnRule

/**
 * Describes a path match type.
 *
 * Each rule can include only one of the following types of paths.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.vpclattice.*;
 * PathMatchTypeProperty pathMatchTypeProperty = PathMatchTypeProperty.builder()
 * .exact("exact")
 * .prefix("prefix")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-pathmatchtype.html)
 */
@CdkDslMarker
public class CfnRulePathMatchTypePropertyDsl {
    private val cdkBuilder: CfnRule.PathMatchTypeProperty.Builder =
        CfnRule.PathMatchTypeProperty.builder()

    /** @param exact An exact match of the path. */
    public fun exact(exact: String) {
        cdkBuilder.exact(exact)
    }

    /** @param prefix A prefix match of the path. */
    public fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
    }

    public fun build(): CfnRule.PathMatchTypeProperty = cdkBuilder.build()
}
