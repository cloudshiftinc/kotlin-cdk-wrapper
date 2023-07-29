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

package cloudshift.awscdk.dsl.services.events.targets

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.codebuild.IProject
import software.amazon.awscdk.services.events.RuleTargetInput
import software.amazon.awscdk.services.events.targets.CodeBuildProject
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.sqs.IQueue

/**
 * Start a CodeBuild build when an Amazon EventBridge rule is triggered.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.sns.*;
 * import software.amazon.awscdk.services.events.targets.*;
 * Repository repo;
 * PipelineProject project;
 * Topic myTopic;
 * // starts a CodeBuild project when a commit is pushed to the "main" branch of the repo
 * repo.onCommit("CommitToMain", OnCommitOptions.builder()
 * .target(new CodeBuildProject(project))
 * .branches(List.of("main"))
 * .build());
 * // publishes a message to an Amazon SNS topic when a comment is made on a pull request
 * Rule rule = repo.onCommentOnPullRequest("CommentOnPullRequest", OnEventOptions.builder()
 * .target(new SnsTopic(myTopic))
 * .build());
 * ```
 */
@CdkDslMarker
public class CodeBuildProjectDsl(
    project: IProject,
) {
    private val cdkBuilder: CodeBuildProject.Builder = CodeBuildProject.Builder.create(project)

    /**
     * The SQS queue to be used as deadLetterQueue. Check out the
     * [considerations for using a dead-letter queue](https://docs.aws.amazon.com/eventbridge/latest/userguide/rule-dlq.html#dlq-considerations).
     *
     * The events not successfully delivered are automatically retried for a specified period of
     * time, depending on the retry policy of the target. If an event is not delivered before all
     * retry attempts are exhausted, it will be sent to the dead letter queue.
     *
     * Default: - no dead-letter queue
     *
     * @param deadLetterQueue The SQS queue to be used as deadLetterQueue. Check out the
     *   [considerations for using a dead-letter queue](https://docs.aws.amazon.com/eventbridge/latest/userguide/rule-dlq.html#dlq-considerations).
     */
    public fun deadLetterQueue(deadLetterQueue: IQueue) {
        cdkBuilder.deadLetterQueue(deadLetterQueue)
    }

    /**
     * The event to send to CodeBuild.
     *
     * This will be the payload for the StartBuild API.
     *
     * Default: - the entire EventBridge event
     *
     * @param event The event to send to CodeBuild.
     */
    public fun event(event: RuleTargetInput) {
        cdkBuilder.event(event)
    }

    /**
     * The role to assume before invoking the target (i.e., the codebuild) when the given rule is
     * triggered.
     *
     * Default: - a new role will be created
     *
     * @param eventRole The role to assume before invoking the target (i.e., the codebuild) when the
     *   given rule is triggered.
     */
    public fun eventRole(eventRole: IRole) {
        cdkBuilder.eventRole(eventRole)
    }

    /**
     * The maximum age of a request that Lambda sends to a function for processing.
     *
     * Minimum value of 60. Maximum value of 86400.
     *
     * Default: Duration.hours(24)
     *
     * @param maxEventAge The maximum age of a request that Lambda sends to a function for
     *   processing.
     */
    public fun maxEventAge(maxEventAge: Duration) {
        cdkBuilder.maxEventAge(maxEventAge)
    }

    /**
     * The maximum number of times to retry when the function returns an error.
     *
     * Minimum value of 0. Maximum value of 185.
     *
     * Default: 185
     *
     * @param retryAttempts The maximum number of times to retry when the function returns an error.
     */
    public fun retryAttempts(retryAttempts: Number) {
        cdkBuilder.retryAttempts(retryAttempts)
    }

    public fun build(): CodeBuildProject = cdkBuilder.build()
}
