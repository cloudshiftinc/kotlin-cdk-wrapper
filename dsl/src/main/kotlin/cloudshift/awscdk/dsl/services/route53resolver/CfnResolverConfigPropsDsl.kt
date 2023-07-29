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

package cloudshift.awscdk.dsl.services.route53resolver

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.route53resolver.CfnResolverConfigProps

/**
 * Properties for defining a `CfnResolverConfig`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.route53resolver.*;
 * CfnResolverConfigProps cfnResolverConfigProps = CfnResolverConfigProps.builder()
 * .autodefinedReverseFlag("autodefinedReverseFlag")
 * .resourceId("resourceId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverconfig.html)
 */
@CdkDslMarker
public class CfnResolverConfigPropsDsl {
    private val cdkBuilder: CfnResolverConfigProps.Builder = CfnResolverConfigProps.builder()

    /**
     * @param autodefinedReverseFlag Represents the desired status of `AutodefinedReverse` . The
     *   only supported value on creation is `DISABLE` . Deletion of this resource will return
     *   `AutodefinedReverse` to its default value of `ENABLED` .
     */
    public fun autodefinedReverseFlag(autodefinedReverseFlag: String) {
        cdkBuilder.autodefinedReverseFlag(autodefinedReverseFlag)
    }

    /**
     * @param resourceId The ID of the Amazon Virtual Private Cloud VPC that you're configuring
     *   Resolver for.
     */
    public fun resourceId(resourceId: String) {
        cdkBuilder.resourceId(resourceId)
    }

    public fun build(): CfnResolverConfigProps = cdkBuilder.build()
}
