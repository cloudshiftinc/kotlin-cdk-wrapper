@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3objectlambda

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint

@CdkDslMarker
public class CfnAccessPointTransformationConfigurationPropertyDsl {
  private val cdkBuilder: CfnAccessPoint.TransformationConfigurationProperty.Builder =
      CfnAccessPoint.TransformationConfigurationProperty.builder()

  private val _actions: MutableList<String> = mutableListOf()

  /**
   * @param actions A container for the action of an Object Lambda Access Point configuration. 
   * Valid inputs are `GetObject` , `HeadObject` , `ListObject` , and `ListObjectV2` .
   */
  public fun actions(vararg actions: String) {
    _actions.addAll(listOf(*actions))
  }

  /**
   * @param actions A container for the action of an Object Lambda Access Point configuration. 
   * Valid inputs are `GetObject` , `HeadObject` , `ListObject` , and `ListObjectV2` .
   */
  public fun actions(actions: Collection<String>) {
    _actions.addAll(actions)
  }

  /**
   * @param contentTransformation A container for the content transformation of an Object Lambda
   * Access Point configuration. 
   * Can include the FunctionArn and FunctionPayload. For more information, see
   * [AwsLambdaTransformation](https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_AwsLambdaTransformation.html)
   * in the *Amazon S3 API Reference* .
   */
  public fun contentTransformation(contentTransformation: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(contentTransformation)
    cdkBuilder.contentTransformation(builder.map)
  }

  /**
   * @param contentTransformation A container for the content transformation of an Object Lambda
   * Access Point configuration. 
   * Can include the FunctionArn and FunctionPayload. For more information, see
   * [AwsLambdaTransformation](https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_AwsLambdaTransformation.html)
   * in the *Amazon S3 API Reference* .
   */
  public fun contentTransformation(contentTransformation: Any) {
    cdkBuilder.contentTransformation(contentTransformation)
  }

  public fun build(): CfnAccessPoint.TransformationConfigurationProperty {
    if(_actions.isNotEmpty()) cdkBuilder.actions(_actions)
    return cdkBuilder.build()
  }
}
