package io.cloudshiftdev.awscdk

import io.cloudshiftdev.constructs.IConstruct
import kotlin.Boolean
import kotlin.String

public open class FeatureFlags internal constructor(
  internal override val cdkObject: software.amazon.awscdk.FeatureFlags,
) : CdkObject(cdkObject) {
  /**
   * Check whether a feature flag is enabled.
   *
   * If configured, the flag is present in
   * the construct node context. Falls back to the defaults defined in the `cx-api`
   * module.
   *
   * @param featureFlag 
   */
  public open fun isEnabled(featureFlag: String): Boolean? = unwrap(this).isEnabled(featureFlag)

  public companion object {
    public fun of(scope: IConstruct): FeatureFlags =
        software.amazon.awscdk.FeatureFlags.of(scope.let(IConstruct::unwrap)).let(FeatureFlags::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.FeatureFlags): FeatureFlags =
        FeatureFlags(cdkObject)

    internal fun unwrap(wrapped: FeatureFlags): software.amazon.awscdk.FeatureFlags =
        wrapped.cdkObject
  }
}
