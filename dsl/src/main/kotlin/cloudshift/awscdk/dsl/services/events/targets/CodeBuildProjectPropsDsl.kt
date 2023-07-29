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
import software.amazon.awscdk.services.events.RuleTargetInput
import software.amazon.awscdk.services.events.targets.CodeBuildProjectProps
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.sqs.IQueue

/**
 * Customize the CodeBuild Event Target.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.codebuild.*;
 * import software.amazon.awscdk.services.codecommit.*;
 * Repository repo = Repository.Builder.create(this, "MyRepo")
 * .repositoryName("aws-cdk-codebuild-events")
 * .build();
 * Project project = Project.Builder.create(this, "MyProject")
 * .source(Source.codeCommit(CodeCommitSourceProps.builder().repository(repo).build()))
 * .build();
 * Queue deadLetterQueue = new Queue(this, "DeadLetterQueue");
 * // trigger a build when a commit is pushed to the repo
 * Rule onCommitRule = repo.onCommit("OnCommit", OnCommitOptions.builder()
 * .target(CodeBuildProject.Builder.create(project)
 * .deadLetterQueue(deadLetterQueue)
 * .build())
 * .branches(List.of("master"))
 * .build());
 * ```
 */
@CdkDslMarker
public class CodeBuildProjectPropsDsl {
    private val cdkBuilder: CodeBuildProjectProps.Builder = CodeBuildProjectProps.builder()

    /**
     * @param deadLetterQueue The SQS queue to be used as deadLetterQueue. Check out the
     *   [considerations for using a dead-letter queue](https://docs.aws.amazon.com/eventbridge/latest/userguide/rule-dlq.html#dlq-considerations).
     *   The events not successfully delivered are automatically retried for a specified period of
     *   time, depending on the retry policy of the target. If an event is not delivered before all
     *   retry attempts are exhausted, it will be sent to the dead letter queue.
     */
    public fun deadLetterQueue(deadLetterQueue: IQueue) {
        cdkBuilder.deadLetterQueue(deadLetterQueue)
    }

    /**
     * @param event The event to send to CodeBuild. This will be the payload for the StartBuild API.
     */
    public fun event(event: RuleTargetInput) {
        cdkBuilder.event(event)
    }

    /**
     * @param eventRole The role to assume before invoking the target (i.e., the codebuild) when the
     *   given rule is triggered.
     */
    public fun eventRole(eventRole: IRole) {
        cdkBuilder.eventRole(eventRole)
    }

    /**
     * @param maxEventAge The maximum age of a request that Lambda sends to a function for
     *   processing. Minimum value of 60. Maximum value of 86400.
     */
    public fun maxEventAge(maxEventAge: Duration) {
        cdkBuilder.maxEventAge(maxEventAge)
    }

    /**
     * @param retryAttempts The maximum number of times to retry when the function returns an error.
     *   Minimum value of 0. Maximum value of 185.
     */
    public fun retryAttempts(retryAttempts: Number) {
        cdkBuilder.retryAttempts(retryAttempts)
    }

    public fun build(): CodeBuildProjectProps = cdkBuilder.build()
}
