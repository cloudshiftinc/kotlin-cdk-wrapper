@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Source that is provided by a specific Amazon S3 object.
 *
 * Will trigger the pipeline as soon as the S3 object changes, but only if there is
 * a CloudTrail Trail in the account that captures the S3 event.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.cloudtrail.*;
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
public open class S3SourceAction(
  cdkObject: software.amazon.awscdk.services.codepipeline.actions.S3SourceAction,
) : Action(cdkObject) {
  public constructor(props: S3SourceActionProps) :
      this(software.amazon.awscdk.services.codepipeline.actions.S3SourceAction(props.let(S3SourceActionProps::unwrap))
  )

  public constructor(props: S3SourceActionProps.Builder.() -> Unit) :
      this(S3SourceActionProps(props)
  )

  /**
   * The variables emitted by this action.
   */
  public open fun variables(): S3SourceVariables =
      unwrap(this).getVariables().let(S3SourceVariables::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.codepipeline.actions.S3SourceAction].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The physical, human-readable name of the Action.
     *
     * Note that Action names must be unique within a single Stage.
     *
     * @param actionName The physical, human-readable name of the Action. 
     */
    public fun actionName(actionName: String)

    /**
     * The Amazon S3 bucket that stores the source code.
     *
     * If you import an encrypted bucket in your stack, please specify
     * the encryption key at import time by using `Bucket.fromBucketAttributes()` method.
     *
     * @param bucket The Amazon S3 bucket that stores the source code. 
     */
    public fun bucket(bucket: IBucket)

    /**
     * The key within the S3 bucket that stores the source code.
     *
     * Example:
     *
     * ```
     * "path/to/file.zip";
     * ```
     *
     * @param bucketKey The key within the S3 bucket that stores the source code. 
     */
    public fun bucketKey(bucketKey: String)

    /**
     * @param output 
     */
    public fun output(output: Artifact)

    /**
     * The Role in which context's this Action will be executing in.
     *
     * The Pipeline's Role will assume this Role
     * (the required permissions for that will be granted automatically)
     * right before executing this Action.
     * This Action will be passed into your `IAction.bind`
     * method in the `ActionBindOptions.role` property.
     *
     * Default: a new Role will be generated
     *
     * @param role The Role in which context's this Action will be executing in. 
     */
    public fun role(role: IRole)

    /**
     * The runOrder property for this Action.
     *
     * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
     *
     * Default: 1
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html)
     * @param runOrder The runOrder property for this Action. 
     */
    public fun runOrder(runOrder: Number)

    /**
     * How should CodePipeline detect source changes for this Action.
     *
     * Note that if this is S3Trigger.EVENTS, you need to make sure to include the source Bucket in
     * a CloudTrail Trail,
     * as otherwise the CloudWatch Events will not be emitted.
     *
     * Default: S3Trigger.POLL
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/log-s3-data-events.html)
     * @param trigger How should CodePipeline detect source changes for this Action. 
     */
    public fun trigger(trigger: S3Trigger)

    /**
     * The name of the namespace to use for variables emitted by this action.
     *
     * Default: - a name will be generated, based on the stage and action names,
     * if any of the action's variables were referenced - otherwise,
     * no namespace will be set
     *
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     * action. 
     */
    public fun variablesNamespace(variablesNamespace: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.S3SourceAction.Builder =
        software.amazon.awscdk.services.codepipeline.actions.S3SourceAction.Builder.create()

    /**
     * The physical, human-readable name of the Action.
     *
     * Note that Action names must be unique within a single Stage.
     *
     * @param actionName The physical, human-readable name of the Action. 
     */
    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    /**
     * The Amazon S3 bucket that stores the source code.
     *
     * If you import an encrypted bucket in your stack, please specify
     * the encryption key at import time by using `Bucket.fromBucketAttributes()` method.
     *
     * @param bucket The Amazon S3 bucket that stores the source code. 
     */
    override fun bucket(bucket: IBucket) {
      cdkBuilder.bucket(bucket.let(IBucket::unwrap))
    }

    /**
     * The key within the S3 bucket that stores the source code.
     *
     * Example:
     *
     * ```
     * "path/to/file.zip";
     * ```
     *
     * @param bucketKey The key within the S3 bucket that stores the source code. 
     */
    override fun bucketKey(bucketKey: String) {
      cdkBuilder.bucketKey(bucketKey)
    }

    /**
     * @param output 
     */
    override fun output(output: Artifact) {
      cdkBuilder.output(output.let(Artifact::unwrap))
    }

    /**
     * The Role in which context's this Action will be executing in.
     *
     * The Pipeline's Role will assume this Role
     * (the required permissions for that will be granted automatically)
     * right before executing this Action.
     * This Action will be passed into your `IAction.bind`
     * method in the `ActionBindOptions.role` property.
     *
     * Default: a new Role will be generated
     *
     * @param role The Role in which context's this Action will be executing in. 
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    /**
     * The runOrder property for this Action.
     *
     * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
     *
     * Default: 1
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html)
     * @param runOrder The runOrder property for this Action. 
     */
    override fun runOrder(runOrder: Number) {
      cdkBuilder.runOrder(runOrder)
    }

    /**
     * How should CodePipeline detect source changes for this Action.
     *
     * Note that if this is S3Trigger.EVENTS, you need to make sure to include the source Bucket in
     * a CloudTrail Trail,
     * as otherwise the CloudWatch Events will not be emitted.
     *
     * Default: S3Trigger.POLL
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/log-s3-data-events.html)
     * @param trigger How should CodePipeline detect source changes for this Action. 
     */
    override fun trigger(trigger: S3Trigger) {
      cdkBuilder.trigger(trigger.let(S3Trigger::unwrap))
    }

    /**
     * The name of the namespace to use for variables emitted by this action.
     *
     * Default: - a name will be generated, based on the stage and action names,
     * if any of the action's variables were referenced - otherwise,
     * no namespace will be set
     *
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     * action. 
     */
    override fun variablesNamespace(variablesNamespace: String) {
      cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.actions.S3SourceAction =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): S3SourceAction {
      val builderImpl = BuilderImpl()
      return S3SourceAction(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.S3SourceAction):
        S3SourceAction = S3SourceAction(cdkObject)

    internal fun unwrap(wrapped: S3SourceAction):
        software.amazon.awscdk.services.codepipeline.actions.S3SourceAction = wrapped.cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.S3SourceAction
  }
}
