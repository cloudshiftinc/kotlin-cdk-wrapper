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

  /**
   * @param acceptLanguage The language code.
   * * `jp` - Japanese
   * * `zh` - Chinese
   */
  public fun acceptLanguage(acceptLanguage: String) {
    cdkBuilder.acceptLanguage(acceptLanguage)
  }

  /**
   * @param description The description of the constraint.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param notificationArns The notification ARNs. 
   */
  public fun notificationArns(vararg notificationArns: String) {
    _notificationArns.addAll(listOf(*notificationArns))
  }

  /**
   * @param notificationArns The notification ARNs. 
   */
  public fun notificationArns(notificationArns: Collection<String>) {
    _notificationArns.addAll(notificationArns)
  }

  /**
   * @param portfolioId The portfolio identifier. 
   */
  public fun portfolioId(portfolioId: String) {
    cdkBuilder.portfolioId(portfolioId)
  }

  /**
   * @param productId The product identifier. 
   */
  public fun productId(productId: String) {
    cdkBuilder.productId(productId)
  }

  public fun build(): CfnLaunchNotificationConstraintProps {
    if(_notificationArns.isNotEmpty()) cdkBuilder.notificationArns(_notificationArns)
    return cdkBuilder.build()
  }
}
