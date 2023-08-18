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

package io.cloudshiftdev.awscdkdsl.services.iam

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iam.CfnServiceLinkedRoleProps

/**
 * Properties for defining a `CfnServiceLinkedRole`.
 *
 * Example:
 * ```
 * CfnServiceLinkedRole slr = CfnServiceLinkedRole.Builder.create(this, "ElasticSLR")
 * .awsServiceName("es.amazonaws.com")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servicelinkedrole.html)
 */
@CdkDslMarker
public class CfnServiceLinkedRolePropsDsl {
    private val cdkBuilder: CfnServiceLinkedRoleProps.Builder = CfnServiceLinkedRoleProps.builder()

    /**
     * @param awsServiceName The service principal for the AWS service to which this role is
     *   attached. You use a string similar to a URL but without the http:// in front. For example:
     *   `elasticbeanstalk.amazonaws.com` .
     *
     * Service principals are unique and case-sensitive. To find the exact service principal for
     * your service-linked role, see
     * [AWS services that work with IAM](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-services-that-work-with-iam.html)
     * in the *IAM User Guide* . Look for the services that have *Yes* in the *Service-Linked Role*
     * column. Choose the *Yes* link to view the service-linked role documentation for that service.
     */
    public fun awsServiceName(awsServiceName: String) {
        cdkBuilder.awsServiceName(awsServiceName)
    }

    /**
     * @param customSuffix A string that you provide, which is combined with the service-provided
     *   prefix to form the complete role name. If you make multiple requests for the same service,
     *   then you must supply a different `CustomSuffix` for each request. Otherwise the request
     *   fails with a duplicate role name error. For example, you could add `-1` or `-debug` to the
     *   suffix.
     *
     * Some services do not support the `CustomSuffix` parameter. If you provide an optional suffix
     * and the operation fails, try the operation again without the suffix.
     */
    public fun customSuffix(customSuffix: String) {
        cdkBuilder.customSuffix(customSuffix)
    }

    /** @param description The description of the role. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun build(): CfnServiceLinkedRoleProps = cdkBuilder.build()
}
