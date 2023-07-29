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

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.lambda.CfnAlias

/**
 * The
 * [traffic-shifting](https://docs.aws.amazon.com/lambda/latest/dg/lambda-traffic-shifting-using-aliases.html)
 * configuration of a Lambda function alias.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lambda.*;
 * VersionWeightProperty versionWeightProperty = VersionWeightProperty.builder()
 * .functionVersion("functionVersion")
 * .functionWeight(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-alias-versionweight.html)
 */
@CdkDslMarker
public class CfnAliasVersionWeightPropertyDsl {
    private val cdkBuilder: CfnAlias.VersionWeightProperty.Builder =
        CfnAlias.VersionWeightProperty.builder()

    /** @param functionVersion The qualifier of the second version. */
    public fun functionVersion(functionVersion: String) {
        cdkBuilder.functionVersion(functionVersion)
    }

    /**
     * @param functionWeight The percentage of traffic that the alias routes to the second version.
     */
    public fun functionWeight(functionWeight: Number) {
        cdkBuilder.functionWeight(functionWeight)
    }

    public fun build(): CfnAlias.VersionWeightProperty = cdkBuilder.build()
}
