package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class S3Location internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.S3Location,
) : CdkObject(cdkObject) {
  /**
   * Called when the S3Location is bound to a StepFunctions task.
   *
   * @param task 
   * @param opts 
   */
  public open fun bind(task: ISageMakerTask, opts: S3LocationBindOptions): S3LocationConfig =
      unwrap(this).bind(task.let(ISageMakerTask::unwrap),
      opts.let(S3LocationBindOptions::unwrap)).let(S3LocationConfig::wrap)

  /**
   * Called when the S3Location is bound to a StepFunctions task.
   *
   * @param task 
   * @param opts 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8a32700fc05c9dd82704167e3dacafa7963c512c54b5f113cba18e137d46e22f")
  public open fun bind(task: ISageMakerTask, opts: S3LocationBindOptions.Builder.() -> Unit):
      S3LocationConfig = bind(task, S3LocationBindOptions(opts))

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.S3Location,
  ) : S3Location(cdkObject)

  public companion object {
    public fun fromBucket(bucket: IBucket, keyPrefix: String): S3Location =
        software.amazon.awscdk.services.stepfunctions.tasks.S3Location.fromBucket(bucket.let(IBucket::unwrap),
        keyPrefix).let(S3Location::wrap)

    public fun fromJsonExpression(expression: String): S3Location =
        software.amazon.awscdk.services.stepfunctions.tasks.S3Location.fromJsonExpression(expression).let(S3Location::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.S3Location):
        S3Location = Wrapper(cdkObject)

    internal fun unwrap(wrapped: S3Location):
        software.amazon.awscdk.services.stepfunctions.tasks.S3Location = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.tasks.S3Location
  }
}
