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
import software.amazon.awscdk.services.iam.CfnServiceLinkedRole
import software.constructs.Construct

/**
 * Creates an IAM role that is linked to a specific AWS service.
 *
 * The service controls the attached policies and when the role can be deleted. This helps ensure
 * that the service is not broken by an unexpectedly changed or deleted role, which could put your
 * AWS resources into an unknown state. Allowing the service to control the role helps improve
 * service stability and proper cleanup when a service and its role are no longer needed. For more
 * information, see
 * [Using service-linked roles](https://docs.aws.amazon.com/IAM/latest/UserGuide/using-service-linked-roles.html)
 * in the *IAM User Guide* .
 *
 * To attach a policy to this service-linked role, you must make the request using the AWS service
 * that depends on this role.
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
public class CfnServiceLinkedRoleDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnServiceLinkedRole.Builder =
        CfnServiceLinkedRole.Builder.create(scope, id)

    /**
     * The service principal for the AWS service to which this role is attached.
     *
     * You use a string similar to a URL but without the http:// in front. For example:
     * `elasticbeanstalk.amazonaws.com` .
     *
     * Service principals are unique and case-sensitive. To find the exact service principal for
     * your service-linked role, see
     * [AWS services that work with IAM](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-services-that-work-with-iam.html)
     * in the *IAM User Guide* . Look for the services that have *Yes* in the *Service-Linked Role*
     * column. Choose the *Yes* link to view the service-linked role documentation for that service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servicelinkedrole.html#cfn-iam-servicelinkedrole-awsservicename)
     *
     * @param awsServiceName The service principal for the AWS service to which this role is
     *   attached.
     */
    public fun awsServiceName(awsServiceName: String) {
        cdkBuilder.awsServiceName(awsServiceName)
    }

    /**
     * A string that you provide, which is combined with the service-provided prefix to form the
     * complete role name.
     *
     * If you make multiple requests for the same service, then you must supply a different
     * `CustomSuffix` for each request. Otherwise the request fails with a duplicate role name
     * error. For example, you could add `-1` or `-debug` to the suffix.
     *
     * Some services do not support the `CustomSuffix` parameter. If you provide an optional suffix
     * and the operation fails, try the operation again without the suffix.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servicelinkedrole.html#cfn-iam-servicelinkedrole-customsuffix)
     *
     * @param customSuffix A string that you provide, which is combined with the service-provided
     *   prefix to form the complete role name.
     */
    public fun customSuffix(customSuffix: String) {
        cdkBuilder.customSuffix(customSuffix)
    }

    /**
     * The description of the role.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servicelinkedrole.html#cfn-iam-servicelinkedrole-description)
     *
     * @param description The description of the role.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun build(): CfnServiceLinkedRole = cdkBuilder.build()
}
