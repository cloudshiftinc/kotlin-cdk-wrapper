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
import software.constructs.Construct

@CdkDslMarker
public class CfnModelCardDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnModelCard.Builder = CfnModelCard.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The content of the model card.
   *
   * Content uses the [model card JSON
   * schema](https://docs.aws.amazon.com/sagemaker/latest/dg/model-cards.html#model-cards-json-schema)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelcard.html#cfn-sagemaker-modelcard-content)
   * @param content The content of the model card. 
   */
  public fun content(content: IResolvable) {
    cdkBuilder.content(content)
  }

  /**
   * The content of the model card.
   *
   * Content uses the [model card JSON
   * schema](https://docs.aws.amazon.com/sagemaker/latest/dg/model-cards.html#model-cards-json-schema)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelcard.html#cfn-sagemaker-modelcard-content)
   * @param content The content of the model card. 
   */
  public fun content(content: CfnModelCard.ContentProperty) {
    cdkBuilder.content(content)
  }

  /**
   * Information about the user who created or modified one or more of the following:.
   *
   * * Experiment
   * * Trial
   * * Trial component
   * * Lineage group
   * * Project
   * * Model Card
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelcard.html#cfn-sagemaker-modelcard-createdby)
   * @param createdBy Information about the user who created or modified one or more of the
   * following:. 
   */
  public fun createdBy(createdBy: IResolvable) {
    cdkBuilder.createdBy(createdBy)
  }

  /**
   * Information about the user who created or modified one or more of the following:.
   *
   * * Experiment
   * * Trial
   * * Trial component
   * * Lineage group
   * * Project
   * * Model Card
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelcard.html#cfn-sagemaker-modelcard-createdby)
   * @param createdBy Information about the user who created or modified one or more of the
   * following:. 
   */
  public fun createdBy(createdBy: CfnModelCard.UserContextProperty) {
    cdkBuilder.createdBy(createdBy)
  }

  /**
   * Information about the user who created or modified an experiment, trial, trial component,
   * lineage group, project, or model card.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelcard.html#cfn-sagemaker-modelcard-lastmodifiedby)
   * @param lastModifiedBy Information about the user who created or modified an experiment, trial,
   * trial component, lineage group, project, or model card. 
   */
  public fun lastModifiedBy(lastModifiedBy: IResolvable) {
    cdkBuilder.lastModifiedBy(lastModifiedBy)
  }

  /**
   * Information about the user who created or modified an experiment, trial, trial component,
   * lineage group, project, or model card.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelcard.html#cfn-sagemaker-modelcard-lastmodifiedby)
   * @param lastModifiedBy Information about the user who created or modified an experiment, trial,
   * trial component, lineage group, project, or model card. 
   */
  public fun lastModifiedBy(lastModifiedBy: CfnModelCard.UserContextProperty) {
    cdkBuilder.lastModifiedBy(lastModifiedBy)
  }

  /**
   * The unique name of the model card.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelcard.html#cfn-sagemaker-modelcard-modelcardname)
   * @param modelCardName The unique name of the model card. 
   */
  public fun modelCardName(modelCardName: String) {
    cdkBuilder.modelCardName(modelCardName)
  }

  /**
   * The approval status of the model card within your organization.
   *
   * Different organizations might have different criteria for model card review and approval.
   *
   * * `Draft` : The model card is a work in progress.
   * * `PendingReview` : The model card is pending review.
   * * `Approved` : The model card is approved.
   * * `Archived` : The model card is archived. No more updates should be made to the model card,
   * but it can still be exported.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelcard.html#cfn-sagemaker-modelcard-modelcardstatus)
   * @param modelCardStatus The approval status of the model card within your organization. 
   */
  public fun modelCardStatus(modelCardStatus: String) {
    cdkBuilder.modelCardStatus(modelCardStatus)
  }

  /**
   * The security configuration used to protect model card data.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelcard.html#cfn-sagemaker-modelcard-securityconfig)
   * @param securityConfig The security configuration used to protect model card data. 
   */
  public fun securityConfig(securityConfig: IResolvable) {
    cdkBuilder.securityConfig(securityConfig)
  }

  /**
   * The security configuration used to protect model card data.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelcard.html#cfn-sagemaker-modelcard-securityconfig)
   * @param securityConfig The security configuration used to protect model card data. 
   */
  public fun securityConfig(securityConfig: CfnModelCard.SecurityConfigProperty) {
    cdkBuilder.securityConfig(securityConfig)
  }

  /**
   * Key-value pairs used to manage metadata for the model card.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelcard.html#cfn-sagemaker-modelcard-tags)
   * @param tags Key-value pairs used to manage metadata for the model card. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * Key-value pairs used to manage metadata for the model card.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelcard.html#cfn-sagemaker-modelcard-tags)
   * @param tags Key-value pairs used to manage metadata for the model card. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnModelCard {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
