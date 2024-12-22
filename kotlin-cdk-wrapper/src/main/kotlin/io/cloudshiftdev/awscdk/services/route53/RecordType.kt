@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

public enum class RecordType(
  private val cdkObject: software.amazon.awscdk.services.route53.RecordType,
) {
  A(software.amazon.awscdk.services.route53.RecordType.A),
  AAAA(software.amazon.awscdk.services.route53.RecordType.AAAA),
  CAA(software.amazon.awscdk.services.route53.RecordType.CAA),
  CNAME(software.amazon.awscdk.services.route53.RecordType.CNAME),
  DS(software.amazon.awscdk.services.route53.RecordType.DS),
  HTTPS(software.amazon.awscdk.services.route53.RecordType.HTTPS),
  MX(software.amazon.awscdk.services.route53.RecordType.MX),
  NAPTR(software.amazon.awscdk.services.route53.RecordType.NAPTR),
  NS(software.amazon.awscdk.services.route53.RecordType.NS),
  PTR(software.amazon.awscdk.services.route53.RecordType.PTR),
  SOA(software.amazon.awscdk.services.route53.RecordType.SOA),
  SPF(software.amazon.awscdk.services.route53.RecordType.SPF),
  SRV(software.amazon.awscdk.services.route53.RecordType.SRV),
  SSHFP(software.amazon.awscdk.services.route53.RecordType.SSHFP),
  SVCB(software.amazon.awscdk.services.route53.RecordType.SVCB),
  TLSA(software.amazon.awscdk.services.route53.RecordType.TLSA),
  TXT(software.amazon.awscdk.services.route53.RecordType.TXT),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.RecordType): RecordType =
        when (cdkObject) {
      software.amazon.awscdk.services.route53.RecordType.A -> RecordType.A
      software.amazon.awscdk.services.route53.RecordType.AAAA -> RecordType.AAAA
      software.amazon.awscdk.services.route53.RecordType.CAA -> RecordType.CAA
      software.amazon.awscdk.services.route53.RecordType.CNAME -> RecordType.CNAME
      software.amazon.awscdk.services.route53.RecordType.DS -> RecordType.DS
      software.amazon.awscdk.services.route53.RecordType.HTTPS -> RecordType.HTTPS
      software.amazon.awscdk.services.route53.RecordType.MX -> RecordType.MX
      software.amazon.awscdk.services.route53.RecordType.NAPTR -> RecordType.NAPTR
      software.amazon.awscdk.services.route53.RecordType.NS -> RecordType.NS
      software.amazon.awscdk.services.route53.RecordType.PTR -> RecordType.PTR
      software.amazon.awscdk.services.route53.RecordType.SOA -> RecordType.SOA
      software.amazon.awscdk.services.route53.RecordType.SPF -> RecordType.SPF
      software.amazon.awscdk.services.route53.RecordType.SRV -> RecordType.SRV
      software.amazon.awscdk.services.route53.RecordType.SSHFP -> RecordType.SSHFP
      software.amazon.awscdk.services.route53.RecordType.SVCB -> RecordType.SVCB
      software.amazon.awscdk.services.route53.RecordType.TLSA -> RecordType.TLSA
      software.amazon.awscdk.services.route53.RecordType.TXT -> RecordType.TXT
    }

    internal fun unwrap(wrapped: RecordType): software.amazon.awscdk.services.route53.RecordType =
        wrapped.cdkObject
  }
}
