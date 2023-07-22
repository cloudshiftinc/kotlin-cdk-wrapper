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
public class CfnComponentComponentDataConfigurationPropertyDsl {
  private val cdkBuilder: CfnComponent.ComponentDataConfigurationProperty.Builder =
      CfnComponent.ComponentDataConfigurationProperty.builder()

  private val _identifiers: MutableList<String> = mutableListOf()

  private val _sort: MutableList<Any> = mutableListOf()

  /**
   * @param identifiers A list of IDs to use to bind data to a component.
   * Use this property to bind specifically chosen data, rather than data retrieved from a query.
   */
  public fun identifiers(vararg identifiers: String) {
    _identifiers.addAll(listOf(*identifiers))
  }

  /**
   * @param identifiers A list of IDs to use to bind data to a component.
   * Use this property to bind specifically chosen data, rather than data retrieved from a query.
   */
  public fun identifiers(identifiers: Collection<String>) {
    _identifiers.addAll(identifiers)
  }

  /**
   * @param model The name of the data model to use to bind data to a component. 
   */
  public fun model(model: String) {
    cdkBuilder.model(model)
  }

  /**
   * @param predicate Represents the conditional logic to use when binding data to a component.
   * Use this property to retrieve only a subset of the data in a collection.
   */
  public fun predicate(predicate: IResolvable) {
    cdkBuilder.predicate(predicate)
  }

  /**
   * @param predicate Represents the conditional logic to use when binding data to a component.
   * Use this property to retrieve only a subset of the data in a collection.
   */
  public fun predicate(predicate: CfnComponent.PredicateProperty) {
    cdkBuilder.predicate(predicate)
  }

  /**
   * @param sort Describes how to sort the component's properties.
   */
  public fun sort(vararg sort: Any) {
    _sort.addAll(listOf(*sort))
  }

  /**
   * @param sort Describes how to sort the component's properties.
   */
  public fun sort(sort: Collection<Any>) {
    _sort.addAll(sort)
  }

  /**
   * @param sort Describes how to sort the component's properties.
   */
  public fun sort(sort: IResolvable) {
    cdkBuilder.sort(sort)
  }

  public fun build(): CfnComponent.ComponentDataConfigurationProperty {
    if(_identifiers.isNotEmpty()) cdkBuilder.identifiers(_identifiers)
    if(_sort.isNotEmpty()) cdkBuilder.sort(_sort)
    return cdkBuilder.build()
  }
}
