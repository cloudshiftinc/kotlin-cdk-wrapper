package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.Any

public interface IVariable {
  /**
   * Return the variable JSON for use in the dashboard.
   */
  public fun toJson(): Any

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudwatch.IVariable,
  ) : CdkObject(cdkObject), IVariable {
    /**
     * Return the variable JSON for use in the dashboard.
     */
    override fun toJson(): Any = unwrap(this).toJson()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.IVariable): IVariable =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IVariable): software.amazon.awscdk.services.cloudwatch.IVariable =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.IVariable
  }
}
