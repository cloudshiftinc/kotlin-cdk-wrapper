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

package io.cloudshiftdev.awscdkdsl.services.codepipeline.actions

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.codepipeline.Artifact
import software.amazon.awscdk.services.codepipeline.actions.S3SourceActionProps
import software.amazon.awscdk.services.codepipeline.actions.S3Trigger
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.s3.IBucket

/**
 * Construction properties of the `S3SourceAction S3 source Action`.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.cloudtrail.*;
 * Bucket sourceBucket;
 * Artifact sourceOutput = new Artifact();
 * String key = "some/key.zip";
 * Trail trail = new Trail(this, "CloudTrail");
 * trail.addS3EventSelector(List.of(S3EventSelector.builder()
 * .bucket(sourceBucket)
 * .objectPrefix(key)
 * .build()), AddEventSelectorOptions.builder()
 * .readWriteType(ReadWriteType.WRITE_ONLY)
 * .build());
 * S3SourceAction sourceAction = S3SourceAction.Builder.create()
 * .actionName("S3Source")
 * .bucketKey(key)
 * .bucket(sourceBucket)
 * .output(sourceOutput)
 * .trigger(S3Trigger.EVENTS)
 * .build();
 * ```
 */
@CdkDslMarker
public class S3SourceActionPropsDsl {
    private val cdkBuilder: S3SourceActionProps.Builder = S3SourceActionProps.builder()

    /**
     * @param actionName The physical, human-readable name of the Action. Note that Action names
     *   must be unique within a single Stage.
     */
    public fun actionName(actionName: String) {
        cdkBuilder.actionName(actionName)
    }

    /**
     * @param bucket The Amazon S3 bucket that stores the source code. If you import an encrypted
     *   bucket in your stack, please specify the encryption key at import time by using
     *   `Bucket.fromBucketAttributes()` method.
     */
    public fun bucket(bucket: IBucket) {
        cdkBuilder.bucket(bucket)
    }

    /** @param bucketKey The key within the S3 bucket that stores the source code. */
    public fun bucketKey(bucketKey: String) {
        cdkBuilder.bucketKey(bucketKey)
    }

    /** @param output the value to be set. */
    public fun output(output: Artifact) {
        cdkBuilder.output(output)
    }

    /**
     * @param role The Role in which context's this Action will be executing in. The Pipeline's Role
     *   will assume this Role (the required permissions for that will be granted automatically)
     *   right before executing this Action. This Action will be passed into your `IAction.bind`
     *   method in the `ActionBindOptions.role` property.
     */
    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    /**
     * @param runOrder The runOrder property for this Action. RunOrder determines the relative order
     *   in which multiple Actions in the same Stage execute.
     */
    public fun runOrder(runOrder: Number) {
        cdkBuilder.runOrder(runOrder)
    }

    /**
     * @param trigger How should CodePipeline detect source changes for this Action. Note that if
     *   this is S3Trigger.EVENTS, you need to make sure to include the source Bucket in a
     *   CloudTrail Trail, as otherwise the CloudWatch Events will not be emitted.
     */
    public fun trigger(trigger: S3Trigger) {
        cdkBuilder.trigger(trigger)
    }

    /**
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     *   action.
     */
    public fun variablesNamespace(variablesNamespace: String) {
        cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build(): S3SourceActionProps = cdkBuilder.build()
}
