@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecs.CfnCapacityProvider
import software.amazon.awscdk.services.ecs.CfnCapacityProviderProps

@CdkDslMarker
public class CfnCapacityProviderPropsDsl {
  private val cdkBuilder: CfnCapacityProviderProps.Builder = CfnCapacityProviderProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param autoScalingGroupProvider The Auto Scaling group settings for the capacity provider. 
   */
  public fun autoScalingGroupProvider(autoScalingGroupProvider: IResolvable) {
    cdkBuilder.autoScalingGroupProvider(autoScalingGroupProvider)
  }

  /**
   * @param autoScalingGroupProvider The Auto Scaling group settings for the capacity provider. 
   */
  public
      fun autoScalingGroupProvider(autoScalingGroupProvider: CfnCapacityProvider.AutoScalingGroupProviderProperty) {
    cdkBuilder.autoScalingGroupProvider(autoScalingGroupProvider)
  }

  /**
   * @param name The name of the capacity provider.
   * If a name is specified, it cannot start with `aws` , `ecs` , or `fargate` . If no name is
   * specified, a default name in the `CFNStackName-CFNResourceName-RandomString` format is used.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param tags The metadata that you apply to the capacity provider to help you categorize and
   * organize it.
   * Each tag consists of a key and an optional value. You define both.
   *
   * The following basic restrictions apply to tags:
   *
   * * Maximum number of tags per resource - 50
   * * For each resource, each tag key must be unique, and each tag key can have only one value.
   * * Maximum key length - 128 Unicode characters in UTF-8
   * * Maximum value length - 256 Unicode characters in UTF-8
   * * If your tagging schema is used across multiple services and resources, remember that other
   * services may have restrictions on allowed characters. Generally allowed characters are: letters,
   * numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : /
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags The metadata that you apply to the capacity provider to help you categorize and
   * organize it.
   * Each tag consists of a key and an optional value. You define both.
   *
   * The following basic restrictions apply to tags:
   *
   * * Maximum number of tags per resource - 50
   * * For each resource, each tag key must be unique, and each tag key can have only one value.
   * * Maximum key length - 128 Unicode characters in UTF-8
   * * Maximum value length - 256 Unicode characters in UTF-8
   * * If your tagging schema is used across multiple services and resources, remember that other
   * services may have restrictions on allowed characters. Generally allowed characters are: letters,
   * numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : /
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnCapacityProviderProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
