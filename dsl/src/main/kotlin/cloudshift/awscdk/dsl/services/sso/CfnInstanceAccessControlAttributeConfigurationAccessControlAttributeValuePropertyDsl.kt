@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sso

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration

@CdkDslMarker
public class CfnInstanceAccessControlAttributeConfigurationAccessControlAttributeValuePropertyDsl {
  private val cdkBuilder:
      CfnInstanceAccessControlAttributeConfiguration.AccessControlAttributeValueProperty.Builder =
      CfnInstanceAccessControlAttributeConfiguration.AccessControlAttributeValueProperty.builder()

  private val _source: MutableList<String> = mutableListOf()

  public fun source(vararg source: String) {
    _source.addAll(listOf(*source))
  }

  public fun source(source: Collection<String>) {
    _source.addAll(source)
  }

  public fun build():
      CfnInstanceAccessControlAttributeConfiguration.AccessControlAttributeValueProperty {
    if(_source.isNotEmpty()) cdkBuilder.source(_source)
    return cdkBuilder.build()
  }
}
