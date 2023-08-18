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
import software.constructs.Construct

/**
 * Specify an AWS Elastic Beanstalk application by using the AWS::ElasticBeanstalk::Application
 * resource in an AWS CloudFormation template.
 *
 * The AWS::ElasticBeanstalk::Application resource is an AWS Elastic Beanstalk Beanstalk resource
 * type that specifies an Elastic Beanstalk application.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticbeanstalk.*;
 * CfnApplication cfnApplication = CfnApplication.Builder.create(this, "MyCfnApplication")
 * .applicationName("applicationName")
 * .description("description")
 * .resourceLifecycleConfig(ApplicationResourceLifecycleConfigProperty.builder()
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
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-application.html)
 */
@CdkDslMarker
public class CfnApplicationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnApplication.Builder = CfnApplication.Builder.create(scope, id)

    /**
     * A name for the Elastic Beanstalk application.
     *
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the application name. For more information, see
     * [Name Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html)
     * .
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the
     * resource, specify a new name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-application.html#cfn-elasticbeanstalk-application-applicationname)
     *
     * @param applicationName A name for the Elastic Beanstalk application.
     */
    public fun applicationName(applicationName: String) {
        cdkBuilder.applicationName(applicationName)
    }

    /**
     * Your description of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-application.html#cfn-elasticbeanstalk-application-description)
     *
     * @param description Your description of the application.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * Specifies an application resource lifecycle configuration to prevent your application from
     * accumulating too many versions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-application.html#cfn-elasticbeanstalk-application-resourcelifecycleconfig)
     *
     * @param resourceLifecycleConfig Specifies an application resource lifecycle configuration to
     *   prevent your application from accumulating too many versions.
     */
    public fun resourceLifecycleConfig(resourceLifecycleConfig: IResolvable) {
        cdkBuilder.resourceLifecycleConfig(resourceLifecycleConfig)
    }

    /**
     * Specifies an application resource lifecycle configuration to prevent your application from
     * accumulating too many versions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticbeanstalk-application.html#cfn-elasticbeanstalk-application-resourcelifecycleconfig)
     *
     * @param resourceLifecycleConfig Specifies an application resource lifecycle configuration to
     *   prevent your application from accumulating too many versions.
     */
    public fun resourceLifecycleConfig(
        resourceLifecycleConfig: CfnApplication.ApplicationResourceLifecycleConfigProperty
    ) {
        cdkBuilder.resourceLifecycleConfig(resourceLifecycleConfig)
    }

    public fun build(): CfnApplication = cdkBuilder.build()
}
