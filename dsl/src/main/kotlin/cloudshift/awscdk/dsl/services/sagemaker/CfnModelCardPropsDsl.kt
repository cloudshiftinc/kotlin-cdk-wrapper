@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelCard
import software.amazon.awscdk.services.sagemaker.CfnModelCardProps

@CdkDslMarker
public class CfnModelCardPropsDsl {
  private val cdkBuilder: CfnModelCardProps.Builder = CfnModelCardProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param content The content of the model card. 
   * Content uses the [model card JSON
   * schema](https://docs.aws.amazon.com/sagemaker/latest/dg/model-cards.html#model-cards-json-schema)
   * .
   */
  public fun content(content: IResolvable) {
    cdkBuilder.content(content)
  }

  /**
   * @param content The content of the model card. 
   * Content uses the [model card JSON
   * schema](https://docs.aws.amazon.com/sagemaker/latest/dg/model-cards.html#model-cards-json-schema)
   * .
   */
  public fun content(content: CfnModelCard.ContentProperty) {
    cdkBuilder.content(content)
  }

  /**
   * @param createdBy Information about the user who created or modified one or more of the
   * following:.
   * * Experiment
   * * Trial
   * * Trial component
   * * Lineage group
   * * Project
   * * Model Card
   */
  public fun createdBy(createdBy: IResolvable) {
    cdkBuilder.createdBy(createdBy)
  }

  /**
   * @param createdBy Information about the user who created or modified one or more of the
   * following:.
   * * Experiment
   * * Trial
   * * Trial component
   * * Lineage group
   * * Project
   * * Model Card
   */
  public fun createdBy(createdBy: CfnModelCard.UserContextProperty) {
    cdkBuilder.createdBy(createdBy)
  }

  /**
   * @param lastModifiedBy Information about the user who created or modified an experiment, trial,
   * trial component, lineage group, project, or model card.
   */
  public fun lastModifiedBy(lastModifiedBy: IResolvable) {
    cdkBuilder.lastModifiedBy(lastModifiedBy)
  }

  /**
   * @param lastModifiedBy Information about the user who created or modified an experiment, trial,
   * trial component, lineage group, project, or model card.
   */
  public fun lastModifiedBy(lastModifiedBy: CfnModelCard.UserContextProperty) {
    cdkBuilder.lastModifiedBy(lastModifiedBy)
  }

  /**
   * @param modelCardName The unique name of the model card. 
   */
  public fun modelCardName(modelCardName: String) {
    cdkBuilder.modelCardName(modelCardName)
  }

  /**
   * @param modelCardStatus The approval status of the model card within your organization. 
   * Different organizations might have different criteria for model card review and approval.
   *
   * * `Draft` : The model card is a work in progress.
   * * `PendingReview` : The model card is pending review.
   * * `Approved` : The model card is approved.
   * * `Archived` : The model card is archived. No more updates should be made to the model card,
   * but it can still be exported.
   */
  public fun modelCardStatus(modelCardStatus: String) {
    cdkBuilder.modelCardStatus(modelCardStatus)
  }

  /**
   * @param securityConfig The security configuration used to protect model card data.
   */
  public fun securityConfig(securityConfig: IResolvable) {
    cdkBuilder.securityConfig(securityConfig)
  }

  /**
   * @param securityConfig The security configuration used to protect model card data.
   */
  public fun securityConfig(securityConfig: CfnModelCard.SecurityConfigProperty) {
    cdkBuilder.securityConfig(securityConfig)
  }

  /**
   * @param tags Key-value pairs used to manage metadata for the model card.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags Key-value pairs used to manage metadata for the model card.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnModelCardProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
