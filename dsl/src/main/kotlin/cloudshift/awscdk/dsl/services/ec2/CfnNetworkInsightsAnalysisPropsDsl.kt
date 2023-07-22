@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysisProps

@CdkDslMarker
public class CfnNetworkInsightsAnalysisPropsDsl {
  private val cdkBuilder: CfnNetworkInsightsAnalysisProps.Builder =
      CfnNetworkInsightsAnalysisProps.builder()

  private val _additionalAccounts: MutableList<String> = mutableListOf()

  private val _filterInArns: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param additionalAccounts The member accounts that contain resources that the path can
   * traverse.
   */
  public fun additionalAccounts(vararg additionalAccounts: String) {
    _additionalAccounts.addAll(listOf(*additionalAccounts))
  }

  /**
   * @param additionalAccounts The member accounts that contain resources that the path can
   * traverse.
   */
  public fun additionalAccounts(additionalAccounts: Collection<String>) {
    _additionalAccounts.addAll(additionalAccounts)
  }

  /**
   * @param filterInArns The Amazon Resource Names (ARN) of the resources that the path must
   * traverse.
   */
  public fun filterInArns(vararg filterInArns: String) {
    _filterInArns.addAll(listOf(*filterInArns))
  }

  /**
   * @param filterInArns The Amazon Resource Names (ARN) of the resources that the path must
   * traverse.
   */
  public fun filterInArns(filterInArns: Collection<String>) {
    _filterInArns.addAll(filterInArns)
  }

  /**
   * @param networkInsightsPathId The ID of the path. 
   */
  public fun networkInsightsPathId(networkInsightsPathId: String) {
    cdkBuilder.networkInsightsPathId(networkInsightsPathId)
  }

  /**
   * @param tags The tags to apply.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags The tags to apply.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnNetworkInsightsAnalysisProps {
    if(_additionalAccounts.isNotEmpty()) cdkBuilder.additionalAccounts(_additionalAccounts)
    if(_filterInArns.isNotEmpty()) cdkBuilder.filterInArns(_filterInArns)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
