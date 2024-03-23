@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.IConstruct
import kotlin.Boolean
import kotlin.String

/**
 * Features that are implemented behind a flag in order to preserve backwards compatibility for
 * existing apps.
 *
 * The list of flags are available in the
 * `aws-cdk-lib/cx-api` module.
 *
 * The state of the flag for this application is stored as a CDK context variable.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * FeatureFlags featureFlags = FeatureFlags.of(this);
 * ```
 */
public open class FeatureFlags(
  cdkObject: software.amazon.awscdk.FeatureFlags,
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
        wrapped.cdkObject as software.amazon.awscdk.FeatureFlags
  }
}
