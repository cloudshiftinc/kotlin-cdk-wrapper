@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import io.cloudshiftdev.awscdk.services.codepipeline.CommonAwsActionProps
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Construction properties of the `S3SourceAction S3 source Action`.
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
public interface S3SourceActionProps : CommonAwsActionProps {
  /**
   * The Amazon S3 bucket that stores the source code.
   *
   * If you import an encrypted bucket in your stack, please specify
   * the encryption key at import time by using `Bucket.fromBucketAttributes()` method.
   */
  public fun bucket(): IBucket

  /**
   * The key within the S3 bucket that stores the source code.
   *
   * Example:
   *
   * ```
   * "path/to/file.zip";
   * ```
   */
  public fun bucketKey(): String

  /**
   *
   */
  public fun output(): Artifact

  /**
   * How should CodePipeline detect source changes for this Action.
   *
   * Note that if this is S3Trigger.EVENTS, you need to make sure to include the source Bucket in a
   * CloudTrail Trail,
   * as otherwise the CloudWatch Events will not be emitted.
   *
   * Default: S3Trigger.POLL
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/log-s3-data-events.html)
   */
  public fun trigger(): S3Trigger? = unwrap(this).getTrigger()?.let(S3Trigger::wrap)

  /**
   * A builder for [S3SourceActionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param actionName The physical, human-readable name of the Action. 
     * Note that Action names must be unique within a single Stage.
     */
    public fun actionName(actionName: String)

    /**
     * @param bucket The Amazon S3 bucket that stores the source code. 
     * If you import an encrypted bucket in your stack, please specify
     * the encryption key at import time by using `Bucket.fromBucketAttributes()` method.
     */
    public fun bucket(bucket: IBucket)

    /**
     * @param bucketKey The key within the S3 bucket that stores the source code. 
     */
    public fun bucketKey(bucketKey: String)

    /**
     * @param output the value to be set. 
     */
    public fun output(output: Artifact)

    /**
     * @param role The Role in which context's this Action will be executing in.
     * The Pipeline's Role will assume this Role
     * (the required permissions for that will be granted automatically)
     * right before executing this Action.
     * This Action will be passed into your `IAction.bind`
     * method in the `ActionBindOptions.role` property.
     */
    public fun role(role: IRole)

    /**
     * @param runOrder The runOrder property for this Action.
     * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
     */
    public fun runOrder(runOrder: Number)

    /**
     * @param trigger How should CodePipeline detect source changes for this Action.
     * Note that if this is S3Trigger.EVENTS, you need to make sure to include the source Bucket in
     * a CloudTrail Trail,
     * as otherwise the CloudWatch Events will not be emitted.
     */
    public fun trigger(trigger: S3Trigger)

    /**
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     * action.
     */
    public fun variablesNamespace(variablesNamespace: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.S3SourceActionProps.Builder =
        software.amazon.awscdk.services.codepipeline.actions.S3SourceActionProps.builder()

    /**
     * @param actionName The physical, human-readable name of the Action. 
     * Note that Action names must be unique within a single Stage.
     */
    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    /**
     * @param bucket The Amazon S3 bucket that stores the source code. 
     * If you import an encrypted bucket in your stack, please specify
     * the encryption key at import time by using `Bucket.fromBucketAttributes()` method.
     */
    override fun bucket(bucket: IBucket) {
      cdkBuilder.bucket(bucket.let(IBucket.Companion::unwrap))
    }

    /**
     * @param bucketKey The key within the S3 bucket that stores the source code. 
     */
    override fun bucketKey(bucketKey: String) {
      cdkBuilder.bucketKey(bucketKey)
    }

    /**
     * @param output the value to be set. 
     */
    override fun output(output: Artifact) {
      cdkBuilder.output(output.let(Artifact.Companion::unwrap))
    }

    /**
     * @param role The Role in which context's this Action will be executing in.
     * The Pipeline's Role will assume this Role
     * (the required permissions for that will be granted automatically)
     * right before executing this Action.
     * This Action will be passed into your `IAction.bind`
     * method in the `ActionBindOptions.role` property.
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
    }

    /**
     * @param runOrder The runOrder property for this Action.
     * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
     */
    override fun runOrder(runOrder: Number) {
      cdkBuilder.runOrder(runOrder)
    }

    /**
     * @param trigger How should CodePipeline detect source changes for this Action.
     * Note that if this is S3Trigger.EVENTS, you need to make sure to include the source Bucket in
     * a CloudTrail Trail,
     * as otherwise the CloudWatch Events will not be emitted.
     */
    override fun trigger(trigger: S3Trigger) {
      cdkBuilder.trigger(trigger.let(S3Trigger.Companion::unwrap))
    }

    /**
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     * action.
     */
    override fun variablesNamespace(variablesNamespace: String) {
      cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.actions.S3SourceActionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codepipeline.actions.S3SourceActionProps,
  ) : CdkObject(cdkObject), S3SourceActionProps {
    /**
     * The physical, human-readable name of the Action.
     *
     * Note that Action names must be unique within a single Stage.
     */
    override fun actionName(): String = unwrap(this).getActionName()

    /**
     * The Amazon S3 bucket that stores the source code.
     *
     * If you import an encrypted bucket in your stack, please specify
     * the encryption key at import time by using `Bucket.fromBucketAttributes()` method.
     */
    override fun bucket(): IBucket = unwrap(this).getBucket().let(IBucket::wrap)

    /**
     * The key within the S3 bucket that stores the source code.
     *
     * Example:
     *
     * ```
     * "path/to/file.zip";
     * ```
     */
    override fun bucketKey(): String = unwrap(this).getBucketKey()

    /**
     *
     */
    override fun output(): Artifact = unwrap(this).getOutput().let(Artifact::wrap)

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
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    /**
     * The runOrder property for this Action.
     *
     * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
     *
     * Default: 1
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html)
     */
    override fun runOrder(): Number? = unwrap(this).getRunOrder()

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
     */
    override fun trigger(): S3Trigger? = unwrap(this).getTrigger()?.let(S3Trigger::wrap)

    /**
     * The name of the namespace to use for variables emitted by this action.
     *
     * Default: - a name will be generated, based on the stage and action names,
     * if any of the action's variables were referenced - otherwise,
     * no namespace will be set
     */
    override fun variablesNamespace(): String? = unwrap(this).getVariablesNamespace()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): S3SourceActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.S3SourceActionProps):
        S3SourceActionProps = CdkObjectWrappers.wrap(cdkObject) as? S3SourceActionProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: S3SourceActionProps):
        software.amazon.awscdk.services.codepipeline.actions.S3SourceActionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.S3SourceActionProps
  }
}
