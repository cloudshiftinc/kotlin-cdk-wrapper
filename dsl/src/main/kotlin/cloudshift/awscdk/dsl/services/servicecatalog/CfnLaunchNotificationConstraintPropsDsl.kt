@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.servicecatalog.CfnLaunchNotificationConstraintProps

@CdkDslMarker
public class CfnLaunchNotificationConstraintPropsDsl {
  private val cdkBuilder: CfnLaunchNotificationConstraintProps.Builder =
      CfnLaunchNotificationConstraintProps.builder()

  private val _notificationArns: MutableList<String> = mutableListOf()

  public fun acceptLanguage(acceptLanguage: String) {
    cdkBuilder.acceptLanguage(acceptLanguage)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun notificationArns(vararg notificationArns: String) {
    _notificationArns.addAll(listOf(*notificationArns))
  }

  public fun notificationArns(notificationArns: Collection<String>) {
    _notificationArns.addAll(notificationArns)
  }

  public fun portfolioId(portfolioId: String) {
    cdkBuilder.portfolioId(portfolioId)
  }

  public fun productId(productId: String) {
    cdkBuilder.productId(productId)
  }

  public fun build(): CfnLaunchNotificationConstraintProps {
    if(_notificationArns.isNotEmpty()) cdkBuilder.notificationArns(_notificationArns)
    return cdkBuilder.build()
  }
}
