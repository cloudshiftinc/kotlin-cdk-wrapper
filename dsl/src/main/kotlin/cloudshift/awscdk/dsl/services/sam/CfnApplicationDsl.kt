@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnApplication
import software.constructs.Construct

/**
 * Definition of AWS::Serverless::Application.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * CfnApplication cfnApplication = CfnApplication.Builder.create(this, "MyCfnApplication")
 * .location("location")
 * // the properties below are optional
 * .notificationArns(List.of("notificationArns"))
 * .parameters(Map.of(
 * "parametersKey", "parameters"))
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .timeoutInMinutes(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-application.html)
 */
@CdkDslMarker
public class CfnApplicationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnApplication.Builder = CfnApplication.Builder.create(scope, id)

  private val _notificationArns: MutableList<String> = mutableListOf()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-application.html#cfn-serverless-application-location)
   * @param location 
   */
  public fun location(location: String) {
    cdkBuilder.location(location)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-application.html#cfn-serverless-application-location)
   * @param location 
   */
  public fun location(location: IResolvable) {
    cdkBuilder.location(location)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-application.html#cfn-serverless-application-location)
   * @param location 
   */
  public fun location(location: CfnApplication.ApplicationLocationProperty) {
    cdkBuilder.location(location)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-application.html#cfn-serverless-application-notificationarns)
   * @param notificationArns 
   */
  public fun notificationArns(vararg notificationArns: String) {
    _notificationArns.addAll(listOf(*notificationArns))
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-application.html#cfn-serverless-application-notificationarns)
   * @param notificationArns 
   */
  public fun notificationArns(notificationArns: Collection<String>) {
    _notificationArns.addAll(notificationArns)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-application.html#cfn-serverless-application-parameters)
   * @param parameters 
   */
  public fun parameters(parameters: Map<String, String>) {
    cdkBuilder.parameters(parameters)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-application.html#cfn-serverless-application-parameters)
   * @param parameters 
   */
  public fun parameters(parameters: IResolvable) {
    cdkBuilder.parameters(parameters)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-application.html#cfn-serverless-application-tags)
   * @param tags 
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-application.html#cfn-serverless-application-timeoutinminutes)
   * @param timeoutInMinutes 
   */
  public fun timeoutInMinutes(timeoutInMinutes: Number) {
    cdkBuilder.timeoutInMinutes(timeoutInMinutes)
  }

  public fun build(): CfnApplication {
    if(_notificationArns.isNotEmpty()) cdkBuilder.notificationArns(_notificationArns)
    return cdkBuilder.build()
  }
}
