@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline.actions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.codepipeline.Artifact
import software.amazon.awscdk.services.codepipeline.actions.S3SourceAction
import software.amazon.awscdk.services.codepipeline.actions.S3Trigger
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.s3.IBucket

@CdkDslMarker
public class S3SourceActionDsl {
  private val cdkBuilder: S3SourceAction.Builder = S3SourceAction.Builder.create()

  /**
   * The physical, human-readable name of the Action.
   *
   * Note that Action names must be unique within a single Stage.
   *
   * @param actionName The physical, human-readable name of the Action. 
   */
  public fun actionName(actionName: String) {
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
  public fun bucket(bucket: IBucket) {
    cdkBuilder.bucket(bucket)
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
  public fun bucketKey(bucketKey: String) {
    cdkBuilder.bucketKey(bucketKey)
  }

  /**
   * @param output 
   */
  public fun output(output: Artifact) {
    cdkBuilder.output(output)
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
  public fun role(role: IRole) {
    cdkBuilder.role(role)
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
  public fun runOrder(runOrder: Number) {
    cdkBuilder.runOrder(runOrder)
  }

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
   * @param trigger How should CodePipeline detect source changes for this Action. 
   */
  public fun trigger(trigger: S3Trigger) {
    cdkBuilder.trigger(trigger)
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
  public fun variablesNamespace(variablesNamespace: String) {
    cdkBuilder.variablesNamespace(variablesNamespace)
  }

  public fun build(): S3SourceAction = cdkBuilder.build()
}
