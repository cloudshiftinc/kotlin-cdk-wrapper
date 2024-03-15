@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.common.CdkObject

public interface IAliasRecordTarget {
  public fun bind(arg0: IRecordSet): AliasRecordTargetConfig

  public fun bind(arg0: IRecordSet, arg1: IHostedZone): AliasRecordTargetConfig

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.route53.IAliasRecordTarget,
  ) : CdkObject(cdkObject), IAliasRecordTarget {
    override fun bind(arg0: IRecordSet): AliasRecordTargetConfig =
        unwrap(this).bind(arg0.let(IRecordSet::unwrap)).let(AliasRecordTargetConfig::wrap)

    override fun bind(arg0: IRecordSet, arg1: IHostedZone): AliasRecordTargetConfig =
        unwrap(this).bind(arg0.let(IRecordSet::unwrap),
        arg1.let(IHostedZone::unwrap)).let(AliasRecordTargetConfig::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.IAliasRecordTarget):
        IAliasRecordTarget = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IAliasRecordTarget):
        software.amazon.awscdk.services.route53.IAliasRecordTarget = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.route53.IAliasRecordTarget
  }
}
