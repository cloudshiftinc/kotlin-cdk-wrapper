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

package io.cloudshiftdev.awscdkdsl.services.elasticbeanstalk

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticbeanstalk.CfnApplication

/**
 * Use the `ApplicationResourceLifecycleConfig` property type to specify lifecycle settings for
 * resources that belong to an AWS Elastic Beanstalk application when defining an
 * AWS::ElasticBeanstalk::Application resource in an AWS CloudFormation template.
 *
 * The resource lifecycle configuration for an application. Defines lifecycle settings for resources
 * that belong to the application, and the service role that Elastic Beanstalk assumes in order to
 * apply lifecycle settings. The version lifecycle configuration defines lifecycle settings for
 * application versions.
 *
 * `ApplicationResourceLifecycleConfig` is a property of the
 * [AWS::ElasticBeanstalk::Application](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk.html)
 * resource.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticbeanstalk.*;
 * ApplicationResourceLifecycleConfigProperty applicationResourceLifecycleConfigProperty =
 * ApplicationResourceLifecycleConfigProperty.builder()
 * .serviceRole("serviceRole")
 * .versionLifecycleConfig(ApplicationVersionLifecycleConfigProperty.builder()
 * .maxAgeRule(MaxAgeRuleProperty.builder()
 * .deleteSourceFromS3(false)
 * .enabled(false)
 * .maxAgeInDays(123)
 * .build())
 * .maxCountRule(MaxCountRuleProperty.builder()
 * .deleteSourceFromS3(false)
 * .enabled(false)
 * .maxCount(123)
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationresourcelifecycleconfig.html)
 */
@CdkDslMarker
public class CfnApplicationApplicationResourceLifecycleConfigPropertyDsl {
    private val cdkBuilder: CfnApplication.ApplicationResourceLifecycleConfigProperty.Builder =
        CfnApplication.ApplicationResourceLifecycleConfigProperty.builder()

    /**
     * @param serviceRole The ARN of an IAM service role that Elastic Beanstalk has permission to
     *   assume. The `ServiceRole` property is required the first time that you provide a
     *   `ResourceLifecycleConfig` for the application. After you provide it once, Elastic Beanstalk
     *   persists the Service Role with the application, and you don't need to specify it again. You
     *   can, however, specify it in subsequent updates to change the Service Role to another value.
     */
    public fun serviceRole(serviceRole: String) {
        cdkBuilder.serviceRole(serviceRole)
    }

    /** @param versionLifecycleConfig Defines lifecycle settings for application versions. */
    public fun versionLifecycleConfig(versionLifecycleConfig: IResolvable) {
        cdkBuilder.versionLifecycleConfig(versionLifecycleConfig)
    }

    /** @param versionLifecycleConfig Defines lifecycle settings for application versions. */
    public fun versionLifecycleConfig(
        versionLifecycleConfig: CfnApplication.ApplicationVersionLifecycleConfigProperty
    ) {
        cdkBuilder.versionLifecycleConfig(versionLifecycleConfig)
    }

    public fun build(): CfnApplication.ApplicationResourceLifecycleConfigProperty =
        cdkBuilder.build()
}
