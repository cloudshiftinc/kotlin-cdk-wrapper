@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnInstance

@CdkDslMarker
public class CfnInstanceSsmAssociationPropertyDsl {
  private val cdkBuilder: CfnInstance.SsmAssociationProperty.Builder =
      CfnInstance.SsmAssociationProperty.builder()

  private val _associationParameters: MutableList<Any> = mutableListOf()

  public fun associationParameters(vararg associationParameters: Any) {
    _associationParameters.addAll(listOf(*associationParameters))
  }

  public fun associationParameters(associationParameters: Collection<Any>) {
    _associationParameters.addAll(associationParameters)
  }

  public fun associationParameters(associationParameters: IResolvable) {
    cdkBuilder.associationParameters(associationParameters)
  }

  public fun documentName(documentName: String) {
    cdkBuilder.documentName(documentName)
  }

  public fun build(): CfnInstance.SsmAssociationProperty {
    if(_associationParameters.isNotEmpty()) cdkBuilder.associationParameters(_associationParameters)
    return cdkBuilder.build()
  }
}
