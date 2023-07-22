@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.m2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.m2.CfnApplication
import software.constructs.Construct

@CdkDslMarker
public class CfnApplicationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnApplication.Builder = CfnApplication.Builder.create(scope, id)

  /**
   * The application definition for a particular application. You can specify either inline JSON or
   * an Amazon S3 bucket location.
   *
   * For information about application definitions, see the [AWS Mainframe Modernization User
   * Guide](https://docs.aws.amazon.com/m2/latest/userguide/applications-m2-definition.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-application.html#cfn-m2-application-definition)
   * @param definition The application definition for a particular application. You can specify
   * either inline JSON or an Amazon S3 bucket location. 
   */
  public fun definition(definition: IResolvable) {
    cdkBuilder.definition(definition)
  }

  /**
   * The application definition for a particular application. You can specify either inline JSON or
   * an Amazon S3 bucket location.
   *
   * For information about application definitions, see the [AWS Mainframe Modernization User
   * Guide](https://docs.aws.amazon.com/m2/latest/userguide/applications-m2-definition.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-application.html#cfn-m2-application-definition)
   * @param definition The application definition for a particular application. You can specify
   * either inline JSON or an Amazon S3 bucket location. 
   */
  public fun definition(definition: CfnApplication.DefinitionProperty) {
    cdkBuilder.definition(definition)
  }

  /**
   * The description of the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-application.html#cfn-m2-application-description)
   * @param description The description of the application. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The type of the target platform for this application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-application.html#cfn-m2-application-enginetype)
   * @param engineType The type of the target platform for this application. 
   */
  public fun engineType(engineType: String) {
    cdkBuilder.engineType(engineType)
  }

  /**
   * The identifier of a customer managed key.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-application.html#cfn-m2-application-kmskeyid)
   * @param kmsKeyId The identifier of a customer managed key. 
   */
  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  /**
   * The name of the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-application.html#cfn-m2-application-name)
   * @param name The name of the application. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-application.html#cfn-m2-application-rolearn)
   * @param roleArn 
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-application.html#cfn-m2-application-tags)
   * @param tags An array of key-value pairs to apply to this resource. 
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnApplication = cdkBuilder.build()
}
