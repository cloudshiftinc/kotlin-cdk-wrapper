@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnRule

@CdkDslMarker
public class CfnRuleNotificationRecipientTypePropertyDsl {
  private val cdkBuilder: CfnRule.NotificationRecipientTypeProperty.Builder =
      CfnRule.NotificationRecipientTypeProperty.builder()

  private val _userArns: MutableList<String> = mutableListOf()

  public fun userArns(vararg userArns: String) {
    _userArns.addAll(listOf(*userArns))
  }

  public fun userArns(userArns: Collection<String>) {
    _userArns.addAll(userArns)
  }

  public fun userTags(userTags: Map<String, String>) {
    cdkBuilder.userTags(userTags)
  }

  public fun userTags(userTags: IResolvable) {
    cdkBuilder.userTags(userTags)
  }

  public fun build(): CfnRule.NotificationRecipientTypeProperty {
    if(_userArns.isNotEmpty()) cdkBuilder.userArns(_userArns)
    return cdkBuilder.build()
  }
}
