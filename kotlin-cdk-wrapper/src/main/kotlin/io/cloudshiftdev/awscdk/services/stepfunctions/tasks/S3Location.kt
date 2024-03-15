@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class S3Location internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.S3Location,
) : CdkObject(cdkObject) {
  public open fun bind(arg0: ISageMakerTask, arg1: S3LocationBindOptions): S3LocationConfig =
      unwrap(this).bind(arg0.let(ISageMakerTask::unwrap),
      arg1.let(S3LocationBindOptions::unwrap)).let(S3LocationConfig::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8a32700fc05c9dd82704167e3dacafa7963c512c54b5f113cba18e137d46e22f")
  public open fun bind(arg0: ISageMakerTask, arg1: S3LocationBindOptions.Builder.() -> Unit):
      S3LocationConfig = bind(arg0, S3LocationBindOptions(arg1))

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
