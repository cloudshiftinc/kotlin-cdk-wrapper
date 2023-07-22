@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudfront.FunctionCode
import software.amazon.awscdk.services.cloudfront.FunctionProps

/**
 * Properties for creating a CloudFront Function.
 *
 * Example:
 *
 * ```
 * Bucket s3Bucket;
 * // Add a cloudfront Function to a Distribution
 * Function cfFunction = Function.Builder.create(this, "Function")
 * .code(FunctionCode.fromInline("function handler(event) { return event.request }"))
 * .build();
 * Distribution.Builder.create(this, "distro")
 * .defaultBehavior(BehaviorOptions.builder()
 * .origin(new S3Origin(s3Bucket))
 * .functionAssociations(List.of(FunctionAssociation.builder()
 * .function(cfFunction)
 * .eventType(FunctionEventType.VIEWER_REQUEST)
 * .build()))
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class FunctionPropsDsl {
  private val cdkBuilder: FunctionProps.Builder = FunctionProps.builder()

  /**
   * @param code The source code of the function. 
   */
  public fun code(code: FunctionCode) {
    cdkBuilder.code(code)
  }

  /**
   * @param comment A comment to describe the function.
   */
  public fun comment(comment: String) {
    cdkBuilder.comment(comment)
  }

  /**
   * @param functionName A name to identify the function.
   */
  public fun functionName(functionName: String) {
    cdkBuilder.functionName(functionName)
  }

  public fun build(): FunctionProps = cdkBuilder.build()
}
