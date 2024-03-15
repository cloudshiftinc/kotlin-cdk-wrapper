@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.IConstruct
import kotlin.Boolean
import kotlin.String

public open class FeatureFlags internal constructor(
  internal override val cdkObject: software.amazon.awscdk.FeatureFlags,
) : CdkObject(cdkObject) {
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
