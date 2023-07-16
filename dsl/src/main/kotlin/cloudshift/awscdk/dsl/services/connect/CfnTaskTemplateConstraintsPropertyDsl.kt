@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnTaskTemplate

@CdkDslMarker
public class CfnTaskTemplateConstraintsPropertyDsl {
  private val cdkBuilder: CfnTaskTemplate.ConstraintsProperty.Builder =
      CfnTaskTemplate.ConstraintsProperty.builder()

  private val _invisibleFields: MutableList<Any> = mutableListOf()

  private val _readOnlyFields: MutableList<Any> = mutableListOf()

  private val _requiredFields: MutableList<Any> = mutableListOf()

  public fun invisibleFields(vararg invisibleFields: Any) {
    _invisibleFields.addAll(listOf(*invisibleFields))
  }

  public fun invisibleFields(invisibleFields: Collection<Any>) {
    _invisibleFields.addAll(invisibleFields)
  }

  public fun invisibleFields(invisibleFields: IResolvable) {
    cdkBuilder.invisibleFields(invisibleFields)
  }

  public fun readOnlyFields(vararg readOnlyFields: Any) {
    _readOnlyFields.addAll(listOf(*readOnlyFields))
  }

  public fun readOnlyFields(readOnlyFields: Collection<Any>) {
    _readOnlyFields.addAll(readOnlyFields)
  }

  public fun readOnlyFields(readOnlyFields: IResolvable) {
    cdkBuilder.readOnlyFields(readOnlyFields)
  }

  public fun requiredFields(vararg requiredFields: Any) {
    _requiredFields.addAll(listOf(*requiredFields))
  }

  public fun requiredFields(requiredFields: Collection<Any>) {
    _requiredFields.addAll(requiredFields)
  }

  public fun requiredFields(requiredFields: IResolvable) {
    cdkBuilder.requiredFields(requiredFields)
  }

  public fun build(): CfnTaskTemplate.ConstraintsProperty {
    if(_invisibleFields.isNotEmpty()) cdkBuilder.invisibleFields(_invisibleFields)
    if(_readOnlyFields.isNotEmpty()) cdkBuilder.readOnlyFields(_readOnlyFields)
    if(_requiredFields.isNotEmpty()) cdkBuilder.requiredFields(_requiredFields)
    return cdkBuilder.build()
  }
}
