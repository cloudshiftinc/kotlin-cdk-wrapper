package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String

public open class Classification internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.stepfunctions.tasks.Classification,
) : CdkObject(cdkObject) {
  /**
   * A literal string in case a new EMR classification is released, if not already defined.
   */
  public open fun classificationStatement(): String = unwrap(this).getClassificationStatement()

  public companion object {
    public val SPARK: Classification =
        Classification.wrap(software.amazon.awscdk.services.stepfunctions.tasks.Classification.SPARK)

    public val SPARK_DEFAULTS: Classification =
        Classification.wrap(software.amazon.awscdk.services.stepfunctions.tasks.Classification.SPARK_DEFAULTS)

    public val SPARK_ENV: Classification =
        Classification.wrap(software.amazon.awscdk.services.stepfunctions.tasks.Classification.SPARK_ENV)

    public val SPARK_HIVE_SITE: Classification =
        Classification.wrap(software.amazon.awscdk.services.stepfunctions.tasks.Classification.SPARK_HIVE_SITE)

    public val SPARK_LOG4_J: Classification =
        Classification.wrap(software.amazon.awscdk.services.stepfunctions.tasks.Classification.SPARK_LOG4_J)

    public val SPARK_METRICS: Classification =
        Classification.wrap(software.amazon.awscdk.services.stepfunctions.tasks.Classification.SPARK_METRICS)

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.Classification):
        Classification = Classification(cdkObject)

    internal fun unwrap(wrapped: Classification):
        software.amazon.awscdk.services.stepfunctions.tasks.Classification = wrapped.cdkObject
  }
}
