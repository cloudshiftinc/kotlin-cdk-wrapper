@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.voiceid

import kotlin.Unit
import software.amazon.awscdk.services.voiceid.CfnDomain

/**
 * The server-side encryption configuration containing the KMS key identifier you want Voice ID to
 * use to encrypt your data.
 */
public inline
    fun CfnDomain.setServerSideEncryptionConfiguration(block: CfnDomainServerSideEncryptionConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDomainServerSideEncryptionConfigurationPropertyDsl()
  builder.apply(block)
  return setServerSideEncryptionConfiguration(builder.build())
}
