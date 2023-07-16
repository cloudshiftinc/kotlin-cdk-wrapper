@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sso

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfigurationProps

@CdkDslMarker
public class CfnInstanceAccessControlAttributeConfigurationPropsDsl {
  private val cdkBuilder: CfnInstanceAccessControlAttributeConfigurationProps.Builder =
      CfnInstanceAccessControlAttributeConfigurationProps.builder()

  private val _accessControlAttributes: MutableList<Any> = mutableListOf()

  public fun accessControlAttributes(vararg accessControlAttributes: Any) {
    _accessControlAttributes.addAll(listOf(*accessControlAttributes))
  }

  public fun accessControlAttributes(accessControlAttributes: Collection<Any>) {
    _accessControlAttributes.addAll(accessControlAttributes)
  }

  public fun accessControlAttributes(accessControlAttributes: IResolvable) {
    cdkBuilder.accessControlAttributes(accessControlAttributes)
  }

  public fun instanceArn(instanceArn: String) {
    cdkBuilder.instanceArn(instanceArn)
  }

  public fun build(): CfnInstanceAccessControlAttributeConfigurationProps {
    if(_accessControlAttributes.isNotEmpty())
        cdkBuilder.accessControlAttributes(_accessControlAttributes)
    return cdkBuilder.build()
  }
}
