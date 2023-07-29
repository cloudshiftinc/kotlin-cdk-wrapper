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

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnTrigger

/**
 * Defines an action to be initiated by a trigger.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * Object arguments_;
 * ActionProperty actionProperty = ActionProperty.builder()
 * .arguments(arguments_)
 * .crawlerName("crawlerName")
 * .jobName("jobName")
 * .notificationProperty(NotificationPropertyProperty.builder()
 * .notifyDelayAfter(123)
 * .build())
 * .securityConfiguration("securityConfiguration")
 * .timeout(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-action.html)
 */
@CdkDslMarker
public class CfnTriggerActionPropertyDsl {
    private val cdkBuilder: CfnTrigger.ActionProperty.Builder = CfnTrigger.ActionProperty.builder()

    /**
     * @param arguments The job arguments used when this trigger fires. For this job run, they
     *   replace the default arguments set in the job definition itself.
     *
     * You can specify arguments here that your own job-execution script consumes, in addition to
     * arguments that AWS Glue itself consumes.
     *
     * For information about how to specify and consume your own job arguments, see
     * [Calling AWS Glue APIs in Python](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-calling.html)
     * in the *AWS Glue Developer Guide* .
     *
     * For information about the key-value pairs that AWS Glue consumes to set up your job, see the
     * [Special Parameters Used by AWS Glue](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-etl-glue-arguments.html)
     * topic in the developer guide.
     */
    public fun arguments(arguments: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(arguments)
        cdkBuilder.arguments(builder.map)
    }

    /**
     * @param arguments The job arguments used when this trigger fires. For this job run, they
     *   replace the default arguments set in the job definition itself.
     *
     * You can specify arguments here that your own job-execution script consumes, in addition to
     * arguments that AWS Glue itself consumes.
     *
     * For information about how to specify and consume your own job arguments, see
     * [Calling AWS Glue APIs in Python](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-calling.html)
     * in the *AWS Glue Developer Guide* .
     *
     * For information about the key-value pairs that AWS Glue consumes to set up your job, see the
     * [Special Parameters Used by AWS Glue](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-etl-glue-arguments.html)
     * topic in the developer guide.
     */
    public fun arguments(arguments: Any) {
        cdkBuilder.arguments(arguments)
    }

    /** @param crawlerName The name of the crawler to be used with this action. */
    public fun crawlerName(crawlerName: String) {
        cdkBuilder.crawlerName(crawlerName)
    }

    /** @param jobName The name of a job to be executed. */
    public fun jobName(jobName: String) {
        cdkBuilder.jobName(jobName)
    }

    /** @param notificationProperty Specifies configuration properties of a job run notification. */
    public fun notificationProperty(notificationProperty: IResolvable) {
        cdkBuilder.notificationProperty(notificationProperty)
    }

    /** @param notificationProperty Specifies configuration properties of a job run notification. */
    public fun notificationProperty(notificationProperty: CfnTrigger.NotificationPropertyProperty) {
        cdkBuilder.notificationProperty(notificationProperty)
    }

    /**
     * @param securityConfiguration The name of the `SecurityConfiguration` structure to be used
     *   with this action.
     */
    public fun securityConfiguration(securityConfiguration: String) {
        cdkBuilder.securityConfiguration(securityConfiguration)
    }

    /**
     * @param timeout The `JobRun` timeout in minutes. This is the maximum time that a job run can
     *   consume resources before it is terminated and enters TIMEOUT status. The default is 2,880
     *   minutes (48 hours). This overrides the timeout value set in the parent job.
     */
    public fun timeout(timeout: Number) {
        cdkBuilder.timeout(timeout)
    }

    public fun build(): CfnTrigger.ActionProperty = cdkBuilder.build()
}
