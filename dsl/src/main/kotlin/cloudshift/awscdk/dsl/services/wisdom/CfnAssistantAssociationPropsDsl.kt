@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wisdom

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wisdom.CfnAssistantAssociation
import software.amazon.awscdk.services.wisdom.CfnAssistantAssociationProps

@CdkDslMarker
public class CfnAssistantAssociationPropsDsl {
  private val cdkBuilder: CfnAssistantAssociationProps.Builder =
      CfnAssistantAssociationProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun assistantId(assistantId: String) {
    cdkBuilder.assistantId(assistantId)
  }

  public fun association(association: IResolvable) {
    cdkBuilder.association(association)
  }

  public fun association(association: CfnAssistantAssociation.AssociationDataProperty) {
    cdkBuilder.association(association)
  }

  public fun associationType(associationType: String) {
    cdkBuilder.associationType(associationType)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnAssistantAssociationProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
