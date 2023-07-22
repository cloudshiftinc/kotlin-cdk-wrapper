@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.sagemaker.CfnWorkteam

/**
 * A list of user groups that exist in your OIDC Identity Provider (IdP).
 *
 * One to ten groups can be used to create a single private work team. When you add a user group to
 * the list of `Groups` , you can add that user group to one or more private work teams. If you add a
 * user group to a private work team, all workers in that user group are added to the work team.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * OidcMemberDefinitionProperty oidcMemberDefinitionProperty =
 * OidcMemberDefinitionProperty.builder()
 * .oidcGroups(List.of("oidcGroups"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-workteam-oidcmemberdefinition.html)
 */
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
