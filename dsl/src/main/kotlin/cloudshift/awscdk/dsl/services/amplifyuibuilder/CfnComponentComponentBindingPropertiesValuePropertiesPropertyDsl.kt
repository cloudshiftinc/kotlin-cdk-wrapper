@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.amplifyuibuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amplifyuibuilder.CfnComponent

@CdkDslMarker
public class CfnComponentComponentBindingPropertiesValuePropertiesPropertyDsl {
  private val cdkBuilder: CfnComponent.ComponentBindingPropertiesValuePropertiesProperty.Builder =
      CfnComponent.ComponentBindingPropertiesValuePropertiesProperty.builder()

  private val _predicates: MutableList<Any> = mutableListOf()

  /**
   * @param bucket An Amazon S3 bucket.
   */
  public fun bucket(bucket: String) {
    cdkBuilder.bucket(bucket)
  }

  /**
   * @param defaultValue The default value to assign to the property.
   */
  public fun defaultValue(defaultValue: String) {
    cdkBuilder.defaultValue(defaultValue)
  }

  /**
   * @param field The field to bind the data to.
   */
  public fun `field`(`field`: String) {
    cdkBuilder.`field`(`field`)
  }

  /**
   * @param key The storage key for an Amazon S3 bucket.
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param model An Amplify DataStore model.
   */
  public fun model(model: String) {
    cdkBuilder.model(model)
  }

  /**
   * @param predicates A list of predicates for binding a component's properties to data.
   */
  public fun predicates(vararg predicates: Any) {
    _predicates.addAll(listOf(*predicates))
  }

  /**
   * @param predicates A list of predicates for binding a component's properties to data.
   */
  public fun predicates(predicates: Collection<Any>) {
    _predicates.addAll(predicates)
  }

  /**
   * @param predicates A list of predicates for binding a component's properties to data.
   */
  public fun predicates(predicates: IResolvable) {
    cdkBuilder.predicates(predicates)
  }

  /**
   * @param userAttribute An authenticated user attribute.
   */
  public fun userAttribute(userAttribute: String) {
    cdkBuilder.userAttribute(userAttribute)
  }

  public fun build(): CfnComponent.ComponentBindingPropertiesValuePropertiesProperty {
    if(_predicates.isNotEmpty()) cdkBuilder.predicates(_predicates)
    return cdkBuilder.build()
  }
}
