@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.voiceid

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.voiceid.CfnDomain
import software.amazon.awscdk.services.voiceid.CfnDomainProps

@CdkDslMarker
public class CfnDomainPropsDsl {
  private val cdkBuilder: CfnDomainProps.Builder = CfnDomainProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: IResolvable) {
    cdkBuilder.serverSideEncryptionConfiguration(serverSideEncryptionConfiguration)
  }

  public
      fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: CfnDomain.ServerSideEncryptionConfigurationProperty) {
    cdkBuilder.serverSideEncryptionConfiguration(serverSideEncryptionConfiguration)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnDomainProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
