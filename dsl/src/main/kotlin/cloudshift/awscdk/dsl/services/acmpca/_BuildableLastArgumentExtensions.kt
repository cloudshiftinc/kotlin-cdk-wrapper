@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.acmpca

import kotlin.Unit
import software.amazon.awscdk.services.acmpca.CfnCertificate
import software.amazon.awscdk.services.acmpca.CfnCertificateAuthority

public inline
    fun CfnCertificateAuthority.setSubject(block: CfnCertificateAuthoritySubjectPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnCertificateAuthoritySubjectPropertyDsl()
  builder.apply(block)
  return setSubject(builder.build())
}

public inline
    fun CfnCertificateAuthority.setCsrExtensions(block: CfnCertificateAuthorityCsrExtensionsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnCertificateAuthorityCsrExtensionsPropertyDsl()
  builder.apply(block)
  return setCsrExtensions(builder.build())
}

public inline
    fun CfnCertificateAuthority.setRevocationConfiguration(block: CfnCertificateAuthorityRevocationConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnCertificateAuthorityRevocationConfigurationPropertyDsl()
  builder.apply(block)
  return setRevocationConfiguration(builder.build())
}

public inline fun CfnCertificate.setValidity(block: CfnCertificateValidityPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnCertificateValidityPropertyDsl()
  builder.apply(block)
  return setValidity(builder.build())
}

public inline
    fun CfnCertificate.setApiPassthrough(block: CfnCertificateApiPassthroughPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnCertificateApiPassthroughPropertyDsl()
  builder.apply(block)
  return setApiPassthrough(builder.build())
}

public inline
    fun CfnCertificate.setValidityNotBefore(block: CfnCertificateValidityPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnCertificateValidityPropertyDsl()
  builder.apply(block)
  return setValidityNotBefore(builder.build())
}
