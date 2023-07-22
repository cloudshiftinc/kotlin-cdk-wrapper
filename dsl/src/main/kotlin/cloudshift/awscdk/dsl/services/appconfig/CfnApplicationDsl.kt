@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appconfig

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.appconfig.CfnApplication
import software.constructs.Construct

@CdkDslMarker
public class CfnApplicationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnApplication.Builder = CfnApplication.Builder.create(scope, id)

  private val _tags: MutableList<CfnApplication.TagsProperty> = mutableListOf()

  /**
   * A description of the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-application.html#cfn-appconfig-application-description)
   * @param description A description of the application. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * A name for the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-application.html#cfn-appconfig-application-name)
   * @param name A name for the application. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * Metadata to assign to the application.
   *
   * Tags help organize and categorize your AWS AppConfig resources. Each tag consists of a key and
   * an optional value, both of which you define.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-application.html#cfn-appconfig-application-tags)
   * @param tags Metadata to assign to the application. 
   */
  public fun tags(tags: CfnApplicationTagsPropertyDsl.() -> Unit) {
    _tags.add(CfnApplicationTagsPropertyDsl().apply(tags).build())
  }

  /**
   * Metadata to assign to the application.
   *
   * Tags help organize and categorize your AWS AppConfig resources. Each tag consists of a key and
   * an optional value, both of which you define.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-application.html#cfn-appconfig-application-tags)
   * @param tags Metadata to assign to the application. 
   */
  public fun tags(tags: Collection<CfnApplication.TagsProperty>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnApplication {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
