package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.CdkObject

public interface IAliasRecordTarget {
  /**
   * Return hosted zone ID and DNS name, usable for Route53 alias targets.
   *
   * @param record 
   * @param zone
   */
  public fun bind(record: IRecordSet): AliasRecordTargetConfig

  /**
   * Return hosted zone ID and DNS name, usable for Route53 alias targets.
   *
   * @param record 
   * @param zone
   */
  public fun bind(record: IRecordSet, zone: IHostedZone): AliasRecordTargetConfig

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.route53.IAliasRecordTarget,
  ) : CdkObject(cdkObject), IAliasRecordTarget {
    /**
     * Return hosted zone ID and DNS name, usable for Route53 alias targets.
     *
     * @param record 
     * @param zone
     */
    override fun bind(record: IRecordSet): AliasRecordTargetConfig =
        unwrap(this).bind(record.let(IRecordSet::unwrap)).let(AliasRecordTargetConfig::wrap)

    /**
     * Return hosted zone ID and DNS name, usable for Route53 alias targets.
     *
     * @param record 
     * @param zone
     */
    override fun bind(record: IRecordSet, zone: IHostedZone): AliasRecordTargetConfig =
        unwrap(this).bind(record.let(IRecordSet::unwrap),
        zone.let(IHostedZone::unwrap)).let(AliasRecordTargetConfig::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.IAliasRecordTarget):
        IAliasRecordTarget = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IAliasRecordTarget):
        software.amazon.awscdk.services.route53.IAliasRecordTarget = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.route53.IAliasRecordTarget
  }
}
