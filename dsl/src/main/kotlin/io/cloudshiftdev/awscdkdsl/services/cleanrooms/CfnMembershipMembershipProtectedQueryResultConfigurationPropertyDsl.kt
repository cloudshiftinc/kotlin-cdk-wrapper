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

package io.cloudshiftdev.awscdkdsl.services.cleanrooms

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cleanrooms.CfnMembership

/**
 * Contains configurations for protected query results.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cleanrooms.*;
 * MembershipProtectedQueryResultConfigurationProperty
 * membershipProtectedQueryResultConfigurationProperty =
 * MembershipProtectedQueryResultConfigurationProperty.builder()
 * .outputConfiguration(MembershipProtectedQueryOutputConfigurationProperty.builder()
 * .s3(ProtectedQueryS3OutputConfigurationProperty.builder()
 * .bucket("bucket")
 * .resultFormat("resultFormat")
 * // the properties below are optional
 * .keyPrefix("keyPrefix")
 * .build())
 * .build())
 * // the properties below are optional
 * .roleArn("roleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-membership-membershipprotectedqueryresultconfiguration.html)
 */
@CdkDslMarker
public class CfnMembershipMembershipProtectedQueryResultConfigurationPropertyDsl {
    private val cdkBuilder:
        CfnMembership.MembershipProtectedQueryResultConfigurationProperty.Builder =
        CfnMembership.MembershipProtectedQueryResultConfigurationProperty.builder()

    /** @param outputConfiguration Configuration for protected query results. */
    public fun outputConfiguration(outputConfiguration: IResolvable) {
        cdkBuilder.outputConfiguration(outputConfiguration)
    }

    /** @param outputConfiguration Configuration for protected query results. */
    public fun outputConfiguration(
        outputConfiguration: CfnMembership.MembershipProtectedQueryOutputConfigurationProperty
    ) {
        cdkBuilder.outputConfiguration(outputConfiguration)
    }

    /**
     * @param roleArn The unique ARN for an IAM role that is used by AWS Clean Rooms to write
     *   protected query results to the result location, given by the member who can receive
     *   results.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnMembership.MembershipProtectedQueryResultConfigurationProperty =
        cdkBuilder.build()
}
