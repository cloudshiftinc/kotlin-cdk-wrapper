package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String

public open class Errors internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.stepfunctions.Errors,
) : CdkObject(cdkObject) {
  public companion object {
    public val ALL: String = software.amazon.awscdk.services.stepfunctions.Errors.ALL

    public val BRANCH_FAILED: String =
        software.amazon.awscdk.services.stepfunctions.Errors.BRANCH_FAILED

    public val HEARTBEAT_TIMEOUT: String =
        software.amazon.awscdk.services.stepfunctions.Errors.HEARTBEAT_TIMEOUT

    public val NO_CHOICE_MATCHED: String =
        software.amazon.awscdk.services.stepfunctions.Errors.NO_CHOICE_MATCHED

    public val PARAMETER_PATH_FAILURE: String =
        software.amazon.awscdk.services.stepfunctions.Errors.PARAMETER_PATH_FAILURE

    public val PERMISSIONS: String =
        software.amazon.awscdk.services.stepfunctions.Errors.PERMISSIONS

    public val RESULT_PATH_MATCH_FAILURE: String =
        software.amazon.awscdk.services.stepfunctions.Errors.RESULT_PATH_MATCH_FAILURE

    public val TASKS_FAILED: String =
        software.amazon.awscdk.services.stepfunctions.Errors.TASKS_FAILED

    public val TIMEOUT: String = software.amazon.awscdk.services.stepfunctions.Errors.TIMEOUT

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.Errors): Errors =
        Errors(cdkObject)

    internal fun unwrap(wrapped: Errors): software.amazon.awscdk.services.stepfunctions.Errors =
        wrapped.cdkObject
  }
}
