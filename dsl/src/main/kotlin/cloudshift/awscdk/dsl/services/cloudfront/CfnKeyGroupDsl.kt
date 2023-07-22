@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnKeyGroup
import software.constructs.Construct

/**
 * A key group.
 *
 * A key group contains a list of public keys that you can use with [CloudFront signed URLs and
 * signed
 * cookies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * CfnKeyGroup cfnKeyGroup = CfnKeyGroup.Builder.create(this, "MyCfnKeyGroup")
 * .keyGroupConfig(KeyGroupConfigProperty.builder()
 * .items(List.of("items"))
 * .name("name")
 * // the properties below are optional
 * .comment("comment")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-keygroup.html)
 */
@CdkDslMarker
public class CfnKeyGroupDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnKeyGroup.Builder = CfnKeyGroup.Builder.create(scope, id)

  /**
   * The key group configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-keygroup.html#cfn-cloudfront-keygroup-keygroupconfig)
   * @param keyGroupConfig The key group configuration. 
   */
  public fun keyGroupConfig(keyGroupConfig: IResolvable) {
    cdkBuilder.keyGroupConfig(keyGroupConfig)
  }

  /**
   * The key group configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-keygroup.html#cfn-cloudfront-keygroup-keygroupconfig)
   * @param keyGroupConfig The key group configuration. 
   */
  public fun keyGroupConfig(keyGroupConfig: CfnKeyGroup.KeyGroupConfigProperty) {
    cdkBuilder.keyGroupConfig(keyGroupConfig)
  }

  public fun build(): CfnKeyGroup = cdkBuilder.build()
}
