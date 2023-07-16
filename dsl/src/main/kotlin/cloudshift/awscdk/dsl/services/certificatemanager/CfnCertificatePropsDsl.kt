@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.certificatemanager

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.certificatemanager.CfnCertificateProps

@CdkDslMarker
public class CfnCertificatePropsDsl {
  private val cdkBuilder: CfnCertificateProps.Builder = CfnCertificateProps.builder()

  private val _domainValidationOptions: MutableList<Any> = mutableListOf()

  private val _subjectAlternativeNames: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun certificateAuthorityArn(certificateAuthorityArn: String) {
    cdkBuilder.certificateAuthorityArn(certificateAuthorityArn)
  }

  public
      fun certificateTransparencyLoggingPreference(certificateTransparencyLoggingPreference: String) {
    cdkBuilder.certificateTransparencyLoggingPreference(certificateTransparencyLoggingPreference)
  }

  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  public fun domainValidationOptions(vararg domainValidationOptions: Any) {
    _domainValidationOptions.addAll(listOf(*domainValidationOptions))
  }

  public fun domainValidationOptions(domainValidationOptions: Collection<Any>) {
    _domainValidationOptions.addAll(domainValidationOptions)
  }

  public fun domainValidationOptions(domainValidationOptions: IResolvable) {
    cdkBuilder.domainValidationOptions(domainValidationOptions)
  }

  public fun subjectAlternativeNames(vararg subjectAlternativeNames: String) {
    _subjectAlternativeNames.addAll(listOf(*subjectAlternativeNames))
  }

  public fun subjectAlternativeNames(subjectAlternativeNames: Collection<String>) {
    _subjectAlternativeNames.addAll(subjectAlternativeNames)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun validationMethod(validationMethod: String) {
    cdkBuilder.validationMethod(validationMethod)
  }

  public fun build(): CfnCertificateProps {
    if(_domainValidationOptions.isNotEmpty())
        cdkBuilder.domainValidationOptions(_domainValidationOptions)
    if(_subjectAlternativeNames.isNotEmpty())
        cdkBuilder.subjectAlternativeNames(_subjectAlternativeNames)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
