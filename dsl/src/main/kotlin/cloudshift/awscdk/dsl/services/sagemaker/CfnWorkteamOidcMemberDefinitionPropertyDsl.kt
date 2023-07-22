@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.sagemaker.CfnWorkteam

@CdkDslMarker
public class CfnWorkteamOidcMemberDefinitionPropertyDsl {
  private val cdkBuilder: CfnWorkteam.OidcMemberDefinitionProperty.Builder =
      CfnWorkteam.OidcMemberDefinitionProperty.builder()

  private val _oidcGroups: MutableList<String> = mutableListOf()

  /**
   * @param oidcGroups the value to be set. 
   */
  public fun oidcGroups(vararg oidcGroups: String) {
    _oidcGroups.addAll(listOf(*oidcGroups))
  }

  /**
   * @param oidcGroups the value to be set. 
   */
  public fun oidcGroups(oidcGroups: Collection<String>) {
    _oidcGroups.addAll(oidcGroups)
  }

  public fun build(): CfnWorkteam.OidcMemberDefinitionProperty {
    if(_oidcGroups.isNotEmpty()) cdkBuilder.oidcGroups(_oidcGroups)
    return cdkBuilder.build()
  }
}
