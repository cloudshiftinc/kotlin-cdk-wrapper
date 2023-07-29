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

package cloudshift.awscdk.dsl.services.elasticbeanstalk

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticbeanstalk.CfnApplication

/**
 * Use the `MaxAgeRule` property type to specify a max count rule to restrict the number of
 * application versions that are retained for an AWS Elastic Beanstalk application when defining an
 * AWS::ElasticBeanstalk::Application resource in an AWS CloudFormation template.
 *
 * A lifecycle rule that deletes the oldest application version when the maximum count is exceeded.
 *
 * `MaxCountRule` is a property of the
 * [ApplicationVersionLifecycleConfig](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-applicationversionlifecycleconfig.html)
 * property type.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticbeanstalk.*;
 * MaxCountRuleProperty maxCountRuleProperty = MaxCountRuleProperty.builder()
 * .deleteSourceFromS3(false)
 * .enabled(false)
 * .maxCount(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticbeanstalk-application-maxcountrule.html)
 */
@CdkDslMarker
public class CfnApplicationMaxCountRulePropertyDsl {
    private val cdkBuilder: CfnApplication.MaxCountRuleProperty.Builder =
        CfnApplication.MaxCountRuleProperty.builder()

    /**
     * @param deleteSourceFromS3 Set to `true` to delete a version's source bundle from Amazon S3
     *   when Elastic Beanstalk deletes the application version.
     */
    public fun deleteSourceFromS3(deleteSourceFromS3: Boolean) {
        cdkBuilder.deleteSourceFromS3(deleteSourceFromS3)
    }

    /**
     * @param deleteSourceFromS3 Set to `true` to delete a version's source bundle from Amazon S3
     *   when Elastic Beanstalk deletes the application version.
     */
    public fun deleteSourceFromS3(deleteSourceFromS3: IResolvable) {
        cdkBuilder.deleteSourceFromS3(deleteSourceFromS3)
    }

    /** @param enabled Specify `true` to apply the rule, or `false` to disable it. */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /** @param enabled Specify `true` to apply the rule, or `false` to disable it. */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    /** @param maxCount Specify the maximum number of application versions to retain. */
    public fun maxCount(maxCount: Number) {
        cdkBuilder.maxCount(maxCount)
    }

    public fun build(): CfnApplication.MaxCountRuleProperty = cdkBuilder.build()
}
