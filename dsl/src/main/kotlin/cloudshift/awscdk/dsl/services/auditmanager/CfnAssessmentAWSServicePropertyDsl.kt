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

package cloudshift.awscdk.dsl.services.auditmanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.auditmanager.CfnAssessment

/**
 * The `AWSService` property type specifies an AWS service such as Amazon S3 , AWS CloudTrail , and
 * so on.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.auditmanager.*;
 * AWSServiceProperty aWSServiceProperty = AWSServiceProperty.builder()
 * .serviceName("serviceName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-auditmanager-assessment-awsservice.html)
 */
@CdkDslMarker
public class CfnAssessmentAWSServicePropertyDsl {
    private val cdkBuilder: CfnAssessment.AWSServiceProperty.Builder =
        CfnAssessment.AWSServiceProperty.builder()

    /** @param serviceName The name of the AWS service . */
    public fun serviceName(serviceName: String) {
        cdkBuilder.serviceName(serviceName)
    }

    public fun build(): CfnAssessment.AWSServiceProperty = cdkBuilder.build()
}
