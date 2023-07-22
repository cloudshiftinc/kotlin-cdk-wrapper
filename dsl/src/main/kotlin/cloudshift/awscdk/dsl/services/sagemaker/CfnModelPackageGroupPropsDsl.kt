@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.sagemaker.CfnModelPackageGroupProps

/**
 * Properties for defining a `CfnModelPackageGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * Object modelPackageGroupPolicy;
 * CfnModelPackageGroupProps cfnModelPackageGroupProps = CfnModelPackageGroupProps.builder()
 * .modelPackageGroupName("modelPackageGroupName")
 * // the properties below are optional
 * .modelPackageGroupDescription("modelPackageGroupDescription")
 * .modelPackageGroupPolicy(modelPackageGroupPolicy)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackagegroup.html)
 */
@CdkDslMarker
public class CfnModelPackageGroupPropsDsl {
  private val cdkBuilder: CfnModelPackageGroupProps.Builder = CfnModelPackageGroupProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param modelPackageGroupDescription The description for the model group.
   */
  public fun modelPackageGroupDescription(modelPackageGroupDescription: String) {
    cdkBuilder.modelPackageGroupDescription(modelPackageGroupDescription)
  }

  /**
   * @param modelPackageGroupName The name of the model group. 
   */
  public fun modelPackageGroupName(modelPackageGroupName: String) {
    cdkBuilder.modelPackageGroupName(modelPackageGroupName)
  }

  /**
   * @param modelPackageGroupPolicy A resouce policy to control access to a model group.
   * For information about resoure policies, see [Identity-based policies and resource-based
   * policies](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_identity-vs-resource.html)
   * in the *AWS Identity and Access Management User Guide.* .
   */
  public fun modelPackageGroupPolicy(modelPackageGroupPolicy: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(modelPackageGroupPolicy)
    cdkBuilder.modelPackageGroupPolicy(builder.map)
  }

  /**
   * @param modelPackageGroupPolicy A resouce policy to control access to a model group.
   * For information about resoure policies, see [Identity-based policies and resource-based
   * policies](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_identity-vs-resource.html)
   * in the *AWS Identity and Access Management User Guide.* .
   */
  public fun modelPackageGroupPolicy(modelPackageGroupPolicy: Any) {
    cdkBuilder.modelPackageGroupPolicy(modelPackageGroupPolicy)
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnModelPackageGroupProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
